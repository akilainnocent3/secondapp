package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qh.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50514h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f50515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f50516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f50517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f50518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f50519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f50520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f50521g;

    public c(@NonNull b bVar, List<b> list, List<b> list2) {
        this.f50515a = bVar;
        this.f50516b = Collections.unmodifiableList(list);
        this.f50517c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f50506a - bVar.c().f50506a;
        this.f50520f = f10;
        float f11 = bVar.j().f50506a - list2.get(list2.size() - 1).j().f50506a;
        this.f50521g = f11;
        this.f50518d = m(f10, list, true);
        this.f50519e = m(f11, list2, false);
    }

    public static int b(b bVar, float f10) {
        for (int i10 = bVar.i(); i10 < bVar.g().size(); i10++) {
            if (f10 == bVar.g().get(i10).f50508c) {
                return i10;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            if (!bVar.g().get(i10).f50510e) {
                return i10;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f10) {
        for (int iB = bVar.b() - 1; iB >= 0; iB--) {
            if (f10 == bVar.g().get(iB).f50508c) {
                return iB;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!bVar.g().get(size).f50510e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(qh.b bVar, b bVar2, float f10, float f11, float f12) {
        return new c(bVar2, p(bVar, bVar2, f10, f11), n(bVar, bVar2, f10, f12));
    }

    public static float[] m(float f10, List<b> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = list.get(i11);
            b bVar2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.c().f50506a - bVar.c().f50506a : bVar.j().f50506a - bVar2.j().f50506a) / f10);
            i10++;
        }
        return fArr;
    }

    public static List<b> n(qh.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iE = e(bVar2);
        float fB = bVar.d() ? bVar.b() : bVar.a();
        if (!r(bVar, bVar2) && iE != -1) {
            int i10 = iE - bVar2.i();
            float f12 = bVar2.c().f50507b - (bVar2.c().f50509d / 2.0f);
            if (i10 <= 0 && bVar2.h().f50511f > 0.0f) {
                arrayList.add(v(bVar2, f12 - bVar2.h().f50511f, fB));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + bVar2.g().get(i12).f50511f;
                int i13 = i12 + 1;
                b bVarT = t(bVar3, iE, i13 < bVar2.g().size() ? d(bVar3, bVar2.g().get(i13).f50508c) + 1 : 0, f12 - f14, bVar2.b() + i11 + 1, bVar2.i() + i11 + 1, fB);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, fB, false, f10);
                }
                arrayList.add(bVarT);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, fB, false, f10));
        }
        return arrayList;
    }

    public static float[] o(List<b> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{jh.b.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List<b> p(qh.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iC = c(bVar2);
        float fB = bVar.d() ? bVar.b() : bVar.a();
        if (!q(bVar2) && iC != -1) {
            int iB = bVar2.b() - iC;
            float f12 = bVar2.c().f50507b - (bVar2.c().f50509d / 2.0f);
            if (iB <= 0 && bVar2.a().f50511f > 0.0f) {
                arrayList.add(v(bVar2, f12 + bVar2.a().f50511f, fB));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = bVar2.g().size() - 1;
                float f14 = f13 + bVar2.g().get(i11).f50511f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(bVar3, bVar2.g().get(i12).f50508c) - 1;
                }
                b bVarT = t(bVar3, iC, size, f12 + f14, (bVar2.b() - i10) - 1, (bVar2.i() - i10) - 1, fB);
                if (i10 == iB - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, fB, true, f10);
                }
                arrayList.add(bVarT);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, fB, true, f10));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().f50507b - (bVar.a().f50509d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(qh.b bVar, b bVar2) {
        int iA = bVar.a();
        if (bVar.d()) {
            iA = bVar.b();
        }
        return bVar2.h().f50507b + (bVar2.h().f50509d / 2.0f) <= ((float) iA) && bVar2.h() == bVar2.k();
    }

    public static b s(List<b> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return b.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    public static b t(b bVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i11, (b.c) arrayList.remove(i10));
        b.C0469b c0469b = new b.C0469b(bVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i14);
            float f12 = cVar.f50509d;
            c0469b.e(f10 + (f12 / 2.0f), cVar.f50508c, f12, i14 >= i12 && i14 <= i13, cVar.f50510e, cVar.f50511f);
            f10 += cVar.f50509d;
            i14++;
        }
        return c0469b.i();
    }

    public static b u(b bVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(bVar.g());
        b.C0469b c0469b = new b.C0469b(bVar.f(), f11);
        float fL = f10 / bVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i10);
            if (cVar.f50510e) {
                c0469b.e(cVar.f50507b, cVar.f50508c, cVar.f50509d, false, true, cVar.f50511f);
            } else {
                boolean z11 = i10 >= bVar.b() && i10 <= bVar.i();
                float f14 = cVar.f50509d - fL;
                float fB = g.b(f14, bVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f50507b;
                c0469b.f(f15, fB, f14, z11, false, cVar.f50511f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return c0469b.i();
    }

    public static b v(b bVar, float f10, float f11) {
        return t(bVar, 0, 0, f10, bVar.b(), bVar.i(), f11);
    }

    public final b a(List<b> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    public b g() {
        return this.f50515a;
    }

    public b h() {
        List<b> list = this.f50517c;
        return list.get(list.size() - 1);
    }

    public Map<Integer, b> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f50515a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f50521g || i13 >= i10 - this.f50517c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<b> list = this.f50517c;
                map.put(numValueOf, list.get(s1.a.e(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f50520f || i17 < this.f50516b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<b> list2 = this.f50516b;
                map.put(numValueOf2, list2.get(s1.a.e(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public b j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    public b k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List<b> list;
        float[] fArr;
        float f13 = this.f50520f + f11;
        float f14 = f12 - this.f50521g;
        float f15 = l().a().f50512g;
        float f16 = h().h().f50513h;
        if (this.f50520f == f15) {
            f13 += f15;
        }
        if (this.f50521g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = jh.b.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f50516b;
            fArr = this.f50518d;
        } else {
            if (f10 <= f14) {
                return this.f50515a;
            }
            fB = jh.b.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f50517c;
            fArr = this.f50519e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    public b l() {
        List<b> list = this.f50516b;
        return list.get(list.size() - 1);
    }
}
