package com.yandex.div.internal.parser;

import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$NUMBER_TO_DOUBLE$1 extends o0 implements ds.l<Number, Double> {
    public static final ParsingConvertersKt$NUMBER_TO_DOUBLE$1 INSTANCE = new ParsingConvertersKt$NUMBER_TO_DOUBLE$1();

    public ParsingConvertersKt$NUMBER_TO_DOUBLE$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final Double invoke(@oy.l Number number) {
        return Double.valueOf(number.doubleValue());
    }
}
