package com.yandex.div.internal.parser;

import com.yandex.div.evaluable.types.Color;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$COLOR_INT_TO_STRING$1 extends o0 implements ds.l<Integer, String> {
    public static final ParsingConvertersKt$COLOR_INT_TO_STRING$1 INSTANCE = new ParsingConvertersKt$COLOR_INT_TO_STRING$1();

    public ParsingConvertersKt$COLOR_INT_TO_STRING$1() {
        super(1);
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    @oy.l
    public final String invoke(int i10) {
        return Color.m3348toStringimpl(Color.m3342constructorimpl(i10));
    }
}
