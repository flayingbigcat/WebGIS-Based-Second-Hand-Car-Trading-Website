<template>
    <div>
        <header-bar></header-bar>
    </div>
    <div>
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="3000">
                    <img src="../assets/20150528105940.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-block">
                        <h5>First slide label</h5>
                        <p>Some representative placeholder content for the first slide.</p>
                    </div>
                </div>
                <div class="carousel-item" data-bs-interval="3000">
                    <img src="../assets/d725bea032cd611d4f6ab6ce65297c05.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-block">
                        <h5>Second slide label</h5>
                        <p>Some representative placeholder content for the second slide.</p>
                    </div>
                </div>
                <div class="carousel-item" data-bs-interval="3000">
                    <img src="../assets/20140918215647.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-block">
                        <h5>Third slide label</h5>
                        <p>Some representative placeholder content for the third slide.</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
    <div class="mid">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="title text-center">
                        <h2>Product Category</h2>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="category-box">
                        <router-link to="#">
                            <img src="../assets/F1.jpg" alt="" />
                            <div class="content">
                                <h3>Formula One</h3>
                                <p>Super Faster and Super Power</p>
                            </div>
                        </router-link>
                    </div>
                    <div class="category-box">
                        <router-link to="#">
                            <img src="../assets/Orange_Lamborghini_Aventador_2020_Supercar_HD_Desktop_2560x1440.jpg" alt="" />
                            <div class="content">
                                <h3>Lamborghini Aventador</h3>
                                <p>Get Wide Range Selection</p>
                            </div>
                        </router-link>
                    </div>
                </div>
                <div class="col-md-6 d-flex align-items-center">
                    <div class="category-box category-box-2">
                        <router-link to="#">
                            <img src="../assets/R.jpg" alt="" />
                            <div class="content">
                                <h3>Lamborghini_Aventador</h3>
                                <p>Special Design Comes First</p>
                            </div>
                        </router-link>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="product">
        <div class="container">
            <div class="row">
                <div class="title text-center">
                    <h2>Trendy Products</h2>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_1.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Strayhorn SP</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_2.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">BMW X5</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_3.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Ferrari 458</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_4.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Hummer H2</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_5.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Chevrolet Camaro</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_6.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Tesla Model 3</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_7.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Audi A4</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_8.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">McLAREN SENNA</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="product-item">
                        <div class="product-thumb">
                            <img class="img-responsive img-fluid" src="../assets/product_9.jpg" alt="product-img" />
                        </div>
                    </div>
                    <div class="product-content">
                        <h4><router-link to="#">Volkswagen Beetle</router-link></h4>
                        <p class="price">$999</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="call-to-action bg-gray section">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <div class="title">
                        <h2>SUBSCRIBE TO NEWSLETTER</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, <br> facilis numquam impedit ut sequi. Minus facilis vitae excepturi sit laboriosam.</p>
                    </div>
                    <div class="input-group input-group-lg mb-3 w-50 m-auto">
                        <input type="text" class="form-control" placeholder="Enter Your Email Address" aria-label="Recipient's username" aria-describedby="button-addon2">
                        <button class="btn btn-dark" type="button">Subscribe Now!</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="instagram-feed">
        <div class="container">
            <div class="row">
                <div class="title">
                    <h2>View us on instagram</h2>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="instagram-slider" id="instafeed" data-accessToken="IGQVJYeUk4YWNIY1h4OWZANeS1wRHZARdjJ5QmdueXN2RFR6NF9iYUtfcGp1NmpxZA3RTbnU1MXpDNVBHTzZAMOFlxcGlkVHBKdjhqSnUybERhNWdQSE5hVmtXT013MEhOQVJJRGJBRURn"></div>
                </div>
            </div>
        </div>
    </div>
    <footer-bar></footer-bar>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
import headerBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";
export default {
  name: 'HelloWorld',
    components: {
        FooterBar,
        headerBar, // 注册导航条组件
    },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.package {
    position: absolute;
    top: 12px;
    right: 12px;
    background:$black;
    color: $light;
    font-size:12px;
    padding:4px 12px;
    font-weight:300;
    display:inline-block;
}
.nav-item:not(:last-child) {
    margin-right: 15px; /* 调整右边距，根据需要修改值 */
}

.carousel-inner {
    /* 设置内部图片的宽度和高度 */
    width: 100%;
    height: 100%;
}

.carousel-item img {
    /* 图片充满整个容器 */
    width: 100%;
    height: 100%;
    object-fit: cover;
}
.carousel-caption {
    color: white; /* 文字颜色 */
    /* 调整文字位置，可以根据需要修改下面的属性值 */
    position: absolute;
    top: 50%; /* 从顶部位置的百分比 */
    left: 50%; /* 从左侧位置的百分比 */
    transform: translate(-50%, -50%); /* 用于将元素居中 */
}
.carousel-caption h5 {
    font-size: 36px; /* 调整标题字体大小 */
}
.carousel-caption p {
    color: white;
    font-size: 24px; /* 调整描述字体大小 */
}
.carousel-item.active .carousel-caption h5,
.carousel-item.active .carousel-caption p {
    opacity: 1; /* 当元素在 active 状态时，透明度为 1，即不透明 */
}
.carousel-caption h5{
    opacity: 0; /* 初始状态为透明 */
    transition: opacity 1.5s ease-in-out; /* 添加渐显的过渡效果 */
}
.carousel-caption p {
    opacity: 0; /* 初始状态为透明 */
    transition: opacity 2.5s ease-in-out; /* 添加渐显的过渡效果 */
}
.product{
    padding: 80px;
}
.product-item{
    margin-bottom: 30px;
}
.product-thumb{
    position: relative;
}
.product-item .product-thumb {
    position: relative;
}
.product-content h4 a {
    color: #000;
    text-decoration: none;
}
.product-content h4 {
    font-size: 16px;
    font-weight: 400;
    margin-top: 15px;
    margin-bottom: 6px;
}
.preview-meta {
    position: absolute;
    text-align: center;
    bottom: 0;
    left: 0;
    width: 100%;
    justify-content: center;
    opacity: 0;
    transition: 0.2s;
    transform: translateY(10px);
}
.mid{
    padding: 80px 0;
}
.title {
    padding: 20px 0 30px;
}
.text-center {
    text-align: center;
}
.title h2 {
    font-size: 18px;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 2px;
}
.category-box {
    background-size: cover;
    margin-bottom: 30px;
    min-height: 250px;
    position: relative;
    overflow: hidden;
    width: 100%;
}
.category-box.category-box-2 {
    min-height: 450px;
    margin-bottom: 0px;
}
.category-box .content {
    position: absolute;
    z-index: 999;
    top: 0;
    padding: 25px;
}
.category-box .content h3 {
    margin: 0;
    color: #333;
    font-size: 20px;
    font-weight: 500;
}
.category-box .content p {
    margin: 6px 0 0;
}
.category-box img {
    transition: all 0.3s ease-in-out;
    width: 100%;
    height: auto;
    -webkit-backface-visibility: hidden;
    backface-visibility: hidden;
}
.category-box:hover img {
    transform: scale(1.2); /* 鼠标悬停时放大图像 */
}
/* .call-to-action */
.call-to-action {
    padding: 80px;
    /* .subscription-form */
}

/* @include mobile */
.call-to-action .subscription-form {
    display: block;
}

/* input */
.call-to-action .subscription-form input {
    height: 50px;
}

/* @include mobile */
.call-to-action .subscription-form input {
    text-align: center;
}

/* .btn-main */
.call-to-action .subscription-form .btn-main {
    font-size: 14px;
}

/* @include mobile */
.call-to-action .subscription-form .btn-main {
    width: 100%;
}
.call-to-action .subscription-form input {
    height: 50px;
}
.form-control {
    box-shadow: none;
    border-radius: 0;
    &:focus {
        box-shadow:none;
        border:1px solid $primary-color;
    }
}
.instagram-feed {
    text-align: center;
    padding: 80px;
}
.instagram-feed a {
    margin: 6px;
    margin-right: 10px;
    margin-bottom: 10px;
    display: flex;
    align-items: center;
}
.instagram-feed a:hover img {
    filter: grayscale(10);
}
.instagram-feed a img {
    width: 100%;
    max-height: 180px;
    -o-object-fit: cover;
    object-fit: cover;
}
</style>
