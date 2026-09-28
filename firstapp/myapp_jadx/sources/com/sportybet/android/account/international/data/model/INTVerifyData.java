package com.sportybet.android.account.international.data.model;

import com.appsflyer.internal.m;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/INTVerifyData;", "", "email", "", "token", EventKeys.ERROR_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getToken", "getCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class INTVerifyData {
    public static final int $stable = 0;
    private final String code;
    private final String email;
    private final String token;

    public /* synthetic */ INTVerifyData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ INTVerifyData copy$default(INTVerifyData iNTVerifyData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iNTVerifyData.email;
        }
        if ((i & 2) != 0) {
            str2 = iNTVerifyData.token;
        }
        if ((i & 4) != 0) {
            str3 = iNTVerifyData.code;
        }
        return iNTVerifyData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final INTVerifyData copy(String email, String token, String code) {
        email.getClass();
        token.getClass();
        code.getClass();
        return new INTVerifyData(email, token, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof INTVerifyData)) {
            return false;
        }
        INTVerifyData iNTVerifyData = (INTVerifyData) other;
        return Intrinsics.g(this.email, iNTVerifyData.email) && Intrinsics.g(this.token, iNTVerifyData.token) && Intrinsics.g(this.code, iNTVerifyData.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.code.hashCode() + gmf0.a(this.email.hashCode() * 31, 31, this.token);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.token;
        return uf80.a(ux5.a("INTVerifyData(email=", str, ", token=", str2, ", code="), this.code, ")");
    }

    public INTVerifyData(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.email = str;
        this.token = str2;
        this.code = str3;
    }

    public INTVerifyData() {
        this(null, null, null, 7, null);
    }
}
