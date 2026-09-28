package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$showTwoFAHint$1", f = "SettingsFragment.kt", l = {909}, m = "invokeSuspend", v = 2)
public final class sl80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hl80 b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl80(hl80 hl80Var, View view, v1b<? super sl80> v1bVar) {
        super(2, v1bVar);
        this.b = hl80Var;
        this.c = view;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sl80(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sl80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(200L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final hl80 hl80Var = this.b;
        Function0<Unit> function0 = new Function0() { // from class: rl80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Intent intent;
                Bundle extras;
                ohp<Object>[] ohpVarArr = hl80.N;
                hl80 hl80Var2 = hl80Var;
                nm80 nm80VarP0 = hl80Var2.p0();
                ej5.c(o8i0.d(nm80VarP0), null, null, new mm80(nm80VarP0, null), 3);
                e activity = hl80Var2.getActivity();
                if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
                    extras.remove("show_two_fa_hint");
                }
                return Unit.a;
            }
        };
        ohp<Object>[] ohpVarArr = hl80.N;
        hl80Var.r0(this.c, R.string.component_two_fa__enable_2_step_verification_to_protect_your_account, function0);
        return Unit.a;
    }
}
