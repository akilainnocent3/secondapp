package com.sportybet.android.account.international.data.model;

import defpackage.kwi;
import defpackage.t160;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/android/account/international/data/model/PostalCodeResponse;", "", "found", "", "city", "", "state", "street", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFound", "()Z", "getCity", "()Ljava/lang/String;", "getState", "getStreet", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PostalCodeResponse {
    public static final int $stable = 0;
    private final String city;
    private final boolean found;
    private final String state;
    private final String street;

    public PostalCodeResponse(boolean z, String str, String str2, String str3) {
        this.found = z;
        this.city = str;
        this.state = str2;
        this.street = str3;
    }

    public static /* synthetic */ PostalCodeResponse copy$default(PostalCodeResponse postalCodeResponse, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postalCodeResponse.found;
        }
        if ((i & 2) != 0) {
            str = postalCodeResponse.city;
        }
        if ((i & 4) != 0) {
            str2 = postalCodeResponse.state;
        }
        if ((i & 8) != 0) {
            str3 = postalCodeResponse.street;
        }
        return postalCodeResponse.copy(z, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFound() {
        return this.found;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public final PostalCodeResponse copy(boolean found, String city, String state, String street) {
        return new PostalCodeResponse(found, city, state, street);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostalCodeResponse)) {
            return false;
        }
        PostalCodeResponse postalCodeResponse = (PostalCodeResponse) other;
        return this.found == postalCodeResponse.found && Intrinsics.g(this.city, postalCodeResponse.city) && Intrinsics.g(this.state, postalCodeResponse.state) && Intrinsics.g(this.street, postalCodeResponse.street);
    }

    public final String getCity() {
        return this.city;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.found) * 31;
        String str = this.city;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.street;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.found;
        String str = this.city;
        return kwi.a(t160.a("PostalCodeResponse(found=", ", city=", str, ", state=", z), this.state, ", street=", this.street, ")");
    }
}
