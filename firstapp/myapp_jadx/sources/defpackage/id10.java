package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadTopHintBanner$1", f = "PixBtgWithdrawViewModel.kt", l = {424}, m = "invokeSuspend", v = 2)
public final class id10 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id10(h hVar, v1b<? super id10> v1bVar) {
        super(1, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new id10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((id10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        h hVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            w9e w9eVar = hVar.i;
            String strValueOf = String.valueOf(hVar.F.a);
            this.a = 1;
            obj = w9eVar.e(strValueOf, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final UiText uiText = (UiText) obj;
        hVar.E1(new Function1() { // from class: hd10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return shl.a((shl) obj2, uiText, null, null, null, 62);
            }
        });
        return Unit.a;
    }
}
