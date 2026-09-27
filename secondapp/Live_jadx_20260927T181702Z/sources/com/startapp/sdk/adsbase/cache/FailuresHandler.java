package com.startapp.sdk.adsbase.cache;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;

    @TypeInfo(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(10, 30, 60, 300);
    private boolean infiniteLastRetry = true;

    public final List a() {
        return this.intervals;
    }

    public final boolean b() {
        return this.infiniteLastRetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FailuresHandler failuresHandler = (FailuresHandler) obj;
            if (this.infiniteLastRetry == failuresHandler.infiniteLastRetry && si.a(this.intervals, failuresHandler.intervals)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
