package defpackage;

import android.content.Context;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class w1j0 implements dn20 {
    public static final /* synthetic */ ohp<Object>[] i = {new d630(0, w1j0.class, "pageViewedCache", rarBonoqWB.RfLRGwEFIiHgO), new d630(0, w1j0.class, "bannerHideCache", "getBannerHideCache()Lcom/sportybet/core/datastore/Preference;"), new d630(0, w1j0.class, "welcomeRewardTimingConfig", "getWelcomeRewardTimingConfig()Lcom/sportybet/core/datastore/Preference;"), new d630(0, w1j0.class, "welcomeRewardData", "getWelcomeRewardData()Lcom/sportybet/core/datastore/Preference;"), new d630(0, w1j0.class, "lastShownPopupIndex", "getLastShownPopupIndex()Lcom/sportybet/core/datastore/Preference;"), new d630(0, w1j0.class, "lastCloseDepositToUnlockBt", "getLastCloseDepositToUnlockBt()Lcom/sportybet/core/datastore/Preference;"), new d630(0, w1j0.class, "allDoneAnimationShownCache", "getAllDoneAnimationShownCache()Lcom/sportybet/core/datastore/Preference;")};
    public final /* synthetic */ zed a;
    public final rkd b = new rkd("welcome_reward_page_view_record", jq40.a(String.class), this);
    public final rkd c = new rkd("welcome_reward_banner_hide_record", jq40.a(String.class), this);
    public final rkd d = new rkd("welcome_reward_timing_config", jq40.a(String.class), this);
    public final rkd e = new rkd("welcome_reward_data", jq40.a(String.class), this);
    public final rkd f = new rkd("last_shown_welcome_reward_popup_index", jq40.a(String.class), this);
    public final rkd g = new rkd("last_close_deposit_to_unlock_bt", jq40.a(Long.class), this);
    public final rkd h = new rkd("welcome_reward_all_done_animation_shown", jq40.a(String.class), this);

    public w1j0(Context context) {
        this.a = new zed(x1j0.b.a(context, x1j0.a[0]));
    }

    public final wm20<String> a() {
        return this.c.a(this, i[1]);
    }

    public final wm20<String> b() {
        return this.b.a(this, i[0]);
    }

    public final wm20<String> c() {
        return this.e.a(this, i[3]);
    }

    @Override // defpackage.dn20
    public final <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        return this.a.clearPreference(aVar, v1bVar);
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
