package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f53396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f53397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f53398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f53399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f53400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f53406k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f53404i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f53405j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f53402g) {
            return;
        }
        this.f53398c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f53399d.get();
    }

    public List<e> d() {
        return this.f53398c.a();
    }

    public boolean e() {
        return this.f53406k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f53402g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f53401f && !this.f53402g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f53402g) {
            return;
        }
        this.f53399d.clear();
        removeAllFriendlyObstructions();
        this.f53402g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f53400e = null;
        this.f53406k = null;
    }

    public boolean g() {
        return this.f53402g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f53403h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f53400e;
    }

    public boolean h() {
        return this.f53397b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f53397b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f53401f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f53404i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f53405j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f53402g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f53402g) {
            return;
        }
        this.f53398c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f53402g) {
            return;
        }
        this.f53398c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f53406k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f53401f || this.f53400e == null) {
            return;
        }
        this.f53401f = true;
        c.c().c(this);
        this.f53400e.a(i.c().b());
        this.f53400e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f53400e.a(this, this.f53396a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f53398c = new f();
        this.f53401f = false;
        this.f53402g = false;
        this.f53397b = adSessionConfiguration;
        this.f53396a = adSessionContext;
        this.f53403h = str;
        b(null);
        this.f53400e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f53400e.i();
        c.c().a(this);
        this.f53400e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f53399d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f53399d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f53406k.onPossibleObstructionsDetected(this.f53403h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f53405j = true;
    }
}
