package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.editbet.presentation.view.EditBetHistoryPopupScreenKt$EditBetHistoryPopupScreen$1$1", f = "EditBetHistoryPopupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zmf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ enf a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmf(enf enfVar, String str, v1b<? super zmf> v1bVar) {
        super(2, v1bVar);
        this.a = enfVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zmf(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zmf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.b;
        enf enfVar = this.a;
        kzh.d(new g1i(bm50.a(new cnf(enfVar.a.h(str), enfVar)), new dnf(enfVar, null)), o8i0.d(enfVar));
        return Unit.a;
    }
}
