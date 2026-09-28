package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class z7b {
    public static final x740 a(uw90 uw90Var) {
        uw90Var.getClass();
        return new x740(uw90Var);
    }

    public static final y740 b(zpa0 zpa0Var) {
        zpa0Var.getClass();
        return new y740(zpa0Var);
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final String d() {
        byte[] bArr = new byte[16];
        m380.a.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long jB = sd50.b(0, bArr);
        long jB2 = sd50.b(8, bArr);
        return ((jB == 0 && jB2 == 0) ? wsh0.c : new wsh0(jB, jB2)).toString();
    }

    public static final int e(String str) {
        str.getClass();
        if (c.l(str, "zm", true)) {
            return R.drawable.flag_zm;
        }
        if (c.l(str, "ug", true)) {
            return R.drawable.flag_ug;
        }
        if (c.l(str, "ke", true)) {
            return R.drawable.flag_ke;
        }
        if (c.l(str, "ng", true)) {
            return R.drawable.flag_ng;
        }
        if (c.l(str, "gh", true)) {
            return R.drawable.flag_gh;
        }
        if (c.l(str, "tz", true)) {
            return R.drawable.flag_tz;
        }
        return -1;
    }
}
