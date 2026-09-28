package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jk70 implements ono {
    public final mg70 a;
    public final nk70 b;
    public final qk70 c;
    public final sk70 d;
    public final b390 e = d390.b(0, 1, null, 5);
    public final wwd0 f = xwd0.a(b.C0726b.a);
    public final wwd0 g = xwd0.a(t3g.a);
    public final wwd0 h = xwd0.a(null);
    public final wwd0 i = xwd0.a(bno.b.a);

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

        /* JADX INFO: renamed from: jk70$b$b, reason: collision with other inner class name */
        public static final class C0726b implements b {
            public static final C0726b a = new C0726b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0726b);
            }

            public final int hashCode() {
                return 1903918802;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final fk70 a;

            public c(fk70 fk70Var) {
                fk70Var.getClass();
                this.a = fk70Var;
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.ScheduledFootballTicketDetailHandlerImpl", f = "ScheduledFootballTicketDetailHandlerImpl.kt", l = {81}, m = "getTicket", v = 2)
    public static final class d extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public d(v1b<? super d> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return jk70.this.i(null, this);
        }
    }

    public jk70(mg70 mg70Var, nk70 nk70Var, qk70 qk70Var, sk70 sk70Var) {
        this.a = mg70Var;
        this.b = nk70Var;
        this.c = qk70Var;
        this.d = sk70Var;
    }

    @Override // defpackage.ono
    public final uwd0<bno> a() {
        return e1i.b(this.i);
    }

    @Override // defpackage.ono
    public final void b() {
        this.e.a(c.a);
    }

    @Override // defpackage.ono
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.h;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    @Override // defpackage.ono
    public final void d(String str) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.h;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
    }

    @Override // defpackage.ono
    public final List<Pair<String, String>> f(String str, boolean z) {
        return c5j0.a("sportId", str);
    }

    @Override // defpackage.ono
    public final void g(et7 et7Var, String str) {
        ej5.c(et7Var, null, null, new kk70(this, str, null), 3);
        this.e.a(c.a);
        kzh.d(new g1i(r1i.a(this.f, this.g, this.h, new lk70(4, this, jk70.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/ScheduledFootballTicketDetailHandlerImpl$TicketDetailStatus;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new mk70(this, null)), et7Var);
    }

    @Override // defpackage.ono
    public final void h(String str) {
        wwd0 wwd0Var;
        Object value;
        Set set;
        do {
            wwd0Var = this.g;
            value = wwd0Var.getValue();
            set = (Set) value;
        } while (!wwd0Var.g(value, set.contains(str) ? yi80.c(set, str) : yi80.f(set, str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, v1b<? super Unit> v1bVar) {
        d dVar;
        Object value;
        Object objJ;
        Object value2;
        Object value3;
        if (v1bVar instanceof d) {
            dVar = (d) v1bVar;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(v1bVar);
            }
        } else {
            dVar = new d(v1bVar);
        }
        Object obj = dVar.a;
        y5b y5bVar = y5b.a;
        int i2 = dVar.c;
        wwd0 wwd0Var = this.f;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C0726b.a));
            dVar.c = 1;
            objJ = this.a.j(str, dVar);
            if (objJ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objJ = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objJ instanceof zi50.b)) {
            fk70 fk70Var = (fk70) objJ;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(fk70Var)));
        }
        Throwable thA = zi50.a(objJ);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
