package com.mosab.stockmarket.presentation.companyinfo

import com.mosab.stockmarket.domain.model.CompanyInfo
import com.mosab.stockmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)