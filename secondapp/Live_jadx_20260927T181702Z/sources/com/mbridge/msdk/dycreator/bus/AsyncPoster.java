package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f66446a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f66447b;

    public AsyncPoster(EventBus eventBus) {
        this.f66447b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f66446a.a(PendingPost.a(subscription, obj));
        EventBus.f66451n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f66446a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f66447b.a(pendingPostA);
    }
}
