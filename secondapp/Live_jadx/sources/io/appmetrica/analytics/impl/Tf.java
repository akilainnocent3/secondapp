package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Tf implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new ro(this, true, "");
        }
        return new ro(this, false, "Invalid quantity value " + num);
    }
}
