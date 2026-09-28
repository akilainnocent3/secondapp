package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.betslip.ProcessOneUpPromoBetSuccessUseCase", f = "ProcessOneUpPromoBetSuccessUseCase.kt", l = {150, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 46}, m = "invoke", v = 2)
public final class px20 extends x1b {
    public Set a;
    public quw b;
    public qsy c;
    public lx20.a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ lx20 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px20(lx20 lx20Var, x1b x1bVar) {
        super(x1bVar);
        this.f = lx20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
