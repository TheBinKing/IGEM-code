<template>
<div class="content">
  <demo-block :vue-code="code" :html-code="htmlCode">
    <template slot="preview">
      <model-fbx :backgroundAlpha="0" @on-load="onLoad" @on-error="onError"
                 src="static/models/fbx/dancing.fbx"></model-fbx>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
</div>
</template>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelFbx from '../../3dModel/model-fbx.vue';

const code = `
<template>
    <model-obj src="static/models/fbx/dancing.fbx"></model-obj>
</template>

<script>
    import { modelFbx } from 'vue-3d-model'

    export default {
        components: {
            ModelFbx
        }
    }
<\/script>
`;

const htmlCode = `
<body>
    <div id="app">
        <model-fbx src="static/models/fbx/dancing.fbx"></model-fbx>
    </div>
    #scripts#
    <script>
        new Vue({
            el: '#app'
        })
    <\/script>
</body>
`;

export default {
  name: 'demo-fbx',
  data() {
    return {
      code,
      htmlCode,
      loading: true,
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    onError(e) {
      console.error(e);
    },
  },
  components: {
    ModelFbx,
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