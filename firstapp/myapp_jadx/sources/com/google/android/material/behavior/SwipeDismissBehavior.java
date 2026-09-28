package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.f;
import com.google.android.material.snackbar.h;
import defpackage.c7;
import defpackage.i7i0;
import defpackage.nle0;
import defpackage.r6i0;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public i7i0 a;
    public f b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public final float f = 0.5f;
    public float i = 0.0f;
    public float v = 0.5f;
    public final a w = new a();

    public class a extends i7i0.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // i7i0.c
        public final int a(int i, View view) {
            int width;
            int width2;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.e;
            if (i2 == 0) {
                width = this.a;
                if (z) {
                    width -= view.getWidth();
                    width2 = this.a;
                } else {
                    width2 = view.getWidth() + width;
                }
            } else {
                int i3 = this.a;
                if (i2 != 1) {
                    width = i3 - view.getWidth();
                    width2 = this.a + view.getWidth();
                } else if (z) {
                    width2 = view.getWidth() + i3;
                    width = i3;
                } else {
                    width = i3 - view.getWidth();
                    width2 = this.a;
                }
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // i7i0.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // i7i0.c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // i7i0.c
        public final void g(int i, View view) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.d = false;
            }
        }

        @Override // i7i0.c
        public final void h(int i) {
            f fVar = SwipeDismissBehavior.this.b;
            if (fVar != null) {
                BaseTransientBottomBar.e eVar = fVar.a.u;
                if (i == 0) {
                    h.b().e(eVar);
                } else if (i == 1 || i == 2) {
                    h.b().d(eVar);
                }
            }
        }

        @Override // i7i0.c
        public final void i(View view, int i, int i2) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.i;
            float width2 = view.getWidth() * swipeDismissBehavior.v;
            float fAbs = Math.abs(i - this.a);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0050  */
        /* JADX WARN: Code duplicated, block: B:29:0x0054  */
        /* JADX WARN: Code duplicated, block: B:32:0x005d  */
        /* JADX WARN: Code duplicated, block: B:33:0x005f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0065  */
        @Override // i7i0.c
        public final void j(View view, float f, float f2) {
            int i;
            int left;
            int i2;
            f fVar;
            this.b = -1;
            int width = view.getWidth();
            boolean z = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f != 0.0f) {
                boolean z2 = view.getLayoutDirection() == 1;
                int i3 = swipeDismissBehavior.e;
                if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                    i = this.a;
                } else {
                    if (f >= 0.0f) {
                        left = view.getLeft();
                        i2 = this.a;
                        if (left < i2) {
                            i = this.a - width;
                        } else {
                            i = i2 + width;
                        }
                    } else {
                        i = this.a - width;
                    }
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * swipeDismissBehavior.f)) {
                    if (f >= 0.0f) {
                        left = view.getLeft();
                        i2 = this.a;
                        if (left < i2) {
                            i = this.a - width;
                        } else {
                            i = i2 + width;
                        }
                    } else {
                        i = this.a - width;
                    }
                    z = true;
                } else {
                    i = this.a;
                }
            }
            if (swipeDismissBehavior.a.s(i, view.getTop())) {
                view.postOnAnimation(new b(view, z));
            } else {
                if (!z || (fVar = swipeDismissBehavior.b) == null) {
                    return;
                }
                fVar.a(view);
            }
        }

        @Override // i7i0.c
        public final boolean k(int i, View view) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.w(view);
        }
    }

    public class b implements Runnable {
        public final View a;
        public final boolean b;

        public b(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            i7i0 i7i0Var = swipeDismissBehavior.a;
            View view = this.a;
            if (i7i0Var != null && i7i0Var.h()) {
                view.postOnAnimation(this);
            } else {
                if (!this.b || (fVar = swipeDismissBehavior.b) == null) {
                    return;
                }
                fVar.a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zS = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zS = coordinatorLayout.s(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zS;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (zS) {
            i7i0 i7i0Var = this.a;
            if (i7i0Var == null) {
                i7i0Var = new i7i0(coordinatorLayout.getContext(), coordinatorLayout, this.w);
                this.a = i7i0Var;
            }
            if (!this.d && i7i0Var.t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            r6i0.m(1048576, v);
            r6i0.j(0, v);
            if (w(v)) {
                r6i0.n(v, c7.a.n, null, new nle0(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.m(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
