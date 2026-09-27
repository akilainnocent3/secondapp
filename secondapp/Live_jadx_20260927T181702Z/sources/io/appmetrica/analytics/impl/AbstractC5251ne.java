package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5251ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97971a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97972b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97973c = 1;

    public final int a(@oy.m Boolean bool) {
        if (bool == null) {
            return this.f97971a;
        }
        if (kotlin.jvm.internal.m0.g(bool, Boolean.FALSE)) {
            return this.f97972b;
        }
        if (kotlin.jvm.internal.m0.g(bool, Boolean.TRUE)) {
            return this.f97973c;
        }
        throw new dr.o0();
    }

    @oy.m
    public final Boolean a(int i10) {
        if (i10 == this.f97972b) {
            return Boolean.FALSE;
        }
        if (i10 == this.f97973c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
