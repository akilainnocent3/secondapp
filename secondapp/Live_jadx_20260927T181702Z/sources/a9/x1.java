package a9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public abstract class x1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f4403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f4404c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cs.g
        public final boolean f4405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        @oy.m
        public final String f4406b;

        public a(boolean z10, @oy.m String str) {
            this.f4405a = z10;
            this.f4406b = str;
        }
    }

    public x1(int i10, @oy.l String identityHash, @oy.l String legacyIdentityHash) {
        kotlin.jvm.internal.m0.p(identityHash, "identityHash");
        kotlin.jvm.internal.m0.p(legacyIdentityHash, "legacyIdentityHash");
        this.f4402a = i10;
        this.f4403b = identityHash;
        this.f4404c = legacyIdentityHash;
    }

    public abstract void a(@oy.l l9.d dVar);

    public abstract void b(@oy.l l9.d dVar);

    @oy.l
    public final String c() {
        return this.f4403b;
    }

    @oy.l
    public final String d() {
        return this.f4404c;
    }

    public final int e() {
        return this.f4402a;
    }

    public abstract void f(@oy.l l9.d dVar);

    public abstract void g(@oy.l l9.d dVar);

    public abstract void h(@oy.l l9.d dVar);

    public abstract void i(@oy.l l9.d dVar);

    @oy.l
    public abstract a j(@oy.l l9.d dVar);
}
