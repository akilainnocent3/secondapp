package defpackage;

import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import java.util.Set;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class r640 {
    public static final RealBetHistoryOrderEntity.a a(q640 q640Var) {
        q640Var.getClass();
        String str = q640Var.a;
        Integer num = q640Var.d;
        Set setV = null;
        Long lS0 = str != null ? StringsKt.s0(str) : null;
        String str2 = q640Var.b;
        Long lS1 = str2 != null ? StringsKt.s0(str2) : null;
        Set<Integer> setV2 = q640Var.c;
        if (setV2 == null) {
            z2z z2zVar = z2z.UNSETTLED;
            setV2 = (num != null && num.intValue() == 0) ? ay0.V(new Integer[]{0, 90, 5}) : null;
        }
        z2z z2zVar2 = z2z.UNSETTLED;
        if (num != null && num.intValue() == 1) {
            setV = ay0.V(new Integer[]{0, 90, 5});
        }
        return new RealBetHistoryOrderEntity.a(lS0, lS1, setV2, setV);
    }
}
