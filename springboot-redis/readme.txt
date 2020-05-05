1.springBoot整合redis

2.redisTemplate操作
RedisTemplate主要支持String，List,Hash,Set,ZSet这几种方式的参数，
其对应的方法分别是opsForValue()、opsForList()、opsForHash()、opsForSet()、opsForZSet()

3.redis配置
#配置缓存redis
spring.redis.database=8
# Redis服务器地址
spring.redis.host=127.0.0.1
# Redis服务器连接端口
spring.redis.port=6379
# Redis服务器连接密码（默认为空）
spring.redis.password=
# 连接池最大连接数（使用负值表示没有限制）
spring.redis.pool.max-active=8
# 连接池最大阻塞等待时间（使用负值表示没有限制）
spring.redis.pool.max-wait=-1
# 连接池中的最大空闲连接
spring.redis.pool.max-idle=8
# 连接池中的最小空闲连接
spring.redis.pool.min-idle=0
# 连接超时时间（毫秒）
spring.redis.keytimeout=1000
spring.redis.timeout=0