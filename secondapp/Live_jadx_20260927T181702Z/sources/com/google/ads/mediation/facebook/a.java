package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f48148e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48149b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48150c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f48151d = new ArrayList();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0437a {
        void a(AdError adError);

        void zz();
    }

    public static a a() {
        if (f48148e == null) {
            f48148e = new a();
        }
        return f48148e;
    }

    public void b(Context context, ArrayList arrayList, InterfaceC0437a interfaceC0437a) {
        if (this.f48149b) {
            this.f48151d.add(interfaceC0437a);
        } else {
            if (this.f48150c) {
                interfaceC0437a.zz();
                return;
            }
            this.f48149b = true;
            a().f48151d.add(interfaceC0437a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f48149b = false;
        this.f48150c = initResult.isSuccess();
        for (InterfaceC0437a interfaceC0437a : this.f48151d) {
            if (initResult.isSuccess()) {
                interfaceC0437a.zz();
            } else {
                interfaceC0437a.a(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        this.f48151d.clear();
    }
}
