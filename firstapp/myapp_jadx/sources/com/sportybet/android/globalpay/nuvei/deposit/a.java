package com.sportybet.android.globalpay.nuvei.deposit;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.compose.ui.navigation.ext.NavigationResult;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import defpackage.bv60;
import defpackage.c0d;
import defpackage.c8y;
import defpackage.d900;
import defpackage.eyl;
import defpackage.h000;
import defpackage.hjx;
import defpackage.ifx;
import defpackage.k9j;
import defpackage.mla;
import defpackage.op8;
import defpackage.saj;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vu60;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/globalpay/nuvei/deposit/a;", "Luzz;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends eyl implements k9j {
    public WebViewWrapperServiceImpl G;
    public d900 H;

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.nuvei.deposit.a$a, reason: collision with other inner class name */
    @c0d(c = "com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositFragment$onCreateView$1$1$1$1$1$1$1", f = "NuveiDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0229a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ hjx a;
        public final /* synthetic */ c8y b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0229a(hjx hjxVar, c8y c8yVar, v1b<? super C0229a> v1bVar) {
            super(2, v1bVar);
            this.a = hjxVar;
            this.b = c8yVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new C0229a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C0229a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Parcelable parcelable;
            c8y c8yVar;
            BankTradeResponse bankTradeResponse;
            String str;
            vu60 vu60VarA;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ifx ifxVarH = this.a.b.h();
            if (ifxVarH == null || (vu60VarA = ifxVarH.a()) == null) {
                parcelable = null;
            } else {
                bv60 bv60Var = vu60VarA.b;
                bv60Var.getClass();
                Object objRemove = bv60Var.a.remove("nav_screen_result");
                bv60Var.c.remove("nav_screen_result");
                bv60Var.d.remove("nav_screen_result");
                vu60.a aVar = (vu60.a) vu60VarA.a.remove("nav_screen_result");
                if (aVar != null) {
                    aVar.m = null;
                }
                parcelable = (Parcelable) objRemove;
            }
            if ((parcelable instanceof NavigationResult ? (NavigationResult) parcelable : null) != null && (bankTradeResponse = (c8yVar = this.b).Q) != null && (str = bankTradeResponse.tradeId) != null) {
                c8yVar.d.b(str);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<h000, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(h000 h000Var) {
            h000 h000Var2 = h000Var;
            h000Var2.getClass();
            ((a) this.receiver).n0(h000Var2);
            return Unit.a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-2059918585, new Function2() { // from class: h6y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hjx hjxVarA = tix.a(new vkx[0], aVar);
                    com.sportybet.android.globalpay.nuvei.deposit.a aVar2 = this.a;
                    n6y n6yVar = new n6y(aVar2.requireArguments().getInt("NUVEI_CHANNEL_ID"));
                    boolean zA = aVar.A(hjxVarA) | aVar.A(aVar2);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new sk6(i, hjxVarA, aVar2);
                        aVar.r(objY);
                    }
                    uix.b(hjxVarA, n6yVar, null, null, null, null, null, null, null, (Function1) objY, aVar, 8, 2044);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
