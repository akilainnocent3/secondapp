package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final V f25051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f25052b;

    public h1(V v10) {
        this.f25051a = v10;
        this.f25052b = null;
    }

    @Nullable
    public Throwable a() {
        return this.f25052b;
    }

    @Nullable
    public V b() {
        return this.f25051a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (b() != null && b().equals(h1Var.b())) {
            return true;
        }
        if (a() == null || h1Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public h1(Throwable th2) {
        this.f25052b = th2;
        this.f25051a = null;
    }
}
