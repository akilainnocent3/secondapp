package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f95956a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PublicLogger f95957b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f95957b;
            if (publicLogger == null) {
                this.f95956a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
