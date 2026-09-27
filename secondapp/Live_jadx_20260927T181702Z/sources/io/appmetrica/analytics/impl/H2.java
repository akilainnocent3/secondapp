package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class H2 implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        C5082go[] c5082goArr = ((C5159jo) obj).f97674a;
        return (c5082goArr == null || c5082goArr.length == 0) ? new ro(this, false, "attributes list is empty") : new ro(this, true, "");
    }
}
