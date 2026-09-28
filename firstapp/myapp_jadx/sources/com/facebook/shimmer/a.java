package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import defpackage.avg;
import defpackage.fcy;
import defpackage.hb5;
import defpackage.hce0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public PorterDuff.Mode q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;

    /* JADX INFO: renamed from: com.facebook.shimmer.a$a, reason: collision with other inner class name */
    public static class C0188a extends b<C0188a> {
        public C0188a() {
            this.a.p = true;
        }

        @Override // com.facebook.shimmer.a.b
        public final b c() {
            return this;
        }
    }

    public static abstract class b<T extends b<T>> {
        public final a a = new a();

        public final a a() {
            a aVar = this.a;
            int i = aVar.f;
            int[] iArr = aVar.b;
            if (i != 1) {
                int i2 = aVar.e;
                iArr[0] = i2;
                int i3 = aVar.d;
                iArr[1] = i3;
                iArr[2] = i3;
                iArr[3] = i2;
            } else {
                int i4 = aVar.d;
                iArr[0] = i4;
                iArr[1] = i4;
                int i5 = aVar.e;
                iArr[2] = i5;
                iArr[3] = i5;
            }
            float[] fArr = aVar.a;
            if (i != 1) {
                fArr[0] = Math.max(((1.0f - aVar.k) - aVar.l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - aVar.k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((aVar.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((aVar.k + 1.0f) + aVar.l) / 2.0f, 1.0f);
                return aVar;
            }
            fArr[0] = 0.0f;
            fArr[1] = Math.min(aVar.k, 1.0f);
            fArr[2] = Math.min(aVar.k + aVar.l, 1.0f);
            fArr[3] = 1.0f;
            return aVar;
        }

        public T b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            a aVar = this.a;
            if (zHasValue) {
                aVar.n = typedArray.getBoolean(3, aVar.n);
            }
            if (typedArray.hasValue(0)) {
                aVar.o = typedArray.getBoolean(0, aVar.o);
            }
            if (typedArray.hasValue(1)) {
                d(typedArray.getFloat(1, 0.3f));
            }
            if (typedArray.hasValue(11)) {
                h(typedArray.getFloat(11, 1.0f));
            }
            if (typedArray.hasValue(7)) {
                g(typedArray.getInt(7, (int) aVar.t));
            }
            if (typedArray.hasValue(14)) {
                aVar.r = typedArray.getInt(14, aVar.r);
            }
            if (typedArray.hasValue(15)) {
                long j = typedArray.getInt(15, (int) aVar.u);
                if (j < 0) {
                    hb5.a(avg.a(j, "Given a negative repeat delay: "));
                    return null;
                }
                aVar.u = j;
            }
            if (typedArray.hasValue(16)) {
                aVar.s = typedArray.getInt(16, aVar.s);
            }
            if (typedArray.hasValue(18)) {
                long j2 = typedArray.getInt(18, (int) aVar.v);
                if (j2 < 0) {
                    hb5.a(avg.a(j2, "Given a negative start delay: "));
                    return null;
                }
                aVar.v = j2;
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, aVar.c);
                if (i == 1) {
                    e(1);
                } else if (i == 2) {
                    e(2);
                } else if (i != 3) {
                    e(0);
                } else {
                    e(3);
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, aVar.f) != 1) {
                    aVar.f = 0;
                } else {
                    aVar.f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                f(typedArray.getFloat(6, aVar.l));
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, aVar.g);
                if (dimensionPixelSize < 0) {
                    hb5.a(hce0.a(dimensionPixelSize, "Given invalid width: "));
                    return null;
                }
                aVar.g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, aVar.h);
                if (dimensionPixelSize2 < 0) {
                    hb5.a(hce0.a(dimensionPixelSize2, "Given invalid height: "));
                    return null;
                }
                aVar.h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                float f = typedArray.getFloat(13, aVar.k);
                if (f < 0.0f) {
                    fcy.a(f, "Given invalid intensity value: ");
                    return null;
                }
                aVar.k = f;
            }
            if (typedArray.hasValue(20)) {
                float f2 = typedArray.getFloat(20, aVar.i);
                if (f2 < 0.0f) {
                    fcy.a(f2, "Given invalid width ratio: ");
                    return null;
                }
                aVar.i = f2;
            }
            if (typedArray.hasValue(10)) {
                float f3 = typedArray.getFloat(10, aVar.j);
                if (f3 < 0.0f) {
                    fcy.a(f3, "Given invalid height ratio: ");
                    return null;
                }
                aVar.j = f3;
            }
            if (typedArray.hasValue(19)) {
                aVar.m = typedArray.getFloat(19, aVar.m);
            }
            return (T) c();
        }

        public abstract T c();

        public final T d(float f) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24;
            a aVar = this.a;
            aVar.e = iMin | (aVar.e & 16777215);
            return (T) c();
        }

        public final T e(int i) {
            this.a.c = i;
            return (T) c();
        }

        public final T f(float f) {
            if (f >= 0.0f) {
                this.a.l = f;
                return (T) c();
            }
            fcy.a(f, "Given invalid dropoff value: ");
            return null;
        }

        public final T g(long j) {
            if (j >= 0) {
                this.a.t = j;
                return (T) c();
            }
            hb5.a(avg.a(j, "Given a negative duration: "));
            return null;
        }

        public final T h(float f) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24;
            a aVar = this.a;
            aVar.d = iMin | (aVar.d & 16777215);
            return (T) c();
        }
    }

    public static class c extends b<c> {
        @Override // com.facebook.shimmer.a.b
        public final b b(TypedArray typedArray) {
            super.b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            a aVar = this.a;
            if (zHasValue) {
                aVar.e = (typedArray.getColor(2, aVar.e) & 16777215) | (aVar.e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                aVar.d = typedArray.getColor(12, aVar.d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.a.b
        public final b c() {
            return this;
        }
    }

    public a() {
        new RectF();
        this.c = 0;
        this.d = -1;
        this.e = 1291845631;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 20.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = null;
        this.r = -1;
        this.s = 1;
        this.t = 1000L;
    }
}
