package com.sportybet.android.user.kyc;

import android.webkit.CookieManager;
import defpackage.c0d;
import defpackage.gip;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
@c0d(c = "com.sportybet.android.user.kyc.KYCActivity$setCookies$1$1$1", f = "KYCActivity.kt", l = {168}, m = "invokeSuspend", v = 2)
public final class KYCActivity$setCookies$1$1$1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    final /* synthetic */ String $kycUrl;
    final /* synthetic */ CookieManager $this_run;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KYCActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCActivity$setCookies$1$1$1(CookieManager cookieManager, String str, KYCActivity kYCActivity, v1b<? super KYCActivity$setCookies$1$1$1> v1bVar) {
        super(2, v1bVar);
        this.$this_run = cookieManager;
        this.$kycUrl = str;
        this.this$0 = kYCActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new KYCActivity$setCookies$1$1$1(this.$this_run, this.$kycUrl, this.this$0, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((KYCActivity$setCookies$1$1$1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CookieManager cookieManager;
        String str;
        y5b y5bVar = y5b.a;
        int i = this.label;
        if (i == 0) {
            uj50.b(obj);
            CookieManager cookieManager2 = this.$this_run;
            String str2 = this.$kycUrl;
            gip gipVar = this.this$0.v;
            if (gipVar == null) {
                Intrinsics.n("kycTierVisibilityDataStore");
                throw null;
            }
            this.L$0 = cookieManager2;
            this.L$1 = str2;
            this.label = 1;
            Object obj2 = gipVar.b.F() ? gipVar.a.getBoolean("show_tier_level_3", false, this) : Boolean.TRUE;
            if (obj2 == y5bVar) {
                return y5bVar;
            }
            obj = obj2;
            cookieManager = cookieManager2;
            str = str2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            cookieManager = (CookieManager) this.L$0;
            uj50.b(obj);
        }
        cookieManager.setCookie(str, "hide_tier_3=" + (!((Boolean) obj).booleanValue()) + "; path=/");
        return Unit.a;
    }
}
