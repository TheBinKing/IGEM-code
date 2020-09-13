<template>
  <div class="content">
    <el-row :gutter="40">
      <el-col :xs="7" :sm="7" :md="6">
        <SlideBar @idx="getComponentId"></SlideBar
      ></el-col>
      <el-col :xs="17" :sm="17" :md="18">
        <keep-alive> <component :is="componentId"></component> </keep-alive
      ></el-col>
    </el-row>
  </div>
</template>

<script>
import SlideBar from "../components/sidebar2"

// import { EventBus } from "../EventBus";
// export default {
//   components: {
//     SideBar
//   },
//   data() {
//     return {};
//   },

//   methods: {},
//   created() {
//     EventBus.$emit("switchTab", -1);
//   }
// };
import background from "../pages/pages/demo-background";
import basic from "../pages/pages/demo-basic";
import collada from "../pages/pages/demo-collada";
import controls from "../pages/pages/demo-controls";
import event from "../pages/pages/demo-event";
import fbx from "../pages/pages/demo-fbx";
import gltf from "../pages/pages/demo-gltf";
import json from "../pages/pages/demo-json";
import obj from "../pages/pages/demo-obj";
import objMtl from "../pages/pages/demo-obj-mtl";
import rotate from "../pages/pages/demo-rotate";
import ply from "../pages/pages/demo-ply";
import snapshot from "../pages/pages/demo-snapshot";
import stl from "../pages/pages/demo-stl";
export default {
  components: {
    background,
    basic,
    collada,
    controls,
    event,
    fbx,
    gltf,
    json,
    obj,
    objMtl,
    rotate,
    ply,
    snapshot,
    stl,
    SlideBar
  },
  data() {
    return {
      componentId: "basic",
    };
  },
  methods: {
    getComponentId(idx) {
      switch (idx) {
        case 0:
          this.componentId = "basic";
          break;
        case 1:
          this.componentId = "rotate";
          break;
        case 2:
          this.componentId = "controls";
          break;
        case 3:
          this.componentId = "background";
          break;
        case 4:
          this.componentId = "snapshot";
          break;
        case 5:
          this.componentId = "event";
          break;
        case 6:
          this.componentId = "obj";
          break;
          case 7:
          this.componentId = "objMtl";
          break;
        case 8:
          this.componentId = "stl";
          break;  
        
        default:
          this.componentId = "basic";
          break;
      }
    },
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
