package com.sportybet.android.limits.base.limitBase;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.limits.base.limitBase.LimitsActivity;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import defpackage.mul;
import defpackage.op8;
import defpackage.rcs;
import defpackage.saj;
import defpackage.yrh0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/limits/base/limitBase/LimitsActivity;", "Le22;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitsActivity extends mul {
    public static final /* synthetic */ int i = 0;

    public static final /* synthetic */ class a extends saj implements Function1<rcs, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(rcs rcsVar) {
            rcs rcsVar2 = rcsVar;
            rcsVar2.getClass();
            LimitsActivity limitsActivity = (LimitsActivity) this.receiver;
            int i = LimitsActivity.i;
            limitsActivity.getClass();
            Intent intent = new Intent(limitsActivity, (Class<?>) EditLimitsActivity.class);
            intent.putExtra("limit_type", rcsVar2.a);
            yrh0.s(limitsActivity, intent, true);
            return Unit.a;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(222981187, new Function2() { // from class: ycs
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LimitsActivity.i;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final LimitsActivity limitsActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(445758476, new Function2() { // from class: zcs
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i3 = LimitsActivity.i;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                rcs.a aVar3 = rcs.b;
                                final LimitsActivity limitsActivity2 = limitsActivity;
                                String stringExtra = limitsActivity2.getIntent().getStringExtra("key_limit_type");
                                aVar3.getClass();
                                rcs rcsVarA = rcs.a.a(stringExtra);
                                boolean zA = aVar2.A(limitsActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: ads
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = LimitsActivity.i;
                                            limitsActivity2.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                Object objY2 = aVar2.y();
                                if (objY2 == c0042a) {
                                    objY2 = new bds();
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA2 = aVar2.A(limitsActivity2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    LimitsActivity.a aVar4 = new LimitsActivity.a(1, limitsActivity2, LimitsActivity.class, "openEditLimitsActivity", "openEditLimitsActivity(Lcom/sportybet/repository/limits/model/LimitType;)V", 0);
                                    aVar2.r(aVar4);
                                    objY3 = aVar4;
                                }
                                ses.a(rcsVarA, function0, function1, (Function1) ((chp) objY3), aVar2, 384);
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
