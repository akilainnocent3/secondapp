package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yjg0 implements yzm {
    public final izm a;

    public yjg0(izm izmVar) {
        izmVar.getClass();
        this.a = izmVar;
    }

    @Override // defpackage.yzm
    public final Unit a(Throwable th) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a.logNonFatalException(th, o2gVar);
        return Unit.a;
    }

    @Override // defpackage.yzm
    public final Unit b(String str) {
        this.a.a(str);
        return Unit.a;
    }

    @Override // defpackage.yzm
    public final Unit c(ou00 ou00Var) {
        String str;
        LinkedHashMap linkedHashMap;
        Throwable thA = ou00Var.a();
        if (thA == null) {
            if (ou00Var instanceof ou00.a) {
                thA = new Throwable("No data in the wrapped response for ".concat(((ou00.a) ou00Var).b.a));
            } else {
                if (!(ou00Var instanceof ou00.b)) {
                    uhc.a();
                    return null;
                }
                thA = new Throwable("The lifecycle of the web socket emitted ERROR, see package: ua.naiksoftware.stomp.dto, class: LifecycleEvent");
            }
        }
        if (ou00Var instanceof ou00.a) {
            linkedHashMap = new LinkedHashMap();
            ou00.a aVar = (ou00.a) ou00Var;
            Integer num = aVar.c;
            if (num != null) {
            }
            linkedHashMap.put("endpoint", aVar.b.a);
        } else {
            if (!(ou00Var instanceof ou00.b)) {
                uhc.a();
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            bjb0 bjb0Var = ((ou00.b) ou00Var).b;
            if (bjb0Var instanceof dee0) {
                str = "Subscription failure for path: " + ((dee0) bjb0Var).b;
            } else if (Intrinsics.g(bjb0Var, ija0.b)) {
                str = "Socket lifecycle error";
            } else if (bjb0Var instanceof ic80) {
                str = "Failed to send socket message to " + ((ic80) bjb0Var).b;
            } else {
                if (!Intrinsics.g(bjb0Var, dov.b)) {
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
