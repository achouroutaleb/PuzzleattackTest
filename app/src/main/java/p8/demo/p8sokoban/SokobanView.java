package p8.demo.p8sokoban;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import static android.content.ContentValues.TAG;

public class SokobanView extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    //déclaration de nos Images
    private Bitmap vide;
    private Bitmap brickYellow;
    private Bitmap brickGreen;
    private Bitmap brickBlue;

    // déclaration de la matrice
    int[][] carte;

    // Declaration des objets Ressources et Context permettant d'accéder aux ressources de notre application et de les charger
    private Resources   pRes;
    private Context 	pContext;

    // ancres pour pouvoir centrer la carte du jeu
    int        carteTopAnchor;                   // coordonnées en Y du point d'ancrage de notre carte
    int        carteLeftAnchor;                  // coordonnées en X du point d'ancrage de notre carte


    // taille de la carte
    static final int    carteTileSize = 20;
    static final int    carteWidth    = 6;
    static final int    carteHeight   = 7;
    static final int sizeCST = 40; // taille de notre CST

    // constante modelisant les differentes types de cases

    static final int CST_vide = 0;
    static final int CST_brique1=1; // yellow
    static final int CST_brique2= 2;//green
    static final int CST_brique3= 3;//BLUE

    // tableau de reference du terrain
    int [][] puzzle1={{CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_brique1,CST_brique1,CST_vide,CST_brique1,CST_vide,CST_vide},
    } ;
    int [][] puzzle2={{CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_brique2,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_brique2,CST_vide,CST_vide},
            {CST_brique1,CST_brique1,CST_brique2,CST_brique1,CST_vide,CST_vide},
    } ;

    int [][] puzzle3={{CST_vide,CST_vide,CST_vide,CST_vide,CST_vide,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_brique2,CST_vide},
            {CST_vide,CST_vide,CST_vide,CST_vide,CST_brique3,CST_vide},
            {CST_vide,CST_vide,CST_brique2,CST_brique2,CST_brique3,CST_vide},
            {CST_vide,CST_brique1,CST_brique1,CST_brique3,CST_brique1,CST_vide},
    } ;


    private     boolean in      = true;
    private     Thread  cv_thread;
    SurfaceHolder holder;

    public SokobanView(Context context) {
        super(context);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }
}
