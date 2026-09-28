package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.PressStackUseCase", f = "PressStackUseCase.kt", l = {20, 21, 22, KYCBannerItem.STATUS_DEPRECATE, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invoke", v = 1)
public final class op20 extends x1b {
    public int a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pp20 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op20(pp20 pp20Var, x1b x1bVar) {
        super(x1bVar);
        this.e = pp20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
