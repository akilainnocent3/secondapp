package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialScreenKt$SocialContent$7$7$1", f = "PersonalSocialScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rp00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp00(Function0<Unit> function0, v1b<? super rp00> v1bVar) {
        super(2, v1bVar);
        this.a = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rp00(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rp00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke();
        return Unit.a;
    }
}
