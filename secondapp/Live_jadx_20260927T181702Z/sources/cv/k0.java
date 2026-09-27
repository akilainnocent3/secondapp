package cv;

import dr.g1;
import dr.l1;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.u1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,814:1\n1179#2,2:815\n1#3:817\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:815,2\n*E\n"})
public class k0 extends j0 {
    @ur.f
    public static final String A1(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        kotlin.jvm.internal.m0.p(charset, "charset");
        return new String(bytes, charset);
    }

    @oy.l
    public static final String A2(@oy.l String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        int iI3 = p0.I3(str, c10, 0, z10, 2, null);
        return iI3 < 0 ? str : p0.d5(str, iI3, iI3 + 1, String.valueOf(c11)).toString();
    }

    @ur.f
    public static final String B1(char[] chars) {
        kotlin.jvm.internal.m0.p(chars, "chars");
        return new String(chars);
    }

    @oy.l
    public static final String B2(@oy.l String str, @oy.l String oldValue, @oy.l String newValue, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(oldValue, "oldValue");
        kotlin.jvm.internal.m0.p(newValue, "newValue");
        int iJ3 = p0.J3(str, oldValue, 0, z10, 2, null);
        return iJ3 < 0 ? str : p0.d5(str, iJ3, oldValue.length() + iJ3, newValue).toString();
    }

    @ur.f
    public static final String C1(char[] chars, int i10, int i11) {
        kotlin.jvm.internal.m0.p(chars, "chars");
        return new String(chars, i10, i11);
    }

    public static /* synthetic */ String C2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return A2(str, c10, c11, z10);
    }

    @ur.f
    public static final String D1(int[] codePoints, int i10, int i11) {
        kotlin.jvm.internal.m0.p(codePoints, "codePoints");
        return new String(codePoints, i10, i11);
    }

    public static /* synthetic */ String D2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return B2(str, str2, str3, z10);
    }

    @oy.l
    @dr.p(warningSince = "1.5")
    @dr.o(message = "Use replaceFirstChar instead.", replaceWith = @g1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    public static String E1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m0.o(locale, "getDefault(...)");
        return F1(str, locale);
    }

    @oy.l
    public static final List<String> E2(@oy.l CharSequence charSequence, @oy.l Pattern regex, int i10) {
        kotlin.jvm.internal.m0.p(charSequence, "<this>");
        kotlin.jvm.internal.m0.p(regex, "regex");
        p0.h5(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i10);
        kotlin.jvm.internal.m0.o(strArrSplit, "split(...)");
        return fr.q.t(strArrSplit);
    }

    @l1(version = sc.k.f129877g)
    @oy.l
    @ur.i
    @dr.p(warningSince = "1.5")
    @dr.o(message = "Use replaceFirstChar instead.", replaceWith = @g1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    public static final String F1(@oy.l String str, @oy.l Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
            kotlin.jvm.internal.m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static /* synthetic */ List F2(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return E2(charSequence, pattern, i10);
    }

    @ur.f
    public static final int G1(String str, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.codePointAt(i10);
    }

    public static boolean G2(@oy.l String str, @oy.l String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : s2(str, i10, prefix, 0, prefix.length(), z10);
    }

    @ur.f
    public static final int H1(String str, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.codePointBefore(i10);
    }

    public static boolean H2(@oy.l String str, @oy.l String prefix, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : s2(str, 0, prefix, 0, prefix.length(), z10);
    }

    @ur.f
    public static final int I1(String str, int i10, int i11) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.codePointCount(i10, i11);
    }

    public static /* synthetic */ boolean I2(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return G2(str, str2, i10, z10);
    }

    public static final int J1(@oy.l String str, @oy.l String other, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ boolean J2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H2(str, str2, z10);
    }

    public static /* synthetic */ int K1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J1(str, str2, z10);
    }

    @ur.f
    public static final String K2(String str, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String strSubstring = str.substring(i10);
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static String L1(@oy.l char[] cArr) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        return new String(cArr);
    }

    @ur.f
    public static final String L2(String str, int i10, int i11) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static String M1(@oy.l char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.m0.p(cArr, "<this>");
        fr.d.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    @ur.f
    public static final byte[] M2(String str, Charset charset) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ String N1(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return M1(cArr, i10, i11);
    }

    public static /* synthetic */ byte[] N2(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f77202b;
        }
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @l1(version = "1.5")
    public static final boolean O1(@oy.m CharSequence charSequence, @oy.m CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? p0.p3(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @ur.f
    public static final char[] O2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.m0.o(charArray, "toCharArray(...)");
        return charArray;
    }

    @l1(version = "1.5")
    public static final boolean P1(@oy.m CharSequence charSequence, @oy.m CharSequence charSequence2, boolean z10) {
        return z10 ? p0.o3(charSequence, charSequence2) : O1(charSequence, charSequence2);
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final char[] P2(@oy.l String str, int i10, int i11) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        fr.d.Companion.a(i10, i11, str.length());
        char[] cArr = new char[i11 - i10];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    @ur.f
    public static final boolean Q1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @ur.f
    public static final char[] Q2(String str, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @ur.f
    public static final boolean R1(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static /* synthetic */ char[] R2(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return P2(str, i10, i11);
    }

    @oy.l
    @dr.p(warningSince = "1.5")
    @dr.o(message = "Use replaceFirstChar instead.", replaceWith = @g1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    public static final String S1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m0.o(locale, "getDefault(...)");
        kotlin.jvm.internal.m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static /* synthetic */ char[] S2(String str, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @l1(version = sc.k.f129877g)
    @oy.l
    @ur.i
    @dr.p(warningSince = "1.5")
    @dr.o(message = "Use replaceFirstChar instead.", replaceWith = @g1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    public static final String T1(@oy.l String str, @oy.l Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        kotlin.jvm.internal.m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use lowercase() instead.", replaceWith = @g1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String T2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static String U1(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return new String(bArr, g.f77202b);
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use lowercase() instead.", replaceWith = @g1(expression = "lowercase(locale)", imports = {}))
    public static final String U2(String str, Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final String V1(@oy.l byte[] bArr, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        fr.d.Companion.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, g.f77202b);
        }
        CharsetDecoder charsetDecoderNewDecoder = g.f77202b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @ur.f
    public static final Pattern V2(String str, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        kotlin.jvm.internal.m0.o(patternCompile, "compile(...)");
        return patternCompile;
    }

    public static /* synthetic */ String W1(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return V1(bArr, i10, i11, z10);
    }

    public static /* synthetic */ Pattern W2(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.m0.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        kotlin.jvm.internal.m0.o(patternCompile, "compile(...)");
        return patternCompile;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static byte[] X1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        byte[] bytes = str.getBytes(g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use uppercase() instead.", replaceWith = @g1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String X2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final byte[] Y1(@oy.l String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        kotlin.jvm.internal.m0.p(str, "<this>");
        fr.d.Companion.a(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
            Charset charset = g.f77202b;
            kotlin.jvm.internal.m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = g.f77202b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.m0.m(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.m0.m(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @dr.p(errorSince = "2.1", warningSince = "1.5")
    @ur.f
    @dr.o(message = "Use uppercase() instead.", replaceWith = @g1(expression = "uppercase(locale)", imports = {}))
    public static final String Y2(String str, Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] Z1(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Y1(str, i10, i11, z10);
    }

    @l1(version = "1.5")
    @ur.f
    public static final String Z2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean a2(@oy.l String str, @oy.l String suffix, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : s2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    @l1(version = "1.5")
    @ur.f
    public static final String a3(String str, Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.m0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean b2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a2(str, str2, z10);
    }

    public static boolean c2(@oy.m String str, @oy.m String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean d2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c2(str, str2, z10);
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final String e2(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        return str2;
    }

    @ur.f
    public static final String f2(String str, Object... args) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        return str2;
    }

    @ur.f
    public static final String g2(u1 u1Var, String format, Object... args) {
        kotlin.jvm.internal.m0.p(u1Var, "<this>");
        kotlin.jvm.internal.m0.p(format, "format");
        kotlin.jvm.internal.m0.p(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final String h2(u1 u1Var, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.m0.p(u1Var, "<this>");
        kotlin.jvm.internal.m0.p(format, "format");
        kotlin.jvm.internal.m0.p(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }

    @oy.l
    public static Comparator<String> i2(@oy.l u1 u1Var) {
        kotlin.jvm.internal.m0.p(u1Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.m0.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @ur.f
    public static final String j2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String strIntern = str.intern();
        kotlin.jvm.internal.m0.o(strIntern, "intern(...)");
        return strIntern;
    }

    @l1(version = "1.5")
    @ur.f
    public static final String k2(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @l1(version = "1.5")
    @ur.f
    public static final String l2(String str, Locale locale) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @ur.f
    public static final int m2(String str, char c10, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.indexOf(c10, i10);
    }

    @ur.f
    public static final int n2(String str, String str2, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(str2, "str");
        return str.indexOf(str2, i10);
    }

    @ur.f
    public static final int o2(String str, char c10, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    @ur.f
    public static final int p2(String str, String str2, int i10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(str2, "str");
        return str.lastIndexOf(str2, i10);
    }

    @ur.f
    public static final int q2(String str, int i10, int i11) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return str.offsetByCodePoints(i10, i11);
    }

    public static final boolean r2(@oy.l CharSequence charSequence, int i10, @oy.l CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.m0.p(charSequence, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? s2((String) charSequence, i10, (String) other, i11, i12, z10) : p0.v4(charSequence, i10, other, i11, i12, z10);
    }

    public static boolean s2(@oy.l String str, int i10, @oy.l String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean t2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return r2(charSequence, i10, charSequence2, i11, i12, z10);
    }

    public static /* synthetic */ boolean u2(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return s2(str, i10, str2, i11, i12, z10);
    }

    @ur.f
    public static final String v1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.m0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @oy.l
    public static String v2(@oy.l CharSequence charSequence, int i10) {
        kotlin.jvm.internal.m0.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + kj.e.f102543c).toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m0.m(string);
        return string;
    }

    @ur.f
    public static final String w1(StringBuilder stringBuilder) {
        kotlin.jvm.internal.m0.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @oy.l
    public static final String w2(@oy.l String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.m0.o(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (f.J(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @ur.f
    public static final String x1(byte[] bytes) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return new String(bytes, g.f77202b);
    }

    @oy.l
    public static String x2(@oy.l String str, @oy.l String oldValue, @oy.l String newValue, boolean z10) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(oldValue, "oldValue");
        kotlin.jvm.internal.m0.p(newValue, "newValue");
        int i10 = 0;
        int iF3 = p0.F3(str, oldValue, 0, z10);
        if (iF3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iU = ms.u.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iF3);
            sb2.append(newValue);
            i10 = iF3 + length;
            if (iF3 >= str.length()) {
                break;
            }
            iF3 = p0.F3(str, oldValue, iF3 + iU, z10);
        } while (iF3 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @ur.f
    public static final String y1(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        return new String(bytes, i10, i11, g.f77202b);
    }

    public static /* synthetic */ String y2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return w2(str, c10, c11, z10);
    }

    @ur.f
    public static final String z1(byte[] bytes, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        kotlin.jvm.internal.m0.p(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    public static /* synthetic */ String z2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return x2(str, str2, str3, z10);
    }
}
