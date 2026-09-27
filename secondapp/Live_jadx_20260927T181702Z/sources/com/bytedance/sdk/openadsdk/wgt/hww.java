package com.bytedance.sdk.openadsdk.wgt;

import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.openadsdk.core.grv;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static void hww() {
        if (syb.hu()) {
            syb.hww(new ok("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.wgt.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    hww.sd();
                }
            });
        } else {
            sd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sd() {
        grv.hww();
    }
}
