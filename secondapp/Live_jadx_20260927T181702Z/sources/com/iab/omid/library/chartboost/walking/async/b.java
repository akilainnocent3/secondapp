package com.iab.omid.library.chartboost.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f53107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0503b f53108b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0503b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0503b interfaceC0503b) {
        this.f53108b = interfaceC0503b;
    }

    public void a(a aVar) {
        this.f53107a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f53107a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
