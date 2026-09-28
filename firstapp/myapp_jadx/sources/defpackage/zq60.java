package defpackage;

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
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class zq60 {
    public static HashSet<String> g;
    public final Canvas a;
    public yq60 b;
    public g c;
    public Stack<g> d;
    public Stack<yq60.i0> e;
    public Stack<Matrix> f;

    public class a implements yq60.w {
        public final ArrayList a;
        public float b;
        public float c;
        public b d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        public a(zq60 zq60Var, yq60.v vVar) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (vVar == null) {
                return;
            }
            vVar.h(this);
            if (this.h) {
                this.d.b((b) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            b bVar = this.d;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }

        @Override // yq60.w
        public final void a(float f, float f2) {
            boolean z = this.h;
            ArrayList arrayList = this.a;
            if (z) {
                this.d.b((b) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            b bVar = this.d;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            this.b = f;
            this.c = f2;
            this.d = new b(f, f2, 0.0f, 0.0f);
            this.g = arrayList.size();
        }

        @Override // yq60.w
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new b(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // yq60.w
        public final void c(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            b bVar = this.d;
            this.d = new b(f, f2, f - bVar.a, f2 - bVar.b);
            this.h = false;
        }

        @Override // yq60.w
        public final void close() {
            this.a.add(this.d);
            c(this.b, this.c);
            this.h = true;
        }

        @Override // yq60.w
        public final void d(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new b(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override // yq60.w
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            b bVar = this.d;
            zq60.a(bVar.a, bVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }
    }

    public class b {
        public final float a;
        public final float b;
        public float c;
        public float d;
        public boolean e = false;

        public b(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                this.c = (float) (((double) f3) / dSqrt);
                this.d = (float) (((double) f4) / dSqrt);
            }
        }

        public final void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                f3 = (float) (((double) f3) / dSqrt);
                f4 = (float) (((double) f4) / dSqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        public final void b(b bVar) {
            float f = bVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = bVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = bVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += bVar.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(",");
            return wi1.a(this.d, ")", sb);
        }
    }

    public class c implements yq60.w {
        public final Path a = new Path();
        public float b;
        public float c;

        public c(yq60.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.h(this);
        }

        @Override // yq60.w
        public final void a(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // yq60.w
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // yq60.w
        public final void c(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // yq60.w
        public final void close() {
            this.a.close();
        }

        @Override // yq60.w
        public final void d(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override // yq60.w
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            zq60.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }
    }

    public class d extends e {
        public final Path d;

        public d(Path path, float f) {
            super(f, 0.0f);
            this.d = path;
        }

        @Override // zq60.e, zq60.i
        public final void b(String str) {
            zq60 zq60Var = zq60.this;
            if (zq60Var.V()) {
                g gVar = zq60Var.c;
                if (gVar.b) {
                    zq60Var.a.drawTextOnPath(str, this.d, this.a, this.b, gVar.d);
                }
                g gVar2 = zq60Var.c;
                if (gVar2.c) {
                    zq60Var.a.drawTextOnPath(str, this.d, this.a, this.b, gVar2.e);
                }
            }
            this.a = zq60Var.c.d.measureText(str) + this.a;
        }
    }

    public class e extends i {
        public float a;
        public float b;

        public e(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // zq60.i
        public void b(String str) {
            zq60 zq60Var = zq60.this;
            Canvas canvas = zq60Var.a;
            if (zq60Var.V()) {
                g gVar = zq60Var.c;
                if (gVar.b) {
                    canvas.drawText(str, this.a, this.b, gVar.d);
                }
                g gVar2 = zq60Var.c;
                if (gVar2.c) {
                    canvas.drawText(str, this.a, this.b, gVar2.e);
                }
            }
            this.a = zq60Var.c.d.measureText(str) + this.a;
        }
    }

    public class f extends i {
        public float a;
        public final float b;
        public final Path c;

        public f(float f, float f2, Path path) {
            this.a = f;
            this.b = f2;
            this.c = path;
        }

        @Override // zq60.i
        public final boolean a(yq60.x0 x0Var) {
            if (!(x0Var instanceof yq60.y0)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // zq60.i
        public final void b(String str) {
            String str2;
            zq60 zq60Var = zq60.this;
            if (zq60Var.V()) {
                Path path = new Path();
                str2 = str;
                zq60Var.c.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
                this.c.addPath(path);
            } else {
                str2 = str;
            }
            this.a = zq60Var.c.d.measureText(str2) + this.a;
        }
    }

    public class h extends i {
        public float a;
        public final float b;
        public final RectF c = new RectF();

        public h(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // zq60.i
        public final boolean a(yq60.x0 x0Var) {
            if (!(x0Var instanceof yq60.y0)) {
                return true;
            }
            yq60.y0 y0Var = (yq60.y0) x0Var;
            yq60.k0 k0VarD = x0Var.a.d(y0Var.n);
            if (k0VarD == null) {
                zq60.o("TextPath path reference '%s' not found", y0Var.n);
                return false;
            }
            yq60.u uVar = (yq60.u) k0VarD;
            c cVar = new c(uVar.o);
            Matrix matrix = uVar.n;
            Path path = cVar.a;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        @Override // zq60.i
        public final void b(String str) {
            zq60 zq60Var = zq60.this;
            if (zq60Var.V()) {
                Rect rect = new Rect();
                zq60Var.c.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.a, this.b);
                this.c.union(rectF);
            }
            this.a = zq60Var.c.d.measureText(str) + this.a;
        }
    }

    public abstract class i {
        public boolean a(yq60.x0 x0Var) {
            return true;
        }

        public abstract void b(String str);
    }

    public class j extends i {
        public float a = 0.0f;

        public j() {
        }

        @Override // zq60.i
        public final void b(String str) {
            this.a = zq60.this.c.d.measureText(str) + this.a;
        }
    }

    public zq60(Canvas canvas) {
        this.a = canvas;
    }

    public static void N(g gVar, boolean z, yq60.n0 n0Var) {
        int i2;
        yq60.d0 d0Var = gVar.a;
        float fFloatValue = (z ? d0Var.d : d0Var.f).floatValue();
        if (n0Var instanceof yq60.e) {
            i2 = ((yq60.e) n0Var).a;
        } else if (!(n0Var instanceof yq60.f)) {
            return;
        } else {
            i2 = gVar.a.C.a;
        }
        int i3 = i(i2, fFloatValue);
        if (z) {
            gVar.d.setColor(i3);
        } else {
            gVar.e.setColor(i3);
        }
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, yq60.w wVar) {
        if (f2 == f7 && f3 == f8) {
            return;
        }
        if (f4 == 0.0f || f5 == 0.0f) {
            wVar.c(f7, f8);
            return;
        }
        float fAbs = Math.abs(f4);
        float fAbs2 = Math.abs(f5);
        double radians = Math.toRadians(((double) f6) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = ((double) (f3 - f8)) / 2.0d;
        double d4 = (dSin * d3) + (dCos * d2);
        double d5 = (dCos * d3) + ((-dSin) * d2);
        double d6 = fAbs * fAbs;
        double d7 = fAbs2 * fAbs2;
        double d8 = d4 * d4;
        double d9 = d5 * d5;
        double d10 = (d9 / d7) + (d8 / d6);
        if (d10 > 0.99999d) {
            double dSqrt = Math.sqrt(d10) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d6 = fAbs * fAbs;
            d7 = fAbs2 * fAbs2;
        }
        double d11 = z == z2 ? -1.0d : 1.0d;
        double d12 = d6 * d7;
        double d13 = d6 * d9;
        double d14 = d7 * d8;
        double d15 = ((d12 - d13) - d14) / (d13 + d14);
        if (d15 < 0.0d) {
            d15 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d15) * d11;
        double d16 = fAbs;
        double d17 = fAbs2;
        double d18 = ((d16 * d5) / d17) * dSqrt2;
        double d19 = dSqrt2 * (-((d17 * d4) / d16));
        double d20 = ((dCos * d18) - (dSin * d19)) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (dCos * d19) + (dSin * d18) + (((double) (f3 + f8)) / 2.0d);
        double d22 = (d4 - d18) / d16;
        double d23 = (d5 - d19) / d17;
        double d24 = ((-d4) - d18) / d16;
        double d25 = ((-d5) - d19) / d17;
        double d26 = (d23 * d23) + (d22 * d22);
        double dAcos = Math.acos(d22 / Math.sqrt(d26)) * (d23 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d25 * d25) + (d24 * d24)) * d26);
        double d27 = (d23 * d25) + (d22 * d24);
        double d28 = d27 / dSqrt3;
        double dAcos2 = ((d22 * d25) - (d23 * d24) < 0.0d ? -1.0d : 1.0d) * (d28 < -1.0d ? 3.141592653589793d : d28 > 1.0d ? 0.0d : Math.acos(d28));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d29 = dAcos2 % 6.283185307179586d;
        double d30 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d29) * 2.0d) / 3.141592653589793d);
        double d31 = d29 / ((double) iCeil);
        double d32 = d31 / 2.0d;
        double dSin2 = (Math.sin(d32) * 1.3333333333333333d) / (Math.cos(d32) + 1.0d);
        int i2 = iCeil * 6;
        float[] fArr = new float[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iCeil) {
            double d33 = d30;
            double d34 = (((double) i3) * d31) + d33;
            double dCos2 = Math.cos(d34);
            double dSin3 = Math.sin(d34);
            int i5 = i3;
            int i6 = i4;
            fArr[i6] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i4 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d35 = d34 + d31;
            double dCos3 = Math.cos(d35);
            double dSin4 = Math.sin(d35);
            fArr[i6 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i6 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i6 + 4] = (float) dCos3;
            i4 = i6 + 6;
            fArr[i6 + 5] = (float) dSin4;
            i3 = i5 + 1;
            d30 = d33;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f6);
        matrix.postTranslate((float) d20, (float) d21);
        matrix.mapPoints(fArr);
        fArr[i2 - 2] = f7;
        fArr[i2 - 1] = f8;
        for (int i7 = 0; i7 < i2; i7 += 6) {
            wVar.b(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static yq60.a c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new yq60.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    public static Matrix e(yq60.a aVar, yq60.a aVar2, hp20 hp20Var) {
        hp20.a aVar3;
        Matrix matrix = new Matrix();
        if (hp20Var != null && (aVar3 = hp20Var.a) != null) {
            float f2 = aVar.c / aVar2.c;
            float f3 = aVar.d / aVar2.d;
            float fA = -aVar2.a;
            float fA2 = -aVar2.b;
            if (hp20Var.equals(hp20.c)) {
                matrix.preTranslate(aVar.a, aVar.b);
                matrix.preScale(f2, f3);
                matrix.preTranslate(fA, fA2);
                return matrix;
            }
            float fMax = hp20Var.b == hp20.b.b ? Math.max(f2, f3) : Math.min(f2, f3);
            float f4 = aVar.c / fMax;
            float f5 = aVar.d / fMax;
            int iOrdinal = aVar3.ordinal();
            if (iOrdinal == 2) {
                fA = zen.a(aVar2.c, f4, 2.0f, fA);
            } else if (iOrdinal == 3) {
                fA -= aVar2.c - f4;
            } else if (iOrdinal == 5) {
                fA = zen.a(aVar2.c, f4, 2.0f, fA);
            } else if (iOrdinal == 6) {
                fA -= aVar2.c - f4;
            } else if (iOrdinal == 8) {
                fA = zen.a(aVar2.c, f4, 2.0f, fA);
            } else if (iOrdinal == 9) {
                fA -= aVar2.c - f4;
            }
            switch (aVar3.ordinal()) {
                case 4:
                case 5:
                case 6:
                    fA2 = zen.a(aVar2.d, f5, 2.0f, fA2);
                    break;
                case 7:
                case 8:
                case 9:
                    fA2 -= aVar2.d - f5;
                    break;
            }
            matrix.preTranslate(aVar.a, aVar.b);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(fA, fA2);
        }
        return matrix;
    }

    public static Typeface h(String str, Integer num, yq60.d0.b bVar) {
        int i2;
        boolean z = bVar == yq60.d0.b.b;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int i(int i2, float f2) {
        int i3 = 255;
        int iRound = Math.round(((i2 >> 24) & 255) * f2);
        if (iRound < 0) {
            i3 = 0;
        } else if (iRound <= 255) {
            i3 = iRound;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void r(yq60.p0 p0Var, yq60.p0 p0Var2) {
        if (p0Var.m == null) {
            p0Var.m = p0Var2.m;
        }
        if (p0Var.n == null) {
            p0Var.n = p0Var2.n;
        }
        if (p0Var.o == null) {
            p0Var.o = p0Var2.o;
        }
        if (p0Var.p == null) {
            p0Var.p = p0Var2.p;
        }
        if (p0Var.q == null) {
            p0Var.q = p0Var2.q;
        }
    }

    public static void s(yq60.x xVar, String str) {
        yq60.k0 k0VarD = xVar.a.d(str);
        if (k0VarD == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(k0VarD instanceof yq60.x)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (k0VarD == xVar) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        yq60.x xVar2 = (yq60.x) k0VarD;
        if (xVar.p == null) {
            xVar.p = xVar2.p;
        }
        if (xVar.q == null) {
            xVar.q = xVar2.q;
        }
        if (xVar.r == null) {
            xVar.r = xVar2.r;
        }
        if (xVar.s == null) {
            xVar.s = xVar2.s;
        }
        if (xVar.t == null) {
            xVar.t = xVar2.t;
        }
        if (xVar.u == null) {
            xVar.u = xVar2.u;
        }
        if (xVar.v == null) {
            xVar.v = xVar2.v;
        }
        if (xVar.i.isEmpty()) {
            xVar.i = xVar2.i;
        }
        if (xVar.o == null) {
            xVar.o = xVar2.o;
        }
        if (xVar.n == null) {
            xVar.n = xVar2.n;
        }
        String str2 = xVar2.w;
        if (str2 != null) {
            s(xVar, str2);
        }
    }

    public static boolean w(yq60.d0 d0Var, long j2) {
        return (d0Var.a & j2) != 0;
    }

    public static Path z(yq60.y yVar) {
        Path path = new Path();
        float[] fArr = yVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = yVar.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (yVar instanceof yq60.z) {
            path.close();
        }
        if (yVar.h == null) {
            yVar.h = c(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public final Path A(yq60.a0 a0Var) {
        float fD;
        float fE;
        float fMin;
        yq60.o oVar;
        float fD2;
        yq60.o oVar2;
        float fE2;
        float fD3;
        float fE3;
        float f2;
        float f3;
        Path path;
        yq60.o oVar3 = a0Var.s;
        if (oVar3 == null && a0Var.t == null) {
            fD = 0.0f;
        } else {
            yq60.o oVar4 = a0Var.t;
            if (oVar3 != null) {
                if (oVar4 == null) {
                    fD = oVar3.d(this);
                } else {
                    fD = oVar3.d(this);
                    fE = a0Var.t.e(this);
                }
                fMin = Math.min(fD, a0Var.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, a0Var.r.e(this) / 2.0f);
                oVar = a0Var.o;
                if (oVar != null) {
                    fD2 = oVar.d(this);
                } else {
                    fD2 = 0.0f;
                }
                oVar2 = a0Var.p;
                if (oVar2 != null) {
                    fE2 = oVar2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = a0Var.q.d(this);
                fE3 = a0Var.r.e(this);
                if (a0Var.h == null) {
                    a0Var.h = new yq60.a(fD2, fE2, fD3, fE3);
                }
                f2 = fD3 + fD2;
                f3 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f2, fE2);
                    path.lineTo(f2, f3);
                    path.lineTo(fD2, f3);
                    path.lineTo(fD2, fE2);
                } else {
                    float f4 = fMin * 0.5522848f;
                    float f5 = 0.5522848f * fMin2;
                    float f6 = fE2 + fMin2;
                    path.moveTo(fD2, f6);
                    float f7 = f6 - f5;
                    float f8 = fD2 + fMin;
                    float f9 = f8 - f4;
                    path.cubicTo(fD2, f7, f9, fE2, f8, fE2);
                    float f10 = f2 - fMin;
                    path.lineTo(f10, fE2);
                    float f11 = f10 + f4;
                    path.cubicTo(f11, fE2, f2, f7, f2, f6);
                    float f12 = f3 - fMin2;
                    path.lineTo(f2, f12);
                    float f13 = f12 + f5;
                    path.cubicTo(f2, f13, f11, f3, f10, f3);
                    path.lineTo(f8, f3);
                    float f14 = fD2;
                    path.cubicTo(f9, f3, f14, f13, fD2, f12);
                    path.lineTo(f14, f6);
                }
                path.close();
                return path;
            }
            fD = oVar4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, a0Var.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, a0Var.r.e(this) / 2.0f);
        oVar = a0Var.o;
        if (oVar != null) {
            fD2 = oVar.d(this);
        } else {
            fD2 = 0.0f;
        }
        oVar2 = a0Var.p;
        if (oVar2 != null) {
            fE2 = oVar2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = a0Var.q.d(this);
        fE3 = a0Var.r.e(this);
        if (a0Var.h == null) {
            a0Var.h = new yq60.a(fD2, fE2, fD3, fE3);
        }
        f2 = fD3 + fD2;
        f3 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f2, fE2);
            path.lineTo(f2, f3);
            path.lineTo(fD2, f3);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f2, fE2);
            path.lineTo(f2, f3);
            path.lineTo(fD2, f3);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public final yq60.a B(yq60.o oVar, yq60.o oVar2, yq60.o oVar3, yq60.o oVar4) {
        float fD = oVar != null ? oVar.d(this) : 0.0f;
        float fE = oVar2 != null ? oVar2.e(this) : 0.0f;
        g gVar = this.c;
        yq60.a aVar = gVar.g;
        if (aVar == null) {
            aVar = gVar.f;
        }
        return new yq60.a(fD, fE, oVar3 != null ? oVar3.d(this) : aVar.c, oVar4 != null ? oVar4.e(this) : aVar.d);
    }

    public final Path C(yq60.j0 j0Var, boolean z) {
        Path path;
        Path pathC;
        Path pathB;
        this.d.push(this.c);
        g gVar = new g(this.c);
        this.c = gVar;
        T(gVar, j0Var);
        if (!k() || !V()) {
            this.c = this.d.pop();
            return null;
        }
        if (j0Var instanceof yq60.d1) {
            if (!z) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            yq60.d1 d1Var = (yq60.d1) j0Var;
            yq60.k0 k0VarD = j0Var.a.d(d1Var.o);
            if (k0VarD == null) {
                o("Use reference '%s' not found", d1Var.o);
                this.c = this.d.pop();
                return null;
            }
            if (!(k0VarD instanceof yq60.j0)) {
                this.c = this.d.pop();
                return null;
            }
            pathC = C((yq60.j0) k0VarD, false);
            if (pathC != null) {
                if (d1Var.h == null) {
                    d1Var.h = c(pathC);
                }
                Matrix matrix = d1Var.n;
                if (matrix != null) {
                    pathC.transform(matrix);
                }
                if (this.c.a.T != null && (pathB = b(j0Var, j0Var.h)) != null) {
                    pathC.op(pathB, Path.Op.INTERSECT);
                }
                this.c = this.d.pop();
                return pathC;
            }
            return null;
        }
        boolean z2 = j0Var instanceof yq60.k;
        yq60.d0.a aVar = yq60.d0.a.b;
        if (z2) {
            yq60.k kVar = (yq60.k) j0Var;
            if (j0Var instanceof yq60.u) {
                c cVar = new c(((yq60.u) j0Var).o);
                yq60.a aVar2 = j0Var.h;
                Path path2 = cVar.a;
                if (aVar2 == null) {
                    j0Var.h = c(path2);
                }
                path = path2;
            } else if (j0Var instanceof yq60.a0) {
                path = A((yq60.a0) j0Var);
            } else if (j0Var instanceof yq60.c) {
                path = x((yq60.c) j0Var);
            } else if (j0Var instanceof yq60.h) {
                path = y((yq60.h) j0Var);
            } else {
                path = j0Var instanceof yq60.y ? z((yq60.y) j0Var) : null;
            }
            if (path != null) {
                if (kVar.h == null) {
                    kVar.h = c(path);
                }
                Matrix matrix2 = kVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                yq60.d0.a aVar3 = this.c.a.U;
                path.setFillType((aVar3 == null || aVar3 != aVar) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(j0Var instanceof yq60.v0)) {
            o("Invalid %s element found in clipPath definition", j0Var.n());
            return null;
        }
        yq60.v0 v0Var = (yq60.v0) j0Var;
        ArrayList arrayList = v0Var.n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((yq60.o) v0Var.n.get(0)).d(this);
        ArrayList arrayList2 = v0Var.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((yq60.o) v0Var.o.get(0)).e(this);
        ArrayList arrayList3 = v0Var.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((yq60.o) v0Var.p.get(0)).d(this);
        ArrayList arrayList4 = v0Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((yq60.o) v0Var.q.get(0)).e(this);
        }
        if (this.c.a.J != yq60.d0.f.a) {
            float fD3 = d(v0Var);
            if (this.c.a.J == yq60.d0.f.b) {
                fD3 /= 2.0f;
            }
            fD -= fD3;
        }
        if (v0Var.h == null) {
            h hVar = new h(fD, fE2);
            n(v0Var, hVar);
            RectF rectF = hVar.c;
            v0Var.h = new yq60.a(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        path = new Path();
        n(v0Var, new f(fD + fD2, fE2 + fE, path));
        Matrix matrix3 = v0Var.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        yq60.d0.a aVar4 = this.c.a.U;
        path.setFillType((aVar4 == null || aVar4 != aVar) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathC = path;
        if (this.c.a.T != null) {
            pathC.op(pathB, Path.Op.INTERSECT);
        }
        this.c = this.d.pop();
        return pathC;
    }

    public final void D(yq60.a aVar) {
        if (this.c.a.V != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            yq60.r rVar = (yq60.r) this.b.d(this.c.a.V);
            L(rVar, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(rVar, aVar);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean E() {
        yq60.k0 k0VarD;
        int i2 = 0;
        if (this.c.a.B.floatValue() >= 1.0f && this.c.a.V == null) {
            return false;
        }
        int iFloatValue = (int) (this.c.a.B.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i2 = 255;
            if (iFloatValue <= 255) {
                i2 = iFloatValue;
            }
        }
        this.a.saveLayerAlpha(null, i2, 31);
        this.d.push(this.c);
        g gVar = new g(this.c);
        this.c = gVar;
        String str = gVar.a.V;
        if (str != null && ((k0VarD = this.b.d(str)) == null || !(k0VarD instanceof yq60.r))) {
            o("Mask reference '%s' not found", this.c.a.V);
            this.c.a.V = null;
        }
        return true;
    }

    public final void F(yq60.e0 e0Var, yq60.a aVar, yq60.a aVar2, hp20 hp20Var) {
        if (aVar.c == 0.0f || aVar.d == 0.0f) {
            return;
        }
        if (hp20Var == null && (hp20Var = e0Var.n) == null) {
            hp20Var = hp20.d;
        }
        T(this.c, e0Var);
        if (k()) {
            g gVar = this.c;
            gVar.f = aVar;
            if (!gVar.a.K.booleanValue()) {
                yq60.a aVar3 = this.c.f;
                M(aVar3.a, aVar3.b, aVar3.c, aVar3.d);
            }
            f(e0Var, this.c.f);
            g gVar2 = this.c;
            Canvas canvas = this.a;
            if (aVar2 != null) {
                canvas.concat(e(gVar2.f, aVar2, hp20Var));
                this.c.g = e0Var.o;
            } else {
                yq60.a aVar4 = gVar2.f;
                canvas.translate(aVar4.a, aVar4.b);
            }
            boolean zE = E();
            U();
            H(e0Var, true);
            if (zE) {
                D(e0Var.h);
            }
            R(e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(yq60.m0 m0Var) {
        yq60.o oVar;
        String str;
        int iIndexOf;
        Set<String> setA;
        yq60.o oVar2;
        Boolean bool;
        if (m0Var instanceof yq60.s) {
            return;
        }
        P();
        if ((m0Var instanceof yq60.k0) && (bool = ((yq60.k0) m0Var).d) != null) {
            this.c.h = bool.booleanValue();
        }
        if (m0Var instanceof yq60.e0) {
            yq60.e0 e0Var = (yq60.e0) m0Var;
            F(e0Var, B(e0Var.p, e0Var.q, e0Var.r, e0Var.s), e0Var.o, e0Var.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (m0Var instanceof yq60.d1) {
                yq60.d1 d1Var = (yq60.d1) m0Var;
                yq60.c1 c1Var = yq60.c1.e;
                Canvas canvas = this.a;
                yq60.o oVar3 = d1Var.r;
                if ((oVar3 == null || !oVar3.g()) && ((oVar2 = d1Var.s) == null || !oVar2.g())) {
                    T(this.c, d1Var);
                    if (k()) {
                        yq60.m0 m0VarD = d1Var.a.d(d1Var.o);
                        if (m0VarD == null) {
                            o("Use reference '%s' not found", d1Var.o);
                        } else {
                            Matrix matrix = d1Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            yq60.o oVar4 = d1Var.p;
                            float fD = oVar4 != null ? oVar4.d(this) : 0.0f;
                            yq60.o oVar5 = d1Var.q;
                            canvas.translate(fD, oVar5 != null ? oVar5.e(this) : 0.0f);
                            f(d1Var, d1Var.h);
                            boolean zE = E();
                            this.e.push(d1Var);
                            this.f.push(this.a.getMatrix());
                            if (m0VarD instanceof yq60.e0) {
                                yq60.e0 e0Var2 = (yq60.e0) m0VarD;
                                yq60.a aVarB = B(null, null, d1Var.r, d1Var.s);
                                P();
                                F(e0Var2, aVarB, e0Var2.o, e0Var2.n);
                                O();
                            } else if (m0VarD instanceof yq60.s0) {
                                yq60.o oVar6 = d1Var.r;
                                if (oVar6 == null) {
                                    oVar6 = new yq60.o(100.0f, c1Var);
                                }
                                yq60.o oVar7 = d1Var.s;
                                if (oVar7 == null) {
                                    oVar7 = new yq60.o(100.0f, c1Var);
                                }
                                yq60.a aVarB2 = B(null, null, oVar6, oVar7);
                                P();
                                yq60.s0 s0Var = (yq60.s0) m0VarD;
                                if (aVarB2.c != 0.0f && aVarB2.d != 0.0f) {
                                    hp20 hp20Var = s0Var.n;
                                    if (hp20Var == null) {
                                        hp20Var = hp20.d;
                                    }
                                    T(this.c, s0Var);
                                    g gVar = this.c;
                                    gVar.f = aVarB2;
                                    if (!gVar.a.K.booleanValue()) {
                                        yq60.a aVar = this.c.f;
                                        M(aVar.a, aVar.b, aVar.c, aVar.d);
                                    }
                                    yq60.a aVar2 = s0Var.o;
                                    g gVar2 = this.c;
                                    if (aVar2 != null) {
                                        canvas.concat(e(gVar2.f, aVar2, hp20Var));
                                        this.c.g = s0Var.o;
                                    } else {
                                        yq60.a aVar3 = gVar2.f;
                                        canvas.translate(aVar3.a, aVar3.b);
                                    }
                                    boolean zE2 = E();
                                    H(s0Var, true);
                                    if (zE2) {
                                        D(s0Var.h);
                                    }
                                    R(s0Var);
                                }
                                O();
                            } else {
                                G(m0VarD);
                            }
                            this.e.pop();
                            this.f.pop();
                            if (zE) {
                                D(d1Var.h);
                            }
                            R(d1Var);
                        }
                    }
                }
            } else if (m0Var instanceof yq60.r0) {
                yq60.r0 r0Var = (yq60.r0) m0Var;
                T(this.c, r0Var);
                if (k()) {
                    Matrix matrix2 = r0Var.n;
                    if (matrix2 != null) {
                        this.a.concat(matrix2);
                    }
                    f(r0Var, r0Var.h);
                    boolean zE3 = E();
                    String language = Locale.getDefault().getLanguage();
                    for (yq60.m0 m0Var2 : r0Var.i) {
                        if (m0Var2 instanceof yq60.f0) {
                            yq60.f0 f0Var = (yq60.f0) m0Var2;
                            if (f0Var.b() == null && ((setA = f0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set<String> setE = f0Var.e();
                                if (setE != null) {
                                    if (g == null) {
                                        synchronized (zq60.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setE.isEmpty() || !g.containsAll(setE)) {
                                    }
                                }
                                Set<String> setL = f0Var.l();
                                if (setL == null) {
                                    Set<String> setM = f0Var.m();
                                    if (setM == null) {
                                        G(m0Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zE3) {
                        D(r0Var.h);
                    }
                    R(r0Var);
                }
            } else if (m0Var instanceof yq60.l) {
                yq60.l lVar = (yq60.l) m0Var;
                T(this.c, lVar);
                if (k()) {
                    Matrix matrix3 = lVar.n;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    f(lVar, lVar.h);
                    boolean zE4 = E();
                    H(lVar, true);
                    if (zE4) {
                        D(lVar.h);
                    }
                    R(lVar);
                }
            } else if (m0Var instanceof yq60.n) {
                yq60.n nVar = (yq60.n) m0Var;
                Canvas canvas2 = this.a;
                yq60.o oVar8 = nVar.r;
                if (oVar8 != null && !oVar8.g() && (oVar = nVar.s) != null && !oVar.g() && (str = nVar.o) != null) {
                    hp20 hp20Var2 = nVar.n;
                    if (hp20Var2 == null) {
                        hp20Var2 = hp20.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e2) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        yq60.a aVar4 = new yq60.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        T(this.c, nVar);
                        if (k() && V()) {
                            Matrix matrix4 = nVar.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            yq60.o oVar9 = nVar.p;
                            float fD2 = oVar9 != null ? oVar9.d(this) : 0.0f;
                            yq60.o oVar10 = nVar.q;
                            float fE2 = oVar10 != null ? oVar10.e(this) : 0.0f;
                            float fD3 = nVar.r.d(this);
                            float fD4 = nVar.s.d(this);
                            g gVar3 = this.c;
                            gVar3.f = new yq60.a(fD2, fE2, fD3, fD4);
                            if (!gVar3.a.K.booleanValue()) {
                                yq60.a aVar5 = this.c.f;
                                M(aVar5.a, aVar5.b, aVar5.c, aVar5.d);
                            }
                            nVar.h = this.c.f;
                            R(nVar);
                            f(nVar, nVar.h);
                            boolean zE5 = E();
                            U();
                            canvas2.save();
                            canvas2.concat(e(this.c.f, aVar4, hp20Var2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.c.a.b0 != yq60.d0.e.c ? 2 : 0));
                            canvas2.restore();
                            if (zE5) {
                                D(nVar.h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof yq60.u) {
                yq60.u uVar = (yq60.u) m0Var;
                if (uVar.o != null) {
                    T(this.c, uVar);
                    if (k() && V()) {
                        g gVar4 = this.c;
                        if (gVar4.c || gVar4.b) {
                            Matrix matrix5 = uVar.n;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            Path path = new c(uVar.o).a;
                            if (uVar.h == null) {
                                uVar.h = c(path);
                            }
                            R(uVar);
                            g(uVar);
                            f(uVar, uVar.h);
                            boolean zE6 = E();
                            g gVar5 = this.c;
                            if (gVar5.b) {
                                yq60.d0.a aVar6 = gVar5.a.c;
                                path.setFillType((aVar6 == null || aVar6 != yq60.d0.a.b) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                l(uVar, path);
                            }
                            if (this.c.c) {
                                m(path);
                            }
                            K(uVar);
                            if (zE6) {
                                D(uVar.h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof yq60.a0) {
                yq60.a0 a0Var = (yq60.a0) m0Var;
                yq60.o oVar11 = a0Var.q;
                if (oVar11 != null && a0Var.r != null && !oVar11.g() && !a0Var.r.g()) {
                    T(this.c, a0Var);
                    if (k() && V()) {
                        Matrix matrix6 = a0Var.n;
                        if (matrix6 != null) {
                            this.a.concat(matrix6);
                        }
                        Path pathA = A(a0Var);
                        R(a0Var);
                        g(a0Var);
                        f(a0Var, a0Var.h);
                        boolean zE7 = E();
                        if (this.c.b) {
                            l(a0Var, pathA);
                        }
                        if (this.c.c) {
                            m(pathA);
                        }
                        if (zE7) {
                            D(a0Var.h);
                        }
                    }
                }
            } else if (m0Var instanceof yq60.c) {
                yq60.c cVar = (yq60.c) m0Var;
                yq60.o oVar12 = cVar.q;
                if (oVar12 != null && !oVar12.g()) {
                    T(this.c, cVar);
                    if (k() && V()) {
                        Matrix matrix7 = cVar.n;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path pathX = x(cVar);
                        R(cVar);
                        g(cVar);
                        f(cVar, cVar.h);
                        boolean zE8 = E();
                        if (this.c.b) {
                            l(cVar, pathX);
                        }
                        if (this.c.c) {
                            m(pathX);
                        }
                        if (zE8) {
                            D(cVar.h);
                        }
                    }
                }
            } else if (m0Var instanceof yq60.h) {
                yq60.h hVar = (yq60.h) m0Var;
                yq60.o oVar13 = hVar.q;
                if (oVar13 != null && hVar.r != null && !oVar13.g() && !hVar.r.g()) {
                    T(this.c, hVar);
                    if (k() && V()) {
                        Matrix matrix8 = hVar.n;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path pathY = y(hVar);
                        R(hVar);
                        g(hVar);
                        f(hVar, hVar.h);
                        boolean zE9 = E();
                        if (this.c.b) {
                            l(hVar, pathY);
                        }
                        if (this.c.c) {
                            m(pathY);
                        }
                        if (zE9) {
                            D(hVar.h);
                        }
                    }
                }
            } else if (m0Var instanceof yq60.p) {
                yq60.p pVar = (yq60.p) m0Var;
                T(this.c, pVar);
                if (k() && V() && this.c.c) {
                    Matrix matrix9 = pVar.n;
                    if (matrix9 != null) {
                        this.a.concat(matrix9);
                    }
                    yq60.o oVar14 = pVar.o;
                    float fD5 = oVar14 == null ? 0.0f : oVar14.d(this);
                    yq60.o oVar15 = pVar.p;
                    float fE3 = oVar15 == null ? 0.0f : oVar15.e(this);
                    yq60.o oVar16 = pVar.q;
                    float fD6 = oVar16 == null ? 0.0f : oVar16.d(this);
                    yq60.o oVar17 = pVar.r;
                    fE = oVar17 != null ? oVar17.e(this) : 0.0f;
                    if (pVar.h == null) {
                        pVar.h = new yq60.a(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    R(pVar);
                    g(pVar);
                    f(pVar, pVar.h);
                    boolean zE10 = E();
                    m(path2);
                    K(pVar);
                    if (zE10) {
                        D(pVar.h);
                    }
                }
            } else if (m0Var instanceof yq60.z) {
                yq60.z zVar = (yq60.z) m0Var;
                T(this.c, zVar);
                if (k() && V()) {
                    g gVar6 = this.c;
                    if (gVar6.c || gVar6.b) {
                        Matrix matrix10 = zVar.n;
                        if (matrix10 != null) {
                            this.a.concat(matrix10);
                        }
                        if (zVar.o.length >= 2) {
                            Path pathZ = z(zVar);
                            R(zVar);
                            g(zVar);
                            f(zVar, zVar.h);
                            boolean zE11 = E();
                            if (this.c.b) {
                                l(zVar, pathZ);
                            }
                            if (this.c.c) {
                                m(pathZ);
                            }
                            K(zVar);
                            if (zE11) {
                                D(zVar.h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof yq60.y) {
                yq60.y yVar = (yq60.y) m0Var;
                T(this.c, yVar);
                if (k() && V()) {
                    g gVar7 = this.c;
                    if (gVar7.c || gVar7.b) {
                        Matrix matrix11 = yVar.n;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (yVar.o.length >= 2) {
                            Path pathZ2 = z(yVar);
                            R(yVar);
                            yq60.d0.a aVar7 = this.c.a.c;
                            pathZ2.setFillType((aVar7 == null || aVar7 != yq60.d0.a.b) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            g(yVar);
                            f(yVar, yVar.h);
                            boolean zE12 = E();
                            if (this.c.b) {
                                l(yVar, pathZ2);
                            }
                            if (this.c.c) {
                                m(pathZ2);
                            }
                            K(yVar);
                            if (zE12) {
                                D(yVar.h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof yq60.v0) {
                yq60.v0 v0Var = (yq60.v0) m0Var;
                T(this.c, v0Var);
                if (k()) {
                    Matrix matrix12 = v0Var.r;
                    if (matrix12 != null) {
                        this.a.concat(matrix12);
                    }
                    ArrayList arrayList = v0Var.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((yq60.o) v0Var.n.get(0)).d(this);
                    ArrayList arrayList2 = v0Var.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((yq60.o) v0Var.o.get(0)).e(this);
                    ArrayList arrayList3 = v0Var.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((yq60.o) v0Var.p.get(0)).d(this);
                    ArrayList arrayList4 = v0Var.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((yq60.o) v0Var.q.get(0)).e(this);
                    }
                    yq60.d0.f fVarV = v();
                    if (fVarV != yq60.d0.f.a) {
                        float fD9 = d(v0Var);
                        if (fVarV == yq60.d0.f.b) {
                            fD9 /= 2.0f;
                        }
                        fD7 -= fD9;
                    }
                    if (v0Var.h == null) {
                        h hVar2 = new h(fD7, fE4);
                        n(v0Var, hVar2);
                        RectF rectF = hVar2.c;
                        v0Var.h = new yq60.a(rectF.left, rectF.top, rectF.width(), hVar2.c.height());
                    }
                    R(v0Var);
                    g(v0Var);
                    f(v0Var, v0Var.h);
                    boolean zE13 = E();
                    n(v0Var, new e(fD7 + fD8, fE4 + fE));
                    if (zE13) {
                        D(v0Var.h);
                    }
                }
            }
        }
        O();
    }

    public final void H(yq60.i0 i0Var, boolean z) {
        if (z) {
            this.e.push(i0Var);
            this.f.push(this.a.getMatrix());
        }
        Iterator<yq60.m0> it = i0Var.getChildren().iterator();
        while (it.hasNext()) {
            G(it.next());
        }
        if (z) {
            this.e.pop();
            this.f.pop();
        }
    }

    public final void I(yq60 yq60Var, z750 z750Var) {
        ArrayList arrayList;
        this.b = yq60Var;
        yq60.e0 e0Var = yq60Var.a;
        yq5.p pVar = yq60Var.b;
        if (e0Var == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        yq60.a aVar = e0Var.o;
        hp20 hp20Var = e0Var.n;
        yq5.p pVar2 = z750Var.a;
        if (pVar2 != null) {
            ArrayList arrayList2 = pVar2.a;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                pVar.b(z750Var.a);
            }
        }
        this.c = new g();
        this.d = new Stack<>();
        S(this.c, yq60.d0.a());
        g gVar = this.c;
        gVar.f = null;
        gVar.h = false;
        this.d.push(new g(gVar));
        this.f = new Stack<>();
        this.e = new Stack<>();
        Boolean bool = e0Var.d;
        if (bool != null) {
            this.c.h = bool.booleanValue();
        }
        P();
        yq60.a aVar2 = new yq60.a(z750Var.b);
        yq60.o oVar = e0Var.r;
        if (oVar != null) {
            aVar2.c = oVar.c(this, aVar2.c);
        }
        yq60.o oVar2 = e0Var.s;
        if (oVar2 != null) {
            aVar2.d = oVar2.c(this, aVar2.d);
        }
        F(e0Var, aVar2, aVar, hp20Var);
        O();
        yq5.p pVar3 = z750Var.a;
        if (pVar3 != null) {
            ArrayList arrayList3 = pVar3.a;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = pVar.a) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((yq5.o) it.next()).c == yq5.s.b) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    public final void J(yq60.q qVar, b bVar) {
        float fFloatValue;
        float fA;
        P();
        Float f2 = qVar.u;
        float fA2 = 0.0f;
        if (f2 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f2.floatValue())) {
            float f3 = bVar.c;
            if (f3 == 0.0f && bVar.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(bVar.d, f3));
            }
        } else {
            fFloatValue = qVar.u.floatValue();
        }
        float fA3 = qVar.p ? 1.0f : this.c.a.i.a();
        this.c = t(qVar);
        Matrix matrix = new Matrix();
        matrix.preTranslate(bVar.a, bVar.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA3, fA3);
        yq60.o oVar = qVar.q;
        float fD = oVar != null ? oVar.d(this) : 0.0f;
        yq60.o oVar2 = qVar.r;
        float fE = oVar2 != null ? oVar2.e(this) : 0.0f;
        yq60.o oVar3 = qVar.s;
        float fD2 = oVar3 != null ? oVar3.d(this) : 3.0f;
        yq60.o oVar4 = qVar.t;
        float fE2 = oVar4 != null ? oVar4.e(this) : 3.0f;
        yq60.a aVar = qVar.o;
        Canvas canvas = this.a;
        if (aVar != null) {
            float fMax = fD2 / aVar.c;
            float f4 = fE2 / aVar.d;
            hp20 hp20Var = qVar.n;
            if (hp20Var == null) {
                hp20Var = hp20.d;
            }
            boolean zEquals = hp20Var.equals(hp20.c);
            hp20.a aVar2 = hp20Var.a;
            if (!zEquals) {
                fMax = hp20Var.b == hp20.b.b ? Math.max(fMax, f4) : Math.min(fMax, f4);
                f4 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f4);
            canvas.concat(matrix);
            yq60.a aVar3 = qVar.o;
            float f5 = aVar3.c * fMax;
            float f6 = aVar3.d * f4;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 2) {
                fA = zen.a(fD2, f5, 2.0f, 0.0f);
            } else if (iOrdinal == 3) {
                fA = 0.0f - (fD2 - f5);
            } else if (iOrdinal == 5) {
                fA = zen.a(fD2, f5, 2.0f, 0.0f);
            } else if (iOrdinal == 6) {
                fA = 0.0f - (fD2 - f5);
            } else if (iOrdinal == 8) {
                fA = zen.a(fD2, f5, 2.0f, 0.0f);
            } else if (iOrdinal != 9) {
                fA = 0.0f;
            } else {
                fA = 0.0f - (fD2 - f5);
            }
            switch (aVar2.ordinal()) {
                case 4:
                case 5:
                case 6:
                    fA2 = zen.a(fE2, f6, 2.0f, 0.0f);
                    break;
                case 7:
                case 8:
                case 9:
                    fA2 = 0.0f - (fE2 - f6);
                    break;
            }
            if (!this.c.a.K.booleanValue()) {
                M(fA, fA2, fD2, fE2);
            }
            matrix.reset();
            matrix.preScale(fMax, f4);
            canvas.concat(matrix);
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!this.c.a.K.booleanValue()) {
                M(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zE = E();
        H(qVar, false);
        if (zE) {
            D(qVar.h);
        }
        O();
    }

    public final void K(yq60.k kVar) {
        yq60.q qVar;
        yq60.q qVar2;
        yq60.q qVar3;
        int i2;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        int size;
        yq60.d0 d0Var = this.c.a;
        String str = d0Var.M;
        if (str == null && d0Var.N == null && d0Var.O == null) {
            return;
        }
        if (str == null) {
            qVar = null;
        } else {
            yq60.k0 k0VarD = kVar.a.d(str);
            if (k0VarD != null) {
                qVar = (yq60.q) k0VarD;
            } else {
                o("Marker reference '%s' not found", this.c.a.M);
                qVar = null;
            }
        }
        String str2 = this.c.a.N;
        if (str2 == null) {
            qVar2 = null;
        } else {
            yq60.k0 k0VarD2 = kVar.a.d(str2);
            if (k0VarD2 != null) {
                qVar2 = (yq60.q) k0VarD2;
            } else {
                o("Marker reference '%s' not found", this.c.a.N);
                qVar2 = null;
            }
        }
        String str3 = this.c.a.O;
        if (str3 == null) {
            qVar3 = null;
        } else {
            yq60.k0 k0VarD3 = kVar.a.d(str3);
            if (k0VarD3 != null) {
                qVar3 = (yq60.q) k0VarD3;
            } else {
                o("Marker reference '%s' not found", this.c.a.O);
                qVar3 = null;
            }
        }
        float f5 = 0.0f;
        if (kVar instanceof yq60.u) {
            arrayList = new a(this, ((yq60.u) kVar).o).a;
            f3 = 0.0f;
            i2 = 1;
        } else if (kVar instanceof yq60.p) {
            yq60.p pVar = (yq60.p) kVar;
            yq60.o oVar = pVar.o;
            float fD = oVar != null ? oVar.d(this) : 0.0f;
            yq60.o oVar2 = pVar.p;
            float fE = oVar2 != null ? oVar2.e(this) : 0.0f;
            yq60.o oVar3 = pVar.q;
            float fD2 = oVar3 != null ? oVar3.d(this) : 0.0f;
            yq60.o oVar4 = pVar.r;
            float fE2 = oVar4 != null ? oVar4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f6 = fD2 - fD;
            i2 = 1;
            float f7 = fE2 - fE;
            arrayList2.add(new b(fD, fE, f6, f7));
            arrayList2.add(new b(fD2, fE2, f6, f7));
            f3 = 0.0f;
            arrayList = arrayList2;
        } else {
            i2 = 1;
            yq60.y yVar = (yq60.y) kVar;
            int length = yVar.o.length;
            if (length < 2) {
                arrayList = null;
                f3 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = yVar.o;
                b bVar = new b(fArr[0], fArr[1], 0.0f, 0.0f);
                int i3 = 2;
                float f8 = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    f2 = bVar.b;
                    f3 = f5;
                    f4 = bVar.a;
                    if (i3 >= length) {
                        break;
                    }
                    float[] fArr2 = yVar.o;
                    float f10 = fArr2[i3];
                    float f11 = fArr2[i3 + 1];
                    bVar.a(f10, f11);
                    arrayList3.add(bVar);
                    bVar = new b(f10, f11, f10 - f4, f11 - f2);
                    i3 += 2;
                    f9 = f11;
                    f8 = f10;
                    f5 = f3;
                }
                if (yVar instanceof yq60.z) {
                    float[] fArr3 = yVar.o;
                    float f12 = fArr3[0];
                    if (f8 != f12) {
                        float f13 = fArr3[1];
                        if (f9 != f13) {
                            bVar.a(f12, f13);
                            arrayList3.add(bVar);
                            b bVar2 = new b(f12, f13, f12 - f4, f13 - f2);
                            bVar2.b((b) arrayList3.get(0));
                            arrayList3.add(bVar2);
                            arrayList3.set(0, bVar2);
                        }
                    }
                } else {
                    arrayList3.add(bVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        yq60.d0 d0Var2 = this.c.a;
        d0Var2.O = null;
        d0Var2.N = null;
        d0Var2.M = null;
        if (qVar != null) {
            J(qVar, (b) arrayList.get(0));
        }
        if (qVar2 != null && arrayList.size() > 2) {
            b bVar3 = (b) arrayList.get(0);
            b bVar4 = (b) arrayList.get(i2);
            int i4 = 1;
            while (i4 < size - 1) {
                i4++;
                b bVar5 = (b) arrayList.get(i4);
                if (bVar4.e) {
                    float f14 = bVar4.c;
                    float f15 = bVar4.d;
                    float f16 = bVar4.a;
                    float f17 = f16 - bVar3.a;
                    float f18 = bVar4.b;
                    float f19 = ((f18 - bVar3.b) * f15) + (f17 * f14);
                    if (f19 == f3) {
                        f19 = ((bVar5.a - f16) * f14) + ((bVar5.b - f18) * f15);
                    }
                    if (f19 <= f3 && (f19 != f3 || (f14 <= f3 && f15 < f3))) {
                        bVar4.c = -f14;
                        bVar4.d = -f15;
                    }
                }
                J(qVar2, bVar4);
                bVar3 = bVar4;
                bVar4 = bVar5;
            }
        }
        if (qVar3 != null) {
            J(qVar3, (b) arrayList.get(size - 1));
        }
    }

    public final void L(yq60.r rVar, yq60.a aVar) {
        float fD;
        float fE;
        Boolean bool = rVar.n;
        if (bool == null || !bool.booleanValue()) {
            yq60.o oVar = rVar.p;
            float fC = oVar != null ? oVar.c(this, 1.0f) : 1.2f;
            yq60.o oVar2 = rVar.q;
            float fC2 = oVar2 != null ? oVar2.c(this, 1.0f) : 1.2f;
            fD = fC * aVar.c;
            fE = fC2 * aVar.d;
        } else {
            yq60.o oVar3 = rVar.p;
            fD = oVar3 != null ? oVar3.d(this) : aVar.c;
            yq60.o oVar4 = rVar.q;
            fE = oVar4 != null ? oVar4.e(this) : aVar.d;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        P();
        g gVarT = t(rVar);
        this.c = gVarT;
        gVarT.a.B = Float.valueOf(1.0f);
        boolean zE = E();
        Canvas canvas = this.a;
        canvas.save();
        Boolean bool2 = rVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.a, aVar.b);
            canvas.scale(aVar.c, aVar.d);
        }
        H(rVar, false);
        canvas.restore();
        if (zE) {
            D(aVar);
        }
        O();
    }

    public final void M(float f2, float f3, float f4, float f5) {
        float fD = f4 + f2;
        float fE = f5 + f3;
        yq60.b bVar = this.c.a.L;
        if (bVar != null) {
            f2 += bVar.d.d(this);
            f3 += this.c.a.L.a.e(this);
            fD -= this.c.a.L.b.d(this);
            fE -= this.c.a.L.c.e(this);
        }
        this.a.clipRect(f2, f3, fD, fE);
    }

    public final void O() {
        this.a.restore();
        this.c = this.d.pop();
    }

    public final void P() {
        this.a.save();
        this.d.push(this.c);
        this.c = new g(this.c);
    }

    public final String Q(String str, boolean z, boolean z2) {
        if (this.c.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(yq60.j0 j0Var) {
        if (j0Var.b == null || j0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f.peek().invert(matrix)) {
            yq60.a aVar = j0Var.h;
            float f2 = aVar.a;
            float f3 = aVar.b;
            float fA = aVar.a();
            yq60.a aVar2 = j0Var.h;
            float f4 = aVar2.b;
            float fA2 = aVar2.a();
            float fB = j0Var.h.b();
            yq60.a aVar3 = j0Var.h;
            float[] fArr = {f2, f3, fA, f4, fA2, fB, aVar3.a, aVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            yq60.j0 j0Var2 = (yq60.j0) this.e.peek();
            yq60.a aVar4 = j0Var2.h;
            float f9 = rectF.left;
            float f10 = rectF.top;
            if (aVar4 == null) {
                j0Var2.h = new yq60.a(f9, f10, rectF.right - f9, rectF.bottom - f10);
                return;
            }
            float f11 = rectF.right - f9;
            float f12 = rectF.bottom - f10;
            if (f9 < aVar4.a) {
                aVar4.a = f9;
            }
            if (f10 < aVar4.b) {
                aVar4.b = f10;
            }
            if (f9 + f11 > aVar4.a()) {
                aVar4.c = (f9 + f11) - aVar4.a;
            }
            if (f10 + f12 > aVar4.b()) {
                aVar4.d = (f10 + f12) - aVar4.b;
            }
        }
    }

    public final void S(g gVar, yq60.d0 d0Var) {
        if (w(d0Var, 4096L)) {
            gVar.a.C = d0Var.C;
        }
        if (w(d0Var, 2048L)) {
            gVar.a.B = d0Var.B;
        }
        boolean zW = w(d0Var, 1L);
        yq60.e eVar = yq60.e.c;
        if (zW) {
            gVar.a.b = d0Var.b;
            yq60.n0 n0Var = d0Var.b;
            gVar.b = (n0Var == null || n0Var == eVar) ? false : true;
        }
        if (w(d0Var, 4L)) {
            gVar.a.d = d0Var.d;
        }
        if (w(d0Var, 6149L)) {
            N(gVar, true, gVar.a.b);
        }
        if (w(d0Var, 2L)) {
            gVar.a.c = d0Var.c;
        }
        if (w(d0Var, 8L)) {
            gVar.a.e = d0Var.e;
            yq60.n0 n0Var2 = d0Var.e;
            gVar.c = (n0Var2 == null || n0Var2 == eVar) ? false : true;
        }
        if (w(d0Var, 16L)) {
            gVar.a.f = d0Var.f;
        }
        if (w(d0Var, 6168L)) {
            N(gVar, false, gVar.a.e);
        }
        if (w(d0Var, 34359738368L)) {
            gVar.a.a0 = d0Var.a0;
        }
        if (w(d0Var, 32L)) {
            yq60.d0 d0Var2 = gVar.a;
            yq60.o oVar = d0Var.i;
            d0Var2.i = oVar;
            gVar.e.setStrokeWidth(oVar.b(this));
        }
        if (w(d0Var, 64L)) {
            yq60.d0 d0Var3 = gVar.a;
            Paint paint = gVar.e;
            d0Var3.v = d0Var.v;
            int iOrdinal = d0Var.v.ordinal();
            if (iOrdinal == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iOrdinal == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iOrdinal == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (w(d0Var, 128L)) {
            yq60.d0 d0Var4 = gVar.a;
            Paint paint2 = gVar.e;
            d0Var4.w = d0Var.w;
            int iOrdinal2 = d0Var.w.ordinal();
            if (iOrdinal2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iOrdinal2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iOrdinal2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (w(d0Var, 256L)) {
            gVar.a.y = d0Var.y;
            gVar.e.setStrokeMiter(d0Var.y.floatValue());
        }
        if (w(d0Var, 512L)) {
            gVar.a.z = d0Var.z;
        }
        if (w(d0Var, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            gVar.a.A = d0Var.A;
        }
        Typeface typefaceH = null;
        if (w(d0Var, 1536L)) {
            yq60.d0 d0Var5 = gVar.a;
            Paint paint3 = gVar.e;
            yq60.o[] oVarArr = d0Var5.z;
            if (oVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = oVarArr.length;
                int i2 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i2];
                float f2 = 0.0f;
                for (int i3 = 0; i3 < i2; i3++) {
                    float fB = d0Var5.z[i3 % length].b(this);
                    fArr[i3] = fB;
                    f2 += fB;
                }
                if (f2 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = d0Var5.A.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f2) + f2;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (w(d0Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float textSize = this.c.d.getTextSize();
            gVar.a.E = d0Var.E;
            gVar.d.setTextSize(d0Var.E.c(this, textSize));
            gVar.e.setTextSize(d0Var.E.c(this, textSize));
        }
        if (w(d0Var, 8192L)) {
            gVar.a.D = d0Var.D;
        }
        if (w(d0Var, 32768L)) {
            if (d0Var.F.intValue() == -1 && gVar.a.F.intValue() > 100) {
                yq60.d0 d0Var6 = gVar.a;
                d0Var6.F = Integer.valueOf(d0Var6.F.intValue() - 100);
            } else if (d0Var.F.intValue() != 1 || gVar.a.F.intValue() >= 900) {
                gVar.a.F = d0Var.F;
            } else {
                yq60.d0 d0Var7 = gVar.a;
                d0Var7.F = Integer.valueOf(d0Var7.F.intValue() + 100);
            }
        }
        if (w(d0Var, 65536L)) {
            gVar.a.G = d0Var.G;
        }
        if (w(d0Var, 106496L)) {
            yq60.d0 d0Var8 = gVar.a;
            ArrayList arrayList = d0Var8.D;
            if (arrayList != null && this.b != null) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    typefaceH = h((String) obj, d0Var8.F, d0Var8.G);
                    if (typefaceH != null) {
                        break;
                    }
                }
            }
            if (typefaceH == null) {
                typefaceH = h("serif", d0Var8.F, d0Var8.G);
            }
            gVar.d.setTypeface(typefaceH);
            gVar.e.setTypeface(typefaceH);
        }
        if (w(d0Var, 131072L)) {
            yq60.d0 d0Var9 = gVar.a;
            Paint paint4 = gVar.e;
            Paint paint5 = gVar.d;
            d0Var9.H = d0Var.H;
            yq60.d0.g gVar2 = d0Var.H;
            yq60.d0.g gVar3 = yq60.d0.g.d;
            paint5.setStrikeThruText(gVar2 == gVar3);
            yq60.d0.g gVar4 = d0Var.H;
            yq60.d0.g gVar5 = yq60.d0.g.b;
            paint5.setUnderlineText(gVar4 == gVar5);
            paint4.setStrikeThruText(d0Var.H == gVar3);
            paint4.setUnderlineText(d0Var.H == gVar5);
        }
        if (w(d0Var, 68719476736L)) {
            gVar.a.I = d0Var.I;
        }
        if (w(d0Var, 262144L)) {
            gVar.a.J = d0Var.J;
        }
        if (w(d0Var, 524288L)) {
            gVar.a.K = d0Var.K;
        }
        if (w(d0Var, 2097152L)) {
            gVar.a.M = d0Var.M;
        }
        if (w(d0Var, 4194304L)) {
            gVar.a.N = d0Var.N;
        }
        if (w(d0Var, 8388608L)) {
            gVar.a.O = d0Var.O;
        }
        if (w(d0Var, 16777216L)) {
            gVar.a.P = d0Var.P;
        }
        if (w(d0Var, 33554432L)) {
            gVar.a.Q = d0Var.Q;
        }
        if (w(d0Var, 1048576L)) {
            gVar.a.L = d0Var.L;
        }
        if (w(d0Var, 268435456L)) {
            gVar.a.T = d0Var.T;
        }
        if (w(d0Var, 536870912L)) {
            gVar.a.U = d0Var.U;
        }
        if (w(d0Var, 1073741824L)) {
            gVar.a.V = d0Var.V;
        }
        if (w(d0Var, 67108864L)) {
            gVar.a.R = d0Var.R;
        }
        if (w(d0Var, 134217728L)) {
            gVar.a.S = d0Var.S;
        }
        if (w(d0Var, 8589934592L)) {
            gVar.a.Y = d0Var.Y;
        }
        if (w(d0Var, 17179869184L)) {
            gVar.a.Z = d0Var.Z;
        }
        if (w(d0Var, 137438953472L)) {
            gVar.a.b0 = d0Var.b0;
        }
    }

    public final void T(g gVar, yq60.k0 k0Var) {
        int i2 = 0;
        boolean z = k0Var.b == null;
        yq60.d0 d0Var = gVar.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        d0Var.P = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        d0Var.K = bool;
        d0Var.L = null;
        d0Var.T = null;
        d0Var.B = fValueOf;
        d0Var.R = yq60.e.b;
        d0Var.S = fValueOf;
        d0Var.V = null;
        d0Var.W = null;
        d0Var.X = fValueOf;
        d0Var.Y = null;
        d0Var.Z = fValueOf;
        d0Var.a0 = yq60.d0.i.a;
        yq60.d0 d0Var2 = k0Var.e;
        if (d0Var2 != null) {
            S(gVar, d0Var2);
        }
        ArrayList arrayList = this.b.b.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.b.b.a;
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                yq5.o oVar = (yq5.o) obj;
                if (yq5.g(oVar.a, k0Var)) {
                    S(gVar, oVar.b);
                }
            }
        }
        yq60.d0 d0Var3 = k0Var.f;
        if (d0Var3 != null) {
            S(gVar, d0Var3);
        }
    }

    public final void U() {
        int i2;
        yq60.d0 d0Var = this.c.a;
        yq60.n0 n0Var = d0Var.Y;
        if (n0Var instanceof yq60.e) {
            i2 = ((yq60.e) n0Var).a;
        } else if (!(n0Var instanceof yq60.f)) {
            return;
        } else {
            i2 = d0Var.C.a;
        }
        Float f2 = d0Var.Z;
        if (f2 != null) {
            i2 = i(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    public final boolean V() {
        Boolean bool = this.c.a.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path b(yq60.j0 j0Var, yq60.a aVar) {
        Path pathC;
        yq60.k0 k0VarD = j0Var.a.d(this.c.a.T);
        if (k0VarD == null) {
            o("ClipPath reference '%s' not found", this.c.a.T);
            return null;
        }
        yq60.d dVar = (yq60.d) k0VarD;
        this.d.push(this.c);
        this.c = t(dVar);
        Boolean bool = dVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.a, aVar.b);
            matrix.preScale(aVar.c, aVar.d);
        }
        Matrix matrix2 = dVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (yq60.m0 m0Var : dVar.i) {
            if ((m0Var instanceof yq60.j0) && (pathC = C((yq60.j0) m0Var, true)) != null) {
                path.op(pathC, Path.Op.UNION);
            }
        }
        if (this.c.a.T != null) {
            yq60.a aVarC = dVar.h;
            if (aVarC == null) {
                aVarC = c(path);
                dVar.h = aVarC;
            }
            Path pathB = b(dVar, aVarC);
            if (pathB != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = this.d.pop();
        return path;
    }

    public final float d(yq60.x0 x0Var) {
        j jVar = new j();
        n(x0Var, jVar);
        return jVar.a;
    }

    public final void f(yq60.j0 j0Var, yq60.a aVar) {
        Path pathB;
        if (this.c.a.T == null || (pathB = b(j0Var, aVar)) == null) {
            return;
        }
        this.a.clipPath(pathB);
    }

    public final void g(yq60.j0 j0Var) {
        yq60.n0 n0Var = this.c.a.b;
        if (n0Var instanceof yq60.t) {
            j(true, j0Var.h, (yq60.t) n0Var);
        }
        yq60.n0 n0Var2 = this.c.a.e;
        if (n0Var2 instanceof yq60.t) {
            j(false, j0Var.h, (yq60.t) n0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[PHI: r11 r12 r15 r17
      0x0099: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00c9, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00c9, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r15v15 float) = (r15v13 float), (r15v29 float) binds: [B:67:0x00c9, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00c9, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z, yq60.a aVar, yq60.t tVar) {
        float fC;
        float f2;
        float fC2;
        float f3;
        float fC3;
        float fC4;
        float fC5;
        float fC6;
        yq60.k0 k0VarD = this.b.d(tVar.a);
        int i2 = 0;
        int i3 = 0;
        if (k0VarD == null) {
            o("%s reference '%s' not found", z ? "Fill" : "Stroke", tVar.a);
            yq60.n0 n0Var = tVar.b;
            g gVar = this.c;
            if (n0Var != null) {
                N(gVar, z, n0Var);
                return;
            } else if (z) {
                gVar.b = false;
                return;
            } else {
                gVar.c = false;
                return;
            }
        }
        boolean z2 = k0VarD instanceof yq60.l0;
        yq60.j jVar = yq60.j.b;
        yq60.j jVar2 = yq60.j.a;
        yq60.e eVar = yq60.e.b;
        if (z2) {
            yq60.l0 l0Var = (yq60.l0) k0VarD;
            String str = l0Var.l;
            if (str != null) {
                q(l0Var, str);
            }
            Boolean bool = l0Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            g gVar2 = this.c;
            Paint paint = z ? gVar2.d : gVar2.e;
            if (objArr == true) {
                yq60.a aVar2 = gVar2.g;
                if (aVar2 == null) {
                    aVar2 = gVar2.f;
                }
                yq60.o oVar = l0Var.m;
                fC3 = oVar != null ? oVar.d(this) : 0.0f;
                yq60.o oVar2 = l0Var.n;
                fC4 = oVar2 != null ? oVar2.e(this) : 0.0f;
                f3 = 0.0f;
                yq60.o oVar3 = l0Var.o;
                fC5 = oVar3 != null ? oVar3.d(this) : aVar2.c;
                yq60.o oVar4 = l0Var.p;
                if (oVar4 != null) {
                    fC6 = oVar4.e(this);
                } else {
                    fC6 = f3;
                }
            } else {
                f3 = 0.0f;
                yq60.o oVar5 = l0Var.m;
                fC3 = oVar5 != null ? oVar5.c(this, 1.0f) : 0.0f;
                yq60.o oVar6 = l0Var.n;
                fC4 = oVar6 != null ? oVar6.c(this, 1.0f) : 0.0f;
                yq60.o oVar7 = l0Var.o;
                fC5 = oVar7 != null ? oVar7.c(this, 1.0f) : 1.0f;
                yq60.o oVar8 = l0Var.p;
                if (oVar8 != null) {
                    fC6 = oVar8.c(this, 1.0f);
                } else {
                    fC6 = f3;
                }
            }
            float f4 = fC4;
            float f5 = fC5;
            float f6 = fC6;
            float f7 = fC3;
            P();
            this.c = t(l0Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(aVar.a, aVar.b);
                matrix.preScale(aVar.c, aVar.d);
            }
            Matrix matrix2 = l0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = l0Var.h.size();
            if (size == 0) {
                O();
                g gVar3 = this.c;
                if (z) {
                    gVar3.b = false;
                    return;
                } else {
                    gVar3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<yq60.m0> it = l0Var.h.iterator();
            int i4 = 0;
            float f8 = -1.0f;
            while (it.hasNext()) {
                yq60.c0 c0Var = (yq60.c0) it.next();
                Float f9 = c0Var.h;
                float fFloatValue = f9 != null ? f9.floatValue() : f3;
                if (i4 == 0 || fFloatValue >= f8) {
                    fArr[i4] = fFloatValue;
                    f8 = fFloatValue;
                } else {
                    fArr[i4] = f8;
                }
                P();
                T(this.c, c0Var);
                yq60.d0 d0Var = this.c.a;
                yq60.e eVar2 = (yq60.e) d0Var.R;
                if (eVar2 == null) {
                    eVar2 = eVar;
                }
                iArr[i4] = i(eVar2.a, d0Var.S.floatValue());
                i4++;
                O();
            }
            if ((f7 == f5 && f4 == f6) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            yq60.j jVar3 = l0Var.k;
            if (jVar3 != null) {
                if (jVar3 == jVar2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (jVar3 == jVar) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f7, f4, f5, f6, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.c.a.d.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i2 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i2);
            return;
        }
        if (!(k0VarD instanceof yq60.p0)) {
            if (k0VarD instanceof yq60.b0) {
                yq60.b0 b0Var = (yq60.b0) k0VarD;
                yq60.d0 d0Var2 = b0Var.e;
                if (z) {
                    if (w(d0Var2, 2147483648L)) {
                        g gVar4 = this.c;
                        yq60.d0 d0Var3 = gVar4.a;
                        yq60.n0 n0Var2 = b0Var.e.W;
                        d0Var3.b = n0Var2;
                        gVar4.b = n0Var2 != null;
                    }
                    if (w(b0Var.e, 4294967296L)) {
                        this.c.a.d = b0Var.e.X;
                    }
                    if (w(b0Var.e, 6442450944L)) {
                        g gVar5 = this.c;
                        N(gVar5, z, gVar5.a.b);
                        return;
                    }
                    return;
                }
                if (w(d0Var2, 2147483648L)) {
                    g gVar6 = this.c;
                    yq60.d0 d0Var4 = gVar6.a;
                    yq60.n0 n0Var3 = b0Var.e.W;
                    d0Var4.e = n0Var3;
                    gVar6.c = n0Var3 != null;
                }
                if (w(b0Var.e, 4294967296L)) {
                    this.c.a.f = b0Var.e.X;
                }
                if (w(b0Var.e, 6442450944L)) {
                    g gVar7 = this.c;
                    N(gVar7, z, gVar7.a.e);
                    return;
                }
                return;
            }
            return;
        }
        yq60.p0 p0Var = (yq60.p0) k0VarD;
        String str2 = p0Var.l;
        if (str2 != null) {
            q(p0Var, str2);
        }
        Boolean bool2 = p0Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        g gVar8 = this.c;
        Paint paint2 = z ? gVar8.d : gVar8.e;
        if (objArr2 == true) {
            yq60.o oVar9 = new yq60.o(50.0f, yq60.c1.e);
            yq60.o oVar10 = p0Var.m;
            float fD = oVar10 != null ? oVar10.d(this) : oVar9.d(this);
            yq60.o oVar11 = p0Var.n;
            fC = oVar11 != null ? oVar11.e(this) : oVar9.e(this);
            yq60.o oVar12 = p0Var.o;
            fC2 = oVar12 != null ? oVar12.b(this) : oVar9.b(this);
            f2 = fD;
        } else {
            yq60.o oVar13 = p0Var.m;
            float fC7 = oVar13 != null ? oVar13.c(this, 1.0f) : 0.5f;
            yq60.o oVar14 = p0Var.n;
            fC = oVar14 != null ? oVar14.c(this, 1.0f) : 0.5f;
            yq60.o oVar15 = p0Var.o;
            f2 = fC7;
            fC2 = oVar15 != null ? oVar15.c(this, 1.0f) : 0.5f;
        }
        float f10 = fC;
        P();
        this.c = t(p0Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(aVar.a, aVar.b);
            matrix3.preScale(aVar.c, aVar.d);
        }
        Matrix matrix4 = p0Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = p0Var.h.size();
        if (size2 == 0) {
            O();
            g gVar9 = this.c;
            if (z) {
                gVar9.b = false;
                return;
            } else {
                gVar9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator<yq60.m0> it2 = p0Var.h.iterator();
        int i5 = 0;
        float f11 = -1.0f;
        while (it2.hasNext()) {
            yq60.c0 c0Var2 = (yq60.c0) it2.next();
            Float f12 = c0Var2.h;
            float fFloatValue2 = f12 != null ? f12.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f11) {
                fArr2[i5] = fFloatValue2;
                f11 = fFloatValue2;
            } else {
                fArr2[i5] = f11;
            }
            P();
            T(this.c, c0Var2);
            yq60.d0 d0Var5 = this.c.a;
            yq60.e eVar3 = (yq60.e) d0Var5.R;
            if (eVar3 == null) {
                eVar3 = eVar;
            }
            iArr2[i5] = i(eVar3.a, d0Var5.S.floatValue());
            i5++;
            O();
        }
        if (fC2 == 0.0f || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        yq60.j jVar4 = p0Var.k;
        if (jVar4 != null) {
            if (jVar4 == jVar2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (jVar4 == jVar) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f2, f10, fC2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.c.a.d.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i3 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i3);
    }

    public final boolean k() {
        Boolean bool = this.c.a.P;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    public final void l(yq60.j0 j0Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        yq60.n0 n0Var = this.c.a.b;
        boolean z3 = n0Var instanceof yq60.t;
        Canvas canvas = this.a;
        if (z3) {
            yq60.k0 k0VarD = this.b.d(((yq60.t) n0Var).a);
            if (k0VarD instanceof yq60.x) {
                yq60.x xVar = (yq60.x) k0VarD;
                Boolean bool = xVar.p;
                boolean z4 = bool != null && bool.booleanValue();
                String str = xVar.w;
                if (str != null) {
                    s(xVar, str);
                }
                yq60.o oVar = xVar.s;
                if (z4) {
                    fD = oVar != null ? oVar.d(this) : 0.0f;
                    yq60.o oVar2 = xVar.t;
                    fE2 = oVar2 != null ? oVar2.e(this) : 0.0f;
                    yq60.o oVar3 = xVar.u;
                    fD2 = oVar3 != null ? oVar3.d(this) : 0.0f;
                    yq60.o oVar4 = xVar.v;
                    fE = oVar4 != null ? oVar4.e(this) : 0.0f;
                } else {
                    float fC = oVar != null ? oVar.c(this, 1.0f) : 0.0f;
                    yq60.o oVar5 = xVar.t;
                    float fC2 = oVar5 != null ? oVar5.c(this, 1.0f) : 0.0f;
                    yq60.o oVar6 = xVar.u;
                    float fC3 = oVar6 != null ? oVar6.c(this, 1.0f) : 0.0f;
                    yq60.o oVar7 = xVar.v;
                    float fC4 = oVar7 != null ? oVar7.c(this, 1.0f) : 0.0f;
                    yq60.a aVar = j0Var.h;
                    float f2 = aVar.a;
                    float f3 = aVar.c;
                    float f4 = (fC * f3) + f2;
                    float f5 = aVar.b;
                    float f6 = aVar.d;
                    float f7 = fC3 * f3;
                    fE = fC4 * f6;
                    fD = f4;
                    fE2 = (fC2 * f6) + f5;
                    fD2 = f7;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                hp20 hp20Var = xVar.n;
                if (hp20Var == null) {
                    hp20Var = hp20.d;
                }
                P();
                canvas.clipPath(path);
                g gVar = new g();
                S(gVar, yq60.d0.a());
                gVar.a.K = Boolean.FALSE;
                u(xVar, gVar);
                this.c = gVar;
                yq60.a aVar2 = j0Var.h;
                Matrix matrix = xVar.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (xVar.r.invert(matrix2)) {
                        yq60.a aVar3 = j0Var.h;
                        float f8 = aVar3.a;
                        float f9 = aVar3.b;
                        float fA = aVar3.a();
                        z = true;
                        yq60.a aVar4 = j0Var.h;
                        z2 = false;
                        float f10 = aVar4.b;
                        float fA2 = aVar4.a();
                        float fB = j0Var.h.b();
                        yq60.a aVar5 = j0Var.h;
                        float[] fArr = {f8, f9, fA, f10, fA2, fB, aVar5.a, aVar5.b()};
                        matrix2.mapPoints(fArr);
                        float f11 = fArr[0];
                        float f12 = fArr[1];
                        RectF rectF = new RectF(f11, f12, f11, f12);
                        for (int i2 = 2; i2 <= 6; i2 += 2) {
                            float f13 = fArr[i2];
                            if (f13 < rectF.left) {
                                rectF.left = f13;
                            }
                            if (f13 > rectF.right) {
                                rectF.right = f13;
                            }
                            float f14 = fArr[i2 + 1];
                            if (f14 < rectF.top) {
                                rectF.top = f14;
                            }
                            if (f14 > rectF.bottom) {
                                rectF.bottom = f14;
                            }
                        }
                        float f15 = rectF.left;
                        float f16 = rectF.top;
                        aVar2 = new yq60.a(f15, f16, rectF.right - f15, rectF.bottom - f16);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((aVar2.a - fD) / fD2)) * fD2) + fD;
                float fA3 = aVar2.a();
                float fB2 = aVar2.b();
                yq60.a aVar6 = new yq60.a(0.0f, 0.0f, fD2, fE);
                boolean zE = E();
                for (float fFloor2 = (((float) Math.floor((aVar2.b - fE2) / fE)) * fE) + fE2; fFloor2 < fB2; fFloor2 += fE) {
                    float f17 = fFloor;
                    while (f17 < fA3) {
                        aVar6.a = f17;
                        aVar6.b = fFloor2;
                        P();
                        if (!this.c.a.K.booleanValue()) {
                            M(aVar6.a, aVar6.b, aVar6.c, aVar6.d);
                        }
                        yq60.a aVar7 = xVar.o;
                        if (aVar7 != null) {
                            canvas.concat(e(aVar6, aVar7, hp20Var));
                        } else {
                            Boolean bool2 = xVar.q;
                            boolean z5 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f17, fFloor2);
                            if (!z5) {
                                yq60.a aVar8 = j0Var.h;
                                canvas.scale(aVar8.c, aVar8.d);
                            }
                        }
                        Iterator<yq60.m0> it = xVar.i.iterator();
                        while (it.hasNext()) {
                            G(it.next());
                        }
                        O();
                        f17 += fD2;
                        fB2 = fB2;
                        fFloor = fFloor;
                    }
                }
                if (zE) {
                    D(xVar.h);
                }
                O();
                return;
            }
        }
        canvas.drawPath(path, this.c.d);
    }

    public final void m(Path path) {
        g gVar = this.c;
        yq60.d0.i iVar = gVar.a.a0;
        yq60.d0.i iVar2 = yq60.d0.i.b;
        Canvas canvas = this.a;
        if (iVar != iVar2) {
            canvas.drawPath(path, gVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.c.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.c.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(yq60.x0 x0Var, i iVar) {
        float f2;
        float fE;
        float fD;
        yq60.d0.f fVarV;
        if (k()) {
            Iterator<yq60.m0> it = x0Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                yq60.m0 next = it.next();
                if (next instanceof yq60.b1) {
                    iVar.b(Q(((yq60.b1) next).c, z, !it.hasNext()));
                } else if (iVar.a((yq60.x0) next)) {
                    boolean z2 = next instanceof yq60.y0;
                    yq60.d0.f fVar = yq60.d0.f.b;
                    yq60.d0.f fVar2 = yq60.d0.f.a;
                    float fE2 = 0.0f;
                    if (z2) {
                        P();
                        yq60.y0 y0Var = (yq60.y0) next;
                        T(this.c, y0Var);
                        if (k() && V()) {
                            yq60.k0 k0VarD = y0Var.a.d(y0Var.n);
                            if (k0VarD == null) {
                                o("TextPath reference '%s' not found", y0Var.n);
                            } else {
                                yq60.u uVar = (yq60.u) k0VarD;
                                c cVar = new c(uVar.o);
                                Matrix matrix = uVar.n;
                                Path path = cVar.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                yq60.o oVar = y0Var.o;
                                fE2 = oVar != null ? oVar.c(this, pathMeasure.getLength()) : 0.0f;
                                yq60.d0.f fVarV2 = v();
                                if (fVarV2 != fVar2) {
                                    float fD2 = d(y0Var);
                                    if (fVarV2 == fVar) {
                                        fD2 /= 2.0f;
                                    }
                                    fE2 -= fD2;
                                }
                                g((yq60.j0) y0Var.p);
                                boolean zE = E();
                                n(y0Var, new d(path, fE2));
                                if (zE) {
                                    D(y0Var.h);
                                }
                            }
                        }
                        O();
                    } else if (next instanceof yq60.u0) {
                        P();
                        yq60.u0 u0Var = (yq60.u0) next;
                        T(this.c, u0Var);
                        if (k()) {
                            ArrayList arrayList = u0Var.n;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = iVar instanceof e;
                            if (z4) {
                                float fD3 = !z3 ? ((e) iVar).a : ((yq60.o) u0Var.n.get(0)).d(this);
                                ArrayList arrayList2 = u0Var.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((e) iVar).b : ((yq60.o) u0Var.o.get(0)).e(this);
                                ArrayList arrayList3 = u0Var.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((yq60.o) u0Var.p.get(0)).d(this);
                                ArrayList arrayList4 = u0Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((yq60.o) u0Var.q.get(0)).e(this);
                                }
                                float f3 = fD3;
                                f2 = fE2;
                                fE2 = f3;
                            } else {
                                f2 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z3 && (fVarV = v()) != fVar2) {
                                float fD4 = d(u0Var);
                                if (fVarV == fVar) {
                                    fD4 /= 2.0f;
                                }
                                fE2 -= fD4;
                            }
                            g((yq60.j0) u0Var.r);
                            if (z4) {
                                e eVar = (e) iVar;
                                eVar.a = fE2 + fD;
                                eVar.b = fE + f2;
                            }
                            boolean zE2 = E();
                            n(u0Var, iVar);
                            if (zE2) {
                                D(u0Var.h);
                            }
                        }
                        O();
                    } else if (next instanceof yq60.t0) {
                        P();
                        yq60.t0 t0Var = (yq60.t0) next;
                        T(this.c, t0Var);
                        if (k()) {
                            g((yq60.j0) t0Var.o);
                            yq60.k0 k0VarD2 = next.a.d(t0Var.n);
                            if (k0VarD2 == null || !(k0VarD2 instanceof yq60.x0)) {
                                o("Tref reference '%s' not found", t0Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((yq60.x0) k0VarD2, sb);
                                if (sb.length() > 0) {
                                    iVar.b(sb.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z = false;
            }
        }
    }

    public final void p(yq60.x0 x0Var, StringBuilder sb) {
        Iterator<yq60.m0> it = x0Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            yq60.m0 next = it.next();
            if (next instanceof yq60.x0) {
                p((yq60.x0) next, sb);
            } else if (next instanceof yq60.b1) {
                sb.append(Q(((yq60.b1) next).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final g t(yq60.m0 m0Var) {
        g gVar = new g();
        S(gVar, yq60.d0.a());
        u(m0Var, gVar);
        return gVar;
    }

    public final void u(yq60.m0 m0Var, g gVar) {
        int i2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i2 = 0;
            if (m0Var instanceof yq60.k0) {
                arrayList.add(0, (yq60.k0) m0Var);
            }
            Object obj = m0Var.b;
            if (obj == null) {
                break;
            } else {
                m0Var = (yq60.m0) obj;
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            T(gVar, (yq60.k0) obj2);
        }
        g gVar2 = this.c;
        gVar.g = gVar2.g;
        gVar.f = gVar2.f;
    }

    public final yq60.d0.f v() {
        yq60.d0.f fVar;
        yq60.d0 d0Var = this.c.a;
        if (d0Var.I == yq60.d0.h.a || (fVar = d0Var.J) == yq60.d0.f.b) {
            return d0Var.J;
        }
        yq60.d0.f fVar2 = yq60.d0.f.a;
        return fVar == fVar2 ? yq60.d0.f.c : fVar2;
    }

    public final Path x(yq60.c cVar) {
        yq60.o oVar = cVar.o;
        float fD = oVar != null ? oVar.d(this) : 0.0f;
        yq60.o oVar2 = cVar.p;
        float fE = oVar2 != null ? oVar2.e(this) : 0.0f;
        float fB = cVar.q.b(this);
        float f2 = fD - fB;
        float f3 = fE - fB;
        float f4 = fD + fB;
        float f5 = fE + fB;
        if (cVar.h == null) {
            float f6 = 2.0f * fB;
            cVar.h = new yq60.a(f2, f3, f6, f6);
        }
        float f7 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f3);
        float f8 = fD + f7;
        float f9 = fE - f7;
        path.cubicTo(f8, f3, f4, f9, f4, fE);
        float f10 = fE + f7;
        path.cubicTo(f4, f10, f8, f5, fD, f5);
        float f11 = fD - f7;
        path.cubicTo(f11, f5, f2, f10, f2, fE);
        path.cubicTo(f2, f9, f11, f3, fD, f3);
        path.close();
        return path;
    }

    public final Path y(yq60.h hVar) {
        yq60.o oVar = hVar.o;
        float fD = oVar != null ? oVar.d(this) : 0.0f;
        yq60.o oVar2 = hVar.p;
        float fE = oVar2 != null ? oVar2.e(this) : 0.0f;
        float fD2 = hVar.q.d(this);
        float fE2 = hVar.r.e(this);
        float f2 = fD - fD2;
        float f3 = fE - fE2;
        float f4 = fD + fD2;
        float f5 = fE + fE2;
        if (hVar.h == null) {
            hVar.h = new yq60.a(f2, f3, fD2 * 2.0f, 2.0f * fE2);
        }
        float f6 = fD2 * 0.5522848f;
        float f7 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f3);
        float f8 = fD + f6;
        float f9 = fE - f7;
        path.cubicTo(f8, f3, f4, f9, f4, fE);
        float f10 = fE + f7;
        path.cubicTo(f4, f10, f8, f5, fD, f5);
        float f11 = fD - f6;
        path.cubicTo(f11, f5, f2, f10, f2, fE);
        path.cubicTo(f2, f9, f11, f3, fD, f3);
        path.close();
        return path;
    }

    public static void q(yq60.i iVar, String str) {
        yq60.k0 k0VarD = iVar.a.d(str);
        if (k0VarD == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(k0VarD instanceof yq60.i)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (k0VarD == iVar) {
            o(tYcQsJyaojE.rlfZz, str);
            return;
        }
        yq60.i iVar2 = (yq60.i) k0VarD;
        if (iVar.i == null) {
            iVar.i = iVar2.i;
        }
        if (iVar.j == null) {
            iVar.j = iVar2.j;
        }
        if (iVar.k == null) {
            iVar.k = iVar2.k;
        }
        if (iVar.h.isEmpty()) {
            iVar.h = iVar2.h;
        }
        try {
            if (iVar instanceof yq60.l0) {
                yq60.l0 l0Var = (yq60.l0) iVar;
                yq60.l0 l0Var2 = (yq60.l0) k0VarD;
                if (l0Var.m == null) {
                    l0Var.m = l0Var2.m;
                }
                if (l0Var.n == null) {
                    l0Var.n = l0Var2.n;
                }
                if (l0Var.o == null) {
                    l0Var.o = l0Var2.o;
                }
                if (l0Var.p == null) {
                    l0Var.p = l0Var2.p;
                }
            } else {
                r((yq60.p0) iVar, (yq60.p0) k0VarD);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = iVar2.l;
        if (str2 != null) {
            q(iVar, str2);
        }
    }

    public class g {
        public final yq60.d0 a;
        public boolean b;
        public boolean c;
        public final Paint d;
        public final Paint e;
        public yq60.a f;
        public yq60.a g;
        public boolean h;

        public g(g gVar) {
            this.b = gVar.b;
            this.c = gVar.c;
            this.d = new Paint(gVar.d);
            this.e = new Paint(gVar.e);
            yq60.a aVar = gVar.f;
            if (aVar != null) {
                this.f = new yq60.a(aVar);
            }
            yq60.a aVar2 = gVar.g;
            if (aVar2 != null) {
                this.g = new yq60.a(aVar2);
            }
            this.h = gVar.h;
            try {
                this.a = (yq60.d0) gVar.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = yq60.d0.a();
            }
        }

        public g() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.a = yq60.d0.a();
        }
    }
}
