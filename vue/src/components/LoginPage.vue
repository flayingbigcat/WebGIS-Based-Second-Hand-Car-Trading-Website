<template>
        <div class="account">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="block text-center">
                            <h2 class="text-center">Welcom</h2>
                            <form class="text-left clearfix" @submit.prevent="login">
                                <div class="form-group mt-20">
                                    <input type="email" class="form-control" placeholder="Email" v-model="user.email">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="Password" v-model="user.password">
                                </div>
<!--                                <div class="form-group">-->
<!--                                    <div class="form-group">-->
<!--                                        <div class="input-with-captcha">-->
<!--                                            <input type="code" class="form-control" placeholder="verification code" v-model="user.code">-->
<!--                                            <valid-code @update:value="handleCaptcha"></valid-code>-->
<!--                                        </div>-->
<!--                                    </div>-->
<!--                                </div>-->
                                <div class="text-center mt-20">
                                    <button  class="btn btn-dark text-center" @click="login">Login</button>
                                </div>
                            </form>
                            <p class="mt-20"><router-link class="custom-link " to="/ForgetPage"> Forgot your password?</router-link></p>
                            <p class="mt-20">New in this site? <router-link class="custom-link" to="/SignUp">Create New Account</router-link></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</template>
<script>
import axios from 'axios';
// import ValidCode from "@/components/ValidCode.vue";
export default {
    // components: {
    //     ValidCode,
    // },
    // data() {
    //     const validateCode = (rule, value, callback) => {
    //         if (value === '') {
    //             callback(new Error('Enter the code'))
    //         } else if (value.toLowerCase() !== this.code) {
    //             callback(new Error('Error code'))
    //         } else {
    //             callback()
    //         }
    //     }
    //
    //     return {
    //         code: '',
    //         user: {
    //             code: '',
    //             email: '',
    //             password: ''
    //         },
    //         rules: {
    //             email: [
    //                 { required: true, message: 'Enter the email', trigger: 'blur' },
    //             ],
    //             password: [
    //                 { required: true, message: 'Enter the password', trigger: 'blur' },
    //             ],
    //             code: [
    //                 { validator: validateCode, trigger: 'blur' }
    //             ],
    //         }
    //     }
    // },
    data() {
        return {
            user: {
                email: '',
                password: '',
                code: '',
            },
        };
    },
    methods: {
        async login() {
            try {
                const response = await axios.post('http://localhost:8081/login', this.user); // 修改为你的后端登录接口地址
                // 处理登录成功逻辑，例如存储 token 到本地或 Vuex 中
                console.log('Login successful:', response.data);
            } catch (error) {
                // 处理登录失败逻辑
                console.error('Login failed:', error);
            }
        },
        handleCaptcha(code) {
            this.user.code = code;
        },
    },
}
</script>
<style>
@import "../css/_log.css";
</style>