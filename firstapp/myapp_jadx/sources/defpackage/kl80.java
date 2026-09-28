package defpackage;

import android.content.Context;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$collectSetThemeAction$1", f = "SettingsFragment.kt", l = {816}, m = "invokeSuspend", v = 2)
public final class kl80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hl80 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ hl80 a;

        public a(hl80 hl80Var) {
            this.a = hl80Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ThemeConfig themeConfig = (ThemeConfig) obj;
            hl80 hl80Var = this.a;
            Context contextRequireContext = hl80Var.requireContext();
            contextRequireContext.getClass();
            themeConfig.getClass();
            hl80Var.f.a(contextRequireContext, themeConfig);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl80(v1b v1bVar, hl80 hl80Var) {
        super(2, v1bVar);
        this.b = hl80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kl80(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kl80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = hl80.N;
            hl80 hl80Var = this.b;
            o67 o67Var = hl80Var.p0().B;
            a aVar = new a(hl80Var);
            this.a = 1;
            if (o67Var.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
