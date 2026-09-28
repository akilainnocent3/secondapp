package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class is70 implements rgt, Closeable {
    public static final Logger e = Logger.getLogger(is70.class.getName());
    public final sgt a;
    public final bp8<es70> b;
    public final boolean c;
    public final tn70.b d;

    public is70(pg50 pg50Var, js70 js70Var, ArrayList arrayList, tn70.b bVar, ks70 ks70Var) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add((tft) obj);
        }
        tft aewVar = arrayList2.isEmpty() ? dyx.a : arrayList2.size() == 1 ? (tft) arrayList2.get(0) : new aew(new ArrayList(arrayList2));
        this.a = new sgt(pg50Var, js70Var, aewVar, new gs70(ks70Var));
        this.b = new bp8<>(new Function() { // from class: hs70
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                oso osoVar = (oso) obj2;
                is70 is70Var = this.a;
                sgt sgtVar = is70Var.a;
                is70Var.d.apply(osoVar);
                nj1 nj1Var = nj1.c;
                return es70.g ? new a3h(sgtVar, osoVar, nj1Var) : new es70(sgtVar, osoVar, nj1Var);
            }
        });
        this.d = bVar;
        this.c = aewVar instanceof dyx;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.rgt
    public final ogt d(String str) {
        if (str.isEmpty()) {
            e.fine("Logger requested without instrumentation scope name.");
            str = "unknown";
        }
        return this.b.b(str, null, null, vw0.d);
    }

    public final rm8 shutdown() {
        if (this.a.e != null) {
            e.log(Level.INFO, "Calling shutdown() multiple times.");
            return rm8.e;
        }
        sgt sgtVar = this.a;
        synchronized (sgtVar.a) {
            try {
                if (sgtVar.e != null) {
                    return sgtVar.e;
                }
                sgtVar.e = sgtVar.c.shutdown();
                return sgtVar.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        sgt sgtVar = this.a;
        sgtVar.getClass();
        sb.append(eqe0.b);
        sb.append(", resource=");
        sb.append(sgtVar.b);
        sb.append(", logLimits=");
        sb.append(kj1.c);
        sb.append(", logRecordProcessor=");
        sb.append(sgtVar.c);
        sb.append(", loggerConfigurator=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.rgt
    public final qgt f(String str) {
        if (this.c) {
            return ((rgt) mf9.a(wdd.a, gvQvkPPtA.mIbT)).f(str);
        }
        if (str.isEmpty()) {
            e.fine("Logger requested without instrumentation scope name.");
            str = "unknown";
        }
        return new fs70(this.b, str);
    }
}
