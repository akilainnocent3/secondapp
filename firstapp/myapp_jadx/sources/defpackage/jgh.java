package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.featuredGames.data.FeaturedRepository", f = "FeaturedRepository.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "getFeatured", v = 1)
public final class jgh extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ngh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgh(ngh nghVar, x1b x1bVar) {
        super(x1bVar);
        this.b = nghVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
