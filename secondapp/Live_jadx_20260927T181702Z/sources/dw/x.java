package dw;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.f1
@kotlin.jvm.internal.s1({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
public abstract class x<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final zv.j<Element> f79701a;

    public /* synthetic */ x(zv.j jVar, kotlin.jvm.internal.x xVar) {
        this(jVar);
    }

    @Override // dw.a
    public final void g(@oy.l cw.d decoder, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.m0.p(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(decoder, i10 + i12, builder, false);
        }
    }

    @Override // zv.j, zv.d0, zv.e
    @oy.l
    public abstract bw.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dw.a
    public void h(@oy.l cw.d decoder, int i10, Builder builder, boolean z10) {
        kotlin.jvm.internal.m0.p(decoder, "decoder");
        n(builder, i10, cw.d.b.d(decoder, getDescriptor(), i10, this.f79701a, null, 8, null));
    }

    public abstract void n(Builder builder, int i10, Element element);

    @Override // dw.a, zv.d0
    public void serialize(@oy.l cw.h encoder, Collection collection) {
        kotlin.jvm.internal.m0.p(encoder, "encoder");
        int iE = e(collection);
        bw.f descriptor = getDescriptor();
        cw.e eVarG = encoder.g(descriptor, iE);
        Iterator<Element> itD = d(collection);
        for (int i10 = 0; i10 < iE; i10++) {
            eVarG.f(getDescriptor(), i10, this.f79701a, itD.next());
        }
        eVarG.c(descriptor);
    }

    public x(zv.j<Element> jVar) {
        super(null);
        this.f79701a = jVar;
    }
}
