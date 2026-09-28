package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.delegates.alert.DepositAlertDelegate", f = "DepositAlertDelegate.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "getDropAlert", v = 2)
public final class jod extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iod b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jod(iod iodVar, x1b x1bVar) {
        super(x1bVar);
        this.b = iodVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
