package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Za;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new Za();

    @Nullable
    public final String errorExplanation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f98739id;

    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(@Nullable String str, @NonNull IdentifierStatus identifierStatus, @Nullable String str2) {
        this.f98739id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentifiersResult identifiersResult = (IdentifiersResult) obj;
            String str = this.f98739id;
            if (str == null ? identifiersResult.f98739id != null : !str.equals(identifiersResult.f98739id)) {
                return false;
            }
            if (this.status != identifiersResult.status) {
                return false;
            }
            String str2 = this.errorExplanation;
            if (str2 != null) {
                return str2.equals(identifiersResult.errorExplanation);
            }
            if (identifiersResult.errorExplanation == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f98739id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IdentifiersResult{id='" + this.f98739id + "', status=" + this.status + ", errorExplanation='" + this.errorExplanation + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f98739id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
