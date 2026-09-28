package com.sportybet.plugin.lgg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/plugin/lgg/LggInfoShowRecord;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LggInfoShowRecord implements Parcelable {
    public static final Parcelable.Creator<LggInfoShowRecord> CREATOR = new a();
    public final Map<String, Long> a;

    public static final class a implements Parcelable.Creator<LggInfoShowRecord> {
        @Override // android.os.Parcelable.Creator
        public final LggInfoShowRecord createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Long.valueOf(parcel.readLong()));
            }
            return new LggInfoShowRecord(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LggInfoShowRecord[] newArray(int i) {
            return new LggInfoShowRecord[i];
        }
    }

    public LggInfoShowRecord(Map<String, Long> map) {
        map.getClass();
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LggInfoShowRecord) && Intrinsics.g(this.a, ((LggInfoShowRecord) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LggInfoShowRecord(map=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Map<String, Long> map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeLong(entry.getValue().longValue());
        }
    }
}
