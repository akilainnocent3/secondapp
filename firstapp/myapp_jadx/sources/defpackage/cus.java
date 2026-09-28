package defpackage;

import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.commonusecase.LiveSocketUseCase$updateLiveSubscriber$2", f = "LiveSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cus extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ hus a;
    public final /* synthetic */ String b;
    public final /* synthetic */ RegularMarketRule c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cus(hus husVar, String str, RegularMarketRule regularMarketRule, v1b<? super cus> v1bVar) {
        super(2, v1bVar);
        this.a = husVar;
        this.b = str;
        this.c = regularMarketRule;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cus(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cus) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hus husVar = this.a;
        husVar.b(true);
        husVar.i.h();
        husVar.k.h();
        final String strA = sa8.a(this.b);
        String strGenerateTopicString = TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new zbo(strA, 1));
        TopicType topicType = TopicType.MARKET_STATUS;
        final RegularMarketRule regularMarketRule = this.c;
        String strGenerateTopicString2 = TopicInfoKt.generateTopicString(topicType, new Function1() { // from class: aus
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TopicInfo topicInfo = (TopicInfo) obj2;
                topicInfo.setSportId(strA);
                topicInfo.setProductId(tva.a);
                topicInfo.setMarketId(regularMarketRule.a);
                return Unit.a;
            }
        });
        String strGenerateTopicString3 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new bus(0, strA, regularMarketRule));
        ConcurrentHashMap<Topic, Subscriber> concurrentHashMap = husVar.b;
        concurrentHashMap.put(new GroupTopic(strGenerateTopicString), husVar.f);
        GroupTopic groupTopic = new GroupTopic(strGenerateTopicString2);
        xts xtsVar = husVar.d;
        concurrentHashMap.put(groupTopic, xtsVar);
        concurrentHashMap.put(new GroupTopic(strGenerateTopicString3), xtsVar);
        husVar.a();
        return Unit.a;
    }
}
