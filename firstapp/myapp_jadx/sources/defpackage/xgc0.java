package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsRepoImpl", f = "SportyLegendsRepoImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "userCheck-gIAlu-s", v = 2)
public final class xgc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgc0(mgc0 mgc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mgc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM = this.b.m(null, this);
        return objM == y5b.a ? objM : new zi50(objM);
    }
}
