package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes5.dex */
public final class n8k {
    public final lq1 a;

    public n8k(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, int i2, x1b x1bVar) {
        m8k m8kVar;
        List<BOConfigValueWrapper> boConfigValueWrappers;
        BOConfigValueWrapper bOConfigValueWrapper;
        if (x1bVar instanceof m8k) {
            m8kVar = (m8k) x1bVar;
            int i3 = m8kVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8kVar.d = i3 - Integer.MIN_VALUE;
            } else {
                m8kVar = new m8k(this, x1bVar);
            }
        } else {
            m8kVar = new m8k(this, x1bVar);
        }
        Object objQ = m8kVar.b;
        y5b y5bVar = y5b.a;
        int i4 = m8kVar.d;
        if (i4 == 0) {
            uj50.b(objQ);
            yzh yzhVarC = this.a.c(a.c(new BOConfigParamDto(BOConfigAppId.POCKET, BOConfigNamespace.APPLICATION, pe4.b(i, "sporty.paymentChannel.", ".maxPendingDeposits"), null, 8, null)));
            m8kVar.a = i2;
            m8kVar.d = 1;
            objQ = bm50.q(yzhVarC, m8kVar);
            if (objQ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = m8kVar.a;
            uj50.b(objQ);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) objQ;
        if (bOConfigValueBundle != null && (boConfigValueWrappers = bOConfigValueBundle.getBoConfigValueWrappers()) != null && (bOConfigValueWrapper = (BOConfigValueWrapper) CollectionsKt.firstOrNull(boConfigValueWrappers)) != null) {
            i2 = bOConfigValueWrapper.configValueAsInt(i2);
        }
        return new Integer(i2);
    }
}
