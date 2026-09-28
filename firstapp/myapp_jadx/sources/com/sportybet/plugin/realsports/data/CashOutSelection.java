package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.cashout.AdditionMarket;
import com.sporty.android.core.model.orders.JokerInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.oie;
import defpackage.s27;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B×\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b*\u0010+J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010d\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010h\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010i\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010p\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0018HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010t\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010u\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010v\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010w\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010x\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u009a\u0003\u0010{\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010|J\u0014\u0010}\u001a\u00020\u000f2\b\u0010~\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u007f\u001a\u00020\fHÖ\u0081\u0004J\u000b\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(2¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R)\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\r¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R)\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010-R)\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0012¢\u0006\n\n\u0002\u0010<\u001a\u0004\bC\u0010;R)\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0013¢\u0006\n\n\u0002\u0010<\u001a\u0004\b\u0013\u0010;R)\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0014¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER)\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0016¢\u0006\n\n\u0002\u0010F\u001a\u0004\bG\u0010ER-\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR'\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0019¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010-R'\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\bK\u0010-R'\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010-R)\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001c¢\u0006\n\n\u0002\u0010@\u001a\u0004\bM\u0010?R)\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u0010<\u001a\u0004\bN\u0010;R-\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR'\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b( ¢\u0006\b\n\u0000\u001a\u0004\bP\u0010-R)\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(!¢\u0006\n\n\u0002\u0010<\u001a\u0004\bQ\u0010;R)\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(\"¢\u0006\n\n\u0002\u0010@\u001a\u0004\b\"\u0010?R)\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b.\u0012\b\b/\u0012\u0004\b\b(#¢\u0006\n\n\u0002\u00106\u001a\u0004\bR\u00105R\u0015\u0010$\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010F\u001a\u0004\bS\u0010ER\u0015\u0010%\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010F\u001a\u0004\bT\u0010ER\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010-R\u0015\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010F\u001a\u0004\bZ\u0010EÊ\u0001\u000e\b\u0082\u0001\u0012\t\b\u0083\u0001\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0081\u0001"}, d2 = {"Lcom/sportybet/plugin/realsports/data/CashOutSelection;", "", "cashOutSelectionId", "", "cashOutSelectionEventId", "sportId", "product", "", "marketId", "specifier", "outcomeId", AnalyticsParam.EVENT_STATUS, "", "eventStatus", "banker", "", "odds", "currentOdds", "marketStatus", "isOutcomeActive", "originalProbability", "", "currentProbability", "subBetIdIndex", "", "subBetId", "suspendedReason", "tournamentId", "bannedEvent", "cashOutStatus", "markets", "Lcom/sporty/android/core/model/cashout/AdditionMarket;", "setScore", "settleStatus", "isLive", "lastOddsChangeTime", "currentVoidProbability", "originalVoidProbability", "joker", "Lcom/sporty/android/core/model/orders/JokerInfo;", "source", "deadHeatFactor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Lcom/sporty/android/core/model/orders/JokerInfo;Ljava/lang/String;Ljava/lang/Double;)V", "getCashOutSelectionId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", AnalyticsParam.EVENT_PARAM_ID, "getCashOutSelectionEventId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "getSportId", "getProduct", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMarketId", "getSpecifier", "getOutcomeId", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEventStatus", "getBanker", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOdds", "getCurrentOdds", "getMarketStatus", "getOriginalProbability", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrentProbability", "getSubBetIdIndex", "()Ljava/util/List;", "getSubBetId", "getSuspendedReason", "getTournamentId", "getBannedEvent", "getCashOutStatus", "getMarkets", "getSetScore", "getSettleStatus", "getLastOddsChangeTime", "getCurrentVoidProbability", "getOriginalVoidProbability", "getJoker", "()Lcom/sporty/android/core/model/orders/JokerInfo;", "setJoker", "(Lcom/sporty/android/core/model/orders/JokerInfo;)V", "getSource", "getDeadHeatFactor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Lcom/sporty/android/core/model/orders/JokerInfo;Ljava/lang/String;Ljava/lang/Double;)Lcom/sportybet/plugin/realsports/data/CashOutSelection;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutSelection {
    public static final int $stable = 8;

    @SerializedName("banker")
    private final Boolean banker;

    @SerializedName("bannedEvent")
    private final Boolean bannedEvent;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String cashOutSelectionEventId;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String cashOutSelectionId;

    @SerializedName("cashOutStatus")
    private final Integer cashOutStatus;

    @SerializedName("currentOdds")
    private final String currentOdds;

    @SerializedName("currentProbability")
    private final Double currentProbability;
    private final Double currentVoidProbability;
    private final Double deadHeatFactor;

    @SerializedName("eventStatus")
    private final Integer eventStatus;

    @SerializedName("isLive")
    private final Boolean isLive;

    @SerializedName("isOutcomeActive")
    private final Integer isOutcomeActive;
    private JokerInfo joker;

    @SerializedName("lastOddsChangeTime")
    private final Long lastOddsChangeTime;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketStatus")
    private final Integer marketStatus;

    @SerializedName("markets")
    private final List<AdditionMarket> markets;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("originalProbability")
    private final Double originalProbability;
    private final Double originalVoidProbability;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("product")
    private final Long product;

    @SerializedName("setScore")
    private final String setScore;

    @SerializedName("settleStatus")
    private final Integer settleStatus;
    private final String source;

    @SerializedName("specifier")
    private final String specifier;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    @SerializedName("subBetId")
    private final String subBetId;

    @SerializedName("subBetIdIndex")
    private final List<String> subBetIdIndex;

    @SerializedName("suspendedReason")
    private final String suspendedReason;

    @SerializedName("tournamentId")
    private final String tournamentId;

    public CashOutSelection(String str, String str2, String str3, Long l, String str4, String str5, String str6, Integer num, Integer num2, Boolean bool, String str7, String str8, Integer num3, Integer num4, Double d, Double d2, List<String> list, String str9, String str10, String str11, Boolean bool2, Integer num5, List<AdditionMarket> list2, String str12, Integer num6, Boolean bool3, Long l2, Double d3, Double d4, JokerInfo jokerInfo, String str13, Double d5) {
        this.cashOutSelectionId = str;
        this.cashOutSelectionEventId = str2;
        this.sportId = str3;
        this.product = l;
        this.marketId = str4;
        this.specifier = str5;
        this.outcomeId = str6;
        this.status = num;
        this.eventStatus = num2;
        this.banker = bool;
        this.odds = str7;
        this.currentOdds = str8;
        this.marketStatus = num3;
        this.isOutcomeActive = num4;
        this.originalProbability = d;
        this.currentProbability = d2;
        this.subBetIdIndex = list;
        this.subBetId = str9;
        this.suspendedReason = str10;
        this.tournamentId = str11;
        this.bannedEvent = bool2;
        this.cashOutStatus = num5;
        this.markets = list2;
        this.setScore = str12;
        this.settleStatus = num6;
        this.isLive = bool3;
        this.lastOddsChangeTime = l2;
        this.currentVoidProbability = d3;
        this.originalVoidProbability = d4;
        this.joker = jokerInfo;
        this.source = str13;
        this.deadHeatFactor = d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutSelection copy$default(CashOutSelection cashOutSelection, String str, String str2, String str3, Long l, String str4, String str5, String str6, Integer num, Integer num2, Boolean bool, String str7, String str8, Integer num3, Integer num4, Double d, Double d2, List list, String str9, String str10, String str11, Boolean bool2, Integer num5, List list2, String str12, Integer num6, Boolean bool3, Long l2, Double d3, Double d4, JokerInfo jokerInfo, String str13, Double d5, int i, Object obj) {
        Double d6;
        String str14;
        String str15 = (i & 1) != 0 ? cashOutSelection.cashOutSelectionId : str;
        String str16 = (i & 2) != 0 ? cashOutSelection.cashOutSelectionEventId : str2;
        String str17 = (i & 4) != 0 ? cashOutSelection.sportId : str3;
        Long l3 = (i & 8) != 0 ? cashOutSelection.product : l;
        String str18 = (i & 16) != 0 ? cashOutSelection.marketId : str4;
        String str19 = (i & 32) != 0 ? cashOutSelection.specifier : str5;
        String str20 = (i & 64) != 0 ? cashOutSelection.outcomeId : str6;
        Integer num7 = (i & 128) != 0 ? cashOutSelection.status : num;
        Integer num8 = (i & 256) != 0 ? cashOutSelection.eventStatus : num2;
        Boolean bool4 = (i & 512) != 0 ? cashOutSelection.banker : bool;
        String str21 = (i & 1024) != 0 ? cashOutSelection.odds : str7;
        String str22 = (i & 2048) != 0 ? cashOutSelection.currentOdds : str8;
        Integer num9 = (i & 4096) != 0 ? cashOutSelection.marketStatus : num3;
        Integer num10 = (i & 8192) != 0 ? cashOutSelection.isOutcomeActive : num4;
        String str23 = str15;
        Double d7 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cashOutSelection.originalProbability : d;
        Double d8 = (i & 32768) != 0 ? cashOutSelection.currentProbability : d2;
        List list3 = (i & 65536) != 0 ? cashOutSelection.subBetIdIndex : list;
        String str24 = (i & 131072) != 0 ? cashOutSelection.subBetId : str9;
        String str25 = (i & 262144) != 0 ? cashOutSelection.suspendedReason : str10;
        String str26 = (i & 524288) != 0 ? cashOutSelection.tournamentId : str11;
        Boolean bool5 = (i & 1048576) != 0 ? cashOutSelection.bannedEvent : bool2;
        Integer num11 = (i & 2097152) != 0 ? cashOutSelection.cashOutStatus : num5;
        List list4 = (i & 4194304) != 0 ? cashOutSelection.markets : list2;
        String str27 = (i & 8388608) != 0 ? cashOutSelection.setScore : str12;
        Integer num12 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? cashOutSelection.settleStatus : num6;
        Boolean bool6 = (i & 33554432) != 0 ? cashOutSelection.isLive : bool3;
        Long l4 = (i & 67108864) != 0 ? cashOutSelection.lastOddsChangeTime : l2;
        Double d9 = (i & 134217728) != 0 ? cashOutSelection.currentVoidProbability : d3;
        Double d10 = (i & 268435456) != 0 ? cashOutSelection.originalVoidProbability : d4;
        JokerInfo jokerInfo2 = (i & 536870912) != 0 ? cashOutSelection.joker : jokerInfo;
        String str28 = (i & 1073741824) != 0 ? cashOutSelection.source : str13;
        if ((i & Integer.MIN_VALUE) != 0) {
            str14 = str28;
            d6 = cashOutSelection.deadHeatFactor;
        } else {
            d6 = d5;
            str14 = str28;
        }
        return cashOutSelection.copy(str23, str16, str17, l3, str18, str19, str20, num7, num8, bool4, str21, str22, num9, num10, d7, d8, list3, str24, str25, str26, bool5, num11, list4, str27, num12, bool6, l4, d9, d10, jokerInfo2, str14, d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCashOutSelectionId() {
        return this.cashOutSelectionId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getBanker() {
        return this.banker;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCurrentOdds() {
        return this.currentOdds;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getMarketStatus() {
        return this.marketStatus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getIsOutcomeActive() {
        return this.isOutcomeActive;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getOriginalProbability() {
        return this.originalProbability;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getCurrentProbability() {
        return this.currentProbability;
    }

    public final List<String> component17() {
        return this.subBetIdIndex;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSubBetId() {
        return this.subBetId;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCashOutSelectionEventId() {
        return this.cashOutSelectionEventId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getBannedEvent() {
        return this.bannedEvent;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final List<AdditionMarket> component23() {
        return this.markets;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSetScore() {
        return this.setScore;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getSettleStatus() {
        return this.settleStatus;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Double getCurrentVoidProbability() {
        return this.currentVoidProbability;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Double getOriginalVoidProbability() {
        return this.originalVoidProbability;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final JokerInfo getJoker() {
        return this.joker;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Double getDeadHeatFactor() {
        return this.deadHeatFactor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    public final CashOutSelection copy(String cashOutSelectionId, String cashOutSelectionEventId, String sportId, Long product, String marketId, String specifier, String outcomeId, Integer status, Integer eventStatus, Boolean banker, String odds, String currentOdds, Integer marketStatus, Integer isOutcomeActive, Double originalProbability, Double currentProbability, List<String> subBetIdIndex, String subBetId, String suspendedReason, String tournamentId, Boolean bannedEvent, Integer cashOutStatus, List<AdditionMarket> markets, String setScore, Integer settleStatus, Boolean isLive, Long lastOddsChangeTime, Double currentVoidProbability, Double originalVoidProbability, JokerInfo joker, String source, Double deadHeatFactor) {
        return new CashOutSelection(cashOutSelectionId, cashOutSelectionEventId, sportId, product, marketId, specifier, outcomeId, status, eventStatus, banker, odds, currentOdds, marketStatus, isOutcomeActive, originalProbability, currentProbability, subBetIdIndex, subBetId, suspendedReason, tournamentId, bannedEvent, cashOutStatus, markets, setScore, settleStatus, isLive, lastOddsChangeTime, currentVoidProbability, originalVoidProbability, joker, source, deadHeatFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutSelection)) {
            return false;
        }
        CashOutSelection cashOutSelection = (CashOutSelection) other;
        return Intrinsics.g(this.cashOutSelectionId, cashOutSelection.cashOutSelectionId) && Intrinsics.g(this.cashOutSelectionEventId, cashOutSelection.cashOutSelectionEventId) && Intrinsics.g(this.sportId, cashOutSelection.sportId) && Intrinsics.g(this.product, cashOutSelection.product) && Intrinsics.g(this.marketId, cashOutSelection.marketId) && Intrinsics.g(this.specifier, cashOutSelection.specifier) && Intrinsics.g(this.outcomeId, cashOutSelection.outcomeId) && Intrinsics.g(this.status, cashOutSelection.status) && Intrinsics.g(this.eventStatus, cashOutSelection.eventStatus) && Intrinsics.g(this.banker, cashOutSelection.banker) && Intrinsics.g(this.odds, cashOutSelection.odds) && Intrinsics.g(this.currentOdds, cashOutSelection.currentOdds) && Intrinsics.g(this.marketStatus, cashOutSelection.marketStatus) && Intrinsics.g(this.isOutcomeActive, cashOutSelection.isOutcomeActive) && Intrinsics.g(this.originalProbability, cashOutSelection.originalProbability) && Intrinsics.g(this.currentProbability, cashOutSelection.currentProbability) && Intrinsics.g(this.subBetIdIndex, cashOutSelection.subBetIdIndex) && Intrinsics.g(this.subBetId, cashOutSelection.subBetId) && Intrinsics.g(this.suspendedReason, cashOutSelection.suspendedReason) && Intrinsics.g(this.tournamentId, cashOutSelection.tournamentId) && Intrinsics.g(this.bannedEvent, cashOutSelection.bannedEvent) && Intrinsics.g(this.cashOutStatus, cashOutSelection.cashOutStatus) && Intrinsics.g(this.markets, cashOutSelection.markets) && Intrinsics.g(this.setScore, cashOutSelection.setScore) && Intrinsics.g(this.settleStatus, cashOutSelection.settleStatus) && Intrinsics.g(this.isLive, cashOutSelection.isLive) && Intrinsics.g(this.lastOddsChangeTime, cashOutSelection.lastOddsChangeTime) && Intrinsics.g(this.currentVoidProbability, cashOutSelection.currentVoidProbability) && Intrinsics.g(this.originalVoidProbability, cashOutSelection.originalVoidProbability) && Intrinsics.g(this.joker, cashOutSelection.joker) && Intrinsics.g(this.source, cashOutSelection.source) && Intrinsics.g(this.deadHeatFactor, cashOutSelection.deadHeatFactor);
    }

    public final Boolean getBanker() {
        return this.banker;
    }

    public final Boolean getBannedEvent() {
        return this.bannedEvent;
    }

    public final String getCashOutSelectionEventId() {
        return this.cashOutSelectionEventId;
    }

    public final String getCashOutSelectionId() {
        return this.cashOutSelectionId;
    }

    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final String getCurrentOdds() {
        return this.currentOdds;
    }

    public final Double getCurrentProbability() {
        return this.currentProbability;
    }

    public final Double getCurrentVoidProbability() {
        return this.currentVoidProbability;
    }

    public final Double getDeadHeatFactor() {
        return this.deadHeatFactor;
    }

    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    public final JokerInfo getJoker() {
        return this.joker;
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final Integer getMarketStatus() {
        return this.marketStatus;
    }

    public final List<AdditionMarket> getMarkets() {
        return this.markets;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final Double getOriginalProbability() {
        return this.originalProbability;
    }

    public final Double getOriginalVoidProbability() {
        return this.originalVoidProbability;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final Long getProduct() {
        return this.product;
    }

    public final String getSetScore() {
        return this.setScore;
    }

    public final Integer getSettleStatus() {
        return this.settleStatus;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSubBetId() {
        return this.subBetId;
    }

    public final List<String> getSubBetIdIndex() {
        return this.subBetIdIndex;
    }

    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        String str = this.cashOutSelectionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashOutSelectionEventId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sportId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.product;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.marketId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.specifier;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outcomeId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.eventStatus;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.banker;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.odds;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currentOdds;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.marketStatus;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.isOutcomeActive;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.originalProbability;
        int iHashCode15 = (iHashCode14 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.currentProbability;
        int iHashCode16 = (iHashCode15 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List<String> list = this.subBetIdIndex;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.subBetId;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.suspendedReason;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tournamentId;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.bannedEvent;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.cashOutStatus;
        int iHashCode22 = (iHashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<AdditionMarket> list2 = this.markets;
        int iHashCode23 = (iHashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str12 = this.setScore;
        int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num6 = this.settleStatus;
        int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.isLive;
        int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l2 = this.lastOddsChangeTime;
        int iHashCode27 = (iHashCode26 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d3 = this.currentVoidProbability;
        int iHashCode28 = (iHashCode27 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.originalVoidProbability;
        int iHashCode29 = (iHashCode28 + (d4 == null ? 0 : d4.hashCode())) * 31;
        JokerInfo jokerInfo = this.joker;
        int iHashCode30 = (iHashCode29 + (jokerInfo == null ? 0 : jokerInfo.hashCode())) * 31;
        String str13 = this.source;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d5 = this.deadHeatFactor;
        return iHashCode31 + (d5 != null ? d5.hashCode() : 0);
    }

    public final Boolean isLive() {
        return this.isLive;
    }

    public final Integer isOutcomeActive() {
        return this.isOutcomeActive;
    }

    public final void setJoker(JokerInfo jokerInfo) {
        this.joker = jokerInfo;
    }

    public String toString() {
        String str = this.cashOutSelectionId;
        String str2 = this.cashOutSelectionEventId;
        String str3 = this.sportId;
        Long l = this.product;
        String str4 = this.marketId;
        String str5 = this.specifier;
        String str6 = this.outcomeId;
        Integer num = this.status;
        Integer num2 = this.eventStatus;
        Boolean bool = this.banker;
        String str7 = this.odds;
        String str8 = this.currentOdds;
        Integer num3 = this.marketStatus;
        Integer num4 = this.isOutcomeActive;
        Double d = this.originalProbability;
        Double d2 = this.currentProbability;
        List<String> list = this.subBetIdIndex;
        String str9 = this.subBetId;
        String str10 = this.suspendedReason;
        String str11 = this.tournamentId;
        Boolean bool2 = this.bannedEvent;
        Integer num5 = this.cashOutStatus;
        List<AdditionMarket> list2 = this.markets;
        String str12 = this.setScore;
        Integer num6 = this.settleStatus;
        Boolean bool3 = this.isLive;
        Long l2 = this.lastOddsChangeTime;
        Double d3 = this.currentVoidProbability;
        Double d4 = this.originalVoidProbability;
        JokerInfo jokerInfo = this.joker;
        String str13 = this.source;
        Double d5 = this.deadHeatFactor;
        StringBuilder sbA = ux5.a("CashOutSelection(cashOutSelectionId=", str, ", cashOutSelectionEventId=", str2, ", sportId=");
        sbA.append(str3);
        sbA.append(", product=");
        sbA.append(l);
        sbA.append(", marketId=");
        hxa.c(sbA, str4, ", specifier=", str5, ", outcomeId=");
        oie.a(num, str6, ", status=", ", eventStatus=", sbA);
        sbA.append(num2);
        sbA.append(", banker=");
        sbA.append(bool);
        sbA.append(", odds=");
        hxa.c(sbA, str7, ", currentOdds=", str8, ", marketStatus=");
        cv7.a(sbA, num3, ", isOutcomeActive=", num4, ", originalProbability=");
        s27.a(d, d2, ", currentProbability=", ", subBetIdIndex=", sbA);
        gfs.a(", subBetId=", str9, ", suspendedReason=", sbA, list);
        hxa.c(sbA, str10, ", tournamentId=", str11, ", bannedEvent=");
        sbA.append(bool2);
        sbA.append(", cashOutStatus=");
        sbA.append(num5);
        sbA.append(", markets=");
        gfs.a(", setScore=", str12, ", settleStatus=", sbA, list2);
        sbA.append(num6);
        sbA.append(", isLive=");
        sbA.append(bool3);
        sbA.append(", lastOddsChangeTime=");
        sbA.append(l2);
        sbA.append(", currentVoidProbability=");
        sbA.append(d3);
        sbA.append(", originalVoidProbability=");
        sbA.append(d4);
        sbA.append(", joker=");
        sbA.append(jokerInfo);
        sbA.append(", source=");
        sbA.append(str13);
        sbA.append(", deadHeatFactor=");
        sbA.append(d5);
        sbA.append(")");
        return sbA.toString();
    }

    public CashOutSelection(String str, String str2, String str3, Long l, String str4, String str5, String str6, Integer num, Integer num2, Boolean bool, String str7, String str8, Integer num3, Integer num4, Double d, Double d2, List list, String str9, String str10, String str11, Boolean bool2, Integer num5, List list2, String str12, Integer num6, Boolean bool3, Long l2, Double d3, Double d4, JokerInfo jokerInfo, String str13, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l, str4, str5, str6, num, num2, bool, str7, str8, num3, num4, d, d2, (i & 65536) != 0 ? m2g.a : list, str9, str10, str11, bool2, num5, (i & 4194304) != 0 ? m2g.a : list2, str12, num6, bool3, l2, d3, d4, jokerInfo, str13, d5);
    }
}
