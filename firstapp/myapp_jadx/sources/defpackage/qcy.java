package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.surfaceview.GameSurfaceView;
import com.sportygames.sportysoccer.widget.StatusBarLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class qcy extends sby {
    public final StatusBarLayout e;
    public bwf f;
    public int g;
    public final knj h;
    public final GestureDetector i;
    public boolean j;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            qcy qcyVar = qcy.this;
            if (qcyVar.b(x, y)) {
                GameSurfaceView gameSurfaceView = qcyVar.h.a;
                int i = GameSurfaceView.z;
                GameSurfaceView.a aVar = gameSurfaceView.a;
                if (aVar != null) {
                    lmj lmjVar = ((GameActivity) aVar).z;
                    if (TextUtils.equals("game_ready", lmjVar.m)) {
                        int i2 = lmjVar.i;
                        if (i2 > 0) {
                            lmjVar.h.c(i2, lmjVar);
                            lmjVar.i = 0;
                        } else {
                            moj mojVar = lmjVar.c.get();
                            if (mojVar != null) {
                                mojVar.R0();
                            }
                        }
                    }
                }
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public qcy(Context context, knj knjVar) {
        a aVar = new a();
        this.h = knjVar;
        this.i = new GestureDetector(context, aVar);
        StatusBarLayout statusBarLayout = (StatusBarLayout) LayoutInflater.from(context).inflate(R.layout.sg_ss_layout_status_bar, (ViewGroup) null);
        this.e = statusBarLayout;
        statusBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public final boolean b(float f, float f2) {
        RectF leaderBoardIconRect = this.e.getLeaderBoardIconRect();
        return this.g > 0 && f >= leaderBoardIconRect.left && f <= leaderBoardIconRect.right && f2 >= leaderBoardIconRect.top && f2 <= leaderBoardIconRect.bottom;
    }

    public final void c() {
        int i = this.g;
        if (i <= 0) {
            this.f = null;
            return;
        }
        StatusBarLayout statusBarLayout = this.e;
        statusBarLayout.measure(i, -2);
        int measuredWidth = statusBarLayout.getMeasuredWidth();
        int measuredHeight = statusBarLayout.getMeasuredHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        statusBarLayout.layout(0, 0, measuredWidth, measuredHeight);
        statusBarLayout.draw(canvas);
        bwf bwfVar = this.f;
        if (bwfVar == null) {
            this.f = new bwf(bitmapCreateBitmap, 0.0f, 0.0f, measuredWidth, measuredHeight);
            return;
        }
        bwfVar.l = new Bitmap[]{bitmapCreateBitmap};
        bwfVar.a = 0.0f;
        bwfVar.b = 0.0f;
        bwfVar.c = measuredWidth;
        bwfVar.d = measuredHeight;
    }
}
