<template>
    <div>
        <header-bar></header-bar>
    </div>
    <div class="page-header">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="content">
                        <h1 class="page-name">Cart</h1>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item">
                                    <router-link style="text-decoration: none" to="/">Home</router-link>
                                </li>
                                <li class="breadcrumb-item active" aria-current="page">Cart</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="dashboard-wrapper">
            <table class="table">
                <thead class="table-group-divider">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Product</th>
                    <th scope="col">Price</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="(item, index) in dataCollection" :key="item.id">
                    <td>{{ item.product_id }}</td>
                    <td>{{ item.product_name }}</td>
                    <td>{{ item.product_price }}</td>
                    <td>
                        <button class="btn btn-dark" @click="deleteRow(index, item.product_id)">Delete</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <footer-bar></footer-bar>
</template>
<script>
import HeaderBar from "@/components/HeaderBar.vue";
// import {defineComponent} from "vue";
import FooterBar from "@/components/FooterPage.vue";
import axios from "axios";
export default {
    components: { FooterBar, HeaderBar },
    data() {
        return {
            dataCollection: [
                {
                    product_id:'',
                    product_name:'',
                    product_price:''
                }
            ]
        };
    },
    mounted() {
        // 在组件加载后发送HTTP请求
        axios.post('http://localhost:8081/getProduct', {}) // 发送POST请求，传递一个空对象作为请求体
            .then(response => {
                this.dataCollection = response.data; // 将后端数据填充到dataCollection数组中
                if (response.data.length > 0) {
                    this.product_id = response.data[0].product_id;
                    localStorage.setItem('product_id', this.product_id);
                }
                // 打印product_id数据
            })
            .catch(error => {
                console.error('Error fetching data:', error);
            });
    },

    methods: {
        // 删除行的方法
        deleteRow(index, productId) {
            // 从前端数据中删除行
            this.dataCollection.splice(index, 1);
            const deletedProductId = productId;
            // 发送删除请求到后端接口
            axios.post(`http://localhost:8081/deleteProduct?id=${productId}`)
                .then(() => {
                    // 处理后端删除成功的响应
                    console.log('Data deleted successfully from the backend Deleted product',deletedProductId);
                })
                .catch(error => {
                    console.error('Error deleting data from the backend:', error);
                });
        }
    }
};

</script>
<style>
@import "../css/_common.css";
</style>