package ni;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f0.e3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import k.c1;
import k.e0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class k extends Drawable implements l1.k, t {
    public static final float A = 0.25f;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final Paint E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f116732y = "k";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f116733z = 0.75f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f116734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.j[] f116735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r.j[] f116736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f116737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f116738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f116739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f116740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f116741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f116742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f116743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f116744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f116745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f116746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f116747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f116748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mi.b f116749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final q.b f116750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f116751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f116752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f116753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f116754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RectF f116755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f116756x;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements q.b {
        public a() {
        }

        @Override // ni.q.b
        public void a(@NonNull r rVar, Matrix matrix, int i10) {
            k.this.f116737e.set(i10 + 4, rVar.e());
            k.this.f116736d[i10] = rVar.f(matrix);
        }

        @Override // ni.q.b
        public void b(@NonNull r rVar, Matrix matrix, int i10) {
            k.this.f116737e.set(i10, rVar.e());
            k.this.f116735c[i10] = rVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f116758a;

        public b(float f10) {
            this.f116758a = f10;
        }

        @Override // ni.p.c
        @NonNull
        public e a(@NonNull e eVar) {
            return eVar instanceof n ? eVar : new ni.b(this.f116758a, eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    static {
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new p());
    }

    public static int i0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @NonNull
    public static k m(Context context) {
        return n(context, 0.0f);
    }

    @NonNull
    public static k n(@NonNull Context context, float f10) {
        return o(context, f10, null);
    }

    @NonNull
    public static k o(@NonNull Context context, float f10, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(vh.v.c(context, ih.a.c.f90818e4, k.class.getSimpleName()));
        }
        k kVar = new k();
        kVar.a0(context);
        kVar.p0(colorStateList);
        kVar.o0(f10);
        return kVar;
    }

    public float A() {
        return this.f116734b.f116770k;
    }

    @Deprecated
    public void A0(boolean z10) {
        y0(!z10 ? 1 : 0);
    }

    public Paint.Style B() {
        return this.f116734b.f116781v;
    }

    @Deprecated
    public void B0(int i10) {
        this.f116734b.f116777r = i10;
    }

    public float C() {
        return this.f116734b.f116773n;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void C0(int i10) {
        d dVar = this.f116734b;
        if (dVar.f116778s != i10) {
            dVar.f116778s = i10;
            b0();
        }
    }

    @Deprecated
    public void D(int i10, int i11, @NonNull Path path) {
        h(new RectF(0.0f, 0.0f, i10, i11), path);
    }

    @Deprecated
    public void D0(@NonNull s sVar) {
        setShapeAppearanceModel(sVar);
    }

    @k.k
    public int E() {
        return this.f116754v;
    }

    public void E0(float f10, @k.k int i10) {
        J0(f10);
        G0(ColorStateList.valueOf(i10));
    }

    public float F() {
        return this.f116734b.f116769j;
    }

    public void F0(float f10, @Nullable ColorStateList colorStateList) {
        J0(f10);
        G0(colorStateList);
    }

    public int G() {
        return this.f116734b.f116779t;
    }

    public void G0(@Nullable ColorStateList colorStateList) {
        d dVar = this.f116734b;
        if (dVar.f116764e != colorStateList) {
            dVar.f116764e = colorStateList;
            onStateChange(getState());
        }
    }

    public int H() {
        return this.f116734b.f116776q;
    }

    public void H0(@k.k int i10) {
        I0(ColorStateList.valueOf(i10));
    }

    @Deprecated
    public int I() {
        return (int) y();
    }

    public void I0(ColorStateList colorStateList) {
        this.f116734b.f116765f = colorStateList;
        O0();
        b0();
    }

    public int J() {
        d dVar = this.f116734b;
        return (int) (((double) dVar.f116778s) * Math.sin(Math.toRadians(dVar.f116779t)));
    }

    public void J0(float f10) {
        this.f116734b.f116771l = f10;
        invalidateSelf();
    }

    public int K() {
        d dVar = this.f116734b;
        return (int) (((double) dVar.f116778s) * Math.cos(Math.toRadians(dVar.f116779t)));
    }

    public void K0(float f10) {
        d dVar = this.f116734b;
        if (dVar.f116775p != f10) {
            dVar.f116775p = f10;
            P0();
        }
    }

    public int L() {
        return this.f116734b.f116777r;
    }

    public void L0(boolean z10) {
        d dVar = this.f116734b;
        if (dVar.f116780u != z10) {
            dVar.f116780u = z10;
            invalidateSelf();
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public int M() {
        return this.f116734b.f116778s;
    }

    public void M0(float f10) {
        K0(f10 - y());
    }

    @Nullable
    @Deprecated
    public s N() {
        p shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof s) {
            return (s) shapeAppearanceModel;
        }
        return null;
    }

    public final boolean N0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f116734b.f116763d == null || color2 == (colorForState2 = this.f116734b.f116763d.getColorForState(iArr, (color2 = this.f116747o.getColor())))) {
            z10 = false;
        } else {
            this.f116747o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f116734b.f116764e == null || color == (colorForState = this.f116734b.f116764e.getColorForState(iArr, (color = this.f116748p.getColor())))) {
            return z10;
        }
        this.f116748p.setColor(colorForState);
        return true;
    }

    @Nullable
    public ColorStateList O() {
        return this.f116734b.f116764e;
    }

    public final boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f116752t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f116753u;
        d dVar = this.f116734b;
        this.f116752t = k(dVar.f116766g, dVar.f116767h, this.f116747o, true);
        d dVar2 = this.f116734b;
        this.f116753u = k(dVar2.f116765f, dVar2.f116767h, this.f116748p, false);
        d dVar3 = this.f116734b;
        if (dVar3.f116780u) {
            this.f116749q.e(dVar3.f116766g.getColorForState(getState(), 0));
        }
        return (e2.s.a(porterDuffColorFilter, this.f116752t) && e2.s.a(porterDuffColorFilter2, this.f116753u)) ? false : true;
    }

    public final float P() {
        if (Z()) {
            return this.f116748p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void P0() {
        float fW = W();
        this.f116734b.f116777r = (int) Math.ceil(0.75f * fW);
        this.f116734b.f116778s = (int) Math.ceil(fW * 0.25f);
        O0();
        b0();
    }

    @Nullable
    public ColorStateList Q() {
        return this.f116734b.f116765f;
    }

    public float R() {
        return this.f116734b.f116771l;
    }

    @Nullable
    public ColorStateList S() {
        return this.f116734b.f116766g;
    }

    public float T() {
        return this.f116734b.f116760a.r().a(w());
    }

    public float U() {
        return this.f116734b.f116760a.t().a(w());
    }

    public float V() {
        return this.f116734b.f116775p;
    }

    public float W() {
        return y() + V();
    }

    public final boolean X() {
        d dVar = this.f116734b;
        int i10 = dVar.f116776q;
        if (i10 == 1 || dVar.f116777r <= 0) {
            return false;
        }
        return i10 == 2 || k0();
    }

    public final boolean Y() {
        Paint.Style style = this.f116734b.f116781v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean Z() {
        Paint.Style style = this.f116734b.f116781v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f116748p.getStrokeWidth() > 0.0f;
    }

    public void a0(Context context) {
        this.f116734b.f116761b = new ai.a(context);
        P0();
    }

    public final void b0() {
        super.invalidateSelf();
    }

    public boolean c0() {
        ai.a aVar = this.f116734b.f116761b;
        return aVar != null && aVar.l();
    }

    public boolean d0() {
        return this.f116734b.f116761b != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f116747o.setColorFilter(this.f116752t);
        int alpha = this.f116747o.getAlpha();
        this.f116747o.setAlpha(i0(alpha, this.f116734b.f116772m));
        this.f116748p.setColorFilter(this.f116753u);
        this.f116748p.setStrokeWidth(this.f116734b.f116771l);
        int alpha2 = this.f116748p.getAlpha();
        this.f116748p.setAlpha(i0(alpha2, this.f116734b.f116772m));
        if (this.f116738f) {
            i();
            g(w(), this.f116740h);
            this.f116738f = false;
        }
        h0(canvas);
        if (Y()) {
            q(canvas);
        }
        if (Z()) {
            t(canvas);
        }
        this.f116747o.setAlpha(alpha);
        this.f116748p.setAlpha(alpha2);
    }

    public boolean e0(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @Nullable
    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f116754v = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public boolean f0() {
        return this.f116734b.f116760a.u(w());
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f116734b.f116769j != 1.0f) {
            this.f116739g.reset();
            Matrix matrix = this.f116739g;
            float f10 = this.f116734b.f116769j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f116739g);
        }
        path.computeBounds(this.f116755w, true);
    }

    @Deprecated
    public boolean g0() {
        int i10 = this.f116734b.f116776q;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f116734b.f116772m;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f116734b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f116734b.f116776q == 2) {
            return;
        }
        if (f0()) {
            outline.setRoundRect(getBounds(), T() * this.f116734b.f116770k);
        } else {
            g(w(), this.f116740h);
            zh.d.l(outline, this.f116740h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f116734b.f116768i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // ni.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f116734b.f116760a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f116744l.set(getBounds());
        g(w(), this.f116740h);
        this.f116745m.setPath(this.f116740h, this.f116744l);
        this.f116744l.op(this.f116745m, Region.Op.DIFFERENCE);
        return this.f116744l;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        q qVar = this.f116751s;
        d dVar = this.f116734b;
        qVar.e(dVar.f116760a, dVar.f116770k, rectF, this.f116750r, path);
    }

    public final void h0(@NonNull Canvas canvas) {
        if (X()) {
            canvas.save();
            j0(canvas);
            if (!this.f116756x) {
                p(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f116755w.width() - getBounds().width());
            int iHeight = (int) (this.f116755w.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f116755w.width()) + (this.f116734b.f116777r * 2) + iWidth, ((int) this.f116755w.height()) + (this.f116734b.f116777r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f116734b.f116777r) - iWidth;
            float f11 = (getBounds().top - this.f116734b.f116777r) - iHeight;
            canvas2.translate(-f10, -f11);
            p(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void i() {
        p pVarY = getShapeAppearanceModel().y(new b(-P()));
        this.f116746n = pVarY;
        this.f116751s.d(pVarY, this.f116734b.f116770k, x(), this.f116741i);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f116738f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f116734b.f116766g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f116734b.f116765f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f116734b.f116764e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f116734b.f116763d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f116754v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final void j0(@NonNull Canvas canvas) {
        canvas.translate(J(), K());
    }

    @NonNull
    public final PorterDuffColorFilter k(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public boolean k0() {
        return (f0() || this.f116740h.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @k.k
    @y0({y0.a.LIBRARY_GROUP})
    public int l(@k.k int i10) {
        float fW = W() + C();
        ai.a aVar = this.f116734b.f116761b;
        return aVar != null ? aVar.e(i10, fW) : i10;
    }

    public void l0(float f10) {
        setShapeAppearanceModel(this.f116734b.f116760a.w(f10));
    }

    public void m0(@NonNull e eVar) {
        setShapeAppearanceModel(this.f116734b.f116760a.x(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f116734b = new d(this.f116734b);
        return this;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void n0(boolean z10) {
        this.f116751s.n(z10);
    }

    public void o0(float f10) {
        d dVar = this.f116734b;
        if (dVar.f116774o != f10) {
            dVar.f116774o = f10;
            P0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f116738f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.d0.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = N0(iArr) || O0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(@NonNull Canvas canvas) {
        if (this.f116737e.cardinality() > 0) {
            Log.w(f116732y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f116734b.f116778s != 0) {
            canvas.drawPath(this.f116740h, this.f116749q.d());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f116735c[i10].b(this.f116749q, this.f116734b.f116777r, canvas);
            this.f116736d[i10].b(this.f116749q, this.f116734b.f116777r, canvas);
        }
        if (this.f116756x) {
            int iJ = J();
            int iK = K();
            canvas.translate(-iJ, -iK);
            canvas.drawPath(this.f116740h, E);
            canvas.translate(iJ, iK);
        }
    }

    public void p0(@Nullable ColorStateList colorStateList) {
        d dVar = this.f116734b;
        if (dVar.f116763d != colorStateList) {
            dVar.f116763d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void q(@NonNull Canvas canvas) {
        s(canvas, this.f116747o, this.f116740h, this.f116734b.f116760a, w());
    }

    public void q0(float f10) {
        d dVar = this.f116734b;
        if (dVar.f116770k != f10) {
            dVar.f116770k = f10;
            this.f116738f = true;
            invalidateSelf();
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void r(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        s(canvas, paint, path, this.f116734b.f116760a, rectF);
    }

    public void r0(int i10, int i11, int i12, int i13) {
        d dVar = this.f116734b;
        if (dVar.f116768i == null) {
            dVar.f116768i = new Rect();
        }
        this.f116734b.f116768i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public final void s(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull p pVar, @NonNull RectF rectF) {
        if (!pVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = pVar.t().a(rectF) * this.f116734b.f116770k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void s0(Paint.Style style) {
        this.f116734b.f116781v = style;
        b0();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@e0(from = 0, to = e3.f81880d) int i10) {
        d dVar = this.f116734b;
        if (dVar.f116772m != i10) {
            dVar.f116772m = i10;
            b0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f116734b.f116762c = colorFilter;
        b0();
    }

    @Override // ni.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f116734b.f116760a = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTint(@k.k int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f116734b.f116766g = colorStateList;
        O0();
        b0();
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        d dVar = this.f116734b;
        if (dVar.f116767h != mode) {
            dVar.f116767h = mode;
            O0();
            b0();
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void t(@NonNull Canvas canvas) {
        s(canvas, this.f116748p, this.f116741i, this.f116746n, x());
    }

    public void t0(float f10) {
        d dVar = this.f116734b;
        if (dVar.f116773n != f10) {
            dVar.f116773n = f10;
            P0();
        }
    }

    public float u() {
        return this.f116734b.f116760a.j().a(w());
    }

    public void u0(float f10) {
        d dVar = this.f116734b;
        if (dVar.f116769j != f10) {
            dVar.f116769j = f10;
            invalidateSelf();
        }
    }

    public float v() {
        return this.f116734b.f116760a.l().a(w());
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void v0(boolean z10) {
        this.f116756x = z10;
    }

    @NonNull
    public RectF w() {
        this.f116742j.set(getBounds());
        return this.f116742j;
    }

    public void w0(int i10) {
        this.f116749q.e(i10);
        this.f116734b.f116780u = false;
        b0();
    }

    @NonNull
    public final RectF x() {
        this.f116743k.set(w());
        float fP = P();
        this.f116743k.inset(fP, fP);
        return this.f116743k;
    }

    public void x0(int i10) {
        d dVar = this.f116734b;
        if (dVar.f116779t != i10) {
            dVar.f116779t = i10;
            b0();
        }
    }

    public float y() {
        return this.f116734b.f116774o;
    }

    public void y0(int i10) {
        d dVar = this.f116734b;
        if (dVar.f116776q != i10) {
            dVar.f116776q = i10;
            b0();
        }
    }

    @Nullable
    public ColorStateList z() {
        return this.f116734b.f116763d;
    }

    @Deprecated
    public void z0(int i10) {
        o0(i10);
    }

    public k(@NonNull Context context, @Nullable AttributeSet attributeSet, @k.f int i10, @c1 int i11) {
        this(p.e(context, attributeSet, i10, i11).m());
    }

    @Deprecated
    public k(@NonNull s sVar) {
        this((p) sVar);
    }

    public k(@NonNull p pVar) {
        this(new d(pVar, null));
    }

    @y0({y0.a.LIBRARY_GROUP})
    public k(@NonNull d dVar) {
        q qVar;
        this.f116735c = new r.j[4];
        this.f116736d = new r.j[4];
        this.f116737e = new BitSet(8);
        this.f116739g = new Matrix();
        this.f116740h = new Path();
        this.f116741i = new Path();
        this.f116742j = new RectF();
        this.f116743k = new RectF();
        this.f116744l = new Region();
        this.f116745m = new Region();
        Paint paint = new Paint(1);
        this.f116747o = paint;
        Paint paint2 = new Paint(1);
        this.f116748p = paint2;
        this.f116749q = new mi.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = q.k();
        } else {
            qVar = new q();
        }
        this.f116751s = qVar;
        this.f116755w = new RectF();
        this.f116756x = true;
        this.f116734b = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        O0();
        N0(getState());
        this.f116750r = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP})
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public p f116760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ai.a f116761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorFilter f116762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ColorStateList f116763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f116764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ColorStateList f116765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public ColorStateList f116766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f116767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Rect f116768i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f116769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f116770k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f116771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f116772m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f116773n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f116774o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f116775p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f116776q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f116777r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f116778s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f116779t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f116780u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f116781v;

        public d(@NonNull p pVar, @Nullable ai.a aVar) {
            this.f116763d = null;
            this.f116764e = null;
            this.f116765f = null;
            this.f116766g = null;
            this.f116767h = PorterDuff.Mode.SRC_IN;
            this.f116768i = null;
            this.f116769j = 1.0f;
            this.f116770k = 1.0f;
            this.f116772m = 255;
            this.f116773n = 0.0f;
            this.f116774o = 0.0f;
            this.f116775p = 0.0f;
            this.f116776q = 0;
            this.f116777r = 0;
            this.f116778s = 0;
            this.f116779t = 0;
            this.f116780u = false;
            this.f116781v = Paint.Style.FILL_AND_STROKE;
            this.f116760a = pVar;
            this.f116761b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            k kVar = new k(this);
            kVar.f116738f = true;
            return kVar;
        }

        public d(@NonNull d dVar) {
            this.f116763d = null;
            this.f116764e = null;
            this.f116765f = null;
            this.f116766g = null;
            this.f116767h = PorterDuff.Mode.SRC_IN;
            this.f116768i = null;
            this.f116769j = 1.0f;
            this.f116770k = 1.0f;
            this.f116772m = 255;
            this.f116773n = 0.0f;
            this.f116774o = 0.0f;
            this.f116775p = 0.0f;
            this.f116776q = 0;
            this.f116777r = 0;
            this.f116778s = 0;
            this.f116779t = 0;
            this.f116780u = false;
            this.f116781v = Paint.Style.FILL_AND_STROKE;
            this.f116760a = dVar.f116760a;
            this.f116761b = dVar.f116761b;
            this.f116771l = dVar.f116771l;
            this.f116762c = dVar.f116762c;
            this.f116763d = dVar.f116763d;
            this.f116764e = dVar.f116764e;
            this.f116767h = dVar.f116767h;
            this.f116766g = dVar.f116766g;
            this.f116772m = dVar.f116772m;
            this.f116769j = dVar.f116769j;
            this.f116778s = dVar.f116778s;
            this.f116776q = dVar.f116776q;
            this.f116780u = dVar.f116780u;
            this.f116770k = dVar.f116770k;
            this.f116773n = dVar.f116773n;
            this.f116774o = dVar.f116774o;
            this.f116775p = dVar.f116775p;
            this.f116777r = dVar.f116777r;
            this.f116779t = dVar.f116779t;
            this.f116765f = dVar.f116765f;
            this.f116781v = dVar.f116781v;
            if (dVar.f116768i != null) {
                this.f116768i = new Rect(dVar.f116768i);
            }
        }
    }
}
