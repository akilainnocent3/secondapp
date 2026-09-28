package com.sporty.android.platform.features.loyalty.unlockedbottomsheet;

import android.os.Bundle;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.platform.features.loyalty.unlockedbottomsheet.LoyaltyUnlockedActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.op8;
import defpackage.pwx;
import defpackage.rlf;
import defpackage.rvl;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/loyalty/unlockedbottomsheet/LoyaltyUnlockedActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lbb40;", "Lrlf;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyUnlockedActivity extends rvl implements zux, pwx, bb40, rlf {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-730723442, new Function2() { // from class: c1u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = LoyaltyUnlockedActivity.c;
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    final LoyaltyUnlockedActivity loyaltyUnlockedActivity = this.a;
                    boolean zA = aVar.A(loyaltyUnlockedActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new d1u(loyaltyUnlockedActivity, i2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(loyaltyUnlockedActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: e1u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = LoyaltyUnlockedActivity.c;
                                LoyaltyUnlockedActivity loyaltyUnlockedActivity2 = loyaltyUnlockedActivity;
                                loyaltyUnlockedActivity2.setResult(1);
                                azm azmVar = loyaltyUnlockedActivity2.b;
                                if (azmVar == null) {
                                    Intrinsics.n("router");
                                    throw null;
                                }
                                azmVar.d(wae.LOYALTY);
                                loyaltyUnlockedActivity2.finish();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    l1u.a(function0, (Function0) objY2, aVar, 0);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
