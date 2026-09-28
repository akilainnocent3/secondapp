package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class rx80 {
    public static final o250 m = new o250(0.5f);
    public z4b a = new k060();
    public z4b b = new k060();
    public z4b c = new k060();
    public z4b d = new k060();
    public x4b e = new a2(0.0f);
    public x4b f = new a2(0.0f);
    public x4b g = new a2(0.0f);
    public x4b h = new a2(0.0f);
    public vlf i = new vlf();
    public vlf j = new vlf();
    public vlf k = new vlf();
    public vlf l = new vlf();

    public static final class a {
        public z4b a = new k060();
        public z4b b = new k060();
        public z4b c = new k060();
        public z4b d = new k060();
        public x4b e = new a2(0.0f);
        public x4b f = new a2(0.0f);
        public x4b g = new a2(0.0f);
        public x4b h = new a2(0.0f);
        public vlf i = new vlf();
        public vlf j = new vlf();
        public vlf k = new vlf();
        public vlf l = new vlf();

        public final rx80 a() {
            rx80 rx80Var = new rx80();
            rx80Var.a = this.a;
            rx80Var.b = this.b;
            rx80Var.c = this.c;
            rx80Var.d = this.d;
            rx80Var.e = this.e;
            rx80Var.f = this.f;
            rx80Var.g = this.g;
            rx80Var.h = this.h;
            rx80Var.i = this.i;
            rx80Var.j = this.j;
            rx80Var.k = this.k;
            rx80Var.l = this.l;
            return rx80Var;
        }

        public final void b(float f) {
            f(f);
            g(f);
            e(f);
            d(f);
        }

        public final void c(o250 o250Var) {
            this.e = o250Var;
            this.f = o250Var;
            this.g = o250Var;
            this.h = o250Var;
        }

        public final void d(float f) {
            this.h = new a2(f);
        }

        public final void e(float f) {
            this.g = new a2(f);
        }

        public final void f(float f) {
            this.e = new a2(f);
        }

        public final void g(float f) {
            this.f = new a2(f);
        }
    }

    public interface b {
        x4b a(x4b x4bVar);
    }

    public static a a(Context context, int i, int i2) {
        return b(context, i, i2, new a2(0.0f));
    }

    public static a b(Context context, int i, int i2, x4b x4bVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(pk30.a0);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            x4b x4bVarE = e(typedArrayObtainStyledAttributes, 5, x4bVar);
            x4b x4bVarE2 = e(typedArrayObtainStyledAttributes, 8, x4bVarE);
            x4b x4bVarE3 = e(typedArrayObtainStyledAttributes, 9, x4bVarE);
            x4b x4bVarE4 = e(typedArrayObtainStyledAttributes, 7, x4bVarE);
            x4b x4bVarE5 = e(typedArrayObtainStyledAttributes, 6, x4bVarE);
            a aVar = new a();
            aVar.a = gcv.a(i4);
            aVar.e = x4bVarE2;
            aVar.b = gcv.a(i5);
            aVar.f = x4bVarE3;
            aVar.c = gcv.a(i6);
            aVar.g = x4bVarE4;
            aVar.d = gcv.a(i7);
            aVar.h = x4bVarE5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static a c(Context context, AttributeSet attributeSet, int i, int i2, x4b x4bVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.K, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, x4bVar);
    }

    public static a d(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new a2(0.0f));
    }

    public static x4b e(TypedArray typedArray, int i, x4b x4bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new a2(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new o250(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return x4bVar;
    }

    public final boolean f() {
        return (this.b instanceof k060) && (this.a instanceof k060) && (this.c instanceof k060) && (this.d instanceof k060);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.l.getClass().equals(vlf.class) && this.j.getClass().equals(vlf.class) && this.i.getClass().equals(vlf.class) && this.k.getClass().equals(vlf.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final a h() {
        a aVar = new a();
        aVar.a = new k060();
        aVar.b = new k060();
        aVar.c = new k060();
        aVar.d = new k060();
        aVar.e = new a2(0.0f);
        aVar.f = new a2(0.0f);
        aVar.g = new a2(0.0f);
        aVar.h = new a2(0.0f);
        aVar.i = new vlf();
        aVar.j = new vlf();
        aVar.k = new vlf();
        new vlf();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }

    public final rx80 i(b bVar) {
        a aVarH = h();
        aVarH.e = bVar.a(this.e);
        aVarH.f = bVar.a(this.f);
        aVarH.h = bVar.a(this.h);
        aVarH.g = bVar.a(this.g);
        return aVarH.a();
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
