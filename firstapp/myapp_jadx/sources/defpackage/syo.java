package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class syo<T> implements w1h<T> {
    public final a2h a;
    public final String b;
    public final int c;
    public byte[] d;
    public kyo e;

    public syo(a2h a2hVar, String str) {
        this.a = a2hVar;
        this.b = str;
        this.c = ((a2hVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static syo b(a2h a2hVar, String str) {
        if (str == null) {
            str = "";
        }
        return new syo(a2hVar, str);
    }

    public static kyo d(w1h w1hVar) {
        switch (w1hVar.getType().ordinal()) {
            case 0:
                return kyo.a(g21.a, w1hVar.getKey());
            case 1:
                return kyo.a(g21.b, w1hVar.getKey());
            case 2:
                return kyo.a(g21.c, w1hVar.getKey());
            case 3:
                return kyo.a(g21.d, w1hVar.getKey());
            case 4:
                return kyo.a(g21.e, w1hVar.getKey());
            case 5:
                return kyo.a(g21.f, w1hVar.getKey());
            case 6:
                return kyo.a(g21.i, w1hVar.getKey());
            case 7:
                return kyo.a(g21.v, w1hVar.getKey());
            default:
                hoc.a(w1hVar.getType(), "Unrecognized extendedAttributeKey type: ");
            case 8:
            case 9:
                return null;
        }
    }

    public static syo e(e21 e21Var) {
        switch (e21Var.getType().ordinal()) {
            case 0:
                return b(a2h.a, e21Var.getKey());
            case 1:
                return b(a2h.b, e21Var.getKey());
            case 2:
                return b(a2h.c, e21Var.getKey());
            case 3:
                return b(a2h.d, e21Var.getKey());
            case 4:
                return b(a2h.e, e21Var.getKey());
            case 5:
                return b(a2h.f, e21Var.getKey());
            case 6:
                return b(a2h.i, e21Var.getKey());
            case 7:
                return b(a2h.v, e21Var.getKey());
            default:
                hoc.a(e21Var.getType(), "Unrecognized attributeKey type: ");
                return null;
        }
    }

    @Override // defpackage.w1h
    public final e21<T> a() {
        kyo kyoVar = this.e;
        if (kyoVar != null) {
            return kyoVar;
        }
        kyo kyoVarD = d(this);
        this.e = kyoVarD;
        return kyoVarD;
    }

    public final byte[] c() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.b.getBytes(StandardCharsets.UTF_8);
        this.d = bytes;
        return bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syo)) {
            return false;
        }
        syo syoVar = (syo) obj;
        return this.a.equals(syoVar.a) && this.b.equals(syoVar.b);
    }

    @Override // defpackage.w1h
    public final String getKey() {
        return this.b;
    }

    @Override // defpackage.w1h
    public final a2h getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.b;
    }
}
