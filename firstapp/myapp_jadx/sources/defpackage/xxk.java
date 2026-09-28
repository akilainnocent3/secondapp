package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftvalueeditor.GiftValueEditorStateHandlerImpl$init$2", f = "GiftValueEditorStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xxk extends tje0 implements Function2<vxk.a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ vxk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxk(vxk vxkVar, v1b<? super xxk> v1bVar) {
        super(2, v1bVar);
        this.b = vxkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xxk xxkVar = new xxk(this.b, v1bVar);
        xxkVar.a = obj;
        return xxkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vxk.a aVar, v1b<? super Unit> v1bVar) {
        return ((xxk) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalB;
        UiText resourceUiText;
        boolean z;
        Object value;
        boolean z2;
        boolean z3;
        BigDecimal bigDecimalG;
        String strA;
        vxk.a aVar = (vxk.a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        GiftDetails giftDetails = aVar.a;
        cyk cykVar = aVar.c;
        if (giftDetails != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(giftDetails.getCurrentBalance());
            bigDecimalValueOf.getClass();
            bigDecimalB = p54.b(bigDecimalValueOf);
            if (bigDecimalB == null) {
                bigDecimalB = BigDecimal.ZERO;
            }
        } else {
            bigDecimalB = BigDecimal.ZERO;
        }
        String strN = bjb0.N(bigDecimalB);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalB.compareTo(bigDecimal) > 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_coupon__max_vamount, ay0.S(new Object[]{strN}));
        } else {
            resourceUiText = vch0.a;
        }
        UiText uiText = resourceUiText;
        if (cykVar.equals(cyk.a.a)) {
            z = true;
        } else {
            if (!(cykVar instanceof cyk.b)) {
                uhc.a();
                return null;
            }
            BigDecimal bigDecimalG2 = b.g(((cyk.b) cykVar).a.a.b);
            if (bigDecimalG2 != null) {
                z = bigDecimalG2.compareTo(bigDecimal) > 0 && bigDecimalG2.compareTo(bigDecimalB) <= 0;
            } else {
                z = false;
            }
        }
        vxk vxkVar = this.b;
        wwd0 wwd0Var = vxkVar.e;
        do {
            value = wwd0Var.getValue();
            z2 = aVar.b;
            z3 = aVar.f;
            GiftDetails giftDetails2 = aVar.a;
            String str = aVar.d;
            String str2 = aVar.e;
            if (giftDetails2 == null) {
                strA = "0";
            } else {
                if (cykVar.equals(cyk.a.a)) {
                    bigDecimalG = p54.b(new BigDecimal(giftDetails2.getCurrentBalance()));
                } else {
                    if (!(cykVar instanceof cyk.b)) {
                        uhc.a();
                        return null;
                    }
                    bigDecimalG = b.g(((cyk.b) cykVar).a.a.b);
                    if (bigDecimalG == null) {
                        bigDecimalG = BigDecimal.ZERO;
                    }
                    bigDecimalG.getClass();
                }
                BigDecimal bigDecimalG3 = b.g(str);
                if (bigDecimalG3 == null) {
                    bigDecimalG3 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimalG4 = b.g(str2);
                if (bigDecimalG4 == null) {
                    bigDecimalG4 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimalE = vxkVar.b.e();
                if (bigDecimalE == null) {
                    bigDecimalE = BigDecimal.ZERO;
                }
                BigDecimal bigDecimalMultiply = bigDecimalG.multiply(bigDecimalG3);
                BigDecimal bigDecimalMultiply2 = bigDecimalG.multiply(bigDecimalG4);
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimalE.compareTo(bigDecimal2) > 0 && bigDecimalMultiply2.compareTo(bigDecimalE) > 0) {
                    bigDecimalMultiply2 = bigDecimalE;
                }
                if (bigDecimalE.compareTo(bigDecimal2) <= 0 || bigDecimalMultiply.compareTo(bigDecimalE) <= 0) {
                    bigDecimalE = bigDecimalMultiply;
                }
                strA = lx5.a("+", vxkVar.a.B(), " ", bjb0.L(bigDecimalE.add(bigDecimalMultiply2), Locale.US));
            }
        } while (!wwd0Var.g(value, new byk(z2, strN, cykVar, z3, aVar.h, aVar.g.size() > 1, z, strA, uiText)));
        return Unit.a;
    }
}
