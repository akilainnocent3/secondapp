package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.pocket.transaction.txtype.TxTypeDefinitionMap;
import com.sporty.android.core.model.pocket.transaction.txtype.TxTypeDefinitionPair;
import com.sporty.android.core.model.pocket.transaction.txtype.TxTypeDefinitionResponse;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$remoteTxTypeUiTextMapsFlow$1", f = "PocketRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yt10 extends tje0 implements iaj<lk50<? extends TxTypeDefinitionResponse>, lk50<? extends List<? extends CMSResponse>>, lk50<? extends List<? extends CMSResponse>>, v1b<? super lk50<? extends t8h0>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ lk50 c;
    public final /* synthetic */ ms10 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt10(ms10 ms10Var, v1b<? super yt10> v1bVar) {
        super(4, v1bVar);
        this.d = ms10Var;
    }

    @Override // defpackage.iaj
    public final Object d(lk50<? extends TxTypeDefinitionResponse> lk50Var, lk50<? extends List<? extends CMSResponse>> lk50Var2, lk50<? extends List<? extends CMSResponse>> lk50Var3, v1b<? super lk50<? extends t8h0>> v1bVar) {
        yt10 yt10Var = new yt10(this.d, v1bVar);
        yt10Var.a = lk50Var;
        yt10Var.b = lk50Var2;
        yt10Var.c = lk50Var3;
        return yt10Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        Object next3;
        UiText stringUiText;
        String value;
        String key;
        String lowerCase;
        Object next4;
        Object next5;
        UiText resourceUiText;
        String value2;
        String key2;
        String lowerCase2;
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        lk50 lk50Var3 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List listK = b.k(lk50Var, lk50Var2, lk50Var3);
        Iterator it = listK.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((lk50) next) instanceof lk50.a));
        lk50.a aVar = next instanceof lk50.a ? (lk50.a) next : null;
        if (!listK.isEmpty()) {
            Iterator it2 = listK.iterator();
            while (it2.hasNext()) {
                if (((lk50) it2.next()) instanceof lk50.b) {
                    return lk50.b.a;
                }
            }
        }
        if (aVar != null) {
            return new lk50.a(aVar.a);
        }
        lk50Var.getClass();
        TxTypeDefinitionResponse txTypeDefinitionResponse = (TxTypeDefinitionResponse) ((lk50.c) lk50Var).a;
        lk50Var2.getClass();
        List list = (List) ((lk50.c) lk50Var2).a;
        lk50Var3.getClass();
        List list2 = (List) ((lk50.c) lk50Var3).a;
        TxTypeDefinitionMap tradeCodeDefinition = txTypeDefinitionResponse.getTradeCodeDefinition();
        if (tradeCodeDefinition == null) {
            return new lk50.a(new Throwable("TradeCodeDefinition is null."));
        }
        TxTypeDefinitionMap bizTypeDefinition = txTypeDefinitionResponse.getBizTypeDefinition();
        if (bizTypeDefinition == null) {
            return new lk50.a(new Throwable("BizTypeDefinition is null."));
        }
        List<TxTypeDefinitionPair> enumerations = tradeCodeDefinition.getEnumerations();
        ArrayList arrayList = new ArrayList(l48.r(enumerations, 10));
        for (TxTypeDefinitionPair txTypeDefinitionPair : enumerations) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it3.next();
                key2 = ((CMSResponse) next4).getKey();
                lowerCase2 = txTypeDefinitionPair.getText().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
            } while (!Intrinsics.g(key2, lowerCase2));
            CMSResponse cMSResponse = (CMSResponse) next4;
            if (cMSResponse == null || (value2 = cMSResponse.getValue()) == null) {
                Iterator<T> it4 = p8h0.d.iterator();
                do {
                    if (!it4.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it4.next();
                } while (!Intrinsics.g(((p8h0) next5).a, txTypeDefinitionPair.getKey()));
                p8h0 p8h0Var = (p8h0) next5;
                resourceUiText = p8h0Var != null ? p8h0Var.b : new ResourceUiText(R.string.app_common__no_cash);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new StringUiText(value2);
            }
            arrayList.add(new u8h0(resourceUiText, txTypeDefinitionPair.getKey()));
        }
        List<TxTypeDefinitionPair> enumerations2 = bizTypeDefinition.getEnumerations();
        ArrayList arrayList2 = new ArrayList(l48.r(enumerations2, 10));
        for (TxTypeDefinitionPair txTypeDefinitionPair2 : enumerations2) {
            Iterator it5 = list2.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
                key = ((CMSResponse) next2).getKey();
                lowerCase = txTypeDefinitionPair2.getText().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } while (!Intrinsics.g(key, lowerCase));
            CMSResponse cMSResponse2 = (CMSResponse) next2;
            if (cMSResponse2 == null || (value = cMSResponse2.getValue()) == null) {
                List<i0h0> list3 = i0h0.c;
                Iterator it6 = i0h0.a.a(this.d.d.getCountryCode()).iterator();
                do {
                    if (!it6.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it6.next();
                } while (!Intrinsics.g(String.valueOf(((i0h0) next3).a), txTypeDefinitionPair2.getKey()));
                i0h0 i0h0Var = (i0h0) next3;
                stringUiText = i0h0Var != null ? i0h0Var.b : vch0.a;
            } else {
                StringUiText stringUiText3 = vch0.a;
                stringUiText = new StringUiText(value);
            }
            arrayList2.add(new u8h0(stringUiText, txTypeDefinitionPair2.getKey()));
        }
        return new lk50.c(new t8h0(arrayList, arrayList2));
    }
}
