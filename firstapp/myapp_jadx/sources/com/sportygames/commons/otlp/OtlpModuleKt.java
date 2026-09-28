package com.sportygames.commons.otlp;

import defpackage.eae0;
import defpackage.hym;
import defpackage.j1z;
import defpackage.jq40;
import defpackage.kqp;
import defpackage.l1z;
import defpackage.m2g;
import defpackage.n4z;
import defpackage.o4z;
import defpackage.p4z;
import defpackage.pu90;
import defpackage.qn70;
import defpackage.rob0;
import defpackage.t3w;
import defpackage.wrz;
import defpackage.yd2;
import defpackage.zn70;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lt3w;", "otlpModule", "Lt3w;", "getOtlpModule", "()Lt3w;", "SGLibrary_sportybetRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class OtlpModuleKt {
    private static final t3w otlpModule;

    static {
        t3w t3wVar = new t3w(0);
        otlpModule$lambda$0(t3wVar);
        otlpModule = t3wVar;
    }

    public static final t3w getOtlpModule() {
        return otlpModule;
    }

    private static final Unit otlpModule$lambda$0(t3w t3wVar) {
        t3wVar.getClass();
        n4z n4zVar = new n4z();
        eae0 eae0Var = zn70.e;
        kqp kqpVar = kqp.a;
        m2g m2gVar = m2g.a;
        t3wVar.a(new pu90(new yd2(eae0Var, jq40.a(j1z.class), null, n4zVar, kqpVar, m2gVar)));
        t3wVar.a(new pu90(new yd2(eae0Var, jq40.a(hym.class), null, new o4z(), kqpVar, m2gVar)));
        t3wVar.a(new pu90(new yd2(eae0Var, jq40.a(l1z.class), null, new p4z(), kqpVar, m2gVar)));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final j1z otlpModule$lambda$0$0(qn70 qn70Var, wrz wrzVar) {
        qn70Var.getClass();
        wrzVar.getClass();
        return new OtlpDataProviderImpl(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hym otlpModule$lambda$0$1(qn70 qn70Var, wrz wrzVar) {
        qn70Var.getClass();
        wrzVar.getClass();
        return new rob0((j1z) qn70Var.a(jq40.a(j1z.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1z otlpModule$lambda$0$2(qn70 qn70Var, wrz wrzVar) {
        qn70Var.getClass();
        wrzVar.getClass();
        return new l1z((hym) qn70Var.a(jq40.a(hym.class), null, null));
    }
}
