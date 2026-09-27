package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4459pb<T> {

    /* JADX INFO: renamed from: com.ironsource.pb$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> implements InterfaceC4459pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final IronSourceError f63320a;

        public a(@oy.l IronSourceError error) {
            kotlin.jvm.internal.m0.p(error, "error");
            this.f63320a = error;
        }

        @oy.l
        public final IronSourceError a() {
            return this.f63320a;
        }

        @oy.l
        public final IronSourceError b() {
            return this.f63320a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m0.g(this.f63320a, ((a) obj).f63320a);
        }

        public int hashCode() {
            return this.f63320a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Failure(error=" + this.f63320a + gi.j.f86771d;
        }

        @oy.l
        public final a<T> a(@oy.l IronSourceError error) {
            kotlin.jvm.internal.m0.p(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f63320a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.pb$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T> implements InterfaceC4459pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f63321a;

        public b(T t10) {
            this.f63321a = t10;
        }

        public final T a() {
            return this.f63321a;
        }

        public final T b() {
            return this.f63321a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f63321a, ((b) obj).f63321a);
        }

        public int hashCode() {
            T t10 = this.f63321a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @oy.l
        public String toString() {
            return "Success(value=" + this.f63321a + gi.j.f86771d;
        }

        @oy.l
        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f63321a;
            }
            return bVar.a(obj);
        }
    }
}
