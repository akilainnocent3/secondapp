package x8;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f144742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144743b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public String f144744a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f144745b = true;

        @oy.l
        public final b a() {
            return new b(this.f144744a, this.f144745b);
        }

        @oy.l
        public final a b(@oy.l String adsSdkName) {
            m0.p(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f144744a = adsSdkName;
            return this;
        }

        @oy.l
        public final a c(boolean z10) {
            this.f144745b = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @oy.l
    public final String a() {
        return this.f144742a;
    }

    @cs.j(name = "shouldRecordObservation")
    public final boolean b() {
        return this.f144743b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m0.g(this.f144742a, bVar.f144742a) && this.f144743b == bVar.f144743b;
    }

    public int hashCode() {
        return (this.f144742a.hashCode() * 31) + g8.a.a(this.f144743b);
    }

    @oy.l
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f144742a + ", shouldRecordObservation=" + this.f144743b;
    }

    public b(@oy.l String adsSdkName, boolean z10) {
        m0.p(adsSdkName, "adsSdkName");
        this.f144742a = adsSdkName;
        this.f144743b = z10;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
