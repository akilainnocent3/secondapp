package com.sporty.android.core.model.survey;

import com.google.gson.annotations.SerializedName;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/survey/PlaceBetSurveyId;", "", "placeBetSuccessPage", "", "<init>", "(Ljava/lang/String;)V", "getPlaceBetSuccessPage", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "upon_successful_message_shown", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PlaceBetSurveyId {

    @SerializedName("upon_successful_message_shown")
    private final String placeBetSuccessPage;

    public PlaceBetSurveyId(String str) {
        this.placeBetSuccessPage = str;
    }

    public static /* synthetic */ PlaceBetSurveyId copy$default(PlaceBetSurveyId placeBetSurveyId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeBetSurveyId.placeBetSuccessPage;
        }
        return placeBetSurveyId.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlaceBetSuccessPage() {
        return this.placeBetSuccessPage;
    }

    public final PlaceBetSurveyId copy(String placeBetSuccessPage) {
        return new PlaceBetSurveyId(placeBetSuccessPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaceBetSurveyId) && Intrinsics.g(this.placeBetSuccessPage, ((PlaceBetSurveyId) other).placeBetSuccessPage);
    }

    public final String getPlaceBetSuccessPage() {
        return this.placeBetSuccessPage;
    }

    public int hashCode() {
        String str = this.placeBetSuccessPage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return tug.a("PlaceBetSurveyId(placeBetSuccessPage=", this.placeBetSuccessPage, ")");
    }
}
