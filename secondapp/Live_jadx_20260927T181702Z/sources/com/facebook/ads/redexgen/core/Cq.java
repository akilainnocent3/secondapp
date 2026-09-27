package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C17205i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public Cq(long j10, C17205i c17205i, long j11) {
        Uri uri;
        if (c17205i != null) {
            uri = c17205i.A06;
        } else {
            uri = null;
        }
        this(j10, c17205i, uri, Collections.emptyMap(), j11, 0L, 0L);
    }

    public Cq(long j10, C17205i c17205i, Uri uri, Map<String, List<String>> responseHeaders, long j11, long j12, long j13) {
        this.A03 = j10;
        this.A05 = c17205i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
