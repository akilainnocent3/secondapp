package com.bytedance.sdk.component.adexpress.tq;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny implements nod.hww {
    weu hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private rs f34480sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    @NonNull
    private List<nod> f34481tq;
    private AtomicBoolean vy = new AtomicBoolean(false);

    public ny(List<nod> list, rs rsVar) {
        this.f34481tq = list;
        this.f34480sd = rsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public void hww() {
        this.f34480sd.vy();
        Iterator<nod> it = this.f34481tq.iterator();
        while (it.hasNext() && !it.next().hww(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public boolean sd() {
        return this.vy.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public boolean tq(nod nodVar) {
        int iIndexOf = this.f34481tq.indexOf(nodVar);
        return iIndexOf < this.f34481tq.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public weu tq() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public void hww(nod nodVar) {
        int iIndexOf = this.f34481tq.indexOf(nodVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f34481tq.size()) {
                return;
            }
        } while (!this.f34481tq.get(iIndexOf).hww(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public void hww(weu weuVar) {
        this.hww = weuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod.hww
    public void hww(boolean z10) {
        this.vy.getAndSet(z10);
    }
}
