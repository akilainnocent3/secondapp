package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mrn implements ono {
    public final eko a;
    public final srn b;
    public final wrn c;
    public final xrn d;
    public final zrn e;
    public final iug0 f;
    public final b390 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final wwd0 l;

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

        /* JADX INFO: renamed from: mrn$b$b, reason: collision with other inner class name */
        public static final class C0876b implements b {
            public static final C0876b a = new C0876b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0876b);
            }

            public final int hashCode() {
                return 179501446;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final ern a;

            public c(ern ernVar) {
                ernVar.getClass();
                this.a = ernVar;
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

    public mrn(eko ekoVar, srn srnVar, wrn wrnVar, xrn xrnVar, zrn zrnVar, iug0 iug0Var) {
        ekoVar.getClass();
        this.a = ekoVar;
        this.b = srnVar;
        this.c = wrnVar;
        this.d = xrnVar;
        this.e = zrnVar;
        this.f = iug0Var;
        this.g = d390.b(0, 1, null, 5);
        this.h = xwd0.a(b.C0876b.a);
        this.i = xwd0.a(hug0.b);
        this.j = xwd0.a(t3g.a);
        this.k = xwd0.a(null);
        this.l = xwd0.a(bno.b.a);
    }

    @Override // defpackage.ono
    public final uwd0<bno> a() {
        return this.l;
    }

    @Override // defpackage.ono
    public final void b() {
        this.g.a(c.a);
    }

    @Override // defpackage.ono
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.k;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    @Override // defpackage.ono
    public final void d(String str) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.k;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, str));
    }

    @Override // defpackage.ono
    public final List<Pair<String, String>> f(String str, boolean z) {
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.add(new Pair("sportId", str));
        return kotlin.collections.a.a(ngsVarB);
    }

    @Override // defpackage.ono
    public final void g(et7 et7Var, String str) {
        ej5.c(et7Var, null, null, new orn(this, null), 3);
        ej5.c(et7Var, null, null, new prn(this, str, null), 3);
        this.g.a(c.a);
        kzh.d(new g1i(r1i.b(this.h, this.i, this.j, this.k, new qrn(5, this, mrn.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/InstantFootballTicketDetailHandlerImpl$TicketDetailStatus;Lcom/sporty/android/common/util/Translation;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new rrn(this, null)), et7Var);
    }

    @Override // defpackage.ono
    public final void h(String str) {
        wwd0 wwd0Var;
        Object value;
        Set set;
        do {
            wwd0Var = this.j;
            value = wwd0Var.getValue();
            set = (Set) value;
        } while (!wwd0Var.g(value, set.contains(str) ? yi80.c(set, str) : yi80.f(set, str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, v1b<? super Unit> v1bVar) {
        nrn nrnVar;
        Object value;
        Object objP;
        Object value2;
        Object value3;
        if (v1bVar instanceof nrn) {
            nrnVar = (nrn) v1bVar;
            int i = nrnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrnVar.c = i - Integer.MIN_VALUE;
            } else {
                nrnVar = new nrn(this, v1bVar);
            }
        } else {
            nrnVar = new nrn(this, v1bVar);
        }
        Object obj = nrnVar.a;
        y5b y5bVar = y5b.a;
        int i2 = nrnVar.c;
        wwd0 wwd0Var = this.h;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C0876b.a));
            nrnVar.c = 1;
            objP = this.a.p(str, nrnVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objP = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objP instanceof zi50.b)) {
            ern ernVar = (ern) objP;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(ernVar)));
        }
        Throwable thA = zi50.a(objP);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
