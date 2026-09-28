package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$setTheme$1", f = "SettingsViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
public final class im80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nm80 b;
    public final /* synthetic */ ThemeConfig c;

    @c0d(c = "com.sportybet.feature.settings.SettingsViewModel$setTheme$1$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends Void>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Void> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.c) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_PUT_THEME);
                aVar.a("Put theme Success", new Object[0]);
            } else if (lk50Var instanceof lk50.a) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_PUT_THEME);
                aVar2.a(a320.a("Put theme Error: ", ((lk50.a) lk50Var).a), new Object[0]);
            } else {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_PUT_THEME);
                aVar3.a("Put theme Loading...", new Object[0]);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im80(nm80 nm80Var, ThemeConfig themeConfig, v1b<? super im80> v1bVar) {
        super(2, v1bVar);
        this.b = nm80Var;
        this.c = themeConfig;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new im80(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((im80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ThemeConfig themeConfig = this.c;
        nm80 nm80Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            nm80Var.A.c(themeConfig);
            hqa hqaVar = nm80Var.c;
            this.a = 1;
            m2l m2lVar = hqaVar.a;
            if (m2lVar.a.putInt("dark_theme", new Integer(themeConfig.ordinal()), this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        xdp xdpVar = new xdp();
        xdpVar.i("theme", themeConfig.getTheme());
        jvd0 jvd0Var = nm80Var.H;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        nm80Var.H = kzh.d(new g1i(bm50.b(nm80Var.b.t0(xdpVar.toString()), vch0.b), new a(2, null)), o8i0.d(nm80Var));
        return Unit.a;
    }
}
