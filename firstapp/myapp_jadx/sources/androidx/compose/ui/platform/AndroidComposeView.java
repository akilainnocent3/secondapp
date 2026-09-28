package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.n0;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.layout.z;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import defpackage.a120;
import defpackage.a30;
import defpackage.a420;
import defpackage.a6a0;
import defpackage.a70;
import defpackage.a8j0;
import defpackage.am1;
import defpackage.ap70;
import defpackage.asr;
import defpackage.b30;
import defpackage.b5a0;
import defpackage.b8j0;
import defpackage.bb80;
import defpackage.bcn;
import defpackage.bek;
import defpackage.bm0;
import defpackage.c1s;
import defpackage.c30;
import defpackage.c5a0;
import defpackage.cmp;
import defpackage.db80;
import defpackage.dcy;
import defpackage.ddv;
import defpackage.dj10;
import defpackage.dmn;
import defpackage.dq40;
import defpackage.duw;
import defpackage.e4p;
import defpackage.e60;
import defpackage.edf0;
import defpackage.emn;
import defpackage.emp;
import defpackage.etw;
import defpackage.f8i;
import defpackage.fa5;
import defpackage.fae;
import defpackage.fb80;
import defpackage.fkd;
import defpackage.fm20;
import defpackage.fmn;
import defpackage.fw50;
import defpackage.g020;
import defpackage.gaj;
import defpackage.gb80;
import defpackage.gdv;
import defpackage.ghz;
import defpackage.gmn;
import defpackage.gq40;
import defpackage.h40;
import defpackage.ham;
import defpackage.hb5;
import defpackage.hb80;
import defpackage.hk40;
import defpackage.hmn;
import defpackage.hoc0;
import defpackage.hwo;
import defpackage.hza;
import defpackage.i020;
import defpackage.i0p;
import defpackage.iae;
import defpackage.iam;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.ijf0;
import defpackage.ik40;
import defpackage.iwo;
import defpackage.j020;
import defpackage.j50;
import defpackage.jd0;
import defpackage.jld;
import defpackage.jm0;
import defpackage.jmf0;
import defpackage.jw50;
import defpackage.jwo;
import defpackage.jxo;
import defpackage.k3w;
import defpackage.k40;
import defpackage.k50;
import defpackage.k8i;
import defpackage.kxa;
import defpackage.l40;
import defpackage.l50;
import defpackage.lk40;
import defpackage.ll5;
import defpackage.lyi0;
import defpackage.m40;
import defpackage.m5y;
import defpackage.m9i0;
import defpackage.mae;
import defpackage.mc0;
import defpackage.mmd;
import defpackage.msw;
import defpackage.n40;
import defpackage.n50;
import defpackage.n5a0;
import defpackage.n5y;
import defpackage.n70;
import defpackage.nbh0;
import defpackage.nc0;
import defpackage.nmd;
import defpackage.nmf0;
import defpackage.npf0;
import defpackage.nsw;
import defpackage.nv60;
import defpackage.o020;
import defpackage.o50;
import defpackage.o5y;
import defpackage.oaa;
import defpackage.ob80;
import defpackage.od0;
import defpackage.ok40;
import defpackage.ol1;
import defpackage.olp;
import defpackage.ooa0;
import defpackage.ot5;
import defpackage.p020;
import defpackage.p3w;
import defpackage.p40;
import defpackage.p50;
import defpackage.p5i;
import defpackage.pkd;
import defpackage.pl1;
import defpackage.pmd;
import defpackage.pt5;
import defpackage.q020;
import defpackage.q20;
import defpackage.q40;
import defpackage.q50;
import defpackage.q5w;
import defpackage.qlr;
import defpackage.qt5;
import defpackage.r0p;
import defpackage.r3g;
import defpackage.r40;
import defpackage.r4i;
import defpackage.r6a0;
import defpackage.r6i0;
import defpackage.r90;
import defpackage.ra80;
import defpackage.rdd;
import defpackage.rk40;
import defpackage.rtw;
import defpackage.s020;
import defpackage.s40;
import defpackage.s4i;
import defpackage.s5w;
import defpackage.s6i0;
import defpackage.s70;
import defpackage.s90;
import defpackage.s9s;
import defpackage.sa80;
import defpackage.saj;
import defpackage.sc6;
import defpackage.si10;
import defpackage.t3i;
import defpackage.t4i;
import defpackage.t60;
import defpackage.t6l;
import defpackage.t7f;
import defpackage.t90;
import defpackage.tcf;
import defpackage.tg80;
import defpackage.tk40;
import defpackage.tkd;
import defpackage.tsr;
import defpackage.tt1;
import defpackage.u40;
import defpackage.ua80;
import defpackage.ug80;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.ujf0;
import defpackage.ul1;
import defpackage.ulf0;
import defpackage.v6l;
import defpackage.vgz;
import defpackage.w20;
import defpackage.w5b;
import defpackage.w7z;
import defpackage.wgz;
import defpackage.whv;
import defpackage.wjf0;
import defpackage.wkn;
import defpackage.wsr;
import defpackage.wvf;
import defpackage.wwx;
import defpackage.x1b;
import defpackage.x20;
import defpackage.x2d;
import defpackage.x3i;
import defpackage.x5a0;
import defpackage.y40;
import defpackage.y5b;
import defpackage.ydx;
import defpackage.ygz;
import defpackage.yje0;
import defpackage.yjf0;
import defpackage.yl1;
import defpackage.ysr;
import defpackage.ytw;
import defpackage.yw90;
import defpackage.ywx;
import defpackage.z40;
import defpackage.z6i0;
import defpackage.z6l;
import defpackage.z7i;
import defpackage.zdl;
import defpackage.zhv;
import defpackage.zi10;
import defpackage.zl1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004¦\u0002§\u0002J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R*\u0010=\u001a\u0002052\u0006\u00106\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010W\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010}\u001a\u00020x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R5\u0010\u0090\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u00100\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010\u001bR\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010¢\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R \u0010¨\u0001\u001a\u00030£\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R1\u0010±\u0001\u001a\u00030©\u00018V@\u0016X\u0096\u000e¢\u0006\u001f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b°\u0001\u0010V\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R/\u0010¸\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b·\u0001\u0010V\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u0010\u0012R5\u0010¾\u0001\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b¹\u0001\u0010)\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\"\u0010Â\u0001\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010»\u0001R'\u0010É\u0001\u001a\u00030Ã\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010V\u001a\u0006\bÆ\u0001\u0010Ç\u0001R \u0010Ï\u0001\u001a\u00030Ê\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R'\u0010Ö\u0001\u001a\u00030Ð\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÑ\u0001\u0010Ò\u0001\u0012\u0005\bÕ\u0001\u0010V\u001a\u0006\bÓ\u0001\u0010Ô\u0001R3\u0010Ý\u0001\u001a\u00030×\u00012\u0007\u0010'\u001a\u00030×\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bØ\u0001\u0010)\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R3\u0010ä\u0001\u001a\u00030Þ\u00012\u0007\u0010'\u001a\u00030Þ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bß\u0001\u0010)\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010ê\u0001\u001a\u00030å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R \u0010ð\u0001\u001a\u00030ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R \u0010ö\u0001\u001a\u00030ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R \u0010ü\u0001\u001a\u00030÷\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001R\u0017\u0010ÿ\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0005\b\u0088\u0002\u0010\u0016R\u001a\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0089\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001a\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0017\u0010\u0096\u0002\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010µ\u0001R\u0018\u0010\u0098\u0002\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u00ad\u0001R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0018\u0010 \u0002\u001a\u00030\u009d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0018\u0010¢\u0002\u001a\u00030©\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010\u00ad\u0001R\u0019\u0010¥\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002¨\u0006¨\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lwgz;", "Lzi10;", "Lm9i0;", "Lgdv;", "Lrdd;", "Lw7z;", "", "getImportantForAutofill", "()I", "Llk40;", "getEmbeddedViewFocusRect", "()Llk40;", "", "intervalMillis", "", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lfw50$a;", "handler", "setUncaughtExceptionHandler", "(Lfw50$a;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Lwsr;", "c", "Lwsr;", "getSharedDrawScope", "()Lwsr;", "sharedDrawScope", "Lmmd;", "<set-?>", "d", "Lytw;", "getDensity", "()Lmmd;", "setDensity", "(Lmmd;)V", "density", "Ls4i;", "i", "Ls4i;", "getFocusOwner", "()Ls4i;", "focusOwner", "Lkotlin/coroutines/CoroutineContext;", "value", "v", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "La70;", "w", "La70;", "getDragAndDropManager", "()La70;", "dragAndDropManager", "Lz6i0;", "C", "Lz6i0;", "getViewConfiguration", "()Lz6i0;", "viewConfiguration", "Landroidx/compose/ui/layout/g;", "D", "Landroidx/compose/ui/layout/g;", "getInsetsListener", "()Landroidx/compose/ui/layout/g;", "insetsListener", "Ltsr;", "E", "Ltsr;", "getRoot", "()Ltsr;", "getRoot$annotations", "()V", "root", "Lmsw;", "F", "Lmsw;", "getLayoutNodes", "()Lmsw;", "layoutNodes", "Lrk40;", "G", "Lrk40;", "getRectManager", "()Lrk40;", "rectManager", "Lfw50;", "H", "Lfw50;", "getRootForTest", "()Lfw50;", "rootForTest", "Lfb80;", "I", "Lfb80;", "getSemanticsOwner", "()Lfb80;", "semanticsOwner", "Le60;", "K", "Le60;", "getContentCaptureManager$ui_release", "()Le60;", "setContentCaptureManager$ui_release", "(Le60;)V", "contentCaptureManager", "Lq20;", "L", "Lq20;", "getAccessibilityManager", "()Lq20;", "accessibilityManager", "Lt6l;", "M", "Lt6l;", "getGraphicsContext", "()Lt6l;", "graphicsContext", "Lam1;", "N", "Lam1;", "getAutofillTree", "()Lam1;", "autofillTree", "Landroid/content/res/Configuration;", "U", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lb30;", "W", "Lb30;", "get_autofillManager$ui_release", "()Lb30;", "_autofillManager", "Ll40;", "b0", "Ll40;", "getClipboardManager", "()Ll40;", "clipboardManager", "Lk40;", "c0", "Lk40;", "getClipboard", "()Lk40;", "clipboard", "Lghz;", "d0", "Lghz;", "getSnapshotObserver", "()Lghz;", "snapshotObserver", "", "e0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "o0", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "r0", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "s0", "Ltwd0;", "getViewTreeOwners", "viewTreeOwners", "Lujf0;", "y0", "Lujf0;", "getTextInputService", "()Lujf0;", "getTextInputService$annotations", "textInputService", "Looa0;", "A0", "Looa0;", "getSoftwareKeyboardController", "()Looa0;", "softwareKeyboardController", "Lz7i$a;", "B0", "Lz7i$a;", "getFontLoader", "()Lz7i$a;", "getFontLoader$annotations", "fontLoader", "Lf8i$a;", "C0", "getFontFamilyResolver", "()Lf8i$a;", "setFontFamilyResolver", "(Lf8i$a;)V", "fontFamilyResolver", "Lasr;", "E0", "getLayoutDirection", "()Lasr;", "setLayoutDirection", "(Lasr;)V", "layoutDirection", "Lzdl;", "F0", "Lzdl;", "getHapticFeedBack", "()Lzdl;", "hapticFeedBack", "Lk3w;", "H0", "Lk3w;", "getModifierLocalManager", "()Lk3w;", "modifierLocalManager", "Ljmf0;", "I0", "Ljmf0;", "getTextToolbar", "()Ljmf0;", "textToolbar", "Li020;", "X0", "Li020;", "getPointerIconService", "()Li020;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "La8j0;", "getWindowInfo", "()La8j0;", "windowInfo", "uncaughtExceptionHandler", "Lfw50$a;", "getUncaughtExceptionHandler$ui_release", "()Lfw50$a;", "setUncaughtExceptionHandler$ui_release", "Lol1;", "getAutofill", "()Lol1;", "autofill", "Lyl1;", "getAutofillManager", "()Lyl1;", "autofillManager", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/y$a;", "getPlacementScope", "()Landroidx/compose/ui/layout/y$a;", "placementScope", "Lgmn;", "getInputModeManager", "()Lgmn;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "a", "b", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements wgz, zi10, m9i0, gdv, rdd, w7z {
    public static Class<?> Y0;
    public static Method Z0;
    public static Method a1;
    public static final etw<AndroidComposeView> b1 = new etw<>((Object) null);
    public static u40 c1;
    public static Method d1;
    public final androidx.compose.ui.d A;
    public final jld A0;
    public final sc6 B;
    public final n70 B0;
    public final jd0 C;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public final ytw fontFamilyResolver;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final androidx.compose.ui.layout.g insetsListener;
    public int D0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final tsr root;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public final ytw layoutDirection;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final msw<tsr> layoutNodes;
    public final dj10 F0;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final rk40 rectManager;
    public final hmn G0;
    public final AndroidComposeView H;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final k3w modifierLocalManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final fb80 semanticsOwner;
    public final nc0 I0;
    public final androidx.compose.ui.platform.c J;
    public MotionEvent J0;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public e60 contentCaptureManager;
    public long K0;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final q20 accessibilityManager;
    public final e4p L0;
    public final s70 M;
    public final etw<Function0<Unit>> M0;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final am1 autofillTree;
    public float N0;
    public final ArrayList O;
    public float O0;
    public ArrayList P;
    public final p P0;
    public boolean Q;
    public final s40 Q0;
    public boolean R;
    public boolean R0;
    public final q5w S;
    public final o S0;
    public final q020 T;
    public final ot5 T0;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Function1<? super Configuration, Unit> configurationChangeObserver;
    public boolean U0;
    public final x20 V;
    public final ap70 V0;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final b30 _autofillManager;
    public View W0;
    public final m X0;
    public long a;
    public boolean a0;
    public final boolean b;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final l40 clipboardManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final wsr sharedDrawScope;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final k40 clipboard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final ytw density;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final ghz snapshotObserver;
    public final View e;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public final boolean f;
    public AndroidViewsHandler f0;
    public kxa g0;
    public boolean h0;
    public final t4i i;
    public final whv i0;
    public long j0;
    public final int[] k0;
    public final float[] l0;
    public final float[] m0;
    public final float[] n0;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public boolean p0;
    public long q0;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public final ytw _viewTreeOwners;
    public final mae s0;
    public Function1<? super b, Unit> t0;
    public final p40 u0;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public CoroutineContext coroutineContext;
    public final q40 v0;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final a70 dragAndDropManager;
    public final r40 w0;
    public final wjf0 x0;
    public final c1s y;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public final ujf0 textInputService;
    public final androidx.compose.ui.d z;
    public final AtomicReference z0;

    public static final class a {
        public static boolean a() {
            try {
                if (AndroidComposeView.Y0 == null) {
                    AndroidComposeView.Y0 = Class.forName("android.os.SystemProperties");
                }
                Method declaredMethod = AndroidComposeView.Z0;
                if (declaredMethod == null) {
                    Class<?> cls = AndroidComposeView.Y0;
                    declaredMethod = cls != null ? cls.getDeclaredMethod(UccrWswQGaIj.jNc, String.class, Boolean.TYPE) : null;
                    AndroidComposeView.Z0 = declaredMethod;
                }
                Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return Intrinsics.g(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class b {
        public final ibs a;
        public final nv60 b;

        public b(ibs ibsVar, nv60 nv60Var) {
            this.a = ibsVar;
            this.b = nv60Var;
        }
    }

    public static final class c extends qlr implements Function1<fmn, Boolean> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(fmn fmnVar) {
            int i = fmnVar.a;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            boolean zRequestFocusFromTouch = true;
            if (i == 1) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else if (i != 2) {
                zRequestFocusFromTouch = false;
            } else if (androidComposeView.isInTouchMode()) {
                zRequestFocusFromTouch = androidComposeView.requestFocusFromTouch();
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    public static final class d extends qlr implements Function1<Configuration, Unit> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Configuration configuration) {
            return Unit.a;
        }
    }

    public /* synthetic */ class e extends saj implements Function0<hza> {
        @Override // kotlin.jvm.functions.Function0
        public final hza invoke() {
            ContentCaptureSession contentCaptureSessionA;
            View view = (View) this.receiver;
            q50.a aVar = q50.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                s6i0.c.a(view);
            }
            if (i < 29 || (contentCaptureSessionA = s6i0.b.a(view)) == null) {
                return null;
            }
            return new hza(contentCaptureSessionA, view);
        }
    }

    public static final class f extends qlr implements Function0<Boolean> {
        public final /* synthetic */ AndroidComposeView a;
        public final /* synthetic */ MotionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
            super(0);
            this.a = androidComposeView;
            this.b = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.D(this.b, this.a));
        }
    }

    public static final class g extends qlr implements Function0<Boolean> {
        public final /* synthetic */ KeyEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KeyEvent keyEvent) {
            super(0);
            this.b = keyEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.b));
        }
    }

    public /* synthetic */ class h extends saj implements gaj<t7f, yw90, Function1<? super tcf, ? extends Unit>, Boolean> {
        @Override // defpackage.gaj
        public final Boolean invoke(t7f t7fVar, yw90 yw90Var, Function1<? super tcf, ? extends Unit> function1) {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            Class<?> cls = AndroidComposeView.Y0;
            Resources resources = androidComposeView.getContext().getResources();
            oaa oaaVar = new oaa(new nmd(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), yw90Var.a, function1);
            return Boolean.valueOf(l50.a.a(androidComposeView, t7fVar, oaaVar));
        }
    }

    public static final class i extends qlr implements Function1<FocusTargetNode, Boolean> {
        public final /* synthetic */ dq40<FocusTargetNode> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(dq40<FocusTargetNode> dq40Var) {
            super(1);
            this.a = dq40Var;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusTargetNode] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.a.a = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    public static final class j extends qlr implements Function1<FocusTargetNode, Boolean> {
        public static final j a = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    public static final class k extends qlr implements Function1<cmp, Boolean> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(cmp cmpVar) {
            t3i t3iVar;
            KeyEvent keyEvent = cmpVar.a;
            long jA = emp.a(keyEvent);
            if (olp.a(jA, olp.b)) {
                t3iVar = new t3i(2);
            } else if (olp.a(jA, olp.c)) {
                t3iVar = new t3i(1);
            } else if (olp.a(jA, olp.i)) {
                t3iVar = new t3i(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (olp.a(jA, olp.g)) {
                t3iVar = new t3i(4);
            } else if (olp.a(jA, olp.f)) {
                t3iVar = new t3i(3);
            } else if (olp.a(jA, olp.d) || olp.a(jA, olp.o)) {
                t3iVar = new t3i(5);
            } else if (olp.a(jA, olp.e) || olp.a(jA, olp.p)) {
                t3iVar = new t3i(6);
            } else if (olp.a(jA, olp.h) || olp.a(jA, olp.k) || olp.a(jA, olp.q)) {
                t3iVar = new t3i(7);
            } else {
                t3iVar = (olp.a(jA, olp.a) || olp.a(jA, olp.l)) ? new t3i(8) : null;
            }
            if (t3iVar != null) {
                int i = t3iVar.a;
                if (emp.b(keyEvent) == 2) {
                    Integer numD = x2d.d(i);
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    lk40 embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                    Boolean boolA = androidComposeView.getFocusOwner().a(i, embeddedViewFocusRect, new androidx.compose.ui.platform.b(t3iVar));
                    if (boolA != null ? boolA.booleanValue() : true) {
                        return Boolean.TRUE;
                    }
                    if (i != 1 && i != 2) {
                        return Boolean.FALSE;
                    }
                    if (numD != null) {
                        int iIntValue = numD.intValue();
                        x3i x3iVar = x3i.f.get();
                        x3iVar.getClass();
                        x3i x3iVar2 = x3iVar;
                        View viewB = androidComposeView;
                        loop0: while (true) {
                            if (viewB == null) {
                                viewB = null;
                                break;
                            }
                            View rootView = androidComposeView.getRootView();
                            rootView.getClass();
                            viewB = x3iVar2.b(iIntValue, viewB, (ViewGroup) rootView);
                            if (viewB != null) {
                                q50.a aVar = q50.a;
                                if (!viewB.equals(androidComposeView)) {
                                    ViewParent parent = viewB.getParent();
                                    while (true) {
                                        if (parent == null) {
                                            break loop0;
                                        }
                                        if (parent == androidComposeView) {
                                            break;
                                        }
                                        parent = parent.getParent();
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (Intrinsics.g(viewB, androidComposeView)) {
                            viewB = null;
                        }
                        if (viewB != null) {
                            Rect rectB = embeddedViewFocusRect != null ? ok40.b(embeddedViewFocusRect) : null;
                            if (rectB == null) {
                                ib5.a("Invalid rect");
                                return null;
                            }
                            View rootView2 = androidComposeView.getRootView();
                            rootView2.getClass();
                            ViewGroup viewGroup = (ViewGroup) rootView2;
                            viewGroup.offsetDescendantRectToMyCoords(androidComposeView, rectB);
                            viewGroup.offsetRectIntoDescendantCoords(viewB, rectB);
                            if (x2d.c(viewB, numD, rectB)) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                    if (!androidComposeView.getFocusOwner().p(i, false, false)) {
                        return Boolean.TRUE;
                    }
                    Boolean boolA2 = androidComposeView.getFocusOwner().a(i, null, new androidx.compose.ui.platform.a(t3iVar));
                    return Boolean.valueOf(boolA2 != null ? boolA2.booleanValue() : true);
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class l extends qlr implements Function0<jxo> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final jxo invoke() {
            return new jxo(od0.a(AndroidComposeView.this));
        }
    }

    public static final class m implements i020 {
        public g020 a;

        public m() {
            g020.a.getClass();
        }

        @Override // defpackage.i020
        public final void a(g020 g020Var) {
            if (g020Var == null) {
                g020.a.getClass();
                g020Var = j020.a;
            }
            o50.a.a(AndroidComposeView.this, g020Var);
        }

        @Override // defpackage.i020
        public final void b(g020 g020Var) {
            this.a = g020Var;
        }

        @Override // defpackage.i020
        public final g020 c() {
            return this.a;
        }
    }

    public static final class n extends qlr implements Function1<FocusTargetNode, Boolean> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i) {
            super(1);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.D(this.a));
        }
    }

    public static final class o extends qlr implements Function0<Unit> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.J0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.K0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.P0);
            }
            return Unit.a;
        }
    }

    public static final class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.J0;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                androidComposeView.W(motionEvent, i, androidComposeView.K0, false);
            }
        }
    }

    public static final class q extends qlr implements Function1<jw50, Boolean> {
        public static final q a = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(jw50 jw50Var) {
            return Boolean.FALSE;
        }
    }

    public static final class r extends qlr implements Function1<Function0<? extends Unit>, Unit> {
        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            final Function0<? extends Unit> function1 = function0;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function1.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: x40
                        @Override // java.lang.Runnable
                        public final void run() {
                            function1.invoke();
                        }
                    });
                }
            }
            return Unit.a;
        }
    }

    public static final class s extends qlr implements Function0<b> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v23, types: [p40] */
    /* JADX WARN: Type inference failed for: r1v24, types: [q40] */
    /* JADX WARN: Type inference failed for: r1v25, types: [r40] */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        b30 b30Var;
        asr asrVar;
        super(context);
        final AndroidComposeView androidComposeView = this;
        androidComposeView.a = 9205357640488583168L;
        androidComposeView.b = true;
        androidComposeView.sharedDrawScope = new wsr();
        pmd pmdVarA = t60.a(context);
        gq40 gq40Var = gq40.b;
        androidComposeView.density = androidx.compose.runtime.m.a(pmdVarA, gq40Var);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 35;
        androidComposeView.f = z;
        r3g r3gVar = new r3g();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(r3gVar);
        p3w<fa5> p3wVar = new p3w<fa5>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.p3w
            public final androidx.compose.ui.d.c a() {
                fa5 fa5Var = new fa5();
                fa5Var.D = this.b;
                return fa5Var;
            }

            @Override // defpackage.p3w
            public final void d(androidx.compose.ui.d.c cVar) {
                ((fa5) cVar).D = this.b;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }
        };
        androidComposeView.i = new t4i(androidComposeView, androidComposeView);
        androidComposeView.coroutineContext = coroutineContext;
        androidComposeView.dragAndDropManager = new a70(new h(3, androidComposeView, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        androidComposeView.y = new c1s();
        androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(androidx.compose.ui.d.a.b, androidComposeView.new k());
        androidComposeView.z = dVarA;
        androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.rotary.a.a(q.a);
        androidComposeView.A = dVarA2;
        androidComposeView.B = new sc6();
        androidComposeView.C = new jd0(ViewConfiguration.get(context));
        androidx.compose.ui.layout.g gVar = new androidx.compose.ui.layout.g();
        androidComposeView.insetsListener = gVar;
        tsr tsrVar = new tsr(3);
        tsrVar.j(a0.b);
        tsrVar.l0(androidComposeView.getDensity());
        tsrVar.o0(androidComposeView.getViewConfiguration());
        tsrVar.k(n0.a(gVar).n(emptySemanticsElement).n(dVarA2).n(dVarA).n(androidComposeView.getFocusOwner().j()).n(androidComposeView.getDragAndDropManager().c).n(p3wVar));
        androidComposeView.root = tsrVar;
        msw mswVar = hwo.a;
        androidComposeView.layoutNodes = new msw<>();
        androidComposeView.getLayoutNodes();
        androidComposeView.rectManager = new rk40();
        androidComposeView.H = androidComposeView;
        androidComposeView.semanticsOwner = new fb80(androidComposeView.getRoot(), r3gVar, androidComposeView.getLayoutNodes());
        androidx.compose.ui.platform.c cVar = new androidx.compose.ui.platform.c(androidComposeView);
        androidComposeView.J = cVar;
        androidComposeView.contentCaptureManager = new e60(androidComposeView, new e(0, androidComposeView, q50.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        androidComposeView.accessibilityManager = new q20(context);
        androidComposeView.M = new s70(androidComposeView);
        androidComposeView.autofillTree = new am1();
        androidComposeView.O = new ArrayList();
        androidComposeView.S = new q5w();
        androidComposeView.T = new q020(androidComposeView.getRoot());
        androidComposeView.configurationChangeObserver = d.a;
        ap70 ap70Var = null;
        androidComposeView.V = H() ? new x20(androidComposeView, androidComposeView.getAutofillTree()) : null;
        if (H()) {
            AutofillManager autofillManagerA = n40.a(context.getSystemService(m40.a()));
            if (autofillManagerA == null) {
                throw w20.a("Autofill service could not be located.");
            }
            androidComposeView = this;
            b30Var = new b30(new si10(autofillManagerA), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            b30Var = null;
        }
        androidComposeView._autofillManager = b30Var;
        androidComposeView.clipboardManager = new l40(context);
        androidComposeView.clipboard = new k40(androidComposeView.getClipboardManager());
        androidComposeView.snapshotObserver = new ghz(androidComposeView.new r());
        androidComposeView.i0 = new whv(androidComposeView.getRoot());
        androidComposeView.j0 = 9223372034707292159L;
        androidComposeView.k0 = new int[]{0, 0};
        float[] fArrA = ddv.a();
        androidComposeView.l0 = fArrA;
        androidComposeView.m0 = ddv.a();
        androidComposeView.n0 = ddv.a();
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.q0 = 9187343241974906880L;
        androidComposeView._viewTreeOwners = androidx.compose.runtime.m.b(null);
        androidComposeView.s0 = a6a0.b(androidComposeView.new s());
        androidComposeView.u0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: p40
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class<?> cls = AndroidComposeView.Y0;
                this.a.X();
            }
        };
        androidComposeView.v0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: q40
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.Y0;
                this.a.X();
            }
        };
        androidComposeView.w0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: r40
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                ((x5a0) this.a.G0.a).setValue(new fmn(z2 ? 1 : 2));
            }
        };
        wjf0 wjf0Var = new wjf0(androidComposeView.getView(), androidComposeView);
        androidComposeView.x0 = wjf0Var;
        q50.a.getClass();
        androidComposeView.textInputService = new ujf0(wjf0Var);
        androidComposeView.z0 = new AtomicReference(null);
        androidComposeView.A0 = new jld(androidComposeView.getTextInputService());
        androidComposeView.B0 = new n70();
        androidComposeView.fontFamilyResolver = androidx.compose.runtime.m.a(k8i.a(context), gq40Var);
        androidComposeView.D0 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection != 0) {
            asrVar = layoutDirection != 1 ? null : asr.b;
        } else {
            asrVar = asr.a;
        }
        androidComposeView.layoutDirection = androidx.compose.runtime.m.b(asrVar == null ? asr.a : asrVar);
        androidComposeView.F0 = new dj10(androidComposeView);
        androidComposeView.G0 = new hmn(androidComposeView.isInTouchMode() ? 1 : 2, androidComposeView.new c());
        androidComposeView.modifierLocalManager = new k3w(androidComposeView);
        nc0 nc0Var = new nc0();
        new edf0(new mc0(nc0Var));
        nmf0 nmf0Var = nmf0.a;
        androidComposeView.I0 = nc0Var;
        androidComposeView.L0 = new e4p();
        androidComposeView.M0 = new etw<>(ap70Var);
        androidComposeView.P0 = androidComposeView.new p();
        androidComposeView.Q0 = new s40(androidComposeView);
        androidComposeView.S0 = androidComposeView.new o();
        androidComposeView.T0 = i2 < 29 ? new pt5(fArrA) : new qt5();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i2 >= 26) {
            p50.a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        r6i0.p(androidComposeView, cVar);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().r(androidComposeView);
        if (i2 >= 29) {
            k50.a.a(androidComposeView);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            androidComposeView.e = view;
            androidComposeView.addView(view, -1);
        }
        androidComposeView.V0 = i2 >= 31 ? new ap70() : null;
        androidComposeView.X0 = androidComposeView.new m();
    }

    public static final /* synthetic */ boolean D(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public static boolean H() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void I(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).z();
            } else if (childAt instanceof ViewGroup) {
                I((ViewGroup) childAt);
            }
        }
    }

    public static long J(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            nbh0.a aVar = nbh0.b;
            return size;
        }
        if (mode == 0) {
            nbh0.a aVar2 = nbh0.b;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            fm20.a();
            return 0L;
        }
        long j2 = size;
        nbh0.a aVar3 = nbh0.b;
        return j2 | (j2 << 32);
    }

    public static View K(int i2, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.g(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewK = K(i2, viewGroup.getChildAt(i3));
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void M(tsr tsrVar) {
        tsrVar.O();
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i2 = duwVarK.c;
        for (int i3 = 0; i3 < i2; i3++) {
            M(tsrVarArr[i3]);
        }
    }

    public static boolean O(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Reader.READ_DONE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Reader.READ_DONE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Reader.READ_DONE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Reader.READ_DONE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Reader.READ_DONE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Reader.READ_DONE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !s5w.a.a(motionEvent, i2));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    @fae
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @fae
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) ((x5a0) this._viewTreeOwners).getValue();
    }

    private void setDensity(mmd mmdVar) {
        ((x5a0) this.density).setValue(mmdVar);
    }

    private void setFontFamilyResolver(f8i.a aVar) {
        ((x5a0) this.fontFamilyResolver).setValue(aVar);
    }

    private void setLayoutDirection(asr asrVar) {
        ((x5a0) this.layoutDirection).setValue(asrVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        ((x5a0) this._viewTreeOwners).setValue(bVar);
    }

    @Override // defpackage.wgz
    public final void A() {
        androidx.compose.ui.platform.c cVar = this.J;
        cVar.A = true;
        if (cVar.v() && !cVar.L) {
            cVar.L = true;
            cVar.l.post(cVar.N);
        }
        e60 e60Var = this.contentCaptureManager;
        e60Var.f = true;
        if (!e60Var.e() || e60Var.B) {
            return;
        }
        e60Var.B = true;
        e60Var.v.post(e60Var.C);
    }

    @Override // defpackage.wgz
    public final void B(tsr tsrVar, boolean z, boolean z2, boolean z3) {
        tsr tsrVarH;
        tsr tsrVarH2;
        whv whvVar = this.i0;
        if (!z) {
            if (whvVar.p(tsrVar, z2) && z3) {
                U(tsrVar);
                return;
            }
            return;
        }
        iae iaeVar = whvVar.b;
        tsr tsrVar2 = tsrVar.v;
        ysr ysrVar = tsrVar.V;
        if (tsrVar2 == null) {
            wkn.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = ysrVar.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    uhc.a();
                    return;
                }
                if (!ysrVar.e || z2) {
                    ysrVar.e = true;
                    ysrVar.p.K = true;
                    if (tsrVar.f0) {
                        return;
                    }
                    if ((Intrinsics.g(tsrVar.T(), Boolean.TRUE) || whv.h(tsrVar)) && ((tsrVarH = tsrVar.H()) == null || !tsrVarH.V.e)) {
                        iaeVar.a(tsrVar, i0p.a);
                    } else if ((tsrVar.i() || whv.i(tsrVar)) && ((tsrVarH2 = tsrVar.H()) == null || !tsrVarH2.D())) {
                        iaeVar.a(tsrVar, i0p.c);
                    }
                    if (whvVar.d || !z3) {
                        return;
                    }
                    U(tsrVar);
                    return;
                }
                return;
            }
        }
        whvVar.g.b(new whv.a(tsrVar, true, z2));
    }

    @Override // defpackage.wgz
    public final void C() {
        this.R = true;
    }

    public final void G(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        androidx.compose.ui.platform.c cVar = this.J;
        if (Intrinsics.g(str, cVar.G)) {
            int iD2 = cVar.E.d(i2);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!Intrinsics.g(str, cVar.H) || (iD = cVar.F.d(i2)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int L(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        removeCallbacks(this.P0);
        try {
            S(motionEvent);
            this.p0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.J0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                q020 q020Var = this.T;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!q020Var.e) {
                                q020Var.c.a.a();
                                q020Var.b.c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            W(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !P(motionEvent)) {
                    androidComposeView = this;
                } else {
                    androidComposeView = this;
                    androidComposeView.W(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.J0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.J0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    q5w q5wVar = androidComposeView.S;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            q5wVar.c.delete(pointerId);
                            q5wVar.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.J0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.J0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = androidComposeView.J0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                q5wVar.c.delete(pointerId);
                                q5wVar.b.delete(pointerId);
                            }
                            ham hamVar = q020Var.b;
                            if (hamVar.d) {
                                hamVar.d = true;
                            } else {
                                hamVar.g.a.g();
                            }
                        }
                    }
                }
                androidComposeView.J0 = MotionEvent.obtainNoHistory(motionEvent);
                int iV = V(motionEvent);
                Trace.endSection();
                androidComposeView.p0 = false;
                return iV;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.p0 = false;
            throw th3;
        }
    }

    public final void N(tsr tsrVar) {
        this.i0.p(tsrVar, false);
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i2 = duwVarK.c;
        for (int i3 = 0; i3 < i2; i3++) {
            N(tsrVarArr[i3]);
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean Q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.J0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void R() {
        if (this.p0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            ot5 ot5Var = this.T0;
            float[] fArr = this.m0;
            ot5Var.a(this, fArr);
            r0p.a(fArr, this.n0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.k0;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            this.q0 = (((long) Float.floatToRawIntBits(f2 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f3 - iArr[1])) & 4294967295L);
        }
    }

    public final void S(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        ot5 ot5Var = this.T0;
        float[] fArr = this.m0;
        ot5Var.a(this, fArr);
        r0p.a(fArr, this.n0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = ddv.b(fArr, (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.q0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean T() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void U(tsr tsrVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (tsrVar != null) {
            while (tsrVar != null && tsrVar.E() == tsr.f.a) {
                if (!this.h0) {
                    tsr tsrVarH = tsrVar.H();
                    if (tsrVarH == null) {
                        break;
                    }
                    long j2 = tsrVarH.U.c.d;
                    if (kxa.g(j2) && kxa.f(j2)) {
                        break;
                    }
                }
                tsrVar = tsrVar.H();
            }
            if (tsrVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final int V(MotionEvent motionEvent) {
        Object obj;
        if (this.U0) {
            this.U0 = false;
            int metaState = motionEvent.getMetaState();
            this.y.getClass();
            ((x5a0) b8j0.a).setValue(new a120(metaState));
        }
        q5w q5wVar = this.S;
        o020 o020VarA = q5wVar.a(motionEvent, this);
        q020 q020Var = this.T;
        if (o020VarA == null) {
            if (!q020Var.e) {
                q020Var.c.a.a();
                q020Var.b.c();
            }
            return 0;
        }
        ArrayList arrayList = o020VarA.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i2 = size - 1;
            obj = arrayList.get(size);
            if (((p020) obj).e) {
                break;
            }
            if (i2 < 0) {
                obj = null;
                break;
            }
            size = i2;
        }
        p020 p020Var = (p020) obj;
        if (p020Var != null) {
            this.a = p020Var.d;
        }
        int iA = q020Var.a(o020VarA, this, P(motionEvent));
        o020VarA.b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        q5wVar.c.delete(pointerId);
        q5wVar.b.delete(pointerId);
        return iA;
    }

    public final void W(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f2 = pointerCoords.x;
            long jW = w((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jW >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jW & 4294967295L));
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        o020 o020VarA = this.S.a(motionEventObtain, this);
        o020VarA.getClass();
        this.T.a(o020VarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void X() {
        boolean z;
        boolean z2;
        int[] iArr = this.k0;
        getLocationOnScreen(iArr);
        long j2 = this.j0;
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.j0 = (((long) i4) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                getRoot().V.p.J0();
                z = true;
            }
        }
        R();
        View rootView = this.W0;
        if (rootView == null) {
            rootView = getRootView();
            this.W0 = rootView;
        }
        rk40 rectManager = getRectManager();
        long j3 = this.j0;
        long jA = jwo.a(this.q0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.m0;
        int iA = tk40.a(fArr);
        npf0 npf0Var = rectManager.b;
        if ((iA & 2) != 0) {
            fArr = null;
        }
        if (iwo.b(jA, npf0Var.b)) {
            z2 = false;
        } else {
            npf0Var.b = jA;
            z2 = true;
        }
        if (!iwo.b(j3, npf0Var.c)) {
            npf0Var.c = j3;
            z2 = true;
        }
        if (fArr != null) {
            z2 = true;
        }
        long j4 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j4 != npf0Var.d) {
            npf0Var.d = j4;
            z2 = true;
        }
        rectManager.e = z2 || rectManager.e;
        this.i0.a(z);
        getRectManager().b();
    }

    @Override // defpackage.wgz
    public final void a(boolean z) {
        o oVar;
        whv whvVar = this.i0;
        if (whvVar.b.c() || ((duw) whvVar.e.a).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    oVar = this.S0;
                } finally {
                    Trace.endSection();
                }
            } else {
                oVar = null;
            }
            if (whvVar.j(oVar)) {
                requestLayout();
            }
            whvVar.a(false);
            if (this.R) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.R = false;
            }
            Unit unit = Unit.a;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        if (H()) {
            b30 b30Var = this._autofillManager;
            if (b30Var != null) {
                b30Var.c(sparseArray);
            }
            x20 x20Var = this.V;
            if (x20Var != null) {
                c30.a(x20Var, sparseArray);
            }
        }
    }

    @Override // defpackage.wgz
    public final long b(long j2) {
        R();
        return ddv.b(this.m0, j2);
    }

    @Override // defpackage.wgz
    public final void c(tsr tsrVar) {
        b30 b30Var;
        if (!H() || (b30Var = this._autofillManager) == null) {
            return;
        }
        b30Var.d.a.b(tsrVar.b, new a30(b30Var, tsrVar));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.J.m(i2, this.a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.J.m(i2, this.a, true);
    }

    @Override // defpackage.w7z
    public final void d(final androidx.compose.ui.layout.o oVar) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new Runnable() { // from class: t40
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar2 = oVar;
                    Class<?> cls = AndroidComposeView.Y0;
                    Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                    try {
                        oVar2.invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
            });
        } else {
            hb5.a("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            M(getRoot());
        }
        a(true);
        c5a0.e.getClass();
        n5a0.g().m();
        this.Q = true;
        sc6 sc6Var = this.B;
        h40 h40Var = sc6Var.a;
        Canvas canvas2 = h40Var.a;
        h40Var.a = canvas;
        getRoot().w(h40Var, null);
        sc6Var.a.a = canvas2;
        ArrayList arrayList = this.O;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((vgz) arrayList.get(i2)).k();
            }
        }
        if (ViewLayer.f) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.Q = false;
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f) {
            jm0.a(this, this.N0);
            View view = this.e;
            if (view == null) {
                Intrinsics.n("frameRateCategoryView");
                throw null;
            }
            jm0.a(view, this.O0);
            if (!Float.isNaN(this.O0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.N0 = Float.NaN;
            this.O0 = Float.NaN;
        }
        getRectManager().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (getFocusOwner().g(new defpackage.a80(), new androidx.compose.ui.platform.AndroidComposeView.f(r10, r9)) != false) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.R0
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L18
            s40 r0 = r9.Q0
            r9.removeCallbacks(r0)
            int r3 = r10.getActionMasked()
            if (r3 != r2) goto L15
            r9.R0 = r1
            goto L18
        L15:
            r0.run()
        L18:
            boolean r0 = O(r10)
            if (r0 != 0) goto Lc2
            boolean r0 = r9.isAttachedToWindow()
            if (r0 != 0) goto L26
            goto Lc2
        L26:
            int r0 = r10.getActionMasked()
            r3 = 1
            if (r0 != r2) goto L8d
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r10.isFromSource(r0)
            if (r0 == 0) goto L84
            android.content.Context r0 = r9.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            r1 = 26
            float r2 = r10.getAxisValue(r1)
            float r2 = -r2
            jw50 r3 = new jw50
            android.content.Context r4 = r9.getContext()
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r1) goto L55
            java.lang.reflect.Method r4 = defpackage.b7i0.a
            float r4 = b7i0.a.b(r0)
            goto L59
        L55:
            float r4 = defpackage.b7i0.a(r0, r4)
        L59:
            float r4 = r4 * r2
            android.content.Context r6 = r9.getContext()
            if (r5 < r1) goto L65
            float r0 = b7i0.a.a(r0)
            goto L69
        L65:
            float r0 = defpackage.b7i0.a(r0, r6)
        L69:
            float r5 = r0 * r2
            long r7 = r10.getEventTime()
            int r6 = r10.getDeviceId()
            r3.<init>(r4, r5, r6, r7)
            s4i r0 = r9.getFocusOwner()
            w40 r1 = new w40
            r1.<init>(r10, r9)
            boolean r9 = r0.d(r3, r1)
            return r9
        L84:
            int r9 = r9.L(r10)
            r9 = r9 & r3
            if (r9 == 0) goto L8c
            goto Lbc
        L8c:
            return r1
        L8d:
            r0 = 2
            boolean r0 = r10.isFromSource(r0)
            if (r0 != 0) goto Lbd
            a80 r0 = new a80
            float r1 = r10.getX()
            float r2 = r10.getY()
            java.lang.Float.floatToRawIntBits(r1)
            java.lang.Float.floatToRawIntBits(r2)
            r10.getEventTime()
            r10.getActionMasked()
            r0.<init>()
            s4i r1 = r9.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$f r2 = new androidx.compose.ui.platform.AndroidComposeView$f
            r2.<init>(r10, r9)
            boolean r0 = r1.g(r0, r2)
            if (r0 == 0) goto Lbd
        Lbc:
            return r3
        Lbd:
            boolean r9 = super.dispatchGenericMotionEvent(r10)
            return r9
        Lc2:
            boolean r9 = super.dispatchGenericMotionEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        boolean z = this.R0;
        s40 s40Var = this.Q0;
        if (z) {
            removeCallbacks(s40Var);
            s40Var.run();
        }
        if (!O(motionEvent) && isAttachedToWindow()) {
            androidx.compose.ui.platform.c cVar = this.J;
            AndroidComposeView androidComposeView = cVar.d;
            AccessibilityManager accessibilityManager = cVar.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    androidComposeView.a(true);
                    iam iamVar = new iam();
                    tsr root = androidComposeView.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    tsr.c cVar2 = tsr.g0;
                    wwx wwxVar = root.U;
                    ywx ywxVar = wwxVar.d;
                    ywx.d dVar = ywx.c0;
                    wwxVar.d.W1(ywx.i0, ywxVar.t1(jFloatToRawIntBits, true), iamVar, 1, true);
                    etw<Object> etwVar = iamVar.a;
                    int i3 = etwVar.b - 1;
                    while (true) {
                        if (-1 < i3) {
                            Object objB = etwVar.b(i3);
                            objB.getClass();
                            tsr tsrVarF = pkd.f((androidx.compose.ui.d.c) objB);
                            if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(tsrVarF) == null) {
                                if (tsrVarF.U.c(8)) {
                                    int iA = cVar.A(tsrVarF.b);
                                    bb80 bb80VarA = db80.a(tsrVarF, false);
                                    if (gb80.e(bb80VarA)) {
                                        if (!bb80VarA.k().a.b(hb80.z)) {
                                            i2 = iA;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i3--;
                            }
                        }
                        i2 = Integer.MIN_VALUE;
                        break;
                    }
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i4 = cVar.e;
                    if (i4 != i2) {
                        cVar.e = i2;
                        androidx.compose.ui.platform.c.E(cVar, i2, 128, null, 12);
                        androidx.compose.ui.platform.c.E(cVar, i4, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i5 = cVar.e;
                    if (i5 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i5 != Integer.MIN_VALUE) {
                        cVar.e = Integer.MIN_VALUE;
                        androidx.compose.ui.platform.c.E(cVar, Integer.MIN_VALUE, 128, null, 12);
                        androidx.compose.ui.platform.c.E(cVar, i5, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && P(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.J0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.J0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.R0 = true;
                        postDelayed(s40Var, 8L);
                        return false;
                    }
                } else if ((L(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (Q(motionEvent)) {
                if ((L(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().k(keyEvent, new g(keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.y.getClass();
        ((x5a0) b8j0.a).setValue(new a120(metaState));
        return getFocusOwner().k(keyEvent, r4i.a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            j50.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.R0) {
            s40 s40Var = this.Q0;
            removeCallbacks(s40Var);
            MotionEvent motionEvent2 = this.J0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.R0 = false;
            } else {
                s40Var.run();
            }
        }
        if (!O(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || Q(motionEvent))) {
            int iL = L(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wgz
    public final void e(tt1.b bVar) {
        this.i0.f.b(bVar);
        U(null);
    }

    @Override // defpackage.wgz
    public final void f(tsr tsrVar) {
        getLayoutNodes().h(tsrVar.b, tsrVar);
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return K(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        lk40 lk40VarA;
        if (view == null || this.i0.c) {
            return super.focusSearch(view, i2);
        }
        x3i x3iVar = x3i.f.get();
        x3iVar.getClass();
        View viewB = x3iVar.b(i2, view, this);
        if (view != this || (lk40VarA = getFocusOwner().o()) == null) {
            lk40VarA = x2d.a(view, this);
        }
        t3i t3iVarF = x2d.f(i2);
        int i3 = t3iVarF != null ? t3iVarF.a : 6;
        dq40 dq40Var = new dq40();
        if (getFocusOwner().a(i3, lk40VarA, new i(dq40Var)) != null) {
            T t = dq40Var.a;
            if (t != 0) {
                if (viewB != null) {
                    if (i3 == 1 || i3 == 2) {
                        return super.focusSearch(view, i2);
                    }
                    if (hoc0.g(p5i.b((FocusTargetNode) t), x2d.a(viewB, this), lk40VarA, i3)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    @Override // defpackage.wgz
    public final void g(int i2, tsr tsrVar) {
        b30 b30Var;
        if (H() && (b30Var = this._autofillManager) != null) {
            AndroidComposeView androidComposeView = b30Var.c;
            si10 si10Var = b30Var.a;
            nsw nswVar = b30Var.h;
            if (nswVar.e(i2)) {
                si10Var.e(androidComposeView, i2, false);
            }
            sa80 sa80VarF = tsrVar.f();
            if (sa80VarF != null && sa80VarF.a.a(hb80.q)) {
                nswVar.a(tsrVar.b);
                si10Var.e(androidComposeView, tsrVar.b, true);
            }
        }
        getRectManager().g(tsrVar, true);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f0 == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.f0 = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.f0;
        androidViewsHandler2.getClass();
        return androidViewsHandler2;
    }

    @Override // defpackage.wgz
    public ol1 getAutofill() {
        return this.V;
    }

    @Override // defpackage.wgz
    public yl1 getAutofillManager() {
        return this._autofillManager;
    }

    @Override // defpackage.wgz
    public am1 getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final e60 getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // defpackage.wgz
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // defpackage.wgz
    public mmd getDensity() {
        return (mmd) ((x5a0) this.density).getValue();
    }

    @Override // defpackage.zi10
    public lk40 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return x2d.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // defpackage.wgz
    public s4i getFocusOwner() {
        return this.i;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        lk40 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.g(getFocusOwner().a(6, null, j.a), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.wgz
    public f8i.a getFontFamilyResolver() {
        return (f8i.a) ((x5a0) this.fontFamilyResolver).getValue();
    }

    @Override // defpackage.wgz
    public z7i.a getFontLoader() {
        return this.B0;
    }

    @Override // defpackage.wgz
    public t6l getGraphicsContext() {
        return this.M;
    }

    @Override // defpackage.wgz
    public zdl getHapticFeedBack() {
        return this.F0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.i0.b.c();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.wgz
    public gmn getInputModeManager() {
        return this.G0;
    }

    public final androidx.compose.ui.layout.g getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.wgz
    public asr getLayoutDirection() {
        return (asr) ((x5a0) this.layoutDirection).getValue();
    }

    public long getMeasureIteration() {
        if (this.i0.c) {
            return 1L;
        }
        wkn.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // defpackage.wgz
    public k3w getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // defpackage.wgz
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // defpackage.wgz
    public y.a getPlacementScope() {
        z.a aVar = z.a;
        return new x(this);
    }

    @Override // defpackage.wgz
    public i020 getPointerIconService() {
        return this.X0;
    }

    @Override // defpackage.wgz
    public rk40 getRectManager() {
        return this.rectManager;
    }

    @Override // defpackage.wgz
    public tsr getRoot() {
        return this.root;
    }

    public fw50 getRootForTest() {
        return this.H;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ap70 ap70Var;
        if (Build.VERSION.SDK_INT < 31 || (ap70Var = this.V0) == null) {
            return false;
        }
        return ((Boolean) ((x5a0) ap70Var.a).getValue()).booleanValue();
    }

    @Override // defpackage.wgz, defpackage.fw50
    public fb80 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // defpackage.wgz
    public wsr getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // defpackage.wgz
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? bm0.a.a(this) : this.showLayoutBounds;
    }

    @Override // defpackage.wgz
    public ghz getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // defpackage.wgz
    public ooa0 getSoftwareKeyboardController() {
        return this.A0;
    }

    @Override // defpackage.wgz
    public ujf0 getTextInputService() {
        return this.textInputService;
    }

    @Override // defpackage.wgz
    public jmf0 getTextToolbar() {
        return this.I0;
    }

    public final fw50.a getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    @Override // defpackage.m9i0
    public View getView() {
        return this;
    }

    @Override // defpackage.wgz
    public z6i0 getViewConfiguration() {
        return this.C;
    }

    public final b getViewTreeOwners() {
        return (b) this.s0.getValue();
    }

    @Override // defpackage.wgz
    public a8j0 getWindowInfo() {
        return this.y;
    }

    /* JADX INFO: renamed from: get_autofillManager$ui_release, reason: from getter */
    public final b30 get_autofillManager() {
        return this._autofillManager;
    }

    @Override // defpackage.wgz
    public final void h(tsr tsrVar) {
        b30 b30Var;
        getRectManager().j(tsrVar);
        if (H() && (b30Var = this._autofillManager) != null && b30Var.h.e(tsrVar.b)) {
            b30Var.a.e(b30Var.c, tsrVar.b, false);
        }
    }

    @Override // defpackage.gdv
    public final void i(float[] fArr) {
        R();
        ddv.g(fArr, this.m0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.q0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.q0 & 4294967295L));
        q50.a aVar = q50.a;
        float[] fArr2 = this.l0;
        ddv.d(fArr2);
        ddv.h(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        q50.b(fArr, fArr2);
    }

    @Override // defpackage.wgz
    public final void j(tsr tsrVar) {
        bek bekVar = this.i0.e;
        if (tsrVar.e0 > 0) {
            ((duw) bekVar.a).b(tsrVar);
            tsrVar.d0 = true;
        }
        U(null);
    }

    @Override // defpackage.wgz
    public final void k(tsr tsrVar, boolean z) {
        this.i0.f(tsrVar, z);
    }

    @Override // defpackage.wgz
    public final void l(tsr tsrVar) {
        b30 b30Var;
        sa80 sa80VarF;
        if (!H() || (b30Var = this._autofillManager) == null || (sa80VarF = tsrVar.f()) == null || !sa80VarF.a.a(hb80.q)) {
            return;
        }
        b30Var.h.a(tsrVar.b);
        b30Var.a.e(b30Var.c, tsrVar.b, true);
    }

    @Override // defpackage.wgz
    public final vgz m(Function2 function2, ywx.f fVar, v6l v6lVar) {
        duw duwVar;
        Reference referencePoll;
        Object obj;
        if (v6lVar != null) {
            return new z6l(v6lVar, null, this, function2, fVar);
        }
        do {
            e4p e4pVar = this.L0;
            ReferenceQueue referenceQueue = (ReferenceQueue) e4pVar.b;
            duwVar = (duw) e4pVar.a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                duwVar.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i2 = duwVar.c;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) duwVar.k(i2 - 1)).get();
        } while (obj == null);
        vgz vgzVar = (vgz) obj;
        if (vgzVar == null) {
            return new z6l(getGraphicsContext().c(), getGraphicsContext(), this, function2, fVar);
        }
        vgzVar.e(function2, fVar);
        return vgzVar;
    }

    @Override // defpackage.wgz
    public final void n(tsr tsrVar) {
        androidx.compose.ui.platform.c cVar = this.J;
        cVar.A = true;
        if (cVar.v()) {
            cVar.w(tsrVar);
        }
        e60 e60Var = this.contentCaptureManager;
        e60Var.f = true;
        if (e60Var.e()) {
            e60Var.i.c(Unit.a);
        }
    }

    @Override // defpackage.j620
    public final long o(long j2) {
        R();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.q0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.q0 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        return ddv.b(this.n0, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        s9s lifecycle;
        ibs ibsVar;
        x20 x20Var;
        super.onAttachedToWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(a.a());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (i2 > 28) {
            if (c1 == null) {
                u40 u40Var = new u40();
                c1 = u40Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    try {
                        if (Y0 == null) {
                            Y0 = Class.forName("android.os.SystemProperties");
                        }
                        Method declaredMethod = a1;
                        if (declaredMethod == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class<?> cls = Y0;
                            declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            a1 = declaredMethod;
                        }
                        if (declaredMethod != null) {
                            declaredMethod.invoke(null, u40Var);
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.a;
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                } catch (Throwable th) {
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th;
                }
            }
            etw<AndroidComposeView> etwVar = b1;
            synchronized (etwVar) {
                etwVar.g(this);
                Unit unit2 = Unit.a;
            }
        }
        ((x5a0) this.y.c).setValue(Boolean.valueOf(hasWindowFocus()));
        c1s c1sVar = this.y;
        l lVar = new l();
        if (c1sVar.b == null) {
            c1sVar.a = lVar;
        }
        ytw<jxo> ytwVar = this.y.b;
        if (ytwVar != null) {
            ((x5a0) ytwVar).setValue(new jxo(od0.a(this)));
        }
        N(getRoot());
        M(getRoot());
        getSnapshotObserver().a.e();
        if (H() && (x20Var = this.V) != null) {
            ul1.a.a(x20Var);
        }
        ibs ibsVarB = ll5.b(this);
        nv60 nv60VarA = ydx.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (ibsVarB != null && nv60VarA != null && (ibsVarB != (ibsVar = viewTreeOwners.a) || nv60VarA != ibsVar))) {
            if (ibsVarB == null) {
                ib5.a("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (nv60VarA == null) {
                ib5.a("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            ibsVarB.getLifecycle().a(this);
            b bVar = new b(ibsVarB, nv60VarA);
            set_viewTreeOwners(bVar);
            Function1<? super b, Unit> function1 = this.t0;
            if (function1 != null) {
                function1.invoke(bVar);
            }
            this.t0 = null;
        }
        ((x5a0) this.G0.a).setValue(new fmn(isInTouchMode() ? 1 : 2));
        b viewTreeOwners2 = getViewTreeOwners();
        s9s lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw w20.a("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.u0);
        getViewTreeObserver().addOnScrollChangedListener(this.v0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.w0);
        if (Build.VERSION.SDK_INT >= 31) {
            n50.a.b(this);
        }
        b30 b30Var = this._autofillManager;
        if (b30Var != null) {
            getFocusOwner().s().g(b30Var);
            getSemanticsOwner().d.g(b30Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        tg80 tg80Var = (tg80) this.z0.get();
        r90 r90Var = (r90) (tg80Var != null ? tg80Var.b : null);
        if (r90Var == null) {
            return this.x0.d;
        }
        tg80 tg80Var2 = (tg80) r90Var.d.get();
        emn emnVar = (emn) (tg80Var2 != null ? tg80Var2.b : null);
        return emnVar != null && (emnVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(t60.a(getContext()));
        ytw<jxo> ytwVar = this.y.b;
        if (ytwVar != null) {
            ((x5a0) ytwVar).setValue(new jxo(od0.a(this)));
        }
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 31 ? configuration.fontWeightAdjustment : 0) != this.D0) {
            this.D0 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(k8i.a(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection n5yVar;
        int i2;
        int i3;
        int i4;
        int i5;
        tg80 tg80Var = (tg80) this.z0.get();
        r90 r90Var = (r90) (tg80Var != null ? tg80Var.b : null);
        if (r90Var == null) {
            wjf0 wjf0Var = this.x0;
            if (wjf0Var.d) {
                bcn bcnVar = wjf0Var.h;
                ijf0 ijf0Var = wjf0Var.g;
                int i6 = bcnVar.e;
                boolean z = bcnVar.a;
                if (i6 == 1) {
                    i2 = z ? 6 : 0;
                } else if (i6 == 0) {
                    i2 = 1;
                } else if (i6 == 2) {
                    i2 = 2;
                } else if (i6 == 6) {
                    i2 = 5;
                } else if (i6 == 5) {
                    i2 = 7;
                } else if (i6 == 3) {
                    i2 = 3;
                } else if (i6 == 4) {
                    i2 = 4;
                } else {
                    if (i6 != 7) {
                        ib5.a("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i2;
                int i7 = bcnVar.d;
                if (i7 != 1) {
                    if (i7 == 2) {
                        editorInfo.inputType = 1;
                        i2 |= Integer.MIN_VALUE;
                        editorInfo.imeOptions = i2;
                    } else if (i7 == 3) {
                        editorInfo.inputType = 2;
                        i3 = 2;
                    } else if (i7 == 4) {
                        editorInfo.inputType = 3;
                        i3 = 3;
                    } else if (i7 == 5) {
                        i3 = 17;
                        editorInfo.inputType = 17;
                    } else if (i7 == 6) {
                        i3 = 33;
                        editorInfo.inputType = 33;
                    } else if (i7 == 7) {
                        i3 = 129;
                        editorInfo.inputType = 129;
                    } else if (i7 == 8) {
                        i3 = 18;
                        editorInfo.inputType = 18;
                    } else {
                        if (i7 != 9) {
                            ib5.a("Invalid Keyboard Type");
                            return null;
                        }
                        i3 = 8194;
                        editorInfo.inputType = 8194;
                    }
                    i4 = i3;
                    if (!z && (i3 & 1) == 1) {
                        i4 |= 131072;
                        editorInfo.inputType = i4;
                        if (i6 == 1) {
                            editorInfo.imeOptions = 1073741824 | i2;
                        }
                    }
                    if ((i4 & 1) == 1) {
                        i5 = bcnVar.b;
                        if (i5 == 1) {
                            i4 |= 4096;
                            editorInfo.inputType = i4;
                        } else if (i5 == 2) {
                            i4 |= 8192;
                            editorInfo.inputType = i4;
                        } else if (i5 == 3) {
                            i4 |= Http2.INITIAL_MAX_FRAME_SIZE;
                            editorInfo.inputType = i4;
                        }
                        if (bcnVar.c) {
                            editorInfo.inputType = 32768 | i4;
                        }
                    }
                    long j2 = ijf0Var.b;
                    int i8 = ulf0.c;
                    editorInfo.initialSelStart = (int) (j2 >> 32);
                    editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                    wvf.c(editorInfo, ijf0Var.a.b);
                    editorInfo.imeOptions |= 33554432;
                    if (androidx.emoji2.text.d.d()) {
                        androidx.emoji2.text.d.a().i(editorInfo);
                    }
                    hk40 hk40Var = new hk40(wjf0Var.g, new yjf0(wjf0Var), wjf0Var.h.c);
                    wjf0Var.i.add(new WeakReference(hk40Var));
                    return hk40Var;
                }
                editorInfo.inputType = 1;
                i3 = 1;
                i4 = i3;
                if (!z) {
                    i4 |= 131072;
                    editorInfo.inputType = i4;
                    if (i6 == 1) {
                        editorInfo.imeOptions = 1073741824 | i2;
                    }
                }
                if ((i4 & 1) == 1) {
                    i5 = bcnVar.b;
                    if (i5 == 1) {
                        i4 |= 4096;
                        editorInfo.inputType = i4;
                    } else if (i5 == 2) {
                        i4 |= 8192;
                        editorInfo.inputType = i4;
                    } else if (i5 == 3) {
                        i4 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        editorInfo.inputType = i4;
                    }
                    if (bcnVar.c) {
                        editorInfo.inputType = 32768 | i4;
                    }
                }
                long j3 = ijf0Var.b;
                int i9 = ulf0.c;
                editorInfo.initialSelStart = (int) (j3 >> 32);
                editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
                wvf.c(editorInfo, ijf0Var.a.b);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.d.d()) {
                    androidx.emoji2.text.d.a().i(editorInfo);
                }
                hk40 hk40Var2 = new hk40(wjf0Var.g, new yjf0(wjf0Var), wjf0Var.h.c);
                wjf0Var.i.add(new WeakReference(hk40Var2));
                return hk40Var2;
            }
        } else {
            tg80 tg80Var2 = (tg80) r90Var.d.get();
            emn emnVar = (emn) (tg80Var2 != null ? tg80Var2.b : null);
            if (emnVar != null) {
                synchronized (emnVar.c) {
                    if (emnVar.e) {
                        return null;
                    }
                    ik40 ik40VarA = emnVar.a.a(editorInfo);
                    dmn dmnVar = new dmn(emnVar);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 34) {
                        n5yVar = new o5y(ik40VarA, dmnVar);
                    } else {
                        n5yVar = i10 >= 25 ? new n5y(ik40VarA, dmnVar) : new m5y(ik40VarA, dmnVar);
                    }
                    emnVar.d.b(new lyi0(n5yVar));
                    return n5yVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        e60 e60Var = this.contentCaptureManager;
        e60Var.getClass();
        e60.b.b(e60Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x20 x20Var;
        super.onDetachedFromWindow();
        this.insetsListener.onViewDetachedFromWindow(this);
        if (this.f) {
            View view = this.e;
            if (view == null) {
                Intrinsics.n("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            etw<AndroidComposeView> etwVar = b1;
            synchronized (etwVar) {
                etwVar.j(this);
                Unit unit = Unit.a;
            }
        }
        r6a0 r6a0Var = getSnapshotObserver().a;
        b5a0 b5a0Var = r6a0Var.h;
        if (b5a0Var != null) {
            b5a0Var.a();
        }
        r6a0Var.a();
        c1s c1sVar = this.y;
        if (c1sVar.b == null) {
            c1sVar.a = null;
        }
        b viewTreeOwners = getViewTreeOwners();
        s9s lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw w20.a("No lifecycle owner exists");
        }
        lifecycle.d(this.contentCaptureManager);
        lifecycle.d(this);
        if (H() && (x20Var = this.V) != null) {
            ul1.a.b(x20Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.u0);
        getViewTreeObserver().removeOnScrollChangedListener(this.v0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.w0);
        if (i2 >= 31) {
            n50.a.a(this);
        }
        b30 b30Var = this._autofillManager;
        if (b30Var != null) {
            getSemanticsOwner().d.j(b30Var);
            getFocusOwner().s().j(b30Var);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.i0.j(this.S0);
        this.g0 = null;
        X();
        if (this.f0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        whv whvVar = this.i0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                N(getRoot());
            }
            long J = J(i2);
            nbh0.a aVar = nbh0.b;
            long J2 = J(i3);
            long jA = kxa.a.a((int) (J >>> 32), (int) (J & 4294967295L), (int) (J2 >>> 32), (int) (4294967295L & J2));
            kxa kxaVar = this.g0;
            if (kxaVar == null) {
                this.g0 = new kxa(jA);
                this.h0 = false;
            } else if (!kxa.c(kxaVar.a, jA)) {
                this.h0 = true;
            }
            whvVar.q(jA);
            whvVar.l();
            setMeasuredDimension(getRoot().V.p.a, getRoot().V.p.b);
            if (this.f0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().V.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().V.p.b, 1073741824));
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (!H() || viewStructure == null) {
            return;
        }
        b30 b30Var = this._autofillManager;
        if (b30Var != null) {
            tsr tsrVar = b30Var.b.a;
            AutofillId autofillId = b30Var.g;
            String str = b30Var.e;
            rk40 rk40Var = b30Var.d;
            a420.a(viewStructure, tsrVar, autofillId, str, rk40Var);
            Object[] objArr = dcy.a;
            etw etwVar = new etw(2);
            etwVar.g(tsrVar);
            etwVar.g(viewStructure);
            while (etwVar.e()) {
                Object objK = etwVar.k(etwVar.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = etwVar.k(etwVar.b - 1);
                objK2.getClass();
                List<ua80> listM = ((ua80) objK2).m();
                int size = listM.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ua80 ua80Var = listM.get(i3);
                    if (!ua80Var.n() && ua80Var.e() && ua80Var.i()) {
                        sa80 sa80VarF = ua80Var.f();
                        if (sa80VarF != null) {
                            rtw<ob80<?>, Object> rtwVar = sa80VarF.a;
                            if (rtwVar.a(ra80.g) || rtwVar.a(hb80.q) || rtwVar.a(hb80.r)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                a420.a(viewStructureNewChild, ua80Var, b30Var.g, str, rk40Var);
                                etwVar.g(ua80Var);
                                etwVar.g(viewStructureNewChild);
                            } else {
                                etwVar.g(ua80Var);
                                etwVar.g(viewStructure2);
                            }
                        } else {
                            etwVar.g(ua80Var);
                            etwVar.g(viewStructure2);
                        }
                    }
                }
            }
        }
        x20 x20Var = this.V;
        if (x20Var != null) {
            am1 am1Var = x20Var.b;
            LinkedHashMap linkedHashMap = am1Var.a;
            LinkedHashMap linkedHashMap2 = am1Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                zl1 zl1Var = (zl1) entry.getValue();
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                pl1.c(viewStructureNewChild2, x20Var.d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, x20Var.a.getContext().getPackageName(), null, null);
                pl1.d(viewStructureNewChild2, 1);
                zl1Var.getClass();
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        g020 g020VarC;
        int toolType = motionEvent.getToolType(i2);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (g020VarC = getPointerIconService().c()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        Context context = getContext();
        if (g020VarC instanceof s90) {
            return null;
        }
        return g020VarC instanceof t90 ? PointerIcon.getSystemIcon(context, ((t90) g020VarC).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a.a());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        asr asrVar;
        if (this.b) {
            if (i2 != 0) {
                asrVar = i2 != 1 ? null : asr.b;
            } else {
                asrVar = asr.a;
            }
            if (asrVar == null) {
                asrVar = asr.a;
            }
            setLayoutDirection(asrVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ap70 ap70Var;
        if (Build.VERSION.SDK_INT < 31 || (ap70Var = this.V0) == null) {
            return;
        }
        ap70Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(final LongSparseArray<ViewTranslationResponse> longSparseArray) {
        final e60 e60Var = this.contentCaptureManager;
        e60Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            e60.b.a(e60Var, longSparseArray);
        } else {
            e60Var.a.post(new Runnable() { // from class: h60
                @Override // java.lang.Runnable
                public final void run() {
                    e60.b.a(e60Var, longSparseArray);
                }
            });
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        ((x5a0) this.y.c).setValue(Boolean.valueOf(z));
        this.U0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zA = a.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        M(getRoot());
    }

    @Override // defpackage.wgz
    public final void p(tsr tsrVar) {
        b30 b30Var;
        getLayoutNodes().g(tsrVar.b);
        whv whvVar = this.i0;
        iae iaeVar = whvVar.b;
        iaeVar.a.b(tsrVar);
        iaeVar.b.b(tsrVar);
        iaeVar.c.b(tsrVar);
        ((duw) whvVar.e.a).j(tsrVar);
        this.a0 = true;
        getRectManager().j(tsrVar);
        if (H() && (b30Var = this._autofillManager) != null && b30Var.h.e(tsrVar.b)) {
            b30Var.a.e(b30Var.c, tsrVar.b, false);
        }
    }

    @Override // defpackage.wgz
    public final void q() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            Method declaredMethod = d1;
            if (declaredMethod == null) {
                declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                d1 = declaredMethod;
            }
            declaredMethod.invoke(viewTreeObserver, null);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.wgz
    public final void r(tsr tsrVar, boolean z, boolean z2) {
        ysr ysrVar = tsrVar.V;
        whv whvVar = this.i0;
        if (!z) {
            whvVar.getClass();
            int iOrdinal = ysrVar.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                uhc.a();
                return;
            }
            tsr tsrVarH = tsrVar.H();
            boolean z3 = tsrVarH == null || tsrVarH.i();
            if (!z2) {
                if (tsrVar.D()) {
                    return;
                }
                if (tsrVar.C() && tsrVar.i() == z3 && tsrVar.i() == ysrVar.p.J) {
                    return;
                }
            }
            zhv zhvVar = ysrVar.p;
            zhvVar.L = true;
            zhvVar.M = true;
            if (!tsrVar.f0 && zhvVar.J && z3) {
                if ((tsrVarH == null || !tsrVarH.C()) && (tsrVarH == null || !tsrVarH.D())) {
                    whvVar.b.a(tsrVar, i0p.d);
                }
                if (whvVar.d) {
                    return;
                }
                U(null);
                return;
            }
            return;
        }
        iae iaeVar = whvVar.b;
        int iOrdinal2 = ysrVar.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    uhc.a();
                    return;
                }
            }
        }
        if ((ysrVar.e || ysrVar.f) && !z2) {
            return;
        }
        ysrVar.f = true;
        ysrVar.g = true;
        zhv zhvVar2 = ysrVar.p;
        zhvVar2.L = true;
        zhvVar2.M = true;
        if (tsrVar.f0) {
            return;
        }
        tsr tsrVarH2 = tsrVar.H();
        if (Intrinsics.g(tsrVar.T(), Boolean.TRUE) && ((tsrVarH2 == null || !tsrVarH2.V.e) && (tsrVarH2 == null || !tsrVarH2.V.f))) {
            iaeVar.a(tsrVar, i0p.b);
        } else if (tsrVar.i() && ((tsrVarH2 == null || !tsrVarH2.C()) && (tsrVarH2 == null || !tsrVarH2.D()))) {
            iaeVar.a(tsrVar, i0p.d);
        }
        if (whvVar.d) {
            return;
        }
        U(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().m().b()) {
            return super.requestFocus(i2, rect);
        }
        t3i t3iVarF = x2d.f(i2);
        int i3 = t3iVarF != null ? t3iVarF.a : 7;
        return Intrinsics.g(getFocusOwner().a(i3, rect != null ? ok40.d(rect) : null, new n(i3)), Boolean.TRUE);
    }

    @Override // defpackage.wgz
    public final void s(tsr tsrVar, long j2) {
        whv whvVar = this.i0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            whvVar.k(tsrVar, j2);
            if (!whvVar.b.c()) {
                whvVar.a(false);
                if (this.R) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.R = false;
                }
            }
            getRectManager().b();
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.J.h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setContentCaptureManager$ui_release(e60 e60Var) {
        this.contentCaptureManager = e60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.ui.d$c] */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        ?? r9 = getRoot().U.f;
        if (r9 instanceof yje0) {
            ((yje0) r9).O0();
        }
        if (!r9.a.C) {
            wkn.c("visitSubtreeIf called on an unattached node");
        }
        duw duwVar = new duw(new androidx.compose.ui.d.c[16]);
        androidx.compose.ui.d.c cVar = r9.a;
        androidx.compose.ui.d.c cVar2 = cVar.f;
        if (cVar2 == null) {
            pkd.a(duwVar, cVar);
        } else {
            duwVar.b(cVar2);
        }
        while (true) {
            int i2 = duwVar.c;
            if (i2 == 0) {
                return;
            }
            androidx.compose.ui.d.c cVar3 = (androidx.compose.ui.d.c) duwVar.k(i2 - 1);
            if ((cVar3.d & 16) != 0) {
                for (androidx.compose.ui.d.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.f) {
                    if ((cVar4.c & 16) != 0) {
                        ?? C = cVar4;
                        ?? duwVar2 = 0;
                        while (C != 0) {
                            if (C instanceof s020) {
                                s020 s020Var = (s020) C;
                                if (s020Var instanceof yje0) {
                                    ((yje0) s020Var).O0();
                                }
                            } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                                androidx.compose.ui.d.c cVar5 = ((tkd) C).E;
                                int i3 = 0;
                                C = C;
                                duwVar2 = duwVar2;
                                while (cVar5 != null) {
                                    if ((cVar5.c & 16) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            duwVar2 = duwVar2;
                                            C = cVar5;
                                        } else {
                                            if (duwVar2 == 0) {
                                                duwVar2 = new duw(new androidx.compose.ui.d.c[16]);
                                            }
                                            if (C != 0) {
                                                duwVar2.b(C);
                                                C = 0;
                                            }
                                            duwVar2.b(cVar5);
                                        }
                                    }
                                    cVar5 = cVar5.f;
                                    C = C;
                                    duwVar2 = duwVar2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            C = pkd.c(duwVar2);
                        }
                    }
                }
            }
            pkd.a(duwVar, cVar3);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.lastMatrixRecalculationAnimationTime = j2;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super b, Unit> callback) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.t0 = callback;
    }

    @Override // defpackage.wgz
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(fw50.a handler) {
        this.i0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.wgz
    public final long t(long j2) {
        R();
        return ddv.b(this.n0, j2);
    }

    @Override // defpackage.wgz
    public final void u(float f2) {
        if (this.f) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.N0) || f2 > this.N0) {
                    this.N0 = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.O0) || f2 < this.O0) {
                    this.O0 = f2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wgz
    public final void v(Function2 function2, x1b x1bVar) {
        y40 y40Var;
        if (x1bVar instanceof y40) {
            y40Var = (y40) x1bVar;
            int i2 = y40Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y40Var.c = i2 - Integer.MIN_VALUE;
            } else {
                y40Var = new y40(this, x1bVar);
            }
        } else {
            y40Var = new y40(this, x1bVar);
        }
        Object obj = y40Var.a;
        y5b y5bVar = y5b.a;
        int i3 = y40Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            z40 z40Var = new z40(this);
            y40Var.c = 1;
            if (w5b.d(new ug80(z40Var, this.z0, function2, null), y40Var) == y5bVar) {
                return;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            uj50.b(obj);
        }
        fkd.a();
    }

    @Override // defpackage.j620
    public final long w(long j2) {
        R();
        long jB = ddv.b(this.m0, j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.q0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.q0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // defpackage.wgz
    public final void x(Function0<Unit> function0) {
        etw<Function0<Unit>> etwVar = this.M0;
        if (etwVar.c(function0) >= 0) {
            return;
        }
        etwVar.g(function0);
    }

    @Override // defpackage.wgz
    public final void y(int i2, tsr tsrVar) {
        getLayoutNodes().g(i2);
        getLayoutNodes().h(tsrVar.b, tsrVar);
    }

    @Override // defpackage.wgz
    public final void z() {
        etw<Function0<Unit>> etwVar;
        b30 b30Var;
        r6a0.a[] aVarArr;
        if (this.a0) {
            r6a0 r6a0Var = getSnapshotObserver().a;
            ygz ygzVar = ygz.a;
            synchronized (r6a0Var.g) {
                try {
                    duw<r6a0.a> duwVar = r6a0Var.f;
                    int i2 = duwVar.c;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        aVarArr = duwVar.a;
                        if (i3 >= i2) {
                            break;
                        }
                        r6a0.a aVar = aVarArr[i3];
                        aVar.e(ygzVar);
                        if (!aVar.f.f()) {
                            i4++;
                        } else if (i4 > 0) {
                            r6a0.a[] aVarArr2 = duwVar.a;
                            aVarArr2[i3 - i4] = aVarArr2[i3];
                        }
                        i3++;
                    }
                    int i5 = i2 - i4;
                    Arrays.fill(aVarArr, i5, i2, (Object) null);
                    duwVar.c = i5;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f0;
        if (androidViewsHandler != null) {
            I(androidViewsHandler);
        }
        if (H() && (b30Var = this._autofillManager) != null) {
            nsw nswVar = b30Var.h;
            if (nswVar.d == 0 && b30Var.i) {
                b30Var.a.a();
                b30Var.i = false;
            }
            if (nswVar.d != 0) {
                b30Var.i = true;
            }
        }
        while (this.M0.e() && this.M0.b(0) != null) {
            int i6 = this.M0.b;
            int i7 = 0;
            while (true) {
                etwVar = this.M0;
                if (i7 < i6) {
                    Function0<Unit> function0B = etwVar.b(i7);
                    etw<Function0<Unit>> etwVar2 = this.M0;
                    if (i7 < 0 || i7 >= etwVar2.b) {
                        etwVar2.f(i7);
                        throw null;
                    }
                    Object[] objArr = etwVar2.a;
                    Object obj = objArr[i7];
                    objArr[i7] = null;
                    if (function0B != null) {
                        function0B.invoke();
                    }
                    i7++;
                }
            }
            etwVar.l(0, i6);
        }
    }

    @Override // defpackage.wgz
    public q20 getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // defpackage.wgz
    public k40 getClipboard() {
        return this.clipboard;
    }

    @Override // defpackage.wgz
    public l40 getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // defpackage.wgz
    public a70 getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    public msw<tsr> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i2;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        Unit unit = Unit.a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public final void setUncaughtExceptionHandler$ui_release(fw50.a aVar) {
    }
}
