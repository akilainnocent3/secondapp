package com.sporty.android.core.model.luckywheel;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.b7f;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.m2g;
import defpackage.ng1;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse;", "", "ticketInfo", "Lcom/sporty/android/core/model/luckywheel/TicketInfo;", "luckyWheelInfoVO", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO;", "<init>", "(Lcom/sporty/android/core/model/luckywheel/TicketInfo;Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO;)V", "getTicketInfo", "()Lcom/sporty/android/core/model/luckywheel/TicketInfo;", "getLuckyWheelInfoVO", "()Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LuckyWheelInfoVO", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LuckyWheelResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final LuckyWheelInfoVO luckyWheelInfoVO;
    private final TicketInfo ticketInfo;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$Companion;", "", "<init>", "()V", "initData", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LuckyWheelResponse initData() {
            return new LuckyWheelResponse(new TicketInfo(0, "", 0, null, 0L, null, null, 120, null), new LuckyWheelInfoVO(0, "", m2g.a));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "", "luckyWheelPrizeVOS", "", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO$LuckyWheelPrizeVOS;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getLuckyWheelPrizeVOS", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "LuckyWheelPrizeVOS", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LuckyWheelInfoVO {
        private final int id;
        private final List<LuckyWheelPrizeVOS> luckyWheelPrizeVOS;
        private final String name;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse$LuckyWheelInfoVO$LuckyWheelPrizeVOS;", "", "areaAmount", "", "colorName", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;", "prizeAmount", "prizeType", "<init>", "(ILcom/sporty/android/core/model/luckywheel/LuckyWheelColor;II)V", "getAreaAmount", "()I", "getColorName", "()Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;", "getPrizeAmount", "getPrizeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class LuckyWheelPrizeVOS {
            private final int areaAmount;
            private final LuckyWheelColor colorName;
            private final int prizeAmount;
            private final int prizeType;

            public LuckyWheelPrizeVOS(int i, LuckyWheelColor luckyWheelColor, int i2, int i3) {
                luckyWheelColor.getClass();
                this.areaAmount = i;
                this.colorName = luckyWheelColor;
                this.prizeAmount = i2;
                this.prizeType = i3;
            }

            public static /* synthetic */ LuckyWheelPrizeVOS copy$default(LuckyWheelPrizeVOS luckyWheelPrizeVOS, int i, LuckyWheelColor luckyWheelColor, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = luckyWheelPrizeVOS.areaAmount;
                }
                if ((i4 & 2) != 0) {
                    luckyWheelColor = luckyWheelPrizeVOS.colorName;
                }
                if ((i4 & 4) != 0) {
                    i2 = luckyWheelPrizeVOS.prizeAmount;
                }
                if ((i4 & 8) != 0) {
                    i3 = luckyWheelPrizeVOS.prizeType;
                }
                return luckyWheelPrizeVOS.copy(i, luckyWheelColor, i2, i3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getAreaAmount() {
                return this.areaAmount;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final LuckyWheelColor getColorName() {
                return this.colorName;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getPrizeAmount() {
                return this.prizeAmount;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final int getPrizeType() {
                return this.prizeType;
            }

            public final LuckyWheelPrizeVOS copy(int areaAmount, LuckyWheelColor colorName, int prizeAmount, int prizeType) {
                colorName.getClass();
                return new LuckyWheelPrizeVOS(areaAmount, colorName, prizeAmount, prizeType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuckyWheelPrizeVOS)) {
                    return false;
                }
                LuckyWheelPrizeVOS luckyWheelPrizeVOS = (LuckyWheelPrizeVOS) other;
                return this.areaAmount == luckyWheelPrizeVOS.areaAmount && this.colorName == luckyWheelPrizeVOS.colorName && this.prizeAmount == luckyWheelPrizeVOS.prizeAmount && this.prizeType == luckyWheelPrizeVOS.prizeType;
            }

            public final int getAreaAmount() {
                return this.areaAmount;
            }

            public final LuckyWheelColor getColorName() {
                return this.colorName;
            }

            public final int getPrizeAmount() {
                return this.prizeAmount;
            }

            public final int getPrizeType() {
                return this.prizeType;
            }

            public int hashCode() {
                return Integer.hashCode(this.prizeType) + gpp.a(this.prizeAmount, (this.colorName.hashCode() + (Integer.hashCode(this.areaAmount) * 31)) * 31, 31);
            }

            public String toString() {
                int i = this.areaAmount;
                LuckyWheelColor luckyWheelColor = this.colorName;
                int i2 = this.prizeAmount;
                int i3 = this.prizeType;
                StringBuilder sb = new StringBuilder("LuckyWheelPrizeVOS(areaAmount=");
                sb.append(i);
                sb.append(", colorName=");
                sb.append(luckyWheelColor);
                sb.append(iKBWavCysVP.JUogJdIeFb);
                return b7f.a(sb, i2, ", prizeType=", i3, ")");
            }
        }

        public LuckyWheelInfoVO(int i, String str, List<LuckyWheelPrizeVOS> list) {
            str.getClass();
            list.getClass();
            this.id = i;
            this.name = str;
            this.luckyWheelPrizeVOS = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LuckyWheelInfoVO copy$default(LuckyWheelInfoVO luckyWheelInfoVO, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = luckyWheelInfoVO.id;
            }
            if ((i2 & 2) != 0) {
                str = luckyWheelInfoVO.name;
            }
            if ((i2 & 4) != 0) {
                list = luckyWheelInfoVO.luckyWheelPrizeVOS;
            }
            return luckyWheelInfoVO.copy(i, str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<LuckyWheelPrizeVOS> component3() {
            return this.luckyWheelPrizeVOS;
        }

        public final LuckyWheelInfoVO copy(int id, String name, List<LuckyWheelPrizeVOS> luckyWheelPrizeVOS) {
            name.getClass();
            luckyWheelPrizeVOS.getClass();
            return new LuckyWheelInfoVO(id, name, luckyWheelPrizeVOS);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuckyWheelInfoVO)) {
                return false;
            }
            LuckyWheelInfoVO luckyWheelInfoVO = (LuckyWheelInfoVO) other;
            return this.id == luckyWheelInfoVO.id && Intrinsics.g(this.name, luckyWheelInfoVO.name) && Intrinsics.g(this.luckyWheelPrizeVOS, luckyWheelInfoVO.luckyWheelPrizeVOS);
        }

        public final int getId() {
            return this.id;
        }

        public final List<LuckyWheelPrizeVOS> getLuckyWheelPrizeVOS() {
            return this.luckyWheelPrizeVOS;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.luckyWheelPrizeVOS.hashCode() + gmf0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        }

        public String toString() {
            int i = this.id;
            String str = this.name;
            return ng1.a(uqe0.a(i, "LuckyWheelInfoVO(id=", ", name=", str, ", luckyWheelPrizeVOS="), this.luckyWheelPrizeVOS, ")");
        }
    }

    public LuckyWheelResponse(TicketInfo ticketInfo, LuckyWheelInfoVO luckyWheelInfoVO) {
        ticketInfo.getClass();
        luckyWheelInfoVO.getClass();
        this.ticketInfo = ticketInfo;
        this.luckyWheelInfoVO = luckyWheelInfoVO;
    }

    public static /* synthetic */ LuckyWheelResponse copy$default(LuckyWheelResponse luckyWheelResponse, TicketInfo ticketInfo, LuckyWheelInfoVO luckyWheelInfoVO, int i, Object obj) {
        if ((i & 1) != 0) {
            ticketInfo = luckyWheelResponse.ticketInfo;
        }
        if ((i & 2) != 0) {
            luckyWheelInfoVO = luckyWheelResponse.luckyWheelInfoVO;
        }
        return luckyWheelResponse.copy(ticketInfo, luckyWheelInfoVO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TicketInfo getTicketInfo() {
        return this.ticketInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LuckyWheelInfoVO getLuckyWheelInfoVO() {
        return this.luckyWheelInfoVO;
    }

    public final LuckyWheelResponse copy(TicketInfo ticketInfo, LuckyWheelInfoVO luckyWheelInfoVO) {
        ticketInfo.getClass();
        luckyWheelInfoVO.getClass();
        return new LuckyWheelResponse(ticketInfo, luckyWheelInfoVO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyWheelResponse)) {
            return false;
        }
        LuckyWheelResponse luckyWheelResponse = (LuckyWheelResponse) other;
        return Intrinsics.g(this.ticketInfo, luckyWheelResponse.ticketInfo) && Intrinsics.g(this.luckyWheelInfoVO, luckyWheelResponse.luckyWheelInfoVO);
    }

    public final LuckyWheelInfoVO getLuckyWheelInfoVO() {
        return this.luckyWheelInfoVO;
    }

    public final TicketInfo getTicketInfo() {
        return this.ticketInfo;
    }

    public int hashCode() {
        return this.luckyWheelInfoVO.hashCode() + (this.ticketInfo.hashCode() * 31);
    }

    public String toString() {
        return "LuckyWheelResponse(ticketInfo=" + this.ticketInfo + ", luckyWheelInfoVO=" + this.luckyWheelInfoVO + ")";
    }
}
