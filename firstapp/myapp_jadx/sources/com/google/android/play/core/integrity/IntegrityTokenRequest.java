package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IntegrityTokenRequest {

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new f();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
