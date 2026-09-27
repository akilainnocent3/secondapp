package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f66272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f66279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f66280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f66282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f66283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f66284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f66285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f66286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f66287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f66288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f66289r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f66280i, this.f66281j, this.f66285n, this.f66282k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f66282k == null || this.f66283l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f66282k;
                float f10 = this.f66276e;
                fArr[i13] = f10;
                this.f66283l[i13] = f10 - (this.f66280i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f66282k;
                float f11 = this.f66277f;
                fArr2[i10] = f11;
                this.f66283l[i10] = f11 - (this.f66280i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f66282k;
                float f12 = this.f66278g;
                fArr3[i11] = f12;
                this.f66283l[i11] = f12 - (this.f66280i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f66282k;
                float f13 = this.f66279h;
                fArr4[i12] = f13;
                this.f66283l[i12] = f13 - (this.f66280i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f66285n;
        if (rectF != null) {
            float f10 = this.f66280i / 2.0f;
            rectF.set(f10, f10, this.f66273b - f10, this.f66274c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f66284m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f66273b, this.f66274c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f66284m, null, 31);
            int i10 = this.f66273b;
            int i11 = this.f66280i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            int i12 = this.f66274c;
            float f12 = i12;
            canvas.scale(f10 / f11, ((i12 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f66289r;
            if (paint != null) {
                paint.reset();
                this.f66289r.setAntiAlias(true);
                this.f66289r.setStyle(Paint.Style.FILL);
                this.f66289r.setXfermode(this.f66272a);
            }
            Path path = this.f66288q;
            if (path != null) {
                path.reset();
                this.f66288q.addRoundRect(this.f66284m, this.f66283l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f66288q, this.f66289r);
            Paint paint2 = this.f66289r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f66286o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f66273b = i10;
        this.f66274c = i11;
        if (this.f66287p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f66286o = true;
        this.f66280i = i11;
        this.f66281j = i12;
        this.f66275d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f66275d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f66286o = true;
        this.f66287p = true;
        this.f66280i = i14;
        this.f66281j = i15;
        this.f66276e = i10;
        this.f66278g = i12;
        this.f66277f = i11;
        this.f66279h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f66288q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f66288q, this.f66289r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66288q = new Path();
        this.f66289r = new Paint();
        this.f66282k = new float[8];
        this.f66283l = new float[8];
        this.f66285n = new RectF();
        this.f66284m = new RectF();
        this.f66272a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f66288q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f66289r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f66289r.setColor(i11);
            this.f66289r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f66282k == null || this.f66283l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f66282k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f66275d;
                fArr[i10] = f10;
                this.f66283l[i10] = f10 - (this.f66280i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
