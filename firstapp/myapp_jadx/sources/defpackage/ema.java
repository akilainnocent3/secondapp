package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ema implements pse, rse {
    public h1z<pse> a;
    public volatile boolean b;

    public static void e(h1z h1zVar) {
        if (h1zVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : h1zVar.d) {
            if (obj instanceof pse) {
                try {
                    ((pse) obj).dispose();
                } catch (Throwable th) {
                    qtg.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new gma(arrayList);
            }
            throw otg.c((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.rse
    public final boolean a(pse pseVar) {
        pse pseVar2;
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                h1z<pse> h1zVar = this.a;
                if (h1zVar != null) {
                    pse[] pseVarArr = h1zVar.d;
                    int i = h1zVar.a;
                    int iHashCode = pseVar.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    pse pseVar3 = pseVarArr[i2];
                    if (pseVar3 != null) {
                        if (pseVar3.equals(pseVar)) {
                            h1zVar.b(i2, i, pseVarArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                pseVar2 = pseVarArr[i2];
                                if (pseVar2 == null) {
                                }
                            } while (!pseVar2.equals(pseVar));
                            h1zVar.b(i2, i, pseVarArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T[], java.lang.Object[]] */
    @Override // defpackage.rse
    public final boolean b(pse pseVar) {
        yby.b(pseVar, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        h1z<pse> h1zVar = this.a;
                        if (h1zVar == null) {
                            h1zVar = new h1z<>();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            h1zVar.a = iNumberOfLeadingZeros - 1;
                            h1zVar.c = (int) (0.75f * iNumberOfLeadingZeros);
                            h1zVar.d = new Object[iNumberOfLeadingZeros];
                            this.a = h1zVar;
                        }
                        h1zVar.a(pseVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pseVar.dispose();
        return false;
    }

    @Override // defpackage.rse
    public final boolean c(pse pseVar) {
        if (!a(pseVar)) {
            return false;
        }
        pseVar.dispose();
        return true;
    }

    public final void d() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                h1z<pse> h1zVar = this.a;
                this.a = null;
                e(h1zVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pse
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                h1z<pse> h1zVar = this.a;
                this.a = null;
                e(h1zVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int f() {
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return 0;
                }
                h1z<pse> h1zVar = this.a;
                return h1zVar != null ? h1zVar.b : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.b;
    }
}
