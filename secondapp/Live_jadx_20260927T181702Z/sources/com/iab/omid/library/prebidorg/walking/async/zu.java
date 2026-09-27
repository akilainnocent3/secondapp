package com.iab.omid.library.prebidorg.walking.async;

import com.iab.omid.library.prebidorg.adsession.zf;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zu extends zz {
    public zu(zr.InterfaceC0523zr interfaceC0523zr, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0523zr, hashSet, jSONObject, j10);
    }

    private void zr(String str) {
        com.iab.omid.library.prebidorg.internal.zs zsVarZs = com.iab.omid.library.prebidorg.internal.zs.zs();
        if (zsVarZs != null) {
            for (zf zfVar : zsVarZs.zr()) {
                if (this.f53780zs.contains(zfVar.zb())) {
                    zfVar.zc().zz(str, this.f53782zu);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zz, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f53781zt.toString();
    }

    @Override // com.iab.omid.library.prebidorg.walking.async.zr, android.os.AsyncTask
    /* JADX INFO: renamed from: zz */
    public void onPostExecute(String str) {
        zr(str);
        super.onPostExecute(str);
    }
}
