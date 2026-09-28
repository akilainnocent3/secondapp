package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bzo {
    public static final g a = new g(true);
    public static final a b = new a(true);
    public static final e c = new e(false);
    public static final d d = new d(true);
    public static final f e = new f(true);
    public static final h f = new h(true);
    public static final i g = new i(false);
    public static final j h = new j(true);
    public static final k i = new k(true);
    public static final b j = new b(true);
    public static final c k = new c(true);

    public static final class a extends djx<Boolean> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            boolean z = bundle.getBoolean(str, false);
            if (z || !bundle.getBoolean(str, true)) {
                return Boolean.valueOf(z);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "boolean_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Boolean h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Boolean) djx.l.h(str);
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Boolean bool) {
            Boolean bool2 = bool;
            str.getClass();
            if (bool2 == null) {
                bundle.putString(str, null);
            } else {
                djx.l.e(bundle, str, bool2);
            }
        }
    }

    public static final class b extends c48<double[]> {
        public static double[] j(String str) {
            str.getClass();
            return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
        }

        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            double[] doubleArray = bundle.getDoubleArray(str);
            if (doubleArray != null) {
                return doubleArray;
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "double[]";
        }

        @Override // defpackage.djx
        public final Object c(Object obj, String str) {
            double[] dArr = (double[]) obj;
            double[] dArrJ = j(str);
            if (dArr == null) {
                return dArrJ;
            }
            int length = dArr.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
            System.arraycopy(dArrJ, 0, dArrCopyOf, length, 1);
            return dArrCopyOf;
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ Object h(String str) {
            return j(str);
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            double[] dArr = (double[]) obj;
            str.getClass();
            if (dArr == null) {
                bundle.putString(str, null);
            } else {
                bundle.putDoubleArray(str, dArr);
            }
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            Double[] dArr;
            double[] dArr2 = (double[]) obj;
            double[] dArr3 = (double[]) obj2;
            Double[] dArr4 = null;
            if (dArr2 != null) {
                dArr = new Double[dArr2.length];
                int length = dArr2.length;
                for (int i = 0; i < length; i++) {
                    dArr[i] = Double.valueOf(dArr2[i]);
                }
            } else {
                dArr = null;
            }
            if (dArr3 != null) {
                dArr4 = new Double[dArr3.length];
                int length2 = dArr3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr4[i2] = Double.valueOf(dArr3[i2]);
                }
            }
            return wx0.b(dArr, dArr4);
        }

        @Override // defpackage.c48
        public final double[] h() {
            return new double[0];
        }

        @Override // defpackage.c48
        public final List i(double[] dArr) {
            List<Double> listO;
            double[] dArr2 = dArr;
            if (dArr2 == null || (listO = ay0.O(dArr2)) == null) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList(l48.r(listO, 10));
            Iterator<T> it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }
    }

    public static final class c extends c48<List<? extends Double>> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            double[] doubleArray = bundle.getDoubleArray(str);
            if (doubleArray != null) {
                return ay0.O(doubleArray);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "List<Double>";
        }

        @Override // defpackage.djx
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            return list != null ? CollectionsKt.i0(kotlin.collections.a.c(Double.valueOf(Double.parseDouble(str))), list) : kotlin.collections.a.c(Double.valueOf(Double.parseDouble(str)));
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return kotlin.collections.a.c(Double.valueOf(Double.parseDouble(str)));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            if (list == null) {
                bundle.putString(str, null);
                return;
            }
            double[] dArr = new double[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                dArr[i] = ((Number) it.next()).doubleValue();
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return wx0.b(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }

        @Override // defpackage.c48
        public final List<? extends Double> h() {
            return m2g.a;
        }

        @Override // defpackage.c48
        public final List i(List<? extends Double> list) {
            List<? extends Double> list2 = list;
            if (list2 == null) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }
    }

    public static final class d extends djx<Double> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            double d = bundle.getDouble(str, Double.MIN_VALUE);
            if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                return Double.valueOf(d);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "double_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Double d) {
            Double d2 = d;
            str.getClass();
            if (d2 == null) {
                bundle.putString(str, null);
            } else {
                bundle.putDouble(str, d2.doubleValue());
            }
        }
    }

    public static final class e extends djx<Double> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            double d = bundle.getDouble(str, Double.MIN_VALUE);
            if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                return Double.valueOf(d);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "double";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Double d) {
            double dDoubleValue = d.doubleValue();
            str.getClass();
            bundle.putDouble(str, dDoubleValue);
        }
    }

    public static final class f extends djx<Float> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            float f = bundle.getFloat(str, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                return Float.valueOf(f);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "float_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Float h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Float f) {
            Float f2 = f;
            str.getClass();
            if (f2 == null) {
                bundle.putString(str, null);
            } else {
                djx.i.e(bundle, str, f2);
            }
        }
    }

    public static final class g extends djx<Integer> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!hv60.a(str, bundle) || hv60.f(str, bundle)) {
                return null;
            }
            return Integer.valueOf(hv60.b(str, bundle));
        }

        @Override // defpackage.djx
        public final String b() {
            return "integer_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Integer) djx.b.h(str);
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Integer num) {
            Integer num2 = num;
            str.getClass();
            if (num2 == null) {
                bundle.putString(str, null);
            } else {
                djx.b.e(bundle, str, num2);
            }
        }
    }

    public static final class h extends djx<Long> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                return Long.valueOf(j);
            }
            s5b.a(str);
            throw null;
        }

        @Override // defpackage.djx
        public final String b() {
            return "long_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Long h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Long) djx.f.h(str);
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Long l) {
            Long l2 = l;
            str.getClass();
            if (l2 == null) {
                bundle.putString(str, null);
            } else {
                djx.f.e(bundle, str, l2);
            }
        }
    }

    public static final class i extends djx<String> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (!hv60.a(str, bundle) || hv60.f(str, bundle)) ? "null" : hv60.d(str, bundle);
        }

        @Override // defpackage.djx
        public final String b() {
            return "string_non_nullable";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final String h(String str) {
            str.getClass();
            return str;
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, String str2) {
            String str3 = str2;
            str.getClass();
            str3.getClass();
            bundle.putString(str, str3);
        }

        @Override // defpackage.djx
        public final String f(String str) {
            String str2 = str;
            str2.getClass();
            String strEncode = Uri.encode(str2, null);
            strEncode.getClass();
            return strEncode;
        }
    }

    public static final class j extends c48<String[]> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            String[] strArrE = hv60.e(str, bundle);
            ArrayList arrayList = new ArrayList(strArrE.length);
            for (String str2 : strArrE) {
                arrayList.add((String) djx.o.h(str2));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // defpackage.djx
        public final String b() {
            return "string_nullable[]";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.djx
        public final Object c(Object obj, String str) {
            String[] strArr = (String[]) obj;
            cae0 cae0Var = djx.o;
            return strArr != null ? (String[]) xx0.p(strArr, new String[]{cae0Var.h(str)}) : new String[]{cae0Var.h(str)};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return new String[]{djx.o.h(str)};
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            String[] strArr = (String[]) obj;
            str.getClass();
            if (strArr == null) {
                bundle.putString(str, null);
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                if (str2 == null) {
                    str2 = "null";
                }
                arrayList.add(str2);
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            strArr2.getClass();
            bundle.putStringArray(str, strArr2);
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            return wx0.b((String[]) obj, (String[]) obj2);
        }

        @Override // defpackage.c48
        public final String[] h() {
            return new String[0];
        }

        @Override // defpackage.c48
        public final List i(String[] strArr) {
            String strEncode;
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                if (str != null) {
                    strEncode = Uri.encode(str, null);
                    strEncode.getClass();
                } else {
                    strEncode = "null";
                }
                arrayList.add(strEncode);
            }
            return arrayList;
        }
    }

    public static final class k extends c48<List<? extends String>> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
                return null;
            }
            List listS = ay0.S(hv60.e(str, bundle));
            ArrayList arrayList = new ArrayList(l48.r(listS, 10));
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                arrayList.add((String) djx.o.h((String) it.next()));
            }
            return arrayList;
        }

        @Override // defpackage.djx
        public final String b() {
            return "List<String?>";
        }

        @Override // defpackage.djx
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            cae0 cae0Var = djx.o;
            return list != null ? CollectionsKt.i0(kotlin.collections.a.c(cae0Var.h(str)), list) : kotlin.collections.a.c(cae0Var.h(str));
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return kotlin.collections.a.c(djx.o.h(str));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            List<String> list = (List) obj;
            str.getClass();
            if (list == null) {
                bundle.putString(str, null);
                return;
            }
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (String str2 : list) {
                if (str2 == null) {
                    str2 = "null";
                }
                arrayList.add(str2);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            bundle.putStringArray(str, strArr);
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return wx0.b(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // defpackage.c48
        public final List<? extends String> h() {
            return m2g.a;
        }

        @Override // defpackage.c48
        public final List i(List<? extends String> list) {
            String strEncode;
            List<? extends String> list2 = list;
            if (list2 == null) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            for (String str : list2) {
                if (str != null) {
                    strEncode = Uri.encode(str, null);
                    strEncode.getClass();
                } else {
                    strEncode = "null";
                }
                arrayList.add(strEncode);
            }
            return arrayList;
        }
    }
}
