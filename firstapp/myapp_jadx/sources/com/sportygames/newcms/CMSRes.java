package com.sportygames.newcms;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nn5;
import defpackage.rr1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportygames/newcms/CMSRes;", "Landroid/os/Parcelable;", "Id", "IdWithDefault", "Data", "Lcom/sportygames/newcms/CMSRes$Data;", "Lcom/sportygames/newcms/CMSRes$Id;", "Lcom/sportygames/newcms/CMSRes$IdWithDefault;", "cms_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CMSRes extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/newcms/CMSRes$Data;", "Lcom/sportygames/newcms/CMSRes;", "cms_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data implements CMSRes {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final nn5 e;
        public final Integer f;

        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Data(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), nn5.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(int i, int i2, String str, String str2, nn5 nn5Var, Integer num) {
            str.getClass();
            str2.getClass();
            nn5Var.getClass();
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = nn5Var;
            this.f = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.a == data.a && this.b == data.b && Intrinsics.g(this.c, data.c) && Intrinsics.g(this.d, data.d) && this.e == data.e && Intrinsics.g(this.f, data.f);
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: getIndex, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + gmf0.a(gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d)) * 31;
            Integer num = this.f;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final String toString() {
            return "Data(cmsId=" + this.a + ", index=" + this.b + ", page=" + this.c + ", key=" + this.d + ", type=" + this.e + ", defaultRes=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e.name());
            Integer num = this.f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                f78.c(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/newcms/CMSRes$IdWithDefault;", "Lcom/sportygames/newcms/CMSRes;", "cms_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdWithDefault implements CMSRes {
        public static final Parcelable.Creator<IdWithDefault> CREATOR = new a();
        public final int a;
        public final int b;
        public final int c;

        public static final class a implements Parcelable.Creator<IdWithDefault> {
            @Override // android.os.Parcelable.Creator
            public final IdWithDefault createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new IdWithDefault(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final IdWithDefault[] newArray(int i) {
                return new IdWithDefault[i];
            }
        }

        public IdWithDefault(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdWithDefault)) {
                return false;
            }
            IdWithDefault idWithDefault = (IdWithDefault) obj;
            return this.a == idWithDefault.a && this.b == idWithDefault.b && this.c == idWithDefault.c;
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: getIndex, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IdWithDefault(cmsId=");
            sb.append(this.a);
            sb.append(", index=");
            sb.append(this.b);
            sb.append(", defaultRes=");
            return rr1.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    /* JADX INFO: renamed from: getIndex */
    int getB();

    /* JADX INFO: renamed from: l0 */
    int getA();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/newcms/CMSRes$Id;", "Lcom/sportygames/newcms/CMSRes;", "cms_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements CMSRes {
        public static final Parcelable.Creator<Id> CREATOR = new a();
        public final int a;
        public final int b;

        public static final class a implements Parcelable.Creator<Id> {
            @Override // android.os.Parcelable.Creator
            public final Id createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Id(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Id[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Id)) {
                return false;
            }
            Id id = (Id) obj;
            return this.a == id.a && this.b == id.b;
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: getIndex, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        @Override // com.sportygames.newcms.CMSRes
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Id(cmsId=");
            sb.append(this.a);
            sb.append(", index=");
            return rr1.b(sb, this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public Id() {
            this(0, 0);
        }
    }
}
