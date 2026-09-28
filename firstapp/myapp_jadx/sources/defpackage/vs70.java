package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class vs70 implements hpv, Closeable {
    public static final Logger v = Logger.getLogger(vs70.class.getName());
    public final ArrayList a;
    public final List<mw40> b;
    public final ArrayList c;
    public final pj1 d;
    public final bp8<qs70> e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final tn70.b i;

    public static class a {
    }

    public vs70(final ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, pg50 pg50Var, tn70.b bVar) {
        long jA = eqe0.a(true);
        this.a = arrayList;
        List<mw40> list = (List) identityHashMap.entrySet().stream().map(new Function() { // from class: ss70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return new mw40((opv) entry.getKey(), new l9i0((y8d) entry.getKey(), (hh6) entry.getValue(), new ArrayList(arrayList)));
            }
        }).collect(Collectors.toList());
        this.b = list;
        this.c = arrayList2;
        this.d = new pj1(pg50Var, jA);
        this.e = new bp8<>(new Function() { // from class: ts70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                oso osoVar = (oso) obj;
                vs70 vs70Var = this.a;
                pj1 pj1Var = vs70Var.d;
                List<mw40> list2 = vs70Var.b;
                vs70Var.i.apply(osoVar);
                return new qs70(pj1Var, osoVar, list2, oj1.b);
            }
        });
        this.i = bVar;
        for (mw40 mw40Var : list) {
            new ArrayList(arrayList2).add(new a());
            mw40Var.b.c1();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.hpv
    public final gpv f(String str) {
        if (this.b.isEmpty()) {
            return ied.a.f(str);
        }
        if (str.isEmpty()) {
            v.fine("Meter requested without instrumentation scope name.");
            str = "unknown";
        }
        return new rs70(this.e, str);
    }

    public final rm8 shutdown() {
        if (!this.f.compareAndSet(false, true)) {
            v.info("Multiple close calls");
            return rm8.e;
        }
        List<mw40> list = this.b;
        if (list.isEmpty()) {
            return rm8.e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<mw40> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b.shutdown());
        }
        return rm8.e(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        pj1 pj1Var = this.d;
        sb.append(pj1Var.a);
        sb.append(", resource=");
        sb.append(pj1Var.b);
        sb.append(", metricReaders=");
        sb.append(this.b.stream().map(new us70()).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.c);
        sb.append(", views=");
        sb.append(this.a);
        sb.append(", meterConfigurator=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
