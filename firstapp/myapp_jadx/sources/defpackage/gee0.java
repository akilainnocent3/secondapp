package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class gee0 implements bee0 {
    public static final gee0 a;
    public static final /* synthetic */ gee0[] b;

    static {
        gee0 gee0Var = new gee0(PBBetHistoryItemDTO.STATUS_CANCELLED, 0);
        a = gee0Var;
        b = new gee0[]{gee0Var};
    }

    public gee0() {
        throw null;
    }

    public static void a(AtomicReference atomicReference) {
        bee0 bee0Var;
        bee0 bee0Var2 = (bee0) atomicReference.get();
        gee0 gee0Var = a;
        if (bee0Var2 == gee0Var || (bee0Var = (bee0) atomicReference.getAndSet(gee0Var)) == gee0Var || bee0Var == null) {
            return;
        }
        bee0Var.cancel();
    }

    public static void b(AtomicReference<bee0> atomicReference, AtomicLong atomicLong, long j) {
        bee0 bee0Var = atomicReference.get();
        if (bee0Var != null) {
            bee0Var.request(j);
            return;
        }
        if (e(j)) {
            ot1.a(atomicLong, j);
            bee0 bee0Var2 = atomicReference.get();
            if (bee0Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    bee0Var2.request(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, bee0 bee0Var) {
        if (d(atomicReference, bee0Var)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                bee0Var.request(andSet);
            }
        }
    }

    public static boolean d(AtomicReference<bee0> atomicReference, bee0 bee0Var) {
        yby.b(bee0Var, "s is null");
        while (!atomicReference.compareAndSet(null, bee0Var)) {
            if (atomicReference.get() != null) {
                bee0Var.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                o760.b(new e730("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(long j) {
        if (j > 0) {
            return true;
        }
        o760.b(new IllegalArgumentException(avg.a(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean f(bee0 bee0Var, bee0 bee0Var2) {
        if (bee0Var2 == null) {
            o760.b(new NullPointerException("next is null"));
            return false;
        }
        if (bee0Var == null) {
            return true;
        }
        bee0Var2.cancel();
        o760.b(new e730("Subscription already set!"));
        return false;
    }

    public static gee0 valueOf(String str) {
        return (gee0) Enum.valueOf(gee0.class, str);
    }

    public static gee0[] values() {
        return (gee0[]) b.clone();
    }

    @Override // defpackage.bee0
    public final void cancel() {
    }

    @Override // defpackage.bee0
    public final void request(long j) {
    }
}
