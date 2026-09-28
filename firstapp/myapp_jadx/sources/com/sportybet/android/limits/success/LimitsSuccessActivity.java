package com.sportybet.android.limits.success;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.limits.success.LimitsSuccessActivity;
import defpackage.bb40;
import defpackage.op8;
import defpackage.py1;
import defpackage.rcs;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/limits/success/LimitsSuccessActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitsSuccessActivity extends py1 implements bb40 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rcs.a aVar = rcs.b;
        String stringExtra = getIntent().getStringExtra("limit_type");
        aVar.getClass();
        final rcs rcsVarA = rcs.a.a(stringExtra);
        if (rcsVarA == null) {
            rcsVarA = rcs.BETTING;
        }
        zn8.a(this, new op8(1285602157, new Function2() { // from class: tes
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = LimitsSuccessActivity.a;
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final rcs rcsVar = rcsVarA;
                    final LimitsSuccessActivity limitsSuccessActivity = this;
                    or0.a(null, false, false, null, pp8.b(505333636, new Function2() { // from class: ues
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar3 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = LimitsSuccessActivity.a;
                            int i3 = 2;
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                LimitsSuccessActivity limitsSuccessActivity2 = limitsSuccessActivity;
                                boolean zA = aVar3.A(limitsSuccessActivity2);
                                Object objY = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new xmi(limitsSuccessActivity2, i3);
                                    aVar3.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                Object objY2 = aVar3.y();
                                if (objY2 == c0042a) {
                                    objY2 = new ves();
                                    aVar3.r(objY2);
                                }
                                xes.a(rcsVar, function0, (Function0) objY2, aVar3, 384);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
