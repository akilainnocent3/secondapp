package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class on70 {
    public static final Class<?> a;
    public static final bgh0<?, ?> b;
    public static final fgh0 c;

    public static void A(int i, List<Long> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mjt;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.K0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO0 += q08.o0(list.get(i3).longValue());
            }
            q08Var.J0(iO0);
            while (i2 < list.size()) {
                q08Var.L0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        mjt mjtVar = (mjt) list;
        if (!z) {
            while (i2 < mjtVar.c) {
                q08Var.K0(i, mjtVar.getLong(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iO1 = 0;
        for (int i4 = 0; i4 < mjtVar.c; i4++) {
            iO1 += q08.o0(mjtVar.getLong(i4));
        }
        q08Var.J0(iO1);
        while (i2 < mjtVar.c) {
            q08Var.L0(mjtVar.getLong(i2));
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof svo)) {
            int iO0 = 0;
            while (i < size) {
                iO0 += q08.o0(list.get(i).intValue());
                i++;
            }
            return iO0;
        }
        svo svoVar = (svo) list;
        int iO1 = 0;
        while (i < size) {
            iO1 += q08.o0(svoVar.getInt(i));
            i++;
        }
        return iO1;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q08.m0(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q08.m0(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof svo)) {
            int iO0 = 0;
            while (i < size) {
                iO0 += q08.o0(list.get(i).intValue());
                i++;
            }
            return iO0;
        }
        svo svoVar = (svo) list;
        int iO1 = 0;
        while (i < size) {
            iO1 += q08.o0(svoVar.getInt(i));
            i++;
        }
        return iO1;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjt)) {
            int iO0 = 0;
            while (i < size) {
                iO0 += q08.o0(list.get(i).longValue());
                i++;
            }
            return iO0;
        }
        mjt mjtVar = (mjt) list;
        int iO1 = 0;
        while (i < size) {
            iO1 += q08.o0(mjtVar.getLong(i));
            i++;
        }
        return iO1;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof svo)) {
            int iJ0 = 0;
            while (i < size) {
                iJ0 += q08.j0(list.get(i).intValue());
                i++;
            }
            return iJ0;
        }
        svo svoVar = (svo) list;
        int iJ1 = 0;
        while (i < size) {
            iJ1 += q08.j0(svoVar.getInt(i));
            i++;
        }
        return iJ1;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjt)) {
            int iK0 = 0;
            while (i < size) {
                iK0 += q08.k0(list.get(i).longValue());
                i++;
            }
            return iK0;
        }
        mjt mjtVar = (mjt) list;
        int iK1 = 0;
        while (i < size) {
            iK1 += q08.k0(mjtVar.getLong(i));
            i++;
        }
        return iK1;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof svo)) {
            int iN0 = 0;
            while (i < size) {
                iN0 += q08.n0(list.get(i).intValue());
                i++;
            }
            return iN0;
        }
        svo svoVar = (svo) list;
        int iN1 = 0;
        while (i < size) {
            iN1 += q08.n0(svoVar.getInt(i));
            i++;
        }
        return iN1;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjt)) {
            int iO0 = 0;
            while (i < size) {
                iO0 += q08.o0(list.get(i).longValue());
                i++;
            }
            return iO0;
        }
        mjt mjtVar = (mjt) list;
        int iO1 = 0;
        while (i < size) {
            iO1 += q08.o0(mjtVar.getLong(i));
            i++;
        }
        return iO1;
    }

    public static <UT, UB> UB j(Object obj, int i, List<Integer> list, fyo.b bVar, UB ub, bgh0<UT, UB> bgh0Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) m(obj, i, iIntValue, ub, bgh0Var);
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
                ub = (UB) m(obj, i, iIntValue2, ub, bgh0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends mjh.a<FT>> void k(t3h<FT> t3hVar, T t, T t2) {
        q1a0 q1a0Var = t3hVar.c(t2).a;
        if (q1a0Var.isEmpty()) {
            return;
        }
        mjh<T> mjhVarD = t3hVar.d(t);
        if (q1a0Var.a.size() > 0) {
            mjhVarD.i(q1a0Var.d(0));
            throw null;
        }
        Iterator<T> it = q1a0Var.e().iterator();
        if (it.hasNext()) {
            mjhVarD.i((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i, int i2, UB ub, bgh0<UT, UB> bgh0Var) {
        if (ub == null) {
            ub = (UB) bgh0Var.f(obj);
        }
        bgh0Var.e(ub, i, i2);
        return ub;
    }

    public static void n(int i, List<Boolean> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof u15;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                q08Var.H0(i, 2);
                q08Var.J0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                q08Var.r0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3++;
        }
        q08Var.J0(i3);
        while (i2 < list.size()) {
            q08Var.q0(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List<Double> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bze;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                q08Var.H0(i, 2);
                q08Var.J0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                q08Var.x0(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 8;
        }
        q08Var.J0(i3);
        while (i2 < list.size()) {
            q08Var.y0(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void p(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.z0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO0 += q08.o0(list.get(i3).intValue());
            }
            q08Var.J0(iO0);
            while (i2 < list.size()) {
                q08Var.A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                q08Var.z0(i, svoVar.getInt(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iO1 = 0;
        for (int i4 = 0; i4 < svoVar.c; i4++) {
            iO1 += q08.o0(svoVar.getInt(i4));
        }
        q08Var.J0(iO1);
        while (i2 < svoVar.c) {
            q08Var.A0(svoVar.getInt(i2));
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.v0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                i3 += 4;
            }
            q08Var.J0(i3);
            while (i2 < list.size()) {
                q08Var.w0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                q08Var.v0(i, svoVar.getInt(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < svoVar.c; i6++) {
            svoVar.getInt(i6);
            i5 += 4;
        }
        q08Var.J0(i5);
        while (i2 < svoVar.c) {
            q08Var.w0(svoVar.getInt(i2));
            i2++;
        }
    }

    public static void r(int i, List<Long> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mjt;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.x0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                i3 += 8;
            }
            q08Var.J0(i3);
            while (i2 < list.size()) {
                q08Var.y0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        mjt mjtVar = (mjt) list;
        if (!z) {
            while (i2 < mjtVar.c) {
                q08Var.x0(i, mjtVar.getLong(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mjtVar.c; i6++) {
            mjtVar.getLong(i6);
            i5 += 8;
        }
        q08Var.J0(i5);
        while (i2 < mjtVar.c) {
            q08Var.y0(mjtVar.getLong(i2));
            i2++;
        }
    }

    public static void s(int i, List<Float> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof swh;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                q08Var.H0(i, 2);
                q08Var.J0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                q08Var.v0(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            i3 += 4;
        }
        q08Var.J0(i3);
        while (i2 < list.size()) {
            q08Var.w0(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void t(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.z0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO0 += q08.o0(list.get(i3).intValue());
            }
            q08Var.J0(iO0);
            while (i2 < list.size()) {
                q08Var.A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                q08Var.z0(i, svoVar.getInt(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iO1 = 0;
        for (int i4 = 0; i4 < svoVar.c; i4++) {
            iO1 += q08.o0(svoVar.getInt(i4));
        }
        q08Var.J0(iO1);
        while (i2 < svoVar.c) {
            q08Var.A0(svoVar.getInt(i2));
            i2++;
        }
    }

    public static void u(int i, List<Long> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mjt;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.K0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO0 += q08.o0(list.get(i3).longValue());
            }
            q08Var.J0(iO0);
            while (i2 < list.size()) {
                q08Var.L0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        mjt mjtVar = (mjt) list;
        if (!z) {
            while (i2 < mjtVar.c) {
                q08Var.K0(i, mjtVar.getLong(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iO1 = 0;
        for (int i4 = 0; i4 < mjtVar.c; i4++) {
            iO1 += q08.o0(mjtVar.getLong(i4));
        }
        q08Var.J0(iO1);
        while (i2 < mjtVar.c) {
            q08Var.L0(mjtVar.getLong(i2));
            i2++;
        }
    }

    public static void v(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.v0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                i3 += 4;
            }
            q08Var.J0(i3);
            while (i2 < list.size()) {
                q08Var.w0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                q08Var.v0(i, svoVar.getInt(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < svoVar.c; i6++) {
            svoVar.getInt(i6);
            i5 += 4;
        }
        q08Var.J0(i5);
        while (i2 < svoVar.c) {
            q08Var.w0(svoVar.getInt(i2));
            i2++;
        }
    }

    public static void w(int i, List<Long> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mjt;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.x0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                i3 += 8;
            }
            q08Var.J0(i3);
            while (i2 < list.size()) {
                q08Var.y0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        mjt mjtVar = (mjt) list;
        if (!z) {
            while (i2 < mjtVar.c) {
                q08Var.x0(i, mjtVar.getLong(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mjtVar.c; i6++) {
            mjtVar.getLong(i6);
            i5 += 8;
        }
        q08Var.J0(i5);
        while (i2 < mjtVar.c) {
            q08Var.y0(mjtVar.getLong(i2));
            i2++;
        }
    }

    public static void x(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = list.get(i2).intValue();
                    q08Var.I0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iJ0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iJ0 += q08.j0(list.get(i3).intValue());
            }
            q08Var.J0(iJ0);
            while (i2 < list.size()) {
                int iIntValue2 = list.get(i2).intValue();
                q08Var.J0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                int i4 = svoVar.getInt(i2);
                q08Var.I0(i, (i4 >> 31) ^ (i4 << 1));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iJ1 = 0;
        for (int i5 = 0; i5 < svoVar.c; i5++) {
            iJ1 += q08.j0(svoVar.getInt(i5));
        }
        q08Var.J0(iJ1);
        while (i2 < svoVar.c) {
            int i6 = svoVar.getInt(i2);
            q08Var.J0((i6 >> 31) ^ (i6 << 1));
            i2++;
        }
    }

    public static void y(int i, List<Long> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mjt;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = list.get(i2).longValue();
                    q08Var.K0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iK0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iK0 += q08.k0(list.get(i3).longValue());
            }
            q08Var.J0(iK0);
            while (i2 < list.size()) {
                long jLongValue2 = list.get(i2).longValue();
                q08Var.L0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        mjt mjtVar = (mjt) list;
        if (!z) {
            while (i2 < mjtVar.c) {
                long j = mjtVar.getLong(i2);
                q08Var.K0(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iK1 = 0;
        for (int i4 = 0; i4 < mjtVar.c; i4++) {
            iK1 += q08.k0(mjtVar.getLong(i4));
        }
        q08Var.J0(iK1);
        while (i2 < mjtVar.c) {
            long j2 = mjtVar.getLong(i2);
            q08Var.L0((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    public static void z(int i, List<Integer> list, z7k0 z7k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof svo;
        q08 q08Var = ((u08) z7k0Var).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    q08Var.I0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            q08Var.H0(i, 2);
            int iN0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iN0 += q08.n0(list.get(i3).intValue());
            }
            q08Var.J0(iN0);
            while (i2 < list.size()) {
                q08Var.J0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        svo svoVar = (svo) list;
        if (!z) {
            while (i2 < svoVar.c) {
                q08Var.I0(i, svoVar.getInt(i2));
                i2++;
            }
            return;
        }
        q08Var.H0(i, 2);
        int iN1 = 0;
        for (int i4 = 0; i4 < svoVar.c; i4++) {
            iN1 += q08.n0(svoVar.getInt(i4));
        }
        q08Var.J0(iN1);
        while (i2 < svoVar.c) {
            q08Var.J0(svoVar.getInt(i2));
            i2++;
        }
    }

    static {
        Class<?> cls;
        Class<?> cls2;
        w630 w630Var = w630.c;
        bgh0<?, ?> bgh0Var = null;
        try {
            cls = Class.forName(OdQr.LXVe);
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            w630 w630Var2 = w630.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                bgh0Var = (bgh0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = bgh0Var;
        c = new fgh0();
    }
}
