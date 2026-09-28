package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class tra0 implements sra0 {
    public final sra0 a;

    public tra0(sra0 sra0Var) {
        this.a = sra0Var;
    }

    @Override // defpackage.sra0
    public final m0b a(m0b m0bVar, wqa0 wqa0Var, oqa0 oqa0Var) {
        return this.a.a(m0bVar, wqa0Var, oqa0Var);
    }

    @Override // defpackage.sra0
    public final boolean b(m0b m0bVar, wqa0 wqa0Var) {
        if (Objects.equals(m0bVar.b(xhj.b), Boolean.TRUE)) {
            return true;
        }
        return this.a.b(m0bVar, wqa0Var);
    }
}
