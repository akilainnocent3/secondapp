package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.timeAlert.local.TimeAlertDataStoreImpl", f = "TimeAlertDataStoreImpl.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "updatedTimeAlertPeriod", v = 2)
public final class ttf0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ptf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttf0(ptf0 ptf0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ptf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
