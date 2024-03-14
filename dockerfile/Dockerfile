FROM harbor.dcos.xixian.unicom.local/skyeye-platform/centos-java:1.8
COPY confd/ /cbss/app/apps/confd/
COPY skeye_im_peripheral_demand-0.0.1-SNAPSHOT.jar startService.sh startService_od.sh /home/microservices/
RUN chmod -R 777  /home/microservices/
RUN mkdir /home/microservices/config/
WORKDIR /home/microservices/
EXPOSE 8080
