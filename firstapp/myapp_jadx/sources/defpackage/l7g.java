package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l7g {
    public static final String a = jgt.g("EnqueueRunnable");

    public static void a(ruj0 ruj0Var) {
        boolean z;
        svj0 svj0Var = ruj0Var.c;
        HashSet hashSet = new HashSet();
        hashSet.addAll(ruj0Var.i);
        HashSet hashSetY = ruj0.Y(ruj0Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(ruj0Var.i);
                z = false;
                break;
            } else if (hashSetY.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            lx5.b(ruj0Var, "WorkContinuation has cycles (", ")");
            return;
        }
        WorkDatabase workDatabase = svj0Var.c;
        a aVar = svj0Var.b;
        workDatabase.c();
        try {
            m7g.a(workDatabase, aVar, ruj0Var);
            boolean zB = b(ruj0Var);
            workDatabase.v();
            workDatabase.r();
            if (zB) {
                xm70.b(aVar, svj0Var.c, svj0Var.e);
            }
        } catch (Throwable th) {
            workDatabase.r();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x022c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.List] */
    public static boolean b(ruj0 ruj0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        owj0 owj0VarB;
        owj0 owj0VarB2;
        ruj0 ruj0Var2 = ruj0Var;
        HashSet hashSetY = ruj0.Y(ruj0Var2);
        final svj0 svj0Var = ruj0Var2.c;
        List<? extends jwj0> list = ruj0Var2.f;
        int i = 0;
        String[] strArr = (String[]) hashSetY.toArray(new String[0]);
        final String str = ruj0Var2.d;
        lvg lvgVar = ruj0Var2.e;
        dqe0 dqe0Var = svj0Var.b.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final WorkDatabase workDatabase2 = svj0Var.c;
        boolean z8 = strArr != null && strArr.length > 0;
        jvj0 jvj0Var = jvj0.c;
        jvj0 jvj0Var2 = jvj0.f;
        jvj0 jvj0Var3 = jvj0.d;
        if (z8) {
            int length = strArr.length;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    List<? extends jwj0> list2 = list;
                    owj0 owj0VarJ = workDatabase2.C().j(str2);
                    if (owj0VarJ == null) {
                        jgt.e().c(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        jvj0 jvj0Var4 = owj0VarJ.b;
                        z &= jvj0Var4 == jvj0Var;
                        if (jvj0Var4 == jvj0Var3) {
                            z3 = true;
                        } else if (jvj0Var4 == jvj0Var2) {
                            z2 = true;
                        }
                        i++;
                        list = list2;
                    }
                }
                z6 = true;
                z7 = false;
                ruj0Var2.w = z6;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        List<? extends jwj0> list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        jvj0 jvj0Var5 = jvj0.a;
        if (zIsEmpty || z8) {
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
        } else {
            ArrayList arrayListP = workDatabase2.C().p(str);
            if (arrayListP.isEmpty()) {
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
            } else {
                lvg lvgVar2 = lvg.c;
                z4 = zIsEmpty;
                lvg lvgVar3 = lvg.d;
                if (lvgVar == lvgVar2 || lvgVar == lvgVar3) {
                    umd umdVarX = workDatabase2.x();
                    ?? arrayList = new ArrayList();
                    workDatabase = workDatabase2;
                    int size = arrayListP.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayListP.get(i2);
                        int i3 = i2 + 1;
                        owj0.a aVar = (owj0.a) obj;
                        int i4 = size;
                        if (!umdVarX.d(aVar.a)) {
                            jvj0 jvj0Var6 = aVar.b;
                            z &= jvj0Var6 == jvj0Var;
                            if (jvj0Var6 == jvj0Var3) {
                                z3 = true;
                            } else if (jvj0Var6 == jvj0Var2) {
                                z2 = true;
                            }
                            arrayList.add(aVar.a);
                        }
                        size = i4;
                        i2 = i3;
                    }
                    if (lvgVar == lvgVar3 && (z2 || z3)) {
                        pwj0 pwj0VarC = workDatabase.C();
                        ArrayList arrayListP2 = pwj0VarC.p(str);
                        int size2 = arrayListP2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayListP2.get(i5);
                            i5++;
                            pwj0VarC.a(((owj0.a) obj2).a);
                        }
                        arrayList = Collections.EMPTY_LIST;
                        z2 = false;
                        z3 = false;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z8 = strArr.length > 0;
                } else {
                    if (lvgVar == lvg.b) {
                        int size3 = arrayListP.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size3) {
                                Object obj3 = arrayListP.get(i6);
                                i6++;
                                jvj0 jvj0Var7 = ((owj0.a) obj3).b;
                                if (jvj0Var7 == jvj0Var5 || jvj0Var7 == jvj0.b) {
                                    z6 = true;
                                    z7 = false;
                                    ruj0Var2.w = z6;
                                    return z7;
                                }
                            }
                        }
                    }
                    workDatabase2.u(new hv50(new Runnable() { // from class: sb6
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArrayList arrayListH = workDatabase2.C().h(str);
                            int size4 = arrayListH.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                Object obj4 = arrayListH.get(i7);
                                i7++;
                                bbe0.b(svj0Var, (String) obj4);
                            }
                        }
                    }));
                    pwj0 pwj0VarC2 = workDatabase2.C();
                    int size4 = arrayListP.size();
                    int i7 = 0;
                    while (i7 < size4) {
                        Object obj4 = arrayListP.get(i7);
                        i7++;
                        pwj0VarC2.a(((owj0.a) obj4).a);
                    }
                    workDatabase = workDatabase2;
                    z5 = true;
                }
            }
            z5 = false;
        }
        Iterator<? extends jwj0> it = list3.iterator();
        while (it.hasNext()) {
            jwj0 next = it.next();
            owj0 owj0Var = next.b;
            UUID uuid = next.a;
            if (!z8 || z) {
                owj0Var.n = jCurrentTimeMillis;
            } else if (z3) {
                owj0Var.b = jvj0Var3;
            } else if (z2) {
                owj0Var.b = jvj0Var2;
            } else {
                owj0Var.b = jvj0.e;
            }
            if (owj0Var.b == jvj0Var5) {
                z5 = true;
            }
            pwj0 pwj0VarC3 = workDatabase.C();
            svj0Var.e.getClass();
            boolean z9 = z5;
            boolean zB = owj0Var.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            svj0 svj0Var2 = svj0Var;
            Iterator<? extends jwj0> it2 = it;
            boolean zB2 = owj0Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zB3 = owj0Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zB && zB2 && zB3) {
                String str3 = owj0Var.c;
                c.a aVar2 = new c.a();
                c cVar = owj0Var.e;
                cVar.getClass();
                aVar2.c(cVar.a);
                aVar2.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str3);
                owj0VarB = owj0.b(owj0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", aVar2.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
            } else {
                owj0VarB = owj0Var;
            }
            if (Build.VERSION.SDK_INT < 26) {
                lxa lxaVar = owj0VarB.j;
                String str4 = owj0VarB.c;
                if (Intrinsics.g(str4, ConstraintTrackingWorker.class.getName()) || !(lxaVar.e || lxaVar.f)) {
                    owj0VarB2 = owj0VarB;
                } else {
                    c.a aVar3 = new c.a();
                    c cVar2 = owj0VarB.e;
                    cVar2.getClass();
                    aVar3.c(cVar2.a);
                    aVar3.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                    owj0VarB2 = owj0.b(owj0VarB, null, null, ConstraintTrackingWorker.class.getName(), aVar3.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
                }
            } else {
                owj0VarB2 = owj0VarB;
            }
            pwj0VarC3.k(owj0VarB2);
            if (z8) {
                for (String str5 : strArr) {
                    String string = uuid.toString();
                    string.getClass();
                    workDatabase.x().c(new qmd(string, str5));
                }
            }
            lxj0 lxj0VarD = workDatabase.D();
            String string2 = uuid.toString();
            string2.getClass();
            lxj0VarD.b(string2, next.c);
            if (!z4) {
                yvj0 yvj0VarA = workDatabase.A();
                String string3 = uuid.toString();
                string3.getClass();
                yvj0VarA.a(new xvj0(str, string3));
            }
            z5 = z9;
            svj0Var = svj0Var2;
            it = it2;
        }
        z6 = true;
        z7 = z5;
        ruj0Var2 = ruj0Var;
        ruj0Var2.w = z6;
        return z7;
    }
}
