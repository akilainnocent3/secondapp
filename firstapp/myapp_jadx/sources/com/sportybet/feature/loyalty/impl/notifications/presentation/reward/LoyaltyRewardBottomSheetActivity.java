package com.sportybet.feature.loyalty.impl.notifications.presentation.reward;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.reward.LoyaltyRewardBottomSheetActivity;
import defpackage.ay0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.gan;
import defpackage.op8;
import defpackage.pvl;
import defpackage.qw90;
import defpackage.rlf;
import defpackage.vch0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/reward/LoyaltyRewardBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyRewardBottomSheetActivity extends pvl implements rlf, bb40 {
    public static final a c = new a();
    public azm b;

    public static final class a {
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final ResourceUiText resourceUiText;
        super.onCreate(bundle);
        gan.d(qw90.a(this), this, getCMSString(R.string.page_loyalty__popup_reward_img, new Object[0]), true);
        int intExtra = getIntent().getIntExtra("KEY_REWARD_COUNT", 0);
        if (intExtra > 1) {
            Object[] objArr = {Integer.valueOf(intExtra)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_loyalty__popup_reward_content_plural, ay0.S(objArr));
        } else {
            Object[] objArr2 = {Integer.valueOf(intExtra)};
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_loyalty__popup_reward_content, ay0.S(objArr2));
        }
        zn8.a(this, new op8(-2066673148, new Function2() { // from class: zxt
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LoyaltyRewardBottomSheetActivity.a aVar2 = LoyaltyRewardBottomSheetActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(283324979, new ayt(resourceUiText, this), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
