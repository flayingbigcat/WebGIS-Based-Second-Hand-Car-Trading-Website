// import { createRouter, createWebHistory } from 'vue-router'
//
// // 导入组件
// import HelloWorld from '../components/Index.vue'
import SignUp from '../components/SignUp.vue'
import CartPage from '../components/CartPage.vue'
import OrderPage from '../components/OrderPage.vue'
import ShopPage from '../components/ShopPage.vue'
import ForgetPage from '../components/ForgetPage.vue'
import TestLogin from '../components/TextLogin.vue'
import FeedbackPage from '../components/FeedbackPage.vue'
import FavoritesPage from '../components/FavoritesPage.vue';
//
// // 创建路由实例
// const router = createRouter({
//     history: createWebHistory(),
//     routes: [
//         { path: '/', component: HelloWorld },
//         { path: '/Index', component: HelloWorld },
//         { path: '/SignUp', component: SignUp },
//         { path: '/LoginPage', component: LoginPage },
//         { path: '/CartPage', component: CartPage},
//         { path: '/OrderPage', component: OrderPage},
//         { path: '/ShopPage',component: ShopPage},
//         { path: '/ForgetPage',component: ForgetPage},
//         { path: '/TestLogin', component: TestLogin}
//     ],
// });
//
// // 导出路由实例
// export default router;
//createRouter创建router实例对象
//create
import { createRouter,createWebHistory} from 'vue-router'
import login from "../view/loginview.vue";
import HelloWorld from '../components/Index.vue'
import UserPage from  '../components/UserPage.vue'

const routes = [
    {
        path:'/',
        component: HelloWorld,
    },
    {
        path:'/login',
        component:login,
    },
    {
        path: '/index',
        component: HelloWorld,
    },
    { path: '/SignUp', component: SignUp },
        { path: '/CartPage', component: CartPage},
        { path: '/OrderPage', component: OrderPage},
        { path: '/ShopPage',component: ShopPage},
        { path: '/ForgetPage',component: ForgetPage},
        { path: '/TestLogin', component: TestLogin},
        { path: '/FeedbackPage', component: FeedbackPage },
        { path: '/FavoritesPage', component: FavoritesPage},
    {
        path: '/UserPage', name: 'UserPage', component: UserPage
    }
]

const router = createRouter({
    history:createWebHistory(),
    routes
})



export default router;