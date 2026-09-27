package com.bytedance.adsdk.ugeno.rs.hv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.vgm.ok;
import com.bytedance.adsdk.ugeno.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private LinearLayout f32608hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private LinearLayout f32609hv;
    private float hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private vy f32610ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private double f32611sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f32612tq;
    private Context vgm;
    private float vy;

    public hww(Context context) {
        super(context);
        this.vgm = context;
        this.f32609hv = new LinearLayout(context);
        this.f32608hu = new LinearLayout(context);
        this.f32609hv.setOrientation(0);
        this.f32609hv.setGravity(8388611);
        this.f32608hu.setOrientation(0);
        this.f32608hu.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.hww, (int) this.f32612tq);
        float f10 = this.vy;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void hww(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.f32609hv.removeAllViews();
        this.f32608hu.removeAllViews();
        this.hww = (int) ok.hww(this.vgm, f10);
        this.f32612tq = (int) ok.hww(this.vgm, f10);
        this.f32611sd = d10;
        this.vy = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.vgm.vy.tq(this.vgm, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f32608hu.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.vgm.vy.tq(this.vgm, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.f32609hv.addView(starImageView2);
        }
        addView(this.f32609hv);
        addView(this.f32608hu);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.f32610ok;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.f32610ok;
        if (vyVar != null) {
            vyVar.ok();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f32610ok;
        if (vyVar != null) {
            vyVar.hww(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        vy vyVar = this.f32610ok;
        if (vyVar != null) {
            vyVar.hww(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.f32609hv.measure(i10, i11);
        double dFloor = Math.floor(this.f32611sd);
        float f10 = this.vy;
        float f11 = this.hww;
        this.f32608hu.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f10 + f10 + f11)) * dFloor) + ((double) f10) + ((this.f32611sd - dFloor) * ((double) f11))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32609hv.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vy vyVar = this.f32610ok;
        if (vyVar != null) {
            vyVar.tq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void hww(vy vyVar) {
        this.f32610ok = vyVar;
    }
}
