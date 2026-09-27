package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import eh.o1;
import java.util.Arrays;
import k.h1;
import re.h3;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @h1
    public static final String f48442h = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f48443i = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @h1
    public static final String f48444j = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f48451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48452g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n2 f48445k = new n2.b().g0("application/id3").G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n2 f48446l = new n2.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f48447b = str;
        this.f48448c = str2;
        this.f48449d = j10;
        this.f48450e = j11;
        this.f48451f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public byte[] G() {
        if (H() != null) {
            return this.f48451f;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public n2 H() {
        String str = this.f48447b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f48446l;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f48445k;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f48449d == eventMessage.f48449d && this.f48450e == eventMessage.f48450e && o1.g(this.f48447b, eventMessage.f48447b) && o1.g(this.f48448c, eventMessage.f48448c) && Arrays.equals(this.f48451f, eventMessage.f48451f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f48452g == 0) {
            String str = this.f48447b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f48448c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f48449d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f48450e;
            this.f48452g = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f48451f);
        }
        return this.f48452g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void n0(h3.b bVar) {
        of.a.c(this, bVar);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f48447b + ", id=" + this.f48450e + ", durationMs=" + this.f48449d + ", value=" + this.f48448c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48447b);
        parcel.writeString(this.f48448c);
        parcel.writeLong(this.f48449d);
        parcel.writeLong(this.f48450e);
        parcel.writeByteArray(this.f48451f);
    }

    public EventMessage(Parcel parcel) {
        this.f48447b = (String) o1.o(parcel.readString());
        this.f48448c = (String) o1.o(parcel.readString());
        this.f48449d = parcel.readLong();
        this.f48450e = parcel.readLong();
        this.f48451f = (byte[]) o1.o(parcel.createByteArray());
    }
}
