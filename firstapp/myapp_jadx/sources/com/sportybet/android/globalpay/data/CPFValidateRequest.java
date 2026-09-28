package com.sportybet.android.globalpay.data;

import com.google.gson.annotations.SerializedName;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/globalpay/data/CPFValidateRequest;", "", "cpf", "", "<init>", "(Ljava/lang/String;)V", "getCpf", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CPFValidateRequest {
    public static final int $stable = 0;

    @SerializedName("cpf")
    private final String cpf;

    public CPFValidateRequest(String str) {
        str.getClass();
        this.cpf = str;
    }

    public static /* synthetic */ CPFValidateRequest copy$default(CPFValidateRequest cPFValidateRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cPFValidateRequest.cpf;
        }
        return cPFValidateRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCpf() {
        return this.cpf;
    }

    public final CPFValidateRequest copy(String cpf) {
        cpf.getClass();
        return new CPFValidateRequest(cpf);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CPFValidateRequest) && Intrinsics.g(this.cpf, ((CPFValidateRequest) other).cpf);
    }

    public final String getCpf() {
        return this.cpf;
    }

    public int hashCode() {
        return this.cpf.hashCode();
    }

    public String toString() {
        return tug.a("CPFValidateRequest(cpf=", this.cpf, ")");
    }
}
