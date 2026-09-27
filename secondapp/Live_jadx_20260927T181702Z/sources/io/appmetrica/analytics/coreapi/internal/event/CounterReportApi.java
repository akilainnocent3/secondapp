package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    @l
    Map<String, byte[]> getExtras();

    @m
    String getName();

    int getType();

    @m
    String getValue();

    @m
    byte[] getValueBytes();

    void setBytesTruncated(int i10);

    void setCustomType(int i10);

    void setExtras(@l Map<String, byte[]> map);

    void setName(@m String str);

    void setType(int i10);

    void setValue(@m String str);

    void setValueBytes(@m byte[] bArr);
}
