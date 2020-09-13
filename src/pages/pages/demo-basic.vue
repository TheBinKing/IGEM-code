<template>
<div class="content">
  <demo-block :childData="Mobj" @childhandler='childhandler'>
    <template slot="preview">
      <model-obj
        :backgroundAlpha="0"
        @on-load="onLoad"
        :rotation="rotation"
        :src="Mobj"
        :mtl="Mmtl"
      ></model-obj>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
</div>
</template>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelObj from '../../3dModel/model-obj.vue';

export default {
  name: 'demo-basic',
  data() {
    return {
      path: 'static/models/obj/',
      obj: '.obj',
      mtl: '.mtl',
      Mobj: 'static/models/obj/tree.obj',
      Mmtl: 'static/models/obj/tree.mtl',
      loading: true,
      rotation: {
        x: -Math.PI / 2,
        y: 0,
        z: 0,
      },
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    childhandler(val) {
      console.log(val);
      this.Mobj = this.path + val + this.obj;
      this.Mmtl = this.path + val + this.mtl;
    },
  },
  components: {
    ModelObj,
    DemoBlock,
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