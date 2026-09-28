package com.sporty.android.core.model.pocket.common;

import defpackage.f78;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.mtg0;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/ChannelAsset;", "", "entityList", "", "Lcom/sporty/android/core/model/pocket/common/ChannelAsset$Channel;", "totalNum", "", "<init>", "(Ljava/util/List;I)V", "getEntityList", "()Ljava/util/List;", "setEntityList", "(Ljava/util/List;)V", "getTotalNum", "()I", "setTotalNum", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Channel", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChannelAsset {
    private List<Channel> entityList;
    private int totalNum;

    public ChannelAsset(List<Channel> list, int i) {
        list.getClass();
        this.entityList = list;
        this.totalNum = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelAsset copy$default(ChannelAsset channelAsset, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = channelAsset.entityList;
        }
        if ((i2 & 2) != 0) {
            i = channelAsset.totalNum;
        }
        return channelAsset.copy(list, i);
    }

    public final List<Channel> component1() {
        return this.entityList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    public final ChannelAsset copy(List<Channel> entityList, int totalNum) {
        entityList.getClass();
        return new ChannelAsset(entityList, totalNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelAsset)) {
            return false;
        }
        ChannelAsset channelAsset = (ChannelAsset) other;
        return Intrinsics.g(this.entityList, channelAsset.entityList) && this.totalNum == channelAsset.totalNum;
    }

    public final List<Channel> getEntityList() {
        return this.entityList;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalNum) + (this.entityList.hashCode() * 31);
    }

    public final void setEntityList(List<Channel> list) {
        list.getClass();
        this.entityList = list;
    }

    public final void setTotalNum(int i) {
        this.totalNum = i;
    }

    public String toString() {
        return "ChannelAsset(entityList=" + this.entityList + ", totalNum=" + this.totalNum + ")";
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J|\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0014\u00108\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014¨\u0006<"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/ChannelAsset$Channel;", "", "channelShowName", "", "isActive", "", "supportAction", "channelIconUrl", "channelSendName", "payChId", "channelIconResId", "isSupportPayBill", "", "payBillInteractType", "payBillProvider", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;Ljava/lang/String;)V", "getChannelShowName", "()Ljava/lang/String;", "setChannelShowName", "(Ljava/lang/String;)V", "()I", "setActive", "(I)V", "getSupportAction", "setSupportAction", "getChannelIconUrl", "setChannelIconUrl", "getChannelSendName", "setChannelSendName", "getPayChId", "setPayChId", "getChannelIconResId", "setChannelIconResId", "()Z", "setSupportPayBill", "(Z)V", "getPayBillInteractType", "()Ljava/lang/Integer;", "setPayBillInteractType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPayBillProvider", "setPayBillProvider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/common/ChannelAsset$Channel;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Channel {
        private int channelIconResId;
        private String channelIconUrl;
        private String channelSendName;
        private String channelShowName;
        private int isActive;
        private boolean isSupportPayBill;
        private Integer payBillInteractType;
        private String payBillProvider;
        private int payChId;
        private int supportAction;

        public /* synthetic */ Channel(String str, int i, int i2, String str2, String str3, int i3, int i4, boolean z, Integer num, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? null : str2, str3, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? null : num, (i5 & 512) != 0 ? null : str4);
        }

        public static /* synthetic */ Channel copy$default(Channel channel, String str, int i, int i2, String str2, String str3, int i3, int i4, boolean z, Integer num, String str4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = channel.channelShowName;
            }
            if ((i5 & 2) != 0) {
                i = channel.isActive;
            }
            if ((i5 & 4) != 0) {
                i2 = channel.supportAction;
            }
            if ((i5 & 8) != 0) {
                str2 = channel.channelIconUrl;
            }
            if ((i5 & 16) != 0) {
                str3 = channel.channelSendName;
            }
            if ((i5 & 32) != 0) {
                i3 = channel.payChId;
            }
            if ((i5 & 64) != 0) {
                i4 = channel.channelIconResId;
            }
            if ((i5 & 128) != 0) {
                z = channel.isSupportPayBill;
            }
            if ((i5 & 256) != 0) {
                num = channel.payBillInteractType;
            }
            if ((i5 & 512) != 0) {
                str4 = channel.payBillProvider;
            }
            Integer num2 = num;
            String str5 = str4;
            int i6 = i4;
            boolean z2 = z;
            String str6 = str3;
            int i7 = i3;
            return channel.copy(str, i, i2, str2, str6, i7, i6, z2, num2, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChannelShowName() {
            return this.channelShowName;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getPayBillProvider() {
            return this.payBillProvider;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSupportAction() {
            return this.supportAction;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChannelIconUrl() {
            return this.channelIconUrl;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getChannelSendName() {
            return this.channelSendName;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getPayChId() {
            return this.payChId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getChannelIconResId() {
            return this.channelIconResId;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsSupportPayBill() {
            return this.isSupportPayBill;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getPayBillInteractType() {
            return this.payBillInteractType;
        }

        public final Channel copy(String channelShowName, int isActive, int supportAction, String channelIconUrl, String channelSendName, int payChId, int channelIconResId, boolean isSupportPayBill, Integer payBillInteractType, String payBillProvider) {
            return new Channel(channelShowName, isActive, supportAction, channelIconUrl, channelSendName, payChId, channelIconResId, isSupportPayBill, payBillInteractType, payBillProvider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Channel)) {
                return false;
            }
            Channel channel = (Channel) other;
            return Intrinsics.g(this.channelShowName, channel.channelShowName) && this.isActive == channel.isActive && this.supportAction == channel.supportAction && Intrinsics.g(this.channelIconUrl, channel.channelIconUrl) && Intrinsics.g(this.channelSendName, channel.channelSendName) && this.payChId == channel.payChId && this.channelIconResId == channel.channelIconResId && this.isSupportPayBill == channel.isSupportPayBill && Intrinsics.g(this.payBillInteractType, channel.payBillInteractType) && Intrinsics.g(this.payBillProvider, channel.payBillProvider);
        }

        public final int getChannelIconResId() {
            return this.channelIconResId;
        }

        public final String getChannelIconUrl() {
            return this.channelIconUrl;
        }

        public final String getChannelSendName() {
            return this.channelSendName;
        }

        public final String getChannelShowName() {
            return this.channelShowName;
        }

        public final Integer getPayBillInteractType() {
            return this.payBillInteractType;
        }

        public final String getPayBillProvider() {
            return this.payBillProvider;
        }

        public final int getPayChId() {
            return this.payChId;
        }

        public final int getSupportAction() {
            return this.supportAction;
        }

        public int hashCode() {
            String str = this.channelShowName;
            int iA = gpp.a(this.supportAction, gpp.a(this.isActive, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            String str2 = this.channelIconUrl;
            int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.channelSendName;
            int iA2 = mtg0.a(gpp.a(this.channelIconResId, gpp.a(this.payChId, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.isSupportPayBill);
            Integer num = this.payBillInteractType;
            int iHashCode2 = (iA2 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.payBillProvider;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        public final int isActive() {
            return this.isActive;
        }

        public final boolean isSupportPayBill() {
            return this.isSupportPayBill;
        }

        public final void setActive(int i) {
            this.isActive = i;
        }

        public final void setChannelIconResId(int i) {
            this.channelIconResId = i;
        }

        public final void setChannelIconUrl(String str) {
            this.channelIconUrl = str;
        }

        public final void setChannelSendName(String str) {
            this.channelSendName = str;
        }

        public final void setChannelShowName(String str) {
            this.channelShowName = str;
        }

        public final void setPayBillInteractType(Integer num) {
            this.payBillInteractType = num;
        }

        public final void setPayBillProvider(String str) {
            this.payBillProvider = str;
        }

        public final void setPayChId(int i) {
            this.payChId = i;
        }

        public final void setSupportAction(int i) {
            this.supportAction = i;
        }

        public final void setSupportPayBill(boolean z) {
            this.isSupportPayBill = z;
        }

        public String toString() {
            String str = this.channelShowName;
            int i = this.isActive;
            int i2 = this.supportAction;
            String str2 = this.channelIconUrl;
            String str3 = this.channelSendName;
            int i3 = this.payChId;
            int i4 = this.channelIconResId;
            boolean z = this.isSupportPayBill;
            Integer num = this.payBillInteractType;
            String str4 = this.payBillProvider;
            StringBuilder sbA = ml5.a(i, "Channel(channelShowName=", str, ", isActive=", ", supportAction=");
            f78.b(i2, ", channelIconUrl=", str2, ", channelSendName=", sbA);
            wxa.b(i3, str3, ", payChId=", ", channelIconResId=", sbA);
            sbA.append(i4);
            sbA.append(", isSupportPayBill=");
            sbA.append(z);
            sbA.append(", payBillInteractType=");
            sbA.append(num);
            sbA.append(", payBillProvider=");
            sbA.append(str4);
            sbA.append(")");
            return sbA.toString();
        }

        public Channel(String str, int i, int i2, String str2, String str3, int i3, int i4, boolean z, Integer num, String str4) {
            this.channelShowName = str;
            this.isActive = i;
            this.supportAction = i2;
            this.channelIconUrl = str2;
            this.channelSendName = str3;
            this.payChId = i3;
            this.channelIconResId = i4;
            this.isSupportPayBill = z;
            this.payBillInteractType = num;
            this.payBillProvider = str4;
        }
    }
}
