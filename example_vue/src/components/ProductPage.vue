<template>
    <div class="product">
        <div class="container">
            <div class="row">
                <div class="col-md-4" v-for="product in displayedProducts" :key="product.id">
                    <div class="product-item">
                        <div class="card text-center">
                            <!-- 使用 require 导入图片 -->
                            <img :src="require(`../assets/${product.imageSrc}`)" class="card-img-top" alt="">
                            <div class="card-body">
                                <h5 class="card-title">{{ product.name }}</h5>
                                <p class="card-text">{{ product.description }}</p>
                                <router-link to="#" class="btn btn-dark">前往</router-link>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 添加分页按钮 -->
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <li class="page-item" :class="{ 'disabled': currentPage === 1 }">
                        <router-link class="page-link btn-dark" to="#" aria-label="Previous" @click.prevent="prevPage">
                            <span aria-hidden="true">&laquo;</span>
                        </router-link>
                    </li>
                    <li class="page-item" v-for="page in totalPages" :key="page" :class="{ 'active': currentPage === page }">
                        <router-link class="page-link btn-dark" to="#" @click.prevent="gotoPage(page)">{{ page }}</router-link>
                    </li>
                    <li class="page-item" :class="{ 'disabled': currentPage === totalPages }">
                        <router-link class="page-link btn-dark" to="#" aria-label="Next" @click.prevent="nextPage">
                            <span aria-hidden="true">&raquo;</span>
                        </router-link>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</template>

<script>
export default {
    name: 'productList',
    data() {
        return {
            products: [
                { id: 1, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_1.jpg' },
                { id: 2, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_2.jpg' },
                { id: 3, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_3.jpg' },
                { id: 4, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_4.jpg' },
                { id: 5, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_5.jpg' },
                { id: 6, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_6.jpg' },
                { id: 7, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_7.jpg' },
                { id: 8, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_8.jpg' },
                { id: 9, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_9.jpg' },
                { id: 1, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_1.jpg' },
                { id: 2, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_2.jpg' },
                { id: 3, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_3.jpg' },
                { id: 4, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_4.jpg' },
                { id: 5, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_5.jpg' },
                { id: 6, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_6.jpg' },
                { id: 7, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_7.jpg' },
                { id: 8, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_8.jpg' },
                { id: 9, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_1.jpg' },
                { id: 1, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_1.jpg' },
                { id: 2, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_2.jpg' },
                { id: 3, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_3.jpg' },
                { id: 4, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_4.jpg' },
                { id: 5, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_5.jpg' },
                { id: 6, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_6.jpg' },
                { id: 7, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_7.jpg' },
                { id: 8, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_8.jpg' },
                { id: 9, name: 'Card title', description: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.', imageSrc: 'product_6.jpg' },
            ],
            currentPage: 1,
            pageSize: 9, // 每页显示数量
        };
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
    },
};
</script>

<style>
@import "../css/_common.css";
</style>
