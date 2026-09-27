package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f95734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95736c;

    public Di(Context context, String str, String str2) {
        this.f95734a = context;
        this.f95735b = str;
        this.f95736c = str2;
    }

    @Nullable
    public final Object a() {
        int identifier = this.f95734a.getResources().getIdentifier(this.f95735b, this.f95736c, this.f95734a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i10);
}
