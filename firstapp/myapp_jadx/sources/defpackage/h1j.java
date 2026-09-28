package defpackage;

import android.content.SharedPreferences;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h1j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bxg0 bxg0Var;
        List<Tournament> list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = n2jVar.K;
                if (editor != null) {
                    editor.putBoolean("SOUND", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = n2jVar.K;
                if (editor2 != null) {
                    editor2.apply();
                }
                n2jVar.v0().y1().d = zBooleanValue;
                n2jVar.v0().J1(n2jVar.v0().y1().d);
                break;
            case 1:
                uqs uqsVar = (uqs) obj2;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                ssw sswVar = uqsVar.A;
                Object objD = sswVar.d();
                if (!(objD instanceof lk50.c)) {
                    objD = null;
                }
                lk50.c cVar = (lk50.c) objD;
                if (cVar != null && (bxg0Var = (bxg0) cVar.a) != null) {
                    List<Tournament> list2 = (List) bxg0Var.a;
                    if (!(lk50Var instanceof lk50.c)) {
                        lk50Var = null;
                    }
                    lk50.c cVar2 = (lk50.c) lk50Var;
                    if (cVar2 != null && (list = (List) cVar2.a) != null) {
                        for (Tournament tournament : list2) {
                            for (Tournament tournament2 : list) {
                                if (Intrinsics.g(tournament, tournament2)) {
                                    List<Event> list3 = tournament.events;
                                    list3.getClass();
                                    for (Event event : list3) {
                                        List<Event> list4 = tournament2.events;
                                        list4.getClass();
                                        for (Event event2 : list4) {
                                            if (Intrinsics.g(event, event2)) {
                                                List<Market> list5 = event2.markets;
                                                list5.getClass();
                                                for (Market market : list5) {
                                                    List<Market> list6 = event.markets;
                                                    if (list6 != null && (!list6.contains(market))) {
                                                        event.markets.add(market);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        lk50<bxg0<List<Tournament>, List<LiveBoostMatchItem>, Boolean>> lk50Var2 = (lk50) sswVar.d();
                        if (lk50Var2 != null) {
                            uqsVar.z.m(lk50Var2);
                        }
                    }
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((gaj) obj2).invoke(str, y7i.c.a, Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
