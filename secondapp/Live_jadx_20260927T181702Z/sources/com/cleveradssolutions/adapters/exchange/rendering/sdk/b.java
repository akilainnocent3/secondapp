package com.cleveradssolutions.adapters.exchange.rendering.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f42428d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42429a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42430b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f42431c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AtomicBoolean f42432d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f42433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f42434c;

        public a(c cVar, b bVar) {
            this.f42433b = cVar;
            this.f42434c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strA = this.f42433b.a(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42489c);
            String strA2 = this.f42433b.a(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42490d);
            this.f42434c.f42430b = strA;
            this.f42434c.f42429a = strA2;
            f42432d.set(false);
        }
    }

    public b(Context context) {
        this.f42431c = c.c(context);
    }

    public static b g(Context context) {
        if (f42428d == null) {
            synchronized (b.class) {
                try {
                    if (f42428d == null) {
                        f42428d = new b(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f42428d;
    }

    public String b() {
        return this.f42429a;
    }

    public String d() {
        return this.f42430b;
    }

    public void e() {
        if (this.f42431c.b()) {
            if ((this.f42430b.isEmpty() || this.f42429a.isEmpty()) && a.f42432d.compareAndSet(false, true)) {
                com.cleveradssolutions.sdk.base.c.f43997a.l(new a(this.f42431c, this));
            }
        }
    }

    public final /* synthetic */ com.cleveradssolutions.adapters.exchange.rendering.loading.b f(String str) {
        return new c.a(str, this.f42431c.f42436a);
    }

    public boolean i() {
        if (!this.f42431c.b()) {
            this.f42431c.g(new com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.d() { // from class: com.cleveradssolutions.adapters.exchange.rendering.sdk.a
                @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.d
                public final com.cleveradssolutions.adapters.exchange.rendering.loading.b b(String str) {
                    return this.f42427a.f(str);
                }
            });
            return false;
        }
        if (!this.f42430b.isEmpty() && !this.f42429a.isEmpty()) {
            return true;
        }
        e();
        return false;
    }
}
