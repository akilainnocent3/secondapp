package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f38228j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue f38231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f38232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f38233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f38237i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        UI,
        ASYNC;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f38241e = sr.c.c(a());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        GET,
        POST;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f38245e = sr.c.c(a());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        CANCELED,
        QUEUED,
        PROCESSING;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f38250f = sr.c.c(a());
    }

    public b3(c method, String uri, ue priority, File file) {
        kotlin.jvm.internal.m0.p(method, "method");
        kotlin.jvm.internal.m0.p(uri, "uri");
        kotlin.jvm.internal.m0.p(priority, "priority");
        this.f38229a = method;
        this.f38230b = uri;
        this.f38231c = priority;
        this.f38232d = file;
        this.f38233e = new AtomicReference(d.QUEUED);
        this.f38237i = b.UI;
    }

    public void a(CBError cBError, e3 e3Var) {
    }

    public final boolean b() {
        return androidx.lifecycle.y.a(this.f38233e, d.QUEUED, d.CANCELED);
    }

    public final c c() {
        return this.f38229a;
    }

    public final ue d() {
        return this.f38231c;
    }

    public final String e() {
        return this.f38230b;
    }

    public void a(Object obj, e3 e3Var) {
    }

    public void a(String uri, long j10) {
        kotlin.jvm.internal.m0.p(uri, "uri");
    }

    public c3 a() {
        return new c3(null, null, null);
    }

    public d3 a(e3 e3Var) {
        return d3.f38513c.a((Object) null);
    }
}
