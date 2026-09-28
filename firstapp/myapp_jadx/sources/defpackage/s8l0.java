package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class s8l0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ual0 e;

    public s8l0(ual0 ual0Var, String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.e.a;
        String str = this.b;
        String str2 = this.a;
        if (str2 == null) {
            iol0Var.b().g();
            String str3 = iol0Var.G;
            if (str3 == null || str3.equals(str)) {
                iol0Var.G = str;
                iol0Var.F = null;
                return;
            }
            return;
        }
        igl0 igl0Var = new igl0(this.d, this.c, str2);
        iol0Var.b().g();
        String str4 = iol0Var.G;
        if (str4 != null) {
            str4.equals(str);
        }
        iol0Var.G = str;
        iol0Var.F = igl0Var;
    }
}
