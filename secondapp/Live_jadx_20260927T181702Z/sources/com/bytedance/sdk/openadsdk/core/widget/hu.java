package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends com.bytedance.sdk.openadsdk.core.hu.vy {
    private float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37050tq;

    public hu(Context context) {
        super(context);
        this.hww = 2.25f;
        this.f37050tq = 12;
        hww();
    }

    private void hww() {
        setBackground(vy.hww());
        setImageResource(kub.vy(getContext(), "tt_close_btn"));
        int iTq = wdz.tq(getContext(), this.hww);
        setPadding(iTq, iTq, iTq, iTq);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static com.bytedance.sdk.openadsdk.core.hu.vy tq(Context context) {
        return new hu(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu.vy, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iTq = wdz.tq(getContext(), this.f37050tq);
            layoutParams.width = iTq;
            layoutParams.height = iTq;
        }
        super.setLayoutParams(layoutParams);
    }

    public hu(Context context, int i10, float f10) {
        super(context);
        this.hww = f10;
        this.f37050tq = i10;
        hww();
    }

    public static com.bytedance.sdk.openadsdk.core.hu.vy hww(Context context) {
        return new hu(context);
    }
}
