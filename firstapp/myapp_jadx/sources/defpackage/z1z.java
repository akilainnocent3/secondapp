package defpackage;

import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class z1z {
    public static final v1z a(final eqa eqaVar, final String str, wd80 wd80Var, final Function0 function0) {
        wd80Var.getClass();
        final ssw sswVar = new ssw(s1z.b);
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            ((xd80) wd80Var).execute(new Runnable(eqaVar, str, function0, sswVar, aVar) { // from class: w1z
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ ssw c;
                public final /* synthetic */ nv5.a d;

                {
                    this.a = str;
                    this.b = function0;
                    this.c = sswVar;
                    this.d = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = this.a;
                    Function0 function1 = this.b;
                    ssw sswVar2 = this.c;
                    nv5.a aVar2 = this.d;
                    boolean zB = sig0.b();
                    if (zB) {
                        try {
                            Trace.beginSection(sig0.d(str2));
                        } catch (Throwable th) {
                            if (zB) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    try {
                        function1.invoke();
                        s1z.a.c cVar = s1z.a;
                        sswVar2.j(cVar);
                        aVar2.b(cVar);
                    } catch (Throwable th2) {
                        sswVar2.j(new s1z.a.C1075a(th2));
                        aVar2.d(th2);
                    }
                    Unit unit = Unit.a;
                    if (zB) {
                        Trace.endSection();
                    }
                }
            });
            Unit unit = Unit.a;
            if (unit != null) {
                aVar.a = unit;
            }
        } catch (Exception e) {
            dVar.a(e);
        }
        return new v1z();
    }
}
