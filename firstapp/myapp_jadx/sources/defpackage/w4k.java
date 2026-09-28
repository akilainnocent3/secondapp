package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.GetCodeSelectionsUseCase", f = "GetCodeSelectionsUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class w4k extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x4k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4k(x4k x4kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = x4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
