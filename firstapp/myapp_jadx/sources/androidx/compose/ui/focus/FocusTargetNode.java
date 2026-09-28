package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.d;
import defpackage.b5i;
import defpackage.dq40;
import defpackage.duw;
import defpackage.gmn;
import defpackage.ib5;
import defpackage.j5i;
import defpackage.k5i;
import defpackage.kna;
import defpackage.l3w;
import defpackage.m5i;
import defpackage.mfy;
import defpackage.n8;
import defpackage.nfy;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.qlr;
import defpackage.s4i;
import defpackage.tkd;
import defpackage.tsr;
import defpackage.uhc;
import defpackage.uwx;
import defpackage.v4i;
import defpackage.w3i;
import defpackage.w4i;
import defpackage.wkn;
import defpackage.wwx;
import defpackage.x4i;
import defpackage.y4i;
import defpackage.yma;
import defpackage.z4i;
import defpackage.zma;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends d.c implements yma, m5i, mfy, l3w {
    public final Function2<j5i, j5i, Unit> D;
    public boolean E;
    public boolean F;
    public final int G;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lp3w;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FocusTargetElement extends p3w<FocusTargetNode> {
        public static final FocusTargetElement b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // defpackage.p3w
        public final d.c a() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // defpackage.p3w
        public final void d(d.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ dq40<v4i> a;
        public final /* synthetic */ FocusTargetNode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dq40<v4i> dq40Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.a = dq40Var;
            this.b = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, y4i] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.a = this.b.q2();
            return Unit.a;
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    public FocusTargetNode(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.D = (i2 & 2) != 0 ? null : function2;
        this.G = i;
    }

    @Override // defpackage.m5i
    public final boolean D(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zE = false;
            if (!q2().a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = n8.d(this, i).ordinal();
            if (iOrdinal == 0) {
                zE = n8.e(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zE = true;
                } else if (iOrdinal != 3) {
                    throw new uwx();
                }
            }
            Trace.endSection();
            return zE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        int iOrdinal = V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                uhc.a();
                return;
            }
        }
        s4i focusOwner = pkd.g(this).getFocusOwner();
        focusOwner.p(8, true, false);
        focusOwner.i();
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        if (V().a()) {
            pkd.g(this).getFocusOwner().p(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void p2(j5i j5iVar, j5i j5iVar2) {
        wwx wwxVar;
        Function2<j5i, j5i, Unit> function2;
        s4i focusOwner = pkd.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeF = focusOwner.f();
        if (!j5iVar.equals(j5iVar2) && (function2 = this.D) != null) {
            function2.invoke(j5iVar, j5iVar2);
        }
        d.c cVar = this.a;
        if (!cVar.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar2 = this.a;
        tsr tsrVarF = pkd.f(this);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 5120) != 0) {
                while (cVar2 != null) {
                    int i = cVar2.c;
                    if ((i & 5120) != 0) {
                        if (cVar2 != cVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? C = cVar2;
                            ?? duwVar = 0;
                            while (C != 0) {
                                if (C instanceof w3i) {
                                    w3i w3iVar = (w3i) C;
                                    if (focusTargetNodeF == focusOwner.f()) {
                                        w3iVar.E1(j5iVar2);
                                    }
                                } else if ((C.c & 4096) != 0 && (C instanceof tkd)) {
                                    d.c cVar3 = ((tkd) C).E;
                                    int i2 = 0;
                                    C = C;
                                    duwVar = duwVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                duwVar = duwVar;
                                                C = cVar3;
                                            } else {
                                                if (duwVar == 0) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar.b(C);
                                                    C = 0;
                                                }
                                                duwVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = pkd.c(duwVar);
                            }
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final y4i q2() {
        boolean z;
        wwx wwxVar;
        y4i y4iVar = new y4i();
        y4iVar.a = true;
        b5i b5iVar = b5i.b;
        y4iVar.b = b5iVar;
        y4iVar.c = b5iVar;
        y4iVar.d = b5iVar;
        y4iVar.e = b5iVar;
        y4iVar.f = b5iVar;
        y4iVar.g = b5iVar;
        y4iVar.h = b5iVar;
        y4iVar.i = b5iVar;
        y4iVar.j = w4i.a;
        y4iVar.k = x4i.a;
        int i = this.G;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((gmn) zma.a(this, kna.m)).a() == 1);
        } else {
            if (i != 2) {
                ib5.a("Unknown Focusability");
                return null;
            }
            z = false;
        }
        y4iVar.a = z;
        d.c cVar = this.a;
        if (!cVar.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar2 = this.a;
        tsr tsrVarF = pkd.f(this);
        loop0: while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 3072) != 0) {
                while (cVar2 != null) {
                    int i2 = cVar2.c;
                    if ((i2 & 3072) != 0) {
                        if (cVar2 != cVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? duwVar = 0;
                            ?? C = cVar2;
                            while (C != 0) {
                                if (C instanceof z4i) {
                                    ((z4i) C).b0(y4iVar);
                                } else if ((C.c & 2048) != 0 && (C instanceof tkd)) {
                                    d.c cVar3 = ((tkd) C).E;
                                    int i3 = 0;
                                    while (cVar3 != null) {
                                        if ((cVar3.c & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                C = C;
                                                duwVar = duwVar;
                                                duwVar = duwVar;
                                                C = cVar3;
                                            } else {
                                                if (duwVar == 0) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar.b(C);
                                                    C = 0;
                                                }
                                                duwVar.b(cVar3);
                                            }
                                        } else {
                                            C = C;
                                            duwVar = duwVar;
                                        }
                                        cVar3 = cVar3.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i3 == 1) {
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
                    cVar2 = cVar2.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        return y4iVar;
    }

    @Override // defpackage.m5i
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public final k5i V() {
        wwx wwxVar;
        if (!this.C) {
            return k5i.d;
        }
        s4i focusOwner = pkd.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeF = focusOwner.f();
        if (focusTargetNodeF == null) {
            return k5i.d;
        }
        if (this == focusTargetNodeF) {
            return focusOwner.l() ? k5i.c : k5i.a;
        }
        if (focusTargetNodeF.C) {
            if (!focusTargetNodeF.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeF.a.e;
            tsr tsrVarF = pkd.f(focusTargetNodeF);
            while (tsrVarF != null) {
                if ((tsrVarF.U.f.d & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 1024) != 0) {
                            d.c cVarC = cVar;
                            duw duwVar = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVarC)) {
                                        return k5i.b;
                                    }
                                } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                    int i = 0;
                                    for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                        if ((cVar2.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVarC = cVar2;
                                            } else {
                                                if (duwVar == null) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                tsrVarF = tsrVarF.H();
                cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
            }
        }
        return k5i.d;
    }

    public final void s2() {
        int iOrdinal = V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                uhc.a();
                return;
            }
        }
        dq40 dq40Var = new dq40();
        nfy.a(this, new a(dq40Var, this));
        T t = dq40Var.a;
        if (t == 0) {
            Intrinsics.n("focusProperties");
            throw null;
        }
        if (((v4i) t).d()) {
            return;
        }
        pkd.g(this).getFocusOwner().t(true);
    }

    @Override // defpackage.mfy
    public final void t0() {
        s2();
    }
}
