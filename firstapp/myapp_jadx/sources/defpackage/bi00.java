package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.PersonalCodeChatViewModel$onToggleSelection$1", f = "PersonalCodeChatViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bi00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ci00 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi00(ci00 ci00Var, String str, v1b<? super bi00> v1bVar) {
        super(2, v1bVar);
        this.a = ci00Var;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bi00(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bi00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashSet linkedHashSetD0;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.f;
        do {
            value = wwd0Var.getValue();
            linkedHashSetD0 = CollectionsKt.D0((Set) value);
            String str = this.b;
            if (!linkedHashSetD0.add(str)) {
                linkedHashSetD0.remove(str);
            }
        } while (!wwd0Var.g(value, linkedHashSetD0));
        return Unit.a;
    }
}
