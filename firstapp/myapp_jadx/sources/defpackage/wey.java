package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wey implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wey(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objA;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wwd0 wwd0Var = (wwd0) obj2;
                z7q z7qVar = (z7q) obj;
                do {
                    value = wwd0Var.getValue();
                    objA = (p8q) value;
                    if (objA instanceof p8q.b) {
                        p8q.b bVar = (p8q.b) objA;
                        z7q z7qVar2 = bVar.b;
                        objA = p8q.b.a(bVar, null, z7qVar2 != null ? z7q.a(z7qVar2, z7qVar.a, z7qVar.b, z7qVar.c, null, 8) : null, false, 13);
                    } else if (!Intrinsics.g(objA, p8q.c.a) && !Intrinsics.g(objA, p8q.a.a)) {
                        uhc.a();
                        return null;
                    }
                } while (!wwd0Var.g(value, objA));
                return Unit.a;
            default:
                ((Function1) obj2).invoke(new jp60.a(((Boolean) obj).booleanValue()));
                return Unit.a;
        }
    }
}
