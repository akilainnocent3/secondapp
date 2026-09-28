package defpackage;

import com.sportybet.plugin.realsports.data.RSelection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class em2 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cu30 cu30Var = (cu30) obj;
        cu30Var.getClass();
        RSelection rSelection = cu30Var.a;
        if (!rSelection.lfbOddsBoosted) {
            return null;
        }
        String str = rSelection.eventId;
        String str2 = rSelection.outcomeId;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        return i8z.a(str, str2);
    }
}
