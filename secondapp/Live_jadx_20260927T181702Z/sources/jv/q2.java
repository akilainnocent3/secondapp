package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.f1
public class q2 extends v2 implements a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f100868d;

    public q2(@oy.m o2 o2Var) {
        super(true);
        V0(o2Var);
        this.f100868d = I1();
    }

    @Override // jv.v2
    public boolean H0() {
        return this.f100868d;
    }

    public final boolean I1() {
        v2 v2VarC;
        u uVarN0 = N0();
        v vVar = uVarN0 instanceof v ? (v) uVarN0 : null;
        if (vVar != null && (v2VarC = vVar.C()) != null) {
            while (!v2VarC.H0()) {
                u uVarN1 = v2VarC.N0();
                v vVar2 = uVarN1 instanceof v ? (v) uVarN1 : null;
                if (vVar2 == null || (v2VarC = vVar2.C()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // jv.v2
    public boolean K0() {
        return true;
    }

    @Override // jv.a0
    public boolean c(@oy.l Throwable th2) {
        return e1(new c0(th2, false, 2, null));
    }

    @Override // jv.a0
    public boolean l() {
        return e1(dr.w2.f79517a);
    }
}
