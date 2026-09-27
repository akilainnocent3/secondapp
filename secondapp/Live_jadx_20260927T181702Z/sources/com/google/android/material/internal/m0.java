package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(18)
public class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f51097a;

    public m0(@NonNull View view) {
        this.f51097a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f51097a.remove(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f51097a.add(drawable);
    }
}
