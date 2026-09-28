package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.pay.security.NameUpdateStatus;
import com.sporty.android.core.model.pay.security.NameUpdateStatusMapperKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.TradingSharedViewModel$grayListSideFlowUiStateFlow$1", f = "TradingSharedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gpg0 extends tje0 implements iaj<lk50<? extends AssetsInfo>, lk50<? extends AccountInfo>, Boolean, v1b<? super lk50<? extends m7l>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(lk50<? extends AssetsInfo> lk50Var, lk50<? extends AccountInfo> lk50Var2, Boolean bool, v1b<? super lk50<? extends m7l>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        gpg0 gpg0Var = new gpg0(4, v1bVar);
        gpg0Var.a = lk50Var;
        gpg0Var.b = lk50Var2;
        gpg0Var.c = zBooleanValue;
        return gpg0Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object eVar;
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        boolean z = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List listK = b.k(lk50Var, lk50Var2);
        Iterator it = listK.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((lk50) next) instanceof lk50.a));
        lk50.a aVar = next instanceof lk50.a ? (lk50.a) next : null;
        if (!listK.isEmpty()) {
            Iterator it2 = listK.iterator();
            while (it2.hasNext()) {
                if (((lk50) it2.next()) instanceof lk50.b) {
                    return lk50.b.a;
                }
            }
        }
        if (aVar != null) {
            return new lk50.a(aVar.a);
        }
        lk50Var.getClass();
        AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
        lk50Var2.getClass();
        NameUpdateStatus nameUpdateStatusModel = NameUpdateStatusMapperKt.getNameUpdateStatusModel((AccountInfo) ((lk50.c) lk50Var2).a);
        assetsInfo.getClass();
        nameUpdateStatusModel.getClass();
        i41 i41VarA = k41.a(assetsInfo);
        int i = assetsInfo.tradeStatus;
        if (i == 91 && (Intrinsics.g(i41VarA, i41.a.a) || Intrinsics.g(i41VarA, i41.d.a))) {
            eVar = m7l.d.a;
        } else if (Intrinsics.g(i41VarA, i41.a.a)) {
            eVar = m7l.a.a;
        } else if (Intrinsics.g(i41VarA, i41.c.a)) {
            eVar = m7l.i.a;
        } else if (Intrinsics.g(i41VarA, i41.b.a)) {
            eVar = i == 121 ? new m7l.b(assetsInfo.aiAuditTitle, assetsInfo.aiAuditContent) : m7l.h.a;
        } else if (nameUpdateStatusModel.equals(NameUpdateStatus.Pending.INSTANCE)) {
            eVar = m7l.f.a;
        } else if (nameUpdateStatusModel instanceof NameUpdateStatus.Rejected) {
            NameUpdateStatus.Rejected rejected = (NameUpdateStatus.Rejected) nameUpdateStatusModel;
            String reasonTitle = rejected.getReasonTitle();
            if (reasonTitle == null) {
                reasonTitle = "";
            }
            String reasonDetail = rejected.getReasonDetail();
            eVar = new m7l.g(reasonTitle, reasonDetail != null ? reasonDetail : "");
        } else {
            eVar = nameUpdateStatusModel instanceof NameUpdateStatus.Approved ? new m7l.e(((NameUpdateStatus.Approved) nameUpdateStatusModel).getName()) : m7l.c.a;
        }
        if ((eVar instanceof m7l.e) && z) {
            eVar = m7l.c.a;
        }
        return new lk50.c(eVar);
    }
}
