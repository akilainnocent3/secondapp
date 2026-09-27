package jg;

import androidx.annotation.Nullable;
import java.util.Comparator;
import java.util.TreeSet;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @h1
    public static final int f100373e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100374f = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.a0("this")
    public final TreeSet<a> f100375a = new TreeSet<>(new Comparator() { // from class: jg.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i.c(((i.a) obj).f100379a.f100360g, ((i.a) obj2).f100379a.f100360g);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.a0("this")
    public int f100376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("this")
    public int f100377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("this")
    public boolean f100378d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f100379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100380b;

        public a(g gVar, long j10) {
            this.f100379a = gVar;
            this.f100380b = j10;
        }
    }

    public i() {
        f();
    }

    public static int c(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        if (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) {
            return i12;
        }
        return i10 < i11 ? iMin : -iMin;
    }

    public final synchronized void b(a aVar) {
        this.f100376b = aVar.f100379a.f100360g;
        this.f100375a.add(aVar);
    }

    public synchronized boolean d(g gVar, long j10) {
        if (this.f100375a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = gVar.f100360g;
        if (!this.f100378d) {
            f();
            this.f100377c = g.c(i10);
            this.f100378d = true;
            b(new a(gVar, j10));
            return true;
        }
        if (Math.abs(c(i10, g.b(this.f100376b))) < 1000) {
            if (c(i10, this.f100377c) <= 0) {
                return false;
            }
            b(new a(gVar, j10));
            return true;
        }
        this.f100377c = g.c(i10);
        this.f100375a.clear();
        b(new a(gVar, j10));
        return true;
    }

    @Nullable
    public synchronized g e(long j10) {
        if (this.f100375a.isEmpty()) {
            return null;
        }
        a aVarFirst = this.f100375a.first();
        int i10 = aVarFirst.f100379a.f100360g;
        if (i10 != g.b(this.f100377c) && j10 < aVarFirst.f100380b) {
            return null;
        }
        this.f100375a.pollFirst();
        this.f100377c = i10;
        return aVarFirst.f100379a;
    }

    public synchronized void f() {
        this.f100375a.clear();
        this.f100378d = false;
        this.f100377c = -1;
        this.f100376b = -1;
    }
}
