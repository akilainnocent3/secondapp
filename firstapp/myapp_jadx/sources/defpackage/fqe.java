package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fqe extends zmd {
    public int m;

    public fqe(x6j0 x6j0Var) {
        super(x6j0Var);
        if (x6j0Var instanceof vjm) {
            this.e = zmd.a.b;
        } else {
            this.e = zmd.a.c;
        }
    }

    @Override // defpackage.zmd
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            smd smdVar = (smd) obj;
            smdVar.a(smdVar);
        }
    }
}
