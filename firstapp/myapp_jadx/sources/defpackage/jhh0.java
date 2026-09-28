package defpackage;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class jhh0 extends UnsupportedOperationException {
    public final Feature a;

    public jhh0(Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
