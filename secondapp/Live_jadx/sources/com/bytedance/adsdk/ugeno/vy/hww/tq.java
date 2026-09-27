package com.bytedance.adsdk.ugeno.vy.hww;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements sd {
    private List<vy> hww = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.vy.hww.sd
    public void hww(vy vyVar) {
        this.hww.add(vyVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.hww.sd
    public void hww(String str) {
        if (this.hww.isEmpty()) {
            return;
        }
        Iterator<vy> it = this.hww.iterator();
        while (it.hasNext()) {
            it.next().hww(str);
        }
    }
}
