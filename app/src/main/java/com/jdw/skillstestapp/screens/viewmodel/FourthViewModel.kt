package com.jdw.skillstestapp.screens.viewmodel

import androidx.lifecycle.ViewModel
import com.jdw.skillstestapp.repository.MyAppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FourthViewModel @Inject constructor(
    private val appRepository: MyAppRepository,
) : ViewModel() {

}