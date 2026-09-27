package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final sa f38341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, sa inLine) {
            super(null);
            kotlin.jvm.internal.m0.p(inLine, "inLine");
            this.f38340a = str;
            this.f38341b = inLine;
        }

        public final a a(String str, sa inLine) {
            kotlin.jvm.internal.m0.p(inLine, "inLine");
            return new a(str, inLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f38340a, aVar.f38340a) && kotlin.jvm.internal.m0.g(this.f38341b, aVar.f38341b);
        }

        public int hashCode() {
            String str = this.f38340a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f38341b.hashCode();
        }

        public String toString() {
            return "InLineAd(id=" + this.f38340a + ", inLine=" + this.f38341b + gi.j.f86771d;
        }

        public static /* synthetic */ a a(a aVar, String str, sa saVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f38340a;
            }
            if ((i10 & 2) != 0) {
                saVar = aVar.f38341b;
            }
            return aVar.a(str, saVar);
        }

        public final sa a() {
            return this.f38341b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kl f38343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, kl wrapper) {
            super(null);
            kotlin.jvm.internal.m0.p(wrapper, "wrapper");
            this.f38342a = str;
            this.f38343b = wrapper;
        }

        public final kl a() {
            return this.f38343b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.m0.g(this.f38342a, bVar.f38342a) && kotlin.jvm.internal.m0.g(this.f38343b, bVar.f38343b);
        }

        public int hashCode() {
            String str = this.f38342a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f38343b.hashCode();
        }

        public String toString() {
            return "WrapperAd(id=" + this.f38342a + ", wrapper=" + this.f38343b + gi.j.f86771d;
        }
    }

    public c() {
    }

    public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
        this();
    }
}
