package com.yandex.div.core.animation;

import android.util.Property;
import com.yandex.div.evaluable.types.Color;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ColorProperty<T> extends Property<T, Color> {
    public ColorProperty(@l String str) {
        super(Color.class, str);
    }
}
