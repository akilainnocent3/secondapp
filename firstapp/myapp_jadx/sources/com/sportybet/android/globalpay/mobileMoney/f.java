package com.sportybet.android.globalpay.mobileMoney;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.UserPhone;
import com.sportybet.android.gp.tz.R;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.l48;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.ys00;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$selectPhone$2", f = "MobileMoneyDepositViewModel.kt", l = {366}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ ys00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, ys00 ys00Var, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
        this.c = ys00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objH1;
        Object value;
        c.a aVar;
        ArrayList arrayList;
        ys00 ys00VarA;
        UserPhone userPhone = this.c.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        c cVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            String phoneCountryCode = userPhone.getPhoneCountryCode();
            String phone = userPhone.getPhone();
            this.a = 1;
            objH1 = cVar.H1(phoneCountryCode, phone, this);
            if (objH1 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objH1 = ((zi50) obj).a;
        }
        zi50.a aVar2 = zi50.b;
        if (!(objH1 instanceof zi50.b)) {
            String phone2 = userPhone.getPhone();
            wwd0 wwd0Var = cVar.N;
            do {
                value = wwd0Var.getValue();
                aVar = (c.a) value;
                List<ys00> list = aVar.a;
                arrayList = new ArrayList(l48.r(list, 10));
                for (ys00 ys00Var : list) {
                    UserPhone userPhone2 = ys00Var.a;
                    arrayList.add(ys00.a(ys00Var, UserPhone.copy$default(userPhone2, null, null, false, Intrinsics.g(userPhone2.getPhone(), phone2), 7, null)));
                }
                ys00 ys00Var2 = aVar.b;
                if (ys00Var2 != null) {
                    UserPhone userPhone3 = ys00Var2.a;
                    ys00VarA = ys00.a(ys00Var2, UserPhone.copy$default(userPhone3, null, null, false, Intrinsics.g(userPhone3.getPhone(), phone2), 7, null));
                } else {
                    ys00VarA = null;
                }
            } while (!wwd0Var.g(value, c.a.a(aVar, arrayList, ys00VarA, false, 0, null, false, false, false, false, 508)));
        }
        if (zi50.a(objH1) != null) {
            StringUiText stringUiText = vch0.a;
            cVar.A1(new b.f(new ResourceUiText(R.string.page_payment__failed_to_change_default_number_please_try_again)));
        }
        return Unit.a;
    }
}
