package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny extends View {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private PorterDuff.Mode f34343ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34344hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34345hv;
    Rect hww;
    private LinearGradient khx;
    private Bitmap nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private Xfermode f34346ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34347ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int[] f34348rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34349sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    Rect f34350tq;
    private int vgm;
    private Paint vhb;
    private int vy;
    private final List<hww> weu;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private final int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private int f34351tq = 0;

        public hww(int i10) {
            this.hww = i10;
        }

        public void hww() {
            this.f34351tq += this.hww;
        }
    }

    public ny(Context context) {
        super(context);
        this.f34343ed = PorterDuff.Mode.DST_IN;
        this.weu = new ArrayList();
        hww();
    }

    private void hww() {
        this.f34349sd = com.bytedance.sdk.component.utils.kub.vy(getContext(), "tt_splash_unlock_image_arrow");
        this.vy = Color.parseColor("#00ffffff");
        this.f34345hv = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f34344hu = color;
        this.vgm = 10;
        this.f34347ok = 40;
        this.f34348rs = new int[]{this.vy, this.f34345hv, color};
        setLayerType(1, null);
        this.vhb = new Paint(1);
        this.nod = BitmapFactory.decodeResource(getResources(), this.f34349sd);
        this.f34346ny = new PorterDuffXfermode(this.f34343ed);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.nod, this.hww, this.f34350tq, this.vhb);
        canvas.save();
        Iterator<hww> it = this.weu.iterator();
        while (it.hasNext()) {
            hww next = it.next();
            this.khx = new LinearGradient(next.f34351tq, 0.0f, next.f34351tq + this.f34347ok, this.vgm, this.f34348rs, (float[]) null, Shader.TileMode.CLAMP);
            this.vhb.setColor(-1);
            this.vhb.setShader(this.khx);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.vhb);
            this.vhb.setShader(null);
            next.hww();
            if (next.f34351tq > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.vhb.setXfermode(this.f34346ny);
        canvas3.drawBitmap(this.nod, this.hww, this.f34350tq, this.vhb);
        this.vhb.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.nod == null) {
            return;
        }
        this.hww = new Rect(0, 0, this.nod.getWidth(), this.nod.getHeight());
        this.f34350tq = new Rect(0, 0, getWidth(), getHeight());
    }

    public void hww(int i10) {
        this.weu.add(new hww(i10));
        postInvalidate();
    }
}
