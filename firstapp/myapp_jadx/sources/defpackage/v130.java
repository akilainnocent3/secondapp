package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$modifyBirthday$1", f = "ProfileViewModel.kt", l = {289}, m = "invokeSuspend", v = 2)
public final class v130 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a230 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v130(a230 a230Var, long j, v1b<? super v130> v1bVar) {
        super(2, v1bVar);
        this.c = a230Var;
        this.d = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v130 v130Var = new v130(this.c, this.d, v1bVar);
        v130Var.b = obj;
        return v130Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((v130) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        j130 j130Var;
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        a230 a230Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            ku90<lk50<Unit>> ku90Var = a230Var.A;
            this.b = lk50Var;
            this.a = 1;
            if (ku90Var.a.emit(lk50Var, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (lk50Var instanceof lk50.c) {
            wwd0 wwd0Var = a230Var.z;
            do {
                value = wwd0Var.getValue();
                j130Var = (j130) value;
            } while (!wwd0Var.g(value, j130.a(j130Var, null, null, null, false, gwe.a(j130Var.e, bwf0.o((6 & 4) != 0 ? 0 : 1, this.d, false), false, eye.a, false, 8), false, false, false, null, 495)));
        }
        return Unit.a;
    }
}
