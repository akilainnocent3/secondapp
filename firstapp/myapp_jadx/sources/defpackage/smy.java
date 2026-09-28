package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.logging.Logger;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class smy {
    public final hdd<Interceptor.Chain, Response> a;
    public final i1z b;

    public smy(i1z i1zVar) {
        this.a = new hdd<>(i1zVar);
        this.b = i1zVar;
    }

    public final rmy a() {
        hdd<Interceptor.Chain, Response> hddVar = this.a;
        if (hddVar.g) {
            dqm<Interceptor.Chain> dqmVar = hddVar.e;
            gdd gddVar = new gdd();
            if (xzg.a != null) {
                xzg.a.getClass();
                dqmVar.b = gddVar;
            }
        }
        UnaryOperator<era0<Interceptor.Chain>> unaryOperator = hddVar.f;
        dqm<Interceptor.Chain> dqmVar2 = hddVar.e;
        era0 era0Var = (era0) unaryOperator.apply(new aqm(new HashSet(dqmVar2.a), dqmVar2.b));
        i1z i1zVar = hddVar.a;
        nbd nbdVar = sso.k;
        final ato atoVar = new ato(i1zVar, era0Var);
        lra0<? super REQUEST, ? super RESPONSE> lra0Var = (lra0) hddVar.c.apply(new eqm());
        Objects.requireNonNull(lra0Var, "spanStatusExtractor");
        atoVar.l = lra0Var;
        atoVar.d.add(new ynm(hddVar.d));
        hddVar.b.forEach(new Consumer() { // from class: wso
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o21 o21Var = (o21) obj;
                ArrayList arrayList = atoVar.d;
                Objects.requireNonNull(o21Var, "attributesExtractor");
                arrayList.add(o21Var);
            }
        });
        nbd nbdVar2 = gom.b;
        final fom fomVar = new fom();
        Logger logger = e2z.a;
        final String str = "http client";
        final c2z c2zVar = new c2z("http client");
        atoVar.h.add(new b2z() { // from class: d2z
            @Override // defpackage.b2z
            public final a2z a(fpv fpvVar) {
                qze qzeVarD = fpvVar.d("compatibility-test");
                if ((qzeVarD instanceof m2h) || qzeVarD.getClass().getName().contains("NoopDoubleHistogram")) {
                    return (a2z) fomVar.apply(fpvVar);
                }
                c2zVar.accept(str, qzeVarD);
                return e2z.b;
            }
        });
        atoVar.j = "https://opentelemetry.io/schemas/1.37.0";
        if (hddVar.g) {
            atoVar.d.add(new wom());
            nbd nbdVar3 = eom.c;
            final dom domVar = new dom();
            final String str2 = "experimental http client";
            final c2z c2zVar2 = new c2z("experimental http client");
            atoVar.h.add(new b2z() { // from class: d2z
                @Override // defpackage.b2z
                public final a2z a(fpv fpvVar) {
                    qze qzeVarD = fpvVar.d("compatibility-test");
                    if ((qzeVarD instanceof m2h) || qzeVarD.getClass().getName().contains("NoopDoubleHistogram")) {
                        return (a2z) domVar.apply(fpvVar);
                    }
                    c2zVar2.accept(str2, qzeVarD);
                    return e2z.b;
                }
            });
        }
        yqa0 yqa0Var = new yqa0();
        List<wyo> list = yyo.a;
        if (!list.isEmpty()) {
            atoVar.b();
            Iterator<wyo> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        atoVar.k = yqa0Var;
        return new rmy(new sso(atoVar), this.b.f());
    }
}
