package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes8.dex */
public final class l4z implements sft {
    public final kpm<ktu> a;
    public final apm<ktu> b;
    public final xft c;

    public l4z(kpm kpmVar, apm apmVar) {
        this.a = kpmVar;
        this.b = apmVar;
        this.c = new xft(new k4z(apmVar));
    }

    public final rm8 k0(List list) {
        Map map;
        final xft xftVar = this.c;
        k4z k4zVar = xftVar.b;
        final gpt gptVar = (gpt) xftVar.a.poll();
        if (gptVar == null) {
            gptVar = new gpt();
        }
        ptu ptuVar = gptVar.a;
        if (list.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            ept eptVar = new ept();
            fpt fptVar = new fpt();
            ptu.b bVar = cyd0.a;
            Map mapA = ptuVar.j.a();
            cyd0.a aVar = (cyd0.a) ptuVar.d(cyd0.a, new byd0());
            aVar.a = mapA;
            aVar.b = eptVar;
            aVar.c = fptVar;
            aVar.d = ptuVar;
            list.forEach(aVar);
            map = mapA;
        }
        gptVar.b = map;
        gptVar.c = cyd0.d(u0h.a, map, ih50.a, ptuVar, gpt.d);
        rm8 rm8Var = (rm8) k4zVar.apply(gptVar, Integer.valueOf(list.size()));
        rm8Var.g(new Runnable() { // from class: wft
            @Override // java.lang.Runnable
            public final void run() {
                gpt gptVar2 = gptVar;
                gptVar2.a.f();
                xftVar.a.add(gptVar2);
            }
        });
        return rm8Var;
    }

    @Override // defpackage.sft
    public final rm8 shutdown() {
        return this.b.a();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.a.c(false));
        stringJoiner.add("memoryMode=" + amv.a);
        return stringJoiner.toString();
    }
}
