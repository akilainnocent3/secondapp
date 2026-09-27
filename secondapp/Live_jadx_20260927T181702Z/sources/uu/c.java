package uu;

import kotlin.jvm.internal.m0;
import ou.g0;
import oy.l;
import pu.e;
import ws.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final g1 f139777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final g0 f139778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final g0 f139779c;

    public c(@l g1 typeParameter, @l g0 inProjection, @l g0 outProjection) {
        m0.p(typeParameter, "typeParameter");
        m0.p(inProjection, "inProjection");
        m0.p(outProjection, "outProjection");
        this.f139777a = typeParameter;
        this.f139778b = inProjection;
        this.f139779c = outProjection;
    }

    @l
    public final g0 a() {
        return this.f139778b;
    }

    @l
    public final g0 b() {
        return this.f139779c;
    }

    @l
    public final g1 c() {
        return this.f139777a;
    }

    public final boolean d() {
        return e.f121071a.c(this.f139778b, this.f139779c);
    }
}
