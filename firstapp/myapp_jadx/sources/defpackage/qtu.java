package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class qtu {
    public static final int a = s08.a(16) + 16;
    public static final int b = s08.a(8) + 8;
    public static final boolean c;
    public static final byte[] d;

    static {
        boolean z;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        c = z;
        d = new byte[0];
    }

    public static String a(rtu rtuVar) {
        if (!c) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            nep nepVar = new nep(byteArrayOutputStream);
            try {
                nepVar.W0(rtuVar);
                nepVar.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return new String(byteArray, 1, byteArray.length - 2, StandardCharsets.UTF_8);
            } catch (Throwable th) {
                try {
                    nepVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e);
        }
    }

    public static int b(ek1 ek1Var, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        int iD = ek1Var.d();
        int length = bArr.length;
        return s08.a(length) + length + iD;
    }

    public static int c(ek1 ek1Var, dk1 dk1Var) {
        int iA;
        int iA2 = dk1Var.a();
        if (iA2 == 0) {
            return 0;
        }
        int iD = ek1Var.d();
        if (iA2 >= 0) {
            iA = s08.a(iA2);
        } else {
            int i = s08.a;
            iA = 10;
        }
        return iD + iA;
    }

    public static int d(ek1 ek1Var, int i) {
        if (i == 0) {
            return 0;
        }
        int iD = ek1Var.d();
        int i2 = s08.a;
        return iD + 4;
    }

    public static int e(ek1 ek1Var, long j) {
        if (j == 0) {
            return 0;
        }
        int iD = ek1Var.d();
        int i = s08.a;
        return iD + 8;
    }

    public static int f(ek1 ek1Var, ktu ktuVar) {
        int iA = ktuVar.a();
        return s08.a(iA) + ek1Var.d() + iA;
    }

    public static <T extends ktu> int g(ek1 ek1Var, T[] tArr) {
        int iD = ek1Var.d();
        int iA = 0;
        for (T t : tArr) {
            int iA2 = t.a();
            iA += s08.a(iA2) + iD + iA2;
        }
        return iA;
    }

    public static int h(ek1 ek1Var, String str) {
        if (str == null) {
            return 0;
        }
        return ek1Var.d() + b;
    }

    public static int i(ek1 ek1Var, String str) {
        if (str == null) {
            return 0;
        }
        return ek1Var.d() + a;
    }

    public static int j(ek1 ek1Var, int i) {
        if (i == 0) {
            return 0;
        }
        return s08.a(i) + ek1Var.d();
    }

    public static byte[] k(String str) {
        return (str == null || str.isEmpty()) ? d : str.getBytes(StandardCharsets.UTF_8);
    }
}
