package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yh5 implements ono {
    public final eko a;
    public final gi5 b;
    public final b390 c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;

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

        /* JADX INFO: renamed from: yh5$b$b, reason: collision with other inner class name */
        public static final class C1347b implements b {
            public static final C1347b a = new C1347b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1347b);
            }

            public final int hashCode() {
                return -1090546635;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final qh5 a;

            public c(qh5 qh5Var) {
                qh5Var.getClass();
                this.a = qh5Var;
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

    public yh5(eko ekoVar, ei5 ei5Var, gi5 gi5Var) {
        ekoVar.getClass();
        this.a = ekoVar;
        this.b = gi5Var;
        this.c = d390.b(0, 1, null, 5);
        this.d = xwd0.a(b.C1347b.a);
        this.e = xwd0.a(null);
        this.f = xwd0.a(bno.b.a);
    }

    @Override // defpackage.ono
    public final uwd0<bno> a() {
        return this.f;
    }

    @Override // defpackage.ono
    public final void b() {
        this.c.a(c.a);
    }

    @Override // defpackage.ono
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    @Override // defpackage.ono
    public final void d(String str) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
    }

    @Override // defpackage.ono
    public final List<Pair<String, String>> f(String str, boolean z) {
        return c5j0.a("sportId", str);
    }

    @Override // defpackage.ono
    public final void g(et7 et7Var, String str) {
        ej5.c(et7Var, null, null, new ai5(this, str, null), 3);
        this.c.a(c.a);
        kzh.d(new g1i(new n1i(this.d, this.e, new bi5(3, this, yh5.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/BuildAndGoTicketDetailHandlerImpl$TicketDetailStatus;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new ci5(this, null)), et7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, v1b<? super Unit> v1bVar) {
        zh5 zh5Var;
        Object value;
        Object objV;
        Object value2;
        Object value3;
        if (v1bVar instanceof zh5) {
            zh5Var = (zh5) v1bVar;
            int i = zh5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zh5Var.c = i - Integer.MIN_VALUE;
            } else {
                zh5Var = new zh5(this, v1bVar);
            }
        } else {
            zh5Var = new zh5(this, v1bVar);
        }
        Object obj = zh5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zh5Var.c;
        wwd0 wwd0Var = this.d;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C1347b.a));
            zh5Var.c = 1;
            objV = this.a.v(str, zh5Var);
            if (objV == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objV = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objV instanceof zi50.b)) {
            qh5 qh5Var = (qh5) objV;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(qh5Var)));
        }
        Throwable thA = zi50.a(objV);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }

    @Override // defpackage.ono
    public final void h(String str) {
    }
}
