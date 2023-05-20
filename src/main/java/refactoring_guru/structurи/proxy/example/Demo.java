package refactoring_guru.structurи.proxy.example;

import refactoring_guru.structurи.proxy.example.downloader.YouTubeDownloader;
import refactoring_guru.structurи.proxy.example.proxy.YouTubeCacheProxy;
import refactoring_guru.structurи.proxy.example.some_cool_media_library.ThirdPartyYouTubeClass;

public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader =new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader=new YouTubeDownloader(new YouTubeCacheProxy());
        long naive=test(naiveDownloader);
        long smart=test(smartDownloader);
        System.out.println("Time saved by caching proxy: "+ (naive - smart)+ "ms");
    }
    private static long test(YouTubeDownloader downloader){
        long startTime=System.currentTimeMillis();
        downloader.renderPopularVideo();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideo();
        downloader.renderVideoPage("dancesvedeoo");
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
        long estimatedTime= System.currentTimeMillis()-startTime;
        System.out.println("Time elapsed: "+ estimatedTime + "ms\n");
        return estimatedTime;
    }
}
