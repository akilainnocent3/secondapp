package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class yho implements dn20 {
    public static final /* synthetic */ ohp<Object>[] o = {new d630(0, yho.class, "footballFamilyLastSelectedSpeedOptionIdMapString", "getFootballFamilyLastSelectedSpeedOptionIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "footballFamilySpeedControllerShouldShowRedDotIdMapString", "getFootballFamilySpeedControllerShouldShowRedDotIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "footballFamilySpeedControllerShouldShowTooltipIdMapString", "getFootballFamilySpeedControllerShouldShowTooltipIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "lastFocusedLeagueIdMapString", "getLastFocusedLeagueIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "lastFocusedMarketGroupIdMapString", "getLastFocusedMarketGroupIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "lastFocusedMarketTypeMapString", "getLastFocusedMarketTypeMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "lastGiftHintDisplayTimestampMapString", "getLastGiftHintDisplayTimestampMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "lastSelectedSpeedOptionIdMapString", "getLastSelectedSpeedOptionIdMapString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "simLastSelectedSpeedOptionId", "getSimLastSelectedSpeedOptionId()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "sportyLegendsSettlementAnimationModeType", "getSportyLegendsSettlementAnimationModeType()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "acknowledgedCompletedMissionIds", "getAcknowledgedCompletedMissionIds()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "legendsHeadToHeadStatsButtonClicked", "getLegendsHeadToHeadStatsButtonClicked()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "hasEventSwitcherTooltipShown", "getHasEventSwitcherTooltipShown()Lcom/sportybet/core/datastore/Preference;"), new d630(0, yho.class, "hasClickedVirtualLobbyGetStartedButton", "getHasClickedVirtualLobbyGetStartedButton()Lcom/sportybet/core/datastore/Preference;")};
    public final /* synthetic */ zed a;
    public final rkd b = new rkd("football_family_last_selected_speed_option_id_map_string", jq40.a(String.class), this);
    public final rkd c = new rkd("football_family_speed_controller_should_show_red_dot_id_map_string", jq40.a(String.class), this);
    public final rkd d = new rkd("football_family_speed_controller_should_show_tooltip_id_map_string", jq40.a(String.class), this);
    public final rkd e = new rkd("last_focused_league_id_map_string", jq40.a(String.class), this);
    public final rkd f = new rkd("last_focused_market_group_id_map_string", jq40.a(String.class), this);
    public final rkd g = new rkd("last_focused_market_type_map_string", jq40.a(String.class), this);
    public final rkd h = new rkd("last_gift_hint_display_timestamp_map_string", jq40.a(String.class), this);
    public final rkd i;
    public final rkd j;
    public final rkd k;
    public final rkd l;
    public final rkd m;
    public final rkd n;

    public yho(Context context) {
        this.a = new zed(zho.b.a(context, zho.a[0]));
        jq40.a(String.class);
        this.i = new rkd("sim_last_selected_speed_option_id", jq40.a(String.class), this);
        this.j = new rkd("sporty_legends_settlement_animation_mode_type", jq40.a(sk3.class), this);
        this.k = new rkd("acknowledged_completed_mission_ids", jq40.a(String.class), this);
        this.l = new rkd("legends_head_to_head_stats_button_clicked", jq40.a(Boolean.class), this);
        this.m = new rkd("has_event_switcher_tooltip_shown", jq40.a(Boolean.class), this);
        this.n = new rkd("has_clicked_virtual_lobby_get_started_button", jq40.a(Boolean.class), this);
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
