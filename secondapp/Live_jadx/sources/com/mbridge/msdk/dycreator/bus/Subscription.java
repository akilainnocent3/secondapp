package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f66487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f66488b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f66487a = obj;
        this.f66488b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f66487a == subscription.f66487a && this.f66488b.equals(subscription.f66488b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f66487a.hashCode() + this.f66488b.f66484d.hashCode();
    }
}
