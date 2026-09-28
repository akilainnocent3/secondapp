package defpackage;

import com.sportygames.crash.remote.models.BetHistoryItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vm7 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                rm7 rm7Var = (rm7) obj;
                rm7Var.getClass();
                return rm7.b(rm7Var, false, 23);
            default:
                BetHistoryItem betHistoryItem = (BetHistoryItem) obj;
                betHistoryItem.getClass();
                return betHistoryItem.getRoundId() + "_" + betHistoryItem.getId();
        }
    }
}
