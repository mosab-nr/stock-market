package com.mosab.stockmarket.domain.model

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)