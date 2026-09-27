package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5468w7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C5092h8 c5092h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5092h8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC5518y7.f98666a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC5518y7.f98666a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC5518y7.f98667b) >= 0) {
                dr.z0 z0VarA = dr.v1.a(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
                C5493x7 c5493x7 = new C5493x7(((Number) z0VarA.j()).longValue(), ((Number) z0VarA.k()).intValue());
                C5092h8 c5092h8 = new C5092h8();
                c5092h8.f97492a = c5493x7.f98566a;
                c5092h8.f97493b = c5493x7.f98567b;
                return c5092h8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
    }
}
