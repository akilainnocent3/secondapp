package com.sporty.android.platform.features.loyalty.downgrade;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.loyalty.downgrade.LoyaltyDowngradeDialogActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.ay0;
import defpackage.azm;
import defpackage.bjb0;
import defpackage.bnh0;
import defpackage.k9j;
import defpackage.krf0;
import defpackage.l6f;
import defpackage.lvl;
import defpackage.op8;
import defpackage.psm;
import defpackage.rlf;
import defpackage.tug;
import defpackage.vch0;
import defpackage.zi50;
import defpackage.zn8;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/platform/features/loyalty/downgrade/LoyaltyDowngradeDialogActivity;", "Lpy1;", "Lk9j;", "Lrlf;", "<init>", "()V", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyDowngradeDialogActivity extends lvl implements k9j, rlf {
    public static final a e = new a();
    public psm b;
    public azm c;
    public bnh0 d;

    public static final class a {
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        Object bVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        int intExtra = intent.getIntExtra("tier", 0);
        Iterator<T> it = krf0.I.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((krf0) next).a != intExtra);
        krf0 krf0Var = (krf0) next;
        if (krf0Var == null) {
            krf0Var = krf0.TIER_0;
        }
        String stringExtra = intent.getStringExtra("currency");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra = intent.getLongExtra("minMonthWager", 0L);
        try {
            zi50.a aVar = zi50.b;
            bVar = bjb0.M(new BigDecimal(longExtra).divide(new BigDecimal(10000)));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str = (String) bVar;
        if (str == null) {
            str = "0";
        }
        psm psmVar = this.b;
        if (psmVar == null) {
            Intrinsics.n("iCountryManager");
            throw null;
        }
        String str2 = psmVar.x() ? "https://s.sporty.net/cms/people_2_5e14204d6d.png" : "https://s.sporty.net/cms/people_e220e2a4bc.png";
        int i = krf0Var.b;
        StringUiText stringUiText = vch0.a;
        final l6f l6fVar = new l6f(new ConcatUiText(new UiText[]{new ResourceUiText(i), new ResourceUiText(R.string.page_loyalty__tier), new StringUiText(" ")}), new StringUiText(tug.a(str, " ", stringExtra)), new ResourceUiText(R.string.page_loyalty__to_remain_at, ay0.S(new Object[]{new ResourceUiText(krf0Var.b)})), str2);
        zn8.a(this, new op8(1900885766, new Function2() { // from class: nst
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LoyaltyDowngradeDialogActivity.a aVar4 = LoyaltyDowngradeDialogActivity.e;
                int i2 = 1;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final LoyaltyDowngradeDialogActivity loyaltyDowngradeDialogActivity = this;
                    boolean zA = aVar3.A(loyaltyDowngradeDialogActivity);
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: ost
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LoyaltyDowngradeDialogActivity.a aVar5 = LoyaltyDowngradeDialogActivity.e;
                                loyaltyDowngradeDialogActivity.finish();
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar3.A(loyaltyDowngradeDialogActivity);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new iwj(loyaltyDowngradeDialogActivity, i2);
                        aVar3.r(objY2);
                    }
                    att.f(l6fVar, function0, (Function0) objY2, aVar3, 0);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
