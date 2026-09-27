package com.iab.omid.library.chartboost.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class e extends a {
    public e(b.InterfaceC0503b interfaceC0503b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0503b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.chartboost.internal.c cVarC = com.iab.omid.library.chartboost.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.chartboost.adsession.a aVar : cVarC.b()) {
                if (this.f53104c.contains(aVar.c())) {
                    aVar.d().a(str, this.f53106e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f53105d.toString();
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
