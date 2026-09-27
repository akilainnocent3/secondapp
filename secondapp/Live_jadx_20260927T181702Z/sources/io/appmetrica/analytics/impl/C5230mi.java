package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5230mi implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f97916a;

    public C5230mi(@NonNull Map<String, ?> map) {
        this.f97916a = map;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        return this.f97916a.containsKey(str) ? new ro(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new ro(this, true, "");
    }
}
