package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.bcp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualEventListRawData;", "", "", "", "keys", "Lbcp;", "value", "<init>", "(Ljava/util/Map;Lbcp;)V", "component1", "()Ljava/util/Map;", "component2", "()Lbcp;", "copy", "(Ljava/util/Map;Lbcp;)Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualEventListRawData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getKeys", "Lbcp;", "getValue", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantVirtualEventListRawData {
    public static final int $stable = 8;

    @SerializedName("keys")
    private final Map<String, String> keys;

    @SerializedName("value")
    private final bcp value;

    public InstantVirtualEventListRawData(Map<String, String> map, bcp bcpVar) {
        map.getClass();
        bcpVar.getClass();
        this.keys = map;
        this.value = bcpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstantVirtualEventListRawData copy$default(InstantVirtualEventListRawData instantVirtualEventListRawData, Map map, bcp bcpVar, int i, Object obj) {
        if ((i & 1) != 0) {
            map = instantVirtualEventListRawData.keys;
        }
        if ((i & 2) != 0) {
            bcpVar = instantVirtualEventListRawData.value;
        }
        return instantVirtualEventListRawData.copy(map, bcpVar);
    }

    public final Map<String, String> component1() {
        return this.keys;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final bcp getValue() {
        return this.value;
    }

    public final InstantVirtualEventListRawData copy(Map<String, String> keys, bcp value) {
        keys.getClass();
        value.getClass();
        return new InstantVirtualEventListRawData(keys, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantVirtualEventListRawData)) {
            return false;
        }
        InstantVirtualEventListRawData instantVirtualEventListRawData = (InstantVirtualEventListRawData) other;
        return Intrinsics.g(this.keys, instantVirtualEventListRawData.keys) && Intrinsics.g(this.value, instantVirtualEventListRawData.value);
    }

    public final Map<String, String> getKeys() {
        return this.keys;
    }

    public final bcp getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.a.hashCode() + (this.keys.hashCode() * 31);
    }

    public String toString() {
        return "InstantVirtualEventListRawData(keys=" + this.keys + ", value=" + this.value + ")";
    }
}
