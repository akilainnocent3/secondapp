package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {105}, m = "userCheck", v = 2)
public final class zjc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ akc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjc0(akc0 akc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = akc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Set<Integer> set = akc0.i;
        return this.b.e(null, this);
    }
}
