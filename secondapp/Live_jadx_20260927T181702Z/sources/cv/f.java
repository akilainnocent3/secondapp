package cv;

import dr.l1;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
public class f extends e {
    @l1(version = "1.5")
    public static final char D(int i10) {
        if (i10 >= 0 && i10 < 10) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException("Int " + i10 + " is not a decimal digit");
    }

    @l1(version = "1.5")
    public static final char E(int i10, int i11) {
        if (2 > i11 || i11 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i11 + ". Valid radix values are in range 2..36");
        }
        if (i10 >= 0 && i10 < i11) {
            return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i10 + " does not represent a valid digit in radix " + i11);
    }

    @l1(version = "1.5")
    public static final int F(char c10) {
        int iB = e.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @l1(version = "1.5")
    public static final int G(char c10, int i10) {
        Integer numI = I(c10, i10);
        if (numI != null) {
            return numI.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @l1(version = "1.5")
    @oy.m
    public static final Integer H(char c10) {
        Integer numValueOf = Integer.valueOf(e.b(c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @l1(version = "1.5")
    @oy.m
    public static final Integer I(char c10, int i10) {
        e.a(i10);
        Integer numValueOf = Integer.valueOf(e.b(c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean J(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(c10, c11, z10);
    }

    public static boolean L(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @ur.f
    public static final String M(char c10, String other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return c10 + other;
    }

    @oy.l
    @l1(version = "1.5")
    public static String N(char c10) {
        return c1.a(c10);
    }
}
