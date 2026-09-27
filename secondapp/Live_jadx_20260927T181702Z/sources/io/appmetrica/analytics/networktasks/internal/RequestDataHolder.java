package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class RequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f98946a = NetworkTask.Method.GET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f98947b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f98948c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f98949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f98950e;

    public void applySendTime(long j10) {
        this.f98949d = Long.valueOf(j10);
        this.f98950e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j10) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f98947b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f98946a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.f98948c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.f98949d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.f98950e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f98947b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(@Nullable byte[] bArr) {
        this.f98946a = NetworkTask.Method.POST;
        this.f98948c = bArr;
    }
}
