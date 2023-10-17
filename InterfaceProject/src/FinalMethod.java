public class FinalMethod {
    public static void main(String[] args) {
       /*Camera cam = new Camera();
       cam.click();
       System.out.println("-----------------");

       VideoCamera videoCamera = new VideoCamera(); //also a camera
       videoCamera.click();
       videoCamera.record();*/

       //Camera cam = new Camera();
        VideoCamera cam = new VideoCamera();
       try {
        cam.click();
        } catch (PhotoBlurredException e) {
            System.out.println("Photo Creation Problem : "+e);
        }

    }
}

class CameraException extends Exception {
    CameraException(String str) {
        super(str);
    }
}
class PhotoBlurredException extends CameraException {
    PhotoBlurredException(String str) {
        super(str);
    }
}
class RecordingException extends CameraException {
    RecordingException(String str) {
        super(str);
    }
}
//knowledge = apply = wisdom (experential knowledge)

class Camera
{
    void click() throws CameraException
    {
        double val = Math.random()%10;
       
       
            System.out.println("Camera is clicking the photo");
        
    }
}
class VideoCamera extends Camera
{
    void click() throws PhotoBlurredException, RecordingException, 
    {
       
        System.out.println("and its clicked during the shoot....");
    }
    void record() {
        System.out.println("VideoCamera is recording....");
    }
}   

/*
 * 1. it will run
 * 2. child class exception is not compatible as per super class method
 * 3. super class exception is not ready to handle child class exception
 */