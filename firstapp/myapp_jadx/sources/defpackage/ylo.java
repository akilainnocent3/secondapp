package defpackage;

import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class ylo {
    public final ConcurrentHashMap<zlo, ConcurrentHashMap<amo, Subscriber>> a = new ConcurrentHashMap<>();

    public final void a(zlo zloVar, amo amoVar) {
        Topic multiTopic;
        if (zloVar instanceof zlo.a) {
            multiTopic = new GroupTopic(((zlo.a) zloVar).a);
        } else if (!(zloVar instanceof zlo.b)) {
            uhc.a();
            return;
        } else {
            zlo.b bVar = (zlo.b) zloVar;
            multiTopic = new MultiTopic(bVar.a, bVar.b);
        }
        final ulo uloVar = new ulo();
        ConcurrentHashMap<amo, Subscriber> concurrentHashMapComputeIfAbsent = this.a.computeIfAbsent(zloVar, new Function() { // from class: vlo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ConcurrentHashMap) uloVar.invoke(obj);
            }
        });
        concurrentHashMapComputeIfAbsent.getClass();
        final mcj mcjVar = new mcj(amoVar, 1);
        Subscriber subscriberComputeIfAbsent = concurrentHashMapComputeIfAbsent.computeIfAbsent(amoVar, new Function() { // from class: wlo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Subscriber) mcjVar.invoke(obj);
            }
        });
        subscriberComputeIfAbsent.getClass();
        SocketPushManager.getInstance().subscribeTopic(multiTopic, subscriberComputeIfAbsent);
    }

    public final void b(zlo zloVar, amo amoVar) {
        Topic multiTopic;
        Subscriber subscriberRemove;
        if (zloVar instanceof zlo.a) {
            multiTopic = new GroupTopic(((zlo.a) zloVar).a);
        } else if (!(zloVar instanceof zlo.b)) {
            uhc.a();
            return;
        } else {
            zlo.b bVar = (zlo.b) zloVar;
            multiTopic = new MultiTopic(bVar.a, bVar.b);
        }
        ConcurrentHashMap<zlo, ConcurrentHashMap<amo, Subscriber>> concurrentHashMap = this.a;
        ConcurrentHashMap<amo, Subscriber> concurrentHashMap2 = concurrentHashMap.get(zloVar);
        if (concurrentHashMap2 == null || (subscriberRemove = concurrentHashMap2.remove(amoVar)) == null) {
            return;
        }
        SocketPushManager.getInstance().unsubscribeTopic(multiTopic, subscriberRemove);
        if (concurrentHashMap2.isEmpty()) {
            concurrentHashMap.remove(zloVar, concurrentHashMap2);
        }
    }
}
