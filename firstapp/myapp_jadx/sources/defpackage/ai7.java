package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.graylist.domain.usecase.CheckAuditStatusUseCase$getKYCUIState$1", f = "CheckAuditStatusUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ai7 extends tje0 implements gaj<ng50<AssetsInfo>, lk50<? extends AccountInfo>, v1b<? super m7l>, Object> {
    public /* synthetic */ ng50 a;
    public /* synthetic */ lk50 b;
    public final /* synthetic */ dq40<AssetsInfo> c;
    public final /* synthetic */ bi7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai7(dq40<AssetsInfo> dq40Var, bi7 bi7Var, v1b<? super ai7> v1bVar) {
        super(3, v1bVar);
        this.c = dq40Var;
        this.d = bi7Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(ng50<AssetsInfo> ng50Var, lk50<? extends AccountInfo> lk50Var, v1b<? super m7l> v1bVar) {
        ai7 ai7Var = new ai7(this.c, this.d, v1bVar);
        ai7Var.a = ng50Var;
        ai7Var.b = lk50Var;
        return ai7Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        AccountInfo accountInfo;
        AssetsInfo assetsInfo;
        Object eVar;
        ng50 ng50Var = this.a;
        lk50 lk50Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.c.a = ng50Var.a;
        this.d.getClass();
        ng50.b bVar2 = ng50Var instanceof ng50.b ? (ng50.b) ng50Var : null;
        if (bVar2 == null || (assetsInfo = (AssetsInfo) bVar2.a) == null) {
            bVar = m7l.c.a;
        } else {
            int i = assetsInfo.auditStatus;
            AssetsInfo assetsInfo2 = (AssetsInfo) ((ng50.b) ng50Var).a;
            Integer numValueOf = assetsInfo2 != null ? Integer.valueOf(assetsInfo2.tradeStatus) : null;
            if (i != 0) {
                switch (i) {
                    case 11:
                        eVar = i41.a.a;
                        break;
                    case 12:
                        eVar = i41.c.a;
                        break;
                    case 13:
                        eVar = i41.b.a;
                        break;
                    default:
                        eVar = new i41.e();
                        break;
                }
            } else {
                eVar = i41.d.a;
            }
            if (Intrinsics.g(eVar, i41.d.a)) {
                bVar = m7l.c.a;
            } else if (Intrinsics.g(eVar, i41.a.a)) {
                bVar = m7l.a.a;
            } else if (Intrinsics.g(eVar, i41.c.a)) {
                bVar = m7l.i.a;
            } else if (!Intrinsics.g(eVar, i41.b.a)) {
                bVar = m7l.c.a;
            } else if (numValueOf != null && numValueOf.intValue() == 121) {
                bVar = new m7l.b(assetsInfo2 != null ? assetsInfo2.aiAuditTitle : null, assetsInfo2 != null ? assetsInfo2.aiAuditContent : null);
            } else {
                bVar = m7l.h.a;
            }
        }
        if (!(bVar instanceof m7l.c)) {
            return bVar;
        }
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (accountInfo = (AccountInfo) cVar.a) == null) {
            return m7l.c.a;
        }
        Integer nameUpdateStatus = accountInfo.getNameUpdateStatus();
        if (nameUpdateStatus != null && nameUpdateStatus.intValue() == 20) {
            return m7l.f.a;
        }
        if (nameUpdateStatus != null && nameUpdateStatus.intValue() == 40) {
            String nameUpdateRejectReasonTitle = accountInfo.getNameUpdateRejectReasonTitle();
            if (nameUpdateRejectReasonTitle == null) {
                nameUpdateRejectReasonTitle = "";
            }
            String nameUpdateRejectReasonDetail = accountInfo.getNameUpdateRejectReasonDetail();
            return new m7l.g(nameUpdateRejectReasonTitle, nameUpdateRejectReasonDetail != null ? nameUpdateRejectReasonDetail : "");
        }
        if (nameUpdateStatus == null || nameUpdateStatus.intValue() != 30) {
            return m7l.c.a;
        }
        String nameUpdateSuccessContent = accountInfo.getNameUpdateSuccessContent();
        return new m7l.e(nameUpdateSuccessContent != null ? nameUpdateSuccessContent : "");
    }
}
