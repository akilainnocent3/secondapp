package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {112, 128, 144, 151, ModuleDescriptor.MODULE_VERSION}, m = "getSessionData", v = 2)
public final class rjc0 extends x1b {
    public String a;
    public imc0 b;
    public BetBuilderConfig c;
    public hcc0 d;
    public uhc0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ akc0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjc0(akc0 akc0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = akc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        Set<Integer> set = akc0.i;
        return this.i.b(null, this);
    }
}
