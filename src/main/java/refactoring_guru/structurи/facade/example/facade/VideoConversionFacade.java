package refactoring_guru.structurи.facade.example.facade;

import refactoring_guru.structurи.facade.example.some_complex_media_library.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file=new VideoFile(fileName);
        Codec sourceCodec= CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")){
            destinationCodec=new MPEG4CompressionCodec();
        }else {
            destinationCodec=new OggCompressionCodec();
        }
        VideoFile buffer=BritrateReader.read(file,sourceCodec);
        VideoFile intermediateResult=BritrateReader.convert(buffer,destinationCodec);
        File result=(new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
