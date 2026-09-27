package com.cleveradssolutions.adapters.exchange.rendering.utils.url;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42546e = "zr";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f42547f = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f42548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f42549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42551d;

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.rendering.utils.url.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0429a implements com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f42553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f42554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f42555d;

        public C0429a(Context context, List list, boolean z10, String str) {
            this.f42552a = context;
            this.f42553b = list;
            this.f42554c = z10;
            this.f42555d = str;
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.b.a
        public void a(String str, Throwable th2) {
            a.this.f42551d = false;
            a.this.f42549b.b(this.f42555d);
            com.cleveradssolutions.adapters.exchange.b.i(a.f42546e, str, th2);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.b.a
        public void onSuccess(String str) {
            a.this.f42551d = false;
            a.this.h(this.f42552a, str, this.f42553b, this.f42554c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f42557a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f42558b = a.f42547f;

        public b a(com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.a aVar) {
            this.f42557a.add(aVar);
            return this;
        }

        public b b(com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.b bVar) {
            this.f42557a.add(bVar);
            return this;
        }

        public b c(com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.c cVar) {
            this.f42557a.add(cVar);
            return this;
        }

        public b d(e eVar) {
            this.f42557a.add(eVar);
            return this;
        }

        public b e(c cVar) {
            this.f42558b = cVar;
            return this;
        }

        public a f() {
            return new a(this.f42557a, this.f42558b, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(String str, com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar);

        void b(String str);
    }

    public a(Set set, c cVar) {
        this.f42548a = set;
        this.f42549b = cVar;
        this.f42551d = false;
        this.f42550c = false;
    }

    public void b(Context context, String str, List list, boolean z10) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            f(str, new C0429a(context, list, z10, str));
        } else {
            this.f42549b.b(str);
            com.cleveradssolutions.adapters.exchange.b.a(f42546e, "handleUrl(): Attempted to handle empty url.");
        }
    }

    public void e(Context context, Uri uri, com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar, boolean z10) throws com.cleveradssolutions.adapters.exchange.rendering.utils.url.b {
        if (dVar.zz() && !z10) {
            throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Attempt to handle action without user interaction");
        }
        dVar.b(context, this, uri);
    }

    public void f(String str, com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.b.a aVar) {
        new com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.b(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
        this.f42551d = true;
    }

    public final void g(String str, List list, com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar) {
        if (this.f42550c || this.f42551d) {
            com.cleveradssolutions.adapters.exchange.b.d(f42546e, "notifySuccess(): Action is finished or action is still pending.");
            return;
        }
        com.cleveradssolutions.adapters.exchange.rendering.networking.tracking.a.a().c(list);
        this.f42549b.a(str, dVar);
        this.f42550c = true;
    }

    public boolean h(Context context, String str, List list, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f42549b.b(str);
            com.cleveradssolutions.adapters.exchange.b.a(f42546e, "handleResolvedUrl(): Attempted to handle empty url.");
            return false;
        }
        Uri uri = Uri.parse(str);
        for (com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar : this.f42548a) {
            if (dVar.a(uri)) {
                try {
                    e(context, uri, dVar, z10);
                    g(str, list, dVar);
                    return true;
                } catch (com.cleveradssolutions.adapters.exchange.rendering.utils.url.b unused) {
                    com.cleveradssolutions.adapters.exchange.b.a(f42546e, "handleResolvedUrl(): Unable to handle action: " + dVar + " for given uri: " + uri);
                }
            }
        }
        this.f42549b.b(str);
        return false;
    }

    public /* synthetic */ a(Set set, c cVar, d dVar) {
        this(set, cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements c {
        @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.c
        public void b(String str) {
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.c
        public void a(String str, com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar) {
        }
    }
}
