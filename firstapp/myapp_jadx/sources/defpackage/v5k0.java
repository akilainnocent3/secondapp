package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v5k0 implements ono {
    public final eko a;
    public final b6k0 b;
    public final f6k0 c;
    public final g6k0 d;
    public final i6k0 e;
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

        /* JADX INFO: renamed from: v5k0$b$b, reason: collision with other inner class name */
        public static final class C1206b implements b {
            public static final C1206b a = new C1206b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1206b);
            }

            public final int hashCode() {
                return -1371539728;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final p5k0 a;

            public c(p5k0 p5k0Var) {
                p5k0Var.getClass();
                this.a = p5k0Var;
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

    public v5k0(eko ekoVar, b6k0 b6k0Var, f6k0 f6k0Var, g6k0 g6k0Var, i6k0 i6k0Var, iug0 iug0Var) {
        ekoVar.getClass();
        this.a = ekoVar;
        this.b = b6k0Var;
        this.c = f6k0Var;
        this.d = g6k0Var;
        this.e = i6k0Var;
        this.f = iug0Var;
        this.g = d390.b(0, 1, null, 5);
        this.h = xwd0.a(b.C1206b.a);
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
        ej5.c(et7Var, null, null, new x5k0(this, null), 3);
        ej5.c(et7Var, null, null, new y5k0(this, str, null), 3);
        this.g.a(c.a);
        kzh.d(new g1i(r1i.b(this.h, this.i, this.j, this.k, new z5k0(5, this, v5k0.class, "createTicketDetailContentStatus", "createTicketDetailContentStatus(Lcom/sportybet/android/instantwin/presentation/ticketdetail/handler/WorldCupTicketDetailHandlerImpl$TicketDetailStatus;Lcom/sporty/android/common/util/Translation;Ljava/util/Set;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;", 4)), new a6k0(this, null)), et7Var);
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
        w5k0 w5k0Var;
        Object value;
        Object objA;
        Object value2;
        Object value3;
        if (v1bVar instanceof w5k0) {
            w5k0Var = (w5k0) v1bVar;
            int i = w5k0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5k0Var.c = i - Integer.MIN_VALUE;
            } else {
                w5k0Var = new w5k0(this, v1bVar);
            }
        } else {
            w5k0Var = new w5k0(this, v1bVar);
        }
        Object obj = w5k0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = w5k0Var.c;
        wwd0 wwd0Var = this.h;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.C1206b.a));
            w5k0Var.c = 1;
            objA = this.a.A(str, w5k0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            p5k0 p5k0Var = (p5k0) objA;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new b.c(p5k0Var)));
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new b.a(new a(thA))));
        }
        return Unit.a;
    }
}
