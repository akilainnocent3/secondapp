package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$requestSetDefault$1", f = "WithdrawBankViewModel.kt", l = {603, 611}, m = "invokeSuspend", v = 2)
public final class jkj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public AssetData.AccountsBean a;
    public String b;
    public akj0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sif f;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkj0(sif sifVar, Object obj, v1b v1bVar) {
        super(2, v1bVar);
        this.f = sifVar;
        this.i = obj;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jkj0 jkj0Var = new jkj0(this.f, this.i, v1bVar);
        jkj0Var.e = obj;
        return jkj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jkj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        ?? r4;
        Throwable thA;
        List list;
        Object obj2;
        Object next;
        AssetData.AccountsBean accountsBean;
        String strA;
        Object objS;
        String str;
        akj0 akj0Var;
        akj0 akj0Var2;
        AssetData.AccountsBean accountsBean2;
        sif sifVar = this.f;
        wwd0 wwd0Var = sifVar.U;
        y5b y5bVar = y5b.a;
        ?? r5 = this.d;
        try {
            try {
                if (r5 == 0) {
                    uj50.b(obj);
                    lk50<List<AssetData.AccountsBean>> value = sifVar.O1().getValue();
                    lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                    if (cVar != null && (list = (List) cVar.a) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            obj2 = this.i;
                            if (!zHasNext) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            int id = ((AssetData.AccountsBean) next).getId();
                            if ((obj2 instanceof Integer) && id == ((Number) obj2).intValue()) {
                                break;
                            }
                        }
                        accountsBean = (AssetData.AccountsBean) next;
                        if (accountsBean != null) {
                            wne0 wne0Var = (wne0) wwd0Var.getValue();
                            List<aoe0> list2 = ((wne0) wwd0Var.getValue()).a;
                            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                            for (aoe0 aoe0Var : list2) {
                                arrayList.add(boe0.a(aoe0Var, Boolean.valueOf(Intrinsics.g(aoe0Var.getId(), new Integer(accountsBean.getId()))), Boolean.TRUE));
                            }
                            wne0 wne0VarA = wne0.a(wne0Var, arrayList, true, true, 4);
                            wwd0Var.getClass();
                            wwd0Var.k(null, wne0VarA);
                            String bankName = accountsBean.getBankName();
                            String accountNumber = accountsBean.getAccountNumber();
                            if (accountNumber == null || (strA = fu5.a("\\d(?=\\d{4})", accountNumber, "*")) == null) {
                                strA = "--";
                            }
                            String strB = v70.b(bankName, " (", strA, ")");
                            zi50.a aVar = zi50.b;
                            sr10 sr10Var = sifVar.l0;
                            int iIntValue = ((Integer) obj2).intValue();
                            this.e = null;
                            this.a = accountsBean;
                            this.b = strB;
                            this.c = sifVar;
                            this.d = 1;
                            objS = sr10Var.S(iIntValue, 2, 2, this);
                            if (objS != y5bVar) {
                                str = strB;
                                akj0Var = sifVar;
                            }
                            return y5bVar;
                        }
                    }
                    return Unit.a;
                }
                if (r5 == 1) {
                    akj0Var = this.c;
                    String str2 = this.b;
                    accountsBean = this.a;
                    try {
                        uj50.b(obj);
                        str = str2;
                        objS = obj;
                    } catch (Throwable th) {
                        th = th;
                        r5 = str2;
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                        r4 = r5;
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a.e(thA);
                            int i = akj0.O0;
                            ku90<a> ku90Var = sifVar.f;
                            StringUiText stringUiText = vch0.a;
                            b.i(ku90Var, new ResourceUiText(R.string.page_payment__failed_to_change_vaccount_as_the_default_account, ay0.S(new Object[]{r4})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        }
                        int i2 = akj0.O0;
                        wne0 wne0VarA2 = wne0.a((wne0) wwd0Var.getValue(), null, false, false, 13);
                        wwd0Var.getClass();
                        wwd0Var.k(null, wne0VarA2);
                        return Unit.a;
                    }
                } else {
                    if (r5 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    akj0Var2 = this.c;
                    String str3 = this.b;
                    accountsBean2 = this.a;
                    uj50.b(obj);
                    r5 = str3;
                }
                akj0Var2.v0.setValue(accountsBean2);
                ku90<spg0> ku90Var2 = akj0Var2.v;
                int i3 = vpg0.a;
                ku90Var2.getClass();
                ku90Var2.a(spg0.a.a);
                ku90<a> ku90Var3 = akj0Var2.f;
                StringUiText stringUiText2 = vch0.a;
                b.i(ku90Var3, new ResourceUiText(R.string.page_payment__successfully_set_vaccount_as_the_default_account, ay0.S(new Object[]{r5})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                bVar = Unit.a;
                zi50.a aVar3 = zi50.b;
                r4 = r5;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.e(thA);
                    int i4 = akj0.O0;
                    ku90<a> ku90Var4 = sifVar.f;
                    StringUiText stringUiText3 = vch0.a;
                    b.i(ku90Var4, new ResourceUiText(R.string.page_payment__failed_to_change_vaccount_as_the_default_account, ay0.S(new Object[]{r4})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                }
                int i5 = akj0.O0;
                wne0 wne0VarA3 = wne0.a((wne0) wwd0Var.getValue(), null, false, false, 13);
                wwd0Var.getClass();
                wwd0Var.k(null, wne0VarA3);
                return Unit.a;
                if (!((BaseResponse) objS).isSuccessful()) {
                    throw new Throwable("Set default failed.");
                }
                jvd0 jvd0VarR1 = akj0Var.R1();
                this.e = null;
                this.a = accountsBean;
                this.b = str;
                this.c = akj0Var;
                this.d = 2;
                if (jvd0VarR1.join(this) != y5bVar) {
                    akj0Var2 = akj0Var;
                    accountsBean2 = accountsBean;
                    r5 = str;
                    akj0Var2.v0.setValue(accountsBean2);
                    ku90<spg0> ku90Var5 = akj0Var2.v;
                    int i6 = vpg0.a;
                    ku90Var5.getClass();
                    ku90Var5.a(spg0.a.a);
                    ku90<a> ku90Var6 = akj0Var2.f;
                    StringUiText stringUiText4 = vch0.a;
                    b.i(ku90Var6, new ResourceUiText(R.string.page_payment__successfully_set_vaccount_as_the_default_account, ay0.S(new Object[]{r5})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    bVar = Unit.a;
                    zi50.a aVar4 = zi50.b;
                    r4 = r5;
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a.e(thA);
                        int i7 = akj0.O0;
                        ku90<a> ku90Var7 = sifVar.f;
                        StringUiText stringUiText5 = vch0.a;
                        b.i(ku90Var7, new ResourceUiText(R.string.page_payment__failed_to_change_vaccount_as_the_default_account, ay0.S(new Object[]{r4})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    }
                    int i8 = akj0.O0;
                    wne0 wne0VarA4 = wne0.a((wne0) wwd0Var.getValue(), null, false, false, 13);
                    wwd0Var.getClass();
                    wwd0Var.k(null, wne0VarA4);
                    return Unit.a;
                }
                return y5bVar;
            } catch (Throwable th2) {
                th = th2;
                r5 = str;
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
                r4 = r5;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
