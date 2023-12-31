<template>
    <header-bar></header-bar>
    <div class="page-header">
        <div class="container">
            <div class="row">
                <div class="col-md-12 d-flex justify-content-center">
                    <div class="content">
                        <h1 class="page-name">Welcome</h1>
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
    <div class="container d-flex justify-content-center">
        <div class="dashboard-wrapper">
            <div class="media">
                <div class="pull-left mb-2">
                    <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                        <router-link class="btn btn-outline-secondary me-md-2" to="/EditInfo">Edit Information ></router-link>
                    </div>
                    <img class="media-object user-img" :src="require(`../assets/${user_imageSrc}`)" alt="Image">
                </div>
                <div class="media-body">
                    <h2 class="media-heading">{{ userName }}</h2>
                    <p>{{user_description}}</p>
                </div>
            </div>
            <form class="row g-3">
                <div class="col-md-4">
                    <label for="inputEmail4" class="form-label">Sex</label>
                    <p>{{ user_sex }}</p>
                </div>
                <div class="col-4">
                    <label for="inputAddress" class="form-label">Email</label>
                    <p>{{ userEmail }}</p>
                </div>
                <div class="col-6">
                    <label for="inputAddress2" class="form-label">PhoneNumber</label>
                    <p>{{user_phone}}</p>
                </div>
                <div class="col-md-12">
                    <label for="inputCity" class="form-label">Address</label>
                    <p>{{user_address}}</p>
                </div>
            </form>
        </div>
    </div>

    <footer-bar></footer-bar>
</template>

<script>
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
            user_address: localStorage.getItem('user_address'),
            user_phone: localStorage.getItem('user_phone'),
            user_sex: localStorage.getItem('user_sex'),
            user_imageSrc:localStorage.getItem('user_imageSrc'),
            user_description:localStorage.getItem('user_description'),
            tableData:[
                    {
                        userEmail: localStorage.getItem('user_email'), // 从本地存储获取user_email
                        userName: localStorage.getItem('user_name') ,// 用于存储获取的user_name
                        address:localStorage.getItem('user_address'),
                        user_phone: localStorage.getItem('user_phone'),
                        user_sex: localStorage.getItem('user_sex'),
                        user_imageSrc:localStorage.getItem('user_imageSrc'),
                        user_description:localStorage.getItem('user_description'),
                    }
            ]
        }
    },
};
</script>
<style>
@import "../css/_user.css";
</style>
