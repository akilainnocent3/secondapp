package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class q060 {
    public static final p060 a(int i, float f, w4b w4bVar, List list) {
        float[] fArr = new float[i * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long jH = a020.h(csh0.e(f, (csh0.b / i) * 2.0f * i3), ywh.a(0.0f, 0.0f));
            int i4 = i2 + 1;
            fArr[i2] = a020.d(jH);
            i2 += 2;
            fArr[i4] = a020.e(jH);
        }
        return b(fArr, w4bVar, list, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p060 b(float[] fArr, w4b w4bVar, List<w4b> list, float f, float f2) {
        float f3;
        long jA;
        List listC;
        e4c e4cVarA;
        Pair pair;
        w4b w4bVar2;
        float f4 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        w4bVar.getClass();
        p060 p060Var = null;
        if (fArr.length < 6) {
            hb5.a("Polygons must have at least 3 vertices");
            return null;
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            hb5.a("The vertices array should have even size");
            return null;
        }
        if (list != null && list.size() * 2 != fArr.length) {
            hb5.a("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            w4b w4bVar3 = (list == null || (w4bVar2 = list.get(i4)) == null) ? w4bVar : w4bVar2;
            int i5 = (((i4 + length) - 1) % length) * 2;
            int i6 = i4 + 1;
            int i7 = (i6 % length) * 2;
            int i8 = i4 * 2;
            arrayList2.add(new h060(ywh.a(fArr[i5], fArr[i5 + 1]), ywh.a(fArr[i8], fArr[i8 + 1]), ywh.a(fArr[i7], fArr[i7 + 1]), w4bVar3));
            i4 = i6;
            f4 = f4;
        }
        float f5 = f4;
        IntRange intRangeN = f.n(0, length);
        ArrayList arrayList3 = new ArrayList(l48.r(intRangeN, 10));
        Iterator<Integer> it = intRangeN.iterator();
        while (true) {
            f3 = 0.0f;
            if (!((mwo) it).c) {
                break;
            }
            int iNextInt = ((zvo) it).nextInt();
            int i9 = (iNextInt + 1) % length;
            float f6 = ((h060) arrayList2.get(iNextInt)).h + ((h060) arrayList2.get(i9)).h;
            float fC = ((h060) arrayList2.get(i9)).c() + ((h060) arrayList2.get(iNextInt)).c();
            int i10 = iNextInt * 2;
            float f7 = fArr[i10];
            float f8 = fArr[i10 + 1];
            int i11 = i9 * 2;
            float f9 = f7 - fArr[i11];
            float f10 = f8 - fArr[i11 + 1];
            float f11 = csh0.b;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            if (f6 > fSqrt) {
                pair = new Pair(Float.valueOf(fSqrt / f6), Float.valueOf(0.0f));
            } else {
                pair = fC > fSqrt ? new Pair(fValueOf, Float.valueOf((fSqrt - f6) / (fC - f6))) : new Pair(fValueOf, fValueOf);
            }
            arrayList3.add(pair);
        }
        int i12 = 0;
        while (i12 < length) {
            float[] fArrCopyOf = new float[i];
            p060 p060Var2 = p060Var;
            int i13 = i3;
            int i14 = i13;
            while (i14 < i) {
                int i15 = i;
                Pair pair2 = (Pair) arrayList3.get((((i12 + length) - 1) + i14) % length);
                int i16 = i3;
                float f12 = f3;
                float fA = hxa.a(((h060) arrayList2.get(i12)).c(), ((h060) arrayList2.get(i12)).h, ((Number) pair2.b).floatValue(), ((h060) arrayList2.get(i12)).h * ((Number) pair2.a).floatValue());
                int i17 = i13 + 1;
                if (fArrCopyOf.length < i17) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i17, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i13] = fA;
                i14++;
                i13 = i17;
                fArrCopyOf = fArrCopyOf;
                i3 = i16;
                i = i15;
                f3 = f12;
            }
            int i18 = i;
            int i19 = i3;
            float f13 = f3;
            h060 h060Var = (h060) arrayList2.get(i12);
            if (i13 <= 0) {
                mae0.a("Index must be between 0 and size");
                return p060Var2;
            }
            float f14 = fArrCopyOf[i19];
            if (i2 >= i13) {
                mae0.a("Index must be between 0 and size");
                return p060Var2;
            }
            float f15 = fArrCopyOf[i2];
            long j = h060Var.e;
            int i20 = i2;
            int i21 = length;
            long j2 = h060Var.d;
            float f16 = h060Var.f;
            ArrayList arrayList4 = arrayList;
            long j3 = h060Var.b;
            float fMin = Math.min(f14, f15);
            float f17 = h060Var.h;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                h060Var.i = j3;
                float fD = a020.d(j3);
                float fE = a020.e(j3);
                float fD2 = a020.d(j3);
                float fE2 = a020.e(j3);
                listC = a.c(i4c.a(fD, fE, csh0.c(fD, fD2, 0.33333334f), csh0.c(fE, fE2, 0.33333334f), csh0.c(fD, fD2, 0.6666667f), csh0.c(fE, fE2, 0.6666667f), fD2, fE2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fA2 = h060Var.a(f14);
                float fA3 = h060Var.a(f15);
                float f18 = (f16 * fMin2) / f17;
                float f19 = csh0.b;
                h060Var.i = a020.h(j3, a020.i((float) Math.sqrt((fMin2 * fMin2) + (f18 * f18)), a020.c(a020.a(2.0f, a020.h(j2, j)))));
                long jH = a020.h(j3, a020.i(fMin2, j2));
                long jH2 = a020.h(j3, a020.i(fMin2, j));
                e4c e4cVarB = h060.b(fMin2, fA2, h060Var.b, h060Var.a, jH, jH2, h060Var.i, f18);
                e4c e4cVarB2 = h060.b(fMin2, fA3, h060Var.b, h060Var.c, jH2, jH, h060Var.i, f18);
                float fA4 = e4cVarB2.a();
                float fB = e4cVarB2.b();
                float[] fArr2 = e4cVarB2.a;
                e4c e4cVarA2 = i4c.a(fA4, fB, fArr2[4], fArr2[5], fArr2[i18], fArr2[3], fArr2[i19], fArr2[i20]);
                float fD3 = a020.d(h060Var.i);
                float fE3 = a020.e(h060Var.i);
                float fA5 = e4cVarB.a();
                float fB2 = e4cVarB.b();
                float[] fArr3 = e4cVarA2.a;
                float f20 = fArr3[i19];
                float f21 = fArr3[i20];
                float f22 = fA5 - fD3;
                float f23 = fB2 - fE3;
                long jB = csh0.b(f22, f23);
                float f24 = f20 - fD3;
                float f25 = f21 - fE3;
                long jB2 = csh0.b(f24, f25);
                long jA2 = ywh.a(-a020.e(jB), a020.d(jB));
                long jA3 = ywh.a(-a020.e(jB2), a020.d(jB2));
                int i22 = (a020.e(jA2) * f25) + (a020.d(jA2) * f24) >= f13 ? i20 : i19;
                float fB3 = a020.b(jB, jB2);
                if (fB3 > 0.999f) {
                    e4cVarA = i4c.a(fA5, fB2, csh0.c(fA5, f20, 0.33333334f), csh0.c(fB2, f21, 0.33333334f), csh0.c(fA5, f20, 0.6666667f), csh0.c(fB2, f21, 0.6666667f), f20, f21);
                } else {
                    float f26 = f5 - fB3;
                    float fSqrt2 = (((((float) Math.sqrt(2.0f * f26)) - ((float) Math.sqrt(f5 - (fB3 * fB3)))) * ((((float) Math.sqrt((f23 * f23) + (f22 * f22))) * 4.0f) / 3.0f)) / f26) * (i22 != 0 ? f5 : -1.0f);
                    e4cVarA = i4c.a(fA5, fB2, (a020.d(jA2) * fSqrt2) + fA5, (a020.e(jA2) * fSqrt2) + fB2, f20 - (a020.d(jA3) * fSqrt2), f21 - (a020.e(jA3) * fSqrt2), f20, f21);
                }
                listC = b.k(e4cVarB, e4cVarA, e4cVarA2);
            }
            arrayList4.add(listC);
            i12++;
            f3 = f13;
            arrayList = arrayList4;
            p060Var = p060Var2;
            i3 = i19;
            i = i18;
            length = i21;
            i2 = i20;
            arrayList3 = arrayList3;
        }
        ArrayList arrayList5 = arrayList;
        int i23 = i2;
        int i24 = i3;
        float f27 = f3;
        ArrayList arrayList6 = new ArrayList();
        int i25 = i24;
        while (i25 < length) {
            int i26 = i25 + 1;
            int i27 = i26 % length;
            int i28 = i25 * 2;
            long jA4 = ywh.a(fArr[i28], fArr[i28 + 1]);
            int i29 = (((i25 + length) - 1) % length) * 2;
            long jA5 = ywh.a(fArr[i29], fArr[i29 + 1]);
            int i30 = i27 * 2;
            long jA6 = ywh.a(fArr[i30], fArr[i30 + 1]);
            long jF = a020.f(jA4, jA5);
            long jF2 = a020.f(jA6, jA4);
            arrayList6.add(new ubh.a((a020.e(jF2) * a020.d(jF)) - (a020.d(jF2) * a020.e(jF)) > f27 ? i23 : i24, jA4, ((h060) arrayList2.get(i25)).i, (List) arrayList5.get(i25)));
            float fA6 = ((e4c) CollectionsKt.b0((List) arrayList5.get(i25))).a();
            float fB4 = ((e4c) CollectionsKt.b0((List) arrayList5.get(i25))).b();
            float f28 = ((e4c) CollectionsKt.T((List) arrayList5.get(i27))).a[i24];
            float f29 = ((e4c) CollectionsKt.T((List) arrayList5.get(i27))).a[i23];
            arrayList6.add(new ubh.b(a.c(i4c.a(fA6, fB4, csh0.c(fA6, f28, 0.33333334f), csh0.c(fB4, f29, 0.33333334f), csh0.c(fA6, f28, 0.6666667f), csh0.c(fB4, f29, 0.6666667f), f28, f29))));
            i25 = i26;
        }
        if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
            float f30 = f27;
            float f31 = f30;
            int i31 = i24;
            while (i31 < fArr.length) {
                int i32 = i31 + 1;
                f31 += fArr[i31];
                i31 += 2;
                f30 += fArr[i32];
            }
            jA = ywh.a((f31 / fArr.length) / 2.0f, (f30 / fArr.length) / 2.0f);
        } else {
            jA = ywh.a(f, f2);
        }
        return new p060(arrayList6, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }
}
