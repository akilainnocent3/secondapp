package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import f0.d1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import k.j0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.a implements x9.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f9443t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9444u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9445v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9446w = "binding_";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9447x = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f9450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0[] f9453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f9454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.databinding.i<b0, ViewDataBinding, Void> f9455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Choreographer f9457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Choreographer.FrameCallback f9458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f9459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.databinding.l f9460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewDataBinding f9461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.b0 f9462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnStartListener f9463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public boolean f9465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f9442s = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f9448y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final androidx.databinding.j f9449z = new a();
    public static final androidx.databinding.j A = new b();
    public static final androidx.databinding.j B = new c();
    public static final androidx.databinding.j C = new d();
    public static final androidx.databinding.i.a<b0, ViewDataBinding, Void> D = new e();
    public static final ReferenceQueue<ViewDataBinding> E = new ReferenceQueue<>();
    public static final View.OnAttachStateChangeListener F = new f();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class OnStartListener implements androidx.lifecycle.a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f9466b;

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @n0(androidx.lifecycle.r.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f9466b.get();
            if (viewDataBinding != null) {
                viewDataBinding.w();
            }
        }

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f9466b = new WeakReference<>(viewDataBinding);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new n(viewDataBinding, i10, referenceQueue).getListener();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i10, referenceQueue).getListener();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i10, referenceQueue).getListener();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements androidx.databinding.j {
        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i10, referenceQueue).getListener();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends androidx.databinding.i.a<b0, ViewDataBinding, Void> {
        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b0 b0Var, ViewDataBinding viewDataBinding, int i10, Void r10) {
            if (i10 == 1) {
                if (b0Var.c(viewDataBinding)) {
                    return;
                }
                viewDataBinding.f9452e = true;
            } else if (i10 == 2) {
                b0Var.b(viewDataBinding);
            } else {
                if (i10 != 3) {
                    return;
                }
                b0Var.a(viewDataBinding);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f9451d = false;
            }
            ViewDataBinding.H0();
            if (ViewDataBinding.this.f9454g.isAttachedToWindow()) {
                ViewDataBinding.this.w();
            } else {
                ViewDataBinding.this.f9454g.removeOnAttachStateChangeListener(ViewDataBinding.F);
                ViewDataBinding.this.f9454g.addOnAttachStateChangeListener(ViewDataBinding.F);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            ViewDataBinding.this.f9450c.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f9469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f9470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f9471c;

        public i(int i10) {
            this.f9469a = new String[i10][];
            this.f9470b = new int[i10][];
            this.f9471c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f9469a[i10] = strArr;
            this.f9470b[i10] = iArr;
            this.f9471c[i10] = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j implements m0, a0<LiveData<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0<LiveData<?>> f9472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public WeakReference<androidx.lifecycle.b0> f9473c = null;

        public j(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9472b = new h0<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.lifecycle.m0
        public void a(@Nullable Object obj) {
            ViewDataBinding viewDataBindingA = this.f9472b.a();
            if (viewDataBindingA != null) {
                h0<LiveData<?>> h0Var = this.f9472b;
                viewDataBindingA.h0(h0Var.f9502b, h0Var.b(), 0);
            }
        }

        @Override // androidx.databinding.a0
        public void b(@Nullable androidx.lifecycle.b0 b0Var) {
            androidx.lifecycle.b0 b0VarF = f();
            LiveData<?> liveDataB = this.f9472b.b();
            if (liveDataB != null) {
                if (b0VarF != null) {
                    liveDataB.p(this);
                }
                if (b0Var != null) {
                    liveDataB.k(b0Var, this);
                }
            }
            if (b0Var != null) {
                this.f9473c = new WeakReference<>(b0Var);
            }
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(LiveData<?> liveData) {
            androidx.lifecycle.b0 b0VarF = f();
            if (b0VarF != null) {
                liveData.k(b0VarF, this);
            }
        }

        @Nullable
        public final androidx.lifecycle.b0 f() {
            WeakReference<androidx.lifecycle.b0> weakReference = this.f9473c;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(LiveData<?> liveData) {
            liveData.p(this);
        }

        @Override // androidx.databinding.a0
        public h0<LiveData<?>> getListener() {
            return this.f9472b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class k extends u.a implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9474b;

        public k(int i10) {
            this.f9474b = i10;
        }

        @Override // androidx.databinding.u.a
        public void e(u uVar, int i10) {
            if (i10 == this.f9474b || i10 == 0) {
                a();
            }
        }
    }

    public ViewDataBinding(androidx.databinding.l lVar, View view, int i10) {
        this.f9450c = new g();
        this.f9451d = false;
        this.f9452e = false;
        this.f9460m = lVar;
        this.f9453f = new h0[i10];
        this.f9454g = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f9448y) {
            this.f9457j = Choreographer.getInstance();
            this.f9458k = new h();
        } else {
            this.f9458k = null;
            this.f9459l = new Handler(Looper.myLooper());
        }
    }

    public static ViewDataBinding A(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(r2.a.C1202a.f123555a);
        }
        return null;
    }

    public static float A0(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int B() {
        return f9442s;
    }

    public static int C(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    public static int C0(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static ColorStateList D(View view, int i10) {
        return view.getContext().getColorStateList(i10);
    }

    public static long D0(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static Drawable E(View view, int i10) {
        return view.getContext().getDrawable(i10);
    }

    public static short E0(String str, short s10) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public static boolean F0(String str, boolean z10) {
        return str == null ? z10 : Boolean.parseBoolean(str);
    }

    public static int G0(String str, int i10) {
        int length = str.length();
        int iCharAt = 0;
        while (i10 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    public static void H0() {
        while (true) {
            Reference<? extends ViewDataBinding> referencePoll = E.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof h0) {
                ((h0) referencePoll).e();
            }
        }
    }

    public static <K, T> T I(Map<K, T> map, K k10) {
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    public static byte J(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i10];
    }

    public static char K(char[] cArr, int i10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i10];
    }

    public static double L(double[] dArr, int i10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i10];
    }

    public static byte L0(Byte b10) {
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    public static float M(float[] fArr, int i10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i10];
    }

    public static char M0(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    public static double N0(Double d10) {
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public static int O(int[] iArr, int i10) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10];
    }

    public static float O0(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static long P(long[] jArr, int i10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return 0L;
        }
        return jArr[i10];
    }

    public static int P0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static <T> T Q(T[] tArr, int i10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static long Q0(Long l10) {
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public static short R(short[] sArr, int i10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i10];
    }

    public static short R0(Short sh2) {
        if (sh2 == null) {
            return (short) 0;
        }
        return sh2.shortValue();
    }

    public static boolean S0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean T(boolean[] zArr, int i10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    public static void T0(ViewDataBinding viewDataBinding, o oVar, k kVar) {
        if (oVar != kVar) {
            if (oVar != null) {
                viewDataBinding.c((k) oVar);
            }
            if (kVar != null) {
                viewDataBinding.a(kVar);
            }
        }
    }

    public static int V(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null || i10 < 0) {
            return 0;
        }
        return sparseIntArray.get(i10);
    }

    @TargetApi(18)
    public static long W(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray == null || i10 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i10);
    }

    @TargetApi(16)
    public static <T> T X(LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get(i10);
    }

    @TargetApi(16)
    public static <T> void Y0(LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray == null || i10 < 0 || i10 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i10, t10);
    }

    public static <T> T Z(SparseArray<T> sparseArray, int i10) {
        if (sparseArray == null || i10 < 0) {
            return null;
        }
        return sparseArray.get(i10);
    }

    public static <T> void Z0(SparseArray<T> sparseArray, int i10, T t10) {
        if (sparseArray == null || i10 < 0 || i10 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i10, t10);
    }

    public static <T> T a0(d1<T> d1Var, int i10) {
        if (d1Var == null || i10 < 0) {
            return null;
        }
        return d1Var.g(i10);
    }

    public static void a1(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        if (sparseBooleanArray == null || i10 < 0 || i10 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i10, z10);
    }

    public static <T> T b0(List<T> list, int i10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static void b1(SparseIntArray sparseIntArray, int i10, int i11) {
        if (sparseIntArray == null || i10 < 0 || i10 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i10, i11);
    }

    public static boolean c0(SparseBooleanArray sparseBooleanArray, int i10) {
        if (sparseBooleanArray == null || i10 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i10);
    }

    @TargetApi(18)
    public static void c1(SparseLongArray sparseLongArray, int i10, long j10) {
        if (sparseLongArray == null || i10 < 0 || i10 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i10, j10);
    }

    public static <T> void d1(d1<T> d1Var, int i10, T t10) {
        if (d1Var == null || i10 < 0 || i10 >= d1Var.w()) {
            return;
        }
        d1Var.n(i10, t10);
    }

    public static <T> void e1(List<T> list, int i10, T t10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return;
        }
        list.set(i10, t10);
    }

    public static <K, T> void f1(Map<K, T> map, K k10, T t10) {
        if (map == null) {
            return;
        }
        map.put(k10, t10);
    }

    public static void g1(byte[] bArr, int i10, byte b10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return;
        }
        bArr[i10] = b10;
    }

    public static void i1(char[] cArr, int i10, char c10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return;
        }
        cArr[i10] = c10;
    }

    public static void j1(double[] dArr, int i10, double d10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return;
        }
        dArr[i10] = d10;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T k0(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (T) androidx.databinding.m.k(layoutInflater, i10, viewGroup, z10, r(obj));
    }

    public static void k1(float[] fArr, int i10, float f10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return;
        }
        fArr[i10] = f10;
    }

    public static void l1(int[] iArr, int i10, int i11) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return;
        }
        iArr[i10] = i11;
    }

    public static void m1(long[] jArr, int i10, long j10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return;
        }
        jArr[i10] = j10;
    }

    public static <T> void n1(T[] tArr, int i10, T t10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return;
        }
        tArr[i10] = t10;
    }

    public static void o1(short[] sArr, int i10, short s10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return;
        }
        sArr[i10] = s10;
    }

    public static boolean p0(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static void p1(boolean[] zArr, int i10, boolean z10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return;
        }
        zArr[i10] = z10;
    }

    public static ViewDataBinding q(Object obj, View view, int i10) {
        return androidx.databinding.m.c(r(obj), view, i10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    public static void q0(androidx.databinding.l lVar, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int iX;
        int id2;
        int i13;
        int iG0;
        boolean z14;
        i iVar2 = iVar;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (A(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z15 = true;
        if (z10 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i14 = iLastIndexOf + 1;
                if (p0(str, i14)) {
                    iG0 = G0(str, i14);
                    if (objArr[iG0] == null) {
                        objArr[iG0] = view;
                    }
                    if (iVar2 == null) {
                        iG0 = -1;
                    }
                    z14 = true;
                } else {
                    iG0 = -1;
                    z14 = false;
                }
            } else {
                iG0 = -1;
                z14 = false;
            }
            boolean z16 = z14;
            i10 = iG0;
            z11 = z16;
        } else if (str == null || !str.startsWith(f9446w)) {
            i10 = -1;
            z11 = false;
        } else {
            int iG1 = G0(str, f9447x);
            if (objArr[iG1] == null) {
                objArr[iG1] = view;
            }
            if (iVar2 == null) {
                iG1 = -1;
            }
            i10 = iG1;
            z11 = true;
        }
        if (!z11 && (id2 = view.getId()) > 0 && sparseIntArray2 != null && (i13 = sparseIntArray2.get(id2, -1)) >= 0 && objArr[i13] == null) {
            objArr[i13] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i15 = 0;
            int i16 = 0;
            while (i15 < childCount) {
                View childAt = viewGroup.getChildAt(i15);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    z12 = z15;
                    i11 = i15;
                    i12 = i16;
                    z13 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (!str2.endsWith("_0") || !str2.startsWith("layout") || str2.indexOf(47) <= 0 || (iX = x(str2, i16, iVar2, i10)) < 0) {
                        z12 = z15;
                        i11 = i15;
                        i12 = i16;
                        z13 = false;
                    } else {
                        int i17 = iX + 1;
                        int i18 = iVar2.f9470b[i10][iX];
                        int i19 = iVar2.f9471c[i10][iX];
                        int iY = y(viewGroup, i15);
                        if (iY == i15) {
                            objArr[i18] = androidx.databinding.m.c(lVar, childAt, i19);
                            i11 = i15;
                            z13 = z15;
                            z12 = z13;
                            i12 = i17;
                        } else {
                            int i20 = iY - i15;
                            int i21 = i20 + 1;
                            View[] viewArr = new View[i21];
                            z12 = z15;
                            int i22 = 0;
                            while (i22 < i21) {
                                int i23 = i15;
                                viewArr[i22] = viewGroup.getChildAt(i23 + i22);
                                i22++;
                                i15 = i23;
                            }
                            objArr[i18] = androidx.databinding.m.d(lVar, viewArr, i19);
                            i11 = i15 + i20;
                            i12 = i17;
                            z13 = z12;
                        }
                    }
                }
                if (!z13) {
                    q0(lVar, childAt, objArr, iVar2, sparseIntArray2, false);
                }
                i15 = i11 + 1;
                iVar2 = iVar;
                sparseIntArray2 = sparseIntArray;
                i16 = i12;
                z15 = z12;
            }
        }
    }

    public static androidx.databinding.l r(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.l) {
            return (androidx.databinding.l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static Object[] r0(androidx.databinding.l lVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        q0(lVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static Object[] s0(androidx.databinding.l lVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            q0(lVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static byte u0(String str, byte b10) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static void v(ViewDataBinding viewDataBinding) {
        viewDataBinding.u();
    }

    public static char w0(String str, char c10) {
        return (str == null || str.isEmpty()) ? c10 : str.charAt(0);
    }

    public static int x(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f9469a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static double x0(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static int y(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (p0(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public void I0(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return;
        }
        h0 h0VarA = this.f9453f[i10];
        if (h0VarA == null) {
            h0VarA = jVar.a(this, i10, E);
            this.f9453f[i10] = h0VarA;
            androidx.lifecycle.b0 b0Var = this.f9462o;
            if (b0Var != null) {
                h0VarA.c(b0Var);
            }
        }
        h0VarA.d(obj);
    }

    public void J0(@NonNull b0 b0Var) {
        androidx.databinding.i<b0, ViewDataBinding, Void> iVar = this.f9455h;
        if (iVar != null) {
            iVar.o(b0Var);
        }
    }

    public void K0() {
        ViewDataBinding viewDataBinding = this.f9461n;
        if (viewDataBinding != null) {
            viewDataBinding.K0();
            return;
        }
        androidx.lifecycle.b0 b0Var = this.f9462o;
        if (b0Var == null || b0Var.getLifecycle().getCurrentState().e(androidx.lifecycle.r.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f9451d) {
                        return;
                    }
                    this.f9451d = true;
                    if (f9448y) {
                        this.f9457j.postFrameCallback(this.f9458k);
                    } else {
                        this.f9459l.post(this.f9450c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void U0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f9461n = this;
        }
    }

    @j0
    public void V0(@Nullable androidx.lifecycle.b0 b0Var) {
        if (b0Var instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        androidx.lifecycle.b0 b0Var2 = this.f9462o;
        if (b0Var2 == b0Var) {
            return;
        }
        if (b0Var2 != null) {
            b0Var2.getLifecycle().removeObserver(this.f9463p);
        }
        this.f9462o = b0Var;
        if (b0Var != null) {
            if (this.f9463p == null) {
                this.f9463p = new OnStartListener(this, null);
            }
            b0Var.getLifecycle().addObserver(this.f9463p);
        }
        for (h0 h0Var : this.f9453f) {
            if (h0Var != null) {
                h0Var.c(b0Var);
            }
        }
    }

    public void W0(View view) {
        view.setTag(r2.a.C1202a.f123555a, this);
    }

    public void X0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(r2.a.C1202a.f123555a, this);
        }
    }

    @Nullable
    public androidx.lifecycle.b0 d0() {
        return this.f9462o;
    }

    public Object g0(int i10) {
        h0 h0Var = this.f9453f[i10];
        if (h0Var == null) {
            return null;
        }
        return h0Var.b();
    }

    @Override // x9.b
    @NonNull
    public View getRoot() {
        return this.f9454g;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void h0(int i10, Object obj, int i11) {
        if (this.f9464q || this.f9465r || !t0(i10, obj, i11)) {
            return;
        }
        K0();
    }

    public abstract boolean i0();

    public abstract void o0();

    public void p(@NonNull b0 b0Var) {
        if (this.f9455h == null) {
            this.f9455h = new androidx.databinding.i<>(D);
        }
        this.f9455h.a(b0Var);
    }

    public abstract boolean q1(int i10, @Nullable Object obj);

    public void r1() {
        for (h0 h0Var : this.f9453f) {
            if (h0Var != null) {
                h0Var.e();
            }
        }
    }

    public void s(Class<?> cls) {
        if (this.f9460m != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public boolean s1(int i10) {
        h0 h0Var = this.f9453f[i10];
        if (h0Var != null) {
            return h0Var.e();
        }
        return false;
    }

    public abstract void t();

    public abstract boolean t0(int i10, Object obj, int i11);

    public boolean t1(int i10, LiveData<?> liveData) {
        this.f9464q = true;
        try {
            return x1(i10, liveData, C);
        } finally {
            this.f9464q = false;
        }
    }

    public final void u() {
        if (this.f9456i) {
            K0();
            return;
        }
        if (i0()) {
            this.f9456i = true;
            this.f9452e = false;
            androidx.databinding.i<b0, ViewDataBinding, Void> iVar = this.f9455h;
            if (iVar != null) {
                iVar.j(this, 1, null);
                if (this.f9452e) {
                    this.f9455h.j(this, 2, null);
                }
            }
            if (!this.f9452e) {
                t();
                androidx.databinding.i<b0, ViewDataBinding, Void> iVar2 = this.f9455h;
                if (iVar2 != null) {
                    iVar2.j(this, 3, null);
                }
            }
            this.f9456i = false;
        }
    }

    public boolean u1(int i10, u uVar) {
        return x1(i10, uVar, f9449z);
    }

    public boolean v1(int i10, y yVar) {
        return x1(i10, yVar, A);
    }

    public void w() {
        ViewDataBinding viewDataBinding = this.f9461n;
        if (viewDataBinding == null) {
            u();
        } else {
            viewDataBinding.w();
        }
    }

    public boolean w1(int i10, z zVar) {
        return x1(i10, zVar, B);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public boolean x1(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return s1(i10);
        }
        h0 h0Var = this.f9453f[i10];
        if (h0Var == null) {
            I0(i10, obj, jVar);
            return true;
        }
        if (h0Var.b() == obj) {
            return false;
        }
        s1(i10);
        I0(i10, obj, jVar);
        return true;
    }

    public void z() {
        t();
    }

    public ViewDataBinding(Object obj, View view, int i10) {
        this(r(obj), view, i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.A(view).f9450c.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class l extends y.a implements a0<y> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0<y> f9475b;

        public l(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9475b = new h0<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.y.a
        public void a(y yVar) {
            y yVarB;
            ViewDataBinding viewDataBindingA = this.f9475b.a();
            if (viewDataBindingA != null && (yVarB = this.f9475b.b()) == yVar) {
                viewDataBindingA.h0(this.f9475b.f9502b, yVarB, 0);
            }
        }

        @Override // androidx.databinding.y.a
        public void e(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void f(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void g(y yVar, int i10, int i11, int i12) {
            a(yVar);
        }

        @Override // androidx.databinding.a0
        public h0<y> getListener() {
            return this.f9475b;
        }

        @Override // androidx.databinding.y.a
        public void h(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(y yVar) {
            yVar.w0(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void c(y yVar) {
            yVar.J0(this);
        }

        @Override // androidx.databinding.a0
        public void b(androidx.lifecycle.b0 b0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m extends z.a implements a0<z> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0<z> f9476b;

        public m(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9476b = new h0<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.z.a
        public void a(z zVar, Object obj) {
            ViewDataBinding viewDataBindingA = this.f9476b.a();
            if (viewDataBindingA == null || zVar != this.f9476b.b()) {
                return;
            }
            viewDataBindingA.h0(this.f9476b.f9502b, zVar, 0);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(z zVar) {
            zVar.S(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(z zVar) {
            zVar.i1(this);
        }

        @Override // androidx.databinding.a0
        public h0<z> getListener() {
            return this.f9476b;
        }

        @Override // androidx.databinding.a0
        public void b(androidx.lifecycle.b0 b0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class n extends u.a implements a0<u> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0<u> f9477b;

        public n(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9477b = new h0<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.u.a
        public void e(u uVar, int i10) {
            ViewDataBinding viewDataBindingA = this.f9477b.a();
            if (viewDataBindingA != null && this.f9477b.b() == uVar) {
                viewDataBindingA.h0(this.f9477b.f9502b, uVar, i10);
            }
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(u uVar) {
            uVar.a(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(u uVar) {
            uVar.c(this);
        }

        @Override // androidx.databinding.a0
        public h0<u> getListener() {
            return this.f9477b;
        }

        @Override // androidx.databinding.a0
        public void b(androidx.lifecycle.b0 b0Var) {
        }
    }
}
