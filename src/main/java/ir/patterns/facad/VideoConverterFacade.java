package ir.patterns.facad;

import ir.patterns.facad.convert.*;

import java.io.File;

public class VideoConverterFacade {

    //this is our facade class that we write the implementation here and use it simply in demo

    public File convert(VideoFile sourceFile, String codec) {
        System.out.println("VideoConverterFacade: conversion started");
        Codec sourceCodec = CodecFactory.extract(sourceFile);
        Codec destinationCodec;
        if(codec.equals("mp4"))
            destinationCodec = new MPEG4CompressionCodec();
        else
            destinationCodec = new OggCompressionCodec();
        VideoFile buffer = BitrateReader.read(sourceFile, sourceCodec);
        VideoFile intermediateFile = BitrateReader.convert(buffer, destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        File finalResult = audioMixer.fix(intermediateFile);
        System.out.println("VideoConverterFacade: conversion completed");
        return finalResult;
    }
}
