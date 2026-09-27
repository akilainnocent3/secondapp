package com.iab.omid.library.startio.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class e extends a {
    public e(b.InterfaceC0530b interfaceC0530b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0530b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.b()) {
                if (this.f53962c.contains(aVar.c())) {
                    aVar.d().a(str, this.f53964e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f53963d.toString();
    }

    @Override // com.iab.omid.library.startio.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
