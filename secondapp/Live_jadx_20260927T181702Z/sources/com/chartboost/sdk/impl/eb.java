package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38776a;

    public eb(int i10) {
        this.f38776a = i10;
    }

    public final int a() {
        return this.f38776a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb) && this.f38776a == ((eb) obj).f38776a;
    }

    public int hashCode() {
        return this.f38776a;
    }

    public String toString() {
        return "InterruptionConfig(audioFocusType=" + this.f38776a + gi.j.f86771d;
    }

    public /* synthetic */ eb(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 3 : i10);
    }
}
