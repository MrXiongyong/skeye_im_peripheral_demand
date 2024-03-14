#!/bin/bash
set -e
confd -onetime -node $ETCD -confdir /cbss/app/apps/confd/etc/springboot/onepro
java -Xms$1 -Xmx$1 -jar skeye_im_peripheral_demand-0.0.1-SNAPSHOT.jar
