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
                    <img class="media-object user-img" :src="require(`../assets/${user_imageSrc}`)" alt="Image">
                </div>
                <div class="dropdown mt-1">
                    <button class="btn btn-outline-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">Picture</button>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </div>
                <div class="media-body">
                    <h2 class="media-heading">userName</h2>
                    <input class="form-control media-heading" v-model="userName" id="userNameInput" placeholder="User Name">
                    <p>user_description</p>
                    <input class="form-control" v-model="userDescription" id="userEmailInput" placeholder="Email">
                </div>
            </div>
            <form class="row g-3 mt-1">
                <div class="col-md-4">
                    <label for="inputEmail4" class="form-label">Sex</label>
                    <input class="form-control" v-model="userSex" id="userSexInput" placeholder="Sex">
                </div>
                <div class="col-4">
                    <label for="inputAddress" class="form-label">Email</label>
                    <p>{{ userEmail }}</p>
                </div>
                <div class="col-6">
                    <label for="inputAddress2" class="form-label">PhoneNumber</label>
                    <input class="form-control" v-model="userPhone" id="userPhoneInput" placeholder="Phone Number">
                </div>
                <div class="col-md-12">
                    <label for="inputCity" class="form-label">Address</label>
                    <div class="col-md-6">
                        <input class="form-control" v-model="userAddress" id="userAddressInput" placeholder="Address">
                    </div>
                </div>
            </form>
            <div class="d-grid gap-2 col-2 mx-auto mt-3">
                <router-link class="btn btn-outline-secondary me-md-2" to="UserPage">Save</router-link>
            </div>
        </div>
    </div>

    <footer-bar></footer-bar>
</template>


<script>
// import {defineComponent} from 'vue'
import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";

export default {
    name: "EditInfo",
    components: { HeaderBar, FooterBar },
    data() {
        return {
            // 从localStorage获取数据并初始化data属性
            userName: localStorage.getItem('user_name'),
            userEmail: localStorage.getItem('user_email'),
            userAddress: localStorage.getItem('user_address'),
            userPhone: localStorage.getItem('user_phone'),
            userSex: localStorage.getItem('user_sex'),
            userDescription: localStorage.getItem('user_description'),
            user_imageSrc:localStorage.getItem('user_imageSrc'),
        };
    },
};
</script>
<style>

</style>