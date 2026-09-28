package com.sportybet.android.globalpay.mobileMoney;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import defpackage.ay0;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$onAddNewPhoneResult$1", f = "MobileMoneyDepositViewModel.kt", l = {320, 321}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ c c;
    public final /* synthetic */ BindNewPhoneResult d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, BindNewPhoneResult bindNewPhoneResult, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.c = cVar;
        this.d = bindNewPhoneResult;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objH1;
        Object obj2;
        ResourceUiText resourceUiText;
        y5b y5bVar = y5b.a;
        int i = this.b;
        BindNewPhoneResult bindNewPhoneResult = this.d;
        c cVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            BindNewPhoneResult.Success success = (BindNewPhoneResult.Success) bindNewPhoneResult;
            String str = success.a;
            String str2 = success.b;
            this.b = 1;
            objH1 = cVar.H1(str, str2, this);
            if (objH1 != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
            objH1 = ((zi50) obj).a;
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.a;
            uj50.b(obj);
        }
        zi50.a aVar = zi50.b;
        if (obj2 instanceof zi50.b) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__failed_to_change_default_number_please_try_again);
        } else {
            BindNewPhoneResult.Success success2 = (BindNewPhoneResult.Success) bindNewPhoneResult;
            String str3 = success2.a;
            String str4 = success2.b;
            cVar.getClass();
            Object[] objArr = {c.C1(str3, str4)};
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__successfully_set_vphone_as_the_default_number, ay0.S(objArr));
        }
        cVar.A1(new b.f(resourceUiText));
        return Unit.a;
        BindNewPhoneResult.Success success3 = (BindNewPhoneResult.Success) bindNewPhoneResult;
        String str5 = success3.a;
        String str6 = success3.b;
        zi50.a aVar2 = zi50.b;
        this.a = objH1;
        this.b = 2;
        if (cVar.F1(str5, str6, true ^ (objH1 instanceof zi50.b), this) != y5bVar) {
            obj2 = objH1;
            zi50.a aVar3 = zi50.b;
            if (obj2 instanceof zi50.b) {
                BindNewPhoneResult.Success success4 = (BindNewPhoneResult.Success) bindNewPhoneResult;
                String str7 = success4.a;
                String str8 = success4.b;
                cVar.getClass();
                Object[] objArr2 = {c.C1(str7, str8)};
                StringUiText stringUiText3 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_payment__successfully_set_vphone_as_the_default_number, ay0.S(objArr2));
            } else {
                StringUiText stringUiText4 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_payment__failed_to_change_default_number_please_try_again);
            }
            cVar.A1(new b.f(resourceUiText));
            return Unit.a;
        }
        return y5bVar;
    }
}
