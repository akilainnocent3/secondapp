package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f2.e1;
import f2.q3;
import f2.s4;
import f2.z1;
import java.util.ArrayList;
import java.util.List;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @t0(16)
    public static final int f51103a = 768;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f51104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f51105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f51106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f51107d;

        public a(boolean z10, boolean z11, boolean z12, d dVar) {
            this.f51104a = z10;
            this.f51105b = z11;
            this.f51106c = z12;
            this.f51107d = dVar;
        }

        @Override // com.google.android.material.internal.p0.d
        @NonNull
        public q3 a(View view, @NonNull q3 q3Var, @NonNull e eVar) {
            if (this.f51104a) {
                eVar.f51113d += q3Var.o();
            }
            boolean zS = p0.s(view);
            if (this.f51105b) {
                if (zS) {
                    eVar.f51112c += q3Var.p();
                } else {
                    eVar.f51110a += q3Var.p();
                }
            }
            if (this.f51106c) {
                if (zS) {
                    eVar.f51110a += q3Var.q();
                } else {
                    eVar.f51112c += q3Var.q();
                }
            }
            eVar.a(view);
            d dVar = this.f51107d;
            return dVar != null ? dVar.a(view, q3Var, eVar) : q3Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f51108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f51109b;

        public b(d dVar, e eVar) {
            this.f51108a = dVar;
            this.f51109b = eVar;
        }

        @Override // f2.e1
        public q3 a(View view, q3 q3Var) {
            return this.f51108a.a(view, q3Var, new e(this.f51109b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        q3 a(View view, q3 q3Var, e eVar);
    }

    public static void A(@NonNull View view) {
        B(view, true);
    }

    public static void B(@NonNull View view, boolean z10) {
        s4 s4VarE0;
        if (!z10 || (s4VarE0 = z1.E0(view)) == null) {
            n(view).showSoftInput(view, 1);
        } else {
            s4VarE0.k(q3.m.d());
        }
    }

    public static void b(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect c(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    @NonNull
    public static Rect d(@NonNull View view) {
        return e(view, 0);
    }

    @NonNull
    public static Rect e(@NonNull View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void f(@NonNull View view, @Nullable AttributeSet attributeSet, int i10, int i11) {
        g(view, attributeSet, i10, i11, null);
    }

    public static void g(@NonNull View view, @Nullable AttributeSet attributeSet, int i10, int i11, @Nullable d dVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, ih.a.o.Th, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ih.a.o.Xh, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ih.a.o.Yh, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(ih.a.o.Zh, false);
        typedArrayObtainStyledAttributes.recycle();
        h(view, new a(z10, z11, z12, dVar));
    }

    public static void h(@NonNull View view, @NonNull d dVar) {
        z1.j2(view, new b(dVar, new e(z1.n0(view), view.getPaddingTop(), z1.m0(view), view.getPaddingBottom())));
        w(view);
    }

    public static float i(@NonNull Context context, @k.q(unit = 0) int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer j(@NonNull View view) {
        ColorStateList colorStateListG = zh.d.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> k(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                arrayList.add(viewGroup.getChildAt(i10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ViewGroup l(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    public static n0 m(@NonNull View view) {
        return o(l(view));
    }

    @Nullable
    public static InputMethodManager n(@NonNull View view) {
        return (InputMethodManager) f1.d.getSystemService(view.getContext(), InputMethodManager.class);
    }

    @Nullable
    public static n0 o(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new m0(view);
    }

    public static float p(@NonNull View view) {
        float fT = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fT += z1.T((View) parent);
        }
        return fT;
    }

    public static void q(@NonNull View view) {
        r(view, true);
    }

    public static void r(@NonNull View view, boolean z10) {
        s4 s4VarE0;
        if (z10 && (s4VarE0 = z1.E0(view)) != null) {
            s4VarE0.d(q3.m.d());
            return;
        }
        InputMethodManager inputMethodManagerN = n(view);
        if (inputMethodManagerN != null) {
            inputMethodManagerN.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean s(View view) {
        return z1.c0(view) == 1;
    }

    public static PorterDuff.Mode t(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void u(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            v(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void v(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void w(@NonNull View view) {
        if (z1.R0(view)) {
            z1.A1(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void x(@NonNull View view) {
        y(view, true);
    }

    public static void y(@NonNull final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.B(view, z10);
            }
        });
    }

    public static void z(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51113d;

        public e(int i10, int i11, int i12, int i13) {
            this.f51110a = i10;
            this.f51111b = i11;
            this.f51112c = i12;
            this.f51113d = i13;
        }

        public void a(View view) {
            z1.m2(view, this.f51110a, this.f51111b, this.f51112c, this.f51113d);
        }

        public e(@NonNull e eVar) {
            this.f51110a = eVar.f51110a;
            this.f51111b = eVar.f51111b;
            this.f51112c = eVar.f51112c;
            this.f51113d = eVar.f51113d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            z1.A1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
