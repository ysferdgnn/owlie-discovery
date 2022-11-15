package com.ysferdgnn.owliediscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class OwlieDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<OwlieDiscoveryApplication>(*args)
}
