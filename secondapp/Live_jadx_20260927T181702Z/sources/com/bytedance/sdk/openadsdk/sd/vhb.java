package com.bytedance.sdk.openadsdk.sd;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb extends View {
    private final int hww;

    public vhb(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.hww);
    }

    public vhb(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.hww = wdz.tq(getContext(), 0.66f);
    }
}
