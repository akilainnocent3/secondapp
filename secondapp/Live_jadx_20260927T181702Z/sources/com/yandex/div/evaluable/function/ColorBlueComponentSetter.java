package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import ds.p;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorBlueComponentSetter extends ColorComponentSetter {

    @l
    public static final ColorBlueComponentSetter INSTANCE = new ColorBlueComponentSetter();

    @l
    private static final String name = "setColorBlue";

    /* JADX INFO: renamed from: com.yandex.div.evaluable.function.ColorBlueComponentSetter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements p<Color, Double, Color> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // ds.p
        public /* bridge */ /* synthetic */ Color invoke(Color color, Double d10) {
            return Color.m3341boximpl(m3302invokeGnj5c28(color.m3349unboximpl(), d10.doubleValue()));
        }

        /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
        public final int m3302invokeGnj5c28(int i10, double d10) {
            return Color.Companion.m3350argbH0kstlE(Color.m3339alphaimpl(i10), Color.m3347redimpl(i10), Color.m3345greenimpl(i10), ColorFunctionsKt.toColorIntComponentValue(d10));
        }
    }

    private ColorBlueComponentSetter() {
        super(AnonymousClass1.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }
}
