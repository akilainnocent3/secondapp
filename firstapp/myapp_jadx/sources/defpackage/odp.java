package defpackage;

import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.g;

/* JADX INFO: loaded from: classes8.dex */
public final class odp implements php<ndp> {
    public static final odp a = new odp();
    public static final gw20 b = vd80.a("kotlinx.serialization.json.JsonLiteral", bw20.i.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        scp scpVarH = cdp.a(b5dVar).h();
        if (scpVarH instanceof ndp) {
            return (ndp) scpVarH;
        }
        throw jdp.c(-1, scpVarH.toString(), "Unexpected JSON element, expected JsonLiteral, had " + jq40.a(scpVarH.getClass()));
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        ndp ndpVar = (ndp) obj;
        ndpVar.getClass();
        cdp.b(f4gVar);
        boolean z = ndpVar.a;
        String str = ndpVar.c;
        if (z) {
            f4gVar.E(str);
            return;
        }
        pd80 pd80Var = ndpVar.b;
        if (pd80Var != null) {
            f4gVar.h(pd80Var).E(str);
            return;
        }
        Long lS0 = StringsKt.s0(str);
        if (lS0 != null) {
            f4gVar.p(lS0.longValue());
            return;
        }
        nbh0 nbh0VarF = g.f(str);
        if (nbh0VarF != null) {
            long j = nbh0VarF.a;
            nbh0.b.getClass();
            f4gVar.h(rbh0.b).p(j);
            return;
        }
        Double dH = b.h(str);
        if (dH != null) {
            f4gVar.e(dH.doubleValue());
            return;
        }
        Boolean boolR0 = StringsKt.r0(str);
        if (boolR0 != null) {
            f4gVar.v(boolR0.booleanValue());
        } else {
            f4gVar.E(str);
        }
    }
}
