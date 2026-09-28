package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class kl00 {
    public final String a;
    public final double b;
    public final int c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final z320 h;
    public final boolean i;
    public final String j;
    public final CountryCodeName k;
    public final dja0 l;
    public final String m;
    public final List<jl00> n;
    public final bv7 o;
    public final bv7 p;
    public final bv7 q;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[z320.values().length];
            try {
                z320.a aVar = z320.c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                z320.a aVar2 = z320.c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                z320.a aVar3 = z320.c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public kl00(String str, double d, int i, String str2, long j, long j2, String str3, z320 z320Var, boolean z, String str4, CountryCodeName countryCodeName, dja0 dja0Var, String str5, List<jl00> list, bv7 bv7Var, bv7 bv7Var2, bv7 bv7Var3) {
        str.getClass();
        str2.getClass();
        dja0Var.getClass();
        list.getClass();
        bv7Var.getClass();
        bv7Var2.getClass();
        bv7Var3.getClass();
        this.a = str;
        this.b = d;
        this.c = i;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = str3;
        this.h = z320Var;
        this.i = z;
        this.j = str4;
        this.k = countryCodeName;
        this.l = dja0Var;
        this.m = str5;
        this.n = list;
        this.o = bv7Var;
        this.p = bv7Var2;
        this.q = bv7Var3;
    }

    public static kl00 a(kl00 kl00Var, String str, bv7 bv7Var, bv7 bv7Var2, bv7 bv7Var3, int i) {
        String str2 = kl00Var.a;
        double d = kl00Var.b;
        int i2 = kl00Var.c;
        String str3 = kl00Var.d;
        long j = kl00Var.e;
        long j2 = kl00Var.f;
        String str4 = kl00Var.g;
        z320 z320Var = kl00Var.h;
        boolean z = kl00Var.i;
        String str5 = (i & 512) != 0 ? kl00Var.j : str;
        CountryCodeName countryCodeName = kl00Var.k;
        String str6 = str5;
        dja0 dja0Var = kl00Var.l;
        String str7 = kl00Var.m;
        List<jl00> list = kl00Var.n;
        bv7 bv7Var4 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? kl00Var.o : bv7Var;
        bv7 bv7Var5 = (i & 32768) != 0 ? kl00Var.p : bv7Var2;
        bv7 bv7Var6 = (i & 65536) != 0 ? kl00Var.q : bv7Var3;
        kl00Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        dja0Var.getClass();
        list.getClass();
        bv7Var4.getClass();
        bv7Var5.getClass();
        bv7Var6.getClass();
        return new kl00(str2, d, i2, str3, j, j2, str4, z320Var, z, str6, countryCodeName, dja0Var, str7, list, bv7Var4, bv7Var5, bv7Var6);
    }

    public final int b() {
        if (this.i) {
            z320 z320Var = this.h;
            int i = z320Var == null ? -1 : a.a[z320Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    return R.color.bg_warning_secondary;
                }
                if (i == 2) {
                    return R.color.bg_danger_secondary;
                }
                if (i == 3) {
                    return R.color.bg_brand_sub_secondary_d_base;
                }
                uhc.a();
                return 0;
            }
        }
        return R.color.bg_brand_sub_secondary_d_base;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl00)) {
            return false;
        }
        kl00 kl00Var = (kl00) obj;
        return Intrinsics.g(this.a, kl00Var.a) && Double.compare(this.b, kl00Var.b) == 0 && this.c == kl00Var.c && Intrinsics.g(this.d, kl00Var.d) && this.e == kl00Var.e && this.f == kl00Var.f && Intrinsics.g(this.g, kl00Var.g) && this.h == kl00Var.h && this.i == kl00Var.i && Intrinsics.g(this.j, kl00Var.j) && this.k == kl00Var.k && this.l == kl00Var.l && Intrinsics.g(this.m, kl00Var.m) && Intrinsics.g(this.n, kl00Var.n) && Intrinsics.g(this.o, kl00Var.o) && Intrinsics.g(this.p, kl00Var.p) && Intrinsics.g(this.q, kl00Var.q);
    }

    public final int hashCode() {
        int iA = gmf0.a(f87.a(f87.a(gmf0.a(gpp.a(this.c, nrg0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), this.e, 31), this.f, 31), 31, this.g);
        z320 z320Var = this.h;
        int iA2 = mtg0.a((iA + (z320Var == null ? 0 : z320Var.hashCode())) * 31, 31, this.i);
        String str = this.j;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        CountryCodeName countryCodeName = this.k;
        int iHashCode2 = (this.l.hashCode() + ((iHashCode + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31)) * 31;
        String str2 = this.m;
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ai50.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.n)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeState(shareCode=");
        sb.append(this.a);
        sb.append(", totalOdds=");
        sb.append(this.b);
        sb.append(", foldsAmount=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        g41.a(this.e, ", deadline=", ", createTime=", sb);
        em5.a(this.f, ", username=", this.g, sb);
        sb.append(", popularityLevel=");
        sb.append(this.h);
        sb.append(", isCreatorCode=");
        sb.append(this.i);
        sb.append(", avatarUrl=");
        sb.append(this.j);
        sb.append(", countryCode=");
        sb.append(this.k);
        sb.append(", userType=");
        sb.append(this.l);
        sb.append(", note=");
        sb.append(this.m);
        sb.append(", shareCodeDetail=");
        sb.append(this.n);
        sb.append(", shareButton=");
        sb.append(this.o);
        sb.append(", editButton=");
        sb.append(this.p);
        sb.append(", addButton=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kl00(String str, double d, int i, String str2, long j, long j2, String str3, z320 z320Var, boolean z, String str4, CountryCodeName countryCodeName, dja0 dja0Var, String str5, List list, int i2) {
        String str6 = (i2 & 512) != 0 ? null : str4;
        String str7 = (i2 & 4096) != 0 ? null : str5;
        bv7.b bVar = bv7.b.a;
        this(str, d, i, str2, j, j2, str3, z320Var, z, str6, countryCodeName, dja0Var, str7, list, bVar, bVar, bVar);
    }
}
