package i;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public j.b.j.f f90144a = j.b.j.C0929b.f99199a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public j.b.j.f f90145a = j.b.j.C0929b.f99199a;

        @oy.l
        public final m a() {
            m mVar = new m();
            mVar.b(this.f90145a);
            return mVar;
        }

        @oy.l
        public final a b(@oy.l j.b.j.f mediaType) {
            m0.p(mediaType, "mediaType");
            this.f90145a = mediaType;
            return this;
        }
    }

    @oy.l
    public final j.b.j.f a() {
        return this.f90144a;
    }

    public final void b(@oy.l j.b.j.f fVar) {
        m0.p(fVar, "<set-?>");
        this.f90144a = fVar;
    }
}
