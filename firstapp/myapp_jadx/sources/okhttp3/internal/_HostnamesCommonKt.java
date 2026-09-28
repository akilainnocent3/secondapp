package okhttp3.internal;

import defpackage.hb5;
import defpackage.jb5;
import defpackage.lb5;
import defpackage.xx0;
import defpackage.zdf0;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"", "", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "input", "", "pos", "limit", "", "decodeIpv6", "(Ljava/lang/String;II)[B", "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "canonicalizeInetAddress", "([B)[B", "inet4AddressToAscii", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", "host", "idnToAscii", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class _HostnamesCommonKt {
    public static final Regex a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return a.f(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 16) {
            for (int i = 0; i < 10; i++) {
                if (bArr[i] == 0) {
                }
            }
            if (bArr[10] == -1 && bArr[11] == -1) {
                IntRange intRangeN = f.n(12, 16);
                intRangeN.getClass();
                return intRangeN.isEmpty() ? new byte[0] : xx0.j(bArr, intRangeN.a, intRangeN.b + 1);
            }
        }
        return bArr;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.h(cCharAt, 31) <= 0 || Intrinsics.h(cCharAt, 127) >= 0 || StringsKt.S(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        str.getClass();
        int length = str.length();
        if (1 <= length && length < 254) {
            int i = 0;
            while (true) {
                int iS = StringsKt.S(str, '.', i, 4);
                int length2 = iS == -1 ? str.length() - i : iS - i;
                if (1 <= length2 && length2 < 64) {
                    if (iS == -1 || iS == str.length() - 1) {
                        break;
                    }
                    i = iS + 1;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        str.getClass();
        bArr.getClass();
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (Intrinsics.h(cCharAt, 48) < 0 || Intrinsics.h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[LOOP:1: B:28:0x004e->B:31:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0060 A[EDGE_INSN: B:52:0x0060->B:32:0x0060 BREAK  A[LOOP:1: B:28:0x004e->B:31:0x005a], SYNTHETIC] */
    public static final byte[] decodeIpv6(String str, int i, int i2) {
        int i3;
        int i4;
        int hexDigit;
        str.getClass();
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && c.t(i, str, "::", false)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i3 = 0;
                i = i7;
                while (i < i2) {
                    hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + hexDigit;
                    i++;
                }
                i4 = i - i7;
                return i4 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (!c.t(i, str, ":", false)) {
                    if (!c.t(i, str, ".", false) || !decodeIpv4Suffix(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    }
                    i5 += 2;
                    break;
                }
                i++;
            }
            i7 = i;
            i3 = 0;
            i = i7;
            while (i < i2) {
                hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i));
                if (hexDigit != -1) {
                    break;
                }
                i3 = (i3 << 4) + hexDigit;
                i++;
            }
            i4 = i - i7;
            if (i4 == 0 && i4 <= 4) {
                int i9 = i5 + 1;
                bArr[i5] = (byte) ((i3 >>> 8) & 255);
                i5 += 2;
                bArr[i9] = (byte) (i3 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            xx0.f(bArr, 16 - (i5 - i6), bArr, i6, i5);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        return bArr;
    }

    public static final String idnToAscii(String str) throws EOFException {
        str.getClass();
        lb5 lb5Var = new lb5();
        lb5Var.z0(str);
        lb5 lb5Var2 = new lb5();
        while (!lb5Var.N0()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(lb5Var.Z(), lb5Var2)) {
                return null;
            }
        }
        lb5Var.z0(_NormalizeJvmKt.normalizeNfc(lb5Var2.Y()));
        Punycode punycode = Punycode.INSTANCE;
        String strDecode = punycode.decode(lb5Var.Y());
        if (strDecode != null && strDecode.equals(_NormalizeJvmKt.normalizeNfc(strDecode))) {
            return punycode.encode(strDecode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] bArr) {
        bArr.getClass();
        if (bArr.length != 4) {
            hb5.a("Failed requirement.");
            return null;
        }
        lb5 lb5Var = new lb5();
        lb5Var.e0(_UtilCommonKt.and(bArr[0], 255));
        lb5Var.d0(46);
        lb5Var.e0(_UtilCommonKt.and(bArr[1], 255));
        lb5Var.d0(46);
        lb5Var.e0(_UtilCommonKt.and(bArr[2], 255));
        lb5Var.d0(46);
        lb5Var.e0(_UtilCommonKt.and(bArr[3], 255));
        return lb5Var.Y();
    }

    public static final String inet6AddressToAscii(byte[] bArr) {
        bArr.getClass();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        lb5 lb5Var = new lb5();
        while (i2 < bArr.length) {
            if (i2 == i) {
                lb5Var.d0(58);
                i2 += i4;
                if (i2 == 16) {
                    lb5Var.d0(58);
                }
            } else {
                if (i2 > 0) {
                    lb5Var.d0(58);
                }
                lb5Var.f0((_UtilCommonKt.and(bArr[i2], 255) << 8) | _UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return lb5Var.Y();
    }

    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (StringsKt.M(str, ":", false)) {
            byte[] bArrDecodeIpv6 = (c.u(str, "[", false) && c.k(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (bArrDecodeIpv6 != null) {
                byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
                if (bArrCanonicalizeInetAddress.length == 16) {
                    return inet6AddressToAscii(bArrCanonicalizeInetAddress);
                }
                if (bArrCanonicalizeInetAddress.length == 4) {
                    return inet4AddressToAscii(bArrCanonicalizeInetAddress);
                }
                jb5.a(zdf0.a('\'', "Invalid IPv6 address: '", str));
                return null;
            }
        } else {
            String strIdnToAscii = idnToAscii(str);
            if (strIdnToAscii != null && strIdnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(strIdnToAscii) && !containsInvalidLabelLengths(strIdnToAscii)) {
                return strIdnToAscii;
            }
        }
        return null;
    }
}
