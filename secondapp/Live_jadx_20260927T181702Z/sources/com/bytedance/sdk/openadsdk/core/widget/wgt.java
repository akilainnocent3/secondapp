package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class wgt extends View {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f37144hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Drawable f37145hv;
    private final Path hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37146sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f37147tq;
    private Drawable vy;

    public wgt(Context context) {
        this(context, false);
    }

    private void hww() {
        Context context = getContext();
        this.vy = kub.sd(context, this.f37147tq ? "tt_star_thick_dark" : "tt_star_thick");
        this.f37145hv = kub.sd(context, "tt_star");
    }

    private void tq() {
        int width = getWidth();
        int height = getHeight();
        if (this.f37144hu <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.hww.reset();
        this.hww.addRect(new RectF(0.0f, 0.0f, width * this.f37144hu, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37146sd <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.vy.draw(canvas);
            canvas.translate(this.f37146sd, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.hww);
        for (int i11 = 0; i11 < 5; i11++) {
            this.f37145hv.draw(canvas);
            canvas.translate(this.f37146sd, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37146sd * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f37146sd, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tq();
    }

    public wgt(Context context, boolean z10) {
        super(context);
        this.hww = new Path();
        this.f37147tq = z10;
        hww();
    }

    public void hww(double d10, int i10) {
        int iHww = (int) wdz.hww(getContext(), i10, false);
        this.f37146sd = iHww;
        this.vy.setBounds(0, 0, iHww, iHww);
        Drawable drawable = this.f37145hv;
        int i11 = this.f37146sd;
        drawable.setBounds(0, 0, i11, i11);
        this.f37144hu = ((float) d10) / 5.0f;
        tq();
        requestLayout();
    }
}
