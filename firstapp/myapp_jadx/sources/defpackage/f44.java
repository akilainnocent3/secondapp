package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f44 extends saj implements Function1<i04, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(i04 i04Var) {
        Object value;
        Object value2;
        n7e0 n7e0Var;
        s24 s24Var;
        Object value3;
        k44 k44Var;
        Object value4;
        Object value5;
        Object value6;
        i04.a aVar;
        int i;
        i04 i04Var2 = i04Var;
        i04Var2.getClass();
        q44 q44Var = (q44) this.receiver;
        wwd0 wwd0Var = q44Var.i;
        if (i04Var2.equals(i04.l.a)) {
            m4e0 m4e0Var = ((k44) wwd0Var.getValue()).a;
            m4e0.c cVar = (m4e0.c) (m4e0Var instanceof m4e0.c ? m4e0Var : null);
            if (cVar != null && (i = q44Var.w) > 0) {
                q44Var.w = i - 1;
                q44Var.z1(cVar);
            }
        } else if (i04Var2.equals(i04.k.a)) {
            m4e0 m4e0Var2 = ((k44) wwd0Var.getValue()).a;
            m4e0.c cVar2 = (m4e0.c) (m4e0Var2 instanceof m4e0.c ? m4e0Var2 : null);
            if (cVar2 != null) {
                int size = cVar2.a.p.size() - 1;
                int i2 = q44Var.w;
                if (i2 < size) {
                    q44Var.w = i2 + 1;
                    q44Var.z1(cVar2);
                }
            }
        } else if (i04Var2 instanceof i04.a) {
            do {
                value6 = wwd0Var.getValue();
                aVar = (i04.a) i04Var2;
            } while (!wwd0Var.g(value6, k44.a((k44) value6, null, null, new h4e0.a(aVar.a, aVar.b), null, null, 27)));
        } else if (i04Var2.equals(i04.m.a)) {
            ej5.c(o8i0.d(q44Var), null, null, new m44(q44Var, true, null), 3);
        } else if (i04Var2.equals(i04.d.a)) {
            ej5.c(o8i0.d(q44Var), null, null, new m44(q44Var, false, null), 3);
        } else if (i04Var2.equals(i04.f.a)) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, k44.a((k44) value5, null, null, null, h850.b.a, null, 23)));
        } else if (i04Var2.equals(i04.g.a)) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, k44.a((k44) value4, null, null, h4e0.d.a, null, null, 27)));
        } else if (i04Var2.equals(i04.e.a)) {
            do {
                value3 = wwd0Var.getValue();
                k44Var = (k44) value3;
            } while (!wwd0Var.g(value3, k44Var.d instanceof h850.a ? k44.a(k44Var, null, null, null, h850.b.a, null, 23) : k44.a(k44Var, null, r4e0.b.a, null, null, null, 29)));
        } else if (i04Var2 instanceof i04.i) {
            rdd0 rdd0Var = q44Var.d;
            i04.i iVar = (i04.i) i04Var2;
            q7e0 q7e0Var = iVar.a;
            k00[] k00VarArr = (k00[]) iVar.b.toArray(new k00[0]);
            rdd0Var.a(q7e0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
        } else if (i04Var2 instanceof i04.j) {
            boolean z = ((i04.j) i04Var2).a;
            jvd0 jvd0Var = q44Var.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            q44Var.y = ej5.c(o8i0.d(q44Var), null, null, new r44(q44Var, z, null), 3);
        } else if (i04Var2 instanceof i04.h) {
            m4e0 m4e0Var3 = ((k44) wwd0Var.getValue()).a;
            if (!(m4e0Var3 instanceof m4e0.c)) {
                m4e0Var3 = null;
            }
            m4e0.c cVar3 = (m4e0.c) m4e0Var3;
            if (cVar3 != null && (n7e0Var = cVar3.a) != null && (s24Var = n7e0Var.k) != null) {
                ej5.c(o8i0.d(q44Var), null, null, new p44(q44Var, ((i04.h) i04Var2).a, s24Var, null), 3);
            }
        } else if (i04Var2 instanceof i04.b) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, k44.a((k44) value2, null, null, new h4e0.c(((i04.b) i04Var2).a), null, null, 27)));
        } else {
            if (!(i04Var2 instanceof i04.c)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, k44.a((k44) value, null, null, new h4e0.e(((i04.c) i04Var2).a), null, null, 27)));
        }
        return Unit.a;
    }
}
