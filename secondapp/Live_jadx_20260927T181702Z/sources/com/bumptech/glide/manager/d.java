package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.a f31482c;

    public d(@NonNull Context context, @NonNull b.a aVar) {
        this.f31481b = context.getApplicationContext();
        this.f31482c = aVar;
    }

    public final void a() {
        r.a(this.f31481b).d(this.f31482c);
    }

    public final void b() {
        r.a(this.f31481b).f(this.f31482c);
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        a();
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        b();
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }
}
