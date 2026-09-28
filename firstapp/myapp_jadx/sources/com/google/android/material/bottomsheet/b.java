package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.d55;
import defpackage.e55;
import defpackage.f55;
import defpackage.fbv;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.l8j0;
import defpackage.n8j0;
import defpackage.qoa0;
import defpackage.r6i0;
import defpackage.udf;
import defpackage.vbv;
import defpackage.xq0;
import defpackage.z7j0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b extends xq0 {
    public boolean A;
    public C0191b B;
    public final boolean C;
    public fbv D;
    public final a E;
    public BottomSheetBehavior<FrameLayout> f;
    public FrameLayout i;
    public CoordinatorLayout v;
    public FrameLayout w;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public static class C0191b extends BottomSheetBehavior.d {
        public final Boolean a;
        public final l8j0 b;
        public Window c;
        public boolean d;

        public C0191b(View view, l8j0 l8j0Var) {
            this.b = l8j0Var;
            fcv fcvVar = BottomSheetBehavior.C(view).w;
            ColorStateList backgroundTintList = fcvVar != null ? fcvVar.b.d : view.getBackgroundTintList();
            if (backgroundTintList != null) {
                this.a = Boolean.valueOf(vbv.f(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListD = udf.d(view.getBackground());
            Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.a = Boolean.valueOf(vbv.f(numValueOf.intValue()));
            } else {
                this.a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            d(view);
        }

        public final void d(View view) {
            n8j0.g cVar;
            n8j0.g cVar2;
            int top = view.getTop();
            l8j0 l8j0Var = this.b;
            if (top < l8j0Var.d()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                    qoa0 qoa0Var = new qoa0(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        cVar2 = new n8j0.f(window, qoa0Var);
                    } else if (i >= 30) {
                        cVar2 = new n8j0.d(window, qoa0Var);
                    } else {
                        cVar2 = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                    }
                    cVar2.d(zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), l8j0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    boolean z = this.d;
                    qoa0 qoa0Var2 = new qoa0(window2.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        cVar = new n8j0.f(window2, qoa0Var2);
                    } else if (i2 >= 30) {
                        cVar = new n8j0.d(window2, qoa0Var2);
                    } else {
                        cVar = i2 >= 26 ? new n8j0.c(window2, qoa0Var2) : new n8j0.b(window2, qoa0Var2);
                    }
                    cVar.d(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            n8j0.g cVar;
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                qoa0 qoa0Var = new qoa0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    cVar = new n8j0.f(window, qoa0Var);
                } else if (i >= 30) {
                    cVar = new n8j0.d(window, qoa0Var);
                } else {
                    cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                }
                this.d = cVar.b();
            }
        }
    }

    public b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.y = true;
        this.z = true;
        this.E = new a();
        d().x(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        g();
        super.cancel();
    }

    public final void f() {
        if (this.i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.i = frameLayout;
            this.v = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.i.findViewById(R.id.design_bottom_sheet);
            this.w = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.f = bottomSheetBehaviorC;
            ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehaviorC.p0;
            a aVar = this.E;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f.J(this.y);
            this.D = new fbv(this.f, this.w);
        }
    }

    public final BottomSheetBehavior<FrameLayout> g() {
        if (this.f == null) {
            f();
        }
        return this.f;
    }

    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.i.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.C) {
            FrameLayout frameLayout = this.i;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(frameLayout, aVar);
        }
        this.w.removeAllViews();
        FrameLayout frameLayout2 = this.w;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d55(this));
        r6i0.p(this.w, new e55(this));
        this.w.setOnTouchListener(new f55());
        return this.i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.C && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.v;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            z7j0.a(window, !z);
            C0191b c0191b = this.B;
            if (c0191b != null) {
                c0191b.e(window);
            }
        }
        fbv fbvVar = this.D;
        if (fbvVar == null) {
            return;
        }
        if (this.y) {
            fbvVar.a(false);
        } else {
            fbvVar.b();
        }
    }

    @Override // defpackage.xq0, defpackage.bo8, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C0191b c0191b = this.B;
        if (c0191b != null) {
            c0191b.e(null);
        }
        fbv fbvVar = this.D;
        if (fbvVar != null) {
            fbvVar.b();
        }
    }

    @Override // defpackage.bo8, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.c0 != 5) {
            return;
        }
        bottomSheetBehavior.L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        fbv fbvVar;
        super.setCancelable(z);
        if (this.y != z) {
            this.y = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z);
            }
            if (getWindow() == null || (fbvVar = this.D) == null) {
                return;
            }
            if (this.y) {
                fbvVar.a(false);
            } else {
                fbvVar.b();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.y) {
            this.y = true;
        }
        this.z = z;
        this.A = true;
    }

    @Override // defpackage.xq0, defpackage.bo8, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // defpackage.xq0, defpackage.bo8, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    @Override // defpackage.xq0, defpackage.bo8, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
        }
    }

    public b(Context context) {
        this(context, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
