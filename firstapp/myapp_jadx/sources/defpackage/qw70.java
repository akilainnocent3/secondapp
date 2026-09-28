package defpackage;

import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLiveViewModel$updateSubscriber$2", f = "SearchLiveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qw70 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ rw70 a;
    public final /* synthetic */ List<Event> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qw70(rw70 rw70Var, List<? extends Event> list, v1b<? super qw70> v1bVar) {
        super(2, v1bVar);
        this.a = rw70Var;
        this.b = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qw70(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qw70) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ow70] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final rw70 rw70Var = this.a;
        RegularMarketRule regularMarketRule = rw70Var.z;
        if (regularMarketRule == null) {
            return Unit.a;
        }
        String str = regularMarketRule.a;
        rw70Var.c.h();
        rw70Var.A1();
        cw70.i.clear();
        final int i = 0;
        for (Object obj2 : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            final Event event = (Event) obj2;
            final GroupTopic groupTopic = new GroupTopic(event.getTopic());
            String str2 = tva.a;
            final GroupTopic groupTopic2 = new GroupTopic(event.getMarketStatusTopic(str2, str));
            final GroupTopic groupTopic3 = new GroupTopic(event.getMarketOddsTopic(str2, str));
            final ?? r6 = new Subscriber() { // from class: ow70
                @Override // com.sportybet.ntespm.socket.Subscriber
                public final void onReceive(String str3) {
                    SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str3);
                    if (socketMarketMessageCreate != null && socketMarketMessageCreate.isLive) {
                        rw70Var.c.a(new Pair(socketMarketMessageCreate, Integer.valueOf(i)));
                    }
                }
            };
            LinkedHashMap linkedHashMap = rw70Var.w;
            linkedHashMap.put(groupTopic2, r6);
            linkedHashMap.put(groupTopic3, r6);
            linkedHashMap.put(groupTopic, new Subscriber() { // from class: pw70
                @Override // com.sportybet.ntespm.socket.Subscriber
                public final void onReceive(String str3) {
                    rw70 rw70Var2 = rw70Var;
                    LinkedHashMap linkedHashMap2 = rw70Var2.w;
                    Event event2 = event;
                    event2.update(str3);
                    if (!b3.I(event2.status, event2.estimateStartTime)) {
                        GroupTopic groupTopic4 = groupTopic;
                        if (linkedHashMap2.containsKey(groupTopic4)) {
                            cw70.i.clear();
                            SocketPushManager socketPushManager = SocketPushManager.getInstance();
                            socketPushManager.unsubscribeTopic(groupTopic4, (Subscriber) linkedHashMap2.get(groupTopic4));
                            GroupTopic groupTopic5 = groupTopic2;
                            ow70 ow70Var = r6;
                            socketPushManager.unsubscribeTopic(groupTopic5, ow70Var);
                            socketPushManager.unsubscribeTopic(groupTopic3, ow70Var);
                        }
                    }
                    rw70Var2.c.a(event2);
                }
            });
            i = i2;
        }
        rw70Var.z1();
        return Unit.a;
    }
}
