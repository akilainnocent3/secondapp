package com.iab.omid.library.fyber.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0507b interfaceC0507b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0507b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.b()) {
                if (this.f53239c.contains(aVar.c())) {
                    aVar.d().b(str, this.f53241e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.fyber.utils.c.h(this.f53240d, this.f53243b.a())) {
            return null;
        }
        this.f53243b.a(this.f53240d);
        return this.f53240d.toString();
    }

    @Override // com.iab.omid.library.fyber.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
