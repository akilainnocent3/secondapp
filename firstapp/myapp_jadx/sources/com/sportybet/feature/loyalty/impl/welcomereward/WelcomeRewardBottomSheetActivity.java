package com.sportybet.feature.loyalty.impl.welcomereward;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.gan;
import defpackage.jq40;
import defpackage.op8;
import defpackage.q7m;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qw90;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.u1j0;
import defpackage.v8i0;
import defpackage.x0j0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/welcomereward/WelcomeRewardBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WelcomeRewardBottomSheetActivity extends q7m implements rlf, bb40 {
    public static final /* synthetic */ int d = 0;
    public final q8i0 b = new q8i0(jq40.a(u1j0.class), new b(), new a(), new c());
    public azm c;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return WelcomeRewardBottomSheetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return WelcomeRewardBottomSheetActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return WelcomeRewardBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gan.d(qw90.a(this), this, getCMSString(R.string.page_loyalty__popup_reward_img, new Object[0]), true);
        ((u1j0) this.b.getValue()).x1(new x0j0.o(0));
        zn8.a(this, new op8(960760176, new Function2() { // from class: r1j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = WelcomeRewardBottomSheetActivity.d;
                int i2 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-986786017, new kqa(this.a, i2), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
