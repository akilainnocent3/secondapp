package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.LegacyBetBuilderUtil$tutorialDisplayed$1", f = "LegacyBetBuilderUtil.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class w4s extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ x4s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4s(x4s x4sVar, v1b<? super w4s> v1bVar) {
        super(2, v1bVar);
        this.b = x4sVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w4s(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((w4s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        m2l m2lVar = this.b.a;
        this.a = 1;
        Object obj2 = m2lVar.a.getBoolean("pref_key_iv_bet_builder_tutorial_show", false, this);
        return obj2 == y5bVar ? y5bVar : obj2;
    }
}
