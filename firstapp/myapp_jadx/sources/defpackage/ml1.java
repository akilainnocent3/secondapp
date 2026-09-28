package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends oug0 {
    public final String a;
    public final byte[] b;
    public final kw20 c;

    public ml1(String str, byte[] bArr, kw20 kw20Var) {
        this.a = str;
        this.b = bArr;
        this.c = kw20Var;
    }

    @Override // defpackage.oug0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.oug0
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.oug0
    public final kw20 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oug0)) {
            return false;
        }
        oug0 oug0Var = (oug0) obj;
        if (this.a.equals(oug0Var.a())) {
            return Arrays.equals(this.b, oug0Var instanceof ml1 ? ((ml1) oug0Var).b : oug0Var.b()) && this.c.equals(oug0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
