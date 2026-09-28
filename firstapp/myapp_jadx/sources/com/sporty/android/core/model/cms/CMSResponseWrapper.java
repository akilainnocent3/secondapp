package com.sporty.android.core.model.cms;

import com.google.gson.annotations.SerializedName;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0004HÖ\u0081\u0004R;\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/cms/CMSResponseWrapper;", "", "keys", "", "", "Lcom/sporty/android/core/model/cms/CMSResponse;", "<init>", "(Ljava/util/Map;)V", "getKeys", "()Ljava/util/Map;", "setKeys", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CMSResponseWrapper {

    @SerializedName("keys")
    private Map<String, CMSResponse> keys;

    public /* synthetic */ CMSResponseWrapper(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CMSResponseWrapper copy$default(CMSResponseWrapper cMSResponseWrapper, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cMSResponseWrapper.keys;
        }
        return cMSResponseWrapper.copy(map);
    }

    public final Map<String, CMSResponse> component1() {
        return this.keys;
    }

    public final CMSResponseWrapper copy(Map<String, CMSResponse> keys) {
        return new CMSResponseWrapper(keys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CMSResponseWrapper) && Intrinsics.g(this.keys, ((CMSResponseWrapper) other).keys);
    }

    public final Map<String, CMSResponse> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        Map<String, CMSResponse> map = this.keys;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setKeys(Map<String, CMSResponse> map) {
        this.keys = map;
    }

    public String toString() {
        return tYcQsJyaojE.tUeWhIMc + this.keys + ")";
    }

    public CMSResponseWrapper(Map<String, CMSResponse> map) {
        this.keys = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CMSResponseWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
