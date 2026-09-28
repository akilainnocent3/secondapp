package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$fetchProfile$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p130 extends tje0 implements Function2<lk50<? extends AccountInfo>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ a230 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p130(a230 a230Var, v1b<? super p130> v1bVar) {
        super(2, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p130 p130Var = new p130(this.b, v1bVar);
        p130Var.a = obj;
        return p130Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends AccountInfo> lk50Var, v1b<? super Unit> v1bVar) {
        return ((p130) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        wwd0 wwd0Var = this.b.z;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, j130.a((j130) value3, (AccountInfo) ((lk50.c) lk50Var).a, null, null, false, null, false, false, false, null, 446)));
        } else if (lk50Var instanceof lk50.b) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, j130.a((j130) value2, null, null, null, false, null, false, true, false, null, 447)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, null, false, false, true, null, 319)));
        }
        return Unit.a;
    }
}
