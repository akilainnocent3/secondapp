package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class nn70 {
    public static final Class<?> a;
    public static final agh0<?, ?> b;
    public static final agh0<?, ?> c;
    public static final egh0 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = x(false);
        c = x(true);
        d = new egh0();
    }

    public static <UT, UB> UB A(Object obj, int i, int i2, UB ub, agh0<UT, UB> agh0Var) {
        if (ub == null) {
            ub = (UB) agh0Var.f(obj);
        }
        agh0Var.e(ub, i, i2);
        return ub;
    }

    public static void B(int i, List<Boolean> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.l0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3++;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.k0(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void C(int i, List<ql5> list, y7k0 y7k0Var) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        t08 t08Var = (t08) y7k0Var;
        t08Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            t08Var.a.m0(i, list.get(i2));
        }
    }

    public static void D(int i, List<Double> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.p0(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 8;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.q0(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void E(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.r0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += r08.c0(list.get(i3).intValue());
        }
        aVar.x0(iC0);
        while (i2 < list.size()) {
            aVar.s0(list.get(i2).intValue());
            i2++;
        }
    }

    public static void F(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.n0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 4;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.o0(list.get(i2).intValue());
            i2++;
        }
    }

    public static void G(int i, List<Long> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.p0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 8;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.q0(list.get(i2).longValue());
            i2++;
        }
    }

    public static void H(int i, List<Float> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.n0(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 4;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.o0(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void I(int i, List<?> list, y7k0 y7k0Var, an70 an70Var) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        t08 t08Var = (t08) y7k0Var;
        t08Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            t08Var.b(i, list.get(i2), an70Var);
        }
    }

    public static void J(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.r0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += r08.c0(list.get(i3).intValue());
        }
        aVar.x0(iC0);
        while (i2 < list.size()) {
            aVar.s0(list.get(i2).intValue());
            i2++;
        }
    }

    public static void K(int i, List<Long> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.y0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iI0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iI0 += r08.i0(list.get(i3).longValue());
        }
        aVar.x0(iI0);
        while (i2 < list.size()) {
            aVar.z0(list.get(i2).longValue());
            i2++;
        }
    }

    public static void L(int i, List<?> list, y7k0 y7k0Var, an70 an70Var) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        t08 t08Var = (t08) y7k0Var;
        t08Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            r08.a aVar = t08Var.a;
            wnv wnvVar = (wnv) obj;
            aVar.v0(i, 2);
            aVar.x0(((d4) wnvVar).c(an70Var));
            an70Var.a(wnvVar, aVar.c);
        }
    }

    public static void M(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.n0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 4;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.o0(list.get(i2).intValue());
            i2++;
        }
    }

    public static void N(int i, List<Long> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.p0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 8;
        }
        aVar.x0(i3);
        while (i2 < list.size()) {
            aVar.q0(list.get(i2).longValue());
            i2++;
        }
    }

    public static void O(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = list.get(i2).intValue();
                aVar.w0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iH0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iH0 += r08.h0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        aVar.x0(iH0);
        while (i2 < list.size()) {
            int iIntValue3 = list.get(i2).intValue();
            aVar.x0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void P(int i, List<Long> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = list.get(i2).longValue();
                aVar.y0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iI0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iI0 += r08.i0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        aVar.x0(iI0);
        while (i2 < list.size()) {
            long jLongValue3 = list.get(i2).longValue();
            aVar.z0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void Q(int i, List<String> list, y7k0 y7k0Var) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!(list instanceof y0s)) {
            while (i2 < list.size()) {
                aVar.u0(i, list.get(i2));
                i2++;
            }
            return;
        }
        y0s y0sVar = (y0s) list;
        while (i2 < list.size()) {
            Object raw = y0sVar.getRaw(i2);
            if (raw instanceof String) {
                aVar.u0(i, (String) raw);
            } else {
                aVar.m0(i, (ql5) raw);
            }
            i2++;
        }
    }

    public static void R(int i, List<Integer> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.w0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iH0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH0 += r08.h0(list.get(i3).intValue());
        }
        aVar.x0(iH0);
        while (i2 < list.size()) {
            aVar.x0(list.get(i2).intValue());
            i2++;
        }
    }

    public static void S(int i, List<Long> list, y7k0 y7k0Var, boolean z) throws r08.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        r08.a aVar = ((t08) y7k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.y0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.v0(i, 2);
        int iI0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iI0 += r08.i0(list.get(i3).longValue());
        }
        aVar.x0(iI0);
        while (i2 < list.size()) {
            aVar.z0(list.get(i2).longValue());
            i2++;
        }
    }

    public static int a(int i, List<ql5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF0 = r08.f0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iF0 += r08.Y(list.get(i2));
        }
        return iF0;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rvo)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += r08.c0(list.get(i).intValue());
                i++;
            }
            return iC0;
        }
        rvo rvoVar = (rvo) list;
        int iC1 = 0;
        while (i < size) {
            rvoVar.b(i);
            iC1 += r08.c0(rvoVar.b[i]);
            i++;
        }
        return iC1;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r08.Z(i) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r08.a0(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rvo)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += r08.c0(list.get(i).intValue());
                i++;
            }
            return iC0;
        }
        rvo rvoVar = (rvo) list;
        int iC1 = 0;
        while (i < size) {
            rvoVar.b(i);
            iC1 += r08.c0(rvoVar.b[i]);
            i++;
        }
        return iC1;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (r08.f0(i) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ljt)) {
            int iI0 = 0;
            while (i < size) {
                iI0 += r08.i0(list.get(i).longValue());
                i++;
            }
            return iI0;
        }
        ljt ljtVar = (ljt) list;
        int iI1 = 0;
        while (i < size) {
            ljtVar.b(i);
            iI1 += r08.i0(ljtVar.b[i]);
            i++;
        }
        return iI1;
    }

    public static int l(int i, Object obj, an70 an70Var) {
        if (obj instanceof dur) {
            return r08.d0((dur) obj) + r08.f0(i);
        }
        int iF0 = r08.f0(i);
        int iC = ((d4) ((wnv) obj)).c(an70Var);
        return r08.h0(iC) + iC + iF0;
    }

    public static int m(int i, List<?> list, an70 an70Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF0 = r08.f0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof dur) {
                iF0 = r08.d0((dur) obj) + iF0;
            } else {
                int iC = ((d4) ((wnv) obj)).c(an70Var);
                iF0 = r08.h0(iC) + iC + iF0;
            }
        }
        return iF0;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rvo)) {
            int iH0 = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iH0 += r08.h0((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iH0;
        }
        rvo rvoVar = (rvo) list;
        int iH1 = 0;
        while (i < size) {
            rvoVar.b(i);
            int i2 = rvoVar.b[i];
            iH1 += r08.h0((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iH1;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ljt)) {
            int iI0 = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iI0 += r08.i0((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iI0;
        }
        ljt ljtVar = (ljt) list;
        int iI1 = 0;
        while (i < size) {
            ljtVar.b(i);
            long j = ljtVar.b[i];
            iI1 += r08.i0((j >> 63) ^ (j << 1));
            i++;
        }
        return iI1;
    }

    public static int r(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iF0 = r08.f0(i) * size;
        if (!(list instanceof y0s)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ql5) {
                    int size2 = ((ql5) obj).size();
                    iF0 = r08.h0(size2) + size2 + iF0;
                } else {
                    iF0 = r08.e0((String) obj) + iF0;
                }
                i2++;
            }
            return iF0;
        }
        y0s y0sVar = (y0s) list;
        while (i2 < size) {
            Object raw = y0sVar.getRaw(i2);
            if (raw instanceof ql5) {
                int size3 = ((ql5) raw).size();
                iF0 = r08.h0(size3) + size3 + iF0;
            } else {
                iF0 = r08.e0((String) raw) + iF0;
            }
            i2++;
        }
        return iF0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rvo)) {
            int iH0 = 0;
            while (i < size) {
                iH0 += r08.h0(list.get(i).intValue());
                i++;
            }
            return iH0;
        }
        rvo rvoVar = (rvo) list;
        int iH1 = 0;
        while (i < size) {
            rvoVar.b(i);
            iH1 += r08.h0(rvoVar.b[i]);
            i++;
        }
        return iH1;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r08.f0(i) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ljt)) {
            int iI0 = 0;
            while (i < size) {
                iI0 += r08.i0(list.get(i).longValue());
                i++;
            }
            return iI0;
        }
        ljt ljtVar = (ljt) list;
        int iI1 = 0;
        while (i < size) {
            ljtVar.b(i);
            iI1 += r08.i0(ljtVar.b[i]);
            i++;
        }
        return iI1;
    }

    public static <UT, UB> UB w(Object obj, int i, List<Integer> list, gyo.b bVar, UB ub, agh0<UT, UB> agh0Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) A(obj, i, iIntValue, ub, agh0Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) A(obj, i, iIntValue2, ub, agh0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static agh0<?, ?> x(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (agh0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static <T, FT extends njh.a<FT>> void y(s3h<FT> s3hVar, T t, T t2) {
        p1a0 p1a0Var = s3hVar.c(t2).a;
        if (p1a0Var.isEmpty()) {
            return;
        }
        njh<T> njhVarD = s3hVar.d(t);
        njhVarD.getClass();
        if (p1a0Var.b.size() > 0) {
            njhVarD.h(p1a0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = p1a0Var.e().iterator();
        if (it.hasNext()) {
            njhVarD.h(it.next());
            throw null;
        }
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
