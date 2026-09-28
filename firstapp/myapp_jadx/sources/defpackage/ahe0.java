package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ahe0 implements Runnable {
    public final /* synthetic */ ehe0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ahe0(ehe0 ehe0Var, int i, int i2) {
        this.a = ehe0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ehe0 ehe0Var = this.a;
        int i = ehe0Var.i;
        int i2 = this.b;
        boolean z2 = true;
        if (i != i2) {
            ehe0Var.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = ehe0Var.h;
        int i4 = this.c;
        if (i3 != i4) {
            ehe0Var.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            ehe0Var.e();
        }
    }
}
