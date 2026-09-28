package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$updateNotificationImageStatus$1", f = "SettingsFragment.kt", l = {683}, m = "invokeSuspend", v = 2)
public final class ul80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ImageView a;
    public Context b;
    public int c;
    public final /* synthetic */ hl80 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul80(v1b v1bVar, hl80 hl80Var) {
        super(2, v1bVar);
        this.d = hl80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ul80(v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ul80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        Context context;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = hl80.N;
            hl80 hl80Var = this.d;
            ImageView imageView2 = hl80Var.m0().i0;
            Context contextRequireContext = hl80Var.requireContext();
            Context contextRequireContext2 = hl80Var.requireContext();
            contextRequireContext2.getClass();
            this.a = imageView2;
            this.b = contextRequireContext;
            this.c = 1;
            Context applicationContext = contextRequireContext2.getApplicationContext();
            applicationContext.getClass();
            obj = ((l1y.a) qag.a(applicationContext, l1y.a.class)).j().a.getBoolean("notification_on", true, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            imageView = imageView2;
            context = contextRequireContext;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = this.b;
            imageView = this.a;
            uj50.b(obj);
        }
        imageView.setImageDrawable(gr0.a(context, ((Boolean) obj).booleanValue() ? R.drawable.cmn_ic_switch_dark_on : R.drawable.cmn_ic_switch_dark_off));
        return Unit.a;
    }
}
