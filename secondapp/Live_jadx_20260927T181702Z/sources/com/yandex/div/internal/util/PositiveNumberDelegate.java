package com.yandex.div.internal.util;

import java.lang.Number;
import kotlin.jvm.internal.x;
import ns.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PositiveNumberDelegate<T extends Number> {

    @l
    private final T fallbackValue;

    @l
    private T value;

    public PositiveNumberDelegate(@l T t10, @l T t11) {
        this.value = t10;
        this.fallbackValue = t11;
    }

    @l
    public final T getValue(@m Object obj, @l o<?> oVar) {
        return this.value;
    }

    public final void setValue(@m Object obj, @l o<?> oVar, @l T t10) {
        if (t10.doubleValue() <= 0.0d) {
            t10 = this.fallbackValue;
        }
        this.value = t10;
    }

    public /* synthetic */ PositiveNumberDelegate(Number number, Number number2, int i10, x xVar) {
        this(number, (i10 & 2) != 0 ? 1 : number2);
    }
}
