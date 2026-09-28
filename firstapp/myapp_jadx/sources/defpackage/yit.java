package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes5.dex */
public enum yit {
    NORMAL(AnalyticsParam.DATA_NORMAL),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK("facebook");

    public final String a;

    yit(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
