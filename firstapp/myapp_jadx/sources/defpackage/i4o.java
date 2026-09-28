package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i4o implements ono {
    public final e3o a;
    public final r4o b;
    public final t4o c;
    public final b390 d = d390.b(0, 1, null, 5);
    public final wwd0 e = xwd0.a(b.C0669b.a);
    public final wwd0 f = xwd0.a(t3g.a);
    public final wwd0 g = xwd0.a(null);
    public final wwd0 h = xwd0.a(bno.b.a);

    public static final class a {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return kox.a("TicketDetailError(throwable=", ")", this.a);
        }
    }

    public interface b {

        public static final class a implements b {
            public final a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Failure(error=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: i4o$b$b, reason: collision with other inner class name */
        public static final class C0669b implements b {
            public static final C0669b a = new C0669b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0669b);
            }

            public final int hashCode() {
                return 1582646759;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final f4o a;

            public c(f4o f4oVar) {
                f4oVar.getClass();
                this.a = f4oVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final /* synthetic */ c[] b;

        static {
            c cVar = new c("INITIAL_LOAD", 0);
            a = cVar;
            b = new c[]{cVar};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    public i4o(e3o e3oVar, r4o r4oVar, t4o t4oVar) {
        this.a = e3oVar;
        this.b = r4oVar;
        this.c = t4oVar;
    }

    @Override // defpackage.ono
    public final uwd0<bno> a() {
        return this.h;
    }

    @Override // defpackage.ono
    public final void b() {
        this.d.a(c.a);
    }

    @Override // defpackage.ono
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.g;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    @Override // defpackage.ono
    public final void d(String str) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.g;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
    }

    @Override // defpackage.ono
    public final List<Pair<String, String>> f(String str, boolean z) {
        return c5j0.a("sportId", str);
    }

    @Override // defpackage.ono
    public final void g(et7 et7Var, String str) {
        ej5.c(et7Var, null, null, new k4o(this, str, null), 3);
        this.d.a(c.a);
        kzh.d(new g1i(r1i.a(this.e, this.f, this.g, new l4o(4, this, i4o.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/InstantRacingTicketDetailHandlerImpl$TicketDetailStatus;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new m4o(this, null)), et7Var);
    }

    @Override // defpackage.ono
    public final void h(String str) {
        wwd0 wwd0Var;
        Object value;
        Set set;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
            set = (Set) value;
        } while (!wwd0Var.g(value, set.contains(str) ? yi80.c(set, str) : yi80.f(set, str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, v1b<? super Unit> v1bVar) {
        j4o j4oVar;
        Object value;
        Object objE;
        Object value2;
        Object value3;
        if (v1bVar instanceof j4o) {
            j4oVar = (j4o) v1bVar;
            int i = j4oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4oVar.c = i - Integer.MIN_VALUE;
            } else {
                j4oVar = new j4o(this, v1bVar);
            }
        } else {
            j4oVar = new j4o(this, v1bVar);
        }
        Object obj = j4oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = j4oVar.c;
        wwd0 wwd0Var = this.e;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C0669b.a));
            j4oVar.c = 1;
            objE = this.a.e(str, j4oVar);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objE = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objE instanceof zi50.b)) {
            f4o f4oVar = (f4o) objE;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(f4oVar)));
        }
        Throwable thA = zi50.a(objE);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
