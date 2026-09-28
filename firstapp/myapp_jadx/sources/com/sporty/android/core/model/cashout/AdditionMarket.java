package com.sporty.android.core.model.cashout;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.ml;
import defpackage.nl;
import defpackage.oie;
import defpackage.qae0;
import defpackage.ux5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010,\u001a\u00020\u0003H\u0096\u0080\u0004J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0019\u00103\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J|\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*Ê\u0001\u0002\b<¨\u0006;"}, d2 = {"Lcom/sporty/android/core/model/cashout/AdditionMarket;", "", AnalyticsParam.EVENT_PARAM_ID, "", "specifier", AnalyticsParam.EVENT_STATUS, "", "product", "suspendedReason", "cashOutStatus", "outcomes", "Ljava/util/ArrayList;", "Lcom/sporty/android/core/model/cashout/AdditionOutcome;", "Lkotlin/collections/ArrayList;", "lastOddsChangeTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSpecifier", "setSpecifier", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProduct", "setProduct", "getSuspendedReason", "setSuspendedReason", "getCashOutStatus", "setCashOutStatus", "getOutcomes", "()Ljava/util/ArrayList;", "setOutcomes", "(Ljava/util/ArrayList;)V", "getLastOddsChangeTime", "()Ljava/lang/Long;", "setLastOddsChangeTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Long;)Lcom/sporty/android/core/model/cashout/AdditionMarket;", "equals", "", "other", "hashCode", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AdditionMarket {
    private Integer cashOutStatus;
    private String id;
    private Long lastOddsChangeTime;
    private ArrayList<AdditionOutcome> outcomes;
    private Integer product;
    private String specifier;
    private Integer status;
    private String suspendedReason;

    public /* synthetic */ AdditionMarket(String str, String str2, Integer num, Integer num2, String str3, Integer num3, ArrayList arrayList, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? new ArrayList() : arrayList, (i & 128) != 0 ? null : l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdditionMarket copy$default(AdditionMarket additionMarket, String str, String str2, Integer num, Integer num2, String str3, Integer num3, ArrayList arrayList, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionMarket.id;
        }
        if ((i & 2) != 0) {
            str2 = additionMarket.specifier;
        }
        if ((i & 4) != 0) {
            num = additionMarket.status;
        }
        if ((i & 8) != 0) {
            num2 = additionMarket.product;
        }
        if ((i & 16) != 0) {
            str3 = additionMarket.suspendedReason;
        }
        if ((i & 32) != 0) {
            num3 = additionMarket.cashOutStatus;
        }
        if ((i & 64) != 0) {
            arrayList = additionMarket.outcomes;
        }
        if ((i & 128) != 0) {
            l = additionMarket.lastOddsChangeTime;
        }
        ArrayList arrayList2 = arrayList;
        Long l2 = l;
        String str4 = str3;
        Integer num4 = num3;
        return additionMarket.copy(str, str2, num, num2, str4, num4, arrayList2, l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$0(AdditionOutcome additionOutcome) {
        additionOutcome.getClass();
        return additionOutcome.toString();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final ArrayList<AdditionOutcome> component7() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final AdditionMarket copy(String id, String specifier, Integer status, Integer product, String suspendedReason, Integer cashOutStatus, ArrayList<AdditionOutcome> outcomes, Long lastOddsChangeTime) {
        outcomes.getClass();
        return new AdditionMarket(id, specifier, status, product, suspendedReason, cashOutStatus, outcomes, lastOddsChangeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionMarket)) {
            return false;
        }
        AdditionMarket additionMarket = (AdditionMarket) other;
        return Intrinsics.g(this.id, additionMarket.id) && Intrinsics.g(this.specifier, additionMarket.specifier) && Intrinsics.g(this.status, additionMarket.status) && Intrinsics.g(this.product, additionMarket.product) && Intrinsics.g(this.suspendedReason, additionMarket.suspendedReason) && Intrinsics.g(this.cashOutStatus, additionMarket.cashOutStatus) && Intrinsics.g(this.outcomes, additionMarket.outcomes) && Intrinsics.g(this.lastOddsChangeTime, additionMarket.lastOddsChangeTime);
    }

    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final ArrayList<AdditionOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.specifier;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.product;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.suspendedReason;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.cashOutStatus;
        int iA = nl.a(this.outcomes, (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Long l = this.lastOddsChangeTime;
        return iA + (l != null ? l.hashCode() : 0);
    }

    public final void setCashOutStatus(Integer num) {
        this.cashOutStatus = num;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLastOddsChangeTime(Long l) {
        this.lastOddsChangeTime = l;
    }

    public final void setOutcomes(ArrayList<AdditionOutcome> arrayList) {
        arrayList.getClass();
        this.outcomes = arrayList;
    }

    public final void setProduct(Integer num) {
        this.product = num;
    }

    public final void setSpecifier(String str) {
        this.specifier = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setSuspendedReason(String str) {
        this.suspendedReason = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.specifier;
        Integer num = this.status;
        Integer num2 = this.product;
        String str3 = this.suspendedReason;
        Integer num3 = this.cashOutStatus;
        String strA0 = CollectionsKt.a0(this.outcomes, null, null, null, new ml(), 31);
        Long l = this.lastOddsChangeTime;
        StringBuilder sbA = ux5.a("\n            AdditionMarket(\n                id=", str, ",\n                specifier=", str2, ",\n                status=");
        cv7.a(sbA, num, ",\n                product=", num2, ",\n                suspendedReason=");
        oie.a(num3, str3, ",\n                cashOutStatus=", ",\n                outcomes=", sbA);
        sbA.append(strA0);
        sbA.append(",\n                lastOddsChangeTime=");
        sbA.append(l);
        sbA.append("\n            )\n        ");
        return qae0.c(sbA.toString());
    }

    public AdditionMarket(String str, String str2, Integer num, Integer num2, String str3, Integer num3, ArrayList<AdditionOutcome> arrayList, Long l) {
        arrayList.getClass();
        this.id = str;
        this.specifier = str2;
        this.status = num;
        this.product = num2;
        this.suspendedReason = str3;
        this.cashOutStatus = num3;
        this.outcomes = arrayList;
        this.lastOddsChangeTime = l;
    }

    public AdditionMarket() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
