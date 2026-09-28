package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class jj80 extends tje0 implements Function2<yf80, v1b<? super yf80>, Object> {
    public final /* synthetic */ yf80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj80(yf80 yf80Var, v1b<? super jj80> v1bVar) {
        super(2, v1bVar);
        this.a = yf80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jj80(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yf80 yf80Var, v1b<? super yf80> v1bVar) {
        return ((jj80) create(yf80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.a;
    }
}
