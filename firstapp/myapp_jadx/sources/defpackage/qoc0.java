package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qoc0 implements ono {
    public final mgc0 a;
    public final yoc0 b;
    public final apc0 c;
    public final jh2 d;
    public final b390 e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;

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

        /* JADX INFO: renamed from: qoc0$b$b, reason: collision with other inner class name */
        public static final class C1019b implements b {
            public static final C1019b a = new C1019b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1019b);
            }

            public final int hashCode() {
                return -427165799;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final joc0 a;

            public c(joc0 joc0Var) {
                joc0Var.getClass();
                this.a = joc0Var;
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

    public qoc0(mgc0 mgc0Var, yoc0 yoc0Var, apc0 apc0Var, jh2 jh2Var, poc0 poc0Var) {
        jh2Var.getClass();
        this.a = mgc0Var;
        this.b = yoc0Var;
        this.c = apc0Var;
        this.d = jh2Var;
        this.e = d390.b(0, 1, null, 5);
        this.f = xwd0.a(b.C1019b.a);
        this.g = xwd0.a(t3g.a);
        this.h = xwd0.a(null);
        this.i = xwd0.a(null);
        this.j = xwd0.a(bno.b.a);
    }

    @Override // defpackage.ono
    public final uwd0<bno> a() {
        return this.j;
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
    public final void e(com.sportybet.android.instantwin.presentation.ticketdetail.b.c cVar) {
        Object value;
        Object value2;
        boolean zEquals = cVar.equals(com.sportybet.android.instantwin.presentation.ticketdetail.b.c.a.a);
        wwd0 wwd0Var = this.i;
        if (zEquals) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, null));
        } else {
            if (!(cVar instanceof com.sportybet.android.instantwin.presentation.ticketdetail.b.c.C0344b)) {
                uhc.a();
                return;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ((com.sportybet.android.instantwin.presentation.ticketdetail.b.c.C0344b) cVar).a));
        }
    }

    @Override // defpackage.ono
    public final List<Pair<String, String>> f(String str, boolean z) {
        ngs ngsVarB = kotlin.collections.a.b();
        kvs.a("sportId", str, ngsVarB);
        if (!z) {
            kvs.a("isBetBuilder", String.valueOf(this.d.B(str)), ngsVarB);
        }
        return kotlin.collections.a.a(ngsVarB);
    }

    @Override // defpackage.ono
    public final void g(et7 et7Var, String str) {
        ej5.c(et7Var, null, null, new soc0(this, str, null), 3);
        this.e.a(c.a);
        kzh.d(new g1i(r1i.b(this.f, this.g, this.h, this.i, new toc0(5, this, qoc0.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/SportyLegendsTicketDetailHandlerImpl$TicketDetailStatus;Ljava/util/Set;Ljava/lang/String;Lcom/sportybet/android/instantwin/presentation/doubleornothingticketdetail/model/DoubleOrNothingTicketDetailGuideType;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new uoc0(this, null)), et7Var);
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
        roc0 roc0Var;
        Object value;
        Object objK;
        Object value2;
        Object value3;
        if (v1bVar instanceof roc0) {
            roc0Var = (roc0) v1bVar;
            int i = roc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                roc0Var.c = i - Integer.MIN_VALUE;
            } else {
                roc0Var = new roc0(this, v1bVar);
            }
        } else {
            roc0Var = new roc0(this, v1bVar);
        }
        Object obj = roc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = roc0Var.c;
        wwd0 wwd0Var = this.f;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C1019b.a));
            roc0Var.c = 1;
            objK = this.a.k(str, roc0Var);
            if (objK == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objK = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objK instanceof zi50.b)) {
            joc0 joc0Var = (joc0) objK;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(joc0Var)));
        }
        Throwable thA = zi50.a(objK);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
