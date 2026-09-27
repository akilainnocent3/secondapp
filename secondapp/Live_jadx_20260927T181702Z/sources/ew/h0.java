package ew;

import dr.f1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@f1
public final class h0 implements zv.j<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final h0 f81774a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final bw.f f81775b = bw.m.i("kotlinx.serialization.json.JsonNull", bw.n.b.f22016a, new bw.f[0], null, 8, null);

    @Override // zv.e
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 deserialize(@oy.l cw.f decoder) {
        kotlin.jvm.internal.m0.p(decoder, "decoder");
        y.g(decoder);
        if (decoder.F()) {
            throw new fw.h0("Expected 'null' literal");
        }
        decoder.e();
        return g0.INSTANCE;
    }

    @Override // zv.d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(@oy.l cw.h encoder, @oy.l g0 value) {
        kotlin.jvm.internal.m0.p(encoder, "encoder");
        kotlin.jvm.internal.m0.p(value, "value");
        y.h(encoder);
        encoder.z();
    }

    @Override // zv.j, zv.d0, zv.e
    @oy.l
    public bw.f getDescriptor() {
        return f81775b;
    }
}
