package com.sportybet.feature.facialrecognition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/facialrecognition/model/FacialRecognitionResult;", "Landroid/os/Parcelable;", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FacialRecognitionResult implements Parcelable {
    public static final Parcelable.Creator<FacialRecognitionResult> CREATOR = new a();
    public final b a;
    public final String b;

    public static final class a implements Parcelable.Creator<FacialRecognitionResult> {
        @Override // android.os.Parcelable.Creator
        public final FacialRecognitionResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FacialRecognitionResult(b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FacialRecognitionResult[] newArray(int i) {
            return new FacialRecognitionResult[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b i;
        public static final b v;
        public static final /* synthetic */ b[] w;

        static {
            b bVar = new b("APPROVED", 0);
            a = bVar;
            b bVar2 = new b("REJECTED", 1);
            b = bVar2;
            b bVar3 = new b("CANCELED_BY_USER", 2);
            c = bVar3;
            b bVar4 = new b("COULD_NOT_INITIALIZE_SDK", 3);
            d = bVar4;
            b bVar5 = new b("COULD_NOT_GET_SESSION_TOKEN", 4);
            e = bVar5;
            b bVar6 = new b("COULD_NOT_CONFIRM_RESULT", 5);
            f = bVar6;
            b bVar7 = new b("MAX_DAILY_ATTEMPT_REACHED", 6);
            i = bVar7;
            b bVar8 = new b("CLOUDFLARE_ERROR", 7);
            v = bVar8;
            w = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, new b("UNKNOWN_ERROR", 8)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) w.clone();
        }
    }

    public FacialRecognitionResult(b bVar, String str) {
        bVar.getClass();
        this.a = bVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacialRecognitionResult)) {
            return false;
        }
        FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
        return this.a == facialRecognitionResult.a && Intrinsics.g(this.b, facialRecognitionResult.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FacialRecognitionResult(status=" + this.a + ", token=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
    }
}
