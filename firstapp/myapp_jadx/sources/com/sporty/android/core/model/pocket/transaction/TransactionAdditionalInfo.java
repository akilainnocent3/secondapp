package com.sporty.android.core.model.pocket.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.nve;
import defpackage.p200;
import defpackage.uts;
import defpackage.ux5;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001[B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003Jà\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020PJ\u0014\u0010Q\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0083\u0004J\n\u0010T\u001a\u00020PHÖ\u0081\u0004J\n\u0010U\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020PR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108Ê\u0001\u0002\b]¨\u0006\\"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/TransactionAdditionalInfo;", "Landroid/os/Parcelable;", "gameId", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "venue", "resultDateTime", "Ljava/util/Date;", "winAmount", "", "hasFreeSpins", "", "totalWinAmount", "replayURL", "userId", "winTransactionId", "wagerType", "betDateTime", "maxWinAmount", "betAmount", "betTransactionId", AnalyticsParam.EVENT_PARAM_SUCCESS, "providerName", AnalyticsParam.EVENT_STATUS, "errorDescription", "linkedWinTransactions", "", "Lcom/sporty/android/core/model/pocket/transaction/TransactionAdditionalInfo$LinkedWinTransaction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DLjava/lang/Boolean;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGameId", "()Ljava/lang/String;", "getGameName", "getVenue", "getResultDateTime", "()Ljava/util/Date;", "getWinAmount", "()D", "getHasFreeSpins", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotalWinAmount", "getReplayURL", "getUserId", "getWinTransactionId", "getWagerType", "getBetDateTime", "getMaxWinAmount", "getBetAmount", "getBetTransactionId", "getSuccess", "()Z", "getProviderName", "getStatus", "getErrorDescription", "getLinkedWinTransactions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DLjava/lang/Boolean;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sporty/android/core/model/pocket/transaction/TransactionAdditionalInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LinkedWinTransaction", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransactionAdditionalInfo implements Parcelable {
    public static final Parcelable.Creator<TransactionAdditionalInfo> CREATOR = new Creator();
    private final double betAmount;
    private final Date betDateTime;
    private final String betTransactionId;
    private final String errorDescription;
    private final String gameId;
    private final String gameName;
    private final Boolean hasFreeSpins;
    private final List<LinkedWinTransaction> linkedWinTransactions;
    private final double maxWinAmount;
    private final String providerName;
    private final String replayURL;
    private final Date resultDateTime;
    private final String status;
    private final boolean success;
    private final double totalWinAmount;
    private final String userId;
    private final String venue;
    private final String wagerType;
    private final double winAmount;
    private final String winTransactionId;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionAdditionalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionAdditionalInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            double d = parcel.readDouble();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            double d2 = parcel.readDouble();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Date date2 = (Date) parcel.readSerializable();
            double d3 = parcel.readDouble();
            double d4 = parcel.readDouble();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            Boolean bool = boolValueOf;
            int iA = 0;
            while (iA != i) {
                iA = p200.a(LinkedWinTransaction.CREATOR, parcel, arrayList, iA, 1);
                string = string;
                string3 = string3;
                string2 = string2;
            }
            return new TransactionAdditionalInfo(string, string2, string3, date, d, bool, d2, string4, string5, string6, string7, date2, d3, d4, string8, z, string9, string10, string11, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionAdditionalInfo[] newArray(int i) {
            return new TransactionAdditionalInfo[i];
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/TransactionAdditionalInfo$LinkedWinTransaction;", "Landroid/os/Parcelable;", "winAmount", "", "winTransactionId", "", "<init>", "(DLjava/lang/String;)V", "getWinAmount", "()D", "getWinTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LinkedWinTransaction implements Parcelable {
        public static final Parcelable.Creator<LinkedWinTransaction> CREATOR = new Creator();
        private final double winAmount;
        private final String winTransactionId;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkedWinTransaction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedWinTransaction createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LinkedWinTransaction(parcel.readDouble(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedWinTransaction[] newArray(int i) {
                return new LinkedWinTransaction[i];
            }
        }

        public LinkedWinTransaction(double d, String str) {
            str.getClass();
            this.winAmount = d;
            this.winTransactionId = str;
        }

        public static /* synthetic */ LinkedWinTransaction copy$default(LinkedWinTransaction linkedWinTransaction, double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = linkedWinTransaction.winAmount;
            }
            if ((i & 2) != 0) {
                str = linkedWinTransaction.winTransactionId;
            }
            return linkedWinTransaction.copy(d, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getWinAmount() {
            return this.winAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWinTransactionId() {
            return this.winTransactionId;
        }

        public final LinkedWinTransaction copy(double winAmount, String winTransactionId) {
            winTransactionId.getClass();
            return new LinkedWinTransaction(winAmount, winTransactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkedWinTransaction)) {
                return false;
            }
            LinkedWinTransaction linkedWinTransaction = (LinkedWinTransaction) other;
            return Double.compare(this.winAmount, linkedWinTransaction.winAmount) == 0 && Intrinsics.g(this.winTransactionId, linkedWinTransaction.winTransactionId);
        }

        public final double getWinAmount() {
            return this.winAmount;
        }

        public final String getWinTransactionId() {
            return this.winTransactionId;
        }

        public int hashCode() {
            return this.winTransactionId.hashCode() + (Double.hashCode(this.winAmount) * 31);
        }

        public String toString() {
            return "LinkedWinTransaction(winAmount=" + this.winAmount + ", winTransactionId=" + this.winTransactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeDouble(this.winAmount);
            dest.writeString(this.winTransactionId);
        }
    }

    public TransactionAdditionalInfo(String str, String str2, String str3, Date date, double d, Boolean bool, double d2, String str4, String str5, String str6, String str7, Date date2, double d3, double d4, String str8, boolean z, String str9, String str10, String str11, List<LinkedWinTransaction> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        date2.getClass();
        str8.getClass();
        bt6.a(str9, str10, list);
        this.gameId = str;
        this.gameName = str2;
        this.venue = str3;
        this.resultDateTime = date;
        this.winAmount = d;
        this.hasFreeSpins = bool;
        this.totalWinAmount = d2;
        this.replayURL = str4;
        this.userId = str5;
        this.winTransactionId = str6;
        this.wagerType = str7;
        this.betDateTime = date2;
        this.maxWinAmount = d3;
        this.betAmount = d4;
        this.betTransactionId = str8;
        this.success = z;
        this.providerName = str9;
        this.status = str10;
        this.errorDescription = str11;
        this.linkedWinTransactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionAdditionalInfo copy$default(TransactionAdditionalInfo transactionAdditionalInfo, String str, String str2, String str3, Date date, double d, Boolean bool, double d2, String str4, String str5, String str6, String str7, Date date2, double d3, double d4, String str8, boolean z, String str9, String str10, String str11, List list, int i, Object obj) {
        List list2;
        String str12;
        String str13 = (i & 1) != 0 ? transactionAdditionalInfo.gameId : str;
        String str14 = (i & 2) != 0 ? transactionAdditionalInfo.gameName : str2;
        String str15 = (i & 4) != 0 ? transactionAdditionalInfo.venue : str3;
        Date date3 = (i & 8) != 0 ? transactionAdditionalInfo.resultDateTime : date;
        double d5 = (i & 16) != 0 ? transactionAdditionalInfo.winAmount : d;
        Boolean bool2 = (i & 32) != 0 ? transactionAdditionalInfo.hasFreeSpins : bool;
        double d6 = (i & 64) != 0 ? transactionAdditionalInfo.totalWinAmount : d2;
        String str16 = (i & 128) != 0 ? transactionAdditionalInfo.replayURL : str4;
        String str17 = (i & 256) != 0 ? transactionAdditionalInfo.userId : str5;
        String str18 = (i & 512) != 0 ? transactionAdditionalInfo.winTransactionId : str6;
        String str19 = (i & 1024) != 0 ? transactionAdditionalInfo.wagerType : str7;
        Date date4 = (i & 2048) != 0 ? transactionAdditionalInfo.betDateTime : date2;
        String str20 = str13;
        String str21 = str14;
        double d7 = (i & 4096) != 0 ? transactionAdditionalInfo.maxWinAmount : d3;
        double d8 = (i & 8192) != 0 ? transactionAdditionalInfo.betAmount : d4;
        String str22 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? transactionAdditionalInfo.betTransactionId : str8;
        boolean z2 = (32768 & i) != 0 ? transactionAdditionalInfo.success : z;
        String str23 = (i & 65536) != 0 ? transactionAdditionalInfo.providerName : str9;
        String str24 = (i & 131072) != 0 ? transactionAdditionalInfo.status : str10;
        String str25 = (i & 262144) != 0 ? transactionAdditionalInfo.errorDescription : str11;
        if ((i & 524288) != 0) {
            str12 = str25;
            list2 = transactionAdditionalInfo.linkedWinTransactions;
        } else {
            list2 = list;
            str12 = str25;
        }
        return transactionAdditionalInfo.copy(str20, str21, str15, date3, d5, bool2, d6, str16, str17, str18, str19, date4, d7, d8, str22, z2, str23, str24, str12, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getWinTransactionId() {
        return this.winTransactionId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWagerType() {
        return this.wagerType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getBetDateTime() {
        return this.betDateTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getMaxWinAmount() {
        return this.maxWinAmount;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBetTransactionId() {
        return this.betTransactionId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    public final List<LinkedWinTransaction> component20() {
        return this.linkedWinTransactions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVenue() {
        return this.venue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getResultDateTime() {
        return this.resultDateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getWinAmount() {
        return this.winAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHasFreeSpins() {
        return this.hasFreeSpins;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getTotalWinAmount() {
        return this.totalWinAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReplayURL() {
        return this.replayURL;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final TransactionAdditionalInfo copy(String gameId, String gameName, String venue, Date resultDateTime, double winAmount, Boolean hasFreeSpins, double totalWinAmount, String replayURL, String userId, String winTransactionId, String wagerType, Date betDateTime, double maxWinAmount, double betAmount, String betTransactionId, boolean success, String providerName, String status, String errorDescription, List<LinkedWinTransaction> linkedWinTransactions) {
        gameId.getClass();
        gameName.getClass();
        venue.getClass();
        resultDateTime.getClass();
        replayURL.getClass();
        userId.getClass();
        winTransactionId.getClass();
        wagerType.getClass();
        betDateTime.getClass();
        betTransactionId.getClass();
        providerName.getClass();
        status.getClass();
        linkedWinTransactions.getClass();
        return new TransactionAdditionalInfo(gameId, gameName, venue, resultDateTime, winAmount, hasFreeSpins, totalWinAmount, replayURL, userId, winTransactionId, wagerType, betDateTime, maxWinAmount, betAmount, betTransactionId, success, providerName, status, errorDescription, linkedWinTransactions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionAdditionalInfo)) {
            return false;
        }
        TransactionAdditionalInfo transactionAdditionalInfo = (TransactionAdditionalInfo) other;
        return Intrinsics.g(this.gameId, transactionAdditionalInfo.gameId) && Intrinsics.g(this.gameName, transactionAdditionalInfo.gameName) && Intrinsics.g(this.venue, transactionAdditionalInfo.venue) && Intrinsics.g(this.resultDateTime, transactionAdditionalInfo.resultDateTime) && Double.compare(this.winAmount, transactionAdditionalInfo.winAmount) == 0 && Intrinsics.g(this.hasFreeSpins, transactionAdditionalInfo.hasFreeSpins) && Double.compare(this.totalWinAmount, transactionAdditionalInfo.totalWinAmount) == 0 && Intrinsics.g(this.replayURL, transactionAdditionalInfo.replayURL) && Intrinsics.g(this.userId, transactionAdditionalInfo.userId) && Intrinsics.g(this.winTransactionId, transactionAdditionalInfo.winTransactionId) && Intrinsics.g(this.wagerType, transactionAdditionalInfo.wagerType) && Intrinsics.g(this.betDateTime, transactionAdditionalInfo.betDateTime) && Double.compare(this.maxWinAmount, transactionAdditionalInfo.maxWinAmount) == 0 && Double.compare(this.betAmount, transactionAdditionalInfo.betAmount) == 0 && Intrinsics.g(this.betTransactionId, transactionAdditionalInfo.betTransactionId) && this.success == transactionAdditionalInfo.success && Intrinsics.g(this.providerName, transactionAdditionalInfo.providerName) && Intrinsics.g(this.status, transactionAdditionalInfo.status) && Intrinsics.g(this.errorDescription, transactionAdditionalInfo.errorDescription) && Intrinsics.g(this.linkedWinTransactions, transactionAdditionalInfo.linkedWinTransactions);
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final Date getBetDateTime() {
        return this.betDateTime;
    }

    public final String getBetTransactionId() {
        return this.betTransactionId;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final Boolean getHasFreeSpins() {
        return this.hasFreeSpins;
    }

    public final List<LinkedWinTransaction> getLinkedWinTransactions() {
        return this.linkedWinTransactions;
    }

    public final double getMaxWinAmount() {
        return this.maxWinAmount;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getReplayURL() {
        return this.replayURL;
    }

    public final Date getResultDateTime() {
        return this.resultDateTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final double getTotalWinAmount() {
        return this.totalWinAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVenue() {
        return this.venue;
    }

    public final String getWagerType() {
        return this.wagerType;
    }

    public final double getWinAmount() {
        return this.winAmount;
    }

    public final String getWinTransactionId() {
        return this.winTransactionId;
    }

    public int hashCode() {
        int iA = nrg0.a((this.resultDateTime.hashCode() + gmf0.a(gmf0.a(this.gameId.hashCode() * 31, 31, this.gameName), 31, this.venue)) * 31, 31, this.winAmount);
        Boolean bool = this.hasFreeSpins;
        int iA2 = gmf0.a(gmf0.a(mtg0.a(gmf0.a(nrg0.a(nrg0.a((this.betDateTime.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(nrg0.a((iA + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.totalWinAmount), 31, this.replayURL), 31, this.userId), 31, this.winTransactionId), 31, this.wagerType)) * 31, 31, this.maxWinAmount), 31, this.betAmount), 31, this.betTransactionId), 31, this.success), 31, this.providerName), 31, this.status);
        String str = this.errorDescription;
        return this.linkedWinTransactions.hashCode() + ((iA2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.gameId;
        String str2 = this.gameName;
        String str3 = this.venue;
        Date date = this.resultDateTime;
        double d = this.winAmount;
        Boolean bool = this.hasFreeSpins;
        double d2 = this.totalWinAmount;
        String str4 = this.replayURL;
        String str5 = this.userId;
        String str6 = this.winTransactionId;
        String str7 = this.wagerType;
        Date date2 = this.betDateTime;
        double d3 = this.maxWinAmount;
        double d4 = this.betAmount;
        String str8 = this.betTransactionId;
        boolean z = this.success;
        String str9 = this.providerName;
        String str10 = this.status;
        String str11 = this.errorDescription;
        List<LinkedWinTransaction> list = this.linkedWinTransactions;
        StringBuilder sbA = ux5.a("TransactionAdditionalInfo(gameId=", str, ", gameName=", str2, ", venue=");
        sbA.append(str3);
        sbA.append(", resultDateTime=");
        sbA.append(date);
        sbA.append(", winAmount=");
        sbA.append(d);
        sbA.append(", hasFreeSpins=");
        sbA.append(bool);
        hib0.b(d2, ", totalWinAmount=", ", replayURL=", sbA);
        hxa.c(sbA, str4, ", userId=", str5, ", winTransactionId=");
        hxa.c(sbA, str6, ", wagerType=", str7, ", betDateTime=");
        sbA.append(date2);
        sbA.append(", maxWinAmount=");
        sbA.append(d3);
        hib0.b(d4, ", betAmount=", ", betTransactionId=", sbA);
        uts.b(str8, ", success=", ", providerName=", sbA, z);
        hxa.c(sbA, str9, ", status=", str10, ", errorDescription=");
        return nve.a(str11, ", linkedWinTransactions=", ")", sbA, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        ?? BooleanValue;
        dest.getClass();
        dest.writeString(this.gameId);
        dest.writeString(this.gameName);
        dest.writeString(this.venue);
        dest.writeSerializable(this.resultDateTime);
        dest.writeDouble(this.winAmount);
        Boolean bool = this.hasFreeSpins;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeDouble(this.totalWinAmount);
        dest.writeString(this.replayURL);
        dest.writeString(this.userId);
        dest.writeString(this.winTransactionId);
        dest.writeString(this.wagerType);
        dest.writeSerializable(this.betDateTime);
        dest.writeDouble(this.maxWinAmount);
        dest.writeDouble(this.betAmount);
        dest.writeString(this.betTransactionId);
        dest.writeInt(this.success ? 1 : 0);
        dest.writeString(this.providerName);
        dest.writeString(this.status);
        dest.writeString(this.errorDescription);
        List<LinkedWinTransaction> list = this.linkedWinTransactions;
        dest.writeInt(list.size());
        Iterator<LinkedWinTransaction> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
