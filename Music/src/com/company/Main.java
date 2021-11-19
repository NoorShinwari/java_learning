package com.company;

import com.company.model.Album;
import com.company.model.Artist;
import com.company.model.Datasource;
import com.company.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No artists");
            return;
        }
        for (Artist artist : artists) {
            System.out.println("ID: " + artist.getId() + ", Name: " + artist.getName());
        }
        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden",Datasource.ORDER_BY_ASC);

        if (albumsForArtist == null) {
            System.out.println("No albums");
            return;
        }
        for (String album :  albumsForArtist) {
            System.out.println("Album: " + album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);

        if (songArtists == null) {
            System.out.println("No songs");
            return;
        }
        for (SongArtist songArtist : songArtists) {
            System.out.println("Artist name: " + songArtist.getArtistName() +
                    ", Album name: " + songArtist.getAlbumName() +
                    ", Track number : " + songArtist.getTrack());
        }
        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongsArtists();

//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter a song title: ");
//        String title = scanner.nextLine();
//
//        songArtists = datasource.querySongInfoView(title);
//        if (songArtists.isEmpty()) {
//            System.out.println("Couldn't find the artist for the song");
//            return;
//        }
//        for (SongArtist songArtist : songArtists) {
//            System.out.println("FROM VIEW - Artist name: " + songArtist.getArtistName() +
//                    ", Album name: " + songArtist.getAlbumName() +
//                    ", Track number : " + songArtist.getTrack());
//        }
        datasource.insertSong("Touch of Grey", "Grateful Dead", "In The Dark", 1);
        datasource.close();
    }
}
