package defpackage;

import androidx.compose.ui.d;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class obl0 {
    public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", AnalyticsParam.EVENT_PARAM_USER_ID, "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", yFmFZvuWxAYfEj.LVkTJv, "_lgclid", "_sno", yFmFZvuWxAYfEj.LVkTJv};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [hvg0, java.lang.Object, okd] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final hvg0 a(hvg0 hvg0Var) {
        wwx wwxVar;
        d.c cVar = (d.c) hvg0Var;
        if (!cVar.a.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar2 = cVar.a.e;
        tsr tsrVarF = pkd.f(hvg0Var);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.c & 262144) != 0) {
                        ?? C = cVar2;
                        ?? duwVar = 0;
                        while (C != 0) {
                            if (C instanceof hvg0) {
                                hvg0 hvg0Var2 = (hvg0) C;
                                if (Intrinsics.g(hvg0Var.J(), hvg0Var2.J()) && hvg0Var.getClass() == hvg0Var2.getClass()) {
                                    return hvg0Var2;
                                }
                            } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                d.c cVar3 = ((tkd) C).E;
                                int i = 0;
                                C = C;
                                duwVar = duwVar;
                                while (cVar3 != null) {
                                    if ((cVar3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            C = pkd.c(duwVar);
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.d$c] */
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
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void b(okd okdVar, Object obj, Function1 function1) {
        wwx wwxVar;
        if (!okdVar.i().C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar = okdVar.i().e;
        tsr tsrVarF = pkd.f(okdVar);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 262144) != 0) {
                        ?? C = cVar;
                        ?? duwVar = 0;
                        while (C != 0) {
                            if (C instanceof hvg0) {
                                hvg0 hvg0Var = (hvg0) C;
                                if (!(Intrinsics.g(obj, hvg0Var.J()) ? ((Boolean) function1.invoke(hvg0Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                d.c cVar2 = ((tkd) C).E;
                                int i = 0;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 262144) != 0) {
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
                    cVar = cVar.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [hvg0, java.lang.Object, okd] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void c(hvg0 hvg0Var, Function1 function1) {
        wwx wwxVar;
        d.c cVar = (d.c) hvg0Var;
        if (!cVar.a.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar2 = cVar.a.e;
        tsr tsrVarF = pkd.f(hvg0Var);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.c & 262144) != 0) {
                        ?? C = cVar2;
                        ?? duwVar = 0;
                        while (C != 0) {
                            boolean zBooleanValue = true;
                            if (C instanceof hvg0) {
                                hvg0 hvg0Var2 = (hvg0) C;
                                if (Intrinsics.g(hvg0Var.J(), hvg0Var2.J()) && hvg0Var.getClass() == hvg0Var2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(hvg0Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                d.c cVar3 = ((tkd) C).E;
                                int i = 0;
                                while (cVar3 != null) {
                                    if ((cVar3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
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
                    cVar2 = cVar2.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void d(hvg0 hvg0Var, Function1 function1) {
        if (!hvg0Var.i().C) {
            wkn.c("visitSubtreeIf called on an unattached node");
        }
        duw duwVar = new duw(new d.c[16]);
        d.c cVar = hvg0Var.i().f;
        if (cVar == null) {
            pkd.a(duwVar, hvg0Var.i());
        } else {
            duwVar.b(cVar);
        }
        while (true) {
            int i = duwVar.c;
            if (i == 0) {
                return;
            }
            d.c cVar2 = (d.c) duwVar.k(i - 1);
            if ((cVar2.d & 262144) != 0) {
                d.c cVar3 = cVar2;
                while (true) {
                    if (cVar3 != null) {
                        if ((cVar3.c & 262144) != 0) {
                            ?? C = cVar3;
                            ?? duwVar2 = 0;
                            while (C != 0) {
                                if (C instanceof hvg0) {
                                    hvg0 hvg0Var2 = (hvg0) C;
                                    gvg0 gvg0Var = (Intrinsics.g(hvg0Var.J(), hvg0Var2.J()) && hvg0Var.getClass() == hvg0Var2.getClass()) ? (gvg0) function1.invoke(hvg0Var2) : gvg0.a;
                                    if (gvg0Var != gvg0.c) {
                                        if (gvg0Var == gvg0.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                    d.c cVar4 = ((tkd) C).E;
                                    int i2 = 0;
                                    C = C;
                                    duwVar2 = duwVar2;
                                    while (cVar4 != null) {
                                        if ((cVar4.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                duwVar2 = duwVar2;
                                                C = cVar4;
                                            } else {
                                                if (duwVar2 == 0) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar2.b(C);
                                                    C = 0;
                                                }
                                                duwVar2.b(cVar4);
                                            }
                                        }
                                        cVar4 = cVar4.f;
                                        C = C;
                                        duwVar2 = duwVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = pkd.c(duwVar2);
                            }
                        }
                        cVar3 = cVar3.f;
                    }
                }
            }
            pkd.a(duwVar, cVar2);
        }
    }
}
