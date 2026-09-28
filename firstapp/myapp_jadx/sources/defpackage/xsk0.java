package defpackage;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xsk0 {
    public static final ksk0 a;

    static {
        new qsk0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new qsk0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new rsk0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new rsk0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new ksk0();
    }

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public final String b(int i, byte[] bArr) {
        zok0.b(0, i, bArr.length);
        jsk0 jsk0Var = ((rsk0) this).b;
        int i2 = jsk0Var.e;
        int i3 = jsk0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(atk0.a(i, i3) * i2);
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            jb5.a(e);
            return null;
        }
    }
}
