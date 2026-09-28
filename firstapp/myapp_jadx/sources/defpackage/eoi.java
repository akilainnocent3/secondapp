package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyskills.components.FootballerJugglingComponentKt$FootballerJugglingComponent$3$1", f = "FootballerJugglingComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class eoi extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoi(ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eoi(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eoi) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        doi.c(this.a, this.b);
        return Unit.a;
    }
}
