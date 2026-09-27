package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import f2.z1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f51090a;

    public l0(Context context, ViewGroup viewGroup, View view) {
        this.f51090a = new a(context, viewGroup, view, this);
    }

    public static l0 e(View view) {
        ViewGroup viewGroupL = p0.l(view);
        if (viewGroupL == null) {
            return null;
        }
        int childCount = viewGroupL.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroupL.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f51095e;
            }
        }
        return new i0(viewGroupL.getContext(), viewGroupL, view);
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f51090a.g(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f51090a.a(drawable);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class a extends ViewGroup {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Method f51091g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f51092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f51093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Drawable> f51094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l0 f51095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f51096f;

        static {
            try {
                Class cls = Integer.TYPE;
                f51091g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, l0 l0Var) {
            super(context);
            this.f51094d = null;
            this.f51092b = viewGroup;
            this.f51093c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f51095e = l0Var;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f51094d == null) {
                this.f51094d = new ArrayList<>();
            }
            if (this.f51094d.contains(drawable)) {
                return;
            }
            this.f51094d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f51092b && viewGroup.getParent() != null && z1.R0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f51092b.getLocationOnScreen(iArr2);
                    z1.h1(view, iArr[0] - iArr2[0]);
                    z1.i1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.f51096f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f51094d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f51096f = true;
                    this.f51092b.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f51092b.getLocationOnScreen(iArr);
            this.f51093c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f51093c.getWidth(), this.f51093c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f51094d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f51094d.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f51092b.getLocationOnScreen(iArr2);
            this.f51093c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i10, int i11, Rect rect) {
            if (this.f51092b == null || f51091g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f51091g.invoke(this.f51092b, Integer.valueOf(i10), Integer.valueOf(i11), rect);
                return null;
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f51094d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f51092b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f51092b == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.View
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f51094d;
            return arrayList != null && arrayList.contains(drawable);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }
    }
}
