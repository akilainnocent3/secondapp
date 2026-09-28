package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixChannelUseCase", f = "GetPixChannelUseCase.kt", l = {19}, m = "invoke-gIAlu-s", v = 2)
public final class zak extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ abk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zak(abk abkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = abkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
