package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5463w2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 fromModel(@NonNull C5513y2 c5513y2) {
        W1 w10 = new W1();
        EnumC5488x2 enumC5488x2 = c5513y2.f98638a;
        if (enumC5488x2 != null) {
            int iOrdinal = enumC5488x2.ordinal();
            if (iOrdinal == 0) {
                w10.f96649a = 6;
            } else if (iOrdinal == 1) {
                w10.f96649a = 1;
            } else if (iOrdinal == 2) {
                w10.f96649a = 2;
            } else if (iOrdinal == 3) {
                w10.f96649a = 3;
            } else if (iOrdinal == 4) {
                w10.f96649a = 4;
            } else if (iOrdinal != 5) {
                w10.f96649a = 0;
            } else {
                w10.f96649a = 5;
            }
        }
        Boolean bool = c5513y2.f98639b;
        if (bool != null) {
            if (bool.booleanValue()) {
                w10.f96650b = 1;
                return w10;
            }
            w10.f96650b = 0;
        }
        return w10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5513y2 toModel(@NonNull W1 w10) {
        EnumC5488x2 enumC5488x2;
        Boolean bool = null;
        switch (w10.f96649a) {
            case 1:
                enumC5488x2 = EnumC5488x2.ACTIVE;
                break;
            case 2:
                enumC5488x2 = EnumC5488x2.WORKING_SET;
                break;
            case 3:
                enumC5488x2 = EnumC5488x2.FREQUENT;
                break;
            case 4:
                enumC5488x2 = EnumC5488x2.RARE;
                break;
            case 5:
                enumC5488x2 = EnumC5488x2.RESTRICTED;
                break;
            case 6:
                enumC5488x2 = EnumC5488x2.EXEMPTED;
                break;
            default:
                enumC5488x2 = null;
                break;
        }
        int i10 = w10.f96650b;
        if (i10 == 0) {
            bool = Boolean.FALSE;
        } else if (i10 == 1) {
            bool = Boolean.TRUE;
        }
        return new C5513y2(enumC5488x2, bool);
    }
}
