package com.iab.omid.library.startio.adsession;

import android.view.View;
import com.iab.omid.library.startio.internal.c;
import com.iab.omid.library.startio.internal.f;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import com.iab.omid.library.startio.publisher.b;
import com.iab.omid.library.startio.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f53813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f53814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f53815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.a f53816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f53817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f53823k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f53821i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f53822j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f53819g) {
            return;
        }
        this.f53815c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f53820h;
    }

    public AdSessionStatePublisher d() {
        return this.f53817e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e() {
        return (View) this.f53816d.get();
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f53819g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List f() {
        return this.f53815c.a();
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void finish() {
        if (this.f53819g) {
            return;
        }
        this.f53816d.clear();
        removeAllFriendlyObstructions();
        this.f53819g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f53817e = null;
        this.f53823k = null;
    }

    public boolean g() {
        return this.f53823k != null;
    }

    public boolean h() {
        return this.f53818f && !this.f53819g;
    }

    public boolean i() {
        return this.f53819g;
    }

    public boolean j() {
        return this.f53814b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f53814b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f53818f;
    }

    public void m() {
        a();
        d().g();
        this.f53821i = true;
    }

    public void n() {
        b();
        d().h();
        this.f53822j = true;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f53819g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f53819g) {
            return;
        }
        this.f53815c.b();
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f53819g) {
            return;
        }
        this.f53815c.c(view);
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f53823k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void start() {
        if (this.f53818f || this.f53817e == null) {
            return;
        }
        this.f53818f = true;
        c.c().c(this);
        this.f53817e.a(i.c().b());
        this.f53817e.a(com.iab.omid.library.startio.internal.a.a().b());
        this.f53817e.b(com.iab.omid.library.startio.attestation.c.a(com.iab.omid.library.startio.internal.g.b().a()).a());
        this.f53817e.a(this, this.f53813a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f53815c = new f();
        this.f53818f = false;
        this.f53819g = false;
        this.f53814b = adSessionConfiguration;
        this.f53813a = adSessionContext;
        this.f53820h = str;
        b(null);
        this.f53817e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.startio.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f53817e.i();
        c.c().a(this);
        this.f53817e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f53816d.clear();
            }
        }
    }

    private void b(View view) {
        this.f53816d = new com.iab.omid.library.startio.weakreference.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(List list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((com.iab.omid.library.startio.weakreference.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f53823k.onPossibleObstructionsDetected(this.f53820h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().b(jSONObject);
        this.f53822j = true;
    }
}
