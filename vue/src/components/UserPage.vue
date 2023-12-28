<template>
    <header-bar></header-bar>
    <div class="page-header">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="content">
                        <h1 class="page-name">Welcome,{{ userName }}</h1>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><router-link style="text-decoration: none" to="/">Home</router-link></li>
                                <li class="breadcrumb-item active" aria-current="page">Order</li>
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
                <thead>
                <tr>
                    <th scope="col">Email</th>
                    <th scope="col">Name</th>
                    <th scope="col">Address</th>
                    <router-link @click="logout" class="nav-link active" aria-current="page" to="/Index">Login out</router-link>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>{{ userEmail }}</td>
                    <td>{{ userName }}</td>
                    <td></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <footer-bar></footer-bar>
</template>

<script lang="js">
import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";
// import { defineComponent, ref, onMounted } from 'vue';
// import axios from "axios";

export default{
    components: {FooterBar, HeaderBar},
    data() {
        return {
            userName: localStorage.getItem('user_name') , // 定义 userName
            userEmail: localStorage.getItem('user_email') , // 定义 userEmail
            tableData:[
                    {
                        userEmail: localStorage.getItem('user_email'), // 从本地存储获取user_email
                        userName: localStorage.getItem('user_name') ,// 用于存储获取的user_name
                        address:''
                    }
        ]
            }
    },
    created() {
        this.checkLogin();
    },
    methods: {
        logout() {
            // 清除localStorage
            localStorage.clear();

            // 可选: 重定向到登录页或其它页面
            // this.$router.push('/login'); // 例子: 重定向到登录页面
        },
        checkLogin() {
            // 检查userName和userEmail是否为空
            if (!this.userName || !this.userEmail) {
                // 如果为空，则重定向到登录页面
                this.$router.push('/login');
            }
        },
    }
};
</script>
