package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q5d0 implements ono {
    public final yzc0 a;
    public final v5d0 b;
    public final w5d0 c;
    public final b390 d = d390.b(0, 1, null, 5);
    public final wwd0 e = xwd0.a(b.C1000b.a);
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

        /* JADX INFO: renamed from: q5d0$b$b, reason: collision with other inner class name */
        public static final class C1000b implements b {
            public static final C1000b a = new C1000b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1000b);
            }

            public final int hashCode() {
                return -1911461028;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final n5d0 a;

            public c(n5d0 n5d0Var) {
                n5d0Var.getClass();
                this.a = n5d0Var;
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

    public q5d0(yzc0 yzc0Var, v5d0 v5d0Var, w5d0 w5d0Var) {
        this.a = yzc0Var;
        this.b = v5d0Var;
        this.c = w5d0Var;
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
        ej5.c(et7Var, null, null, new s5d0(this, str, null), 3);
        this.d.a(c.a);
        kzh.d(new g1i(r1i.a(this.e, this.f, this.g, new t5d0(4, this, q5d0.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/SportyPenaltyTicketDetailHandlerImpl$TicketDetailStatus;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new u5d0(this, null)), et7Var);
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
        r5d0 r5d0Var;
        Object value;
        Object objE;
        Object value2;
        Object value3;
        if (v1bVar instanceof r5d0) {
            r5d0Var = (r5d0) v1bVar;
            int i = r5d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5d0Var.c = i - Integer.MIN_VALUE;
            } else {
                r5d0Var = new r5d0(this, v1bVar);
            }
        } else {
            r5d0Var = new r5d0(this, v1bVar);
        }
        Object obj = r5d0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = r5d0Var.c;
        wwd0 wwd0Var = this.e;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C1000b.a));
            r5d0Var.c = 1;
            objE = this.a.e(str, r5d0Var);
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
            n5d0 n5d0Var = (n5d0) objE;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(n5d0Var)));
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
