package com.sportybet.feature.payment.impl.transaction.presentation.activity;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import defpackage.arr;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bm50;
import defpackage.c4h0;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.d4h0;
import defpackage.d900;
import defpackage.e4h0;
import defpackage.ej5;
import defpackage.f4h0;
import defpackage.g1i;
import defpackage.g6m;
import defpackage.i4h0;
import defpackage.j4h0;
import defpackage.jq40;
import defpackage.k4h0;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.lk50;
import defpackage.lyh;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.p4h0;
import defpackage.pf;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r4h0;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.u700;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.xym;
import defpackage.z3h0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/activity/TxDetailsV2Activity;", "Lpy1;", "Lbb40;", "Lxym;", "<init>", "()V", "Lt3h0;", "viewState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxDetailsV2Activity extends g6m implements bb40, xym {
    public static final /* synthetic */ int v = 0;
    public azm b;
    public u700 c;
    public d0n d;
    public com.sporty.android.common.uievent.e e;
    public d900 f;
    public final q8i0 i = new q8i0(jq40.a(r4h0.class), new e(), new d(), new f());

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Transaction transaction;
            String str;
            r4h0 r4h0Var = (r4h0) this.receiver;
            Object value = r4h0Var.N.getValue();
            lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
            if (cVar != null && (transaction = (Transaction) cVar.a) != null && (str = transaction.tradeId) != null) {
                ej5.c(o8i0.d(r4h0Var), null, null, new c4h0(r4h0Var, str, null), 3);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            r4h0 r4h0Var = (r4h0) this.receiver;
            if (r4h0Var.x1() > 0) {
                ku90<com.sporty.android.common.uievent.a> ku90Var = r4h0Var.C;
                StringUiText stringUiText = vch0.a;
                com.sporty.android.common.uievent.b.e(ku90Var, new ResourceUiText(R.string.common_feedback__please_wait), null, new ResourceUiText(R.string.page_transaction__you_just_checked_give_it_a_moment_before_trying_again), null, null, null, null, 506);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            r4h0 r4h0Var = (r4h0) this.a;
            r4h0Var.getClass();
            ej5.c(o8i0.d(r4h0Var), null, null, new p4h0(null, r4h0Var), 3);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxDetailsV2Activity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxDetailsV2Activity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxDetailsV2Activity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra("data");
        if (stringExtra == null) {
            return;
        }
        int intExtra = getIntent().getIntExtra("isHistory", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra == -1) {
            finish();
            return;
        }
        r4h0 r4h0VarZ1 = z1();
        r4h0VarZ1.w = stringExtra;
        r4h0VarZ1.y = intExtra;
        kzh.d(new d4h0(new lyh[]{bm50.f(r4h0VarZ1.N), r4h0VarZ1.P, r4h0VarZ1.R, r4h0VarZ1.O, r4h0VarZ1.G, r4h0VarZ1.H}, r4h0VarZ1), o8i0.d(r4h0VarZ1));
        kzh.d(new n1i(r4h0VarZ1.L, new f4h0(r4h0VarZ1.E), new i4h0(null, r4h0VarZ1)), o8i0.d(r4h0VarZ1));
        kzh.d(new g1i(new e4h0((lyh[]) CollectionsKt.A0(r4h0VarZ1.Q).toArray(new lyh[0])), new j4h0(null, r4h0VarZ1)), o8i0.d(r4h0VarZ1));
        kzh.d(new g1i(r4h0VarZ1.d.k(), new k4h0(null, r4h0VarZ1)), o8i0.d(r4h0VarZ1));
        r4h0VarZ1.z1();
        g1i g1iVar = new g1i(z1().D, new z3h0(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        zn8.a(this, new op8(-1836113240, new Function2() { // from class: u3h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = TxDetailsV2Activity.v;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final TxDetailsV2Activity txDetailsV2Activity = this.a;
                    final ytw ytwVarC = wyh.c(txDetailsV2Activity.z1().B, aVar, 0, 7);
                    final String str = stringExtra;
                    or0.a(null, false, false, null, pp8.b(-806308289, new Function2() { // from class: v3h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = TxDetailsV2Activity.v;
                            int i3 = 1;
                            int i4 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                t3h0 t3h0Var = (t3h0) ytwVarC.getValue();
                                final TxDetailsV2Activity txDetailsV2Activity2 = txDetailsV2Activity;
                                x0h0 x0h0VarB = as1.b(txDetailsV2Activity2, txDetailsV2Activity2.getCountryManager().c0(), txDetailsV2Activity2.getCountryManager().L());
                                r4h0 r4h0VarZ2 = txDetailsV2Activity2.z1();
                                boolean zA = aVar2.A(r4h0VarZ2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    TxDetailsV2Activity.a aVar3 = new TxDetailsV2Activity.a(0, r4h0VarZ2, r4h0.class, "clickUpdateNow", "clickUpdateNow()V", 0);
                                    aVar2.r(aVar3);
                                    objY = aVar3;
                                }
                                chp chpVar = (chp) objY;
                                r4h0 r4h0VarZ3 = txDetailsV2Activity2.z1();
                                boolean zA2 = aVar2.A(r4h0VarZ3);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    TxDetailsV2Activity.b bVar = new TxDetailsV2Activity.b(0, r4h0VarZ3, r4h0.class, "clickUpdateNowInCooldown", "clickUpdateNowInCooldown()V", 0);
                                    aVar2.r(bVar);
                                    objY2 = bVar;
                                }
                                chp chpVar2 = (chp) objY2;
                                r4h0 r4h0VarZ4 = txDetailsV2Activity2.z1();
                                boolean zA3 = aVar2.A(r4h0VarZ4);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    TxDetailsV2Activity.c cVar = new TxDetailsV2Activity.c(0, r4h0VarZ4, r4h0.class, "refresh", "refresh()Lkotlinx/coroutines/Job;", 8);
                                    aVar2.r(cVar);
                                    objY3 = cVar;
                                }
                                Function0 function0 = (Function0) objY3;
                                boolean zA4 = aVar2.A(txDetailsV2Activity2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new kqr(txDetailsV2Activity2, i4);
                                    aVar2.r(objY4);
                                }
                                Function0 function1 = (Function0) objY4;
                                boolean zA5 = aVar2.A(txDetailsV2Activity2);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    objY5 = new su40(txDetailsV2Activity2, i4);
                                    aVar2.r(objY5);
                                }
                                Function0 function2 = (Function0) objY5;
                                boolean zA6 = aVar2.A(txDetailsV2Activity2);
                                Object objY6 = aVar2.y();
                                if (zA6 || objY6 == c0042a) {
                                    objY6 = new Function0() { // from class: w3h0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i5 = TxDetailsV2Activity.v;
                                            TxDetailsV2Activity txDetailsV2Activity3 = txDetailsV2Activity2;
                                            d0n d0nVar = txDetailsV2Activity3.d;
                                            if (d0nVar != null) {
                                                d0nVar.b(txDetailsV2Activity3, snb0.TRANSACTION);
                                                return Unit.a;
                                            }
                                            Intrinsics.n("utils");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY6);
                                }
                                Function0 function3 = (Function0) objY6;
                                boolean zA7 = aVar2.A(txDetailsV2Activity2);
                                Object objY7 = aVar2.y();
                                if (zA7 || objY7 == c0042a) {
                                    objY7 = new uu40(txDetailsV2Activity2, i3);
                                    aVar2.r(objY7);
                                }
                                Function1 function4 = (Function1) objY7;
                                Function0 function5 = (Function0) chpVar;
                                Function0 function6 = (Function0) chpVar2;
                                boolean zA8 = aVar2.A(txDetailsV2Activity2);
                                Object objY8 = aVar2.y();
                                if (zA8 || objY8 == c0042a) {
                                    objY8 = new cew(txDetailsV2Activity2, i3);
                                    aVar2.r(objY8);
                                }
                                Function1 function7 = (Function1) objY8;
                                final String str2 = str;
                                boolean zM = aVar2.M(str2) | aVar2.A(txDetailsV2Activity2);
                                Object objY9 = aVar2.y();
                                if (zM || objY9 == c0042a) {
                                    objY9 = new Function0() { // from class: x3h0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i5 = TxDetailsV2Activity.v;
                                            Bundle bundleA = mll0.a("tradeId", str2);
                                            azm azmVar = txDetailsV2Activity2.b;
                                            if (azmVar != null) {
                                                azmVar.j(wae.REQUEST_DETAILS, null, bundleA);
                                                return Unit.a;
                                            }
                                            Intrinsics.n("router");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY9);
                                }
                                Function0 function8 = (Function0) objY9;
                                boolean zA9 = aVar2.A(txDetailsV2Activity2);
                                Object objY10 = aVar2.y();
                                if (zA9 || objY10 == c0042a) {
                                    objY10 = new eew(txDetailsV2Activity2, 2);
                                    aVar2.r(objY10);
                                }
                                Function1 function9 = (Function1) objY10;
                                boolean zA10 = aVar2.A(txDetailsV2Activity2);
                                Object objY11 = aVar2.y();
                                if (zA10 || objY11 == c0042a) {
                                    objY11 = new Function0() { // from class: y3h0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i5 = TxDetailsV2Activity.v;
                                            r4h0.A1(txDetailsV2Activity2.z1(), new xpg0.b(0), new xb90(1), 2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY11);
                                }
                                Function0 function10 = (Function0) objY11;
                                boolean zA11 = aVar2.A(txDetailsV2Activity2);
                                Object objY12 = aVar2.y();
                                if (zA11 || objY12 == c0042a) {
                                    objY12 = new ow00(txDetailsV2Activity2, 3);
                                    aVar2.r(objY12);
                                }
                                n3h0.b(t3h0Var, function1, function2, x0h0VarB, function3, function4, function5, function6, function0, function7, function8, function9, function10, (Function0) objY12, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final r4h0 z1() {
        return (r4h0) this.i.getValue();
    }
}
