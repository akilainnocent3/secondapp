package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.internal.c;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import com.iab.omid.library.inmobi.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f53255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f53256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f53257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.a f53258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f53259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f53265k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f53263i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f53264j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f53261g) {
            return;
        }
        this.f53257c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f53262h;
    }

    public AdSessionStatePublisher d() {
        return this.f53259e;
    }

    public View e() {
        return this.f53258d.get();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f53261g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f53257c.a();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f53261g) {
            return;
        }
        this.f53258d.clear();
        removeAllFriendlyObstructions();
        this.f53261g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f53259e = null;
        this.f53265k = null;
    }

    public boolean g() {
        return this.f53265k != null;
    }

    public boolean h() {
        return this.f53260f && !this.f53261g;
    }

    public boolean i() {
        return this.f53261g;
    }

    public boolean j() {
        return this.f53256b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f53256b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f53260f;
    }

    public void m() {
        a();
        d().g();
        this.f53263i = true;
    }

    public void n() {
        b();
        d().h();
        this.f53264j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f53261g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f53261g) {
            return;
        }
        this.f53257c.b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f53261g) {
            return;
        }
        this.f53257c.c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f53265k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f53260f || this.f53259e == null) {
            return;
        }
        this.f53260f = true;
        c.c().c(this);
        this.f53259e.a(i.c().b());
        this.f53259e.a(com.iab.omid.library.inmobi.internal.a.a().b());
        this.f53259e.a(this, this.f53255a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f53257c = new f();
        this.f53260f = false;
        this.f53261g = false;
        this.f53256b = adSessionConfiguration;
        this.f53255a = adSessionContext;
        this.f53262h = str;
        b(null);
        this.f53259e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f53259e.i();
        c.c().a(this);
        this.f53259e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f53258d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f53258d = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.inmobi.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.inmobi.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f53265k.onPossibleObstructionsDetected(this.f53262h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f53264j = true;
    }
}
