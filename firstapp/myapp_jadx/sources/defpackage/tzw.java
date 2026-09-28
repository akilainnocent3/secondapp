package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes8.dex */
public final class tzw {
    public final Paint a;
    public final Paint b;
    public final Paint c;

    public tzw() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStrokeWidth(4.0f);
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setStrokeWidth(6.0f);
    }
}
