package com.sporty.android.core.model.account;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/account/CpfData;", "", "cpf", "", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCpf", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "cpfNumber", "getFullName", "userFullName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CpfData {

    @SerializedName("cpfNumber")
    private final String cpf;

    @SerializedName("userFullName")
    private final String fullName;

    public CpfData(String str, String str2) {
        this.cpf = str;
        this.fullName = str2;
    }

    public static /* synthetic */ CpfData copy$default(CpfData cpfData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cpfData.cpf;
        }
        if ((i & 2) != 0) {
            str2 = cpfData.fullName;
        }
        return cpfData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCpf() {
        return this.cpf;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final CpfData copy(String cpf, String fullName) {
        return new CpfData(cpf, fullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpfData)) {
            return false;
        }
        CpfData cpfData = (CpfData) other;
        return Intrinsics.g(this.cpf, cpfData.cpf) && Intrinsics.g(this.fullName, cpfData.fullName);
    }

    public final String getCpf() {
        return this.cpf;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public int hashCode() {
        String str = this.cpf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("CpfData(cpf=", this.cpf, ", fullName=", this.fullName, ")");
    }
}
