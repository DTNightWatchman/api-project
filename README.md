# 在线API开发平台 

**项目描述：**基于React+Spring Boot+Dubbo+Gateway的API接口开放调用平台，管理员可以接入接口，可视化接口调用情况，给用户开通接口调用权限，浏览接口以及在线调试，并通过客户端SDK调用接口

技术栈：Spring Boot，MySQL，MyBatis-Plus，API签名认证，Spring Boot Starter，Dubbo，Spring Cloud Gateway 等

### 项目亮点：

- 使用Ant Design Pro脚手架+自建Spring Boot项目模板快速构建初始web项目，实现了前后端统一权限管理。
- 基于MyBatis Plus框架的QueryWrapper实现对MySql数据库的灵活查询，并配合MyBatis X 插件自动生成后端CRUD基代码减少重复工作。
- 为防止接口被恶意调用，设计API签名分发，为客户分配唯一的accessKey和secretKey鉴权，保障调用的安全性，以及统计接口调用次数
- 为解决开发者调用接口成本过高问题，基于Spring Boot Starter开发客户端SDK，一行代码调用接口，提高调用体验
- 选用Spring Boot Gateway作为API网关，实现了路由转发、访问控制，流量染色，并集中处理签名校验，请求参数校验，接口统计调用统计等业务逻辑，提高系统安全性。
- 为解决多个子系统内代码大量重复的问题，抽象模型层和业务层部分代码为公共模块，并使用Dubbo RPC框架实现子系统间的高性能接口调用。
