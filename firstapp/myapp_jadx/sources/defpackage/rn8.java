package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u0002:\nÜ\u0001Ý\u0001Þ\u0001ß\u0001à\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0017\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001e\u0010!J#\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b\u001e\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0015H\u0017¢\u0006\u0004\b&\u0010\u000fJ\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J)\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u0002022\u0006\u0010/\u001a\u00020\u00102\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\b?\u0010BJ'\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020\u00032\u0006\u0010D\u001a\u00020CH\u0017¢\u0006\u0004\b?\u0010EJ\u0017\u0010F\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bF\u0010@J\u000f\u0010G\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\u0015H\u0017¢\u0006\u0004\bH\u0010\u000fJ\u001f\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u0010H\u0017¢\u0006\u0004\bL\u0010MJ)\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\bL\u0010OJA\u0010U\u001a\u00020\u00152\u0006\u0010J\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010I2\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0010H\u0017¢\u0006\u0004\bU\u0010VJK\u0010U\u001a\u00020\u00152\u0006\u0010J\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010I2\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\bU\u0010WJ)\u0010Z\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00102\b\u0010Y\u001a\u0004\u0018\u00010IH\u0015¢\u0006\u0004\bZ\u0010[J-\u0010a\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u00102\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010`\u001a\u00020_H\u0017¢\u0006\u0004\ba\u0010bJI\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010c\"\u0004\b\u0001\u0010d2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010e2\u0006\u0010h\u001a\u00020g2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bl\u0010mJA\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010c\"\u0004\b\u0001\u0010d2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010e2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bl\u0010nJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0004\bq\u0010rJ\u001b\u0010t\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020o0s¢\u0006\u0004\bt\u0010uJ\u001b\u0010v\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020o0s¢\u0006\u0004\bv\u0010uJ\u0017\u0010x\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0010H\u0017¢\u0006\u0004\bx\u0010\u0012J\u001b\u0010y\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100s¢\u0006\u0004\by\u0010uJ\u001b\u0010z\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100s¢\u0006\u0004\bz\u0010uJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010J\u001a\u00020IH\u0015¢\u0006\u0004\b{\u0010|J\u001b\u0010}\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020I0s¢\u0006\u0004\b}\u0010uJ\u001b\u0010~\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020I0s¢\u0006\u0004\b~\u0010uJ\u001a\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u000202H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\"\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u0002022\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001J\u001e\u0010\u0084\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010s¢\u0006\u0005\b\u0084\u0001\u0010uJ\u001e\u0010\u0085\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010s¢\u0006\u0005\b\u0085\u0001\u0010uJ\u001b\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u000202H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0081\u0001J#\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u0002022\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001J\u001e\u0010\u0089\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010s¢\u0006\u0005\b\u0089\u0001\u0010uJ\u001e\u0010\u008a\u0001\u001a\u00020\u00152\r\u0010+\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010s¢\u0006\u0005\b\u008a\u0001\u0010uJ\u0011\u0010\u008b\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u008b\u0001\u0010\u000fJ\u0019\u0010\u008d\u0001\u001a\u00020\u00152\u0007\u0010+\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010+\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u000fJ\u0011\u0010\u0091\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u000fJ\u001c\u0010\u0094\u0001\u001a\u00020\u00152\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0013\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u0012\u0005\b¢\u0001\u0010\u000fR\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¦\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030¨\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010cR\u0018\u0010¯\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010±\u0001\u001a\u00020g8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010·\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010·\u0001R%\u0010º\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010·\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u00010s0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010·\u0001R\u001f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010·\u0001R\u0019\u0010½\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010¿\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010ª\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R(\u0010É\u0001\u001a\u00030\u0092\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÅ\u0001\u0010ª\u0001\u0012\u0005\bÈ\u0001\u0010\u000f\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\u001bR\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ò\u0001\u001a\u00030£\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010Ú\u0001\u001a\u00030×\u00018F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006á\u0001"}, d2 = {"Lrn8;", "Lyn8;", "", "Libs;", "Lw8i0;", "Liel;", "Lnv60;", "Lnny;", "Lre;", "Ltny;", "Lkpy;", "Lloy;", "Lroy;", "Ldmv;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Laoy;", "listener", "addOnContextAvailableListener", "(Laoy;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lbnv;", AnalyticsParam.EVENT_STREAM_PROVIDER, "addMenuProvider", "(Lbnv;)V", "owner", "(Lbnv;Libs;)V", "Ls9s$b;", "state", "(Lbnv;Libs;Ls9s$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lvd;", "contract", "Lie;", "registry", "Lud;", "callback", "Lee;", "registerForActivityResult", "(Lvd;Lie;Lud;)Lee;", "(Lvd;Lud;)Lee;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lqya;", "addOnConfigurationChangedListener", "(Lqya;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lylw;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lfu00;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Liny;", "dispatcher", "addObserverForBackInvoker", "(Liny;)V", "Lrn8$e;", "createFullyDrawnExecutor", "()Lrn8$e;", "Ln0b;", "contextAwareHelper", "Ln0b;", "Lgmv;", "menuHostHelper", "Lgmv;", "Lkv60;", "savedStateRegistryController", "Lkv60;", "getSavedStateRegistryController$annotations", "Lv8i0;", "_viewModelStore", "Lv8i0;", "reportFullyDrawnExecutor", "Lrn8$e;", "Lq9j;", "fullyDrawnReporter$delegate", "Lttr;", "getFullyDrawnReporter", "()Lq9j;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lie;", "getActivityResultRegistry", "()Lie;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lr8i0$c;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Lr8i0$c;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Liny;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Ls9s;", "getLifecycle", "()Ls9s;", "lifecycle", "getViewModelStore", "()Lv8i0;", "viewModelStore", "Lcyb;", "getDefaultViewModelCreationExtras", "()Lcyb;", "defaultViewModelCreationExtras", "Ljv60;", "getSavedStateRegistry", "()Ljv60;", "savedStateRegistry", "Companion", "b", "c", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class rn8 extends yn8 implements w8i0, iel, nv60, nny, re, tny, kpy, loy, roy, dmv {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c();
    private v8i0 _viewModelStore;
    private final ie activityResultRegistry;
    private int contentLayoutId;
    private final n0b contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final ttr defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final ttr fullyDrawnReporter;
    private final gmv menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final ttr onBackPressedDispatcher;
    private final CopyOnWriteArrayList<qya<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<qya<ylw>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<qya<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<qya<fu00>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<qya<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final kv60 savedStateRegistryController;

    public static final class a implements cbs {
        public a() {
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            rn8 rn8Var = rn8.this;
            rn8Var.ensureViewModelStore();
            rn8Var.getLifecycle().d(this);
        }
    }

    public static final class b {
        public static OnBackInvokedDispatcher a(rn8 rn8Var) {
            rn8Var.getClass();
            OnBackInvokedDispatcher onBackInvokedDispatcher = rn8Var.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            return onBackInvokedDispatcher;
        }
    }

    public static final class c {
    }

    public static final class d {
        public Object a;
        public v8i0 b;
    }

    public interface e extends Executor {
        void d();

        void u(View view);
    }

    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {
        public final long a = SystemClock.uptimeMillis() + 10000;
        public Runnable b;
        public boolean c;

        public f() {
        }

        @Override // rn8.e
        public final void d() {
            rn8 rn8Var = rn8.this;
            rn8Var.getWindow().getDecorView().removeCallbacks(this);
            rn8Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.b = runnable;
            View decorView = rn8.this.getWindow().getDecorView();
            decorView.getClass();
            if (!this.c) {
                decorView.postOnAnimation(new Runnable() { // from class: sn8
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn8.f fVar = this.a;
                        Runnable runnable2 = fVar.b;
                        if (runnable2 != null) {
                            runnable2.run();
                            fVar.b = null;
                        }
                    }
                });
            } else if (Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.a) {
                    this.c = false;
                    rn8.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.b = null;
            q9j fullyDrawnReporter = rn8.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                z = fullyDrawnReporter.c;
            }
            if (z) {
                this.c = false;
                rn8.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            rn8.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // rn8.e
        public final void u(View view) {
            view.getClass();
            if (this.c) {
                return;
            }
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static final class g extends ie {
        public g() {
        }

        @Override // defpackage.ie
        public final void b(final int i, vd vdVar, Object obj) {
            Bundle bundleExtra;
            final int i2;
            vdVar.getClass();
            rn8 rn8Var = rn8.this;
            final vd.a aVarB = vdVar.b(obj, rn8Var);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tn8
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = aVarB.a;
                        rn8.g gVar = this.a;
                        String str = (String) gVar.a.get(Integer.valueOf(i));
                        if (str == null) {
                            return;
                        }
                        ie.a aVar = (ie.a) gVar.e.get(str);
                        if ((aVar != null ? aVar.a : null) == null) {
                            gVar.g.remove(str);
                            gVar.f.put(str, serializable);
                            return;
                        }
                        ud<O> udVar = aVar.a;
                        udVar.getClass();
                        if (gVar.d.remove(str)) {
                            udVar.a((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentA = vdVar.a(obj, rn8Var);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                extras.getClass();
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(rn8Var.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                sc.e(rn8Var, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                rn8Var.startActivityForResult(intentA, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                i2 = i;
                try {
                    rn8Var.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: un8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        }
    }

    public static final class h extends qlr implements Function0<ov60> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ov60 invoke() {
            rn8 rn8Var = rn8.this;
            return new ov60(rn8Var.getApplication(), rn8Var, rn8Var.getIntent() != null ? rn8Var.getIntent().getExtras() : null);
        }
    }

    public static final class i extends qlr implements Function0<q9j> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final q9j invoke() {
            rn8 rn8Var = rn8.this;
            return new q9j(rn8Var.reportFullyDrawnExecutor, new vn8(rn8Var));
        }
    }

    public static final class j extends qlr implements Function0<iny> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final iny invoke() {
            final rn8 rn8Var = rn8.this;
            final iny inyVar = new iny(new Runnable() { // from class: wn8
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        super/*android.app.Activity*/.onBackPressed();
                    } catch (IllegalStateException e) {
                        if (!Intrinsics.g(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                            throw e;
                        }
                    } catch (NullPointerException e2) {
                        if (!Intrinsics.g(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                            throw e2;
                        }
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xn8
                        @Override // java.lang.Runnable
                        public final void run() {
                            rn8Var.addObserverForBackInvoker(inyVar);
                        }
                    });
                    return inyVar;
                }
                rn8Var.addObserverForBackInvoker(inyVar);
            }
            return inyVar;
        }
    }

    public rn8() {
        this.contextAwareHelper = new n0b();
        this.menuHostHelper = new gmv(new Runnable() { // from class: ln8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.invalidateMenu();
            }
        });
        mv60 mv60Var = new mv60(this, new xk20(this, 1));
        this.savedStateRegistryController = new kv60(mv60Var);
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = hwr.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            ib5.a("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new cbs() { // from class: mn8
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                rn8._init_$lambda$2(this.a, ibsVar, aVar);
            }
        });
        getLifecycle().a(new cbs() { // from class: nn8
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                rn8._init_$lambda$3(this.a, ibsVar, aVar);
            }
        });
        getLifecycle().a(new a());
        mv60Var.a();
        dv60.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new jv60.b() { // from class: on8
            @Override // jv60.b
            public final Bundle a() {
                return rn8._init_$lambda$4(this.a);
            }
        });
        addOnContextAvailableListener(new aoy() { // from class: pn8
            @Override // defpackage.aoy
            public final void onContextAvailable(Context context) {
                rn8._init_$lambda$5(this.a, context);
            }
        });
        this.defaultViewModelProviderFactory = hwr.b(new h());
        this.onBackPressedDispatcher = hwr.b(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(rn8 rn8Var, ibs ibsVar, s9s.a aVar) {
        Window window;
        View viewPeekDecorView;
        ibsVar.getClass();
        aVar.getClass();
        if (aVar != s9s.a.ON_STOP || (window = rn8Var.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(rn8 rn8Var, ibs ibsVar, s9s.a aVar) {
        ibsVar.getClass();
        aVar.getClass();
        if (aVar == s9s.a.ON_DESTROY) {
            rn8Var.contextAwareHelper.b = null;
            if (!rn8Var.isChangingConfigurations()) {
                rn8Var.getViewModelStore().a();
            }
            rn8Var.reportFullyDrawnExecutor.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(rn8 rn8Var) {
        Bundle bundle = new Bundle();
        ie ieVar = rn8Var.activityResultRegistry;
        ieVar.getClass();
        LinkedHashMap linkedHashMap = ieVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ieVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ieVar.g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(rn8 rn8Var, Context context) {
        context.getClass();
        Bundle bundleA = rn8Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ie ieVar = rn8Var.activityResultRegistry;
            LinkedHashMap linkedHashMap = ieVar.b;
            LinkedHashMap linkedHashMap2 = ieVar.a;
            Bundle bundle = ieVar.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                ieVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        y8h0.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                ieVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final iny dispatcher) {
        getLifecycle().a(new cbs(this) { // from class: qn8
            public final /* synthetic */ rn8 b;

            {
                this.b = this;
            }

            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                rn8.addObserverForBackInvoker$lambda$7(dispatcher, this.b, ibsVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(iny inyVar, rn8 rn8Var, ibs ibsVar, s9s.a aVar) {
        ibsVar.getClass();
        aVar.getClass();
        if (aVar == s9s.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b.a(rn8Var);
            inyVar.getClass();
            inyVar.e = onBackInvokedDispatcherA;
            inyVar.e(inyVar.g);
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new v8i0();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        eVar.u(decorView);
        super.addContentView(view, params);
    }

    public void addMenuProvider(final bnv provider, ibs owner) {
        provider.getClass();
        owner.getClass();
        final gmv gmvVar = this.menuHostHelper;
        gmvVar.b.add(provider);
        gmvVar.a.run();
        s9s lifecycle = owner.getLifecycle();
        HashMap map = gmvVar.c;
        gmv.a aVar = (gmv.a) map.remove(provider);
        if (aVar != null) {
            aVar.a.d(aVar.b);
            aVar.b = null;
        }
        map.put(provider, new gmv.a(lifecycle, new cbs() { // from class: fmv
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar2) {
                gmv gmvVar2 = gmvVar;
                gmvVar2.getClass();
                if (aVar2 == s9s.a.ON_DESTROY) {
                    gmvVar2.a(provider);
                }
            }
        }));
    }

    @Override // defpackage.tny
    public final void addOnConfigurationChangedListener(qya<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(aoy listener) {
        listener.getClass();
        n0b n0bVar = this.contextAwareHelper;
        n0bVar.getClass();
        rn8 rn8Var = n0bVar.b;
        if (rn8Var != null) {
            listener.onContextAvailable(rn8Var);
        }
        n0bVar.a.add(listener);
    }

    @Override // defpackage.loy
    public final void addOnMultiWindowModeChangedListener(qya<ylw> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(qya<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    @Override // defpackage.roy
    public final void addOnPictureInPictureModeChangedListener(qya<fu00> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // defpackage.kpy
    public final void addOnTrimMemoryListener(qya<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // defpackage.re
    public final ie getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.iel
    public cyb getDefaultViewModelCreationExtras() {
        dsw dswVar = new dsw((Object) null);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dswVar.a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(r8i0.a.d, application2);
        }
        linkedHashMap.put(dv60.a, this);
        linkedHashMap.put(dv60.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(dv60.c, extras);
        }
        return dswVar;
    }

    public r8i0.c getDefaultViewModelProviderFactory() {
        return (r8i0.c) this.defaultViewModelProviderFactory.getValue();
    }

    public q9j getFullyDrawnReporter() {
        return (q9j) this.fullyDrawnReporter.getValue();
    }

    @fae
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }

    @Override // defpackage.yn8, defpackage.ibs
    public s9s getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.nny
    public final iny getOnBackPressedDispatcher() {
        return (iny) this.onBackPressedDispatcher.getValue();
    }

    @Override // defpackage.nv60
    public final jv60 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.w8i0
    public v8i0 getViewModelStore() {
        if (getApplication() == null) {
            ib5.a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        v8i0 v8i0Var = this._viewModelStore;
        v8i0Var.getClass();
        return v8i0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @fae
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @fae
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<qya<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // defpackage.yn8, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.a(savedInstanceState);
        n0b n0bVar = this.contextAwareHelper;
        n0bVar.getClass();
        n0bVar.b = this;
        Iterator it = n0bVar.a.iterator();
        while (it.hasNext()) {
            ((aoy) it.next()).onContextAvailable(this);
        }
        super.onCreate(savedInstanceState);
        int i2 = v950.b;
        v950.a.b(this);
        int i3 = this.contentLayoutId;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        gmv gmvVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<bnv> it = gmvVar.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        item.getClass();
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            Iterator<bnv> it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (it.next().c(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            for (qya<ylw> qyaVar : this.onMultiWindowModeChangedListeners) {
                newConfig.getClass();
                qyaVar.accept(new ylw(isInMultiWindowMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<qya<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        menu.getClass();
        Iterator<bnv> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            for (qya<fu00> qyaVar : this.onPictureInPictureModeChangedListeners) {
                newConfig.getClass();
                qyaVar.accept(new fu00(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator<bnv> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @fae
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @fae
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        v8i0 v8i0Var = this._viewModelStore;
        if (v8i0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            v8i0Var = dVar.b;
        }
        if (v8i0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.a = objOnRetainCustomNonConfigurationInstance;
        dVar2.b = v8i0Var;
        return dVar2;
    }

    @Override // defpackage.yn8, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        if (getLifecycle() instanceof kbs) {
            s9s lifecycle = getLifecycle();
            lifecycle.getClass();
            ((kbs) lifecycle).i(s9s.b.c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<qya<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> ee<I> registerForActivityResult(vd<I, O> contract, ie registry, ud<O> callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // defpackage.dmv
    public void removeMenuProvider(bnv provider) {
        provider.getClass();
        this.menuHostHelper.a(provider);
    }

    @Override // defpackage.tny
    public final void removeOnConfigurationChangedListener(qya<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(aoy listener) {
        listener.getClass();
        n0b n0bVar = this.contextAwareHelper;
        n0bVar.getClass();
        n0bVar.a.remove(listener);
    }

    @Override // defpackage.loy
    public final void removeOnMultiWindowModeChangedListener(qya<ylw> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(qya<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    @Override // defpackage.roy
    public final void removeOnPictureInPictureModeChangedListener(qya<fu00> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // defpackage.kpy
    public final void removeOnTrimMemoryListener(qya<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (sig0.b()) {
                Trace.beginSection(sig0.d("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            q9j fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.c = true;
                    ArrayList arrayList = fullyDrawnReporter.d;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Function0) obj).invoke();
                    }
                    fullyDrawnReporter.d.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        eVar.u(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @fae
    public void startActivityForResult(Intent intent, int requestCode) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @fae
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @fae
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @fae
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        eVar.u(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        eVar.u(decorView);
        super.setContentView(view, params);
    }

    public final <I, O> ee<I> registerForActivityResult(vd<I, O> contract, ud<O> callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @fae
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<qya<ylw>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new ylw(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @fae
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<qya<fu00>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new fu00(isInPictureInPictureMode));
        }
    }

    @Override // defpackage.dmv
    public void addMenuProvider(bnv provider) {
        provider.getClass();
        gmv gmvVar = this.menuHostHelper;
        gmvVar.b.add(provider);
        gmvVar.a.run();
    }

    public void addMenuProvider(final bnv provider, ibs owner, final s9s.b state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        final gmv gmvVar = this.menuHostHelper;
        gmvVar.getClass();
        s9s lifecycle = owner.getLifecycle();
        HashMap map = gmvVar.c;
        gmv.a aVar = (gmv.a) map.remove(provider);
        if (aVar != null) {
            aVar.a.d(aVar.b);
            aVar.b = null;
        }
        map.put(provider, new gmv.a(lifecycle, new cbs() { // from class: emv
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar2) {
                gmv gmvVar2 = gmvVar;
                gmvVar2.getClass();
                Runnable runnable = gmvVar2.a;
                CopyOnWriteArrayList<bnv> copyOnWriteArrayList = gmvVar2.b;
                s9s.a.Companion.getClass();
                s9s.b bVar = state;
                s9s.a aVarB = s9s.a.C1084a.b(bVar);
                bnv bnvVar = provider;
                if (aVar2 == aVarB) {
                    copyOnWriteArrayList.add(bnvVar);
                    runnable.run();
                } else if (aVar2 == s9s.a.ON_DESTROY) {
                    gmvVar2.a(bnvVar);
                } else if (aVar2 == s9s.a.C1084a.a(bVar)) {
                    copyOnWriteArrayList.remove(bnvVar);
                    runnable.run();
                }
            }
        }));
    }

    public rn8(int i2) {
        this();
        this.contentLayoutId = i2;
    }
}
