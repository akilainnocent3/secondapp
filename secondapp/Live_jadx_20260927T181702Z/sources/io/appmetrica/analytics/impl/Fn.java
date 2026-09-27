package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ValidationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Fn implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f95836a;

    public Fn(@NonNull to toVar) {
        this.f95836a = toVar;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        ro roVarA = this.f95836a.a(obj);
        if (roVarA.f98247a) {
            return roVarA;
        }
        throw new ValidationException(roVarA.f98248b);
    }

    @NonNull
    @k.h1
    public final to a() {
        return this.f95836a;
    }
}
