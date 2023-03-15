package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PopulationQuote(int any, int codi, String literal, int homes_de_0_a_14_anys, int homes_de_15_a_64_anys, int homes_de_65_anys_i_m_s, int dones_de_0_a_14_anys, int dones_de_15_a_64_anys, int dones_de_65_anys_i_m_s, int total_de_0_a_14_anys, int total_de_15_a_64_anys, int total_de_65_anys_i_m_s) {
}
