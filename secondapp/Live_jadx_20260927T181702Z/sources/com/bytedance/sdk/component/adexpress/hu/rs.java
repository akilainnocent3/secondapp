package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs extends View {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34356hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Paint f34357hv;
    private int hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34358ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final RectF f34359sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34360tq;
    private Paint vgm;
    private Paint vy;

    public rs(Context context) {
        super(context);
        this.f34359sd = new RectF();
        hww();
    }

    private void hww() {
        Paint paint = new Paint();
        this.vy = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.vgm = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f34357hv = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f34359sd;
        int i10 = this.f34356hu;
        canvas.drawRoundRect(rectF, i10, i10, this.f34357hv);
        RectF rectF2 = this.f34359sd;
        int i11 = this.f34356hu;
        canvas.drawRoundRect(rectF2, i11, i11, this.vy);
        int i12 = this.hww;
        int i13 = this.f34360tq;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.vgm);
        int i14 = this.hww;
        int i15 = this.f34360tq;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.vgm);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.hww = i10;
        this.f34360tq = i11;
        RectF rectF = this.f34359sd;
        int i14 = this.f34358ok;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.f34357hv.setStyle(Paint.Style.FILL);
        this.f34357hv.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.vgm.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.vgm.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.f34356hu = i10;
    }

    public void setStrokeColor(int i10) {
        this.vy.setStyle(Paint.Style.STROKE);
        this.vy.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.vy.setStrokeWidth(i10);
        this.f34358ok = i10;
    }
}
