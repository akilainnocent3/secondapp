package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import eh.o1;
import java.util.concurrent.CopyOnWriteArrayList;
import zf.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final l0.b f48373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0440a> f48374c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0440a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f48375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public e f48376b;

            public C0440a(Handler handler, e eVar) {
                this.f48375a = handler;
                this.f48376b = eVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void d(a aVar, e eVar, int i10) {
            eVar.Z(aVar.f48372a, aVar.f48373b);
            eVar.B(aVar.f48372a, aVar.f48373b, i10);
        }

        public void g(Handler handler, e eVar) {
            eh.a.g(handler);
            eh.a.g(eVar);
            this.f48374c.add(new C0440a(handler, eVar));
        }

        public void h() {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a aVar = this.f161019b;
                        eVar.H(aVar.f48372a, aVar.f48373b);
                    }
                });
            }
        }

        public void i() {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a aVar = this.f161012b;
                        eVar.W(aVar.f48372a, aVar.f48373b);
                    }
                });
            }
        }

        public void j() {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a aVar = this.f161014b;
                        eVar.v(aVar.f48372a, aVar.f48373b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a.d(this.f161023b, eVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a aVar = this.f161016b;
                        eVar.C(aVar.f48372a, aVar.f48373b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0440a c0440a : this.f48374c) {
                final e eVar = c0440a.f48376b;
                o1.u1(c0440a.f48375a, new Runnable() { // from class: ze.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.e.a aVar = this.f161021b;
                        eVar.M(aVar.f48372a, aVar.f48373b);
                    }
                });
            }
        }

        public void n(e eVar) {
            for (C0440a c0440a : this.f48374c) {
                if (c0440a.f48376b == eVar) {
                    this.f48374c.remove(c0440a);
                }
            }
        }

        @CheckResult
        public a o(int i10, @Nullable l0.b bVar) {
            return new a(this.f48374c, i10, bVar);
        }

        public a(CopyOnWriteArrayList<C0440a> copyOnWriteArrayList, int i10, @Nullable l0.b bVar) {
            this.f48374c = copyOnWriteArrayList;
            this.f48372a = i10;
            this.f48373b = bVar;
        }
    }

    void B(int i10, @Nullable l0.b bVar, int i11);

    void C(int i10, @Nullable l0.b bVar, Exception exc);

    void H(int i10, @Nullable l0.b bVar);

    void M(int i10, @Nullable l0.b bVar);

    void W(int i10, @Nullable l0.b bVar);

    @Deprecated
    void Z(int i10, @Nullable l0.b bVar);

    void v(int i10, @Nullable l0.b bVar);
}
