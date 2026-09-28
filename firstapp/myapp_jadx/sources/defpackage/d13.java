package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d13 {
    public static final d13 a = new d13();
    public static volatile a b;

    public static final class a {
        public final jrm a;
        public final lrm b;
        public final krm c;
        public final hrd0 d;

        public a(jrm jrmVar, lrm lrmVar, krm krmVar, hrd0 hrd0Var) {
            lrmVar.getClass();
            krmVar.getClass();
            this.a = jrmVar;
            this.b = lrmVar;
            this.c = krmVar;
            this.d = hrd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Graph(betItem=" + this.a + ", betStore=" + this.b + ", betMutexData=" + this.c + ", stakeConfigRepository=" + this.d + ")";
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, jrm, pu2] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, j93] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, ow2] */
    public static a a() {
        final dq40 dq40Var = new dq40();
        final dq40 dq40Var2 = new dq40();
        final dq40 dq40Var3 = new dq40();
        m730 m730Var = new m730() { // from class: a13
            @Override // defpackage.m730
            public final Object get() {
                T t = dq40Var.a;
                if (t != 0) {
                    return (jrm) t;
                }
                Intrinsics.n("betItem");
                throw null;
            }
        };
        m730 m730Var2 = new m730() { // from class: b13
            @Override // defpackage.m730
            public final Object get() {
                T t = dq40Var2.a;
                if (t != 0) {
                    return (lrm) t;
                }
                Intrinsics.n("betStore");
                throw null;
            }
        };
        m730 m730Var3 = new m730() { // from class: c13
            @Override // defpackage.m730
            public final Object get() {
                T t = dq40Var3.a;
                if (t != 0) {
                    return (krm) t;
                }
                Intrinsics.n("betMutexData");
                throw null;
            }
        };
        hrd0 hrd0VarB = ird0.b();
        nzm nzmVarA = ird0.a();
        dq40Var2.a = new j93(m730Var, m730Var3, nzmVarA);
        dq40Var3.a = new ow2(m730Var, m730Var2, nzmVarA);
        ?? pu2Var = new pu2(m730Var2, m730Var3, new t880(), hrd0VarB, q1g.a);
        dq40Var.a = pu2Var;
        T t = dq40Var2.a;
        if (t == 0) {
            Intrinsics.n("betStore");
            throw null;
        }
        lrm lrmVar = (lrm) t;
        T t2 = dq40Var3.a;
        if (t2 != 0) {
            return new a(pu2Var, lrmVar, (krm) t2, hrd0VarB);
        }
        Intrinsics.n("betMutexData");
        throw null;
    }

    public static final void b(jrm jrmVar) {
        jrm jrmVar2;
        jrmVar.getClass();
        a aVar = b;
        if (aVar == null || (jrmVar2 = aVar.a) == jrmVar) {
            return;
        }
        jrmVar.s1(jrmVar2.G1());
        jrmVar.p0(jrmVar2.M());
        jrmVar.d1(jrmVar2.H0());
        jrmVar.i(jrmVar2.E1());
        jrmVar.J0(jrmVar2.E());
        jrmVar.N1(jrmVar2.Y0());
        jrmVar.b(jrmVar2.o1());
        jrmVar.x0(jrmVar2.q1());
        jrmVar.g1(jrmVar2.n0());
        jrmVar.q0(jrmVar2.l());
        jrmVar.k0(jrmVar2.w());
        jrmVar.z0(jrmVar2.a());
        jrmVar.r0(jrmVar2.K0());
        Iterator it = jrmVar2.Q1().iterator();
        while (it.hasNext()) {
            jrmVar.s((String) it.next());
        }
        ArrayList arrayListC = jrmVar2.C();
        if (arrayListC.isEmpty()) {
            return;
        }
        jrmVar.f1(CollectionsKt.A0(arrayListC));
    }

    public static final void c(krm krmVar) {
        krm krmVar2;
        krmVar.getClass();
        a aVar = b;
        if (aVar == null || (krmVar2 = aVar.c) == null || krmVar2 == krmVar) {
            return;
        }
        Collection<HashSet<lw2.a>> collectionValues = krmVar2.E().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            p48.w(CollectionsKt.R((HashSet) it.next()), arrayList);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            lw2.a aVar2 = (lw2.a) obj;
            Event event = aVar2.a;
            Market market = aVar2.b;
            Outcome outcome = aVar2.c;
            List<Selection> list = aVar2.d;
            krmVar.h(event, market, outcome, list != null ? new ArrayList(list) : null);
        }
        ArrayList arrayListR = CollectionsKt.R(krmVar2.u());
        int size2 = arrayListR.size();
        while (i < size2) {
            Object obj2 = arrayListR.get(i);
            i++;
            krmVar.i((Event) obj2, true);
        }
    }

    public static final void d(lrm lrmVar) {
        lrm lrmVar2;
        lrmVar.getClass();
        a aVar = b;
        if (aVar == null || (lrmVar2 = aVar.b) == null || lrmVar2 == lrmVar) {
            return;
        }
        lrmVar.G(lrmVar2.o());
        lrmVar.K(lrmVar2.M());
        lrmVar.E(lrmVar2.A());
        lrmVar.l(lrmVar2.J());
        lrmVar.q(lrmVar2.getTypeName());
        lrmVar.e(lrmVar2.V());
        lrmVar.Y(lrmVar2.Z());
        lrmVar.i(lrmVar2.e0());
        lrmVar.L(lrmVar2.d0());
        lrmVar.w(lrmVar2.g());
        lrmVar.k(lrmVar2.f0());
        lrmVar.c0(lrmVar2.H());
        lrmVar.Q(lrmVar2.F());
        lrmVar.v(lrmVar2.C());
        lrmVar.D(lrmVar2.b0());
        lrmVar.h0(lrmVar2.c());
        for (Map.Entry entry : lrmVar2.B().entrySet()) {
            lrmVar.O((Selection) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : lrmVar2.u().entrySet()) {
            lrmVar.P((String) entry2.getKey(), (imn) entry2.getValue());
        }
    }

    public final a e() {
        a aVarA;
        a aVar = b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            aVarA = b;
            if (aVarA == null) {
                aVarA = a();
                b = aVarA;
            }
        }
        return aVarA;
    }
}
