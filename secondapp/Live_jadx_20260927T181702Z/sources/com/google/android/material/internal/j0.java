package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(18)
public class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f51084a;

    public j0(@NonNull ViewGroup viewGroup) {
        this.f51084a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f51084a.remove(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f51084a.add(drawable);
    }

    @Override // com.google.android.material.internal.k0
    public void c(@NonNull View view) {
        this.f51084a.add(view);
    }

    @Override // com.google.android.material.internal.k0
    public void d(@NonNull View view) {
        this.f51084a.remove(view);
    }
}
