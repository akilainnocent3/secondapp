package defpackage;

import com.sporty.android.core.model.patron.DocumentAuditStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ShowKycDialogDelegateImpl$init$1", f = "ShowKycDialogDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s990 extends tje0 implements gaj<Integer, Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public final /* synthetic */ t990 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s990(t990 t990Var, v1b<? super s990> v1bVar) {
        super(3, v1bVar);
        this.c = t990Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Integer num2, v1b<? super Boolean> v1bVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        s990 s990Var = new s990(this.c, v1bVar);
        s990Var.a = iIntValue;
        s990Var.b = iIntValue2;
        return s990Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(this.c.a.x() && i == 310 && i2 != DocumentAuditStatus.SUBMITTED.getValue() && i2 != DocumentAuditStatus.APPROVED.getValue());
    }
}
