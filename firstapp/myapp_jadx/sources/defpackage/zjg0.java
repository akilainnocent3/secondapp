package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zjg0 implements zzm {
    public final izm a;

    public zjg0(izm izmVar) {
        izmVar.getClass();
        this.a = izmVar;
    }

    @Override // defpackage.zzm
    public final Unit a(Throwable th) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a.logNonFatalException(th, o2gVar);
        return Unit.a;
    }

    @Override // defpackage.zzm
    public final Unit b(lmd0 lmd0Var) {
        String str;
        LinkedHashMap linkedHashMap;
        Throwable thA = lmd0Var.a();
        if (thA == null) {
            if (lmd0Var instanceof lmd0.a) {
                thA = new Throwable("No data in the wrapped response for ".concat(((lmd0.a) lmd0Var).b.a));
            } else {
                if (!(lmd0Var instanceof lmd0.b)) {
                    uhc.a();
                    return null;
                }
                thA = new Throwable("The lifecycle of the web socket emitted ERROR, see package: ua.naiksoftware.stomp.dto, class: LifecycleEvent");
            }
        }
        if (lmd0Var instanceof lmd0.a) {
            linkedHashMap = new LinkedHashMap();
            lmd0.a aVar = (lmd0.a) lmd0Var;
            Integer num = aVar.c;
            if (num != null) {
            }
            linkedHashMap.put("endpoint", aVar.b.a);
        } else {
            if (!(lmd0Var instanceof lmd0.b)) {
                uhc.a();
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            b3 b3Var = ((lmd0.b) lmd0Var).b;
            if (b3Var instanceof eee0) {
                str = "Subscription failure for path: " + ((eee0) b3Var).c;
            } else if (Intrinsics.g(b3Var, jja0.c)) {
                str = "Socket lifecycle error";
            } else if (b3Var instanceof jc80) {
                str = "Failed to send socket message to " + ((jc80) b3Var).c;
            } else {
                if (!Intrinsics.g(b3Var, eov.c)) {
                    uhc.a();
                    return null;
                }
                str = "Failed to parse ACK or NACK";
            }
            linkedHashMap2.put("socket_error_information", str);
            linkedHashMap = linkedHashMap2;
        }
        this.a.logNonFatalException(thA, linkedHashMap);
        return Unit.a;
    }
}
