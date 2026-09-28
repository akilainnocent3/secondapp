package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class wm70 {
    public static final qm70 a = o760.a(new h());
    public static final qm70 b = o760.a(new b());
    public static final qm70 c = o760.a(new c());
    public static final qm70 d;

    public static final class a {
        public static final sna a = new sna();
    }

    public static final class b implements Callable<qm70> {
        @Override // java.util.concurrent.Callable
        public final qm70 call() {
            return a.a;
        }
    }

    public static final class c implements Callable<qm70> {
        @Override // java.util.concurrent.Callable
        public final qm70 call() {
            return d.a;
        }
    }

    public static final class d {
        public static final x0p a = new x0p();
    }

    public static final class e {
        public static final zqx a = new zqx();
    }

    public static final class f implements Callable<qm70> {
        @Override // java.util.concurrent.Callable
        public final qm70 call() {
            return e.a;
        }
    }

    public static final class g {
        public static final bw90 a = new bw90();
    }

    public static final class h implements Callable<qm70> {
        @Override // java.util.concurrent.Callable
        public final qm70 call() {
            return g.a;
        }
    }

    static {
        int i = wpg0.c;
        d = o760.a(new f());
    }
}
