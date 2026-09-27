package io.appmetrica.analytics.coreapi.internal.identifiers;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95236a;

    AppSetIdScope(String str) {
        this.f95236a = str;
    }

    @l
    public final String getValue() {
        return this.f95236a;
    }
}
