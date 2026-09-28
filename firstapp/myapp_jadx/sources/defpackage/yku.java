package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel", f = "MainViewModel.kt", l = {739, 749}, m = "getWorldCupPassPayloadOrNull", v = 2)
public final class yku extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ oku b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yku(oku okuVar, x1b x1bVar) {
        super(x1bVar);
        this.b = okuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B1(this);
    }
}
