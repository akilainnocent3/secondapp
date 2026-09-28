package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.domain.GetCodeChatHeaderByBookingCodeUseCase", f = "GetCodeChatHeaderByBookingCodeUseCase.kt", l = {20}, m = "invoke", v = 2)
public final class o4k extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n4k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4k(n4k n4kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = n4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
