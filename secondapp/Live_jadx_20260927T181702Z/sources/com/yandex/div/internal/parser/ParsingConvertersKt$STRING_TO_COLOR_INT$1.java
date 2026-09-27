package com.yandex.div.internal.parser;

import com.yandex.div.evaluable.types.Color;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParsingConvertersKt$STRING_TO_COLOR_INT$1 extends o0 implements ds.l<Object, Integer> {
    public static final ParsingConvertersKt$STRING_TO_COLOR_INT$1 INSTANCE = new ParsingConvertersKt$STRING_TO_COLOR_INT$1();

    public ParsingConvertersKt$STRING_TO_COLOR_INT$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.l
    @oy.m
    public final Integer invoke(@oy.m Object obj) {
        if (obj instanceof String) {
            return Integer.valueOf(Color.Companion.m3351parseC4zCDoM((String) obj));
        }
        if (obj instanceof Color) {
            return Integer.valueOf(((Color) obj).m3349unboximpl());
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException("Received value of wrong type");
    }
}
