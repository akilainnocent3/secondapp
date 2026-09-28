package com.sportybet.plugin.realsports.data;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabInfoResponse;", "", "gameInstructions", "", "Lcom/sportybet/plugin/realsports/data/GiftGrabInfoPage;", "<init>", "(Ljava/util/List;)V", "getGameInstructions", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabInfoResponse {
    public static final int $stable = 8;

    @SerializedName("gameInstructions")
    private final List<GiftGrabInfoPage> gameInstructions;

    public GiftGrabInfoResponse(List<GiftGrabInfoPage> list) {
        list.getClass();
        this.gameInstructions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftGrabInfoResponse copy$default(GiftGrabInfoResponse giftGrabInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftGrabInfoResponse.gameInstructions;
        }
        return giftGrabInfoResponse.copy(list);
    }

    public final List<GiftGrabInfoPage> component1() {
        return this.gameInstructions;
    }

    public final GiftGrabInfoResponse copy(List<GiftGrabInfoPage> gameInstructions) {
        gameInstructions.getClass();
        return new GiftGrabInfoResponse(gameInstructions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GiftGrabInfoResponse) && Intrinsics.g(this.gameInstructions, ((GiftGrabInfoResponse) other).gameInstructions);
    }

    public final List<GiftGrabInfoPage> getGameInstructions() {
        return this.gameInstructions;
    }

    public int hashCode() {
        return this.gameInstructions.hashCode();
    }

    public String toString() {
        return p.a("GiftGrabInfoResponse(gameInstructions=", ")", this.gameInstructions);
    }
}
