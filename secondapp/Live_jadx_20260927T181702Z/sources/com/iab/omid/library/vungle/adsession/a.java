package com.iab.omid.library.vungle.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f54107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f54108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f54109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f54110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f54111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f54114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f54117k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f54115i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f54116j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f54113g) {
            return;
        }
        this.f54109c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f54114h;
    }

    public AdSessionStatePublisher d() {
        return this.f54111e;
    }

    public View e() {
        return this.f54110d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f54113g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f54109c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f54113g) {
            return;
        }
        this.f54110d.clear();
        removeAllFriendlyObstructions();
        this.f54113g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f54111e = null;
        this.f54117k = null;
    }

    public boolean g() {
        return this.f54117k != null;
    }

    public boolean h() {
        return this.f54112f && !this.f54113g;
    }

    public boolean i() {
        return this.f54113g;
    }

    public boolean j() {
        return this.f54108b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f54108b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f54112f;
    }

    public void m() {
        a();
        d().g();
        this.f54115i = true;
    }

    public void n() {
        b();
        d().h();
        this.f54116j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f54113g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f54113g) {
            return;
        }
        this.f54109c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f54113g) {
            return;
        }
        this.f54109c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f54117k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f54112f || this.f54111e == null) {
            return;
        }
        this.f54112f = true;
        c.c().c(this);
        this.f54111e.a(i.c().b());
        this.f54111e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f54111e.a(this, this.f54107a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f54109c = new f();
        this.f54112f = false;
        this.f54113g = false;
        this.f54108b = adSessionConfiguration;
        this.f54107a = adSessionContext;
        this.f54114h = str;
        b(null);
        this.f54111e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f54111e.i();
        c.c().a(this);
        this.f54111e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f54110d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f54110d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f54117k.onPossibleObstructionsDetected(this.f54114h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f54116j = true;
    }
}
