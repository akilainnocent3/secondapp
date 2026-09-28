package defpackage;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class oll0 {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        Feature feature3 = new Feature("get_last_activity_feature_id", 1L);
        Feature feature4 = new Feature("support_context_feature_id", 1L);
        Feature feature5 = new Feature("get_current_location", 2L);
        a = feature5;
        Feature feature6 = new Feature("get_last_location_with_request", 1L);
        Feature feature7 = new Feature("set_mock_mode_with_callback", 1L);
        Feature feature8 = new Feature("set_mock_location_with_callback", 1L);
        Feature feature9 = new Feature("inject_location_with_callback", 1L);
        Feature feature10 = new Feature("location_updates_with_callback", 1L);
        b = feature10;
        c = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, new Feature("use_safe_parcelable_in_intents", 1L), new Feature("flp_debug_updates", 1L), new Feature("google_location_accuracy_enabled", 1L), new Feature("geofences_with_callback", 1L), new Feature("location_enabled", 1L)};
    }
}
