package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f66475d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f66476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f66477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f66478c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f66476a = obj;
        this.f66477b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f66475d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f66476a = obj;
                pendingPostRemove.f66477b = subscription;
                pendingPostRemove.f66478c = null;
                return pendingPostRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f66476a = null;
        pendingPost.f66477b = null;
        pendingPost.f66478c = null;
        List<PendingPost> list = f66475d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
