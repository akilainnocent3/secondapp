package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4931b2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f96991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f96992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f96993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f96994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4905a2 f96995f;

    @k.h1
    public C4931b2(@oy.l Context context, @oy.l IAppSetIdRetriever iAppSetIdRetriever) {
        this.f96990a = context;
        this.f96991b = iAppSetIdRetriever;
        this.f96993d = new CountDownLatch(1);
        this.f96994e = 20L;
        this.f96995f = new C4905a2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @k.i1
    @oy.l
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f96992c == null) {
            try {
                this.f96993d = new CountDownLatch(1);
                this.f96991b.retrieveAppSetId(this.f96990a, this.f96995f);
                this.f96993d.await(this.f96994e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f96992c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f96992c = appSetId;
        }
        return appSetId;
    }

    public C4931b2(@oy.l Context context) {
        this(context, AbstractC4957c2.a());
    }
}
