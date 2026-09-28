package defpackage;

import com.sportybet.plugin.sportydesk.activities.SportyDeskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nnb0 implements Function1 {
    public final /* synthetic */ SportyDeskActivity a;

    public /* synthetic */ nnb0(SportyDeskActivity sportyDeskActivity) {
        this.a = sportyDeskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = SportyDeskActivity.H;
        this.a.w.setBetTicketData((JSONObject) obj);
        return Unit.a;
    }
}
