package fr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n14151#2,14:3052\n14181#2,14:3066\n14211#2,14:3080\n14241#2,14:3094\n14271#2,14:3108\n14301#2,14:3122\n14331#2,14:3136\n14361#2,14:3150\n14391#2,14:3164\n17123#2,14:3178\n17153#2,14:3192\n17183#2,14:3206\n17213#2,14:3220\n17243#2,14:3234\n17273#2,14:3248\n17303#2,14:3262\n17333#2,14:3276\n17363#2,14:3290\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2443#1:3052,14\n2450#1:3066,14\n2457#1:3080,14\n2464#1:3094,14\n2471#1:3108,14\n2478#1:3122,14\n2485#1:3136,14\n2492#1:3150,14\n2499#1:3164,14\n2641#1:3178,14\n2648#1:3192,14\n2655#1:3206,14\n2662#1:3220,14\n2669#1:3234,14\n2676#1:3248,14\n2683#1:3262,14\n2690#1:3276,14\n2697#1:3290,14\n*E\n"})
public class q extends p {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends fr.d<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f85132b;

        public a(byte[] bArr) {
            this.f85132b = bArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return d(((Number) obj).byteValue());
            }
            return false;
        }

        public boolean d(byte b10) {
            return a0.v8(this.f85132b, b10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f85132b[i10]);
        }

        public int f(byte b10) {
            return a0.Mf(this.f85132b, b10);
        }

        public int g(byte b10) {
            return a0.Qh(this.f85132b, b10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85132b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return f(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85132b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return g(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends fr.d<Short> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ short[] f85133b;

        public b(short[] sArr) {
            this.f85133b = sArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return d(((Number) obj).shortValue());
            }
            return false;
        }

        public boolean d(short s10) {
            return a0.C8(this.f85133b, s10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Short get(int i10) {
            return Short.valueOf(this.f85133b[i10]);
        }

        public int f(short s10) {
            return a0.Tf(this.f85133b, s10);
        }

        public int g(short s10) {
            return a0.Xh(this.f85133b, s10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85133b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return f(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85133b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return g(((Number) obj).shortValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends fr.d<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f85134b;

        public c(int[] iArr) {
            this.f85134b = iArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return d(((Number) obj).intValue());
            }
            return false;
        }

        public boolean d(int i10) {
            return a0.z8(this.f85134b, i10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f85134b[i10]);
        }

        public int f(int i10) {
            return a0.Qf(this.f85134b, i10);
        }

        public int g(int i10) {
            return a0.Uh(this.f85134b, i10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85134b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return f(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85134b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return g(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends fr.d<Long> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f85135b;

        public d(long[] jArr) {
            this.f85135b = jArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return d(((Number) obj).longValue());
            }
            return false;
        }

        public boolean d(long j10) {
            return a0.A8(this.f85135b, j10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long get(int i10) {
            return Long.valueOf(this.f85135b[i10]);
        }

        public int f(long j10) {
            return a0.Rf(this.f85135b, j10);
        }

        public int g(long j10) {
            return a0.Vh(this.f85135b, j10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85135b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return f(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85135b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return g(((Number) obj).longValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n12687#2,2:3052\n1742#2,6:3054\n1850#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3052,2\n201#1:3054,6\n202#1:3060,6\n*E\n"})
    public static final class e extends fr.d<Float> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float[] f85136b;

        public e(float[] fArr) {
            this.f85136b = fArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return d(((Number) obj).floatValue());
            }
            return false;
        }

        public boolean d(float f10) {
            for (float f11 : this.f85136b) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float get(int i10) {
            return Float.valueOf(this.f85136b[i10]);
        }

        public int f(float f10) {
            float[] fArr = this.f85136b;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int g(float f10) {
            float[] fArr = this.f85136b;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
            return -1;
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85136b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return f(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85136b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return g(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n12697#2,2:3052\n1754#2,6:3054\n1862#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3052,2\n215#1:3054,6\n216#1:3060,6\n*E\n"})
    public static final class f extends fr.d<Double> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double[] f85137b;

        public f(double[] dArr) {
            this.f85137b = dArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return d(((Number) obj).doubleValue());
            }
            return false;
        }

        public boolean d(double d10) {
            for (double d11 : this.f85137b) {
                if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double get(int i10) {
            return Double.valueOf(this.f85137b[i10]);
        }

        public int f(double d10) {
            double[] dArr = this.f85137b;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int g(double d10) {
            double[] dArr = this.f85137b;
            int length = dArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
            return -1;
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85137b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return f(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85137b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return g(((Number) obj).doubleValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends fr.d<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f85138b;

        public g(boolean[] zArr) {
            this.f85138b = zArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return d(((Boolean) obj).booleanValue());
            }
            return false;
        }

        public boolean d(boolean z10) {
            return a0.D8(this.f85138b, z10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i10) {
            return Boolean.valueOf(this.f85138b[i10]);
        }

        public int f(boolean z10) {
            return a0.Uf(this.f85138b, z10);
        }

        public int g(boolean z10) {
            return a0.Yh(this.f85138b, z10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85138b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return f(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85138b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return g(((Boolean) obj).booleanValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends fr.d<Character> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ char[] f85139b;

        public h(char[] cArr) {
            this.f85139b = cArr;
        }

        @Override // fr.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return d(((Character) obj).charValue());
            }
            return false;
        }

        public boolean d(char c10) {
            return a0.w8(this.f85139b, c10);
        }

        @Override // fr.d, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            return Character.valueOf(this.f85139b[i10]);
        }

        public int f(char c10) {
            return a0.Nf(this.f85139b, c10);
        }

        public int g(char c10) {
            return a0.Rh(this.f85139b, c10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85139b.length;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return f(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // fr.b, java.util.Collection
        public boolean isEmpty() {
            return this.f85139b.length == 0;
        }

        @Override // fr.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return g(((Character) obj).charValue());
            }
            return -1;
        }
    }

    public static final int A(@oy.l int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static long[] A0(@oy.l long[] jArr, @oy.l long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final float A1(float[] fArr, int i10) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return fArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object A2(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(objArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.sl(objArr, comparator);
    }

    @oy.l
    public static short[] A3(@oy.l short[] sArr, short s10) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s10;
        kotlin.jvm.internal.m0.m(sArrCopyOf);
        return sArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger A4(short[] sArr, ds.l<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int B(@oy.l long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static <T> T[] B0(@oy.l T[] tArr, @oy.l T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final int B1(int[] iArr, int i10) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return iArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short B2(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.tl(sArr, comparator);
    }

    @oy.l
    public static short[] B3(@oy.l short[] sArr, @oy.l short[] elements) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(sArrCopyOf);
        return sArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger B4(boolean[] zArr, ds.l<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final <T> int C(@oy.l T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static short[] C0(@oy.l short[] sArr, @oy.l short[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final long C1(long[] jArr, int i10) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return jArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Byte C2(byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return a0.pn(bArr);
    }

    @oy.l
    public static final boolean[] C3(@oy.l boolean[] zArr, @oy.l Collection<Boolean> elements) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(zArrCopyOf);
        return zArrCopyOf;
    }

    @oy.l
    public static final SortedSet<Byte> C4(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return (SortedSet) a0.ty(bArr, new TreeSet());
    }

    public static final <T> int D(@oy.l T[] tArr, T t10, @oy.l Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static final boolean[] D0(@oy.l boolean[] zArr, @oy.l boolean[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final <T> T D1(T[] tArr, int i10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return tArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character D2(char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return a0.qn(cArr);
    }

    @oy.l
    public static final boolean[] D3(@oy.l boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z10;
        kotlin.jvm.internal.m0.m(zArrCopyOf);
        return zArrCopyOf;
    }

    @oy.l
    public static final SortedSet<Character> D4(@oy.l char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return (SortedSet) a0.uy(cArr, new TreeSet());
    }

    public static final int E(@oy.l short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    public static /* synthetic */ byte[] E0(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return v0(bArr, bArr2, i10, i11, i12);
    }

    @ur.f
    public static final short E1(short[] sArr, int i10) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return sArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable E2(Comparable[] comparableArr) {
        kotlin.jvm.internal.m0.p(comparableArr, "<this>");
        return a0.rn(comparableArr);
    }

    @oy.l
    public static boolean[] E3(@oy.l boolean[] zArr, @oy.l boolean[] elements) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(zArrCopyOf);
        return zArrCopyOf;
    }

    @oy.l
    public static final SortedSet<Double> E4(@oy.l double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return (SortedSet) a0.vy(dArr, new TreeSet());
    }

    public static /* synthetic */ int F(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return w(bArr, b10, i10, i11);
    }

    public static /* synthetic */ char[] F0(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return w0(cArr, cArr2, i10, i11, i12);
    }

    @ur.f
    public static final boolean F1(boolean[] zArr, int i10) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        return zArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double F2(double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return a0.sn(dArr);
    }

    @ur.f
    public static final <T> T[] F3(T[] tArr, T t10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return (T[]) w3(tArr, t10);
    }

    @oy.l
    public static final SortedSet<Float> F4(@oy.l float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return (SortedSet) a0.wy(fArr, new TreeSet());
    }

    public static /* synthetic */ int G(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return x(cArr, c10, i10, i11);
    }

    public static /* synthetic */ double[] G0(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return x0(dArr, dArr2, i10, i11, i12);
    }

    public static void G1(@oy.l byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    @dr.l1(version = "1.1")
    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double G2(Double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return a0.tn(dArr);
    }

    public static final void G3(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @oy.l
    public static final SortedSet<Integer> G4(@oy.l int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return (SortedSet) a0.xy(iArr, new TreeSet());
    }

    public static /* synthetic */ int H(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return y(dArr, d10, i10, i11);
    }

    public static /* synthetic */ float[] H0(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return y0(fArr, fArr2, i10, i11, i12);
    }

    public static void H1(@oy.l char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float H2(float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return a0.un(fArr);
    }

    public static final void H3(@oy.l byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @oy.l
    public static final SortedSet<Long> H4(@oy.l long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return (SortedSet) a0.yy(jArr, new TreeSet());
    }

    public static /* synthetic */ int I(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return z(fArr, f10, i10, i11);
    }

    public static /* synthetic */ int[] I0(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return z0(iArr, iArr2, i10, i11, i12);
    }

    public static final void I1(@oy.l double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    @dr.l1(version = "1.1")
    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float I2(Float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return a0.vn(fArr);
    }

    public static final void I3(@oy.l char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @oy.l
    public static <T extends Comparable<? super T>> SortedSet<T> I4(@oy.l T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return (SortedSet) a0.zy(tArr, new TreeSet());
    }

    public static /* synthetic */ int J(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return A(iArr, i10, i11, i12);
    }

    public static /* synthetic */ long[] J0(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return A0(jArr, jArr2, i10, i11, i12);
    }

    public static final void J1(@oy.l float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Integer J2(int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return a0.wn(iArr);
    }

    public static final void J3(@oy.l char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @oy.l
    public static final <T> SortedSet<T> J4(@oy.l T[] tArr, @oy.l Comparator<? super T> comparator) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return (SortedSet) a0.zy(tArr, new TreeSet(comparator));
    }

    public static /* synthetic */ int K(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return B(jArr, j10, i10, i11);
    }

    public static /* synthetic */ Object[] K0(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return B0(objArr, objArr2, i10, i11, i12);
    }

    public static void K1(@oy.l int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Long K2(long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return a0.xn(jArr);
    }

    public static final void K3(@oy.l double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @oy.l
    public static final SortedSet<Short> K4(@oy.l short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return (SortedSet) a0.Ay(sArr, new TreeSet());
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return C(objArr, obj, i10, i11);
    }

    public static /* synthetic */ short[] L0(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return C0(sArr, sArr2, i10, i11, i12);
    }

    public static void L1(@oy.l long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minOrNull instead.", replaceWith = @dr.g1(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Short L2(short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return a0.yn(sArr);
    }

    public static void L3(@oy.l double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    @oy.l
    public static final SortedSet<Boolean> L4(@oy.l boolean[] zArr) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        return (SortedSet) a0.By(zArr, new TreeSet());
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return D(objArr, obj, comparator, i10, i11);
    }

    public static /* synthetic */ boolean[] M0(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return D0(zArr, zArr2, i10, i11, i12);
    }

    public static <T> void M1(@oy.l T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean M2(boolean[] zArr, ds.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iHe = a0.He(zArr);
        if (iHe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= iHe) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iHe) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    public static final void M3(@oy.l float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @oy.l
    public static Boolean[] M4(@oy.l boolean[] zArr) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static /* synthetic */ int N(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return E(sArr, s10, i10, i11);
    }

    @ur.f
    public static final byte[] N0(byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static void N1(@oy.l short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte N2(byte[] bArr, ds.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iZe = a0.ze(bArr);
        if (iZe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= iZe) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iZe) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    public static void N3(@oy.l float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @oy.l
    public static final Byte[] N4(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @dr.l1(version = "1.1")
    @cs.j(name = "contentDeepEqualsInline")
    @ur.i
    @ur.f
    public static final <T> boolean O(T[] tArr, T[] other) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        return p.g(tArr, other);
    }

    @ur.f
    public static final byte[] O0(byte[] bArr, int i10) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final void O1(@oy.l boolean[] zArr, boolean z10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character O2(char[] cArr, ds.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iAe = a0.Ae(cArr);
        if (iAe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= iAe) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iAe) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    public static final void O3(@oy.l int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @oy.l
    public static final Character[] O4(@oy.l char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @cs.j(name = "contentDeepEqualsNullable")
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return p.g(tArr, tArr2);
    }

    @ur.f
    public static final char[] P0(char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.m0.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void P1(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        G1(bArr, b10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double P2(double[] dArr, ds.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iBe = a0.Be(dArr);
        if (iBe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= iBe) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iBe) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    public static void P3(@oy.l int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @oy.l
    public static Double[] P4(@oy.l double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @dr.l1(version = "1.1")
    @cs.j(name = "contentDeepHashCodeInline")
    @ur.i
    @ur.f
    public static final <T> int Q(T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return o.b(tArr);
    }

    @ur.f
    public static final char[] Q0(char[] cArr, int i10) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        kotlin.jvm.internal.m0.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void Q1(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        H1(cArr, c10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float Q2(float[] fArr, ds.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iCe = a0.Ce(fArr);
        if (iCe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= iCe) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iCe) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    public static final void Q3(@oy.l long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @oy.l
    public static Float[] Q4(@oy.l float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @cs.j(name = "contentDeepHashCodeNullable")
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> int R(T[] tArr) {
        return o.b(tArr);
    }

    @ur.f
    public static final double[] R0(double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.m0.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void R1(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        I1(dArr, d10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer R2(int[] iArr, ds.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iDe = a0.De(iArr);
        if (iDe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= iDe) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == iDe) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static void R3(@oy.l long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @oy.l
    public static Integer[] R4(@oy.l int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @dr.l1(version = "1.1")
    @cs.j(name = "contentDeepToStringInline")
    @ur.i
    @ur.f
    public static final <T> String S(T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return p.h(tArr);
    }

    @ur.f
    public static final double[] S0(double[] dArr, int i10) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
        kotlin.jvm.internal.m0.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void S1(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        J1(fArr, f10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long S2(long[] jArr, ds.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iEe = a0.Ee(jArr);
        if (iEe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= iEe) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iEe) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @ur.f
    public static final <T extends Comparable<? super T>> void S3(T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        U3(tArr);
    }

    @oy.l
    public static Long[] S4(@oy.l long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @cs.j(name = "contentDeepToStringNullable")
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> String T(T[] tArr) {
        return p.h(tArr);
    }

    @ur.f
    public static final float[] T0(float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.m0.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void T1(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        K1(iArr, i10, i11, i12);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T T2(T[] tArr, ds.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iFe = a0.Fe(tArr);
        if (iFe != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= iFe) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iFe) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @dr.l1(version = sc.k.f129877g)
    public static final <T extends Comparable<? super T>> void T3(@oy.l T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @oy.l
    public static final Short[] T4(@oy.l short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean U(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @ur.f
    public static final float[] U0(float[] fArr, int i10) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
        kotlin.jvm.internal.m0.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void U1(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        L1(jArr, j10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minByOrNull instead.", replaceWith = @dr.g1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short U2(short[] sArr, ds.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iGe = a0.Ge(sArr);
        if (iGe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= iGe) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iGe) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    public static final <T> void U3(@oy.l T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean V(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @ur.f
    public static final int[] V0(int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void V1(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        M1(objArr, obj, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean V2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Jn(zArr, comparator);
    }

    public static final <T> void V3(@oy.l T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean W(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @ur.f
    public static final int[] W0(int[] iArr, int i10) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void W1(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        N1(sArr, s10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte W2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Kn(bArr, comparator);
    }

    public static final void W3(@oy.l short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean X(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @ur.f
    public static final long[] X0(long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.m0.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    public static /* synthetic */ void X1(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        O1(zArr, z10, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character X2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Ln(cArr, comparator);
    }

    public static final void X3(@oy.l short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean Y(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @ur.f
    public static final long[] Y0(long[] jArr, int i10) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        kotlin.jvm.internal.m0.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @oy.l
    public static final <R> List<R> Y1(@oy.l Object[] objArr, @oy.l Class<R> klass) {
        kotlin.jvm.internal.m0.p(objArr, "<this>");
        kotlin.jvm.internal.m0.p(klass, "klass");
        return (List) Z1(objArr, new ArrayList(), klass);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double Y2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Mn(dArr, comparator);
    }

    public static /* synthetic */ void Y3(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        H3(bArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean Z(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @ur.f
    public static final <T> T[] Z0(T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.m0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @oy.l
    public static final <C extends Collection<? super R>, R> C Z1(@oy.l Object[] objArr, @oy.l C destination, @oy.l Class<R> klass) {
        kotlin.jvm.internal.m0.p(objArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float Z2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Nn(fArr, comparator);
    }

    public static /* synthetic */ void Z3(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        J3(cArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> boolean a0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @ur.f
    public static final <T> T[] a1(T[] tArr, int i10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        kotlin.jvm.internal.m0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Byte a2(byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return a0.Rk(bArr);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer a3(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.On(iArr, comparator);
    }

    public static /* synthetic */ void a4(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        L3(dArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean b0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @ur.f
    public static final short[] b1(short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.m0.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character b2(char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return a0.Sk(cArr);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long b3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Pn(jArr, comparator);
    }

    public static /* synthetic */ void b4(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        N3(fArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final boolean c0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @ur.f
    public static final short[] c1(short[] sArr, int i10) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        kotlin.jvm.internal.m0.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable c2(Comparable[] comparableArr) {
        kotlin.jvm.internal.m0.p(comparableArr, "<this>");
        return a0.Tk(comparableArr);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object c3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(objArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Qn(objArr, comparator);
    }

    public static /* synthetic */ void c4(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        P3(iArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int d0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @ur.f
    public static final boolean[] d1(boolean[] zArr) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.m0.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double d2(double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return a0.Uk(dArr);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use minWithOrNull instead.", replaceWith = @dr.g1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short d3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.Rn(sArr, comparator);
    }

    public static /* synthetic */ void d4(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        R3(jArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int e0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @ur.f
    public static final boolean[] e1(boolean[] zArr, int i10) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
        kotlin.jvm.internal.m0.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @dr.l1(version = "1.1")
    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double e2(Double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return a0.Vk(dArr);
    }

    @oy.l
    public static byte[] e3(@oy.l byte[] bArr, byte b10) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b10;
        kotlin.jvm.internal.m0.m(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void e4(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        T3(comparableArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int f0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static byte[] f1(@oy.l byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        o.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.m0.o(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float f2(float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return a0.Wk(fArr);
    }

    @oy.l
    public static final byte[] f3(@oy.l byte[] bArr, @oy.l Collection<Byte> elements) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void f4(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        V3(objArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int g0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static final char[] g1(@oy.l char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        o.c(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        kotlin.jvm.internal.m0.o(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    @dr.l1(version = "1.1")
    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float g2(Float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return a0.Xk(fArr);
    }

    @oy.l
    public static byte[] g3(@oy.l byte[] bArr, @oy.l byte[] elements) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void g4(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        X3(sArr, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int h0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static final double[] h1(@oy.l double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        o.c(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        kotlin.jvm.internal.m0.o(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Integer h2(int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return a0.Yk(iArr);
    }

    @oy.l
    public static final char[] h3(@oy.l char[] cArr, char c10) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c10;
        kotlin.jvm.internal.m0.m(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final <T> void h4(@oy.l T[] tArr, @oy.l Comparator<? super T> comparator) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int i0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static final float[] i1(@oy.l float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        o.c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        kotlin.jvm.internal.m0.o(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Long i2(long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return a0.Zk(jArr);
    }

    @oy.l
    public static final char[] i3(@oy.l char[] cArr, @oy.l Collection<Character> elements) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final <T> void i4(@oy.l T[] tArr, @oy.l Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> int j0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static int[] j1(@oy.l int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        o.c(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        kotlin.jvm.internal.m0.o(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxOrNull instead.", replaceWith = @dr.g1(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Short j2(short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return a0.al(sArr);
    }

    @oy.l
    public static final char[] j3(@oy.l char[] cArr, @oy.l char[] elements) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(cArrCopyOf);
        return cArrCopyOf;
    }

    public static /* synthetic */ void j4(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        i4(objArr, comparator, i10, i11);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int k0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static long[] k1(@oy.l long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        o.c(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        kotlin.jvm.internal.m0.o(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean k2(boolean[] zArr, ds.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iHe = a0.He(zArr);
        if (iHe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= iHe) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iHe) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @oy.l
    public static final double[] k3(@oy.l double[] dArr, double d10) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d10;
        kotlin.jvm.internal.m0.m(dArrCopyOf);
        return dArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal k4(byte[] bArr, ds.l<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final int l0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static <T> T[] l1(@oy.l T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        o.c(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.m0.o(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte l2(byte[] bArr, ds.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iZe = a0.ze(bArr);
        if (iZe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= iZe) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iZe) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @oy.l
    public static final double[] l3(@oy.l double[] dArr, @oy.l Collection<Double> elements) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(dArrCopyOf);
        return dArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal l4(char[] cArr, ds.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String m0(byte[] bArr) {
        String string = Arrays.toString(bArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static short[] m1(@oy.l short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        o.c(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        kotlin.jvm.internal.m0.o(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m2(char[] cArr, ds.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iAe = a0.Ae(cArr);
        if (iAe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= iAe) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iAe) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @oy.l
    public static double[] m3(@oy.l double[] dArr, @oy.l double[] elements) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(dArrCopyOf);
        return dArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal m4(double[] dArr, ds.l<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static final List<Byte> n(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return new a(bArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String n0(char[] cArr) {
        String string = Arrays.toString(cArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @dr.f1
    @dr.l1(version = "1.3")
    @cs.j(name = "copyOfRange")
    @oy.l
    public static final boolean[] n1(@oy.l boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        o.c(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        kotlin.jvm.internal.m0.o(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double n2(double[] dArr, ds.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iBe = a0.Be(dArr);
        if (iBe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= iBe) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iBe) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @oy.l
    public static final float[] n3(@oy.l float[] fArr, float f10) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f10;
        kotlin.jvm.internal.m0.m(fArrCopyOf);
        return fArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal n4(float[] fArr, ds.l<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static final List<Character> o(@oy.l char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return new h(cArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String o0(double[] dArr) {
        String string = Arrays.toString(dArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final byte[] o1(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return f1(bArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o2(float[] fArr, ds.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iCe = a0.Ce(fArr);
        if (iCe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= iCe) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iCe) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @oy.l
    public static final float[] o3(@oy.l float[] fArr, @oy.l Collection<Float> elements) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(fArrCopyOf);
        return fArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal o4(int[] iArr, ds.l<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static List<Double> p(@oy.l double[] dArr) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return new f(dArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String p0(float[] fArr) {
        String string = Arrays.toString(fArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final char[] p1(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return g1(cArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer p2(int[] iArr, ds.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iDe = a0.De(iArr);
        if (iDe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= iDe) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == iDe) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @oy.l
    public static float[] p3(@oy.l float[] fArr, @oy.l float[] elements) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(fArrCopyOf);
        return fArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal p4(long[] jArr, ds.l<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static final List<Float> q(@oy.l float[] fArr) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return new e(fArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String q0(int[] iArr) {
        String string = Arrays.toString(iArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final double[] q1(double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return h1(dArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long q2(long[] jArr, ds.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iEe = a0.Ee(jArr);
        if (iEe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= iEe) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iEe) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @oy.l
    public static int[] q3(@oy.l int[] iArr, int i10) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        kotlin.jvm.internal.m0.m(iArrCopyOf);
        return iArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final <T> BigDecimal q4(T[] tArr, ds.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static List<Integer> r(@oy.l int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return new c(iArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String r0(long[] jArr) {
        String string = Arrays.toString(jArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final float[] r1(float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return i1(fArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T r2(T[] tArr, ds.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iFe = a0.Fe(tArr);
        if (iFe != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= iFe) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iFe) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @oy.l
    public static final int[] r3(@oy.l int[] iArr, @oy.l Collection<Integer> elements) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(iArrCopyOf);
        return iArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal r4(short[] sArr, ds.l<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static List<Long> s(@oy.l long[] jArr) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return new d(jArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <T> String s0(T[] tArr) {
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final int[] s1(int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        return j1(iArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxByOrNull instead.", replaceWith = @dr.g1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short s2(short[] sArr, ds.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iGe = a0.Ge(sArr);
        if (iGe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= iGe) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iGe) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @oy.l
    public static int[] s3(@oy.l int[] iArr, @oy.l int[] elements) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(iArrCopyOf);
        return iArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigDecimal")
    @dr.y0
    @ur.f
    public static final BigDecimal s4(boolean[] zArr, ds.l<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.m0.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @oy.l
    public static <T> List<T> t(@oy.l T[] tArr) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        List<T> listA = b0.a(tArr);
        kotlin.jvm.internal.m0.o(listA, "asList(...)");
        return listA;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String t0(short[] sArr) {
        String string = Arrays.toString(sArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final long[] t1(long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        return k1(jArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean t2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.ll(zArr, comparator);
    }

    @oy.l
    public static long[] t3(@oy.l long[] jArr, long j10) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j10;
        kotlin.jvm.internal.m0.m(jArrCopyOf);
        return jArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger t4(byte[] bArr, ds.l<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @oy.l
    public static final List<Short> u(@oy.l short[] sArr) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return new b(sArr);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final String u0(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final <T> T[] u1(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return (T[]) l1(tArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte u2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.ml(bArr, comparator);
    }

    @oy.l
    public static final long[] u3(@oy.l long[] jArr, @oy.l Collection<Long> elements) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(jArrCopyOf);
        return jArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger u4(char[] cArr, ds.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @oy.l
    public static final List<Boolean> v(@oy.l boolean[] zArr) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        return new g(zArr);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static byte[] v0(@oy.l byte[] bArr, @oy.l byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final short[] v1(short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        return m1(sArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character v2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.nl(cArr, comparator);
    }

    @oy.l
    public static long[] v3(@oy.l long[] jArr, @oy.l long[] elements) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        kotlin.jvm.internal.m0.m(jArrCopyOf);
        return jArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger v4(double[] dArr, ds.l<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int w(@oy.l byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static char[] w0(@oy.l char[] cArr, @oy.l char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @cs.j(name = "copyOfRangeInline")
    @ur.f
    public static final boolean[] w1(boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(zArr, "<this>");
        return n1(zArr, i10, i11);
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double w2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.ol(dArr, comparator);
    }

    @oy.l
    public static final <T> T[] w3(@oy.l T[] tArr, T t10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        kotlin.jvm.internal.m0.m(tArr2);
        return tArr2;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger w4(float[] fArr, ds.l<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int x(@oy.l char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static double[] x0(@oy.l double[] dArr, @oy.l double[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final byte x1(byte[] bArr, int i10) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return bArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float x2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.pl(fArr, comparator);
    }

    @oy.l
    public static <T> T[] x3(@oy.l T[] tArr, @oy.l Collection<? extends T> elements) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.m0.m(tArr2);
        return tArr2;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger x4(int[] iArr, ds.l<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int y(@oy.l double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static float[] y0(@oy.l float[] fArr, @oy.l float[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final char y1(char[] cArr, int i10) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return cArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer y2(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.ql(iArr, comparator);
    }

    @oy.l
    public static <T> T[] y3(@oy.l T[] tArr, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        kotlin.jvm.internal.m0.m(tArr2);
        return tArr2;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final BigInteger y4(long[] jArr, ds.l<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int z(@oy.l float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static int[] z0(@oy.l int[] iArr, @oy.l int[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(iArr, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @ur.f
    public static final double z1(double[] dArr, int i10) {
        kotlin.jvm.internal.m0.p(dArr, "<this>");
        return dArr[i10];
    }

    @dr.p(errorSince = "1.5", hiddenSince = "1.6", warningSince = sc.k.f129877g)
    @dr.o(message = "Use maxWithOrNull instead.", replaceWith = @dr.g1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long z2(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.m0.p(jArr, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return a0.rl(jArr, comparator);
    }

    @oy.l
    public static final short[] z3(@oy.l short[] sArr, @oy.l Collection<Short> elements) {
        kotlin.jvm.internal.m0.p(sArr, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.m0.m(sArrCopyOf);
        return sArrCopyOf;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "sumOfBigInteger")
    @dr.y0
    @ur.f
    public static final <T> BigInteger z4(T[] tArr, ds.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.m0.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
