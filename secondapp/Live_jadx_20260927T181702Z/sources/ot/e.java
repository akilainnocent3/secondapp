package ot;

import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f119582e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final e f119583f = new e(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final h f119584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final f f119585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f119586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f119587d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @oy.l
        public final e a() {
            return e.f119583f;
        }

        public a() {
        }
    }

    public e(@oy.m h hVar, @oy.m f fVar, boolean z10, boolean z11) {
        this.f119584a = hVar;
        this.f119585b = fVar;
        this.f119586c = z10;
        this.f119587d = z11;
    }

    public final boolean b() {
        return this.f119586c;
    }

    @oy.m
    public final f c() {
        return this.f119585b;
    }

    @oy.m
    public final h d() {
        return this.f119584a;
    }

    public final boolean e() {
        return this.f119587d;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z10, boolean z11, int i10, x xVar) {
        this(hVar, fVar, z10, (i10 & 8) != 0 ? false : z11);
    }
}
