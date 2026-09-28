package androidx.compose.runtime;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ama;
import defpackage.fv0;
import defpackage.j0p;
import defpackage.j1a0;
import defpackage.k0p;
import defpackage.l00;
import defpackage.msw;
import defpackage.qxy;
import defpackage.rj40;
import defpackage.t2b;
import defpackage.tug;
import defpackage.uja;
import defpackage.v9p;
import defpackage.y6w;
import defpackage.z6w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final qxy a = new qxy(AnalyticsParam.EVENT_STREAM_PROVIDER);
    public static final qxy b = new qxy(AnalyticsParam.EVENT_STREAM_PROVIDER);
    public static final qxy c = new qxy("compositionLocalMap");
    public static final qxy d = new qxy("providers");
    public static final qxy e = new qxy("reference");
    public static final ama f = new ama();

    public static final void a(f fVar, ArrayList arrayList, int i) {
        boolean zL = fVar.l(i);
        int[] iArr = fVar.b;
        if (zL) {
            arrayList.add(fVar.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            a(fVar, arrayList, i3);
        }
    }

    public static final void b(String str) {
        throw new uja(tug.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void c(String str) {
        throw new uja(tug.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    public static final y6w d(t2b t2bVar, z6w z6wVar, h hVar, fv0<?> fv0Var) {
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        g gVar = new g();
        if (hVar.e != null) {
            gVar.c();
        }
        if (hVar.f != null) {
            gVar.z = new msw<>();
        }
        int i = hVar.t;
        boolean z = false;
        boolean z2 = true;
        int i2 = 1;
        int i3 = 1;
        boolean z3 = true;
        int i4 = 1;
        if (fv0Var != null && hVar.D(i) > 0) {
            int iE = hVar.v;
            while (iE > 0 && !hVar.w(iE)) {
                iE = hVar.E(hVar.b, iE);
            }
            if (iE >= 0 && hVar.w(iE)) {
                Object objC = hVar.C(iE);
                int i5 = iE + 1;
                int iS = hVar.s(iE) + iE;
                int iD = z;
                while (i5 < iS) {
                    int iS2 = hVar.s(i5) + i5;
                    if (iS2 > i) {
                        break;
                    }
                    iD += hVar.w(i5) ? i2 : hVar.D(i5);
                    i5 = iS2;
                }
                int iD2 = hVar.w(i) ? i3 : hVar.D(i);
                fv0Var.h(objC);
                fv0Var.d(iD, iD2);
                fv0Var.j();
            }
        }
        h hVarE = gVar.e();
        try {
            hVarE.d();
            hVarE.Q(126665345, z6wVar.a, z, c0042a);
            h.x(hVarE);
            hVarE.S(z6wVar.b);
            ?? B = hVar.B(z6wVar.e, hVarE);
            hVarE.L();
            hVarE.i();
            hVarE.j();
            hVarE.e(z2);
            y6w y6wVar = new y6w(gVar);
            if (!B.isEmpty()) {
                int size = B.size();
                for (?? r5 = z; r5 < size; r5++) {
                    l00 l00Var = (l00) B.get(r5);
                    if (gVar.f(l00Var)) {
                        int iB = gVar.b(l00Var);
                        int iC = j1a0.c(gVar.a, iB);
                        int i6 = iB + i4;
                        if (((i6 < gVar.b ? gVar.a[(i6 * 5) + 4] : gVar.c.length) - iC > 0 ? gVar.c[iC] : c0042a) instanceof e) {
                            a aVar = new a(t2bVar, z6wVar);
                            h hVarE2 = gVar.e();
                            try {
                                e.a.a(hVarE2, B, aVar);
                                Unit unit = Unit.a;
                                return y6wVar;
                            } finally {
                                hVarE2.e(z);
                            }
                        }
                    }
                }
            }
            return y6wVar;
        } catch (Throwable th) {
            hVarE.e(z);
            throw th;
        }
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iH = Intrinsics.h(((j0p) list.get(i3)).b, i);
            if (iH < 0) {
                i2 = i3 + 1;
            } else {
                if (iH <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Object f(Object obj, Object obj2, Object obj3) {
        v9p v9pVar = obj instanceof v9p ? (v9p) obj : null;
        if (v9pVar == null) {
            return null;
        }
        Object obj4 = v9pVar.b;
        Object obj5 = v9pVar.a;
        if (Intrinsics.g(obj5, obj2) && Intrinsics.g(obj4, obj3)) {
            return obj;
        }
        Object objF = f(obj5, obj2, obj3);
        return objF == null ? f(obj4, obj2, obj3) : objF;
    }

    public static final void g(h hVar, int i, Object obj) {
        int iG = hVar.g(i);
        Object[] objArr = hVar.c;
        Object obj2 = objArr[iG];
        objArr[iG] = androidx.compose.runtime.a.C0041a.a;
        if (obj == obj2) {
            return;
        }
        b("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void h(ArrayList arrayList, int i, int i2) {
        int iE = e(i, arrayList);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList.size() && ((j0p) arrayList.get(iE)).b < i2) {
        }
    }

    public static final class a implements rj40 {
        public final /* synthetic */ t2b a;
        public final /* synthetic */ z6w b;

        public a(t2b t2bVar, z6w z6wVar) {
            this.a = t2bVar;
            this.b = z6wVar;
        }

        @Override // defpackage.rj40
        public final void a(Object obj) {
        }

        @Override // defpackage.rj40
        public final k0p n(e eVar, Object obj) {
            k0p k0pVarN;
            t2b t2bVar = this.a;
            rj40 rj40Var = t2bVar instanceof rj40 ? (rj40) t2bVar : null;
            if (rj40Var == null || (k0pVarN = rj40Var.n(eVar, obj)) == null) {
                k0pVarN = k0p.a;
            }
            if (k0pVarN != k0p.a) {
                return k0pVarN;
            }
            z6w z6wVar = this.b;
            z6wVar.f = CollectionsKt.j0(z6wVar.f, new Pair(eVar, obj));
            return k0p.b;
        }

        @Override // defpackage.rj40
        public final void c() {
        }
    }
}
