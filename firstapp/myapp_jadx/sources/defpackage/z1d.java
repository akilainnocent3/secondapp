package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class z1d implements dn20 {
    public static final /* synthetic */ ohp<Object>[] f = {new d630(0, z1d.class, "enableTestHeader", "getEnableTestHeader()Lcom/sportybet/core/datastore/Preference;"), new d630(0, z1d.class, "cashoutDebugMode", "getCashoutDebugMode()Lcom/sportybet/core/datastore/Preference;"), new d630(0, z1d.class, "zaDepositLobbyCutoffOverrideMillis", "getZaDepositLobbyCutoffOverrideMillis()Lcom/sportybet/core/datastore/Preference;"), new d630(0, z1d.class, "enableFakeBrLocationForPlacingBet", "getEnableFakeBrLocationForPlacingBet()Lcom/sportybet/core/datastore/Preference;")};
    public final /* synthetic */ zed a;
    public final rkd b = new rkd("enable_test_header", jq40.a(Boolean.class), this);
    public final rkd c = new rkd("cashout_debug_mode", jq40.a(Boolean.class), this);
    public final rkd d = new rkd("za_deposit_lobby_cutoff_override_millis", jq40.a(Long.class), this);
    public final rkd e = new rkd("enable_fake_br_location_for_placing_bet", jq40.a(Boolean.class), this);

    public z1d(Context context) {
        this.a = new zed(a2d.b.a(context, a2d.a[0]));
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
    public final Object getFloat(String str, float f2, v1b<? super Float> v1bVar) {
        return this.a.getFloat(str, f2, v1bVar);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str) {
        str.getClass();
        return this.a.getFloatByFlow(str);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, int i, v1b<? super Integer> v1bVar) {
        return this.a.getInt(str, i, v1bVar);
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
    public final Object putFloat(String str, Float f2, v1b<? super Unit> v1bVar) {
        return this.a.putFloat(str, f2, v1bVar);
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
    public final lyh<Float> getFloatByFlow(String str, float f2) {
        str.getClass();
        return this.a.getFloatByFlow(str, f2);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str, int i) {
        str.getClass();
        return this.a.getIntFlow(str, i);
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
