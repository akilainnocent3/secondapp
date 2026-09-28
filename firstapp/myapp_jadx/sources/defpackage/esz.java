package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class esz implements ss60 {
    public final ss60 a;
    public final ss60 b;
    public final ss60 c;
    public final ss60 d;

    public esz() {
        iw iwVar = iw.a;
        this.a = iwVar;
        hw hwVar = hw.a;
        this.b = hwVar;
        this.c = iwVar;
        this.d = hwVar;
    }

    @Override // defpackage.ss60
    public final String a() {
        String strA = this.a.a();
        String strA2 = this.b.a();
        return kwi.a(ux5.a("ParentBased{root:AlwaysOnSampler,remoteParentSampled:", strA, ",remoteParentNotSampled:", strA2, ",localParentSampled:"), this.c.a(), ",localParentNotSampled:", this.d.a(), "}");
    }

    @Override // defpackage.ss60
    public final ti1 b(m0b m0bVar, String str, String str2, wqa0 wqa0Var, m21 m21Var, List<sfs> list) {
        ui1 ui1VarB = oqa0.i(m0bVar).b();
        if (!ui1VarB.f()) {
            return ti1.c;
        }
        if (ui1VarB.e()) {
            return (ui1VarB.b().b & 1) != 0 ? this.a.b(m0bVar, str, str2, wqa0Var, m21Var, list) : this.b.b(m0bVar, str, str2, wqa0Var, m21Var, list);
        }
        return (ui1VarB.b().b & 1) != 0 ? this.c.b(m0bVar, str, str2, wqa0Var, m21Var, list) : this.d.b(m0bVar, str, str2, wqa0Var, m21Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esz)) {
            return false;
        }
        esz eszVar = (esz) obj;
        Object obj2 = iw.a;
        return obj2.equals(obj2) && this.a.equals(eszVar.a) && this.b.equals(eszVar.b) && this.c.equals(eszVar.c) && this.d.equals(eszVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (iw.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
