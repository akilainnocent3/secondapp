package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b1y extends saj implements Function1<i3x, Unit> {
    public b1y(n32 n32Var) {
        super(1, n32Var, n32.class, "handleEvent", "handleEvent(Lcom/sportybet/feature/notificationcenter/NCEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(i3x i3xVar) {
        i3x i3xVar2 = i3xVar;
        i3xVar2.getClass();
        n32 n32Var = (n32) this.receiver;
        wwd0 wwd0Var = n32Var.f;
        if (i3xVar2 instanceof i3x.a) {
            LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
            int i = ((i3x.a) i3xVar2).a;
            Integer numValueOf = Integer.valueOf(i);
            Boolean bool = (Boolean) linkedHashMapM.get(Integer.valueOf(i));
            boolean z = true;
            if (bool != null && bool.booleanValue()) {
                z = false;
            }
            linkedHashMapM.put(numValueOf, Boolean.valueOf(z));
            wwd0Var.k(null, linkedHashMapM);
        } else {
            if (!(i3xVar2 instanceof i3x.b)) {
                uhc.a();
                return null;
            }
            h4x h4xVar = n32Var.b;
            int i2 = ((i3x.b) i3xVar2).a;
            et7 et7VarD = o8i0.d(n32Var);
            h4xVar.getClass();
            ej5.c(et7VarD, h4xVar.d, null, new l4x(h4xVar, i2, null), 2);
        }
        return Unit.a;
    }
}
