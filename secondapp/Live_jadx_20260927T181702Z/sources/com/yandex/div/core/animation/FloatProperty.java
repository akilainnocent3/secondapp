package com.yandex.div.core.animation;

import android.util.Property;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class FloatProperty<T> extends Property<T, Float> {
    public FloatProperty(@l String str) {
        super(Float.TYPE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
        set(obj, f10.floatValue());
    }

    public abstract void setValue(T t10, float f10);

    public void set(T t10, float f10) {
        setValue(t10, f10);
    }
}
