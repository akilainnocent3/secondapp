package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.request.SportyLegendsPrepareRoundRequest;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsPrepareRound;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00142\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0006¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ldac0;", "", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsLeaguesAndTeams;", "b", "(Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "e", "Lcom/sportybet/android/instantwin/newtork/model/request/SportyLegendsPrepareRoundRequest;", "sportyLegendsPrePareRoundRequest", "Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsPrepareRound;", "d", "(Lcom/sportybet/android/instantwin/newtork/model/request/SportyLegendsPrepareRoundRequest;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "ticketParameter", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "Lcom/sportybet/android/instantwin/newtork/model/response/Round;", "a", "(Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/common/network/data/BaseResponse;", "c", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface dac0 {
    @flz("instantwin/api/v1/iwqk/sportyLegend/createAndSettle")
    Object a(@jh4 TicketParameter ticketParameter, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super Round> v1bVar);

    @sbj("instantwin/api/v1/iwqk/sportyLegend/getLeaguesAndTeams")
    Object b(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyLegendsLeaguesAndTeams> v1bVar);

    @flz("instantwin/api/v1/iwqk/sportyLegend/getUserCurrentRound")
    Object c(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkSportyLegendsPrepareRound>> v1bVar);

    @flz("instantwin/api/v1/iwqk/sportyLegend/prepareRound")
    Object d(@jh4 SportyLegendsPrepareRoundRequest sportyLegendsPrepareRoundRequest, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyLegendsPrepareRound> v1bVar);

    @sbj("instantwin/api/v1/iwqk/sportyLegend/getLeaguesAndTeamsWithoutLogin")
    Object e(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyLegendsLeaguesAndTeams> v1bVar);
}
