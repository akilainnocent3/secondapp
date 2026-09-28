package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.b78;
import defpackage.cdv;
import defpackage.dj0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.hxa;
import defpackage.ib5;
import defpackage.km20;
import defpackage.lh6;
import defpackage.lw0;
import defpackage.mh6;
import defpackage.nh6;
import defpackage.oh6;
import defpackage.ph6;
import defpackage.pk30;
import defpackage.rh6;
import defpackage.wtu;
import defpackage.x8w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public int E;
    public int F;
    public int G;
    public final a H;
    public final x8w I;
    public c J;
    public com.google.android.material.carousel.b K;
    public int L;
    public HashMap M;
    public oh6 N;
    public final View.OnLayoutChangeListener O;
    public int P;
    public int Q;
    public final int R;

    public static class a extends RecyclerView.n {
        public final Paint a;
        public List<com.google.android.material.carousel.b.C0192b> b;

        public a() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            Canvas canvas2;
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.a;
            paint.setStrokeWidth(dimension);
            for (com.google.android.material.carousel.b.C0192b c0192b : this.b) {
                paint.setColor(b78.b(c0192b.c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).h1()) {
                    canvas2 = canvas;
                    canvas2.drawLine(c0192b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).N.g(), c0192b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).N.c(), paint);
                } else {
                    canvas2 = canvas;
                    canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).N.d(), c0192b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).N.e(), c0192b.b, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class b {
        public final com.google.android.material.carousel.b.C0192b a;
        public final com.google.android.material.carousel.b.C0192b b;

        public b(com.google.android.material.carousel.b.C0192b c0192b, com.google.android.material.carousel.b.C0192b c0192b2) {
            km20.b(c0192b.a <= c0192b2.a);
            this.a = c0192b;
            this.b = c0192b2;
        }
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.H = new a();
        this.L = 0;
        this.O = new View.OnLayoutChangeListener() { // from class: jh6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new kh6(this.a, 0));
            }
        };
        this.Q = -1;
        this.R = 0;
        this.I = new x8w();
        m1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.h);
            this.R = typedArrayObtainStyledAttributes.getInt(0, 0);
            m1();
            o1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b g1(List<com.google.android.material.carousel.b.C0192b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.material.carousel.b.C0192b c0192b = list.get(i5);
            float f6 = z ? c0192b.b : c0192b.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new b(list.get(i), list.get(i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int A(RecyclerView.z zVar) {
        return this.G - this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int B(RecyclerView.z zVar) {
        if (K() == 0 || this.J == null || a() <= 1) {
            return 0;
        }
        return (int) (this.D * (this.J.a.a / D(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int C(RecyclerView.z zVar) {
        return this.E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int D(RecyclerView.z zVar) {
        return this.G - this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iF1;
        if (this.J == null || (iF1 = f1(RecyclerView.o.U(view), d1(RecyclerView.o.U(view)))) == 0) {
            return false;
        }
        int i = this.E;
        int i2 = this.F;
        int i3 = this.G;
        int i4 = i + iF1;
        if (i4 < i2) {
            iF1 = i2 - i;
        } else if (i4 > i3) {
            iF1 = i3 - i;
        }
        int iF2 = f1(RecyclerView.o.U(view), this.J.b(i + iF1, i2, i3));
        if (h1()) {
            recyclerView.scrollBy(iF2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iF2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams G() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (h1()) {
            return n1(i, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(int i) {
        this.Q = i;
        if (this.J == null) {
            return;
        }
        this.E = e1(i, d1(i));
        this.L = cdv.b(i, 0, Math.max(0, a() - 1));
        q1(this.J);
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (t()) {
            return n1(i, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void O(Rect rect, View view) {
        RecyclerView.S(rect, view);
        float fCenterY = rect.centerY();
        if (h1()) {
            fCenterY = rect.centerX();
        }
        b bVarG1 = g1(this.K.c, fCenterY, true);
        com.google.android.material.carousel.b.C0192b c0192b = bVarG1.a;
        float f = c0192b.d;
        com.google.android.material.carousel.b.C0192b c0192b2 = bVarG1.b;
        float fB = dj0.b(f, c0192b2.d, c0192b.b, c0192b2.b, fCenterY);
        float fWidth = h1() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = h1() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R0(RecyclerView recyclerView, int i) {
        lh6 lh6Var = new lh6(this, recyclerView.getContext());
        lh6Var.a = i;
        S0(lh6Var);
    }

    public final float U0(float f, float f2) {
        return i1() ? f - f2 : f + f2;
    }

    public final void V0(RecyclerView.u uVar, int i, int i2) {
        if (i < 0 || i >= a()) {
            return;
        }
        float fZ0 = Z0(i);
        View viewD = uVar.d(i);
        c0(viewD);
        float fU0 = U0(fZ0, this.K.a / 2.0f);
        b bVarG1 = g1(this.K.c, fU0, false);
        float fY0 = Y0(fU0, bVarG1);
        float f = this.K.a / 2.0f;
        p(viewD, i2, false);
        c0(viewD);
        this.N.h(viewD, (int) (fY0 - f), (int) (fY0 + f));
        p1(viewD, fU0, bVarG1);
    }

    public final void W0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        float fZ0 = Z0(i);
        while (i < zVar.b()) {
            float fU0 = U0(fZ0, this.K.a / 2.0f);
            b bVarG1 = g1(this.K.c, fU0, false);
            float fY0 = Y0(fU0, bVarG1);
            if (j1(fY0, bVarG1)) {
                return;
            }
            fZ0 = U0(fZ0, this.K.a);
            if (!k1(fY0, bVarG1)) {
                View viewD = uVar.d(i);
                float f = this.K.a / 2.0f;
                p(viewD, -1, false);
                c0(viewD);
                this.N.h(viewD, (int) (fY0 - f), (int) (fY0 + f));
                p1(viewD, fU0, bVarG1);
            }
            i++;
        }
    }

    public final void X0(RecyclerView.u uVar, int i) {
        float fZ0 = Z0(i);
        while (i >= 0) {
            float fU0 = U0(fZ0, this.K.a / 2.0f);
            b bVarG1 = g1(this.K.c, fU0, false);
            float fY0 = Y0(fU0, bVarG1);
            if (k1(fY0, bVarG1)) {
                return;
            }
            float f = this.K.a;
            fZ0 = i1() ? fZ0 + f : fZ0 - f;
            if (!j1(fY0, bVarG1)) {
                View viewD = uVar.d(i);
                float f2 = this.K.a / 2.0f;
                p(viewD, 0, false);
                c0(viewD);
                this.N.h(viewD, (int) (fY0 - f2), (int) (fY0 + f2));
                p1(viewD, fU0, bVarG1);
            }
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Y() {
        return true;
    }

    public final float Y0(float f, b bVar) {
        com.google.android.material.carousel.b.C0192b c0192b = bVar.a;
        float f2 = c0192b.b;
        com.google.android.material.carousel.b.C0192b c0192b2 = bVar.b;
        float f3 = c0192b2.b;
        float f4 = c0192b.a;
        float f5 = c0192b2.a;
        float fB = dj0.b(f2, f3, f4, f5, f);
        if (c0192b2 != this.K.b() && c0192b != this.K.d()) {
            return fB;
        }
        return hxa.a(1.0f, c0192b2.c, f - f5, fB);
    }

    public final float Z0(int i) {
        return U0(this.N.f() - this.E, this.K.a * i);
    }

    public final void a1(RecyclerView.u uVar, RecyclerView.z zVar) {
        while (K() > 0) {
            View viewJ = J(0);
            float fC1 = c1(viewJ);
            if (!k1(fC1, g1(this.K.c, fC1, true))) {
                break;
            } else {
                D0(viewJ, uVar);
            }
        }
        while (K() - 1 >= 0) {
            View viewJ2 = J(K() - 1);
            float fC2 = c1(viewJ2);
            if (!j1(fC2, g1(this.K.c, fC2, true))) {
                break;
            } else {
                D0(viewJ2, uVar);
            }
        }
        if (K() == 0) {
            X0(uVar, this.L - 1);
            W0(this.L, uVar, zVar);
        } else {
            int iU = RecyclerView.o.U(J(0));
            int iU2 = RecyclerView.o.U(J(K() - 1));
            X0(uVar, iU - 1);
            W0(iU2 + 1, uVar, zVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF b(int i) {
        if (this.J == null) {
            return null;
        }
        int iE1 = e1(i, d1(i)) - this.E;
        return h1() ? new PointF(iE1, 0.0f) : new PointF(0.0f, iE1);
    }

    public final int b1() {
        return h1() ? this.C : this.D;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c0(View view) {
        if (!(view instanceof wtu)) {
            ib5.a("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        r(rect, view);
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        c cVar = this.J;
        view.measure(RecyclerView.o.L(h1(), this.C, this.A, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i, (int) ((cVar == null || this.N.a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : cVar.a.a)), RecyclerView.o.L(t(), this.D, this.B, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, (int) ((cVar == null || this.N.a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : cVar.a.a)));
    }

    public final float c1(View view) {
        Rect rect = new Rect();
        RecyclerView.S(rect, view);
        return h1() ? rect.centerX() : rect.centerY();
    }

    public final com.google.android.material.carousel.b d1(int i) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.M;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(cdv.b(i, 0, Math.max(0, a() + (-1)))))) == null) ? this.J.a : bVar;
    }

    public final int e1(int i, com.google.android.material.carousel.b bVar) {
        if (!i1()) {
            return (int) ((bVar.a / 2.0f) + ((i * bVar.a) - bVar.a().a));
        }
        float fB1 = b1() - bVar.c().a;
        float f = bVar.a;
        return (int) ((fB1 - (i * f)) - (f / 2.0f));
    }

    public final int f1(int i, com.google.android.material.carousel.b bVar) {
        int i2 = Reader.READ_DONE;
        for (com.google.android.material.carousel.b.C0192b c0192b : bVar.c.subList(bVar.d, bVar.e + 1)) {
            float f = bVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int iB1 = (i1() ? (int) ((b1() - c0192b.a) - f2) : (int) (f2 - c0192b.a)) - this.E;
            if (Math.abs(i2) > Math.abs(iB1)) {
                i2 = iB1;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        x8w x8wVar = this.I;
        float dimension = x8wVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        x8wVar.a = dimension;
        float dimension2 = x8wVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        x8wVar.b = dimension2;
        m1();
        recyclerView.addOnLayoutChangeListener(this.O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(RecyclerView recyclerView, RecyclerView.u uVar) {
        recyclerView.removeOnLayoutChangeListener(this.O);
    }

    public final boolean h1() {
        return this.N.a == 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View i0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        byte b2;
        if (K() == 0) {
            return null;
        }
        int i2 = this.N.a;
        if (i == 1) {
            b2 = -1;
        } else if (i == 2) {
            b2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b2 = 1;
                    }
                    b2 = -2147483648;
                } else if (i2 != 0) {
                    b2 = -2147483648;
                } else if (i1()) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
            } else if (i2 == 1) {
                b2 = -1;
            } else {
                b2 = -2147483648;
            }
        } else if (i2 != 0) {
            b2 = -2147483648;
        } else if (i1()) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == -2147483648) {
            return null;
        }
        if (b2 == -1) {
            if (RecyclerView.o.U(view) == 0) {
                return null;
            }
            V0(uVar, RecyclerView.o.U(J(0)) - 1, 0);
            return J(i1() ? K() - 1 : 0);
        }
        if (RecyclerView.o.U(view) == a() - 1) {
            return null;
        }
        V0(uVar, RecyclerView.o.U(J(K() - 1)) + 1, -1);
        return J(i1() ? 0 : K() - 1);
    }

    public final boolean i1() {
        return h1() && this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.o.U(J(0)));
            accessibilityEvent.setToIndex(RecyclerView.o.U(J(K() - 1)));
        }
    }

    public final boolean j1(float f, b bVar) {
        com.google.android.material.carousel.b.C0192b c0192b = bVar.a;
        float f2 = c0192b.d;
        com.google.android.material.carousel.b.C0192b c0192b2 = bVar.b;
        float fB = dj0.b(f2, c0192b2.d, c0192b.b, c0192b2.b, f) / 2.0f;
        float f3 = i1() ? f + fB : f - fB;
        if (i1()) {
            return f3 < 0.0f;
        }
        return f3 > ((float) b1());
    }

    public final boolean k1(float f, b bVar) {
        com.google.android.material.carousel.b.C0192b c0192b = bVar.a;
        float f2 = c0192b.d;
        com.google.android.material.carousel.b.C0192b c0192b2 = bVar.b;
        float fU0 = U0(f, dj0.b(f2, c0192b2.d, c0192b.b, c0192b2.b, f) / 2.0f);
        if (i1()) {
            return fU0 > ((float) b1());
        }
        return fU0 < 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x048d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0490  */
    /* JADX WARN: Code duplicated, block: B:154:0x0498  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:160:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x0505  */
    /* JADX WARN: Code duplicated, block: B:167:0x0521  */
    /* JADX WARN: Code duplicated, block: B:170:0x052f A[LOOP:14: B:165:0x051b->B:170:0x052f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x053b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0558  */
    /* JADX WARN: Code duplicated, block: B:205:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:206:0x05df  */
    /* JADX WARN: Code duplicated, block: B:211:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:212:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:217:0x0628  */
    /* JADX WARN: Code duplicated, block: B:219:0x062c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0654  */
    /* JADX WARN: Code duplicated, block: B:223:0x0662  */
    /* JADX WARN: Code duplicated, block: B:226:0x0675 A[LOOP:12: B:222:0x0660->B:226:0x0675, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x0683  */
    /* JADX WARN: Code duplicated, block: B:232:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:235:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:267:0x0672 A[EDGE_INSN: B:267:0x0672->B:225:0x0672 BREAK  A[LOOP:12: B:222:0x0660->B:226:0x0675], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x067a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0562 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x052d A[SYNTHETIC] */
    public final void l1(RecyclerView.u uVar) {
        int[] iArr;
        com.google.android.material.carousel.b bVarD;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        com.google.android.material.carousel.b bVar;
        int i6;
        int size;
        int i7;
        boolean z;
        float f3;
        List<com.google.android.material.carousel.b.C0192b> list;
        int i8;
        int i9;
        float f4;
        int i10;
        float f5;
        int i11;
        com.google.android.material.carousel.b bVar2;
        int i12;
        List<com.google.android.material.carousel.b.C0192b> list2;
        int i13;
        float f6;
        int i14;
        com.google.android.material.carousel.b.C0192b c0192b;
        com.google.android.material.carousel.b.C0192b c0192b2;
        int i15;
        int i16;
        float f7;
        View viewD = uVar.d(0);
        c0(viewD);
        x8w x8wVar = this.I;
        x8wVar.getClass();
        int i17 = this.D;
        if (h1()) {
            i17 = this.C;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewD.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = viewD.getMeasuredHeight();
        if (h1()) {
            f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = viewD.getMeasuredWidth();
        }
        float f9 = x8wVar.a + f8;
        float fMax = Math.max(x8wVar.b + f8, f9);
        float f10 = i17;
        float fMin = Math.min(measuredHeight + f8, f10);
        float fA = cdv.a((measuredHeight / 3.0f) + f8, f9 + f8, fMax + f8);
        float f11 = (fMin + fA) / 2.0f;
        float f12 = f9 * 2.0f;
        int[] iArr2 = f10 <= f12 ? new int[]{0} : x8w.d;
        int i18 = this.R;
        int[] iArr3 = x8w.e;
        if (i18 == 1) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                iArr4[i19] = iArr2[i19] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i20 = 0; i20 < 2; i20++) {
                iArr5[i20] = iArr3[i20] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int i21 = 0;
        int i22 = Integer.MIN_VALUE;
        while (i21 < length2) {
            int i23 = length2;
            int i24 = iArr[i21];
            if (i24 > i22) {
                i22 = i24;
            }
            i21++;
            length2 = i23;
        }
        float f13 = f10 - (i22 * f11);
        int length3 = iArr2.length;
        int i25 = 0;
        int i26 = Integer.MIN_VALUE;
        while (i25 < length3) {
            int i27 = i25;
            int i28 = iArr2[i27];
            if (i28 > i26) {
                i26 = i28;
            }
            i25 = i27 + 1;
        }
        int iMax = (int) Math.max(1.0d, Math.floor((f13 - (i26 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i29 = (iCeil - iMax) + 1;
        int[] iArr6 = new int[i29];
        for (int i30 = 0; i30 < i29; i30++) {
            iArr6[i30] = iCeil - i30;
        }
        lw0 lw0VarA = lw0.a(f10, fA, f9, fMax, iArr2, f11, iArr, fMin, iArr6);
        int i31 = lw0VarA.c;
        int i32 = lw0VarA.g;
        x8wVar.c = i31 + lw0VarA.d + i32;
        int iA = a();
        int i33 = lw0VarA.c;
        int i34 = lw0VarA.d;
        int i35 = ((i33 + i34) + i32) - iA;
        boolean z2 = i35 > 0 && (i33 > 0 || i34 > 1);
        while (i35 > 0) {
            int i36 = lw0VarA.c;
            if (i36 > 0) {
                lw0VarA.c = i36 - 1;
            } else {
                int i37 = lw0VarA.d;
                if (i37 > 1) {
                    lw0VarA.d = i37 - 1;
                }
            }
            i35--;
        }
        int i38 = lw0VarA.d;
        if (i38 == 0 && lw0VarA.c == 0 && f10 > f12) {
            lw0VarA.c = 1;
            z2 = true;
        }
        if (z2) {
            lw0VarA = lw0.a(f10, fA, f9, fMax, new int[]{lw0VarA.c}, f11, new int[]{i38}, fMin, new int[]{i32});
        }
        Context context = viewD.getContext();
        if (i18 == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, lw0VarA.f);
            float f14 = fMin2 / 2.0f;
            float f15 = 0.0f - f14;
            float fB = com.google.android.material.carousel.a.b(lw0VarA.c, 0.0f, lw0VarA.b);
            float fC = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a((int) Math.floor(lw0VarA.c / 2.0f), fB, lw0VarA.b), lw0VarA.b, lw0VarA.c);
            float fB2 = com.google.android.material.carousel.a.b(lw0VarA.d, fC, lw0VarA.e);
            float fC2 = com.google.android.material.carousel.a.c(fC, com.google.android.material.carousel.a.a((int) Math.floor(lw0VarA.d / 2.0f), fB2, lw0VarA.e), lw0VarA.e, lw0VarA.d);
            float f16 = lw0VarA.f;
            int i39 = lw0VarA.g;
            float fB3 = com.google.android.material.carousel.a.b(i39, fC2, f16);
            float fC3 = com.google.android.material.carousel.a.c(fC2, com.google.android.material.carousel.a.a(i39, fB3, lw0VarA.f), lw0VarA.f, i39);
            float fB4 = com.google.android.material.carousel.a.b(lw0VarA.d, fC3, lw0VarA.e);
            float fB5 = com.google.android.material.carousel.a.b(lw0VarA.c, com.google.android.material.carousel.a.c(fC3, com.google.android.material.carousel.a.a((int) Math.ceil(lw0VarA.d / 2.0f), fB4, lw0VarA.e), lw0VarA.e, lw0VarA.d), lw0VarA.b);
            float f17 = f10 + f14;
            float fA2 = ph6.a(fMin2, lw0VarA.f, f8);
            float fA3 = ph6.a(lw0VarA.b, lw0VarA.f, f8);
            float fA4 = ph6.a(lw0VarA.e, lw0VarA.f, f8);
            com.google.android.material.carousel.b.a aVar = new com.google.android.material.carousel.b.a(i17, lw0VarA.f);
            aVar.a(f15, fA2, fMin2, false, true);
            int i40 = lw0VarA.c;
            if (i40 > 0) {
                aVar.c(fB, fA3, lw0VarA.b, (int) Math.floor(i40 / 2.0f), false);
            }
            int i41 = lw0VarA.d;
            if (i41 > 0) {
                aVar.c(fB2, fA4, lw0VarA.e, (int) Math.floor(i41 / 2.0f), false);
                f7 = fA4;
            } else {
                f7 = fA4;
            }
            aVar.c(fB3, 0.0f, lw0VarA.f, lw0VarA.g, true);
            int i42 = lw0VarA.d;
            if (i42 > 0) {
                aVar.c(fB4, f7, lw0VarA.e, (int) Math.ceil(i42 / 2.0f), false);
            }
            int i43 = lw0VarA.c;
            if (i43 > 0) {
                aVar.c(fB5, fA3, lw0VarA.b, (int) Math.ceil(i43 / 2.0f), false);
            }
            aVar.a(f17, fA2, fMin2, false, true);
            bVarD = aVar.d();
        } else {
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f8, lw0VarA.f);
            float f18 = fMin3 / 2.0f;
            float f19 = 0.0f - f18;
            float f20 = lw0VarA.f;
            int i44 = lw0VarA.g;
            float fB6 = com.google.android.material.carousel.a.b(i44, 0.0f, f20);
            float fC4 = com.google.android.material.carousel.a.c(0.0f, com.google.android.material.carousel.a.a(i44, fB6, lw0VarA.f), lw0VarA.f, i44);
            float fB7 = com.google.android.material.carousel.a.b(lw0VarA.d, fC4, lw0VarA.e);
            float fB8 = com.google.android.material.carousel.a.b(lw0VarA.c, com.google.android.material.carousel.a.c(fC4, fB7, lw0VarA.e, lw0VarA.d), lw0VarA.b);
            float f21 = f10 + f18;
            float fA5 = ph6.a(fMin3, lw0VarA.f, f8);
            float fA6 = ph6.a(lw0VarA.b, lw0VarA.f, f8);
            float fA7 = ph6.a(lw0VarA.e, lw0VarA.f, f8);
            com.google.android.material.carousel.b.a aVar2 = new com.google.android.material.carousel.b.a(i17, lw0VarA.f);
            aVar2.a(f19, fA5, fMin3, false, true);
            aVar2.c(fB6, 0.0f, lw0VarA.f, lw0VarA.g, true);
            if (lw0VarA.d > 0) {
                aVar2.a(fB7, fA7, lw0VarA.e, false, false);
            }
            int i45 = lw0VarA.c;
            if (i45 > 0) {
                aVar2.c(fB8, fA6, lw0VarA.b, i45, false);
            }
            aVar2.a(f21, fA5, fMin3, false, true);
            bVarD = aVar2.d();
        }
        if (i1()) {
            int iB1 = b1();
            com.google.android.material.carousel.b.a aVar3 = new com.google.android.material.carousel.b.a(iB1, bVarD.a);
            float f22 = (iB1 - bVarD.d().b) - (bVarD.d().d / 2.0f);
            List<com.google.android.material.carousel.b.C0192b> list3 = bVarD.c;
            int size2 = list3.size() - 1;
            while (size2 >= 0) {
                com.google.android.material.carousel.b.C0192b c0192b3 = list3.get(size2);
                float f23 = c0192b3.d;
                aVar3.a((f23 / 2.0f) + f22, c0192b3.c, f23, size2 >= bVarD.d && size2 <= bVarD.e, c0192b3.e);
                f22 += c0192b3.d;
                size2--;
            }
            bVarD = aVar3.d();
        }
        com.google.android.material.carousel.b bVar3 = bVarD;
        List<com.google.android.material.carousel.b.C0192b> list4 = bVar3.c;
        if (K() > 0) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) J(0).getLayoutParams();
            if (this.N.a == 0) {
                i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            } else {
                i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            i = i16 + i15;
        } else {
            i = 0;
        }
        float f24 = i;
        RecyclerView recyclerView = this.b;
        float paddingTop = (recyclerView == null || !recyclerView.v) ? this.N.a == 1 ? getPaddingTop() : getPaddingLeft() : 0;
        RecyclerView recyclerView2 = this.b;
        float paddingBottom = (recyclerView2 == null || !recyclerView2.v) ? this.N.a == 1 ? getPaddingBottom() : getPaddingRight() : 0;
        x8wVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar3);
        int i46 = 0;
        while (true) {
            i2 = bVar3.e;
            i3 = bVar3.d;
            if (i46 >= list4.size()) {
                i46 = -1;
                break;
            } else if (!list4.get(i46).e) {
                break;
            } else {
                i46++;
            }
        }
        int i47 = h1() ? this.C : this.D;
        if (bVar3.a().b - (bVar3.a().d / 2.0f) >= 0.0f) {
            com.google.android.material.carousel.b.C0192b c0192bA = bVar3.a();
            int i48 = 0;
            while (true) {
                if (i48 >= list4.size()) {
                    c0192b2 = null;
                    break;
                }
                c0192b2 = list4.get(i48);
                if (!c0192b2.e) {
                    break;
                } else {
                    i48++;
                }
            }
            if (c0192bA == c0192b2) {
                if (paddingTop > 0.0f) {
                    arrayList.add(c.f(bVar3, paddingTop, i47, true, f24));
                }
            } else if (i46 == -1) {
                i4 = i3 - i46;
                f = bVar3.b().b - (bVar3.b().d / 2.0f);
                if (i4 <= 0 || bVar3.a().f <= 0.0f) {
                    f2 = 0.0f;
                    i5 = 0;
                    while (i5 < i4) {
                        int i49 = i46;
                        bVar = (com.google.android.material.carousel.b) rh6.a(1, arrayList);
                        i6 = i4;
                        int i50 = i49 + i5;
                        size = list4.size() - 1;
                        f2 += list4.get(i50).f;
                        i7 = i50 - 1;
                        if (i7 >= 0) {
                            f3 = list4.get(i7).c;
                            int i51 = bVar.e;
                            list = bVar.c;
                            i8 = i51;
                            while (true) {
                                if (i8 >= list.size()) {
                                    int size3 = list.size();
                                    z = true;
                                    i8 = size3 - 1;
                                    break;
                                } else {
                                    if (f3 == list.get(i8).c) {
                                        z = true;
                                        break;
                                    }
                                    i8++;
                                }
                            }
                            size = i8 - 1;
                        } else {
                            z = true;
                        }
                        com.google.android.material.carousel.b bVarE = c.e(bVar, i49, size, f + f2, (i3 - i5) - 1, (i2 - i5) - 1, i47);
                        if (i5 != i6 - 1 && paddingTop > 0.0f) {
                            bVarE = c.f(bVarE, paddingTop, i47, z, f24);
                        }
                        arrayList.add(bVarE);
                        i5++;
                        i46 = i49;
                        i4 = i6;
                        f = f;
                    }
                } else {
                    arrayList.add(c.e(bVar3, 0, 0, f + bVar3.a().f + paddingTop, bVar3.d, bVar3.e, i47));
                }
            } else if (paddingTop > 0.0f) {
                arrayList.add(c.f(bVar3, paddingTop, i47, true, f24));
            }
        } else if (i46 == -1) {
            i4 = i3 - i46;
            f = bVar3.b().b - (bVar3.b().d / 2.0f);
            if (i4 <= 0) {
                f2 = 0.0f;
                i5 = 0;
                while (i5 < i4) {
                    int i410 = i46;
                    bVar = (com.google.android.material.carousel.b) rh6.a(1, arrayList);
                    i6 = i4;
                    int i52 = i410 + i5;
                    size = list4.size() - 1;
                    f2 += list4.get(i52).f;
                    i7 = i52 - 1;
                    if (i7 >= 0) {
                        f3 = list4.get(i7).c;
                        int i53 = bVar.e;
                        list = bVar.c;
                        i8 = i53;
                        while (true) {
                            if (i8 >= list.size()) {
                                int size4 = list.size();
                                z = true;
                                i8 = size4 - 1;
                                break;
                            } else {
                                if (f3 == list.get(i8).c) {
                                    z = true;
                                    break;
                                }
                                i8++;
                            }
                        }
                        size = i8 - 1;
                    } else {
                        z = true;
                    }
                    com.google.android.material.carousel.b bVarE2 = c.e(bVar, i410, size, f + f2, (i3 - i5) - 1, (i2 - i5) - 1, i47);
                    if (i5 != i6 - 1) {
                    }
                    arrayList.add(bVarE2);
                    i5++;
                    i46 = i410;
                    i4 = i6;
                    f = f;
                }
            } else {
                f2 = 0.0f;
                i5 = 0;
                while (i5 < i4) {
                    int i411 = i46;
                    bVar = (com.google.android.material.carousel.b) rh6.a(1, arrayList);
                    i6 = i4;
                    int i54 = i411 + i5;
                    size = list4.size() - 1;
                    f2 += list4.get(i54).f;
                    i7 = i54 - 1;
                    if (i7 >= 0) {
                        f3 = list4.get(i7).c;
                        int i55 = bVar.e;
                        list = bVar.c;
                        i8 = i55;
                        while (true) {
                            if (i8 >= list.size()) {
                                int size5 = list.size();
                                z = true;
                                i8 = size5 - 1;
                                break;
                            } else {
                                if (f3 == list.get(i8).c) {
                                    z = true;
                                    break;
                                }
                                i8++;
                            }
                        }
                        size = i8 - 1;
                    } else {
                        z = true;
                    }
                    com.google.android.material.carousel.b bVarE3 = c.e(bVar, i411, size, f + f2, (i3 - i5) - 1, (i2 - i5) - 1, i47);
                    if (i5 != i6 - 1) {
                    }
                    arrayList.add(bVarE3);
                    i5++;
                    i46 = i411;
                    i4 = i6;
                    f = f;
                }
            }
        } else if (paddingTop > 0.0f) {
            arrayList.add(c.f(bVar3, paddingTop, i47, true, f24));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVar3);
        int size6 = list4.size() - 1;
        while (true) {
            if (size6 < 0) {
                size6 = -1;
                break;
            } else if (!list4.get(size6).e) {
                break;
            } else {
                size6--;
            }
        }
        int i56 = h1() ? this.C : this.D;
        int i57 = this.D;
        if (h1()) {
            i57 = this.C;
        }
        if ((bVar3.c().d / 2.0f) + bVar3.c().b <= i57) {
            com.google.android.material.carousel.b.C0192b c0192bC = bVar3.c();
            int size7 = list4.size() - 1;
            while (true) {
                if (size7 < 0) {
                    c0192b = null;
                    break;
                }
                c0192b = list4.get(size7);
                if (!c0192b.e) {
                    break;
                } else {
                    size7--;
                }
            }
            if (c0192bC == c0192b) {
                if (paddingBottom > 0.0f) {
                    arrayList2.add(c.f(bVar3, paddingBottom, i56, false, f24));
                }
            } else if (size6 == -1) {
                i9 = size6 - i2;
                f4 = bVar3.b().b - (bVar3.b().d / 2.0f);
                if (i9 <= 0 || bVar3.c().f <= 0.0f) {
                    i10 = 0;
                    f5 = 0.0f;
                    while (i10 < i9) {
                        i11 = i9;
                        bVar2 = (com.google.android.material.carousel.b) rh6.a(1, arrayList2);
                        float f25 = f4;
                        int i58 = size6 - i10;
                        f5 += list4.get(i58).f;
                        i12 = i58 + 1;
                        int i59 = size6;
                        if (i12 < list4.size()) {
                            f6 = list4.get(i12).c;
                            i14 = bVar2.d - 1;
                            while (true) {
                                if (i14 < 0) {
                                    list2 = list4;
                                    i14 = 0;
                                    break;
                                } else {
                                    list2 = list4;
                                    if (f6 == bVar2.c.get(i14).c) {
                                        break;
                                    }
                                    i14--;
                                    list4 = list2;
                                }
                            }
                            i13 = i14 + 1;
                        } else {
                            list2 = list4;
                            i13 = 0;
                        }
                        com.google.android.material.carousel.b bVarE4 = c.e(bVar2, i59, i13, f25 - f5, i3 + i10 + 1, i2 + i10 + 1, i56);
                        if (i10 != i11 - 1 && paddingBottom > 0.0f) {
                            bVarE4 = c.f(bVarE4, paddingBottom, i56, false, f24);
                        }
                        arrayList2.add(bVarE4);
                        i10++;
                        i9 = i11;
                        size6 = i59;
                        f4 = f25;
                        list4 = list2;
                    }
                } else {
                    arrayList2.add(c.e(bVar3, 0, 0, (f4 - bVar3.c().f) - paddingBottom, bVar3.d, bVar3.e, i56));
                }
            } else if (paddingBottom > 0.0f) {
                arrayList2.add(c.f(bVar3, paddingBottom, i56, false, f24));
            }
        } else if (size6 == -1) {
            i9 = size6 - i2;
            f4 = bVar3.b().b - (bVar3.b().d / 2.0f);
            if (i9 <= 0) {
                i10 = 0;
                f5 = 0.0f;
                while (i10 < i9) {
                    i11 = i9;
                    bVar2 = (com.google.android.material.carousel.b) rh6.a(1, arrayList2);
                    float f26 = f4;
                    int i510 = size6 - i10;
                    f5 += list4.get(i510).f;
                    i12 = i510 + 1;
                    int i511 = size6;
                    if (i12 < list4.size()) {
                        f6 = list4.get(i12).c;
                        i14 = bVar2.d - 1;
                        while (true) {
                            if (i14 < 0) {
                                list2 = list4;
                                i14 = 0;
                                break;
                            }
                            list2 = list4;
                            if (f6 == bVar2.c.get(i14).c) {
                                break;
                                break;
                            } else {
                                i14--;
                                list4 = list2;
                            }
                        }
                        i13 = i14 + 1;
                    } else {
                        list2 = list4;
                        i13 = 0;
                    }
                    com.google.android.material.carousel.b bVarE5 = c.e(bVar2, i511, i13, f26 - f5, i3 + i10 + 1, i2 + i10 + 1, i56);
                    if (i10 != i11 - 1) {
                    }
                    arrayList2.add(bVarE5);
                    i10++;
                    i9 = i11;
                    size6 = i511;
                    f4 = f26;
                    list4 = list2;
                }
            } else {
                i10 = 0;
                f5 = 0.0f;
                while (i10 < i9) {
                    i11 = i9;
                    bVar2 = (com.google.android.material.carousel.b) rh6.a(1, arrayList2);
                    float f27 = f4;
                    int i512 = size6 - i10;
                    f5 += list4.get(i512).f;
                    i12 = i512 + 1;
                    int i513 = size6;
                    if (i12 < list4.size()) {
                        f6 = list4.get(i12).c;
                        i14 = bVar2.d - 1;
                        while (true) {
                            if (i14 < 0) {
                                list2 = list4;
                                i14 = 0;
                                break;
                            }
                            list2 = list4;
                            if (f6 == bVar2.c.get(i14).c) {
                                break;
                                break;
                            } else {
                                i14--;
                                list4 = list2;
                            }
                        }
                        i13 = i14 + 1;
                    } else {
                        list2 = list4;
                        i13 = 0;
                    }
                    com.google.android.material.carousel.b bVarE6 = c.e(bVar2, i513, i13, f27 - f5, i3 + i10 + 1, i2 + i10 + 1, i56);
                    if (i10 != i11 - 1) {
                    }
                    arrayList2.add(bVarE6);
                    i10++;
                    i9 = i11;
                    size6 = i513;
                    f4 = f27;
                    list4 = list2;
                }
            }
        } else if (paddingBottom > 0.0f) {
            arrayList2.add(c.f(bVar3, paddingBottom, i56, false, f24));
        }
        this.J = new c(bVar3, arrayList, arrayList2);
    }

    public final void m1() {
        this.J = null;
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void n0(int i, int i2) {
        r1();
    }

    public final int n1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (K() != 0 && i != 0) {
            if (this.J == null) {
                l1(uVar);
            }
            int iA = a();
            c cVar = this.J;
            if (iA > (i1() ? cVar.a() : cVar.c()).b) {
                int i2 = this.E;
                int i3 = this.F;
                int i4 = this.G;
                int i5 = i2 + i;
                if (i5 < i3) {
                    i = i3 - i2;
                } else if (i5 > i4) {
                    i = i4 - i2;
                }
                this.E = i2 + i;
                q1(this.J);
                float f = this.K.a / 2.0f;
                float fZ0 = Z0(RecyclerView.o.U(J(0)));
                Rect rect = new Rect();
                boolean zI1 = i1();
                com.google.android.material.carousel.b bVar = this.K;
                float f2 = zI1 ? bVar.c().b : bVar.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < K(); i6++) {
                    View viewJ = J(i6);
                    float fU0 = U0(fZ0, f);
                    b bVarG1 = g1(this.K.c, fU0, false);
                    float fY0 = Y0(fU0, bVarG1);
                    RecyclerView.S(rect, viewJ);
                    p1(viewJ, fU0, bVarG1);
                    this.N.j(viewJ, rect, f, fY0);
                    float fAbs = Math.abs(f2 - fY0);
                    if (fAbs < f3) {
                        this.Q = RecyclerView.o.U(viewJ);
                        f3 = fAbs;
                    }
                    fZ0 = U0(fZ0, this.K.a);
                }
                a1(uVar, zVar);
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void o0() {
        r1();
    }

    public final void o1(int i) {
        oh6 nh6Var;
        if (i != 0 && i != 1) {
            hb5.a(hce0.a(i, "invalid orientation:"));
            return;
        }
        q(null);
        oh6 oh6Var = this.N;
        if (oh6Var == null || i != oh6Var.a) {
            if (i == 0) {
                nh6Var = new nh6(this);
            } else {
                if (i != 1) {
                    hb5.a("invalid orientation");
                    return;
                }
                nh6Var = new mh6(this);
            }
            this.N = nh6Var;
            m1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(View view, float f, b bVar) {
        if (view instanceof wtu) {
            com.google.android.material.carousel.b.C0192b c0192b = bVar.a;
            float f2 = c0192b.c;
            com.google.android.material.carousel.b.C0192b c0192b2 = bVar.b;
            float fB = dj0.b(f2, c0192b2.c, c0192b.a, c0192b2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.N.b(height, width, dj0.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), dj0.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fY0 = Y0(f, bVar);
            RectF rectF = new RectF(fY0 - (rectFB.width() / 2.0f), fY0 - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fY0, (rectFB.height() / 2.0f) + fY0);
            RectF rectF2 = new RectF(this.N.d(), this.N.g(), this.N.e(), this.N.c());
            this.I.getClass();
            this.N.a(rectFB, rectF, rectF2);
            this.N.i(rectFB, rectF, rectF2);
            ((wtu) view).setMaskRectF(rectFB);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q0(int i, int i2) {
        r1();
    }

    public final void q1(c cVar) {
        com.google.android.material.carousel.b bVarB;
        int i = this.G;
        int i2 = this.F;
        if (i <= i2) {
            bVarB = i1() ? cVar.a() : cVar.c();
            this.K = bVarB;
        } else {
            bVarB = cVar.b(this.E, i2, i);
            this.K = bVarB;
        }
        List<com.google.android.material.carousel.b.C0192b> list = bVarB.c;
        a aVar = this.H;
        aVar.getClass();
        aVar.b = Collections.unmodifiableList(list);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void r1() {
        int iA = a();
        int i = this.P;
        if (iA == i || this.J == null) {
            return;
        }
        x8w x8wVar = this.I;
        int i2 = x8wVar.c;
        if (i < i2) {
            int iA2 = a();
            int i3 = x8wVar.c;
            if (iA2 < i3) {
                i2 = i3;
                if (i >= i2 && a() < x8wVar.c) {
                    m1();
                }
            } else {
                m1();
            }
        } else if (i >= i2) {
            m1();
        }
        this.P = iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean s() {
        return h1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean t() {
        return !h1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || b1() <= 0.0f) {
            B0(uVar);
            this.L = 0;
            return;
        }
        boolean zI1 = i1();
        c cVar = this.J;
        int i = 1;
        boolean z = cVar == null;
        if (z || cVar.a.f != b1()) {
            l1(uVar);
        }
        c cVar2 = this.J;
        boolean zI2 = i1();
        com.google.android.material.carousel.b bVarA = zI2 ? cVar2.a() : cVar2.c();
        float f = (zI2 ? bVarA.c() : bVarA.a()).a;
        float f2 = bVarA.a / 2.0f;
        int iF = (int) (this.N.f() - (i1() ? f + f2 : f - f2));
        c cVar3 = this.J;
        boolean zI3 = i1();
        com.google.android.material.carousel.b bVarC = zI3 ? cVar3.c() : cVar3.a();
        com.google.android.material.carousel.b.C0192b c0192bA = zI3 ? bVarC.a() : bVarC.c();
        int iB = (int) ((((zI3 ? -1 : 1) * c0192bA.d) / 2.0f) + ((((zVar.b() - 1) * bVarC.a) * (zI3 ? -1.0f : 1.0f)) - (c0192bA.a - this.N.f())));
        int iMin = zI3 ? Math.min(0, iB) : Math.max(0, iB);
        this.F = zI1 ? iMin : iF;
        if (zI1) {
            iMin = iF;
        }
        this.G = iMin;
        if (z) {
            this.E = iF;
            c cVar4 = this.J;
            int iA = a();
            int i2 = this.F;
            int i3 = this.G;
            boolean zI4 = i1();
            List<com.google.android.material.carousel.b> list = cVar4.b;
            List<com.google.android.material.carousel.b> list2 = cVar4.c;
            float f3 = cVar4.a.a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (i4 < iA) {
                int i6 = zI4 ? (iA - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (zI4 ? -1 : i7) > i3 - cVar4.g || i4 >= iA - list2.size()) {
                    map.put(Integer.valueOf(i6), list2.get(cdv.b(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = iA - 1; i10 >= 0; i10--) {
                int i11 = zI4 ? (iA - i10) - 1 : i10;
                if (i11 * f3 * (zI4 ? -1 : i8) < i2 + cVar4.f || i10 < list.size()) {
                    map.put(Integer.valueOf(i11), list.get(cdv.b(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.M = map;
            int i12 = this.Q;
            if (i12 != -1) {
                this.E = e1(i12, d1(i12));
            }
        }
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        this.E = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.L = cdv.b(this.L, 0, zVar.b());
        q1(this.J);
        E(uVar);
        a1(uVar, zVar);
        this.P = a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void u0(RecyclerView.z zVar) {
        if (K() == 0) {
            this.L = 0;
        } else {
            this.L = RecyclerView.o.U(J(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.z zVar) {
        if (K() == 0 || this.J == null || a() <= 1) {
            return 0;
        }
        return (int) (this.C * (this.J.a.a / A(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.z zVar) {
        return this.E;
    }

    public CarouselLayoutManager() {
        x8w x8wVar = new x8w();
        this.H = new a();
        this.L = 0;
        this.O = new View.OnLayoutChangeListener() { // from class: jh6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new kh6(this.a, 0));
            }
        };
        this.Q = -1;
        this.R = 0;
        this.I = x8wVar;
        m1();
        o1(0);
    }
}
