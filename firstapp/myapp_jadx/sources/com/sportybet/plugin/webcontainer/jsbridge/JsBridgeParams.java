package com.sportybet.plugin.webcontainer.jsbridge;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012BC\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\n\u0010\fB-\b\u0016\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001bJ.\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001bJ-\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(JL\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R4\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101¨\u00063"}, d2 = {"Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "", "primitiveParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "jsonParams", "<init>", "(Ljava/util/List;Ljava/util/HashMap;)V", "(Ljava/util/List;)V", "(Ljava/util/HashMap;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/HashMap;", "", "index", "getString", "(I)Ljava/lang/String;", "defaultValue", "(ILjava/lang/String;)Ljava/lang/String;", "key", "getParam", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "T", "getTypedParam", "getJsonParams", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(Ljava/util/List;Ljava/util/HashMap;)Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "Ljava/util/HashMap;", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class JsBridgeParams implements Parcelable, Serializable {
    private static final long serialVersionUID = 1;
    private final HashMap<String, Object> jsonParams;
    private final List<String> primitiveParams;
    public static final Parcelable.Creator<JsBridgeParams> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JsBridgeParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeParams createFromParcel(Parcel parcel) {
            HashMap map;
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map2.put(parcel.readString(), parcel.readValue(JsBridgeParams.class.getClassLoader()));
                }
                map = map2;
            }
            return new JsBridgeParams(arrayListCreateStringArrayList, map);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeParams[] newArray(int i) {
            return new JsBridgeParams[i];
        }
    }

    public /* synthetic */ JsBridgeParams(List list, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : map);
    }

    private final List<String> component1() {
        return this.primitiveParams;
    }

    private final HashMap<String, Object> component2() {
        return this.jsonParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsBridgeParams copy$default(JsBridgeParams jsBridgeParams, List list, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = jsBridgeParams.primitiveParams;
        }
        if ((i & 2) != 0) {
            map = jsBridgeParams.jsonParams;
        }
        return jsBridgeParams.copy(list, map);
    }

    public static Object getTypedParam$default(JsBridgeParams jsBridgeParams, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        str.getClass();
        if (jsBridgeParams.getParam(str) == null) {
            return obj;
        }
        Intrinsics.m();
        throw null;
    }

    public final JsBridgeParams copy(List<String> primitiveParams, HashMap<String, Object> jsonParams) {
        return new JsBridgeParams(primitiveParams, jsonParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsBridgeParams)) {
            return false;
        }
        JsBridgeParams jsBridgeParams = (JsBridgeParams) other;
        return Intrinsics.g(this.primitiveParams, jsBridgeParams.primitiveParams) && Intrinsics.g(this.jsonParams, jsBridgeParams.jsonParams);
    }

    public final HashMap<String, Object> getJsonParams() {
        return this.jsonParams;
    }

    public final Object getParam(String key, Object defaultValue) {
        Object obj;
        key.getClass();
        HashMap<String, Object> map = this.jsonParams;
        return (map == null || (obj = map.get(key)) == null) ? defaultValue : obj;
    }

    public final String getString(int index, String defaultValue) {
        String str;
        defaultValue.getClass();
        List<String> list = this.primitiveParams;
        return (list == null || (str = (String) CollectionsKt.V(index, list)) == null) ? defaultValue : str;
    }

    public final <T> T getTypedParam(String key, T defaultValue) {
        key.getClass();
        if (getParam(key) == null) {
            return defaultValue;
        }
        Intrinsics.m();
        throw null;
    }

    public int hashCode() {
        List<String> list = this.primitiveParams;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HashMap<String, Object> map = this.jsonParams;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "JsBridgeParams(primitiveParams=" + this.primitiveParams + ", jsonParams=" + this.jsonParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeStringList(this.primitiveParams);
        HashMap<String, Object> map = this.jsonParams;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeValue(entry.getValue());
        }
    }

    public JsBridgeParams(List<String> list, HashMap<String, Object> map) {
        this.primitiveParams = list;
        this.jsonParams = map;
    }

    public final Object getParam(String key) {
        key.getClass();
        return getParam(key, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsBridgeParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getString(int index) {
        return getString(index, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsBridgeParams(List<String> list) {
        this(list, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsBridgeParams(HashMap<String, Object> map) {
        this(null, map);
        map.getClass();
    }
}
