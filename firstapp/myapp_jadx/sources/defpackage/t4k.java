package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.GetCodeSelectionsLiabilityUseCase", f = "GetCodeSelectionsLiabilityUseCase.kt", l = {19}, m = "invoke", v = 2)
public final class t4k extends x1b {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u4k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4k(u4k u4kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = u4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
