package io.appmetrica.analytics.impl;

import java.util.Collection;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5410u implements InterfaceC5460w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98385a = "yandex";

    @oy.m
    public final String a() {
        try {
            return new JSONArray((Collection) fr.r0.I4(fr.g0.l(this.f98385a), C4959c4.l().m().f96858d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
