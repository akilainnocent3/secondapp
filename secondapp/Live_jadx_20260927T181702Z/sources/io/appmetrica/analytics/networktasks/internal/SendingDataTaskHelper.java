package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f98955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f98956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f98957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f98958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f98959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f98960f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f98960f.handle(this.f98959e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f98958d.applySendTime(this.f98957c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f98956b.compress(bArr);
            if (bArrCompress != null && (bArrEncrypt = this.f98955a.encrypt(bArrCompress)) != null) {
                this.f98958d.setPostData(bArrEncrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f98955a = requestBodyEncrypter;
        this.f98956b = compressor;
        this.f98957c = timeProvider;
        this.f98958d = requestDataHolder;
        this.f98959e = responseDataHolder;
        this.f98960f = networkResponseHandler;
    }
}
