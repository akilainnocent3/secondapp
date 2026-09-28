package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.dialog.BonusCupDialogManager", f = "BonusCupDialogManager.kt", l = {32, 33, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 35, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "handleCurrentGameStatus", v = 1)
public final class sj4 extends x1b {
    public x4c a;
    public qsf0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tj4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj4(tj4 tj4Var, x1b x1bVar) {
        super(x1bVar);
        this.e = tj4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
