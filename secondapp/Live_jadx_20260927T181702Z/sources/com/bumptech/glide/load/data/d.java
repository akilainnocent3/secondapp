package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface d<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        void d(@Nullable T t10);

        void e(@NonNull Exception exc);
    }

    @NonNull
    Class<T> a();

    @NonNull
    tb.a b();

    void c(@NonNull com.bumptech.glide.i iVar, @NonNull a<? super T> aVar);

    void cancel();

    void cleanup();
}
