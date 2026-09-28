package com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;
import defpackage.d900;
import defpackage.k9j;
import defpackage.op8;
import defpackage.pwx;
import defpackage.txl;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/payment/impl/security/nameupdate/presentation/activity/NameMismatchCSActivity;", "Lpy1;", "Lk9j;", "Lpwx;", "Lzux;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NameMismatchCSActivity extends txl implements k9j, pwx, zux {
    public static final /* synthetic */ int c = 0;
    public d900 b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        final int intExtra = R.string.identity_verification__unable_to_withdraw_due_to_a_name_mismatch;
        if (intent != null) {
            intExtra = intent.getIntExtra("name_mismatch", R.string.identity_verification__unable_to_withdraw_due_to_a_name_mismatch);
        }
        zn8.a(this, new op8(-1836281398, new Function2() { // from class: rcx
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = NameMismatchCSActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i2 = intExtra;
                    final NameMismatchCSActivity nameMismatchCSActivity = this;
                    or0.a(null, false, false, null, pp8.b(1352438049, new Function2() { // from class: scx
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i3 = NameMismatchCSActivity.c;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                NameMismatchCSActivity nameMismatchCSActivity2 = nameMismatchCSActivity;
                                boolean zA = aVar2.A(nameMismatchCSActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                int i4 = 3;
                                if (zA || objY == c0042a) {
                                    objY = new kh5(nameMismatchCSActivity2, i4);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(nameMismatchCSActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new o5e(nameMismatchCSActivity2, i4);
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(nameMismatchCSActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new cc0(nameMismatchCSActivity2, 4);
                                    aVar2.r(objY3);
                                }
                                od90.b(i2, function0, function1, (Function0) objY3, aVar2, 0);
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
}
