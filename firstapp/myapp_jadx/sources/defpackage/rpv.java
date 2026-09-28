package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class rpv {
    public static final Logger c = Logger.getLogger(rpv.class.getName());
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    public final <I extends ppv> I a(final I i) {
        npv npvVarC = i.c();
        synchronized (this.a) {
            I i2 = (I) this.b.computeIfAbsent(npvVarC, new Function() { // from class: qpv
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i;
                }
            });
            if (i == i2 && c.isLoggable(Level.WARNING)) {
                ArrayList arrayList = new ArrayList(this.b.values());
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ppv ppvVar = (ppv) obj;
                    if (ppvVar != i) {
                        npv npvVarC2 = ppvVar.c();
                        if (npvVarC2.c().equalsIgnoreCase(npvVarC.c())) {
                            Logger logger = c;
                            Level level = Level.WARNING;
                            StringBuilder sb = new StringBuilder("Found duplicate metric definition: ");
                            sb.append(npvVarC2.c());
                            sb.append("\n");
                            if (npvVarC.c().equals(npvVarC.d().b())) {
                                sb.append(npvVarC.d().a.a());
                                sb.append("\n");
                            } else {
                                sb.append("\tVIEW defined\n");
                                eqa0 eqa0Var = npvVarC.a.get();
                                if (eqa0Var == null) {
                                    eqa0Var = qwx.a;
                                }
                                sb.append(eqa0Var.a());
                                sb.append("\tFROM instrument ");
                                sb.append(npvVarC.d().b());
                                sb.append("\n");
                                sb.append(npvVarC.d().a.a());
                            }
                            sb.append("Causes\n");
                            if (!npvVarC2.c().equals(npvVarC.c())) {
                                sb.append("- Name [");
                                sb.append(npvVarC.c());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.c());
                                sb.append("]\n");
                            }
                            if (!npvVarC2.b().equals(npvVarC.b())) {
                                sb.append("- Description [");
                                sb.append(npvVarC.b());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.b());
                                sb.append("]\n");
                            }
                            if (!wr.a(npvVarC2.e().b()).equals(wr.a(npvVarC.e().b()))) {
                                sb.append("- Aggregation [");
                                sb.append(wr.a(npvVarC.e().b()));
                                sb.append("] does not match [");
                                sb.append(wr.a(npvVarC2.e().b()));
                                sb.append("]\n");
                            }
                            if (!npvVarC2.d().b().equals(npvVarC.d().b())) {
                                sb.append("- InstrumentName [");
                                sb.append(npvVarC.d().b());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.d().b());
                                sb.append("]\n");
                            }
                            if (!npvVarC2.d().a().equals(npvVarC.d().a())) {
                                sb.append("- InstrumentDescription [");
                                sb.append(npvVarC.d().a());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.d().a());
                                sb.append("]\n");
                            }
                            if (!npvVarC2.d().d().equals(npvVarC.d().d())) {
                                sb.append("- InstrumentUnit [");
                                sb.append(npvVarC.d().d());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.d().d());
                                sb.append("]\n");
                            }
                            if (!npvVarC2.d().c().equals(npvVarC.d().c())) {
                                sb.append("- InstrumentType [");
                                sb.append(npvVarC.d().c());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.d().c());
                                sb.append("]\n");
                            }
                            if (!npvVarC2.d().e().equals(npvVarC.d().e())) {
                                sb.append("- InstrumentValueType [");
                                sb.append(npvVarC.d().e());
                                sb.append("] does not match [");
                                sb.append(npvVarC2.d().e());
                                sb.append("]\n");
                            }
                            if (npvVarC2.c().equals(npvVarC2.d().b())) {
                                sb.append("Original instrument registered with same name but is incompatible.\n");
                                sb.append(npvVarC2.d().a.a());
                                sb.append("\n");
                            } else {
                                sb.append("Conflicting view registered.\n");
                                eqa0 eqa0Var2 = npvVarC2.a.get();
                                if (eqa0Var2 == null) {
                                    eqa0Var2 = qwx.a;
                                }
                                sb.append(eqa0Var2.a());
                                sb.append("FROM instrument ");
                                sb.append(npvVarC2.d().b());
                                sb.append("\n");
                                sb.append(npvVarC2.d().a.a());
                                sb.append("\n");
                            }
                            logger.log(level, sb.toString());
                            break;
                        }
                    }
                }
                return i2;
            }
            return i2;
        }
    }
}
