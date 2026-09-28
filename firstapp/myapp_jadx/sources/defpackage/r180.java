package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r180 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r180(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                event.getClass();
                Event event2 = new Event(event);
                event2.update(((SocketEventMessage) obj2).jsonObject);
                if (event2.status == 1) {
                    List<Market> list = event2.markets;
                    ArrayList arrayListA = kw5.a(list);
                    for (Object obj3 : list) {
                        if (((Market) obj3).isPreMatch()) {
                            arrayListA.add(obj3);
                        }
                    }
                    int size = arrayListA.size();
                    while (i2 < size) {
                        Object obj4 = arrayListA.get(i2);
                        i2++;
                        Market market = (Market) obj4;
                        market.status = 1;
                        market.product = 1;
                    }
                }
                return event2;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                ((View) obj).getClass();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    w3c0Var.g0.a.setVisibility(8);
                }
                q1c0Var.b2();
                GameDetails gameDetails = q1c0Var.W1;
                wz.a("ClaimFastToastClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                return Unit.a;
        }
    }
}
