package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes8.dex */
public final class m4z implements tqa0 {
    public final kpm<ktu> a;
    public final apm<ktu> b;
    public final ira0 c;

    public m4z(kpm kpmVar, apm apmVar) {
        this.a = kpmVar;
        this.b = apmVar;
        this.c = new ira0(new k4z(apmVar));
    }

    @Override // defpackage.tqa0
    public final rm8 k0(List list) {
        Map map;
        final ira0 ira0Var = this.c;
        k4z k4zVar = ira0Var.b;
        final jpt jptVar = (jpt) ira0Var.a.poll();
        if (jptVar == null) {
            jptVar = new jpt();
        }
        ptu ptuVar = jptVar.a;
        if (list.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            hpt hptVar = new hpt();
            ipt iptVar = new ipt();
            ptu.b bVar = cyd0.a;
            Map mapA = ptuVar.j.a();
            cyd0.a aVar = (cyd0.a) ptuVar.d(cyd0.a, new byd0());
            aVar.a = mapA;
            aVar.b = hptVar;
            aVar.c = iptVar;
            aVar.d = ptuVar;
            list.forEach(aVar);
            map = mapA;
        }
        jptVar.b = map;
        jptVar.c = cyd0.d(v0h.a, map, ph50.a, ptuVar, jpt.d);
        rm8 rm8Var = (rm8) k4zVar.apply(jptVar, Integer.valueOf(list.size()));
        rm8Var.g(new Runnable() { // from class: hra0
            @Override // java.lang.Runnable
            public final void run() {
                jpt jptVar2 = jptVar;
                jptVar2.a.f();
                ira0Var.a.add(jptVar2);
            }
        });
        return rm8Var;
    }

    @Override // defpackage.tqa0
    public final rm8 shutdown() {
        return this.b.a();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpSpanExporter{", "}");
        stringJoiner.add(this.a.c(false));
        stringJoiner.add("memoryMode=" + amv.a);
        return stringJoiner.toString();
    }
}
