package com.mosab.stockmarket.di

import com.mosab.stockmarket.data.csv.CSVParser
import com.mosab.stockmarket.data.csv.CompanyListingsParser
import com.mosab.stockmarket.data.csv.IntradayInfoParser
import com.mosab.stockmarket.data.repository.StockRepositoryImpl
import com.mosab.stockmarket.domain.model.CompanyListing
import com.mosab.stockmarket.domain.model.IntradayInfo
import com.mosab.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}