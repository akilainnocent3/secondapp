package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.c7;
import defpackage.d7;
import defpackage.e6;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends e6 {
    public final RecyclerView d;
    public final a e;

    public static class a extends e6 {
        public final g0 d;
        public final WeakHashMap e = new WeakHashMap();

        public a(g0 g0Var) {
            this.d = g0Var;
        }

        @Override // defpackage.e6
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            e6 e6Var = (e6) this.e.get(view);
            return e6Var != null ? e6Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.e6
        public final d7 b(View view) {
            e6 e6Var = (e6) this.e.get(view);
            return e6Var != null ? e6Var.b(view) : super.b(view);
        }

        @Override // defpackage.e6
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                e6Var.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            g0 g0Var = this.d;
            RecyclerView recyclerView = g0Var.d;
            RecyclerView recyclerView2 = g0Var.d;
            boolean zU = recyclerView.U();
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            if (zU || recyclerView2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            recyclerView2.getLayoutManager().l0(view, c7Var);
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                e6Var.d(view, c7Var);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // defpackage.e6
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                e6Var.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // defpackage.e6
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            e6 e6Var = (e6) this.e.get(viewGroup);
            return e6Var != null ? e6Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.e6
        public final boolean g(View view, int i, Bundle bundle) {
            g0 g0Var = this.d;
            RecyclerView recyclerView = g0Var.d;
            RecyclerView recyclerView2 = g0Var.d;
            if (recyclerView.U() || recyclerView2.getLayoutManager() == null) {
                return super.g(view, i, bundle);
            }
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                if (e6Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            RecyclerView.u uVar = recyclerView2.getLayoutManager().b.c;
            return false;
        }

        @Override // defpackage.e6
        public final void h(View view, int i) {
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                e6Var.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // defpackage.e6
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            e6 e6Var = (e6) this.e.get(view);
            if (e6Var != null) {
                e6Var.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public g0(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        if (aVar != null) {
            this.e = aVar;
        } else {
            this.e = new a(this);
        }
    }

    @Override // defpackage.e6
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.U()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().j0(accessibilityEvent);
        }
    }

    @Override // defpackage.e6
    public void d(View view, c7 c7Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.U() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.k0(recyclerView2.c, recyclerView2.x0, c7Var);
    }

    @Override // defpackage.e6
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.U() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().y0(i, bundle);
    }
}
