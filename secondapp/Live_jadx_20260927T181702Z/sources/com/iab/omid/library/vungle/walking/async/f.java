package com.iab.omid.library.vungle.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0539b interfaceC0539b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0539b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.b()) {
                if (this.f54232c.contains(aVar.c())) {
                    aVar.d().b(str, this.f54234e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.vungle.utils.c.h(this.f54233d, this.f54236b.a())) {
            return null;
        }
        this.f54236b.a(this.f54233d);
        return this.f54233d.toString();
    }

    @Override // com.iab.omid.library.vungle.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
