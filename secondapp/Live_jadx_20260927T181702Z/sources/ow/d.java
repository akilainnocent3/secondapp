package ow;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    @l
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        u1 u1Var = u1.f102789a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        m0.o(str2, "format(...)");
        return str2;
    }

    public static final void c(Logger logger, c cVar, e eVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.h());
        sb2.append(' ');
        u1 u1Var = u1.f102789a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        m0.o(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(cVar.b());
        logger.fine(sb2.toString());
    }

    public static final <T> T d(@l Logger logger, @l c task, @l e queue, @l ds.a<? extends T> block) {
        long jNanoTime;
        m0.p(logger, "<this>");
        m0.p(task, "task");
        m0.p(queue, "queue");
        m0.p(block, "block");
        boolean zIsLoggable = logger.isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.k().j().nanoTime();
            c(logger, task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            j0.d(1);
            if (zIsLoggable) {
                long jNanoTime2 = queue.k().j().nanoTime() - jNanoTime;
                new StringBuilder().append("finished run in ");
            }
            return tInvoke;
        } finally {
            j0.d(1);
            if (zIsLoggable) {
                c(logger, task, queue, "failed a run in " + b(queue.k().j().nanoTime() - jNanoTime));
            }
            j0.c(1);
        }
    }

    public static final void e(@l Logger logger, @l c task, @l e queue, @l ds.a<String> messageBlock) {
        m0.p(logger, "<this>");
        m0.p(task, "task");
        m0.p(queue, "queue");
        m0.p(messageBlock, "messageBlock");
        if (logger.isLoggable(Level.FINE)) {
            c(logger, task, queue, messageBlock.invoke());
        }
    }
}
