package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f67191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f67192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f67193c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f67193c = str;
        this.f67191a = str2;
        this.f67192b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f67191a;
    }

    public long getTimestamp() {
        return this.f67192b;
    }

    public String getUuid() {
        return this.f67193c;
    }

    public void setReportMessage(String str) {
        this.f67191a = str;
    }

    public void setTimestamp(long j10) {
        this.f67192b = j10;
    }

    public void setUuid(String str) {
        this.f67193c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67193c);
        parcel.writeString(this.f67191a);
        parcel.writeLong(this.f67192b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f67193c = parcel.readString();
        this.f67191a = parcel.readString();
        this.f67192b = parcel.readLong();
    }
}
