package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
public final class y680 extends x1b {
    public x680 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x680<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y680(x680 x680Var, x1b x1bVar) {
        super(x1bVar);
        this.c = x680Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = x680.i;
        return this.c.g(this);
    }
}
