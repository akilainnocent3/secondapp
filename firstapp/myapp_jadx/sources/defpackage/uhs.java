package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class uhs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qis b;
    public final /* synthetic */ vhs c;

    public uhs(vhs vhsVar, int i, qis qisVar) {
        this.c = vhsVar;
        this.a = i;
        this.b = qisVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        nv5.a aVar;
        ArrayList arrayList;
        int i = this.a;
        qis qisVar = this.b;
        vhs vhsVar = this.c;
        boolean z = vhsVar.c;
        AtomicInteger atomicInteger = vhsVar.d;
        ArrayList arrayList2 = vhsVar.b;
        if (vhsVar.isDone() || arrayList2 == null) {
            km20.g("Future was done before all dependencies completed", z);
            return;
        }
        try {
            try {
                try {
                    km20.g("Tried to set value from future which is not done", qisVar.isDone());
                    arrayList2.set(i, obj.b(qisVar));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    km20.g("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList3 = vhsVar.b;
                        if (arrayList3 != null) {
                            vhsVar.f.b(new ArrayList(arrayList3));
                        } else {
                            km20.g(null, vhsVar.isDone());
                        }
                    }
                } catch (RuntimeException e) {
                    if (z) {
                        vhsVar.f.d(e);
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    km20.g("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        ArrayList arrayList4 = vhsVar.b;
                        if (arrayList4 != null) {
                            aVar = vhsVar.f;
                            arrayList = new ArrayList(arrayList4);
                            aVar.b(arrayList);
                            return;
                        }
                        km20.g(null, vhsVar.isDone());
                    }
                } catch (ExecutionException e2) {
                    if (z) {
                        vhsVar.f.d(e2.getCause());
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    km20.g("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        ArrayList arrayList5 = vhsVar.b;
                        if (arrayList5 != null) {
                            aVar = vhsVar.f;
                            arrayList = new ArrayList(arrayList5);
                            aVar.b(arrayList);
                            return;
                        }
                        km20.g(null, vhsVar.isDone());
                    }
                }
            } catch (Error e3) {
                vhsVar.f.d(e3);
                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                km20.g("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                if (iDecrementAndGet4 == 0) {
                    ArrayList arrayList6 = vhsVar.b;
                    if (arrayList6 != null) {
                        aVar = vhsVar.f;
                        arrayList = new ArrayList(arrayList6);
                        aVar.b(arrayList);
                        return;
                    }
                    km20.g(null, vhsVar.isDone());
                }
            } catch (CancellationException unused) {
                if (z) {
                    vhsVar.cancel(false);
                }
                int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                km20.g("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                if (iDecrementAndGet5 == 0) {
                    ArrayList arrayList7 = vhsVar.b;
                    if (arrayList7 != null) {
                        aVar = vhsVar.f;
                        arrayList = new ArrayList(arrayList7);
                        aVar.b(arrayList);
                        return;
                    }
                    km20.g(null, vhsVar.isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = atomicInteger.decrementAndGet();
            km20.g("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
            if (iDecrementAndGet6 == 0) {
                ArrayList arrayList8 = vhsVar.b;
                if (arrayList8 != null) {
                    vhsVar.f.b(new ArrayList(arrayList8));
                } else {
                    km20.g(null, vhsVar.isDone());
                }
            }
            throw th;
        }
    }
}
