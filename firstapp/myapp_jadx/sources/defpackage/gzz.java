package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PatronViewModel$updateDefaultGiftUseGift$1", f = "PatronViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gzz extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ hzz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzz(hzz hzzVar, v1b<? super gzz> v1bVar) {
        super(2, v1bVar);
        this.b = hzzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gzz gzzVar = new gzz(this.b, v1bVar);
        gzzVar.a = ((Boolean) obj).booleanValue();
        return gzzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((gzz) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        osa0.a(z, this.b.d, null);
        return Unit.a;
    }
}
