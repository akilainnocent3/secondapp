package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {292}, m = "updateEngine", v = 1)
public final class fl4 extends x1b {
    public Function0 a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zk4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl4(zk4 zk4Var, x1b x1bVar) {
        super(x1bVar);
        this.d = zk4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.n(null, this);
    }
}
