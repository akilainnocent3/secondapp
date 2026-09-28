package com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission;

import android.os.Bundle;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c24;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.g24;
import defpackage.jq40;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.v8i0;
import defpackage.zml;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/streakMission/BettingStreakMissionBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "Lj24;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BettingStreakMissionBottomSheetActivity extends zml implements rlf, bb40 {
    public static final /* synthetic */ int d = 0;
    public final q8i0 b = new q8i0(jq40.a(com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.c.class), new b(), new a(), new c());
    public azm c;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BettingStreakMissionBottomSheetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BettingStreakMissionBottomSheetActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BettingStreakMissionBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t340 t340Var = ((com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.c) this.b.getValue()).e;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new g24(this, t340Var, null, this), 3);
        zn8.a(this, new op8(-175516885, new c24(this, 0), true));
    }
}
