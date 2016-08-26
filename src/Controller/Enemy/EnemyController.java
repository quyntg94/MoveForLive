package Controller.Enemy;

import Controller.Colliable;
import Controller.CollisionPool;
import Controller.SingleController;
import Model.Enemy;
import View.GameDrawer;

/**
 * Created by giaqu on 8/14/2016.
 */
public class EnemyController extends SingleController implements Colliable {

    public EnemyController(Enemy gameObject, GameDrawer gameDrawer) {
        super(gameObject, gameDrawer);
        if(this.getGameObject().getX() == 0 || this.getGameObject().getX() == 690)
            this.gameVector.dx += 3;
        if(this.getGameObject().getX() == 650 || this.getGameObject().getX() == 1350)
            this.gameVector.dx -= 3;
        CollisionPool.instance.add(this);
    }

    @Override
    public void onCollide(Colliable colliable) {
        if (gameObject.getX() >= 650) {
            gameObject.destroy();
        }

        if (gameObject.getX() < 50) {
            gameObject.destroy();
        }

        if ( gameObject.getX() <= 1350 && gameObject.getX() > 700) {
            gameObject.destroy();
        }
        if ( gameObject.getX() <= 700 && gameObject.getX() > 650) {
            gameObject.destroy();
        }

    }
}
