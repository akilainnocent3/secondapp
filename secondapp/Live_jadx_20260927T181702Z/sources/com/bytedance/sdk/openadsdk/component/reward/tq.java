package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.jpb;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.syb;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends com.bytedance.sdk.component.ok.ok {
    private final List<? extends com.bytedance.sdk.component.ok.ok> hww;

    public tq(String str, List<? extends com.bytedance.sdk.component.ok.ok> list) {
        super(str);
        this.hww = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.ok.ok> list;
        if (jpb.sd(bs.hww()) != 0 && (list = this.hww) != null) {
            Iterator<? extends com.bytedance.sdk.component.ok.ok> it = list.iterator();
            while (it.hasNext()) {
                syb.hww(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.rs.hww().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
