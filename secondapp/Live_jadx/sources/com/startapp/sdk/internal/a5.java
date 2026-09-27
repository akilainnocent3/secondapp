package com.startapp.sdk.internal;

import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a5 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f74516a;

    public a5(Context context) {
        this.f74516a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(PreferenceManager.getDefaultSharedPreferences(this.f74516a));
    }
}
