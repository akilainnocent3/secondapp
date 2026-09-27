package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f52716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0491b f52717b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0491b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0491b interfaceC0491b) {
        this.f52717b = interfaceC0491b;
    }

    public void a(a aVar) {
        this.f52716a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f52716a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
