package com.theolinnaidoo.plugins

class NativeLib {

    /**
     * A native method that is implemented by the 'plugins' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'plugins' library on application startup.
        init {
            System.loadLibrary("plugins")
        }
    }
}