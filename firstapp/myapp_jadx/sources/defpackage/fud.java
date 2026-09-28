package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$requestSetDefault$1", f = "DepositCardViewModel.kt", l = {566, 567}, m = "invokeSuspend", v = 2)
public final class fud extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public tud a;
    public AssetData.CardsBean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tud e;
    public final /* synthetic */ AssetData.CardsBean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fud(v1b v1bVar, tud tudVar, AssetData.CardsBean cardsBean) {
        super(2, v1bVar);
        this.e = tudVar;
        this.f = cardsBean;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fud fudVar = new fud(v1bVar, this.e, this.f);
        fudVar.d = obj;
        return fudVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fud) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        String cardNumber;
        String strA;
        tud tudVar;
        AssetData.CardsBean cardsBean;
        AssetData.CardsBean cardsBean2;
        tud tudVar2;
        String cardNumber2;
        String strReplace;
        tud tudVar3 = this.e;
        ku90<eg6> ku90Var = tudVar3.g1;
        y5b y5bVar = y5b.a;
        int i = this.c;
        String str = "--";
        AssetData.CardsBean cardsBean3 = this.f;
        try {
            if (i == 0) {
                uj50.b(obj);
                ku90Var.a(eg6.c.a);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = tudVar3.s0;
                int id = cardsBean3.getId();
                this.d = null;
                this.a = tudVar3;
                this.b = cardsBean3;
                this.c = 1;
                if (sr10Var.S(id, 1, 1, this) != y5bVar) {
                    tudVar = tudVar3;
                    cardsBean = cardsBean3;
                }
                return y5bVar;
            }
            if (i == 1) {
                cardsBean = this.b;
                tudVar = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cardsBean2 = this.b;
                tudVar2 = this.a;
                uj50.b(obj);
            }
            ku90<a> ku90Var2 = tudVar2.f;
            cardNumber2 = cardsBean2.getCardNumber();
            if (cardNumber2 != null || (strReplace = new Regex("\\d(?=\\d{4})").replace(cardNumber2, "*")) == null) {
                strReplace = "--";
            }
            StringUiText stringUiText = vch0.a;
            b.i(ku90Var2, new ResourceUiText(R.string.page_payment__successfully_set_vcard_as_the_default_card, ay0.S(new Object[]{strReplace})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            bVar = Boolean.valueOf(tudVar2.g1.a.a(eg6.a.a));
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.e(thA);
                ku90<a> ku90Var3 = tudVar3.f;
                cardNumber = cardsBean3.getCardNumber();
                if (cardNumber != null && (strA = fu5.a("\\d(?=\\d{4})", cardNumber, "*")) != null) {
                    str = strA;
                }
                StringUiText stringUiText2 = vch0.a;
                b.i(ku90Var3, new ResourceUiText(R.string.page_payment__failed_to_change_vcard_as_the_default_card, ay0.S(new Object[]{str})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                ku90Var.a(eg6.b.a);
            }
            return Unit.a;
            jvd0 jvd0VarV1 = tudVar.V1();
            this.d = null;
            this.a = tudVar;
            this.b = cardsBean;
            this.c = 2;
            if (jvd0VarV1.join(this) != y5bVar) {
                cardsBean2 = cardsBean;
                tudVar2 = tudVar;
                ku90<a> ku90Var4 = tudVar2.f;
                cardNumber2 = cardsBean2.getCardNumber();
                if (cardNumber2 != null) {
                    strReplace = "--";
                } else {
                    strReplace = "--";
                }
                StringUiText stringUiText3 = vch0.a;
                b.i(ku90Var4, new ResourceUiText(R.string.page_payment__successfully_set_vcard_as_the_default_card, ay0.S(new Object[]{strReplace})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                bVar = Boolean.valueOf(tudVar2.g1.a.a(eg6.a.a));
                zi50.a aVar3 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.e(thA);
                    ku90<a> ku90Var5 = tudVar3.f;
                    cardNumber = cardsBean3.getCardNumber();
                    if (cardNumber != null) {
                        str = strA;
                    }
                    StringUiText stringUiText4 = vch0.a;
                    b.i(ku90Var5, new ResourceUiText(R.string.page_payment__failed_to_change_vcard_as_the_default_card, ay0.S(new Object[]{str})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    ku90Var.a(eg6.b.a);
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
