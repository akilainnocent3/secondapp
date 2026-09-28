package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.PrepareShareCodeUseCase", f = "PrepareShareCodeUseCase.kt", l = {30, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 40}, m = "invoke", v = 2)
public final class wo20 extends x1b {
    public /* synthetic */ Object A;
    public final /* synthetic */ xo20 B;
    public int C;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public v4k f;
    public String i;
    public String v;
    public boolean w;
    public boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo20(xo20 xo20Var, x1b x1bVar) {
        super(x1bVar);
        this.B = xo20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, null, null, false, this);
    }
}
