package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$onboardingDoneSetup$1", f = "CrashFragment.kt", l = {3660}, m = "invokeSuspend", v = 1)
public final class zgb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public fgb a;
    public int b;
    public final /* synthetic */ fgb c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(fgb fgbVar, boolean z, v1b<? super zgb> v1bVar) {
        super(2, v1bVar);
        this.c = fgbVar;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zgb(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zgb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fgb fgbVar = this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (fgbVar.getContext() != null) {
                    boolean z = this.d;
                    if (!z) {
                        fgbVar.Y0().A1(false);
                    }
                    z52 z52Var = fgbVar.X1;
                    if (z52Var == null) {
                        Intrinsics.n("gameStrings");
                        throw null;
                    }
                    String strA = z52Var.a();
                    op5 op5Var = op5.a;
                    String string = fgbVar.getString(R.string.finding_you_room_cms);
                    string.getClass();
                    op5Var.getClass();
                    ((x5a0) fgbVar.c1().H).setValue(op5.b(string, strA, null));
                    ((x5a0) fgbVar.c1().K).setValue(new j58(fgbVar.b1().J0()));
                    ((x5a0) fgbVar.c1().L).setValue(new j58(fgbVar.b1().M0()));
                    if (!z) {
                        this.a = fgbVar;
                        this.b = 1;
                        if (hkd.b(200L, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fgbVar = this.a;
            uj50.b(obj);
            fgbVar.Y0().A1(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
