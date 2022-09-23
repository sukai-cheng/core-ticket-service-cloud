# 环境信息

| 软件名           | 版本号   | 描述          |
|---------------|-------|-------------|
| nginx         | 1.10  | 反向代理服务器     |
| elasticsearch | 7.4.2 | 搜索          |
| kibana        | 7.4.2 | 日志监控平台      |
| nacos         | 1.2.1 | 服务注册中心和配置中心 |
| redis         | ^     | 缓存等         |
| mysql         | 8.0   | 数据库         |

# 模块介绍

| 模块名                     | 模块中文名    | 描述                      |
|-------------------------|----------|-------------------------|
| ticket-auth-server      | 认证服务     | 社交登录、Oauth2.0、单点登录      |
| ticket-common           | 公共模块     | 保存常量、异常码、工具类、通用实体等      |
| ticket-coupon           | 优惠券模块    | 优惠券服务                   |
| ticket-operation        | 运营模块     | 车次发行计划，席位生成，席位规则等，发到站查询 |
| ticket-gateway          | 网关模块     | 网关接收前端请求做统一转发           |
| ticket-member           | 会员模块     | 会员服务                    |
| ticket-order            | 订单模块     | 订单服务                    |
| ticket-product          | 商品模块     | 商品服务                    |
| ticket-search           | 搜索服务     | Elasticsearch 操作服务      |
| ticket-third-party      | 第三方整合服务  | 第三方服务、阿里云OSS等           |
| ticket-freight          | 货运模块     | 货运服务                    |
| ticket-management       | 票务后台管理平台 | 后端快速开发平台                |
| ticket-management-front | 票务后台管理前端 | 前端快速开发平台                |


| 任务                   | 完成度 | 优先级 |
|----------------------|-----|-----|
| 阶段 1 - 微服务模块系统改造     | 未完成 | 🚀  |
| 0 - spring-cloud服务搭建 | 完成  | ⭐ ️ |
| 1 - 认证服务             | 未完成 | ⭐ ️ |
| 2 - 公共模块             | 未完成 | 🚀  |
| 3 - 优惠券模块            | 未完成 | 🚀  |
| 4 - 网关模块             | 未完成 | 🚀  |
| 5 - 会员模块             | 未完成 | 🚀  |
| 6 - 商品模块             | 未完成 | 🚀  |
| 7 - 搜索服务             | 未完成 | 🚀  |
| 8 - 第三方整合服务          | 未完成 | 🚀  |
| 阶段 2 - 业务模块需求实现      | 完成  | 🚀  |
| 0 - 认证服务             | 未完成 | ⭐ ️ |
| 1 - 公共模块             | 未完成 | 🚀  |
| 2 - 优惠券模块            | 未完成 | 🚀  |
| 3 - 网关模块             | 未完成 | 🚀  |
| 4 - 会员模块             | 未完成 | 🚀  |
| 5 - 商品模块             | 未完成 | 🚀  |
| 6 - 搜索服务             | 未完成 | 🚀  |
| 7 - 第三方整合服务          | 未完成 | 🚀  |