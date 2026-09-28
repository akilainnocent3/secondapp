package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationBetHistory;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationConfigData;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationSettleRound;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketResult;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0012\u0010\u0010J$\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0015\u0010\u0010J$\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lbl90;", "", "", "mediaType", "requestBody", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationSettleRound;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "roundId", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketResult;", "c", "(Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationConfigData;", "d", "ticketId", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicket;", "e", "", "offset", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationBetHistory;", "a", "(ILcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bl90 {
    @sbj("sportySim/v1/ticket/list")
    Object a(@db30("offset") int i, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSimulationBetHistory> v1bVar);

    @flz("sportySim/v2/ticket/create")
    Object b(@rhl("Content-Type") String str, @jh4 String str2, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super NetworkSimulationSettleRound> v1bVar);

    @sbj("sportySim/v2/ticket/result")
    Object c(@db30("roundId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super List<NetworkSimulationTicketResult>> v1bVar);

    @sbj("sportySim/v1/config/overall")
    Object d(@rhl("Content-Type") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSimulationConfigData> v1bVar);

    @sbj("sportySim/v1/ticket/detail")
    Object e(@db30("ticketId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSimulationTicket> v1bVar);
}
