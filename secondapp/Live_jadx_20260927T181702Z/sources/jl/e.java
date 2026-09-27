package jl;

import el.u;
import java.util.concurrent.TimeUnit;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f100628d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f100629e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f100630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0("this")
    public long f100631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a0("this")
    public int f100632c;

    public e(u uVar) {
        this.f100630a = uVar;
    }

    public static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f100632c) + this.f100630a.e(), f100629e);
        }
        return f100628d;
    }

    public synchronized boolean b() {
        return this.f100632c == 0 || this.f100630a.a() > this.f100631b;
    }

    public final synchronized void e() {
        this.f100632c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f100632c++;
        this.f100631b = this.f100630a.a() + a(i10);
    }

    public e() {
        this.f100630a = u.c();
    }
}
