package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC5016ea {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97272a;

    EnumC5016ea(int i10) {
        this.f97272a = i10;
    }

    public static EnumC5016ea a(Integer num) {
        if (num != null) {
            for (EnumC5016ea enumC5016ea : values()) {
                if (enumC5016ea.f97272a == num.intValue()) {
                    return enumC5016ea;
                }
            }
        }
        return UNKNOWN;
    }
}
