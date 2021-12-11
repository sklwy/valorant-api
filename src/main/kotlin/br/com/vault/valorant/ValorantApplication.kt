package br.com.vault.valorant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ValorantApplication

fun main(args: Array<String>) {
	runApplication<ValorantApplication>(*args)
}
