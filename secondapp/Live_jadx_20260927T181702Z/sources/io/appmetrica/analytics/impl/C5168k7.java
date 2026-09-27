package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5168k7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5226me f97698a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5168k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5269o7 fromModel(@oy.l C5142j7 c5142j7) {
        C5269o7 c5269o7 = new C5269o7();
        Boolean bool = c5142j7.f97608a;
        if (bool != null) {
            c5269o7.f98012a = this.f97698a.fromModel(bool).intValue();
        }
        Double d10 = c5142j7.f97610c;
        if (d10 != null) {
            c5269o7.f98014c = d10.doubleValue();
        }
        Double d11 = c5142j7.f97609b;
        if (d11 != null) {
            c5269o7.f98013b = d11.doubleValue();
        }
        Long l10 = c5142j7.f97615h;
        if (l10 != null) {
            c5269o7.f98019h = l10.longValue();
        }
        Integer num = c5142j7.f97613f;
        if (num != null) {
            c5269o7.f98017f = num.intValue();
        }
        Integer num2 = c5142j7.f97612e;
        if (num2 != null) {
            c5269o7.f98016e = num2.intValue();
        }
        Integer num3 = c5142j7.f97614g;
        if (num3 != null) {
            c5269o7.f98018g = num3.intValue();
        }
        Integer num4 = c5142j7.f97611d;
        if (num4 != null) {
            c5269o7.f98015d = num4.intValue();
        }
        String str = c5142j7.f97616i;
        if (str != null) {
            c5269o7.f98020i = str;
        }
        String str2 = c5142j7.f97617j;
        if (str2 != null) {
            c5269o7.f98021j = str2;
        }
        return c5269o7;
    }

    public C5168k7(@oy.l C5226me c5226me) {
        this.f97698a = c5226me;
    }

    public /* synthetic */ C5168k7(C5226me c5226me, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new C5226me() : c5226me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5142j7 toModel(@oy.m C5269o7 c5269o7) {
        if (c5269o7 == null) {
            return new C5142j7(null, null, null, null, null, null, null, null, null, null);
        }
        C5269o7 c5269o8 = new C5269o7();
        Boolean boolA = this.f97698a.a(c5269o7.f98012a);
        double d10 = c5269o7.f98014c;
        Double dValueOf = Double.valueOf(d10);
        if (d10 == c5269o8.f98014c) {
            dValueOf = null;
        }
        double d11 = c5269o7.f98013b;
        Double dValueOf2 = !(d11 == c5269o8.f98013b) ? Double.valueOf(d11) : null;
        long j10 = c5269o7.f98019h;
        Long lValueOf = j10 != c5269o8.f98019h ? Long.valueOf(j10) : null;
        int i10 = c5269o7.f98017f;
        Integer numValueOf = i10 != c5269o8.f98017f ? Integer.valueOf(i10) : null;
        int i11 = c5269o7.f98016e;
        Integer numValueOf2 = i11 != c5269o8.f98016e ? Integer.valueOf(i11) : null;
        int i12 = c5269o7.f98018g;
        Integer numValueOf3 = i12 != c5269o8.f98018g ? Integer.valueOf(i12) : null;
        int i13 = c5269o7.f98015d;
        Integer numValueOf4 = i13 != c5269o8.f98015d ? Integer.valueOf(i13) : null;
        String str = c5269o7.f98020i;
        String str2 = !kotlin.jvm.internal.m0.g(str, c5269o8.f98020i) ? str : null;
        String str3 = c5269o7.f98021j;
        return new C5142j7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !kotlin.jvm.internal.m0.g(str3, c5269o8.f98021j) ? str3 : null);
    }
}
