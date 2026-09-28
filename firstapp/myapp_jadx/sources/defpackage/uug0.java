package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uug0 implements Runnable {
    public final /* synthetic */ avg0 a;
    public final /* synthetic */ pyj b;
    public final /* synthetic */ zu0 c;

    public /* synthetic */ uug0(avg0 avg0Var, pyj pyjVar, zu0 zu0Var) {
        this.a = avg0Var;
        this.b = pyjVar;
        this.c = zu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd00.b bVarJ = nd00.j();
        bVarJ.h(this.b);
        this.a.d(bVarJ, this.c);
    }
}
