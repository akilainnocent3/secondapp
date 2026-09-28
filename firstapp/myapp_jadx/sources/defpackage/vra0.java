package defpackage;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes8.dex */
public final class vra0 implements sra0 {
    public final EnumMap a;

    public vra0(EnumMap enumMap) {
        this.a = enumMap;
    }

    @Override // defpackage.sra0
    public final m0b a(m0b m0bVar, wqa0 wqa0Var, oqa0 oqa0Var) {
        sra0 sra0Var = (sra0) this.a.get(wqa0Var);
        return sra0Var == null ? m0bVar : sra0Var.a(m0bVar, wqa0Var, oqa0Var);
    }

    @Override // defpackage.sra0
    public final boolean b(m0b m0bVar, wqa0 wqa0Var) {
        sra0 sra0Var = (sra0) this.a.get(wqa0Var);
        if (sra0Var == null) {
            return false;
        }
        return sra0Var.b(m0bVar, wqa0Var);
    }
}
