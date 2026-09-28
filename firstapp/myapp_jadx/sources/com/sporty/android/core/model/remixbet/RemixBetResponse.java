package com.sporty.android.core.model.remixbet;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixBetResponse;", "", "pages", "", "Lcom/sporty/android/core/model/remixbet/RemixBetPageDto;", "<init>", "(Ljava/util/List;)V", "getPages", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "shareCodes", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBetResponse {

    @SerializedName("shareCodes")
    private final List<RemixBetPageDto> pages;

    public RemixBetResponse(List<RemixBetPageDto> list) {
        this.pages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemixBetResponse copy$default(RemixBetResponse remixBetResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = remixBetResponse.pages;
        }
        return remixBetResponse.copy(list);
    }

    public final List<RemixBetPageDto> component1() {
        return this.pages;
    }

    public final RemixBetResponse copy(List<RemixBetPageDto> pages) {
        return new RemixBetResponse(pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RemixBetResponse) && Intrinsics.g(this.pages, ((RemixBetResponse) other).pages);
    }

    public final List<RemixBetPageDto> getPages() {
        return this.pages;
    }

    public int hashCode() {
        List<RemixBetPageDto> list = this.pages;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("RemixBetResponse(pages=", ")", this.pages);
    }
}
