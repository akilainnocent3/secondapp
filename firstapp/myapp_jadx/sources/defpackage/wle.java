package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wle extends zgx<vle.a> {
    public final vle i;
    public final yle j;
    public final op8 k;

    public wle(vle vleVar, String str, yle yleVar, op8 op8Var) {
        super(vleVar, -1, str);
        this.i = vleVar;
        this.j = yleVar;
        this.k = op8Var;
    }

    @Override // defpackage.zgx
    public final ygx b() {
        return new vle.a(this.i, this.j, this.k);
    }

    public wle(vle vleVar, dq7 dq7Var, o2g o2gVar, yle yleVar, op8 op8Var) {
        super(vleVar, dq7Var, o2gVar);
        this.i = vleVar;
        this.j = yleVar;
        this.k = op8Var;
    }
}
