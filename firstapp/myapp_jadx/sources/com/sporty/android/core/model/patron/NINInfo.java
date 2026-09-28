package com.sporty.android.core.model.patron;

import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/patron/NINInfo;", "", "dateOfBirth", "", "firstName", "lastName", "ninNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getFirstName", "getLastName", "getNinNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NINInfo {
    private final String dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final String ninNumber;

    public NINInfo(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.dateOfBirth = str;
        this.firstName = str2;
        this.lastName = str3;
        this.ninNumber = str4;
    }

    public static /* synthetic */ NINInfo copy$default(NINInfo nINInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nINInfo.dateOfBirth;
        }
        if ((i & 2) != 0) {
            str2 = nINInfo.firstName;
        }
        if ((i & 4) != 0) {
            str3 = nINInfo.lastName;
        }
        if ((i & 8) != 0) {
            str4 = nINInfo.ninNumber;
        }
        return nINInfo.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNinNumber() {
        return this.ninNumber;
    }

    public final NINInfo copy(String dateOfBirth, String firstName, String lastName, String ninNumber) {
        dateOfBirth.getClass();
        firstName.getClass();
        lastName.getClass();
        ninNumber.getClass();
        return new NINInfo(dateOfBirth, firstName, lastName, ninNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NINInfo)) {
            return false;
        }
        NINInfo nINInfo = (NINInfo) other;
        return Intrinsics.g(this.dateOfBirth, nINInfo.dateOfBirth) && Intrinsics.g(this.firstName, nINInfo.firstName) && Intrinsics.g(this.lastName, nINInfo.lastName) && Intrinsics.g(this.ninNumber, nINInfo.ninNumber);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNinNumber() {
        return this.ninNumber;
    }

    public int hashCode() {
        return this.ninNumber.hashCode() + gmf0.a(gmf0.a(this.dateOfBirth.hashCode() * 31, 31, this.firstName), 31, this.lastName);
    }

    public String toString() {
        String str = this.dateOfBirth;
        String str2 = this.firstName;
        return kwi.a(ux5.a("NINInfo(dateOfBirth=", str, ", firstName=", str2, ", lastName="), this.lastName, ", ninNumber=", this.ninNumber, ")");
    }
}
