package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b4i extends d.c implements z4i, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View D;
    public ViewTreeObserver E;
    public final a F = new a();
    public final b G = new b();

    public static final class a extends qlr implements Function1<u3i, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u3i u3iVar) {
            u3i u3iVar2 = u3iVar;
            b4i b4iVar = b4i.this;
            View viewC = a4i.c(b4iVar);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!x2d.c(viewC, x2d.d(u3iVar2.b()), a4i.b(pkd.g(b4iVar).getFocusOwner(), qkd.a(b4iVar), viewC))) {
                    u3iVar2.a();
                }
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<u3i, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u3i u3iVar) {
            u3i u3iVar2 = u3iVar;
            b4i b4iVar = b4i.this;
            View viewC = a4i.c(b4iVar);
            if (viewC.hasFocus()) {
                s4i focusOwner = pkd.g(b4iVar).getFocusOwner();
                View viewA = qkd.a(b4iVar);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = a4i.b(focusOwner, viewA, viewC);
                    Integer numD = x2d.d(u3iVar2.b());
                    int iIntValue = numD != null ? numD.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = b4iVar.D;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && a4i.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        u3iVar2.a();
                    } else if (!viewA.requestFocus()) {
                        ib5.a("host view did not take focus");
                        return null;
                    }
                } else if (!viewA.requestFocus()) {
                    ib5.a("host view did not take focus");
                    return null;
                }
            }
            return Unit.a;
        }
    }

    @Override // defpackage.z4i
    public final void b0(v4i v4iVar) {
        v4iVar.b(false);
        v4iVar.a(this.F);
        v4iVar.c(this.G);
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        ViewTreeObserver viewTreeObserver = qkd.a(this).getViewTreeObserver();
        this.E = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.E = null;
        qkd.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.D = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (pkd.f(this).C == null) {
            return;
        }
        View viewC = a4i.c(this);
        s4i focusOwner = pkd.g(this).getFocusOwner();
        wgz wgzVarG = pkd.g(this);
        boolean z = (view == null || view.equals(wgzVarG) || !a4i.a(viewC, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(wgzVarG) || !a4i.a(viewC, view2)) ? false : true;
        if (z && z2) {
            this.D = view2;
            return;
        }
        if (z2) {
            this.D = view2;
            FocusTargetNode focusTargetNodeP2 = p2();
            if (focusTargetNodeP2.V().b()) {
                return;
            }
            n8.e(focusTargetNodeP2);
            return;
        }
        if (!z) {
            this.D = null;
            return;
        }
        this.D = null;
        if (p2().V().a()) {
            focusOwner.p(8, false, false);
        }
    }

    public final FocusTargetNode p2() {
        if (!this.a.C) {
            wkn.c("visitLocalDescendants called on an unattached node");
        }
        d.c cVar = this.a;
        if ((cVar.d & 1024) != 0) {
            boolean z = false;
            for (d.c cVar2 = cVar.f; cVar2 != null; cVar2 = cVar2.f) {
                if ((cVar2.c & 1024) != 0) {
                    d.c cVarC = cVar2;
                    duw duwVar = null;
                    while (cVarC != null) {
                        if (cVarC instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarC;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                            int i = 0;
                            for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                if ((cVar3.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarC = cVar3;
                                    } else {
                                        if (duwVar == null) {
                                            duwVar = new duw(new d.c[16]);
                                        }
                                        if (cVarC != null) {
                                            duwVar.b(cVarC);
                                            cVarC = null;
                                        }
                                        duwVar.b(cVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarC = pkd.c(duwVar);
                    }
                }
            }
        }
        ib5.a("Could not find focus target of embedded view wrapper");
        return null;
    }
}
