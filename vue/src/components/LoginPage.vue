<!--<template>-->
<!--    <div class="account">-->
<!--        <div class="container">-->
<!--            <div class="row">-->
<!--                <div class="col-md-6 offset-md-3">-->
<!--                    <div class="block text-center">-->
<!--                        <h2 class="text-center">Welcom</h2>-->
<!--                        <el-form class="text-left clearfix" >-->
<!--                            <div class="form-group mt-20">-->
<!--                                <el-input type="email" class="form-control" placeholder="Email" v-model="user.email">-->
<!--                            </div>-->
<!--                            <div class="form-group">-->
<!--                                <el-input type="password" class="form-control" placeholder="Password" v-model="user.password">-->
<!--                            </div>-->
<!--                            &lt;!&ndash;                                <div class="form-group">&ndash;&gt;-->
<!--                            &lt;!&ndash;                                    <div class="form-group">&ndash;&gt;-->
<!--                            &lt;!&ndash;                                        <div class="input-with-captcha">&ndash;&gt;-->
<!--                            &lt;!&ndash;                                            <input type="code" class="form-control" placeholder="verification code" v-model="user.code">&ndash;&gt;-->
<!--                            &lt;!&ndash;                                            <valid-code @update:value="handleCaptcha"></valid-code>&ndash;&gt;-->
<!--                            &lt;!&ndash;                                        </div>&ndash;&gt;-->
<!--                            &lt;!&ndash;                                    </div>&ndash;&gt;-->
<!--                            &lt;!&ndash;                                </div>&ndash;&gt;-->
<!--                            <div class="text-center mt-20">-->
<!--                                <button   class="btn btn-dark text-center" @click="login">Login</button>-->
<!--                            </div>-->
<!--                        </el-form>-->
<!--                        <p class="mt-20"><router-link class="custom-link " to="/ForgetPage"> Forgot your password?</router-link></p>-->
<!--                        <p class="mt-20">New in this site? <router-link class="custom-link" to="/SignUp">Create New Account</router-link></p>-->
<!--                    </div>-->
<!--                </div>-->
<!--            </div>-->
<!--        </div>-->
<!--    </div>-->
<!--</template>-->
<!--<script>-->
<!--// import axios from 'axios';-->
<!--import { useRouter } from 'vue-router';-->
<!--// import router from "@/router";-->
<!--export default {-->

<!--    data() {-->
<!--        const router = useRouter();-->
<!--        return {-->
<!--            router,-->
<!--            user: {-->
<!--                email: '',-->
<!--                password: '',-->
<!--            },-->
<!--        };-->
<!--    },-->
<!--    methods: {-->
<!--        login() {-->
<!--            // 进行邮箱和密码的验证，例如检查是否为空等-->
<!--            // if (!this.user.email || !this.user.password) {-->
<!--            //     // 进行验证失败的处理-->
<!--            //     console.error('Email and password are required.');-->
<!--            //     return;-->
<!--            // }-->
<!--            // console.log(this.user.email)-->
<!--            console.log('dengluqian ')-->
<!--                console.log(this.user.email)-->
<!--                console.log(this.user.password)-->
<!--            // try {-->
<!--            //     const response = axios.post('http://localhost:8081/login', {-->
<!--            //         email: this.user.email,-->
<!--            //         password: this.user.password,-->
<!--            //     }, {-->
<!--            //         headers: {-->
<!--            //             'Content-Type': 'application/json',-->
<!--            //         }});-->
<!--            //     console.log(this.user.email)-->
<!--            //     console.log(this.user.password)-->
<!--            //     // 处理登录成功的逻辑-->
<!--            //     console.log('登录成功', response.data);-->
<!--            //     // router.push('/Index');-->
<!--            // } catch (error) {-->
<!--            //     // 处理登录失败的逻辑-->
<!--            //     console.error('登录失败', error);-->
<!--            //     console.log('请求负载:', error.config.data);-->
<!--            // }}-->

<!--            // 发送登录请求-->
<!--        //     axios.post('http://localhost:8081/login', {-->
<!--        //         email: this.user.email,-->
<!--        //         password: this.user.password,-->
<!--        //     }).then(response => {-->
<!--        //             // 处理登录成功的逻辑-->
<!--        //             console.log('Login successful', response.data);-->
<!--        //         router.push('/Index')-->
<!--        //             // 可以在这里跳转到用户的首页或者进行其他操作-->
<!--        //         })-->
<!--        //         .catch(error => {-->
<!--        //             // 打印出错误信息和请求的有效负载-->
<!--        //             console.error('Login failed', error);-->
<!--        //             console.log('Request payload:', error.config.data);-->
<!--        //         });-->
<!--        },-->
<!--    },-->
<!--};-->
<!--</script>-->
<!--<style>-->
<!--@import "../css/_log.css";-->
<!--</style>-->
<template>
    <div class="account">
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="block text-center">
                        <h2 class="text-center">Welcome</h2>
                        <el-form class="text-left clearfix">
                            <div class="form-group mt-20">
                                <el-input
                                    type="email"
                                    class="form-control"
                                    placeholder="Email"
                                    v-model="user.email"
                                ></el-input>
                            </div>
                            <div class="form-group">
                                <el-input
                                    type="password"
                                    class="form-control"
                                    placeholder="Password"
                                    v-model="user.password"
                                ></el-input>
                            </div>
                            <div class="text-center mt-20">
                                <button class="btn btn-dark text-center" @click="login">
                                    Login
                                </button>
                            </div>
                        </el-form>
<!--                        <p class="mt-20">-->
<!--                            <router-link class="custom-link" to="/ForgetPage">-->
<!--                                Forgot your password?-->
<!--                            </router-link>-->
<!--                        </p>-->
<!--                        <p class="mt-20">-->
<!--                            New in this site?-->
<!--                            <router-link class="custom-link" to="/SignUp">-->
<!--                                Create New Account-->
<!--                            </router-link>-->
<!--                        </p>-->
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import { ref, onMounted, onBeforeUnmount } from 'vue';

export default {
    setup() {
        const user = ref({
            email: '',
            password: '',
        });

        const login = () => {
            console.log('Before login');
            console.log(user.value.email);
            console.log(user.value.password);

            // Your login logic goes here

            console.log('After login');
        };

        onMounted(() => {
            console.log('Component mounted');
        });

        onBeforeUnmount(() => {
            console.log('Component about to be unmounted');
        });

        return {
            user,
            login,
        };
    },
};


</script>
