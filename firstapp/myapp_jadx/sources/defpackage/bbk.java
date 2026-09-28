package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixDepositPollingConfigUseCase", f = "GetPixDepositPollingConfigUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invoke", v = 2)
public final class bbk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ dbk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbk(dbk dbkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = dbkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
