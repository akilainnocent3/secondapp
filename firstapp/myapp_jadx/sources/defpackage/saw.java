package defpackage;

import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.bet.MultiLevelBetContainerBonusHostKt$MultiLevelBetContainerBonusHost$2$1", f = "MultiLevelBetContainerBonusHost.kt", l = {}, m = "invokeSuspend", v = 1)
public final class saw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ long B;
    public final /* synthetic */ uaw a;
    public final /* synthetic */ dnb0 b;
    public final /* synthetic */ BetContainerState c;
    public final /* synthetic */ BetContainerState d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Double w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saw(uaw uawVar, dnb0 dnb0Var, BetContainerState betContainerState, BetContainerState betContainerState2, String str, long j, boolean z, boolean z2, Double d, boolean z3, boolean z4, boolean z5, long j2, v1b<? super saw> v1bVar) {
        super(2, v1bVar);
        this.a = uawVar;
        this.b = dnb0Var;
        this.c = betContainerState;
        this.d = betContainerState2;
        this.e = str;
        this.f = j;
        this.i = z;
        this.v = z2;
        this.w = d;
        this.y = z3;
        this.z = z4;
        this.A = z5;
        this.B = j2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new saw(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((saw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qaw qawVarB = taw.b(this.c);
        qaw qawVarB2 = taw.b(this.d);
        uaw uawVar = this.a;
        uawVar.getClass();
        String str = this.e;
        str.getClass();
        boolean z = this.w != null;
        long jU = ((v5a0) uawVar.getR()).u();
        long j = this.f;
        if (jU > 0 && j != jU) {
            ((v5a0) uawVar.getR()).K(-1L);
        }
        boolean z2 = ((v5a0) uawVar.getR()).u() > 0 && j == ((v5a0) uawVar.getR()).u();
        if (this.A) {
            ((x5a0) uawVar.P()).setValue(Boolean.FALSE);
            ((v5a0) uawVar.getR()).K(j);
        } else {
            long j2 = this.B;
            boolean z3 = this.v;
            if (j2 <= 0) {
                ((x5a0) uawVar.V0()).setValue(Boolean.FALSE);
            } else if (str.equals("ROUND_WAITING") && j != j2) {
                ((x5a0) uawVar.V0()).setValue(Boolean.FALSE);
            } else if (z && z3 && j == j2 && (str.equals("ROUND_ONGOING") || str.equals("ROUND_END_WAIT"))) {
                ((x5a0) uawVar.V0()).setValue(Boolean.TRUE);
            }
            if (!this.y) {
                boolean z4 = this.i;
                if (z4) {
                    ((x5a0) uawVar.P()).setValue(Boolean.TRUE);
                } else {
                    dnb0 dnb0Var = this.b;
                    if (!this.z && !z2 && z && ((((Boolean) ((x5a0) dnb0Var.z1()).getValue()).booleanValue() || z3) && (str.equals("ROUND_WAITING") || str.equals("ROUND_PRE_START") || str.equals("ROUND_ONGOING") || str.equals("ROUND_END_WAIT")))) {
                        ((x5a0) uawVar.P()).setValue(Boolean.TRUE);
                    } else if (!z3 && !z4 && !((Boolean) ((x5a0) dnb0Var.z1()).getValue()).booleanValue() && !qawVarB.a && !qawVarB2.a && !z) {
                        ytw<Boolean> ytwVarP = uawVar.P();
                        Boolean bool = Boolean.FALSE;
                        ((x5a0) ytwVarP).setValue(bool);
                        ((x5a0) uawVar.V0()).setValue(bool);
                    }
                }
            }
        }
        return Unit.a;
    }
}
