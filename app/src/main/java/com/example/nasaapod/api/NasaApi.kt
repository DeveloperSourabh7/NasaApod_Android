//package com.example.nasaapod.api
//
//import android.util.Log
//import android.view.View
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.facebook.shimmer.ShimmerFrameLayout
//import persistent.app.mynasa.DataClassModel.MyNasa
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//
//class NasaApi(private val api: NasaService) {
//    suspend fun getNasaList
//
//
//
//
//
//
//    /*-------------------------------------------Count---------------------------------*/
//    fun loadNasaImage(count:String) {
//        //initiate the service
//        val destinationService = ServiceBuilder.buildService(NasaService::class.java)
//        val requestCall = destinationService.getNasaImage("JtsvseNod62vGYw4Yl9rjeAI5yfHQmwgMhISjVB0", count)
//
////        nasaViewModel.state_activity=1
//        //make network call asynchronously
//        requestCall.enqueue(object : retrofit2.Callback<List<MyNasa>> {
//            override fun onResponse(call: Call<List<MyNasa>>, response: Response<List<MyNasa>>) {
//                if (response.isSuccessful) {
//                    if(nasaViewModel.state!=0){
//                        nasaViewModel.res=response
//                        nasaViewModel.state=0
//                    }
//                    var shimmerFrameLayout: ShimmerFrameLayout=nasaContext.findViewById(R.id.shimmerFrameLayout)
//                    shimmerFrameLayout.stopShimmer()
//                    shimmerFrameLayout.visibility= View.GONE
//
//                    nasaContext.findViewById<RecyclerView>(R.id.recyclerView).apply {
//
//                        setHasFixedSize(true)
//                        nasaViewModel.switch_id=0
//                        layoutManager = LinearLayoutManager(this.context)
//                        adapter = NasaAdapter(nasaViewModel.res!!.body()!!,nasaContext)
//                    }
//                } else {
//                    Log.e("Response", "Something went Wrong: not found")
//                }
//            }
//
//            override fun onFailure(call: Call<List<MyNasa>>, t: Throwable) {
//                Log.e("Response", "onResponse: ${t}")
//
//            }
//        })
//    }
///*------------------------------------------------------------------------------------*/
//
//    //Fetch Image from Date
///*----------------------------------------------Date----------------------------------------*/
//    fun loadNasaImageDate() {
//        //initiate the service
//        val destinationService = ServiceBuilder.buildService(NasaService::class.java)
//        val requestCall = destinationService.getNasaImageDate("JtsvseNod62vGYw4Yl9rjeAI5yfHQmwgMhISjVB0", nasaViewModel.convertLongToDate(nasaViewModel.startDate.value!!), nasaViewModel.convertLongToDate(nasaViewModel.endDate.value!!))
//
//        //make network call asynchronously
//        requestCall.enqueue(object : Callback<List<MyNasa>> {
//            override fun onResponse(call: Call<List<MyNasa>>, response: Response<List<MyNasa>>) {
//                nasaViewModel.res=response
//                if (response.isSuccessful) {
//                    nasaContext.findViewById<RecyclerView>(R.id.recyclerView).apply {
//                        setHasFixedSize(true)
//                        nasaViewModel.switch_id=0
//                        layoutManager = LinearLayoutManager(nasaContext)
//                        adapter = NasaAdapter(response.body()!!,nasaContext)
//                    }
//                } else {
//                    Log.e("Response", "Something went Wrong: not found")
//                }
//            }
//
//            override fun onFailure(call: Call<List<MyNasa>>, t: Throwable) {
//                Log.e("Response", "onResponse: ${t}")
//            }
//        })
//    }
//    /*------------------------------------------------------------------------------*/
//}
//
