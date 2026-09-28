package com.sporty.android.core.model.patron;

import defpackage.mtg0;
import defpackage.uf80;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/patron/PersonalInfo;", "", "firstName", "", "isEligible", "", "lastName", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "()Z", "getLastName", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PersonalInfo {
    private final String firstName;
    private final boolean isEligible;
    private final String lastName;

    public PersonalInfo(String str, boolean z, String str2) {
        this.firstName = str;
        this.isEligible = z;
        this.lastName = str2;
    }

    public static /* synthetic */ PersonalInfo copy$default(PersonalInfo personalInfo, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalInfo.firstName;
        }
        if ((i & 2) != 0) {
            z = personalInfo.isEligible;
        }
        if ((i & 4) != 0) {
            str2 = personalInfo.lastName;
        }
        return personalInfo.copy(str, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final PersonalInfo copy(String firstName, boolean isEligible, String lastName) {
        return new PersonalInfo(firstName, isEligible, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalInfo)) {
            return false;
        }
        PersonalInfo personalInfo = (PersonalInfo) other;
        return Intrinsics.g(this.firstName, personalInfo.firstName) && this.isEligible == personalInfo.isEligible && Intrinsics.g(this.lastName, personalInfo.lastName);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int iA = mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isEligible);
        String str2 = this.lastName;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public String toString() {
        String str = this.firstName;
        boolean z = this.isEligible;
        return uf80.a(z620.a("PersonalInfo(firstName=", str, ", isEligible=", ", lastName=", z), this.lastName, ")");
    }
}
