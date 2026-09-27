package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f53518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0516b f53519b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0516b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0516b interfaceC0516b) {
        this.f53519b = interfaceC0516b;
    }

    public void a(a aVar) {
        this.f53518a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f53518a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
