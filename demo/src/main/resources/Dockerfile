FROM java:8
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为tuding.jar
RUN mvn clean install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
ADD demo-www.jar tuding.jar
WORKDIR /tmp
# 运行jar包
#RUN bash -c 'touch /tuding.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tuding.jar"]