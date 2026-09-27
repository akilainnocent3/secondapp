package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import eh.o1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import k.e0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import re.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class AdPlaybackState implements j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48667h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48668i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48669j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48670k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48671l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AdPlaybackState f48672m = new AdPlaybackState(null, new b[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f48673n = new b(0).k(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f48674o = o1.R0(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f48675p = o1.R0(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f48676q = o1.R0(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f48677r = o1.R0(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j.a<AdPlaybackState> f48678s = new j.a() { // from class: ag.a
        @Override // re.j.a
        public final re.j fromBundle(Bundle bundle) {
            return AdPlaybackState.e(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f48679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b[] f48684g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f48685j = o1.R0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f48686k = o1.R0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f48687l = o1.R0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f48688m = o1.R0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f48689n = o1.R0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f48690o = o1.R0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f48691p = o1.R0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f48692q = o1.R0(7);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j.a<b> f48693r = new j.a() { // from class: ag.b
            @Override // re.j.a
            public final re.j fromBundle(Bundle bundle) {
                return AdPlaybackState.b.e(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri[] f48697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f48698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f48699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48700h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f48701i;

        @CheckResult
        public static long[] c(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @CheckResult
        public static int[] d(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static b e(Bundle bundle) {
            long j10 = bundle.getLong(f48685j);
            int i10 = bundle.getInt(f48686k);
            int i11 = bundle.getInt(f48692q);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f48687l);
            int[] intArray = bundle.getIntArray(f48688m);
            long[] longArray = bundle.getLongArray(f48689n);
            long j11 = bundle.getLong(f48690o);
            boolean z10 = bundle.getBoolean(f48691p);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new b(j10, i10, i11, iArr, uriArr, longArray, j11, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f48694b == bVar.f48694b && this.f48695c == bVar.f48695c && this.f48696d == bVar.f48696d && Arrays.equals(this.f48697e, bVar.f48697e) && Arrays.equals(this.f48698f, bVar.f48698f) && Arrays.equals(this.f48699g, bVar.f48699g) && this.f48700h == bVar.f48700h && this.f48701i == bVar.f48701i) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return g(-1);
        }

        public int g(@e0(from = -1) int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f48698f;
                if (i12 >= iArr.length || this.f48701i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean h() {
            if (this.f48695c == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f48695c; i10++) {
                int i11 = this.f48698f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f48695c * 31) + this.f48696d) * 31;
            long j10 = this.f48694b;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f48697e)) * 31) + Arrays.hashCode(this.f48698f)) * 31) + Arrays.hashCode(this.f48699g)) * 31;
            long j11 = this.f48700h;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f48701i ? 1 : 0);
        }

        public final boolean i() {
            return this.f48701i && this.f48694b == Long.MIN_VALUE && this.f48695c == -1;
        }

        public boolean j() {
            return this.f48695c == -1 || f() < this.f48695c;
        }

        @CheckResult
        public b k(int i10) {
            int[] iArrD = d(this.f48698f, i10);
            long[] jArrC = c(this.f48699g, i10);
            return new b(this.f48694b, i10, this.f48696d, iArrD, (Uri[]) Arrays.copyOf(this.f48697e, i10), jArrC, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b l(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f48697e;
            if (length < uriArr.length) {
                jArr = c(jArr, uriArr.length);
            } else if (this.f48695c != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new b(this.f48694b, this.f48695c, this.f48696d, this.f48698f, this.f48697e, jArr, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b m(int i10, @e0(from = 0) int i11) {
            int i12 = this.f48695c;
            eh.a.a(i12 == -1 || i11 < i12);
            int[] iArrD = d(this.f48698f, i11 + 1);
            int i13 = iArrD[i11];
            eh.a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrC = this.f48699g;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = this.f48697e;
            if (uriArr.length != iArrD.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrD.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrD[i11] = i10;
            return new b(this.f48694b, this.f48695c, this.f48696d, iArrD, uriArr2, jArr, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b n(Uri uri, @e0(from = 0) int i10) {
            int[] iArrD = d(this.f48698f, i10 + 1);
            long[] jArrC = this.f48699g;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f48697e, iArrD.length);
            uriArr[i10] = uri;
            iArrD[i10] = 1;
            return new b(this.f48694b, this.f48695c, this.f48696d, iArrD, uriArr, jArr, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b o() {
            if (this.f48695c == -1) {
                return this;
            }
            int[] iArr = this.f48698f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 3 || i11 == 2 || i11 == 4) {
                    iArrCopyOf[i10] = this.f48697e[i10] == null ? 0 : 1;
                }
            }
            return new b(this.f48694b, length, this.f48696d, iArrCopyOf, this.f48697e, this.f48699g, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b p() {
            if (this.f48695c == -1) {
                return new b(this.f48694b, 0, this.f48696d, new int[0], new Uri[0], new long[0], this.f48700h, this.f48701i);
            }
            int[] iArr = this.f48698f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new b(this.f48694b, length, this.f48696d, iArrCopyOf, this.f48697e, this.f48699g, this.f48700h, this.f48701i);
        }

        @CheckResult
        public b q(long j10) {
            return new b(this.f48694b, this.f48695c, this.f48696d, this.f48698f, this.f48697e, this.f48699g, j10, this.f48701i);
        }

        @CheckResult
        public b r(boolean z10) {
            return new b(this.f48694b, this.f48695c, this.f48696d, this.f48698f, this.f48697e, this.f48699g, this.f48700h, z10);
        }

        public b s() {
            int[] iArr = this.f48698f;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f48697e, length);
            long[] jArrCopyOf = this.f48699g;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new b(this.f48694b, length, this.f48696d, iArrCopyOf, uriArr, jArr, o1.O1(jArr), this.f48701i);
        }

        public b t(int i10) {
            return new b(this.f48694b, this.f48695c, i10, this.f48698f, this.f48697e, this.f48699g, this.f48700h, this.f48701i);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f48685j, this.f48694b);
            bundle.putInt(f48686k, this.f48695c);
            bundle.putInt(f48692q, this.f48696d);
            bundle.putParcelableArrayList(f48687l, new ArrayList<>(Arrays.asList(this.f48697e)));
            bundle.putIntArray(f48688m, this.f48698f);
            bundle.putLongArray(f48689n, this.f48699g);
            bundle.putLong(f48690o, this.f48700h);
            bundle.putBoolean(f48691p, this.f48701i);
            return bundle;
        }

        @CheckResult
        public b u(long j10) {
            return new b(j10, this.f48695c, this.f48696d, this.f48698f, this.f48697e, this.f48699g, this.f48700h, this.f48701i);
        }

        public b(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public b(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            eh.a.a(iArr.length == uriArr.length);
            this.f48694b = j10;
            this.f48695c = i10;
            this.f48696d = i11;
            this.f48698f = iArr;
            this.f48697e = uriArr;
            this.f48699g = jArr;
            this.f48700h = j11;
            this.f48701i = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, b(jArr), 0L, -9223372036854775807L, 0);
    }

    public static b[] b(long[] jArr) {
        int length = jArr.length;
        b[] bVarArr = new b[length];
        for (int i10 = 0; i10 < length; i10++) {
            bVarArr[i10] = new b(jArr[i10]);
        }
        return bVarArr;
    }

    public static AdPlaybackState d(Object obj, AdPlaybackState adPlaybackState) {
        int i10 = adPlaybackState.f48680c - adPlaybackState.f48683f;
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = adPlaybackState.f48684g[i11];
            long j10 = bVar.f48694b;
            int i12 = bVar.f48695c;
            int i13 = bVar.f48696d;
            int[] iArr = bVar.f48698f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = bVar.f48697e;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = bVar.f48699g;
            bVarArr[i11] = new b(j10, i12, i13, iArrCopyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), bVar.f48700h, bVar.f48701i);
        }
        return new AdPlaybackState(obj, bVarArr, adPlaybackState.f48681d, adPlaybackState.f48682e, adPlaybackState.f48683f);
    }

    public static AdPlaybackState e(Bundle bundle) {
        b[] bVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f48674o);
        if (parcelableArrayList == null) {
            bVarArr = new b[0];
        } else {
            b[] bVarArr2 = new b[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                bVarArr2[i10] = (b) b.f48693r.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            bVarArr = bVarArr2;
        }
        String str = f48675p;
        AdPlaybackState adPlaybackState = f48672m;
        return new AdPlaybackState(null, bVarArr, bundle.getLong(str, adPlaybackState.f48681d), bundle.getLong(f48676q, adPlaybackState.f48682e), bundle.getInt(f48677r, adPlaybackState.f48683f));
    }

    @CheckResult
    public AdPlaybackState A(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i12] = bVarArr2[i12].m(3, i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState B(@e0(from = 0) int i10) {
        int i11 = this.f48683f;
        if (i11 == i10) {
            return this;
        }
        eh.a.a(i10 > i11);
        int i12 = this.f48680c - i10;
        b[] bVarArr = new b[i12];
        System.arraycopy(this.f48684g, i10 - this.f48683f, bVarArr, 0, i12);
        return new AdPlaybackState(this.f48679b, bVarArr, this.f48681d, this.f48682e, i10);
    }

    @CheckResult
    public AdPlaybackState C(@e0(from = 0) int i10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].o();
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState D(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i12] = bVarArr2[i12].m(2, i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState E(@e0(from = 0) int i10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].p();
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    public boolean c() {
        int i10 = this.f48680c - 1;
        return i10 >= 0 && j(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdPlaybackState.class == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (o1.g(this.f48679b, adPlaybackState.f48679b) && this.f48680c == adPlaybackState.f48680c && this.f48681d == adPlaybackState.f48681d && this.f48682e == adPlaybackState.f48682e && this.f48683f == adPlaybackState.f48683f && Arrays.equals(this.f48684g, adPlaybackState.f48684g)) {
                return true;
            }
        }
        return false;
    }

    public b f(@e0(from = 0) int i10) {
        int i11 = this.f48683f;
        return i10 < i11 ? f48673n : this.f48684g[i10 - i11];
    }

    public int g(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f48683f;
            while (i10 < this.f48680c && ((f(i10).f48694b != Long.MIN_VALUE && f(i10).f48694b <= j10) || !f(i10).j())) {
                i10++;
            }
            if (i10 < this.f48680c) {
                return i10;
            }
        }
        return -1;
    }

    public int h(long j10, long j11) {
        int i10 = this.f48680c - 1;
        int i11 = i10 - (j(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!k(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !f(i11).h()) {
            return -1;
        }
        return i11;
    }

    public int hashCode() {
        int i10 = this.f48680c * 31;
        Object obj = this.f48679b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f48681d)) * 31) + ((int) this.f48682e)) * 31) + this.f48683f) * 31) + Arrays.hashCode(this.f48684g);
    }

    public boolean i(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        b bVarF;
        int i12;
        return i10 < this.f48680c && (i12 = (bVarF = f(i10)).f48695c) != -1 && i11 < i12 && bVarF.f48698f[i11] == 4;
    }

    public boolean j(int i10) {
        return i10 == this.f48680c - 1 && f(i10).i();
    }

    public final boolean k(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        b bVarF = f(i10);
        long j12 = bVarF.f48694b;
        if (j12 == Long.MIN_VALUE) {
            return j11 == -9223372036854775807L || (bVarF.f48701i && bVarF.f48695c == -1) || j10 < j11;
        }
        return j10 < j12;
    }

    @CheckResult
    public AdPlaybackState l(@e0(from = 0) int i10, @e0(from = 1) int i11) {
        eh.a.a(i11 > 0);
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        if (bVarArr[i12].f48695c == i11) {
            return this;
        }
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i12] = this.f48684g[i12].k(i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState m(@e0(from = 0) int i10, long... jArr) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].l(jArr);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState n(long[][] jArr) {
        eh.a.i(this.f48683f == 0);
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        for (int i10 = 0; i10 < this.f48680c; i10++) {
            bVarArr2[i10] = bVarArr2[i10].l(jArr[i10]);
        }
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState o(@e0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = this.f48684g[i11].u(j10);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState p(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i12] = bVarArr2[i12].m(4, i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState q(long j10) {
        return this.f48681d == j10 ? this : new AdPlaybackState(this.f48679b, this.f48684g, j10, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState r(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        return s(i10, i11, Uri.EMPTY);
    }

    @CheckResult
    public AdPlaybackState s(@e0(from = 0) int i10, @e0(from = 0) int i11, Uri uri) {
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        eh.a.i(!Uri.EMPTY.equals(uri) || bVarArr2[i12].f48701i);
        bVarArr2[i12] = bVarArr2[i12].n(uri, i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState t(long j10) {
        return this.f48682e == j10 ? this : new AdPlaybackState(this.f48679b, this.f48684g, this.f48681d, j10, this.f48683f);
    }

    @Override // re.j
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b bVar : this.f48684g) {
            arrayList.add(bVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f48674o, arrayList);
        }
        long j10 = this.f48681d;
        AdPlaybackState adPlaybackState = f48672m;
        if (j10 != adPlaybackState.f48681d) {
            bundle.putLong(f48675p, j10);
        }
        long j11 = this.f48682e;
        if (j11 != adPlaybackState.f48682e) {
            bundle.putLong(f48676q, j11);
        }
        int i10 = this.f48683f;
        if (i10 != adPlaybackState.f48683f) {
            bundle.putInt(f48677r, i10);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f48679b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f48681d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f48684g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f48684g[i10].f48694b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f48684g[i10].f48698f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f48684g[i10].f48698f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append(PublicSuffixDatabase.f119166e);
                }
                sb2.append(", durationUs=");
                sb2.append(this.f48684g[i10].f48699g[i11]);
                sb2.append(')');
                if (i11 < this.f48684g[i10].f48698f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f48684g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    @CheckResult
    public AdPlaybackState u(@e0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        if (bVarArr[i11].f48700h == j10) {
            return this;
        }
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].q(j10);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState v(@e0(from = 0) int i10, boolean z10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        if (bVarArr[i11].f48701i == z10) {
            return this;
        }
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].r(z10);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState w(@e0(from = 0) int i10) {
        int i11 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i11] = bVarArr2[i11].s();
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    public AdPlaybackState x() {
        return y(this.f48680c, Long.MIN_VALUE).v(this.f48680c, true);
    }

    @CheckResult
    public AdPlaybackState y(@e0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f48683f;
        b bVar = new b(j10);
        b[] bVarArr = (b[]) o1.n1(this.f48684g, bVar);
        System.arraycopy(bVarArr, i11, bVarArr, i11 + 1, this.f48684g.length - i11);
        bVarArr[i11] = bVar;
        return new AdPlaybackState(this.f48679b, bVarArr, this.f48681d, this.f48682e, this.f48683f);
    }

    @CheckResult
    public AdPlaybackState z(@e0(from = 0) int i10, int i11) {
        int i12 = i10 - this.f48683f;
        b[] bVarArr = this.f48684g;
        if (bVarArr[i12].f48696d == i11) {
            return this;
        }
        b[] bVarArr2 = (b[]) o1.p1(bVarArr, bVarArr.length);
        bVarArr2[i12] = bVarArr2[i12].t(i11);
        return new AdPlaybackState(this.f48679b, bVarArr2, this.f48681d, this.f48682e, this.f48683f);
    }

    public AdPlaybackState(@Nullable Object obj, b[] bVarArr, long j10, long j11, int i10) {
        this.f48679b = obj;
        this.f48681d = j10;
        this.f48682e = j11;
        this.f48680c = bVarArr.length + i10;
        this.f48684g = bVarArr;
        this.f48683f = i10;
    }
}
