package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t5i extends tkd implements ya80, l2l, yma, mfy, hvg0 {
    public static final a L = new a();
    public psw F;
    public final Function1<Boolean, Unit> G;
    public c4i H;
    public j610.a I;
    public ywx J;
    public final m5i K;

    public static final class a {
    }

    public /* synthetic */ class b extends saj implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((t5i) this.receiver).K.D(7));
        }
    }

    @c0d(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {316}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ psw b;
        public final /* synthetic */ xxo c;
        public final /* synthetic */ wse d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(psw pswVar, xxo xxoVar, wse wseVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = pswVar;
            this.c = xxoVar;
            this.d = wseVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.a(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wse wseVar = this.d;
            if (wseVar != null) {
                wseVar.dispose();
            }
            return Unit.a;
        }
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        boolean zA = this.K.V().a();
        ohp<Object>[] ohpVarArr = lb80.a;
        ob80<Boolean> ob80Var = hb80.k;
        ohp<Object> ohpVar = lb80.a[4];
        pb80Var.b(ob80Var, Boolean.valueOf(zA));
        pb80Var.b(ra80.v, new c6(null, new b(0, this, t5i.class, "requestFocus", "requestFocus()Z", 0)));
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return L;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        j610.a aVar = this.I;
        if (aVar != null) {
            aVar.release();
        }
        this.I = null;
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        w5i w5iVarT2;
        this.J = ywxVar;
        if (this.K.V().a()) {
            if (!ywxVar.E1().C) {
                w5i w5iVarT3 = t2();
                if (w5iVarT3 != null) {
                    w5iVarT3.p2(null);
                    return;
                }
                return;
            }
            ywx ywxVar2 = this.J;
            if (ywxVar2 == null || !ywxVar2.E1().C || (w5iVarT2 = t2()) == null) {
                return;
            }
            w5iVarT2.p2(this.J);
        }
    }

    public final void s2(final psw pswVar, final xxo xxoVar) {
        if (!this.C) {
            pswVar.c(xxoVar);
        } else {
            c9p c9pVar = (c9p) ((j1b) d2()).a.get(c9p.b.a);
            ej5.c(d2(), null, null, new c(pswVar, xxoVar, c9pVar != null ? c9pVar.invokeOnCompletion(new Function1() { // from class: r5i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    pswVar.c(xxoVar);
                    return Unit.a;
                }
            }) : null, null), 3);
        }
    }

    @Override // defpackage.mfy
    public final void t0() {
        dq40 dq40Var = new dq40();
        nfy.a(this, new s5i(dq40Var, this));
        j610 j610Var = (j610) dq40Var.a;
        if (this.K.V().a()) {
            j610.a aVar = this.I;
            if (aVar != null) {
                aVar.release();
            }
            this.I = j610Var != null ? j610Var.a() : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final w5i t2() {
        hvg0 hvg0Var;
        wwx wwxVar;
        if (this.C) {
            if (!this.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = this.a.e;
            tsr tsrVarF = pkd.f(this);
            loop0: while (true) {
                if (tsrVarF == null) {
                    hvg0Var = null;
                    break;
                }
                if ((tsrVarF.U.f.d & 262144) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 262144) != 0) {
                            ?? C = cVar;
                            ?? duwVar = 0;
                            while (C != 0) {
                                if (C instanceof hvg0) {
                                    hvg0Var = (hvg0) C;
                                    if (w5i.F == hvg0Var.J()) {
                                        break loop0;
                                    }
                                } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    C = C;
                                    duwVar = duwVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                        }
                                        cVar2 = cVar2.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                C = pkd.c(duwVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                tsrVarF = tsrVarF.H();
                cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
            }
            if (hvg0Var instanceof w5i) {
                return (w5i) hvg0Var;
            }
        }
        return null;
    }

    public final void u2(psw pswVar) {
        c4i c4iVar;
        if (Intrinsics.g(this.F, pswVar)) {
            return;
        }
        psw pswVar2 = this.F;
        if (pswVar2 != null && (c4iVar = this.H) != null) {
            pswVar2.c(new d4i(c4iVar));
        }
        this.H = null;
        this.F = pswVar;
    }

    public t5i(psw pswVar, int i, g2.b bVar) {
        this.F = pswVar;
        this.G = bVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new u5i(2, this, t5i.class, "onFocusStateChange", sgwpmp.gGM, 0), 4);
        p2(focusTargetNode);
        this.K = focusTargetNode;
    }
}
