package com.google.android.play.core.integrity;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IntegrityDialogRequest {

    public static abstract class Builder {
        public abstract IntegrityDialogRequest build();

        public abstract Builder setActivity(Activity activity);

        public abstract Builder setIntegrityResponse(IntegrityResponse integrityResponse);

        public abstract Builder setTypeCode(int i);
    }

    public static abstract class IntegrityResponse {

        public static final class ExceptionDetails extends IntegrityResponse {
            private final IntegrityServiceException a;

            public ExceptionDetails(IntegrityServiceException integrityServiceException) {
                super(null);
                integrityServiceException.getClass();
                this.a = integrityServiceException;
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            public final void a(boolean z) {
                this.a.a(true);
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            public final boolean b(int i) {
                if (i == 4 || i == 5) {
                    return this.a.b();
                }
                return false;
            }
        }

        public static final class TokenResponse extends IntegrityResponse {
            private final IntegrityTokenResponse a;

            public TokenResponse(IntegrityTokenResponse integrityTokenResponse) {
                super(null);
                integrityTokenResponse.getClass();
                this.a = integrityTokenResponse;
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            public final void a(boolean z) {
                IntegrityTokenResponse integrityTokenResponse = this.a;
                if (integrityTokenResponse instanceof av) {
                    ((av) integrityTokenResponse).b(true);
                }
            }

            @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse
            public final boolean b(int i) {
                IntegrityTokenResponse integrityTokenResponse = this.a;
                if (integrityTokenResponse instanceof av) {
                    return ((av) integrityTokenResponse).c();
                }
                return false;
            }

            public final IntegrityTokenResponse c() {
                return this.a;
            }
        }

        public /* synthetic */ IntegrityResponse(af afVar) {
        }

        public abstract void a(boolean z);

        public abstract boolean b(int i);

        private IntegrityResponse() {
            throw null;
        }
    }

    public static Builder builder() {
        return new c();
    }

    public abstract Activity activity();

    public abstract IntegrityResponse integrityResponse();

    public abstract int typeCode();
}
