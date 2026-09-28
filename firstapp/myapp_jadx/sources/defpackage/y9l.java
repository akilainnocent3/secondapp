package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class y9l {
    public static final /* synthetic */ int a = 0;

    public static String a(byte[] bArr) throws IOException {
        int iA;
        n08 n08Var = new n08(bArr);
        boolean z = false;
        while (!z) {
            int i = n08Var.c;
            int i2 = n08Var.b;
            if (i == i2) {
                n08Var.d = 0;
                iA = 0;
            } else {
                iA = n08Var.a();
                n08Var.d = iA;
                if ((iA >>> 3) == 0) {
                    zmm.a(n08Var.d, "Invalid tag: ");
                    return null;
                }
            }
            if (iA == 0) {
                z = true;
            } else {
                if (iA == 18) {
                    int iA2 = n08Var.a();
                    if (iA2 > 0) {
                        int i3 = n08Var.c;
                        if (iA2 <= i2 - i3) {
                            String str = new String(bArr, i3, iA2, StandardCharsets.UTF_8);
                            n08Var.c += iA2;
                            return str;
                        }
                    }
                    if (iA2 == 0) {
                        return "";
                    }
                    if (iA2 <= 0) {
                        i08.a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                        return null;
                    }
                    i08.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                int i4 = iA & 7;
                if (i4 != 0) {
                    if (i4 == 1) {
                        n08Var.b(8);
                    } else if (i4 == 2) {
                        n08Var.b(n08Var.a());
                    } else {
                        if (i4 != 5) {
                            i08.a(hce0.a(iA, "Invalid wire type: "));
                            return null;
                        }
                        n08Var.b(4);
                    }
                } else if (i2 - n08Var.c >= 10) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 10) {
                            i08.a("CodedInputStream encountered a malformed varint.");
                            return null;
                        }
                        int i6 = n08Var.c;
                        n08Var.c = i6 + 1;
                        if (bArr[i6] >= 0) {
                            break;
                        }
                        i5++;
                    }
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 10) {
                            i08.a("CodedInputStream encountered a malformed varint.");
                            return null;
                        }
                        int i8 = n08Var.c;
                        if (i8 == i2) {
                            i08.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return null;
                        }
                        n08Var.c = i8 + 1;
                        if (n08Var.a[i8] >= 0) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return "";
    }
}
