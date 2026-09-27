package com.bytedance.adsdk.ugeno.rs.hu;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.hww.ok;
import com.bytedance.adsdk.ugeno.hww.vgm;
import com.bytedance.adsdk.ugeno.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends TextView implements IAnimation, vgm {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f32593hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f32594hv;
    private vy hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ok f32595sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f32596tq;
    private float vgm;
    private float vy;

    public hww(Context context) {
        super(context);
        this.vy = -1.0f;
        this.f32593hu = 1.0f;
        this.vgm = 0.0f;
        this.f32595sd = new ok(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.tq(canvas);
        }
    }

    public float getBorderRadius() {
        return this.f32595sd.hww();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.hww.vgm
    public float getRipple() {
        return this.f32596tq;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRubIn() {
        return this.f32595sd.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getShine() {
        return this.f32595sd.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getStretch() {
        return this.f32595sd.getStretch();
    }

    public void hww(vy vyVar) {
        this.hww = vyVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.ok();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.hww(canvas, this);
            this.hww.hww(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.hww(i10, i11, i12, i13);
        }
        if (z10 && this.vy > 0.0f) {
            hww(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        vy vyVar = this.hww;
        if (vyVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrHww = vyVar.hww(i10, i11);
            super.onMeasure(iArrHww[0], iArrHww[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.tq(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f32595sd.hww(i10);
    }

    public void setBorderRadius(float f10) {
        ok okVar = this.f32595sd;
        if (okVar != null) {
            okVar.hww(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f32593hu = f11;
        this.vgm = f10;
    }

    public void setMinTextSize(float f10) {
        this.vy = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f32596tq = f10;
        ok okVar = this.f32595sd;
        if (okVar != null) {
            okVar.tq(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        ok okVar = this.f32595sd;
        if (okVar != null) {
            okVar.hv(f10);
        }
    }

    public void setShine(float f10) {
        ok okVar = this.f32595sd;
        if (okVar != null) {
            okVar.sd(f10);
        }
    }

    public void setStretch(float f10) {
        ok okVar = this.f32595sd;
        if (okVar != null) {
            okVar.vy(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.f32594hv = getTextSize();
    }

    private void hww(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.f32594hv == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.f32594hv;
        int iHww = hww(text, paint, i10, fMax);
        while (iHww > i11 && fMax > this.vy) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.vy);
            fMax = Math.max(fMax - 1.0f, this.vy);
            iHww = hww(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.vgm, this.f32593hu);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.f32594hv = getTextSize();
    }

    private int hww(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.f32593hu, this.vgm, true).getHeight();
    }
}
