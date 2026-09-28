package com.sporty.android.core.model.captcha;

import com.google.gson.annotations.SerializedName;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/captcha/QuizRequest;", "", "siteKey", "", "<init>", "(Ljava/lang/String;)V", "getSiteKey", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuizRequest {

    @SerializedName("siteKey")
    private final String siteKey;

    public QuizRequest(String str) {
        str.getClass();
        this.siteKey = str;
    }

    public static /* synthetic */ QuizRequest copy$default(QuizRequest quizRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quizRequest.siteKey;
        }
        return quizRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteKey() {
        return this.siteKey;
    }

    public final QuizRequest copy(String siteKey) {
        siteKey.getClass();
        return new QuizRequest(siteKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuizRequest) && Intrinsics.g(this.siteKey, ((QuizRequest) other).siteKey);
    }

    public final String getSiteKey() {
        return this.siteKey;
    }

    public int hashCode() {
        return this.siteKey.hashCode();
    }

    public String toString() {
        return tug.a("QuizRequest(siteKey=", this.siteKey, ")");
    }
}
