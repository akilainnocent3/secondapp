package defpackage;

import com.sportygames.campaign.remote.TournamentInterface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ko0 implements uzm {
    public final k52 a;
    public final TournamentInterface b;

    public ko0(k52 k52Var, TournamentInterface tournamentInterface) {
        k52Var.getClass();
        tournamentInterface.getClass();
        this.a = k52Var;
        this.b = tournamentInterface;
    }

    public static hk50 c(ik50 ik50Var) {
        if (ik50Var instanceof ik50.c) {
            return new hk50.c(((ik50.c) ik50Var).a);
        }
        if (ik50Var instanceof ik50.a) {
            ik50.a aVar = (ik50.a) ik50Var;
            return new hk50.a(aVar.a, aVar.b);
        }
        if (Intrinsics.g(ik50Var, ik50.b.a)) {
            return hk50.b.a;
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.uzm
    public final Object a(long j, x1b x1bVar) {
        ho0 ho0Var;
        if (x1bVar instanceof ho0) {
            ho0Var = (ho0) x1bVar;
            int i = ho0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho0Var.d = i - Integer.MIN_VALUE;
            } else {
                ho0Var = new ho0(this, x1bVar);
            }
        } else {
            ho0Var = new ho0(this, x1bVar);
        }
        Object objA = ho0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ho0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            io0 io0Var = new io0(this, j, null);
            ho0Var.a = this;
            ho0Var.d = 1;
            objA = this.a.a(oddVar, io0Var, ho0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ho0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return c((ik50) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.uzm
    public final Object b(long j, x1b x1bVar) {
        rn0 rn0Var;
        if (x1bVar instanceof rn0) {
            rn0Var = (rn0) x1bVar;
            int i = rn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn0Var.d = i - Integer.MIN_VALUE;
            } else {
                rn0Var = new rn0(this, x1bVar);
            }
        } else {
            rn0Var = new rn0(this, x1bVar);
        }
        Object objA = rn0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = rn0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            sn0 sn0Var = new sn0(this, j, null);
            rn0Var.a = this;
            rn0Var.d = 1;
            objA = this.a.a(oddVar, sn0Var, rn0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = rn0Var.a;
            uj50.b(objA);
        }
        this.getClass();
        return c((ik50) objA);
    }
}
