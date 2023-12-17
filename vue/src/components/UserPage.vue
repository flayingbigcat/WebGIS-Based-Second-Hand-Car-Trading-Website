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
            <el-table-column prop="mail" label="Email" width="180" />
            <el-table-column prop="userName" label="Name" width="180" />
            <el-table-column prop="address" label="Address" />
        </el-table>
        </div>
    </div>
    <footer-bar></footer-bar>
</template>

<script lang="js">
import HeaderBar from "@/components/HeaderBar.vue";
import {defineComponent} from "vue";
import FooterBar from "@/components/FooterPage.vue";
// import axios from "axios";

export default defineComponent({
    components: {FooterBar, HeaderBar},
    data() {
        return {
            userName: 'Default User',
            tableData: [
                {
                    userEmail: '1',
                    userName: 'Default User',
                    address: 'No. 189, Grove St, Los Angeles',
                },
            ]
        };
    },
    mounted() {
        this.loadUserName(); // 在组件挂载时调用
    },
    methods: {
        loadUserName() {
            const storedUserEmail = localStorage.getItem('user_email');
            console.log("Stored User Email from localStorage:", storedUserEmail); // 调试输出
            if (storedUserEmail) {
                this.userEmail = storedUserEmail;
                if (this.tableData.length > 0) {
                    this.tableData[0].mail = storedUserEmail; // 更新 tableData 中的 mail
                }
            } else {
                console.log("No user_email found in localStorage."); // 如果未找到
            }
        },
    }
})
</script>
