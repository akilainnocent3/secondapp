package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorGreenComponentGetter extends ColorComponentGetter {

    @l
    public static final ColorGreenComponentGetter INSTANCE = new ColorGreenComponentGetter();

    @l
    private static final String name = "getColorGreen";

    /* JADX INFO: renamed from: com.yandex.div.evaluable.function.ColorGreenComponentGetter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.l<Color, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ Integer invoke(Color color) {
            return m3303invokecIhhviA(color.m3349unboximpl());
        }

        @l
        /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
        public final Integer m3303invokecIhhviA(int i10) {
            return Integer.valueOf(Color.m3345greenimpl(i10));
        }
    }

    private ColorGreenComponentGetter() {
        super(AnonymousClass1.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }
}
