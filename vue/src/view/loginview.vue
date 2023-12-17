<template>
    <div class="account">
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="block text-center">
                        <h2 class="text-center">Login</h2>
                        <form>
                            <div class="mb-3">
                                <input type="email" class="form-control" id="userNameInput" v-model="form.user_email">
                            </div>
                            <div class="mb-3">
                                <input type="password" class="form-control" id="passwordInput" v-model="form.user_password">
                            </div>
                            <div class="mb-3">
                                <button type="button" class="btn btn-dark text-center" @click="login">登录</button>
<!--                                <button type="button" class="btn btn-secondary" @click="register">注册</button>-->
                            </div>
                        </form>
                        <p class="mt-20">New in this site ?<a @click="register"> Create New Account</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
import axios from 'axios';
import { useRouter } from 'vue-router';
import { ElMessage } from 'element-plus'
import {ref} from 'vue';

export default {
    name:'LoginView',
    setup(){
        const form = ref({
            user_email:'',
            user_password:''
        })
        const router = useRouter();
        const login = () => {
            console.log(JSON.stringify(form.value)); // 打印发送到后端的数据

            axios.post('http://localhost:8081/login', JSON.stringify(form.value), {
                headers: {
                    'Content-Type': 'application/json',
                }
            })
                .then(response => {
                    // 登录成功
                    console.log(response.data); // 这里的 response.data 包含了用户信息
                    // if (response.data.status === 'success') {
                    //     const user_email = form.value.user_email; // user获取用户名
                    //     console.log("Logging in with user email:", user_email); // 调试输出
                    //     localStorage.setItem('user_email', user_email); // 存储用户名
                        router.push('/UserPage');
                    // } else {
                    //     ElMessage.error(response.data.message);
                    // }
                })
                .catch(error => {
                    if (error.response && error.response.status === 401) {
                        // 用户名或密码错误
                        ElMessage.error('用户名或密码错误');
                    } else {
                        // 其他错误
                        ElMessage.error('登录失败');
                    }
                });
        };

        const success = () => {
            ElMessage({
                message: '登录成功！',
                type: 'success',
            })
        }
        const failed = () => {
            ElMessage({
                message: '账号或密码错误！登陆失败！',
                type: 'error',
            })
        }
        const register = () => {
            // 跳转到注册页面
            router.push('/SignUp');
        }
        return{
            login,
            register,
            form,
            success,
            failed
        }
    }
};
</script>

<style scoped>
.login-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #f5f5f5;
}

.login-form {
    width: 400px;
    padding: 20px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
}

.title {
    text-align: center;
    margin-bottom: 20px;
}
@import "../css/_log.css";
</style>