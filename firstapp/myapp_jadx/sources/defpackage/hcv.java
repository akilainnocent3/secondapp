package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hcv {
    public static final p060 a;
    public static final p060 b;
    public static final p060 c;
    public static final p060 d;
    public static final p060 e;
    public static final p060 f;
    public static final p060 g;

    static {
        w4b w4bVar = new w4b(0.15f, 0.0f);
        w4b w4bVar2 = new w4b(0.2f, 0.0f);
        w4b w4bVar3 = new w4b(0.3f, 0.0f);
        w4b w4bVar4 = new w4b(0.5f, 0.0f);
        w4b w4bVar5 = new w4b(1.0f, 0.0f);
        c(wy80.a(14));
        c(q060.b(new float[]{0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f}, w4bVar3, null, 0.0f, 0.0f));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(new PointF(0.926f, 0.97f), new w4b(0.189f, 0.811f)));
        arrayList.add(new a(new PointF(-0.021f, 0.967f), new w4b(0.187f, 0.057f)));
        c(b(arrayList, 2, false));
        w4b w4bVar6 = w4b.c;
        c(yy80.a(q060.a(4, 1.0f, w4bVar6, Arrays.asList(w4bVar5, w4bVar5, w4bVar2, w4bVar2)), a(-135.0f)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new a(new PointF(1.0f, 1.0f), new w4b(0.148f, 0.417f)));
        arrayList2.add(new a(new PointF(0.0f, 1.0f), new w4b(0.151f, 0.0f)));
        arrayList2.add(new a(new PointF(0.0f, 0.0f), new w4b(0.148f, 0.0f)));
        arrayList2.add(new a(new PointF(0.978f, 0.02f), new w4b(0.803f, 0.0f)));
        c(b(arrayList2, 1, false));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new a(new PointF(0.5f, 0.892f), new w4b(0.313f, 0.0f)));
        arrayList3.add(new a(new PointF(-0.216f, 1.05f), new w4b(0.207f, 0.0f)));
        arrayList3.add(new a(new PointF(0.499f, -0.16f), new w4b(0.215f, 1.0f)));
        arrayList3.add(new a(new PointF(1.225f, 1.06f), new w4b(0.211f, 0.0f)));
        c(b(arrayList3, 1, false));
        c(q060.b(new float[]{0.8f, 0.5f, -0.8f, 0.5f, -0.8f, -0.5f, 0.8f, -0.5f}, w4bVar6, Arrays.asList(w4bVar2, w4bVar2, w4bVar5, w4bVar5), 0.0f, 0.0f));
        p060 p060VarA = wy80.a(15);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, 0.64f);
        a = c(yy80.a(yy80.a(p060VarA, matrix), a(-45.0f)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new a(new PointF(0.961f, 0.039f), new w4b(0.426f, 0.0f)));
        arrayList4.add(new a(new PointF(1.001f, 0.428f)));
        arrayList4.add(new a(new PointF(1.0f, 0.609f), w4bVar5));
        b = c(b(arrayList4, 2, true));
        c(yy80.a(q060.a(3, 1.0f, w4bVar2, null), a(-90.0f)));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new a(new PointF(0.5f, 1.096f), new w4b(0.151f, 0.524f)));
        arrayList5.add(new a(new PointF(0.04f, 0.5f), new w4b(0.159f, 0.0f)));
        c(b(arrayList5, 2, false));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new a(new PointF(0.171f, 0.841f), new w4b(0.159f, 0.0f)));
        arrayList6.add(new a(new PointF(-0.02f, 0.5f), new w4b(0.14f, 0.0f)));
        arrayList6.add(new a(new PointF(0.17f, 0.159f), new w4b(0.159f, 0.0f)));
        c(b(arrayList6, 2, false));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new a(new PointF(0.5f, -0.009f), new w4b(0.172f, 0.0f)));
        c = c(b(arrayList7, 5, false));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new a(new PointF(0.499f, 1.023f), new w4b(0.241f, 0.778f)));
        arrayList8.add(new a(new PointF(-0.005f, 0.792f), new w4b(0.208f, 0.0f)));
        arrayList8.add(new a(new PointF(0.073f, 0.258f), new w4b(0.228f, 0.0f)));
        arrayList8.add(new a(new PointF(0.433f, -0.0f), new w4b(0.491f, 0.0f)));
        c(yy80.a(b(arrayList8, 1, true), a(-90.0f)));
        d = c(wy80.b(8, 0.8f, w4bVar));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new a(new PointF(0.5f, 1.08f), new w4b(0.085f, 0.0f)));
        arrayList9.add(new a(new PointF(0.358f, 0.843f), new w4b(0.085f, 0.0f)));
        c(b(arrayList9, 8, false));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new a(new PointF(1.237f, 1.236f), new w4b(0.258f, 0.0f)));
        arrayList10.add(new a(new PointF(0.5f, 0.918f), new w4b(0.233f, 0.0f)));
        e = c(b(arrayList10, 4, false));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new a(new PointF(0.723f, 0.884f), new w4b(0.394f, 0.0f)));
        arrayList11.add(new a(new PointF(0.5f, 1.099f), new w4b(0.398f, 0.0f)));
        c(b(arrayList11, 6, false));
        c(yy80.a(wy80.b(7, 0.75f, w4bVar4), a(-90.0f)));
        f = c(yy80.a(wy80.b(9, 0.8f, w4bVar4), a(-90.0f)));
        c(yy80.a(wy80.b(12, 0.8f, w4bVar4), a(-90.0f)));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new a(new PointF(0.5f, 0.0f), w4bVar5));
        arrayList12.add(new a(new PointF(1.0f, 0.0f), w4bVar5));
        arrayList12.add(new a(new PointF(1.0f, 1.14f), new w4b(0.254f, 0.106f)));
        arrayList12.add(new a(new PointF(0.575f, 0.906f), new w4b(0.253f, 0.0f)));
        c(b(arrayList12, 1, true));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new a(new PointF(0.5f, 0.074f)));
        arrayList13.add(new a(new PointF(0.725f, -0.099f), new w4b(0.476f, 0.0f)));
        c(b(arrayList13, 4, true));
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add(new a(new PointF(0.5f, 0.036f)));
        arrayList14.add(new a(new PointF(0.758f, -0.101f), new w4b(0.209f, 0.0f)));
        c(b(arrayList14, 8, false));
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add(new a(new PointF(0.5f, -0.006f), new w4b(0.006f, 0.0f)));
        arrayList15.add(new a(new PointF(0.592f, 0.158f), new w4b(0.006f, 0.0f)));
        c(b(arrayList15, 12, false));
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add(new a(new PointF(0.193f, 0.277f), new w4b(0.053f, 0.0f)));
        arrayList16.add(new a(new PointF(0.176f, 0.055f), new w4b(0.053f, 0.0f)));
        g = c(b(arrayList16, 10, false));
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add(new a(new PointF(0.457f, 0.296f), new w4b(0.007f, 0.0f)));
        arrayList17.add(new a(new PointF(0.5f, -0.051f), new w4b(0.007f, 0.0f)));
        c(b(arrayList17, 15, false));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add(new a(new PointF(0.733f, 0.454f)));
        arrayList18.add(new a(new PointF(0.839f, 0.437f), new w4b(0.532f, 0.0f)));
        arrayList18.add(new a(new PointF(0.949f, 0.449f), new w4b(0.439f, 1.0f)));
        arrayList18.add(new a(new PointF(0.998f, 0.478f), new w4b(0.174f, 0.0f)));
        c(b(arrayList18, 16, true));
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add(new a(new PointF(0.37f, 0.187f)));
        arrayList19.add(new a(new PointF(0.416f, 0.049f), new w4b(0.381f, 0.0f)));
        arrayList19.add(new a(new PointF(0.479f, 0.0f), new w4b(0.095f, 0.0f)));
        c(b(arrayList19, 8, true));
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add(new a(new PointF(0.5f, 0.053f)));
        arrayList20.add(new a(new PointF(0.545f, -0.04f), new w4b(0.405f, 0.0f)));
        arrayList20.add(new a(new PointF(0.67f, -0.035f), new w4b(0.426f, 0.0f)));
        arrayList20.add(new a(new PointF(0.717f, 0.066f), new w4b(0.574f, 0.0f)));
        arrayList20.add(new a(new PointF(0.722f, 0.128f)));
        arrayList20.add(new a(new PointF(0.777f, 0.002f), new w4b(0.36f, 0.0f)));
        arrayList20.add(new a(new PointF(0.914f, 0.149f), new w4b(0.66f, 0.0f)));
        arrayList20.add(new a(new PointF(0.926f, 0.289f), new w4b(0.66f, 0.0f)));
        arrayList20.add(new a(new PointF(0.881f, 0.346f)));
        arrayList20.add(new a(new PointF(0.94f, 0.344f), new w4b(0.126f, 0.0f)));
        arrayList20.add(new a(new PointF(1.003f, 0.437f), new w4b(0.255f, 0.0f)));
        p060 p060VarB = b(arrayList20, 2, true);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(1.0f, 0.742f);
        c(yy80.a(p060VarB, matrix2));
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add(new a(new PointF(0.87f, 0.13f), new w4b(0.146f, 0.0f)));
        arrayList21.add(new a(new PointF(0.818f, 0.357f)));
        arrayList21.add(new a(new PointF(1.0f, 0.332f), new w4b(0.853f, 0.0f)));
        c(b(arrayList21, 4, true));
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(new a(new PointF(0.5f, 0.0f)));
        arrayList22.add(new a(new PointF(0.704f, 0.0f)));
        arrayList22.add(new a(new PointF(0.704f, 0.065f)));
        arrayList22.add(new a(new PointF(0.843f, 0.065f)));
        arrayList22.add(new a(new PointF(0.843f, 0.148f)));
        arrayList22.add(new a(new PointF(0.926f, 0.148f)));
        arrayList22.add(new a(new PointF(0.926f, 0.296f)));
        arrayList22.add(new a(new PointF(1.0f, 0.296f)));
        c(b(arrayList22, 2, true));
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add(new a(new PointF(0.11f, 0.5f)));
        arrayList23.add(new a(new PointF(0.113f, 0.0f)));
        arrayList23.add(new a(new PointF(0.287f, 0.0f)));
        arrayList23.add(new a(new PointF(0.287f, 0.087f)));
        arrayList23.add(new a(new PointF(0.421f, 0.087f)));
        arrayList23.add(new a(new PointF(0.421f, 0.17f)));
        arrayList23.add(new a(new PointF(0.56f, 0.17f)));
        arrayList23.add(new a(new PointF(0.56f, 0.265f)));
        arrayList23.add(new a(new PointF(0.674f, 0.265f)));
        arrayList23.add(new a(new PointF(0.675f, 0.344f)));
        arrayList23.add(new a(new PointF(0.789f, 0.344f)));
        arrayList23.add(new a(new PointF(0.789f, 0.439f)));
        arrayList23.add(new a(new PointF(0.888f, 0.439f)));
        c(b(arrayList23, 1, true));
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add(new a(new PointF(0.796f, 0.5f)));
        arrayList24.add(new a(new PointF(0.853f, 0.518f), w4bVar5));
        arrayList24.add(new a(new PointF(0.992f, 0.631f), w4bVar5));
        arrayList24.add(new a(new PointF(0.968f, 1.0f), w4bVar5));
        c(b(arrayList24, 2, true));
        ArrayList arrayList25 = new ArrayList();
        arrayList25.add(new a(new PointF(0.5f, 0.268f), new w4b(0.016f, 0.0f)));
        arrayList25.add(new a(new PointF(0.792f, -0.066f), new w4b(0.958f, 0.0f)));
        arrayList25.add(new a(new PointF(1.064f, 0.276f), w4bVar5));
        arrayList25.add(new a(new PointF(0.501f, 0.946f), new w4b(0.129f, 0.0f)));
        c(b(arrayList25, 1, true));
    }

    public static Matrix a(float f2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f2);
        return matrix;
    }

    public static p060 b(ArrayList arrayList, int i, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            PointF pointF = ((a) obj).a;
            pointF.offset(-0.5f, -0.5f);
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            float fHypot = (float) Math.hypot(pointF.x, pointF.y);
            pointF.x = fAtan2;
            pointF.y = fHypot;
        }
        float f2 = (float) (6.283185307179586d / ((double) i));
        if (z) {
            int i3 = i * 2;
            float f3 = f2 / 2.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    boolean z2 = i4 % 2 != 0;
                    int size2 = z2 ? (arrayList.size() - 1) - i5 : i5;
                    a aVar = (a) arrayList.get(size2);
                    if (size2 > 0 || !z2) {
                        arrayList2.add(new a(new PointF((i4 * f3) + (z2 ? (((a) arrayList.get(0)).a.x * 2.0f) + (f3 - aVar.a.x) : aVar.a.x), aVar.a.y), aVar.b));
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < i; i6++) {
                int size3 = arrayList.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    a aVar2 = (a) obj2;
                    arrayList2.add(new a(new PointF((i6 * f2) + aVar2.a.x, aVar2.a.y), aVar2.b));
                }
            }
        }
        int size4 = arrayList2.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            PointF pointF2 = ((a) obj3).a;
            float fCos = (float) ((Math.cos(pointF2.x) * ((double) pointF2.y)) + 0.5d);
            float fSin = (float) ((Math.sin(pointF2.x) * ((double) pointF2.y)) + 0.5d);
            pointF2.x = fCos;
            pointF2.y = fSin;
        }
        float[] fArr = new float[arrayList2.size() * 2];
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            int i10 = i9 * 2;
            fArr[i10] = ((a) arrayList2.get(i9)).a.x;
            fArr[i10 + 1] = ((a) arrayList2.get(i9)).a.y;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList3.add(((a) arrayList2.get(i11)).b);
        }
        return q060.b(fArr, w4b.c, arrayList3, 0.5f, 0.5f);
    }

    public static p060 c(p060 p060Var) {
        return d(p060Var, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }

    public static p060 d(p060 p060Var, RectF rectF) {
        float[] fArr = new float[4];
        ngs ngsVar = p060Var.d;
        float f2 = p060Var.c;
        float f3 = p060Var.b;
        int b2 = ngsVar.getB();
        float fMax = 0.0f;
        for (int i = 0; i < b2; i++) {
            e4c e4cVar = (e4c) ngsVar.get(i);
            float[] fArr2 = e4cVar.a;
            float f4 = fArr2[0] - f3;
            float f5 = fArr2[1] - f2;
            float f6 = csh0.b;
            float f7 = (f5 * f5) + (f4 * f4);
            long jC = e4cVar.c(0.5f);
            float fD = a020.d(jC) - f3;
            float fE = a020.e(jC) - f2;
            fMax = Math.max(fMax, Math.max(f7, (fE * fE) + (fD * fD)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        fArr[0] = f3 - fSqrt;
        fArr[1] = f2 - fSqrt;
        fArr[2] = f3 + fSqrt;
        fArr[3] = f2 + fSqrt;
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMin = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        matrix.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        return yy80.a(p060Var, matrix);
    }

    public static class a {
        public final PointF a;
        public final w4b b;

        public a(PointF pointF, w4b w4bVar) {
            this.a = pointF;
            this.b = w4bVar;
        }

        public a(PointF pointF) {
            this(pointF, w4b.c);
        }
    }
}
