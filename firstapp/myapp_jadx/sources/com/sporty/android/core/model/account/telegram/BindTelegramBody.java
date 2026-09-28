package com.sporty.android.core.model.account.telegram;

import defpackage.gmf0;
import defpackage.uf80;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0004HÖ\u0081\u0004R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/account/telegram/BindTelegramBody;", "", "authData", "", "", "phone", "phoneCountryCode", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getAuthData", "()Ljava/util/Map;", "getPhone", "()Ljava/lang/String;", "getPhoneCountryCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BindTelegramBody {
    private final Map<String, Object> authData;
    private final String phone;
    private final String phoneCountryCode;

    public BindTelegramBody(Map<String, ? extends Object> map, String str, String str2) {
        map.getClass();
        str.getClass();
        str2.getClass();
        this.authData = map;
        this.phone = str;
        this.phoneCountryCode = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindTelegramBody copy$default(BindTelegramBody bindTelegramBody, Map map, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = bindTelegramBody.authData;
        }
        if ((i & 2) != 0) {
            str = bindTelegramBody.phone;
        }
        if ((i & 4) != 0) {
            str2 = bindTelegramBody.phoneCountryCode;
        }
        return bindTelegramBody.copy(map, str, str2);
    }

    public final Map<String, Object> component1() {
        return this.authData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final BindTelegramBody copy(Map<String, ? extends Object> authData, String phone, String phoneCountryCode) {
        authData.getClass();
        phone.getClass();
        phoneCountryCode.getClass();
        return new BindTelegramBody(authData, phone, phoneCountryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindTelegramBody)) {
            return false;
        }
        BindTelegramBody bindTelegramBody = (BindTelegramBody) other;
        return Intrinsics.g(this.authData, bindTelegramBody.authData) && Intrinsics.g(this.phone, bindTelegramBody.phone) && Intrinsics.g(this.phoneCountryCode, bindTelegramBody.phoneCountryCode);
    }

    public final Map<String, Object> getAuthData() {
        return this.authData;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public int hashCode() {
        return this.phoneCountryCode.hashCode() + gmf0.a(this.authData.hashCode() * 31, 31, this.phone);
    }

    public String toString() {
        Map<String, Object> map = this.authData;
        String str = this.phone;
        String str2 = this.phoneCountryCode;
        StringBuilder sb = new StringBuilder("BindTelegramBody(authData=");
        sb.append(map);
        sb.append(", phone=");
        sb.append(str);
        sb.append(", phoneCountryCode=");
        return uf80.a(sb, str2, ")");
    }
}
