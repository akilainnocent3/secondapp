package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool", f = "SGSoundPool.kt", l = {107}, m = "loadSoundsInSoundPool", v = 1)
public final class wk60 extends x1b {
    public Iterator a;
    public Map.Entry b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rk60 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk60(rk60 rk60Var, x1b x1bVar) {
        super(x1bVar);
        this.e = rk60Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
