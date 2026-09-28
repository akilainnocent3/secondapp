package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.android.limits.domain.ReportAppUsageUseCase", f = "ReportAppUsageUseCase.kt", l = {28, 30, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invoke", v = 2)
public final class q950 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r950 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q950(r950 r950Var, x1b x1bVar) {
        super(x1bVar);
        this.c = r950Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
