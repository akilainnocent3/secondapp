package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes5.dex */
public enum f600 {
    DEPOSIT(AnalyticsEvent.DEPOSIT),
    WITHDRAW("withdraw");

    public final String a;

    f600(String str) {
        this.a = str;
    }
}
