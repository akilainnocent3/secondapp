package defpackage;

import android.text.TextUtils;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r780 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r780(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
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
                if (market == null) {
                    return null;
                }
                topicInfo.setMarketId(market.id);
                if (TextUtils.isEmpty(market.specifier)) {
                    return null;
                }
                topicInfo.setMarketSpecifiers(market.specifier);
                return null;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    q1c0Var.r0();
                }
                return Unit.a;
        }
    }
}
