package com.sportybet.ntespm.socket;

import com.sporty.android.core.model.MyLog;
import defpackage.itf0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class SubscriberManager {
    private final Map<Topic, Set<Subscriber>> mSubscriberMap = new ConcurrentHashMap();

    public Collection<Collection<Subscriber>> getFlattenSubscriberSetOfTopic(Topic topic) {
        LinkedList linkedList = new LinkedList();
        if (topic != null) {
            for (Map.Entry<Topic, Set<Subscriber>> entry : this.mSubscriberMap.entrySet()) {
                if (entry.getKey().match(topic)) {
                    linkedList.add(entry.getValue());
                }
            }
        }
        return linkedList;
    }

    public Set<Topic> getSubscribedTopics(Subscriber subscriber) {
        if (subscriber == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<Topic, Set<Subscriber>> entry : this.mSubscriberMap.entrySet()) {
            Set<Subscriber> value = entry.getValue();
            if (value != null && value.contains(subscriber)) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public Set<Subscriber> getSubscriberSetOfTopic(Topic topic) {
        if (topic == null) {
            return Collections.EMPTY_SET;
        }
        for (Topic topic2 : this.mSubscriberMap.keySet()) {
            if (topic2.topic.equals(topic.getTopic()) && topic2.type == topic.getType()) {
                Set<Subscriber> set = this.mSubscriberMap.get(topic2);
                return set == null ? Collections.EMPTY_SET : set;
            }
        }
        return Collections.EMPTY_SET;
    }

    public Set<Topic> getTopicSet() {
        return this.mSubscriberMap.keySet();
    }

    public boolean hasNoSubscribersOfTopic(Topic topic) {
        return getSubscriberSetOfTopic(topic).isEmpty();
    }

    public boolean hasTopics() {
        return !this.mSubscriberMap.isEmpty();
    }

    public boolean isOnlyOneSubscriberOfTopic(Topic topic, Subscriber subscriber) {
        if (topic != null && subscriber != null) {
            Set<Subscriber> subscriberSetOfTopic = getSubscriberSetOfTopic(topic);
            if (subscriberSetOfTopic.size() == 1 && subscriberSetOfTopic.contains(subscriber)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTopicSubscribed(Topic topic, Subscriber subscriber) {
        if (topic == null || subscriber == null) {
            return false;
        }
        return getSubscriberSetOfTopic(topic).contains(subscriber);
    }

    public void subscribe(Topic topic, Subscriber subscriber) {
        if (topic == null || subscriber == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SOCKET);
        aVar.a("SubscriberManager subscribe, subscriber: " + subscriber.getClass().getName() + ", topic: " + topic, new Object[0]);
        synchronized (this.mSubscriberMap) {
            try {
                Set<Subscriber> setNewSetFromMap = this.mSubscriberMap.get(topic);
                if (setNewSetFromMap == null) {
                    setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                    this.mSubscriberMap.put(topic, setNewSetFromMap);
                }
                setNewSetFromMap.add(subscriber);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unsubscribe(Topic topic, Subscriber subscriber) {
        if (topic == null || subscriber == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SOCKET);
        aVar.a("SubscriberManager unsubscribe, subscriber: " + subscriber.getClass().getName() + ", topic: " + topic, new Object[0]);
        synchronized (this.mSubscriberMap) {
            try {
                Set<Subscriber> set = this.mSubscriberMap.get(topic);
                if (set != null) {
                    set.remove(subscriber);
                    if (set.isEmpty()) {
                        this.mSubscriberMap.remove(topic);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isTopicSubscribed(Topic topic) {
        if (topic == null) {
            return false;
        }
        return !getSubscriberSetOfTopic(topic).isEmpty();
    }
}
