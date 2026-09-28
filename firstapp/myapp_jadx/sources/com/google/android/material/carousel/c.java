package com.google.android.material.carousel;

import defpackage.dj0;
import defpackage.hb5;
import defpackage.ph6;
import defpackage.rh6;
import defpackage.uts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public final b a;
    public final List<b> b;
    public final List<b> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = bVar;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((b) rh6.a(1, arrayList)).b().a - bVar.b().a;
        this.f = f;
        float f2 = bVar.d().a - ((b) rh6.a(1, arrayList2)).d().a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            b bVar = (b) arrayList.get(i2);
            b bVar2 = (b) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? bVar2.b().a - bVar.b().a : bVar.d().a - bVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static b e(b bVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(bVar.c);
        arrayList.add(i2, (b.C0192b) arrayList.remove(i));
        b.a aVar = new b.a(i5, bVar.a);
        float f2 = f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            b.C0192b c0192b = (b.C0192b) arrayList.get(i6);
            float f3 = c0192b.d;
            aVar.b((f3 / 2.0f) + f2, c0192b.c, f3, i6 >= i3 && i6 <= i4, c0192b.e, c0192b.f, 0.0f, 0.0f);
            f2 += c0192b.d;
            i6++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f, int i, boolean z, float f2) {
        int i2;
        List<b.C0192b> list = bVar.c;
        ArrayList arrayList = new ArrayList(list);
        float f3 = bVar.a;
        b.a aVar = new b.a(i, f3);
        Iterator<b.C0192b> it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (it.next().e) {
                i3++;
            }
        }
        float size = f / (list.size() - i3);
        float f4 = z ? f : 0.0f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            b.C0192b c0192b = (b.C0192b) arrayList.get(i4);
            if (c0192b.e) {
                i2 = i4;
                aVar.b(c0192b.b, c0192b.c, c0192b.d, false, true, c0192b.f, 0.0f, 0.0f);
            } else {
                i2 = i4;
                boolean z2 = i2 >= bVar.d && i2 <= bVar.e;
                float f5 = c0192b.d - size;
                float fA = ph6.a(f5, f3, f2);
                float f6 = (f5 / 2.0f) + f4;
                float fAbs = Math.abs(f6 - c0192b.b);
                float f7 = c0192b.f;
                float f8 = fAbs;
                if (!z) {
                    fAbs = 0.0f;
                }
                if (z) {
                    f8 = 0.0f;
                }
                aVar.b(f6, fA, f5, z2, false, f7, fAbs, f8);
                f4 += f5;
            }
            i4 = i2 + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return (b) uts.a(1, this.c);
    }

    public final b b(float f, float f2, float f3) {
        float fB;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().a().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = dj0.b(1.0f, 0.0f, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.a;
            }
            fB = dj0.b(0.0f, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (fB <= f11) {
                fArr2 = new float[]{dj0.b(0.0f, 1.0f, f10, f11, fB), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = bVar.a;
        List<b.C0192b> list2 = bVar.c;
        if (f13 != bVar2.a) {
            hb5.a("Keylines being linearly interpolated must have the same item size.");
            return null;
        }
        List<b.C0192b> list3 = bVar2.c;
        if (list2.size() != list3.size()) {
            hb5.a("Keylines being linearly interpolated must have the same number of keylines.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b.C0192b c0192b = list2.get(i2);
            b.C0192b c0192b2 = list3.get(i2);
            arrayList.add(new b.C0192b(dj0.a(c0192b.a, c0192b2.a, f12), dj0.a(c0192b.b, c0192b2.b, f12), dj0.a(c0192b.c, c0192b2.c, f12), dj0.a(c0192b.d, c0192b2.d, f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new b(bVar.a, arrayList, dj0.c(f12, bVar.d, bVar2.d), dj0.c(f12, bVar.e, bVar2.e), bVar.f);
    }

    public final b c() {
        return (b) uts.a(1, this.b);
    }
}
