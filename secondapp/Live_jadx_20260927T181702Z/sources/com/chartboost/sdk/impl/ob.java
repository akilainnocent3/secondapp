package com.chartboost.sdk.impl;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum ob {
    CONCURRENT(0),
    SEQUENTIAL(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40293b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sr.a f40292g = sr.c.c(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40288c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final ob a(int i10) {
            Object next;
            Iterator<E> it = ob.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ob) next).c() != i10);
            ob obVar = (ob) next;
            return obVar == null ? ob.SEQUENTIAL : obVar;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    ob(int i10) {
        this.f40293b = i10;
    }

    public static sr.a b() {
        return f40292g;
    }

    public final int c() {
        return this.f40293b;
    }
}
