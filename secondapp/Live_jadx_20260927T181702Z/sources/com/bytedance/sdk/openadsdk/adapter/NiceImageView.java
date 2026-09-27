package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.hu.vy;
import com.bytedance.sdk.openadsdk.utils.wdz;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class NiceImageView extends vy {
    private Path aeg;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private float f35459bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f35460ed;
    private final RectF hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f35461hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f35462hv;
    private final Context hww;
    private final float[] jpb;
    private final Xfermode khx;
    private final Path kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private final Paint f35463kv;
    private final float[] mrs;
    private int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f35464ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f35465ok;
    private RectF omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f35466rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f35467sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private boolean f35468tq;
    private int vgm;
    private int vhb;
    private int vy;
    private int weu;
    private int wgt;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void hww(Canvas canvas) {
        if (!this.f35468tq) {
            int i10 = this.vy;
            if (i10 > 0) {
                hww(canvas, i10, this.f35462hv, this.hnv, this.jpb);
                return;
            }
            return;
        }
        int i11 = this.vy;
        if (i11 > 0) {
            hww(canvas, i11, this.f35462hv, this.f35459bs - (i11 / 2.0f));
        }
        int i12 = this.f35461hu;
        if (i12 > 0) {
            hww(canvas, i12, this.vgm, (this.f35459bs - this.vy) - (i12 / 2.0f));
        }
    }

    private void sd() {
        if (this.f35468tq) {
            return;
        }
        int i10 = 0;
        if (this.f35465ok <= 0) {
            float[] fArr = this.jpb;
            int i11 = this.f35466rs;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.nod;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.f35464ny;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.vhb;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.mrs;
            int i15 = this.vy;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.jpb;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.f35465ok;
            fArr3[i10] = i16;
            this.mrs[i10] = i16 - (this.vy / 2.0f);
            i10++;
        }
    }

    private void tq() {
        if (!this.f35468tq) {
            this.omn.set(0.0f, 0.0f, this.weu, this.wgt);
            if (this.f35467sd) {
                this.omn = this.hnv;
                return;
            }
            return;
        }
        float fMin = Math.min(this.weu, this.wgt) / 2.0f;
        this.f35459bs = fMin;
        RectF rectF = this.omn;
        int i10 = this.weu;
        int i11 = this.wgt;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    private void vy() {
        if (this.f35468tq) {
            return;
        }
        this.f35461hu = 0;
    }

    public void isCircle(boolean z10) {
        this.f35468tq = z10;
        vy();
        tq();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.f35467sd = z10;
        tq();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.omn, null, 31);
        if (!this.f35467sd) {
            int i10 = this.weu;
            int i11 = this.vy;
            int i12 = this.f35461hu;
            int i13 = this.wgt;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.f35463kv.reset();
        this.kub.reset();
        if (this.f35468tq) {
            this.kub.addCircle(this.weu / 2.0f, this.wgt / 2.0f, this.f35459bs, Path.Direction.CCW);
        } else {
            this.kub.addRoundRect(this.omn, this.mrs, Path.Direction.CCW);
        }
        this.f35463kv.setAntiAlias(true);
        this.f35463kv.setStyle(Paint.Style.FILL);
        this.f35463kv.setXfermode(this.khx);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.kub, this.f35463kv);
        } else {
            this.aeg.addRect(this.omn, Path.Direction.CCW);
            this.aeg.op(this.kub, Path.Op.DIFFERENCE);
            canvas.drawPath(this.aeg, this.f35463kv);
        }
        this.f35463kv.setXfermode(null);
        int i14 = this.f35460ed;
        if (i14 != 0) {
            this.f35463kv.setColor(i14);
            canvas.drawPath(this.kub, this.f35463kv);
        }
        canvas.restore();
        hww(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.weu = i10;
        this.wgt = i11;
        hww();
        tq();
    }

    public void setBorderColor(@k int i10) {
        this.f35462hv = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.vy = wdz.tq(this.hww, i10);
        hww(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.vhb = wdz.tq(this.hww, i10);
        hww(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.f35464ny = wdz.tq(this.hww, i10);
        hww(true);
    }

    public void setCornerRadius(int i10) {
        this.f35465ok = wdz.tq(this.hww, i10);
        hww(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.f35466rs = wdz.tq(this.hww, i10);
        hww(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.nod = wdz.tq(this.hww, i10);
        hww(true);
    }

    public void setInnerBorderColor(@k int i10) {
        this.vgm = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.f35461hu = wdz.tq(this.hww, i10);
        vy();
        invalidate();
    }

    public void setMaskColor(@k int i10) {
        this.f35460ed = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35462hv = -1;
        this.vgm = -1;
        this.hww = context;
        this.f35465ok = wdz.tq(context, 10.0f);
        this.jpb = new float[8];
        this.mrs = new float[8];
        this.hnv = new RectF();
        this.omn = new RectF();
        this.f35463kv = new Paint();
        this.kub = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.khx = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.khx = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.aeg = new Path();
        }
        sd();
        vy();
    }

    private void hww(Canvas canvas, int i10, int i11, float f10) {
        hww(i10, i11);
        this.kub.addCircle(this.weu / 2.0f, this.wgt / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.kub, this.f35463kv);
    }

    private void hww(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        hww(i10, i11);
        this.kub.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.kub, this.f35463kv);
    }

    private void hww(int i10, int i11) {
        this.kub.reset();
        this.f35463kv.setStrokeWidth(i10);
        this.f35463kv.setColor(i11);
        this.f35463kv.setStyle(Paint.Style.STROKE);
    }

    private void hww() {
        if (this.f35468tq) {
            return;
        }
        RectF rectF = this.hnv;
        int i10 = this.vy;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.weu - (i10 / 2.0f), this.wgt - (i10 / 2.0f));
    }

    private void hww(boolean z10) {
        if (z10) {
            this.f35465ok = 0;
        }
        sd();
        hww();
        invalidate();
    }
}
