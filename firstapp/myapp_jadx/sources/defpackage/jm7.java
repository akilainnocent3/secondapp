package defpackage;

import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.ChooseBetActivity$initViewModel$1", f = "ChooseBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jm7 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ ChooseBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(ChooseBetActivity chooseBetActivity, v1b<? super jm7> v1bVar) {
        super(2, v1bVar);
        this.b = chooseBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jm7 jm7Var = new jm7(this.b, v1bVar);
        jm7Var.a = ((Boolean) obj).booleanValue();
        return jm7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((jm7) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zfd0 zfd0Var = this.b.b;
        if (zfd0Var != null) {
            zfd0Var.b.setEnabled(z);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
