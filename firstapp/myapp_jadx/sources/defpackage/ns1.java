package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ns1 extends d.c implements qcf, mfy, ya80 {
    public long D;
    public ya5 E;
    public float F;
    public qx80 G;
    public long H;
    public asr I;
    public b9z J;
    public qx80 K;
    public b9z L;

    @Override // defpackage.qcf
    public final void A(final wsr wsrVar) {
        b9z b9zVar;
        ya5 ya5Var;
        bxz bxzVar;
        qc6 qc6Var = wsrVar.a;
        if (this.G == zk40.a) {
            if (!nbh0.a(this.D, j58.m)) {
                tcf.m0(wsrVar, this.D, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
            }
            ya5 ya5Var2 = this.E;
            if (ya5Var2 != null) {
                tcf.V1(wsrVar, ya5Var2, 0L, 0L, this.F, null, null, 0, 118);
            }
        } else {
            if (yw90.a(qc6Var.d(), this.H) && wsrVar.getLayoutDirection() == this.I && Intrinsics.g(this.K, this.G)) {
                b9zVar = this.J;
                b9zVar.getClass();
            } else {
                nfy.a(this, new Function0() { // from class: ms1
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ns1 ns1Var = this.a;
                        qx80 qx80Var = ns1Var.G;
                        wsr wsrVar2 = wsrVar;
                        ns1Var.L = qx80Var.a(wsrVar2.a.d(), wsrVar2.getLayoutDirection(), wsrVar2);
                        return Unit.a;
                    }
                });
                b9zVar = this.L;
                this.L = null;
            }
            this.J = b9zVar;
            this.H = qc6Var.d();
            this.I = wsrVar.getLayoutDirection();
            this.K = this.G;
            b9zVar.getClass();
            if (!nbh0.a(this.D, j58.m)) {
                c9z.b(wsrVar, b9zVar, this.D);
            }
            ya5 ya5Var3 = this.E;
            if (ya5Var3 != null) {
                float f = this.F;
                rlh rlhVar = rlh.a;
                if (b9zVar instanceof b9z.b) {
                    lk40 lk40Var = ((b9z.b) b9zVar).a;
                    float f2 = lk40Var.a;
                    wsrVar.a2(ya5Var3, (4294967295L & ((long) Float.floatToRawIntBits(lk40Var.b))) | (Float.floatToRawIntBits(f2) << 32), c9z.c(lk40Var), f, rlhVar, null, 3);
                } else {
                    if (b9zVar instanceof b9z.c) {
                        b9z.c cVar = (b9z.c) b9zVar;
                        bxzVar = cVar.b;
                        if (bxzVar != null) {
                            ya5Var = ya5Var3;
                        } else {
                            ya5Var = ya5Var3;
                            lz50 lz50Var = cVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (lz50Var.h >> 32));
                            float f3 = lz50Var.a;
                            wsrVar.B0(ya5Var, (((long) Float.floatToRawIntBits(lz50Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (((long) Float.floatToRawIntBits(lz50Var.b())) << 32) | (((long) Float.floatToRawIntBits(lz50Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f, rlhVar, null, 3);
                        }
                    } else if (!(b9zVar instanceof b9z.a)) {
                        uhc.a();
                        return;
                    } else {
                        ya5Var = ya5Var3;
                        bxzVar = ((b9z.a) b9zVar).a;
                    }
                    wsrVar.N1(bxzVar, ya5Var, f, rlhVar, null, 3);
                }
            }
        }
        wsrVar.b2();
    }

    @Override // defpackage.ya80
    public final boolean E() {
        return false;
    }

    @Override // defpackage.mfy
    public final void t0() {
        this.H = 9205357640488583168L;
        this.I = null;
        this.J = null;
        this.K = null;
        rcf.a(this);
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
    }
}
