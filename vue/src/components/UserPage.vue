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
        <el-table :data="tableData" style="width: 100%">
            <el-table-column prop="userEmail" label="Email" width="280" />
            <el-table-column prop="userName" label="Name" width="180" />
            <el-table-column prop="address" label="Address" />
        </el-table>
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

            tableData:[
                    {
                        userEmail: localStorage.getItem('user_email'), // 从本地存储获取user_email
                        userName: localStorage.getItem('user_name') ,// 用于存储获取的user_name
                        address:''
                    }
        ]
            }
    },
};
</script>
