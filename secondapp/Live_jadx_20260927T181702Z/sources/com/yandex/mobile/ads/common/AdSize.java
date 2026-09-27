package com.yandex.mobile.ads.common;

import gi.j;
import k.q;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76805b;

    public AdSize(int i10, int i11) {
        this.f76804a = i10;
        this.f76805b = i11;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.g(AdSize.class, obj.getClass())) {
            AdSize adSize = (AdSize) obj;
            if (this.f76804a == adSize.f76804a && this.f76805b == adSize.f76805b) {
                return true;
            }
        }
        return false;
    }

    @q(unit = 0)
    public final int getHeight() {
        return this.f76805b;
    }

    @q(unit = 0)
    public final int getWidth() {
        return this.f76804a;
    }

    public int hashCode() {
        return (this.f76804a * 31) + this.f76805b;
    }

    @l
    public String toString() {
        return "AdSize (width=" + this.f76804a + ", height=" + this.f76805b + j.f86771d;
    }
}
