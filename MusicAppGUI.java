package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;

public class MusicAppGUI extends JFrame {
    private DefaultListModel<String> playlistListModel = new DefaultListModel<>();
    private JList<String> playlistList = new JList<>(playlistListModel);

    private JTextField searchBar = new JTextField("Search...");
    private JLabel recentlyPlayedLabel = new JLabel("Recently Played");
    private DefaultListModel<Song> songListModel = new DefaultListModel<>();
    private JList<Song> songList = new JList<>(songListModel);

    private JLabel songArt = new JLabel();
    private JLabel songDetails = new JLabel("No song playing");

    private JPanel bottomBar = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JLabel nowPlayingLabel = new JLabel("No song");
    private JButton playPauseBtn = new JButton("▶️");
    private JButton favBtn = new JButton("⭐");

    private JPanel customTitleBar = new JPanel();
    private JLabel title = new JLabel("  🎧 Mini Spotify");
    private JButton closeBtn = new JButton("X");
    private JButton minBtn = new JButton(" --- ");

    private boolean showingFavorites = false;

    private Point mouseDownCompCoords = null;

    private Color bgColor = new Color(18, 18, 18);
    private Color darkGray = new Color(30, 30, 30);
    private Color slightlyLighter = new Color(45, 45, 45);
    private Color textColor = Color.WHITE;

    private MyArrayList<Song> songLibrary;
    private Song currentSong = null;
    private boolean isPlaying = false;
    private HashSet<Song> favoritesSet = new HashSet<>();

    public MusicAppGUI(MyArrayList<Song> songs) {
        super();
        this.songLibrary = songs;

        setUndecorated(true);
        setSize(1000, 600);
        setLayout(new BorderLayout());
        getContentPane().setBackground(bgColor);

        // Title Bar
        customTitleBar.setLayout(new BorderLayout());
        customTitleBar.setBackground(darkGray);
        customTitleBar.setPreferredSize(new Dimension(getWidth(), 35));

        title.setForeground(textColor);
        title.setFont(new Font("SansSerif", Font.BOLD, 14));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        buttonPanel.setOpaque(false);

        for (JButton b : new JButton[]{minBtn, closeBtn}) {
            b.setForeground(textColor);
            b.setBackground(new Color(50, 50, 50));
            b.setFocusPainted(false);
            b.setBorderPainted(false);
            b.setPreferredSize(new Dimension(40, 35));
        }

        closeBtn.addActionListener(e -> System.exit(0));
        minBtn.addActionListener(e -> setState(JFrame.ICONIFIED));

        buttonPanel.add(minBtn);
        buttonPanel.add(closeBtn);

        customTitleBar.add(title, BorderLayout.WEST);
        customTitleBar.add(buttonPanel, BorderLayout.EAST);

        customTitleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }

            public void mouseReleased(MouseEvent e) {
                mouseDownCompCoords = null;
            }
        });

        customTitleBar.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
            }
        });

        add(customTitleBar, BorderLayout.NORTH);

        // Left: Playlists
        playlistListModel.addElement("MySongs");
        playlistListModel.addElement("Favorites");

        playlistList.setBackground(darkGray);
        playlistList.setForeground(textColor);
        playlistList.setSelectionBackground(slightlyLighter);
        playlistList.setSelectionForeground(textColor);
        playlistList.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane leftPane = new JScrollPane(playlistList);
        leftPane.setPreferredSize(new Dimension(180, getHeight()));
        leftPane.setBorder(null);

        // Middle
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        middlePanel.setBackground(bgColor);
        middlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        searchBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        searchBar.setBackground(darkGray);
        searchBar.setForeground(textColor);
        searchBar.setCaretColor(Color.WHITE);
        searchBar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        middlePanel.add(searchBar);
        middlePanel.add(Box.createRigidArea(new Dimension(0, 10)));

        recentlyPlayedLabel.setForeground(textColor);
        recentlyPlayedLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        middlePanel.add(recentlyPlayedLabel);
        middlePanel.add(Box.createRigidArea(new Dimension(0, 5)));

        for (int i = 0; i < songLibrary.size(); i++) songListModel.addElement(songLibrary.get(i));
        songList.setBackground(darkGray);
        songList.setForeground(textColor);
        songList.setSelectionBackground(slightlyLighter);
        songList.setSelectionForeground(textColor);
        songList.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JScrollPane songScrollPane = new JScrollPane(songList);
        songScrollPane.setBorder(null);
        middlePanel.add(songScrollPane);

        // Right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setPreferredSize(new Dimension(250, getHeight()));
        rightPanel.setBackground(darkGray);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        songArt.setPreferredSize(new Dimension(230, 230));
        songArt.setHorizontalAlignment(JLabel.CENTER);
        songArt.setIcon(getDefaultArt());
        songArt.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        songDetails.setForeground(textColor);
        songDetails.setHorizontalAlignment(JLabel.CENTER);
        songDetails.setFont(new Font("SansSerif", Font.PLAIN, 14));

        rightPanel.add(songArt, BorderLayout.CENTER);
        rightPanel.add(songDetails, BorderLayout.SOUTH);

        // Bottom bar
        bottomBar.setBackground(new Color(25, 25, 25));
        nowPlayingLabel.setForeground(textColor);
        nowPlayingLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        bottomBar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        playPauseBtn.setBackground(slightlyLighter);
        favBtn.setBackground(slightlyLighter);

        for (JButton btn : new JButton[]{playPauseBtn, favBtn}) {
            btn.setForeground(textColor);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        }

        bottomBar.add(nowPlayingLabel);
        bottomBar.add(Box.createHorizontalStrut(15));
        bottomBar.add(playPauseBtn);
        bottomBar.add(favBtn);

        add(leftPane, BorderLayout.WEST);
        add(middlePanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);
        add(bottomBar, BorderLayout.SOUTH);

        songList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Song selected = songList.getSelectedValue();
                if (selected != null && selected != currentSong) {
                    currentSong = selected;
                    playSong(currentSong);
                }
            }
        });

        playPauseBtn.addActionListener(e -> {
            isPlaying = !isPlaying;
            playPauseBtn.setText(isPlaying ? "⏸️" : "▶️");
        });

        favBtn.addActionListener(e -> {
            if (currentSong != null) {
                favoritesSet.add(currentSong);
                JOptionPane.showMessageDialog(this, "Added to Favorites!");
            }
        });

        playlistList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = playlistList.getSelectedValue();
                if (selected != null) {
                    songListModel.clear();
                    if (selected.equals("Favorites")) {
                        showingFavorites = true;
                        for (Song s : favoritesSet) songListModel.addElement(s);
                    } else if (selected.equals("MySongs")) {
                        showingFavorites = false;
                        for (int i = 0; i < songLibrary.size(); i++) songListModel.addElement(songLibrary.get(i));
                    }
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void playSong(Song song) {
        nowPlayingLabel.setText("Now Playing: " + song.title);
        songDetails.setText(song.title + " by " + song.artist);
        songArt.setIcon(getDefaultArt());
    }

    private ImageIcon getDefaultArt() {
        ImageIcon icon = new ImageIcon("default_art.png");
        Image scaled = icon.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
}
