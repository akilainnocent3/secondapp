package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.ux5;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b#Ê\u0001\u0002\b$Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/plugin/realsports/data/AliasBookingCode;", "Landroid/os/Parcelable;", "bookingCode", "", "aliasCode", "selections", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)V", "getBookingCode", "()Ljava/lang/String;", "getAliasCode", "getSelections", "()Ljava/util/HashSet;", "setSelections", "(Ljava/util/HashSet;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasBookingCode implements Parcelable {
    private final String aliasCode;
    private final String bookingCode;
    private HashSet<String> selections;
    public static final Parcelable.Creator<AliasBookingCode> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AliasBookingCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AliasBookingCode createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            HashSet hashSet = new HashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                hashSet.add(parcel.readString());
            }
            return new AliasBookingCode(string, string2, hashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AliasBookingCode[] newArray(int i) {
            return new AliasBookingCode[i];
        }
    }

    public AliasBookingCode(String str, String str2, HashSet<String> hashSet) {
        str.getClass();
        str2.getClass();
        hashSet.getClass();
        this.bookingCode = str;
        this.aliasCode = str2;
        this.selections = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AliasBookingCode copy$default(AliasBookingCode aliasBookingCode, String str, String str2, HashSet hashSet, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliasBookingCode.bookingCode;
        }
        if ((i & 2) != 0) {
            str2 = aliasBookingCode.aliasCode;
        }
        if ((i & 4) != 0) {
            hashSet = aliasBookingCode.selections;
        }
        return aliasBookingCode.copy(str, str2, hashSet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBookingCode() {
        return this.bookingCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final HashSet<String> component3() {
        return this.selections;
    }

    public final AliasBookingCode copy(String bookingCode, String aliasCode, HashSet<String> selections) {
        bookingCode.getClass();
        aliasCode.getClass();
        selections.getClass();
        return new AliasBookingCode(bookingCode, aliasCode, selections);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasBookingCode)) {
            return false;
        }
        AliasBookingCode aliasBookingCode = (AliasBookingCode) other;
        return Intrinsics.g(this.bookingCode, aliasBookingCode.bookingCode) && Intrinsics.g(this.aliasCode, aliasBookingCode.aliasCode) && Intrinsics.g(this.selections, aliasBookingCode.selections);
    }

    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final HashSet<String> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return this.selections.hashCode() + gmf0.a(this.bookingCode.hashCode() * 31, 31, this.aliasCode);
    }

    public final void setSelections(HashSet<String> hashSet) {
        hashSet.getClass();
        this.selections = hashSet;
    }

    public String toString() {
        String str = this.bookingCode;
        String str2 = this.aliasCode;
        HashSet<String> hashSet = this.selections;
        StringBuilder sbA = ux5.a("AliasBookingCode(bookingCode=", str, ", aliasCode=", str2, ", selections=");
        sbA.append(hashSet);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.bookingCode);
        dest.writeString(this.aliasCode);
        HashSet<String> hashSet = this.selections;
        dest.writeInt(hashSet.size());
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }

    public /* synthetic */ AliasBookingCode(String str, String str2, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? new HashSet() : hashSet);
    }
}
