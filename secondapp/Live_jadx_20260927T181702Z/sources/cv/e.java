package cv;

import dr.f1;
import dr.g1;
import dr.l1;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class e {
    @l1(version = "1.5")
    @ur.f
    public static final String A(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.m0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @oy.l
    @l1(version = "1.5")
    public static final String B(char c10, @oy.l Locale locale) {
        kotlin.jvm.internal.m0.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.m0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @l1(version = "1.5")
    @ur.f
    public static final char C(char c10) {
        return Character.toUpperCase(c10);
    }

    @f1
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new ms.l(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @oy.l
    public static final a c(char c10) {
        return a.f77149d.a(Character.getType(c10));
    }

    @oy.l
    public static final c d(char c10) {
        return c.f77175c.b(Character.getDirectionality(c10));
    }

    @ur.f
    public static final boolean e(char c10) {
        return Character.isDefined(c10);
    }

    @ur.f
    public static final boolean f(char c10) {
        return Character.isDigit(c10);
    }

    @ur.f
    public static final boolean g(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @ur.f
    public static final boolean h(char c10) {
        return Character.isISOControl(c10);
    }

    @ur.f
    public static final boolean i(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @ur.f
    public static final boolean j(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @ur.f
    public static final boolean k(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @ur.f
    public static final boolean l(char c10) {
        return Character.isLetter(c10);
    }

    @ur.f
    public static final boolean m(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @ur.f
    public static final boolean n(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @ur.f
    public static final boolean o(char c10) {
        return Character.isLowerCase(c10);
    }

    @ur.f
    public static final boolean p(char c10) {
        return Character.isTitleCase(c10);
    }

    @ur.f
    public static final boolean q(char c10) {
        return Character.isUpperCase(c10);
    }

    public static boolean r(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @l1(version = "1.5")
    @ur.f
    public static final String s(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.m0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @oy.l
    @l1(version = "1.5")
    public static final String t(char c10, @oy.l Locale locale) {
        kotlin.jvm.internal.m0.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.m0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @l1(version = "1.5")
    @ur.f
    public static final char u(char c10) {
        return Character.toLowerCase(c10);
    }

    @oy.l
    @l1(version = "1.5")
    public static String v(char c10, @oy.l Locale locale) {
        kotlin.jvm.internal.m0.p(locale, "locale");
        String strB = B(c10, locale);
        if (strB.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            kotlin.jvm.internal.m0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
            if (kotlin.jvm.internal.m0.g(strB, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strB.charAt(0);
            kotlin.jvm.internal.m0.n(strB, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strB.substring(1);
            kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
            kotlin.jvm.internal.m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strB;
    }

    @l1(version = "1.5")
    @ur.f
    public static final char w(char c10) {
        return Character.toTitleCase(c10);
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use lowercaseChar() instead.", replaceWith = @g1(expression = "lowercaseChar()", imports = {}))
    public static final char x(char c10) {
        return Character.toLowerCase(c10);
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use titlecaseChar() instead.", replaceWith = @g1(expression = "titlecaseChar()", imports = {}))
    public static final char y(char c10) {
        return Character.toTitleCase(c10);
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use uppercaseChar() instead.", replaceWith = @g1(expression = "uppercaseChar()", imports = {}))
    public static final char z(char c10) {
        return Character.toUpperCase(c10);
    }
}
