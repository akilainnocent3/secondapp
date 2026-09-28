package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool", f = "SGSoundPool.kt", l = {437}, m = "download", v = 1)
public final class sk60 extends x1b {
    public rk60.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rk60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk60(rk60 rk60Var, x1b x1bVar) {
        super(x1bVar);
        this.c = rk60Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        HashMap<String, rk60.b> map = rk60.n;
        return this.c.a(null, this);
    }
}
