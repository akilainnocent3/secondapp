package com.iab.omid.library.bigosg.adsession;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.iab.omid.library.bigosg.b.c;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bigosg.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f52734a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f52735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f52736c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.e.a f52738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f52739f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52744k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f52737d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52740g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52741h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f52742i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f52736c = adSessionConfiguration;
        this.f52735b = adSessionContext;
        c(null);
        this.f52739f = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new com.iab.omid.library.bigosg.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f52739f.a();
        com.iab.omid.library.bigosg.b.a.a().a(this);
        this.f52739f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f52737d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void j() {
        if (this.f52743j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f52744k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
    }

    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f52743j = true;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f52744k = true;
    }

    public View d() {
        return this.f52738e.get();
    }

    public boolean e() {
        return this.f52740g && !this.f52741h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f52741h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f52740g;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void finish() {
        if (this.f52741h) {
            return;
        }
        this.f52738e.clear();
        removeAllFriendlyObstructions();
        this.f52741h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.bigosg.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f52739f = null;
    }

    public boolean g() {
        return this.f52741h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public String getAdSessionId() {
        return this.f52742i;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f52739f;
    }

    public boolean h() {
        return this.f52736c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f52736c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f52741h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f52741h) {
            return;
        }
        this.f52737d.clear();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f52741h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f52737d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void start() {
        if (this.f52740g) {
            return;
        }
        this.f52740g = true;
        com.iab.omid.library.bigosg.b.a.a().b(this);
        this.f52739f.a(f.a().d());
        this.f52739f.a(this, this.f52735b);
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f52738e = new com.iab.omid.library.bigosg.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.bigosg.b.a.a().b();
        if (collectionB == null || collectionB.size() <= 0) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f52738e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f52737d;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f52741h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f52737d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f52734a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f52744k = true;
    }
}
