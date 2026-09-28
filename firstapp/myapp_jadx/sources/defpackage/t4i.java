package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class t4i implements s4i {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final i4i d;
    public wsw f;
    public FocusTargetNode h;
    public final FocusTargetNode c = new FocusTargetNode(2, null, 6);
    public final FocusOwnerImpl$modifier$1 e = new p3w<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.p3w
        public final d.c a() {
            return this.b.c;
        }

        @Override // defpackage.p3w
        public final void d(d.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.b.c.hashCode();
        }
    };
    public final etw<j4i> g = new etw<>(1);

    public static final class a extends qlr implements Function1<FocusTargetNode, Boolean> {
        public final /* synthetic */ FocusTargetNode a;
        public final /* synthetic */ t4i b;
        public final /* synthetic */ Function1<FocusTargetNode, Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, t4i t4iVar, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.a = focusTargetNode;
            this.b = t4iVar;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if (Intrinsics.g(focusTargetNode2, this.a)) {
                zBooleanValue = false;
            } else {
                if (Intrinsics.g(focusTargetNode2, this.b.c)) {
                    ib5.a("Focus search landed at the root.");
                    return null;
                }
                zBooleanValue = this.c.invoke(focusTargetNode2).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    public static final class b extends qlr implements Function1<FocusTargetNode, Boolean> {
        public final /* synthetic */ dq40<Boolean> a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dq40<Boolean> dq40Var, int i) {
            super(1);
            this.a = dq40Var;
            this.b = i;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Boolean] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            ?? ValueOf = Boolean.valueOf(focusTargetNode.D(this.b));
            this.a.a = ValueOf;
            return ValueOf;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public t4i(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new i4i(this, androidComposeView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v1, types: [t4i$a] */
    @Override // defpackage.s4i
    public final Boolean a(int i, lk40 lk40Var, Function1<? super FocusTargetNode, Boolean> function1) {
        Boolean bool;
        boolean zA;
        Object obj;
        wwx wwxVar;
        ?? r2;
        FocusTargetNode focusTargetNode = this.c;
        FocusTargetNode focusTargetNodeA = p5i.a(focusTargetNode);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        if (focusTargetNodeA != null) {
            asr layoutDirection = androidComposeView.getLayoutDirection();
            bool = null;
            y4i y4iVarQ2 = focusTargetNodeA.q2();
            b5i b5iVar = y4iVarQ2.h;
            b5i b5iVar2 = y4iVarQ2.i;
            if (i == 1) {
                b5iVar = y4iVarQ2.b;
            } else if (i == 2) {
                b5iVar = y4iVarQ2.c;
            } else if (i == 5) {
                b5iVar = y4iVarQ2.d;
            } else if (i == 6) {
                b5iVar = y4iVarQ2.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    b5iVar = b5iVar2;
                }
                if (b5iVar == b5i.b) {
                    b5iVar = null;
                }
                if (b5iVar == null) {
                    b5iVar = y4iVarQ2.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    b5iVar = b5iVar2;
                } else if (iOrdinal2 != 1) {
                    uhc.a();
                    return null;
                }
                if (b5iVar == b5i.b) {
                    b5iVar = null;
                }
                if (b5iVar == null) {
                    b5iVar = y4iVarQ2.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    ib5.a("invalid FocusDirection");
                    return null;
                }
                pb6 pb6Var = new pb6(i);
                s4i focusOwner = pkd.g(focusTargetNodeA).getFocusOwner();
                FocusTargetNode focusTargetNodeF = focusOwner.f();
                if (i == 7) {
                    y4iVarQ2.j.invoke(pb6Var);
                } else {
                    y4iVarQ2.k.invoke(pb6Var);
                }
                if (pb6Var.b) {
                    b5iVar = b5i.c;
                } else {
                    b5iVar = focusTargetNodeF != focusOwner.f() ? b5i.d : b5i.b;
                }
            }
            if (!Intrinsics.g(b5iVar, b5i.c)) {
                if (Intrinsics.g(b5iVar, b5i.d)) {
                    FocusTargetNode focusTargetNodeA2 = p5i.a(focusTargetNode);
                    if (focusTargetNodeA2 != null) {
                        return function1.invoke(focusTargetNodeA2);
                    }
                } else if (!Intrinsics.g(b5iVar, b5i.b)) {
                    return Boolean.valueOf(b5iVar.a(function1));
                }
            }
            return bool;
        }
        bool = null;
        focusTargetNodeA = null;
        asr layoutDirection2 = androidComposeView.getLayoutDirection();
        ?? aVar = new a(focusTargetNodeA, this, function1);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = mqy.b(focusTargetNode, aVar);
            } else {
                if (i != 2) {
                    ib5.a("This function should only be used for 1-D focus search");
                    return bool;
                }
                zA = mqy.a(focusTargetNode, aVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return hoc0.k(i, aVar, lk40Var, focusTargetNode);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    uhc.a();
                    return bool;
                }
                i2 = 3;
            }
            FocusTargetNode focusTargetNodeA3 = p5i.a(focusTargetNode);
            if (focusTargetNodeA3 != null) {
                return hoc0.k(i2, aVar, lk40Var, focusTargetNodeA3);
            }
            return bool;
        }
        if (i != 8) {
            s52.a(t3i.a(i), "Focus search invoked with invalid FocusDirection ");
            return bool;
        }
        FocusTargetNode focusTargetNodeA4 = p5i.a(focusTargetNode);
        boolean zBooleanValue = false;
        if (focusTargetNodeA4 != null) {
            if (!focusTargetNodeA4.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            Object obj2 = focusTargetNodeA4.a.e;
            tsr tsrVarF = pkd.f(focusTargetNodeA4);
            loop0: while (true) {
                if (tsrVarF == null) {
                    obj = bool;
                    break;
                }
                if ((tsrVarF.U.f.d & 1024) != 0) {
                    while (r2 != 0) {
                        if ((r2.c & 1024) != 0) {
                            ?? C = r2;
                            ?? duwVar = bool;
                            while (C != 0) {
                                if (C instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) C;
                                    if (focusTargetNode2.q2().a) {
                                        obj = focusTargetNode2;
                                        break loop0;
                                    }
                                } else if ((C.c & 1024) != 0 && (C instanceof tkd)) {
                                    d.c cVar = ((tkd) C).E;
                                    int i3 = 0;
                                    while (cVar != null) {
                                        if ((cVar.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                C = C;
                                                duwVar = duwVar;
                                                duwVar = duwVar;
                                                C = cVar;
                                            } else {
                                                if (duwVar == 0) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar.b(C);
                                                    C = bool;
                                                }
                                                duwVar.b(cVar);
                                            }
                                        } else {
                                            C = C;
                                            duwVar = duwVar;
                                        }
                                        cVar = cVar.f;
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
                        r2 = r2.e;
                    }
                }
                r2 = obj2;
                tsrVarF = tsrVarF.H();
                obj2 = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? bool : wwxVar.e;
            }
        } else {
            obj = bool;
            break;
        }
        if (obj != null && obj != focusTargetNode) {
            zBooleanValue = ((Boolean) aVar.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.s4i
    public final void b(w3i w3iVar) {
        i4i i4iVar = this.d;
        if (i4iVar.d.d(w3iVar)) {
            i4iVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.k4i
    public final boolean c(int i) {
        boolean zC;
        View viewB;
        dq40 dq40Var = new dq40();
        dq40Var.a = Boolean.FALSE;
        FocusTargetNode focusTargetNode = this.h;
        AndroidComposeView androidComposeView = this.a;
        Boolean boolA = a(i, androidComposeView.getEmbeddedViewFocusRect(), new b(dq40Var, i));
        if (!Intrinsics.g(boolA, Boolean.TRUE) || focusTargetNode == this.h) {
            if (boolA != null && dq40Var.a != 0) {
                if (!boolA.booleanValue() || !((Boolean) dq40Var.a).booleanValue()) {
                    if (i == 1 || i == 2) {
                        if (p(i, false, false)) {
                            Boolean boolA2 = a(i, null, new u4i(i));
                            if (boolA2 != null ? boolA2.booleanValue() : false) {
                            }
                        }
                    } else if (i == 7 || i == 8) {
                        zC = false;
                        if (zC) {
                        }
                    } else {
                        Integer numD = x2d.d(i);
                        if (numD != null) {
                            int iIntValue = numD.intValue();
                            lk40 embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                            Rect rectB = embeddedViewFocusRect != null ? ok40.b(embeddedViewFocusRect) : null;
                            x3i x3iVar = x3i.f.get();
                            x3iVar.getClass();
                            x3i x3iVar2 = x3iVar;
                            if (rectB == null) {
                                viewB = x3iVar2.b(iIntValue, androidComposeView.findFocus(), androidComposeView);
                            } else {
                                x3iVar2.a.set(rectB);
                                Rect rect = x3iVar2.a;
                                ArrayList<View> arrayList = x3iVar2.e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        y3i.a(androidComposeView, arrayList, androidComposeView.isInTouchMode());
                                    } else {
                                        androidComposeView.addFocusables(arrayList, iIntValue, androidComposeView.isInTouchMode() ? 1 : 0);
                                    }
                                    View viewA = arrayList.isEmpty() ? null : x3iVar2.a(iIntValue, rect, null, androidComposeView, arrayList);
                                    arrayList.clear();
                                    viewB = viewA;
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (viewB != null) {
                                zC = x2d.c(viewB, Integer.valueOf(iIntValue), rectB);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                            }
                        } else {
                            ib5.a("Invalid focus direction");
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [duw] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [duw] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [duw] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.s4i
    public final boolean d(jw50 jw50Var, w40 w40Var) {
        hw50 hw50Var;
        int size;
        wwx wwxVar;
        ?? C;
        wwx wwxVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = p5i.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeA.a;
            tsr tsrVarF = pkd.f(focusTargetNodeA);
            loop0: while (true) {
                if (tsrVarF == null) {
                    C = 0;
                    break;
                }
                if ((tsrVarF.U.f.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            ?? duwVar = 0;
                            C = cVar;
                            while (C != 0) {
                                if (C instanceof hw50) {
                                    break loop0;
                                }
                                if ((C.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
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
                cVar = (tsrVarF == null || (wwxVar2 = tsrVarF.U) == null) ? null : wwxVar2.e;
            }
            hw50Var = (hw50) C;
        } else {
            hw50Var = null;
        }
        if (hw50Var != null) {
            if (!hw50Var.i().C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar3 = hw50Var.i().e;
            tsr tsrVarF2 = pkd.f(hw50Var);
            ArrayList arrayList = null;
            while (tsrVarF2 != null) {
                if ((tsrVarF2.U.f.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            d.c cVarC = cVar3;
                            duw duwVar2 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof hw50) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarC);
                                } else if ((cVarC.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (cVarC instanceof tkd)) {
                                    int i2 = 0;
                                    for (d.c cVar4 = ((tkd) cVarC).E; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarC = cVar4;
                                            } else {
                                                if (duwVar2 == null) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar2.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                tsrVarF2 = tsrVarF2.H();
                cVar3 = (tsrVarF2 == null || (wwxVar = tsrVarF2.U) == null) ? null : wwxVar.e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (!((hw50) arrayList.get(size)).p0(jw50Var)) {
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                    return true;
                }
            }
            ?? I = hw50Var.i();
            ?? duwVar3 = 0;
            while (I != 0) {
                if (I instanceof hw50) {
                    if (((hw50) I).p0(jw50Var)) {
                        return true;
                    }
                } else if ((I.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (I instanceof tkd)) {
                    d.c cVar5 = ((tkd) I).E;
                    int i4 = 0;
                    while (cVar5 != null) {
                        if ((cVar5.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i4++;
                            if (i4 == 1) {
                                duwVar3 = duwVar3;
                                I = I;
                                duwVar3 = duwVar3;
                                I = cVar5;
                            } else {
                                if (duwVar3 == 0) {
                                    duwVar3 = new duw(new d.c[16]);
                                }
                                if (I != 0) {
                                    duwVar3.b(I);
                                    I = 0;
                                }
                                duwVar3.b(cVar5);
                            }
                        } else {
                            duwVar3 = duwVar3;
                            I = I;
                        }
                        cVar5 = cVar5.f;
                        duwVar3 = duwVar3;
                        I = I;
                    }
                    if (i4 == 1) {
                        duwVar3 = duwVar3;
                        I = I;
                    } else {
                        duwVar3 = duwVar3;
                        I = I;
                    }
                }
                I = pkd.c(duwVar3);
            }
            if (!((Boolean) w40Var.invoke()).booleanValue()) {
                ?? I2 = hw50Var.i();
                ?? duwVar4 = 0;
                while (I2 != 0) {
                    if (I2 instanceof hw50) {
                        if (((hw50) I2).J0(jw50Var)) {
                        }
                    } else if ((I2.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (I2 instanceof tkd)) {
                        d.c cVar6 = ((tkd) I2).E;
                        int i5 = 0;
                        while (cVar6 != null) {
                            if ((cVar6.c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    I2 = I2;
                                    duwVar4 = duwVar4;
                                    duwVar4 = duwVar4;
                                    I2 = cVar6;
                                } else {
                                    if (duwVar4 == 0) {
                                        duwVar4 = new duw(new d.c[16]);
                                    }
                                    if (I2 != 0) {
                                        duwVar4.b(I2);
                                        I2 = 0;
                                    }
                                    duwVar4.b(cVar6);
                                }
                            } else {
                                I2 = I2;
                                duwVar4 = duwVar4;
                            }
                            cVar6 = cVar6.f;
                            I2 = I2;
                            duwVar4 = duwVar4;
                        }
                        if (i5 == 1) {
                            I2 = I2;
                            duwVar4 = duwVar4;
                        } else {
                            I2 = I2;
                            duwVar4 = duwVar4;
                        }
                    }
                    I2 = pkd.c(duwVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (!((hw50) arrayList.get(i6)).J0(jw50Var)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.s4i
    public final boolean e(KeyEvent keyEvent) {
        noa0 noa0Var;
        int size;
        wwx wwxVar;
        ?? C;
        wwx wwxVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = p5i.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeA.a;
            tsr tsrVarF = pkd.f(focusTargetNodeA);
            loop0: while (true) {
                if (tsrVarF == null) {
                    C = 0;
                    break;
                }
                if ((tsrVarF.U.f.d & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 131072) != 0) {
                            ?? duwVar = 0;
                            C = cVar;
                            while (C != 0) {
                                if (C instanceof noa0) {
                                    break loop0;
                                }
                                if ((C.c & 131072) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 131072) != 0) {
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
                cVar = (tsrVarF == null || (wwxVar2 = tsrVarF.U) == null) ? null : wwxVar2.e;
            }
            noa0Var = (noa0) C;
        } else {
            noa0Var = null;
        }
        if (noa0Var != null) {
            if (!noa0Var.i().C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar3 = noa0Var.i().e;
            tsr tsrVarF2 = pkd.f(noa0Var);
            ArrayList arrayList = null;
            while (tsrVarF2 != null) {
                if ((tsrVarF2.U.f.d & 131072) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & 131072) != 0) {
                            d.c cVarC = cVar3;
                            duw duwVar2 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof noa0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarC);
                                } else if ((cVarC.c & 131072) != 0 && (cVarC instanceof tkd)) {
                                    int i2 = 0;
                                    for (d.c cVar4 = ((tkd) cVarC).E; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarC = cVar4;
                                            } else {
                                                if (duwVar2 == null) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar2.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                tsrVarF2 = tsrVarF2.H();
                cVar3 = (tsrVarF2 == null || (wwxVar = tsrVarF2.U) == null) ? null : wwxVar.e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (!((noa0) arrayList.get(size)).P()) {
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                    return true;
                }
            }
            ?? I = noa0Var.i();
            ?? duwVar3 = 0;
            while (I != 0) {
                if (I instanceof noa0) {
                    if (((noa0) I).P()) {
                        return true;
                    }
                } else if ((I.c & 131072) != 0 && (I instanceof tkd)) {
                    d.c cVar5 = ((tkd) I).E;
                    int i4 = 0;
                    while (cVar5 != null) {
                        if ((cVar5.c & 131072) != 0) {
                            i4++;
                            if (i4 == 1) {
                                I = I;
                                duwVar3 = duwVar3;
                                duwVar3 = duwVar3;
                                I = cVar5;
                            } else {
                                if (duwVar3 == 0) {
                                    duwVar3 = new duw(new d.c[16]);
                                }
                                if (I != 0) {
                                    duwVar3.b(I);
                                    I = 0;
                                }
                                duwVar3.b(cVar5);
                            }
                        } else {
                            I = I;
                            duwVar3 = duwVar3;
                        }
                        cVar5 = cVar5.f;
                        I = I;
                        duwVar3 = duwVar3;
                    }
                    if (i4 == 1) {
                        I = I;
                        duwVar3 = duwVar3;
                    } else {
                        I = I;
                        duwVar3 = duwVar3;
                    }
                }
                I = pkd.c(duwVar3);
            }
            ?? I2 = noa0Var.i();
            ?? duwVar4 = 0;
            while (I2 != 0) {
                if (I2 instanceof noa0) {
                    if (((noa0) I2).P1()) {
                        return true;
                    }
                } else if ((I2.c & 131072) != 0 && (I2 instanceof tkd)) {
                    d.c cVar6 = ((tkd) I2).E;
                    int i5 = 0;
                    while (cVar6 != null) {
                        if ((cVar6.c & 131072) != 0) {
                            i5++;
                            if (i5 == 1) {
                                I2 = I2;
                                duwVar4 = duwVar4;
                                duwVar4 = duwVar4;
                                I2 = cVar6;
                            } else {
                                if (duwVar4 == 0) {
                                    duwVar4 = new duw(new d.c[16]);
                                }
                                if (I2 != 0) {
                                    duwVar4.b(I2);
                                    I2 = 0;
                                }
                                duwVar4.b(cVar6);
                            }
                        } else {
                            I2 = I2;
                            duwVar4 = duwVar4;
                        }
                        cVar6 = cVar6.f;
                        I2 = I2;
                        duwVar4 = duwVar4;
                    }
                    if (i5 == 1) {
                        I2 = I2;
                        duwVar4 = duwVar4;
                    } else {
                        I2 = I2;
                        duwVar4 = duwVar4;
                    }
                }
                I2 = pkd.c(duwVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((noa0) arrayList.get(i6)).P1()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.s4i
    public final FocusTargetNode f() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.s4i
    public final boolean g(a80 a80Var, AndroidComposeView.f fVar) {
        ufn ufnVar;
        int size;
        wwx wwxVar;
        ?? C;
        wwx wwxVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = p5i.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeA.a;
            tsr tsrVarF = pkd.f(focusTargetNodeA);
            loop0: while (true) {
                if (tsrVarF == null) {
                    C = 0;
                    break;
                }
                if ((tsrVarF.U.f.d & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 2097152) != 0) {
                            ?? duwVar = 0;
                            C = cVar;
                            while (C != 0) {
                                if (C instanceof ufn) {
                                    break loop0;
                                }
                                if ((C.c & 2097152) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 2097152) != 0) {
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
                cVar = (tsrVarF == null || (wwxVar2 = tsrVarF.U) == null) ? null : wwxVar2.e;
            }
            ufnVar = (ufn) C;
        } else {
            ufnVar = null;
        }
        if (ufnVar != null) {
            if (!ufnVar.i().C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar3 = ufnVar.i().e;
            tsr tsrVarF2 = pkd.f(ufnVar);
            ArrayList arrayList = null;
            while (tsrVarF2 != null) {
                if ((tsrVarF2.U.f.d & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & 2097152) != 0) {
                            d.c cVarC = cVar3;
                            duw duwVar2 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof ufn) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarC);
                                } else if ((cVarC.c & 2097152) != 0 && (cVarC instanceof tkd)) {
                                    int i2 = 0;
                                    for (d.c cVar4 = ((tkd) cVarC).E; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarC = cVar4;
                                            } else {
                                                if (duwVar2 == null) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar2.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                tsrVarF2 = tsrVarF2.H();
                cVar3 = (tsrVarF2 == null || (wwxVar = tsrVarF2.U) == null) ? null : wwxVar.e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (!((ufn) arrayList.get(size)).R()) {
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                    return true;
                }
            }
            ?? I = ufnVar.i();
            ?? duwVar3 = 0;
            while (I != 0) {
                if (I instanceof ufn) {
                    if (((ufn) I).R()) {
                        return true;
                    }
                } else if ((I.c & 2097152) != 0 && (I instanceof tkd)) {
                    d.c cVar5 = ((tkd) I).E;
                    int i4 = 0;
                    while (cVar5 != null) {
                        if ((cVar5.c & 2097152) != 0) {
                            i4++;
                            if (i4 == 1) {
                                I = I;
                                duwVar3 = duwVar3;
                                duwVar3 = duwVar3;
                                I = cVar5;
                            } else {
                                if (duwVar3 == 0) {
                                    duwVar3 = new duw(new d.c[16]);
                                }
                                if (I != 0) {
                                    duwVar3.b(I);
                                    I = 0;
                                }
                                duwVar3.b(cVar5);
                            }
                        } else {
                            I = I;
                            duwVar3 = duwVar3;
                        }
                        cVar5 = cVar5.f;
                        I = I;
                        duwVar3 = duwVar3;
                    }
                    if (i4 == 1) {
                        I = I;
                        duwVar3 = duwVar3;
                    } else {
                        I = I;
                        duwVar3 = duwVar3;
                    }
                }
                I = pkd.c(duwVar3);
            }
            if (!((Boolean) fVar.invoke()).booleanValue()) {
                ?? I2 = ufnVar.i();
                ?? duwVar4 = 0;
                while (I2 != 0) {
                    if (I2 instanceof ufn) {
                        if (((ufn) I2).I0()) {
                        }
                    } else if ((I2.c & 2097152) != 0 && (I2 instanceof tkd)) {
                        d.c cVar6 = ((tkd) I2).E;
                        int i5 = 0;
                        while (cVar6 != null) {
                            if ((cVar6.c & 2097152) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    I2 = I2;
                                    duwVar4 = duwVar4;
                                    duwVar4 = duwVar4;
                                    I2 = cVar6;
                                } else {
                                    if (duwVar4 == 0) {
                                        duwVar4 = new duw(new d.c[16]);
                                    }
                                    if (I2 != 0) {
                                        duwVar4.b(I2);
                                        I2 = 0;
                                    }
                                    duwVar4.b(cVar6);
                                }
                            } else {
                                I2 = I2;
                                duwVar4 = duwVar4;
                            }
                            cVar6 = cVar6.f;
                            I2 = I2;
                            duwVar4 = duwVar4;
                        }
                        if (i5 == 1) {
                            I2 = I2;
                            duwVar4 = duwVar4;
                        } else {
                            I2 = I2;
                            duwVar4 = duwVar4;
                        }
                    }
                    I2 = pkd.c(duwVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (!((ufn) arrayList.get(i6)).I0()) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.s4i
    public final void h(FocusTargetNode focusTargetNode) {
        i4i i4iVar = this.d;
        if (i4iVar.c.d(focusTargetNode)) {
            i4iVar.a();
        }
    }

    @Override // defpackage.s4i
    public final void i() {
        this.d.a();
    }

    @Override // defpackage.s4i
    public final FocusOwnerImpl$modifier$1 j() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0155 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0163 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:329:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:350:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x015c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[ADDED_TO_REGION, LOOP:12: B:39:0x0076->B:67:0x00c4, LOOP_START, PHI: r6
      0x0076: PHI (r6v27 androidx.compose.ui.d$c) = (r6v22 androidx.compose.ui.d$c), (r6v28 androidx.compose.ui.d$c) binds: [B:38:0x0074, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00db A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[ADDED_TO_REGION, LOOP:16: B:85:0x00fe->B:113:0x014c, LOOP_START, PHI: r12
      0x00fe: PHI (r12v13 androidx.compose.ui.d$c) = (r12v8 androidx.compose.ui.d$c), (r12v14 androidx.compose.ui.d$c) binds: [B:84:0x00fc, B:113:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v28, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v37, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v40, types: [T, androidx.compose.ui.d$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [T, androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r12v49, types: [T, androidx.compose.ui.d$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r7v35, types: [T, duw] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r9v17, types: [T, duw] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // defpackage.s4i
    public final boolean k(android.view.KeyEvent r13, kotlin.jvm.functions.Function0<java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4i.k(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // defpackage.s4i
    public final boolean l() {
        return false;
    }

    @Override // defpackage.s4i
    public final k5i m() {
        return this.c.V();
    }

    @Override // defpackage.s4i
    public final boolean n() {
        return this.a.T();
    }

    @Override // defpackage.s4i
    public final lk40 o() {
        FocusTargetNode focusTargetNodeA = p5i.a(this.c);
        if (focusTargetNodeA != null) {
            return p5i.b(focusTargetNodeA);
        }
        return null;
    }

    @Override // defpackage.s4i
    public final boolean p(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = n8.b(this.c, i).ordinal()) == 0) {
            u(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                uhc.a();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            v();
        }
        return z3;
    }

    @Override // defpackage.s4i
    public final void q(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.h;
        this.h = focusTargetNode;
        etw<j4i> etwVar = this.g;
        Object[] objArr = etwVar.a;
        int i = etwVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((j4i) objArr[i2]).a(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // defpackage.s4i
    public final void r() {
        n8.a(this.c, true);
    }

    @Override // defpackage.s4i
    public final etw<j4i> s() {
        return this.g;
    }

    @Override // defpackage.k4i
    public final void t(boolean z) {
        p(8, z, true);
    }

    public final boolean u(boolean z) {
        wwx wwxVar;
        FocusTargetNode focusTargetNode = this.h;
        if (focusTargetNode != null) {
            q(null);
            focusTargetNode.p2(k5i.a, k5i.d);
            if (!focusTargetNode.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNode.a.e;
            tsr tsrVarF = pkd.f(focusTargetNode);
            while (tsrVarF != null) {
                if ((tsrVarF.U.f.d & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 1024) != 0) {
                            d.c cVarC = cVar;
                            duw duwVar = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarC).p2(k5i.b, k5i.d);
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
        return true;
    }

    public final void v() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0208  */
    /* JADX WARN: Code duplicated, block: B:49:0x0224  */
    /* JADX WARN: Code duplicated, block: B:51:0x0234  */
    /* JADX WARN: Code duplicated, block: B:52:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i;
        long j;
        int iNumberOfTrailingZeros2;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        long[] jArr3;
        long[] jArr4;
        int i4;
        int i5;
        long[] jArr5;
        int i6;
        boolean z;
        long jA = emp.a(keyEvent);
        int iB = emp.b(keyEvent);
        int i7 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i8 = 0;
        int i9 = 1;
        if (iB != 2) {
            if (iB != 1) {
                return true;
            }
            wsw wswVar = this.f;
            if (wswVar == null || !wswVar.a(jA)) {
                return false;
            }
            wsw wswVar2 = this.f;
            if (wswVar2 != null) {
                int iHashCode = Long.hashCode(jA) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 & 127;
                int i12 = wswVar2.c;
                int i13 = i10 >>> 7;
                loop5: while (true) {
                    int i14 = i13 & i12;
                    long[] jArr6 = wswVar2.a;
                    int i15 = i14 >> 3;
                    int i16 = (i14 & 7) << 3;
                    long j3 = ((jArr6[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr6[i15] >>> i16);
                    long j4 = (((long) i11) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i14) & i12;
                        if (wswVar2.b[iNumberOfTrailingZeros] == jA) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i8 += 8;
                    i13 = i14 + i8;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    wswVar2.d--;
                    long[] jArr7 = wswVar2.a;
                    int i17 = wswVar2.c;
                    int i18 = iNumberOfTrailingZeros >> 3;
                    int i19 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr7[i18] & (~(255 << i19))) | (254 << i19);
                    jArr7[i18] = j6;
                    jArr7[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        wsw wswVar3 = this.f;
        if (wswVar3 == null) {
            wswVar3 = new wsw(3);
            this.f = wswVar3;
        }
        wsw wswVar4 = wswVar3;
        int iHashCode2 = Long.hashCode(jA) * (-862048943);
        int i20 = iHashCode2 ^ (iHashCode2 << 16);
        int i21 = i20 >>> 7;
        int i22 = i20 & 127;
        int i23 = wswVar4.c;
        int i24 = i21 & i23;
        int i25 = 0;
        loop0: while (true) {
            long[] jArr8 = wswVar4.a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j7 = (jArr8[i26] >>> i27) | ((jArr8[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
            int i28 = i7;
            long j8 = i22;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i24 + (Long.numberOfTrailingZeros(j10) >> 3)) & i23;
                long j11 = j2;
                if (wswVar4.b[iNumberOfTrailingZeros2] == jA) {
                    z = 1;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB2 = wswVar4.b(i21);
                if (wswVar4.e != 0 || ((wswVar4.a[iB2 >> 3] >> ((iB2 & 7) << 3)) & 255) == 254) {
                    i = 1;
                    j = 128;
                } else {
                    int i29 = wswVar4.c;
                    if (i29 > 8) {
                        long j13 = wswVar4.d;
                        nbh0.a aVar = nbh0.b;
                        if (Long.compare((j13 * 32) ^ Long.MIN_VALUE, (((long) i29) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr9 = wswVar4.a;
                            int i30 = wswVar4.c;
                            long[] jArr10 = wswVar4.b;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            while (i32 < i31) {
                                long j14 = jArr9[i32] & (-9187201950435737472L);
                                jArr9[i32] = ((~j14) + (j14 >>> 7)) & (-72340172838076674L);
                                i32++;
                                c = c;
                                i30 = i30;
                            }
                            char c2 = c;
                            int i33 = i30;
                            j = 128;
                            int iZ = ay0.z(jArr9);
                            int i34 = iZ - 1;
                            long j15 = 72057594037927935L;
                            jArr9[i34] = (jArr9[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr9[iZ] = jArr9[0];
                            int i35 = i33;
                            int i36 = 0;
                            while (i36 != i35) {
                                int i37 = i36 >> 3;
                                int i38 = (i36 & 7) << 3;
                                long j16 = (jArr9[i37] >> i38) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr10[i36]) * i28;
                                    int i39 = iHashCode3 ^ (iHashCode3 << 16);
                                    long j17 = j15;
                                    int i40 = i39 >>> 7;
                                    int iB3 = wswVar4.b(i40);
                                    int i41 = i40 & i35;
                                    char c3 = c2;
                                    if (((iB3 - i41) & i35) / 8 == ((i36 - i41) & i35) / 8) {
                                        int i42 = i9;
                                        jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (((long) (i39 & 127)) << i38);
                                        jArr9[jArr9.length - i42] = (jArr9[0] & j17) | Long.MIN_VALUE;
                                        i36++;
                                        i9 = i42;
                                        j15 = j17;
                                        c2 = c3;
                                    } else {
                                        int i43 = i9;
                                        int i44 = iB3 >> 3;
                                        long j18 = jArr9[i44];
                                        int i45 = (iB3 & 7) << 3;
                                        if (((j18 >> i45) & 255) == 128) {
                                            int i46 = i36;
                                            jArr9[i44] = (j18 & (~(255 << i45))) | (((long) (i39 & 127)) << i45);
                                            jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (128 << i38);
                                            jArr10[iB3] = jArr10[i46];
                                            jArr10[i46] = j12;
                                            i6 = i46;
                                        } else {
                                            int i47 = i36;
                                            jArr9[i44] = (j18 & (~(255 << i45))) | (((long) (i39 & 127)) << i45);
                                            long j19 = jArr10[iB3];
                                            jArr10[iB3] = jArr10[i47];
                                            jArr10[i47] = j19;
                                            i6 = i47 - 1;
                                        }
                                        jArr9[jArr9.length - i43] = (jArr9[0] & j17) | Long.MIN_VALUE;
                                        i36 = i6 + i43;
                                        i9 = i43;
                                        j15 = j17;
                                        c2 = c3;
                                        i35 = i35;
                                    }
                                } else {
                                    i36++;
                                }
                            }
                            i2 = i9;
                            wswVar4.e = fz60.a(wswVar4.c) - wswVar4.d;
                        } else {
                            i2 = 1;
                            j = 128;
                            int iC = fz60.c(wswVar4.c);
                            jArr = wswVar4.a;
                            jArr2 = wswVar4.b;
                            i3 = wswVar4.c;
                            wswVar4.c(iC);
                            jArr3 = wswVar4.a;
                            jArr4 = wswVar4.b;
                            i4 = wswVar4.c;
                            i5 = 0;
                            while (i5 < i3) {
                                if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                                    long j20 = jArr2[i5];
                                    int iHashCode4 = Long.hashCode(j20) * i28;
                                    int i48 = iHashCode4 ^ (iHashCode4 << 16);
                                    int iB4 = wswVar4.b(i48 >>> 7);
                                    jArr5 = jArr3;
                                    int i49 = iB4 >> 3;
                                    int i50 = (iB4 & 7) << 3;
                                    long j21 = (jArr5[i49] & (~(255 << i50))) | (((long) (i48 & 127)) << i50);
                                    jArr5[i49] = j21;
                                    jArr5[(((iB4 - 7) & i4) + (i4 & 7)) >> 3] = j21;
                                    jArr4[iB4] = j20;
                                } else {
                                    jArr5 = jArr3;
                                }
                                i5++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr2;
                                i2 = i2;
                            }
                        }
                    } else {
                        i2 = 1;
                        j = 128;
                        int iC2 = fz60.c(wswVar4.c);
                        jArr = wswVar4.a;
                        jArr2 = wswVar4.b;
                        i3 = wswVar4.c;
                        wswVar4.c(iC2);
                        jArr3 = wswVar4.a;
                        jArr4 = wswVar4.b;
                        i4 = wswVar4.c;
                        i5 = 0;
                        while (i5 < i3) {
                            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                                long j22 = jArr2[i5];
                                int iHashCode5 = Long.hashCode(j22) * i28;
                                int i410 = iHashCode5 ^ (iHashCode5 << 16);
                                int iB5 = wswVar4.b(i410 >>> 7);
                                jArr5 = jArr3;
                                int i411 = iB5 >> 3;
                                int i51 = (iB5 & 7) << 3;
                                long j23 = (jArr5[i411] & (~(255 << i51))) | (((long) (i410 & 127)) << i51);
                                jArr5[i411] = j23;
                                jArr5[(((iB5 - 7) & i4) + (i4 & 7)) >> 3] = j23;
                                jArr4[iB5] = j22;
                            } else {
                                jArr5 = jArr3;
                            }
                            i5++;
                            jArr = jArr;
                            jArr3 = jArr5;
                            jArr2 = jArr2;
                            i2 = i2;
                        }
                    }
                    i = i2;
                    iB2 = wswVar4.b(i21);
                }
                iNumberOfTrailingZeros2 = iB2;
                wswVar4.d++;
                int i52 = wswVar4.e;
                long[] jArr11 = wswVar4.a;
                int i53 = iNumberOfTrailingZeros2 >> 3;
                long j24 = jArr11[i53];
                int i54 = (iNumberOfTrailingZeros2 & 7) << 3;
                wswVar4.e = i52 - (((j24 >> i54) & 255) == j ? i == true ? 1 : 0 : 0);
                int i55 = wswVar4.c;
                long j25 = (j24 & (~(255 << i54))) | (j8 << i54);
                jArr11[i53] = j25;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i55) + (i55 & 7)) >> 3] = j25;
                z = i;
                break;
            }
            i25 += 8;
            i24 = (i24 + i25) & i23;
            i7 = i28;
            j2 = j12;
        }
        wswVar4.b[iNumberOfTrailingZeros2] = jA;
        return z;
    }
}
