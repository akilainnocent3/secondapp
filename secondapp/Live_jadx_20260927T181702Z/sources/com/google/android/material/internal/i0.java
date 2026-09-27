package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class i0 extends l0 implements k0 {
    public i0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static i0 f(ViewGroup viewGroup) {
        return (i0) l0.e(viewGroup);
    }

    @Override // com.google.android.material.internal.k0
    public void c(@NonNull View view) {
        this.f51090a.b(view);
    }

    @Override // com.google.android.material.internal.k0
    public void d(@NonNull View view) {
        this.f51090a.h(view);
    }
}
