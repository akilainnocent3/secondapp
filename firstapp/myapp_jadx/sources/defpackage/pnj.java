package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pnj {
    public final imf0 a;
    public final rhj b;
    public final fnj c;

    public pnj(imf0 imf0Var, rhj rhjVar, fnj fnjVar) {
        imf0Var.getClass();
        rhjVar.getClass();
        fnjVar.getClass();
        this.a = imf0Var;
        this.b = rhjVar;
        this.c = fnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnj)) {
            return false;
        }
        pnj pnjVar = (pnj) obj;
        return Intrinsics.g(this.a, pnjVar.a) && Intrinsics.g(this.b, pnjVar.b) && Intrinsics.g(this.c, pnjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GameTextData(style=" + this.a + ", border=" + this.b + ", shadow=" + this.c + ')';
    }
}
