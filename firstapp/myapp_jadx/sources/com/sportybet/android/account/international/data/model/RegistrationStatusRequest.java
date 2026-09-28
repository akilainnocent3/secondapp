package com.sportybet.android.account.international.data.model;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/RegistrationStatusRequest;", "", "email", "", "cpf", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getCpf", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RegistrationStatusRequest {
    public static final int $stable = 0;
    private final String cpf;
    private final String email;
    private final String password;

    public RegistrationStatusRequest(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.email = str;
        this.cpf = str2;
        this.password = str3;
    }

    public static /* synthetic */ RegistrationStatusRequest copy$default(RegistrationStatusRequest registrationStatusRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationStatusRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = registrationStatusRequest.cpf;
        }
        if ((i & 4) != 0) {
            str3 = registrationStatusRequest.password;
        }
        return registrationStatusRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCpf() {
        return this.cpf;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final RegistrationStatusRequest copy(String email, String cpf, String password) {
        email.getClass();
        cpf.getClass();
        password.getClass();
        return new RegistrationStatusRequest(email, cpf, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationStatusRequest)) {
            return false;
        }
        RegistrationStatusRequest registrationStatusRequest = (RegistrationStatusRequest) other;
        return Intrinsics.g(this.email, registrationStatusRequest.email) && Intrinsics.g(this.cpf, registrationStatusRequest.cpf) && Intrinsics.g(this.password, registrationStatusRequest.password);
    }

    public final String getCpf() {
        return this.cpf;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.password.hashCode() + gmf0.a(this.email.hashCode() * 31, 31, this.cpf);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.cpf;
        return uf80.a(ux5.a("RegistrationStatusRequest(email=", str, ", cpf=", str2, ", password="), this.password, ")");
    }
}
