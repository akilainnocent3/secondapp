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
public final class lih {
    public final lq1 a;

    public lih(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i, x1b x1bVar, String str) {
        kih kihVar;
        BOConfigValueWrapper bOConfigValueWrapper;
        if (x1bVar instanceof kih) {
            kihVar = (kih) x1bVar;
            int i2 = kihVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kihVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kihVar = new kih(this, x1bVar);
            }
        } else {
            kihVar = new kih(this, x1bVar);
        }
        Object objA = kihVar.b;
        y5b y5bVar = y5b.a;
        int i3 = kihVar.d;
        if (i3 == 0) {
            uj50.b(objA);
            sl50 sl50Var = new sl50(this.a.c(a.c(new BOConfigParamDto(BOConfigAppId.COMMON, BOConfigNamespace.APPLICATION, str, null, 8, null))));
            kihVar.a = i;
            kihVar.d = 1;
            objA = s0i.a(sl50Var, kihVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = kihVar.a;
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            List<BOConfigValueWrapper> boConfigValueWrappers = ((BOConfigValueBundle) ((lk50.c) lk50Var).a).getBoConfigValueWrappers();
            List<BOConfigValueWrapper> list = boConfigValueWrappers.isEmpty() ? null : boConfigValueWrappers;
            if (list != null && (bOConfigValueWrapper = (BOConfigValueWrapper) CollectionsKt.T(list)) != null) {
                i = bOConfigValueWrapper.configValueAsInt(i);
            }
        }
        return new Integer(i);
    }
}
