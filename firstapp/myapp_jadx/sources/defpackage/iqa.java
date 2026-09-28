package defpackage;

import android.content.Context;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.domain.ConfigureDarkModeSettingsUseCase$applyTheme$1$onSuccess$1", f = "ConfigureDarkModeSettingsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iqa extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ hqa a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqa(hqa hqaVar, int i, Context context, v1b<? super iqa> v1bVar) {
        super(2, v1bVar);
        this.a = hqaVar;
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iqa(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iqa) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ThemeConfig themeConfigInvoke = ThemeConfig.INSTANCE.invoke(this.b);
        this.a.getClass();
        hqa.c(this.c, themeConfigInvoke);
        return Unit.a;
    }
}
