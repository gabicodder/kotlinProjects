package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var brillo: String = "40%"
    private var pixeles: String = "8px"

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }

    fun setBrillo(brillo: String){
        this.brillo = brillo
    }

    fun getBrillo(): String{
        return this.brillo
    }

    fun setPixeles(pixeles: String){
        this.pixeles = pixeles
    }

    fun getPixeles(): String{
        return this.pixeles
    }

    fun getcameraStatus(): String{
        return  if(isOn) "Camera is Turned" else "Camera is not Turned"
    }

    fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }
}