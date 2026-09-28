package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PatronViewModel$loadDefaultGiftUseGift$1", f = "PatronViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fzz extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hzz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzz(hzz hzzVar, v1b<? super fzz> v1bVar) {
        super(2, v1bVar);
        this.b = hzzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fzz fzzVar = new fzz(this.b, v1bVar);
        fzzVar.a = obj;
        return fzzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        return ((fzz) create(bool, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Boolean bool = (Boolean) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.d.setValue(bool);
        return Unit.a;
    }
}
