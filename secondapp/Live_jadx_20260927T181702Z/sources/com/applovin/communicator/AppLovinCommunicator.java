package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import fw.b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f26324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f26325f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f26326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f26327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5 f26328c = new h5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f26329d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(l.p());
    }

    public void a(l lVar) {
        this.f26326a = lVar;
        this.f26327b = lVar.Q();
        a("Attached SDK instance: " + lVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f26329d;
    }

    public boolean hasSubscriber(String str) {
        return this.f26328c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f26326a.u().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f26326a + b.f85383j;
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f26325f) {
            try {
                if (f26324e == null) {
                    f26324e = new AppLovinCommunicator();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f26324e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f26328c.a(appLovinCommunicatorSubscriber, str)) {
                this.f26329d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f26328c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f26327b == null || !p.a()) {
            return;
        }
        this.f26327b.a("AppLovinCommunicator", str);
    }
}
