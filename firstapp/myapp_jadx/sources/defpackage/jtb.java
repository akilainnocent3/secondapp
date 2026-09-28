package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jtb implements yu50 {
    public final oph0 a;

    public jtb(oph0 oph0Var) {
        this.a = oph0Var;
    }

    @Override // defpackage.yu50
    public final void a(kk1 kk1Var) {
        final oph0 oph0Var = this.a;
        HashSet<uu50> hashSet = kk1Var.a;
        hashSet.getClass();
        ArrayList arrayList = new ArrayList(l48.r(hashSet, 10));
        for (uu50 uu50Var : hashSet) {
            String strC = uu50Var.c();
            String strA = uu50Var.a();
            String strB = uu50Var.b();
            String strE = uu50Var.e();
            long jD = uu50Var.d();
            jcp jcpVar = vu50.a;
            if (strB.length() > 256) {
                strB = strB.substring(0, 256);
            }
            arrayList.add(new jk1(strC, strA, strB, strE, jD));
        }
        synchronized (oph0Var.f) {
            try {
                if (oph0Var.f.b(arrayList)) {
                    final List<vu50> listA = oph0Var.f.a();
                    oph0Var.b.b.a(new Runnable() { // from class: lph0
                        @Override // java.lang.Runnable
                        public final void run() {
                            oph0 oph0Var2 = oph0Var;
                            oph0Var2.a.i(oph0Var2.c, listA);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
