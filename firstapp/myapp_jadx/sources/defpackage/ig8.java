package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherov2.remote.models.ChatRoomResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ig8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String chatRoomId;
        w3c0 w3c0Var;
        ko80 binding;
        ChatRoomResponse chatRoomResponse;
        String botUserId;
        ChatRoomResponse chatRoomResponse2;
        w3c0 w3c0Var2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qg8 qg8Var = (qg8) obj2;
                ssw<kmj0> sswVar = qg8Var.N;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    WithDrawInfo withDrawInfo = (WithDrawInfo) ((BaseResponse) ((lk50.c) lk50Var).a).data;
                    if (withDrawInfo != null) {
                        if (withDrawInfo.hasInfo) {
                            BigDecimal bigDecimal = new BigDecimal(withDrawInfo.maxWithdrawAmount);
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
                            bigDecimalValueOf.getClass();
                            qg8Var.M = bigDecimal.divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP);
                            String strY = bjb0.Y(qg8Var.M);
                            String str = withDrawInfo.message;
                            str.getClass();
                            sswVar.m(new kmj0(strY, str));
                        } else {
                            sswVar.m(kmj0.c);
                        }
                    }
                } else {
                    if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    sswVar.m(kmj0.c);
                }
                return Unit.a;
            case 1:
                Selection selection = (Selection) obj2;
                TopicInfo topicInfo = (TopicInfo) obj;
                Market market = selection.b;
                Event event = selection.a;
                if (event != null) {
                    Sport sport = event.sport;
                    if (sport != null) {
                        topicInfo.setSportId(sa8.a(sport.id));
                        Category category = event.sport.category;
                        if (category != null) {
                            topicInfo.setCategoryId(sa8.a(category.id));
                            Tournament tournament = event.sport.category.tournament;
                            if (tournament != null) {
                                topicInfo.setTournamentId(tournament.id);
                            }
                        }
                    }
                    topicInfo.setEventId(event.eventId);
                }
                if (market != null) {
                    topicInfo.setMarketId(market.id);
                    if (!TextUtils.isEmpty(market.specifier)) {
                        topicInfo.setMarketSpecifiers(market.specifier);
                    }
                }
                return null;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = q1c0.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                    if (w3c0Var3 != null) {
                        w3c0Var3.d0.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String str2 = "";
                    if (hTTPResponse == null || (chatRoomResponse2 = (ChatRoomResponse) hTTPResponse.getData()) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                        chatRoomId = "";
                    }
                    q1c0Var.M = chatRoomId;
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null && (chatRoomResponse = (ChatRoomResponse) hTTPResponse2.getData()) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                        str2 = botUserId;
                    }
                    q1c0Var.N = str2;
                    if (q1c0Var.M.length() > 0 && (w3c0Var = (w3c0) q1c0Var.b) != null && (binding = w3c0Var.P.getBinding()) != null) {
                        binding.d.setVisibility(0);
                    }
                    FragmentManager parentFragmentManager = q1c0Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    Fragment fragmentH = parentFragmentManager.H("Chat");
                    if (fragmentH != null) {
                        a aVar = new a(parentFragmentManager);
                        aVar.p(fragmentH);
                        aVar.d();
                    }
                } else if (i2 == 2 && (w3c0Var2 = (w3c0) q1c0Var.b) != null) {
                    w3c0Var2.d0.P();
                }
                return Unit.a;
        }
    }
}
