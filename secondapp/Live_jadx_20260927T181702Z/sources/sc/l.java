package sc;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import f2.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f130113i = "SVGAndroidRenderer";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f130114j = 0.5522848f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f130115k = 0.2127f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f130116l = 0.7151f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f130117m = 0.0722f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f130118n = "serif";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static HashSet<String> f130119o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f130120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f130121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sc.k f130122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f130123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<h> f130124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<sc.k.j0> f130125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f130126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sc.c.q f130127h = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f130129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f130130c;

        static {
            int[] iArr = new int[sc.k.e0.d.values().length];
            f130130c = iArr;
            try {
                iArr[sc.k.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130130c[sc.k.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130130c[sc.k.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[sc.k.e0.c.values().length];
            f130129b = iArr2;
            try {
                iArr2[sc.k.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130129b[sc.k.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130129b[sc.k.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[sc.h.a.values().length];
            f130128a = iArr3;
            try {
                iArr3[sc.h.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f130128a[sc.h.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f130128a[sc.h.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f130128a[sc.h.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f130128a[sc.h.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f130128a[sc.h.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f130128a[sc.h.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f130128a[sc.h.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements sc.k.x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130133c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f130138h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<c> f130131a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f130134d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f130135e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f130136f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f130137g = -1;

        public b(sc.k.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.f130138h) {
                this.f130134d.b(this.f130131a.get(this.f130137g));
                this.f130131a.set(this.f130137g, this.f130134d);
                this.f130138h = false;
            }
            c cVar = this.f130134d;
            if (cVar != null) {
                this.f130131a.add(cVar);
            }
        }

        @Override // sc.k.x
        public void a(float f10, float f11) {
            if (this.f130138h) {
                this.f130134d.b(this.f130131a.get(this.f130137g));
                this.f130131a.set(this.f130137g, this.f130134d);
                this.f130138h = false;
            }
            c cVar = this.f130134d;
            if (cVar != null) {
                this.f130131a.add(cVar);
            }
            this.f130132b = f10;
            this.f130133c = f11;
            this.f130134d = l.this.new c(f10, f11, 0.0f, 0.0f);
            this.f130137g = this.f130131a.size();
        }

        @Override // sc.k.x
        public void b(float f10, float f11) {
            this.f130134d.a(f10, f11);
            this.f130131a.add(this.f130134d);
            l lVar = l.this;
            c cVar = this.f130134d;
            this.f130134d = lVar.new c(f10, f11, f10 - cVar.f130140a, f11 - cVar.f130141b);
            this.f130138h = false;
        }

        @Override // sc.k.x
        public void c(float f10, float f11, float f12, float f13) {
            this.f130134d.a(f10, f11);
            this.f130131a.add(this.f130134d);
            this.f130134d = l.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f130138h = false;
        }

        @Override // sc.k.x
        public void close() {
            this.f130131a.add(this.f130134d);
            b(this.f130132b, this.f130133c);
            this.f130138h = true;
        }

        @Override // sc.k.x
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f130136f || this.f130135e) {
                this.f130134d.a(f10, f11);
                this.f130131a.add(this.f130134d);
                this.f130135e = false;
            }
            this.f130134d = l.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f130138h = false;
        }

        @Override // sc.k.x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f130135e = true;
            this.f130136f = false;
            c cVar = this.f130134d;
            l.m(cVar.f130140a, cVar.f130141b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f130136f = true;
            this.f130138h = false;
        }

        public List<c> f() {
            return this.f130131a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f130140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f130143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f130144e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f130142c = 0.0f;
            this.f130143d = 0.0f;
            this.f130140a = f10;
            this.f130141b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f130142c = (float) (((double) f12) / dSqrt);
                this.f130143d = (float) (((double) f13) / dSqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f130140a;
            float f13 = f11 - this.f130141b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f130142c;
            if (f12 != (-f14) || f13 != (-this.f130143d)) {
                this.f130142c = f14 + f12;
                this.f130143d += f13;
            } else {
                this.f130144e = true;
                this.f130142c = -f13;
                this.f130143d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f130142c;
            float f11 = this.f130142c;
            if (f10 == (-f11)) {
                float f12 = cVar.f130143d;
                if (f12 == (-this.f130143d)) {
                    this.f130144e = true;
                    this.f130142c = -f12;
                    this.f130143d = cVar.f130142c;
                    return;
                }
            }
            this.f130142c = f11 + f10;
            this.f130143d += cVar.f130143d;
        }

        public String toString() {
            return gi.j.f86770c + this.f130140a + "," + this.f130141b + " " + this.f130142c + "," + this.f130143d + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements sc.k.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f130146a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130148c;

        public d(sc.k.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // sc.k.x
        public void a(float f10, float f11) {
            this.f130146a.moveTo(f10, f11);
            this.f130147b = f10;
            this.f130148c = f11;
        }

        @Override // sc.k.x
        public void b(float f10, float f11) {
            this.f130146a.lineTo(f10, f11);
            this.f130147b = f10;
            this.f130148c = f11;
        }

        @Override // sc.k.x
        public void c(float f10, float f11, float f12, float f13) {
            this.f130146a.quadTo(f10, f11, f12, f13);
            this.f130147b = f12;
            this.f130148c = f13;
        }

        @Override // sc.k.x
        public void close() {
            this.f130146a.close();
        }

        @Override // sc.k.x
        public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f130146a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f130147b = f14;
            this.f130148c = f15;
        }

        @Override // sc.k.x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            l.m(this.f130147b, this.f130148c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f130147b = f13;
            this.f130148c = f14;
        }

        public Path f() {
            return this.f130146a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Path f130150e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f130150e = path;
        }

        @Override // sc.l.f, sc.l.j
        public void b(String str) {
            String str2;
            if (l.this.g1()) {
                if (l.this.f130123d.f130160b) {
                    str2 = str;
                    l.this.f130120a.drawTextOnPath(str2, this.f130150e, this.f130152b, this.f130153c, l.this.f130123d.f130162d);
                } else {
                    str2 = str;
                }
                if (l.this.f130123d.f130161c) {
                    l.this.f130120a.drawTextOnPath(str2, this.f130150e, this.f130152b, this.f130153c, l.this.f130123d.f130163e);
                }
            } else {
                str2 = str;
            }
            this.f130152b += l.this.f130123d.f130162d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130153c;

        public f(float f10, float f11) {
            super(l.this, null);
            this.f130152b = f10;
            this.f130153c = f11;
        }

        @Override // sc.l.j
        public void b(String str) {
            l.G("TextSequence render", new Object[0]);
            if (l.this.g1()) {
                if (l.this.f130123d.f130160b) {
                    l.this.f130120a.drawText(str, this.f130152b, this.f130153c, l.this.f130123d.f130162d);
                }
                if (l.this.f130123d.f130161c) {
                    l.this.f130120a.drawText(str, this.f130152b, this.f130153c, l.this.f130123d.f130163e);
                }
            }
            this.f130152b += l.this.f130123d.f130162d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f130157d;

        public g(float f10, float f11, Path path) {
            super(l.this, null);
            this.f130155b = f10;
            this.f130156c = f11;
            this.f130157d = path;
        }

        @Override // sc.l.j
        public boolean a(sc.k.y0 y0Var) {
            if (!(y0Var instanceof sc.k.z0)) {
                return true;
            }
            l.h1("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // sc.l.j
        public void b(String str) {
            String str2;
            if (l.this.g1()) {
                Path path = new Path();
                str2 = str;
                l.this.f130123d.f130162d.getTextPath(str2, 0, str.length(), this.f130155b, this.f130156c, path);
                this.f130157d.addPath(path);
            } else {
                str2 = str;
            }
            this.f130155b += l.this.f130123d.f130162d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f130169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f130170d;

        public i(float f10, float f11) {
            super(l.this, null);
            this.f130170d = new RectF();
            this.f130168b = f10;
            this.f130169c = f11;
        }

        @Override // sc.l.j
        public boolean a(sc.k.y0 y0Var) {
            if (!(y0Var instanceof sc.k.z0)) {
                return true;
            }
            sc.k.z0 z0Var = (sc.k.z0) y0Var;
            sc.k.n0 n0VarP = y0Var.f130050a.P(z0Var.f130110o);
            if (n0VarP == null) {
                l.N("TextPath path reference '%s' not found", z0Var.f130110o);
                return false;
            }
            sc.k.v vVar = (sc.k.v) n0VarP;
            Path pathF = l.this.new d(vVar.f130087o).f();
            Matrix matrix = vVar.f130039n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f130170d.union(rectF);
            return false;
        }

        @Override // sc.l.j
        public void b(String str) {
            if (l.this.g1()) {
                Rect rect = new Rect();
                l.this.f130123d.f130162d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f130168b, this.f130169c);
                this.f130170d.union(rectF);
            }
            this.f130168b += l.this.f130123d.f130162d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class j {
        public j() {
        }

        public boolean a(sc.k.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(l lVar, a aVar) {
            this();
        }
    }

    public l(Canvas canvas, float f10) {
        this.f130120a = canvas;
        this.f130121b = f10;
    }

    public static double B(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    public static int C(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    public static int F(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & z1.f82662x) | (i11 << 24);
    }

    public static void N(String str, Object... objArr) {
        Log.e(f130113i, String.format(str, objArr));
    }

    public static synchronized void d0() {
        HashSet<String> hashSet = new HashSet<>();
        f130119o = hashSet;
        hashSet.add("Structure");
        f130119o.add("BasicStructure");
        f130119o.add("ConditionalProcessing");
        f130119o.add("Image");
        f130119o.add("Style");
        f130119o.add("ViewportAttribute");
        f130119o.add("Shape");
        f130119o.add("BasicText");
        f130119o.add("PaintAttribute");
        f130119o.add("BasicPaintAttribute");
        f130119o.add("OpacityAttribute");
        f130119o.add("BasicGraphicsAttribute");
        f130119o.add("Marker");
        f130119o.add("Gradient");
        f130119o.add("Pattern");
        f130119o.add("Clip");
        f130119o.add("BasicClip");
        f130119o.add("Mask");
        f130119o.add("View");
    }

    public static void h1(String str, Object... objArr) {
        Log.w(f130113i, String.format(str, objArr));
    }

    public static void m(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, sc.k.x xVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            xVar.b(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dB = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * B(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dB > 0.0d) {
            dB -= 6.283185307179586d;
        } else if (z11 && dB < 0.0d) {
            dB += 6.283185307179586d;
        }
        float[] fArrN = n(dAcos % 6.283185307179586d, dB % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrN);
        fArrN[fArrN.length - 2] = f15;
        fArrN[fArrN.length - 1] = f16;
        for (int i10 = 0; i10 < fArrN.length; i10 += 6) {
            xVar.d(fArrN[i10], fArrN[i10 + 1], fArrN[i10 + 2], fArrN[i10 + 3], fArrN[i10 + 4], fArrN[i10 + 5]);
        }
    }

    public static float[] n(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    public final void A(sc.k.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof sc.k.l0) && (bool = ((sc.k.l0) n0Var).f130041d) != null) {
            this.f130123d.f130166h = bool.booleanValue();
        }
    }

    public final void A0(sc.k.q qVar) {
        G("Line render", new Object[0]);
        e1(this.f130123d, qVar);
        if (I() && g1() && this.f130123d.f130161c) {
            Matrix matrix = qVar.f130039n;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            Path pathI0 = i0(qVar);
            c1(qVar);
            x(qVar);
            u(qVar);
            boolean zU0 = u0();
            K(pathI0);
            Q0(qVar);
            if (zU0) {
                r0(qVar);
            }
        }
    }

    public final void B0(sc.k.v vVar) {
        G("Path render", new Object[0]);
        if (vVar.f130087o == null) {
            return;
        }
        e1(this.f130123d, vVar);
        if (I() && g1()) {
            h hVar = this.f130123d;
            if (hVar.f130161c || hVar.f130160b) {
                Matrix matrix = vVar.f130039n;
                if (matrix != null) {
                    this.f130120a.concat(matrix);
                }
                Path pathF = new d(vVar.f130087o).f();
                if (vVar.f130038h == null) {
                    vVar.f130038h = r(pathF);
                }
                c1(vVar);
                x(vVar);
                u(vVar);
                boolean zU0 = u0();
                if (this.f130123d.f130160b) {
                    pathF.setFillType(c0());
                    J(vVar, pathF);
                }
                if (this.f130123d.f130161c) {
                    K(pathF);
                }
                Q0(vVar);
                if (zU0) {
                    r0(vVar);
                }
            }
        }
    }

    public final void C0(sc.k.z zVar) {
        G("PolyLine render", new Object[0]);
        e1(this.f130123d, zVar);
        if (I() && g1()) {
            h hVar = this.f130123d;
            if (hVar.f130161c || hVar.f130160b) {
                Matrix matrix = zVar.f130039n;
                if (matrix != null) {
                    this.f130120a.concat(matrix);
                }
                if (zVar.f130109o.length < 2) {
                    return;
                }
                Path pathJ0 = j0(zVar);
                c1(zVar);
                pathJ0.setFillType(c0());
                x(zVar);
                u(zVar);
                boolean zU0 = u0();
                if (this.f130123d.f130160b) {
                    J(zVar, pathJ0);
                }
                if (this.f130123d.f130161c) {
                    K(pathJ0);
                }
                Q0(zVar);
                if (zU0) {
                    r0(zVar);
                }
            }
        }
    }

    public final void D() {
        this.f130120a.restore();
        this.f130123d = this.f130124e.pop();
    }

    public final void D0(sc.k.a0 a0Var) {
        G("Polygon render", new Object[0]);
        e1(this.f130123d, a0Var);
        if (I() && g1()) {
            h hVar = this.f130123d;
            if (hVar.f130161c || hVar.f130160b) {
                Matrix matrix = a0Var.f130039n;
                if (matrix != null) {
                    this.f130120a.concat(matrix);
                }
                if (a0Var.f130109o.length < 2) {
                    return;
                }
                Path pathJ0 = j0(a0Var);
                c1(a0Var);
                x(a0Var);
                u(a0Var);
                boolean zU0 = u0();
                if (this.f130123d.f130160b) {
                    J(a0Var, pathJ0);
                }
                if (this.f130123d.f130161c) {
                    K(pathJ0);
                }
                Q0(a0Var);
                if (zU0) {
                    r0(a0Var);
                }
            }
        }
    }

    public final void E() {
        sc.d.a(this.f130120a, sc.d.f129833a);
        this.f130124e.push(this.f130123d);
        this.f130123d = new h(this.f130123d);
    }

    public final void E0(sc.k.b0 b0Var) {
        G("Rect render", new Object[0]);
        sc.k.p pVar = b0Var.f129914q;
        if (pVar == null || b0Var.f129915r == null || pVar.i() || b0Var.f129915r.i()) {
            return;
        }
        e1(this.f130123d, b0Var);
        if (I() && g1()) {
            Matrix matrix = b0Var.f130039n;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            Path pathK0 = k0(b0Var);
            c1(b0Var);
            x(b0Var);
            u(b0Var);
            boolean zU0 = u0();
            if (this.f130123d.f130160b) {
                J(b0Var, pathK0);
            }
            if (this.f130123d.f130161c) {
                K(pathK0);
            }
            if (zU0) {
                r0(b0Var);
            }
        }
    }

    public final void F0(sc.k.f0 f0Var) {
        H0(f0Var, n0(f0Var.f130007q, f0Var.f130008r, f0Var.f130009s, f0Var.f130010t), f0Var.f130076p, f0Var.f130060o);
    }

    public final void G0(sc.k.f0 f0Var, sc.k.b bVar) {
        H0(f0Var, bVar, f0Var.f130076p, f0Var.f130060o);
    }

    public final void H(boolean z10, sc.k.b bVar, sc.k.u uVar) {
        sc.k.n0 n0VarP = this.f130122c.P(uVar.f130083b);
        if (n0VarP == null) {
            N("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f130083b);
            sc.k.o0 o0Var = uVar.f130084c;
            if (o0Var != null) {
                X0(this.f130123d, z10, o0Var);
                return;
            } else if (z10) {
                this.f130123d.f130160b = false;
                return;
            } else {
                this.f130123d.f130161c = false;
                return;
            }
        }
        if (n0VarP instanceof sc.k.m0) {
            f0(z10, bVar, (sc.k.m0) n0VarP);
        } else if (n0VarP instanceof sc.k.q0) {
            m0(z10, bVar, (sc.k.q0) n0VarP);
        } else if (n0VarP instanceof sc.k.c0) {
            Y0(z10, (sc.k.c0) n0VarP);
        }
    }

    public final void H0(sc.k.f0 f0Var, sc.k.b bVar, sc.k.b bVar2, sc.h hVar) {
        G("Svg render", new Object[0]);
        if (bVar.f129910c == 0.0f || bVar.f129911d == 0.0f) {
            return;
        }
        if (hVar == null && (hVar = f0Var.f130060o) == null) {
            hVar = sc.h.f129843e;
        }
        e1(this.f130123d, f0Var);
        if (I()) {
            h hVar2 = this.f130123d;
            hVar2.f130164f = bVar;
            if (!hVar2.f130159a.f129960w.booleanValue()) {
                sc.k.b bVar3 = this.f130123d.f130164f;
                W0(bVar3.f129908a, bVar3.f129909b, bVar3.f129910c, bVar3.f129911d);
            }
            v(f0Var, this.f130123d.f130164f);
            if (bVar2 != null) {
                this.f130120a.concat(t(this.f130123d.f130164f, bVar2, hVar));
                this.f130123d.f130165g = f0Var.f130076p;
            } else {
                Canvas canvas = this.f130120a;
                sc.k.b bVar4 = this.f130123d.f130164f;
                canvas.translate(bVar4.f129908a, bVar4.f129909b);
            }
            boolean zU0 = u0();
            f1();
            N0(f0Var, true);
            if (zU0) {
                r0(f0Var);
            }
            c1(f0Var);
        }
    }

    public final boolean I() {
        Boolean bool = this.f130123d.f130159a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void I0(sc.k.n0 n0Var) {
        if (n0Var instanceof sc.k.t) {
            return;
        }
        a1();
        A(n0Var);
        if (n0Var instanceof sc.k.f0) {
            F0((sc.k.f0) n0Var);
        } else if (n0Var instanceof sc.k.e1) {
            M0((sc.k.e1) n0Var);
        } else if (n0Var instanceof sc.k.s0) {
            J0((sc.k.s0) n0Var);
        } else if (n0Var instanceof sc.k.m) {
            y0((sc.k.m) n0Var);
        } else if (n0Var instanceof sc.k.o) {
            z0((sc.k.o) n0Var);
        } else if (n0Var instanceof sc.k.v) {
            B0((sc.k.v) n0Var);
        } else if (n0Var instanceof sc.k.b0) {
            E0((sc.k.b0) n0Var);
        } else if (n0Var instanceof sc.k.d) {
            w0((sc.k.d) n0Var);
        } else if (n0Var instanceof sc.k.i) {
            x0((sc.k.i) n0Var);
        } else if (n0Var instanceof sc.k.q) {
            A0((sc.k.q) n0Var);
        } else if (n0Var instanceof sc.k.a0) {
            D0((sc.k.a0) n0Var);
        } else if (n0Var instanceof sc.k.z) {
            C0((sc.k.z) n0Var);
        } else if (n0Var instanceof sc.k.w0) {
            L0((sc.k.w0) n0Var);
        }
        Z0();
    }

    public final void J(sc.k.k0 k0Var, Path path) {
        sc.k.o0 o0Var = this.f130123d.f130159a.f129940c;
        if (o0Var instanceof sc.k.u) {
            sc.k.n0 n0VarP = this.f130122c.P(((sc.k.u) o0Var).f130083b);
            if (n0VarP instanceof sc.k.y) {
                T(k0Var, path, (sc.k.y) n0VarP);
                return;
            }
        }
        this.f130120a.drawPath(path, this.f130123d.f130162d);
    }

    public final void J0(sc.k.s0 s0Var) {
        G("Switch render", new Object[0]);
        e1(this.f130123d, s0Var);
        if (I()) {
            Matrix matrix = s0Var.f130045o;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            u(s0Var);
            boolean zU0 = u0();
            S0(s0Var);
            if (zU0) {
                r0(s0Var);
            }
            c1(s0Var);
        }
    }

    public final void K(Path path) {
        h hVar = this.f130123d;
        if (hVar.f130159a.M != sc.k.e0.i.NonScalingStroke) {
            this.f130120a.drawPath(path, hVar.f130163e);
            return;
        }
        Matrix matrix = this.f130120a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f130120a.setMatrix(new Matrix());
        Shader shader = this.f130123d.f130163e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f130120a.drawPath(path2, this.f130123d.f130163e);
        this.f130120a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void K0(sc.k.t0 t0Var, sc.k.b bVar) {
        G("Symbol render", new Object[0]);
        if (bVar.f129910c == 0.0f || bVar.f129911d == 0.0f) {
            return;
        }
        sc.h hVar = t0Var.f130060o;
        if (hVar == null) {
            hVar = sc.h.f129843e;
        }
        e1(this.f130123d, t0Var);
        h hVar2 = this.f130123d;
        hVar2.f130164f = bVar;
        if (!hVar2.f130159a.f129960w.booleanValue()) {
            sc.k.b bVar2 = this.f130123d.f130164f;
            W0(bVar2.f129908a, bVar2.f129909b, bVar2.f129910c, bVar2.f129911d);
        }
        sc.k.b bVar3 = t0Var.f130076p;
        if (bVar3 != null) {
            this.f130120a.concat(t(this.f130123d.f130164f, bVar3, hVar));
            this.f130123d.f130165g = t0Var.f130076p;
        } else {
            Canvas canvas = this.f130120a;
            sc.k.b bVar4 = this.f130123d.f130164f;
            canvas.translate(bVar4.f129908a, bVar4.f129909b);
        }
        boolean zU0 = u0();
        N0(t0Var, true);
        if (zU0) {
            r0(t0Var);
        }
        c1(t0Var);
    }

    public final float L(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public final void L0(sc.k.w0 w0Var) {
        G("Text render", new Object[0]);
        e1(this.f130123d, w0Var);
        if (I()) {
            Matrix matrix = w0Var.f130100s;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            List<sc.k.p> list = w0Var.f129904o;
            float f10 = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : w0Var.f129904o.get(0).e(this);
            List<sc.k.p> list2 = w0Var.f129905p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f129905p.get(0).f(this);
            List<sc.k.p> list3 = w0Var.f129906q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f129906q.get(0).e(this);
            List<sc.k.p> list4 = w0Var.f129907r;
            if (list4 != null && list4.size() != 0) {
                f10 = w0Var.f129907r.get(0).f(this);
            }
            sc.k.e0.f fVarW = W();
            if (fVarW != sc.k.e0.f.Start) {
                float fS = s(w0Var);
                if (fVarW == sc.k.e0.f.Middle) {
                    fS /= 2.0f;
                }
                fE -= fS;
            }
            if (w0Var.f130038h == null) {
                i iVar = new i(fE, f11);
                M(w0Var, iVar);
                RectF rectF = iVar.f130170d;
                w0Var.f130038h = new sc.k.b(rectF.left, rectF.top, rectF.width(), iVar.f130170d.height());
            }
            c1(w0Var);
            x(w0Var);
            u(w0Var);
            boolean zU0 = u0();
            M(w0Var, new f(fE + fE2, f11 + f10));
            if (zU0) {
                r0(w0Var);
            }
        }
    }

    public final void M(sc.k.y0 y0Var, j jVar) {
        if (I()) {
            Iterator<sc.k.n0> it = y0Var.f130014i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                sc.k.n0 next = it.next();
                if (next instanceof sc.k.c1) {
                    jVar.b(b1(((sc.k.c1) next).f129922c, z10, !it.hasNext()));
                } else {
                    t0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    public final void M0(sc.k.e1 e1Var) {
        G("Use render", new Object[0]);
        sc.k.p pVar = e1Var.f130002s;
        if (pVar == null || !pVar.i()) {
            sc.k.p pVar2 = e1Var.f130003t;
            if (pVar2 == null || !pVar2.i()) {
                e1(this.f130123d, e1Var);
                if (I()) {
                    sc.k.n0 n0VarP = e1Var.f130050a.P(e1Var.f129999p);
                    if (n0VarP == null) {
                        N("Use reference '%s' not found", e1Var.f129999p);
                        return;
                    }
                    Matrix matrix = e1Var.f130045o;
                    if (matrix != null) {
                        this.f130120a.concat(matrix);
                    }
                    sc.k.p pVar3 = e1Var.f130000q;
                    float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
                    sc.k.p pVar4 = e1Var.f130001r;
                    this.f130120a.translate(fE, pVar4 != null ? pVar4.f(this) : 0.0f);
                    u(e1Var);
                    boolean zU0 = u0();
                    q0(e1Var);
                    if (n0VarP instanceof sc.k.f0) {
                        sc.k.b bVarN0 = n0(null, null, e1Var.f130002s, e1Var.f130003t);
                        a1();
                        G0((sc.k.f0) n0VarP, bVarN0);
                        Z0();
                    } else if (n0VarP instanceof sc.k.t0) {
                        sc.k.p pVar5 = e1Var.f130002s;
                        if (pVar5 == null) {
                            pVar5 = new sc.k.p(100.0f, sc.k.d1.percent);
                        }
                        sc.k.p pVar6 = e1Var.f130003t;
                        if (pVar6 == null) {
                            pVar6 = new sc.k.p(100.0f, sc.k.d1.percent);
                        }
                        sc.k.b bVarN1 = n0(null, null, pVar5, pVar6);
                        a1();
                        K0((sc.k.t0) n0VarP, bVarN1);
                        Z0();
                    } else {
                        I0(n0VarP);
                    }
                    p0();
                    if (zU0) {
                        r0(e1Var);
                    }
                    c1(e1Var);
                }
            }
        }
    }

    public final void N0(sc.k.j0 j0Var, boolean z10) {
        if (z10) {
            q0(j0Var);
        }
        Iterator<sc.k.n0> it = j0Var.h().iterator();
        while (it.hasNext()) {
            I0(it.next());
        }
        if (z10) {
            p0();
        }
    }

    public final void O(sc.k.y0 y0Var, StringBuilder sb2) {
        Iterator<sc.k.n0> it = y0Var.f130014i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            sc.k.n0 next = it.next();
            if (next instanceof sc.k.y0) {
                O((sc.k.y0) next, sb2);
            } else if (next instanceof sc.k.c1) {
                sb2.append(b1(((sc.k.c1) next).f129922c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void O0(sc.k kVar, sc.j jVar) {
        sc.k.b bVar;
        sc.h hVar;
        if (jVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f130122c = kVar;
        sc.k.f0 f0VarZ = kVar.z();
        if (f0VarZ == null) {
            h1("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (jVar.f()) {
            sc.k.l0 l0VarO = this.f130122c.o(jVar.f129875e);
            if (l0VarO == null || !(l0VarO instanceof sc.k.f1)) {
                Log.w(f130113i, String.format("View element with id \"%s\" not found.", jVar.f129875e));
                return;
            }
            sc.k.f1 f1Var = (sc.k.f1) l0VarO;
            bVar = f1Var.f130076p;
            if (bVar == null) {
                Log.w(f130113i, String.format("View element with id \"%s\" is missing a viewBox attribute.", jVar.f129875e));
                return;
            }
            hVar = f1Var.f130060o;
        } else {
            bVar = jVar.g() ? jVar.f129874d : f0VarZ.f130076p;
            hVar = jVar.d() ? jVar.f129872b : f0VarZ.f130060o;
        }
        if (jVar.c()) {
            kVar.a(jVar.f129871a);
        }
        if (jVar.e()) {
            sc.c.q qVar = new sc.c.q();
            this.f130127h = qVar;
            qVar.f129822a = kVar.o(jVar.f129873c);
        }
        V0();
        A(f0VarZ);
        a1();
        sc.k.b bVar2 = new sc.k.b(jVar.f129876f);
        sc.k.p pVar = f0VarZ.f130009s;
        if (pVar != null) {
            bVar2.f129910c = pVar.d(this, bVar2.f129910c);
        }
        sc.k.p pVar2 = f0VarZ.f130010t;
        if (pVar2 != null) {
            bVar2.f129911d = pVar2.d(this, bVar2.f129911d);
        }
        H0(f0VarZ, bVar2, bVar, hVar);
        Z0();
        if (jVar.c()) {
            kVar.b();
        }
    }

    public final void P(sc.k.j jVar, String str) {
        sc.k.n0 n0VarP = jVar.f130050a.P(str);
        if (n0VarP == null) {
            h1("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof sc.k.j)) {
            N("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarP == jVar) {
            N("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        sc.k.j jVar2 = (sc.k.j) n0VarP;
        if (jVar.f130030i == null) {
            jVar.f130030i = jVar2.f130030i;
        }
        if (jVar.f130031j == null) {
            jVar.f130031j = jVar2.f130031j;
        }
        if (jVar.f130032k == null) {
            jVar.f130032k = jVar2.f130032k;
        }
        if (jVar.f130029h.isEmpty()) {
            jVar.f130029h = jVar2.f130029h;
        }
        try {
            if (jVar instanceof sc.k.m0) {
                Q((sc.k.m0) jVar, (sc.k.m0) n0VarP);
            } else {
                R((sc.k.q0) jVar, (sc.k.q0) n0VarP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f130033l;
        if (str2 != null) {
            P(jVar, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(sc.k.r r12, sc.l.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.l.P0(sc.k$r, sc.l$c):void");
    }

    public final void Q(sc.k.m0 m0Var, sc.k.m0 m0Var2) {
        if (m0Var.f130046m == null) {
            m0Var.f130046m = m0Var2.f130046m;
        }
        if (m0Var.f130047n == null) {
            m0Var.f130047n = m0Var2.f130047n;
        }
        if (m0Var.f130048o == null) {
            m0Var.f130048o = m0Var2.f130048o;
        }
        if (m0Var.f130049p == null) {
            m0Var.f130049p = m0Var2.f130049p;
        }
    }

    public final void Q0(sc.k.l lVar) {
        sc.k.r rVar;
        sc.k.r rVar2;
        sc.k.r rVar3;
        List<c> listP;
        int size;
        sc.k.e0 e0Var = this.f130123d.f130159a;
        String str = e0Var.f129962y;
        if (str == null && e0Var.f129963z == null && e0Var.A == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            sc.k.n0 n0VarP = lVar.f130050a.P(str);
            if (n0VarP != null) {
                rVar = (sc.k.r) n0VarP;
            } else {
                N("Marker reference '%s' not found", this.f130123d.f130159a.f129962y);
                rVar = null;
            }
        }
        String str2 = this.f130123d.f130159a.f129963z;
        if (str2 == null) {
            rVar2 = null;
        } else {
            sc.k.n0 n0VarP2 = lVar.f130050a.P(str2);
            if (n0VarP2 != null) {
                rVar2 = (sc.k.r) n0VarP2;
            } else {
                N("Marker reference '%s' not found", this.f130123d.f130159a.f129963z);
                rVar2 = null;
            }
        }
        String str3 = this.f130123d.f130159a.A;
        if (str3 == null) {
            rVar3 = null;
        } else {
            sc.k.n0 n0VarP3 = lVar.f130050a.P(str3);
            if (n0VarP3 != null) {
                rVar3 = (sc.k.r) n0VarP3;
            } else {
                N("Marker reference '%s' not found", this.f130123d.f130159a.A);
                rVar3 = null;
            }
        }
        if (lVar instanceof sc.k.v) {
            listP = new b(((sc.k.v) lVar).f130087o).f();
        } else {
            listP = lVar instanceof sc.k.q ? p((sc.k.q) lVar) : q((sc.k.z) lVar);
        }
        if (listP == null || (size = listP.size()) == 0) {
            return;
        }
        sc.k.e0 e0Var2 = this.f130123d.f130159a;
        e0Var2.A = null;
        e0Var2.f129963z = null;
        e0Var2.f129962y = null;
        if (rVar != null) {
            P0(rVar, listP.get(0));
        }
        if (rVar2 != null && listP.size() > 2) {
            c cVarV0 = listP.get(0);
            c cVar = listP.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = listP.get(i10);
                cVarV0 = cVar.f130144e ? v0(cVarV0, cVar, cVar2) : cVar;
                P0(rVar2, cVarV0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            P0(rVar3, listP.get(size - 1));
        }
    }

    public final void R(sc.k.q0 q0Var, sc.k.q0 q0Var2) {
        if (q0Var.f130065m == null) {
            q0Var.f130065m = q0Var2.f130065m;
        }
        if (q0Var.f130066n == null) {
            q0Var.f130066n = q0Var2.f130066n;
        }
        if (q0Var.f130067o == null) {
            q0Var.f130067o = q0Var2.f130067o;
        }
        if (q0Var.f130068p == null) {
            q0Var.f130068p = q0Var2.f130068p;
        }
        if (q0Var.f130069q == null) {
            q0Var.f130069q = q0Var2.f130069q;
        }
    }

    public final void R0(sc.k.s sVar, sc.k.k0 k0Var, sc.k.b bVar) {
        float fE;
        float f10;
        G("Mask render", new Object[0]);
        Boolean bool = sVar.f130077o;
        if (bool == null || !bool.booleanValue()) {
            sc.k.p pVar = sVar.f130081s;
            float fD = pVar != null ? pVar.d(this, 1.0f) : 1.2f;
            sc.k.p pVar2 = sVar.f130082t;
            float fD2 = pVar2 != null ? pVar2.d(this, 1.0f) : 1.2f;
            fE = fD * bVar.f129910c;
            f10 = fD2 * bVar.f129911d;
        } else {
            sc.k.p pVar3 = sVar.f130081s;
            fE = pVar3 != null ? pVar3.e(this) : bVar.f129910c;
            sc.k.p pVar4 = sVar.f130082t;
            f10 = pVar4 != null ? pVar4.f(this) : bVar.f129911d;
        }
        if (fE == 0.0f || f10 == 0.0f) {
            return;
        }
        a1();
        h hVarU = U(sVar);
        this.f130123d = hVarU;
        hVarU.f130159a.f129951n = Float.valueOf(1.0f);
        boolean zU0 = u0();
        this.f130120a.save();
        Boolean bool2 = sVar.f130078p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f130120a.translate(bVar.f129908a, bVar.f129909b);
            this.f130120a.scale(bVar.f129910c, bVar.f129911d);
        }
        N0(sVar, false);
        this.f130120a.restore();
        if (zU0) {
            s0(k0Var, bVar);
        }
        Z0();
    }

    public final void S(sc.k.y yVar, String str) {
        sc.k.n0 n0VarP = yVar.f130050a.P(str);
        if (n0VarP == null) {
            h1("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof sc.k.y)) {
            N("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarP == yVar) {
            N("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        sc.k.y yVar2 = (sc.k.y) n0VarP;
        if (yVar.f130101q == null) {
            yVar.f130101q = yVar2.f130101q;
        }
        if (yVar.f130102r == null) {
            yVar.f130102r = yVar2.f130102r;
        }
        if (yVar.f130103s == null) {
            yVar.f130103s = yVar2.f130103s;
        }
        if (yVar.f130104t == null) {
            yVar.f130104t = yVar2.f130104t;
        }
        if (yVar.f130105u == null) {
            yVar.f130105u = yVar2.f130105u;
        }
        if (yVar.f130106v == null) {
            yVar.f130106v = yVar2.f130106v;
        }
        if (yVar.f130107w == null) {
            yVar.f130107w = yVar2.f130107w;
        }
        if (yVar.f130014i.isEmpty()) {
            yVar.f130014i = yVar2.f130014i;
        }
        if (yVar.f130076p == null) {
            yVar.f130076p = yVar2.f130076p;
        }
        if (yVar.f130060o == null) {
            yVar.f130060o = yVar2.f130060o;
        }
        String str2 = yVar2.f130108x;
        if (str2 != null) {
            S(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(sc.k.s0 s0Var) {
        Set<String> setG;
        String language = Locale.getDefault().getLanguage();
        m mVarS = sc.k.s();
        for (sc.k.n0 n0Var : s0Var.h()) {
            if (n0Var instanceof sc.k.g0) {
                sc.k.g0 g0Var = (sc.k.g0) n0Var;
                if (g0Var.a() == null && ((setG = g0Var.g()) == null || (!setG.isEmpty() && setG.contains(language)))) {
                    Set<String> requiredFeatures = g0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f130119o == null) {
                            d0();
                        }
                        if (requiredFeatures.isEmpty() || !f130119o.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> setF = g0Var.f();
                    if (setF != null) {
                        if (!setF.isEmpty() && mVarS != null) {
                            Iterator<String> it = setF.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!mVarS.a(it.next())) {
                                    }
                                }
                            }
                        }
                    }
                    Set<String> setN = g0Var.n();
                    if (setN != null) {
                        if (!setN.isEmpty() && mVarS != null) {
                            Iterator<String> it2 = setN.iterator();
                            do {
                                if (it2.hasNext()) {
                                }
                            } while (mVarS.c(it2.next(), this.f130123d.f130159a.f129955r.intValue(), String.valueOf(this.f130123d.f130159a.f129956s)) != null);
                        }
                    }
                    I0(n0Var);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    public final void T(sc.k.k0 k0Var, Path path, sc.k.y yVar) {
        float fE;
        float f10;
        float f11;
        float fE2;
        boolean z10;
        boolean z11;
        Boolean bool = yVar.f130101q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = yVar.f130108x;
        if (str != null) {
            S(yVar, str);
        }
        if (z12) {
            sc.k.p pVar = yVar.f130104t;
            fE = pVar != null ? pVar.e(this) : 0.0f;
            sc.k.p pVar2 = yVar.f130105u;
            f11 = pVar2 != null ? pVar2.f(this) : 0.0f;
            sc.k.p pVar3 = yVar.f130106v;
            fE2 = pVar3 != null ? pVar3.e(this) : 0.0f;
            sc.k.p pVar4 = yVar.f130107w;
            f10 = pVar4 != null ? pVar4.f(this) : 0.0f;
        } else {
            sc.k.p pVar5 = yVar.f130104t;
            float fD = pVar5 != null ? pVar5.d(this, 1.0f) : 0.0f;
            sc.k.p pVar6 = yVar.f130105u;
            float fD2 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.0f;
            sc.k.p pVar7 = yVar.f130106v;
            float fD3 = pVar7 != null ? pVar7.d(this, 1.0f) : 0.0f;
            sc.k.p pVar8 = yVar.f130107w;
            float fD4 = pVar8 != null ? pVar8.d(this, 1.0f) : 0.0f;
            sc.k.b bVar = k0Var.f130038h;
            float f12 = bVar.f129908a;
            float f13 = bVar.f129910c;
            fE = (fD * f13) + f12;
            float f14 = bVar.f129909b;
            float f15 = bVar.f129911d;
            float f16 = fD3 * f13;
            f10 = fD4 * f15;
            f11 = (fD2 * f15) + f14;
            fE2 = f16;
        }
        if (fE2 == 0.0f || f10 == 0.0f) {
            return;
        }
        sc.h hVar = yVar.f130060o;
        if (hVar == null) {
            hVar = sc.h.f129843e;
        }
        a1();
        this.f130120a.clipPath(path);
        h hVar2 = new h();
        d1(hVar2, sc.k.e0.a());
        hVar2.f130159a.f129960w = Boolean.FALSE;
        this.f130123d = V(yVar, hVar2);
        sc.k.b bVar2 = k0Var.f130038h;
        Matrix matrix = yVar.f130103s;
        if (matrix != null) {
            this.f130120a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (yVar.f130103s.invert(matrix2)) {
                sc.k.b bVar3 = k0Var.f130038h;
                float f17 = bVar3.f129908a;
                float f18 = bVar3.f129909b;
                float fB = bVar3.b();
                sc.k.b bVar4 = k0Var.f130038h;
                z10 = false;
                float f19 = bVar4.f129909b;
                float fB2 = bVar4.b();
                z11 = true;
                float fC = k0Var.f130038h.c();
                sc.k.b bVar5 = k0Var.f130038h;
                float[] fArr = {f17, f18, fB, f19, fB2, fC, bVar5.f129908a, bVar5.c()};
                matrix2.mapPoints(fArr);
                float f20 = fArr[0];
                float f21 = fArr[1];
                RectF rectF = new RectF(f20, f21, f20, f21);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f22 = fArr[i10];
                    if (f22 < rectF.left) {
                        rectF.left = f22;
                    }
                    if (f22 > rectF.right) {
                        rectF.right = f22;
                    }
                    float f23 = fArr[i10 + 1];
                    if (f23 < rectF.top) {
                        rectF.top = f23;
                    }
                    if (f23 > rectF.bottom) {
                        rectF.bottom = f23;
                    }
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                bVar2 = new sc.k.b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z10 = false;
                z11 = true;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        float fFloor = fE + (((float) Math.floor((bVar2.f129908a - fE) / fE2)) * fE2);
        float fB3 = bVar2.b();
        float fC2 = bVar2.c();
        sc.k.b bVar6 = new sc.k.b(0.0f, 0.0f, fE2, f10);
        boolean zU0 = u0();
        for (float fFloor2 = f11 + (((float) Math.floor((bVar2.f129909b - f11) / f10)) * f10); fFloor2 < fC2; fFloor2 += f10) {
            float f26 = fFloor;
            while (f26 < fB3) {
                bVar6.f129908a = f26;
                bVar6.f129909b = fFloor2;
                a1();
                if (!this.f130123d.f130159a.f129960w.booleanValue()) {
                    W0(bVar6.f129908a, bVar6.f129909b, bVar6.f129910c, bVar6.f129911d);
                }
                sc.k.b bVar7 = yVar.f130076p;
                if (bVar7 != null) {
                    this.f130120a.concat(t(bVar6, bVar7, hVar));
                } else {
                    Boolean bool2 = yVar.f130102r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f130120a.translate(f26, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f130120a;
                        sc.k.b bVar8 = k0Var.f130038h;
                        canvas.scale(bVar8.f129910c, bVar8.f129911d);
                    }
                }
                Iterator<sc.k.n0> it = yVar.f130014i.iterator();
                while (it.hasNext()) {
                    I0(it.next());
                }
                Z0();
                f26 += fE2;
                fFloor = fFloor;
            }
        }
        if (zU0) {
            r0(yVar);
        }
        Z0();
    }

    public final void T0(sc.k.z0 z0Var) {
        G("TextPath render", new Object[0]);
        e1(this.f130123d, z0Var);
        if (I() && g1()) {
            sc.k.n0 n0VarP = z0Var.f130050a.P(z0Var.f130110o);
            if (n0VarP == null) {
                N("TextPath reference '%s' not found", z0Var.f130110o);
                return;
            }
            sc.k.v vVar = (sc.k.v) n0VarP;
            Path pathF = new d(vVar.f130087o).f();
            Matrix matrix = vVar.f130039n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            sc.k.p pVar = z0Var.f130111p;
            float fD = pVar != null ? pVar.d(this, pathMeasure.getLength()) : 0.0f;
            sc.k.e0.f fVarW = W();
            if (fVarW != sc.k.e0.f.Start) {
                float fS = s(z0Var);
                if (fVarW == sc.k.e0.f.Middle) {
                    fS /= 2.0f;
                }
                fD -= fS;
            }
            x((sc.k.k0) z0Var.c());
            boolean zU0 = u0();
            M(z0Var, new e(pathF, fD, 0.0f));
            if (zU0) {
                r0(z0Var);
            }
        }
    }

    public final h U(sc.k.n0 n0Var) {
        h hVar = new h();
        d1(hVar, sc.k.e0.a());
        return V(n0Var, hVar);
    }

    public final boolean U0() {
        return this.f130123d.f130159a.f129951n.floatValue() < 1.0f || this.f130123d.f130159a.H != null;
    }

    public final h V(sc.k.n0 n0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof sc.k.l0) {
                arrayList.add(0, (sc.k.l0) n0Var);
            }
            Object obj = n0Var.f130051b;
            if (obj == null) {
                break;
            }
            n0Var = (sc.k.n0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e1(hVar, (sc.k.l0) it.next());
        }
        h hVar2 = this.f130123d;
        hVar.f130165g = hVar2.f130165g;
        hVar.f130164f = hVar2.f130164f;
        return hVar;
    }

    public final void V0() {
        this.f130123d = new h();
        this.f130124e = new Stack<>();
        d1(this.f130123d, sc.k.e0.a());
        h hVar = this.f130123d;
        hVar.f130164f = null;
        hVar.f130166h = false;
        this.f130124e.push(new h(hVar));
        this.f130126g = new Stack<>();
        this.f130125f = new Stack<>();
    }

    public final sc.k.e0.f W() {
        sc.k.e0.f fVar;
        sc.k.e0 e0Var = this.f130123d.f130159a;
        if (e0Var.f129958u == sc.k.e0.h.LTR || (fVar = e0Var.f129959v) == sc.k.e0.f.Middle) {
            return e0Var.f129959v;
        }
        sc.k.e0.f fVar2 = sc.k.e0.f.Start;
        return fVar == fVar2 ? sc.k.e0.f.End : fVar2;
    }

    public final void W0(float f10, float f11, float f12, float f13) {
        float fE = f12 + f10;
        float f14 = f13 + f11;
        sc.k.c cVar = this.f130123d.f130159a.f129961x;
        if (cVar != null) {
            f10 += cVar.f129921d.e(this);
            f11 += this.f130123d.f130159a.f129961x.f129918a.f(this);
            fE -= this.f130123d.f130159a.f129961x.f129919b.e(this);
            f14 -= this.f130123d.f130159a.f129961x.f129920c.f(this);
        }
        this.f130120a.clipRect(f10, f11, fE, f14);
    }

    public final Path.FillType X() {
        sc.k.e0.a aVar = this.f130123d.f130159a.G;
        return (aVar == null || aVar != sc.k.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void X0(h hVar, boolean z10, sc.k.o0 o0Var) {
        int i10;
        sc.k.e0 e0Var = hVar.f130159a;
        float fFloatValue = (z10 ? e0Var.f129942e : e0Var.f129944g).floatValue();
        if (o0Var instanceof sc.k.f) {
            i10 = ((sc.k.f) o0Var).f130006b;
        } else if (!(o0Var instanceof sc.k.g)) {
            return;
        } else {
            i10 = hVar.f130159a.f129952o.f130006b;
        }
        int iF = F(i10, fFloatValue);
        if (z10) {
            hVar.f130162d.setColor(iF);
        } else {
            hVar.f130163e.setColor(iF);
        }
    }

    public float Y() {
        return this.f130123d.f130162d.getTextSize();
    }

    public final void Y0(boolean z10, sc.k.c0 c0Var) {
        if (z10) {
            if (e0(c0Var.f130042e, sc.k.R)) {
                h hVar = this.f130123d;
                sc.k.e0 e0Var = hVar.f130159a;
                sc.k.o0 o0Var = c0Var.f130042e.I;
                e0Var.f129940c = o0Var;
                hVar.f130160b = o0Var != null;
            }
            if (e0(c0Var.f130042e, 4294967296L)) {
                this.f130123d.f130159a.f129942e = c0Var.f130042e.J;
            }
            if (e0(c0Var.f130042e, 6442450944L)) {
                h hVar2 = this.f130123d;
                X0(hVar2, z10, hVar2.f130159a.f129940c);
                return;
            }
            return;
        }
        if (e0(c0Var.f130042e, sc.k.R)) {
            h hVar3 = this.f130123d;
            sc.k.e0 e0Var2 = hVar3.f130159a;
            sc.k.o0 o0Var2 = c0Var.f130042e.I;
            e0Var2.f129943f = o0Var2;
            hVar3.f130161c = o0Var2 != null;
        }
        if (e0(c0Var.f130042e, 4294967296L)) {
            this.f130123d.f130159a.f129944g = c0Var.f130042e.J;
        }
        if (e0(c0Var.f130042e, 6442450944L)) {
            h hVar4 = this.f130123d;
            X0(hVar4, z10, hVar4.f130159a.f129943f);
        }
    }

    public float Z() {
        return this.f130123d.f130162d.getTextSize() / 2.0f;
    }

    public final void Z0() {
        this.f130120a.restore();
        this.f130123d = this.f130124e.pop();
    }

    public sc.k.b a0() {
        h hVar = this.f130123d;
        sc.k.b bVar = hVar.f130165g;
        return bVar != null ? bVar : hVar.f130164f;
    }

    public final void a1() {
        this.f130120a.save();
        this.f130124e.push(this.f130123d);
        this.f130123d = new h(this.f130123d);
    }

    public float b0() {
        return this.f130121b;
    }

    public final String b1(String str, boolean z10, boolean z11) {
        if (this.f130123d.f130166h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final Path.FillType c0() {
        sc.k.e0.a aVar = this.f130123d.f130159a.f129941d;
        return (aVar == null || aVar != sc.k.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void c1(sc.k.k0 k0Var) {
        if (k0Var.f130051b == null || k0Var.f130038h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f130126g.peek().invert(matrix)) {
            sc.k.b bVar = k0Var.f130038h;
            float f10 = bVar.f129908a;
            float f11 = bVar.f129909b;
            float fB = bVar.b();
            sc.k.b bVar2 = k0Var.f130038h;
            float f12 = bVar2.f129909b;
            float fB2 = bVar2.b();
            float fC = k0Var.f130038h.c();
            sc.k.b bVar3 = k0Var.f130038h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, bVar3.f129908a, bVar3.c()};
            matrix.preConcat(this.f130120a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            sc.k.k0 k0Var2 = (sc.k.k0) this.f130125f.peek();
            sc.k.b bVar4 = k0Var2.f130038h;
            if (bVar4 == null) {
                k0Var2.f130038h = sc.k.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(sc.k.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void d1(h hVar, sc.k.e0 e0Var) {
        if (e0(e0Var, 4096L)) {
            hVar.f130159a.f129952o = e0Var.f129952o;
        }
        if (e0(e0Var, 2048L)) {
            hVar.f130159a.f129951n = e0Var.f129951n;
        }
        if (e0(e0Var, 1L)) {
            hVar.f130159a.f129940c = e0Var.f129940c;
            sc.k.o0 o0Var = e0Var.f129940c;
            hVar.f130160b = (o0Var == null || o0Var == sc.k.f.f130005d) ? false : true;
        }
        if (e0(e0Var, 4L)) {
            hVar.f130159a.f129942e = e0Var.f129942e;
        }
        if (e0(e0Var, 6149L)) {
            X0(hVar, true, hVar.f130159a.f129940c);
        }
        if (e0(e0Var, 2L)) {
            hVar.f130159a.f129941d = e0Var.f129941d;
        }
        if (e0(e0Var, 8L)) {
            hVar.f130159a.f129943f = e0Var.f129943f;
            sc.k.o0 o0Var2 = e0Var.f129943f;
            hVar.f130161c = (o0Var2 == null || o0Var2 == sc.k.f.f130005d) ? false : true;
        }
        if (e0(e0Var, 16L)) {
            hVar.f130159a.f129944g = e0Var.f129944g;
        }
        if (e0(e0Var, 6168L)) {
            X0(hVar, false, hVar.f130159a.f129943f);
        }
        if (e0(e0Var, sc.k.V)) {
            hVar.f130159a.M = e0Var.M;
        }
        if (e0(e0Var, 32L)) {
            sc.k.e0 e0Var2 = hVar.f130159a;
            sc.k.p pVar = e0Var.f129945h;
            e0Var2.f129945h = pVar;
            hVar.f130163e.setStrokeWidth(pVar.c(this));
        }
        if (e0(e0Var, 64L)) {
            hVar.f130159a.f129946i = e0Var.f129946i;
            int i10 = a.f130129b[e0Var.f129946i.ordinal()];
            if (i10 == 1) {
                hVar.f130163e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                hVar.f130163e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                hVar.f130163e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (e0(e0Var, 128L)) {
            hVar.f130159a.f129947j = e0Var.f129947j;
            int i11 = a.f130130c[e0Var.f129947j.ordinal()];
            if (i11 == 1) {
                hVar.f130163e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                hVar.f130163e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                hVar.f130163e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (e0(e0Var, 256L)) {
            hVar.f130159a.f129948k = e0Var.f129948k;
            hVar.f130163e.setStrokeMiter(e0Var.f129948k.floatValue());
        }
        if (e0(e0Var, 512L)) {
            hVar.f130159a.f129949l = e0Var.f129949l;
        }
        if (e0(e0Var, 1024L)) {
            hVar.f130159a.f129950m = e0Var.f129950m;
        }
        Typeface typefaceZ = null;
        if (e0(e0Var, 1536L)) {
            sc.k.p[] pVarArr = hVar.f130159a.f129949l;
            if (pVarArr == null) {
                hVar.f130163e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = hVar.f130159a.f129949l[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    hVar.f130163e.setPathEffect(null);
                } else {
                    float fC2 = hVar.f130159a.f129950m.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    hVar.f130163e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (e0(e0Var, 16384L)) {
            float fY = Y();
            hVar.f130159a.f129954q = e0Var.f129954q;
            hVar.f130162d.setTextSize(e0Var.f129954q.d(this, fY));
            hVar.f130163e.setTextSize(e0Var.f129954q.d(this, fY));
        }
        if (e0(e0Var, 8192L)) {
            hVar.f130159a.f129953p = e0Var.f129953p;
        }
        if (e0(e0Var, 32768L)) {
            if (e0Var.f129955r.intValue() == -1 && hVar.f130159a.f129955r.intValue() > 100) {
                sc.k.e0 e0Var3 = hVar.f130159a;
                e0Var3.f129955r = Integer.valueOf(e0Var3.f129955r.intValue() - 100);
            } else if (e0Var.f129955r.intValue() != 1 || hVar.f130159a.f129955r.intValue() >= 900) {
                hVar.f130159a.f129955r = e0Var.f129955r;
            } else {
                sc.k.e0 e0Var4 = hVar.f130159a;
                e0Var4.f129955r = Integer.valueOf(e0Var4.f129955r.intValue() + 100);
            }
        }
        if (e0(e0Var, 65536L)) {
            hVar.f130159a.f129956s = e0Var.f129956s;
        }
        if (e0(e0Var, 106496L)) {
            if (hVar.f130159a.f129953p != null && this.f130122c != null) {
                m mVarS = sc.k.s();
                for (String str : hVar.f130159a.f129953p) {
                    sc.k.e0 e0Var5 = hVar.f130159a;
                    Typeface typefaceZ2 = z(str, e0Var5.f129955r, e0Var5.f129956s);
                    typefaceZ = (typefaceZ2 != null || mVarS == null) ? typefaceZ2 : mVarS.c(str, hVar.f130159a.f129955r.intValue(), String.valueOf(hVar.f130159a.f129956s));
                    if (typefaceZ != null) {
                        break;
                    }
                }
            }
            if (typefaceZ == null) {
                sc.k.e0 e0Var6 = hVar.f130159a;
                typefaceZ = z("serif", e0Var6.f129955r, e0Var6.f129956s);
            }
            hVar.f130162d.setTypeface(typefaceZ);
            hVar.f130163e.setTypeface(typefaceZ);
        }
        if (e0(e0Var, 131072L)) {
            hVar.f130159a.f129957t = e0Var.f129957t;
            Paint paint = hVar.f130162d;
            sc.k.e0.g gVar = e0Var.f129957t;
            sc.k.e0.g gVar2 = sc.k.e0.g.LineThrough;
            paint.setStrikeThruText(gVar == gVar2);
            Paint paint2 = hVar.f130162d;
            sc.k.e0.g gVar3 = e0Var.f129957t;
            sc.k.e0.g gVar4 = sc.k.e0.g.Underline;
            paint2.setUnderlineText(gVar3 == gVar4);
            hVar.f130163e.setStrikeThruText(e0Var.f129957t == gVar2);
            hVar.f130163e.setUnderlineText(e0Var.f129957t == gVar4);
        }
        if (e0(e0Var, sc.k.W)) {
            hVar.f130159a.f129958u = e0Var.f129958u;
        }
        if (e0(e0Var, 262144L)) {
            hVar.f130159a.f129959v = e0Var.f129959v;
        }
        if (e0(e0Var, 524288L)) {
            hVar.f130159a.f129960w = e0Var.f129960w;
        }
        if (e0(e0Var, 2097152L)) {
            hVar.f130159a.f129962y = e0Var.f129962y;
        }
        if (e0(e0Var, 4194304L)) {
            hVar.f130159a.f129963z = e0Var.f129963z;
        }
        if (e0(e0Var, sc.k.J)) {
            hVar.f130159a.A = e0Var.A;
        }
        if (e0(e0Var, 16777216L)) {
            hVar.f130159a.B = e0Var.B;
        }
        if (e0(e0Var, sc.k.L)) {
            hVar.f130159a.C = e0Var.C;
        }
        if (e0(e0Var, 1048576L)) {
            hVar.f130159a.f129961x = e0Var.f129961x;
        }
        if (e0(e0Var, sc.k.O)) {
            hVar.f130159a.F = e0Var.F;
        }
        if (e0(e0Var, sc.k.P)) {
            hVar.f130159a.G = e0Var.G;
        }
        if (e0(e0Var, sc.k.Q)) {
            hVar.f130159a.H = e0Var.H;
        }
        if (e0(e0Var, sc.k.M)) {
            hVar.f130159a.D = e0Var.D;
        }
        if (e0(e0Var, sc.k.N)) {
            hVar.f130159a.E = e0Var.E;
        }
        if (e0(e0Var, 8589934592L)) {
            hVar.f130159a.K = e0Var.K;
        }
        if (e0(e0Var, sc.k.U)) {
            hVar.f130159a.L = e0Var.L;
        }
        if (e0(e0Var, sc.k.X)) {
            hVar.f130159a.N = e0Var.N;
        }
    }

    public final boolean e0(sc.k.e0 e0Var, long j10) {
        return (j10 & e0Var.f129939b) != 0;
    }

    public final void e1(h hVar, sc.k.l0 l0Var) {
        hVar.f130159a.b(l0Var.f130051b == null);
        sc.k.e0 e0Var = l0Var.f130042e;
        if (e0Var != null) {
            d1(hVar, e0Var);
        }
        if (this.f130122c.C()) {
            for (sc.c.p pVar : this.f130122c.e()) {
                if (sc.c.l(this.f130127h, pVar.f129819a, l0Var)) {
                    d1(hVar, pVar.f129820b);
                }
            }
        }
        sc.k.e0 e0Var2 = l0Var.f130043f;
        if (e0Var2 != null) {
            d1(hVar, e0Var2);
        }
    }

    public final void f0(boolean z10, sc.k.b bVar, sc.k.m0 m0Var) {
        float fD;
        float f10;
        float fD2;
        float f11;
        String str = m0Var.f130033l;
        if (str != null) {
            P(m0Var, str);
        }
        Boolean bool = m0Var.f130030i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f130123d;
        Paint paint = z10 ? hVar.f130162d : hVar.f130163e;
        if (z11) {
            sc.k.b bVarA0 = a0();
            sc.k.p pVar = m0Var.f130046m;
            float fE = pVar != null ? pVar.e(this) : 0.0f;
            sc.k.p pVar2 = m0Var.f130047n;
            fD = pVar2 != null ? pVar2.f(this) : 0.0f;
            sc.k.p pVar3 = m0Var.f130048o;
            float fE2 = pVar3 != null ? pVar3.e(this) : bVarA0.f129910c;
            sc.k.p pVar4 = m0Var.f130049p;
            f11 = fE2;
            f10 = fE;
            fD2 = pVar4 != null ? pVar4.f(this) : 0.0f;
        } else {
            sc.k.p pVar5 = m0Var.f130046m;
            float fD3 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.0f;
            sc.k.p pVar6 = m0Var.f130047n;
            fD = pVar6 != null ? pVar6.d(this, 1.0f) : 0.0f;
            sc.k.p pVar7 = m0Var.f130048o;
            float fD4 = pVar7 != null ? pVar7.d(this, 1.0f) : 1.0f;
            sc.k.p pVar8 = m0Var.f130049p;
            f10 = fD3;
            fD2 = pVar8 != null ? pVar8.d(this, 1.0f) : 0.0f;
            f11 = fD4;
        }
        float f12 = fD;
        a1();
        this.f130123d = U(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f129908a, bVar.f129909b);
            matrix.preScale(bVar.f129910c, bVar.f129911d);
        }
        Matrix matrix2 = m0Var.f130031j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f130029h.size();
        if (size == 0) {
            Z0();
            if (z10) {
                this.f130123d.f130160b = false;
                return;
            } else {
                this.f130123d.f130161c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<sc.k.n0> it = m0Var.f130029h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            sc.k.d0 d0Var = (sc.k.d0) it.next();
            Float f14 = d0Var.f129927h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            a1();
            e1(this.f130123d, d0Var);
            sc.k.e0 e0Var = this.f130123d.f130159a;
            sc.k.f fVar = (sc.k.f) e0Var.D;
            if (fVar == null) {
                fVar = sc.k.f.f130004c;
            }
            iArr[i10] = F(fVar.f130006b, e0Var.E.floatValue());
            i10++;
            Z0();
        }
        if ((f10 == f11 && f12 == fD2) || size == 1) {
            Z0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        sc.k.EnumC1284k enumC1284k = m0Var.f130032k;
        if (enumC1284k != null) {
            if (enumC1284k == sc.k.EnumC1284k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1284k == sc.k.EnumC1284k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        Z0();
        LinearGradient linearGradient = new LinearGradient(f10, f12, f11, fD2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(C(this.f130123d.f130159a.f129942e.floatValue()));
    }

    public final void f1() {
        int iF;
        sc.k.e0 e0Var = this.f130123d.f130159a;
        sc.k.o0 o0Var = e0Var.K;
        if (o0Var instanceof sc.k.f) {
            iF = ((sc.k.f) o0Var).f130006b;
        } else if (!(o0Var instanceof sc.k.g)) {
            return;
        } else {
            iF = e0Var.f129952o.f130006b;
        }
        Float f10 = e0Var.L;
        if (f10 != null) {
            iF = F(iF, f10.floatValue());
        }
        this.f130120a.drawColor(iF);
    }

    public final Path g0(sc.k.d dVar) {
        sc.k.p pVar = dVar.f129924o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        sc.k.p pVar2 = dVar.f129925p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        float fC = dVar.f129926q.c(this);
        float f11 = fE - fC;
        float f12 = f10 - fC;
        float f13 = fE + fC;
        float f14 = f10 + fC;
        if (dVar.f130038h == null) {
            float f15 = 2.0f * fC;
            dVar.f130038h = new sc.k.b(f11, f12, f15, f15);
        }
        float f16 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f12);
        float f17 = fE + f16;
        float f18 = f10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path.cubicTo(f13, f19, f17, f14, fE, f14);
        float f20 = fE - f16;
        path.cubicTo(f20, f14, f11, f19, f11, f10);
        path.cubicTo(f11, f18, f20, f12, fE, f12);
        path.close();
        return path;
    }

    public final boolean g1() {
        Boolean bool = this.f130123d.f130159a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void h(sc.k.l lVar, Path path, Matrix matrix) {
        Path pathJ0;
        e1(this.f130123d, lVar);
        if (I() && g1()) {
            Matrix matrix2 = lVar.f130039n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (lVar instanceof sc.k.b0) {
                pathJ0 = k0((sc.k.b0) lVar);
            } else if (lVar instanceof sc.k.d) {
                pathJ0 = g0((sc.k.d) lVar);
            } else if (lVar instanceof sc.k.i) {
                pathJ0 = h0((sc.k.i) lVar);
            } else if (!(lVar instanceof sc.k.z)) {
                return;
            } else {
                pathJ0 = j0((sc.k.z) lVar);
            }
            u(lVar);
            path.setFillType(X());
            path.addPath(pathJ0, matrix);
        }
    }

    public final Path h0(sc.k.i iVar) {
        sc.k.p pVar = iVar.f130020o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        sc.k.p pVar2 = iVar.f130021p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        float fE2 = iVar.f130022q.e(this);
        float f11 = iVar.f130023r.f(this);
        float f12 = fE - fE2;
        float f13 = f10 - f11;
        float f14 = fE + fE2;
        float f15 = f10 + f11;
        if (iVar.f130038h == null) {
            iVar.f130038h = new sc.k.b(f12, f13, fE2 * 2.0f, 2.0f * f11);
        }
        float f16 = fE2 * 0.5522848f;
        float f17 = f11 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f13);
        float f18 = fE + f16;
        float f19 = f10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f10 + f17;
        path.cubicTo(f14, f20, f18, f15, fE, f15);
        float f21 = fE - f16;
        path.cubicTo(f21, f15, f12, f20, f12, f10);
        path.cubicTo(f12, f19, f21, f13, fE, f13);
        path.close();
        return path;
    }

    public final void i(sc.k.v vVar, Path path, Matrix matrix) {
        e1(this.f130123d, vVar);
        if (I() && g1()) {
            Matrix matrix2 = vVar.f130039n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path pathF = new d(vVar.f130087o).f();
            if (vVar.f130038h == null) {
                vVar.f130038h = r(pathF);
            }
            u(vVar);
            path.setFillType(X());
            path.addPath(pathF, matrix);
        }
    }

    public final Path i0(sc.k.q qVar) {
        sc.k.p pVar = qVar.f130061o;
        float fE = pVar == null ? 0.0f : pVar.e(this);
        sc.k.p pVar2 = qVar.f130062p;
        float f10 = pVar2 == null ? 0.0f : pVar2.f(this);
        sc.k.p pVar3 = qVar.f130063q;
        float fE2 = pVar3 == null ? 0.0f : pVar3.e(this);
        sc.k.p pVar4 = qVar.f130064r;
        float f11 = pVar4 != null ? pVar4.f(this) : 0.0f;
        if (qVar.f130038h == null) {
            qVar.f130038h = new sc.k.b(Math.min(fE, fE2), Math.min(f10, f11), Math.abs(fE2 - fE), Math.abs(f11 - f10));
        }
        Path path = new Path();
        path.moveTo(fE, f10);
        path.lineTo(fE2, f11);
        return path;
    }

    public final void j(sc.k.n0 n0Var, boolean z10, Path path, Matrix matrix) {
        if (I()) {
            E();
            if (n0Var instanceof sc.k.e1) {
                if (z10) {
                    l((sc.k.e1) n0Var, path, matrix);
                } else {
                    N("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (n0Var instanceof sc.k.v) {
                i((sc.k.v) n0Var, path, matrix);
            } else if (n0Var instanceof sc.k.w0) {
                k((sc.k.w0) n0Var, path, matrix);
            } else if (n0Var instanceof sc.k.l) {
                h((sc.k.l) n0Var, path, matrix);
            } else {
                N("Invalid %s element found in clipPath definition", n0Var.toString());
            }
            D();
        }
    }

    public final Path j0(sc.k.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f130109o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f130109o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof sc.k.a0) {
            path.close();
        }
        if (zVar.f130038h == null) {
            zVar.f130038h = r(path);
        }
        return path;
    }

    public final void k(sc.k.w0 w0Var, Path path, Matrix matrix) {
        e1(this.f130123d, w0Var);
        if (I()) {
            Matrix matrix2 = w0Var.f130100s;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<sc.k.p> list = w0Var.f129904o;
            float f10 = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : w0Var.f129904o.get(0).e(this);
            List<sc.k.p> list2 = w0Var.f129905p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f129905p.get(0).f(this);
            List<sc.k.p> list3 = w0Var.f129906q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f129906q.get(0).e(this);
            List<sc.k.p> list4 = w0Var.f129907r;
            if (list4 != null && list4.size() != 0) {
                f10 = w0Var.f129907r.get(0).f(this);
            }
            if (this.f130123d.f130159a.f129959v != sc.k.e0.f.Start) {
                float fS = s(w0Var);
                if (this.f130123d.f130159a.f129959v == sc.k.e0.f.Middle) {
                    fS /= 2.0f;
                }
                fE -= fS;
            }
            if (w0Var.f130038h == null) {
                i iVar = new i(fE, f11);
                M(w0Var, iVar);
                RectF rectF = iVar.f130170d;
                w0Var.f130038h = new sc.k.b(rectF.left, rectF.top, rectF.width(), iVar.f130170d.height());
            }
            u(w0Var);
            Path path2 = new Path();
            M(w0Var, new g(fE + fE2, f11 + f10, path2));
            path.setFillType(X());
            path.addPath(path2, matrix);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public final Path k0(sc.k.b0 b0Var) {
        float fE;
        float f10;
        float fMin;
        sc.k.p pVar;
        float fE2;
        sc.k.p pVar2;
        float f11;
        float fE3;
        float f12;
        float f13;
        float f14;
        Path path;
        sc.k.p pVar3 = b0Var.f129916s;
        if (pVar3 == null && b0Var.f129917t == null) {
            fE = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f129917t == null) {
                    fE = pVar3.e(this);
                } else {
                    fE = pVar3.e(this);
                    f10 = b0Var.f129917t.f(this);
                }
                fMin = Math.min(fE, b0Var.f129914q.e(this) / 2.0f);
                float fMin2 = Math.min(f10, b0Var.f129915r.f(this) / 2.0f);
                pVar = b0Var.f129912o;
                if (pVar != null) {
                    fE2 = pVar.e(this);
                } else {
                    fE2 = 0.0f;
                }
                pVar2 = b0Var.f129913p;
                if (pVar2 != null) {
                    f11 = pVar2.f(this);
                } else {
                    f11 = 0.0f;
                }
                fE3 = b0Var.f129914q.e(this);
                f12 = b0Var.f129915r.f(this);
                if (b0Var.f130038h == null) {
                    b0Var.f130038h = new sc.k.b(fE2, f11, fE3, f12);
                }
                f13 = fE3 + fE2;
                f14 = f11 + f12;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fE2, f11);
                    path.lineTo(f13, f11);
                    path.lineTo(f13, f14);
                    path.lineTo(fE2, f14);
                    path.lineTo(fE2, f11);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = f11 + fMin2;
                    path.moveTo(fE2, f17);
                    float f18 = f17 - f16;
                    float f19 = fE2 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(fE2, f18, f20, f11, f19, f11);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, f11);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, f11, f13, f18, f13, f17);
                    float f23 = f14 - fMin2;
                    path.lineTo(f13, f23);
                    float f24 = f23 + f16;
                    path.cubicTo(f13, f24, f22, f14, f21, f14);
                    path.lineTo(f19, f14);
                    float f25 = fE2;
                    path.cubicTo(f20, f14, f25, f24, fE2, f23);
                    path.lineTo(f25, f17);
                }
                path.close();
                return path;
            }
            fE = b0Var.f129917t.f(this);
        }
        f10 = fE;
        fMin = Math.min(fE, b0Var.f129914q.e(this) / 2.0f);
        float fMin3 = Math.min(f10, b0Var.f129915r.f(this) / 2.0f);
        pVar = b0Var.f129912o;
        if (pVar != null) {
            fE2 = pVar.e(this);
        } else {
            fE2 = 0.0f;
        }
        pVar2 = b0Var.f129913p;
        if (pVar2 != null) {
            f11 = pVar2.f(this);
        } else {
            f11 = 0.0f;
        }
        fE3 = b0Var.f129914q.e(this);
        f12 = b0Var.f129915r.f(this);
        if (b0Var.f130038h == null) {
            b0Var.f130038h = new sc.k.b(fE2, f11, fE3, f12);
        }
        f13 = fE3 + fE2;
        f14 = f11 + f12;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fE2, f11);
            path.lineTo(f13, f11);
            path.lineTo(f13, f14);
            path.lineTo(fE2, f14);
            path.lineTo(fE2, f11);
        } else {
            path.moveTo(fE2, f11);
            path.lineTo(f13, f11);
            path.lineTo(f13, f14);
            path.lineTo(fE2, f14);
            path.lineTo(fE2, f11);
        }
        path.close();
        return path;
    }

    public final void l(sc.k.e1 e1Var, Path path, Matrix matrix) {
        e1(this.f130123d, e1Var);
        if (I() && g1()) {
            Matrix matrix2 = e1Var.f130045o;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            sc.k.n0 n0VarP = e1Var.f130050a.P(e1Var.f129999p);
            if (n0VarP == null) {
                N("Use reference '%s' not found", e1Var.f129999p);
            } else {
                u(e1Var);
                j(n0VarP, false, path, matrix);
            }
        }
    }

    public final Path l0(sc.k.w0 w0Var) {
        List<sc.k.p> list = w0Var.f129904o;
        float f10 = 0.0f;
        float fE = (list == null || list.size() == 0) ? 0.0f : w0Var.f129904o.get(0).e(this);
        List<sc.k.p> list2 = w0Var.f129905p;
        float f11 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f129905p.get(0).f(this);
        List<sc.k.p> list3 = w0Var.f129906q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f129906q.get(0).e(this);
        List<sc.k.p> list4 = w0Var.f129907r;
        if (list4 != null && list4.size() != 0) {
            f10 = w0Var.f129907r.get(0).f(this);
        }
        if (this.f130123d.f130159a.f129959v != sc.k.e0.f.Start) {
            float fS = s(w0Var);
            if (this.f130123d.f130159a.f129959v == sc.k.e0.f.Middle) {
                fS /= 2.0f;
            }
            fE -= fS;
        }
        if (w0Var.f130038h == null) {
            i iVar = new i(fE, f11);
            M(w0Var, iVar);
            RectF rectF = iVar.f130170d;
            w0Var.f130038h = new sc.k.b(rectF.left, rectF.top, rectF.width(), iVar.f130170d.height());
        }
        Path path = new Path();
        M(w0Var, new g(fE + fE2, f11 + f10, path));
        return path;
    }

    public final void m0(boolean z10, sc.k.b bVar, sc.k.q0 q0Var) {
        float f10;
        float fD;
        float f11;
        String str = q0Var.f130033l;
        if (str != null) {
            P(q0Var, str);
        }
        Boolean bool = q0Var.f130030i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f130123d;
        Paint paint = z10 ? hVar.f130162d : hVar.f130163e;
        if (z11) {
            sc.k.p pVar = new sc.k.p(50.0f, sc.k.d1.percent);
            sc.k.p pVar2 = q0Var.f130065m;
            float fE = pVar2 != null ? pVar2.e(this) : pVar.e(this);
            sc.k.p pVar3 = q0Var.f130066n;
            float f12 = pVar3 != null ? pVar3.f(this) : pVar.f(this);
            sc.k.p pVar4 = q0Var.f130067o;
            fD = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f10 = fE;
            f11 = f12;
        } else {
            sc.k.p pVar5 = q0Var.f130065m;
            float fD2 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.5f;
            sc.k.p pVar6 = q0Var.f130066n;
            float fD3 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.5f;
            sc.k.p pVar7 = q0Var.f130067o;
            f10 = fD2;
            fD = pVar7 != null ? pVar7.d(this, 1.0f) : 0.5f;
            f11 = fD3;
        }
        a1();
        this.f130123d = U(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f129908a, bVar.f129909b);
            matrix.preScale(bVar.f129910c, bVar.f129911d);
        }
        Matrix matrix2 = q0Var.f130031j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f130029h.size();
        if (size == 0) {
            Z0();
            if (z10) {
                this.f130123d.f130160b = false;
                return;
            } else {
                this.f130123d.f130161c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<sc.k.n0> it = q0Var.f130029h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            sc.k.d0 d0Var = (sc.k.d0) it.next();
            Float f14 = d0Var.f129927h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            a1();
            e1(this.f130123d, d0Var);
            sc.k.e0 e0Var = this.f130123d.f130159a;
            sc.k.f fVar = (sc.k.f) e0Var.D;
            if (fVar == null) {
                fVar = sc.k.f.f130004c;
            }
            iArr[i10] = F(fVar.f130006b, e0Var.E.floatValue());
            i10++;
            Z0();
        }
        if (fD == 0.0f || size == 1) {
            Z0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        sc.k.EnumC1284k enumC1284k = q0Var.f130032k;
        if (enumC1284k != null) {
            if (enumC1284k == sc.k.EnumC1284k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1284k == sc.k.EnumC1284k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        Z0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fD, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(C(this.f130123d.f130159a.f129942e.floatValue()));
    }

    public final sc.k.b n0(sc.k.p pVar, sc.k.p pVar2, sc.k.p pVar3, sc.k.p pVar4) {
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        sc.k.b bVarA0 = a0();
        return new sc.k.b(fE, f10, pVar3 != null ? pVar3.e(this) : bVarA0.f129910c, pVar4 != null ? pVar4.f(this) : bVarA0.f129911d);
    }

    @TargetApi(19)
    public final Path o(sc.k.k0 k0Var, sc.k.b bVar) {
        Path pathO0;
        sc.k.n0 n0VarP = k0Var.f130050a.P(this.f130123d.f130159a.F);
        if (n0VarP == null) {
            N("ClipPath reference '%s' not found", this.f130123d.f130159a.F);
            return null;
        }
        sc.k.e eVar = (sc.k.e) n0VarP;
        this.f130124e.push(this.f130123d);
        this.f130123d = U(eVar);
        Boolean bool = eVar.f129938p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f129908a, bVar.f129909b);
            matrix.preScale(bVar.f129910c, bVar.f129911d);
        }
        Matrix matrix2 = eVar.f130045o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (sc.k.n0 n0Var : eVar.f130014i) {
            if ((n0Var instanceof sc.k.k0) && (pathO0 = o0((sc.k.k0) n0Var, true)) != null) {
                path.op(pathO0, Path.Op.UNION);
            }
        }
        if (this.f130123d.f130159a.F != null) {
            if (eVar.f130038h == null) {
                eVar.f130038h = r(path);
            }
            Path pathO = o(eVar, eVar.f130038h);
            if (pathO != null) {
                path.op(pathO, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f130123d = this.f130124e.pop();
        return path;
    }

    @TargetApi(19)
    public final Path o0(sc.k.k0 k0Var, boolean z10) {
        Path pathL0;
        Path pathO;
        this.f130124e.push(this.f130123d);
        h hVar = new h(this.f130123d);
        this.f130123d = hVar;
        e1(hVar, k0Var);
        if (!I() || !g1()) {
            this.f130123d = this.f130124e.pop();
            return null;
        }
        if (k0Var instanceof sc.k.e1) {
            if (!z10) {
                N("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            sc.k.e1 e1Var = (sc.k.e1) k0Var;
            sc.k.n0 n0VarP = k0Var.f130050a.P(e1Var.f129999p);
            if (n0VarP == null) {
                N("Use reference '%s' not found", e1Var.f129999p);
                this.f130123d = this.f130124e.pop();
                return null;
            }
            if (!(n0VarP instanceof sc.k.k0)) {
                this.f130123d = this.f130124e.pop();
                return null;
            }
            pathL0 = o0((sc.k.k0) n0VarP, false);
            if (pathL0 == null) {
                return null;
            }
            if (e1Var.f130038h == null) {
                e1Var.f130038h = r(pathL0);
            }
            Matrix matrix = e1Var.f130045o;
            if (matrix != null) {
                pathL0.transform(matrix);
            }
        } else if (k0Var instanceof sc.k.l) {
            sc.k.l lVar = (sc.k.l) k0Var;
            if (k0Var instanceof sc.k.v) {
                pathL0 = new d(((sc.k.v) k0Var).f130087o).f();
                if (k0Var.f130038h == null) {
                    k0Var.f130038h = r(pathL0);
                }
            } else if (k0Var instanceof sc.k.b0) {
                pathL0 = k0((sc.k.b0) k0Var);
            } else if (k0Var instanceof sc.k.d) {
                pathL0 = g0((sc.k.d) k0Var);
            } else if (k0Var instanceof sc.k.i) {
                pathL0 = h0((sc.k.i) k0Var);
            } else {
                pathL0 = k0Var instanceof sc.k.z ? j0((sc.k.z) k0Var) : null;
            }
            if (pathL0 == null) {
                return null;
            }
            if (lVar.f130038h == null) {
                lVar.f130038h = r(pathL0);
            }
            Matrix matrix2 = lVar.f130039n;
            if (matrix2 != null) {
                pathL0.transform(matrix2);
            }
            pathL0.setFillType(X());
        } else {
            if (!(k0Var instanceof sc.k.w0)) {
                N("Invalid %s element found in clipPath definition", k0Var.o());
                return null;
            }
            sc.k.w0 w0Var = (sc.k.w0) k0Var;
            pathL0 = l0(w0Var);
            if (pathL0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f130100s;
            if (matrix3 != null) {
                pathL0.transform(matrix3);
            }
            pathL0.setFillType(X());
        }
        if (this.f130123d.f130159a.F != null && (pathO = o(k0Var, k0Var.f130038h)) != null) {
            pathL0.op(pathO, Path.Op.INTERSECT);
        }
        this.f130123d = this.f130124e.pop();
        return pathL0;
    }

    public final List<c> p(sc.k.q qVar) {
        sc.k.p pVar = qVar.f130061o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        sc.k.p pVar2 = qVar.f130062p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        sc.k.p pVar3 = qVar.f130063q;
        float fE2 = pVar3 != null ? pVar3.e(this) : 0.0f;
        sc.k.p pVar4 = qVar.f130064r;
        float f11 = pVar4 != null ? pVar4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = fE2 - fE;
        float f13 = f11 - f10;
        arrayList.add(new c(fE, f10, f12, f13));
        arrayList.add(new c(fE2, f11, f12, f13));
        return arrayList;
    }

    public final void p0() {
        this.f130125f.pop();
        this.f130126g.pop();
    }

    public final List<c> q(sc.k.z zVar) {
        int length = zVar.f130109o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f130109o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f130109o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f130140a, f13 - cVar.f130141b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof sc.k.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f130109o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f130140a, f15 - cVar.f130141b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    public final void q0(sc.k.j0 j0Var) {
        this.f130125f.push(j0Var);
        this.f130126g.push(this.f130120a.getMatrix());
    }

    public final sc.k.b r(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new sc.k.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final void r0(sc.k.k0 k0Var) {
        s0(k0Var, k0Var.f130038h);
    }

    public final float s(sc.k.y0 y0Var) {
        k kVar = new k(this, null);
        M(y0Var, kVar);
        return kVar.f130173b;
    }

    public final void s0(sc.k.k0 k0Var, sc.k.b bVar) {
        if (this.f130123d.f130159a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f130120a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f130120a.saveLayer(null, paint2, 31);
            sc.k.s sVar = (sc.k.s) this.f130122c.P(this.f130123d.f130159a.H);
            R0(sVar, k0Var, bVar);
            this.f130120a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f130120a.saveLayer(null, paint3, 31);
            R0(sVar, k0Var, bVar);
            this.f130120a.restore();
            this.f130120a.restore();
        }
        Z0();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix t(sc.k.b r10, sc.k.b r11, sc.h r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            sc.h$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f129910c
            float r2 = r11.f129910c
            float r1 = r1 / r2
            float r2 = r10.f129911d
            float r3 = r11.f129911d
            float r2 = r2 / r3
            float r3 = r11.f129908a
            float r3 = -r3
            float r4 = r11.f129909b
            float r4 = -r4
            sc.h r5 = sc.h.f129842d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f129908a
            float r10 = r10.f129909b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            sc.h$b r5 = r12.b()
            sc.h$b r6 = sc.h.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f129910c
            float r2 = r2 / r1
            float r5 = r10.f129911d
            float r5 = r5 / r1
            int[] r6 = sc.l.a.f130128a
            sc.h$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f129910c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f129910c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            sc.h$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f129911d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f129911d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f129908a
            float r10 = r10.f129909b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.l.t(sc.k$b, sc.k$b, sc.h):android.graphics.Matrix");
    }

    public final void t0(sc.k.n0 n0Var, j jVar) {
        float f10;
        float f11;
        float fE;
        sc.k.e0.f fVarW;
        if (jVar.a((sc.k.y0) n0Var)) {
            if (n0Var instanceof sc.k.z0) {
                a1();
                T0((sc.k.z0) n0Var);
                Z0();
                return;
            }
            if (!(n0Var instanceof sc.k.v0)) {
                if (n0Var instanceof sc.k.u0) {
                    a1();
                    sc.k.u0 u0Var = (sc.k.u0) n0Var;
                    e1(this.f130123d, u0Var);
                    if (I()) {
                        x((sc.k.k0) u0Var.c());
                        sc.k.n0 n0VarP = n0Var.f130050a.P(u0Var.f130085o);
                        if (n0VarP == null || !(n0VarP instanceof sc.k.y0)) {
                            N("Tref reference '%s' not found", u0Var.f130085o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            O((sc.k.y0) n0VarP, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    Z0();
                    return;
                }
                return;
            }
            G("TSpan render", new Object[0]);
            a1();
            sc.k.v0 v0Var = (sc.k.v0) n0Var;
            e1(this.f130123d, v0Var);
            if (I()) {
                List<sc.k.p> list = v0Var.f129904o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f12 = 0.0f;
                if (z11) {
                    float fE2 = !z10 ? ((f) jVar).f130152b : v0Var.f129904o.get(0).e(this);
                    List<sc.k.p> list2 = v0Var.f129905p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f130153c : v0Var.f129905p.get(0).f(this);
                    List<sc.k.p> list3 = v0Var.f129906q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f129906q.get(0).e(this);
                    List<sc.k.p> list4 = v0Var.f129907r;
                    if (list4 != null && list4.size() != 0) {
                        f12 = v0Var.f129907r.get(0).f(this);
                    }
                    f10 = f12;
                    f12 = fE2;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    fE = 0.0f;
                }
                if (z10 && (fVarW = W()) != sc.k.e0.f.Start) {
                    float fS = s(v0Var);
                    if (fVarW == sc.k.e0.f.Middle) {
                        fS /= 2.0f;
                    }
                    f12 -= fS;
                }
                x((sc.k.k0) v0Var.c());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f130152b = f12 + fE;
                    fVar.f130153c = f11 + f10;
                }
                boolean zU0 = u0();
                M(v0Var, jVar);
                if (zU0) {
                    r0(v0Var);
                }
            }
            Z0();
        }
    }

    public final void u(sc.k.k0 k0Var) {
        v(k0Var, k0Var.f130038h);
    }

    public final boolean u0() {
        sc.k.n0 n0VarP;
        if (!U0()) {
            return false;
        }
        this.f130120a.saveLayerAlpha(null, C(this.f130123d.f130159a.f129951n.floatValue()), 31);
        this.f130124e.push(this.f130123d);
        h hVar = new h(this.f130123d);
        this.f130123d = hVar;
        String str = hVar.f130159a.H;
        if (str != null && ((n0VarP = this.f130122c.P(str)) == null || !(n0VarP instanceof sc.k.s))) {
            N("Mask reference '%s' not found", this.f130123d.f130159a.H);
            this.f130123d.f130159a.H = null;
        }
        return true;
    }

    public final void v(sc.k.k0 k0Var, sc.k.b bVar) {
        Path pathO;
        if (this.f130123d.f130159a.F == null || (pathO = o(k0Var, bVar)) == null) {
            return;
        }
        this.f130120a.clipPath(pathO);
    }

    public final c v0(c cVar, c cVar2, c cVar3) {
        float fL = L(cVar2.f130142c, cVar2.f130143d, cVar2.f130140a - cVar.f130140a, cVar2.f130141b - cVar.f130141b);
        if (fL == 0.0f) {
            fL = L(cVar2.f130142c, cVar2.f130143d, cVar3.f130140a - cVar2.f130140a, cVar3.f130141b - cVar2.f130141b);
        }
        if (fL > 0.0f || (fL == 0.0f && (cVar2.f130142c > 0.0f || cVar2.f130143d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f130142c = -cVar2.f130142c;
        cVar2.f130143d = -cVar2.f130143d;
        return cVar2;
    }

    public final void w(sc.k.k0 k0Var, sc.k.b bVar) {
        sc.k.n0 n0VarP = k0Var.f130050a.P(this.f130123d.f130159a.F);
        if (n0VarP == null) {
            N("ClipPath reference '%s' not found", this.f130123d.f130159a.F);
            return;
        }
        sc.k.e eVar = (sc.k.e) n0VarP;
        if (eVar.f130014i.isEmpty()) {
            this.f130120a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = eVar.f129938p;
        boolean z10 = bool == null || bool.booleanValue();
        if ((k0Var instanceof sc.k.m) && !z10) {
            h1("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", k0Var.o());
            return;
        }
        E();
        if (!z10) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(bVar.f129908a, bVar.f129909b);
            matrix.preScale(bVar.f129910c, bVar.f129911d);
            this.f130120a.concat(matrix);
        }
        Matrix matrix2 = eVar.f130045o;
        if (matrix2 != null) {
            this.f130120a.concat(matrix2);
        }
        this.f130123d = U(eVar);
        u(eVar);
        Path path = new Path();
        Iterator<sc.k.n0> it = eVar.f130014i.iterator();
        while (it.hasNext()) {
            j(it.next(), true, path, new Matrix());
        }
        this.f130120a.clipPath(path);
        D();
    }

    public final void w0(sc.k.d dVar) {
        G("Circle render", new Object[0]);
        sc.k.p pVar = dVar.f129926q;
        if (pVar == null || pVar.i()) {
            return;
        }
        e1(this.f130123d, dVar);
        if (I() && g1()) {
            Matrix matrix = dVar.f130039n;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            Path pathG0 = g0(dVar);
            c1(dVar);
            x(dVar);
            u(dVar);
            boolean zU0 = u0();
            if (this.f130123d.f130160b) {
                J(dVar, pathG0);
            }
            if (this.f130123d.f130161c) {
                K(pathG0);
            }
            if (zU0) {
                r0(dVar);
            }
        }
    }

    public final void x(sc.k.k0 k0Var) {
        sc.k.o0 o0Var = this.f130123d.f130159a.f129940c;
        if (o0Var instanceof sc.k.u) {
            H(true, k0Var.f130038h, (sc.k.u) o0Var);
        }
        sc.k.o0 o0Var2 = this.f130123d.f130159a.f129943f;
        if (o0Var2 instanceof sc.k.u) {
            H(false, k0Var.f130038h, (sc.k.u) o0Var2);
        }
    }

    public final void x0(sc.k.i iVar) {
        G("Ellipse render", new Object[0]);
        sc.k.p pVar = iVar.f130022q;
        if (pVar == null || iVar.f130023r == null || pVar.i() || iVar.f130023r.i()) {
            return;
        }
        e1(this.f130123d, iVar);
        if (I() && g1()) {
            Matrix matrix = iVar.f130039n;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            Path pathH0 = h0(iVar);
            c1(iVar);
            x(iVar);
            u(iVar);
            boolean zU0 = u0();
            if (this.f130123d.f130160b) {
                J(iVar, pathH0);
            }
            if (this.f130123d.f130161c) {
                K(pathH0);
            }
            if (zU0) {
                r0(iVar);
            }
        }
    }

    public final Bitmap y(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !ac.e.f4694c.equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e(f130113i, "Could not decode bad Data URL", e10);
            return null;
        }
    }

    public final void y0(sc.k.m mVar) {
        G("Group render", new Object[0]);
        e1(this.f130123d, mVar);
        if (I()) {
            Matrix matrix = mVar.f130045o;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            u(mVar);
            boolean zU0 = u0();
            N0(mVar, true);
            if (zU0) {
                r0(mVar);
            }
            c1(mVar);
        }
    }

    public final Typeface z(String str, Integer num, sc.k.e0.b bVar) {
        int i10;
        boolean z10 = bVar == sc.k.e0.b.Italic;
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else {
            i10 = z10 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    public final void z0(sc.k.o oVar) {
        sc.k.p pVar;
        String str;
        G("Image render", new Object[0]);
        sc.k.p pVar2 = oVar.f130055s;
        if (pVar2 == null || pVar2.i() || (pVar = oVar.f130056t) == null || pVar.i() || (str = oVar.f130052p) == null) {
            return;
        }
        sc.h hVar = oVar.f130060o;
        if (hVar == null) {
            hVar = sc.h.f129843e;
        }
        Bitmap bitmapY = y(str);
        if (bitmapY == null) {
            m mVarS = sc.k.s();
            if (mVarS == null) {
                return;
            } else {
                bitmapY = mVarS.d(oVar.f130052p);
            }
        }
        if (bitmapY == null) {
            N("Could not locate image '%s'", oVar.f130052p);
            return;
        }
        sc.k.b bVar = new sc.k.b(0.0f, 0.0f, bitmapY.getWidth(), bitmapY.getHeight());
        e1(this.f130123d, oVar);
        if (I() && g1()) {
            Matrix matrix = oVar.f130057u;
            if (matrix != null) {
                this.f130120a.concat(matrix);
            }
            sc.k.p pVar3 = oVar.f130053q;
            float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
            sc.k.p pVar4 = oVar.f130054r;
            this.f130123d.f130164f = new sc.k.b(fE, pVar4 != null ? pVar4.f(this) : 0.0f, oVar.f130055s.e(this), oVar.f130056t.e(this));
            if (!this.f130123d.f130159a.f129960w.booleanValue()) {
                sc.k.b bVar2 = this.f130123d.f130164f;
                W0(bVar2.f129908a, bVar2.f129909b, bVar2.f129910c, bVar2.f129911d);
            }
            oVar.f130038h = this.f130123d.f130164f;
            c1(oVar);
            u(oVar);
            boolean zU0 = u0();
            f1();
            this.f130120a.save();
            this.f130120a.concat(t(this.f130123d.f130164f, bVar, hVar));
            this.f130120a.drawBitmap(bitmapY, 0.0f, 0.0f, new Paint(this.f130123d.f130159a.N != sc.k.e0.e.optimizeSpeed ? 2 : 0));
            this.f130120a.restore();
            if (zU0) {
                r0(oVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f130173b;

        public k() {
            super(l.this, null);
            this.f130173b = 0.0f;
        }

        @Override // sc.l.j
        public void b(String str) {
            this.f130173b += l.this.f130123d.f130162d.measureText(str);
        }

        public /* synthetic */ k(l lVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sc.k.e0 f130159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f130160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f130161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f130162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f130163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public sc.k.b f130164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public sc.k.b f130165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f130166h;

        public h() {
            Paint paint = new Paint();
            this.f130162d = paint;
            paint.setFlags(r1.o.f123455u);
            this.f130162d.setHinting(0);
            this.f130162d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f130162d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f130163e = paint3;
            paint3.setFlags(r1.o.f123455u);
            this.f130163e.setHinting(0);
            this.f130163e.setStyle(Paint.Style.STROKE);
            this.f130163e.setTypeface(typeface);
            this.f130159a = sc.k.e0.a();
        }

        public h(h hVar) {
            this.f130160b = hVar.f130160b;
            this.f130161c = hVar.f130161c;
            this.f130162d = new Paint(hVar.f130162d);
            this.f130163e = new Paint(hVar.f130163e);
            sc.k.b bVar = hVar.f130164f;
            if (bVar != null) {
                this.f130164f = new sc.k.b(bVar);
            }
            sc.k.b bVar2 = hVar.f130165g;
            if (bVar2 != null) {
                this.f130165g = new sc.k.b(bVar2);
            }
            this.f130166h = hVar.f130166h;
            try {
                this.f130159a = (sc.k.e0) hVar.f130159a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e(l.f130113i, "Unexpected clone error", e10);
                this.f130159a = sc.k.e0.a();
            }
        }
    }

    public static void G(String str, Object... objArr) {
    }
}
