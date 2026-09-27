package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f27382w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f27383x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f27384y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f27385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f27386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f27387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f27388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f27389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f27396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f27398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f27399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f27400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f27401q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f27402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f27403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f27404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f27405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f27406v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public k0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f27394j) * 360.0f;
    }

    public void a() {
        this.f27395k = f27382w;
        this.f27391g = f27383x;
        this.f27390f = this.f27404t;
        setMax(100);
        setProgress(0);
        this.f27396l = this.f27403s;
        this.f27397m = 0;
        this.f27400p = this.f27405u;
        this.f27392h = f27384y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f27387c = textPaint;
        textPaint.setColor(this.f27391g);
        this.f27387c.setTextSize(this.f27390f);
        this.f27387c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f27388d = textPaint2;
        textPaint2.setColor(this.f27392h);
        this.f27388d.setTextSize(this.f27400p);
        this.f27388d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f27385a = paint;
        paint.setColor(this.f27395k);
        this.f27385a.setStyle(Paint.Style.STROKE);
        this.f27385a.setAntiAlias(true);
        this.f27385a.setStrokeWidth(this.f27396l);
        Paint paint2 = new Paint();
        this.f27386b = paint2;
        paint2.setColor(this.f27397m);
        this.f27386b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f27395k;
    }

    public float getFinishedStrokeWidth() {
        return this.f27396l;
    }

    public int getInnerBackgroundColor() {
        return this.f27397m;
    }

    public String getInnerBottomText() {
        return this.f27401q;
    }

    public int getInnerBottomTextColor() {
        return this.f27392h;
    }

    public float getInnerBottomTextSize() {
        return this.f27400p;
    }

    public int getMax() {
        return this.f27394j;
    }

    public String getPrefixText() {
        return this.f27398n;
    }

    public int getProgress() {
        return this.f27393i;
    }

    public String getSuffixText() {
        return this.f27399o;
    }

    public int getTextColor() {
        return this.f27391g;
    }

    public float getTextSize() {
        return this.f27390f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f27396l;
        this.f27389e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f27396l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f27386b);
        canvas.drawArc(this.f27389e, 270.0f, -getProgressAngle(), false, this.f27385a);
        String str = this.f27398n + this.f27393i + this.f27399o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f27387c.measureText(str)) / 2.0f, (getWidth() - (this.f27387c.descent() + this.f27387c.ascent())) / 2.0f, this.f27387c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f27388d.setTextSize(this.f27400p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f27388d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f27402r) - ((this.f27387c.descent() + this.f27387c.ascent()) / 2.0f), this.f27388d);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f27402r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f27391g = bundle.getInt("text_color");
        this.f27390f = bundle.getFloat("text_size");
        this.f27400p = bundle.getFloat("inner_bottom_text_size");
        this.f27401q = bundle.getString("inner_bottom_text");
        this.f27392h = bundle.getInt("inner_bottom_text_color");
        this.f27395k = bundle.getInt("finished_stroke_color");
        this.f27396l = bundle.getFloat("finished_stroke_width");
        this.f27397m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f27398n = bundle.getString("prefix");
        this.f27399o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f27395k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f27396l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f27397m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f27401q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f27392h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f27400p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f27394j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f27398n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f27393i = i10;
        if (i10 > getMax()) {
            this.f27393i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f27399o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f27391g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f27390f = f10;
        invalidate();
    }

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27389e = new RectF();
        this.f27393i = 0;
        this.f27398n = "";
        this.f27399o = "";
        this.f27401q = "";
        this.f27404t = a.d(getResources(), 14.0f);
        this.f27406v = (int) a.c(getResources(), 100.0f);
        this.f27403s = a.c(getResources(), 4.0f);
        this.f27405u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f27406v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
