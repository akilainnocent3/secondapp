package com.sportybet.plugin.realsports.data.local;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;
import defpackage.afd;
import defpackage.bfd;
import defpackage.c0d;
import defpackage.d630;
import defpackage.dn20;
import defpackage.ej5;
import defpackage.ejt;
import defpackage.fae;
import defpackage.fse;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.lyh;
import defpackage.odd;
import defpackage.ohp;
import defpackage.oxc;
import defpackage.pfd;
import defpackage.rkd;
import defpackage.sqc;
import defpackage.tqc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vn20;
import defpackage.wm20;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zed;
import defpackage.zn20;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0001\u007fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0011\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0013\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0014\u0010\u000bJ\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0096A¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001fJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b \u0010\u000bJ \u0010 \u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b \u0010\u001aJ6\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0097\u0001¢\u0006\u0004\b \u0010\u001fJ&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b#\u0010$J \u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b#\u0010%J\"\u0010'\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010&H\u0096A¢\u0006\u0004\b'\u0010(J6\u0010'\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0097\u0001¢\u0006\u0004\b'\u0010)J\u001a\u0010*\u001a\u0004\u0018\u00010&2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b*\u0010\u000bJ \u0010*\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020&H\u0096A¢\u0006\u0004\b*\u0010+J&\u0010,\u001a\b\u0012\u0004\u0012\u00020&0\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b,\u0010-J \u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b,\u0010%J\"\u0010/\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010.H\u0096A¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u0004\u0018\u00010.2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b1\u0010\u000bJ \u00101\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020.H\u0096A¢\u0006\u0004\b1\u00102J&\u00103\u001a\b\u0012\u0004\u0012\u00020.0\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b3\u00104J \u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b3\u0010%J\"\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u000105H\u0096A¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u0004\u0018\u0001052\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b8\u0010\u000bJ \u00108\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u000205H\u0096A¢\u0006\u0004\b8\u00109J&\u0010:\u001a\b\u0012\u0004\u0012\u0002050\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u000205H\u0096\u0001¢\u0006\u0004\b:\u0010;J \u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b:\u0010%J\"\u0010=\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010<H\u0096A¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b?\u0010\u000bJ \u0010?\u001a\u00020<2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020<H\u0096A¢\u0006\u0004\b?\u0010@J&\u0010A\u001a\b\u0012\u0004\u0012\u00020<0\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020<H\u0096\u0001¢\u0006\u0004\bA\u0010BJ \u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bA\u0010%J\"\u0010C\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0096A¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\bE\u0010\u000bJ \u0010E\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\u0096A¢\u0006\u0004\bE\u0010\u000fJ6\u0010E\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0097\u0001¢\u0006\u0004\bE\u0010FJ&\u0010H\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0096A¢\u0006\u0004\bH\u0010IJ \u0010J\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010G2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\bJ\u0010\u000bJ2\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070G0\"2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0096\u0001¢\u0006\u0004\bK\u0010LJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0\"2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bM\u0010NJ \u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\"2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bM\u0010%J*\u0010R\u001a\u00020\r\"\n\b\u0000\u0010P*\u0004\u0018\u00010O2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0096A¢\u0006\u0004\bR\u0010SJ\u0018\u0010R\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096A¢\u0006\u0004\bR\u0010\u000bJ\u0010\u0010T\u001a\u00020\rH\u0096A¢\u0006\u0004\bT\u0010\u0017J0\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0\"\"\n\b\u0000\u0010P*\u0004\u0018\u00010O2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0096\u0001¢\u0006\u0004\bU\u0010VJ \u0010X\u001a\u00020\t2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\bX\u0010\u001aJ \u0010Y\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\bY\u0010\u001aJ\u001f\u0010Z\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bZ\u0010[R!\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R!\u0010d\u001a\b\u0012\u0004\u0012\u00020.0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R!\u0010g\u001a\b\u0012\u0004\u0012\u00020\t0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010`R!\u0010i\u001a\b\u0012\u0004\u0012\u00020\t0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`R!\u0010k\u001a\b\u0012\u0004\u0012\u00020\t0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010`R!\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`R!\u0010q\u001a\b\u0012\u0004\u0012\u00020.0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bo\u0010^\u001a\u0004\bp\u0010`R!\u0010t\u001a\b\u0012\u0004\u0012\u00020.0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bs\u0010`R!\u0010v\u001a\b\u0012\u0004\u0012\u00020\t0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bu\u0010^\u001a\u0004\bv\u0010`R!\u0010y\u001a\b\u0012\u0004\u0012\u00020.0\\8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010^\u001a\u0004\bx\u0010`R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020{0z8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0080\u0001"}, d2 = {"Lcom/sportybet/plugin/realsports/data/local/BetSlipDataStore;", "Ldn20;", "Lejt;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "userId", "", "getRetainSelectionsAfterRebet", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "value", "", "setRetainSelectionsAfterRebet", "(Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", "hasUserOverriddenRetainSelections", "markRetainSelectionsUserOverridden", "hasEnteredRebetRemixCombineTest", "markRebetRemixCombineTestEntered", "isRebetRemixCombineVariant", "markRebetRemixCombineVariant", "clearUserData", "(Lv1b;)Ljava/lang/Object;", "key", "putString", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Ltqc;", "callback", "Lv5b;", "scope", "(Ljava/lang/String;Ljava/lang/String;Ltqc;Lv5b;)V", "getString", "defaultValue", "Llyh;", "getStringByFlow", "(Ljava/lang/String;Ljava/lang/String;)Llyh;", "(Ljava/lang/String;)Llyh;", "", "putInt", "(Ljava/lang/String;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "(Ljava/lang/String;ILtqc;Lv5b;)V", "getInt", "(Ljava/lang/String;ILv1b;)Ljava/lang/Object;", "getIntFlow", "(Ljava/lang/String;I)Llyh;", "", "putLong", "(Ljava/lang/String;Ljava/lang/Long;Lv1b;)Ljava/lang/Object;", "getLong", "(Ljava/lang/String;JLv1b;)Ljava/lang/Object;", "getLongByFlow", "(Ljava/lang/String;J)Llyh;", "", "putFloat", "(Ljava/lang/String;Ljava/lang/Float;Lv1b;)Ljava/lang/Object;", "getFloat", "(Ljava/lang/String;FLv1b;)Ljava/lang/Object;", "getFloatByFlow", "(Ljava/lang/String;F)Llyh;", "", "putDouble", "(Ljava/lang/String;Ljava/lang/Double;Lv1b;)Ljava/lang/Object;", "getDouble", "(Ljava/lang/String;DLv1b;)Ljava/lang/Object;", "getDoubleByFlow", "(Ljava/lang/String;D)Llyh;", "putBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;Lv1b;)Ljava/lang/Object;", "getBoolean", "(Ljava/lang/String;ZLtqc;Lv5b;)V", "", "putStringSet", "(Ljava/lang/String;Ljava/util/Set;Lv1b;)Ljava/lang/Object;", "getStringSet", "getStringSetByFlow", "(Ljava/lang/String;Ljava/util/Set;)Llyh;", "getBooleanByFlow", "(Ljava/lang/String;Z)Llyh;", "", "T", "Lzn20$a;", "clearPreference", "(Lzn20$a;Lv1b;)Ljava/lang/Object;", "clearDataStore", "isKeyStored", "(Lzn20$a;)Llyh;", "baseKey", "hasFlag", "markFlag", "userScopedKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lwm20;", "betSlipGiftsJsonString$delegate", "Lrkd;", "getBetSlipGiftsJsonString", "()Lwm20;", "betSlipGiftsJsonString", "betSlipGiftsTimestamp$delegate", "getBetSlipGiftsTimestamp", "betSlipGiftsTimestamp", "betSlipDefaultGift$delegate", "getBetSlipDefaultGift", "betSlipDefaultGift", "isBetslipOddsUpdateCalibrationEnabled$delegate", "isBetslipOddsUpdateCalibrationEnabled", "isBetslipPushOddsUpdateCalibrationEnabled$delegate", "isBetslipPushOddsUpdateCalibrationEnabled", "betSlipMissionJsonString$delegate", "getBetSlipMissionJsonString", "betSlipMissionJsonString", "betSlipMissionTimestamp$delegate", "getBetSlipMissionTimestamp", "betSlipMissionTimestamp", "betSlipMissionReportCount$delegate", "getBetSlipMissionReportCount", "betSlipMissionReportCount", "isAutoBetNotificationDialogSuppressed$delegate", "isAutoBetNotificationDialogSuppressed", "rebetRemixStep2TimestampMillis$delegate", "getRebetRemixStep2TimestampMillis", "rebetRemixStep2TimestampMillis", "Lsqc;", "Lzn20;", "getDataStore", "()Lsqc;", "dataStore", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetSlipDataStore implements dn20, ejt {
    public static final String KEY_AUTO_BET_NOTIFICATION_DIALOG_SUPPRESSED_KEY = "key_auto_bet_notification_dialog_suppressed";
    public static final String KEY_BETSLIP_DEFAULT_GIFT = "key_betslip_default_gift";
    public static final String KEY_BETSLIP_GIFTS = "key_betslip_gifts";
    public static final String KEY_BETSLIP_GIFTS_TIMESTAMP = "key_betslip_gifts_timestamp";
    public static final String KEY_BETSLIP_MISSION = "key_betslip_mission_v4";
    public static final String KEY_BETSLIP_MISSION_REPORT_COUNT = "key_betslip_mission_report_count";
    public static final String KEY_BETSLIP_MISSION_TIMESTAMP = "key_betslip_mission_timestamp_v4";
    public static final String KEY_BETSLIP_ODDS_UPDATE_CALIBRATION_ENABLED = "key_odds_update_calibration_enabled";
    public static final String KEY_BETSLIP_PUSH_ODDS_UPDATE_CALIBRATION_ENABLED = "key_betslip_push_odds_update_calibration_enabled";
    public static final String KEY_REBET_REMIX_COMBINE_IS_VARIANT = "key_rebet_remix_combine_is_variant";
    public static final String KEY_REBET_REMIX_COMBINE_TEST_ENTERED = "key_rebet_remix_combine_test_entered";
    public static final String KEY_REBET_REMIX_STEP2_TIMESTAMP = "key_rebet_remix_step2_timestamp";
    public static final String KEY_RETAIN_SELECTIONS_AFTER_REBET = "key_retain_selections_after_rebet";
    public static final String KEY_RETAIN_SELECTIONS_USER_OVERRIDDEN = "key_retain_selections_user_overridden";
    private final /* synthetic */ zed $$delegate_0;

    /* JADX INFO: renamed from: betSlipDefaultGift$delegate, reason: from kotlin metadata */
    private final rkd betSlipDefaultGift;

    /* JADX INFO: renamed from: betSlipGiftsJsonString$delegate, reason: from kotlin metadata */
    private final rkd betSlipGiftsJsonString;

    /* JADX INFO: renamed from: betSlipGiftsTimestamp$delegate, reason: from kotlin metadata */
    private final rkd betSlipGiftsTimestamp;

    /* JADX INFO: renamed from: betSlipMissionJsonString$delegate, reason: from kotlin metadata */
    private final rkd betSlipMissionJsonString;

    /* JADX INFO: renamed from: betSlipMissionReportCount$delegate, reason: from kotlin metadata */
    private final rkd betSlipMissionReportCount;

    /* JADX INFO: renamed from: betSlipMissionTimestamp$delegate, reason: from kotlin metadata */
    private final rkd betSlipMissionTimestamp;

    /* JADX INFO: renamed from: isAutoBetNotificationDialogSuppressed$delegate, reason: from kotlin metadata */
    private final rkd isAutoBetNotificationDialogSuppressed;

    /* JADX INFO: renamed from: isBetslipOddsUpdateCalibrationEnabled$delegate, reason: from kotlin metadata */
    private final rkd isBetslipOddsUpdateCalibrationEnabled;

    /* JADX INFO: renamed from: isBetslipPushOddsUpdateCalibrationEnabled$delegate, reason: from kotlin metadata */
    private final rkd isBetslipPushOddsUpdateCalibrationEnabled;

    /* JADX INFO: renamed from: rebetRemixStep2TimestampMillis$delegate, reason: from kotlin metadata */
    private final rkd rebetRemixStep2TimestampMillis;
    static final /* synthetic */ ohp<Object>[] $$delegatedProperties = {new d630(0, BetSlipDataStore.class, "betSlipGiftsJsonString", "getBetSlipGiftsJsonString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "betSlipGiftsTimestamp", "getBetSlipGiftsTimestamp()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "betSlipDefaultGift", "getBetSlipDefaultGift()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "isBetslipOddsUpdateCalibrationEnabled", "isBetslipOddsUpdateCalibrationEnabled()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "isBetslipPushOddsUpdateCalibrationEnabled", "isBetslipPushOddsUpdateCalibrationEnabled()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "betSlipMissionJsonString", "getBetSlipMissionJsonString()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "betSlipMissionTimestamp", "getBetSlipMissionTimestamp()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "betSlipMissionReportCount", "getBetSlipMissionReportCount()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "isAutoBetNotificationDialogSuppressed", "isAutoBetNotificationDialogSuppressed()Lcom/sportybet/core/datastore/Preference;"), new d630(0, BetSlipDataStore.class, "rebetRemixStep2TimestampMillis", "getRebetRemixStep2TimestampMillis()Lcom/sportybet/core/datastore/Preference;")};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/data/local/BetSlipDataStore$Companion;", "", "<init>", "()V", "KEY_BETSLIP_GIFTS", "", "KEY_BETSLIP_GIFTS_TIMESTAMP", "KEY_BETSLIP_DEFAULT_GIFT", "KEY_BETSLIP_ODDS_UPDATE_CALIBRATION_ENABLED", "KEY_BETSLIP_PUSH_ODDS_UPDATE_CALIBRATION_ENABLED", "KEY_BETSLIP_MISSION", "KEY_BETSLIP_MISSION_TIMESTAMP", "KEY_BETSLIP_MISSION_REPORT_COUNT", "KEY_AUTO_BET_NOTIFICATION_DIALOG_SUPPRESSED_KEY", "KEY_RETAIN_SELECTIONS_AFTER_REBET", "KEY_RETAIN_SELECTIONS_USER_OVERRIDDEN", "KEY_REBET_REMIX_STEP2_TIMESTAMP", "KEY_REBET_REMIX_COMBINE_TEST_ENTERED", "KEY_REBET_REMIX_COMBINE_IS_VARIANT", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.local.BetSlipDataStore$clearUserData$1, reason: invalid class name */
    @c0d(c = "com.sportybet.plugin.realsports.data.local.BetSlipDataStore", f = "BetSlipDataStore.kt", l = {89, 90, 91, 92, 93}, m = "clearUserData", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass1 extends x1b {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BetSlipDataStore.this.clearUserData(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.local.BetSlipDataStore$getRetainSelectionsAfterRebet$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.plugin.realsports.data.local.BetSlipDataStore", f = "BetSlipDataStore.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 47}, m = "getRetainSelectionsAfterRebet", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14551 extends x1b {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C14551(v1b<? super C14551> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BetSlipDataStore.this.getRetainSelectionsAfterRebet(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.local.BetSlipDataStore$hasFlag$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.plugin.realsports.data.local.BetSlipDataStore", f = "BetSlipDataStore.kt", l = {80}, m = "hasFlag", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14561 extends x1b {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14561(v1b<? super C14561> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BetSlipDataStore.this.hasFlag(null, null, this);
        }
    }

    public BetSlipDataStore(Context context) {
        context.getClass();
        this.$$delegate_0 = new zed(BetSlipDataStoreKt.getBetSlipDataStore(context));
        this.betSlipGiftsJsonString = new rkd(KEY_BETSLIP_GIFTS, jq40.a(String.class), this);
        this.betSlipGiftsTimestamp = new rkd(KEY_BETSLIP_GIFTS_TIMESTAMP, jq40.a(Long.class), this);
        this.betSlipDefaultGift = new rkd(KEY_BETSLIP_DEFAULT_GIFT, jq40.a(Boolean.class), this);
        this.isBetslipOddsUpdateCalibrationEnabled = new rkd(KEY_BETSLIP_ODDS_UPDATE_CALIBRATION_ENABLED, jq40.a(Boolean.class), this);
        this.isBetslipPushOddsUpdateCalibrationEnabled = new rkd(KEY_BETSLIP_PUSH_ODDS_UPDATE_CALIBRATION_ENABLED, jq40.a(Boolean.class), this);
        this.betSlipMissionJsonString = new rkd(KEY_BETSLIP_MISSION, jq40.a(String.class), this);
        this.betSlipMissionTimestamp = new rkd(KEY_BETSLIP_MISSION_TIMESTAMP, jq40.a(Long.class), this);
        this.betSlipMissionReportCount = new rkd(KEY_BETSLIP_MISSION_REPORT_COUNT, jq40.a(Long.class), this);
        this.isAutoBetNotificationDialogSuppressed = new rkd(KEY_AUTO_BET_NOTIFICATION_DIALOG_SUPPRESSED_KEY, jq40.a(Boolean.class), this);
        this.rebetRemixStep2TimestampMillis = new rkd(KEY_REBET_REMIX_STEP2_TIMESTAMP, jq40.a(Long.class), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object hasFlag(String str, String str2, v1b<? super Boolean> v1bVar) {
        C14561 c14561;
        if (v1bVar instanceof C14561) {
            c14561 = (C14561) v1bVar;
            int i = c14561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14561.label = i - Integer.MIN_VALUE;
            } else {
                c14561 = new C14561(v1bVar);
            }
        } else {
            c14561 = new C14561(v1bVar);
        }
        Object obj = c14561.result;
        Object obj2 = y5b.a;
        int i2 = c14561.label;
        if (i2 == 0) {
            uj50.b(obj);
            String strUserScopedKey = userScopedKey(str, str2);
            c14561.L$0 = null;
            c14561.L$1 = null;
            c14561.label = 1;
            obj = getBoolean(strUserScopedKey, c14561);
            if (obj == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Boolean bool = (Boolean) obj;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object markFlag(String str, String str2, v1b<? super Unit> v1bVar) {
        return putBoolean(userScopedKey(str, str2), Boolean.TRUE, v1bVar);
    }

    private final String userScopedKey(String baseKey, String userId) {
        return oxc.a(baseKey, ":", userId);
    }

    public Object clearDataStore(v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.a(v1bVar);
    }

    @Override // defpackage.dn20
    public <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.clearPreference(aVar, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ejt
    public Object clearUserData(v1b<? super Unit> v1bVar) {
        AnonymousClass1 anonymousClass1;
        wm20<String> betSlipGiftsJsonString;
        wm20<Long> betSlipGiftsTimestamp;
        Object objA;
        if (v1bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) v1bVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(v1bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(v1bVar);
        }
        Object obj = anonymousClass1.result;
        y5b y5bVar = y5b.a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            uj50.b(obj);
            wm20<Long> betSlipMissionTimestamp = getBetSlipMissionTimestamp();
            anonymousClass1.label = 1;
            if (betSlipMissionTimestamp.a(anonymousClass1) != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj);
        } else {
            if (i2 == 2) {
                uj50.b(obj);
                betSlipGiftsJsonString = getBetSlipGiftsJsonString();
                anonymousClass1.label = 3;
                if (betSlipGiftsJsonString.a(anonymousClass1) != y5bVar) {
                    betSlipGiftsTimestamp = getBetSlipGiftsTimestamp();
                    anonymousClass1.label = 4;
                    if (betSlipGiftsTimestamp.a(anonymousClass1) != y5bVar) {
                    }
                }
                return y5bVar;
            }
            if (i2 == 3) {
                uj50.b(obj);
                betSlipGiftsTimestamp = getBetSlipGiftsTimestamp();
                anonymousClass1.label = 4;
                if (betSlipGiftsTimestamp.a(anonymousClass1) != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wm20<Boolean> betSlipDefaultGift = getBetSlipDefaultGift();
        anonymousClass1.label = 5;
        objA = betSlipDefaultGift.a(anonymousClass1);
        if (objA != y5bVar) {
            return y5bVar;
        }
        return objA;
        wm20<String> betSlipMissionJsonString = getBetSlipMissionJsonString();
        anonymousClass1.label = 2;
        if (betSlipMissionJsonString.a(anonymousClass1) != y5bVar) {
            betSlipGiftsJsonString = getBetSlipGiftsJsonString();
            anonymousClass1.label = 3;
            if (betSlipGiftsJsonString.a(anonymousClass1) != y5bVar) {
                betSlipGiftsTimestamp = getBetSlipGiftsTimestamp();
                anonymousClass1.label = 4;
                if (betSlipGiftsTimestamp.a(anonymousClass1) != y5bVar) {
                    wm20<Boolean> betSlipDefaultGift2 = getBetSlipDefaultGift();
                    anonymousClass1.label = 5;
                    objA = betSlipDefaultGift2.a(anonymousClass1);
                    if (objA != y5bVar) {
                        return objA;
                    }
                }
            }
        }
        return y5bVar;
    }

    public final wm20<Boolean> getBetSlipDefaultGift() {
        return this.betSlipDefaultGift.a(this, $$delegatedProperties[2]);
    }

    public final wm20<String> getBetSlipGiftsJsonString() {
        return this.betSlipGiftsJsonString.a(this, $$delegatedProperties[0]);
    }

    public final wm20<Long> getBetSlipGiftsTimestamp() {
        return this.betSlipGiftsTimestamp.a(this, $$delegatedProperties[1]);
    }

    public final wm20<String> getBetSlipMissionJsonString() {
        return this.betSlipMissionJsonString.a(this, $$delegatedProperties[5]);
    }

    public final wm20<Long> getBetSlipMissionReportCount() {
        return this.betSlipMissionReportCount.a(this, $$delegatedProperties[7]);
    }

    public final wm20<Long> getBetSlipMissionTimestamp() {
        return this.betSlipMissionTimestamp.a(this, $$delegatedProperties[6]);
    }

    @fae
    public void getBoolean(String key, boolean defaultValue, tqc<Boolean> callback, v5b scope) {
        key.getClass();
        callback.getClass();
        scope.getClass();
        zed zedVar = this.$$delegate_0;
        zedVar.getClass();
        pfd pfdVar = fse.a;
        ej5.c(scope, odd.b, null, new afd(zedVar, key, defaultValue, callback, null), 2);
    }

    @Override // defpackage.dn20
    public lyh<Boolean> getBooleanByFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getBooleanByFlow(key);
    }

    public sqc<zn20> getDataStore() {
        return this.$$delegate_0.a;
    }

    @Override // defpackage.dn20
    public Object getDouble(String str, double d, v1b<? super Double> v1bVar) {
        return this.$$delegate_0.getDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public lyh<Double> getDoubleByFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getDoubleByFlow(key);
    }

    @Override // defpackage.dn20
    public Object getFloat(String str, float f, v1b<? super Float> v1bVar) {
        return this.$$delegate_0.getFloat(str, f, v1bVar);
    }

    @Override // defpackage.dn20
    public lyh<Float> getFloatByFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getFloatByFlow(key);
    }

    @Override // defpackage.dn20
    public Object getInt(String str, int i, v1b<? super Integer> v1bVar) {
        return this.$$delegate_0.getInt(str, i, v1bVar);
    }

    @Override // defpackage.dn20
    public lyh<Integer> getIntFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getIntFlow(key);
    }

    @Override // defpackage.dn20
    public Object getLong(String str, long j, v1b<? super Long> v1bVar) {
        return this.$$delegate_0.getLong(str, j, v1bVar);
    }

    @Override // defpackage.dn20
    public lyh<Long> getLongByFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getLongByFlow(key);
    }

    public final wm20<Long> getRebetRemixStep2TimestampMillis() {
        return this.rebetRemixStep2TimestampMillis.a(this, $$delegatedProperties[9]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getRetainSelectionsAfterRebet(String str, v1b<? super Boolean> v1bVar) {
        C14551 c14551;
        String strUserScopedKey;
        Object obj;
        boolean z;
        if (v1bVar instanceof C14551) {
            c14551 = (C14551) v1bVar;
            int i = c14551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14551.label = i - Integer.MIN_VALUE;
            } else {
                c14551 = new C14551(v1bVar);
            }
        } else {
            c14551 = new C14551(v1bVar);
        }
        Object obj2 = c14551.result;
        Object obj3 = y5b.a;
        int i2 = c14551.label;
        if (i2 == 0) {
            uj50.b(obj2);
            strUserScopedKey = userScopedKey(KEY_RETAIN_SELECTIONS_AFTER_REBET, str);
            c14551.L$0 = str;
            c14551.L$1 = strUserScopedKey;
            c14551.label = 1;
            obj = getBoolean(strUserScopedKey, c14551);
            if (obj != obj3) {
            }
            return obj3;
        }
        if (i2 == 1) {
            String str2 = (String) c14551.L$1;
            String str3 = (String) c14551.L$0;
            uj50.b(obj2);
            strUserScopedKey = str2;
            str = str3;
            obj = obj2;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c14551.Z$0;
            uj50.b(obj2);
        }
        return Boolean.valueOf(z);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return Boolean.valueOf(bool.booleanValue());
        }
        boolean zC = vn20.c("retain_selections", str, false);
        Boolean boolValueOf = Boolean.valueOf(zC);
        c14551.L$0 = null;
        c14551.L$1 = null;
        c14551.Z$0 = zC;
        c14551.label = 2;
        if (putBoolean(strUserScopedKey, boolValueOf, c14551) != obj3) {
            z = zC;
            return Boolean.valueOf(z);
        }
        return obj3;
    }

    @fae
    public void getString(String key, String defaultValue, tqc<String> callback, v5b scope) {
        key.getClass();
        defaultValue.getClass();
        callback.getClass();
        scope.getClass();
        this.$$delegate_0.c(key, defaultValue, callback, scope);
    }

    @Override // defpackage.dn20
    public lyh<String> getStringByFlow(String key, String defaultValue) {
        key.getClass();
        defaultValue.getClass();
        return this.$$delegate_0.getStringByFlow(key, defaultValue);
    }

    public Object getStringSet(String str, v1b<? super Set<String>> v1bVar) {
        return this.$$delegate_0.d(str, v1bVar);
    }

    public lyh<Set<String>> getStringSetByFlow(String key, Set<String> defaultValue) {
        key.getClass();
        defaultValue.getClass();
        return this.$$delegate_0.e(key, defaultValue);
    }

    public final Object hasEnteredRebetRemixCombineTest(String str, v1b<? super Boolean> v1bVar) {
        return hasFlag(KEY_REBET_REMIX_COMBINE_TEST_ENTERED, str, v1bVar);
    }

    public final Object hasUserOverriddenRetainSelections(String str, v1b<? super Boolean> v1bVar) {
        return hasFlag(KEY_RETAIN_SELECTIONS_USER_OVERRIDDEN, str, v1bVar);
    }

    public final wm20<Boolean> isAutoBetNotificationDialogSuppressed() {
        return this.isAutoBetNotificationDialogSuppressed.a(this, $$delegatedProperties[8]);
    }

    public final wm20<Boolean> isBetslipOddsUpdateCalibrationEnabled() {
        return this.isBetslipOddsUpdateCalibrationEnabled.a(this, $$delegatedProperties[3]);
    }

    public final wm20<Boolean> isBetslipPushOddsUpdateCalibrationEnabled() {
        return this.isBetslipPushOddsUpdateCalibrationEnabled.a(this, $$delegatedProperties[4]);
    }

    public <T> lyh<Boolean> isKeyStored(zn20.a<T> key) {
        key.getClass();
        return this.$$delegate_0.g(key);
    }

    public final Object isRebetRemixCombineVariant(String str, v1b<? super Boolean> v1bVar) {
        return hasFlag(KEY_REBET_REMIX_COMBINE_IS_VARIANT, str, v1bVar);
    }

    public final Object markRebetRemixCombineTestEntered(String str, v1b<? super Unit> v1bVar) {
        return markFlag(KEY_REBET_REMIX_COMBINE_TEST_ENTERED, str, v1bVar);
    }

    public final Object markRebetRemixCombineVariant(String str, v1b<? super Unit> v1bVar) {
        return markFlag(KEY_REBET_REMIX_COMBINE_IS_VARIANT, str, v1bVar);
    }

    public final Object markRetainSelectionsUserOverridden(String str, v1b<? super Unit> v1bVar) {
        return markFlag(KEY_RETAIN_SELECTIONS_USER_OVERRIDDEN, str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object putBoolean(String str, Boolean bool, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putBoolean(str, bool, v1bVar);
    }

    @Override // defpackage.dn20
    public Object putDouble(String str, Double d, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putDouble(str, d, v1bVar);
    }

    @Override // defpackage.dn20
    public Object putFloat(String str, Float f, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putFloat(str, f, v1bVar);
    }

    @fae
    public void putInt(String key, int value, tqc<Integer> callback, v5b scope) {
        key.getClass();
        callback.getClass();
        scope.getClass();
        zed zedVar = this.$$delegate_0;
        zedVar.getClass();
        pfd pfdVar = fse.a;
        ej5.c(scope, odd.b, null, new bfd(zedVar, key, value, callback, null), 2);
    }

    @Override // defpackage.dn20
    public Object putLong(String str, Long l, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putLong(str, l, v1bVar);
    }

    @fae
    public void putString(String key, String value, tqc<String> callback, v5b scope) {
        key.getClass();
        value.getClass();
        callback.getClass();
        scope.getClass();
        this.$$delegate_0.h(key, value, callback, scope);
    }

    public Object putStringSet(String str, Set<String> set, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.i(str, set, v1bVar);
    }

    public final Object setRetainSelectionsAfterRebet(String str, boolean z, v1b<? super Unit> v1bVar) {
        return putBoolean(userScopedKey(KEY_RETAIN_SELECTIONS_AFTER_REBET, str), Boolean.valueOf(z), v1bVar);
    }

    public Object clearPreference(String str, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.b(str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getDouble(String str, v1b<? super Double> v1bVar) {
        return this.$$delegate_0.getDouble(str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getFloat(String str, v1b<? super Float> v1bVar) {
        return this.$$delegate_0.getFloat(str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getInt(String str, v1b<? super Integer> v1bVar) {
        return this.$$delegate_0.getInt(str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getLong(String str, v1b<? super Long> v1bVar) {
        return this.$$delegate_0.getLong(str, v1bVar);
    }

    @Override // defpackage.dn20
    public lyh<Boolean> getBooleanByFlow(String key, boolean defaultValue) {
        key.getClass();
        return this.$$delegate_0.getBooleanByFlow(key, defaultValue);
    }

    @Override // defpackage.dn20
    public lyh<Double> getDoubleByFlow(String key, double defaultValue) {
        key.getClass();
        return this.$$delegate_0.getDoubleByFlow(key, defaultValue);
    }

    @Override // defpackage.dn20
    public lyh<Float> getFloatByFlow(String key, float defaultValue) {
        key.getClass();
        return this.$$delegate_0.getFloatByFlow(key, defaultValue);
    }

    @Override // defpackage.dn20
    public lyh<Integer> getIntFlow(String key, int defaultValue) {
        key.getClass();
        return this.$$delegate_0.getIntFlow(key, defaultValue);
    }

    @Override // defpackage.dn20
    public lyh<Long> getLongByFlow(String key, long defaultValue) {
        key.getClass();
        return this.$$delegate_0.getLongByFlow(key, defaultValue);
    }

    @Override // defpackage.dn20
    public lyh<String> getStringByFlow(String key) {
        key.getClass();
        return this.$$delegate_0.getStringByFlow(key);
    }

    @Override // defpackage.dn20
    public Object getString(String str, String str2, v1b<? super String> v1bVar) {
        return this.$$delegate_0.getString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public Object putString(String str, String str2, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putString(str, str2, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getString(String str, v1b<? super String> v1bVar) {
        return this.$$delegate_0.getString(str, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getBoolean(String str, boolean z, v1b<? super Boolean> v1bVar) {
        return this.$$delegate_0.getBoolean(str, z, v1bVar);
    }

    @Override // defpackage.dn20
    public Object putInt(String str, Integer num, v1b<? super Unit> v1bVar) {
        return this.$$delegate_0.putInt(str, num, v1bVar);
    }

    @Override // defpackage.dn20
    public Object getBoolean(String str, v1b<? super Boolean> v1bVar) {
        return this.$$delegate_0.getBoolean(str, v1bVar);
    }
}
