package com.iab.omid.library.prebidorg.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zr extends AsyncTask {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    protected final InterfaceC0523zr f53776zr;
    private zz zz;

    /* JADX INFO: renamed from: com.iab.omid.library.prebidorg.walking.async.zr$zr, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0523zr {
        JSONObject zz();

        void zz(JSONObject jSONObject);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface zz {
        void zz(zr zrVar);
    }

    public zr(InterfaceC0523zr interfaceC0523zr) {
        this.f53776zr = interfaceC0523zr;
    }

    public void zz(zz zzVar) {
        this.zz = zzVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zz, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zz zzVar = this.zz;
        if (zzVar != null) {
            zzVar.zz(this);
        }
    }

    public void zz(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
