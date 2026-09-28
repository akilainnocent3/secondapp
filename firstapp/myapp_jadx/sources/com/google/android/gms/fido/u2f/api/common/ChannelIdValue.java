package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.frk0;
import defpackage.m8j;
import defpackage.pe4;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new frk0();
    public final ChannelIdValueType a;
    public final String b;
    public final String c;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new com.google.android.gms.fido.u2f.api.common.a();
        public final int a;

        ChannelIdValueType(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public static class a extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.a = G0(i);
            this.b = str;
            this.c = str2;
        } catch (a e) {
            m8j.a(e);
            throw null;
        }
    }

    public static ChannelIdValueType G0(int i) throws a {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.a) {
                return channelIdValueType;
            }
        }
        throw new a(pe4.b(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.a;
        ChannelIdValueType channelIdValueType2 = this.a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.b.equals(channelIdValue.b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.c.equals(channelIdValue.c);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.a;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.c.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        int i2 = this.a.a;
        uif.o(parcel, 2, 4);
        parcel.writeInt(i2);
        uif.i(parcel, 3, this.b, false);
        uif.i(parcel, 4, this.c, false);
        uif.n(parcel, iM);
    }

    private ChannelIdValue() {
        this.a = ChannelIdValueType.ABSENT;
        this.c = null;
        this.b = null;
    }

    public ChannelIdValue(String str) {
        this.b = str;
        this.a = ChannelIdValueType.STRING;
        this.c = null;
    }
}
