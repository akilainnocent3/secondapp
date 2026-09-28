package defpackage;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ufe0 implements vp60 {
    public final vfe0 a;

    public ufe0(vfe0 vfe0Var) {
        vfe0Var.getClass();
        this.a = vfe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vp60
    public final hq60 H1(String str) {
        int i;
        str.getClass();
        vfe0 vfe0Var = this.a;
        zfe0 zfe0Var = null;
        if (!vfe0Var.isOpen()) {
            up60.b(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.t0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iS = 0;
            loop0: while (iS < length) {
                char cCharAt = upperCase.charAt(iS);
                if (Intrinsics.h(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iS2 = iS + 1;
                            if (upperCase.charAt(iS2) == '*') {
                                do {
                                    iS2 = StringsKt.S(upperCase, '*', iS2 + 1, 4);
                                    if (iS2 < 0) {
                                        break loop0;
                                    }
                                    i = iS2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iS = iS2 + 2;
                            }
                        }
                        i2 = iS;
                        break;
                    }
                    if (upperCase.charAt(iS + 1) != '-') {
                        i2 = iS;
                        break;
                    }
                    iS = StringsKt.S(upperCase, '\n', iS + 2, 4);
                    if (iS < 0) {
                        break;
                    }
                }
                iS++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new age0.b(vfe0Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (strSubstring.equals("BEG")) {
                    if (!StringsKt.M(upperCase, "EXCLUSIVE", false)) {
                        zfe0Var = !StringsKt.M(upperCase, "IMMEDIATE", false) ? zfe0.e : zfe0.d;
                    } else {
                        zfe0Var = zfe0.c;
                    }
                }
                break;
            case 66913:
                if (strSubstring.equals("COM")) {
                    zfe0Var = zfe0.a;
                }
                break;
            case 68795:
                if (strSubstring.equals("END")) {
                    zfe0Var = zfe0.a;
                }
                break;
            case 81327:
                if (strSubstring.equals("ROL") && !StringsKt.M(upperCase, " TO ", false)) {
                    zfe0Var = zfe0.b;
                }
                break;
        }
        if (zfe0Var != null) {
            return new age0.c(vfe0Var, str, zfe0Var);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new age0.b(vfe0Var, str);
        }
        age0.a aVar = new age0.a(vfe0Var, str);
        aVar.d = new int[0];
        aVar.e = new long[0];
        aVar.f = new double[0];
        aVar.i = new String[0];
        aVar.v = new byte[0][];
        return aVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.vp60
    public final boolean s() {
        return this.a.s();
    }
}
