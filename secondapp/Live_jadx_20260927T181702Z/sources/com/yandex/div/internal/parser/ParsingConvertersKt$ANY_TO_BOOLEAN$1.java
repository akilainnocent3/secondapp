package com.yandex.div.internal.parser;

import com.yandex.div.internal.util.ConvertUtilsKt;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$ANY_TO_BOOLEAN$1 extends o0 implements ds.l<Object, Boolean> {
    public static final ParsingConvertersKt$ANY_TO_BOOLEAN$1 INSTANCE = new ParsingConvertersKt$ANY_TO_BOOLEAN$1();

    public ParsingConvertersKt$ANY_TO_BOOLEAN$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.l
    @oy.m
    public final Boolean invoke(@oy.l Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return ConvertUtilsKt.toBoolean((Number) obj);
        }
        throw new ClassCastException("Received value of wrong type");
    }
}
