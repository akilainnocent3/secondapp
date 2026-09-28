package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lll0 {
    public static final kml0 a;

    static {
        cll0 cll0Var = cll0.c;
        a = new kml0();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(Object obj, Object obj2) {
        thl0 thl0Var = (thl0) obj;
        iml0 iml0Var = thl0Var.zzc;
        iml0 iml0Var2 = ((thl0) obj2).zzc;
        iml0 iml0Var3 = iml0.f;
        if (!iml0Var3.equals(iml0Var2)) {
            if (iml0Var3.equals(iml0Var)) {
                int i = iml0Var.a + iml0Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(iml0Var.b, i);
                System.arraycopy(iml0Var2.b, 0, iArrCopyOf, iml0Var.a, iml0Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(iml0Var.c, i);
                System.arraycopy(iml0Var2.c, 0, objArrCopyOf, iml0Var.a, iml0Var2.a);
                iml0Var = new iml0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                iml0Var.getClass();
                if (!iml0Var2.equals(iml0Var3)) {
                    if (!iml0Var.e) {
                        bl0.a();
                        return;
                    }
                    int i2 = iml0Var.a + iml0Var2.a;
                    iml0Var.e(i2);
                    System.arraycopy(iml0Var2.b, 0, iml0Var.b, iml0Var.a, iml0Var2.a);
                    System.arraycopy(iml0Var2.c, 0, iml0Var.c, iml0Var.a, iml0Var2.a);
                    iml0Var.a = i2;
                }
            }
        }
        thl0Var.zzc = iml0Var;
    }

    public static void c(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof yfl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.l(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.w(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        yfl0 yfl0Var = (yfl0) list;
        if (!z) {
            while (i2 < yfl0Var.c) {
                yfl0Var.c(i2);
                qfl0Var.l(i, Double.doubleToRawLongBits(yfl0Var.b[i2]));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yfl0Var.c; i6++) {
            yfl0Var.c(i6);
            double d = yfl0Var.b[i6];
            i5 += 8;
        }
        qfl0Var.t(i5);
        while (i2 < yfl0Var.c) {
            yfl0Var.c(i2);
            qfl0Var.w(Double.doubleToRawLongBits(yfl0Var.b[i2]));
            i2++;
        }
    }

    public static void d(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof rgl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.j(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.u(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        rgl0 rgl0Var = (rgl0) list;
        if (!z) {
            while (i2 < rgl0Var.c) {
                rgl0Var.c(i2);
                qfl0Var.j(i, Float.floatToRawIntBits(rgl0Var.b[i2]));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < rgl0Var.c; i6++) {
            rgl0Var.c(i6);
            float f = rgl0Var.b[i6];
            i5 += 4;
        }
        qfl0Var.t(i5);
        while (i2 < rgl0Var.c) {
            rgl0Var.c(i2);
            qfl0Var.u(Float.floatToRawIntBits(rgl0Var.b[i2]));
            i2++;
        }
    }

    public static void e(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof njl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ufl0.a(((Long) list.get(i3)).longValue());
            }
            qfl0Var.t(iA);
            while (i2 < list.size()) {
                qfl0Var.v(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        njl0 njl0Var = (njl0) list;
        if (!z) {
            while (i2 < njl0Var.c) {
                qfl0Var.k(i, njl0Var.b(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < njl0Var.c; i4++) {
            iA2 += ufl0.a(njl0Var.b(i4));
        }
        qfl0Var.t(iA2);
        while (i2 < njl0Var.c) {
            qfl0Var.v(njl0Var.b(i2));
            i2++;
        }
    }

    public static void f(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof njl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ufl0.a(((Long) list.get(i3)).longValue());
            }
            qfl0Var.t(iA);
            while (i2 < list.size()) {
                qfl0Var.v(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        njl0 njl0Var = (njl0) list;
        if (!z) {
            while (i2 < njl0Var.c) {
                qfl0Var.k(i, njl0Var.b(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < njl0Var.c; i4++) {
            iA2 += ufl0.a(njl0Var.b(i4));
        }
        qfl0Var.t(iA2);
        while (i2 < njl0Var.c) {
            qfl0Var.v(njl0Var.b(i2));
            i2++;
        }
    }

    public static void g(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof njl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    qfl0Var.k(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iA += ufl0.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            qfl0Var.t(iA);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                qfl0Var.v((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        njl0 njl0Var = (njl0) list;
        if (!z) {
            while (i2 < njl0Var.c) {
                long jB = njl0Var.b(i2);
                qfl0Var.k(i, (jB >> 63) ^ (jB + jB));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < njl0Var.c; i4++) {
            long jB2 = njl0Var.b(i4);
            iA2 += ufl0.a((jB2 >> 63) ^ (jB2 + jB2));
        }
        qfl0Var.t(iA2);
        while (i2 < njl0Var.c) {
            long jB3 = njl0Var.b(i2);
            qfl0Var.v((jB3 >> 63) ^ (jB3 + jB3));
            i2++;
        }
    }

    public static void h(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof njl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        njl0 njl0Var = (njl0) list;
        if (!z) {
            while (i2 < njl0Var.c) {
                qfl0Var.l(i, njl0Var.b(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < njl0Var.c; i6++) {
            njl0Var.b(i6);
            i5 += 8;
        }
        qfl0Var.t(i5);
        while (i2 < njl0Var.c) {
            qfl0Var.w(njl0Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof njl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        njl0 njl0Var = (njl0) list;
        if (!z) {
            while (i2 < njl0Var.c) {
                qfl0Var.l(i, njl0Var.b(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < njl0Var.c; i6++) {
            njl0Var.b(i6);
            i5 += 8;
        }
        qfl0Var.t(i5);
        while (i2 < njl0Var.c) {
            qfl0Var.w(njl0Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ufl0.a(((Integer) list.get(i3)).intValue());
            }
            qfl0Var.t(iA);
            while (i2 < list.size()) {
                qfl0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                qfl0Var.h(i, vhl0Var.c(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < vhl0Var.c; i4++) {
            iA2 += ufl0.a(vhl0Var.c(i4));
        }
        qfl0Var.t(iA2);
        while (i2 < vhl0Var.c) {
            qfl0Var.s(vhl0Var.c(i2));
            i2++;
        }
    }

    public static void k(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += ufl0.f(((Integer) list.get(i3)).intValue());
            }
            qfl0Var.t(iF);
            while (i2 < list.size()) {
                qfl0Var.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                qfl0Var.i(i, vhl0Var.c(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < vhl0Var.c; i4++) {
            iF2 += ufl0.f(vhl0Var.c(i4));
        }
        qfl0Var.t(iF2);
        while (i2 < vhl0Var.c) {
            qfl0Var.t(vhl0Var.c(i2));
            i2++;
        }
    }

    public static void l(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    qfl0Var.i(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iF += ufl0.f((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            qfl0Var.t(iF);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                qfl0Var.t((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                int iC = vhl0Var.c(i2);
                qfl0Var.i(i, (iC >> 31) ^ (iC + iC));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < vhl0Var.c; i4++) {
            int iC2 = vhl0Var.c(i4);
            iF2 += ufl0.f((iC2 >> 31) ^ (iC2 + iC2));
        }
        qfl0Var.t(iF2);
        while (i2 < vhl0Var.c) {
            int iC3 = vhl0Var.c(i2);
            qfl0Var.t((iC3 >> 31) ^ (iC3 + iC3));
            i2++;
        }
    }

    public static void m(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                qfl0Var.j(i, vhl0Var.c(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vhl0Var.c; i6++) {
            vhl0Var.c(i6);
            i5 += 4;
        }
        qfl0Var.t(i5);
        while (i2 < vhl0Var.c) {
            qfl0Var.u(vhl0Var.c(i2));
            i2++;
        }
    }

    public static void n(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                qfl0Var.j(i, vhl0Var.c(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vhl0Var.c; i6++) {
            vhl0Var.c(i6);
            i5 += 4;
        }
        qfl0Var.t(i5);
        while (i2 < vhl0Var.c) {
            qfl0Var.u(vhl0Var.c(i2));
            i2++;
        }
    }

    public static void o(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof vhl0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ufl0.a(((Integer) list.get(i3)).intValue());
            }
            qfl0Var.t(iA);
            while (i2 < list.size()) {
                qfl0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vhl0 vhl0Var = (vhl0) list;
        if (!z) {
            while (i2 < vhl0Var.c) {
                qfl0Var.h(i, vhl0Var.c(i2));
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < vhl0Var.c; i4++) {
            iA2 += ufl0.a(vhl0Var.c(i4));
        }
        qfl0Var.t(iA2);
        while (i2 < vhl0Var.c) {
            qfl0Var.s(vhl0Var.c(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void p(int i, List list, cnl0 cnl0Var, boolean z) throws sfl0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        qfl0 qfl0Var = ((wfl0) cnl0Var).a;
        int i2 = 0;
        if (!(list instanceof mel0)) {
            if (!z) {
                while (i2 < list.size()) {
                    qfl0Var.m(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            qfl0Var.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            qfl0Var.t(i3);
            while (i2 < list.size()) {
                qfl0Var.r(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        mel0 mel0Var = (mel0) list;
        if (!z) {
            while (i2 < mel0Var.c) {
                mel0Var.c(i2);
                qfl0Var.m(i, mel0Var.b[i2]);
                i2++;
            }
            return;
        }
        qfl0Var.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mel0Var.c; i6++) {
            mel0Var.c(i6);
            boolean z2 = mel0Var.b[i6];
            i5++;
        }
        qfl0Var.t(i5);
        while (i2 < mel0Var.c) {
            mel0Var.c(i2);
            qfl0Var.r(mel0Var.b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof njl0)) {
            int iA = 0;
            while (i < size) {
                iA += ufl0.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        njl0 njl0Var = (njl0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += ufl0.a(njl0Var.b(i));
            i++;
        }
        return iA2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof njl0)) {
            int iA = 0;
            while (i < size) {
                iA += ufl0.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        njl0 njl0Var = (njl0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += ufl0.a(njl0Var.b(i));
            i++;
        }
        return iA2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof njl0)) {
            int iA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iA += ufl0.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iA;
        }
        njl0 njl0Var = (njl0) list;
        int iA2 = 0;
        while (i < size) {
            long jB = njl0Var.b(i);
            iA2 += ufl0.a((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iA2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vhl0)) {
            int iA = 0;
            while (i < size) {
                iA += ufl0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        vhl0 vhl0Var = (vhl0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += ufl0.a(vhl0Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vhl0)) {
            int iA = 0;
            while (i < size) {
                iA += ufl0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        vhl0 vhl0Var = (vhl0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += ufl0.a(vhl0Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vhl0)) {
            int iF = 0;
            while (i < size) {
                iF += ufl0.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        vhl0 vhl0Var = (vhl0) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += ufl0.f(vhl0Var.c(i));
            i++;
        }
        return iF2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vhl0)) {
            int iF = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iF += ufl0.f((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iF;
        }
        vhl0 vhl0Var = (vhl0) list;
        int iF2 = 0;
        while (i < size) {
            int iC = vhl0Var.c(i);
            iF2 += ufl0.f((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iF2;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ufl0.f(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ufl0.f(i << 3) + 8) * size;
    }

    public static int z(int i, Object obj, ill0 ill0Var) {
        int i2 = i << 3;
        if (obj instanceof wil0) {
            int iF = ufl0.f(i2);
            int iA = ((wil0) obj).a();
            return qkl0.a(iA, iA, iF);
        }
        int iF2 = ufl0.f(i2);
        int iF3 = ((bel0) ((lkl0) obj)).f(ill0Var);
        return qkl0.a(iF3, iF3, iF2);
    }
}
