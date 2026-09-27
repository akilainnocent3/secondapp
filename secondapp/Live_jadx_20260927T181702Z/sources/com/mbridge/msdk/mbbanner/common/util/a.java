package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f67832c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f67833a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f67834b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0648a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f67835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f67836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f67837c;

        public RunnableC0648a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f67835a = bVar;
            this.f67836b = str;
            this.f67837c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f67835a;
            if (bVar != null) {
                bVar.a(this.f67836b, this.f67837c, a.this.f67834b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f67839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f67840b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f67839a = bVar;
            this.f67840b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f67839a != null) {
                this.f67840b.a(a.this.f67834b);
                this.f67839a.a(this.f67840b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f67842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f67843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f67844c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f67842a = bVar;
            this.f67843b = str;
            this.f67844c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f67842a;
            if (bVar != null) {
                bVar.a(this.f67843b, this.f67844c, a.this.f67834b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f67846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f67847b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f67846a = bVar;
            this.f67847b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f67846a != null) {
                this.f67847b.a(a.this.f67834b);
                this.f67846a.b(this.f67847b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f67832c, "postResourceFail unitId=" + bVar2);
        this.f67833a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f67834b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f67832c, "postCampaignSuccess unitId=" + str);
        this.f67833a.post(new RunnableC0648a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f67833a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f67832c, "postResourceSuccess unitId=" + str);
        this.f67833a.post(new c(bVar, str, i10));
    }
}
