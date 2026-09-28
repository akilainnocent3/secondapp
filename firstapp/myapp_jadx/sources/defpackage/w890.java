package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.legacy.bindings.ShouldDisplayGameSessionInfoUseCaseImpl", f = "ShouldDisplayGameSessionInfoUseCaseImpl.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "shouldDisplay", v = 2)
public final class w890 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x890 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w890(x890 x890Var, x1b x1bVar) {
        super(x1bVar);
        this.b = x890Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
