package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u1 extends h2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f13052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i1 f13053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i1 f13054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f13058n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13059k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13060l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13061m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13062n = 1;

        public a(Context context) {
            this(context, u1.r(context));
        }

        public a(Context context, int i10) {
            super(s3.a.h.R0);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) u1.w(context, s3.a.n.f129019p2);
            r(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), u1.h(bitmapDrawable.getBitmap(), i10))});
            t(new String[]{context.getString(s3.a.l.f128865j), context.getString(s3.a.l.f128864i)});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends e {
        public b(Context context) {
            this(context, 1);
        }

        public b(Context context, int i10) {
            super(s3.a.h.S0);
            if (i10 < 1) {
                throw new IllegalArgumentException("numSpeeds must be > 0");
            }
            Drawable[] drawableArr = new Drawable[i10 + 1];
            drawableArr[0] = u1.w(context, s3.a.n.f129023q2);
            r(drawableArr);
            String[] strArr = new String[l()];
            strArr[0] = context.getString(s3.a.l.f128866k);
            String[] strArr2 = new String[l()];
            strArr2[0] = strArr[0];
            int i11 = 1;
            while (i11 <= i10) {
                int i12 = i11 + 1;
                strArr[i11] = context.getResources().getString(s3.a.l.f128856a, Integer.valueOf(i12));
                strArr2[i11] = context.getResources().getString(s3.a.l.f128867l, Integer.valueOf(i12));
                i11 = i12;
            }
            t(strArr);
            u(strArr2);
            a(90);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13063k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13064l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13065m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13066n = 1;

        public c(Context context) {
            this(context, u1.r(context));
        }

        public c(Context context, int i10) {
            super(s3.a.h.U0);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) u1.w(context, s3.a.n.f129027r2);
            r(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), u1.h(bitmapDrawable.getBitmap(), i10))});
            t(new String[]{context.getString(s3.a.l.f128870o), context.getString(s3.a.l.f128869n)});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends androidx.leanback.widget.d {
        public d(Context context) {
            super(s3.a.h.V0);
            h(context.getResources().getDrawable(s3.a.f.f128673s));
            j(context.getString(s3.a.l.f128871p));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class e extends androidx.leanback.widget.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13067g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Drawable[] f13068h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String[] f13069i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String[] f13070j;

        public e(int i10) {
            super(i10);
        }

        public int l() {
            Drawable[] drawableArr = this.f13068h;
            if (drawableArr != null) {
                return drawableArr.length;
            }
            String[] strArr = this.f13069i;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }

        public Drawable m(int i10) {
            Drawable[] drawableArr = this.f13068h;
            if (drawableArr == null) {
                return null;
            }
            return drawableArr[i10];
        }

        public int n() {
            return this.f13067g;
        }

        public String o(int i10) {
            String[] strArr = this.f13069i;
            if (strArr == null) {
                return null;
            }
            return strArr[i10];
        }

        public String p(int i10) {
            String[] strArr = this.f13070j;
            if (strArr == null) {
                return null;
            }
            return strArr[i10];
        }

        public void q() {
            s(this.f13067g < l() + (-1) ? this.f13067g + 1 : 0);
        }

        public void r(Drawable[] drawableArr) {
            this.f13068h = drawableArr;
            s(0);
        }

        public void s(int i10) {
            this.f13067g = i10;
            Drawable[] drawableArr = this.f13068h;
            if (drawableArr != null) {
                h(drawableArr[i10]);
            }
            String[] strArr = this.f13069i;
            if (strArr != null) {
                j(strArr[this.f13067g]);
            }
            String[] strArr2 = this.f13070j;
            if (strArr2 != null) {
                k(strArr2[this.f13067g]);
            }
        }

        public void t(String[] strArr) {
            this.f13069i = strArr;
            s(0);
        }

        public void u(String[] strArr) {
            this.f13070j = strArr;
            s(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends androidx.leanback.widget.d {
        public g(Context context) {
            super(s3.a.h.W0);
            h(u1.w(context, s3.a.n.f129035t2));
            j(context.getString(s3.a.l.f128873r));
            a(171);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13071k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13072l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13073m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13074n = 1;

        public h(Context context) {
            super(s3.a.h.X0);
            r(new Drawable[]{u1.w(context, s3.a.n.f129039u2), u1.w(context, s3.a.n.f129031s2)});
            t(new String[]{context.getString(s3.a.l.f128874s), context.getString(s3.a.l.f128872q)});
            a(85);
            a(126);
            a(127);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13075k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13076l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Deprecated
        public static final int f13077m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13078n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f13079o = 1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f13080p = 2;

        public i(Context context) {
            this(context, u1.r(context));
        }

        public i(Context context, int i10) {
            this(context, i10, i10);
        }

        public i(Context context, int i10, int i11) {
            super(s3.a.h.Y0);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) u1.w(context, s3.a.n.f129043v2);
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) u1.w(context, s3.a.n.f129047w2);
            r(new Drawable[]{bitmapDrawable, bitmapDrawable == null ? null : new BitmapDrawable(context.getResources(), u1.h(bitmapDrawable.getBitmap(), i10)), bitmapDrawable2 != null ? new BitmapDrawable(context.getResources(), u1.h(bitmapDrawable2.getBitmap(), i11)) : null});
            t(new String[]{context.getString(s3.a.l.f128875t), context.getString(s3.a.l.f128877v), context.getString(s3.a.l.f128876u)});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j extends e {
        public j(Context context) {
            this(context, 1);
        }

        public j(Context context, int i10) {
            super(s3.a.h.T0);
            if (i10 < 1) {
                throw new IllegalArgumentException("numSpeeds must be > 0");
            }
            Drawable[] drawableArr = new Drawable[i10 + 1];
            drawableArr[0] = u1.w(context, s3.a.n.f129051x2);
            r(drawableArr);
            String[] strArr = new String[l()];
            strArr[0] = context.getString(s3.a.l.f128878w);
            String[] strArr2 = new String[l()];
            strArr2[0] = strArr[0];
            int i11 = 1;
            while (i11 <= i10) {
                int i12 = i11 + 1;
                String string = context.getResources().getString(s3.a.l.f128857b, Integer.valueOf(i12));
                strArr[i11] = string;
                strArr[i11] = string;
                strArr2[i11] = context.getResources().getString(s3.a.l.f128879x, Integer.valueOf(i12));
                i11 = i12;
            }
            t(strArr);
            u(strArr2);
            a(89);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13081k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13082l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13083m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13084n = 1;

        public k(Context context) {
            this(context, u1.r(context));
        }

        public k(Context context, int i10) {
            super(s3.a.h.Z0);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) u1.w(context, s3.a.n.f129055y2);
            r(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), u1.h(bitmapDrawable.getBitmap(), i10))});
            t(new String[]{context.getString(s3.a.l.A), context.getString(s3.a.l.f128881z)});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class l extends androidx.leanback.widget.d {
        public l(Context context) {
            super(s3.a.h.f128693a1);
            h(u1.w(context, s3.a.n.f129059z2));
            j(context.getString(s3.a.l.B));
            a(87);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m extends androidx.leanback.widget.d {
        public m(Context context) {
            super(s3.a.h.f128697b1);
            h(u1.w(context, s3.a.n.A2));
            j(context.getString(s3.a.l.C));
            a(88);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class n extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final int f13085k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final int f13086l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13087m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f13088n = 1;

        public n(int i10, Context context, int i11, int i12) {
            super(i10);
            r(new Drawable[]{u1.w(context, i11), u1.w(context, i12)});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class o extends n {
        public o(Context context) {
            super(s3.a.h.f128701c1, context, s3.a.n.B2, s3.a.n.C2);
            String[] strArr = new String[l()];
            strArr[0] = context.getString(s3.a.l.D);
            strArr[1] = context.getString(s3.a.l.E);
            t(strArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class p extends n {
        public p(Context context) {
            super(s3.a.h.f128705d1, context, s3.a.n.D2, s3.a.n.E2);
            String[] strArr = new String[l()];
            strArr[0] = context.getString(s3.a.l.F);
            strArr[1] = context.getString(s3.a.l.G);
            t(strArr);
        }
    }

    public u1(Object obj) {
        this.f13051g = obj;
    }

    public static Bitmap h(Bitmap bitmap, int i10) {
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Canvas canvas = new Canvas(bitmapCopy);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCopy;
    }

    public static int r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(s3.a.c.E1, typedValue, true) ? typedValue.data : context.getResources().getColor(s3.a.d.I);
    }

    public static Drawable w(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(s3.a.c.A1, typedValue, false)) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.data, s3.a.n.f129015o2);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i10);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    @Deprecated
    public void A(int i10) {
        z(i10);
    }

    @Deprecated
    public void B(long j10) {
        z(j10);
    }

    public void C(long j10) {
        if (this.f13056l != j10) {
            this.f13056l = j10;
            f fVar = this.f13058n;
            if (fVar != null) {
                fVar.b(this, j10);
            }
        }
    }

    @Deprecated
    public void D(int i10) {
        E(i10);
    }

    @Deprecated
    public void E(long j10) {
        C(j10);
    }

    public void F(long j10) {
        if (this.f13055k != j10) {
            this.f13055k = j10;
            f fVar = this.f13058n;
            if (fVar != null) {
                fVar.c(this, j10);
            }
        }
    }

    public final void G(Context context, Bitmap bitmap) {
        this.f13052h = new BitmapDrawable(context.getResources(), bitmap);
    }

    public final void H(Drawable drawable) {
        this.f13052h = drawable;
    }

    public void I(f fVar) {
        this.f13058n = fVar;
    }

    public final void J(i1 i1Var) {
        this.f13053i = i1Var;
    }

    public final void K(i1 i1Var) {
        this.f13054j = i1Var;
    }

    @Deprecated
    public void L(int i10) {
        F(i10);
    }

    @Deprecated
    public void M(long j10) {
        F(j10);
    }

    public androidx.leanback.widget.d i(int i10) {
        androidx.leanback.widget.d dVarJ = j(u(), i10);
        return dVarJ != null ? dVarJ : j(v(), i10);
    }

    public androidx.leanback.widget.d j(i1 i1Var, int i10) {
        if (i1Var != this.f13053i && i1Var != this.f13054j) {
            throw new IllegalArgumentException("Invalid adapter");
        }
        for (int i11 = 0; i11 < i1Var.s(); i11++) {
            androidx.leanback.widget.d dVar = (androidx.leanback.widget.d) i1Var.a(i11);
            if (dVar.g(i10)) {
                return dVar;
            }
        }
        return null;
    }

    public long k() {
        return this.f13057m;
    }

    @Deprecated
    public int l() {
        return y3.a.a(k());
    }

    @Deprecated
    public long m() {
        return this.f13057m;
    }

    public long n() {
        return this.f13056l;
    }

    @Deprecated
    public int o() {
        return y3.a.a(p());
    }

    @Deprecated
    public long p() {
        return this.f13056l;
    }

    public long q() {
        return this.f13055k;
    }

    public final Drawable s() {
        return this.f13052h;
    }

    public final Object t() {
        return this.f13051g;
    }

    public final i1 u() {
        return this.f13053i;
    }

    public final i1 v() {
        return this.f13054j;
    }

    @Deprecated
    public int x() {
        return y3.a.a(y());
    }

    @Deprecated
    public long y() {
        return this.f13055k;
    }

    public void z(long j10) {
        if (this.f13057m != j10) {
            this.f13057m = j10;
            f fVar = this.f13058n;
            if (fVar != null) {
                fVar.a(this, j10);
            }
        }
    }

    public u1() {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {
        public void a(u1 u1Var, long j10) {
        }

        public void b(u1 u1Var, long j10) {
        }

        public void c(u1 u1Var, long j10) {
        }
    }
}
