import * as commonTools from "../commonTools.js";
import * as router from "../router.js";
import * as channel from "../page/channel.js";

//模块初始化
export default () => {
  getAllChannel();
  document.querySelector("#routeView-sub").innerHTML = router.getPageComponent("page/channel.html");
  channel.getAllPost(1001);
};

function getAllChannel() {
  commonTools.ajax({
    url: "/nesder/channel/all",
    type: "GET",
    success: function (response) {
      //   此处执行请求成功后的代码
      let channelEle = document.querySelector("#channel");
      let activeClass = `list-group-item-success`;
      response.data.forEach((item, index) => {
        let forum_id = document.querySelector("#routeView").param;
        let dom = `
          <a href="#/home/channel/${item.channel_id}" 
            class="list-group-item list-group-item-action border border-success mt-3 ${activeClass}">
            ${item.name}
          </a>`;
        channelEle.innerHTML += dom;
        activeClass = ``;
      });
    },
    fail: function (status) {
      // 此处为请求失败后的代码
      console.log(response);
    },
  });
}