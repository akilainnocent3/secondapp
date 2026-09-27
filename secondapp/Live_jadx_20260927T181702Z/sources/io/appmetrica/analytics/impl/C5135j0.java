package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5135j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gc f97598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f97599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f97600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5382sl f97601d;

    public C5135j0(String str, long j10, C5382sl c5382sl) {
        this.f97599b = j10;
        try {
            this.f97598a = new Gc(str);
        } catch (Throwable unused) {
            this.f97598a = new Gc();
        }
        this.f97601d = c5382sl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f97601d.b(this.f97598a, (String) pair.first, (String) pair.second)) {
            this.f97600c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f97598a.size() + ". Is changed " + this.f97600c + ". Current revision " + this.f97599b;
    }

    public final synchronized C5110i0 a() {
        try {
            if (this.f97600c) {
                this.f97599b++;
                this.f97600c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C5110i0(AbstractC5095hb.b(this.f97598a), this.f97599b);
    }
}
