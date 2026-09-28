package com.sporty.android.core.model.pocket.globalpay;

import defpackage.gmf0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/TypeData;", "", "type", "", "name", "channels", "", "Lcom/sporty/android/core/model/pocket/globalpay/ChannelData;", "hasPrimaryChannels", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getType", "()Ljava/lang/String;", "getName", "getChannels", "()Ljava/util/List;", "getHasPrimaryChannels", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TypeData {
    private final List<ChannelData> channels;
    private final boolean hasPrimaryChannels;
    private final String name;
    private final String type;

    public TypeData(String str, String str2, List<ChannelData> list, boolean z) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.name = str2;
        this.channels = list;
        this.hasPrimaryChannels = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeData copy$default(TypeData typeData, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = typeData.type;
        }
        if ((i & 2) != 0) {
            str2 = typeData.name;
        }
        if ((i & 4) != 0) {
            list = typeData.channels;
        }
        if ((i & 8) != 0) {
            z = typeData.hasPrimaryChannels;
        }
        return typeData.copy(str, str2, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<ChannelData> component3() {
        return this.channels;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasPrimaryChannels() {
        return this.hasPrimaryChannels;
    }

    public final TypeData copy(String type, String name, List<ChannelData> channels, boolean hasPrimaryChannels) {
        type.getClass();
        name.getClass();
        return new TypeData(type, name, channels, hasPrimaryChannels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeData)) {
            return false;
        }
        TypeData typeData = (TypeData) other;
        return Intrinsics.g(this.type, typeData.type) && Intrinsics.g(this.name, typeData.name) && Intrinsics.g(this.channels, typeData.channels) && this.hasPrimaryChannels == typeData.hasPrimaryChannels;
    }

    public final List<ChannelData> getChannels() {
        return this.channels;
    }

    public final boolean getHasPrimaryChannels() {
        return this.hasPrimaryChannels;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = gmf0.a(this.type.hashCode() * 31, 31, this.name);
        List<ChannelData> list = this.channels;
        return Boolean.hashCode(this.hasPrimaryChannels) + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.name;
        List<ChannelData> list = this.channels;
        boolean z = this.hasPrimaryChannels;
        StringBuilder sbA = ux5.a("TypeData(type=", str, ", name=", str2, ", channels=");
        sbA.append(list);
        sbA.append(", hasPrimaryChannels=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ TypeData(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? false : z);
    }
}
