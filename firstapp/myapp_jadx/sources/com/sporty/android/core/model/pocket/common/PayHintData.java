package com.sporty.android.core.model.pocket.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.m2g;
import defpackage.p200;
import defpackage.qpu;
import defpackage.rg2;
import defpackage.uf80;
import defpackage.ux5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0002#$BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JT\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0017\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\r¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\r¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\r¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\r¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\u0002\b\r¢\u0006\u0004\n\u0002\u0010\u000eÊ\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/PayHintData;", "Landroid/os/Parcelable;", "methodId", "", "alert", "descriptionLines", "", "descriptionLinesCMS", "Lcom/sporty/android/core/model/pocket/common/PayHintData$DescriptionLineCMS;", "showDefaultAlert", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "Lkotlin/jvm/JvmField;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/pocket/common/PayHintData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PayHintEntity", "DescriptionLineCMS", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PayHintData implements Parcelable {
    public static final Parcelable.Creator<PayHintData> CREATOR = new Creator();
    public final String alert;
    public final List<String> descriptionLines;
    public final List<DescriptionLineCMS> descriptionLinesCMS;
    public String methodId;
    public final Boolean showDefaultAlert;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PayHintData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayHintData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(DescriptionLineCMS.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PayHintData(string, string2, arrayListCreateStringArrayList, arrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayHintData[] newArray(int i) {
            return new PayHintData[i];
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/PayHintData$DescriptionLineCMS;", "Landroid/os/Parcelable;", "key", "", AnalyticsParam.MINI_GAMES_PAGE, "default", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getPage", "getDefault", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DescriptionLineCMS implements Parcelable {
        public static final Parcelable.Creator<DescriptionLineCMS> CREATOR = new Creator();
        private final String default;
        private final String key;
        private final String page;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DescriptionLineCMS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DescriptionLineCMS createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DescriptionLineCMS(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DescriptionLineCMS[] newArray(int i) {
                return new DescriptionLineCMS[i];
            }
        }

        public DescriptionLineCMS(String str, String str2, String str3) {
            m.a(str, str2, str3);
            this.key = str;
            this.page = str2;
            this.default = str3;
        }

        public static /* synthetic */ DescriptionLineCMS copy$default(DescriptionLineCMS descriptionLineCMS, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = descriptionLineCMS.key;
            }
            if ((i & 2) != 0) {
                str2 = descriptionLineCMS.page;
            }
            if ((i & 4) != 0) {
                str3 = descriptionLineCMS.default;
            }
            return descriptionLineCMS.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPage() {
            return this.page;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDefault() {
            return this.default;
        }

        public final DescriptionLineCMS copy(String key, String page, String str) {
            key.getClass();
            page.getClass();
            str.getClass();
            return new DescriptionLineCMS(key, page, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescriptionLineCMS)) {
                return false;
            }
            DescriptionLineCMS descriptionLineCMS = (DescriptionLineCMS) other;
            return Intrinsics.g(this.key, descriptionLineCMS.key) && Intrinsics.g(this.page, descriptionLineCMS.page) && Intrinsics.g(this.default, descriptionLineCMS.default);
        }

        public final String getDefault() {
            return this.default;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getPage() {
            return this.page;
        }

        public int hashCode() {
            return this.default.hashCode() + gmf0.a(this.key.hashCode() * 31, 31, this.page);
        }

        public String toString() {
            String str = this.key;
            String str2 = this.page;
            return uf80.a(ux5.a("DescriptionLineCMS(key=", str, ", page=", str2, ", default="), this.default, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.key);
            dest.writeString(this.page);
            dest.writeString(this.default);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0007¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/PayHintData$PayHintEntity;", "", "<init>", "()V", "entityList", "", "Lcom/sporty/android/core/model/pocket/common/PayHintData;", "Lkotlin/jvm/JvmField;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PayHintEntity {
        public List<PayHintData> entityList = m2g.a;
    }

    public /* synthetic */ PayHintData(String str, String str2, List list, List list2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayHintData copy$default(PayHintData payHintData, String str, String str2, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payHintData.methodId;
        }
        if ((i & 2) != 0) {
            str2 = payHintData.alert;
        }
        if ((i & 4) != 0) {
            list = payHintData.descriptionLines;
        }
        if ((i & 8) != 0) {
            list2 = payHintData.descriptionLinesCMS;
        }
        if ((i & 16) != 0) {
            bool = payHintData.showDefaultAlert;
        }
        Boolean bool2 = bool;
        List list3 = list;
        return payHintData.copy(str, str2, list3, list2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMethodId() {
        return this.methodId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    public final List<String> component3() {
        return this.descriptionLines;
    }

    public final List<DescriptionLineCMS> component4() {
        return this.descriptionLinesCMS;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowDefaultAlert() {
        return this.showDefaultAlert;
    }

    public final PayHintData copy(String methodId, String alert, List<String> descriptionLines, List<DescriptionLineCMS> descriptionLinesCMS, Boolean showDefaultAlert) {
        methodId.getClass();
        return new PayHintData(methodId, alert, descriptionLines, descriptionLinesCMS, showDefaultAlert);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayHintData)) {
            return false;
        }
        PayHintData payHintData = (PayHintData) other;
        return Intrinsics.g(this.methodId, payHintData.methodId) && Intrinsics.g(this.alert, payHintData.alert) && Intrinsics.g(this.descriptionLines, payHintData.descriptionLines) && Intrinsics.g(this.descriptionLinesCMS, payHintData.descriptionLinesCMS) && Intrinsics.g(this.showDefaultAlert, payHintData.showDefaultAlert);
    }

    public int hashCode() {
        int iHashCode = this.methodId.hashCode() * 31;
        String str = this.alert;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.descriptionLines;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DescriptionLineCMS> list2 = this.descriptionLinesCMS;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.showDefaultAlert;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.methodId);
        dest.writeString(this.alert);
        dest.writeStringList(this.descriptionLines);
        List<DescriptionLineCMS> list = this.descriptionLinesCMS;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<DescriptionLineCMS> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Boolean bool = this.showDefaultAlert;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public String toString() {
        String str = this.methodId;
        String str2 = this.alert;
        List<String> list = this.descriptionLines;
        List<DescriptionLineCMS> list2 = this.descriptionLinesCMS;
        Boolean bool = this.showDefaultAlert;
        StringBuilder sbA = ux5.a("PayHintData(methodId=", str, ", alert=", str2, ", descriptionLines=");
        qpu.a(llGRV.BFNj, ", showDefaultAlert=", sbA, list, list2);
        return rg2.a(sbA, bool, ")");
    }

    public PayHintData(String str, String str2, List<String> list, List<DescriptionLineCMS> list2, Boolean bool) {
        str.getClass();
        this.methodId = str;
        this.alert = str2;
        this.descriptionLines = list;
        this.descriptionLinesCMS = list2;
        this.showDefaultAlert = bool;
    }
}
