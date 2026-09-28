package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spinmatch.components.BetConfig;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f02 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f02(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer bizCode;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                bc6 bc6Var = ((g02) obj2).U;
                if (bc6Var != null) {
                    Object obj3 = new Object();
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(obj3);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
                break;
            case 1:
                ((Function1) obj2).invoke(wae.DAILY_STREAK);
                ((Function1) obj).invoke(new igm.s(q7e0.c.a, a.c(k00.d)));
                break;
            default:
                kab0 kab0Var = (kab0) obj;
                HTTPResponse<Object> error = ((LoadingState) obj2).getError().getError();
                if (error != null && (bizCode = error.getBizCode()) != null && bizCode.intValue() == 8022) {
                    kab0Var.N = true;
                    kab0Var.w0().x1();
                    fo80 fo80Var = kab0Var.c;
                    if (fo80Var != null) {
                        BetConfig betConfig = fo80Var.c;
                        Set<Integer> setKeySet = kab0Var.f.keySet();
                        setKeySet.getClass();
                        betConfig.G(CollectionsKt.A0(setKeySet));
                    }
                    kab0Var.f.clear();
                }
                break;
        }
        return Unit.a;
    }
}
