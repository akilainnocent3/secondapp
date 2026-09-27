package com.bytedance.sdk.component.ok;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm<V> extends FutureTask<V> implements Comparable<vgm<V>> {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34953tq;

    public vgm(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.hww = i10 == -1 ? 5 : i10;
        this.f34953tq = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(vgm vgmVar) {
        if (hww() < vgmVar.hww()) {
            return 1;
        }
        return hww() > vgmVar.hww() ? -1 : 0;
    }

    public int hww() {
        return this.hww;
    }
}
