package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class qfd implements pm70 {
    public static final Logger f = Logger.getLogger(dvg0.class.getName());
    public final mwj0 a;
    public final Executor b;
    public final gs1 c;
    public final erg d;
    public final zoe0 e;

    public qfd(Executor executor, gs1 gs1Var, mwj0 mwj0Var, erg ergVar, zoe0 zoe0Var) {
        this.b = executor;
        this.c = gs1Var;
        this.a = mwj0Var;
        this.d = ergVar;
        this.e = zoe0Var;
    }

    @Override // defpackage.pm70
    public final void a(final ml1 ml1Var, final fi1 fi1Var, final fvg0 fvg0Var) {
        this.b.execute(new Runnable() { // from class: nfd
            @Override // java.lang.Runnable
            public final void run() {
                final qfd qfdVar = this.a;
                final ml1 ml1Var2 = ml1Var;
                String str = ml1Var2.a;
                fvg0 fvg0Var2 = fvg0Var;
                fi1 fi1Var2 = fi1Var;
                Logger logger = qfd.f;
                try {
                    nug0 nug0VarD = qfdVar.c.d(str);
                    if (nug0VarD != null) {
                        final fi1 fi1VarA = nug0VarD.a(fi1Var2);
                        qfdVar.e.f(new zoe0.a() { // from class: ofd
                            @Override // zoe0.a
                            public final Object execute() {
                                lpg lpgVar = fi1VarA;
                                qfd qfdVar2 = qfdVar;
                                erg ergVar = qfdVar2.d;
                                ml1 ml1Var3 = ml1Var2;
                                ergVar.E(ml1Var3, lpgVar);
                                qfdVar2.a.a(ml1Var3, 1);
                                return null;
                            }
                        });
                        fvg0Var2.a(null);
                    } else {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        fvg0Var2.a(new IllegalArgumentException(str2));
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    fvg0Var2.a(e);
                }
            }
        });
    }
}
