package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class up1 {
    public static final /* synthetic */ int a = 0;

    public static final Object a(Collection collection, v1b v1bVar) {
        return collection.isEmpty() ? m2g.a : new pp1((ojd[]) collection.toArray(new ojd[0])).a(v1bVar);
    }

    public static final Object b(ojd[] ojdVarArr, tje0 tje0Var) {
        return ojdVarArr.length == 0 ? m2g.a : new pp1(ojdVarArr).a(tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(List list, v1b v1bVar) {
        tp1 tp1Var;
        Iterator it;
        if (v1bVar instanceof tp1) {
            tp1Var = (tp1) v1bVar;
            int i = tp1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp1Var.c = i - Integer.MIN_VALUE;
            } else {
                tp1Var = new tp1(v1bVar);
            }
        } else {
            tp1Var = new tp1(v1bVar);
        }
        Object obj = tp1Var.b;
        y5b y5bVar = y5b.a;
        int i2 = tp1Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = tp1Var.a;
            uj50.b(obj);
        }
        while (it.hasNext()) {
            c9p c9pVar = (c9p) it.next();
            tp1Var.a = it;
            tp1Var.c = 1;
            if (c9pVar.join(tp1Var) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.c9p[] r6, defpackage.x1b r7) {
        /*
            boolean r0 = r7 instanceof defpackage.sp1
            if (r0 == 0) goto L13
            r0 = r7
            sp1 r0 = (defpackage.sp1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            sp1 r0 = new sp1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.c
            int r2 = r0.b
            java.lang.Object[] r4 = r0.a
            c9p[] r4 = (defpackage.c9p[]) r4
            defpackage.uj50.b(r7)
            r7 = r4
            goto L52
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L37:
            defpackage.uj50.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3f:
            if (r2 >= r6) goto L54
            r4 = r7[r2]
            r0.a = r7
            r0.b = r2
            r0.c = r6
            r0.e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            int r2 = r2 + r3
            goto L3f
        L54:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up1.d(c9p[], x1b):java.lang.Object");
    }
}
