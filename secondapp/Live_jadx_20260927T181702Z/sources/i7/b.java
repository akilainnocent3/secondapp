package i7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import cj.k7;
import cj.na;
import cj.z7;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90420d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90421e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f90422f = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k7<String> f90423g = k7.C("auto", "none");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k7<String> f90424h = k7.D("dot", "sesame", "circle");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k7<String> f90425i = k7.C("filled", "open");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k7<String> f90426j = k7.D("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90429c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(int i10, int i11, int i12) {
        this.f90427a = i10;
        this.f90428b = i11;
        this.f90429c = i12;
    }

    @Nullable
    public static b a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strG = zi.c.g(str.trim());
        if (strG.isEmpty()) {
            return null;
        }
        return b(k7.x(TextUtils.split(strG, f90422f)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    public static b b(k7<String> k7Var) {
        int i10;
        na.m mVarN;
        int i11;
        na.m mVarN2;
        na.m mVarN3;
        String str;
        int iHashCode;
        int i12;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) z7.v(na.n(f90426j, k7Var), "outside");
        int iHashCode4 = str4.hashCode();
        int i13 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals("after")) {
                    i10 = 2;
                }
            } else if (str4.equals("outside")) {
                i10 = -2;
            }
            mVarN = na.n(f90423g, k7Var);
            i11 = -1;
            if (!mVarN.isEmpty()) {
                str3 = (String) mVarN.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i11 = 0;
                }
                return new b(i11, 0, i10);
            }
            mVarN2 = na.n(f90425i, k7Var);
            mVarN3 = na.n(f90424h, k7Var);
            if (!mVarN2.isEmpty() && mVarN3.isEmpty()) {
                return new b(-1, 0, i10);
            }
            str = (String) z7.v(mVarN2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals("open")) {
                    i12 = 2;
                }
                str2 = (String) z7.v(mVarN3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i13 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i13 = 3;
                }
                return new b(i13, i12, i10);
            }
            str.equals("filled");
            i12 = 1;
            str2 = (String) z7.v(mVarN3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i13 = 2;
                }
            } else if (str2.equals("sesame")) {
                i13 = 3;
            }
            return new b(i13, i12, i10);
        }
        str4.equals("before");
        i10 = 1;
        mVarN = na.n(f90423g, k7Var);
        i11 = -1;
        if (!mVarN.isEmpty()) {
            str3 = (String) mVarN.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i11 = 0;
            }
            return new b(i11, 0, i10);
        }
        mVarN2 = na.n(f90425i, k7Var);
        mVarN3 = na.n(f90424h, k7Var);
        if (!mVarN2.isEmpty()) {
        }
        str = (String) z7.v(mVarN2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i12 = 2;
            }
            str2 = (String) z7.v(mVarN3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i13 = 2;
                }
            } else if (str2.equals("sesame")) {
                i13 = 3;
            }
            return new b(i13, i12, i10);
        }
        str.equals("filled");
        i12 = 1;
        str2 = (String) z7.v(mVarN3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i13 = 2;
            }
        } else if (str2.equals("sesame")) {
            i13 = 3;
        }
        return new b(i13, i12, i10);
    }
}
