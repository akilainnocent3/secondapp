package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class hja0 implements ezm {
    public final fzm a;
    public final dum b;
    public final b5 c;

    public hja0(fzm fzmVar, dum dumVar, b5 b5Var) {
        fzmVar.getClass();
        dumVar.getClass();
        b5Var.getClass();
        this.a = fzmVar;
        this.b = dumVar;
        this.c = b5Var;
    }

    @Override // defpackage.ezm
    public final Object a(x1b x1bVar) {
        String baseUrlSocket = this.c.getBaseUrlSocket();
        if (baseUrlSocket == null) {
            baseUrlSocket = "";
        }
        String strConcat = baseUrlSocket.concat("games/sporty-piggy-bash/v1/game");
        dum dumVar = this.b;
        Object objB = this.a.b(strConcat, dumVar.c(), dumVar.d(), x1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
