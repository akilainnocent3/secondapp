package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ly3d;", "Lj8i0;", "a", "b", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y3d extends j8i0 {
    public final yqm a;
    public final wwd0 b;
    public final uwd0<Boolean> c;
    public final v340 d;
    public final b390 e;
    public final b390 f;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final b b;
        public final C1321a c;

        /* JADX INFO: renamed from: y3d$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class C1321a {
            public final x66<?> a;
            public final List<csm<?>> b;
            public final csm<?> c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1321a(x66<?> x66Var, List<? extends csm<?>> list, csm<?> csmVar) {
                list.getClass();
                this.a = x66Var;
                this.b = list;
                this.c = csmVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1321a)) {
                    return false;
                }
                C1321a c1321a = (C1321a) obj;
                return this.a.equals(c1321a.a) && Intrinsics.g(this.b, c1321a.b) && Intrinsics.g(this.c, c1321a.c);
            }

            public final int hashCode() {
                int iA = ai50.a(this.a.hashCode() * 31, 31, this.b);
                csm<?> csmVar = this.c;
                return iA + (csmVar == null ? 0 : csmVar.hashCode());
            }

            public final String toString() {
                return "Data(campaign=" + this.a + ", variants=" + this.b + ", override=" + this.c + ")";
            }
        }

        public a(String str, b bVar, C1321a c1321a) {
            this.a = str;
            this.b = bVar;
            this.c = c1321a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "CampaignUiState(overrideText=" + this.a + oLsIjJCWb.tHDxYz + this.b + ", data=" + this.c + ")";
        }
    }

    public interface c {

        public static final class a implements c {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                str.getClass();
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("OverrideApplied(campaignCode=", this.a, ", label=", this.b, ")");
            }
        }

        public static final class b implements c {
            public final String a;

            public b(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("OverrideCleared(campaignCode=", this.a, ")");
            }
        }

        default StringUiText a() {
            if (this instanceof a) {
                a aVar = (a) this;
                return new StringUiText(oxc.a(aVar.a, " override → ", aVar.b));
            }
            if (this instanceof b) {
                return new StringUiText(yk10.a(((b) this).a, " override cleared"));
            }
            uhc.a();
            return null;
        }
    }

    @c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel$ui$1", f = "DebugVariantViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements iaj<List<? extends x66<?>>, Map<String, ? extends csm<?>>, Map<String, ? extends b>, v1b<? super List<? extends a>>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ Map b;
        public /* synthetic */ Map c;

        public d(v1b<? super d> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(List<? extends x66<?>> list, Map<String, ? extends csm<?>> map, Map<String, ? extends b> map2, v1b<? super List<? extends a>> v1bVar) {
            d dVar = y3d.this.new d(v1bVar);
            dVar.a = list;
            dVar.b = map;
            dVar.c = map2;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<x66> list = this.a;
            Map map = this.b;
            Map map2 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (x66 x66Var : list) {
                csm csmVar = (csm) map.get(x66Var.a);
                String strX1 = y3d.x1(csmVar);
                b bVar = (b) map2.get(x66Var.a);
                if (bVar == null) {
                    bVar = new b(0);
                }
                arrayList.add(new a(strX1, bVar, new a.C1321a(x66Var, x66Var.d, csmVar)));
            }
            return arrayList;
        }
    }

    public y3d(yqm yqmVar) {
        yqmVar.getClass();
        this.a = yqmVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0 wwd0VarA = xwd0.a(o2gVar);
        this.b = wwd0VarA;
        this.c = yqmVar.b();
        this.d = e1i.e(r1i.a(xwd0.a(CollectionsKt.A0(z76.a)), yqmVar.a(), wwd0VarA, new d(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), m2g.a);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.e = b390VarB;
        this.f = b390VarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String x1(csm csmVar) {
        if (csmVar == 0) {
            return "none";
        }
        Enum r0 = csmVar instanceof Enum ? (Enum) csmVar : null;
        return v70.b(r0 != null ? r0.name() : null, "(", csmVar.getValue(), ")");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(lyh lyhVar, x1b x1bVar) {
        f4d f4dVar;
        if (x1bVar instanceof f4d) {
            f4dVar = (f4d) x1bVar;
            int i = f4dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f4dVar.c = i - Integer.MIN_VALUE;
            } else {
                f4dVar = new f4d(this, x1bVar);
            }
        } else {
            f4dVar = new f4d(this, x1bVar);
        }
        Object objA = f4dVar.a;
        y5b y5bVar = y5b.a;
        int i2 = f4dVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            sl50 sl50VarD = bm50.d(lyhVar);
            f4dVar.c = 1;
            objA = s0i.a(sl50VarD, f4dVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            return new b.a.c(x1((csm) ((lk50.c) lk50Var).a));
        }
        if (lk50Var instanceof lk50.a) {
            return new b.a.C1322a(((lk50.a) lk50Var).a.getMessage());
        }
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            return b.a.C1323b.a;
        }
        uhc.a();
        return null;
    }

    public static final class b {
        public final a a;
        public final a b;

        public interface a {

            /* JADX INFO: renamed from: y3d$b$a$a, reason: collision with other inner class name */
            public static final class C1322a implements a {
                public final String a;

                public C1322a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1322a) && Intrinsics.g(this.a, ((C1322a) obj).a);
                }

                public final int hashCode() {
                    String str = this.a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return tug.a("Failed(reason=", this.a, ")");
                }
            }

            /* JADX INFO: renamed from: y3d$b$a$b, reason: collision with other inner class name */
            public static final class C1323b implements a {
                public static final C1323b a = new C1323b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1323b);
                }

                public final int hashCode() {
                    return -1440006090;
                }

                public final String toString() {
                    return "Loading";
                }
            }

            public static final class c implements a {
                public final String a;

                public c(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.a.equals(((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return tug.a("Successful(label=", this.a, ")");
                }
            }

            public static final class d implements a {
                public static final d a = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 2012012444;
                }

                public final String toString() {
                    return "Unused";
                }
            }

            default StringUiText a() {
                if (equals(d.a)) {
                    return new StringUiText("not fetched");
                }
                if (equals(C1323b.a)) {
                    return new StringUiText("loading…");
                }
                if (this instanceof c) {
                    return new StringUiText(((c) this).a);
                }
                if (!(this instanceof C1322a)) {
                    uhc.a();
                    return null;
                }
                String str = ((C1322a) this).a;
                if (str == null) {
                    str = "unknown error";
                }
                return new StringUiText("failed: ".concat(str));
            }
        }

        public b(a aVar, a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            this.a = aVar;
            this.b = aVar2;
        }

        public static b a(b bVar, a aVar, a aVar2, int i) {
            if ((i & 1) != 0) {
                aVar = bVar.a;
            }
            if ((i & 2) != 0) {
                aVar2 = bVar.b;
            }
            aVar.getClass();
            aVar2.getClass();
            return new b(aVar, aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Readout(remote=" + this.a + ", effective=" + this.b + ")";
        }

        public b() {
            this(0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(int i) {
            a.d dVar = a.d.a;
            this(dVar, dVar);
        }
    }
}
