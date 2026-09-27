package vd;

import android.app.Activity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends e implements ud.j, InneractiveFullscreenAdEventsListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud.b<ud.j<ud.k>> f140936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InneractiveFullscreenUnitController f140937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ud.k f140938j;

    public o(String str, JSONObject jSONObject, Map<String, String> map, boolean z10, ud.b<ud.j<ud.k>> bVar, ud.d dVar) {
        super(str, jSONObject, map, z10, dVar);
        this.f140936h = bVar;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.f140937i = inneractiveFullscreenUnitController;
        inneractiveFullscreenUnitController.setEventsListener(this);
    }

    @Override // ud.j
    public void c(Activity activity, ud.k kVar) {
        if (this.f140937i == null) {
            if (kVar != null) {
                kVar.c(ud.c.GENERIC_SHOW_ERROR);
            }
        } else {
            this.f140938j = kVar;
            if (this.f140885c.isReady()) {
                this.f140937i.show(activity);
            } else {
                kVar.c(ud.c.EXPIRED_AD_ERROR);
            }
        }
    }

    @Override // ud.j
    public boolean d() {
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.f140937i;
        return inneractiveFullscreenUnitController != null && inneractiveFullscreenUnitController.isAvailable();
    }

    @Override // ud.i
    public void destroy() {
        InneractiveAdSpot adSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.f140937i;
        if (inneractiveFullscreenUnitController == null || (adSpot = inneractiveFullscreenUnitController.getAdSpot()) == null) {
            return;
        }
        adSpot.destroy();
    }

    @Override // vd.e
    public void j(e eVar, k kVar) {
        if (this.f140937i != null && kVar != null) {
            InneractiveAdSpotManager.get().bindSpot(kVar);
            this.f140937i.setAdSpot(kVar);
        }
        ud.b<ud.j<ud.k>> bVar = this.f140936h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // vd.e
    public boolean k() {
        return true;
    }

    @Override // ud.i
    public void load() {
        m(this.f140937i, this.f140936h);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        ud.k kVar = this.f140938j;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        ud.k kVar = this.f140938j;
        if (kVar != null) {
            kVar.onClose();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        ud.k kVar = this.f140938j;
        if (kVar != null) {
            kVar.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }
}
