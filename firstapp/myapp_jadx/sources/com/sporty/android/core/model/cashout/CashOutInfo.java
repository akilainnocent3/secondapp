package com.sporty.android.core.model.cashout;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.d020;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.tcp;
import defpackage.uts;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\b\u0018\u0000 f2\u00020\u0001:\u0002gfBí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\r\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\"J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\"J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\"J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b2\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u00100J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u00100J\u0012\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\"J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u00100J\u0012\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010*J\u0012\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010\"J\u0012\u0010E\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bG\u00100J\u0086\u0002\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bR\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\b\u0007\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bT\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\b\t\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bU\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\b\u000b\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\b\f\u00106R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\b\r\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010W\u001a\u0004\bX\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bY\u0010\"R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\b[\u0010<R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\b\u0014\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\b_\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\ba\u0010BR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010`\u001a\u0004\bb\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010O\u001a\u0004\bc\u0010\"R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010FR\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010S\u001a\u0004\b\u001f\u00100¨\u0006h"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutInfo;", "", "", "betId", "availableStake", "coefficient", "", "isSupportPartial", "maxCashOutAmount", "isCashAble", EventKeys.ERROR_MESSAGE, "isError", "isCalcByJS", "isCashAbleJs", "Lcom/sporty/android/core/model/cashout/UnCashableReason;", "unCashableReason", "metrics", "", "Ltcp;", "metricsInfo", "isFallbackCashOut", "", "oddsChangeTimeForFallback", "Lcom/sporty/android/core/model/cashout/CashOutFallback;", AnalyticsParam.DATA_FALLBACK, "", "remainCount", "maxCount", "selectionId", "Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;", "debugInfo", "isJsCalcFailed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/Boolean;ZLcom/sporty/android/core/model/cashout/UnCashableReason;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Long;Lcom/sporty/android/core/model/cashout/CashOutFallback;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;Z)V", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "setBetId", "(Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/CashOutInfo;", "setIsSupportPartial", "(Z)Lcom/sporty/android/core/model/cashout/CashOutInfo;", "setIsCashAbleJs", "cashOutFallback", "()Lcom/sporty/android/core/model/cashout/CashOutFallback;", "toString", "component1", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Lcom/sporty/android/core/model/cashout/UnCashableReason;", "component12", "component13", "()Ljava/util/List;", "component14", "component15", "()Ljava/lang/Long;", "component16", "component17", "()Ljava/lang/Integer;", "component18", "component19", "component20", "()Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/Boolean;ZLcom/sporty/android/core/model/cashout/UnCashableReason;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Long;Lcom/sporty/android/core/model/cashout/CashOutFallback;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;Z)Lcom/sporty/android/core/model/cashout/CashOutInfo;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBetId", "getAvailableStake", "getCoefficient", "Z", "getMaxCashOutAmount", "getMessage", "Ljava/lang/Boolean;", "Lcom/sporty/android/core/model/cashout/UnCashableReason;", "getUnCashableReason", "getMetrics", "Ljava/util/List;", "getMetricsInfo", "Ljava/lang/Long;", "getOddsChangeTimeForFallback", "Lcom/sporty/android/core/model/cashout/CashOutFallback;", "getFallback", "Ljava/lang/Integer;", "getRemainCount", "getMaxCount", "getSelectionId", "Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;", "getDebugInfo", "Companion", "DebugInfo", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String availableStake;
    private final String betId;
    private final String coefficient;
    private final DebugInfo debugInfo;
    private final CashOutFallback fallback;
    private final Boolean isCalcByJS;
    private final boolean isCashAble;
    private final boolean isCashAbleJs;
    private final boolean isError;
    private final boolean isFallbackCashOut;
    private final boolean isJsCalcFailed;
    private final boolean isSupportPartial;
    private final String maxCashOutAmount;
    private final Integer maxCount;
    private final String message;
    private final String metrics;
    private final List<tcp> metricsInfo;
    private final Long oddsChangeTimeForFallback;
    private final Integer remainCount;
    private final String selectionId;
    private final UnCashableReason unCashableReason;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutInfo$Companion;", "", "<init>", "()V", "", "betId", EventKeys.ERROR_MESSAGE, "", "isError", "isCalcByJS", "Lcom/sporty/android/core/model/cashout/UnCashableReason;", "unCashableReason", "metrics", "", "Ltcp;", "metricsInfo", "isSupportPartial", "maxCashOutAmount", "coefficient", "availableStake", "Lcom/sporty/android/core/model/cashout/CashOutInfo;", "createUnavailable", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/sporty/android/core/model/cashout/UnCashableReason;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/CashOutInfo;", "createLoadingInfo", "(Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/CashOutInfo;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CashOutInfo createUnavailable$default(Companion companion, String str, String str2, boolean z, boolean z2, UnCashableReason unCashableReason, String str3, List list, boolean z3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            if ((i & 16) != 0) {
                unCashableReason = null;
            }
            if ((i & 32) != 0) {
                str3 = CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS;
            }
            if ((i & 64) != 0) {
                list = m2g.a;
            }
            if ((i & 128) != 0) {
                z3 = false;
            }
            if ((i & 256) != 0) {
                str4 = null;
            }
            if ((i & 512) != 0) {
                str5 = null;
            }
            if ((i & 1024) != 0) {
                str6 = null;
            }
            return companion.createUnavailable(str, str2, z, z2, unCashableReason, str3, list, z3, str4, str5, str6);
        }

        public final CashOutInfo createLoadingInfo(String betId) {
            betId.getClass();
            return new CashOutInfo(betId, "", "", true, "", false, "", false, Boolean.TRUE, false, null, null, null, false, null, null, null, null, null, null, false, 2096768, null);
        }

        public final CashOutInfo createUnavailable(String betId, String message, boolean isError, boolean isCalcByJS, UnCashableReason unCashableReason, String metrics, List<? extends tcp> metricsInfo, boolean isSupportPartial, String maxCashOutAmount, String coefficient, String availableStake) {
            betId.getClass();
            return new CashOutInfo(betId, availableStake, coefficient, isSupportPartial, maxCashOutAmount, false, message, isError, Boolean.valueOf(isCalcByJS), false, unCashableReason, metrics, metricsInfo, false, null, null, null, null, null, null, false, 2089472, null);
        }

        private Companion() {
        }
    }

    public CashOutInfo(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, Boolean bool, boolean z4, UnCashableReason unCashableReason, String str6, List list, boolean z5, Long l, CashOutFallback cashOutFallback, Integer num, Integer num2, String str7, DebugInfo debugInfo, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, str4, z2, str5, (i & 128) != 0 ? false : z3, bool, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? null : unCashableReason, (i & 2048) != 0 ? CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS : str6, (i & 4096) != 0 ? m2g.a : list, (i & 8192) != 0 ? false : z5, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : l, (32768 & i) != 0 ? new CashOutFallback(null, null, null, null, null, null, null, null, 255, null) : cashOutFallback, (65536 & i) != 0 ? null : num, (131072 & i) != 0 ? null : num2, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : debugInfo, (i & 1048576) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutInfo copy$default(CashOutInfo cashOutInfo, String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, Boolean bool, boolean z4, UnCashableReason unCashableReason, String str6, List list, boolean z5, Long l, CashOutFallback cashOutFallback, Integer num, Integer num2, String str7, DebugInfo debugInfo, boolean z6, int i, Object obj) {
        boolean z7;
        DebugInfo debugInfo2;
        String str8 = (i & 1) != 0 ? cashOutInfo.betId : str;
        String str9 = (i & 2) != 0 ? cashOutInfo.availableStake : str2;
        String str10 = (i & 4) != 0 ? cashOutInfo.coefficient : str3;
        boolean z8 = (i & 8) != 0 ? cashOutInfo.isSupportPartial : z;
        String str11 = (i & 16) != 0 ? cashOutInfo.maxCashOutAmount : str4;
        boolean z9 = (i & 32) != 0 ? cashOutInfo.isCashAble : z2;
        String str12 = (i & 64) != 0 ? cashOutInfo.message : str5;
        boolean z10 = (i & 128) != 0 ? cashOutInfo.isError : z3;
        Boolean bool2 = (i & 256) != 0 ? cashOutInfo.isCalcByJS : bool;
        boolean z11 = (i & 512) != 0 ? cashOutInfo.isCashAbleJs : z4;
        UnCashableReason unCashableReason2 = (i & 1024) != 0 ? cashOutInfo.unCashableReason : unCashableReason;
        String str13 = (i & 2048) != 0 ? cashOutInfo.metrics : str6;
        List list2 = (i & 4096) != 0 ? cashOutInfo.metricsInfo : list;
        boolean z12 = (i & 8192) != 0 ? cashOutInfo.isFallbackCashOut : z5;
        String str14 = str8;
        Long l2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cashOutInfo.oddsChangeTimeForFallback : l;
        CashOutFallback cashOutFallback2 = (i & 32768) != 0 ? cashOutInfo.fallback : cashOutFallback;
        Integer num3 = (i & 65536) != 0 ? cashOutInfo.remainCount : num;
        Integer num4 = (i & 131072) != 0 ? cashOutInfo.maxCount : num2;
        String str15 = (i & 262144) != 0 ? cashOutInfo.selectionId : str7;
        DebugInfo debugInfo3 = (i & 524288) != 0 ? cashOutInfo.debugInfo : debugInfo;
        if ((i & 1048576) != 0) {
            debugInfo2 = debugInfo3;
            z7 = cashOutInfo.isJsCalcFailed;
        } else {
            z7 = z6;
            debugInfo2 = debugInfo3;
        }
        return cashOutInfo.copy(str14, str9, str10, z8, str11, z9, str12, z10, bool2, z11, unCashableReason2, str13, list2, z12, l2, cashOutFallback2, num3, num4, str15, debugInfo2, z7);
    }

    public final String availableStake() {
        String str = this.availableStake;
        return str == null ? "" : str;
    }

    public final String betId() {
        String str = this.betId;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: cashOutFallback, reason: from getter */
    public final CashOutFallback getFallback() {
        return this.fallback;
    }

    public final String coefficient() {
        String str = this.coefficient;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsCashAbleJs() {
        return this.isCashAbleJs;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UnCashableReason getUnCashableReason() {
        return this.unCashableReason;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMetrics() {
        return this.metrics;
    }

    public final List<tcp> component13() {
        return this.metricsInfo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsFallbackCashOut() {
        return this.isFallbackCashOut;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getOddsChangeTimeForFallback() {
        return this.oddsChangeTimeForFallback;
    }

    public final CashOutFallback component16() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getRemainCount() {
        return this.remainCount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvailableStake() {
        return this.availableStake;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final DebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsJsCalcFailed() {
        return this.isJsCalcFailed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoefficient() {
        return this.coefficient;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSupportPartial() {
        return this.isSupportPartial;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxCashOutAmount() {
        return this.maxCashOutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCashAble() {
        return this.isCashAble;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsCalcByJS() {
        return this.isCalcByJS;
    }

    public final CashOutInfo copy(String betId, String availableStake, String coefficient, boolean isSupportPartial, String maxCashOutAmount, boolean isCashAble, String message, boolean isError, Boolean isCalcByJS, boolean isCashAbleJs, UnCashableReason unCashableReason, String metrics, List<? extends tcp> metricsInfo, boolean isFallbackCashOut, Long oddsChangeTimeForFallback, CashOutFallback fallback, Integer remainCount, Integer maxCount, String selectionId, DebugInfo debugInfo, boolean isJsCalcFailed) {
        return new CashOutInfo(betId, availableStake, coefficient, isSupportPartial, maxCashOutAmount, isCashAble, message, isError, isCalcByJS, isCashAbleJs, unCashableReason, metrics, metricsInfo, isFallbackCashOut, oddsChangeTimeForFallback, fallback, remainCount, maxCount, selectionId, debugInfo, isJsCalcFailed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutInfo)) {
            return false;
        }
        CashOutInfo cashOutInfo = (CashOutInfo) other;
        return Intrinsics.g(this.betId, cashOutInfo.betId) && Intrinsics.g(this.availableStake, cashOutInfo.availableStake) && Intrinsics.g(this.coefficient, cashOutInfo.coefficient) && this.isSupportPartial == cashOutInfo.isSupportPartial && Intrinsics.g(this.maxCashOutAmount, cashOutInfo.maxCashOutAmount) && this.isCashAble == cashOutInfo.isCashAble && Intrinsics.g(this.message, cashOutInfo.message) && this.isError == cashOutInfo.isError && Intrinsics.g(this.isCalcByJS, cashOutInfo.isCalcByJS) && this.isCashAbleJs == cashOutInfo.isCashAbleJs && Intrinsics.g(this.unCashableReason, cashOutInfo.unCashableReason) && Intrinsics.g(this.metrics, cashOutInfo.metrics) && Intrinsics.g(this.metricsInfo, cashOutInfo.metricsInfo) && this.isFallbackCashOut == cashOutInfo.isFallbackCashOut && Intrinsics.g(this.oddsChangeTimeForFallback, cashOutInfo.oddsChangeTimeForFallback) && Intrinsics.g(this.fallback, cashOutInfo.fallback) && Intrinsics.g(this.remainCount, cashOutInfo.remainCount) && Intrinsics.g(this.maxCount, cashOutInfo.maxCount) && Intrinsics.g(this.selectionId, cashOutInfo.selectionId) && Intrinsics.g(this.debugInfo, cashOutInfo.debugInfo) && this.isJsCalcFailed == cashOutInfo.isJsCalcFailed;
    }

    public final String getAvailableStake() {
        return this.availableStake;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final String getCoefficient() {
        return this.coefficient;
    }

    public final DebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public final CashOutFallback getFallback() {
        return this.fallback;
    }

    public final String getMaxCashOutAmount() {
        return this.maxCashOutAmount;
    }

    public final Integer getMaxCount() {
        return this.maxCount;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMetrics() {
        return this.metrics;
    }

    public final List<tcp> getMetricsInfo() {
        return this.metricsInfo;
    }

    public final Long getOddsChangeTimeForFallback() {
        return this.oddsChangeTimeForFallback;
    }

    public final Integer getRemainCount() {
        return this.remainCount;
    }

    public final String getSelectionId() {
        return this.selectionId;
    }

    public final UnCashableReason getUnCashableReason() {
        return this.unCashableReason;
    }

    public int hashCode() {
        String str = this.betId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.availableStake;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coefficient;
        int iA = mtg0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isSupportPartial);
        String str4 = this.maxCashOutAmount;
        int iA2 = mtg0.a((iA + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isCashAble);
        String str5 = this.message;
        int iA3 = mtg0.a((iA2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isError);
        Boolean bool = this.isCalcByJS;
        int iA4 = mtg0.a((iA3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isCashAbleJs);
        UnCashableReason unCashableReason = this.unCashableReason;
        int iHashCode3 = (iA4 + (unCashableReason == null ? 0 : unCashableReason.hashCode())) * 31;
        String str6 = this.metrics;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<tcp> list = this.metricsInfo;
        int iA5 = mtg0.a((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isFallbackCashOut);
        Long l = this.oddsChangeTimeForFallback;
        int iHashCode5 = (iA5 + (l == null ? 0 : l.hashCode())) * 31;
        CashOutFallback cashOutFallback = this.fallback;
        int iHashCode6 = (iHashCode5 + (cashOutFallback == null ? 0 : cashOutFallback.hashCode())) * 31;
        Integer num = this.remainCount;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxCount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.selectionId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DebugInfo debugInfo = this.debugInfo;
        return Boolean.hashCode(this.isJsCalcFailed) + ((iHashCode9 + (debugInfo != null ? debugInfo.hashCode() : 0)) * 31);
    }

    public final Boolean isCalcByJS() {
        return this.isCalcByJS;
    }

    public final boolean isCashAble() {
        return this.isCashAble;
    }

    public final boolean isCashAbleJs() {
        return this.isCashAbleJs;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isFallbackCashOut() {
        return this.isFallbackCashOut;
    }

    public final boolean isJsCalcFailed() {
        return this.isJsCalcFailed;
    }

    public final boolean isSupportPartial() {
        return this.isSupportPartial;
    }

    public final String maxCashOutAmount() {
        String str = this.maxCashOutAmount;
        return str == null ? "" : str;
    }

    public final CashOutInfo setBetId(String id) {
        id.getClass();
        return copy$default(this, id, null, null, false, null, false, null, false, Boolean.TRUE, false, null, null, null, false, null, null, null, null, null, null, false, 2096894, null);
    }

    public final CashOutInfo setIsCashAbleJs(boolean isCashAbleJs) {
        return copy$default(this, null, null, null, false, null, false, null, false, null, isCashAbleJs, null, null, null, false, null, null, null, null, null, null, false, 2096639, null);
    }

    public final CashOutInfo setIsSupportPartial(boolean isSupportPartial) {
        return copy$default(this, null, null, null, isSupportPartial, null, false, null, false, null, false, null, null, null, false, null, null, null, null, null, null, false, 2097143, null);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.availableStake;
        String str3 = this.coefficient;
        boolean z = this.isSupportPartial;
        String str4 = this.maxCashOutAmount;
        boolean z2 = this.isCashAble;
        String str5 = this.message;
        boolean z3 = this.isError;
        Boolean bool = this.isCalcByJS;
        boolean z4 = this.isCashAbleJs;
        UnCashableReason unCashableReason = this.unCashableReason;
        String str6 = this.metrics;
        List<tcp> list = this.metricsInfo;
        boolean z5 = this.isFallbackCashOut;
        Long l = this.oddsChangeTimeForFallback;
        CashOutFallback cashOutFallback = this.fallback;
        StringBuilder sbA = ux5.a("CashOutInfo(betId=", str, ", availableStake=", str2, ", coefficient=");
        uts.b(str3, ", isSupportPartial=", ", maxCashOutAmount=", sbA, z);
        uts.b(str4, ", isCashAble=", ", message=", sbA, z2);
        uts.b(str5, ", isError=", ", isCalcByJS=", sbA, z3);
        sbA.append(bool);
        sbA.append(", isCashAbleJs=");
        sbA.append(z4);
        sbA.append(", unCashableReason=");
        sbA.append(unCashableReason);
        sbA.append(", metrics=");
        sbA.append(str6);
        sbA.append(", metricsInfo=");
        sbA.append(list);
        sbA.append(", isFallbackCashOut=");
        sbA.append(z5);
        sbA.append(", oddsChangeTimeForFallback=");
        sbA.append(l);
        sbA.append(", fallback=");
        sbA.append(cashOutFallback);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashOutInfo(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, boolean z3, Boolean bool, boolean z4, UnCashableReason unCashableReason, String str6, List<? extends tcp> list, boolean z5, Long l, CashOutFallback cashOutFallback, Integer num, Integer num2, String str7, DebugInfo debugInfo, boolean z6) {
        this.betId = str;
        this.availableStake = str2;
        this.coefficient = str3;
        this.isSupportPartial = z;
        this.maxCashOutAmount = str4;
        this.isCashAble = z2;
        this.message = str5;
        this.isError = z3;
        this.isCalcByJS = bool;
        this.isCashAbleJs = z4;
        this.unCashableReason = unCashableReason;
        this.metrics = str6;
        this.metricsInfo = list;
        this.isFallbackCashOut = z5;
        this.oddsChangeTimeForFallback = l;
        this.fallback = cashOutFallback;
        this.remainCount = num;
        this.maxCount = num2;
        this.selectionId = str7;
        this.debugInfo = debugInfo;
        this.isJsCalcFailed = z6;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutInfo$DebugInfo;", "", "timeNow", "", "<init>", "(J)V", "getTimeNow", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DebugInfo {
        private final long timeNow;

        public /* synthetic */ DebugInfo(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }

        public static /* synthetic */ DebugInfo copy$default(DebugInfo debugInfo, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = debugInfo.timeNow;
            }
            return debugInfo.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimeNow() {
            return this.timeNow;
        }

        public final DebugInfo copy(long timeNow) {
            return new DebugInfo(timeNow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DebugInfo) && this.timeNow == ((DebugInfo) other).timeNow;
        }

        public final long getTimeNow() {
            return this.timeNow;
        }

        public int hashCode() {
            return Long.hashCode(this.timeNow);
        }

        public String toString() {
            return d020.a(this.timeNow, "DebugInfo(timeNow=", ")");
        }

        public DebugInfo(long j) {
            this.timeNow = j;
        }

        public DebugInfo() {
            this(0L, 1, null);
        }
    }
}
