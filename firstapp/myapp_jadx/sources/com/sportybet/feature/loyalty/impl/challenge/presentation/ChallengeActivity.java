package com.sportybet.feature.loyalty.impl.challenge.presentation;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bnh0;
import defpackage.elf;
import defpackage.esm;
import defpackage.op8;
import defpackage.rlf;
import defpackage.vnl;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/challenge/presentation/ChallengeActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChallengeActivity extends vnl implements rlf, bb40 {
    public static final /* synthetic */ int e = 0;
    public bnh0 b;
    public azm c;
    public esm d;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        zn8.a(this, new op8(-1396540016, new Function2() { // from class: sw6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = ChallengeActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ChallengeActivity challengeActivity = this.a;
                    l0u.c(null, null, null, false, pp8.b(-366504868, new Function2() { // from class: tw6
                        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i2;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i3 = ChallengeActivity.e;
                            int i4 = 1;
                            int i5 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                Object objY = aVar2.y();
                                ChallengeActivity challengeActivity2 = challengeActivity;
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    AccountInfo accountInfoLastAccountInfo = challengeActivity2.getAccountManager().lastAccountInfo();
                                    if (accountInfoLastAccountInfo != null) {
                                        m0u.a aVar3 = m0u.b;
                                        int loyaltyCurrentTier = accountInfoLastAccountInfo.getLoyaltyCurrentTier();
                                        aVar3.getClass();
                                        m0u m0uVarA = m0u.a.a(loyaltyCurrentTier);
                                        if (m0uVarA != null) {
                                            switch (m0uVarA.ordinal()) {
                                                case 0:
                                                    i2 = R.string.page_loyalty__challenge_title_iron_img_v2;
                                                    break;
                                                case 1:
                                                    i2 = R.string.page_loyalty__challenge_title_copper_img_v2;
                                                    break;
                                                case 2:
                                                    i2 = R.string.page_loyalty__challenge_title_bronze_img_v2;
                                                    break;
                                                case 3:
                                                    i2 = R.string.page_loyalty__challenge_title_silver_img_v2;
                                                    break;
                                                case 4:
                                                    i2 = R.string.page_loyalty__challenge_title_gold_img_v2;
                                                    break;
                                                case 5:
                                                    i2 = R.string.page_loyalty__challenge_title_platinum_img_v2;
                                                    break;
                                                case 6:
                                                    i2 = R.string.page_loyalty__challenge_title_titanium_img_v2;
                                                    break;
                                                case 7:
                                                    i2 = R.string.page_loyalty__challenge_title_diamond_img_v2;
                                                    break;
                                                default:
                                                    uhc.a();
                                                    return null;
                                            }
                                            objY = challengeActivity2.getCMSString(i2, new Object[0]);
                                        } else {
                                            objY = null;
                                        }
                                    } else {
                                        objY = null;
                                    }
                                    aVar2.r(objY);
                                }
                                String str = (String) objY;
                                gan.a(ay0.v(new String[]{str, cb40.a(R.string.page_loyalty__challenge_title_challenge_img_v2, new Object[0], aVar2)}), str != null, 0.0f, 0, aVar2, 0);
                                boolean zA = aVar2.A(challengeActivity2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == c0042a) {
                                    objY2 = new ws1(challengeActivity2, i4);
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA2 = aVar2.A(challengeActivity2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new uw6(challengeActivity2, i5);
                                    aVar2.r(objY3);
                                }
                                Function1 function1 = (Function1) objY3;
                                boolean zA3 = aVar2.A(challengeActivity2);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a) {
                                    objY4 = new ys1(challengeActivity2, i4);
                                    aVar2.r(objY4);
                                }
                                Function0 function2 = (Function0) objY4;
                                boolean zA4 = aVar2.A(challengeActivity2);
                                Object objY5 = aVar2.y();
                                if (zA4 || objY5 == c0042a) {
                                    objY5 = new vw6(challengeActivity2, i5);
                                    aVar2.r(objY5);
                                }
                                y17.a(function0, function1, function2, (Function0) objY5, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576, 15);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
