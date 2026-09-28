package defpackage;

import com.sportygames.spinmatch.model.response.DetailResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t9b0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DetailResponse.BetConfigList betConfigList = (DetailResponse.BetConfigList) obj;
        betConfigList.getClass();
        return Boolean.valueOf(betConfigList.getOrderedPosition() == 0);
    }
}
