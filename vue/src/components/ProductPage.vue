<template>
    <div class="product">
        <div class="container">
            <div class="row">
                <div class="col-md-4" v-for="product in displayedProducts" :key="product.product_id">
                    <div class="product-item">
                        <div class="card text-center">
                            <!-- 使用 require 导入图片 -->
                            <img :src="require(`../assets/${product.product_imageSrc}`)" class="card-img-top" alt="">
                            <div class="card-body ">
                                <h5 class="card-title">{{ product.product_name }}</h5>
                                <p class="card-text">{{ product.product_description }}</p>
                                <router-link to="#" class="btn btn-dark">前往</router-link>
                                <button type="button" class="btn btn-info">put cart</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 使用 Bootstrap 样式的分页 -->
            <nav aria-label="Page navigation example" class="d-flex justify-content-center mt-4">
                <ul class="pagination">
                    <li class="page-item" :class="{ 'disabled': currentPage === 1 }">
                        <router-link class="page-link" to="#" aria-label="Previous" @click.prevent="prevPage">
                            <span aria-hidden="true">&laquo;</span>
                        </router-link>
                    </li>
                    <li class="page-item" v-for="page in totalPages" :key="page" :class="{ 'active': currentPage === page }">
                        <router-link class="page-link" to="#" @click.prevent="gotoPage(page)">{{ page }}</router-link>
                    </li>
                    <li class="page-item" :class="{ 'disabled': currentPage === totalPages }">
                        <router-link class="page-link" to="#" aria-label="Next" @click.prevent="nextPage">
                            <span aria-hidden="true">&raquo;</span>
                        </router-link>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</template>

<script>
import axios from "axios";
export default {
    name: 'productList',
    data() {
        return {
            products: [
                // {
                //     id: '1',
                //     name: 'Card title',
                //     description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.',
                //     imageSrc: 'product_1.jpg'
                // },
                // {
                //     product_id:'',
                //     product_name:'',
                //     product_description:'',
                //     product_imageSrc:''
                // }
            ],
            currentPage: 1,
            pageSize: 9, // 每页显示数量
        };
    },
    created() {
        // Make an HTTP request to the backend API endpoint
        axios.post('http://localhost:8081/selectShop')
            .then(response => {
                // Update the products array with the data received from the backend
                console.log(response.data);
                this.products = response.data;
            })
            .catch(error => {
                console.error('Error fetching data from the backend:', error);
            });
    },
    computed: {
        // 计算属性，根据当前页码和每页显示数量计算显示的产品列表
        displayedProducts() {
            const startIndex = (this.currentPage - 1) * this.pageSize;
            const endIndex = startIndex + this.pageSize;
            return this.products.slice(startIndex, endIndex);
        },
        // 计算总页数
        totalPages() {
            return Math.ceil(this.products.length / this.pageSize);
        },
    },
    methods: {
        // 上一页按钮点击事件
        prevPage() {
            if (this.currentPage > 1) {
                this.currentPage--;
            }
        },
        // 下一页按钮点击事件
        nextPage() {
            if (this.currentPage < this.totalPages) {
                this.currentPage++;
            }
        },
        // 跳转到指定页码
        gotoPage(page) {
            this.currentPage = page;
        },
    },
};
</script>

<style>
@import "../css/_common.css";
/* 可添加自定义样式 */
</style>
