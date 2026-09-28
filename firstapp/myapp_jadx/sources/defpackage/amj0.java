package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawDelegate", f = "WithdrawDelegate.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "makeWithdraw-gIAlu-s", v = 2)
public final class amj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ bmj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amj0(bmj0 bmj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = bmj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
