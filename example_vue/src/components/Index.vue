<template>
    <div>
        <header-bar></header-bar>
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
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="title text-center">
                    <h2>Product Category</h2>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="product-item">
                <div class="product-thumb">

                </div>
            </div>
        </div>
    </div>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
import headerBar from "@/components/HeaderBar.vue";
export default {
  name: 'HelloWorld',
    components: {
        headerBar, // 注册导航条组件
    },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.nav-item:not(:last-child) {
    margin-right: 15px; /* 调整右边距，根据需要修改值 */
}
#carouselExampleCaptions {
    /* 设置宽度和高度 */
    width: 100%; /* 你想要的宽度 */
    height: 80vh; /* 你想要的高度 */
    margin: auto; /* 如果需要居中显示 */
    margin-top: 20px;
    margin-bottom: 40px;
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
.product-item{
    margin-bottom: 30px;
}
.product-thumb{
    position: relative;
}

</style>
