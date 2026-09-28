package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vq implements ono {
    public final eko a;
    public final ar b;
    public final er c;
    public final fr d;
    public final hr e;
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

        /* JADX INFO: renamed from: vq$b$b, reason: collision with other inner class name */
        public static final class C1221b implements b {
            public static final C1221b a = new C1221b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1221b);
            }

            public final int hashCode() {
                return -1222062834;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final nq a;

            public c(nq nqVar) {
                nqVar.getClass();
                this.a = nqVar;
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.AfricanCupTicketDetailHandlerImpl", f = "AfricanCupTicketDetailHandlerImpl.kt", l = {94}, m = "getTicketDetail", v = 2)
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
            return vq.this.i(null, this);
        }
    }

    public vq(eko ekoVar, ar arVar, er erVar, fr frVar, hr hrVar, iug0 iug0Var) {
        ekoVar.getClass();
        this.a = ekoVar;
        this.b = arVar;
        this.c = erVar;
        this.d = frVar;
        this.e = hrVar;
        this.f = iug0Var;
        this.g = d390.b(0, 1, null, 5);
        this.h = xwd0.a(b.C1221b.a);
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
        ej5.c(et7Var, null, null, new wq(this, null), 3);
        ej5.c(et7Var, null, null, new xq(this, str, null), 3);
        this.g.a(c.a);
        kzh.d(new g1i(r1i.b(this.h, this.i, this.j, this.k, new yq(5, this, vq.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/AfricanCupTicketDetailHandlerImpl$TicketDetailStatus;Lcom/sporty/android/common/util/Translation;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new zq(this, null)), et7Var);
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
        d dVar;
        Object value;
        Object objL;
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
        wwd0 wwd0Var = this.h;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C1221b.a));
            dVar.c = 1;
            objL = this.a.l(str, dVar);
            if (objL == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objL = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objL instanceof zi50.b)) {
            nq nqVar = (nq) objL;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(nqVar)));
        }
        Throwable thA = zi50.a(objL);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
