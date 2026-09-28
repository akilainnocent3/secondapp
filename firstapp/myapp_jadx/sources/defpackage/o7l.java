package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class o7l implements rm70, zny, wtg {
    public static final String D = jgt.g("GreedyScheduler");
    public final ouj0 A;
    public final p5f0 B;
    public final ewf0 C;
    public final Context a;
    public final nkd c;
    public boolean d;
    public final yy20 i;
    public final qvj0 v;
    public final androidx.work.a w;
    public Boolean z;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final qpe0 f = new qpe0(new jwd0());
    public final HashMap y = new HashMap();

    public static class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public o7l(Context context, androidx.work.a aVar, vjg0 vjg0Var, yy20 yy20Var, qvj0 qvj0Var, p5f0 p5f0Var) {
        this.a = context;
        lfd lfdVar = aVar.g;
        this.c = new nkd(this, lfdVar, aVar.d);
        this.C = new ewf0(lfdVar, qvj0Var);
        this.B = p5f0Var;
        this.A = new ouj0(vjg0Var);
        this.w = aVar;
        this.i = yy20Var;
        this.v = qvj0Var;
    }

    @Override // defpackage.wtg
    public final void a(ivj0 ivj0Var, boolean z) {
        c9p c9pVar;
        iwd0 iwd0VarB = this.f.b(ivj0Var);
        if (iwd0VarB != null) {
            this.C.a(iwd0VarB);
        }
        synchronized (this.e) {
            c9pVar = (c9p) this.b.remove(ivj0Var);
        }
        if (c9pVar != null) {
            jgt.e().a(D, "Stopping tracking for " + ivj0Var);
            c9pVar.cancel((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.y.remove(ivj0Var);
        }
    }

    @Override // defpackage.rm70
    public final void b(String str) {
        Runnable runnable;
        Boolean boolValueOf = this.z;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ay20.a(this.a, this.w));
            this.z = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        String str2 = D;
        if (!zBooleanValue) {
            jgt.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.i.a(this);
            this.d = true;
        }
        jgt.e().a(str2, "Cancelling work ID " + str);
        nkd nkdVar = this.c;
        if (nkdVar != null && (runnable = (Runnable) nkdVar.c.remove(str)) != null) {
            nkdVar.b.a(runnable);
        }
        for (iwd0 iwd0Var : this.f.c(str)) {
            this.C.a(iwd0Var);
            qvj0 qvj0Var = this.v;
            qvj0Var.getClass();
            qvj0Var.a(iwd0Var, -512);
        }
    }

    @Override // defpackage.rm70
    public final void c(owj0... owj0VarArr) {
        long jMax;
        Boolean boolValueOf = this.z;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ay20.a(this.a, this.w));
            this.z = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            jgt.e().f(D, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.i.a(this);
            this.d = true;
        }
        HashSet<owj0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (owj0 owj0Var : owj0VarArr) {
            if (!this.f.a(jxj0.a(owj0Var))) {
                synchronized (this.e) {
                    try {
                        ivj0 ivj0VarA = jxj0.a(owj0Var);
                        a aVar = (a) this.y.get(ivj0VarA);
                        if (aVar == null) {
                            int i = owj0Var.k;
                            dqe0 dqe0Var = this.w.d;
                            aVar = new a(i, System.currentTimeMillis());
                            this.y.put(ivj0VarA, aVar);
                        }
                        jMax = (((long) Math.max((owj0Var.k - aVar.a) - 5, 0)) * 30000) + aVar.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(owj0Var.a(), jMax);
                dqe0 dqe0Var2 = this.w.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (owj0Var.b == jvj0.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        nkd nkdVar = this.c;
                        if (nkdVar != null) {
                            lfd lfdVar = nkdVar.b;
                            HashMap map = nkdVar.c;
                            Runnable runnable = (Runnable) map.remove(owj0Var.a);
                            if (runnable != null) {
                                lfdVar.a(runnable);
                            }
                            mkd mkdVar = new mkd(nkdVar, owj0Var);
                            map.put(owj0Var.a, mkdVar);
                            lfdVar.b(jMax2 - System.currentTimeMillis(), mkdVar);
                        }
                    } else if (owj0Var.c()) {
                        lxa lxaVar = owj0Var.j;
                        if (lxaVar.d) {
                            jgt.e().a(D, "Ignoring " + owj0Var + ". Requires device idle.");
                        } else if (lxaVar.i.isEmpty()) {
                            hashSet.add(owj0Var);
                            hashSet2.add(owj0Var.a);
                        } else {
                            jgt.e().a(D, "Ignoring " + owj0Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f.a(jxj0.a(owj0Var))) {
                        jgt.e().a(D, "Starting work for " + owj0Var.a);
                        qpe0 qpe0Var = this.f;
                        qpe0Var.getClass();
                        iwd0 iwd0VarD = qpe0Var.d(jxj0.a(owj0Var));
                        this.C.b(iwd0VarD);
                        this.v.b(iwd0VarD, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    jgt.e().a(D, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (owj0 owj0Var2 : hashSet) {
                        ivj0 ivj0VarA2 = jxj0.a(owj0Var2);
                        if (!this.b.containsKey(ivj0VarA2)) {
                            this.b.put(ivj0VarA2, quj0.a(this.A, owj0Var2, this.B.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.zny
    public final void d(owj0 owj0Var, rxa rxaVar) {
        ivj0 ivj0VarA = jxj0.a(owj0Var);
        boolean z = rxaVar instanceof rxa.a;
        qvj0 qvj0Var = this.v;
        ewf0 ewf0Var = this.C;
        String str = D;
        qpe0 qpe0Var = this.f;
        if (z) {
            if (qpe0Var.a(ivj0VarA)) {
                return;
            }
            jgt.e().a(str, "Constraints met: Scheduling work ID " + ivj0VarA);
            iwd0 iwd0VarD = qpe0Var.d(ivj0VarA);
            ewf0Var.b(iwd0VarD);
            qvj0Var.b(iwd0VarD, null);
            return;
        }
        jgt.e().a(str, "Constraints not met: Cancelling work ID " + ivj0VarA);
        iwd0 iwd0VarB = qpe0Var.b(ivj0VarA);
        if (iwd0VarB != null) {
            ewf0Var.a(iwd0VarB);
            qvj0Var.a(iwd0VarB, ((rxa.b) rxaVar).a);
        }
    }

    @Override // defpackage.rm70
    public final boolean e() {
        return false;
    }
}
