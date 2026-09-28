package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
public final class q90 extends tje0 implements Function2<emn, v1b<?>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r90 c;

    public static final class a extends qlr implements Function1<Throwable, Unit> {
        public final /* synthetic */ emn a;
        public final /* synthetic */ r90 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(emn emnVar, r90 r90Var) {
            super(1);
            this.a = emnVar;
            this.b = r90Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            emn emnVar = this.a;
            synchronized (emnVar.c) {
                try {
                    emnVar.e = true;
                    duw<lyi0<l5y>> duwVar = emnVar.d;
                    lyi0<l5y>[] lyi0VarArr = duwVar.a;
                    int i = duwVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        l5y l5yVar = lyi0VarArr[i2].get();
                        if (l5yVar != null) {
                            l5yVar.a();
                        }
                    }
                    emnVar.d.g();
                    Unit unit = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ujf0 ujf0Var = this.b.b;
            ujf0Var.b.set(null);
            ujf0Var.a.b();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(r90 r90Var, v1b<? super q90> v1bVar) {
        super(2, v1bVar);
        this.c = r90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q90 q90Var = new q90(this.c, v1bVar);
        q90Var.b = obj;
        return q90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(emn emnVar, v1b<?> v1bVar) {
        ((q90) create(emnVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            emn emnVar = (emn) this.b;
            this.b = emnVar;
            this.a = 1;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            r90 r90Var = this.c;
            ujf0 ujf0Var = r90Var.b;
            rk10 rk10Var = ujf0Var.a;
            rk10Var.a();
            ujf0Var.b.set(new dkf0(ujf0Var, rk10Var));
            bc6Var.t(new a(emnVar, r90Var));
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(qUnCRF.Svy);
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
