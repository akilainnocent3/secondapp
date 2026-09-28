package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class xse implements pse {
    public static final xse a;
    public static final /* synthetic */ xse[] b;

    static {
        xse xseVar = new xse("DISPOSED", 0);
        a = xseVar;
        b = new xse[]{xseVar};
    }

    public xse() {
        throw null;
    }

    public static void a(AtomicReference atomicReference) {
        pse pseVar;
        pse pseVar2 = (pse) atomicReference.get();
        xse xseVar = a;
        if (pseVar2 == xseVar || (pseVar = (pse) atomicReference.getAndSet(xseVar)) == xseVar || pseVar == null) {
            return;
        }
        pseVar.dispose();
    }

    public static boolean b(pse pseVar) {
        return pseVar == a;
    }

    public static void c(AtomicReference atomicReference, pse pseVar) {
        while (true) {
            pse pseVar2 = (pse) atomicReference.get();
            if (pseVar2 != a) {
                while (!atomicReference.compareAndSet(pseVar2, pseVar)) {
                    if (atomicReference.get() != pseVar2) {
                    }
                }
                return;
            } else {
                if (pseVar != null) {
                    pseVar.dispose();
                    return;
                }
                return;
            }
        }
    }

    public static boolean d(AtomicReference<pse> atomicReference, pse pseVar) {
        yby.b(pseVar, "d is null");
        while (!atomicReference.compareAndSet(null, pseVar)) {
            if (atomicReference.get() != null) {
                pseVar.dispose();
                if (atomicReference.get() == a) {
                    return false;
                }
                o760.b(new e730("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(pse pseVar, pse pseVar2) {
        if (pseVar2 == null) {
            o760.b(new NullPointerException("next is null"));
            return false;
        }
        if (pseVar == null) {
            return true;
        }
        pseVar2.dispose();
        o760.b(new e730("Disposable already set!"));
        return false;
    }

    public static xse valueOf(String str) {
        return (xse) Enum.valueOf(xse.class, str);
    }

    public static xse[] values() {
        return (xse[]) b.clone();
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return true;
    }

    @Override // defpackage.pse
    public final void dispose() {
    }
}
