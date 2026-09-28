package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h5b {
    public final v5b a;
    public final long b;
    public final Function2<Long, v1b<? super Unit>, Object> c;
    public final Function1<v1b<? super Unit>, Object> d;
    public a e = a.b.a;

    public interface a {

        /* JADX INFO: renamed from: h5b$a$a, reason: collision with other inner class name */
        public static final class C0624a implements a {
            public static final C0624a a = new C0624a();
        }

        public static final class b implements a {
            public static final b a = new b();
        }

        public static final class c implements a {
            public final long a;

            public c(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "Pause(stopTimeInFuture=", ")");
            }
        }

        public static final class d implements a {
            public final long a;
            public final jvd0 b;

            public d(long j, jvd0 jvd0Var) {
                this.a = j;
                this.b = jvd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Resume(stopTimeInFuture=" + this.a + ", job=" + this.b + ")";
            }
        }
    }

    public h5b(v5b v5bVar, long j, Function2 function2, Function1 function1) {
        this.a = v5bVar;
        this.b = j;
        this.c = function2;
        this.d = function1;
    }

    public final void a() {
        a aVar = this.e;
        if (!(aVar instanceof a.d)) {
            aVar = null;
        }
        a.d dVar = (a.d) aVar;
        if (dVar != null) {
            dVar.b.cancel((CancellationException) null);
        }
        this.e = a.C0624a.a;
    }

    public final void b() {
        a aVar = this.e;
        if (!(aVar instanceof a.d)) {
            aVar = null;
        }
        a.d dVar = (a.d) aVar;
        if (dVar != null) {
            dVar.b.cancel((CancellationException) null);
            this.e = new a.c(dVar.a);
        }
    }

    public final void c() {
        a aVar = this.e;
        if (!(aVar instanceof a.c)) {
            aVar = null;
        }
        a.c cVar = (a.c) aVar;
        if (cVar != null) {
            long j = cVar.a;
            this.e = new a.d(j, ej5.c(this.a, null, null, new i5b(j, this, null), 3));
        }
    }

    public final void d() {
        if (this.e.equals(a.b.a)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() + this.b;
            this.e = new a.d(jElapsedRealtime, ej5.c(this.a, null, null, new i5b(jElapsedRealtime, this, null), 3));
        }
    }
}
