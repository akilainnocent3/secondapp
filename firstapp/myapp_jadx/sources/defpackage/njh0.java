package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.usecase.UpdateBetSlipParamsUseCase", f = "UpdateBetSlipParamsUseCase.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "generateConfig", v = 2)
public final class njh0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ pjh0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njh0(pjh0 pjh0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = pjh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
