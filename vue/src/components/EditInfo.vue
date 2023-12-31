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
                <div class="pull-left">
                    <img class="media-object user-img" src="" alt="Image">
                </div>
                <div class="media-body">
                    <h2 class="media-heading">{{ userName }}</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Unde, iure, est. Sit mollitia est maxime! Eos
                        cupiditate tempore, tempora omnis. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Enim, nihil. </p>
                </div>
            </div>
            <form class="row g-3">
                <div class="col-md-4">
                    <label for="inputEmail4" class="form-label">Sex</label>
                </div>
                <div class="col-4">
                    <label for="inputAddress" class="form-label">Email</label>
                    <p>{{ userEmail }}</p>
                </div>
                <div class="col-6">
                    <label for="inputAddress2" class="form-label">PhoneNumber</label>
                    <input class="form-control" id="inputPhoneNumber">
                </div>
                <div class="col-md-12">
                    <label for="inputCity" class="form-label">Address</label>
                    <div class="col-md-6">
                        <input class="form-control" id="inputPhoneNumber">
                    </div>
                </div>
            </form>
            <div class="d-grid gap-2 col-2 mx-auto">
                <router-link class="btn btn-outline-secondary me-md-2" to="UserPage">Save</router-link>
            </div>
        </div>
    </div>

    <footer-bar></footer-bar>
</template>


<script>
import {defineComponent} from 'vue'
import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";

export default defineComponent({
    name: "EditInfo",
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
})
</script>
<style>

</style>