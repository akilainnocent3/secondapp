package zc;

import cd.d;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad.a f160976c;

    public a(ad.a aVar) {
        this.f160976c = aVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f160976c.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e10) {
            cd.b.a(d.ONE_DT_GENERAL_ERROR, e10);
            gd.b.b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e10.toString());
            string = null;
        }
        this.f160976c.c(string);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
