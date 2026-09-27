package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f26523e = new Paint(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f26524f = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f26525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Path f26526d;

    public j(Context context) {
        super(context);
        this.f26525c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f26523e.setARGB(80, 0, 0, 0);
        Paint paint = f26524f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f26499a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f26523e);
        Paint paint = f26524f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f26526d, paint);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f26525c;
            if (i10 < fArr.length) {
                fArr[i10] = fArr[i10] * 0.3f * this.f26499a;
                i10++;
            } else {
                Path path = new Path();
                this.f26526d = path;
                float[] fArr2 = this.f26525c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f26526d;
                float[] fArr3 = this.f26525c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f26526d;
                float[] fArr4 = this.f26525c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f26526d;
                float[] fArr5 = this.f26525c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f26526d;
                float[] fArr6 = this.f26525c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f26526d;
                float[] fArr7 = this.f26525c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
