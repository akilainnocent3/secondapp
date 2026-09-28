package defpackage;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vl90 {
    public final ln90 a;
    public final iug0 b;
    public final il90 c;
    public boolean d;
    public final wwd0 e = xwd0.a(hug0.b);
    public final wwd0 f = xwd0.a(null);
    public final b390 g = d390.b(0, 1, pb5.c, 1);
    public final wwd0 h = xwd0.a(zm90.c.a);
    public final wwd0 i = xwd0.a(null);
    public final ku90<rm90> j = new ku90<>();

    public vl90(ln90 ln90Var, iug0 iug0Var, il90 il90Var) {
        this.a = ln90Var;
        this.b = iug0Var;
        this.c = il90Var;
    }

    public final void a(qm90 qm90Var) {
        qm90Var.getClass();
        if (qm90Var instanceof qm90.a) {
            if (Intrinsics.g(this.h.getValue(), zm90.b.a)) {
                return;
            }
            this.g.a(qm90Var);
        } else if (qm90Var instanceof qm90.b) {
            this.j.a(rm90.a.a);
        } else {
            uhc.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(qm90.a aVar, x1b x1bVar) {
        ul90 ul90Var;
        boolean zG;
        Integer numValueOf;
        List<rq90> list;
        Object value;
        Object objB;
        fl90 fl90Var;
        Object value2;
        ym90 cVar;
        fl90 fl90Var2;
        Object value3;
        Object value4;
        if (x1bVar instanceof ul90) {
            ul90Var = (ul90) x1bVar;
            int i = ul90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul90Var.f = i - Integer.MIN_VALUE;
            } else {
                ul90Var = new ul90(this, x1bVar);
            }
        } else {
            ul90Var = new ul90(this, x1bVar);
        }
        Object obj = ul90Var.d;
        y5b y5bVar = y5b.a;
        int i2 = ul90Var.f;
        wwd0 wwd0Var = this.f;
        wwd0 wwd0Var2 = this.h;
        if (i2 == 0) {
            uj50.b(obj);
            qm90.a.C1017a c1017a = qm90.a.C1017a.a;
            zG = Intrinsics.g(aVar, c1017a);
            if (zG) {
                this.d = false;
            }
            fl90 fl90Var3 = (fl90) wwd0Var.getValue();
            if (!zG) {
                if (!this.d && fl90Var3 != null) {
                    if (fl90Var3.b.size() >= fl90Var3.a) {
                        this.d = true;
                    }
                }
                return Unit.a;
            }
            if (Intrinsics.g(aVar, c1017a)) {
                numValueOf = 0;
            } else {
                if (!Intrinsics.g(aVar, qm90.a.b.a)) {
                    uhc.a();
                    return null;
                }
                numValueOf = (fl90Var3 == null || (list = fl90Var3.b) == null) ? null : Integer.valueOf(list.size());
            }
            if (numValueOf == null) {
                return Unit.a;
            }
            int iIntValue = numValueOf.intValue();
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, zm90.b.a));
            ul90Var.a = aVar;
            ul90Var.b = fl90Var3;
            ul90Var.c = zG;
            ul90Var.f = 1;
            objB = this.a.b(iIntValue, ul90Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
            fl90Var = fl90Var3;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z = ul90Var.c;
            fl90Var = ul90Var.b;
            qm90.a aVar2 = ul90Var.a;
            uj50.b(obj);
            objB = ((zi50) obj).a;
            zG = z;
            aVar = aVar2;
        }
        zi50.a aVar3 = zi50.b;
        if (!(objB instanceof zi50.b)) {
            fl90 fl90Var4 = (fl90) objB;
            if (Intrinsics.g(aVar, qm90.a.C1017a.a)) {
                fl90Var2 = fl90Var4;
            } else {
                if (!Intrinsics.g(aVar, qm90.a.b.a)) {
                    uhc.a();
                    return null;
                }
                if (fl90Var != null) {
                    fl90Var2 = new fl90(fl90Var4.a, CollectionsKt.i0(fl90Var4.b, fl90Var.b));
                } else {
                    fl90Var2 = fl90Var4;
                }
            }
            this.d = (Intrinsics.g(aVar, qm90.a.b.a) && fl90Var4.b.isEmpty()) || fl90Var2.b.size() >= fl90Var2.a;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, fl90Var2));
            if (zG) {
                this.j.a(rm90.a.a);
            }
            do {
                value4 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value4, zG ? zm90.d.a.a : zm90.d.b.a));
        }
        Throwable thA = zi50.a(objB);
        if (thA != null) {
            do {
                value2 = wwd0Var2.getValue();
                if (thA instanceof IOException) {
                    cVar = new ym90.b();
                } else {
                    String message = thA.getMessage();
                    if (message == null || message.length() == 0) {
                        cVar = new ym90.c();
                    } else {
                        String message2 = thA.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        cVar = new ym90.a(message2);
                    }
                }
            } while (!wwd0Var2.g(value2, new zm90.a(cVar)));
        }
        return Unit.a;
    }
}
