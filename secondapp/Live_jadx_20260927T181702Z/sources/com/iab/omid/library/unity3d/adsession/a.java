package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f53979l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f53980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f53981b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.weakreference.a f53983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f53984e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f53987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f53990k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f53982c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53985f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53986g = false;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f53981b = adSessionConfiguration;
        this.f53980a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f53987h = string;
        d(null);
        this.f53984e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(string, adSessionContext.getWebView()) : new b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f53984e.i();
        c.c().a(this);
        this.f53984e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f53988i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f53982c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f53986g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f53982c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f53983d.get();
    }

    public List<e> d() {
        return this.f53982c;
    }

    public boolean e() {
        return this.f53990k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f53986g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f53985f && !this.f53986g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f53986g) {
            return;
        }
        this.f53983d.clear();
        removeAllFriendlyObstructions();
        this.f53986g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f53984e = null;
        this.f53990k = null;
    }

    public boolean g() {
        return this.f53986g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f53987h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f53984e;
    }

    public boolean h() {
        return this.f53981b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f53981b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f53985f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f53988i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f53989j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f53986g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f53986g) {
            return;
        }
        this.f53982c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f53986g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f53982c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f53990k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f53985f) {
            return;
        }
        this.f53985f = true;
        c.c().c(this);
        this.f53984e.a(h.c().b());
        this.f53984e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.f53984e.a(this, this.f53980a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f53989j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f53983d.clear();
            }
        }
    }

    private void d(View view) {
        this.f53983d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f53979l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.unity3d.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f53990k.onPossibleObstructionsDetected(this.f53987h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f53989j = true;
    }
}
