package Uebung8;

public class Playlist {

    private Folge<Song> songs;

    public Playlist(Folge<Song> songs) {
        this.songs = songs;
    }

    public void add(Song song){
        songs.addLast ( song );
    }
    public void delete(Song song){
        songs.delete ( song );
    }
    public void play( Song song){
        System.out.println (song.getSongtext ());
    }
    public void play(){
        for(Song song : songs)
            play (song);
    }
    public void shuffle(){
        Playlist playlist = new Playlist ( new FolgeDynArray<> () );
        for(Song song : songs) {
            playlist.add ( song );
        }
        while (!playlist.songs.isEmpty ()){
            Song song = playlist.songs.get (new java.util.Random ().nextInt(playlist.songs.size ()) );
            playlist.delete ( song );
            playlist.play (song);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Playlist)) return false;
        Playlist playlist = (Playlist) o;
        for (int i = 0; i < songs.size(); i++) {
            if (!songs.get(i).equals(playlist.songs.get(i))) {
                return false;
            }
        }
        return true;
    }
}
