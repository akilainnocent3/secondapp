package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.google.protobuf.Reader;
import defpackage.a50;
import defpackage.a6c;
import defpackage.asr;
import defpackage.b50;
import defpackage.b9z;
import defpackage.bb80;
import defpackage.bwo;
import defpackage.bxz;
import defpackage.bza;
import defpackage.c50;
import defpackage.c6;
import defpackage.c7;
import defpackage.cb80;
import defpackage.d7;
import defpackage.d77;
import defpackage.dtw;
import defpackage.e50;
import defpackage.e6;
import defpackage.eb80;
import defpackage.esa0;
import defpackage.eyg0;
import defpackage.f50;
import defpackage.f6;
import defpackage.f8i;
import defpackage.fkd;
import defpackage.fsa0;
import defpackage.g50;
import defpackage.gaj;
import defpackage.gb80;
import defpackage.gly;
import defpackage.gt7;
import defpackage.gwo;
import defpackage.h50;
import defpackage.h9a;
import defpackage.hb5;
import defpackage.hb80;
import defpackage.hce0;
import defpackage.hwo;
import defpackage.i50;
import defpackage.ib5;
import defpackage.ib80;
import defpackage.ixo;
import defpackage.j90;
import defpackage.kc6;
import defpackage.kjf0;
import defpackage.ksw;
import defpackage.kzf0;
import defpackage.ljf0;
import defpackage.lk40;
import defpackage.lsw;
import defpackage.lz50;
import defpackage.m230;
import defpackage.m2g;
import defpackage.mae0;
import defpackage.mmd;
import defpackage.msw;
import defpackage.n9i;
import defpackage.nk0;
import defpackage.nsw;
import defpackage.nxh0;
import defpackage.o6;
import defpackage.o70;
import defpackage.o9i;
import defpackage.ob80;
import defpackage.ois;
import defpackage.ora0;
import defpackage.owo;
import defpackage.qk0;
import defpackage.qlr;
import defpackage.qx80;
import defpackage.r58;
import defpackage.ra80;
import defpackage.rfs;
import defpackage.rmh0;
import defpackage.rtw;
import defpackage.s9s;
import defpackage.sa80;
import defpackage.sp70;
import defpackage.su50;
import defpackage.t9i;
import defpackage.ta80;
import defpackage.tb5;
import defpackage.tb80;
import defpackage.tsr;
import defpackage.tx0;
import defpackage.u38;
import defpackage.uhc;
import defpackage.ukf0;
import defpackage.ulf0;
import defpackage.v1k;
import defpackage.v38;
import defpackage.vb80;
import defpackage.vbh0;
import defpackage.vo70;
import defpackage.w20;
import defpackage.w38;
import defpackage.wkn;
import defpackage.wrs;
import defpackage.x38;
import defpackage.xvo;
import defpackage.xx0;
import defpackage.yef0;
import defpackage.yl0;
import defpackage.ywx;
import defpackage.zby;
import defpackage.zk1;
import defpackage.zkh;
import defpackage.zra0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e6 {
    public static final lsw Q;
    public boolean A;
    public d B;
    public msw C;
    public final nsw D;
    public final ksw E;
    public final ksw F;
    public final String G;
    public final String H;
    public final vbh0 I;
    public final msw<cb80> J;
    public cb80 K;
    public boolean L;
    public final ksw M;
    public final c50 N;
    public final ArrayList O;
    public final f P;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final e f = new e();
    public final AccessibilityManager g;
    public long h;
    public final a50 i;
    public final b50 j;
    public List<AccessibilityServiceInfo> k;
    public final Handler l;
    public final C0048c m;
    public int n;
    public int o;
    public c7 p;
    public c7 q;
    public boolean r;
    public final msw<vo70> s;
    public final msw<vo70> t;
    public final esa0<esa0<CharSequence>> u;
    public final esa0<dtw<CharSequence>> v;
    public int w;
    public Integer x;
    public final tx0<tsr> y;
    public final tb5 z;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            c cVar = c.this;
            AccessibilityManager accessibilityManager = cVar.g;
            cVar.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            accessibilityManager.addAccessibilityStateChangeListener(cVar.i);
            accessibilityManager.addTouchExplorationStateChangeListener(cVar.j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            c cVar = c.this;
            cVar.l.removeCallbacks(cVar.N);
            AccessibilityManager accessibilityManager = cVar.g;
            accessibilityManager.removeAccessibilityStateChangeListener(cVar.i);
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar.j);
        }
    }

    public static final class b {
        public static final void a(c7 c7Var, bb80 bb80Var) {
            sa80 sa80Var = bb80Var.d;
            su50 su50Var = (su50) ta80.a(sa80Var, hb80.x);
            if (i50.a(bb80Var)) {
                if (su50Var != null && su50Var.a == 8) {
                    return;
                }
                c6 c6Var = (c6) ta80.a(sa80Var, ra80.x);
                if (c6Var != null) {
                    c7Var.b(new c7.a(R.id.accessibilityActionPageUp, c6Var.a));
                }
                c6 c6Var2 = (c6) ta80.a(sa80Var, ra80.z);
                if (c6Var2 != null) {
                    c7Var.b(new c7.a(R.id.accessibilityActionPageDown, c6Var2.a));
                }
                c6 c6Var3 = (c6) ta80.a(sa80Var, ra80.y);
                if (c6Var3 != null) {
                    c7Var.b(new c7.a(R.id.accessibilityActionPageLeft, c6Var3.a));
                }
                c6 c6Var4 = (c6) ta80.a(sa80Var, ra80.A);
                if (c6Var4 != null) {
                    c7Var.b(new c7.a(R.id.accessibilityActionPageRight, c6Var4.a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$c, reason: collision with other inner class name */
    public final class C0048c extends d7 {
        public C0048c() {
        }

        @Override // defpackage.d7
        public final void a(int i, c7 c7Var, String str, Bundle bundle) {
            c.this.j(i, c7Var, str, bundle);
        }

        @Override // defpackage.d7
        public final c7 c(int i) {
            c cVar = c.this;
            if (i != 1) {
                if (i == 2) {
                    return b(cVar.n);
                }
                hb5.a(hce0.a(i, "Unknown focus type: "));
                return null;
            }
            int i2 = cVar.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:115:0x0217  */
        /* JADX WARN: Code duplicated, block: B:15:0x004f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0053  */
        /* JADX WARN: Code duplicated, block: B:191:0x036c  */
        /* JADX WARN: Code duplicated, block: B:193:0x0370  */
        /* JADX WARN: Code duplicated, block: B:194:0x0372  */
        /* JADX WARN: Code duplicated, block: B:197:0x0377  */
        /* JADX WARN: Code duplicated, block: B:198:0x0379  */
        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Code duplicated, block: B:201:0x037f  */
        /* JADX WARN: Code duplicated, block: B:202:0x0381  */
        /* JADX WARN: Code duplicated, block: B:205:0x0387  */
        /* JADX WARN: Code duplicated, block: B:206:0x0389  */
        /* JADX WARN: Code duplicated, block: B:209:0x038f  */
        /* JADX WARN: Code duplicated, block: B:210:0x0391  */
        /* JADX WARN: Code duplicated, block: B:213:0x0397  */
        /* JADX WARN: Code duplicated, block: B:214:0x0399  */
        /* JADX WARN: Code duplicated, block: B:221:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:228:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:231:0x03b6  */
        /* JADX WARN: Code duplicated, block: B:233:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:235:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:237:0x03e4  */
        /* JADX WARN: Code duplicated, block: B:240:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:243:0x0400  */
        /* JADX WARN: Code duplicated, block: B:245:0x0405  */
        /* JADX WARN: Code duplicated, block: B:247:0x040b  */
        /* JADX WARN: Code duplicated, block: B:250:0x0412  */
        /* JADX WARN: Code duplicated, block: B:252:0x0424  */
        /* JADX WARN: Code duplicated, block: B:254:0x043f  */
        /* JADX WARN: Code duplicated, block: B:259:0x045a  */
        /* JADX WARN: Code duplicated, block: B:263:0x0467  */
        /* JADX WARN: Code duplicated, block: B:265:0x0473 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:300:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:303:0x04fe A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:305:0x0502  */
        /* JADX WARN: Code duplicated, block: B:306:0x0507  */
        /* JADX WARN: Code duplicated, block: B:308:0x0514 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:309:0x0516  */
        /* JADX WARN: Code duplicated, block: B:312:0x051b  */
        /* JADX WARN: Code duplicated, block: B:315:0x0522  */
        /* JADX WARN: Code duplicated, block: B:317:0x052a  */
        /* JADX WARN: Code duplicated, block: B:324:0x0547  */
        /* JADX WARN: Code duplicated, block: B:326:0x054b  */
        /* JADX WARN: Code duplicated, block: B:327:0x0554  */
        /* JADX WARN: Code duplicated, block: B:329:0x055c  */
        /* JADX WARN: Code duplicated, block: B:378:0x062b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:379:0x062d  */
        /* JADX WARN: Code duplicated, block: B:381:0x063b  */
        /* JADX WARN: Code duplicated, block: B:382:0x063d  */
        /* JADX WARN: Code duplicated, block: B:386:0x0643  */
        /* JADX WARN: Code duplicated, block: B:388:0x0649  */
        /* JADX WARN: Code duplicated, block: B:391:0x0657  */
        /* JADX WARN: Code duplicated, block: B:396:0x0665  */
        /* JADX WARN: Code duplicated, block: B:409:0x067e  */
        /* JADX WARN: Code duplicated, block: B:414:0x0690  */
        /* JADX WARN: Code duplicated, block: B:421:0x06a2  */
        /* JADX WARN: Code duplicated, block: B:423:0x06a6  */
        /* JADX WARN: Code duplicated, block: B:425:0x06b3  */
        /* JADX WARN: Code duplicated, block: B:427:0x06b7  */
        /* JADX WARN: Code duplicated, block: B:448:0x072d  */
        /* JADX WARN: Code duplicated, block: B:450:0x0733 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:451:0x0735  */
        /* JADX WARN: Code duplicated, block: B:452:0x0737  */
        /* JADX WARN: Code duplicated, block: B:455:0x073e  */
        /* JADX WARN: Code duplicated, block: B:456:0x0743  */
        /* JADX WARN: Code duplicated, block: B:459:0x074b  */
        /* JADX WARN: Code duplicated, block: B:461:0x0753  */
        /* JADX WARN: Code duplicated, block: B:473:0x0774 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:474:0x0776  */
        /* JADX WARN: Code duplicated, block: B:475:0x0778  */
        /* JADX WARN: Code duplicated, block: B:478:0x077c  */
        /* JADX WARN: Code duplicated, block: B:479:0x077e  */
        /* JADX WARN: Code duplicated, block: B:482:0x0790  */
        /* JADX WARN: Code duplicated, block: B:484:0x0794  */
        /* JADX WARN: Code duplicated, block: B:486:0x07a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:488:0x07a9  */
        /* JADX WARN: Code restructure failed: missing block: B:502:0x018b, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:19:0x0057, please report this as an issue */
        @Override // defpackage.d7
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(int r20, int r21, android.os.Bundle r22) {
            /*
                Method dump skipped, instruction units count: 2086
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.C0048c.d(int, int, android.os.Bundle):boolean");
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:105:0x020e  */
        /* JADX WARN: Code duplicated, block: B:106:0x0218  */
        /* JADX WARN: Code duplicated, block: B:109:0x0227  */
        /* JADX WARN: Code duplicated, block: B:111:0x0244  */
        /* JADX WARN: Code duplicated, block: B:113:0x024d  */
        /* JADX WARN: Code duplicated, block: B:118:0x02b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:119:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:121:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:123:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:126:0x02cf  */
        /* JADX WARN: Code duplicated, block: B:128:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:129:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:131:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:133:0x02ea  */
        /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:137:0x0312  */
        /* JADX WARN: Code duplicated, block: B:139:0x0316  */
        /* JADX WARN: Code duplicated, block: B:13:0x0032  */
        /* JADX WARN: Code duplicated, block: B:141:0x031c  */
        /* JADX WARN: Code duplicated, block: B:144:0x0328  */
        /* JADX WARN: Code duplicated, block: B:146:0x0332  */
        /* JADX WARN: Code duplicated, block: B:149:0x0349  */
        /* JADX WARN: Code duplicated, block: B:152:0x037a  */
        /* JADX WARN: Code duplicated, block: B:155:0x0383  */
        /* JADX WARN: Code duplicated, block: B:157:0x0393  */
        /* JADX WARN: Code duplicated, block: B:163:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:166:0x03bd  */
        /* JADX WARN: Code duplicated, block: B:168:0x03cf A[LOOP:3: B:165:0x03bb->B:168:0x03cf, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:173:0x03ee  */
        /* JADX WARN: Code duplicated, block: B:175:0x03fe  */
        /* JADX WARN: Code duplicated, block: B:181:0x041c  */
        /* JADX WARN: Code duplicated, block: B:184:0x0428  */
        /* JADX WARN: Code duplicated, block: B:186:0x043e  */
        /* JADX WARN: Code duplicated, block: B:190:0x0461  */
        /* JADX WARN: Code duplicated, block: B:192:0x046f  */
        /* JADX WARN: Code duplicated, block: B:200:0x04a1  */
        /* JADX WARN: Code duplicated, block: B:202:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:204:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:207:0x04c5  */
        /* JADX WARN: Code duplicated, block: B:210:0x04e2  */
        /* JADX WARN: Code duplicated, block: B:212:0x04f8  */
        /* JADX WARN: Code duplicated, block: B:215:0x0515  */
        /* JADX WARN: Code duplicated, block: B:217:0x0519  */
        /* JADX WARN: Code duplicated, block: B:218:0x051e  */
        /* JADX WARN: Code duplicated, block: B:220:0x0522  */
        /* JADX WARN: Code duplicated, block: B:224:0x0532  */
        /* JADX WARN: Code duplicated, block: B:226:0x0538  */
        /* JADX WARN: Code duplicated, block: B:227:0x053b  */
        /* JADX WARN: Code duplicated, block: B:229:0x0542  */
        /* JADX WARN: Code duplicated, block: B:232:0x054c  */
        /* JADX WARN: Code duplicated, block: B:237:0x055c  */
        /* JADX WARN: Code duplicated, block: B:239:0x0566  */
        /* JADX WARN: Code duplicated, block: B:240:0x056d  */
        /* JADX WARN: Code duplicated, block: B:244:0x057c  */
        /* JADX WARN: Code duplicated, block: B:246:0x057f  */
        /* JADX WARN: Code duplicated, block: B:249:0x0596 A[LOOP:7: B:245:0x057d->B:249:0x0596, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:252:0x059e  */
        /* JADX WARN: Code duplicated, block: B:255:0x05ab  */
        /* JADX WARN: Code duplicated, block: B:258:0x05b6  */
        /* JADX WARN: Code duplicated, block: B:260:0x05c0  */
        /* JADX WARN: Code duplicated, block: B:261:0x05c6  */
        /* JADX WARN: Code duplicated, block: B:264:0x05e9  */
        /* JADX WARN: Code duplicated, block: B:265:0x05ee  */
        /* JADX WARN: Code duplicated, block: B:268:0x0608  */
        /* JADX WARN: Code duplicated, block: B:270:0x061b  */
        /* JADX WARN: Code duplicated, block: B:271:0x0625  */
        /* JADX WARN: Code duplicated, block: B:272:0x062d  */
        /* JADX WARN: Code duplicated, block: B:275:0x0643  */
        /* JADX WARN: Code duplicated, block: B:277:0x0647  */
        /* JADX WARN: Code duplicated, block: B:278:0x0649 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:280:0x064c  */
        /* JADX WARN: Code duplicated, block: B:284:0x0660  */
        /* JADX WARN: Code duplicated, block: B:28:0x007c  */
        /* JADX WARN: Code duplicated, block: B:301:0x0689  */
        /* JADX WARN: Code duplicated, block: B:30:0x0089  */
        /* JADX WARN: Code duplicated, block: B:310:0x06b5  */
        /* JADX WARN: Code duplicated, block: B:312:0x06bf  */
        /* JADX WARN: Code duplicated, block: B:316:0x06d7  */
        /* JADX WARN: Code duplicated, block: B:319:0x06eb  */
        /* JADX WARN: Code duplicated, block: B:31:0x008d  */
        /* JADX WARN: Code duplicated, block: B:321:0x06f5  */
        /* JADX WARN: Code duplicated, block: B:324:0x070d  */
        /* JADX WARN: Code duplicated, block: B:327:0x0726  */
        /* JADX WARN: Code duplicated, block: B:330:0x073e  */
        /* JADX WARN: Code duplicated, block: B:332:0x0744  */
        /* JADX WARN: Code duplicated, block: B:334:0x0750  */
        /* JADX WARN: Code duplicated, block: B:335:0x0757  */
        /* JADX WARN: Code duplicated, block: B:337:0x075a  */
        /* JADX WARN: Code duplicated, block: B:34:0x0095  */
        /* JADX WARN: Code duplicated, block: B:353:0x07ba  */
        /* JADX WARN: Code duplicated, block: B:369:0x07f9  */
        /* JADX WARN: Code duplicated, block: B:36:0x009d  */
        /* JADX WARN: Code duplicated, block: B:372:0x0808  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:382:0x0834  */
        /* JADX WARN: Code duplicated, block: B:385:0x0841  */
        /* JADX WARN: Code duplicated, block: B:389:0x0862  */
        /* JADX WARN: Code duplicated, block: B:391:0x086e  */
        /* JADX WARN: Code duplicated, block: B:392:0x0874  */
        /* JADX WARN: Code duplicated, block: B:395:0x087d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:402:0x08bd  */
        /* JADX WARN: Code duplicated, block: B:405:0x08c2  */
        /* JADX WARN: Code duplicated, block: B:408:0x08df  */
        /* JADX WARN: Code duplicated, block: B:411:0x08e4  */
        /* JADX WARN: Code duplicated, block: B:419:0x0914  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:420:0x0921  */
        /* JADX WARN: Code duplicated, block: B:422:0x0932  */
        /* JADX WARN: Code duplicated, block: B:424:0x093d  */
        /* JADX WARN: Code duplicated, block: B:426:0x0951  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:430:0x095d  */
        /* JADX WARN: Code duplicated, block: B:432:0x0963  */
        /* JADX WARN: Code duplicated, block: B:433:0x0965  */
        /* JADX WARN: Code duplicated, block: B:435:0x096b  */
        /* JADX WARN: Code duplicated, block: B:437:0x0971  */
        /* JADX WARN: Code duplicated, block: B:441:0x0988  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:457:0x09e7  */
        /* JADX WARN: Code duplicated, block: B:459:0x09f9  */
        /* JADX WARN: Code duplicated, block: B:461:0x0a0f  */
        /* JADX WARN: Code duplicated, block: B:463:0x0a20  */
        /* JADX WARN: Code duplicated, block: B:467:0x0a2d  */
        /* JADX WARN: Code duplicated, block: B:469:0x0a33  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:470:0x0a36  */
        /* JADX WARN: Code duplicated, block: B:472:0x0a3a  */
        /* JADX WARN: Code duplicated, block: B:473:0x0a3d  */
        /* JADX WARN: Code duplicated, block: B:486:0x0aa2  */
        /* JADX WARN: Code duplicated, block: B:489:0x0aac  */
        /* JADX WARN: Code duplicated, block: B:491:0x0ab2  */
        /* JADX WARN: Code duplicated, block: B:493:0x0abd  */
        /* JADX WARN: Code duplicated, block: B:494:0x0ac0  */
        /* JADX WARN: Code duplicated, block: B:498:0x0acb  */
        /* JADX WARN: Code duplicated, block: B:500:0x0ad6  */
        /* JADX WARN: Code duplicated, block: B:501:0x0ad9  */
        /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:514:0x0b18  */
        /* JADX WARN: Code duplicated, block: B:517:0x0b22  */
        /* JADX WARN: Code duplicated, block: B:519:0x0b28  */
        /* JADX WARN: Code duplicated, block: B:522:0x0b38  */
        /* JADX WARN: Code duplicated, block: B:525:0x0b48  */
        /* JADX WARN: Code duplicated, block: B:528:0x0b5c  */
        /* JADX WARN: Code duplicated, block: B:530:0x0b66  */
        /* JADX WARN: Code duplicated, block: B:533:0x0b7e  */
        /* JADX WARN: Code duplicated, block: B:536:0x0b96  */
        /* JADX WARN: Code duplicated, block: B:539:0x0bac  */
        /* JADX WARN: Code duplicated, block: B:53:0x0107  */
        /* JADX WARN: Code duplicated, block: B:541:0x0bbc  */
        /* JADX WARN: Code duplicated, block: B:543:0x0bcc  */
        /* JADX WARN: Code duplicated, block: B:546:0x0bd9  */
        /* JADX WARN: Code duplicated, block: B:548:0x0bea A[LOOP:9: B:547:0x0be8->B:548:0x0bea, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:551:0x0c02  */
        /* JADX WARN: Code duplicated, block: B:553:0x0c19  */
        /* JADX WARN: Code duplicated, block: B:555:0x0c30  */
        /* JADX WARN: Code duplicated, block: B:558:0x0c39 A[LOOP:11: B:554:0x0c2e->B:558:0x0c39, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:561:0x0c3f  */
        /* JADX WARN: Code duplicated, block: B:563:0x0c4d  */
        /* JADX WARN: Code duplicated, block: B:567:0x0c66 A[LOOP:12: B:566:0x0c64->B:567:0x0c66, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:568:0x0c83  */
        /* JADX WARN: Code duplicated, block: B:56:0x0118  */
        /* JADX WARN: Code duplicated, block: B:570:0x0c8c A[LOOP:13: B:569:0x0c8a->B:570:0x0c8c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:572:0x0cb2  */
        /* JADX WARN: Code duplicated, block: B:574:0x0cc5  */
        /* JADX WARN: Code duplicated, block: B:577:0x0cd7  */
        /* JADX WARN: Code duplicated, block: B:579:0x0ce1  */
        /* JADX WARN: Code duplicated, block: B:580:0x0ce7  */
        /* JADX WARN: Code duplicated, block: B:582:0x0cf4  */
        /* JADX WARN: Code duplicated, block: B:58:0x0120  */
        /* JADX WARN: Code duplicated, block: B:590:0x0d1f  */
        /* JADX WARN: Code duplicated, block: B:601:0x0d36  */
        /* JADX WARN: Code duplicated, block: B:603:0x020a A[EDGE_INSN: B:603:0x020a->B:103:0x020a BREAK  A[LOOP:0: B:83:0x019d->B:102:0x0203], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:605:0x0203 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:606:0x0203 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:609:0x0357 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:615:0x03e4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x012e  */
        /* JADX WARN: Code duplicated, block: B:622:0x0448 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:627:0x059b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:628:0x058b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:631:0x0a22 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:632:0x0a22 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:637:0x0c3c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:638:0x0c36 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:643:0x0954 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x0135  */
        /* JADX WARN: Code duplicated, block: B:65:0x0144  */
        /* JADX WARN: Code duplicated, block: B:67:0x0147  */
        /* JADX WARN: Code duplicated, block: B:68:0x0156  */
        /* JADX WARN: Code duplicated, block: B:74:0x0167  */
        /* JADX WARN: Code duplicated, block: B:76:0x016d  */
        /* JADX WARN: Code duplicated, block: B:79:0x0187  */
        /* JADX WARN: Code duplicated, block: B:81:0x018d  */
        /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:90:0x01cf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:97:0x01f6  */
        /* JADX WARN: Instruction removed from duplicated block: B:601:0x0d36, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference failed for: r14v47, types: [android.view.ViewParent] */
        /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference failed for: r1v120, types: [m2g] */
        /* JADX WARN: Type inference failed for: r1v121, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v122, types: [m2g] */
        /* JADX WARN: Type inference failed for: r1v123, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v125, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v126, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference failed for: r6v16, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Comparable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.d7
        public final c7 b(int i) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain;
            c7 c7Var;
            int i2;
            bb80 bb80VarL;
            Integer numValueOf;
            int iIntValue;
            lsw lswVar;
            ksw kswVar;
            esa0<dtw<CharSequence>> esa0Var;
            Resources resources;
            sa80 sa80Var;
            rtw<ob80<?>, Object> rtwVar;
            su50 su50Var;
            lsw lswVar2;
            boolean zA;
            List listJ;
            int size;
            boolean z;
            int i3;
            int i4;
            ?? r8;
            nk0 nk0VarE;
            Resources resources2;
            bb80 bb80Var;
            su50 su50Var2;
            sa80 sa80Var2;
            AccessibilityNodeInfo accessibilityNodeInfo;
            SpannableString spannableString;
            ob80<String> ob80Var;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            sa80 sa80Var3;
            bb80 bb80Var2;
            kzf0 kzf0Var;
            Boolean bool;
            su50 su50Var3;
            List list;
            String str;
            String str2;
            int i5;
            Integer num;
            int iIntValue2;
            ob80<Boolean> ob80Var2;
            c cVar;
            int i6;
            int i7;
            wrs wrsVar;
            c6 c6Var;
            c6 c6Var2;
            c6 c6Var3;
            String strU;
            tsr tsrVar;
            m230 m230Var;
            u38 u38Var;
            ArrayList arrayList;
            boolean zA2;
            int size2;
            int size3;
            List<bb80> listM;
            int size4;
            int i8;
            bb80 bb80Var3;
            bb80 bb80VarL2;
            vo70 vo70Var;
            vo70 vo70Var2;
            sa80 sa80Var4;
            int iD;
            Bundle bundle;
            AndroidComposeView androidComposeView;
            int iD2;
            String str3;
            c7 c7Var2;
            AndroidViewHolder androidViewHolderB;
            AndroidViewHolder androidViewHolderB2;
            c6 c6Var4;
            c6 c6Var5;
            c6 c6Var6;
            ob80<List<a6c>> ob80Var3;
            List list2;
            lsw lswVar3;
            esa0 esa0Var2;
            int i9;
            dtw<CharSequence> dtwVarA;
            int size5;
            int i10;
            dtw dtwVar;
            lsw lswVar4;
            int[] iArr;
            int i11;
            ArrayList arrayList2;
            int size6;
            int i12;
            int size7;
            int i13;
            a6c a6cVar;
            String str4;
            int iE;
            int[] iArr2;
            int i14;
            int i15;
            int i16;
            int i17;
            c7.a aVar;
            c7.a aVar2;
            u38 u38Var2;
            ArrayList arrayList3;
            List listJ2;
            int size8;
            int i18;
            int i19;
            boolean zA3;
            int i20;
            int i21;
            bb80 bb80Var4;
            c6 c6Var7;
            float f;
            gt7 gt7Var;
            ob80<c6<Function1<Float, Boolean>>> ob80Var4;
            float fFloatValue;
            float fFloatValue2;
            float fFloatValue3;
            float fFloatValue4;
            ArrayList arrayList4;
            CharSequence charSequenceG;
            c6 c6Var8;
            c6 c6Var9;
            c6 c6Var10;
            c6 c6Var11;
            ClipDescription primaryClipDescription;
            boolean zHasMimeType;
            boolean z2;
            boolean z3;
            int i22;
            int iD3;
            bb80 bb80VarL3;
            boolean zBooleanValue;
            sa80 sa80Var5;
            ob80<Boolean> ob80Var5;
            boolean zBooleanValue2;
            f8i.a fontFamilyResolver;
            mmd density;
            vbh0 vbh0Var;
            SpannableString spannableString2;
            List<nk0.d<? extends nk0.a>> list3;
            ArrayList arrayList5;
            SpannableString spannableString3;
            ?? arrayList6;
            int size9;
            int i23;
            ?? arrayList7;
            int size10;
            int i24;
            List listA;
            int size11;
            int i25;
            nk0.d<rfs> dVar;
            int i26;
            ?? r6;
            int i27;
            rfs rfsVar;
            WeakHashMap<nk0.d<rfs>, h9a> weakHashMap;
            h9a h9aVar;
            rmh0 rmh0Var;
            WeakHashMap<rmh0, URLSpan> weakHashMap2;
            URLSpan uRLSpan;
            int size12;
            int i28;
            nk0.d<? extends nk0.a> dVar2;
            eyg0 eyg0Var;
            int i29;
            int i30;
            int size13;
            int i31;
            nk0.d<? extends nk0.a> dVar3;
            int size14;
            int i32;
            int i33;
            int i34;
            ora0 ora0VarA;
            f8i f8iVar;
            ljf0 ljf0Var;
            yef0 yef0Var;
            n9i n9iVar;
            SpannableString spannableString4;
            t9i t9iVar;
            int i35;
            int i36;
            long j;
            int i37;
            o9i o9iVar;
            int i38;
            bb80 bb80Var5;
            gwo<eb80> gwoVarT;
            int i39;
            AndroidViewHolder androidViewHolder;
            eb80 eb80VarB;
            boolean zG;
            bb80 bb80Var6;
            int i40;
            int i41;
            String strC;
            ?? parentForAccessibility;
            View view;
            s9s lifecycle;
            c cVar2 = c.this;
            AccessibilityManager accessibilityManager = cVar2.g;
            AndroidComposeView androidComposeView2 = cVar2.d;
            AndroidComposeView.b viewTreeOwners = androidComposeView2.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : lifecycle.b()) == s9s.b.a) {
                if (accessibilityManager.isEnabled()) {
                    c7Var2 = null;
                } else {
                    c7Var2 = new c7(AccessibilityNodeInfo.obtain());
                }
                cVar = cVar2;
                i5 = i;
            } else {
                eb80 eb80VarB2 = cVar2.t().b(i);
                if (eb80VarB2 == null) {
                    if (accessibilityManager.isEnabled()) {
                        c7Var2 = null;
                    } else {
                        c7Var2 = new c7(AccessibilityNodeInfo.obtain());
                    }
                    cVar = cVar2;
                    i5 = i;
                } else {
                    bb80 bb80Var7 = eb80VarB2.a;
                    sa80 sa80VarK = bb80Var7.k();
                    tsr tsrVar2 = bb80Var7.c;
                    boolean zG2 = Intrinsics.g(ta80.a(sa80VarK, hb80.n), Boolean.TRUE);
                    if (!zG2) {
                        accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        c7Var = new c7(accessibilityNodeInfoObtain);
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 34) {
                            c7.d.e(accessibilityNodeInfoObtain, zG2);
                        } else {
                            c7Var.j(64, zG2);
                        }
                        if (i == -1) {
                            parentForAccessibility = androidComposeView2.getParentForAccessibility();
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            c7Var.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            bb80VarL = bb80Var7.l();
                            if (bb80VarL != null) {
                                numValueOf = Integer.valueOf(bb80VarL.g);
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                wkn.d("semanticsNode " + i + " has null parent");
                                fkd.a();
                                return null;
                            }
                            iIntValue = numValueOf.intValue();
                            if (iIntValue == androidComposeView2.getSemanticsOwner().a().g) {
                                iIntValue = -1;
                            }
                            c7Var.b = iIntValue;
                            accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                        }
                        c7Var.c = i;
                        accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                        c7Var.k(cVar2.k(eb80VarB2));
                        lswVar = c.Q;
                        kswVar = cVar2.M;
                        esa0Var = cVar2.v;
                        resources = androidComposeView2.getContext().getResources();
                        c7Var.l("android.view.View");
                        sa80Var = bb80Var7.d;
                        rtwVar = sa80Var.a;
                        if (rtwVar.b(hb80.E)) {
                            c7Var.l("android.widget.EditText");
                        }
                        if (rtwVar.b(hb80.A)) {
                            c7Var.l("android.widget.TextView");
                        }
                        su50Var = (su50) ta80.a(sa80Var, hb80.x);
                        if (su50Var != null) {
                            i40 = su50Var.a;
                            if (bb80Var7.e) {
                                i41 = 4;
                                lswVar2 = lswVar;
                                if (bb80.j(4, bb80Var7).isEmpty()) {
                                }
                                Unit unit = Unit.a;
                            } else {
                                i41 = 4;
                                lswVar2 = lswVar;
                            }
                            if (i40 == i41) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.sportybet.android.gp.tz.R.string.tab));
                            } else if (i40 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.sportybet.android.gp.tz.R.string.switch_role));
                            } else {
                                strC = vb80.c(i40);
                                if (i40 == 5 || bb80Var7.o() || sa80Var.c) {
                                    c7Var.l(strC);
                                }
                            }
                            Unit unit2 = Unit.a;
                        } else {
                            lswVar2 = lswVar;
                        }
                        accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                        accessibilityNodeInfoObtain.setImportantForAccessibility(gb80.e(bb80Var7));
                        if (i2 >= 34) {
                            zA = o6.a(accessibilityManager);
                        } else {
                            zA = true;
                        }
                        listJ = bb80.j(4, bb80Var7);
                        size = listJ.size();
                        z = zA;
                        i3 = 0;
                        i4 = 0;
                        while (true) {
                            r8 = c7Var.a;
                            if (i4 < size) {
                                break;
                            }
                            List list4 = listJ;
                            bb80Var5 = (bb80) listJ.get(i4);
                            int i42 = size;
                            gwoVarT = cVar2.t();
                            int i43 = i4;
                            i39 = bb80Var5.g;
                            if (gwoVarT.a(i39)) {
                                androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(bb80Var5.c);
                                if (i39 != -1) {
                                    if (androidViewHolder != null) {
                                        r8.addChild(androidViewHolder);
                                    } else {
                                        eb80VarB = cVar2.t().b(i39);
                                        if (eb80VarB != null || (bb80Var6 = eb80VarB.a) == null) {
                                            zG = false;
                                        } else {
                                            zG = Intrinsics.g(ta80.a(bb80Var6.k(), hb80.n), Boolean.TRUE);
                                        }
                                        if (z || !zG) {
                                            r8.addChild(androidComposeView2, i39);
                                        }
                                    }
                                    kswVar.f(i39, i3);
                                    i3++;
                                }
                            }
                            i4 = i43 + 1;
                            size = i42;
                            listJ = list4;
                        }
                        if (i == cVar2.n) {
                            r8.setAccessibilityFocused(true);
                            c7Var.b(c7.a.i);
                        } else {
                            r8.setAccessibilityFocused(false);
                            c7Var.b(c7.a.h);
                        }
                        nk0VarE = i50.e(bb80Var7);
                        if (nk0VarE != null) {
                            fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                            density = androidComposeView2.getDensity();
                            vbh0Var = cVar2.I;
                            String str5 = nk0VarE.b;
                            list3 = nk0VarE.a;
                            spannableString2 = new SpannableString(str5);
                            arrayList5 = nk0VarE.c;
                            if (arrayList5 != null) {
                                size14 = arrayList5.size();
                                i32 = 0;
                                while (i32 < size14) {
                                    int i44 = size14;
                                    nk0.d dVar4 = (nk0.d) arrayList5.get(i32);
                                    int i45 = i32;
                                    ora0 ora0Var = (ora0) dVar4.a;
                                    i33 = dVar4.b;
                                    i34 = dVar4.c;
                                    ArrayList arrayList8 = arrayList5;
                                    ora0VarA = ora0.a(ora0Var, 0L, null, null, null, 65503);
                                    f8iVar = ora0VarA.f;
                                    su50 su50Var4 = su50Var;
                                    kjf0 kjf0Var = ora0VarA.a;
                                    ljf0Var = ora0VarA.j;
                                    Resources resources3 = resources;
                                    yef0Var = ora0VarA.m;
                                    bb80 bb80Var8 = bb80Var7;
                                    n9iVar = ora0VarA.d;
                                    sa80 sa80Var6 = sa80Var;
                                    AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                    zra0.c(spannableString2, kjf0Var.d(), i33, i34);
                                    spannableString4 = spannableString2;
                                    zra0.d(spannableString4, ora0VarA.b, density, i33, i34);
                                    mmd mmdVar = density;
                                    t9iVar = ora0VarA.c;
                                    if (t9iVar == null || n9iVar != null) {
                                        if (t9iVar == null) {
                                            t9iVar = t9i.B;
                                        }
                                        if (n9iVar != null) {
                                            i35 = n9iVar.a;
                                        } else {
                                            i35 = 0;
                                        }
                                        StyleSpan styleSpan = new StyleSpan(o70.a(t9iVar, i35));
                                        i36 = 33;
                                        spannableString4.setSpan(styleSpan, i33, i34, 33);
                                    } else {
                                        i36 = 33;
                                    }
                                    if (f8iVar != null) {
                                        if (f8iVar instanceof v1k) {
                                            spannableString4.setSpan(new TypefaceSpan(((v1k) f8iVar).f), i33, i34, i36);
                                        } else if (Build.VERSION.SDK_INT >= 28) {
                                            o9iVar = ora0VarA.e;
                                            if (o9iVar != null) {
                                                i38 = o9iVar.a;
                                            } else {
                                                i38 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                            }
                                            Object value = f8i.a.a(fontFamilyResolver, f8iVar, null, 0, i38, 6).getValue();
                                            value.getClass();
                                            i36 = 33;
                                            spannableString4.setSpan(yl0.a((Typeface) value), i33, i34, 33);
                                        } else {
                                            i36 = 33;
                                        }
                                    }
                                    if (yef0Var != null) {
                                        i37 = yef0Var.a;
                                        if ((i37 | 1) == i37) {
                                            spannableString4.setSpan(new UnderlineSpan(), i33, i34, i36);
                                        }
                                        if ((i37 | 2) == i37) {
                                            spannableString4.setSpan(new StrikethroughSpan(), i33, i34, i36);
                                        }
                                    }
                                    if (ljf0Var != null) {
                                        spannableString4.setSpan(new ScaleXSpan(ljf0Var.a), i33, i34, i36);
                                    }
                                    zra0.e(spannableString4, ora0VarA.k, i33, i34);
                                    j = ora0VarA.l;
                                    if (j != 16) {
                                        spannableString4.setSpan(new BackgroundColorSpan(r58.l(j)), i33, i34, 33);
                                    }
                                    i32 = i45 + 1;
                                    spannableString2 = spannableString4;
                                    density = mmdVar;
                                    size14 = i44;
                                    su50Var = su50Var4;
                                    resources = resources3;
                                    bb80Var7 = bb80Var8;
                                    accessibilityNodeInfoObtain = accessibilityNodeInfo3;
                                    sa80Var = sa80Var6;
                                    arrayList5 = arrayList8;
                                }
                            }
                            resources2 = resources;
                            bb80Var = bb80Var7;
                            su50Var2 = su50Var;
                            sa80Var2 = sa80Var;
                            accessibilityNodeInfo = accessibilityNodeInfoObtain;
                            spannableString3 = spannableString2;
                            int length = str5.length();
                            if (list3 != null) {
                                arrayList6 = new ArrayList(list3.size());
                                size13 = list3.size();
                                while (i31 < size13) {
                                    nk0.d<? extends nk0.a> dVar5 = list3.get(i31);
                                    dVar3 = dVar5;
                                    if (!(dVar3.a instanceof eyg0) && qk0.b(0, length, dVar3.b, dVar3.c)) {
                                        arrayList6.add(dVar5);
                                    }
                                }
                            } else {
                                arrayList6 = m2g.a;
                            }
                            arrayList6.getClass();
                            size9 = arrayList6.size();
                            while (i23 < size9) {
                                nk0.d dVar6 = (nk0.d) arrayList6.get(i23);
                                eyg0Var = (eyg0) dVar6.a;
                                i29 = dVar6.b;
                                i30 = dVar6.c;
                                if (eyg0Var instanceof nxh0) {
                                    uhc.a();
                                    return null;
                                }
                                spannableString3.setSpan(new TtsSpan.VerbatimBuilder(((nxh0) eyg0Var).a).build(), i29, i30, 33);
                            }
                            int length2 = str5.length();
                            if (list3 != null) {
                                arrayList7 = new ArrayList(list3.size());
                                size12 = list3.size();
                                while (i28 < size12) {
                                    nk0.d<? extends nk0.a> dVar7 = list3.get(i28);
                                    dVar2 = dVar7;
                                    if (!(dVar2.a instanceof rmh0) && qk0.b(0, length2, dVar2.b, dVar2.c)) {
                                        arrayList7.add(dVar7);
                                    }
                                }
                            } else {
                                arrayList7 = m2g.a;
                            }
                            arrayList7.getClass();
                            size10 = arrayList7.size();
                            while (i24 < size10) {
                                nk0.d dVar8 = (nk0.d) arrayList7.get(i24);
                                rmh0Var = (rmh0) dVar8.a;
                                int i46 = dVar8.b;
                                int i47 = dVar8.c;
                                weakHashMap2 = vbh0Var.a;
                                uRLSpan = weakHashMap2.get(rmh0Var);
                                if (uRLSpan == null) {
                                    uRLSpan = new URLSpan(rmh0Var.a);
                                    weakHashMap2.put(rmh0Var, uRLSpan);
                                }
                                spannableString3.setSpan(uRLSpan, i46, i47, 33);
                            }
                            listA = nk0VarE.a(str5.length());
                            size11 = listA.size();
                            while (i25 < size11) {
                                dVar = (nk0.d) listA.get(i25);
                                i26 = dVar.b;
                                r6 = dVar.a;
                                i27 = dVar.c;
                                if (i26 != i27) {
                                    rfsVar = (rfs) r6;
                                    if ((rfsVar instanceof rfs.b) || ((rfs.b) rfsVar).c != null) {
                                        weakHashMap = vbh0Var.c;
                                        h9aVar = weakHashMap.get(dVar);
                                        if (h9aVar == null) {
                                            h9aVar = new h9a(rfsVar);
                                            weakHashMap.put(dVar, h9aVar);
                                        }
                                        spannableString3.setSpan(h9aVar, i26, i27, 33);
                                    } else {
                                        r6.getClass();
                                        rfs.b bVar = (rfs.b) r6;
                                        nk0.d<rfs.b> dVar9 = new nk0.d<>(i26, i27, bVar);
                                        WeakHashMap<nk0.d<rfs.b>, URLSpan> weakHashMap3 = vbh0Var.b;
                                        URLSpan uRLSpan2 = weakHashMap3.get(dVar9);
                                        if (uRLSpan2 == null) {
                                            uRLSpan2 = new URLSpan(bVar.a);
                                            weakHashMap3.put(dVar9, uRLSpan2);
                                        }
                                        spannableString3.setSpan(uRLSpan2, i26, i27, 33);
                                    }
                                }
                            }
                            spannableString = (SpannableString) c.O(spannableString3);
                        } else {
                            resources2 = resources;
                            bb80Var = bb80Var7;
                            su50Var2 = su50Var;
                            sa80Var2 = sa80Var;
                            accessibilityNodeInfo = accessibilityNodeInfoObtain;
                            kswVar = kswVar;
                            spannableString = null;
                        }
                        c7Var.w(spannableString);
                        ob80Var = hb80.K;
                        if (rtwVar.b(ob80Var)) {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setContentInvalid(true);
                            sa80Var3 = sa80Var2;
                            r8.setError((CharSequence) ta80.a(sa80Var3, ob80Var));
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            sa80Var3 = sa80Var2;
                        }
                        Resources resources4 = resources2;
                        bb80Var2 = bb80Var;
                        c7Var.v(i50.d(bb80Var2, resources4));
                        r8.setCheckable(i50.c(bb80Var2));
                        kzf0Var = (kzf0) ta80.a(sa80Var3, hb80.I);
                        if (kzf0Var != null) {
                            if (kzf0Var == kzf0.a) {
                                r8.setChecked(true);
                            } else if (kzf0Var == kzf0.b) {
                                r8.setChecked(false);
                            }
                            Unit unit3 = Unit.a;
                        }
                        bool = (Boolean) ta80.a(sa80Var3, hb80.H);
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                            if (su50Var2 == null) {
                                su50Var3 = su50Var2;
                            } else {
                                su50Var3 = su50Var2;
                                if (su50Var3.a == 4) {
                                    r8.setSelected(zBooleanValue2);
                                }
                                Unit unit4 = Unit.a;
                            }
                            r8.setChecked(zBooleanValue2);
                            Unit unit5 = Unit.a;
                        } else {
                            su50Var3 = su50Var2;
                        }
                        if (sa80Var3.c || bb80Var2.m().isEmpty()) {
                            list = (List) ta80.a(sa80Var3, hb80.a);
                            if (list != null) {
                                str = (String) CollectionsKt.firstOrNull(list);
                            } else {
                                str = null;
                            }
                            c7Var.o(str);
                        }
                        str2 = (String) ta80.a(sa80Var3, hb80.y);
                        if (str2 != null) {
                            bb80VarL3 = bb80Var2;
                            while (true) {
                                if (bb80VarL3 != null) {
                                    zBooleanValue = false;
                                    break;
                                }
                                sa80Var5 = bb80VarL3.d;
                                ob80Var5 = ib80.a;
                                if (sa80Var5.a.b(ob80Var5)) {
                                    zBooleanValue = ((Boolean) sa80Var5.d(ob80Var5)).booleanValue();
                                    break;
                                }
                                bb80VarL3 = bb80VarL3.l();
                            }
                            if (zBooleanValue) {
                                accessibilityNodeInfo2.setViewIdResourceName(str2);
                            }
                        }
                        if (((Unit) ta80.a(sa80Var3, hb80.h)) != null) {
                            c7Var.p(true);
                            Unit unit6 = Unit.a;
                        }
                        i5 = i;
                        if (i5 != -1) {
                            iD3 = kswVar.d(bb80Var2.g);
                            if (iD3 != -1) {
                                accessibilityNodeInfo2.setDrawingOrder(iD3);
                                Unit unit7 = Unit.a;
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo2.setPassword(rtwVar.b(hb80.J));
                        accessibilityNodeInfo2.setEditable(rtwVar.b(hb80.M));
                        num = (Integer) ta80.a(sa80Var3, hb80.N);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        r8.setMaxTextLength(iIntValue2);
                        r8.setEnabled(i50.a(bb80Var2));
                        ob80Var2 = hb80.k;
                        r8.setFocusable(rtwVar.b(ob80Var2));
                        if (accessibilityNodeInfo2.isFocusable()) {
                            r8.setFocused(((Boolean) sa80Var3.d(ob80Var2)).booleanValue());
                            if (accessibilityNodeInfo2.isFocused()) {
                                i7 = 2;
                                c7Var.a(2);
                                cVar = cVar2;
                                cVar.o = i5;
                                i6 = 1;
                            } else {
                                cVar = cVar2;
                                i6 = 1;
                                i7 = 2;
                                c7Var.a(1);
                            }
                        } else {
                            cVar = cVar2;
                            i6 = 1;
                            i7 = 2;
                        }
                        r8.setVisibleToUser((gb80.d(bb80Var2) ? 1 : 0) ^ i6);
                        wrsVar = (wrs) ta80.a(sa80Var3, hb80.j);
                        if (wrsVar != null) {
                            i22 = wrsVar.a;
                            if (i22 == 0) {
                                i7 = i6;
                            } else if (i22 != i6) {
                                i7 = 1;
                            }
                            accessibilityNodeInfo2.setLiveRegion(i7);
                            Unit unit8 = Unit.a;
                        }
                        r8.setClickable(false);
                        c6Var = (c6) ta80.a(sa80Var3, ra80.b);
                        if (c6Var != null) {
                            boolean zG3 = Intrinsics.g(ta80.a(sa80Var3, hb80.H), Boolean.TRUE);
                            z2 = (su50Var3 == null && su50Var3.a == 4) || (su50Var3 != null && su50Var3.a == 3);
                            if (z2 || (z2 && !zG3)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            r8.setClickable(z3);
                            if (i50.a(bb80Var2) && accessibilityNodeInfo2.isClickable()) {
                                c7Var.b(new c7.a(16, c6Var.a));
                            }
                            Unit unit9 = Unit.a;
                        }
                        r8.setLongClickable(false);
                        c6Var2 = (c6) ta80.a(sa80Var3, ra80.c);
                        if (c6Var2 != null) {
                            r8.setLongClickable(true);
                            if (i50.a(bb80Var2)) {
                                c7Var.b(new c7.a(32, c6Var2.a));
                            }
                            Unit unit10 = Unit.a;
                        }
                        c6Var3 = (c6) ta80.a(sa80Var3, ra80.p);
                        if (c6Var3 != null) {
                            c7Var.b(new c7.a(Http2.INITIAL_MAX_FRAME_SIZE, c6Var3.a));
                            Unit unit11 = Unit.a;
                        }
                        if (i50.a(bb80Var2)) {
                            c6Var8 = (c6) ta80.a(sa80Var3, ra80.j);
                            if (c6Var8 != null) {
                                c7Var.b(new c7.a(2097152, c6Var8.a));
                                Unit unit12 = Unit.a;
                            }
                            c6Var9 = (c6) ta80.a(sa80Var3, ra80.o);
                            if (c6Var9 != null) {
                                c7Var.b(new c7.a(R.id.accessibilityActionImeEnter, c6Var9.a));
                                Unit unit13 = Unit.a;
                            }
                            c6Var10 = (c6) ta80.a(sa80Var3, ra80.q);
                            if (c6Var10 != null) {
                                c7Var.b(new c7.a(65536, c6Var10.a));
                                Unit unit14 = Unit.a;
                            }
                            c6Var11 = (c6) ta80.a(sa80Var3, ra80.r);
                            if (c6Var11 != null) {
                                if (accessibilityNodeInfo2.isFocused()) {
                                    primaryClipDescription = androidComposeView2.getClipboardManager().a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        c7Var.b(new c7.a(32768, c6Var11.a));
                                    }
                                }
                                Unit unit15 = Unit.a;
                            }
                        }
                        strU = c.u(bb80Var2);
                        if (strU != null || strU.length() == 0) {
                            tsrVar = tsrVar2;
                        } else {
                            accessibilityNodeInfo2.setTextSelection(cVar.s(bb80Var2), cVar.r(bb80Var2));
                            c6 c6Var12 = (c6) ta80.a(sa80Var3, ra80.i);
                            c7Var.b(new c7.a(131072, c6Var12 != null ? c6Var12.a : null));
                            c7Var.a(256);
                            c7Var.a(512);
                            r8.setMovementGranularities(11);
                            List list5 = (List) ta80.a(sa80Var3, hb80.a);
                            if ((list5 == null || list5.isEmpty()) && rtwVar.b(ra80.a) && (!rtwVar.b(hb80.E) || Intrinsics.g(ta80.a(sa80Var3, ob80Var2), Boolean.TRUE))) {
                                tsrVar = tsrVar2;
                                tsr tsrVarB = i50.b(tsrVar, f50.a);
                                if (tsrVarB == null) {
                                    r8.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                } else {
                                    sa80 sa80VarF = tsrVarB.f();
                                    if (sa80VarF != null ? Intrinsics.g(ta80.a(sa80VarF, ob80Var2), Boolean.TRUE) : false) {
                                        r8.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                tsrVar = tsrVar2;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList4 = new ArrayList();
                            arrayList4.add("androidx.compose.ui.semantics.id");
                            charSequenceG = c7Var.g();
                            if (charSequenceG != null && charSequenceG.length() != 0 && rtwVar.b(ra80.a)) {
                                arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rtwVar.b(hb80.y)) {
                                arrayList4.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (rtwVar.b(hb80.O)) {
                                arrayList4.add("androidx.compose.ui.semantics.shapeType");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList4.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            c7Var.i(arrayList4);
                        }
                        m230Var = (m230) ta80.a(sa80Var3, hb80.c);
                        if (m230Var != null) {
                            f = m230Var.a;
                            gt7Var = m230Var.b;
                            ob80Var4 = ra80.h;
                            if (rtwVar.b(ob80Var4)) {
                                c7Var.l("android.widget.SeekBar");
                            } else {
                                c7Var.l("android.widget.ProgressBar");
                            }
                            if (m230Var != m230.d) {
                                r8.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) gt7Var.getStart()).floatValue(), ((Number) gt7Var.d()).floatValue(), f));
                            }
                            if (rtwVar.b(ob80Var4) && i50.a(bb80Var2)) {
                                fFloatValue = ((Number) gt7Var.d()).floatValue();
                                fFloatValue2 = ((Number) gt7Var.getStart()).floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    c7Var.b(c7.a.j);
                                }
                                fFloatValue3 = ((Number) gt7Var.getStart()).floatValue();
                                fFloatValue4 = ((Number) gt7Var.d()).floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    c7Var.b(c7.a.k);
                                }
                            }
                        }
                        if (i50.a(bb80Var2) && (c6Var7 = (c6) ta80.a(sa80Var3, ra80.h)) != null) {
                            c7Var.b(new c7.a(R.id.accessibilityActionSetProgress, c6Var7.a));
                        }
                        u38Var = (u38) ta80.a(bb80Var2.k(), hb80.f);
                        if (u38Var != null) {
                            c7Var.m(c7.e.a(u38Var.a, u38Var.b, 0));
                        } else {
                            arrayList = new ArrayList();
                            if (ta80.a(bb80Var2.k(), hb80.e) != null) {
                                listM = bb80Var2.m();
                                size4 = listM.size();
                                while (i8 < size4) {
                                    bb80Var3 = listM.get(i8);
                                    if (bb80Var3.k().a.b(hb80.H)) {
                                        arrayList.add(bb80Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zA2 = v38.a(arrayList);
                                if (zA2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zA2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                c7Var.m(c7.e.a(size2, size3, 0));
                            }
                        }
                        if (((x38) ta80.a(bb80Var2.k(), hb80.g)) != null) {
                            c7Var.n(c7.f.a(0, 0, 0, 0, false, ((Boolean) bb80Var2.k().e(hb80.H, w38.a)).booleanValue()));
                        }
                        bb80VarL2 = bb80Var2.l();
                        if (bb80VarL2 != null && ta80.a(bb80VarL2.k(), hb80.e) != null && ((u38Var2 = (u38) ta80.a(bb80VarL2.k(), hb80.f)) == null || (u38Var2.a >= 0 && u38Var2.b >= 0))) {
                            if (bb80Var2.k().a.b(hb80.H)) {
                                arrayList3 = new ArrayList();
                                listJ2 = bb80.j(4, bb80VarL2);
                                size8 = listJ2.size();
                                i18 = 0;
                                i19 = 0;
                                while (i18 < size8) {
                                    bb80Var4 = (bb80) listJ2.get(i18);
                                    List list6 = listJ2;
                                    if (bb80Var4.k().a.b(hb80.H)) {
                                        arrayList3.add(bb80Var4);
                                        if (bb80Var4.c.I() < bb80Var2.c.I()) {
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    listJ2 = list6;
                                }
                                if (!arrayList3.isEmpty()) {
                                    zA3 = v38.a(arrayList3);
                                    if (zA3) {
                                        i20 = 0;
                                    } else {
                                        i20 = i19;
                                    }
                                    if (zA3) {
                                        i21 = i19;
                                    } else {
                                        i21 = 0;
                                    }
                                    c7Var.n(c7.f.a(i20, 1, i21, 1, false, ((Boolean) bb80Var2.k().e(hb80.H, v38.a.a)).booleanValue()));
                                }
                            }
                        }
                        vo70Var = (vo70) ta80.a(sa80Var3, hb80.t);
                        c6 c6Var13 = (c6) ta80.a(sa80Var3, ra80.d);
                        if (vo70Var != null && c6Var13 != null) {
                            if (ta80.a(bb80Var2.k(), hb80.f) == null && ta80.a(bb80Var2.k(), hb80.e) == null) {
                                c7Var.l(LhMGMAwwhzjwfz.pFFaxiSN);
                            }
                            if (vo70Var.b.invoke().floatValue() > 0.0f) {
                                c7Var.t(true);
                            }
                            if (i50.a(bb80Var2)) {
                                if (c.z(vo70Var)) {
                                    c7Var.b(c7.a.j);
                                    if (tsrVar.O == asr.b) {
                                        aVar2 = c7.a.q;
                                    } else {
                                        aVar2 = c7.a.s;
                                    }
                                    c7Var.b(aVar2);
                                }
                                if (c.y(vo70Var)) {
                                    c7Var.b(c7.a.k);
                                    if (tsrVar.O == asr.b) {
                                        aVar = c7.a.s;
                                    } else {
                                        aVar = c7.a.q;
                                    }
                                    c7Var.b(aVar);
                                }
                            }
                        }
                        vo70Var2 = (vo70) ta80.a(sa80Var3, hb80.u);
                        if (vo70Var2 != null && c6Var13 != null) {
                            if (ta80.a(bb80Var2.k(), hb80.f) == null && ta80.a(bb80Var2.k(), hb80.e) == null) {
                                c7Var.l("android.widget.ScrollView");
                            }
                            if (vo70Var2.b.invoke().floatValue() > 0.0f) {
                                c7Var.t(true);
                            }
                            if (i50.a(bb80Var2)) {
                                if (c.z(vo70Var2)) {
                                    c7Var.b(c7.a.j);
                                    c7Var.b(c7.a.r);
                                }
                                if (c.y(vo70Var2)) {
                                    c7Var.b(c7.a.k);
                                    c7Var.b(c7.a.p);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            b.a(c7Var, bb80Var2);
                        }
                        c7Var.r((CharSequence) ta80.a(sa80Var3, hb80.d));
                        if (i50.a(bb80Var2)) {
                            sa80Var4 = sa80Var3;
                        } else {
                            c6Var4 = (c6) ta80.a(sa80Var3, ra80.s);
                            if (c6Var4 != null) {
                                c7Var.b(new c7.a(262144, c6Var4.a));
                                Unit unit16 = Unit.a;
                            }
                            c6Var5 = (c6) ta80.a(sa80Var3, ra80.t);
                            if (c6Var5 != null) {
                                c7Var.b(new c7.a(524288, c6Var5.a));
                                Unit unit17 = Unit.a;
                            }
                            c6Var6 = (c6) ta80.a(sa80Var3, ra80.u);
                            if (c6Var6 != null) {
                                c7Var.b(new c7.a(1048576, c6Var6.a));
                                Unit unit18 = Unit.a;
                            }
                            ob80Var3 = ra80.w;
                            if (rtwVar.b(ob80Var3)) {
                                list2 = (List) sa80Var3.d(ob80Var3);
                                lswVar3 = lswVar2;
                                if (list2.size() < lswVar3.b) {
                                    ib5.a(zk1.a(lswVar3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                i9 = 0;
                                esa0Var2 = new esa0(0);
                                dtwVarA = zby.a();
                                if (esa0Var.a) {
                                    fsa0.b(esa0Var);
                                }
                                if (bza.a(esa0Var.d, i5, esa0Var.b) >= 0) {
                                    dtwVar = (dtw) fsa0.a(esa0Var, i5);
                                    lswVar4 = new lsw();
                                    iArr = lswVar3.a;
                                    while (i9 < i11) {
                                        lswVar4.a(iArr[i9]);
                                        i9++;
                                    }
                                    arrayList2 = new ArrayList();
                                    size6 = list2.size();
                                    i12 = 0;
                                    while (i12 < size6) {
                                        int i48 = size6;
                                        a6cVar = (a6c) list2.get(i12);
                                        dtwVar.getClass();
                                        int i49 = i12;
                                        str4 = a6cVar.a;
                                        if (dtwVar.d(str4) >= 0) {
                                            iE = dtwVar.e(str4);
                                            esa0Var2.d(iE, str4);
                                            dtwVarA.h(iE, str4);
                                            iArr2 = lswVar4.a;
                                            i14 = lswVar4.b;
                                            i15 = 0;
                                            while (true) {
                                                if (i15 < i14) {
                                                    i16 = -1;
                                                    break;
                                                }
                                                i17 = i15;
                                                if (iE == iArr2[i17]) {
                                                    i16 = i17;
                                                    break;
                                                }
                                                i15 = i17 + 1;
                                            }
                                            if (i16 >= 0) {
                                                lswVar4.e(i16);
                                            }
                                            c7Var.b(new c7.a(iE, str4));
                                            Unit unit19 = Unit.a;
                                        } else {
                                            arrayList2.add(a6cVar);
                                        }
                                        i12 = i49 + 1;
                                        size6 = i48;
                                        dtwVar = dtwVar;
                                        sa80Var3 = sa80Var3;
                                    }
                                    sa80Var4 = sa80Var3;
                                    size7 = arrayList2.size();
                                    while (i13 < size7) {
                                        a6c a6cVar2 = (a6c) arrayList2.get(i13);
                                        int iC = lswVar4.c(i13);
                                        String str6 = a6cVar2.a;
                                        esa0Var2.d(iC, str6);
                                        dtwVarA.h(iC, str6);
                                        c7Var.b(new c7.a(iC, str6));
                                    }
                                } else {
                                    sa80Var4 = sa80Var3;
                                    size5 = list2.size();
                                    while (i10 < size5) {
                                        a6c a6cVar3 = (a6c) list2.get(i10);
                                        int iC2 = lswVar3.c(i10);
                                        String str7 = a6cVar3.a;
                                        esa0Var2.d(iC2, str7);
                                        dtwVarA.h(iC2, str7);
                                        c7Var.b(new c7.a(iC2, str7));
                                    }
                                }
                                cVar.u.d(i5, esa0Var2);
                                esa0Var.d(i5, dtwVarA);
                            } else {
                                sa80Var4 = sa80Var3;
                            }
                        }
                        c7Var.s(i50.f(bb80Var2, resources4));
                        iD = cVar.E.d(i5);
                        if (iD != -1) {
                            androidViewHolderB2 = vb80.b(androidComposeView2.getAndroidViewsHandler$ui_release(), iD);
                            if (androidViewHolderB2 != null) {
                                r8.setTraversalBefore(androidViewHolderB2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                r8.setTraversalBefore(androidComposeView, iD);
                            }
                            bundle = null;
                            cVar.j(i5, c7Var, cVar.G, null);
                        } else {
                            bundle = null;
                            androidComposeView = androidComposeView2;
                        }
                        iD2 = cVar.F.d(i5);
                        if (iD2 != -1 && (androidViewHolderB = vb80.b(androidComposeView.getAndroidViewsHandler$ui_release(), iD2)) != null) {
                            r8.setTraversalAfter(androidViewHolderB);
                            cVar.j(i5, c7Var, cVar.H, bundle);
                        }
                        str3 = (String) ta80.a(sa80Var4, ib80.b);
                        if (str3 != null) {
                            c7Var.l(str3);
                            Unit unit20 = Unit.a;
                        }
                        c7Var2 = c7Var;
                    } else if (Build.VERSION.SDK_INT >= 34 ? o6.a(accessibilityManager) : true) {
                        accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        c7Var = new c7(accessibilityNodeInfoObtain);
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 34) {
                            c7.d.e(accessibilityNodeInfoObtain, zG2);
                        } else {
                            c7Var.j(64, zG2);
                        }
                        if (i == -1) {
                            parentForAccessibility = androidComposeView2.getParentForAccessibility();
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            c7Var.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            bb80VarL = bb80Var7.l();
                            if (bb80VarL != null) {
                                numValueOf = Integer.valueOf(bb80VarL.g);
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                wkn.d("semanticsNode " + i + " has null parent");
                                fkd.a();
                                return null;
                            }
                            iIntValue = numValueOf.intValue();
                            if (iIntValue == androidComposeView2.getSemanticsOwner().a().g) {
                                iIntValue = -1;
                            }
                            c7Var.b = iIntValue;
                            accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                        }
                        c7Var.c = i;
                        accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                        c7Var.k(cVar2.k(eb80VarB2));
                        lswVar = c.Q;
                        kswVar = cVar2.M;
                        esa0Var = cVar2.v;
                        resources = androidComposeView2.getContext().getResources();
                        c7Var.l("android.view.View");
                        sa80Var = bb80Var7.d;
                        rtwVar = sa80Var.a;
                        if (rtwVar.b(hb80.E)) {
                            c7Var.l("android.widget.EditText");
                        }
                        if (rtwVar.b(hb80.A)) {
                            c7Var.l("android.widget.TextView");
                        }
                        su50Var = (su50) ta80.a(sa80Var, hb80.x);
                        if (su50Var != null) {
                            i40 = su50Var.a;
                            if (bb80Var7.e) {
                                i41 = 4;
                                lswVar2 = lswVar;
                            } else {
                                i41 = 4;
                                lswVar2 = lswVar;
                                if (bb80.j(4, bb80Var7).isEmpty()) {
                                }
                                Unit unit21 = Unit.a;
                            }
                            if (i40 == i41) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.sportybet.android.gp.tz.R.string.tab));
                            } else if (i40 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.sportybet.android.gp.tz.R.string.switch_role));
                            } else {
                                strC = vb80.c(i40);
                                if (i40 == 5) {
                                    c7Var.l(strC);
                                } else {
                                    c7Var.l(strC);
                                }
                            }
                            Unit unit22 = Unit.a;
                        } else {
                            lswVar2 = lswVar;
                        }
                        accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                        accessibilityNodeInfoObtain.setImportantForAccessibility(gb80.e(bb80Var7));
                        if (i2 >= 34) {
                            zA = o6.a(accessibilityManager);
                        } else {
                            zA = true;
                        }
                        listJ = bb80.j(4, bb80Var7);
                        size = listJ.size();
                        z = zA;
                        i3 = 0;
                        i4 = 0;
                        while (true) {
                            r8 = c7Var.a;
                            if (i4 < size) {
                                break;
                                break;
                            }
                            List list7 = listJ;
                            bb80Var5 = (bb80) listJ.get(i4);
                            int i410 = size;
                            gwoVarT = cVar2.t();
                            int i411 = i4;
                            i39 = bb80Var5.g;
                            if (gwoVarT.a(i39)) {
                                androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(bb80Var5.c);
                                if (i39 != -1) {
                                    if (androidViewHolder != null) {
                                        r8.addChild(androidViewHolder);
                                    } else {
                                        eb80VarB = cVar2.t().b(i39);
                                        if (eb80VarB != null) {
                                            zG = false;
                                        } else {
                                            zG = false;
                                        }
                                        if (z) {
                                            r8.addChild(androidComposeView2, i39);
                                        } else {
                                            r8.addChild(androidComposeView2, i39);
                                        }
                                    }
                                    kswVar.f(i39, i3);
                                    i3++;
                                }
                            }
                            i4 = i411 + 1;
                            size = i410;
                            listJ = list7;
                        }
                        if (i == cVar2.n) {
                            r8.setAccessibilityFocused(true);
                            c7Var.b(c7.a.i);
                        } else {
                            r8.setAccessibilityFocused(false);
                            c7Var.b(c7.a.h);
                        }
                        nk0VarE = i50.e(bb80Var7);
                        if (nk0VarE != null) {
                            fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                            density = androidComposeView2.getDensity();
                            vbh0Var = cVar2.I;
                            String str8 = nk0VarE.b;
                            list3 = nk0VarE.a;
                            spannableString2 = new SpannableString(str8);
                            arrayList5 = nk0VarE.c;
                            if (arrayList5 != null) {
                                size14 = arrayList5.size();
                                i32 = 0;
                                while (i32 < size14) {
                                    int i412 = size14;
                                    nk0.d dVar10 = (nk0.d) arrayList5.get(i32);
                                    int i413 = i32;
                                    ora0 ora0Var2 = (ora0) dVar10.a;
                                    i33 = dVar10.b;
                                    i34 = dVar10.c;
                                    ArrayList arrayList9 = arrayList5;
                                    ora0VarA = ora0.a(ora0Var2, 0L, null, null, null, 65503);
                                    f8iVar = ora0VarA.f;
                                    su50 su50Var5 = su50Var;
                                    kjf0 kjf0Var2 = ora0VarA.a;
                                    ljf0Var = ora0VarA.j;
                                    Resources resources5 = resources;
                                    yef0Var = ora0VarA.m;
                                    bb80 bb80Var9 = bb80Var7;
                                    n9iVar = ora0VarA.d;
                                    sa80 sa80Var7 = sa80Var;
                                    AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                    zra0.c(spannableString2, kjf0Var2.d(), i33, i34);
                                    spannableString4 = spannableString2;
                                    zra0.d(spannableString4, ora0VarA.b, density, i33, i34);
                                    mmd mmdVar2 = density;
                                    t9iVar = ora0VarA.c;
                                    if (t9iVar == null) {
                                        if (t9iVar == null) {
                                            t9iVar = t9i.B;
                                        }
                                        if (n9iVar != null) {
                                            i35 = n9iVar.a;
                                        } else {
                                            i35 = 0;
                                        }
                                        StyleSpan styleSpan2 = new StyleSpan(o70.a(t9iVar, i35));
                                        i36 = 33;
                                        spannableString4.setSpan(styleSpan2, i33, i34, 33);
                                    } else {
                                        if (t9iVar == null) {
                                            t9iVar = t9i.B;
                                        }
                                        if (n9iVar != null) {
                                            i35 = n9iVar.a;
                                        } else {
                                            i35 = 0;
                                        }
                                        StyleSpan styleSpan3 = new StyleSpan(o70.a(t9iVar, i35));
                                        i36 = 33;
                                        spannableString4.setSpan(styleSpan3, i33, i34, 33);
                                    }
                                    if (f8iVar != null) {
                                        if (f8iVar instanceof v1k) {
                                            spannableString4.setSpan(new TypefaceSpan(((v1k) f8iVar).f), i33, i34, i36);
                                        } else if (Build.VERSION.SDK_INT >= 28) {
                                            o9iVar = ora0VarA.e;
                                            if (o9iVar != null) {
                                                i38 = o9iVar.a;
                                            } else {
                                                i38 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                            }
                                            Object value2 = f8i.a.a(fontFamilyResolver, f8iVar, null, 0, i38, 6).getValue();
                                            value2.getClass();
                                            i36 = 33;
                                            spannableString4.setSpan(yl0.a((Typeface) value2), i33, i34, 33);
                                        } else {
                                            i36 = 33;
                                        }
                                    }
                                    if (yef0Var != null) {
                                        i37 = yef0Var.a;
                                        if ((i37 | 1) == i37) {
                                            spannableString4.setSpan(new UnderlineSpan(), i33, i34, i36);
                                        }
                                        if ((i37 | 2) == i37) {
                                            spannableString4.setSpan(new StrikethroughSpan(), i33, i34, i36);
                                        }
                                    }
                                    if (ljf0Var != null) {
                                        spannableString4.setSpan(new ScaleXSpan(ljf0Var.a), i33, i34, i36);
                                    }
                                    zra0.e(spannableString4, ora0VarA.k, i33, i34);
                                    j = ora0VarA.l;
                                    if (j != 16) {
                                        spannableString4.setSpan(new BackgroundColorSpan(r58.l(j)), i33, i34, 33);
                                    }
                                    i32 = i413 + 1;
                                    spannableString2 = spannableString4;
                                    density = mmdVar2;
                                    size14 = i412;
                                    su50Var = su50Var5;
                                    resources = resources5;
                                    bb80Var7 = bb80Var9;
                                    accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                    sa80Var = sa80Var7;
                                    arrayList5 = arrayList9;
                                }
                            }
                            resources2 = resources;
                            bb80Var = bb80Var7;
                            su50Var2 = su50Var;
                            sa80Var2 = sa80Var;
                            accessibilityNodeInfo = accessibilityNodeInfoObtain;
                            spannableString3 = spannableString2;
                            int length3 = str8.length();
                            if (list3 != null) {
                                arrayList6 = new ArrayList(list3.size());
                                size13 = list3.size();
                                for (i31 = 0; i31 < size13; i31++) {
                                    nk0.d<? extends nk0.a> dVar11 = list3.get(i31);
                                    dVar3 = dVar11;
                                    if (!(dVar3.a instanceof eyg0)) {
                                    }
                                }
                            } else {
                                arrayList6 = m2g.a;
                            }
                            arrayList6.getClass();
                            size9 = arrayList6.size();
                            for (i23 = 0; i23 < size9; i23++) {
                                nk0.d dVar12 = (nk0.d) arrayList6.get(i23);
                                eyg0Var = (eyg0) dVar12.a;
                                i29 = dVar12.b;
                                i30 = dVar12.c;
                                if (eyg0Var instanceof nxh0) {
                                    uhc.a();
                                    return null;
                                }
                                spannableString3.setSpan(new TtsSpan.VerbatimBuilder(((nxh0) eyg0Var).a).build(), i29, i30, 33);
                            }
                            int length4 = str8.length();
                            if (list3 != null) {
                                arrayList7 = new ArrayList(list3.size());
                                size12 = list3.size();
                                for (i28 = 0; i28 < size12; i28++) {
                                    nk0.d<? extends nk0.a> dVar13 = list3.get(i28);
                                    dVar2 = dVar13;
                                    if (!(dVar2.a instanceof rmh0)) {
                                    }
                                }
                            } else {
                                arrayList7 = m2g.a;
                            }
                            arrayList7.getClass();
                            size10 = arrayList7.size();
                            for (i24 = 0; i24 < size10; i24++) {
                                nk0.d dVar14 = (nk0.d) arrayList7.get(i24);
                                rmh0Var = (rmh0) dVar14.a;
                                int i414 = dVar14.b;
                                int i415 = dVar14.c;
                                weakHashMap2 = vbh0Var.a;
                                uRLSpan = weakHashMap2.get(rmh0Var);
                                if (uRLSpan == null) {
                                    uRLSpan = new URLSpan(rmh0Var.a);
                                    weakHashMap2.put(rmh0Var, uRLSpan);
                                }
                                spannableString3.setSpan(uRLSpan, i414, i415, 33);
                            }
                            listA = nk0VarE.a(str8.length());
                            size11 = listA.size();
                            for (i25 = 0; i25 < size11; i25++) {
                                dVar = (nk0.d) listA.get(i25);
                                i26 = dVar.b;
                                r6 = dVar.a;
                                i27 = dVar.c;
                                if (i26 != i27) {
                                    rfsVar = (rfs) r6;
                                    if (rfsVar instanceof rfs.b) {
                                        weakHashMap = vbh0Var.c;
                                        h9aVar = weakHashMap.get(dVar);
                                        if (h9aVar == null) {
                                            h9aVar = new h9a(rfsVar);
                                            weakHashMap.put(dVar, h9aVar);
                                        }
                                        spannableString3.setSpan(h9aVar, i26, i27, 33);
                                    } else {
                                        weakHashMap = vbh0Var.c;
                                        h9aVar = weakHashMap.get(dVar);
                                        if (h9aVar == null) {
                                            h9aVar = new h9a(rfsVar);
                                            weakHashMap.put(dVar, h9aVar);
                                        }
                                        spannableString3.setSpan(h9aVar, i26, i27, 33);
                                    }
                                }
                            }
                            spannableString = (SpannableString) c.O(spannableString3);
                        } else {
                            resources2 = resources;
                            bb80Var = bb80Var7;
                            su50Var2 = su50Var;
                            sa80Var2 = sa80Var;
                            accessibilityNodeInfo = accessibilityNodeInfoObtain;
                            kswVar = kswVar;
                            spannableString = null;
                        }
                        c7Var.w(spannableString);
                        ob80Var = hb80.K;
                        if (rtwVar.b(ob80Var)) {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setContentInvalid(true);
                            sa80Var3 = sa80Var2;
                            r8.setError((CharSequence) ta80.a(sa80Var3, ob80Var));
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            sa80Var3 = sa80Var2;
                        }
                        Resources resources6 = resources2;
                        bb80Var2 = bb80Var;
                        c7Var.v(i50.d(bb80Var2, resources6));
                        r8.setCheckable(i50.c(bb80Var2));
                        kzf0Var = (kzf0) ta80.a(sa80Var3, hb80.I);
                        if (kzf0Var != null) {
                            if (kzf0Var == kzf0.a) {
                                r8.setChecked(true);
                            } else if (kzf0Var == kzf0.b) {
                                r8.setChecked(false);
                            }
                            Unit unit23 = Unit.a;
                        }
                        bool = (Boolean) ta80.a(sa80Var3, hb80.H);
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                            if (su50Var2 == null) {
                                su50Var3 = su50Var2;
                            } else {
                                su50Var3 = su50Var2;
                                if (su50Var3.a == 4) {
                                    r8.setSelected(zBooleanValue2);
                                }
                                Unit unit24 = Unit.a;
                            }
                            r8.setChecked(zBooleanValue2);
                            Unit unit25 = Unit.a;
                        } else {
                            su50Var3 = su50Var2;
                        }
                        if (sa80Var3.c) {
                            list = (List) ta80.a(sa80Var3, hb80.a);
                            if (list != null) {
                                str = (String) CollectionsKt.firstOrNull(list);
                            } else {
                                str = null;
                            }
                            c7Var.o(str);
                        } else {
                            list = (List) ta80.a(sa80Var3, hb80.a);
                            if (list != null) {
                                str = (String) CollectionsKt.firstOrNull(list);
                            } else {
                                str = null;
                            }
                            c7Var.o(str);
                        }
                        str2 = (String) ta80.a(sa80Var3, hb80.y);
                        if (str2 != null) {
                            bb80VarL3 = bb80Var2;
                            while (true) {
                                if (bb80VarL3 != null) {
                                    zBooleanValue = false;
                                    break;
                                }
                                sa80Var5 = bb80VarL3.d;
                                ob80Var5 = ib80.a;
                                if (sa80Var5.a.b(ob80Var5)) {
                                    zBooleanValue = ((Boolean) sa80Var5.d(ob80Var5)).booleanValue();
                                    break;
                                }
                                bb80VarL3 = bb80VarL3.l();
                            }
                            if (zBooleanValue) {
                                accessibilityNodeInfo2.setViewIdResourceName(str2);
                            }
                        }
                        if (((Unit) ta80.a(sa80Var3, hb80.h)) != null) {
                            c7Var.p(true);
                            Unit unit26 = Unit.a;
                        }
                        i5 = i;
                        if (i5 != -1) {
                            iD3 = kswVar.d(bb80Var2.g);
                            if (iD3 != -1) {
                                accessibilityNodeInfo2.setDrawingOrder(iD3);
                                Unit unit27 = Unit.a;
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo2.setPassword(rtwVar.b(hb80.J));
                        accessibilityNodeInfo2.setEditable(rtwVar.b(hb80.M));
                        num = (Integer) ta80.a(sa80Var3, hb80.N);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        r8.setMaxTextLength(iIntValue2);
                        r8.setEnabled(i50.a(bb80Var2));
                        ob80Var2 = hb80.k;
                        r8.setFocusable(rtwVar.b(ob80Var2));
                        if (accessibilityNodeInfo2.isFocusable()) {
                            r8.setFocused(((Boolean) sa80Var3.d(ob80Var2)).booleanValue());
                            if (accessibilityNodeInfo2.isFocused()) {
                                i7 = 2;
                                c7Var.a(2);
                                cVar = cVar2;
                                cVar.o = i5;
                                i6 = 1;
                            } else {
                                cVar = cVar2;
                                i6 = 1;
                                i7 = 2;
                                c7Var.a(1);
                            }
                        } else {
                            cVar = cVar2;
                            i6 = 1;
                            i7 = 2;
                        }
                        r8.setVisibleToUser((gb80.d(bb80Var2) ? 1 : 0) ^ i6);
                        wrsVar = (wrs) ta80.a(sa80Var3, hb80.j);
                        if (wrsVar != null) {
                            i22 = wrsVar.a;
                            if (i22 == 0) {
                                i7 = i6;
                            } else if (i22 != i6) {
                                i7 = 1;
                            }
                            accessibilityNodeInfo2.setLiveRegion(i7);
                            Unit unit28 = Unit.a;
                        }
                        r8.setClickable(false);
                        c6Var = (c6) ta80.a(sa80Var3, ra80.b);
                        if (c6Var != null) {
                            boolean zG4 = Intrinsics.g(ta80.a(sa80Var3, hb80.H), Boolean.TRUE);
                            if (su50Var3 == null) {
                            }
                            if (z2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            r8.setClickable(z3);
                            if (i50.a(bb80Var2)) {
                                c7Var.b(new c7.a(16, c6Var.a));
                            }
                            Unit unit29 = Unit.a;
                        }
                        r8.setLongClickable(false);
                        c6Var2 = (c6) ta80.a(sa80Var3, ra80.c);
                        if (c6Var2 != null) {
                            r8.setLongClickable(true);
                            if (i50.a(bb80Var2)) {
                                c7Var.b(new c7.a(32, c6Var2.a));
                            }
                            Unit unit110 = Unit.a;
                        }
                        c6Var3 = (c6) ta80.a(sa80Var3, ra80.p);
                        if (c6Var3 != null) {
                            c7Var.b(new c7.a(Http2.INITIAL_MAX_FRAME_SIZE, c6Var3.a));
                            Unit unit111 = Unit.a;
                        }
                        if (i50.a(bb80Var2)) {
                            c6Var8 = (c6) ta80.a(sa80Var3, ra80.j);
                            if (c6Var8 != null) {
                                c7Var.b(new c7.a(2097152, c6Var8.a));
                                Unit unit112 = Unit.a;
                            }
                            c6Var9 = (c6) ta80.a(sa80Var3, ra80.o);
                            if (c6Var9 != null) {
                                c7Var.b(new c7.a(R.id.accessibilityActionImeEnter, c6Var9.a));
                                Unit unit113 = Unit.a;
                            }
                            c6Var10 = (c6) ta80.a(sa80Var3, ra80.q);
                            if (c6Var10 != null) {
                                c7Var.b(new c7.a(65536, c6Var10.a));
                                Unit unit114 = Unit.a;
                            }
                            c6Var11 = (c6) ta80.a(sa80Var3, ra80.r);
                            if (c6Var11 != null) {
                                if (accessibilityNodeInfo2.isFocused()) {
                                    primaryClipDescription = androidComposeView2.getClipboardManager().a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        c7Var.b(new c7.a(32768, c6Var11.a));
                                    }
                                }
                                Unit unit115 = Unit.a;
                            }
                        }
                        strU = c.u(bb80Var2);
                        if (strU != null) {
                            tsrVar = tsrVar2;
                        } else {
                            tsrVar = tsrVar2;
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList4 = new ArrayList();
                            arrayList4.add("androidx.compose.ui.semantics.id");
                            charSequenceG = c7Var.g();
                            if (charSequenceG != null) {
                                arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rtwVar.b(hb80.y)) {
                                arrayList4.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (rtwVar.b(hb80.O)) {
                                arrayList4.add("androidx.compose.ui.semantics.shapeType");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList4.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            c7Var.i(arrayList4);
                        }
                        m230Var = (m230) ta80.a(sa80Var3, hb80.c);
                        if (m230Var != null) {
                            f = m230Var.a;
                            gt7Var = m230Var.b;
                            ob80Var4 = ra80.h;
                            if (rtwVar.b(ob80Var4)) {
                                c7Var.l("android.widget.SeekBar");
                            } else {
                                c7Var.l("android.widget.ProgressBar");
                            }
                            if (m230Var != m230.d) {
                                r8.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) gt7Var.getStart()).floatValue(), ((Number) gt7Var.d()).floatValue(), f));
                            }
                            if (rtwVar.b(ob80Var4)) {
                                fFloatValue = ((Number) gt7Var.d()).floatValue();
                                fFloatValue2 = ((Number) gt7Var.getStart()).floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    c7Var.b(c7.a.j);
                                }
                                fFloatValue3 = ((Number) gt7Var.getStart()).floatValue();
                                fFloatValue4 = ((Number) gt7Var.d()).floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    c7Var.b(c7.a.k);
                                }
                            }
                        }
                        if (i50.a(bb80Var2)) {
                            c7Var.b(new c7.a(R.id.accessibilityActionSetProgress, c6Var7.a));
                        }
                        u38Var = (u38) ta80.a(bb80Var2.k(), hb80.f);
                        if (u38Var != null) {
                            c7Var.m(c7.e.a(u38Var.a, u38Var.b, 0));
                        } else {
                            arrayList = new ArrayList();
                            if (ta80.a(bb80Var2.k(), hb80.e) != null) {
                                listM = bb80Var2.m();
                                size4 = listM.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    bb80Var3 = listM.get(i8);
                                    if (bb80Var3.k().a.b(hb80.H)) {
                                        arrayList.add(bb80Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zA2 = v38.a(arrayList);
                                if (zA2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zA2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                c7Var.m(c7.e.a(size2, size3, 0));
                            }
                        }
                        if (((x38) ta80.a(bb80Var2.k(), hb80.g)) != null) {
                            c7Var.n(c7.f.a(0, 0, 0, 0, false, ((Boolean) bb80Var2.k().e(hb80.H, w38.a)).booleanValue()));
                        }
                        bb80VarL2 = bb80Var2.l();
                        if (bb80VarL2 != null) {
                            if (bb80Var2.k().a.b(hb80.H)) {
                                arrayList3 = new ArrayList();
                                listJ2 = bb80.j(4, bb80VarL2);
                                size8 = listJ2.size();
                                i18 = 0;
                                i19 = 0;
                                while (i18 < size8) {
                                    bb80Var4 = (bb80) listJ2.get(i18);
                                    List list8 = listJ2;
                                    if (bb80Var4.k().a.b(hb80.H)) {
                                        arrayList3.add(bb80Var4);
                                        if (bb80Var4.c.I() < bb80Var2.c.I()) {
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    listJ2 = list8;
                                }
                                if (!arrayList3.isEmpty()) {
                                    zA3 = v38.a(arrayList3);
                                    if (zA3) {
                                        i20 = 0;
                                    } else {
                                        i20 = i19;
                                    }
                                    if (zA3) {
                                        i21 = i19;
                                    } else {
                                        i21 = 0;
                                    }
                                    c7Var.n(c7.f.a(i20, 1, i21, 1, false, ((Boolean) bb80Var2.k().e(hb80.H, v38.a.a)).booleanValue()));
                                }
                            }
                        }
                        vo70Var = (vo70) ta80.a(sa80Var3, hb80.t);
                        c6 c6Var14 = (c6) ta80.a(sa80Var3, ra80.d);
                        if (vo70Var != null) {
                            if (ta80.a(bb80Var2.k(), hb80.f) == null) {
                                c7Var.l(LhMGMAwwhzjwfz.pFFaxiSN);
                            }
                            if (vo70Var.b.invoke().floatValue() > 0.0f) {
                                c7Var.t(true);
                            }
                            if (i50.a(bb80Var2)) {
                                if (c.z(vo70Var)) {
                                    c7Var.b(c7.a.j);
                                    if (tsrVar.O == asr.b) {
                                        aVar2 = c7.a.q;
                                    } else {
                                        aVar2 = c7.a.s;
                                    }
                                    c7Var.b(aVar2);
                                }
                                if (c.y(vo70Var)) {
                                    c7Var.b(c7.a.k);
                                    if (tsrVar.O == asr.b) {
                                        aVar = c7.a.s;
                                    } else {
                                        aVar = c7.a.q;
                                    }
                                    c7Var.b(aVar);
                                }
                            }
                        }
                        vo70Var2 = (vo70) ta80.a(sa80Var3, hb80.u);
                        if (vo70Var2 != null) {
                            if (ta80.a(bb80Var2.k(), hb80.f) == null) {
                                c7Var.l("android.widget.ScrollView");
                            }
                            if (vo70Var2.b.invoke().floatValue() > 0.0f) {
                                c7Var.t(true);
                            }
                            if (i50.a(bb80Var2)) {
                                if (c.z(vo70Var2)) {
                                    c7Var.b(c7.a.j);
                                    c7Var.b(c7.a.r);
                                }
                                if (c.y(vo70Var2)) {
                                    c7Var.b(c7.a.k);
                                    c7Var.b(c7.a.p);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            b.a(c7Var, bb80Var2);
                        }
                        c7Var.r((CharSequence) ta80.a(sa80Var3, hb80.d));
                        if (i50.a(bb80Var2)) {
                            c6Var4 = (c6) ta80.a(sa80Var3, ra80.s);
                            if (c6Var4 != null) {
                                c7Var.b(new c7.a(262144, c6Var4.a));
                                Unit unit116 = Unit.a;
                            }
                            c6Var5 = (c6) ta80.a(sa80Var3, ra80.t);
                            if (c6Var5 != null) {
                                c7Var.b(new c7.a(524288, c6Var5.a));
                                Unit unit117 = Unit.a;
                            }
                            c6Var6 = (c6) ta80.a(sa80Var3, ra80.u);
                            if (c6Var6 != null) {
                                c7Var.b(new c7.a(1048576, c6Var6.a));
                                Unit unit118 = Unit.a;
                            }
                            ob80Var3 = ra80.w;
                            if (rtwVar.b(ob80Var3)) {
                                list2 = (List) sa80Var3.d(ob80Var3);
                                lswVar3 = lswVar2;
                                if (list2.size() < lswVar3.b) {
                                    ib5.a(zk1.a(lswVar3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                i9 = 0;
                                esa0Var2 = new esa0(0);
                                dtwVarA = zby.a();
                                if (esa0Var.a) {
                                    fsa0.b(esa0Var);
                                }
                                if (bza.a(esa0Var.d, i5, esa0Var.b) >= 0) {
                                    dtwVar = (dtw) fsa0.a(esa0Var, i5);
                                    lswVar4 = new lsw();
                                    iArr = lswVar3.a;
                                    for (i11 = lswVar3.b; i9 < i11; i11 = i11) {
                                        lswVar4.a(iArr[i9]);
                                        i9++;
                                    }
                                    arrayList2 = new ArrayList();
                                    size6 = list2.size();
                                    i12 = 0;
                                    while (i12 < size6) {
                                        int i416 = size6;
                                        a6cVar = (a6c) list2.get(i12);
                                        dtwVar.getClass();
                                        int i417 = i12;
                                        str4 = a6cVar.a;
                                        if (dtwVar.d(str4) >= 0) {
                                            iE = dtwVar.e(str4);
                                            esa0Var2.d(iE, str4);
                                            dtwVarA.h(iE, str4);
                                            iArr2 = lswVar4.a;
                                            i14 = lswVar4.b;
                                            i15 = 0;
                                            while (true) {
                                                if (i15 < i14) {
                                                    i16 = -1;
                                                    break;
                                                }
                                                i17 = i15;
                                                if (iE == iArr2[i17]) {
                                                    i16 = i17;
                                                    break;
                                                }
                                                i15 = i17 + 1;
                                            }
                                            if (i16 >= 0) {
                                                lswVar4.e(i16);
                                            }
                                            c7Var.b(new c7.a(iE, str4));
                                            Unit unit119 = Unit.a;
                                        } else {
                                            arrayList2.add(a6cVar);
                                        }
                                        i12 = i417 + 1;
                                        size6 = i416;
                                        dtwVar = dtwVar;
                                        sa80Var3 = sa80Var3;
                                    }
                                    sa80Var4 = sa80Var3;
                                    size7 = arrayList2.size();
                                    for (i13 = 0; i13 < size7; i13++) {
                                        a6c a6cVar4 = (a6c) arrayList2.get(i13);
                                        int iC3 = lswVar4.c(i13);
                                        String str9 = a6cVar4.a;
                                        esa0Var2.d(iC3, str9);
                                        dtwVarA.h(iC3, str9);
                                        c7Var.b(new c7.a(iC3, str9));
                                    }
                                } else {
                                    sa80Var4 = sa80Var3;
                                    size5 = list2.size();
                                    for (i10 = 0; i10 < size5; i10++) {
                                        a6c a6cVar5 = (a6c) list2.get(i10);
                                        int iC4 = lswVar3.c(i10);
                                        String str10 = a6cVar5.a;
                                        esa0Var2.d(iC4, str10);
                                        dtwVarA.h(iC4, str10);
                                        c7Var.b(new c7.a(iC4, str10));
                                    }
                                }
                                cVar.u.d(i5, esa0Var2);
                                esa0Var.d(i5, dtwVarA);
                            } else {
                                sa80Var4 = sa80Var3;
                            }
                        } else {
                            sa80Var4 = sa80Var3;
                        }
                        c7Var.s(i50.f(bb80Var2, resources6));
                        iD = cVar.E.d(i5);
                        if (iD != -1) {
                            androidViewHolderB2 = vb80.b(androidComposeView2.getAndroidViewsHandler$ui_release(), iD);
                            if (androidViewHolderB2 != null) {
                                r8.setTraversalBefore(androidViewHolderB2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                r8.setTraversalBefore(androidComposeView, iD);
                            }
                            bundle = null;
                            cVar.j(i5, c7Var, cVar.G, null);
                        } else {
                            bundle = null;
                            androidComposeView = androidComposeView2;
                        }
                        iD2 = cVar.F.d(i5);
                        if (iD2 != -1) {
                            r8.setTraversalAfter(androidViewHolderB);
                            cVar.j(i5, c7Var, cVar.H, bundle);
                        }
                        str3 = (String) ta80.a(sa80Var4, ib80.b);
                        if (str3 != null) {
                            c7Var.l(str3);
                            Unit unit210 = Unit.a;
                        }
                        c7Var2 = c7Var;
                    } else {
                        cVar = cVar2;
                        i5 = i;
                        c7Var2 = null;
                    }
                }
            }
            if (cVar.r) {
                if (i5 == cVar.n) {
                    cVar.p = c7Var2;
                }
                if (i5 == cVar.o) {
                    cVar.q = c7Var2;
                }
            }
            return c7Var2;
        }
    }

    public static final class d {
        public final bb80 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public d(bb80 bb80Var, int i, int i2, int i3, int i4, long j) {
            this.a = bb80Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    public static final class e extends qlr implements Function1<AccessibilityEvent, Boolean> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            View view = c.this.d;
            return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent));
        }
    }

    public static final class f extends qlr implements Function1<sp70, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(sp70 sp70Var) {
            sp70 sp70Var2 = sp70Var;
            if (sp70Var2.b.contains(sp70Var2)) {
                c cVar = c.this;
                cVar.d.getSnapshotObserver().a(sp70Var2, cVar.P, new e50(sp70Var2, cVar));
            }
            return Unit.a;
        }
    }

    public static final class g extends qlr implements Function1<tsr, Boolean> {
        public static final g a = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(tsr tsrVar) {
            sa80 sa80VarF = tsrVar.f();
            boolean z = false;
            if (sa80VarF != null && sa80VarF.c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class h extends qlr implements Function1<tsr, Boolean> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(tsr tsrVar) {
            return Boolean.valueOf(tsrVar.U.c(8));
        }
    }

    static {
        int[] iArr = {com.sportybet.android.gp.tz.R.id.accessibility_custom_action_0, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_1, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_2, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_3, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_4, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_5, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_6, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_7, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_8, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_9, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_10, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_11, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_12, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_13, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_14, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_15, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_16, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_17, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_18, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_19, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_20, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_21, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_22, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_23, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_24, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_25, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_26, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_27, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_28, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_29, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_30, com.sportybet.android.gp.tz.R.id.accessibility_custom_action_31};
        lsw lswVar = bwo.a;
        lsw lswVar2 = new lsw(32);
        int i = lswVar2.b;
        if (i < 0) {
            mae0.a("");
            return;
        }
        int i2 = i + 32;
        lswVar2.b(i2);
        int[] iArr2 = lswVar2.a;
        int i3 = lswVar2.b;
        if (i != i3) {
            xx0.d(i2, i, i3, iArr2, iArr2);
        }
        xx0.h(i, 0, 12, iArr, iArr2);
        lswVar2.b += 32;
        Q = lswVar2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [a50] */
    /* JADX WARN: Type inference failed for: r2v3, types: [b50] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c50] */
    public c(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: a50
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                c cVar = this.a;
                cVar.k = z ? cVar.g.getEnabledAccessibilityServiceList(-1) : m2g.a;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: b50
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                c cVar = this.a;
                cVar.k = cVar.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new C0048c();
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new msw<>();
        this.t = new msw<>();
        this.u = new esa0<>(0);
        this.v = new esa0<>(0);
        this.w = -1;
        this.y = new tx0<>(0);
        this.z = d77.b(1, 6, null);
        this.A = true;
        msw mswVar = hwo.a;
        mswVar.getClass();
        this.C = mswVar;
        this.D = new nsw((Object) null);
        this.E = new ksw();
        this.F = new ksw();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new vbh0();
        this.J = new msw<>();
        this.K = new cb80(androidComposeView.getSemanticsOwner().a(), mswVar);
        int i = xvo.a;
        this.M = new ksw();
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.N = new Runnable() { // from class: c50
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = this.a;
                Trace.beginSection("measureAndLayout");
                try {
                    cVar.d.a(true);
                    Unit unit = Unit.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        cVar.n();
                        Trace.endSection();
                        cVar.L = false;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        };
        this.O = new ArrayList();
        this.P = new f();
    }

    public static /* synthetic */ void E(c cVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        cVar.D(i, i2, num, null);
    }

    public static Rect L(b9z b9zVar) {
        if (!(b9zVar instanceof b9z.b) && !(b9zVar instanceof b9z.c)) {
            return null;
        }
        lk40 lk40VarA = b9zVar.a();
        return new Rect((int) lk40VarA.a, (int) lk40VarA.b, (int) lk40VarA.c, (int) lk40VarA.d);
    }

    public static float[] M(b9z b9zVar) {
        if (!(b9zVar instanceof b9z.c)) {
            return null;
        }
        lz50 lz50Var = ((b9z.c) b9zVar).a;
        long j = lz50Var.e;
        long j2 = lz50Var.h;
        long j3 = lz50Var.g;
        long j4 = lz50Var.f;
        return new float[]{Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (lz50Var.e & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))};
    }

    public static Region N(b9z b9zVar) {
        if (b9zVar instanceof b9z.a) {
            bxz bxzVar = ((b9z.a) b9zVar).a;
            lk40 bounds = bxzVar.getBounds();
            Region region = new Region(new Rect((int) bounds.a, (int) bounds.b, (int) bounds.c, (int) bounds.d));
            Region region2 = new Region();
            if (bxzVar instanceof j90) {
                region2.setPath(((j90) bxzVar).a, region);
                return region2;
            }
            zkh.a("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String u(bb80 bb80Var) {
        nk0 nk0Var;
        if (bb80Var != null) {
            sa80 sa80Var = bb80Var.d;
            rtw<ob80<?>, Object> rtwVar = sa80Var.a;
            ob80<List<String>> ob80Var = hb80.a;
            if (rtwVar.b(ob80Var)) {
                return ois.a((List) sa80Var.d(ob80Var), ",", null, 62);
            }
            ob80<nk0> ob80Var2 = hb80.E;
            if (rtwVar.b(ob80Var2)) {
                nk0 nk0Var2 = (nk0) ta80.a(sa80Var, ob80Var2);
                if (nk0Var2 != null) {
                    return nk0Var2.b;
                }
            } else {
                List list = (List) ta80.a(sa80Var, hb80.A);
                if (list != null && (nk0Var = (nk0) CollectionsKt.firstOrNull(list)) != null) {
                    return nk0Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(vo70 vo70Var, float f2) {
        Function0<Float> function0 = vo70Var.a;
        if (f2 >= 0.0f || function0.invoke().floatValue() <= 0.0f) {
            return f2 > 0.0f && function0.invoke().floatValue() < vo70Var.b.invoke().floatValue();
        }
        return true;
    }

    public static final boolean y(vo70 vo70Var) {
        Function0<Float> function0 = vo70Var.a;
        boolean z = vo70Var.c;
        if (function0.invoke().floatValue() <= 0.0f || z) {
            return function0.invoke().floatValue() < vo70Var.b.invoke().floatValue() && z;
        }
        return true;
    }

    public static final boolean z(vo70 vo70Var) {
        Function0<Float> function0 = vo70Var.a;
        boolean z = vo70Var.c;
        if (function0.invoke().floatValue() >= vo70Var.b.invoke().floatValue() || z) {
            return function0.invoke().floatValue() > 0.0f && z;
        }
        return true;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[LOOP:1: B:15:0x004d->B:28:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[EDGE_INSN: B:44:0x008c->B:29:0x008c BREAK  A[LOOP:1: B:15:0x004d->B:28:0x0089], SYNTHETIC] */
    public final void B(bb80 bb80Var, cb80 cb80Var) {
        int[] iArr = ixo.a;
        nsw nswVar = new nsw((Object) null);
        List listJ = bb80.j(4, bb80Var);
        tsr tsrVar = bb80Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            bb80 bb80Var2 = (bb80) listJ.get(i);
            gwo<eb80> gwoVarT = t();
            int i2 = bb80Var2.g;
            if (gwoVarT.a(i2)) {
                if (!cb80Var.b.b(i2)) {
                    w(tsrVar);
                    return;
                }
                nswVar.a(i2);
            }
        }
        nsw nswVar2 = cb80Var.b;
        int[] iArr2 = nswVar2.b;
        long[] jArr = nswVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !nswVar.b(iArr2[(i3 << 3) + i5])) {
                            w(tsrVar);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = bb80.j(4, bb80Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            bb80 bb80Var3 = (bb80) listJ2.get(i6);
            cb80 cb80VarB = this.J.b(bb80Var3.g);
            if (cb80VarB != null && t().a(bb80Var3.g)) {
                B(bb80Var3, cb80VarB);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(ois.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        d dVar = this.B;
        if (dVar != null) {
            bb80 bb80Var = dVar.a;
            if (i != bb80Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(bb80Var.g), 131072);
                accessibilityEventO.setFromIndex(dVar.d);
                accessibilityEventO.setToIndex(dVar.e);
                accessibilityEventO.setAction(dVar.b);
                accessibilityEventO.setMovementGranularity(dVar.c);
                accessibilityEventO.getText().add(u(bb80Var));
                C(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x04cc A[PHI: r38
      0x04cc: PHI (r38v8 int) = (r38v7 int), (r38v10 int), (r38v10 int) binds: [B:188:0x04ca, B:182:0x04b6, B:184:0x04bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    public final void H(gwo<eb80> gwoVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num2;
        int i6;
        cb80 cb80VarB;
        int i7;
        sa80 sa80Var;
        bb80 bb80Var;
        boolean z;
        boolean z2;
        rtw<ob80<?>, Object> rtwVar;
        int i8;
        rtw<ob80<?>, Object> rtwVar2;
        tsr tsrVar;
        int i9;
        long j;
        int i10;
        int i11;
        Integer num3;
        int i12;
        sp70 sp70Var;
        boolean z3;
        ob80<String> ob80Var;
        sa80 sa80Var2;
        sp70 sp70Var2;
        T t;
        String str;
        int i13;
        int i14;
        int i15;
        Integer num4;
        AccessibilityEvent accessibilityEventQ;
        String str2;
        gwo<eb80> gwoVar2 = gwoVar;
        ArrayList arrayList3 = this.O;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = gwoVar2.b;
        long[] jArr3 = gwoVar2.a;
        int i16 = 2;
        int length = jArr3.length - 2;
        int i17 = 0;
        Integer num5 = 0;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j2 = jArr3[i18];
            int i19 = i16;
            int i20 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i18 - i20)) >>> 31);
                long j3 = j2;
                int i23 = i17;
                while (i23 < i22) {
                    if ((j3 & 255) >= 128 || (cb80VarB = this.J.b((i6 = iArr3[(i18 << 3) + i23]))) == null) {
                        i2 = i23;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i21;
                        i4 = i22;
                        i5 = i18;
                        num2 = num5;
                    } else {
                        sa80 sa80Var3 = cb80VarB.a;
                        rtw<ob80<?>, Object> rtwVar3 = sa80Var3.a;
                        eb80 eb80VarB = gwoVar2.b(i6);
                        int i24 = i21;
                        bb80 bb80Var2 = eb80VarB != null ? eb80VarB.a : null;
                        if (bb80Var2 == null) {
                            throw w20.a("no value for specified key");
                        }
                        tsr tsrVar2 = bb80Var2.c;
                        sa80 sa80Var4 = bb80Var2.d;
                        iArr2 = iArr3;
                        int i25 = bb80Var2.g;
                        jArr2 = jArr3;
                        rtw<ob80<?>, Object> rtwVar4 = sa80Var4.a;
                        i5 = i18;
                        Object[] objArr = rtwVar4.b;
                        Object[] objArr2 = rtwVar4.c;
                        long[] jArr4 = rtwVar4.a;
                        i2 = i23;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i26 = i25;
                            rtw<ob80<?>, Object> rtwVar5 = rtwVar4;
                            int i27 = 0;
                            z = false;
                            while (true) {
                                long j4 = jArr4[i27];
                                tsr tsrVar3 = tsrVar2;
                                i4 = i22;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        if ((j4 & 255) < 128) {
                                            int i30 = (i27 << 3) + i29;
                                            Object obj = objArr[i30];
                                            i12 = length2;
                                            Object obj2 = objArr2[i30];
                                            j = j4;
                                            ob80 ob80Var2 = (ob80) obj;
                                            ob80<vo70> ob80Var3 = hb80.t;
                                            if (Intrinsics.g(ob80Var2, ob80Var3)) {
                                                i10 = i29;
                                            } else {
                                                i10 = i29;
                                                if (!Intrinsics.g(ob80Var2, hb80.u)) {
                                                    z3 = false;
                                                }
                                                if (z3 && Intrinsics.g(obj2, ta80.a(sa80Var3, ob80Var2))) {
                                                    i11 = i24;
                                                } else {
                                                    ob80Var = hb80.d;
                                                    if (Intrinsics.g(ob80Var2, ob80Var)) {
                                                        obj2.getClass();
                                                        str2 = (String) obj2;
                                                        if (rtwVar3.b(ob80Var)) {
                                                            F(i6, i24, str2);
                                                        }
                                                        Unit unit = Unit.a;
                                                        i6 = i6;
                                                        sa80Var3 = sa80Var3;
                                                        rtwVar3 = rtwVar3;
                                                        arrayList4 = arrayList4;
                                                        bb80Var2 = bb80Var2;
                                                        i11 = 8;
                                                        num3 = num5;
                                                    } else if (!Intrinsics.g(ob80Var2, hb80.b) || Intrinsics.g(ob80Var2, hb80.I)) {
                                                        i6 = i6;
                                                        sa80Var3 = sa80Var3;
                                                        rtwVar3 = rtwVar3;
                                                        arrayList4 = arrayList4;
                                                        bb80Var2 = bb80Var2;
                                                        rtwVar5 = rtwVar5;
                                                        tsrVar3 = tsrVar3;
                                                        i12 = i12;
                                                        num3 = num5;
                                                        i11 = 8;
                                                        E(this, A(i6), 2048, 64, 8);
                                                        E(this, A(i6), 2048, num3, 8);
                                                    } else if (Intrinsics.g(ob80Var2, hb80.c)) {
                                                        E(this, A(i6), 2048, 64, 8);
                                                        E(this, A(i6), 2048, num5, 8);
                                                        i11 = 8;
                                                    } else {
                                                        ob80<Boolean> ob80Var4 = hb80.H;
                                                        arrayList4 = arrayList4;
                                                        if (Intrinsics.g(ob80Var2, ob80Var4)) {
                                                            su50 su50Var = (su50) ta80.a(sa80Var4, hb80.x);
                                                            if (su50Var == null || su50Var.a != 4) {
                                                                bb80Var2 = bb80Var2;
                                                                tsrVar3 = tsrVar3;
                                                                E(this, A(i6), 2048, 64, 8);
                                                                E(this, A(i6), 2048, num5, 8);
                                                            } else if (Intrinsics.g(ta80.a(sa80Var4, ob80Var4), Boolean.TRUE)) {
                                                                AccessibilityEvent accessibilityEventO = o(A(i6), 4);
                                                                tsrVar3 = tsrVar3;
                                                                bb80 bb80Var3 = new bb80(bb80Var2.a, true, tsrVar3, sa80Var4);
                                                                List list = (List) ta80.a(bb80Var3.k(), hb80.a);
                                                                String strA = list != null ? ois.a(list, ",", null, 62) : null;
                                                                List list2 = (List) ta80.a(bb80Var3.k(), hb80.A);
                                                                bb80Var2 = bb80Var2;
                                                                String strA2 = list2 != null ? ois.a(list2, ",", null, 62) : null;
                                                                if (strA != null) {
                                                                    accessibilityEventO.setContentDescription(strA);
                                                                    Unit unit2 = Unit.a;
                                                                }
                                                                if (strA2 != null) {
                                                                    accessibilityEventO.getText().add(strA2);
                                                                }
                                                                C(accessibilityEventO);
                                                            } else {
                                                                bb80Var2 = bb80Var2;
                                                                tsrVar3 = tsrVar3;
                                                                E(this, A(i6), 2048, num5, 8);
                                                            }
                                                        } else {
                                                            bb80Var2 = bb80Var2;
                                                            tsrVar3 = tsrVar3;
                                                            if (Intrinsics.g(ob80Var2, hb80.a)) {
                                                                int iA = A(i6);
                                                                obj2.getClass();
                                                                D(iA, 2048, 4, (List) obj2);
                                                            } else {
                                                                ob80<nk0> ob80Var5 = hb80.E;
                                                                String str3 = "";
                                                                if (Intrinsics.g(ob80Var2, ob80Var5)) {
                                                                    rtwVar5 = rtwVar5;
                                                                    if (rtwVar5.b(ra80.j)) {
                                                                        nk0 nk0Var = (nk0) ta80.a(sa80Var3, ob80Var5);
                                                                        if (nk0Var == null) {
                                                                            nk0Var = "";
                                                                        }
                                                                        CharSequence charSequence = (nk0) ta80.a(sa80Var4, ob80Var5);
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence charSequenceO = O(charSequence);
                                                                        int length3 = nk0Var.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num6 = num5;
                                                                        int i31 = length3 > length4 ? length4 : length3;
                                                                        sa80Var2 = sa80Var3;
                                                                        int i32 = 0;
                                                                        while (true) {
                                                                            i13 = i31;
                                                                            if (i32 >= i31) {
                                                                                i14 = length3;
                                                                                break;
                                                                            }
                                                                            i14 = length3;
                                                                            if (nk0Var.charAt(i32) != charSequence.charAt(i32)) {
                                                                                break;
                                                                            }
                                                                            i32++;
                                                                            i31 = i13;
                                                                            length3 = i14;
                                                                        }
                                                                        int i33 = 0;
                                                                        while (true) {
                                                                            if (i33 >= i13 - i32) {
                                                                                i15 = i33;
                                                                                break;
                                                                            }
                                                                            i15 = i33;
                                                                            if (nk0Var.charAt((i14 - 1) - i33) != charSequence.charAt((length4 - 1) - i15)) {
                                                                                break;
                                                                            } else {
                                                                                i33 = i15 + 1;
                                                                            }
                                                                        }
                                                                        int i34 = (i14 - i15) - i32;
                                                                        int i35 = (length4 - i15) - i32;
                                                                        ob80<Unit> ob80Var6 = hb80.J;
                                                                        boolean zB = rtwVar3.b(ob80Var6);
                                                                        boolean zB2 = rtwVar5.b(ob80Var6);
                                                                        boolean zB3 = rtwVar3.b(hb80.E);
                                                                        boolean z4 = zB3 && !zB && zB2;
                                                                        boolean z5 = zB3 && zB && !zB2;
                                                                        if (z4 || z5) {
                                                                            int iA2 = A(i6);
                                                                            Integer numValueOf = Integer.valueOf(length4);
                                                                            i6 = i6;
                                                                            num4 = num6;
                                                                            accessibilityEventQ = q(iA2, num4, num6, numValueOf, charSequenceO);
                                                                        } else {
                                                                            accessibilityEventQ = o(A(i6), 16);
                                                                            accessibilityEventQ.setFromIndex(i32);
                                                                            accessibilityEventQ.setRemovedCount(i34);
                                                                            accessibilityEventQ.setAddedCount(i35);
                                                                            accessibilityEventQ.setBeforeText(nk0Var);
                                                                            accessibilityEventQ.getText().add(charSequenceO);
                                                                            i6 = i6;
                                                                            num4 = num6;
                                                                        }
                                                                        accessibilityEventQ.setClassName("android.widget.EditText");
                                                                        C(accessibilityEventQ);
                                                                        if (z4 || z5) {
                                                                            long j5 = ((ulf0) sa80Var4.d(hb80.F)).a;
                                                                            accessibilityEventQ.setFromIndex((int) (j5 >> 32));
                                                                            accessibilityEventQ.setToIndex((int) (j5 & 4294967295L));
                                                                            C(accessibilityEventQ);
                                                                        }
                                                                        Unit unit3 = Unit.a;
                                                                        num3 = num4;
                                                                        i12 = i12;
                                                                        sa80Var3 = sa80Var2;
                                                                        i11 = 8;
                                                                    } else {
                                                                        i6 = i6;
                                                                        sa80 sa80Var5 = sa80Var3;
                                                                        rtwVar3 = rtwVar3;
                                                                        i11 = 8;
                                                                        E(this, A(i6), 2048, Integer.valueOf(i19), 8);
                                                                        num3 = num5;
                                                                        i12 = i12;
                                                                        sa80Var3 = sa80Var5;
                                                                    }
                                                                } else {
                                                                    i6 = i6;
                                                                    sa80Var2 = sa80Var3;
                                                                    rtwVar3 = rtwVar3;
                                                                    rtwVar5 = rtwVar5;
                                                                    ob80<ulf0> ob80Var7 = hb80.F;
                                                                    if (Intrinsics.g(ob80Var2, ob80Var7)) {
                                                                        nk0 nk0Var2 = (nk0) ta80.a(sa80Var4, ob80Var5);
                                                                        if (nk0Var2 != null && (str = nk0Var2.b) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((ulf0) sa80Var4.d(ob80Var7)).a;
                                                                        num3 = num5;
                                                                        C(q(A(i6), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), O(str3)));
                                                                        G(i26);
                                                                        Unit unit4 = Unit.a;
                                                                        i12 = i12;
                                                                        sa80Var3 = sa80Var2;
                                                                        i11 = 8;
                                                                    } else {
                                                                        num3 = num5;
                                                                        int i36 = i26;
                                                                        i12 = i12;
                                                                        sa80Var3 = sa80Var2;
                                                                        if (Intrinsics.g(ob80Var2, ob80Var3) || Intrinsics.g(ob80Var2, hb80.u)) {
                                                                            i26 = i36;
                                                                            w(tsrVar3);
                                                                            int size = arrayList3.size();
                                                                            int i37 = 0;
                                                                            while (true) {
                                                                                if (i37 >= size) {
                                                                                    sp70Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((sp70) arrayList3.get(i37)).a == i6) {
                                                                                        sp70Var2 = (sp70) arrayList3.get(i37);
                                                                                        break;
                                                                                    }
                                                                                    i37++;
                                                                                }
                                                                            }
                                                                            sp70Var2.getClass();
                                                                            sp70Var2.e = (vo70) ta80.a(sa80Var4, ob80Var3);
                                                                            sp70Var2.f = (vo70) ta80.a(sa80Var4, hb80.u);
                                                                            if (sp70Var2.b.contains(sp70Var2)) {
                                                                                this.d.getSnapshotObserver().a(sp70Var2, this.P, new e50(sp70Var2, this));
                                                                            }
                                                                            Unit unit5 = Unit.a;
                                                                        } else if (Intrinsics.g(ob80Var2, hb80.k)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i11 = 8;
                                                                                C(o(A(i36), 8));
                                                                            } else {
                                                                                i11 = 8;
                                                                            }
                                                                            E(this, A(i36), 2048, num3, i11);
                                                                            i26 = i36;
                                                                        } else {
                                                                            ob80<List<a6c>> ob80Var8 = ra80.w;
                                                                            if (Intrinsics.g(ob80Var2, ob80Var8)) {
                                                                                List list3 = (List) sa80Var4.d(ob80Var8);
                                                                                List list4 = (List) ta80.a(sa80Var3, ob80Var8);
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    int size2 = list3.size();
                                                                                    i26 = i36;
                                                                                    int i38 = 0;
                                                                                    while (i38 < size2) {
                                                                                        linkedHashSet.add(((a6c) list3.get(i38)).a);
                                                                                        i38++;
                                                                                        list3 = list3;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    int i39 = 0;
                                                                                    for (int size3 = list4.size(); i39 < size3; size3 = size3) {
                                                                                        linkedHashSet2.add(((a6c) list4.get(i39)).a);
                                                                                        i39++;
                                                                                    }
                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                        z = false;
                                                                                    } else {
                                                                                        z = true;
                                                                                    }
                                                                                } else {
                                                                                    i26 = i36;
                                                                                    if (!list3.isEmpty()) {
                                                                                        z = true;
                                                                                    }
                                                                                }
                                                                                Unit unit6 = Unit.a;
                                                                            } else {
                                                                                i26 = i36;
                                                                                if (obj2 instanceof c6) {
                                                                                    c6 c6Var = (c6) obj2;
                                                                                    Object objA = ta80.a(sa80Var3, ob80Var2);
                                                                                    if (c6Var != objA) {
                                                                                        if (objA instanceof c6) {
                                                                                            String str4 = c6Var.a;
                                                                                            c6 c6Var2 = (c6) objA;
                                                                                            T t2 = c6Var2.b;
                                                                                            if (Intrinsics.g(str4, c6Var2.a) && (((t = c6Var.b) != 0 || t2 == 0) && (t == 0 || t2 != 0))) {
                                                                                            }
                                                                                        }
                                                                                        z = true;
                                                                                    }
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                Unit unit7 = Unit.a;
                                                                            }
                                                                        }
                                                                        i11 = 8;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        num3 = num5;
                                                        i6 = i6;
                                                        sa80Var3 = sa80Var3;
                                                        rtwVar3 = rtwVar3;
                                                        rtwVar5 = rtwVar5;
                                                        i12 = i12;
                                                        i11 = 8;
                                                    }
                                                }
                                                num3 = num5;
                                            }
                                            int size4 = arrayList4.size();
                                            int i40 = 0;
                                            while (true) {
                                                if (i40 >= size4) {
                                                    sp70Var = null;
                                                    break;
                                                }
                                                int i41 = size4;
                                                if (((sp70) arrayList4.get(i40)).a == i6) {
                                                    sp70Var = (sp70) arrayList4.get(i40);
                                                    break;
                                                } else {
                                                    i40++;
                                                    size4 = i41;
                                                }
                                            }
                                            if (sp70Var != null) {
                                                z3 = false;
                                            } else {
                                                sp70Var = new sp70(i6, arrayList3);
                                                z3 = true;
                                            }
                                            arrayList3.add(sp70Var);
                                            if (z3) {
                                                ob80Var = hb80.d;
                                                if (Intrinsics.g(ob80Var2, ob80Var)) {
                                                    obj2.getClass();
                                                    str2 = (String) obj2;
                                                    if (rtwVar3.b(ob80Var)) {
                                                        F(i6, i24, str2);
                                                    }
                                                    Unit unit8 = Unit.a;
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    i11 = 8;
                                                    num3 = num5;
                                                } else if (Intrinsics.g(ob80Var2, hb80.b)) {
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    rtwVar5 = rtwVar5;
                                                    tsrVar3 = tsrVar3;
                                                    i12 = i12;
                                                    num3 = num5;
                                                    i11 = 8;
                                                    E(this, A(i6), 2048, 64, 8);
                                                    E(this, A(i6), 2048, num3, 8);
                                                } else {
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    rtwVar5 = rtwVar5;
                                                    tsrVar3 = tsrVar3;
                                                    i12 = i12;
                                                    num3 = num5;
                                                    i11 = 8;
                                                    E(this, A(i6), 2048, 64, 8);
                                                    E(this, A(i6), 2048, num3, 8);
                                                }
                                            } else {
                                                ob80Var = hb80.d;
                                                if (Intrinsics.g(ob80Var2, ob80Var)) {
                                                    obj2.getClass();
                                                    str2 = (String) obj2;
                                                    if (rtwVar3.b(ob80Var)) {
                                                        F(i6, i24, str2);
                                                    }
                                                    Unit unit9 = Unit.a;
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    i11 = 8;
                                                    num3 = num5;
                                                } else if (Intrinsics.g(ob80Var2, hb80.b)) {
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    rtwVar5 = rtwVar5;
                                                    tsrVar3 = tsrVar3;
                                                    i12 = i12;
                                                    num3 = num5;
                                                    i11 = 8;
                                                    E(this, A(i6), 2048, 64, 8);
                                                    E(this, A(i6), 2048, num3, 8);
                                                } else {
                                                    i6 = i6;
                                                    sa80Var3 = sa80Var3;
                                                    rtwVar3 = rtwVar3;
                                                    arrayList4 = arrayList4;
                                                    bb80Var2 = bb80Var2;
                                                    rtwVar5 = rtwVar5;
                                                    tsrVar3 = tsrVar3;
                                                    i12 = i12;
                                                    num3 = num5;
                                                    i11 = 8;
                                                    E(this, A(i6), 2048, 64, 8);
                                                    E(this, A(i6), 2048, num3, 8);
                                                }
                                            }
                                        } else {
                                            rtwVar3 = rtwVar3;
                                            arrayList4 = arrayList4;
                                            j = j4;
                                            i10 = i29;
                                            bb80Var2 = bb80Var2;
                                            i27 = i27;
                                            i11 = i24;
                                            rtwVar5 = rtwVar5;
                                            tsrVar3 = tsrVar3;
                                            num3 = num5;
                                            i6 = i6;
                                            sa80Var3 = sa80Var3;
                                            i12 = length2;
                                        }
                                        i24 = i11;
                                        tsrVar3 = tsrVar3;
                                        rtwVar5 = rtwVar5;
                                        bb80Var2 = bb80Var2;
                                        j4 = j >> i11;
                                        length2 = i12;
                                        i29 = i10 + 1;
                                        num5 = num3;
                                        arrayList4 = arrayList4;
                                        rtwVar3 = rtwVar3;
                                        sa80Var3 = sa80Var3;
                                        i6 = i6;
                                        i27 = i27;
                                    }
                                    rtwVar = rtwVar3;
                                    arrayList2 = arrayList4;
                                    bb80Var = bb80Var2;
                                    i8 = i27;
                                    rtwVar2 = rtwVar5;
                                    tsrVar = tsrVar3;
                                    num2 = num5;
                                    i7 = i6;
                                    sa80Var = sa80Var3;
                                    i9 = length2;
                                    if (i28 != i24) {
                                        break;
                                    }
                                } else {
                                    rtwVar = rtwVar3;
                                    arrayList2 = arrayList4;
                                    bb80Var = bb80Var2;
                                    i8 = i27;
                                    rtwVar2 = rtwVar5;
                                    tsrVar = tsrVar3;
                                    num2 = num5;
                                    i7 = i6;
                                    sa80Var = sa80Var3;
                                    i9 = length2;
                                }
                                int i42 = i8;
                                if (i42 == i9) {
                                    break;
                                }
                                int i43 = i7;
                                i27 = i42 + 1;
                                length2 = i9;
                                sa80Var3 = sa80Var;
                                i6 = i43;
                                num5 = num2;
                                tsrVar2 = tsrVar;
                                rtwVar5 = rtwVar2;
                                bb80Var2 = bb80Var;
                                i22 = i4;
                                arrayList4 = arrayList2;
                                rtwVar3 = rtwVar;
                                i24 = 8;
                            }
                        } else {
                            i7 = i6;
                            sa80Var = sa80Var3;
                            arrayList2 = arrayList4;
                            i4 = i22;
                            bb80Var = bb80Var2;
                            num2 = num5;
                            z = false;
                        }
                        if (!z) {
                            Iterator<Map.Entry<? extends ob80<?>, ? extends Object>> it = sa80Var.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                if (!bb80Var.k().a.b(it.next().getKey())) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z = z2;
                        }
                        if (z) {
                            i3 = 8;
                            E(this, A(i7), 2048, num2, 8);
                        } else {
                            i3 = 8;
                        }
                    }
                    j3 >>= i3;
                    i23 = i2 + 1;
                    gwoVar2 = gwoVar;
                    num5 = num2;
                    i21 = i3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i18 = i5;
                    i22 = i4;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i44 = i18;
                num = num5;
                if (i22 != i21) {
                    return;
                } else {
                    i = i44;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                num = num5;
                i = i18;
            }
            if (i == i20) {
                return;
            }
            i18 = i + 1;
            gwoVar2 = gwoVar;
            length = i20;
            num5 = num;
            i16 = i19;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
            i17 = 0;
        }
    }

    public final void I(tsr tsrVar, nsw nswVar) {
        sa80 sa80VarF;
        tsr tsrVarB;
        if (tsrVar.e() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(tsrVar)) {
            if (!tsrVar.U.c(8)) {
                tsrVar = i50.b(tsrVar, h.a);
            }
            if (tsrVar == null || (sa80VarF = tsrVar.f()) == null) {
                return;
            }
            if (!sa80VarF.c && (tsrVarB = i50.b(tsrVar, g.a)) != null) {
                tsrVar = tsrVarB;
            }
            int i = tsrVar.b;
            if (nswVar.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(tsr tsrVar) {
        if (tsrVar.e() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(tsrVar)) {
            int i = tsrVar.b;
            vo70 vo70VarB = this.s.b(i);
            vo70 vo70VarB2 = this.t.b(i);
            if (vo70VarB == null && vo70VarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (vo70VarB != null) {
                accessibilityEventO.setScrollX((int) vo70VarB.a.invoke().floatValue());
                accessibilityEventO.setMaxScrollX((int) vo70VarB.b.invoke().floatValue());
            }
            if (vo70VarB2 != null) {
                accessibilityEventO.setScrollY((int) vo70VarB2.a.invoke().floatValue());
                accessibilityEventO.setMaxScrollY((int) vo70VarB2.b.invoke().floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(bb80 bb80Var, int i, int i2, boolean z) {
        String strU;
        sa80 sa80Var = bb80Var.d;
        int i3 = bb80Var.g;
        ob80<c6<gaj<Integer, Integer, Boolean, Boolean>>> ob80Var = ra80.i;
        if (sa80Var.a.b(ob80Var) && i50.a(bb80Var)) {
            gaj gajVar = (gaj) ((c6) bb80Var.d.d(ob80Var)).b;
            if (gajVar != null) {
                return ((Boolean) gajVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strU = u(bb80Var)) != null) {
            if (i < 0 || i != i2 || i2 > strU.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strU.length() > 0;
            C(q(A(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(strU.length()) : null, strU));
            G(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    public final void P() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        long j4;
        int i;
        int[] iArr2;
        int iNumberOfTrailingZeros;
        char c2;
        long j5;
        cb80 cb80VarB;
        String str;
        nsw nswVar = new nsw((Object) null);
        nsw nswVar2 = this.D;
        int[] iArr3 = nswVar2.b;
        long[] jArr3 = nswVar2.a;
        int length = jArr3.length - 2;
        msw<cb80> mswVar = this.J;
        char c3 = 7;
        long j6 = -9187201950435737472L;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j2 = 128;
            while (true) {
                long j7 = jArr3[i3];
                j3 = 255;
                if ((((~j7) << c3) & j7 & j6) != j6) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j7 & 255) < 128) {
                            c2 = c3;
                            int i6 = iArr3[(i3 << 3) + i5];
                            j5 = j6;
                            eb80 eb80VarB = t().b(i6);
                            bb80 bb80Var = eb80VarB != null ? eb80VarB.a : null;
                            if (bb80Var != null) {
                                if (!bb80Var.d.a.b(hb80.d)) {
                                    nswVar.a(i6);
                                    cb80VarB = mswVar.b(i6);
                                    if (cb80VarB != null) {
                                        str = (String) ta80.a(cb80VarB.a, hb80.d);
                                    } else {
                                        str = null;
                                    }
                                    F(i6, 32, str);
                                }
                            } else {
                                nswVar.a(i6);
                                cb80VarB = mswVar.b(i6);
                                if (cb80VarB != null) {
                                    str = (String) ta80.a(cb80VarB.a, hb80.d);
                                } else {
                                    str = null;
                                }
                                F(i6, 32, str);
                            }
                        } else {
                            c2 = c3;
                            j5 = j6;
                        }
                        j7 >>= 8;
                        i5++;
                        c3 = c2;
                        j6 = j5;
                    }
                    c = c3;
                    j = j6;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j6;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c3 = c;
                j6 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        int[] iArr4 = nswVar.b;
        long[] jArr4 = nswVar.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr4[i7];
                if ((((~j8) << c) & j8 & j) != j) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j8 & j3) < j2) {
                            int i10 = iArr4[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = nswVar2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = nswVar2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                long j9 = jArr5[i16] >>> i17;
                                long j10 = jArr5[i16 + 1] << (64 - i17);
                                iArr2 = iArr4;
                                long j11 = j9 | (j10 & ((-i17) >> 63));
                                j4 = j8;
                                long j12 = (((long) i12) * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j;
                                while (j13 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                                    long j14 = j13;
                                    if (nswVar2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    } else {
                                        j13 = j14 & (j14 - 1);
                                    }
                                }
                                if ((j11 & ((~j11) << 6) & j) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i13;
                                iArr4 = iArr2;
                                j8 = j4;
                                jArr4 = jArr2;
                            }
                            int i18 = iNumberOfTrailingZeros;
                            if (i18 >= 0) {
                                nswVar2.f(i18);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j8;
                            i = i2;
                            iArr2 = iArr4;
                        }
                        j8 = j4 >> i;
                        i9++;
                        iArr4 = iArr2;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    int i19 = i2;
                    iArr = iArr4;
                    if (i8 != i19) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                iArr4 = iArr;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        mswVar.c();
        gwo<eb80> gwoVarT = t();
        int[] iArr5 = gwoVarT.b;
        Object[] objArr = gwoVarT.c;
        long[] jArr6 = gwoVarT.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i20 = 0;
            while (true) {
                long j15 = jArr6[i20];
                if ((((~j15) << c) & j15 & j) != j) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j15 & j3) < j2) {
                            int i23 = (i20 << 3) + i22;
                            int i24 = iArr5[i23];
                            bb80 bb80Var2 = ((eb80) objArr[i23]).a;
                            sa80 sa80Var = bb80Var2.d;
                            ob80<String> ob80Var = hb80.d;
                            if (sa80Var.a.b(ob80Var) && nswVar2.a(i24)) {
                                F(i24, 16, (String) bb80Var2.d.d(ob80Var));
                            }
                            mswVar.h(i24, new cb80(bb80Var2, t()));
                        }
                        j15 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.K = new cb80(this.d.getSemanticsOwner().a(), t());
    }

    @Override // defpackage.e6
    public final d7 b(View view) {
        return this.m;
    }

    public final void j(int i, c7 c7Var, String str, Bundle bundle) {
        bb80 bb80Var;
        qx80 qx80Var;
        Region regionN;
        float[] fArrM;
        Rect rectL;
        AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
        eb80 eb80VarB = t().b(i);
        if (eb80VarB == null || (bb80Var = eb80VarB.a) == null) {
            return;
        }
        sa80 sa80Var = bb80Var.d;
        rtw<ob80<?>, Object> rtwVar = sa80Var.a;
        String strU = u(bb80Var);
        if (Intrinsics.g(str, this.G)) {
            int iD = this.E.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (Intrinsics.g(str, this.H)) {
            int iD2 = this.F.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (rtwVar.b(ra80.a) && bundle != null && Intrinsics.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strU != null ? strU.length() : Reader.READ_DONE)) {
                    ukf0 ukf0VarA = vb80.a(sa80Var);
                    if (ukf0VarA == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        RectF rectF = null;
                        if (i5 >= ukf0VarA.a.a.b.length()) {
                            arrayList.add(null);
                            accessibilityNodeInfo = accessibilityNodeInfo;
                            i3 = i3;
                        } else {
                            lk40 lk40VarB = ukf0VarA.b(i5);
                            ywx ywxVarD = bb80Var.d();
                            long jI0 = 0;
                            if (ywxVarD != null) {
                                if (!ywxVarD.E1().C) {
                                    ywxVarD = null;
                                }
                                if (ywxVarD != null) {
                                    jI0 = ywxVarD.i0(0L);
                                }
                            }
                            lk40 lk40VarJ = lk40VarB.j(jI0);
                            lk40 lk40VarG = bb80Var.g();
                            lk40 lk40VarF = lk40VarJ.h(lk40VarG) ? lk40VarJ.f(lk40VarG) : null;
                            if (lk40VarF != null) {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lk40VarF.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(lk40VarF.a)) << 32);
                                AndroidComposeView androidComposeView = this.d;
                                long jW = androidComposeView.w(jFloatToRawIntBits);
                                long jW2 = androidComposeView.w((((long) Float.floatToRawIntBits(lk40VarF.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(lk40VarF.c)) << 32));
                                int i6 = (int) (jW >> 32);
                                int i7 = (int) (jW2 >> 32);
                                int i8 = (int) (jW & 4294967295L);
                                int i9 = (int) (jW2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        accessibilityNodeInfo = accessibilityNodeInfo;
                        i3 = i3;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        ob80<String> ob80Var = hb80.y;
        if (rtwVar.b(ob80Var) && bundle != null && Intrinsics.g(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) ta80.a(sa80Var, ob80Var);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.g(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, bb80Var.g);
            return;
        }
        if (Intrinsics.g(str, "androidx.compose.ui.semantics.shapeType")) {
            qx80 qx80Var2 = (qx80) ta80.a(sa80Var, hb80.O);
            if (qx80Var2 != null) {
                b9z b9zVarP = p(qx80Var2, bb80Var);
                if (b9zVarP instanceof b9z.b) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(b9zVarP));
                    return;
                } else if (b9zVarP instanceof b9z.c) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(b9zVarP));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(b9zVarP));
                    return;
                } else if (!(b9zVarP instanceof b9z.a)) {
                    uhc.a();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(b9zVarP));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.g(str, "androidx.compose.ui.semantics.shapeRect")) {
            qx80 qx80Var3 = (qx80) ta80.a(sa80Var, hb80.O);
            if (qx80Var3 == null || (rectL = L(p(qx80Var3, bb80Var))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
            return;
        }
        if (Intrinsics.g(str, "androidx.compose.ui.semantics.shapeCorners")) {
            qx80 qx80Var4 = (qx80) ta80.a(sa80Var, hb80.O);
            if (qx80Var4 == null || (fArrM = M(p(qx80Var4, bb80Var))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM);
            return;
        }
        if (!Intrinsics.g(str, "androidx.compose.ui.semantics.shapeRegion") || (qx80Var = (qx80) ta80.a(sa80Var, hb80.O)) == null || (regionN = N(p(qx80Var, bb80Var))) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionN);
    }

    public final Rect k(eb80 eb80Var) {
        owo owoVar = eb80Var.b;
        float f2 = owoVar.a;
        float f3 = owoVar.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        AndroidComposeView androidComposeView = this.d;
        long jW = androidComposeView.w(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jW2 = androidComposeView.w((((long) Float.floatToRawIntBits(owoVar.c)) << 32) | (((long) Float.floatToRawIntBits(owoVar.d)) & 4294967295L));
        int i = (int) (jW >> 32);
        int i2 = (int) (jW2 >> 32);
        int i3 = (int) (jW & 4294967295L);
        int i4 = (int) (jW2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: all -> 0x0038, LOOP:0: B:33:0x0083->B:34:0x0085, LOOP_END, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:39:0x00b7, B:41:0x00bb, B:43:0x00ca, B:47:0x00d7), top: B:55:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (defpackage.hkd.b(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f1 -> B:50:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.x1b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.l(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    public final boolean m(int i, long j, boolean z) {
        ob80<vo70> ob80Var;
        int i2;
        vo70 vo70Var;
        if (Intrinsics.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gwo<eb80> gwoVarT = t();
            if (!gly.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    ob80Var = hb80.u;
                } else {
                    if (z) {
                        uhc.a();
                        return false;
                    }
                    ob80Var = hb80.t;
                }
                Object[] objArr = gwoVarT.c;
                long[] jArr = gwoVarT.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    eb80 eb80Var = (eb80) objArr[(i3 << 3) + i6];
                                    owo owoVar = eb80Var.b;
                                    i2 = i4;
                                    float f2 = owoVar.a;
                                    float f3 = owoVar.b;
                                    float f4 = owoVar.c;
                                    float f5 = owoVar.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (((fIntBitsToFloat2 < f5) & (fIntBitsToFloat >= f2) & (fIntBitsToFloat < f4) & (fIntBitsToFloat2 >= f3)) && (vo70Var = (vo70) ta80.a(eb80Var.a.d, ob80Var)) != null) {
                                        boolean z3 = vo70Var.c;
                                        int i7 = z3 ? -i : i;
                                        if (i == 0 && z3) {
                                            i7 = -1;
                                        }
                                        Function0<Float> function0 = vo70Var.a;
                                        if (i7 < 0) {
                                            if (function0.invoke().floatValue() > 0.0f) {
                                                z2 = true;
                                            }
                                        } else if (function0.invoke().floatValue() < vo70Var.b.invoke().floatValue()) {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.K);
            }
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        eb80 eb80VarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (eb80VarB = t().b(i)) != null) {
            bb80 bb80Var = eb80VarB.a;
            accessibilityEventObtain.setPassword(bb80Var.d.a.b(hb80.J));
            boolean zG = Intrinsics.g(ta80.a(bb80Var.d, hb80.n), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                f6.a(accessibilityEventObtain, zG);
            }
        }
        return accessibilityEventObtain;
    }

    public final b9z p(qx80 qx80Var, bb80 bb80Var) {
        ywx ywxVarD = bb80Var.d();
        return qx80Var.a(kc6.d(ywxVarD != null ? ywxVarD.c : 0L), bb80Var.c.O, this.d.getDensity());
    }

    public final AccessibilityEvent q(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int r(bb80 bb80Var) {
        sa80 sa80Var = bb80Var.d;
        if (!sa80Var.a.b(hb80.a)) {
            ob80<ulf0> ob80Var = hb80.F;
            if (sa80Var.a.b(ob80Var)) {
                return (int) (((ulf0) sa80Var.d(ob80Var)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int s(bb80 bb80Var) {
        sa80 sa80Var = bb80Var.d;
        if (!sa80Var.a.b(hb80.a)) {
            ob80<ulf0> ob80Var = hb80.F;
            if (sa80Var.a.b(ob80Var)) {
                return (int) (((ulf0) sa80Var.d(ob80Var)).a >> 32);
            }
        }
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gwo<eb80> t() {
        if (this.A) {
            this.A = false;
            AndroidComposeView androidComposeView = this.d;
            this.C = gb80.b(androidComposeView.getSemanticsOwner());
            if (v()) {
                msw mswVar = this.C;
                Resources resources = androidComposeView.getContext().getResources();
                ksw kswVar = this.E;
                kswVar.a();
                ksw kswVar2 = this.F;
                kswVar2.a();
                eb80 eb80Var = (eb80) mswVar.b(-1);
                bb80 bb80Var = eb80Var != null ? eb80Var.a : null;
                bb80Var.getClass();
                ArrayList arrayListB = tb80.b(bb80Var, new g50(mswVar), new h50(resources), kotlin.collections.a.c(bb80Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((bb80) arrayListB.get(i - 1)).g;
                        int i3 = ((bb80) arrayListB.get(i)).g;
                        kswVar.f(i2, i3);
                        kswVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean v() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void w(tsr tsrVar) {
        if (this.y.add(tsrVar)) {
            this.z.c(Unit.a);
        }
    }
}
