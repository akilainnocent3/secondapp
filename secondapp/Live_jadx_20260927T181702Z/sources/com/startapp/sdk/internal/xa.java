package com.startapp.sdk.internal;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class xa implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75820a;

    public xa(String str) {
        this.f75820a = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object objOpt = ((JSONObject) obj).opt(this.f75820a);
        Object objOpt2 = ((JSONObject) obj2).opt(this.f75820a);
        if ((objOpt instanceof Comparable) && (objOpt2 instanceof Comparable)) {
            if (objOpt.getClass() == objOpt2.getClass()) {
                return ((Comparable) objOpt).compareTo(objOpt2);
            }
            if ((objOpt instanceof Number) && (objOpt2 instanceof Number)) {
                return Double.compare(((Number) objOpt).doubleValue(), ((Number) objOpt2).doubleValue());
            }
        }
        Object obj3 = JSONObject.NULL;
        if (objOpt == obj3) {
            objOpt = null;
        }
        if (objOpt2 == obj3) {
            objOpt2 = null;
        }
        if (objOpt != null && objOpt2 != null) {
            return objOpt.toString().compareTo(objOpt2.toString());
        }
        if (objOpt != null) {
            return 1;
        }
        return objOpt2 != null ? -1 : 0;
    }
}
