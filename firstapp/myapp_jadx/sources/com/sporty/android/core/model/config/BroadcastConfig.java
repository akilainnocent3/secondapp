package com.sporty.android.core.model.config;

import com.appsflyer.internal.l;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.em5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.pr0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/config/BroadcastConfig;", "", "groupType", "", "infos", "", "Lcom/sporty/android/core/model/config/BroadcastConfig$Info;", "<init>", "(ILjava/util/List;)V", "getGroupType", "()I", "getInfos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "Info", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BroadcastConfig {
    public static final int GROUP_TYPE_BOTTOM_MARQUEE = 20;
    public static final int GROUP_TYPE_IMPORTANT_INFO = 1;
    public static final int GROUP_TYPE_TOP_MARQUEE = 2;
    private final int groupType;
    private final List<Info> infos;

    public /* synthetic */ BroadcastConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BroadcastConfig copy$default(BroadcastConfig broadcastConfig, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = broadcastConfig.groupType;
        }
        if ((i2 & 2) != 0) {
            list = broadcastConfig.infos;
        }
        return broadcastConfig.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGroupType() {
        return this.groupType;
    }

    public final List<Info> component2() {
        return this.infos;
    }

    public final BroadcastConfig copy(int groupType, List<Info> infos) {
        return new BroadcastConfig(groupType, infos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BroadcastConfig)) {
            return false;
        }
        BroadcastConfig broadcastConfig = (BroadcastConfig) other;
        return this.groupType == broadcastConfig.groupType && Intrinsics.g(this.infos, broadcastConfig.infos);
    }

    public final int getGroupType() {
        return this.groupType;
    }

    public final List<Info> getInfos() {
        return this.infos;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.groupType) * 31;
        List<Info> list = this.infos;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "BroadcastConfig(groupType=" + this.groupType + ", infos=" + this.infos + ")";
    }

    public BroadcastConfig(int i, List<Info> list) {
        this.groupType = i;
        this.infos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/config/BroadcastConfig$Info;", "", AnalyticsParam.EVENT_PARAM_ID, "", "text", "url", "expireTime", "", "detail", "Lcom/sporty/android/core/model/config/BroadcastConfig$Info$Detail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/sporty/android/core/model/config/BroadcastConfig$Info$Detail;)V", "getId", "()Ljava/lang/String;", "getText", "getUrl", "getExpireTime", "()J", "getDetail", "()Lcom/sporty/android/core/model/config/BroadcastConfig$Info$Detail;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Detail", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Info {
        private final Detail detail;
        private final long expireTime;
        private final String id;
        private final String text;
        private final String url;

        public /* synthetic */ Info(String str, String str2, String str3, long j, Detail detail, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : detail);
        }

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, String str3, long j, Detail detail, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.id;
            }
            if ((i & 2) != 0) {
                str2 = info.text;
            }
            if ((i & 4) != 0) {
                str3 = info.url;
            }
            if ((i & 8) != 0) {
                j = info.expireTime;
            }
            if ((i & 16) != 0) {
                detail = info.detail;
            }
            Detail detail2 = detail;
            String str4 = str3;
            return info.copy(str, str2, str4, j, detail2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getExpireTime() {
            return this.expireTime;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Detail getDetail() {
            return this.detail;
        }

        public final Info copy(String id, String text, String url, long expireTime, Detail detail) {
            return new Info(id, text, url, expireTime, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.g(this.id, info.id) && Intrinsics.g(this.text, info.text) && Intrinsics.g(this.url, info.url) && this.expireTime == info.expireTime && Intrinsics.g(this.detail, info.detail);
        }

        public final Detail getDetail() {
            return this.detail;
        }

        public final long getExpireTime() {
            return this.expireTime;
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int iA = f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.expireTime, 31);
            Detail detail = this.detail;
            return iA + (detail != null ? detail.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.text;
            String str3 = this.url;
            long j = this.expireTime;
            Detail detail = this.detail;
            StringBuilder sbA = ux5.a("Info(id=", str, ", text=", str2, ", url=");
            l.a(j, str3, ", expireTime=", sbA);
            sbA.append(", detail=");
            sbA.append(detail);
            sbA.append(")");
            return sbA.toString();
        }

        public Info(String str, String str2, String str3, long j, Detail detail) {
            this.id = str;
            this.text = str2;
            this.url = str3;
            this.expireTime = j;
            this.detail = detail;
        }

        public Info() {
            this(null, null, null, 0L, null, 31, null);
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0083\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u00061"}, d2 = {"Lcom/sporty/android/core/model/config/BroadcastConfig$Info$Detail;", "", "msgType", "", "bizType", "bizName", "", "phone", "stake", "", "winning", "bizTime", "currency", "email", "redirectUrl", "requireUpdateAndroidVersion", "<init>", "(IILjava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsgType", "()I", "getBizType", "getBizName", "()Ljava/lang/String;", "getPhone", "getStake", "()J", "getWinning", "getBizTime", "getCurrency", "getEmail", "getRedirectUrl", "getRequireUpdateAndroidVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Detail {
            private final String bizName;
            private final long bizTime;
            private final int bizType;
            private final String currency;
            private final String email;
            private final int msgType;
            private final String phone;
            private final String redirectUrl;
            private final String requireUpdateAndroidVersion;
            private final long stake;
            private final long winning;

            public /* synthetic */ Detail(int i, int i2, String str, String str2, long j, long j2, long j3, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? 0L : j2, (i3 & 64) == 0 ? j3 : 0L, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : str6);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getMsgType() {
                return this.msgType;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final String getRedirectUrl() {
                return this.redirectUrl;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final String getRequireUpdateAndroidVersion() {
                return this.requireUpdateAndroidVersion;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getBizType() {
                return this.bizType;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getBizName() {
                return this.bizName;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final long getStake() {
                return this.stake;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final long getWinning() {
                return this.winning;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final long getBizTime() {
                return this.bizTime;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            public final Detail copy(int msgType, int bizType, String bizName, String phone, long stake, long winning, long bizTime, String currency, String email, String redirectUrl, String requireUpdateAndroidVersion) {
                return new Detail(msgType, bizType, bizName, phone, stake, winning, bizTime, currency, email, redirectUrl, requireUpdateAndroidVersion);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Detail)) {
                    return false;
                }
                Detail detail = (Detail) other;
                return this.msgType == detail.msgType && this.bizType == detail.bizType && Intrinsics.g(this.bizName, detail.bizName) && Intrinsics.g(this.phone, detail.phone) && this.stake == detail.stake && this.winning == detail.winning && this.bizTime == detail.bizTime && Intrinsics.g(this.currency, detail.currency) && Intrinsics.g(this.email, detail.email) && Intrinsics.g(this.redirectUrl, detail.redirectUrl) && Intrinsics.g(this.requireUpdateAndroidVersion, detail.requireUpdateAndroidVersion);
            }

            public final String getBizName() {
                return this.bizName;
            }

            public final long getBizTime() {
                return this.bizTime;
            }

            public final int getBizType() {
                return this.bizType;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public final String getEmail() {
                return this.email;
            }

            public final int getMsgType() {
                return this.msgType;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getRedirectUrl() {
                return this.redirectUrl;
            }

            public final String getRequireUpdateAndroidVersion() {
                return this.requireUpdateAndroidVersion;
            }

            public final long getStake() {
                return this.stake;
            }

            public final long getWinning() {
                return this.winning;
            }

            public int hashCode() {
                int iA = gpp.a(this.bizType, Integer.hashCode(this.msgType) * 31, 31);
                String str = this.bizName;
                int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.phone;
                int iA2 = f87.a(f87.a(f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.stake, 31), this.winning, 31), this.bizTime, 31);
                String str3 = this.currency;
                int iHashCode2 = (iA2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.email;
                int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.redirectUrl;
                int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.requireUpdateAndroidVersion;
                return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
            }

            public String toString() {
                int i = this.msgType;
                int i2 = this.bizType;
                String str = this.bizName;
                String str2 = this.phone;
                long j = this.stake;
                long j2 = this.winning;
                long j3 = this.bizTime;
                String str3 = this.currency;
                String str4 = this.email;
                String str5 = this.redirectUrl;
                String str6 = this.requireUpdateAndroidVersion;
                StringBuilder sbA = dy5.a("Detail(msgType=", i, i2, ", bizType=", ", bizName=");
                hxa.c(sbA, str, ", phone=", str2, ", stake=");
                sbA.append(j);
                g41.a(j2, ", winning=", ", bizTime=", sbA);
                em5.a(j3, ", currency=", str3, sbA);
                hxa.c(sbA, ", email=", str4, ", redirectUrl=", str5);
                return pr0.a(sbA, ", requireUpdateAndroidVersion=", str6, ")");
            }

            public Detail(int i, int i2, String str, String str2, long j, long j2, long j3, String str3, String str4, String str5, String str6) {
                this.msgType = i;
                this.bizType = i2;
                this.bizName = str;
                this.phone = str2;
                this.stake = j;
                this.winning = j2;
                this.bizTime = j3;
                this.currency = str3;
                this.email = str4;
                this.redirectUrl = str5;
                this.requireUpdateAndroidVersion = str6;
            }

            public Detail() {
                this(0, 0, null, null, 0L, 0L, 0L, null, null, null, null, 2047, null);
            }
        }
    }
}
