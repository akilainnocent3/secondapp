package com.cleveradssolutions.sdk.base;

import android.util.Log;
import dr.w2;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f43994a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f43995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f43996b;

        public a(T t10, @m a<T> aVar) {
            this.f43995a = t10;
            this.f43996b = aVar;
        }

        @m
        public final a<T> a() {
            return this.f43996b;
        }

        public final T b() {
            return (T) this.f43995a;
        }

        public final void c(@m a<T> aVar) {
            this.f43996b = aVar;
        }
    }

    public final void a(T t10) {
        g(t10);
        this.f43994a = new a(t10, this.f43994a);
    }

    public final void b() {
        this.f43994a = null;
    }

    public final boolean c(T t10) {
        for (a aVarA = this.f43994a; aVarA != null; aVarA = aVarA.a()) {
            if (m0.g(aVarA.b(), t10)) {
                return true;
            }
        }
        return false;
    }

    public final void d(@l ds.l<? super T, w2> operation) {
        m0.p(operation, "operation");
        a<T> aVarE = e();
        while (aVarE != null) {
            a<T> aVarA = aVarE.a();
            try {
                operation.invoke(aVarE.b());
            } catch (Throwable th2) {
                Log.e("CAS", "From event", th2);
            }
            aVarE = aVarA;
        }
    }

    @m
    public final a<T> e() {
        return this.f43994a;
    }

    public final boolean f() {
        return e() == null;
    }

    public final void g(T t10) {
        a aVar = null;
        for (a aVarA = this.f43994a; aVarA != null; aVarA = aVarA.a()) {
            if (m0.g(aVarA.b(), t10)) {
                if (aVar == null) {
                    this.f43994a = aVarA.a();
                    return;
                } else {
                    aVar.c(aVarA.a());
                    return;
                }
            }
            aVar = aVarA;
        }
    }
}
