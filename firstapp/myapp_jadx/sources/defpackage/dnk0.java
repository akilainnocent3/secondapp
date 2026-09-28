package defpackage;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class dnk0 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        Feature feature4 = new Feature("user_consent", 3L);
        a = feature4;
        b = new Feature[]{feature, feature2, feature3, feature4};
    }
}
