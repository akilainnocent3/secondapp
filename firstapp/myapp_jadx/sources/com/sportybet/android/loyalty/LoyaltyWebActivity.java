package com.sportybet.android.loyalty;

import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import defpackage.arr;
import defpackage.c0d;
import defpackage.g1i;
import defpackage.m2l;
import defpackage.m2u;
import defpackage.ozh;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.u2u;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.vvl;
import defpackage.y5b;
import defpackage.zed;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/loyalty/LoyaltyWebActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyWebActivity extends vvl {
    public static final /* synthetic */ int d = 0;
    public uqm b;
    public u2u c;

    public static final class a {
    }

    @c0d(c = "com.sportybet.android.loyalty.LoyaltyWebActivity$onCreate$1", f = "LoyaltyWebActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = LoyaltyWebActivity.this.new b(v1bVar);
            bVar.a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z) {
                LoyaltyWebActivity loyaltyWebActivity = LoyaltyWebActivity.this;
                uqm uqmVar = loyaltyWebActivity.b;
                if (uqmVar == null) {
                    Intrinsics.n("iAccountHelper");
                    throw null;
                }
                if (uqmVar.isLogin()) {
                    loyaltyWebActivity.startActivity(new Intent(loyaltyWebActivity, (Class<?>) LoyaltyActivity.class));
                    loyaltyWebActivity.finish();
                }
            }
            return Unit.a;
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u2u u2uVar = this.c;
        if (u2uVar == null) {
            Intrinsics.n("loyaltyUseCase");
            throw null;
        }
        m2l m2lVar = u2uVar.c;
        m2lVar.getClass();
        g1i g1iVar = new g1i(ozh.c(new m2u((zed.x) m2lVar.a.getLongByFlow("firebase_remote_config_last_fetch_time", -1L), u2uVar), u2uVar.a), new b(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.e);
    }
}
