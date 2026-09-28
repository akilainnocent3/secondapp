package com.sporty.android.platform.features.loyalty.upgradedialog;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.a;
import com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeActivity;
import defpackage.azm;
import defpackage.k9j;
import defpackage.krf0;
import defpackage.ocx;
import defpackage.op8;
import defpackage.q3;
import defpackage.rlf;
import defpackage.tvl;
import defpackage.uag;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/platform/features/loyalty/upgradedialog/LoyaltyUpgradeActivity;", "Lpy1;", "Lk9j;", "Lrlf;", "<init>", "()V", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyUpgradeActivity extends tvl implements k9j, rlf {
    public static final a c = new a();
    public azm b;

    public static final class a {
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("tier", 0);
        uag uagVar = krf0.I;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (intExtra != ((krf0) next).a);
        final krf0 krf0Var = (krf0) next;
        if (krf0Var == null) {
            krf0Var = krf0.TIER_0;
        }
        zn8.a(this, new op8(-1710367081, new Function2() { // from class: n1u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LoyaltyUpgradeActivity.a aVar2 = LoyaltyUpgradeActivity.c;
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final LoyaltyUpgradeActivity loyaltyUpgradeActivity = this;
                    boolean zA = aVar.A(loyaltyUpgradeActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new o1u(loyaltyUpgradeActivity, i);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(loyaltyUpgradeActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: p1u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LoyaltyUpgradeActivity loyaltyUpgradeActivity2 = loyaltyUpgradeActivity;
                                azm azmVar = loyaltyUpgradeActivity2.b;
                                if (azmVar == null) {
                                    Intrinsics.n("iRouter");
                                    throw null;
                                }
                                azmVar.d(wae.ME_GIFTS);
                                loyaltyUpgradeActivity2.finish();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    c2u.g(krf0Var, function0, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
