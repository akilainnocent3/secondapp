package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class syd0 {
    public static final syd0 c = new syd0(null, null);
    public final urr a;
    public final ukf0 b;

    public syd0(urr urrVar, ukf0 ukf0Var) {
        this.a = urrVar;
        this.b = ukf0Var;
    }

    public static syd0 a(syd0 syd0Var, ywx ywxVar, ukf0 ukf0Var, int i) {
        urr urrVar = ywxVar;
        if ((i & 1) != 0) {
            urrVar = syd0Var.a;
        }
        if ((i & 2) != 0) {
            ukf0Var = syd0Var.b;
        }
        syd0Var.getClass();
        return new syd0(urrVar, ukf0Var);
    }
}
