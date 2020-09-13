<template>
  <div id="app">
    <div class="main">
    <Header></Header>
    <router-view
      style="min-height:750px;min-width:750px;box-sizing:border-box"
    />
    <Footer></Footer>
  </div>
  </div>
</template>

<script>

import Header from "./components/header";
import Footer from "./components/footer";

// 全局组件

export default {
  name: "App",
  
  // 局部组件，即子组件
  components: {
    Header,
    Footer,
  },
};

</script>

<style>
.main {
    width: 100%;
    height: 100%;

}
</style>
