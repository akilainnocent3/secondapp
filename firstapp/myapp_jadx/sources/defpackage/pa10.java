package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.d;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel", f = "PixBtgQrCodeViewModel.kt", l = {163}, m = "getUserCpf-gIAlu-s", v = 2)
public final class pa10 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa10(d dVar, x1b x1bVar) {
        super(x1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB1 = this.b.B1(null, this);
        return objB1 == y5b.a ? objB1 : new zi50(objB1);
    }
}
