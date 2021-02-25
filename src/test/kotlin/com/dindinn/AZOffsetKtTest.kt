package com.dindinn

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class AZOffsetKtTest {
    @Before
    fun setUp() {
    }
    @Test
    fun azOffset__Samples() {
        assertThat(azOffset("abc", 2)).isEqualTo("cde")
        assertThat(azOffset("abc", 28)).isEqualTo("cde")
    }

    @Test
    fun azOffset__edge() {
        assertThat(azOffset("a", 25)).isEqualTo("z")
        assertThat(azOffset("a", 26)).isEqualTo("a")
        assertThat(azOffset("a", 52)).isEqualTo("a")
        assertThat(azOffset("b", 50)).isEqualTo("z")
    }
}