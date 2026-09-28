package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jxx {
    public final duw<vwx> a = new duw<>(new vwx[16]);
    public final etw<jxx> b = new etw<>(10);

    public boolean a(qkt<m020> qktVar, urr urrVar, czo czoVar, boolean z) {
        duw<vwx> duwVar = this.a;
        vwx[] vwxVarArr = duwVar.a;
        int i = duwVar.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = vwxVarArr[i2].a(qktVar, urrVar, czoVar, z) || z2;
        }
        return z2;
    }

    public void b(czo czoVar) {
        duw<vwx> duwVar = this.a;
        int i = duwVar.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (duwVar.a[i].d.a == 0) {
                duwVar.k(i);
            }
        }
    }
}
