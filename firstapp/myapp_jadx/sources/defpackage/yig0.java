package defpackage;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yig0 {
    public final Trace a;

    public yig0(Trace trace) {
        this.a = trace;
    }

    public final xig0 a() {
        List listUnmodifiableList;
        xig0.b bVarW = xig0.w();
        bVarW.q(this.a.d);
        bVarW.o(this.a.z.a);
        Trace trace = this.a;
        bVarW.p(trace.z.e(trace.A));
        for (Counter counter : this.a.e.values()) {
            bVarW.m(counter.b.get(), counter.a);
        }
        ArrayList arrayList = this.a.v;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bVarW.j(new yig0((Trace) obj).a());
            }
        }
        bVarW.l(this.a.getAttributes());
        Trace trace2 = this.a;
        synchronized (trace2.i) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.i) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        qd00[] qd00VarArrE = PerfSession.e(listUnmodifiableList);
        if (qd00VarArrE != null) {
            bVarW.g(Arrays.asList(qd00VarArrE));
        }
        return bVarW.build();
    }
}
