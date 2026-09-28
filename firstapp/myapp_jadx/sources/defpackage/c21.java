package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c21 {

    /* JADX INFO: Fake field, exist only in values array */
    c21 EF5;
    public static final /* synthetic */ c21[] b = {new c21(EventKeys.REGION, 0), new c21("boundingbox", 1), new c21("mesh", 2), new c21("linkedmesh", 3), new c21(AnalyticsParam.EVENT_PATH, 4), new c21("point", 5), new c21("clipping", 6), new c21("sequence", 7)};
    public static final c21[] a = values();

    public c21() {
        throw null;
    }

    public static c21 valueOf(String str) {
        return (c21) Enum.valueOf(c21.class, str);
    }

    public static c21[] values() {
        return (c21[]) b.clone();
    }
}
