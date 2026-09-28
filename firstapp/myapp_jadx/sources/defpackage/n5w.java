package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n5w {
    public enp[] A;
    public final View b;
    public final int c;
    public r5c[] j;
    public aw0 k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap<String, y9i0> x;
    public HashMap<String, q9i0> y;
    public HashMap<String, z8i0> z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final u5w f = new u5w();
    public final u5w g = new u5w();
    public final l5w h = new l5w();
    public final l5w i = new l5w();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList<u5w> u = new ArrayList<>();
    public final float[] v = new float[1];
    public final ArrayList<mlp> w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n5w(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void h(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(mlp mlpVar) {
        this.w.add(mlpVar);
    }

    public final float b(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        skf skfVar = this.f.a;
        ArrayList<u5w> arrayList = this.u;
        int size = arrayList.size();
        float f5 = Float.NaN;
        int i = 0;
        while (i < size) {
            u5w u5wVar = arrayList.get(i);
            i++;
            u5w u5wVar2 = u5wVar;
            skf skfVar2 = u5wVar2.a;
            if (skfVar2 != null) {
                float f6 = u5wVar2.c;
                if (f6 < f) {
                    skfVar = skfVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = u5wVar2.c;
                }
            }
        }
        if (skfVar == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float fA = (((float) skfVar.a(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) skfVar.b(d);
        }
        return fA;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void c(double r24, float[] r26, float[] r27) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5w.c(double, float[], float[]):void");
    }

    public final void d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.v;
        float fB = b(f, fArr2);
        r5c[] r5cVarArr = this.j;
        int i = 0;
        if (r5cVarArr == null) {
            u5w u5wVar = this.g;
            float f4 = u5wVar.e;
            u5w u5wVar2 = this.f;
            float f5 = f4 - u5wVar2.e;
            float f6 = u5wVar.f - u5wVar2.f;
            float f7 = u5wVar.i - u5wVar2.i;
            float f8 = (u5wVar.v - u5wVar2.v) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = fB;
        r5cVarArr[0].f(d, this.q);
        this.j[0].c(d, this.p);
        float f9 = fArr2[0];
        while (true) {
            dArr = this.q;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        aw0 aw0Var = this.k;
        if (aw0Var == null) {
            u5w.e(f2, f3, fArr, this.o, dArr, this.p);
            return;
        }
        double[] dArr2 = this.p;
        if (dArr2.length > 0) {
            aw0Var.c(d, dArr2);
            this.k.f(d, this.q);
            u5w.e(f2, f3, fArr, this.o, this.q, this.p);
        }
    }

    public final float e() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double dA = f;
            u5w u5wVar = this.f;
            skf skfVar = u5wVar.a;
            ArrayList<u5w> arrayList = this.u;
            int size = arrayList.size();
            float f2 = Float.NaN;
            int i2 = 0;
            float f3 = 0.0f;
            while (i2 < size) {
                u5w u5wVar2 = arrayList.get(i2);
                i2++;
                int i3 = size;
                u5w u5wVar3 = u5wVar2;
                u5w u5wVar4 = u5wVar;
                skf skfVar2 = u5wVar3.a;
                if (skfVar2 != null) {
                    float f4 = u5wVar3.c;
                    if (f4 < f) {
                        f3 = f4;
                        skfVar = skfVar2;
                    } else if (Float.isNaN(f2)) {
                        f2 = u5wVar3.c;
                    }
                }
                u5wVar = u5wVar4;
                size = i3;
            }
            u5w u5wVar5 = u5wVar;
            if (skfVar != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                float f5 = f2 - f3;
                dA = (((float) skfVar.a((f - f3) / f5)) * f5) + f3;
            }
            this.j[0].c(dA, this.p);
            u5wVar5.c(dA, this.o, this.p, fArr, 0);
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    public final boolean f(float f, long j, wlp wlpVar, View view) {
        boolean zE;
        View view2;
        boolean z;
        float f2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        View view3 = view;
        y9i0.d dVar = null;
        float fB = b(f, null);
        int i = this.E;
        if (i != -1) {
            float f6 = 1.0f / i;
            float fFloor = ((float) Math.floor(fB / f6)) * f6;
            float f7 = (fB % f6) / f6;
            if (!Float.isNaN(this.F)) {
                f7 = (f7 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fB = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + fFloor;
        }
        HashMap<String, q9i0> map = this.y;
        if (map != null) {
            Iterator<q9i0> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().d(view3, fB);
            }
        }
        HashMap<String, y9i0> map2 = this.x;
        if (map2 != null) {
            y9i0.d dVar2 = null;
            zE = false;
            for (y9i0 y9i0Var : map2.values()) {
                if (y9i0Var instanceof y9i0.d) {
                    dVar2 = (y9i0.d) y9i0Var;
                } else {
                    zE |= y9i0Var.e(fB, j, wlpVar, view3);
                    view3 = view;
                }
            }
            dVar = dVar2;
        } else {
            zE = false;
        }
        r5c[] r5cVarArr = this.j;
        u5w u5wVar = this.f;
        if (r5cVarArr != null) {
            double d = fB;
            r5cVarArr[0].c(d, this.p);
            this.j[0].f(d, this.q);
            aw0 aw0Var = this.k;
            if (aw0Var != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    aw0Var.c(d, dArr);
                    this.k.f(d, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                view2 = view;
                z2 = zE;
                f3 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f3 = 2.0f;
                double[] dArr3 = this.q;
                boolean z4 = this.d;
                float f8 = u5wVar.e;
                float f9 = u5wVar.f;
                float f10 = u5wVar.i;
                int i2 = 1;
                float f11 = u5wVar.v;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (u5wVar.E.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        u5wVar.E = new double[i3];
                        u5wVar.F = new double[i3];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(u5wVar.E, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = u5wVar.E;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    u5wVar.F[i5] = dArr3[i4];
                }
                float f12 = Float.NaN;
                float f13 = f2;
                float f14 = f13;
                float f15 = f14;
                int i6 = 0;
                float f16 = f4;
                float f17 = f15;
                while (true) {
                    double[] dArr5 = u5wVar.E;
                    f5 = f11;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z3 = zE;
                    } else {
                        float f18 = (float) (Double.isNaN(u5wVar.E[i6]) ? 0.0d : u5wVar.E[i6] + 0.0d);
                        z3 = zE;
                        float f19 = (float) u5wVar.F[i6];
                        if (i6 == i2) {
                            f8 = f18;
                            f13 = f19;
                        } else if (i6 == 2) {
                            f9 = f18;
                            f14 = f19;
                        } else if (i6 != 3) {
                            if (i6 == 4) {
                                f11 = f18;
                                f15 = f19;
                            } else if (i6 == 5) {
                                f12 = f18;
                            }
                            i6++;
                            zE = z3;
                            i2 = 1;
                        } else {
                            f16 = f18;
                            f17 = f19;
                        }
                    }
                    f11 = f5;
                    i6++;
                    zE = z3;
                    i2 = 1;
                }
                z2 = zE;
                n5w n5wVar = u5wVar.B;
                if (n5wVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    n5wVar.c(d, fArr, fArr2);
                    float f20 = fArr[0];
                    float f21 = fArr[1];
                    float f22 = fArr2[0];
                    float f23 = fArr2[1];
                    double d2 = f8;
                    double d3 = f9;
                    float fSin = (float) (((Math.sin(d3) * d2) + ((double) f20)) - ((double) (f16 / 2.0f)));
                    float fCos = (float) ((((double) f21) - (Math.cos(d3) * d2)) - ((double) (f5 / 2.0f)));
                    double d4 = f13;
                    double d5 = f14;
                    float fCos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + ((double) f22));
                    float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f23) - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f12)) {
                        view2 = view;
                    } else {
                        double degrees = Math.toDegrees(Math.atan2(fSin2, fCos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + ((double) f12)));
                    }
                    f8 = fSin;
                    f9 = fCos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f12)) {
                        view2.setRotation(f12 + ((float) Math.toDegrees(Math.atan2((f15 / 2.0f) + f14, (f17 / 2.0f) + f13))) + f2);
                    }
                }
                if (view2 instanceof axh) {
                    ((axh) view2).a(f8, f9, f8 + f16, f9 + f5);
                } else {
                    float f24 = f8 + 0.5f;
                    int i7 = (int) f24;
                    float f25 = f9 + 0.5f;
                    int i8 = (int) f25;
                    int i9 = (int) (f24 + f16);
                    int i10 = (int) (f25 + f5);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z4) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view2.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                View viewFindViewById = this.D;
                if (viewFindViewById == null) {
                    viewFindViewById = ((View) view2.getParent()).findViewById(this.C);
                    this.D = viewFindViewById;
                }
                if (viewFindViewById != null) {
                    float bottom = (this.D.getBottom() + viewFindViewById.getTop()) / f3;
                    float right = (this.D.getRight() + this.D.getLeft()) / f3;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left = right - view2.getLeft();
                        float top = bottom - view2.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap<String, q9i0> map3 = this.y;
            if (map3 != null) {
                for (q9i0 q9i0Var : map3.values()) {
                    if (q9i0Var instanceof q9i0.d) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((q9i0.d) q9i0Var).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (dVar != 0) {
                double[] dArr7 = this.q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                y9i0.d dVar3 = dVar;
                view2.setRotation(dVar3.d(fB, j, wlpVar, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z = z2 | dVar3.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                r5c[] r5cVarArr2 = this.j;
                if (i13 >= r5cVarArr2.length) {
                    break;
                }
                r5c r5cVar = r5cVarArr2[i13];
                float[] fArr3 = this.t;
                r5cVar.d(d, fArr3);
                qjc.b(u5wVar.C.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            l5w l5wVar = this.h;
            if (l5wVar.b == 0) {
                if (fB <= f2) {
                    view2.setVisibility(l5wVar.c);
                } else {
                    int i14 = this.i.c;
                    if (fB >= 1065353216) {
                        view2.setVisibility(i14);
                    } else if (i14 != l5wVar.c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    enp[] enpVarArr = this.A;
                    if (i15 >= enpVarArr.length) {
                        break;
                    }
                    enpVarArr[i15].h(view2, fB);
                    i15++;
                }
            }
        } else {
            view2 = view;
            boolean z5 = zE;
            float f26 = u5wVar.e;
            u5w u5wVar2 = this.g;
            float fA = hxa.a(u5wVar2.e, f26, fB, f26);
            float f27 = u5wVar.f;
            float fA2 = hxa.a(u5wVar2.f, f27, fB, f27);
            float f28 = u5wVar.i;
            float f29 = u5wVar2.i;
            float fA3 = hxa.a(f29, f28, fB, f28);
            float f30 = u5wVar.v;
            float f31 = u5wVar2.v;
            float f32 = fA + 0.5f;
            int i16 = (int) f32;
            float f33 = fA2 + 0.5f;
            int i17 = (int) f33;
            int i18 = (int) (f32 + fA3);
            int iA = (int) (f33 + hxa.a(f31, f30, fB, f30));
            int i19 = i18 - i16;
            int i20 = iA - i17;
            if (f29 != f28 || f31 != f30 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.d = false;
            }
            view2.layout(i16, i17, i18, iA);
            z = z5;
        }
        HashMap<String, z8i0> map4 = this.z;
        if (map4 != null) {
            for (z8i0 z8i0Var : map4.values()) {
                if (z8i0Var instanceof z8i0.d) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((z8i0.d) z8i0Var).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    z8i0Var.e(view2, fB);
                }
            }
        }
        return z;
    }

    public final void g(u5w u5wVar) {
        View view = this.b;
        u5wVar.d((int) view.getX(), (int) view.getY(), view.getWidth(), view.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:376:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:446:0x0d43  */
    /* JADX WARN: Code duplicated, block: B:576:0x1189  */
    /* JADX WARN: Code duplicated, block: B:617:0x1244 A[PHI: r12 r14
      0x1244: PHI (r12v15 java.lang.String) = (r12v13 java.lang.String), (r12v14 java.lang.String), (r12v16 java.lang.String) binds: [B:616:0x1242, B:612:0x122b, B:608:0x1214] A[DONT_GENERATE, DONT_INLINE]
      0x1244: PHI (r14v31 java.lang.Object) = (r14v29 java.lang.Object), (r14v30 java.lang.Object), (r14v32 java.lang.Object) binds: [B:616:0x1242, B:612:0x122b, B:608:0x1214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:737:0x134f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x133d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:427:0x0cae. Please report as an issue. */
    public final void i(int i, long j, int i2) {
        u5w u5wVar;
        String str;
        ArrayList<u5w> arrayList;
        String str2;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        Object obj;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList<mlp> arrayList2;
        char c;
        char c2;
        HashSet<String> hashSet3;
        Object obj2;
        Object obj3;
        u5w u5wVar2;
        ArrayList<u5w> arrayList3;
        Object obj4;
        u5w u5wVar3;
        String str8;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        u5w[] u5wVarArr;
        byte b;
        byte b2;
        amp iVar;
        amp bVar;
        amp gVar;
        String str9;
        int i3;
        a aVar;
        HashSet<String> hashSet4;
        HashMap<String, Integer> map;
        Iterator<String> it;
        String str10;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        byte b3;
        byte b4;
        wvf0 iVar2;
        wvf0 gVar2;
        y9i0.b bVar2;
        wvf0 wvf0Var;
        a aVar2;
        Integer num;
        HashSet<String> hashSet5;
        HashSet<String> hashSet6;
        ArrayList<mlp> arrayList4;
        Iterator<String> it2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        HashSet<String> hashSet7;
        Object obj14;
        u5w u5wVar4;
        Object obj15;
        u5w u5wVar5;
        Object obj16;
        ArrayList<u5w> arrayList5;
        Object obj17;
        byte b5;
        byte b6;
        Object obj18;
        aeb0 kVar;
        aeb0 iVar3;
        a aVar3;
        ArrayList<mlp> arrayList6;
        String str16;
        String str17;
        String str18;
        int i4;
        float fMin;
        float fA;
        new HashSet();
        HashSet<String> hashSet8 = new HashSet<>();
        HashSet<String> hashSet9 = new HashSet<>();
        HashSet<String> hashSet10 = new HashSet<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int i5 = this.B;
        u5w u5wVar6 = this.f;
        if (i5 != -1) {
            u5wVar6.y = i5;
        }
        l5w l5wVar = this.h;
        float f = l5wVar.e;
        l5w l5wVar2 = this.i;
        String str19 = "alpha";
        if (l5w.c(f, l5wVar2.e)) {
            hashSet9.add("alpha");
        }
        String str20 = "elevation";
        if (l5w.c(l5wVar.f, l5wVar2.f)) {
            hashSet9.add("elevation");
        }
        int i6 = l5wVar.c;
        int i7 = l5wVar2.c;
        if (i6 != i7 && l5wVar.b == 0 && (i6 == 0 || i7 == 0)) {
            hashSet9.add("alpha");
        }
        String str21 = "rotation";
        if (l5w.c(l5wVar.i, l5wVar2.i)) {
            hashSet9.add("rotation");
        }
        String str22 = "transitionPathRotate";
        if (!Float.isNaN(l5wVar.E) || !Float.isNaN(l5wVar2.E)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(l5wVar.F) || !Float.isNaN(l5wVar2.F)) {
            hashSet9.add("progress");
        }
        if (l5w.c(l5wVar.v, l5wVar2.v)) {
            hashSet9.add("rotationX");
        }
        if (l5w.c(l5wVar.a, l5wVar2.a)) {
            hashSet9.add("rotationY");
        }
        Object obj19 = "rotationX";
        if (l5w.c(l5wVar.z, l5wVar2.z)) {
            hashSet9.add("transformPivotX");
        }
        if (l5w.c(l5wVar.A, l5wVar2.A)) {
            hashSet9.add("transformPivotY");
        }
        if (l5w.c(l5wVar.w, l5wVar2.w)) {
            hashSet9.add("scaleX");
        }
        Object obj20 = "rotationY";
        String str23 = "scaleY";
        if (l5w.c(l5wVar.y, l5wVar2.y)) {
            hashSet9.add("scaleY");
        }
        Object obj21 = "progress";
        if (l5w.c(l5wVar.B, l5wVar2.B)) {
            hashSet9.add("translationX");
        }
        Object obj22 = "translationX";
        if (l5w.c(l5wVar.C, l5wVar2.C)) {
            hashSet9.add("translationY");
        }
        if (l5w.c(l5wVar.D, l5wVar2.D)) {
            hashSet9.add("translationZ");
        }
        ArrayList<mlp> arrayList7 = this.w;
        int size = arrayList7.size();
        Object obj23 = "translationY";
        Object obj24 = "translationZ";
        Object obj25 = "scaleX";
        ArrayList arrayList8 = null;
        int i8 = 0;
        while (true) {
            u5wVar = this.g;
            str = str23;
            arrayList = this.u;
            str2 = str21;
            if (i8 >= size) {
                break;
            }
            mlp mlpVar = arrayList7.get(i8);
            int i9 = i8 + 1;
            mlp mlpVar2 = mlpVar;
            int i10 = size;
            if (mlpVar2 instanceof ump) {
                ump umpVar = (ump) mlpVar2;
                u5w u5wVar7 = new u5w();
                i4 = i9;
                u5wVar7.b = 0;
                u5wVar7.w = Float.NaN;
                u5wVar7.y = -1;
                u5wVar7.z = -1;
                u5wVar7.A = Float.NaN;
                u5wVar7.B = null;
                u5wVar7.C = new LinkedHashMap<>();
                u5wVar7.D = 0;
                str17 = str20;
                u5wVar7.E = new double[18];
                u5wVar7.F = new double[18];
                if (u5wVar6.z != -1) {
                    float f2 = umpVar.a / 100.0f;
                    u5wVar7.c = f2;
                    u5wVar7.b = umpVar.h;
                    u5wVar7.D = umpVar.o;
                    float f3 = Float.isNaN(umpVar.i) ? f2 : umpVar.i;
                    str18 = str22;
                    float f4 = Float.isNaN(umpVar.j) ? f2 : umpVar.j;
                    str16 = str19;
                    float f5 = u5wVar.i;
                    float f6 = u5wVar6.i;
                    float f7 = f5 - f6;
                    float f8 = u5wVar.v;
                    float f9 = u5wVar6.v;
                    u5wVar7.d = u5wVar7.c;
                    u5wVar7.i = (int) ((f7 * f3) + f6);
                    u5wVar7.v = (int) (((f8 - f9) * f4) + f9);
                    int i11 = umpVar.o;
                    arrayList6 = arrayList7;
                    float f10 = umpVar.k;
                    if (i11 != 2) {
                        float f11 = Float.isNaN(f10) ? f2 : umpVar.k;
                        float f12 = u5wVar.e;
                        float f13 = u5wVar6.e;
                        u5wVar7.e = hxa.a(f12, f13, f11, f13);
                        if (!Float.isNaN(umpVar.l)) {
                            f2 = umpVar.l;
                        }
                        float f14 = u5wVar.f;
                        float f15 = u5wVar6.f;
                        u5wVar7.f = hxa.a(f14, f15, f2, f15);
                    } else {
                        if (Float.isNaN(f10)) {
                            float f16 = u5wVar.e;
                            float f17 = u5wVar6.e;
                            fMin = hxa.a(f16, f17, f2, f17);
                        } else {
                            fMin = umpVar.k * Math.min(f4, f3);
                        }
                        u5wVar7.e = fMin;
                        if (Float.isNaN(umpVar.l)) {
                            float f18 = u5wVar.f;
                            float f19 = u5wVar6.f;
                            fA = hxa.a(f18, f19, f2, f19);
                        } else {
                            fA = umpVar.l;
                        }
                        u5wVar7.f = fA;
                    }
                    u5wVar7.z = u5wVar6.z;
                    u5wVar7.a = skf.c(umpVar.f);
                    u5wVar7.y = umpVar.g;
                } else {
                    arrayList6 = arrayList7;
                    str16 = str19;
                    str18 = str22;
                    int i12 = umpVar.o;
                    int i13 = umpVar.a;
                    if (i12 == 1) {
                        float f20 = i13 / 100.0f;
                        u5wVar7.c = f20;
                        u5wVar7.b = umpVar.h;
                        float f21 = Float.isNaN(umpVar.i) ? f20 : umpVar.i;
                        float f22 = Float.isNaN(umpVar.j) ? f20 : umpVar.j;
                        float f23 = u5wVar.i - u5wVar6.i;
                        float f24 = f20;
                        float f25 = u5wVar.v - u5wVar6.v;
                        u5wVar7.d = u5wVar7.c;
                        if (!Float.isNaN(umpVar.k)) {
                            f24 = umpVar.k;
                        }
                        float f26 = u5wVar6.e;
                        float f27 = u5wVar6.i;
                        float f28 = (f27 / 2.0f) + f26;
                        float f29 = u5wVar6.f;
                        float f30 = u5wVar6.v;
                        float f31 = (f30 / 2.0f) + f29;
                        float f32 = ((u5wVar.i / 2.0f) + u5wVar.e) - f28;
                        float f33 = ((u5wVar.v / 2.0f) + u5wVar.f) - f31;
                        float f34 = f32 * f24;
                        float f35 = f23 * f21;
                        float f36 = f35 / 2.0f;
                        u5wVar7.e = (int) ((f26 + f34) - f36);
                        float f37 = f24 * f33;
                        float f38 = f25 * f22;
                        float f39 = f38 / 2.0f;
                        u5wVar7.f = (int) ((f29 + f37) - f39);
                        u5wVar7.i = (int) (f27 + f35);
                        u5wVar7.v = (int) (f30 + f38);
                        float f40 = Float.isNaN(umpVar.l) ? 0.0f : umpVar.l;
                        u5wVar7.D = 1;
                        float f41 = (int) ((u5wVar6.e + f34) - f36);
                        float f42 = (int) ((u5wVar6.f + f37) - f39);
                        u5wVar7.e = f41 + ((-f33) * f40);
                        u5wVar7.f = f42 + (f32 * f40);
                        u5wVar7.z = u5wVar7.z;
                        u5wVar7.a = skf.c(umpVar.f);
                        u5wVar7.y = umpVar.g;
                    } else if (i12 == 2) {
                        float f43 = i13 / 100.0f;
                        u5wVar7.c = f43;
                        u5wVar7.b = umpVar.h;
                        float f44 = Float.isNaN(umpVar.i) ? f43 : umpVar.i;
                        float f45 = Float.isNaN(umpVar.j) ? f43 : umpVar.j;
                        float f46 = u5wVar.i;
                        float f47 = u5wVar6.i;
                        float f48 = f46 - f47;
                        float f49 = u5wVar.v;
                        float f50 = u5wVar6.v;
                        float f51 = f49 - f50;
                        u5wVar7.d = u5wVar7.c;
                        float f52 = u5wVar6.e;
                        float f53 = (f47 / 2.0f) + f52;
                        float f54 = u5wVar6.f;
                        float f55 = (f46 / 2.0f) + u5wVar.e;
                        float f56 = ((f49 / 2.0f) + u5wVar.f) - ((f50 / 2.0f) + f54);
                        float f57 = f48 * f44;
                        u5wVar7.e = (int) ((((f55 - f53) * f43) + f52) - (f57 / 2.0f));
                        float f58 = f51 * f45;
                        u5wVar7.f = (int) (((f56 * f43) + f54) - (f58 / 2.0f));
                        u5wVar7.i = (int) (f47 + f57);
                        u5wVar7.v = (int) (f50 + f58);
                        u5wVar7.D = 2;
                        if (!Float.isNaN(umpVar.k)) {
                            u5wVar7.e = (int) (umpVar.k * (i - ((int) u5wVar7.i)));
                        }
                        if (!Float.isNaN(umpVar.l)) {
                            u5wVar7.f = (int) (umpVar.l * (i2 - ((int) u5wVar7.v)));
                        }
                        u5wVar7.z = u5wVar7.z;
                        u5wVar7.a = skf.c(umpVar.f);
                        u5wVar7.y = umpVar.g;
                    } else if (i12 != 3) {
                        float f59 = i13 / 100.0f;
                        u5wVar7.c = f59;
                        u5wVar7.b = umpVar.h;
                        float f60 = Float.isNaN(umpVar.i) ? f59 : umpVar.i;
                        float f61 = Float.isNaN(umpVar.j) ? f59 : umpVar.j;
                        float f62 = u5wVar.i;
                        float f63 = u5wVar6.i;
                        float f64 = f62 - f63;
                        float f65 = f59;
                        float f66 = u5wVar.v;
                        float f67 = u5wVar6.v;
                        float f68 = f66 - f67;
                        u5wVar7.d = u5wVar7.c;
                        float f69 = u5wVar6.e;
                        float f70 = (f63 / 2.0f) + f69;
                        float f71 = u5wVar6.f;
                        float f72 = ((f62 / 2.0f) + u5wVar.e) - f70;
                        float f73 = ((f66 / 2.0f) + u5wVar.f) - ((f67 / 2.0f) + f71);
                        float f74 = f64 * f60;
                        float f75 = f74 / 2.0f;
                        u5wVar7.e = (int) (((f72 * f65) + f69) - f75);
                        float f76 = f68 * f61;
                        float f77 = f76 / 2.0f;
                        u5wVar7.f = (int) (((f73 * f65) + f71) - f77);
                        u5wVar7.i = (int) (f63 + f74);
                        u5wVar7.v = (int) (f67 + f76);
                        float f78 = Float.isNaN(umpVar.k) ? f65 : umpVar.k;
                        float f79 = Float.isNaN(umpVar.n) ? 0.0f : umpVar.n;
                        float f80 = f78;
                        if (!Float.isNaN(umpVar.l)) {
                            f65 = umpVar.l;
                        }
                        float f81 = Float.isNaN(umpVar.m) ? 0.0f : umpVar.m;
                        u5wVar7.D = 0;
                        u5wVar7.e = (int) (((f81 * f73) + ((f80 * f72) + u5wVar6.e)) - f75);
                        u5wVar7.f = (int) (((f73 * f65) + ((f72 * f79) + u5wVar6.f)) - f77);
                        u5wVar7.a = skf.c(umpVar.f);
                        u5wVar7.y = umpVar.g;
                    } else {
                        float f82 = i13 / 100.0f;
                        u5wVar7.c = f82;
                        u5wVar7.b = umpVar.h;
                        float f83 = Float.isNaN(umpVar.i) ? f82 : umpVar.i;
                        float f84 = Float.isNaN(umpVar.j) ? f82 : umpVar.j;
                        float f85 = u5wVar.i;
                        float f86 = u5wVar6.i;
                        float f87 = f85 - f86;
                        float f88 = u5wVar.v;
                        float f89 = u5wVar6.v;
                        float f90 = f88 - f89;
                        u5wVar7.d = u5wVar7.c;
                        float f91 = u5wVar6.e;
                        float f92 = (f86 / 2.0f) + f91;
                        float f93 = u5wVar6.f;
                        float f94 = (f89 / 2.0f) + f93;
                        float f95 = (f85 / 2.0f) + u5wVar.e;
                        float f96 = (f88 / 2.0f) + u5wVar.f;
                        if (f92 > f95) {
                            f92 = f95;
                            f95 = f92;
                        }
                        if (f94 <= f96) {
                            f94 = f96;
                            f96 = f94;
                        }
                        float f97 = f95 - f92;
                        float f98 = f94 - f96;
                        float f99 = f87 * f83;
                        float f100 = f99 / 2.0f;
                        u5wVar7.e = (int) (((f97 * f82) + f91) - f100);
                        float f101 = f90 * f84;
                        float f102 = f101 / 2.0f;
                        u5wVar7.f = (int) (((f98 * f82) + f93) - f102);
                        u5wVar7.i = (int) (f86 + f99);
                        u5wVar7.v = (int) (f89 + f101);
                        float f103 = Float.isNaN(umpVar.k) ? f82 : umpVar.k;
                        float f104 = Float.isNaN(umpVar.n) ? 0.0f : umpVar.n;
                        float f105 = Float.isNaN(umpVar.l) ? f82 : umpVar.l;
                        float f106 = f103;
                        float f107 = Float.isNaN(umpVar.m) ? 0.0f : umpVar.m;
                        u5wVar7.D = 0;
                        u5wVar7.e = (int) (((f107 * f98) + ((f106 * f97) + u5wVar6.e)) - f100);
                        u5wVar7.f = (int) (((f98 * f105) + ((f97 * f104) + u5wVar6.f)) - f102);
                        u5wVar7.a = skf.c(umpVar.f);
                        u5wVar7.y = umpVar.g;
                    }
                }
                int iBinarySearch = Collections.binarySearch(arrayList, u5wVar7);
                if (iBinarySearch == 0) {
                    Log.e("MotionController", " KeyPath position \"" + u5wVar7.d + "\" outside of range");
                }
                arrayList.add((-iBinarySearch) - 1, u5wVar7);
                int i14 = umpVar.e;
                if (i14 != -1) {
                    this.e = i14;
                }
            } else {
                arrayList6 = arrayList7;
                str16 = str19;
                str17 = str20;
                str18 = str22;
                i4 = i9;
                if (mlpVar2 instanceof ylp) {
                    mlpVar2.d(hashSet10);
                } else if (mlpVar2 instanceof dnp) {
                    mlpVar2.d(hashSet8);
                } else if (mlpVar2 instanceof enp) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add((enp) mlpVar2);
                } else {
                    mlpVar2.f(map2);
                    mlpVar2.d(hashSet9);
                }
            }
            str20 = str17;
            str23 = str;
            str21 = str2;
            size = i10;
            i8 = i4;
            str22 = str18;
            str19 = str16;
            arrayList7 = arrayList6;
        }
        ArrayList<mlp> arrayList9 = arrayList7;
        String str24 = str19;
        String str25 = str20;
        String str26 = str22;
        if (arrayList8 != null) {
            this.A = (enp[]) arrayList8.toArray(new enp[0]);
        }
        String str27 = "CUSTOM,";
        String str28 = ",";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            obj = obj25;
            str3 = str25;
            str4 = str;
            str5 = str2;
            str6 = str26;
            str7 = str24;
            arrayList2 = arrayList9;
            c = 5;
            c2 = 4;
            hashSet3 = hashSet9;
            obj2 = obj21;
            obj3 = obj23;
            u5wVar2 = u5wVar6;
            arrayList3 = arrayList;
            obj4 = obj24;
            u5wVar3 = u5wVar;
        } else {
            this.y = new HashMap<>();
            Iterator<String> it3 = hashSet9.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (!next.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    hashSet6 = hashSet10;
                    arrayList4 = arrayList9;
                    it2 = it3;
                    switch (next.hashCode()) {
                        case -1249320806:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            obj17 = obj19;
                            b5 = next.equals(obj17) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            Object obj26 = obj20;
                            if (next.equals(obj26)) {
                                obj20 = obj26;
                                obj17 = obj19;
                                b5 = 1;
                            } else {
                                obj20 = obj26;
                                obj17 = obj19;
                            }
                            break;
                        case -1225497657:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            Object obj27 = obj22;
                            if (next.equals(obj27)) {
                                obj22 = obj27;
                                obj17 = obj19;
                                b5 = 2;
                            } else {
                                obj22 = obj27;
                                obj17 = obj19;
                            }
                            break;
                        case -1225497656:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            if (next.equals(obj16)) {
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 3;
                            } else {
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -1225497655:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            if (next.equals(obj15)) {
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 4;
                            } else {
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -1001078227:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            if (next.equals(obj14)) {
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 5;
                            } else {
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -908189618:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals(obj25)) {
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 6;
                            } else {
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -908189617:
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals(str12)) {
                                obj25 = obj25;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 7;
                            } else {
                                obj25 = obj25;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -797520672:
                            str11 = str25;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals("waveVariesBy")) {
                                obj25 = obj25;
                                str12 = str;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 8;
                            } else {
                                obj25 = obj25;
                                str12 = str;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case -760884510:
                            str11 = str25;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals("transformPivotX")) {
                                b6 = 9;
                                obj25 = obj25;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = b6;
                                str12 = str;
                            }
                            obj25 = obj25;
                            str12 = str;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            obj17 = obj19;
                            break;
                        case -760884509:
                            str11 = str25;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals("transformPivotY")) {
                                b6 = 10;
                                obj25 = obj25;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = b6;
                                str12 = str;
                            }
                            obj25 = obj25;
                            str12 = str;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            obj17 = obj19;
                            break;
                        case -40300674:
                            str11 = str25;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals(str13)) {
                                b6 = 11;
                                obj25 = obj25;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = b6;
                                str12 = str;
                            }
                            obj25 = obj25;
                            str12 = str;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            obj17 = obj19;
                            break;
                        case -4379043:
                            str11 = str25;
                            str14 = str26;
                            str15 = str24;
                            if (next.equals(str11)) {
                                obj25 = obj25;
                                str12 = str;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 12;
                                str13 = str2;
                            } else {
                                str12 = str;
                                str13 = str2;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case 37232917:
                            str14 = str26;
                            str15 = str24;
                            if (next.equals(str14)) {
                                obj25 = obj25;
                                str12 = str;
                                str13 = str2;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 13;
                                str11 = str25;
                            } else {
                                str11 = str25;
                                str12 = str;
                                str13 = str2;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case 92909918:
                            str15 = str24;
                            if (next.equals(str15)) {
                                obj25 = obj25;
                                str11 = str25;
                                str12 = str;
                                str13 = str2;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 14;
                                str14 = str26;
                            } else {
                                obj25 = obj25;
                                str11 = str25;
                                str12 = str;
                                str13 = str2;
                                str14 = str26;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                            }
                            break;
                        case 156108012:
                            if (next.equals("waveOffset")) {
                                obj25 = obj25;
                                str11 = str25;
                                str12 = str;
                                str13 = str2;
                                str14 = str26;
                                hashSet7 = hashSet9;
                                obj14 = obj21;
                                u5wVar4 = u5wVar6;
                                obj15 = obj24;
                                u5wVar5 = u5wVar;
                                obj16 = obj23;
                                arrayList5 = arrayList;
                                obj17 = obj19;
                                b5 = 15;
                                str15 = str24;
                                break;
                            }
                        default:
                            obj25 = obj25;
                            str11 = str25;
                            str12 = str;
                            str13 = str2;
                            str14 = str26;
                            str15 = str24;
                            hashSet7 = hashSet9;
                            obj14 = obj21;
                            u5wVar4 = u5wVar6;
                            obj15 = obj24;
                            u5wVar5 = u5wVar;
                            obj16 = obj23;
                            arrayList5 = arrayList;
                            obj17 = obj19;
                            break;
                    }
                    switch (b5) {
                        case 0:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = new q9i0.i();
                            break;
                        case 1:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = new q9i0.j();
                            break;
                        case 2:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = new q9i0.m();
                            break;
                        case 3:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = new q9i0.n();
                            break;
                        case 4:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = new q9i0.o();
                            break;
                        case 5:
                            obj19 = obj17;
                            q9i0.g gVar3 = new q9i0.g();
                            obj18 = obj16;
                            gVar3.f = false;
                            iVar3 = gVar3;
                            break;
                        case 6:
                            kVar = new q9i0.k();
                            aeb0 aeb0Var = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var;
                            obj18 = obj16;
                            break;
                        case 7:
                            kVar = new q9i0.l();
                            aeb0 aeb0Var2 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var2;
                            obj18 = obj16;
                            break;
                        case 8:
                            kVar = new q9i0.a();
                            aeb0 aeb0Var3 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var3;
                            obj18 = obj16;
                            break;
                        case 9:
                            kVar = new q9i0.e();
                            aeb0 aeb0Var4 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var4;
                            obj18 = obj16;
                            break;
                        case 10:
                            kVar = new q9i0.f();
                            aeb0 aeb0Var5 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var5;
                            obj18 = obj16;
                            break;
                        case 11:
                            kVar = new q9i0.h();
                            aeb0 aeb0Var6 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var6;
                            obj18 = obj16;
                            break;
                        case 12:
                            kVar = new q9i0.c();
                            aeb0 aeb0Var7 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var7;
                            obj18 = obj16;
                            break;
                        case 13:
                            kVar = new q9i0.d();
                            aeb0 aeb0Var8 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var8;
                            obj18 = obj16;
                            break;
                        case 14:
                            kVar = new q9i0.a();
                            aeb0 aeb0Var9 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var9;
                            obj18 = obj16;
                            break;
                        case 15:
                            kVar = new q9i0.a();
                            aeb0 aeb0Var10 = kVar;
                            obj19 = obj17;
                            iVar3 = aeb0Var10;
                            obj18 = obj16;
                            break;
                        default:
                            obj19 = obj17;
                            obj18 = obj16;
                            iVar3 = null;
                            break;
                    }
                } else {
                    SparseArray<a> sparseArray = new SparseArray<>();
                    String str29 = next.split(",")[1];
                    int size2 = arrayList9.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        HashSet<String> hashSet11 = hashSet8;
                        ArrayList<mlp> arrayList10 = arrayList9;
                        mlp mlpVar3 = arrayList10.get(i15);
                        i15++;
                        HashSet<String> hashSet12 = hashSet10;
                        mlp mlpVar4 = mlpVar3;
                        Iterator<String> it4 = it3;
                        HashMap<String, a> map3 = mlpVar4.d;
                        if (map3 != null && (aVar3 = map3.get(str29)) != null) {
                            sparseArray.append(mlpVar4.a, aVar3);
                        }
                        it3 = it4;
                        hashSet10 = hashSet12;
                        arrayList9 = arrayList10;
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    hashSet6 = hashSet10;
                    arrayList4 = arrayList9;
                    it2 = it3;
                    q9i0.b bVar3 = new q9i0.b();
                    String str30 = next.split(",")[1];
                    bVar3.f = sparseArray;
                    obj25 = obj25;
                    str11 = str25;
                    str12 = str;
                    str13 = str2;
                    str14 = str26;
                    hashSet7 = hashSet9;
                    obj14 = obj21;
                    obj18 = obj23;
                    u5wVar4 = u5wVar6;
                    arrayList5 = arrayList;
                    obj15 = obj24;
                    iVar3 = bVar3;
                    u5wVar5 = u5wVar;
                    str15 = str24;
                }
                if (iVar3 != null) {
                    iVar3.e = next;
                    this.y.put(next, (q9i0) iVar3);
                }
                str24 = str15;
                str26 = str14;
                str2 = str13;
                str = str12;
                arrayList = arrayList5;
                u5wVar = u5wVar5;
                obj23 = obj18;
                it3 = it2;
                hashSet10 = hashSet6;
                arrayList9 = arrayList4;
                obj24 = obj15;
                str25 = str11;
                u5wVar6 = u5wVar4;
                hashSet8 = hashSet5;
                obj21 = obj14;
                hashSet9 = hashSet7;
                obj25 = obj25;
            }
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            obj = obj25;
            str3 = str25;
            str4 = str;
            str5 = str2;
            str6 = str26;
            str7 = str24;
            arrayList2 = arrayList9;
            c = 5;
            c2 = 4;
            hashSet3 = hashSet9;
            obj2 = obj21;
            obj3 = obj23;
            u5wVar2 = u5wVar6;
            arrayList3 = arrayList;
            obj4 = obj24;
            u5wVar3 = u5wVar;
            int size3 = arrayList2.size();
            int i16 = 0;
            while (i16 < size3) {
                mlp mlpVar5 = arrayList2.get(i16);
                i16++;
                mlp mlpVar6 = mlpVar5;
                int i17 = size3;
                if (mlpVar6 instanceof plp) {
                    mlpVar6.a(this.y);
                }
                size3 = i17;
            }
            l5wVar.a(this.y, 0);
            l5wVar2.a(this.y, 100);
            Iterator<String> it5 = this.y.keySet().iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                int iIntValue = (!map2.containsKey(next2) || (num = map2.get(next2)) == null) ? 0 : num.intValue();
                Iterator<String> it6 = it5;
                q9i0 q9i0Var = this.y.get(next2);
                if (q9i0Var != null) {
                    q9i0Var.c(iIntValue);
                }
                it5 = it6;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
            obj5 = obj20;
            obj6 = obj22;
            obj7 = obj3;
            obj8 = obj;
            obj9 = obj19;
        } else {
            if (this.x == null) {
                this.x = new HashMap<>();
            }
            Iterator<String> it7 = hashSet.iterator();
            while (it7.hasNext()) {
                String next3 = it7.next();
                if (!this.x.containsKey(next3)) {
                    if (next3.startsWith(str27)) {
                        SparseArray<a> sparseArray2 = new SparseArray<>();
                        it = it7;
                        String str31 = next3.split(str28)[1];
                        str10 = str27;
                        int size4 = arrayList2.size();
                        map = map2;
                        int i18 = 0;
                        while (i18 < size4) {
                            mlp mlpVar7 = arrayList2.get(i18);
                            int i19 = i18 + 1;
                            mlp mlpVar8 = mlpVar7;
                            int i20 = size4;
                            HashMap<String, a> map4 = mlpVar8.d;
                            if (map4 != null && (aVar2 = map4.get(str31)) != null) {
                                sparseArray2.append(mlpVar8.a, aVar2);
                            }
                            size4 = i20;
                            i18 = i19;
                        }
                        y9i0.b bVar4 = new y9i0.b();
                        bVar4.m = new SparseArray<>();
                        bVar4.k = next3.split(str28)[1];
                        bVar4.l = sparseArray2;
                        String str32 = str28;
                        bVar2 = bVar4;
                        obj11 = obj20;
                        obj10 = obj19;
                        str28 = str32;
                        obj12 = obj22;
                        obj13 = obj3;
                    } else {
                        map = map2;
                        it = it7;
                        str10 = str27;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                obj10 = obj19;
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                b3 = next3.equals(obj10) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                if (next3.equals(obj11)) {
                                    obj10 = obj19;
                                    b3 = 1;
                                } else {
                                    obj10 = obj19;
                                }
                                break;
                            case -1225497657:
                                obj12 = obj22;
                                obj13 = obj3;
                                obj10 = obj19;
                                if (next3.equals(obj12)) {
                                    obj11 = obj20;
                                    b3 = 2;
                                } else {
                                    obj11 = obj20;
                                }
                                break;
                            case -1225497656:
                                obj13 = obj3;
                                obj10 = obj19;
                                if (next3.equals(obj13)) {
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    b3 = 3;
                                } else {
                                    obj11 = obj20;
                                    obj12 = obj22;
                                }
                                break;
                            case -1225497655:
                                if (next3.equals(obj4)) {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = c2;
                                } else {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                }
                                break;
                            case -1001078227:
                                if (next3.equals(obj2)) {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = c;
                                } else {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                }
                                break;
                            case -908189618:
                                if (next3.equals(obj)) {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = 6;
                                } else {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                }
                                break;
                            case -908189617:
                                if (next3.equals(str4)) {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = 7;
                                } else {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                }
                                break;
                            case -40300674:
                                if (next3.equals(str5)) {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = 8;
                                } else {
                                    obj10 = obj19;
                                    obj11 = obj20;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                }
                                break;
                            case -4379043:
                                if (next3.equals(str3)) {
                                    b4 = 9;
                                    obj10 = obj19;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = b4;
                                    obj11 = obj20;
                                }
                                obj10 = obj19;
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                break;
                            case 37232917:
                                if (next3.equals(str6)) {
                                    b4 = 10;
                                    obj10 = obj19;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = b4;
                                    obj11 = obj20;
                                }
                                obj10 = obj19;
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                break;
                            case 92909918:
                                if (next3.equals(str7)) {
                                    b4 = 11;
                                    obj10 = obj19;
                                    obj12 = obj22;
                                    obj13 = obj3;
                                    b3 = b4;
                                    obj11 = obj20;
                                }
                                obj10 = obj19;
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                break;
                            default:
                                obj10 = obj19;
                                obj11 = obj20;
                                obj12 = obj22;
                                obj13 = obj3;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                gVar2 = new y9i0.g();
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 1:
                                gVar2 = new y9i0.h();
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 2:
                                gVar2 = new y9i0.k();
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 3:
                                gVar2 = new y9i0.l();
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 4:
                                gVar2 = new y9i0.m();
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 5:
                                y9i0.e eVar = new y9i0.e();
                                eVar.k = false;
                                gVar2 = eVar;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 6:
                                iVar2 = new y9i0.i();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 7:
                                iVar2 = new y9i0.j();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 8:
                                iVar2 = new y9i0.f();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 9:
                                iVar2 = new y9i0.c();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 10:
                                iVar2 = new y9i0.d();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            case 11:
                                iVar2 = new y9i0.a();
                                gVar2 = iVar2;
                                obj = obj;
                                gVar2.i = j;
                                wvf0Var = gVar2;
                                break;
                            default:
                                str28 = str28;
                                obj10 = obj10;
                                bVar2 = null;
                                break;
                        }
                        if (wvf0Var != null) {
                            wvf0Var.f = next3;
                            this.x.put(next3, (y9i0) wvf0Var);
                        }
                        obj3 = obj13;
                        str28 = str28;
                        obj19 = obj10;
                        obj = obj;
                        str27 = str10;
                        obj20 = obj11;
                        obj22 = obj12;
                        it7 = it;
                        map2 = map;
                    }
                    wvf0Var = bVar2;
                    if (wvf0Var != null) {
                        wvf0Var.f = next3;
                        this.x.put(next3, (y9i0) wvf0Var);
                    }
                    obj3 = obj13;
                    str28 = str28;
                    obj19 = obj10;
                    obj = obj;
                    str27 = str10;
                    obj20 = obj11;
                    obj22 = obj12;
                    it7 = it;
                    map2 = map;
                }
            }
            HashMap<String, Integer> map5 = map2;
            str8 = str27;
            obj5 = obj20;
            obj6 = obj22;
            obj7 = obj3;
            obj8 = obj;
            obj9 = obj19;
            int size5 = arrayList2.size();
            int i21 = 0;
            while (i21 < size5) {
                mlp mlpVar9 = arrayList2.get(i21);
                i21++;
                mlp mlpVar10 = mlpVar9;
                if (mlpVar10 instanceof dnp) {
                    ((dnp) mlpVar10).h(this.x);
                }
            }
            Iterator<String> it8 = this.x.keySet().iterator();
            while (it8.hasNext()) {
                String next4 = it8.next();
                HashMap<String, Integer> map6 = map5;
                Iterator<String> it9 = it8;
                this.x.get(next4).c(map6.containsKey(next4) ? map6.get(next4).intValue() : 0);
                it8 = it9;
                map5 = map6;
            }
        }
        int size6 = arrayList3.size();
        int i22 = size6 + 2;
        u5w[] u5wVarArr2 = new u5w[i22];
        u5wVarArr2[0] = u5wVar2;
        u5wVarArr2[size6 + 1] = u5wVar3;
        if (arrayList3.size() > 0) {
            u5wVarArr = u5wVarArr2;
            if (this.e == -1) {
                this.e = 0;
            }
        } else {
            u5wVarArr = u5wVarArr2;
        }
        int size7 = arrayList3.size();
        int i23 = 0;
        int i24 = 1;
        while (i23 < size7) {
            int i25 = size7;
            ArrayList<u5w> arrayList11 = arrayList3;
            u5w u5wVar8 = arrayList11.get(i23);
            i23++;
            u5wVarArr[i24] = u5wVar8;
            i24++;
            arrayList3 = arrayList11;
            size7 = i25;
        }
        HashSet hashSet13 = new HashSet();
        Iterator<String> it10 = u5wVar3.C.keySet().iterator();
        while (it10.hasNext()) {
            String next5 = it10.next();
            ArrayList<mlp> arrayList12 = arrayList2;
            Iterator<String> it11 = it10;
            u5w u5wVar9 = u5wVar2;
            if (u5wVar9.C.containsKey(next5)) {
                u5wVar2 = u5wVar9;
                hashSet4 = hashSet3;
                if (!hashSet4.contains(str8 + next5)) {
                    hashSet13.add(next5);
                }
            } else {
                u5wVar2 = u5wVar9;
                hashSet4 = hashSet3;
            }
            hashSet3 = hashSet4;
            arrayList2 = arrayList12;
            it10 = it11;
        }
        ArrayList<mlp> arrayList13 = arrayList2;
        String[] strArr = (String[]) hashSet13.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i26 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i26 < strArr2.length) {
                String str33 = strArr2[i26];
                this.s[i26] = 0;
                for (int i27 = 0; i27 < i22; i27++) {
                    if (u5wVarArr[i27].C.containsKey(str33) && (aVar = u5wVarArr[i27].C.get(str33)) != null) {
                        int[] iArr = this.s;
                        iArr[i26] = aVar.c() + iArr[i26];
                        break;
                    }
                }
                i26++;
            } else {
                boolean z = u5wVarArr[0].y != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                int i28 = 1;
                while (i28 < i22) {
                    boolean z2 = z;
                    u5w u5wVar10 = u5wVarArr[i28];
                    boolean[] zArr2 = zArr;
                    u5w u5wVar11 = u5wVarArr[i28 - 1];
                    int i29 = i28;
                    Object obj28 = obj5;
                    boolean zB = u5w.b(u5wVar10.e, u5wVar11.e);
                    boolean zB2 = u5w.b(u5wVar10.f, u5wVar11.f);
                    zArr2[0] = zArr2[0] | u5w.b(u5wVar10.d, u5wVar11.d);
                    boolean z3 = zB | zB2 | z2;
                    zArr2[1] = zArr2[1] | z3;
                    zArr2[2] = zArr2[2] | z3;
                    zArr2[3] = zArr2[3] | u5w.b(u5wVar10.i, u5wVar11.i);
                    zArr2[c2] = u5w.b(u5wVar10.v, u5wVar11.v) | zArr2[c2];
                    i28 = i29 + 1;
                    z = z2;
                    zArr = zArr2;
                    obj5 = obj28;
                }
                Object obj29 = obj5;
                boolean[] zArr3 = zArr;
                int i30 = 0;
                for (int i31 = 1; i31 < length; i31++) {
                    if (zArr3[i31]) {
                        i30++;
                    }
                }
                this.o = new int[i30];
                int iMax = Math.max(2, i30);
                this.p = new double[iMax];
                this.q = new double[iMax];
                int i32 = 0;
                for (int i33 = 1; i33 < length; i33++) {
                    if (zArr3[i33]) {
                        this.o[i32] = i33;
                        i32++;
                    }
                }
                int[] iArr2 = {i22, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i22];
                int i34 = 0;
                while (i34 < i22) {
                    u5w u5wVar12 = u5wVarArr[i34];
                    double[] dArr3 = dArr[i34];
                    int i35 = i34;
                    Object obj30 = obj6;
                    float f108 = u5wVar12.d;
                    float f109 = u5wVar12.e;
                    float f110 = u5wVar12.f;
                    float f111 = u5wVar12.i;
                    float f112 = u5wVar12.v;
                    float f113 = u5wVar12.w;
                    float[] fArr = new float[6];
                    fArr[0] = f108;
                    fArr[1] = f109;
                    fArr[2] = f110;
                    fArr[3] = f111;
                    fArr[c2] = f112;
                    fArr[c] = f113;
                    int i36 = 0;
                    int i37 = 0;
                    for (int[] iArr3 = this.o; i36 < iArr3.length; iArr3 = iArr3) {
                        int i38 = iArr3[i36];
                        int i39 = i36;
                        if (i38 < 6) {
                            dArr3[i37] = fArr[i38];
                            i37++;
                        }
                        i36 = i39 + 1;
                    }
                    dArr2[i35] = u5wVarArr[i35].c;
                    i34 = i35 + 1;
                    obj6 = obj30;
                }
                Object obj31 = obj6;
                int i40 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i40 < iArr4.length) {
                        if (iArr4[i40] < 6) {
                            i3 = i40;
                            String strA = uf80.a(new StringBuilder(), u5w.G[this.o[i40]], " [");
                            int i41 = 0;
                            while (i41 < i22) {
                                strA = strA + dArr[i41][i3];
                                i41++;
                                str4 = str4;
                            }
                        } else {
                            i3 = i40;
                        }
                        i40 = i3 + 1;
                        str4 = str4;
                    } else {
                        String str34 = str4;
                        this.j = new r5c[this.r.length + 1];
                        int i42 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i42 >= strArr3.length) {
                                Object obj32 = obj7;
                                this.j[0] = r5c.a(this.e, dArr2, dArr);
                                if (u5wVarArr[0].y != -1) {
                                    int[] iArr5 = new int[i22];
                                    double[] dArr4 = new double[i22];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i22, 2);
                                    for (int i43 = 0; i43 < i22; i43++) {
                                        u5w u5wVar13 = u5wVarArr[i43];
                                        iArr5[i43] = u5wVar13.y;
                                        dArr4[i43] = u5wVar13.c;
                                        double[] dArr6 = dArr5[i43];
                                        dArr6[0] = u5wVar13.e;
                                        dArr6[1] = u5wVar13.f;
                                    }
                                    this.k = new aw0(iArr5, dArr4, dArr5);
                                }
                                this.z = new HashMap<>();
                                Iterator<String> it12 = hashSet2.iterator();
                                float fE = Float.NaN;
                                while (it12.hasNext()) {
                                    String next6 = it12.next();
                                    if (next6.startsWith("CUSTOM")) {
                                        bVar = new z8i0.b();
                                        obj9 = obj9;
                                        obj8 = obj8;
                                        obj29 = obj29;
                                        obj31 = obj31;
                                        obj32 = obj32;
                                        str34 = str34;
                                    } else {
                                        switch (next6.hashCode()) {
                                            case -1249320806:
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                b = next6.equals(obj9) ? (byte) 0 : (byte) -1;
                                                break;
                                            case -1249320805:
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                if (next6.equals(obj29)) {
                                                    obj9 = obj9;
                                                    b = 1;
                                                } else {
                                                    obj9 = obj9;
                                                }
                                                break;
                                            case -1225497657:
                                                obj8 = obj8;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                obj9 = obj9;
                                                if (next6.equals(obj31)) {
                                                    obj29 = obj29;
                                                    b = 2;
                                                } else {
                                                    obj29 = obj29;
                                                }
                                                break;
                                            case -1225497656:
                                                obj8 = obj8;
                                                obj32 = obj32;
                                                str34 = str34;
                                                obj9 = obj9;
                                                obj29 = obj29;
                                                if (next6.equals(obj32)) {
                                                    obj31 = obj31;
                                                    b = 3;
                                                } else {
                                                    obj31 = obj31;
                                                }
                                                break;
                                            case -1225497655:
                                                obj8 = obj8;
                                                str34 = str34;
                                                if (next6.equals(obj4)) {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    b = c2;
                                                } else {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                }
                                                break;
                                            case -1001078227:
                                                obj8 = obj8;
                                                str34 = str34;
                                                if (next6.equals(obj2)) {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    b = c;
                                                } else {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                }
                                                break;
                                            case -908189618:
                                                obj8 = obj8;
                                                str34 = str34;
                                                if (next6.equals(obj8)) {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    b = 6;
                                                } else {
                                                    obj9 = obj9;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                }
                                                break;
                                            case -908189617:
                                                str34 = str34;
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                if (next6.equals(str34)) {
                                                    obj32 = obj32;
                                                    b = 7;
                                                } else {
                                                    obj32 = obj32;
                                                }
                                                break;
                                            case -797520672:
                                                if (next6.equals("waveVariesBy")) {
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                    b = 8;
                                                } else {
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                break;
                                            case -40300674:
                                                if (next6.equals(str5)) {
                                                    b2 = 9;
                                                    b = b2;
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                            case -4379043:
                                                if (next6.equals(str3)) {
                                                    b2 = 10;
                                                    b = b2;
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                            case 37232917:
                                                if (next6.equals(str6)) {
                                                    b2 = 11;
                                                    b = b2;
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                            case 92909918:
                                                if (next6.equals(str7)) {
                                                    b2 = 12;
                                                    b = b2;
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                            case 156108012:
                                                if (next6.equals("waveOffset")) {
                                                    b2 = 13;
                                                    b = b2;
                                                    obj9 = obj9;
                                                    obj8 = obj8;
                                                    obj29 = obj29;
                                                    obj31 = obj31;
                                                    obj32 = obj32;
                                                    str34 = str34;
                                                }
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                            default:
                                                obj9 = obj9;
                                                obj8 = obj8;
                                                obj29 = obj29;
                                                obj31 = obj31;
                                                obj32 = obj32;
                                                str34 = str34;
                                                break;
                                        }
                                        switch (b) {
                                            case 0:
                                                it12 = it12;
                                                obj2 = obj2;
                                                gVar = new z8i0.g();
                                                break;
                                            case 1:
                                                it12 = it12;
                                                obj2 = obj2;
                                                gVar = new z8i0.h();
                                                break;
                                            case 2:
                                                it12 = it12;
                                                obj2 = obj2;
                                                gVar = new z8i0.k();
                                                break;
                                            case 3:
                                                it12 = it12;
                                                obj2 = obj2;
                                                gVar = new z8i0.l();
                                                break;
                                            case 4:
                                                it12 = it12;
                                                obj2 = obj2;
                                                gVar = new z8i0.m();
                                                break;
                                            case 5:
                                                it12 = it12;
                                                z8i0.e eVar2 = new z8i0.e();
                                                obj2 = obj2;
                                                eVar2.g = false;
                                                gVar = eVar2;
                                                break;
                                            case 6:
                                                iVar = new z8i0.i();
                                                bVar = iVar;
                                                break;
                                            case 7:
                                                iVar = new z8i0.j();
                                                bVar = iVar;
                                                break;
                                            case 8:
                                                iVar = new z8i0.a();
                                                bVar = iVar;
                                                break;
                                            case 9:
                                                iVar = new z8i0.f();
                                                bVar = iVar;
                                                break;
                                            case 10:
                                                iVar = new z8i0.c();
                                                bVar = iVar;
                                                break;
                                            case 11:
                                                iVar = new z8i0.d();
                                                bVar = iVar;
                                                break;
                                            case 12:
                                                iVar = new z8i0.a();
                                                bVar = iVar;
                                                break;
                                            case 13:
                                                iVar = new z8i0.a();
                                                bVar = iVar;
                                                break;
                                            default:
                                                iVar = null;
                                                bVar = iVar;
                                                break;
                                        }
                                        if (gVar == null) {
                                            String str35 = str7;
                                            if (gVar.e == 1 && Float.isNaN(fE)) {
                                                fE = e();
                                            }
                                            gVar.b = next6;
                                            this.z.put(next6, (z8i0) gVar);
                                            str7 = str35;
                                        }
                                    }
                                    gVar = bVar;
                                    if (gVar == null) {
                                        String str36 = str7;
                                        if (gVar.e == 1) {
                                            fE = e();
                                        }
                                        gVar.b = next6;
                                        this.z.put(next6, (z8i0) gVar);
                                        str7 = str36;
                                    }
                                }
                                int size8 = arrayList13.size();
                                int i44 = 0;
                                while (i44 < size8) {
                                    ArrayList<mlp> arrayList14 = arrayList13;
                                    mlp mlpVar11 = arrayList14.get(i44);
                                    i44++;
                                    mlp mlpVar12 = mlpVar11;
                                    if (mlpVar12 instanceof ylp) {
                                        ((ylp) mlpVar12).h(this.z);
                                    }
                                    arrayList13 = arrayList14;
                                }
                                Iterator<z8i0> it13 = this.z.values().iterator();
                                while (it13.hasNext()) {
                                    it13.next().d();
                                }
                                return;
                            }
                            String str37 = strArr3[i42];
                            int i45 = i42;
                            Object obj33 = obj7;
                            double[][] dArr7 = null;
                            double[] dArr8 = null;
                            int i46 = 0;
                            int i47 = 0;
                            while (i46 < i22) {
                                int i48 = i46;
                                if (u5wVarArr[i48].C.containsKey(str37)) {
                                    if (dArr7 == null) {
                                        dArr8 = new double[i22];
                                        a aVar4 = u5wVarArr[i48].C.get(str37);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) cls, i22, aVar4 == null ? 0 : aVar4.c());
                                    }
                                    u5w u5wVar14 = u5wVarArr[i48];
                                    double[][] dArr9 = dArr7;
                                    double[] dArr10 = dArr8;
                                    dArr10[i47] = u5wVar14.c;
                                    double[] dArr11 = dArr9[i47];
                                    a aVar5 = u5wVar14.C.get(str37);
                                    if (aVar5 == null) {
                                        str9 = str37;
                                    } else {
                                        str9 = str37;
                                        if (aVar5.c() == 1) {
                                            dArr11[0] = aVar5.a();
                                        } else {
                                            int iC = aVar5.c();
                                            float[] fArr2 = new float[iC];
                                            aVar5.b(fArr2);
                                            int i49 = 0;
                                            int i50 = 0;
                                            while (i49 < iC) {
                                                int i51 = i49;
                                                dArr11[i50] = fArr2[i51];
                                                i49 = i51 + 1;
                                                i50++;
                                                iC = iC;
                                                fArr2 = fArr2;
                                            }
                                        }
                                    }
                                    i47++;
                                    dArr7 = dArr9;
                                    dArr8 = dArr10;
                                } else {
                                    str9 = str37;
                                }
                                i46 = i48 + 1;
                                str37 = str9;
                            }
                            int i52 = i45 + 1;
                            this.j[i52] = r5c.a(this.e, Arrays.copyOf(dArr8, i47), (double[][]) Arrays.copyOf(dArr7, i47));
                            i42 = i52;
                            obj7 = obj33;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        u5w u5wVar = this.f;
        sb.append(u5wVar.e);
        sb.append(" y: ");
        sb.append(u5wVar.f);
        sb.append(" end: x: ");
        u5w u5wVar2 = this.g;
        sb.append(u5wVar2.e);
        sb.append(" y: ");
        sb.append(u5wVar2.f);
        return sb.toString();
    }
}
