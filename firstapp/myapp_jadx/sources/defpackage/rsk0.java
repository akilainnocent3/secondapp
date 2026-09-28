package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;

/* JADX INFO: loaded from: classes4.dex */
public class rsk0 extends xsk0 {
    public final jsk0 b;
    public final Character c;

    public rsk0(jsk0 jsk0Var, Character ch) {
        this.b = jsk0Var;
        if (ch == null || jsk0Var.g[61] == -1) {
            this.c = ch;
        } else {
            hb5.a(epk0.a("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    @Override // defpackage.xsk0
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zok0.b(0, i, bArr.length);
        while (i2 < i) {
            jsk0 jsk0Var = this.b;
            c(sb, bArr, i2, Math.min(jsk0Var.f, i - i2));
            i2 += jsk0Var.f;
        }
    }

    public final void c(StringBuilder sb, byte[] bArr, int i, int i2) {
        zok0.b(i, i + i2, bArr.length);
        jsk0 jsk0Var = this.b;
        int i3 = jsk0Var.f;
        int i4 = jsk0Var.d;
        if (i2 > i3) {
            d580.a();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(jsk0Var.b[jsk0Var.c & ((int) (j >>> (i7 - i5)))]);
            i5 += i4;
        }
        if (this.c != null) {
            while (i5 < jsk0Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rsk0) {
            rsk0 rsk0Var = (rsk0) obj;
            if (this.b.equals(rsk0Var.b)) {
                Object obj2 = rsk0Var.c;
                Character ch = this.c;
                if (ch == obj2) {
                    return true;
                }
                if (ch != null && ch.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        Character ch = this.c;
        return (ch == null ? 0 : ch.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        jsk0 jsk0Var = this.b;
        sb.append(jsk0Var);
        if (8 % jsk0Var.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(oAudzpbdOhCI.onX);
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public rsk0(String str, String str2) {
        this(new jsk0(str, str2.toCharArray()), (Character) '=');
    }
}
