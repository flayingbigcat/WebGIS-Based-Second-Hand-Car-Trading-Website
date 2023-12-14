<template>
        <div class=" account">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="block text-center">
                            <h2 class="text-center">Welcom</h2>
                            <el-form :model="user" class="text-left clearfix" :rules="rules" ref="loginRef">
                                <div class="form-group mt-20">
                                    <input type="email" class="form-control"  placeholder="Email" v-model="user.email">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="Password" v-model="user.password">
                                </div>
                                <div class="form-group">
                                    <div class="form-group">
                                        <div class="input-with-captcha">
                                            <input type="code" class="form-control" placeholder="verification code" v-model="user.code">
                                            <valid-code @update:value="handleCaptcha"></valid-code>
                                        </div>
                                    </div>
                                </div>
                                <div class="text-center mt-20">
                                    <button type="submit" class="btn btn-dark text-center" @click="login">Login</button>
                                </div>
                            </el-form>
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
import ValidCode from "@/components/ValidCode.vue";

export default {
    components: {
        ValidCode
    },
    data() {
        const validateCode = (rule, value, callback) => {
            if (value === '') {
                callback(new Error('Enter the code'))
            } else if (value.toLowerCase() !== this.code) {
                callback(new Error('Error code'))
            } else {
                callback()
            }
        }

        return {
            code: '',
            user: {
                code: '',
                email: '',
                password: ''
            },
            rules: {
                email: [
                    { required: true, message: 'Enter the email', trigger: 'blur' },
                ],
                password: [
                    { required: true, message: 'Enter the password', trigger: 'blur' },
                ],
                code: [
                    { validator: validateCode, trigger: 'blur' }
                ],
            }
        }
    },
    methods: {
        handleCaptcha(code) {
            this.code = code.toLowerCase()
        },
        login() {
            this.$refs['loginRef'].validate(async (valid) => {
                if (valid) {
                    try {
                        console.log(this.user.email);
                        console.log(this.user.password);
                        const response = await axios.post('/login', this.user); // 调整实际的后端 API 地址
                        if (response.data.code === '200') {
                            this.$router.push('/');
                            this.$message.success('欢迎');
                            localStorage.setItem("honey-user", JSON.stringify(response.data.data));  // 存储用户数据
                        } else {
                            this.$message.error(response.data.msg);
                        }
                    } catch (error) {
                        console.error('登录时出错：', error);
                        this.$message.error('登录过程中发生错误');
                    }
                }
            });
        }
    }
}
</script>
<style>
@import "../css/_log.css";
</style>