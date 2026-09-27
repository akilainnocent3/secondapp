package fh;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import eh.o1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements re.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f84313g = new c(1, 2, 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f84314h = new b().c(1).b(1).d(2).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84315i = o1.R0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84316j = o1.R0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84317k = o1.R0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84318l = o1.R0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final re.j.a<c> f84319m = new re.j.a() { // from class: fh.b
        @Override // re.j.a
        public final re.j fromBundle(Bundle bundle) {
            return c.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f84323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84324f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f84328d;

        public c a() {
            return new c(this.f84325a, this.f84326b, this.f84327c, this.f84328d);
        }

        @qj.a
        public b b(int i10) {
            this.f84326b = i10;
            return this;
        }

        @qj.a
        public b c(int i10) {
            this.f84325a = i10;
            return this;
        }

        @qj.a
        public b d(int i10) {
            this.f84327c = i10;
            return this;
        }

        @qj.a
        public b e(@Nullable byte[] bArr) {
            this.f84328d = bArr;
            return this;
        }

        public b() {
            this.f84325a = -1;
            this.f84326b = -1;
            this.f84327c = -1;
        }

        public b(c cVar) {
            this.f84325a = cVar.f84320b;
            this.f84326b = cVar.f84321c;
            this.f84327c = cVar.f84322d;
            this.f84328d = cVar.f84323e;
        }
    }

    @Deprecated
    public c(int i10, int i11, int i12, @Nullable byte[] bArr) {
        this.f84320b = i10;
        this.f84321c = i11;
        this.f84322d = i12;
        this.f84323e = bArr;
    }

    public static /* synthetic */ c a(Bundle bundle) {
        return new c(bundle.getInt(f84315i, -1), bundle.getInt(f84316j, -1), bundle.getInt(f84317k, -1), bundle.getByteArray(f84318l));
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    public static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color space" : "BT601";
        }
        return "BT709";
    }

    public static String e(int i10) {
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
        if (i10 != 6) {
            return i10 != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean f(@Nullable c cVar) {
        if (cVar == null) {
            return false;
        }
        int i10 = cVar.f84322d;
        return i10 == 7 || i10 == 6;
    }

    @ky.d
    public static int h(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @ky.d
    public static int i(int i10) {
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

    public b b() {
        return new b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f84320b == cVar.f84320b && this.f84321c == cVar.f84321c && this.f84322d == cVar.f84322d && Arrays.equals(this.f84323e, cVar.f84323e)) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return (this.f84320b == -1 || this.f84321c == -1 || this.f84322d == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f84324f == 0) {
            this.f84324f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f84320b) * 31) + this.f84321c) * 31) + this.f84322d) * 31) + Arrays.hashCode(this.f84323e);
        }
        return this.f84324f;
    }

    public String j() {
        return !g() ? "NA" : o1.M("%s/%s/%s", d(this.f84320b), c(this.f84321c), e(this.f84322d));
    }

    @Override // re.j
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f84315i, this.f84320b);
        bundle.putInt(f84316j, this.f84321c);
        bundle.putInt(f84317k, this.f84322d);
        bundle.putByteArray(f84318l, this.f84323e);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f84320b));
        sb2.append(", ");
        sb2.append(c(this.f84321c));
        sb2.append(", ");
        sb2.append(e(this.f84322d));
        sb2.append(", ");
        sb2.append(this.f84323e != null);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }
}
