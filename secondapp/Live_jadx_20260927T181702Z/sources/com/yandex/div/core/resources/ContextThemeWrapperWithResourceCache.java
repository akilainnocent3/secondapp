package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import dr.i0;
import dr.k0;
import k.c1;
import oy.l;
import r.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ContextThemeWrapperWithResourceCache extends d {

    @l
    private final i0 resourceCache$delegate;

    public ContextThemeWrapperWithResourceCache(@l Context context, @c1 int i10) {
        super(context, i10);
        this.resourceCache$delegate = k0.b(new ContextThemeWrapperWithResourceCache$resourceCache$2(this));
    }

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache$delegate.getValue();
    }

    @Override // r.d, android.content.ContextWrapper, android.content.Context
    @l
    public Resources getResources() {
        return getResourceCache();
    }
}
