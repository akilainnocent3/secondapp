package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class ugt implements tqa0 {
    public static final Logger b = Logger.getLogger(ugt.class.getName());
    public final AtomicBoolean a = new AtomicBoolean();

    @Deprecated
    public ugt() {
    }

    @Override // defpackage.tqa0
    public final rm8 k0(List list) {
        if (this.a.get()) {
            return rm8.f;
        }
        StringBuilder sb = new StringBuilder(60);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rqa0 rqa0Var = (rqa0) it.next();
            sb.setLength(0);
            oso osoVarC = rqa0Var.c();
            sb.append("'");
            sb.append(rqa0Var.getName());
            sb.append("' : ");
            sb.append(rqa0Var.m());
            sb.append(" ");
            sb.append(rqa0Var.k());
            sb.append(" ");
            sb.append(rqa0Var.getKind());
            sb.append(" [tracer: ");
            sb.append(osoVarC.c());
            sb.append(":");
            sb.append(osoVarC.e() == null ? "" : osoVarC.e());
            sb.append("] ");
            sb.append(rqa0Var.getAttributes());
            b.log(Level.INFO, sb.toString());
        }
        return rm8.e;
    }

    @Override // defpackage.tqa0
    public final rm8 shutdown() {
        boolean zCompareAndSet = this.a.compareAndSet(false, true);
        Logger logger = b;
        if (!zCompareAndSet) {
            logger.log(Level.INFO, "Calling shutdown() multiple times.");
            return rm8.e;
        }
        rm8 rm8Var = new rm8();
        for (Handler handler : logger.getHandlers()) {
            try {
                handler.flush();
            } catch (Throwable unused) {
                rm8Var.a(null);
            }
        }
        rm8Var.f();
        return rm8Var;
    }

    public final String toString() {
        return "LoggingSpanExporter{}";
    }
}
