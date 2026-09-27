package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public interface o<T extends o<T>> extends Checkable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<C> {
        void a(C c10, boolean z10);
    }

    @k.c0
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable a<T> aVar);
}
