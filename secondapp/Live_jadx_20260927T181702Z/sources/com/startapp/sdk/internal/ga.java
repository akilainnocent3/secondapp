package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ga implements TypeParser<int[]> {
    @Override // com.startapp.json.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int i10;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        int[] iArr = null;
        if (obj instanceof String) {
            WeakHashMap weakHashMap = si.f75514a;
            String[] strArrSplit = ((String) obj).split(",");
            int length = strArrSplit.length;
            int[] iArr2 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    iArr2[i11] = Integer.parseInt(strArrSplit[i11].trim());
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return iArr2;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            int length2 = jSONArray.length();
            iArr = new int[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                Object objOpt = jSONArray.opt(i12);
                if (objOpt instanceof Number) {
                    iArr[i12] = ((Number) objOpt).intValue();
                } else if (objOpt instanceof String) {
                    String str = (String) objOpt;
                    WeakHashMap weakHashMap2 = si.f75514a;
                    try {
                        i10 = Integer.parseInt(str);
                    } catch (NumberFormatException unused2) {
                        i10 = 0;
                    }
                    iArr[i12] = i10;
                }
            }
        }
        return iArr;
    }
}
