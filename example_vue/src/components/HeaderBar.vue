<script>
export default {
    name:'headerBar'
}
</script>
<template>
<div>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <router-link class="navbar-brand" to="/">Navbar</router-link>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <router-link class="nav-link active" aria-current="page" to="/Index">Home</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link class="nav-link active" to="/ShopPage">Shop</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link class="nav-link active" to="/">About</router-link>
                    </li>
                </ul>
                <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <router-link class="nav-link active" to="/LoginPage">Login</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link class="nav-link active" to="/SignUp">Signup</router-link>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu">
                            <li><router-link class="dropdown-item" to="/CartPage">Cart</router-link></li>
                            <li><router-link class="dropdown-item" to="/OrderPage">Order</router-link></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><router-link class="dropdown-item" to="/">Something else here</router-link></li>
                        </ul>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</div>
</template>

<style>
.nav-item:not(:last-child) {
    margin-right: 15px; /* 调整右边距，根据需要修改值 */
}
</style>