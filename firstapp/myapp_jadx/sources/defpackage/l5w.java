package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l5w implements Comparable<l5w> {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap<String, a> d = new LinkedHashMap<>();
    public float e = 1.0f;
    public float f = 0.0f;
    public float i = 0.0f;
    public float v = 0.0f;
    public float w = 1.0f;
    public float y = 1.0f;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = 0.0f;
    public float C = 0.0f;
    public float D = 0.0f;
    public float E = Float.NaN;
    public float F = Float.NaN;

    public static boolean c(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap<String, q9i0> map, int i) {
        for (String str : map.keySet()) {
            q9i0 q9i0Var = map.get(str);
            if (q9i0Var != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        q9i0Var.b(i, Float.isNaN(this.v) ? 0.0f : this.v);
                        break;
                    case 1:
                        q9i0Var.b(i, Float.isNaN(this.a) ? 0.0f : this.a);
                        break;
                    case 2:
                        q9i0Var.b(i, Float.isNaN(this.B) ? 0.0f : this.B);
                        break;
                    case 3:
                        q9i0Var.b(i, Float.isNaN(this.C) ? 0.0f : this.C);
                        break;
                    case 4:
                        q9i0Var.b(i, Float.isNaN(this.D) ? 0.0f : this.D);
                        break;
                    case 5:
                        q9i0Var.b(i, Float.isNaN(this.F) ? 0.0f : this.F);
                        break;
                    case 6:
                        q9i0Var.b(i, Float.isNaN(this.w) ? 1.0f : this.w);
                        break;
                    case 7:
                        q9i0Var.b(i, Float.isNaN(this.y) ? 1.0f : this.y);
                        break;
                    case 8:
                        q9i0Var.b(i, Float.isNaN(this.z) ? 0.0f : this.z);
                        break;
                    case 9:
                        q9i0Var.b(i, Float.isNaN(this.A) ? 0.0f : this.A);
                        break;
                    case 10:
                        q9i0Var.b(i, Float.isNaN(this.i) ? 0.0f : this.i);
                        break;
                    case 11:
                        q9i0Var.b(i, Float.isNaN(this.f) ? 0.0f : this.f);
                        break;
                    case 12:
                        q9i0Var.b(i, Float.isNaN(this.E) ? 0.0f : this.E);
                        break;
                    case 13:
                        q9i0Var.b(i, Float.isNaN(this.e) ? 1.0f : this.e);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap<String, a> linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                a aVar = linkedHashMap.get(str2);
                                if (q9i0Var instanceof q9i0.b) {
                                    ((q9i0.b) q9i0Var).f.append(i, aVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + aVar.a() + q9i0Var);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    public final void b(View view) {
        this.c = view.getVisibility();
        this.e = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f = view.getElevation();
        this.i = view.getRotation();
        this.v = view.getRotationX();
        this.a = view.getRotationY();
        this.w = view.getScaleX();
        this.y = view.getScaleY();
        this.z = view.getPivotX();
        this.A = view.getPivotY();
        this.B = view.getTranslationX();
        this.C = view.getTranslationY();
        this.D = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(l5w l5wVar) {
        l5wVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, b bVar, int i, int i2) {
        rect.width();
        rect.height();
        b.a aVarO = bVar.o(i2);
        b.d dVar = aVarO.c;
        b.c cVar = aVarO.d;
        int i3 = dVar.c;
        this.b = i3;
        int i4 = dVar.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? dVar.d : 0.0f;
        b.e eVar = aVarO.f;
        boolean z = eVar.m;
        this.f = eVar.n;
        this.i = eVar.b;
        this.v = eVar.c;
        this.a = eVar.d;
        this.w = eVar.e;
        this.y = eVar.f;
        this.z = eVar.g;
        this.A = eVar.h;
        this.B = eVar.j;
        this.C = eVar.k;
        this.D = eVar.l;
        skf.c(cVar.d);
        this.E = cVar.h;
        this.F = aVarO.c.e;
        for (String str : aVarO.g.keySet()) {
            a aVar = aVarO.g.get(str);
            int iOrdinal = aVar.c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.d.put(str, aVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.i + 90.0f;
            this.i = f;
            if (f > 180.0f) {
                this.i = f - 360.0f;
                return;
            }
            return;
        }
        this.i -= 90.0f;
    }
}
