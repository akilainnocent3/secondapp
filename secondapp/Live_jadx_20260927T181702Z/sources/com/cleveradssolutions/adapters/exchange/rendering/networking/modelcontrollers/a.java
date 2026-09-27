package com.cleveradssolutions.adapters.exchange.rendering.networking.modelcontrollers;

import android.os.AsyncTask;
import com.cleveradssolutions.adapters.exchange.rendering.networking.c;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AsyncTask f42417a;

    public void a() {
        AsyncTask asyncTask = this.f42417a;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
    }

    public void b(String str, com.cleveradssolutions.adapters.exchange.rendering.networking.a aVar) {
        a();
        c cVar = new c(aVar);
        c.b bVarR = j.r(str);
        bVarR.f42414d = l.c();
        if (str != null) {
            bVarR.f42415e = "GET";
            bVarR.f42413c = "videorequest";
        }
        this.f42417a = cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, bVarR);
    }
}
