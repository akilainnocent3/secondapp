package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aed extends LinearLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.adsdk.tq.hu f34273hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private LinearLayout f34274hv;
    private TextView hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private TextView f34275sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.grv f34276tq;
    private com.bytedance.sdk.component.adexpress.dynamic.vy.nod vgm;
    private hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
    }

    public aed(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.vy.nod nodVar) {
        super(context);
        this.vgm = nodVar;
        hww(context, view);
    }

    public TextView getTopTextView() {
        return this.hww;
    }

    public LinearLayout getWriggleLayout() {
        return this.f34274hv;
    }

    public View getWriggleProgressIv() {
        return this.f34273hu;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f34276tq == null) {
                this.f34276tq = new com.bytedance.sdk.component.utils.grv(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.hu.aed.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.vy.nod nodVar = this.vgm;
            if (nodVar != null) {
                nodVar.sd();
                this.vgm.hv();
                this.vgm.hu();
                this.vgm.ok();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.tq.hu huVar = this.f34273hu;
            if (huVar != null) {
                huVar.hv();
            }
        } catch (Exception unused) {
        }
    }

    public void setOnShakeViewListener(hww hwwVar) {
        this.vy = hwwVar;
    }

    public void setShakeText(String str) {
        this.f34275sd.setText(str);
    }

    private void hww(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.f34274hv = (LinearLayout) findViewById(2097610722);
        this.hww = (TextView) findViewById(2097610719);
        this.f34275sd = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.tq.hu huVar = (com.bytedance.adsdk.tq.hu) findViewById(2097610706);
        this.f34273hu = huVar;
        huVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f34273hu.setImageAssetsFolder("images/");
        this.f34273hu.hww(true);
    }

    public void hww() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.aed.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    aed.this.f34273hu.hww();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
