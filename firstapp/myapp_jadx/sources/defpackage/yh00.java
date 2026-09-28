package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.compose.PersonalCodeChatScreenKt$PersonalCodeChatScreen$1$1", f = "PersonalCodeChatScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yh00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ci00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh00(ci00 ci00Var, v1b<? super yh00> v1bVar) {
        super(2, v1bVar);
        this.a = ci00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yh00(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yh00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.z1(AnalyticsEvent.SOCIAL_CODECHAT_TAB_VIEW);
        return Unit.a;
    }
}
