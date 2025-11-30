package com.jetbrains.training.productivity.domain.car

import spock.lang.Specification

import static com.jetbrains.training.productivity.domain.car.PressureUnit.BAR
import static java.math.BigDecimal.ONE

class TyreSpec extends Specification {
    def "should create a non null tyre with default setting"() {
        when:
        def tyre = Tyre.create()

        then:
        tyre != null
        verifyAll(tyre) {
            brand() == "BRAND"
            model() == "MODEL"
            pressure() == ONE
            pressureUnit() == BAR
        }
    }
}
