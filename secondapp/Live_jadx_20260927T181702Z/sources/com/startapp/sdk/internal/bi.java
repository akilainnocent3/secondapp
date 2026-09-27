package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class bi implements TypeParser<Long> {
    @Override // com.startapp.json.TypeParser
    public final Long parse(Class<Long> cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(si.f((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
