package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class CacheControlHttpsConnectionPerformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f98913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f98914b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Client {
        @Nullable
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        String str2;
        try {
            a aVar = this.f98913a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f98914b;
            aVar.getClass();
            Response responseA = a.a(oldETag, str, sSLSocketFactory);
            int code = responseA.getCode();
            if (code != 200) {
                if (code != 304) {
                    client.onError();
                    return;
                } else {
                    client.onNotModified();
                    return;
                }
            }
            List list = (List) CollectionUtils.getFromMapIgnoreCase(responseA.getHeaders(), "ETag");
            if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
                str2 = "";
            }
            client.onResponse(str2, responseA.getResponseData());
        } catch (Throwable unused) {
        }
    }

    public CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f98913a = aVar;
        this.f98914b = sSLSocketFactory;
    }
}
