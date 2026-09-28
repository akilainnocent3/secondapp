package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ura0 implements sra0 {
    public final uqa0[] a;

    public ura0(Set<uqa0> set) {
        this.a = (uqa0[]) set.toArray(new uqa0[0]);
    }

    @Override // defpackage.sra0
    public final m0b a(m0b m0bVar, wqa0 wqa0Var, oqa0 oqa0Var) {
        for (uqa0 uqa0Var : this.a) {
            m0bVar = m0bVar.a(uqa0Var.a, oqa0Var);
        }
        return m0bVar;
    }

    @Override // defpackage.sra0
    public final boolean b(m0b m0bVar, wqa0 wqa0Var) {
        for (uqa0 uqa0Var : this.a) {
            if (((oqa0) m0bVar.b(uqa0Var.a)) == null) {
                return false;
            }
        }
        return true;
    }
}
