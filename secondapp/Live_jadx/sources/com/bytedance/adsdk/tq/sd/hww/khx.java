package com.bytedance.adsdk.tq.sd.hww;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
abstract class khx<V, O> implements ed<V, O> {
    final List<com.bytedance.adsdk.tq.vgm.hww<V>> hww;

    public khx(List<com.bytedance.adsdk.tq.vgm.hww<V>> list) {
        this.hww = list;
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public List<com.bytedance.adsdk.tq.vgm.hww<V>> sd() {
        return this.hww;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.hww.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.hww.toArray()));
        }
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public boolean tq() {
        return this.hww.isEmpty() || (this.hww.size() == 1 && this.hww.get(0).hv());
    }
}
