package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import f2.z1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends View {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private float f34375ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34376hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f34377hv;
    private int hww;
    private int khx;
    private Paint nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private float f34378ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private List<Integer> f34379ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private List<Integer> f34380rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34381sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34382tq;
    private boolean vgm;
    private Paint vhb;
    private int vy;

    public vy(Context context) {
        this(context, null);
    }

    private void sd() {
        Paint paint = new Paint();
        this.nod = paint;
        paint.setAntiAlias(true);
        this.nod.setStrokeWidth(this.khx);
        this.f34379ok.add(255);
        this.f34380rs.add(0);
        Paint paint2 = new Paint();
        this.vhb = paint2;
        paint2.setAntiAlias(true);
        this.vhb.setColor(Color.parseColor("#0FFFFFFF"));
        this.vhb.setStyle(Paint.Style.FILL);
    }

    public void hww() {
        this.vgm = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.nod.setShader(new LinearGradient(this.f34378ny, 0.0f, this.f34375ed, getMeasuredHeight(), -1, z1.f82662x, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.f34379ok.size()) {
                break;
            }
            Integer num = this.f34379ok.get(i10);
            this.nod.setAlpha(num.intValue());
            Integer num2 = this.f34380rs.get(i10);
            if (this.f34381sd + num2.intValue() < this.f34377hv) {
                canvas.drawCircle(this.f34378ny, this.f34375ed, this.f34381sd + num2.intValue(), this.nod);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f34377hv) {
                this.f34379ok.set(i10, Integer.valueOf(num.intValue() - this.f34376hu > 0 ? num.intValue() - (this.f34376hu * 3) : 1));
                this.f34380rs.set(i10, Integer.valueOf(num2.intValue() + this.f34376hu));
            }
            i10++;
        }
        List<Integer> list = this.f34380rs;
        if (list.get(list.size() - 1).intValue() >= this.f34377hv / this.vy) {
            this.f34379ok.add(255);
            this.f34380rs.add(0);
        }
        if (this.f34380rs.size() >= 3) {
            this.f34380rs.remove(0);
            this.f34379ok.remove(0);
        }
        this.nod.setAlpha(255);
        this.nod.setColor(this.f34382tq);
        canvas.drawCircle(this.f34378ny, this.f34375ed, this.f34381sd, this.vhb);
        if (this.vgm) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.f34378ny = f10;
        this.f34375ed = i11 / 2.0f;
        float f11 = f10 - (this.khx / 2.0f);
        this.f34377hv = f11;
        this.f34381sd = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.hww = i10;
    }

    public void setCoreColor(int i10) {
        this.f34382tq = i10;
    }

    public void setCoreRadius(int i10) {
        this.f34381sd = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.f34376hu = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.vy = i10;
    }

    public void setMaxWidth(int i10) {
        this.f34377hv = i10;
    }

    public void tq() {
        this.vgm = false;
        this.f34380rs.clear();
        this.f34379ok.clear();
        this.f34379ok.add(255);
        this.f34380rs.add(0);
        invalidate();
    }

    public vy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public vy(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hww = -1;
        this.f34382tq = p1.a.f120313c;
        this.f34381sd = 18.0f;
        this.vy = 3;
        this.f34377hv = 50.0f;
        this.f34376hu = 2;
        this.vgm = false;
        this.f34379ok = new ArrayList();
        this.f34380rs = new ArrayList();
        this.khx = 24;
        sd();
    }
}
