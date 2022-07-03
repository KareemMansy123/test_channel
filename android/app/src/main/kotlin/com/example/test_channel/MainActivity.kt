package com.example.test_channel

import android.content.Intent
import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {
private lateinit var channel: MethodChannel
private var channelName = "myChannel"

  override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
    channel = MethodChannel(flutterEngine.dartExecutor.binaryMessenger,channelName)

    // receive data from flutter
    channel.setMethodCallHandler { call, result -> if (call.method.equals("openCamera")) openCamera()
    }
  }

  private fun openCamera() {
    intent = Intent("android.media.action.IMAGE_CAPTURE")
    startActivity(intent)
    Log.e("TAG", "openCamera: test", )
  }
}
