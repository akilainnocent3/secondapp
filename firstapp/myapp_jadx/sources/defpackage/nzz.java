package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nzz implements j350 {
    public final Set<j350> a;
    public final duw<k350> b = new duw<>(new k350[16]);

    public nzz(Set<j350> set) {
        this.a = set;
    }

    @Override // defpackage.j350
    public final void c() {
        duw<k350> duwVar = this.b;
        k350[] k350VarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            j350 j350Var = k350VarArr[i2].a;
            this.a.remove(j350Var);
            j350Var.c();
        }
    }

    @Override // defpackage.j350
    public final void e() {
    }

    @Override // defpackage.j350
    public final void f() {
    }
}
