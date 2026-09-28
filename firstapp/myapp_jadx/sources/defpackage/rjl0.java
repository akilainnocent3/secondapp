package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rjl0 implements hkl0 {
    public final hkl0[] a;

    public rjl0(hkl0... hkl0VarArr) {
        this.a = hkl0VarArr;
    }

    @Override // defpackage.hkl0
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hkl0
    public final fkl0 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            hkl0 hkl0Var = this.a[i];
            if (hkl0Var.zzb(cls)) {
                return hkl0Var.zzc(cls);
            }
        }
        zkh.a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
