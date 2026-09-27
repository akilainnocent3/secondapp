package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f52594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f52595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f52596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f52597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f52598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f52599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f52601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f52604k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f52602i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f52603j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f52600g) {
            return;
        }
        this.f52596c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f52601h;
    }

    public AdSessionStatePublisher d() {
        return this.f52598e;
    }

    public View e() {
        return this.f52597d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f52600g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f52596c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f52600g) {
            return;
        }
        this.f52597d.clear();
        removeAllFriendlyObstructions();
        this.f52600g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f52598e = null;
        this.f52604k = null;
    }

    public boolean g() {
        return this.f52604k != null;
    }

    public boolean h() {
        return this.f52599f && !this.f52600g;
    }

    public boolean i() {
        return this.f52600g;
    }

    public boolean j() {
        return this.f52595b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f52595b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f52599f;
    }

    public void m() {
        a();
        d().g();
        this.f52602i = true;
    }

    public void n() {
        b();
        d().h();
        this.f52603j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f52600g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f52600g) {
            return;
        }
        this.f52596c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f52600g) {
            return;
        }
        this.f52596c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f52604k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f52599f || this.f52598e == null) {
            return;
        }
        this.f52599f = true;
        c.c().c(this);
        this.f52598e.a(i.c().b());
        this.f52598e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f52598e.a(this, this.f52594a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f52596c = new f();
        this.f52599f = false;
        this.f52600g = false;
        this.f52595b = adSessionConfiguration;
        this.f52594a = adSessionContext;
        this.f52601h = str;
        b(null);
        this.f52598e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f52598e.i();
        c.c().a(this);
        this.f52598e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f52597d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f52597d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f52604k.onPossibleObstructionsDetected(this.f52601h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f52603j = true;
    }
}
