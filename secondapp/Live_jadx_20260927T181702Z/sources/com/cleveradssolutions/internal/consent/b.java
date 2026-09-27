package com.cleveradssolutions.internal.consent;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f43263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm f43265d;

    public b(zm zmVar, View view, int i10) {
        this.f43265d = zmVar;
        this.f43263b = view;
        this.f43264c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43265d.w(this.f43263b, this.f43264c, false);
    }
}
