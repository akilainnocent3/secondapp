package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import defpackage.xdk0;
import defpackage.zdk0;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        public static Builder builder() {
            i iVar = new i();
            iVar.a(0);
            return iVar;
        }

        public abstract int a();

        public abstract long b();

        public abstract String c();
    }

    public static abstract class StandardIntegrityDialogRequest {

        public static abstract class Builder {
            public abstract StandardIntegrityDialogRequest build();

            public abstract Builder setActivity(Activity activity);

            public abstract Builder setStandardIntegrityResponse(StandardIntegrityResponse standardIntegrityResponse);

            public abstract Builder setTypeCode(int i);
        }

        public static abstract class StandardIntegrityResponse {

            public static final class ExceptionDetails extends StandardIntegrityResponse {
                private final StandardIntegrityException a;

                public ExceptionDetails(StandardIntegrityException standardIntegrityException) {
                    super(null);
                    standardIntegrityException.getClass();
                    this.a = standardIntegrityException;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                public final void a(boolean z) {
                    this.a.a(true);
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                public final boolean b(int i) {
                    if (i == 4 || i == 5) {
                        return this.a.b();
                    }
                    return false;
                }

                public StandardIntegrityException getException() {
                    return this.a;
                }
            }

            public static final class TokenResponse extends StandardIntegrityResponse {
                private final StandardIntegrityToken a;

                public TokenResponse(StandardIntegrityToken standardIntegrityToken) {
                    super(null);
                    standardIntegrityToken.getClass();
                    this.a = standardIntegrityToken;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                public final void a(boolean z) {
                    StandardIntegrityToken standardIntegrityToken = this.a;
                    if (standardIntegrityToken instanceof bw) {
                        ((bw) standardIntegrityToken).b(true);
                    }
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse
                public final boolean b(int i) {
                    StandardIntegrityToken standardIntegrityToken = this.a;
                    if (standardIntegrityToken instanceof bw) {
                        return ((bw) standardIntegrityToken).c();
                    }
                    return false;
                }

                public StandardIntegrityToken getToken() {
                    return this.a;
                }
            }

            public /* synthetic */ StandardIntegrityResponse(bc bcVar) {
            }

            public abstract void a(boolean z);

            public abstract boolean b(int i);

            private StandardIntegrityResponse() {
                throw null;
            }
        }

        public static Builder builder() {
            return new l();
        }

        public abstract Activity activity();

        public abstract StandardIntegrityResponse standardIntegrityResponse();

        public abstract int typeCode();
    }

    public static abstract class StandardIntegrityToken {
        @Deprecated
        public abstract Task<Integer> showDialog(Activity activity, int i);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);

            public abstract Builder setVerdictOptOut(Set<Integer> set);
        }

        public static Builder builder() {
            o oVar = new o();
            int i = xdk0.c;
            oVar.setVerdictOptOut(zdk0.i);
            return oVar;
        }

        public abstract String requestHash();

        public abstract Set<Integer> verdictOptOut();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);

    Task<Integer> showDialog(StandardIntegrityDialogRequest standardIntegrityDialogRequest);
}
