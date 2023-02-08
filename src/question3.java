public class question3 {
    public static void main(String[] args) {
        int[] array = {20, 52, 400, 3, 30, 70, 72, 47, 28, 38, 41, 53, 20};
        int max = 0;
        int min = 0;
        int maxPosition = 0;
        int minPosition = 0;

        for (int i = 0; i < array.length-1; i++) {
            int abs = Math.abs(array[i] - array[i + 1]);
            if (abs >= max) {
                max = abs;
                if (array[i] > array[i + 1]) {
                    maxPosition = i;
                } else {
                    maxPosition = i + 1;

                }
            } else {
                min = abs;
                if (array[i] < array[i + 1]) {
                    minPosition = i;
                } else {
                    minPosition = i + 1;
                }
            }
        }
    }
}


// Ask professor-
// class AudioPlayer {
//    protected boolean openSpeaker(int sp) {
//        // implementation details
//        return  false;
//    }
//}
//
//class StreamingAudioPlayer extends AudioPlayer {
//    boolean openSpeaker(int sp) {
//        // implementation details
//        return  false;
//    }
//}

