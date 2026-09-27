package com.yandex.div.core.animation;

import android.util.Property;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class IntegerProperty<T> extends Property<T, Integer> {
    public IntegerProperty(@l String str) {
        super(Integer.TYPE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
        set(obj, num.intValue());
    }

    public abstract void setValue(T t10, int i10);

    public void set(T t10, int i10) {
        setValue(t10, i10);
    }
}
