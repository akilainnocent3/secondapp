package com.sportybet.android.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.kya0;
import defpackage.m2g;
import defpackage.oie;
import defpackage.ux5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u008c\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\u000eHÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\r\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bÊ\u0001\f\b5\u0012\b\b6\u0012\u0004\b\u0003\u0010\u0000¨\u00064"}, d2 = {"Lcom/sportybet/android/data/OddsStatusSocket;", "", "marketGuide", "", "product", "marketGroup", "outcomes", "", "Lcom/sportybet/android/data/OutcomeSocket;", "topic", "pushTime", "", "marketDesc", "isFavourite", "", AnalyticsParam.EVENT_STATUS, "lastOddsChangeTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getMarketGuide", "()Ljava/lang/String;", "getProduct", "getMarketGroup", "getOutcomes", "()Ljava/util/List;", "getTopic", "getPushTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMarketDesc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getLastOddsChangeTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/sportybet/android/data/OddsStatusSocket;", "equals", "", "other", "hashCode", "toString", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsStatusSocket {
    private final Integer isFavourite;
    private final Long lastOddsChangeTime;
    private final String marketDesc;
    private final String marketGroup;
    private final String marketGuide;
    private final List<OutcomeSocket> outcomes;
    private final String product;
    private final Long pushTime;
    private final Integer status;
    private final String topic;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/android/data/OddsStatusSocket$Companion;", "", "<init>", "()V", "createFromOddsSocket", "Lcom/sportybet/android/data/OddsStatusSocket;", EventKeys.ERROR_MESSAGE, "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OddsStatusSocket createFromOddsSocket(String message) {
            Collection collectionT0;
            message.getClass();
            if (message.length() != 0) {
                try {
                    JSONArray jSONArray = new JSONArray(message);
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArrayOptJSONArray.getString(i);
                            string.getClass();
                            List listH = new Regex("#+").h(string);
                            if (listH.isEmpty()) {
                                collectionT0 = m2g.a;
                                break;
                                break;
                            }
                            ListIterator listIterator = listH.listIterator(listH.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    collectionT0 = m2g.a;
                                    break;
                                }
                                if (((String) listIterator.previous()).length() != 0) {
                                    collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            String[] strArr = (String[]) collectionT0.toArray(new String[0]);
                            arrayList.add(new OutcomeSocket(null, Double.valueOf(Double.parseDouble(strArr[4])), strArr[2], strArr[0], Integer.valueOf(Integer.parseInt(strArr[3])), null, null, null, 128, null));
                        }
                    }
                    String string2 = jSONArray.getString(0);
                    String string3 = jSONArray.getString(1);
                    int i2 = jSONArray.getInt(2);
                    String string4 = jSONArray.getString(3);
                    return new OddsStatusSocket(jSONArray.getString(6), string3, jSONArray.getString(4), arrayList, string2, Long.valueOf(jSONArray.getLong(7)), string4, Integer.valueOf(jSONArray.getInt(5)), Integer.valueOf(i2), jSONArray.length() > 9 ? Long.valueOf(jSONArray.getLong(9)) : null);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OddsStatusSocket(String str, String str2, String str3, List list, String str4, Long l, String str5, Integer num, Integer num2, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, list, str4, l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, num2, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OddsStatusSocket copy$default(OddsStatusSocket oddsStatusSocket, String str, String str2, String str3, List list, String str4, Long l, String str5, Integer num, Integer num2, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oddsStatusSocket.marketGuide;
        }
        if ((i & 2) != 0) {
            str2 = oddsStatusSocket.product;
        }
        if ((i & 4) != 0) {
            str3 = oddsStatusSocket.marketGroup;
        }
        if ((i & 8) != 0) {
            list = oddsStatusSocket.outcomes;
        }
        if ((i & 16) != 0) {
            str4 = oddsStatusSocket.topic;
        }
        if ((i & 32) != 0) {
            l = oddsStatusSocket.pushTime;
        }
        if ((i & 64) != 0) {
            str5 = oddsStatusSocket.marketDesc;
        }
        if ((i & 128) != 0) {
            num = oddsStatusSocket.isFavourite;
        }
        if ((i & 256) != 0) {
            num2 = oddsStatusSocket.status;
        }
        if ((i & 512) != 0) {
            l2 = oddsStatusSocket.lastOddsChangeTime;
        }
        Integer num3 = num2;
        Long l3 = l2;
        String str6 = str5;
        Integer num4 = num;
        String str7 = str4;
        Long l4 = l;
        return oddsStatusSocket.copy(str, str2, str3, list, str7, l4, str6, num4, num3, l3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketGuide() {
        return this.marketGuide;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketGroup() {
        return this.marketGroup;
    }

    public final List<OutcomeSocket> component4() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPushTime() {
        return this.pushTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketDesc() {
        return this.marketDesc;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getIsFavourite() {
        return this.isFavourite;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    public final OddsStatusSocket copy(String marketGuide, String product, String marketGroup, List<OutcomeSocket> outcomes, String topic, Long pushTime, String marketDesc, Integer isFavourite, Integer status, Long lastOddsChangeTime) {
        return new OddsStatusSocket(marketGuide, product, marketGroup, outcomes, topic, pushTime, marketDesc, isFavourite, status, lastOddsChangeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsStatusSocket)) {
            return false;
        }
        OddsStatusSocket oddsStatusSocket = (OddsStatusSocket) other;
        return Intrinsics.g(this.marketGuide, oddsStatusSocket.marketGuide) && Intrinsics.g(this.product, oddsStatusSocket.product) && Intrinsics.g(this.marketGroup, oddsStatusSocket.marketGroup) && Intrinsics.g(this.outcomes, oddsStatusSocket.outcomes) && Intrinsics.g(this.topic, oddsStatusSocket.topic) && Intrinsics.g(this.pushTime, oddsStatusSocket.pushTime) && Intrinsics.g(this.marketDesc, oddsStatusSocket.marketDesc) && Intrinsics.g(this.isFavourite, oddsStatusSocket.isFavourite) && Intrinsics.g(this.status, oddsStatusSocket.status) && Intrinsics.g(this.lastOddsChangeTime, oddsStatusSocket.lastOddsChangeTime);
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final String getMarketDesc() {
        return this.marketDesc;
    }

    public final String getMarketGroup() {
        return this.marketGroup;
    }

    public final String getMarketGuide() {
        return this.marketGuide;
    }

    public final List<OutcomeSocket> getOutcomes() {
        return this.outcomes;
    }

    public final String getProduct() {
        return this.product;
    }

    public final Long getPushTime() {
        return this.pushTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String str = this.marketGuide;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketGroup;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<OutcomeSocket> list = this.outcomes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.topic;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.pushTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.marketDesc;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.isFavourite;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.lastOddsChangeTime;
        return iHashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    public final Integer isFavourite() {
        return this.isFavourite;
    }

    public String toString() {
        String str = this.marketGuide;
        String str2 = this.product;
        String str3 = this.marketGroup;
        List<OutcomeSocket> list = this.outcomes;
        String str4 = this.topic;
        Long l = this.pushTime;
        String str5 = this.marketDesc;
        Integer num = this.isFavourite;
        Integer num2 = this.status;
        Long l2 = this.lastOddsChangeTime;
        StringBuilder sbA = ux5.a("OddsStatusSocket(marketGuide=", str, ", product=", str2, ", marketGroup=");
        kya0.b(str3, ", outcomes=", ", topic=", sbA, list);
        sbA.append(str4);
        sbA.append(", pushTime=");
        sbA.append(l);
        sbA.append(", marketDesc=");
        oie.a(num, str5, ", isFavourite=", ", status=", sbA);
        sbA.append(num2);
        sbA.append(", lastOddsChangeTime=");
        sbA.append(l2);
        sbA.append(")");
        return sbA.toString();
    }

    public OddsStatusSocket(String str, String str2, String str3, List<OutcomeSocket> list, String str4, Long l, String str5, Integer num, Integer num2, Long l2) {
        this.marketGuide = str;
        this.product = str2;
        this.marketGroup = str3;
        this.outcomes = list;
        this.topic = str4;
        this.pushTime = l;
        this.marketDesc = str5;
        this.isFavourite = num;
        this.status = num2;
        this.lastOddsChangeTime = l2;
    }
}
