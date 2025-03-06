
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FindFindManageManager from "./components/listers/FindFindManageCards"
import FindFindManageDetail from "./components/listers/FindFindManageDetail"

import ViewView from "./components/ViewView"
import ViewViewDetail from "./components/ViewViewDetail"
import LostPhoneRemoteManageManager from "./components/listers/LostPhoneRemoteManageCards"
import LostPhoneRemoteManageDetail from "./components/listers/LostPhoneRemoteManageDetail"
import LostPhonePhoneManager from "./components/listers/LostPhonePhoneCards"
import LostPhonePhoneDetail from "./components/listers/LostPhonePhoneDetail"

import KtCustomerManageManager from "./components/listers/KtCustomerManageCards"
import KtCustomerManageDetail from "./components/listers/KtCustomerManageDetail"
import KtDeviceManageManager from "./components/listers/KtDeviceManageCards"
import KtDeviceManageDetail from "./components/listers/KtDeviceManageDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/finds/findManages',
                name: 'FindFindManageManager',
                component: FindFindManageManager
            },
            {
                path: '/finds/findManages/:id',
                name: 'FindFindManageDetail',
                component: FindFindManageDetail
            },

            {
                path: '/finds/views',
                name: 'ViewView',
                component: ViewView
            },
            {
                path: '/finds/views/:id',
                name: 'ViewViewDetail',
                component: ViewViewDetail
            },
            {
                path: '/lostPhones/remoteManages',
                name: 'LostPhoneRemoteManageManager',
                component: LostPhoneRemoteManageManager
            },
            {
                path: '/lostPhones/remoteManages/:id',
                name: 'LostPhoneRemoteManageDetail',
                component: LostPhoneRemoteManageDetail
            },
            {
                path: '/lostPhones/phones',
                name: 'LostPhonePhoneManager',
                component: LostPhonePhoneManager
            },
            {
                path: '/lostPhones/phones/:id',
                name: 'LostPhonePhoneDetail',
                component: LostPhonePhoneDetail
            },

            {
                path: '/kts/customerManages',
                name: 'KtCustomerManageManager',
                component: KtCustomerManageManager
            },
            {
                path: '/kts/customerManages/:id',
                name: 'KtCustomerManageDetail',
                component: KtCustomerManageDetail
            },
            {
                path: '/kts/deviceManages',
                name: 'KtDeviceManageManager',
                component: KtDeviceManageManager
            },
            {
                path: '/kts/deviceManages/:id',
                name: 'KtDeviceManageDetail',
                component: KtDeviceManageDetail
            },



    ]
})
