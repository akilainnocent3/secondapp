package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f66479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f66480b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f66480b;
            if (pendingPost2 != null) {
                pendingPost2.f66478c = pendingPost;
                this.f66480b = pendingPost;
            } else {
                if (this.f66479a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f66480b = pendingPost;
                this.f66479a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f66479a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f66478c;
            this.f66479a = pendingPost2;
            if (pendingPost2 == null) {
                this.f66480b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f66479a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a();
    }
}
