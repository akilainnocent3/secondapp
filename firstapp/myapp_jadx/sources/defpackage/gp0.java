package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gp0 implements pya {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pya
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fkc fkcVar = (fkc) obj2;
                Throwable cause = (Throwable) obj;
                hp0 hp0Var = hp0.A;
                if (cause instanceof idh0) {
                    cause = cause.getCause();
                }
                fkcVar.uncaughtException(Thread.currentThread(), cause);
                break;
            default:
                ((h8a) obj2).invoke(obj);
                break;
        }
    }
}
