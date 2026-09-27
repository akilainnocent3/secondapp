package u4;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f138099h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f138100i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f138101j = x4.b2.k1(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f138102k = x4.b2.k1(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f138103l = x4.b2.k1(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f138104m = x4.b2.k1(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f138105n = x4.b2.k1(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f138106o = x4.b2.k1(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f138110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f138111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f138112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f138113g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f138115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f138116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f138117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f138118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f138119f;

        public b0 a() {
            return new b0(this.f138114a, this.f138115b, this.f138116c, this.f138117d, this.f138118e, this.f138119f);
        }

        @qj.a
        public b b(int i10) {
            this.f138119f = i10;
            return this;
        }

        @qj.a
        public b c(int i10) {
            this.f138115b = i10;
            return this;
        }

        @qj.a
        public b d(int i10) {
            this.f138114a = i10;
            return this;
        }

        @qj.a
        public b e(int i10) {
            this.f138116c = i10;
            return this;
        }

        @qj.a
        public b f(@Nullable byte[] bArr) {
            this.f138117d = bArr;
            return this;
        }

        @qj.a
        public b g(int i10) {
            this.f138118e = i10;
            return this;
        }

        public b() {
            this.f138114a = -1;
            this.f138115b = -1;
            this.f138116c = -1;
            this.f138118e = -1;
            this.f138119f = -1;
        }

        public b(b0 b0Var) {
            this.f138114a = b0Var.f138107a;
            this.f138115b = b0Var.f138108b;
            this.f138116c = b0Var.f138109c;
            this.f138117d = b0Var.f138110d;
            this.f138118e = b0Var.f138111e;
            this.f138119f = b0Var.f138112f;
        }
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    public static int d(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int e(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 6;
    }

    public static String f(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 13;
        }
        if (i10 == 6) {
            return 16;
        }
        if (i10 != 7) {
            return i10 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String h(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static b0 i(Bundle bundle) {
        return new b0(bundle.getInt(f138101j, -1), bundle.getInt(f138102k, -1), bundle.getInt(f138103l, -1), bundle.getByteArray(f138104m), bundle.getInt(f138105n, -1), bundle.getInt(f138106o, -1));
    }

    @ux.e(expression = {"#1"}, result = false)
    public static boolean l(@Nullable b0 b0Var) {
        if (b0Var == null) {
            return true;
        }
        int i10 = b0Var.f138107a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = b0Var.f138108b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = b0Var.f138109c;
        if ((i12 != -1 && i12 != 3) || b0Var.f138110d != null) {
            return false;
        }
        int i13 = b0Var.f138112f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = b0Var.f138111e;
        return i14 == -1 || i14 == 8;
    }

    public static boolean m(@Nullable b0 b0Var) {
        if (b0Var == null) {
            return false;
        }
        int i10 = b0Var.f138109c;
        return i10 == 7 || i10 == 6;
    }

    @ky.d
    public static int o(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @ky.d
    public static int p(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String q(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f138107a == b0Var.f138107a && this.f138108b == b0Var.f138108b && this.f138109c == b0Var.f138109c && Arrays.equals(this.f138110d, b0Var.f138110d) && this.f138111e == b0Var.f138111e && this.f138112f == b0Var.f138112f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f138113g == 0) {
            this.f138113g = ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f138107a) * 31) + this.f138108b) * 31) + this.f138109c) * 31) + Arrays.hashCode(this.f138110d)) * 31) + this.f138111e) * 31) + this.f138112f;
        }
        return this.f138113g;
    }

    public boolean j() {
        return (this.f138111e == -1 || this.f138112f == -1) ? false : true;
    }

    public boolean k() {
        return (this.f138107a == -1 || this.f138108b == -1 || this.f138109c == -1) ? false : true;
    }

    public boolean n() {
        return j() || k();
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putInt(f138101j, this.f138107a);
        bundle.putInt(f138102k, this.f138108b);
        bundle.putInt(f138103l, this.f138109c);
        bundle.putByteArray(f138104m, this.f138110d);
        bundle.putInt(f138105n, this.f138111e);
        bundle.putInt(f138106o, this.f138112f);
        return bundle;
    }

    public String s() {
        String str;
        String strV = k() ? x4.b2.V("%s/%s/%s", f(this.f138107a), c(this.f138108b), h(this.f138109c)) : "NA/NA/NA";
        if (j()) {
            str = this.f138111e + to.c.userBaseDel + this.f138112f;
        } else {
            str = "NA/NA";
        }
        return strV + to.c.userBaseDel + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(f(this.f138107a));
        sb2.append(", ");
        sb2.append(c(this.f138108b));
        sb2.append(", ");
        sb2.append(h(this.f138109c));
        sb2.append(", ");
        sb2.append(this.f138110d != null);
        sb2.append(", ");
        sb2.append(q(this.f138111e));
        sb2.append(", ");
        sb2.append(b(this.f138112f));
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    public b0(int i10, int i11, int i12, @Nullable byte[] bArr, int i13, int i14) {
        this.f138107a = i10;
        this.f138108b = i11;
        this.f138109c = i12;
        this.f138110d = bArr;
        this.f138111e = i13;
        this.f138112f = i14;
    }
}
