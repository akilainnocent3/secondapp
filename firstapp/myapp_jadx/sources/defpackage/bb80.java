package defpackage;

import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public final class bb80 {
    public final d.c a;
    public final boolean b;
    public final tsr c;
    public final sa80 d;
    public boolean e;
    public bb80 f;
    public final int g;

    public static final class a extends d.c implements ya80 {
        public final /* synthetic */ Function1<pb80, Unit> D;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super pb80, Unit> function1) {
            this.D = function1;
        }

        @Override // defpackage.ya80
        public final void G0(pb80 pb80Var) {
            this.D.invoke(pb80Var);
        }
    }

    public bb80(d.c cVar, boolean z, tsr tsrVar, sa80 sa80Var) {
        this.a = cVar;
        this.b = z;
        this.c = tsrVar;
        this.d = sa80Var;
        this.g = tsrVar.b;
    }

    public static /* synthetic */ List j(int i, bb80 bb80Var) {
        return bb80Var.i((i & 1) != 0 ? !bb80Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final lk40 a(ywx ywxVar) {
        ?? C;
        bb80 bb80VarL = l();
        if (bb80VarL == null) {
            return lk40.e;
        }
        d.c cVar = bb80VarL.c.U.f;
        if ((cVar.d & 8) == 0) {
            C = 0;
            break;
        }
        loop0: while (true) {
            if (cVar != null) {
                if ((cVar.c & 8) != 0) {
                    C = cVar;
                    ?? duwVar = 0;
                    while (C != 0) {
                        if (C instanceof ya80) {
                            if (((ya80) C).E()) {
                                break loop0;
                            }
                        } else if ((C.c & 8) != 0 && (C instanceof tkd)) {
                            d.c cVar2 = ((tkd) C).E;
                            int i = 0;
                            while (cVar2 != null) {
                                if ((cVar2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        C = C;
                                        duwVar = duwVar;
                                        duwVar = duwVar;
                                        C = cVar2;
                                    } else {
                                        if (duwVar == 0) {
                                            duwVar = new duw(new d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar.b(C);
                                            C = 0;
                                        }
                                        duwVar.b(cVar2);
                                    }
                                } else {
                                    C = C;
                                    duwVar = duwVar;
                                }
                                cVar2 = cVar2.f;
                                C = C;
                                duwVar = duwVar;
                            }
                            if (i == 1) {
                                C = C;
                                duwVar = duwVar;
                            } else {
                                C = C;
                                duwVar = duwVar;
                            }
                        }
                        C = pkd.c(duwVar);
                    }
                }
                if ((cVar.d & 8) != 0) {
                    cVar = cVar.f;
                }
            }
            C = 0;
            break;
        }
        ya80 ya80Var = (ya80) C;
        ywx ywxVarD = ya80Var != null ? pkd.d(ya80Var, 8) : null;
        return ywxVarD == null ? bb80VarL.a(ywxVar) : ywxVarD.P(ywxVar, true);
    }

    public final bb80 b(su50 su50Var, Function1<? super pb80, Unit> function1) {
        sa80 sa80Var = new sa80();
        sa80Var.c = false;
        sa80Var.d = false;
        function1.invoke(sa80Var);
        bb80 bb80Var = new bb80(new a(function1), false, new tsr(this.g + (su50Var != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000), true), sa80Var);
        bb80Var.e = true;
        bb80Var.f = this;
        return bb80Var;
    }

    public final void c(tsr tsrVar, ArrayList arrayList) {
        duw<tsr> duwVarJ = tsrVar.J();
        tsr[] tsrVarArr = duwVarJ.a;
        int i = duwVarJ.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            if (tsrVar2.e() && !tsrVar2.f0) {
                if (tsrVar2.U.c(8)) {
                    arrayList.add(db80.a(tsrVar2, this.b));
                } else {
                    c(tsrVar2, arrayList);
                }
            }
        }
    }

    public final ywx d() {
        if (!this.e) {
            ya80 ya80VarF = f();
            return ya80VarF != null ? pkd.d(ya80VarF, 8) : this.c.U.c;
        }
        bb80 bb80VarL = l();
        if (bb80VarL != null) {
            return bb80VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            bb80 bb80Var = (bb80) arrayList.get(size2);
            if (bb80Var.n()) {
                arrayList2.add(bb80Var);
            } else if (!bb80Var.d.d) {
                bb80Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    public final ya80 f() {
        ?? C;
        boolean z = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        tsr tsrVar = this.c;
        if (!z) {
            d.c cVar = tsrVar.U.f;
            if ((cVar.d & 8) != 0) {
                loop3: while (cVar != null) {
                    if ((cVar.c & 8) != 0) {
                        C = cVar;
                        ?? duwVar = 0;
                        while (true) {
                            if (C != 0) {
                                if (C instanceof ya80) {
                                    if (((ya80) C).E()) {
                                        r4 = C;
                                    }
                                } else if ((C.c & 8) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                C = C;
                                                duwVar = duwVar;
                                                duwVar = duwVar;
                                                C = cVar2;
                                            } else {
                                                if (duwVar == 0) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar.b(C);
                                                    C = 0;
                                                }
                                                duwVar.b(cVar2);
                                            }
                                        } else {
                                            C = C;
                                            duwVar = duwVar;
                                        }
                                        cVar2 = cVar2.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i == 1) {
                                        C = C;
                                        duwVar = duwVar;
                                    } else {
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                }
                                C = pkd.c(duwVar);
                            }
                        }
                    }
                    if ((cVar.d & 8) == 0) {
                        break;
                    }
                    cVar = cVar.f;
                }
            }
        } else {
            d.c cVar3 = tsrVar.U.f;
            if ((cVar3.d & 8) != 0) {
                C = 0;
                while (cVar3 != null) {
                    if ((cVar3.c & 8) != 0) {
                        ?? C2 = cVar3;
                        ?? duwVar2 = 0;
                        while (C2 != 0) {
                            if (C2 instanceof ya80) {
                                ya80 ya80Var = (ya80) C2;
                                if (ya80Var.E()) {
                                    if (ya80Var.Y1()) {
                                        return ya80Var;
                                    }
                                    if (C == 0) {
                                        C = ya80Var;
                                    }
                                }
                            } else if ((C2.c & 8) != 0 && (C2 instanceof tkd)) {
                                d.c cVar4 = ((tkd) C2).E;
                                int i2 = 0;
                                while (cVar4 != null) {
                                    if ((cVar4.c & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            C2 = C2;
                                            duwVar2 = duwVar2;
                                            duwVar2 = duwVar2;
                                            C2 = cVar4;
                                        } else {
                                            if (duwVar2 == 0) {
                                                duwVar2 = new duw(new d.c[16]);
                                            }
                                            if (C2 != 0) {
                                                duwVar2.b(C2);
                                                C2 = 0;
                                            }
                                            duwVar2.b(cVar4);
                                        }
                                    } else {
                                        C2 = C2;
                                        duwVar2 = duwVar2;
                                    }
                                    cVar4 = cVar4.f;
                                    C2 = C2;
                                    duwVar2 = duwVar2;
                                }
                                if (i2 == 1) {
                                    C2 = C2;
                                    duwVar2 = duwVar2;
                                } else {
                                    C2 = C2;
                                    duwVar2 = duwVar2;
                                }
                            }
                            C2 = pkd.c(duwVar2);
                        }
                    }
                    if ((cVar3.d & 8) == 0) {
                        break;
                    }
                    cVar3 = cVar3.f;
                    C = C;
                }
                r4 = C;
            }
        }
        return (ya80) r4;
    }

    public final lk40 g() {
        ywx ywxVarD = d();
        if (ywxVarD != null) {
            if (!ywxVarD.E1().C) {
                ywxVarD = null;
            }
            if (ywxVarD != null) {
                return eb9.c(ywxVarD).P(ywxVarD, true);
            }
        }
        return lk40.e;
    }

    public final lk40 h() {
        ywx ywxVarD = d();
        if (ywxVarD != null) {
            if (!ywxVarD.E1().C) {
                ywxVarD = null;
            }
            if (ywxVarD != null) {
                return eb9.b(ywxVarD);
            }
        }
        return lk40.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final sa80 k() {
        boolean zN = n();
        sa80 sa80Var = this.d;
        if (!zN) {
            return sa80Var;
        }
        sa80 sa80VarC = sa80Var.c();
        p(new ArrayList(), sa80VarC);
        return sa80VarC;
    }

    public final bb80 l() {
        tsr tsrVarH;
        bb80 bb80Var = this.f;
        if (bb80Var != null) {
            return bb80Var;
        }
        tsr tsrVar = this.c;
        boolean z = this.b;
        if (!z) {
            tsrVarH = null;
            break;
        }
        tsrVarH = tsrVar.H();
        while (true) {
            if (tsrVarH == null) {
                tsrVarH = null;
                break;
            }
            sa80 sa80VarF = tsrVarH.f();
            if (sa80VarF != null && sa80VarF.c) {
                break;
            }
            tsrVarH = tsrVarH.H();
        }
        if (tsrVarH == null) {
            for (tsr tsrVarH2 = tsrVar.H(); tsrVarH2 != null; tsrVarH2 = tsrVarH2.H()) {
                if (tsrVarH2.U.c(8)) {
                    tsrVarH = tsrVarH2;
                }
            }
            tsrVarH = null;
        }
        if (tsrVarH == null) {
            return null;
        }
        return db80.a(tsrVarH, z);
    }

    public final List<bb80> m() {
        return j(4, this);
    }

    public final boolean n() {
        return this.b && this.d.c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        tsr tsrVarH = this.c.H();
        while (tsrVarH != null) {
            sa80 sa80VarF = tsrVarH.f();
            if (sa80VarF != null && sa80VarF.c) {
                if (tsrVarH == null) {
                    return true;
                }
                return false;
            }
            tsrVarH = tsrVarH.H();
        }
        tsrVarH = null;
        if (tsrVarH == null) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList, sa80 sa80Var) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            bb80 bb80Var = (bb80) arrayList.get(size2);
            if (!bb80Var.n()) {
                sa80Var.f(bb80Var.d);
                bb80Var.p(arrayList, sa80Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return m2g.a;
        }
        c(this.c, arrayList);
        if (z) {
            ob80<su50> ob80Var = hb80.x;
            sa80 sa80Var = this.d;
            su50 su50Var = (su50) ta80.a(sa80Var, ob80Var);
            if (su50Var != null && sa80Var.c && !arrayList.isEmpty()) {
                arrayList.add(b(su50Var, new za80(su50Var)));
            }
            ob80<List<String>> ob80Var2 = hb80.a;
            if (sa80Var.a.b(ob80Var2) && !arrayList.isEmpty() && sa80Var.c) {
                List list = (List) ta80.a(sa80Var, ob80Var2);
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new ab80(str)));
                }
            }
        }
        return arrayList;
    }
}
