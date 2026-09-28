package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.mapper.RCErrorMapper", f = "RCErrorMapper.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 56, 65, 83}, m = "getErrorDialog$suspendImpl", v = 1)
public final class on30 extends x1b {
    public Throwable a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zr40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on30(zr40 zr40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zr40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return pn30.s(this.c, null, null, this);
    }
}
