package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5125ig implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5151jg f97584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5402tg f97585b;

    public C5125ig(C5151jg c5151jg, InterfaceC5402tg interfaceC5402tg) {
        this.f97584a = c5151jg;
        this.f97585b = interfaceC5402tg;
    }

    public static final void a(C5151jg c5151jg, InterfaceC5402tg interfaceC5402tg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c5151jg.f97633b.getInstallReferrer();
                interfaceC5402tg.a(new C5278og(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC5253ng.f97979c));
                installReferrerClient = c5151jg.f97633b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th2) {
            try {
                interfaceC5402tg.a(th2);
                installReferrerClient = c5151jg.f97633b;
            } catch (Throwable th3) {
                try {
                    c5151jg.f97633b.endConnection();
                    throw th3;
                } catch (Throwable unused2) {
                    throw th3;
                }
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (i10 == 0) {
            final C5151jg c5151jg = this.f97584a;
            ICommonExecutor iCommonExecutor = c5151jg.f97632a;
            final InterfaceC5402tg interfaceC5402tg = this.f97585b;
            iCommonExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.jq
                @Override // java.lang.Runnable
                public final void run() {
                    C5125ig.a(c5151jg, interfaceC5402tg);
                }
            });
            return;
        }
        this.f97584a.a(this.f97585b, new IllegalStateException("Referrer check failed with error " + i10));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
