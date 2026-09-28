package com.sporty.android.core.model.cashout;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.config.firebase.RemoteBetTypeEnabledConfig;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutQuickReinvestConfig;", "", "betTypeControl", "", "Lcom/sporty/android/core/model/config/firebase/RemoteBetTypeEnabledConfig;", "<init>", "(Ljava/util/List;)V", "getBetTypeControl", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutQuickReinvestConfig {

    @SerializedName("betTypeControl")
    private final List<RemoteBetTypeEnabledConfig> betTypeControl;

    public CashoutQuickReinvestConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutQuickReinvestConfig copy$default(CashoutQuickReinvestConfig cashoutQuickReinvestConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cashoutQuickReinvestConfig.betTypeControl;
        }
        return cashoutQuickReinvestConfig.copy(list);
    }

    public final List<RemoteBetTypeEnabledConfig> component1() {
        return this.betTypeControl;
    }

    public final CashoutQuickReinvestConfig copy(List<RemoteBetTypeEnabledConfig> betTypeControl) {
        betTypeControl.getClass();
        return new CashoutQuickReinvestConfig(betTypeControl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashoutQuickReinvestConfig) && Intrinsics.g(this.betTypeControl, ((CashoutQuickReinvestConfig) other).betTypeControl);
    }

    public final List<RemoteBetTypeEnabledConfig> getBetTypeControl() {
        return this.betTypeControl;
    }

    public int hashCode() {
        return this.betTypeControl.hashCode();
    }

    public String toString() {
        return p.a("CashoutQuickReinvestConfig(betTypeControl=", ")", this.betTypeControl);
    }

    public CashoutQuickReinvestConfig(List<RemoteBetTypeEnabledConfig> list) {
        list.getClass();
        this.betTypeControl = list;
    }

    public CashoutQuickReinvestConfig() {
        this(null, 1, null);
    }
}
