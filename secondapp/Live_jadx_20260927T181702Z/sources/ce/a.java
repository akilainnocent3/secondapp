package ce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ee.h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22998c = "cct";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f22999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f23000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f23001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f23002g = "1$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f23003h = "\\";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<ae.e> f23004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f23005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f23006k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f23007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f23008b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f22999d = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f23000e = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f23001f = strA3;
        f23004i = Collections.unmodifiableSet(new HashSet(Arrays.asList(ae.e.b("proto"), ae.e.b("json"))));
        f23005j = new a(strA, null);
        f23006k = new a(strA2, strA3);
    }

    public a(@NonNull String str, @Nullable String str2) {
        this.f23007a = str;
        this.f23008b = str2;
    }

    @NonNull
    public static String c(@NonNull byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @NonNull
    public static byte[] d(@NonNull String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    public static a e(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith(f23002g)) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote(f23003h), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // ee.h
    public Set<ae.e> a() {
        return f23004i;
    }

    @Nullable
    public byte[] b() {
        String str = this.f23008b;
        if (str == null && this.f23007a == null) {
            return null;
        }
        String str2 = this.f23007a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", f23002g, str2, f23003h, str).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String f() {
        return this.f23008b;
    }

    @NonNull
    public String g() {
        return this.f23007a;
    }

    @Override // ee.g
    @Nullable
    public byte[] getExtras() {
        return b();
    }

    @Override // ee.g
    @NonNull
    public String getName() {
        return "cct";
    }
}
