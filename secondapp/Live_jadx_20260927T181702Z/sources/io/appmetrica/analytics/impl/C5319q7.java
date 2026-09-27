package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5319q7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5226me f98181a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5319q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5294p7 fromModel(@oy.l C5368s7 c5368s7) {
        C5294p7 c5294p7 = new C5294p7();
        Long l10 = c5368s7.f98288a;
        if (l10 != null) {
            c5294p7.f98123a = l10.longValue();
        }
        Long l11 = c5368s7.f98289b;
        if (l11 != null) {
            c5294p7.f98124b = l11.longValue();
        }
        Boolean bool = c5368s7.f98290c;
        if (bool != null) {
            c5294p7.f98125c = this.f98181a.fromModel(bool).intValue();
        }
        return c5294p7;
    }

    public C5319q7(@oy.l C5226me c5226me) {
        this.f98181a = c5226me;
    }

    public /* synthetic */ C5319q7(C5226me c5226me, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new C5226me() : c5226me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5368s7 toModel(@oy.l C5294p7 c5294p7) {
        C5294p7 c5294p8 = new C5294p7();
        long j10 = c5294p7.f98123a;
        Long lValueOf = Long.valueOf(j10);
        if (j10 == c5294p8.f98123a) {
            lValueOf = null;
        }
        long j11 = c5294p7.f98124b;
        return new C5368s7(lValueOf, j11 != c5294p8.f98124b ? Long.valueOf(j11) : null, this.f98181a.a(c5294p7.f98125c));
    }
}
