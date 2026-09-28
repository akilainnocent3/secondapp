package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.tracking.TrackingKind;
import com.sporty.android.core.model.tracking.TrackingType;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public interface pdd0 {
    default HashMap<String, Object> createCustomMetrics() {
        return new HashMap<>();
    }

    default HashMap<String, Object> getGetCustomMetrics() {
        Object obj = getProperty().get(AnalyticsParam.KEY_BI_CUSTOM_METRICS);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof HashMap)) {
            obj = null;
        }
        return (HashMap) obj;
    }

    String getName();

    default PageMeta getPageMeta() {
        return null;
    }

    default Map<String, Object> getProperty() {
        HashMap mapD = kpu.d(new Pair("name", getName()), new Pair("type", getTrackingType().getNameForBi()));
        HashMap<String, Object> mapCreateCustomMetrics = createCustomMetrics();
        if (mapCreateCustomMetrics.isEmpty()) {
            mapCreateCustomMetrics = null;
        }
        if (mapCreateCustomMetrics != null) {
            mapD.put(AnalyticsParam.KEY_BI_CUSTOM_METRICS, mapCreateCustomMetrics);
        }
        return mapD;
    }

    default TrackingKind getTrackingKind() {
        return TrackingKind.Event;
    }

    default TrackingType getTrackingType() {
        return TrackingType.BiAnalytics;
    }
}
