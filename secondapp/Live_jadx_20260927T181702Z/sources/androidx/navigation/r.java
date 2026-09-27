package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.session.fe;
import cv.k0;
import fr.a0;
import fr.g0;
import fr.h0;
import fr.i0;
import fr.r0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final q f18320c = new q(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<Integer> f18321d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<Integer> f18322e = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<int[]> f18323f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<List<Integer>> f18324g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<Long> f18325h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<long[]> f18326i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<List<Long>> f18327j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<Float> f18328k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<float[]> f18329l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<List<Float>> f18330m = new e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<Boolean> f18331n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<boolean[]> f18332o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<List<Boolean>> f18333p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<String> f18334q = new p();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<String[]> f18335r = new n();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final r<List<String>> f18336s = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f18338b = "nav_type";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n*L\n758#1:1213\n758#1:1214,3\n*E\n"})
    public static final class a extends t7.f<boolean[]> {
        public a() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "boolean[]";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] n() {
            return new boolean[0];
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean[] o(String value) {
            m0.p(value, "value");
            return new boolean[]{r.f18331n.o(value).booleanValue()};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean[] j(String value, boolean[] zArr) {
            boolean[] zArrE3;
            m0.p(value, "value");
            return (zArr == null || (zArrE3 = fr.q.E3(zArr, i(value))) == null) ? i(value) : zArrE3;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, boolean[] zArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(boolean[] zArr) {
            List<Boolean> listWy;
            if (zArr == null || (listWy = a0.Wy(zArr)) == null) {
                return h0.J();
            }
            List<Boolean> list = listWy;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(boolean[] zArr, boolean[] zArr2) {
            return fr.p.g(zArr != null ? fr.q.M4(zArr) : null, zArr2 != null ? fr.q.M4(zArr2) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolListType$1\n*L\n795#1:1213,2\n796#1:1215,2\n801#1:1217\n801#1:1218,3\n*E\n"})
    public static final class b extends t7.f<List<? extends Boolean>> {
        public b() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "List<Boolean>";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Boolean> n() {
            return h0.J();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Boolean> b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return a0.Wy(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Boolean> o(String value) {
            m0.p(value, "value");
            return g0.l(r.f18331n.o(value));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Boolean> j(String value, List<Boolean> list) {
            List<Boolean> listI4;
            m0.p(value, "value");
            return (list == null || (listI4 = r0.I4(list, i(value))) == null) ? i(value) : listI4;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Boolean> list) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putBooleanArray(key, list != null ? r0.S5(list) : null);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Boolean> list) {
            if (list == null) {
                return h0.J();
            }
            List<Boolean> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Boolean> list, List<Boolean> list2) {
            return fr.p.g(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends r<Boolean> {
        public c() {
            super(false);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "boolean";
        }

        @Override // androidx.navigation.r
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Boolean bool) {
            p(bundle, str, bool.booleanValue());
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Boolean o(String value) {
            boolean z10;
            m0.p(value, "value");
            if (m0.g(value, "true")) {
                z10 = true;
            } else {
                if (!m0.g(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public void p(Bundle bundle, String key, boolean z10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putBoolean(key, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatArrayType$1\n*L\n640#1:1213\n640#1:1214,3\n*E\n"})
    public static final class d extends t7.f<float[]> {
        public d() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "float[]";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] n() {
            return new float[0];
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public float[] o(String value) {
            m0.p(value, "value");
            return new float[]{r.f18328k.o(value).floatValue()};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public float[] j(String value, float[] fArr) {
            float[] fArrP3;
            m0.p(value, "value");
            return (fArr == null || (fArrP3 = fr.q.p3(fArr, i(value))) == null) ? i(value) : fArrP3;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, float[] fArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(float[] fArr) {
            List<Float> listRy;
            if (fArr == null || (listRy = a0.Ry(fArr)) == null) {
                return h0.J();
            }
            List<Float> list = listRy;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(float[] fArr, float[] fArr2) {
            return fr.p.g(fArr != null ? fr.q.Q4(fArr) : null, fArr2 != null ? fr.q.Q4(fArr2) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n*L\n674#1:1213,2\n675#1:1215,2\n680#1:1217\n680#1:1218,3\n*E\n"})
    public static final class e extends t7.f<List<? extends Float>> {
        public e() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "List<Float>";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Float> n() {
            return h0.J();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Float> b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return a0.Ry(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Float> o(String value) {
            m0.p(value, "value");
            return g0.l(r.f18328k.o(value));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Float> j(String value, List<Float> list) {
            List<Float> listI4;
            m0.p(value, "value");
            return (list == null || (listI4 = r0.I4(list, i(value))) == null) ? i(value) : listI4;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Float> list) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putFloatArray(key, list != null ? r0.X5(list) : null);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Float> list) {
            if (list == null) {
                return h0.J();
            }
            List<Float> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Float> list, List<Float> list2) {
            return fr.p.g(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends r<Float> {
        public f() {
            super(false);
        }

        @Override // androidx.navigation.r
        public String c() {
            return n0.w.b.f115804c;
        }

        @Override // androidx.navigation.r
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Float f10) {
            p(bundle, str, f10.floatValue());
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            Object obj = bundle.get(key);
            m0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Float o(String value) {
            m0.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void p(Bundle bundle, String key, float f10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putFloat(key, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntArrayType$1\n*L\n414#1:1213\n414#1:1214,3\n*E\n"})
    public static final class g extends t7.f<int[]> {
        public g() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "integer[]";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] n() {
            return new int[0];
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public int[] o(String value) {
            m0.p(value, "value");
            return new int[]{r.f18321d.o(value).intValue()};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int[] j(String value, int[] iArr) {
            int[] iArrS3;
            m0.p(value, "value");
            return (iArr == null || (iArrS3 = fr.q.s3(iArr, i(value))) == null) ? i(value) : iArrS3;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, int[] iArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(int[] iArr) {
            List<Integer> listSy;
            if (iArr == null || (listSy = a0.Sy(iArr)) == null) {
                return h0.J();
            }
            List<Integer> list = listSy;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(int[] iArr, int[] iArr2) {
            return fr.p.g(iArr != null ? fr.q.R4(iArr) : null, iArr2 != null ? fr.q.R4(iArr2) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntListType$1\n*L\n448#1:1213,2\n449#1:1215,2\n454#1:1217\n454#1:1218,3\n*E\n"})
    public static final class h extends t7.f<List<? extends Integer>> {
        public h() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "List<Int>";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Integer> n() {
            return h0.J();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Integer> b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return a0.Sy(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Integer> o(String value) {
            m0.p(value, "value");
            return g0.l(r.f18321d.o(value));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Integer> j(String value, List<Integer> list) {
            List<Integer> listI4;
            m0.p(value, "value");
            return (list == null || (listI4 = r0.I4(list, i(value))) == null) ? i(value) : listI4;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Integer> list) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putIntArray(key, list != null ? r0.Z5(list) : null);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Integer> list) {
            if (list == null) {
                return h0.J();
            }
            List<Integer> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Integer> list, List<Integer> list2) {
            return fr.p.g(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i extends r<Integer> {
        public i() {
            super(false);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "integer";
        }

        @Override // androidx.navigation.r
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            p(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            Object obj = bundle.get(key);
            m0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer o(String value) {
            int i10;
            m0.p(value, "value");
            if (k0.J2(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                m0.o(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, cv.e.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void p(Bundle bundle, String key, int i10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongArrayType$1\n*L\n533#1:1213\n533#1:1214,3\n*E\n"})
    public static final class j extends t7.f<long[]> {
        public j() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "long[]";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] n() {
            return new long[0];
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public long[] o(String value) {
            m0.p(value, "value");
            return new long[]{r.f18325h.o(value).longValue()};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public long[] j(String value, long[] jArr) {
            long[] jArrV3;
            m0.p(value, "value");
            return (jArr == null || (jArrV3 = fr.q.v3(jArr, i(value))) == null) ? i(value) : jArrV3;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, long[] jArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(long[] jArr) {
            List<Long> listTy;
            if (jArr == null || (listTy = a0.Ty(jArr)) == null) {
                return h0.J();
            }
            List<Long> list = listTy;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(long[] jArr, long[] jArr2) {
            return fr.p.g(jArr != null ? fr.q.S4(jArr) : null, jArr2 != null ? fr.q.S4(jArr2) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongListType$1\n*L\n567#1:1213,2\n568#1:1215,2\n573#1:1217\n573#1:1218,3\n*E\n"})
    public static final class k extends t7.f<List<? extends Long>> {
        public k() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "List<Long>";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Long> n() {
            return h0.J();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Long> b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return a0.Ty(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Long> o(String value) {
            m0.p(value, "value");
            return g0.l(r.f18325h.o(value));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Long> j(String value, List<Long> list) {
            List<Long> listI4;
            m0.p(value, "value");
            return (list == null || (listI4 = r0.I4(list, i(value))) == null) ? i(value) : listI4;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Long> list) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putLongArray(key, list != null ? r0.b6(list) : null);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Long> list) {
            if (list == null) {
                return h0.J();
            }
            List<Long> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Long> list, List<Long> list2) {
            return fr.p.g(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l extends r<Long> {
        public l() {
            super(false);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "long";
        }

        @Override // androidx.navigation.r
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Long l10) {
            p(bundle, str, l10.longValue());
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            Object obj = bundle.get(key);
            m0.n(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long o(String value) {
            String strSubstring;
            long j10;
            m0.p(value, "value");
            if (k0.b2(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                m0.o(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (k0.J2(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                m0.o(strSubstring2, "substring(...)");
                j10 = Long.parseLong(strSubstring2, cv.e.a(16));
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        public void p(Bundle bundle, String key, long j10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putLong(key, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends r<Integer> {
        public m() {
            super(false);
        }

        @Override // androidx.navigation.r
        public String c() {
            return n0.w.b.f115809h;
        }

        @Override // androidx.navigation.r
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            p(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.r
        @k.c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            Object obj = bundle.get(key);
            m0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer o(String value) {
            int i10;
            m0.p(value, "value");
            if (k0.J2(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                m0.o(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, cv.e.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void p(Bundle bundle, String key, @k.c int i10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n11065#2:1213\n11400#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n*L\n885#1:1213\n885#1:1214,3\n*E\n"})
    public static final class n extends t7.f<String[]> {
        public n() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "string[]";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] n() {
            return new String[0];
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String[] o(String value) {
            m0.p(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public String[] j(String value, String[] strArr) {
            String[] strArr2;
            m0.p(value, "value");
            return (strArr == null || (strArr2 = (String[]) fr.q.y3(strArr, i(value))) == null) ? i(value) : strArr2;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String[] strArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(String[] strArr) {
            if (strArr == null) {
                return h0.J();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(String[] strArr, String[] strArr2) {
            return fr.p.g(strArr, strArr2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n37#2,2:1217\n1549#3:1219\n1620#3,3:1220\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringListType$1\n*L\n902#1:1213,2\n922#1:1215,2\n923#1:1217,2\n928#1:1219\n928#1:1220,3\n*E\n"})
    public static final class o extends t7.f<List<? extends String>> {
        public o() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "List<String>";
        }

        @Override // t7.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> n() {
            return h0.J();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<String> b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return a0.Uy(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> o(String value) {
            m0.p(value, "value");
            return g0.l(value);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<String> j(String value, List<String> list) {
            List<String> listI4;
            m0.p(value, "value");
            return (list == null || (listI4 = r0.I4(list, i(value))) == null) ? i(value) : listI4;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<String> list) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // t7.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<String> list) {
            if (list == null) {
                return h0.J();
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<String> list, List<String> list2) {
            return fr.p.g(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static final class p extends r<String> {
        public p() {
            super(true);
        }

        @Override // androidx.navigation.r
        public String c() {
            return "string";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String o(String value) {
            m0.p(value, "value");
            if (m0.g(value, fw.b.f85379f)) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String str) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String l(String str) {
            String strEncode = str != null ? Uri.encode(str) : null;
            return strEncode == null ? fw.b.f85379f : strEncode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class q {
        public /* synthetic */ q(x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public r<?> a(@oy.m String str, @oy.m String str2) {
            String strSubstring;
            r<Integer> rVar = r.f18321d;
            if (m0.g(rVar.c(), str)) {
                return rVar;
            }
            r rVar2 = r.f18323f;
            if (m0.g(rVar2.c(), str)) {
                return rVar2;
            }
            r<List<Integer>> rVar3 = r.f18324g;
            if (m0.g(rVar3.c(), str)) {
                return rVar3;
            }
            r<Long> rVar4 = r.f18325h;
            if (m0.g(rVar4.c(), str)) {
                return rVar4;
            }
            r rVar5 = r.f18326i;
            if (m0.g(rVar5.c(), str)) {
                return rVar5;
            }
            r<List<Long>> rVar6 = r.f18327j;
            if (m0.g(rVar6.c(), str)) {
                return rVar6;
            }
            r<Boolean> rVar7 = r.f18331n;
            if (m0.g(rVar7.c(), str)) {
                return rVar7;
            }
            r rVar8 = r.f18332o;
            if (m0.g(rVar8.c(), str)) {
                return rVar8;
            }
            r<List<Boolean>> rVar9 = r.f18333p;
            if (m0.g(rVar9.c(), str)) {
                return rVar9;
            }
            r<String> rVar10 = r.f18334q;
            if (m0.g(rVar10.c(), str)) {
                return rVar10;
            }
            r rVar11 = r.f18335r;
            if (m0.g(rVar11.c(), str)) {
                return rVar11;
            }
            r<List<String>> rVar12 = r.f18336s;
            if (m0.g(rVar12.c(), str)) {
                return rVar12;
            }
            r<Float> rVar13 = r.f18328k;
            if (m0.g(rVar13.c(), str)) {
                return rVar13;
            }
            r rVar14 = r.f18329l;
            if (m0.g(rVar14.c(), str)) {
                return rVar14;
            }
            r<List<Float>> rVar15 = r.f18330m;
            if (m0.g(rVar15.c(), str)) {
                return rVar15;
            }
            r<Integer> rVar16 = r.f18322e;
            if (m0.g(rVar16.c(), str)) {
                return rVar16;
            }
            if (str == null || str.length() == 0) {
                return rVar10;
            }
            try {
                if (!k0.J2(str, fe.F, false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zB2 = k0.b2(str, "[]", false, 2, null);
                if (zB2) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    m0.o(strSubstring, "substring(...)");
                }
                Class<?> clazz = Class.forName(strSubstring);
                m0.o(clazz, "clazz");
                r<?> rVarD = d(clazz, zB2);
                if (rVarD != null) {
                    return rVarD;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @oy.l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public final r<Object> b(@oy.l String value) {
            m0.p(value, "value");
            try {
                try {
                    try {
                        try {
                            r<Integer> rVar = r.f18321d;
                            rVar.o(value);
                            m0.n(rVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return rVar;
                        } catch (IllegalArgumentException unused) {
                            r<Boolean> rVar2 = r.f18331n;
                            rVar2.o(value);
                            m0.n(rVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return rVar2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        r<Long> rVar3 = r.f18325h;
                        rVar3.o(value);
                        m0.n(rVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return rVar3;
                    }
                } catch (IllegalArgumentException unused3) {
                    r<String> rVar4 = r.f18334q;
                    m0.n(rVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return rVar4;
                }
            } catch (IllegalArgumentException unused4) {
                r<Float> rVar5 = r.f18328k;
                rVar5.o(value);
                m0.n(rVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar5;
            }
        }

        @oy.l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public final r<Object> c(@oy.m Object obj) {
            if (obj instanceof Integer) {
                r<Integer> rVar = r.f18321d;
                m0.n(rVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar;
            }
            if (obj instanceof int[]) {
                r<int[]> rVar2 = r.f18323f;
                m0.n(rVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar2;
            }
            if (obj instanceof Long) {
                r<Long> rVar3 = r.f18325h;
                m0.n(rVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar3;
            }
            if (obj instanceof long[]) {
                r<long[]> rVar4 = r.f18326i;
                m0.n(rVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar4;
            }
            if (obj instanceof Float) {
                r<Float> rVar5 = r.f18328k;
                m0.n(rVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar5;
            }
            if (obj instanceof float[]) {
                r<float[]> rVar6 = r.f18329l;
                m0.n(rVar6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar6;
            }
            if (obj instanceof Boolean) {
                r<Boolean> rVar7 = r.f18331n;
                m0.n(rVar7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar7;
            }
            if (obj instanceof boolean[]) {
                r<boolean[]> rVar8 = r.f18332o;
                m0.n(rVar8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar8;
            }
            if ((obj instanceof String) || obj == null) {
                r<String> rVar9 = r.f18334q;
                m0.n(rVar9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                r<String[]> rVar10 = r.f18335r;
                m0.n(rVar10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return rVar10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                m0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    m0.n(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new s(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                m0.m(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    m0.n(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new u(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new t(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new C0144r(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new v(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        @oy.m
        public final r<?> d(@oy.l Class<?> clazz, boolean z10) {
            m0.p(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z10 ? new s(clazz) : new t(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z10) {
                return new C0144r(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z10 ? new u(clazz) : new v(clazz);
            }
            return null;
        }

        public q() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.r$r, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n1#2:1213\n1282#3,2:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n1135#1:1214,2\n*E\n"})
    public static final class C0144r<D extends Enum<?>> extends v<D> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @oy.l
        public final Class<D> f18339u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0144r(@oy.l Class<D> type) {
            super(false, type);
            m0.p(type, "type");
            if (type.isEnum()) {
                this.f18339u = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.r.v, androidx.navigation.r
        @oy.l
        public String c() {
            String name = this.f18339u.getName();
            m0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.r.v
        @oy.l
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D o(@oy.l String value) {
            D d10;
            m0.p(value, "value");
            D[] enumConstants = this.f18339u.getEnumConstants();
            m0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (k0.c2(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f18339u.getName() + kj.e.f102543c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class s<D extends Parcelable> extends r<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @oy.l
        public final Class<D[]> f18340t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@oy.l Class<D> type) {
            super(true);
            m0.p(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                m0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f18340t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.r
        @oy.l
        public String c() {
            String name = this.f18340t.getName();
            m0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !m0.g(s.class, obj.getClass())) {
                return false;
            }
            return m0.g(this.f18340t, ((s) obj).f18340t);
        }

        public int hashCode() {
            return this.f18340t.hashCode();
        }

        @Override // androidx.navigation.r
        @oy.m
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D[] b(@oy.l Bundle bundle, @oy.l String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.r
        @oy.l
        public D[] o(@oy.l String value) {
            m0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@oy.l Bundle bundle, @oy.l String key, @oy.m D[] dArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            this.f18340t.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean m(@oy.m D[] dArr, @oy.m D[] dArr2) {
            return fr.p.g(dArr, dArr2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class t<D> extends r<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @oy.l
        public final Class<D> f18341t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(@oy.l Class<D> type) {
            super(true);
            m0.p(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f18341t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.r
        @oy.m
        public D b(@oy.l Bundle bundle, @oy.l String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.r
        @oy.l
        public String c() {
            String name = this.f18341t.getName();
            m0.o(name, "type.name");
            return name;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !m0.g(t.class, obj.getClass())) {
                return false;
            }
            return m0.g(this.f18341t, ((t) obj).f18341t);
        }

        public int hashCode() {
            return this.f18341t.hashCode();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: i */
        public D o(@oy.l String value) {
            m0.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.r
        public void k(@oy.l Bundle bundle, @oy.l String key, D d10) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            this.f18341t.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class u<D extends Serializable> extends r<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @oy.l
        public final Class<D[]> f18342t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(@oy.l Class<D> type) {
            super(true);
            m0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                m0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f18342t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.r
        @oy.l
        public String c() {
            String name = this.f18342t.getName();
            m0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !m0.g(u.class, obj.getClass())) {
                return false;
            }
            return m0.g(this.f18342t, ((u) obj).f18342t);
        }

        public int hashCode() {
            return this.f18342t.hashCode();
        }

        @Override // androidx.navigation.r
        @oy.m
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D[] b(@oy.l Bundle bundle, @oy.l String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.r
        @oy.l
        public D[] o(@oy.l String value) {
            m0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@oy.l Bundle bundle, @oy.l String key, @oy.m D[] dArr) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            this.f18342t.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean m(@oy.m D[] dArr, @oy.m D[] dArr2) {
            return fr.p.g(dArr, dArr2);
        }
    }

    public r(boolean z10) {
        this.f18337a = z10;
    }

    @oy.l
    @cs.o
    public static r<?> a(@oy.m String str, @oy.m String str2) {
        return f18320c.a(str, str2);
    }

    @oy.l
    @cs.o
    @y0({y0.a.LIBRARY_GROUP})
    public static final r<Object> d(@oy.l String str) {
        return f18320c.b(str);
    }

    @oy.l
    @cs.o
    @y0({y0.a.LIBRARY_GROUP})
    public static final r<Object> e(@oy.m Object obj) {
        return f18320c.c(obj);
    }

    @oy.m
    public abstract T b(@oy.l Bundle bundle, @oy.l String str);

    @oy.l
    public String c() {
        return this.f18338b;
    }

    public boolean f() {
        return this.f18337a;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final T g(@oy.l Bundle bundle, @oy.l String key, @oy.l String value) {
        m0.p(bundle, "bundle");
        m0.p(key, "key");
        m0.p(value, "value");
        T tO = o(value);
        k(bundle, key, tO);
        return tO;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final T h(@oy.l Bundle bundle, @oy.l String key, @oy.m String str, T t10) {
        m0.p(bundle, "bundle");
        m0.p(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t10;
        }
        T tJ = j(str, t10);
        k(bundle, key, tJ);
        return tJ;
    }

    /* JADX INFO: renamed from: i */
    public abstract T o(@oy.l String str);

    public T j(@oy.l String value, T t10) {
        m0.p(value, "value");
        return o(value);
    }

    public abstract void k(@oy.l Bundle bundle, @oy.l String str, T t10);

    @oy.l
    public String l(T t10) {
        return String.valueOf(t10);
    }

    public boolean m(T t10, T t11) {
        return m0.g(t10, t11);
    }

    @oy.l
    public String toString() {
        return c();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static class v<D extends Serializable> extends r<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @oy.l
        public final Class<D> f18343t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(@oy.l Class<D> type) {
            super(true);
            m0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f18343t = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.r
        @oy.l
        public String c() {
            String name = this.f18343t.getName();
            m0.o(name, "type.name");
            return name;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                return m0.g(this.f18343t, ((v) obj).f18343t);
            }
            return false;
        }

        public int hashCode() {
            return this.f18343t.hashCode();
        }

        @Override // androidx.navigation.r
        @oy.m
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(@oy.l Bundle bundle, @oy.l String key) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.r
        @oy.l
        public D o(@oy.l String value) {
            m0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@oy.l Bundle bundle, @oy.l String key, @oy.l D value) {
            m0.p(bundle, "bundle");
            m0.p(key, "key");
            m0.p(value, "value");
            this.f18343t.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, @oy.l Class<D> type) {
            super(z10);
            m0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f18343t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
