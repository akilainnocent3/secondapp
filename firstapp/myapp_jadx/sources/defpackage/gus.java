package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.commonusecase.LiveSocketUseCase$updateMultiMakerSubscriber$2", f = "LiveSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gus extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ hus a;
    public final /* synthetic */ List<MultiMakerItem> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gus(hus husVar, List<MultiMakerItem> list, v1b<? super gus> v1bVar) {
        super(2, v1bVar);
        this.a = husVar;
        this.b = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gus(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gus) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hus husVar = this.a;
        husVar.b(true);
        husVar.i.h();
        husVar.k.h();
        for (final MultiMakerItem multiMakerItem : this.b) {
            final String strA = sa8.a(multiMakerItem.a.v);
            final String strA2 = sa8.a(multiMakerItem.a.w);
            String strGenerateTopicString = TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new Function1() { // from class: dus
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    TopicInfo topicInfo = (TopicInfo) obj2;
                    topicInfo.setSportId(strA);
                    topicInfo.setCategoryId(strA2);
                    MultiMakerEvent multiMakerEvent = multiMakerItem.a;
                    topicInfo.setTournamentId(multiMakerEvent.y);
                    topicInfo.setEventId(multiMakerEvent.a);
                    return Unit.a;
                }
            });
            String strGenerateTopicString2 = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: eus
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    TopicInfo topicInfo = (TopicInfo) obj2;
                    topicInfo.setSportId(strA);
                    topicInfo.setCategoryId(strA2);
                    MultiMakerItem multiMakerItem2 = multiMakerItem;
                    MultiMakerEvent multiMakerEvent = multiMakerItem2.a;
                    topicInfo.setTournamentId(multiMakerEvent.y);
                    topicInfo.setEventId(multiMakerEvent.a);
                    MultiMakerMarket multiMakerMarket = multiMakerItem2.b;
                    topicInfo.setMarketId(multiMakerMarket.a);
                    String str = multiMakerMarket.b;
                    if (str.length() > 0) {
                        topicInfo.setMarketSpecifiers(str);
                    }
                    return Unit.a;
                }
            });
            String strGenerateTopicString3 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: fus
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    TopicInfo topicInfo = (TopicInfo) obj2;
                    topicInfo.setSportId(strA);
                    topicInfo.setCategoryId(strA2);
                    MultiMakerItem multiMakerItem2 = multiMakerItem;
                    MultiMakerEvent multiMakerEvent = multiMakerItem2.a;
                    topicInfo.setTournamentId(multiMakerEvent.y);
                    topicInfo.setEventId(multiMakerEvent.a);
                    MultiMakerMarket multiMakerMarket = multiMakerItem2.b;
                    topicInfo.setMarketId(multiMakerMarket.a);
                    String str = multiMakerMarket.b;
                    if (str.length() > 0) {
                        topicInfo.setMarketSpecifiers(str);
                    }
                    return Unit.a;
                }
            });
            ConcurrentHashMap<Topic, Subscriber> concurrentHashMap = husVar.b;
            yts ytsVar = husVar.e;
            concurrentHashMap.put(new GroupTopic(strGenerateTopicString), husVar.f);
            concurrentHashMap.put(new GroupTopic(strGenerateTopicString2), ytsVar);
            concurrentHashMap.put(new GroupTopic(strGenerateTopicString3), ytsVar);
        }
        husVar.a();
        return Unit.a;
    }
}
