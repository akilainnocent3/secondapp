package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SvgCacheManager {

    @l
    private final WeakHashMap<String, PictureDrawable> cache = new WeakHashMap<>();

    @m
    public final PictureDrawable get(@l String str) {
        return this.cache.get(str);
    }

    public final void set(@l String str, @l PictureDrawable pictureDrawable) {
        this.cache.put(str, pictureDrawable);
    }
}
