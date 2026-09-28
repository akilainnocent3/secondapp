package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.ekv;
import defpackage.fqe0;
import defpackage.fw1;
import defpackage.j00;
import defpackage.jrh0;
import defpackage.ly0;
import defpackage.mfe0;
import defpackage.pid;
import defpackage.q480;
import defpackage.r21;
import defpackage.rwg;
import defpackage.so10;
import defpackage.tdd;
import defpackage.tjg0;
import defpackage.vh8;
import defpackage.vs7;
import defpackage.vwg;
import defpackage.ywg;
import defpackage.zad;
import defpackage.zr70;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends so10 {

    public static final class b {
        public final Context a;
        public final fqe0 b;
        public final vwg c;
        public mfe0<ekv.a> d;
        public mfe0<tjg0> e;
        public mfe0<f> f;
        public mfe0<fw1> g;
        public final vh8 h;
        public final Looper i;
        public final int j;
        public final r21 k;
        public final int l;
        public final boolean m;
        public final q480 n;
        public final zr70 o;
        public final long p;
        public final long q;
        public final long r;
        public final tdd s;
        public final long t;
        public final long u;
        public final boolean v;
        public boolean w;
        public final String x;

        public b(final Context context) {
            vwg vwgVar = new vwg(context);
            mfe0<ekv.a> mfe0Var = new mfe0() { // from class: wwg
                @Override // defpackage.mfe0
                public final Object get() {
                    return new ged(new rbd.a(context), new mcd());
                }
            };
            mfe0<tjg0> mfe0Var2 = new mfe0() { // from class: xwg
                @Override // defpackage.mfe0
                public final Object get() {
                    return new pid(context);
                }
            };
            ywg ywgVar = new ywg();
            mfe0<fw1> mfe0Var3 = new mfe0() { // from class: zwg
                @Override // defpackage.mfe0
                public final Object get() {
                    zad zadVar;
                    Context context2 = context;
                    c150 c150Var = zad.p;
                    synchronized (zad.class) {
                        zadVar = zad.v;
                        if (zadVar == null) {
                            Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            zadVar = new zad(applicationContext, map);
                            zad.v = zadVar;
                        }
                    }
                    return zadVar;
                }
            };
            vh8 vh8Var = new vh8();
            context.getClass();
            this.a = context;
            this.c = vwgVar;
            this.d = mfe0Var;
            this.e = mfe0Var2;
            this.f = ywgVar;
            this.g = mfe0Var3;
            this.h = vh8Var;
            String str = jrh0.a;
            Looper looperMyLooper = Looper.myLooper();
            this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.k = r21.d;
            this.l = 1;
            this.m = true;
            this.n = q480.c;
            this.p = 5000L;
            this.q = 15000L;
            this.r = 3000L;
            this.o = zr70.b;
            this.s = new tdd(jrh0.O(20L), jrh0.O(500L));
            this.b = vs7.a;
            this.t = 500L;
            this.u = 2000L;
            this.v = true;
            this.x = "";
            this.j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
        }

        public final d a() {
            ly0.f(!this.w);
            this.w = true;
            return new d(this);
        }

        public final void b(final zad zadVar) {
            ly0.f(!this.w);
            this.g = new mfe0() { // from class: twg
                @Override // defpackage.mfe0
                public final Object get() {
                    return zadVar;
                }
            };
        }

        public final void c(final androidx.media3.exoplayer.c cVar) {
            ly0.f(!this.w);
            this.f = new mfe0() { // from class: swg
                @Override // defpackage.mfe0
                public final Object get() {
                    return cVar;
                }
            };
        }

        public final void d(final pid pidVar) {
            ly0.f(!this.w);
            this.e = new mfe0() { // from class: uwg
                @Override // defpackage.mfe0
                public final Object get() {
                    return pidVar;
                }
            };
        }
    }

    public static class c {
        public static final c a = new c();
    }

    void J(j00 j00Var);

    void M(j00 j00Var);

    @Override // defpackage.so10
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    rwg b();

    boolean isScrubbingModeEnabled();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    public interface a {
        default void l() {
        }
    }
}
