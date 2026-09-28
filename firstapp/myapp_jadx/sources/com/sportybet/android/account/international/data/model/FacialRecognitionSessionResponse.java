package com.sportybet.android.account.international.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/account/international/data/model/FacialRecognitionSessionResponse;", "", "token", "", "hasDocument", "", "redirectUrl", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHasDocument", "()Z", "getRedirectUrl", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FacialRecognitionSessionResponse {
    public static final int $stable = 0;

    @SerializedName("hasDocument")
    private final boolean hasDocument;

    @SerializedName("redirectUrl")
    private final String redirectUrl;

    @SerializedName("token")
    private final String token;

    public FacialRecognitionSessionResponse(String str, boolean z, String str2) {
        str.getClass();
        this.token = str;
        this.hasDocument = z;
        this.redirectUrl = str2;
    }

    public static /* synthetic */ FacialRecognitionSessionResponse copy$default(FacialRecognitionSessionResponse facialRecognitionSessionResponse, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facialRecognitionSessionResponse.token;
        }
        if ((i & 2) != 0) {
            z = facialRecognitionSessionResponse.hasDocument;
        }
        if ((i & 4) != 0) {
            str2 = facialRecognitionSessionResponse.redirectUrl;
        }
        return facialRecognitionSessionResponse.copy(str, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasDocument() {
        return this.hasDocument;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final FacialRecognitionSessionResponse copy(String token, boolean hasDocument, String redirectUrl) {
        token.getClass();
        return new FacialRecognitionSessionResponse(token, hasDocument, redirectUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacialRecognitionSessionResponse)) {
            return false;
        }
        FacialRecognitionSessionResponse facialRecognitionSessionResponse = (FacialRecognitionSessionResponse) other;
        return Intrinsics.g(this.token, facialRecognitionSessionResponse.token) && this.hasDocument == facialRecognitionSessionResponse.hasDocument && Intrinsics.g(this.redirectUrl, facialRecognitionSessionResponse.redirectUrl);
    }

    public final boolean getHasDocument() {
        return this.hasDocument;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iA = mtg0.a(this.token.hashCode() * 31, 31, this.hasDocument);
        String str = this.redirectUrl;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.token;
        boolean z = this.hasDocument;
        return uf80.a(z620.a("FacialRecognitionSessionResponse(token=", str, ", hasDocument=", ", redirectUrl=", z), this.redirectUrl, ")");
    }

    public /* synthetic */ FacialRecognitionSessionResponse(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
