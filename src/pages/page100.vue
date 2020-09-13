<template>
  <div class="content">
    <div class="examples-content">
      <ul class="examples-menu">
        <li class="examples-menu-title">Examples</li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-basic">basic</router-link>
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-rotate">rotate</router-link>
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-controls">controls</router-link>
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-background">background</router-link>
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-snapshot">snapshot</router-link>
        </li>
        <li class="examples-menu-title">Events</li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-event">mousemove</router-link>
        </li>
        <li class="examples-menu-title">Model Formats</li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-obj">OBJ Model (.obj)</router-link>
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-obj-mtl"
            >OBJ + MTL (.obj + .mtl)</router-link
          >
        </li>
        <li class="examples-menu-item">
          <router-link to="/page2/demo-stl">STL Model (.stl)</router-link>
        </li>
      </ul>
      <div class="examples-pages">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
};
</script>
<style lang="less" scoped>
.content {
  padding: 20px;
  max-width: 1200px;
  margin: 80px auto 0;
}
</style>
<style>
* {
  margin: 0;
  border: 0;
  padding: 0;
  box-sizing: border-box;
}

ul,
ol,
li {
  list-style: none;
}

a {
  color: #657180;
  text-decoration: none;
}

html,
body,
.examples {
  width: 100%;
  height: 100%;
  color: #657180;
}

body {
  background: #eee;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
    "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB",
    "Microsoft YaHei", SimSun, sans-serif;
  background: #fff;
}

.examples-header {
  /* position: absolute; */
  top: 0;
  width: 100%;
  background: #f3f6fb;
  text-shadow: 0 1px 0 rgba(255, 255, 255, 0.5);
  border-bottom: solid 1px #dfe2e7;
  padding: 15px 15px 15px 30px;
  line-height: 20px;
}


.examples-content {
  width: 100%;
  height: 100%;
  padding-top: 52px;
  overflow: hidden;
}

.examples-menu {
  float: left;
  width: 230px;
  height: 100%;
  border-right: solid 1px #dfe2e7;
  padding: 10px 30px;
}

.examples-menu .examples-menu-item {
  /* display: block; */
  width: 100%;
  height: 30px;
  line-height: 30px;
  font-size: 14px;
  cursor: pointer;
}

.examples-menu .examples-menu-item > a {
  /* display: block; */
  width: 100%;
  height: 100%;
}

.examples-menu .examples-menu-title {
  /* display: block; */
  width: 100%;
  padding: 6px 0;
  margin-top: 10px;
  font-size: 14px;
  font-weight: bold;
}

.examples-menu .examples-menu-item:hover > a {
  color: #39f;
}

.examples-pages {
  height: 100%;
  overflow: hidden;
}



@keyframes loading-rotate {
  0% {
    transform: rotate(0) scale(1);
  }
  50% {
    transform: rotate(180deg) scale(0.6);
  }
  100% {
    transform: rotate(360deg) scale(1);
  }
}
</style>
