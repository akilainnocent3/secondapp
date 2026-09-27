package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.C4235d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import eh.o1;
import re.h3;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48462c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f48461b = str;
        this.f48462c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] G() {
        return of.a.a(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ n2 H() {
        return of.a.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f48461b.equals(vorbisComment.f48461b) && this.f48462c.equals(vorbisComment.f48462c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f48461b.hashCode()) * 31) + this.f48462c.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void n0(h3.b bVar) {
        String str = this.f48461b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.N(this.f48462c);
                break;
            case "TITLE":
                bVar.n0(this.f48462c);
                break;
            case "DESCRIPTION":
                bVar.V(this.f48462c);
                break;
            case "ALBUMARTIST":
                bVar.M(this.f48462c);
                break;
            case "ARTIST":
                bVar.O(this.f48462c);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f48461b + C4235d4.j.f61456b + this.f48462c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48461b);
        parcel.writeString(this.f48462c);
    }

    public VorbisComment(Parcel parcel) {
        this.f48461b = (String) o1.o(parcel.readString());
        this.f48462c = (String) o1.o(parcel.readString());
    }
}
