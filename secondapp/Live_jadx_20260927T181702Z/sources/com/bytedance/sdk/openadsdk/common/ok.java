package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends Button {
    public ok(Context context) {
        super(context);
        hww();
    }

    private void hww() {
        setId(com.bytedance.sdk.openadsdk.utils.wgt.gsa);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, wdz.tq(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.vhb.hww(context, "tt_browser_download_selector"));
        setText(kub.hww(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
