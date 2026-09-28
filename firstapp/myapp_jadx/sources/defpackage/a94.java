package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsScreenKt$BioAuthSettingsScreen$8$1", f = "BioAuthSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ d94 a;
    public final /* synthetic */ Function1<gc4, Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a94(d94 d94Var, Function1<? super gc4, Unit> function1, Function0<Unit> function0, v1b<? super a94> v1bVar) {
        super(2, v1bVar);
        this.a = d94Var;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a94(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gc4 gc4Var = this.a.e;
        if (gc4Var != gc4.None) {
            this.b.invoke(gc4Var);
            this.c.invoke();
        }
        return Unit.a;
    }
}
