package com.sporty.android.core.model.orders;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.w03;
import defpackage.x03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bc\b\u0086\b\u0018\u00002\u00020\u0001Bÿ\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010NJ\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0002\u0010_J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010?J\u0012\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0088\u0004\u0010\u0094\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102HÆ\u0001¢\u0006\u0003\u0010\u0095\u0001J\u0016\u0010\u0096\u0001\u001a\u00020\u00182\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\u000b\u0010\u0098\u0001\u001a\u00020\nHÖ\u0081\u0004J\u000b\u0010\u0099\u0001\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R)\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\bG\u00106R'\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R'\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R'\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R'\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R'\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R)\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0017¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR)\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0019¢\u0006\n\n\u0002\u0010O\u001a\u0004\bP\u0010NR)\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001a¢\u0006\n\n\u0002\u0010@\u001a\u0004\bQ\u0010?R)\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001b¢\u0006\n\n\u0002\u0010@\u001a\u0004\bR\u0010?R'\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c¢\u0006\b\n\u0000\u001a\u0004\bS\u00106R)\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u0010@\u001a\u0004\bT\u0010?R)\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001e¢\u0006\n\n\u0002\u0010O\u001a\u0004\bU\u0010NR)\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001f¢\u0006\n\n\u0002\u0010O\u001a\u0004\bV\u0010NR'\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b( ¢\u0006\b\n\u0000\u001a\u0004\bW\u00106R'\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(!¢\u0006\b\n\u0000\u001a\u0004\bX\u00106R'\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(\"¢\u0006\b\n\u0000\u001a\u0004\bY\u00106R-\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(#¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R'\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b\\\u00106R'\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(&¢\u0006\b\n\u0000\u001a\u0004\b]\u00106R)\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b('¢\u0006\n\n\u0002\u0010`\u001a\u0004\b^\u0010_R)\u0010)\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b()¢\u0006\n\n\u0002\u0010O\u001a\u0004\ba\u0010NR)\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(*¢\u0006\n\n\u0002\u0010@\u001a\u0004\bb\u0010?R'\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(+¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR)\u0010-\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(-¢\u0006\n\n\u0002\u0010@\u001a\u0004\be\u0010?R-\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$8\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(.¢\u0006\b\n\u0000\u001a\u0004\bf\u0010[R'\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(/¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR'\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004\u0092\u0002\f\b7\u0012\b\b8\u0012\u0004\b\b(1¢\u0006\b\n\u0000\u001a\u0004\bi\u0010j¨\u0006\u009a\u0001"}, d2 = {"Lcom/sporty/android/core/model/orders/BetTicketSelection;", "", AnalyticsParam.EVENT_PARAM_ID, "", "home", "away", "jointId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "sportId", "product", "", "gameId", "marketId", "marketDesc", "specifier", "outcomeId", "outcomeName", "outcomeDesc", "categoryId", "categoryName", "tournamentId", "tournamentName", "odds", "oddsBoosted", "", "oddsBoostLfb", AnalyticsParam.EVENT_PARAM_RESULT, AnalyticsParam.EVENT_STATUS, "matchStatus", "eventStatus", "banker", "haveLive", "period", "playedSeconds", "remainingTimeInPeriod", "gameScore", "", "setScore", "pointScore", "startTime", "", "matchTrackerNotAllowed", "commentsNum", "eventSource", "Lcom/sporty/android/core/model/orders/BetEventSource;", "settleType", "betBuilderSelections", "joker", "Lcom/sporty/android/core/model/orders/JokerInfo;", "eventPendingReason", "Lcom/sporty/android/core/model/orders/EventPendingReason;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sporty/android/core/model/orders/BetEventSource;Ljava/lang/Integer;Ljava/util/List;Lcom/sporty/android/core/model/orders/JokerInfo;Lcom/sporty/android/core/model/orders/EventPendingReason;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHome", "getAway", "getJointId", "getEventId", "getSportId", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGameId", "getMarketId", "getMarketDesc", "getSpecifier", "getOutcomeId", "getOutcomeName", "getOutcomeDesc", "getCategoryId", "getCategoryName", "getTournamentId", "getTournamentName", "getOdds", "getOddsBoosted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOddsBoostLfb", "getResult", "getStatus", "getMatchStatus", "getEventStatus", "getBanker", "getHaveLive", "getPeriod", "getPlayedSeconds", "getRemainingTimeInPeriod", "getGameScore", "()Ljava/util/List;", "getSetScore", "getPointScore", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMatchTrackerNotAllowed", "getCommentsNum", "getEventSource", "()Lcom/sporty/android/core/model/orders/BetEventSource;", "getSettleType", "getBetBuilderSelections", "getJoker", "()Lcom/sporty/android/core/model/orders/JokerInfo;", "getEventPendingReason", "()Lcom/sporty/android/core/model/orders/EventPendingReason;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sporty/android/core/model/orders/BetEventSource;Ljava/lang/Integer;Ljava/util/List;Lcom/sporty/android/core/model/orders/JokerInfo;Lcom/sporty/android/core/model/orders/EventPendingReason;)Lcom/sporty/android/core/model/orders/BetTicketSelection;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTicketSelection {

    @SerializedName("away")
    private final String away;

    @SerializedName("banker")
    private final Boolean banker;

    @SerializedName("betBuilderSelections")
    private final List<BetTicketSelection> betBuilderSelections;

    @SerializedName("categoryId")
    private final String categoryId;

    @SerializedName("categoryName")
    private final String categoryName;

    @SerializedName("commentsNum")
    private final Integer commentsNum;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("eventPendingReason")
    private final EventPendingReason eventPendingReason;

    @SerializedName("eventSource")
    private final BetEventSource eventSource;

    @SerializedName("eventStatus")
    private final Integer eventStatus;

    @SerializedName("gameId")
    private final String gameId;

    @SerializedName("gameScore")
    private final List<String> gameScore;

    @SerializedName("haveLive")
    private final Boolean haveLive;

    @SerializedName("home")
    private final String home;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("jointId")
    private final String jointId;

    @SerializedName("joker")
    private final JokerInfo joker;

    @SerializedName("marketDesc")
    private final String marketDesc;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("matchStatus")
    private final String matchStatus;

    @SerializedName("matchTrackerNotAllowed")
    private final Boolean matchTrackerNotAllowed;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("oddsBoostLfb")
    private final Boolean oddsBoostLfb;

    @SerializedName("oddsBoosted")
    private final Boolean oddsBoosted;

    @SerializedName("outcomeDesc")
    private final String outcomeDesc;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("outcomeName")
    private final String outcomeName;

    @SerializedName("period")
    private final String period;

    @SerializedName("playedSeconds")
    private final String playedSeconds;

    @SerializedName("pointScore")
    private final String pointScore;

    @SerializedName("product")
    private final Integer product;

    @SerializedName("remainingTimeInPeriod")
    private final String remainingTimeInPeriod;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    private final Integer result;

    @SerializedName("setScore")
    private final String setScore;

    @SerializedName("settleType")
    private final Integer settleType;

    @SerializedName("specifier")
    private final String specifier;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("startTime")
    private final Long startTime;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    @SerializedName("tournamentId")
    private final String tournamentId;

    @SerializedName("tournamentName")
    private final String tournamentName;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BetTicketSelection(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Integer num2, Integer num3, String str19, Integer num4, Boolean bool3, Boolean bool4, String str20, String str21, String str22, List list, String str23, String str24, Long l, Boolean bool5, Integer num5, BetEventSource betEventSource, Integer num6, List list2, JokerInfo jokerInfo, EventPendingReason eventPendingReason, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str25 = (i & 1) != 0 ? null : str;
        this(str25, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : bool, (i & 1048576) != 0 ? null : bool2, (i & 2097152) != 0 ? null : num2, (i & 4194304) != 0 ? null : num3, (i & 8388608) != 0 ? null : str19, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num4, (i & 33554432) != 0 ? null : bool3, (i & 67108864) != 0 ? null : bool4, (i & 134217728) != 0 ? null : str20, (i & 268435456) != 0 ? null : str21, (i & 536870912) != 0 ? null : str22, (i & 1073741824) != 0 ? null : list, (i & Integer.MIN_VALUE) != 0 ? null : str23, (i2 & 1) != 0 ? null : str24, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : bool5, (i2 & 8) != 0 ? null : num5, (i2 & 16) != 0 ? null : betEventSource, (i2 & 32) != 0 ? null : num6, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : jokerInfo, (i2 & 256) != 0 ? null : eventPendingReason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMarketDesc() {
        return this.marketDesc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOutcomeName() {
        return this.outcomeName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getOddsBoosted() {
        return this.oddsBoosted;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getOddsBoostLfb() {
        return this.oddsBoostLfb;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMatchStatus() {
        return this.matchStatus;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getBanker() {
        return this.banker;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getHaveLive() {
        return this.haveLive;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPlayedSeconds() {
        return this.playedSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAway() {
        return this.away;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getRemainingTimeInPeriod() {
        return this.remainingTimeInPeriod;
    }

    public final List<String> component31() {
        return this.gameScore;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSetScore() {
        return this.setScore;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPointScore() {
        return this.pointScore;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getCommentsNum() {
        return this.commentsNum;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BetEventSource getEventSource() {
        return this.eventSource;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getSettleType() {
        return this.settleType;
    }

    public final List<BetTicketSelection> component39() {
        return this.betBuilderSelections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJointId() {
        return this.jointId;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final JokerInfo getJoker() {
        return this.joker;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final EventPendingReason getEventPendingReason() {
        return this.eventPendingReason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    public final BetTicketSelection copy(String id, String home, String away, String jointId, String eventId, String sportId, Integer product, String gameId, String marketId, String marketDesc, String specifier, String outcomeId, String outcomeName, String outcomeDesc, String categoryId, String categoryName, String tournamentId, String tournamentName, String odds, Boolean oddsBoosted, Boolean oddsBoostLfb, Integer result, Integer status, String matchStatus, Integer eventStatus, Boolean banker, Boolean haveLive, String period, String playedSeconds, String remainingTimeInPeriod, List<String> gameScore, String setScore, String pointScore, Long startTime, Boolean matchTrackerNotAllowed, Integer commentsNum, BetEventSource eventSource, Integer settleType, List<BetTicketSelection> betBuilderSelections, JokerInfo joker, EventPendingReason eventPendingReason) {
        return new BetTicketSelection(id, home, away, jointId, eventId, sportId, product, gameId, marketId, marketDesc, specifier, outcomeId, outcomeName, outcomeDesc, categoryId, categoryName, tournamentId, tournamentName, odds, oddsBoosted, oddsBoostLfb, result, status, matchStatus, eventStatus, banker, haveLive, period, playedSeconds, remainingTimeInPeriod, gameScore, setScore, pointScore, startTime, matchTrackerNotAllowed, commentsNum, eventSource, settleType, betBuilderSelections, joker, eventPendingReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTicketSelection)) {
            return false;
        }
        BetTicketSelection betTicketSelection = (BetTicketSelection) other;
        return Intrinsics.g(this.id, betTicketSelection.id) && Intrinsics.g(this.home, betTicketSelection.home) && Intrinsics.g(this.away, betTicketSelection.away) && Intrinsics.g(this.jointId, betTicketSelection.jointId) && Intrinsics.g(this.eventId, betTicketSelection.eventId) && Intrinsics.g(this.sportId, betTicketSelection.sportId) && Intrinsics.g(this.product, betTicketSelection.product) && Intrinsics.g(this.gameId, betTicketSelection.gameId) && Intrinsics.g(this.marketId, betTicketSelection.marketId) && Intrinsics.g(this.marketDesc, betTicketSelection.marketDesc) && Intrinsics.g(this.specifier, betTicketSelection.specifier) && Intrinsics.g(this.outcomeId, betTicketSelection.outcomeId) && Intrinsics.g(this.outcomeName, betTicketSelection.outcomeName) && Intrinsics.g(this.outcomeDesc, betTicketSelection.outcomeDesc) && Intrinsics.g(this.categoryId, betTicketSelection.categoryId) && Intrinsics.g(this.categoryName, betTicketSelection.categoryName) && Intrinsics.g(this.tournamentId, betTicketSelection.tournamentId) && Intrinsics.g(this.tournamentName, betTicketSelection.tournamentName) && Intrinsics.g(this.odds, betTicketSelection.odds) && Intrinsics.g(this.oddsBoosted, betTicketSelection.oddsBoosted) && Intrinsics.g(this.oddsBoostLfb, betTicketSelection.oddsBoostLfb) && Intrinsics.g(this.result, betTicketSelection.result) && Intrinsics.g(this.status, betTicketSelection.status) && Intrinsics.g(this.matchStatus, betTicketSelection.matchStatus) && Intrinsics.g(this.eventStatus, betTicketSelection.eventStatus) && Intrinsics.g(this.banker, betTicketSelection.banker) && Intrinsics.g(this.haveLive, betTicketSelection.haveLive) && Intrinsics.g(this.period, betTicketSelection.period) && Intrinsics.g(this.playedSeconds, betTicketSelection.playedSeconds) && Intrinsics.g(this.remainingTimeInPeriod, betTicketSelection.remainingTimeInPeriod) && Intrinsics.g(this.gameScore, betTicketSelection.gameScore) && Intrinsics.g(this.setScore, betTicketSelection.setScore) && Intrinsics.g(this.pointScore, betTicketSelection.pointScore) && Intrinsics.g(this.startTime, betTicketSelection.startTime) && Intrinsics.g(this.matchTrackerNotAllowed, betTicketSelection.matchTrackerNotAllowed) && Intrinsics.g(this.commentsNum, betTicketSelection.commentsNum) && Intrinsics.g(this.eventSource, betTicketSelection.eventSource) && Intrinsics.g(this.settleType, betTicketSelection.settleType) && Intrinsics.g(this.betBuilderSelections, betTicketSelection.betBuilderSelections) && Intrinsics.g(this.joker, betTicketSelection.joker) && Intrinsics.g(this.eventPendingReason, betTicketSelection.eventPendingReason);
    }

    public final String getAway() {
        return this.away;
    }

    public final Boolean getBanker() {
        return this.banker;
    }

    public final List<BetTicketSelection> getBetBuilderSelections() {
        return this.betBuilderSelections;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final Integer getCommentsNum() {
        return this.commentsNum;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final EventPendingReason getEventPendingReason() {
        return this.eventPendingReason;
    }

    public final BetEventSource getEventSource() {
        return this.eventSource;
    }

    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final List<String> getGameScore() {
        return this.gameScore;
    }

    public final Boolean getHaveLive() {
        return this.haveLive;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJointId() {
        return this.jointId;
    }

    public final JokerInfo getJoker() {
        return this.joker;
    }

    public final String getMarketDesc() {
        return this.marketDesc;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final Boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final Boolean getOddsBoostLfb() {
        return this.oddsBoostLfb;
    }

    public final Boolean getOddsBoosted() {
        return this.oddsBoosted;
    }

    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getOutcomeName() {
        return this.outcomeName;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final String getPlayedSeconds() {
        return this.playedSeconds;
    }

    public final String getPointScore() {
        return this.pointScore;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getRemainingTimeInPeriod() {
        return this.remainingTimeInPeriod;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final String getSetScore() {
        return this.setScore;
    }

    public final Integer getSettleType() {
        return this.settleType;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.home;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.away;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jointId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sportId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.product;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.gameId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.marketId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.marketDesc;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.specifier;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.outcomeId;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.outcomeName;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.outcomeDesc;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.categoryId;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.categoryName;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.tournamentId;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.tournamentName;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.odds;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool = this.oddsBoosted;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.oddsBoostLfb;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.result;
        int iHashCode22 = (iHashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str19 = this.matchStatus;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num4 = this.eventStatus;
        int iHashCode25 = (iHashCode24 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.banker;
        int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.haveLive;
        int iHashCode27 = (iHashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str20 = this.period;
        int iHashCode28 = (iHashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.playedSeconds;
        int iHashCode29 = (iHashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.remainingTimeInPeriod;
        int iHashCode30 = (iHashCode29 + (str22 == null ? 0 : str22.hashCode())) * 31;
        List<String> list = this.gameScore;
        int iHashCode31 = (iHashCode30 + (list == null ? 0 : list.hashCode())) * 31;
        String str23 = this.setScore;
        int iHashCode32 = (iHashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.pointScore;
        int iHashCode33 = (iHashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode34 = (iHashCode33 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool5 = this.matchTrackerNotAllowed;
        int iHashCode35 = (iHashCode34 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num5 = this.commentsNum;
        int iHashCode36 = (iHashCode35 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BetEventSource betEventSource = this.eventSource;
        int iHashCode37 = (iHashCode36 + (betEventSource == null ? 0 : betEventSource.hashCode())) * 31;
        Integer num6 = this.settleType;
        int iHashCode38 = (iHashCode37 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<BetTicketSelection> list2 = this.betBuilderSelections;
        int iHashCode39 = (iHashCode38 + (list2 == null ? 0 : list2.hashCode())) * 31;
        JokerInfo jokerInfo = this.joker;
        int iHashCode40 = (iHashCode39 + (jokerInfo == null ? 0 : jokerInfo.hashCode())) * 31;
        EventPendingReason eventPendingReason = this.eventPendingReason;
        return iHashCode40 + (eventPendingReason != null ? eventPendingReason.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.home;
        String str3 = this.away;
        String str4 = this.jointId;
        String str5 = this.eventId;
        String str6 = this.sportId;
        Integer num = this.product;
        String str7 = this.gameId;
        String str8 = this.marketId;
        String str9 = this.marketDesc;
        String str10 = this.specifier;
        String str11 = this.outcomeId;
        String str12 = this.outcomeName;
        String str13 = this.outcomeDesc;
        String str14 = this.categoryId;
        String str15 = this.categoryName;
        String str16 = this.tournamentId;
        String str17 = this.tournamentName;
        String str18 = this.odds;
        Boolean bool = this.oddsBoosted;
        Boolean bool2 = this.oddsBoostLfb;
        Integer num2 = this.result;
        Integer num3 = this.status;
        String str19 = this.matchStatus;
        Integer num4 = this.eventStatus;
        Boolean bool3 = this.banker;
        Boolean bool4 = this.haveLive;
        String str20 = this.period;
        String str21 = this.playedSeconds;
        String str22 = this.remainingTimeInPeriod;
        List<String> list = this.gameScore;
        String str23 = this.setScore;
        String str24 = this.pointScore;
        Long l = this.startTime;
        Boolean bool5 = this.matchTrackerNotAllowed;
        Integer num5 = this.commentsNum;
        BetEventSource betEventSource = this.eventSource;
        Integer num6 = this.settleType;
        List<BetTicketSelection> list2 = this.betBuilderSelections;
        JokerInfo jokerInfo = this.joker;
        EventPendingReason eventPendingReason = this.eventPendingReason;
        StringBuilder sbA = ux5.a("BetTicketSelection(id=", str, ", home=", str2, ", away=");
        hxa.c(sbA, str3, ", jointId=", str4, ", eventId=");
        hxa.c(sbA, str5, ", sportId=", str6, ", product=");
        w03.a(num, ", gameId=", str7, ", marketId=", sbA);
        hxa.c(sbA, str8, ", marketDesc=", str9, ", specifier=");
        hxa.c(sbA, str10, ", outcomeId=", str11, ", outcomeName=");
        hxa.c(sbA, str12, ", outcomeDesc=", str13, ", categoryId=");
        hxa.c(sbA, str14, ", categoryName=", str15, ", tournamentId=");
        hxa.c(sbA, str16, ", tournamentName=", str17, ", odds=");
        x03.a(sbA, str18, ", oddsBoosted=", bool, ", oddsBoostLfb=");
        sbA.append(bool2);
        sbA.append(", result=");
        sbA.append(num2);
        sbA.append(", status=");
        w03.a(num3, ", matchStatus=", str19, ", eventStatus=", sbA);
        sbA.append(num4);
        sbA.append(", banker=");
        sbA.append(bool3);
        sbA.append(", haveLive=");
        sbA.append(bool4);
        sbA.append(", period=");
        sbA.append(str20);
        sbA.append(", playedSeconds=");
        hxa.c(sbA, str21, ", remainingTimeInPeriod=", str22, ", gameScore=");
        gfs.a(", setScore=", str23, ", pointScore=", sbA, list);
        sbA.append(str24);
        sbA.append(", startTime=");
        sbA.append(l);
        sbA.append(", matchTrackerNotAllowed=");
        sbA.append(bool5);
        sbA.append(", commentsNum=");
        sbA.append(num5);
        sbA.append(", eventSource=");
        sbA.append(betEventSource);
        sbA.append(", settleType=");
        sbA.append(num6);
        sbA.append(", betBuilderSelections=");
        sbA.append(list2);
        sbA.append(", joker=");
        sbA.append(jokerInfo);
        sbA.append(", eventPendingReason=");
        sbA.append(eventPendingReason);
        sbA.append(")");
        return sbA.toString();
    }

    public BetTicketSelection(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Integer num2, Integer num3, String str19, Integer num4, Boolean bool3, Boolean bool4, String str20, String str21, String str22, List<String> list, String str23, String str24, Long l, Boolean bool5, Integer num5, BetEventSource betEventSource, Integer num6, List<BetTicketSelection> list2, JokerInfo jokerInfo, EventPendingReason eventPendingReason) {
        this.id = str;
        this.home = str2;
        this.away = str3;
        this.jointId = str4;
        this.eventId = str5;
        this.sportId = str6;
        this.product = num;
        this.gameId = str7;
        this.marketId = str8;
        this.marketDesc = str9;
        this.specifier = str10;
        this.outcomeId = str11;
        this.outcomeName = str12;
        this.outcomeDesc = str13;
        this.categoryId = str14;
        this.categoryName = str15;
        this.tournamentId = str16;
        this.tournamentName = str17;
        this.odds = str18;
        this.oddsBoosted = bool;
        this.oddsBoostLfb = bool2;
        this.result = num2;
        this.status = num3;
        this.matchStatus = str19;
        this.eventStatus = num4;
        this.banker = bool3;
        this.haveLive = bool4;
        this.period = str20;
        this.playedSeconds = str21;
        this.remainingTimeInPeriod = str22;
        this.gameScore = list;
        this.setScore = str23;
        this.pointScore = str24;
        this.startTime = l;
        this.matchTrackerNotAllowed = bool5;
        this.commentsNum = num5;
        this.eventSource = betEventSource;
        this.settleType = num6;
        this.betBuilderSelections = list2;
        this.joker = jokerInfo;
        this.eventPendingReason = eventPendingReason;
    }

    public BetTicketSelection() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null);
    }
}
