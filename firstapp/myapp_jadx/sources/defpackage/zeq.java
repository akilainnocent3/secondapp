package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zeq extends saj implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zeq(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        LinkedHashMap linkedHashMapM;
        switch (this.a) {
            case 0:
                keq keqVar = (keq) obj;
                keqVar.getClass();
                efq efqVar = (efq) this.receiver;
                ku90<ccr> ku90Var = efqVar.w;
                if (keqVar.equals(keq.c.a)) {
                    efqVar.x1();
                } else if (keqVar.equals(keq.b.a)) {
                    dcr.a(ku90Var, new nvp.c(new i8r(null, ipq.NextDraw.b)));
                } else if (keqVar instanceof keq.a) {
                    wwd0 wwd0Var = efqVar.f;
                    do {
                        value = wwd0Var.getValue();
                        linkedHashMapM = kpu.m((scn) value);
                        keq.a aVar = (keq.a) keqVar;
                        boolean z = aVar.b;
                        String str = aVar.a;
                        if (z) {
                            linkedHashMapM.put(str, Boolean.TRUE);
                        } else {
                            linkedHashMapM.remove(str);
                        }
                    } while (!wwd0Var.g(value, a4h.g(linkedHashMapM)));
                } else {
                    if (!(keqVar instanceof keq.d)) {
                        uhc.a();
                        return null;
                    }
                    vdq vdqVar = efqVar.b;
                    vdqVar.c.setValue(((keq.d) keqVar).a);
                    dcr.a(ku90Var, new nvp.f(3, (uf00) null));
                }
                return Unit.a;
            default:
                qfg0 qfg0Var = (qfg0) obj;
                qfg0Var.getClass();
                f7k0 f7k0Var = (f7k0) this.receiver;
                f7k0Var.getClass();
                wwd0 wwd0Var2 = f7k0Var.z;
                wwd0Var2.getClass();
                wwd0Var2.k(null, qfg0Var);
                return Unit.a;
        }
    }
}
