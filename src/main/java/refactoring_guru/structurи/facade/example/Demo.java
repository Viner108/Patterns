package refactoring_guru.structurи.facade.example;

import refactoring_guru.structurи.facade.example.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter=new VideoConversionFacade();
        File mp4Video=converter.convertVideo("youtudevideo.ogg","mp4");
    }
}
