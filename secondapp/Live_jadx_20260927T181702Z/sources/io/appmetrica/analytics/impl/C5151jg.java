package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5151jg implements Pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f97632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f97633b;

    public C5151jg(@oy.l Context context, @oy.l ICommonExecutor iCommonExecutor) {
        this.f97632a = iCommonExecutor;
        this.f97633b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC5402tg interfaceC5402tg, Throwable th2) {
        interfaceC5402tg.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@oy.l InterfaceC5402tg interfaceC5402tg) throws Throwable {
        this.f97633b.startConnection(new C5125ig(this, interfaceC5402tg));
    }

    public final void a(final InterfaceC5402tg interfaceC5402tg, final Throwable th2) {
        this.f97632a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.lq
            @Override // java.lang.Runnable
            public final void run() {
                C5151jg.b(interfaceC5402tg, th2);
            }
        });
    }
}
