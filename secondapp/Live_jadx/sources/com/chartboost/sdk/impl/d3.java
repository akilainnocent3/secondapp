package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38513c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CBError f38515b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final d3 a(Object obj) {
            return new d3(obj, null, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final d3 a(CBError cBError) {
            kotlin.jvm.internal.x xVar = null;
            return new d3(xVar, cBError, xVar);
        }
    }

    public d3(Object obj, CBError cBError) {
        this.f38514a = obj;
        this.f38515b = cBError;
    }

    public static final d3 a(CBError cBError) {
        return f38513c.a(cBError);
    }

    public /* synthetic */ d3(Object obj, CBError cBError, kotlin.jvm.internal.x xVar) {
        this(obj, cBError);
    }
}
