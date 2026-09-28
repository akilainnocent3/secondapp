package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {236, 242}, m = "playSoundsFor", v = 1)
public final class dl4 extends x1b {
    public il4 a;
    public Iterator b;
    public vj4 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zk4 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl4(zk4 zk4Var, x1b x1bVar) {
        super(x1bVar);
        this.f = zk4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.m(null, this);
    }
}
