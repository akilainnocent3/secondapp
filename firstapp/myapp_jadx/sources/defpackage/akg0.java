package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class akg0 implements a0n {
    public final izm a;

    public akg0(izm izmVar) {
        izmVar.getClass();
        this.a = izmVar;
    }

    @Override // defpackage.a0n
    public final Unit a(Throwable th) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a.logNonFatalException(th, o2gVar);
        return Unit.a;
    }

    @Override // defpackage.a0n
    public final Unit b(yj4 yj4Var) {
        String str;
        LinkedHashMap linkedHashMap;
        Throwable thA = yj4Var.a();
        if (thA == null) {
            if (yj4Var instanceof yj4.a) {
                thA = new Throwable("No data in the wrapped response for ".concat(((yj4.a) yj4Var).b.a));
            } else {
                if (!(yj4Var instanceof yj4.b)) {
                    uhc.a();
                    return null;
                }
                thA = new Throwable("The lifecycle of the web socket emitted ERROR, see package: ua.naiksoftware.stomp.dto, class: LifecycleEvent");
            }
        }
        if (yj4Var instanceof yj4.a) {
            linkedHashMap = new LinkedHashMap();
            yj4.a aVar = (yj4.a) yj4Var;
            Integer num = aVar.c;
            if (num != null) {
            }
            linkedHashMap.put("endpoint", aVar.b.a);
        } else {
            if (!(yj4Var instanceof yj4.b)) {
                uhc.a();
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            bjb0 bjb0Var = ((yj4.b) yj4Var).b;
            if (bjb0Var instanceof fee0) {
                str = "Subscription failure for path: " + ((fee0) bjb0Var).b;
            } else if (Intrinsics.g(bjb0Var, kja0.b)) {
                str = "Socket lifecycle error";
            } else if (bjb0Var instanceof kc80) {
                str = "Failed to send socket message to " + ((kc80) bjb0Var).b;
            } else {
                if (!Intrinsics.g(bjb0Var, fov.b)) {
                    uhc.a();
                    return null;
                }
                str = "Failed to parse socket message";
            }
            linkedHashMap2.put("socket_error_information", str);
            linkedHashMap = linkedHashMap2;
        }
        this.a.logNonFatalException(thA, linkedHashMap);
        return Unit.a;
    }
}
