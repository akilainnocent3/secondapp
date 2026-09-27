package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements syb {
    List<vy> hww = new ArrayList();

    public tq(View view, List<com.bytedance.sdk.component.adexpress.dynamic.vy.hww> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.hww> it = list.iterator();
        while (it.hasNext()) {
            vy vyVarHww = sd.hww().hww(view, it.next());
            if (vyVarHww != null) {
                this.hww.add(vyVarHww);
            }
        }
    }

    public void hww() {
        Iterator<vy> it = this.hww.iterator();
        while (it.hasNext()) {
            try {
                it.next().sd();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syb
    public void tq() {
        Iterator<vy> it = this.hww.iterator();
        while (it.hasNext()) {
            try {
                it.next().tq();
            } catch (Exception unused) {
            }
        }
    }
}
