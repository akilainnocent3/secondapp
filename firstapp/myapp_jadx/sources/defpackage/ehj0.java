package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.delegates.alert.WithdrawAlertDelegate", f = "WithdrawAlertDelegate.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "getDropAlert", v = 2)
public final class ehj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ dhj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehj0(dhj0 dhj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = dhj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
