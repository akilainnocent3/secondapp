package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.security.otp.domain.usecase.InitSmsVerificationUseCase", f = "InitSmsVerificationUseCase.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invoke", v = 2)
public final class ugn extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vgn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugn(vgn vgnVar, x1b x1bVar) {
        super(x1bVar);
        this.b = vgnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
