package com.sporty.android.core.model.nin;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.ijg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/nin/SubmitNINBody;", "", "firstName", "", "lastName", "number", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getNumber", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubmitNINBody {
    private final String firstName;
    private final String lastName;
    private final String number;
    private final int type;

    public SubmitNINBody(String str, String str2, String str3, int i) {
        m.a(str, str2, str3);
        this.firstName = str;
        this.lastName = str2;
        this.number = str3;
        this.type = i;
    }

    public static /* synthetic */ SubmitNINBody copy$default(SubmitNINBody submitNINBody, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = submitNINBody.firstName;
        }
        if ((i2 & 2) != 0) {
            str2 = submitNINBody.lastName;
        }
        if ((i2 & 4) != 0) {
            str3 = submitNINBody.number;
        }
        if ((i2 & 8) != 0) {
            i = submitNINBody.type;
        }
        return submitNINBody.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final SubmitNINBody copy(String firstName, String lastName, String number, int type) {
        firstName.getClass();
        lastName.getClass();
        number.getClass();
        return new SubmitNINBody(firstName, lastName, number, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitNINBody)) {
            return false;
        }
        SubmitNINBody submitNINBody = (SubmitNINBody) other;
        return Intrinsics.g(this.firstName, submitNINBody.firstName) && Intrinsics.g(this.lastName, submitNINBody.lastName) && Intrinsics.g(this.number, submitNINBody.number) && this.type == submitNINBody.type;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNumber() {
        return this.number;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.type) + gmf0.a(gmf0.a(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.number);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        return ijg0.a(this.type, this.number, ", type=", ")", ux5.a("SubmitNINBody(firstName=", str, ", lastName=", str2, ", number="));
    }
}
