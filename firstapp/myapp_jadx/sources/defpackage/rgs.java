package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes8.dex */
public final class rgs implements pse, rse {
    public LinkedList a;
    public volatile boolean b;

    @Override // defpackage.rse
    public final boolean a(pse pseVar) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                LinkedList linkedList = this.a;
                if (linkedList != null && linkedList.remove(pseVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rse
    public final boolean b(pse pseVar) {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(pseVar);
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
        ((om70) pseVar).dispose();
        return true;
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
                LinkedList linkedList = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((pse) it.next()).dispose();
                    } catch (Throwable th) {
                        qtg.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new gma(arrayList);
                    }
                    throw otg.c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.b;
    }
}
