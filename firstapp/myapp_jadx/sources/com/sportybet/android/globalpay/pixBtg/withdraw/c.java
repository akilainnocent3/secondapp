package com.sportybet.android.globalpay.pixBtg.withdraw;

import android.content.Intent;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportybet.android.globalpay.pixBtg.PixSuccessActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment;
import defpackage.azm;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.d0n;
import defpackage.ga00;
import defpackage.ib5;
import defpackage.ku90;
import defpackage.myh;
import defpackage.ohp;
import defpackage.s8d0;
import defpackage.snb0;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vj5;
import defpackage.wae;
import defpackage.y5b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment$initView$1$6$1$1", f = "PixBtgWithdrawFragment.kt", l = {178}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PixBtgWithdrawFragment b;

    public static final class a<T> implements myh {
        public final /* synthetic */ PixBtgWithdrawFragment a;

        public a(PixBtgWithdrawFragment pixBtgWithdrawFragment) {
            this.a = pixBtgWithdrawFragment;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            d dVar = (d) obj;
            boolean zG = Intrinsics.g(dVar, d.g.a);
            PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
            if (zG) {
                pixBtgWithdrawFragment.requireActivity().finish();
            } else if (Intrinsics.g(dVar, d.c.a)) {
                azm azmVar = pixBtgWithdrawFragment.T;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.DEPOSIT);
            } else if (Intrinsics.g(dVar, d.f.a)) {
                WebViewBottomSheetFragment.Companion companion = WebViewBottomSheetFragment.INSTANCE;
                bnh0 bnh0Var = pixBtgWithdrawFragment.V;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                Pair pair = new Pair("url", bnh0Var.h("/m/help#/how-to-play/others/how-to-withdraw"));
                Pair pair2 = new Pair("title_id", new Integer(R.string.common_helps__how_to_withdraw));
                Boolean bool = Boolean.TRUE;
                companion.newInstance(vj5.a(pair, pair2, new Pair("stay_on_page_when_deep_link_triggered", bool), new Pair("disable url redirect", bool))).show(pixBtgWithdrawFragment.getChildFragmentManager(), WebViewBottomSheetFragment.TAG);
            } else if (Intrinsics.g(dVar, d.j.a)) {
                azm azmVar2 = pixBtgWithdrawFragment.T;
                if (azmVar2 == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar2.d(wae.ME_TRANSACTIONS);
            } else if (Intrinsics.g(dVar, d.a.a)) {
                pixBtgWithdrawFragment.V0();
            } else if (dVar instanceof d.k) {
                WithDrawInfo withDrawInfo = ((d.k) dVar).a;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                pixBtgWithdrawFragment.Y0(withDrawInfo);
            } else if (Intrinsics.g(dVar, d.h.a)) {
                ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                pixBtgWithdrawFragment.a0.b(s8d0.b.a);
            } else if (dVar instanceof d.C0240d) {
                pixBtgWithdrawFragment.b0.b(((d.C0240d) dVar).a);
            } else if (dVar instanceof d.i) {
                int i = PixSuccessActivity.e;
                androidx.fragment.app.e eVarRequireActivity = pixBtgWithdrawFragment.requireActivity();
                eVarRequireActivity.getClass();
                d.i iVar = (d.i) dVar;
                String str = iVar.a;
                ga00 ga00Var = ga00.DEPOSIT;
                String str2 = iVar.b;
                String str3 = iVar.c;
                str.getClass();
                str3.getClass();
                Intent intent = new Intent(eVarRequireActivity, (Class<?>) PixSuccessActivity.class);
                intent.putExtra("pix_amount", str);
                intent.putExtra("SUCCESS_ACTION", 2);
                intent.putExtra("pix_trade_id", str2);
                intent.putExtra("pix_account_value", str3);
                eVarRequireActivity.startActivity(intent);
            } else if (Intrinsics.g(dVar, d.e.a)) {
                azm azmVar3 = pixBtgWithdrawFragment.T;
                if (azmVar3 == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar3.d(wae.HOME);
            } else {
                if (!Intrinsics.g(dVar, d.b.a)) {
                    uhc.a();
                    return null;
                }
                d0n d0nVar = pixBtgWithdrawFragment.D;
                if (d0nVar == null) {
                    Intrinsics.n("utils");
                    throw null;
                }
                androidx.fragment.app.e eVarRequireActivity2 = pixBtgWithdrawFragment.requireActivity();
                eVarRequireActivity2.getClass();
                d0nVar.b(eVarRequireActivity2, snb0.WITHDRAW);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PixBtgWithdrawFragment pixBtgWithdrawFragment, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.b = pixBtgWithdrawFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
        PixBtgWithdrawFragment pixBtgWithdrawFragment = this.b;
        ku90<d> ku90Var = pixBtgWithdrawFragment.d1().E;
        a aVar = new a(pixBtgWithdrawFragment);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
