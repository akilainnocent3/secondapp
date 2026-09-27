package com.bytedance.sdk.openadsdk.core.vhb.tq.hv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends com.bytedance.adsdk.ugeno.rs.tq.hww {
    private final com.bytedance.adsdk.ugeno.rs.tq.hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.rs.tq.hww f36933tq;

    public hww(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.rs.tq.hww hwwVar = new com.bytedance.adsdk.ugeno.rs.tq.hww(context);
        this.hww = hwwVar;
        addView(hwwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.rs.tq.hww hwwVar2 = new com.bytedance.adsdk.ugeno.rs.tq.hww(context);
        this.f36933tq = hwwVar2;
        hwwVar2.setBackgroundColor(0);
        addView(hwwVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.rs.tq.hww getMarkView() {
        return this.f36933tq;
    }

    public com.bytedance.adsdk.ugeno.rs.tq.hww getVideoView() {
        return this.hww;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f36933tq.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f36933tq.setOnTouchListener(onTouchListener);
    }
}
