package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.antest.ZaDepositLobbyTestManager", f = "ZaDepositLobbyTestManager.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38, 47}, m = "resolveVariant", v = 2)
public final class tbk0 extends x1b {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ubk0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbk0(ubk0 ubk0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ubk0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(false, this);
    }
}
