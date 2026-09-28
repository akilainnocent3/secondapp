package com.sportybet.android.globalpay.stp.spei.withdraw.pending;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.stp.spei.withdraw.pending.WithdrawalPendingActivity;
import defpackage.c8m;
import defpackage.cyb;
import defpackage.jq40;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.usj0;
import defpackage.v8i0;
import defpackage.vsj0;
import defpackage.wwd0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/globalpay/stp/spei/withdraw/pending/WithdrawalPendingActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WithdrawalPendingActivity extends c8m {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(vsj0.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return WithdrawalPendingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return WithdrawalPendingActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return WithdrawalPendingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        String strF;
        super.onCreate(bundle);
        vsj0 vsj0Var = (vsj0) this.b.getValue();
        String stringExtra = getIntent().getStringExtra("extra_amount");
        String str = stringExtra == null ? "" : stringExtra;
        String stringExtra2 = getIntent().getStringExtra("extra_clabe");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("extra_trade_id");
        String str3 = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("extra_payment_method_name");
        String str4 = stringExtra4 == null ? "" : stringExtra4;
        wwd0 wwd0Var = vsj0Var.c;
        do {
            value = wwd0Var.getValue();
            strF = vsj0Var.a.f();
            ((usj0) value).getClass();
            strF.getClass();
        } while (!wwd0Var.g(value, new usj0(str, str2, str3, str4, strF)));
        zn8.a(this, new op8(-580726730, new Function2() { // from class: psj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = WithdrawalPendingActivity.c;
                int i2 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1278455679, new plb0(this.a, i2), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
