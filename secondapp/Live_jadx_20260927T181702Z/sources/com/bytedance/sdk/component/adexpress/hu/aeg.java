package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aeg extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private Drawable f34278hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Drawable f34279hv;
    LinearLayout hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f34280ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34281sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    LinearLayout f34282tq;
    private double vgm;
    private float vy;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static final int f34277rs = (com.bytedance.sdk.component.adexpress.dynamic.hv.vhb.tq("", 0.0f, true)[1] / 2) + 1;
    private static final int nod = (com.bytedance.sdk.component.adexpress.dynamic.hv.vhb.tq("", 0.0f, true)[1] / 2) + 3;

    public aeg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hww = new LinearLayout(getContext());
        this.f34282tq = new LinearLayout(getContext());
        this.hww.setOrientation(0);
        this.hww.setGravity(8388611);
        this.f34282tq.setOrientation(0);
        this.f34282tq.setGravity(8388611);
        this.f34279hv = com.bytedance.sdk.component.utils.kub.sd(context, "tt_star_thick");
        this.f34278hu = com.bytedance.sdk.component.utils.kub.sd(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f34281sd, (int) this.vy));
        imageView.setPadding(1, f34277rs, 1, nod);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.f34279hv;
    }

    public Drawable getStarFillDrawable() {
        return this.f34278hu;
    }

    public void hww(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.f34281sd = (int) com.bytedance.sdk.component.adexpress.vy.vgm.sd(getContext(), f10);
        this.vy = (int) com.bytedance.sdk.component.adexpress.vy.vgm.sd(getContext(), f10);
        this.vgm = d10;
        this.f34280ok = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f34282tq.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.hww.addView(starImageView2);
        }
        addView(this.hww);
        addView(this.f34282tq);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.hww.measure(i10, i11);
        double d10 = this.vgm;
        float f10 = this.f34281sd;
        this.f34282tq.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d10) * f10) + 1.0f)) + (((double) (f10 - 2.0f)) * (d10 - ((double) ((int) d10))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.hww.getMeasuredHeight(), 1073741824));
        if (this.f34280ok > 0.0f) {
            LinearLayout linearLayout = this.hww;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.f34280ok)) / 2, 0, 0);
            this.f34282tq.setPadding(0, ((int) (this.hww.getMeasuredHeight() - this.f34280ok)) / 2, 0, 0);
        }
    }
}
