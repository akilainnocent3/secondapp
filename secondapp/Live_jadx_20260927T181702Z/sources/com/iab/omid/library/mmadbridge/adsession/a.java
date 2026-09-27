package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f53531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f53532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f53533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f53534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f53535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f53541k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f53539i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f53540j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f53537g) {
            return;
        }
        this.f53533c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f53534d.get();
    }

    public List<e> d() {
        return this.f53533c.a();
    }

    public boolean e() {
        return this.f53541k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f53537g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f53536f && !this.f53537g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f53537g) {
            return;
        }
        this.f53534d.clear();
        removeAllFriendlyObstructions();
        this.f53537g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f53535e = null;
        this.f53541k = null;
    }

    public boolean g() {
        return this.f53537g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f53538h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f53535e;
    }

    public boolean h() {
        return this.f53532b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f53532b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f53536f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f53539i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f53540j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f53537g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f53537g) {
            return;
        }
        this.f53533c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f53537g) {
            return;
        }
        this.f53533c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f53541k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f53536f) {
            return;
        }
        this.f53536f = true;
        c.c().c(this);
        this.f53535e.a(i.c().b());
        this.f53535e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f53535e.a(this, this.f53531a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f53533c = new f();
        this.f53536f = false;
        this.f53537g = false;
        this.f53532b = adSessionConfiguration;
        this.f53531a = adSessionContext;
        this.f53538h = str;
        b(null);
        this.f53535e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f53535e.i();
        c.c().a(this);
        this.f53535e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f53534d.clear();
            }
        }
    }

    private void b(View view) {
        this.f53534d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f53541k.onPossibleObstructionsDetected(this.f53538h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f53540j = true;
    }
}
