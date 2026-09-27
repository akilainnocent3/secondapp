package com.bytedance.adsdk.tq;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class ny<V> {
    private final V hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Throwable f32117tq;

    public ny(V v10) {
        this.hww = v10;
        this.f32117tq = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        if (hww() != null && hww().equals(nyVar.hww())) {
            return true;
        }
        if (tq() == null || nyVar.tq() == null) {
            return false;
        }
        return tq().toString().equals(tq().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{hww(), tq()});
    }

    public V hww() {
        return this.hww;
    }

    public Throwable tq() {
        return this.f32117tq;
    }

    public ny(Throwable th2) {
        this.f32117tq = th2;
        this.hww = null;
    }
}
