package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ha implements TypeParser<int[][]> {
    @Override // com.startapp.json.TypeParser
    public final int[][] parse(Class<int[][]> cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            WeakHashMap weakHashMap = si.f75514a;
            try {
                return si.g(str);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
