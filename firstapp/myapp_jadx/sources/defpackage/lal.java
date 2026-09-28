package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class lal {
    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    public static final int a(xdp xdpVar, String str, int i) {
        Object bVar;
        xdpVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            tcp tcpVarJ = xdpVar.j(str);
            if (tcpVarJ == null) {
                bVar = null;
            } else {
                if (!(tcpVarJ instanceof cep)) {
                    tcpVarJ = null;
                }
                if (tcpVarJ != null) {
                    bVar = Integer.valueOf(tcpVarJ.b());
                } else {
                    bVar = null;
                }
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Integer num = (Integer) (bVar instanceof zi50.b ? null : bVar);
        return num != null ? num.intValue() : i;
    }

    public static final String b(xdp xdpVar, String str) {
        xdpVar.getClass();
        tcp tcpVarJ = xdpVar.j(str);
        if (tcpVarJ != null) {
            if (!(tcpVarJ instanceof cep)) {
                tcpVarJ = null;
            }
            if (tcpVarJ != null) {
                return tcpVarJ.f();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object c(x1b x1bVar) {
        Object obj;
        Object obj2;
        Object obj3;
        CoroutineContext context = x1bVar.getContext();
        i9p.e(context);
        v1b v1bVarB = yzo.b(x1bVar);
        yre yreVar = v1bVarB instanceof yre ? (yre) v1bVarB : null;
        if (yreVar != null) {
            k5b k5bVar = yreVar.d;
            if (!zre.d(k5bVar, context)) {
                s8k0 s8k0Var = new s8k0();
                CoroutineContext coroutineContextPlus = context.plus(s8k0Var);
                obj = Unit.a;
                yreVar.f = obj;
                yreVar.c = 1;
                k5bVar.e0(coroutineContextPlus, yreVar);
                if (s8k0Var.a) {
                    tpg tpgVarA = xof0.a();
                    gx0<bse<?>> gx0Var = tpgVarA.d;
                    if (!(gx0Var != null ? gx0Var.isEmpty() : true)) {
                        if (tpgVarA.b >= 4294967296L) {
                            yreVar.f = obj;
                            yreVar.c = 1;
                            tpgVarA.l0(yreVar);
                            obj3 = y5b.a;
                        } else {
                            tpgVarA.n0(true);
                            try {
                                yreVar.run();
                                do {
                                } while (tpgVarA.z0());
                            } catch (Throwable th) {
                                try {
                                    yreVar.f(th);
                                } catch (Throwable th2) {
                                    tpgVarA.h0(true);
                                    throw th2;
                                }
                            }
                            tpgVarA.h0(true);
                        }
                    }
                    obj3 = Unit.a;
                } else {
                    obj2 = obj;
                }
                if (obj3 == y5b.a) {
                    return obj3;
                }
                return obj;
            }
            Unit unit = Unit.a;
            yreVar.f = unit;
            yreVar.c = 1;
            k5bVar.e0(context, yreVar);
            obj2 = unit;
            obj = obj2;
            obj3 = y5b.a;
            if (obj3 == y5b.a) {
                return obj3;
            }
            return obj;
        }
        obj3 = Unit.a;
        obj = obj3;
        if (obj3 == y5b.a) {
            return obj3;
        }
        return obj;
    }
}
