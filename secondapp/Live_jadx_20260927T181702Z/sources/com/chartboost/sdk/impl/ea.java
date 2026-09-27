package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38775d;

    public ea(int i10, int i11, int i12, int i13) {
        this.f38772a = i10;
        this.f38773b = i11;
        this.f38774c = i12;
        this.f38775d = i13;
    }

    public final int a() {
        return this.f38774c;
    }

    public final int b() {
        return this.f38775d;
    }

    public final int c() {
        return this.f38773b;
    }

    public final int d() {
        return this.f38772a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return this.f38772a == eaVar.f38772a && this.f38773b == eaVar.f38773b && this.f38774c == eaVar.f38774c && this.f38775d == eaVar.f38775d;
    }

    public int hashCode() {
        return (((((this.f38772a * 31) + this.f38773b) * 31) + this.f38774c) * 31) + this.f38775d;
    }

    public String toString() {
        return "ImpressionCounter(onVideoCompletedPlayCount=" + this.f38772a + ", onRewardedVideoCompletedPlayCount=" + this.f38773b + ", impressionNotifyDidCompleteAdPlayCount=" + this.f38774c + ", impressionSendVideoCompleteRequestPlayCount=" + this.f38775d + gi.j.f86771d;
    }

    public final void a(int i10) {
        this.f38774c = i10;
    }

    public final void b(int i10) {
        this.f38775d = i10;
    }

    public final void c(int i10) {
        this.f38773b = i10;
    }

    public final void d(int i10) {
        this.f38772a = i10;
    }

    public /* synthetic */ ea(int i10, int i11, int i12, int i13, int i14, kotlin.jvm.internal.x xVar) {
        this((i14 & 1) != 0 ? 1 : i10, (i14 & 2) != 0 ? 1 : i11, (i14 & 4) != 0 ? 1 : i12, (i14 & 8) != 0 ? 1 : i13);
    }
}
