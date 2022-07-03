import 'package:flutter/services.dart';
import 'package:get/get.dart';

class HomeVM extends GetxController {
  /// channel name to connect with native code
  static const methodChannel = MethodChannel('myChannel');

  Future<void> openCamera() async {
    try {
      /// call function from native code
      await methodChannel.invokeMethod('openCamera');
    } on Exception catch (e) {
      /// handle your exception here
    }
  }
}
