package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class vxt implements dn20, ejt {
    public static final /* synthetic */ ohp<Object>[] h = {new d630(0, vxt.class, "isUserTierUnlocked", "isUserTierUnlocked()Lcom/sportybet/core/datastore/Preference;"), new d630(0, vxt.class, "isUnlockedBottomSheetEverShown", "isUnlockedBottomSheetEverShown()Lcom/sportybet/core/datastore/Preference;"), new d630(0, vxt.class, "betslipThemeTooltipAcked", "getBetslipThemeTooltipAcked()Lcom/sportybet/core/datastore/Preference;"), new d630(0, vxt.class, "loyaltyTier", "getLoyaltyTier()Lcom/sportybet/core/datastore/Preference;"), new d630(0, vxt.class, "shouldSkipLoyaltyBallFlicking", "getShouldSkipLoyaltyBallFlicking()Lcom/sportybet/core/datastore/Preference;"), new d630(0, vxt.class, "viewedDobBenefitStatus", "getViewedDobBenefitStatus()Lcom/sportybet/core/datastore/Preference;")};
    public static final int i = 8;
    public final /* synthetic */ zed a;
    public final rkd b = new rkd("is_user_tier_unlocked", jq40.a(Boolean.class), this);
    public final rkd c = new rkd("is_unlocked_bottom_sheet_ever_shown", jq40.a(Boolean.class), this);
    public final rkd d = new rkd("betslip_theme_tooltip_acked", jq40.a(Boolean.class), this);
    public final rkd e = new rkd("key_loyalty_tier", jq40.a(Integer.class), this);
    public final rkd f = new rkd("should_skip_loyalty_ball_flicking", jq40.a(Boolean.class), this);
    public final rkd g = new rkd("viewed_dob_benefit_status", jq40.a(String.class), this);

    @c0d(c = "com.sportybet.feature.loyalty.api.datastore.LoyaltyPreferencesDataStore", f = "LoyaltyPreferencesDataStore.kt", l = {73, 74}, m = "clearUserData", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return vxt.this.clearUserData(this);
        }
    }

    public vxt(Context context) {
        this.a = new zed(wxt.b.a(context, wxt.a[0]));
    }

    public final wm20<Integer> a() {
        return this.e.a(this, h[3]);
    }

    public final wm20<Boolean> b() {
        return this.b.a(this, h[0]);
    }

    @Override // defpackage.dn20
    public final <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        return this.a.clearPreference(aVar, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ejt
    public final Object clearUserData(v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i3 = aVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            wm20<Boolean> wm20VarB = b();
            aVar.c = 1;
            if (wm20VarB.a(aVar) != y5bVar) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        wm20 wm20VarA = this.c.a(this, h[1]);
        aVar.c = 2;
        Object objA = wm20VarA.a(aVar);
        return objA == y5bVar ? y5bVar : objA;
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str) {
        str.getClass();
        return this.a.getBooleanByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, double d, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str) {
        str.getClass();
        return this.a.getDoubleByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, float f, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str) {
        str.getClass();
        return this.a.getFloatByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, int i2, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, i2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str) {
        str.getClass();
        return this.a.getIntFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, long j, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, j, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str) {
        str.getClass();
        return this.a.getLongByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, v1b<? super String> v1bVar) {
        return this.a.getString(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.a.getStringByFlow(str, str2);
    }

    @Override // defpackage.dn20
    public final Object putBoolean(String str, Boolean bool, v1b<? super Unit> v1bVar) {
        return this.a.putBoolean(str, bool, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putDouble(String str, Double d, v1b<? super Unit> v1bVar) {
        return this.a.putDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putFloat(String str, Float f, v1b<? super Unit> v1bVar) {
        return this.a.putFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putInt(String str, Integer num, v1b<? super Unit> v1bVar) {
        return this.a.putInt(str, num, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putLong(String str, Long l, v1b<? super Unit> v1bVar) {
        return this.a.putLong(str, l, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object putString(String str, String str2, v1b<? super Unit> v1bVar) {
        return this.a.putString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, boolean z, v1b<? super Boolean> v1bVar) {
        return this.a.getBoolean(str, z, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, v1b<? super Double> v1bVar) {
        return this.a.getDouble(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, v1b<? super Long> v1bVar) {
        return this.a.getLong(str, v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, String str2, v1b<? super String> v1bVar) {
        return this.a.getString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str, boolean z) {
        str.getClass();
        return this.a.getBooleanByFlow(str, z);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str, double d) {
        str.getClass();
        return this.a.getDoubleByFlow(str, d);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str, float f) {
        str.getClass();
        return this.a.getFloatByFlow(str, f);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str, int i2) {
        str.getClass();
        return this.a.getIntFlow(str, i2);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str, long j) {
        str.getClass();
        return this.a.getLongByFlow(str, j);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str) {
        str.getClass();
        return this.a.getStringByFlow(str);
    }
}
