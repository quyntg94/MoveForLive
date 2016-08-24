package GameScene;

import Utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Viet on 8/18/2016.
 */
public class MenuGameScene implements GameScene, KeyListener {
    private GameSceneListener gameSceneListener;
    private Image background;
//    private JButton button = new JButton(new ImageIcon("resources/button.png"));
//    private JPanel panel = new JPanel();

    public MenuGameScene() {
        background = Utils.loadImage("resources/game2.png");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (gameSceneListener != null)
//                    gameSceneListener.changeGameScene(new PlayGameScene());
//            }
//        });
//        panel.add(button);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    @Override
    public KeyListener getKeyListener() {
        return this;
    }

    @Override
    public void setGameSceneListener(GameSceneListener gameSceneListener) {
        this.gameSceneListener = gameSceneListener;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (gameSceneListener != null)
                gameSceneListener.changeGameScene(new PlayGameScene());
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void run() {

    }
}