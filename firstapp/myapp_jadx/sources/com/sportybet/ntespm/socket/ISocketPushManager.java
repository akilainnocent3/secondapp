package com.sportybet.ntespm.socket;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.zkh;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H&J\u001c\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J$\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\nH&J\u001c\u0010\u001a\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0002\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001f\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0012\u0010 \u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"2\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/sportybet/ntespm/socket/ISocketPushManager;", "", "init", "", "productCode", "", "token", "", "deviceId", "isConnected", "", "()Z", AnalyticsParam.EVENT_STATUS, "getStatus", "()I", "addOnSubscribedListener", "listener", "Lcom/sportybet/ntespm/socket/OnSubscribedListener;", "addOnUnsubscribedListener", "Lcom/sportybet/ntespm/socket/OnUnsubscribedListener;", "subscribeTopic", "topic", "Lcom/sportybet/ntespm/socket/Topic;", "subscriber", "Lcom/sportybet/ntespm/socket/Subscriber;", "forceSubscribe", "unsubscribeTopic", "getLastConnectedTimestamp", "", "()Ljava/lang/Long;", "getLastDisconnectedTimestamp", "isTopicSubscribed", "isTopicActive", "getSubscribedTopics", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ISocketPushManager {

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean isTopicSubscribed$default(ISocketPushManager iSocketPushManager, Topic topic, Subscriber subscriber, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: isTopicSubscribed");
            return false;
        }
        if ((i & 2) != 0) {
            subscriber = null;
        }
        return iSocketPushManager.isTopicSubscribed(topic, subscriber);
    }

    void addOnSubscribedListener(OnSubscribedListener listener);

    void addOnUnsubscribedListener(OnUnsubscribedListener listener);

    Long getLastConnectedTimestamp();

    Long getLastDisconnectedTimestamp();

    int getStatus();

    Set<Topic> getSubscribedTopics(Subscriber subscriber);

    void init(int productCode, String token, String deviceId);

    boolean isConnected();

    boolean isTopicActive(Topic topic);

    boolean isTopicSubscribed(Topic topic, Subscriber subscriber);

    void subscribeTopic(Topic topic, Subscriber subscriber);

    void subscribeTopic(Topic topic, Subscriber subscriber, boolean forceSubscribe);

    void unsubscribeTopic(Topic topic, Subscriber subscriber);
}
