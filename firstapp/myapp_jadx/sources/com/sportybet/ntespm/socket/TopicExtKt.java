package com.sportybet.ntespm.socket;

import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a.\u0010\u000b\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n\u001a.\u0010\u000e\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u000f\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"subRequest", "", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/sportybet/ntespm/socket/TopicSubscription;", "Lcom/sportybet/ntespm/socket/TopicSubscriptionStatus;", "topic", "Lcom/sportybet/ntespm/socket/Topic;", "requestId", "", EventKeys.TIMESTAMP, "", "subAcknowledged", "isSuccess", "", "unSubRequest", "removeSubscription", "isTopicActive", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class TopicExtKt {
    public static final boolean isTopicActive(ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> concurrentHashMap, Topic topic) {
        concurrentHashMap.getClass();
        topic.getClass();
        TopicSubscriptionStatus topicSubscriptionStatus = concurrentHashMap.get(TopicSubscription.INSTANCE.from(topic));
        return (topicSubscriptionStatus != null ? topicSubscriptionStatus.getState() : null) == TopicSubscriptionState.SUBSCRIBED;
    }

    public static final void removeSubscription(ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> concurrentHashMap, Topic topic) {
        concurrentHashMap.getClass();
        topic.getClass();
        concurrentHashMap.remove(TopicSubscription.INSTANCE.from(topic));
    }

    public static final void subAcknowledged(ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> concurrentHashMap, int i, boolean z, long j) {
        Object next;
        TopicSubscriptionState topicSubscriptionState;
        TopicSubscriptionState topicSubscriptionState2;
        Object value;
        concurrentHashMap.getClass();
        Set<Map.Entry<TopicSubscription, TopicSubscriptionStatus>> setEntrySet = concurrentHashMap.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            entry.getClass();
            value = entry.getValue();
            value.getClass();
        } while (((TopicSubscriptionStatus) value).getRequestId() != i);
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null) {
            return;
        }
        Object key = entry2.getKey();
        key.getClass();
        TopicSubscription topicSubscription = (TopicSubscription) key;
        Object value2 = entry2.getValue();
        value2.getClass();
        TopicSubscriptionStatus topicSubscriptionStatus = (TopicSubscriptionStatus) value2;
        if (z && topicSubscriptionStatus.getState() == TopicSubscriptionState.SUBSCRIBING) {
            topicSubscriptionState = TopicSubscriptionState.SUBSCRIBED;
        } else {
            if ((!z || topicSubscriptionStatus.getState() != TopicSubscriptionState.UNSUBSCRIBING) && !z) {
                TopicSubscriptionState previousState = topicSubscriptionStatus.getPreviousState();
                TopicSubscriptionState topicSubscriptionState3 = TopicSubscriptionState.SUBSCRIBED;
                if (previousState == topicSubscriptionState3) {
                    topicSubscriptionState2 = topicSubscriptionState3;
                }
                concurrentHashMap.put(topicSubscription, TopicSubscriptionStatus.copy$default(topicSubscriptionStatus, topicSubscriptionState2, 0, j, topicSubscriptionState2, 2, null));
            }
            topicSubscriptionState = TopicSubscriptionState.NOT_SUBSCRIBED;
        }
        topicSubscriptionState2 = topicSubscriptionState;
        concurrentHashMap.put(topicSubscription, TopicSubscriptionStatus.copy$default(topicSubscriptionStatus, topicSubscriptionState2, 0, j, topicSubscriptionState2, 2, null));
    }

    public static final void subRequest(ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> concurrentHashMap, Topic topic, int i, long j) {
        TopicSubscriptionState state;
        concurrentHashMap.getClass();
        topic.getClass();
        TopicSubscription topicSubscriptionFrom = TopicSubscription.INSTANCE.from(topic);
        TopicSubscriptionStatus topicSubscriptionStatus = concurrentHashMap.get(topicSubscriptionFrom);
        if (topicSubscriptionStatus == null || (state = topicSubscriptionStatus.getState()) == null) {
            state = TopicSubscriptionState.NOT_SUBSCRIBED;
        }
        concurrentHashMap.put(topicSubscriptionFrom, new TopicSubscriptionStatus(TopicSubscriptionState.SUBSCRIBING, i, j, state));
    }

    public static final void unSubRequest(ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> concurrentHashMap, Topic topic, int i, long j) {
        TopicSubscriptionState state;
        concurrentHashMap.getClass();
        topic.getClass();
        TopicSubscription topicSubscriptionFrom = TopicSubscription.INSTANCE.from(topic);
        TopicSubscriptionStatus topicSubscriptionStatus = concurrentHashMap.get(topicSubscriptionFrom);
        if (topicSubscriptionStatus == null || (state = topicSubscriptionStatus.getState()) == null) {
            state = TopicSubscriptionState.NOT_SUBSCRIBED;
        }
        concurrentHashMap.put(topicSubscriptionFrom, new TopicSubscriptionStatus(TopicSubscriptionState.UNSUBSCRIBING, i, j, state));
    }
}
