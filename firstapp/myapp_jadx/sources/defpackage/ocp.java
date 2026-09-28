package defpackage;

import kotlin.text.g;

/* JADX INFO: loaded from: classes8.dex */
public final class ocp extends b3 {
    public final v9e0 c;
    public final y3l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocp(v9e0 v9e0Var, wbp wbpVar) {
        super(0);
        wbpVar.getClass();
        this.c = v9e0Var;
        this.d = wbpVar.b;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final byte F() {
        v9e0 v9e0Var = this.c;
        String strJ = v9e0Var.j();
        try {
            return g.b(strJ);
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'UByte' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.dma
    public final y3l d() {
        return this.d;
    }

    @Override // defpackage.b3, defpackage.b5d
    public final int k() {
        v9e0 v9e0Var = this.c;
        String strJ = v9e0Var.j();
        try {
            return g.c(strJ);
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'UInt' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b3, defpackage.b5d
    public final long o() {
        v9e0 v9e0Var = this.c;
        String strJ = v9e0Var.j();
        try {
            return g.e(strJ);
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'ULong' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b3, defpackage.b5d
    public final short p() {
        v9e0 v9e0Var = this.c;
        String strJ = v9e0Var.j();
        try {
            return g.g(strJ);
        } catch (IllegalArgumentException unused) {
            v9e0.l(v9e0Var, zdf0.a('\'', "Failed to parse type 'UShort' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.dma
    public final int v(pd80 pd80Var) {
        pd80Var.getClass();
        throw new IllegalStateException("unsupported");
    }
}
