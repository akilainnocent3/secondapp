package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bbe0 implements y5a0 {
    public static final bbe0 b = new bbe0();
    public final /* synthetic */ int a = 0;

    public static final void b(svj0 svj0Var, String str) {
        ayj0 ayj0VarB;
        WorkDatabase workDatabase = svj0Var.c;
        workDatabase.getClass();
        pwj0 pwj0VarC = workDatabase.C();
        umd umdVarX = workDatabase.x();
        ArrayList arrayListL = b.l(str);
        while (!arrayListL.isEmpty()) {
            String str2 = (String) p48.C(arrayListL);
            jvj0 jvj0VarI = pwj0VarC.i(str2);
            if (jvj0VarI != jvj0.c && jvj0VarI != jvj0.d) {
                pwj0VarC.l(str2);
            }
            arrayListL.addAll(umdVarX.a(str2));
        }
        yy20 yy20Var = svj0Var.f;
        yy20Var.getClass();
        synchronized (yy20Var.k) {
            jgt.e().a(yy20.l, "Processor cancelling " + str);
            yy20Var.i.add(str);
            ayj0VarB = yy20Var.b(str);
        }
        yy20.d(str, ayj0VarB, 1);
        Iterator<rm70> it = svj0Var.e.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    @Override // defpackage.y5a0
    public boolean a(Object obj, Object obj2) {
        return Intrinsics.g(obj, obj2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
