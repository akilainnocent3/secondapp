package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.joker.data.repository.JokerRepositoryImpl", f = "JokerRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "isJokerToggled", v = 2)
public final class oap extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qap b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oap(qap qapVar, x1b x1bVar) {
        super(x1bVar);
        this.b = qapVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
