package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vhb;
import com.bytedance.sdk.component.adexpress.dynamic.vy.vgm;
import p1.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34018hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34019hv;
    Paint hww;
    private int vy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    Path f34021tq = new Path();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    Path f34020sd = new Path();

    public sd() {
        Paint paint = new Paint();
        this.hww = paint;
        paint.setAntiAlias(true);
    }

    public void hww(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrTq;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrTq = vgm.tq(str);
                    } catch (Exception unused) {
                        fArrTq = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.hww.setColor(Color.parseColor(str));
                    this.hww.setAlpha(90);
                } else if (fArrTq != null) {
                    this.hww.setColor(com.bytedance.sdk.component.adexpress.vy.vgm.hww(fArrTq[3] * (1.0f - iAnimation.getRippleValue()), fArrTq[0] / 256.0f, fArrTq[1] / 256.0f, fArrTq[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i10 = this.vy;
            int i11 = this.f34019hv;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRippleValue(), this.hww);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f34021tq.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) ((((this.vy * 4) + (iIntValue * 2)) + (this.f34019hv * 2)) * iAnimation.getShineValue())) - ((this.f34019hv * 2) + iIntValue);
                float f10 = shineValue;
                int i12 = this.f34019hv;
                this.hww.setShader(new LinearGradient(f10, 0.0f, ((iIntValue + i12) / 2) + shineValue, i12 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.hww.setStrokeWidth(this.vy * 2);
                Path path = this.f34020sd;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i13 = shineValue + iIntValue;
                int i14 = this.f34019hv;
                canvas.drawLine(f10, 0.0f, i13 + i14, i14, this.hww);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.f34021tq.reset();
                this.f34021tq.moveTo(0.0f, 0.0f);
                this.f34021tq.lineTo(this.vy * 2, 0.0f);
                this.f34021tq.lineTo(this.vy * 2, this.f34019hv * 2);
                this.f34021tq.lineTo(0.0f, this.f34019hv * 2);
                this.f34021tq.lineTo(0.0f, 0.0f);
                this.hww.setShader(new LinearGradient(0.0f, 0.0f, this.vy * 2, this.f34019hv * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.hww.setColor(a.f120313c);
                this.hww.setStyle(Paint.Style.STROKE);
                this.hww.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.f34021tq, this.hww);
            }
        }
    }

    public void hww(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = this.f34018hu;
        int i11 = (int) (i10 * f10);
        layoutParams.width = i11;
        view.setTranslationX((i10 - i11) / 2);
        if (view instanceof vhb) {
            int i12 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i12 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i12).setTranslationX((-(this.f34018hu - layoutParams.width)) / 2);
                i12++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void hww(View view, int i10, int i11) {
        String str;
        this.vy = i10 / 2;
        this.f34019hv = i11 / 2;
        if (this.f34018hu == 0 && view.getLayoutParams().width > 0) {
            this.f34018hu = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f34020sd.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.vy * 2);
            view.setPivotY(this.f34019hv);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f34019hv);
        } else {
            view.setPivotX(this.vy);
            view.setPivotY(this.f34019hv);
        }
    }
}
