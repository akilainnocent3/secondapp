package com.iab.omid.library.chartboost.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.chartboost.internal.c;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.internal.f;
import com.iab.omid.library.chartboost.internal.i;
import com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher;
import com.iab.omid.library.chartboost.publisher.b;
import com.iab.omid.library.chartboost.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f52979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f52980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f52981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.chartboost.weakreference.a f52982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f52983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f52984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f52986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f52989k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f52987i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f52988j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f52985g) {
            return;
        }
        this.f52981c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f52986h;
    }

    public AdSessionStatePublisher d() {
        return this.f52983e;
    }

    public View e() {
        return this.f52982d.get();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f52985g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f52981c.a();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void finish() {
        if (this.f52985g) {
            return;
        }
        this.f52982d.clear();
        removeAllFriendlyObstructions();
        this.f52985g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f52983e = null;
        this.f52989k = null;
    }

    public boolean g() {
        return this.f52989k != null;
    }

    public boolean h() {
        return this.f52984f && !this.f52985g;
    }

    public boolean i() {
        return this.f52985g;
    }

    public boolean j() {
        return this.f52980b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f52980b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f52984f;
    }

    public void m() {
        a();
        d().g();
        this.f52987i = true;
    }

    public void n() {
        b();
        d().h();
        this.f52988j = true;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f52985g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f52985g) {
            return;
        }
        this.f52981c.b();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f52985g) {
            return;
        }
        this.f52981c.c(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f52989k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void start() {
        if (this.f52984f || this.f52983e == null) {
            return;
        }
        this.f52984f = true;
        c.c().c(this);
        this.f52983e.a(i.c().b());
        this.f52983e.a(com.iab.omid.library.chartboost.internal.a.a().b());
        this.f52983e.a(this, this.f52979a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f52981c = new f();
        this.f52984f = false;
        this.f52985g = false;
        this.f52980b = adSessionConfiguration;
        this.f52979a = adSessionContext;
        this.f52986h = str;
        b(null);
        this.f52983e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.chartboost.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f52983e.i();
        c.c().a(this);
        this.f52983e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f52982d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f52982d = new com.iab.omid.library.chartboost.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.chartboost.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.chartboost.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f52989k.onPossibleObstructionsDetected(this.f52986h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f52988j = true;
    }
}
