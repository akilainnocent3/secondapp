package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends View {
    private static final int[] hww = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final Paint f37103hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final Paint f37104hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f37105ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f37106rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final RectF f37107sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final RectF f37108tq;
    private int vgm;
    private final ArrayList<hww> vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hww {
        public Paint hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f37109sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public float f37110tq;
        float vy;

        public hww(Paint paint, float f10, float f11, float f12) {
            this.hww = paint;
            this.f37110tq = f10;
            this.f37109sd = f11;
            this.vy = f12;
        }
    }

    public ok(Context context) {
        super(context);
        this.f37108tq = new RectF();
        this.f37107sd = new RectF();
        this.vy = new ArrayList<>();
        this.f37103hu = new Paint();
        Paint paint = new Paint();
        this.f37104hv = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void hww() {
        if (this.vgm <= 0) {
            return;
        }
        this.f37107sd.right = Math.max(this.f37106rs, (int) (((this.f37105ok * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f37108tq;
        int i10 = this.vgm;
        canvas.drawRoundRect(rectF, i10, i10, this.f37104hv);
        RectF rectF2 = this.f37107sd;
        int i11 = this.vgm;
        canvas.drawRoundRect(rectF2, i11, i11, this.f37103hu);
        int iSave = canvas.save();
        canvas.translate(this.f37107sd.right - this.f37106rs, 0.0f);
        for (hww hwwVar : this.vy) {
            canvas.drawCircle(hwwVar.f37109sd, hwwVar.vy, hwwVar.f37110tq, hwwVar.hww);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.vgm = i14;
        this.f37106rs = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.f37108tq.set(0.0f, 0.0f, f10, f11);
        this.f37107sd.set(0.0f, 0.0f, 0.0f, f11);
        this.f37103hu.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.vy.clear();
        float f12 = this.vgm / 4.0f;
        for (int i15 : hww) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.vy.add(new hww(paint, this.vgm / 2.0f, f12, f11 / 2.0f));
            f12 += (this.vgm / 2.0f) * 3.0f;
        }
        hww();
    }

    public void setProgress(int i10) {
        int i11 = this.f37105ok;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.f37105ok = i10;
        hww();
    }
}
