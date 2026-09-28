package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.domain.usecase.SetBirthdayGiftHintHasShownUseCase", f = "SetBirthdayGiftHintHasShownUseCase.kt", l = {17}, m = "execute-0E7RQCE", v = 2)
public final class mh80 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ oh80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh80(oh80 oh80Var, x1b x1bVar) {
        super(x1bVar);
        this.b = oh80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
