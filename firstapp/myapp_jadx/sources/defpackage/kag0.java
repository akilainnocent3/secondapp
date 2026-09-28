package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Reader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.sportygames.campaign.data.model.HeaderPayload;
import com.sportygames.campaign.data.model.PrizeInfo;
import com.sportygames.campaign.data.model.TournamentHistoryResponse;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentEligibilityCriteria;
import com.sportygames.campaign.presentation.TournamentPrizeInfo;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.newcms.b;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class kag0 {
    public static final hfs a = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.b(1378823199)), new j58(r58.d(4292921415L)), new j58(r58.b(1378823199))));
    public static final hfs b;
    public static final hfs c;
    public static final hfs d;
    public static final hfs e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.campaign.presentation.TournamentKt$JoinBannerContent$1$1", f = "Tournament.kt", l = {683}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Long a;
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ytw<Long> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ytw ytwVar, String str) {
            super(2, v1bVar);
            this.c = str;
            this.d = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.d, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Long lT;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                lT = kag0.t(this.c);
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lT = this.a;
                uj50.b(obj);
            }
            do {
                long jCurrentTimeMillis = System.currentTimeMillis();
                hfs hfsVar = kag0.a;
                this.d.setValue(Long.valueOf(jCurrentTimeMillis));
                if (lT != null && jCurrentTimeMillis >= lT.longValue()) {
                    return Unit.a;
                }
                this.a = lT;
                this.b = 1;
            } while (hkd.b(1000L, this) != y5bVar);
            return y5bVar;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.campaign.presentation.TournamentKt$ObserveJoinTournamentResult$1$1", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Function1<Context, HashMap<Long, String>> b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Function2<Context, HashMap<Long, String>, Unit> d;
        public final /* synthetic */ ytw e;
        public final /* synthetic */ i96 f;
        public final /* synthetic */ b5 i;
        public final /* synthetic */ Function0<Unit> v;
        public final /* synthetic */ ytw w;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[wzd0.values().length];
                try {
                    wzd0 wzd0Var = wzd0.a;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    wzd0 wzd0Var2 = wzd0.a;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l, Function1 function1, Context context, Function2 function2, ytw ytwVar, i96 i96Var, b5 b5Var, Function0 function0, ytw ytwVar2, v1b v1bVar) {
            super(2, v1bVar);
            this.a = l;
            this.b = function1;
            this.c = context;
            this.d = function2;
            this.e = ytwVar;
            this.f = i96Var;
            this.i = b5Var;
            this.v = function0;
            this.w = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            Long l;
            Integer id;
            HTTPResponse hTTPResponse;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            hfs hfsVar = kag0.a;
            ytw ytwVar = this.w;
            gzs gzsVar = (gzs) ytwVar.getValue();
            String strValueOf = null;
            wzd0 wzd0Var = gzsVar != null ? gzsVar.a : null;
            int i = wzd0Var == null ? -1 : a.a[wzd0Var.ordinal()];
            Function0<Unit> function0 = this.v;
            if (i == 1) {
                gzs gzsVar2 = (gzs) ytwVar.getValue();
                String str = (gzsVar2 == null || (hTTPResponse = (HTTPResponse) gzsVar2.b) == null) ? null : (String) hTTPResponse.getData();
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                if (Intrinsics.g(lowerCase, AnalyticsParam.EVENT_PARAM_SUCCESS) && (l = this.a) != null) {
                    Function1<Context, HashMap<Long, String>> function1 = this.b;
                    Context context = this.c;
                    HashMap<Long, String> map = new HashMap<>(function1.invoke(context));
                    map.put(l, "joined");
                    this.d.invoke(context, map);
                    HeaderPayload headerPayload = (HeaderPayload) this.e.getValue();
                    if (headerPayload != null && (id = headerPayload.getId()) != null) {
                        strValueOf = String.valueOf(id.intValue());
                    }
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    if (!StringsKt.U(strValueOf)) {
                        long jLongValue = l.longValue();
                        String nullableCountry = this.i.getNullableCountry();
                        String lowerCase2 = (nullableCountry != null ? nullableCountry : "").toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (Intrinsics.g(lowerCase2, "int")) {
                            lowerCase2 = "br";
                        }
                        kag0.u(this.f, jLongValue, lowerCase2, strValueOf);
                    }
                }
                function0.invoke();
            } else if (i == 2) {
                function0.invoke();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.campaign.presentation.TournamentKt$RollingRankNumber$1$1", f = "Tournament.kt", l = {1136, 1137, 1142}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<Float> A;
        public int a;
        public int b;
        public int c;
        public Iterator d;
        public int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ Function2<Integer, Integer, Unit> i;
        public final /* synthetic */ wd0<Float, ij0> v;
        public final /* synthetic */ ytw<Boolean> w;
        public final /* synthetic */ osw y;
        public final /* synthetic */ osw z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i, Function2<? super Integer, ? super Integer, Unit> function2, wd0<Float, ij0> wd0Var, ytw<Boolean> ytwVar, osw oswVar, osw oswVar2, ytw<Float> ytwVar2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.f = i;
            this.i = function2;
            this.v = wd0Var;
            this.w = ytwVar;
            this.y = oswVar;
            this.z = oswVar2;
            this.A = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004b A[PHI: r0 r1 r2 r3 r4 r10 r11
          0x004b: PHI (r0v9 int) = (r0v20 int), (r0v21 int) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r1v5 osw) = (r1v7 osw), (r1v0 osw) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r2v16 int) = (r2v20 int), (r2v22 int) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r3v3 int) = (r3v7 int), (r3v9 int) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r4v8 java.util.Iterator) = (r4v12 java.util.Iterator), (r4v14 java.util.Iterator) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r10v1 float) = (r10v4 float), (r10v0 float) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r11v2 int) = (r11v4 int), (r11v0 int) binds: [B:42:0x010b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:47:0x013c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0164 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x015b, code lost:
        
            if (r9.f(r19, r1) == r7) goto L50;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x015b -> B:51:0x015e). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kag0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.campaign.presentation.TournamentKt$TimerBannerContent$1$1", f = "Tournament.kt", l = {794}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Long> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw<Long> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:12:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                defpackage.uj50.b(r6)
                goto L22
            Ld:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L14:
                defpackage.uj50.b(r6)
            L17:
                r5.a = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = defpackage.hkd.b(r3, r5)
                if (r6 != r0) goto L22
                return r0
            L22:
                long r3 = java.lang.System.currentTimeMillis()
                hfs r6 = defpackage.kag0.a
                java.lang.Long r6 = java.lang.Long.valueOf(r3)
                ytw<java.lang.Long> r1 = r5.b
                r1.setValue(r6)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kag0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[rx1.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rx1 rx1Var = rx1.a;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rx1 rx1Var2 = rx1.a;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rx1 rx1Var3 = rx1.a;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                rx1 rx1Var4 = rx1.a;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                rx1 rx1Var5 = rx1.a;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[m040.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m040 m040Var = m040.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr2;
            int[] iArr3 = new int[s9s.a.values().length];
            try {
                iArr3[s9s.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[s9s.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr3;
        }
    }

    static {
        b = new hfs(kotlin.collections.b.k(new j58(r58.d(4294168198L)), new j58(r58.d(4290938414L))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f))), (14 & 8) != 0 ? 0 : 2);
        c = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4280360988L)), new j58(r58.d(4279440666L))));
        d = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4284370982L)), new j58(r58.d(4281478431L))));
        e = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4283254331L)), new j58(r58.d(4281479211L))));
        f = r58.d(4294954815L);
        g = r58.d(4289967027L);
        h = r58.b(452972351);
        i = r58.d(4294954815L);
        j = r58.d(4281216558L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(TournamentBannerConfig tournamentBannerConfig, final b5 b5Var, final String str, final com.sportygames.newcms.b bVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2) {
        final TournamentBannerConfig tournamentBannerConfig2;
        int i3;
        androidx.compose.runtime.b bVar2;
        String str2;
        androidx.compose.runtime.b bVarI = aVar.i(-1519912203);
        if ((i2 & 6) == 0) {
            tournamentBannerConfig2 = tournamentBannerConfig;
            i3 = (bVarI.A(tournamentBannerConfig2) ? 4 : 2) | i2;
        } else {
            tournamentBannerConfig2 = tournamentBannerConfig;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(b5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            String startTime = tournamentBannerConfig2.getStartTime();
            if (startTime == null) {
                startTime = "";
            }
            boolean zM = bVarI.M(startTime);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = m.b(Long.valueOf(System.currentTimeMillis()));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean zM2 = bVarI.M(startTime) | bVarI.M(ytwVar);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new a(null, ytwVar, startTime);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, startTime, (Function2) objY2);
            boolean zM3 = bVarI.M(tournamentBannerConfig2.getName()) | bVarI.e(((Number) ytwVar.getValue()).longValue()) | bVarI.M(startTime) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && bVarI.M(bVar)));
            Object objY3 = bVarI.y();
            if (zM3 || objY3 == c0042a) {
                String name = tournamentBannerConfig2.getName();
                String str3 = name != null ? name : "";
                long jLongValue = ((Number) ytwVar.getValue()).longValue();
                bVar.getClass();
                String string = StringsKt.t0(str3).toString();
                Long lC = scg0.c(jLongValue, startTime);
                if (lC != null) {
                    if (lC.longValue() <= 0 || lC.longValue() / 1000 <= 0) {
                        str2 = string + "  " + bVar.b(v5g0.Z.N, "Starts now") + ' ';
                    } else {
                        v5g0 v5g0Var = v5g0.Z;
                        String strB = bVar.b(v5g0Var.M, "Starts in");
                        String strD = scg0.d(startTime, bVar, jLongValue);
                        if (strD.length() == 0) {
                            str2 = string + "  " + bVar.b(v5g0Var.N, "Starts now") + ' ';
                        } else {
                            string = string + ' ' + strB + ' ' + strD;
                            objY3 = string;
                        }
                    }
                    objY3 = str2;
                } else {
                    objY3 = string;
                }
                bVarI.r(objY3);
            }
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(aVar2, 2.0f, 0.0f, 2);
            long j2 = j58.f;
            bVar2 = bVarI;
            lkf0.b((String) objY3, dVarH, j2, pi60.b(R.dimen._9ssp, 6, bVarI), new n9i(1), t9i.E, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVar2, 197040, 3120, 120768);
            String strR = r(b5Var, tournamentBannerConfig2.getTotalPrize());
            lkf0.b(String.format(bVar.b(v5g0.Z.W, "Win up to"), Arrays.copyOf(new Object[]{str + ' ' + strR}, 1)), androidx.compose.foundation.d.d(h.j(h.h(aVar2, 2.0f, 0.0f, 2), 0.0f, 2.0f, 0.0f, 0.0f, 13), false, null, null, function0, 15), j2, pi60.b(R.dimen._11ssp, 6, bVar2), null, t9i.G, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVar2, 196992, 3120, 120784);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cag0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kag0.a(tournamentBannerConfig2, b5Var, str, bVar, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final i96 i96Var, final aig0 aig0Var, final b5 b5Var, final HeaderPayload headerPayload, Long l, final Function0<Unit> function0, final Function1<? super Context, ? extends HashMap<Long, String>> function1, final Function2<? super Context, ? super HashMap<Long, String>, Unit> function2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        Function1<? super Context, ? extends HashMap<Long, String>> function3;
        Function2<? super Context, ? super HashMap<Long, String>, Unit> function4;
        Object bVar;
        wzd0 wzd0Var;
        Long l2 = l;
        androidx.compose.runtime.b bVarI = aVar.i(-832365289);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(i96Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(aig0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(b5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(headerPayload) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(l2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function3 = function1;
            i3 |= bVarI.A(function3) ? 1048576 : 524288;
        } else {
            function3 = function1;
        }
        if ((12582912 & i2) == 0) {
            function4 = function2;
            i3 |= bVarI.A(function4) ? 8388608 : 4194304;
        } else {
            function4 = function2;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            ytw ytwVarA = ts9.a(aig0Var.d, bVarI);
            ytw ytwVarC = m.c(headerPayload, bVarI);
            gzs gzsVar = (gzs) ytwVarA.getValue();
            wzd0 wzd0Var2 = gzsVar != null ? gzsVar.a : null;
            gzs gzsVar2 = (gzs) ytwVarA.getValue();
            HTTPResponse hTTPResponse = gzsVar2 != null ? (HTTPResponse) gzsVar2.b : null;
            int i4 = i3;
            boolean zM = ((i4 & 57344) == 16384) | bVarI.M(ytwVarA) | ((i4 & 3670016) == 1048576) | bVarI.A(context) | ((i4 & 29360128) == 8388608) | bVarI.M(ytwVarC) | bVarI.A(i96Var) | bVarI.A(b5Var) | ((i4 & 458752) == 131072);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                wzd0Var = wzd0Var2;
                l2 = l;
                bVar = new b(l2, function3, context, function4, ytwVarC, i96Var, b5Var, function0, ytwVarA, null);
                bVarI.r(bVar);
            } else {
                bVar = objY;
                wzd0Var = wzd0Var2;
                l2 = l;
            }
            xvf.f(wzd0Var, hTTPResponse, l2, (Function2) bVar, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Long l3 = l2;
            eVarZ.d = new Function2() { // from class: q9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kag0.b(i96Var, aig0Var, b5Var, headerPayload, l3, function0, function1, function2, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final i96 i96Var, final boolean z, final HeaderPayload headerPayload, final b5 b5Var, Function0 function0, final Function1 function1, final Function1 function2, final gaj gajVar, final Function0 function3, final Function1 function4, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        boolean z2;
        androidx.compose.runtime.b bVar;
        final Function0 function5;
        i96Var.getClass();
        b5Var.getClass();
        gajVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1241379850);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(i96Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= bVarI.b(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(headerPayload) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(b5Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= bVarI.A(gajVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= bVarI.A(function3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= bVarI.A(function4) ? 536870912 : 268435456;
        }
        if (bVarI.q(i4 & 1, (306783379 & i4) != 306783378)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new tf3(1);
                bVarI.r(objY);
            }
            Function0 function6 = (Function0) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            ytw ytwVarC = m.c(Boolean.valueOf(z2), bVarI);
            ytw ytwVarC2 = m.c(headerPayload, bVarI);
            ytw ytwVarC3 = m.c(b5Var, bVarI);
            ytw ytwVarC4 = m.c(function6, bVarI);
            ytw ytwVarC5 = m.c(function2, bVarI);
            ytw ytwVarC6 = m.c(function1, bVarI);
            ytw ytwVarC7 = m.c(gajVar, bVarI);
            ytw ytwVarC8 = m.c(function3, bVarI);
            ytw ytwVarC9 = m.c(function4, bVarI);
            boolean zA = bVarI.A(i96Var) | bVarI.A(context) | bVarI.M(ytwVarC) | bVarI.M(ytwVarC2) | bVarI.M(ytwVarC3) | bVarI.M(ytwVarC4) | bVarI.M(ytwVarC5) | bVarI.M(ytwVarC6) | bVarI.M(ytwVarC7) | bVarI.M(ytwVarC8) | bVarI.M(ytwVarC9);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                bVar = bVarI;
                objY2 = new lag0(i96Var, context, ytwVarC, ytwVarC2, ytwVarC3, ytwVarC4, ytwVarC5, ytwVarC6, ytwVarC7, ytwVarC8, ytwVarC9, null);
                bVar.r(objY2);
            } else {
                bVar = bVarI;
            }
            xvf.e(bVar, i96Var, (Function2) objY2);
            function5 = function6;
        } else {
            bVar = bVarI;
            bVar.G();
            function5 = function0;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kag0.c(i96Var, z, headerPayload, b5Var, function5, function1, function2, gajVar, function3, function4, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final b5 b5Var, final TournamentBannerConfig tournamentBannerConfig, final String str, final com.sportygames.newcms.b bVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar2;
        TournamentEligibilityCriteria tournamentEligibilityCriteria;
        Double minimumStakeCriteria;
        androidx.compose.runtime.b bVarI = aVar.i(-2033346697);
        int i3 = (bVarI.A(b5Var) ? 4 : 2) | i2 | (bVarI.A(tournamentBannerConfig) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            List<TournamentEligibilityCriteria> eligibilityCriteria = tournamentBannerConfig.getEligibilityCriteria();
            double dDoubleValue = (eligibilityCriteria == null || (tournamentEligibilityCriteria = (TournamentEligibilityCriteria) CollectionsKt.firstOrNull(eligibilityCriteria)) == null || (minimumStakeCriteria = tournamentEligibilityCriteria.getMinimumStakeCriteria()) == null) ? 1.0d : minimumStakeCriteria.doubleValue();
            v5g0 v5g0Var = v5g0.Z;
            String strB = bVar.b(v5g0Var.X, "Place your first bet of");
            String strB2 = bVar.b(v5g0Var.Y, "or more");
            String name = tournamentBannerConfig.getName();
            if (name == null) {
                name = "";
            }
            String strConcat = name.concat("!");
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(aVar2, 2.0f, 0.0f, 2);
            long j2 = j58.f;
            t9i t9iVar = t9i.E;
            lkf0.b(strConcat, dVarH, j2, pi60.b(R.dimen._10ssp, 6, bVarI), new n9i(1), t9iVar, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVarI, 197040, 3120, 120768);
            androidx.compose.ui.d dVarJ = h.j(h.h(aVar2, 2.0f, 0.0f, 2), 0.0f, 2.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(strB, null, j2, pi60.b(R.dimen._9ssp, 6, bVarI), null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVarI, 384, 3120, 120818);
            lkf0.b(str + ' ' + r(b5Var, Double.valueOf(dDoubleValue)), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), f, pi60.b(R.dimen._11ssp, 6, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVarI, 197040, 3072, 122832);
            lkf0.b(strB2, h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), j2, pi60.b(R.dimen._9ssp, 6, bVarI), null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVarI, 432, 3120, 120816);
            bVar2 = bVarI;
            bVar2.X(true);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kag0.d(b5Var, tournamentBannerConfig, str, bVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final m040 m040Var, final int i2, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        int i4;
        androidx.compose.ui.d dVarB;
        androidx.compose.runtime.b bVarI = aVar.i(856786173);
        int i5 = (bVarI.d(m040Var == null ? -1 : m040Var.ordinal()) ? 4 : 2) | i3 | (bVarI.d(i2) ? 32 : 16) | (bVarI.M(dVar) ? 256 : 128);
        if (bVarI.q(i5 & 1, (i5 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            final wd0 wd0Var = (wd0) objY;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zA = ((i5 & 14) == 4) | ((i5 & 112) == 32) | bVarI.A(wd0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new mag0(i2, m040Var, wd0Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            if (m040Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(i2, dVar, i3) { // from class: o8g0
                        public final /* synthetic */ int b;
                        public final /* synthetic */ d c;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            kag0.e(this.a, this.b, this.c, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                int iOrdinal = m040Var.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.drawable.dlg_ic_rank_up_tourney;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    i4 = R.drawable.dlg_ic_rank_down_tourney;
                }
                final float fC1 = mmdVar.C1(80.0f);
                bVarI.N(-1262178028);
                final float fC2 = mmdVar.C1(pi60.a(R.dimen._10sdp, 6, bVarI));
                bVarI.X(false);
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                crz crzVarA = erz.a(i4, 0, bVarI);
                float fA = pi60.a(R.dimen._16sdp, 6, bVarI);
                float fA2 = pi60.a(R.dimen._24sdp, 6, bVarI);
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarT = j.t(aVar3, fA, fA2);
                int iOrdinal2 = m040Var.ordinal();
                if (iOrdinal2 == 0) {
                    bVarI.N(2063546152);
                    boolean zC = bVarI.c(fC2) | bVarI.c(fC1) | bVarI.A(wd0Var);
                    Object objY3 = bVarI.y();
                    if (zC || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: f9g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                int iB = ycv.b(fC2);
                                return new iwo((((long) ycv.b(((Number) wd0Var.d()).floatValue() + fC1)) & 4294967295L) | (((long) iB) << 32));
                            }
                        };
                        bVarI.r(objY3);
                    }
                    dVarB = g.b(aVar3, (Function1) objY3);
                    bVarI.X(false);
                } else {
                    if (iOrdinal2 != 1) {
                        throw igf0.a(bVarI, 2063534394, false);
                    }
                    bVarI.N(2063536521);
                    boolean zC2 = bVarI.c(fC2) | bVarI.c(fC1) | bVarI.A(wd0Var);
                    Object objY4 = bVarI.y();
                    if (zC2 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: w8g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                int iB = ycv.b(fC2);
                                return new iwo((((long) ycv.b(((Number) wd0Var.d()).floatValue() + (-fC1))) & 4294967295L) | (((long) iB) << 32));
                            }
                        };
                        bVarI.r(objY4);
                    }
                    dVarB = g.b(aVar3, (Function1) objY4);
                    bVarI.X(false);
                }
                androidx.compose.ui.d dVarN = dVarT.n(dVarB);
                Object objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new p9g0();
                    bVarI.r(objY5);
                }
                h9n.a(crzVarA, null, androidx.compose.ui.graphics.a.a(dVarN, (Function1) objY5), null, null, 0.0f, null, bVarI, 48, 120);
                bVarI.X(true);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(i2, dVar, i3) { // from class: y9g0
                public final /* synthetic */ int b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kag0.e(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(b5 b5Var, final rx1 rx1Var, final TournamentBannerConfig tournamentBannerConfig, final TournamentUserPlayInfo tournamentUserPlayInfo, final String str, final com.sportygames.newcms.b bVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar2;
        String string;
        final osw oswVar;
        final ytw ytwVar;
        boolean z;
        TournamentPrizeInfo tournamentPrizeInfo;
        boolean z2;
        Object next;
        Object endRank;
        String strValueOf;
        Integer rank;
        final b5 b5Var2 = b5Var;
        androidx.compose.runtime.b bVarI = aVar.i(-731289652);
        int i3 = (bVarI.A(b5Var2) ? 4 : 2) | i2 | (bVarI.d(rx1Var.ordinal()) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(tournamentBannerConfig) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(tournamentUserPlayInfo) ? 2048 : 1024;
        }
        int i4 = i3 | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(bVar) ? 131072 : 65536);
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            int iIntValue = (tournamentUserPlayInfo == null || (rank = tournamentUserPlayInfo.getRank()) == null) ? 0 : rank.intValue();
            boolean z3 = rx1Var == rx1.d;
            float f2 = z3 ? 1.0f : 0.5f;
            long j2 = z3 ? f : j58.f;
            Long tournamentId = tournamentUserPlayInfo != null ? tournamentUserPlayInfo.getTournamentId() : null;
            v5g0 v5g0Var = v5g0.Z;
            String strB = bVar.b(v5g0Var.r, "Rank");
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = strB.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = bVar.b(v5g0Var.J, "Prizes").toUpperCase(locale);
            upperCase2.getClass();
            String upperCase3 = bVar.b(v5g0Var.s, "Prizes start from").toUpperCase(locale);
            upperCase3.getClass();
            Integer maxParticipants = tournamentBannerConfig.getMaxParticipants();
            if (maxParticipants != null) {
                StringBuilder sb = new StringBuilder("/");
                int i5 = rw.a;
                int iIntValue2 = maxParticipants.intValue();
                if (iIntValue2 >= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue2 / 1000);
                    sb2.append('k');
                    strValueOf = sb2.toString();
                } else {
                    strValueOf = String.valueOf(iIntValue2);
                }
                sb.append(strValueOf);
                string = sb.toString();
            } else {
                string = "";
            }
            String str2 = string;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            osw oswVar2 = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            int i6 = iIntValue;
            androidx.compose.ui.d dVarJ = h.j(j.g(aVar2, 1.0f), pi60.a(R.dimen._6sdp, 6, bVarI), 0.0f, pi60.a(R.dimen._6sdp, 6, bVarI), 0.0f, 10);
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var = f160.a;
            androidx.compose.ui.d dVarA = f160Var.a(0.5f, aVar2, true);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            long j3 = j58.f;
            float f3 = f2;
            lkf0.b(upperCase, null, j58.c(f2, j3), pi60.b(R.dimen._8ssp, 6, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 131058);
            androidx.compose.ui.d dVarC3 = j.C(aVar2, null, 3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarC3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            n54.b bVar4 = ht.a.l;
            d160 d160VarA2 = b160.a(jVar, bVar4, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                oswVar = oswVar2;
                ytwVar = ytwVar2;
                objY3 = new Function2() { // from class: aag0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue3 = ((Integer) obj).intValue();
                        int iIntValue4 = ((Integer) obj2).intValue();
                        if (iIntValue3 <= 0 || iIntValue4 <= 0 || iIntValue3 == iIntValue4) {
                            return Unit.a;
                        }
                        boolean z4 = false;
                        boolean z5 = iIntValue4 < iIntValue3;
                        if (iIntValue3 > 0 && iIntValue4 > iIntValue3) {
                            z4 = true;
                        }
                        ytw ytwVar3 = ytwVar;
                        osw oswVar3 = oswVar;
                        if (z5) {
                            ytwVar3.setValue(m040.a);
                            oswVar3.k(oswVar3.D() + 1);
                        } else if (z4) {
                            ytwVar3.setValue(m040.b);
                            oswVar3.k(oswVar3.D() + 1);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            } else {
                oswVar = oswVar2;
                ytwVar = ytwVar2;
            }
            ytw ytwVar3 = ytwVar;
            g(i6, tournamentId, j2, (Function2) objY3, bVarI, 3072);
            long jB = pi60.b(R.dimen._10ssp, 6, bVarI);
            bVarI.N(1446342104);
            float fX = ((mmd) bVarI.O(kna.h)).X(pi60.b(R.dimen._16ssp, 6, bVarI));
            bVarI.X(false);
            androidx.compose.ui.d dVarB = f160Var.b(j.i(aVar2, fX), bVar4);
            aiv aivVarC2 = g75.c(ht.a.g, false);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar3);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            imf0 imf0Var = new imf0(0L, jB, null, null, null, 0L, null, null, 0, jB, new uk10(), null, 16121853);
            androidx.compose.ui.d dVarD = g.d(aVar2, 0.0f, 1.0f, 1);
            long j4 = g;
            lkf0.b(str2, dVarD, j4, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, imf0Var, bVarI, 432, 3456, 53240);
            bVarI.X(true);
            bVarI.X(true);
            m040 m040Var = (m040) ytwVar3.getValue();
            int iD = oswVar.D();
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.j.a(aVar2, new jag0());
            m040 m040Var2 = (m040) ytwVar3.getValue();
            int i7 = m040Var2 == null ? -1 : e.a[m040Var2.ordinal()];
            n54 n54Var = ht.a.c;
            if (i7 != -1) {
                z = true;
                if (i7 == 1) {
                    n54Var = ht.a.i;
                } else if (i7 != 2) {
                    uhc.a();
                    return;
                }
            } else {
                z = true;
            }
            e(m040Var, iD, androidx.compose.foundation.layout.d.a.b(dVarA2, n54Var), bVarI, 0);
            bVarI.X(z);
            bVarI.X(z);
            androidx.compose.ui.d dVarA3 = f160Var.a(0.5f, aVar2, z);
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC7, cVar);
            lkf0.b(z3 ? upperCase2 : upperCase3, null, j58.c(f3, j3), pi60.b(R.dimen._8ssp, 6, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 131058);
            bVar2 = bVarI;
            int iOrdinal = rx1Var.ordinal();
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    bVar2.N(-2033816577);
                    bVar2.X(false);
                    Unit unit = Unit.a;
                } else {
                    bVar2.N(1375755479);
                    List<TournamentPrizeInfo> prizeInfo = tournamentBannerConfig.getPrizeInfo();
                    TournamentPrizeInfo tournamentPrizeInfo2 = prizeInfo != null ? (TournamentPrizeInfo) CollectionsKt.d0(prizeInfo) : null;
                    StringBuilder sb3 = new StringBuilder(strB);
                    sb3.append(' ');
                    if (tournamentPrizeInfo2 == null || (endRank = tournamentPrizeInfo2.getEndRank()) == null) {
                        endRank = "—";
                    }
                    sb3.append(endRank);
                    lkf0.b(sb3.toString(), h.j(aVar2, 0.0f, 1.0f, 0.0f, 0.0f, 13), j4, pi60.b(R.dimen._11ssp, 6, bVar2), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 197040, 0, 131024);
                    bVar2 = bVar2;
                    bVar2.X(false);
                    Unit unit2 = Unit.a;
                }
                z2 = true;
                b5Var2 = b5Var;
            } else {
                bVar2.N(1375252318);
                List<TournamentPrizeInfo> prizeInfo2 = tournamentBannerConfig.getPrizeInfo();
                if (prizeInfo2 != null) {
                    Iterator<T> it = prizeInfo2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        TournamentPrizeInfo tournamentPrizeInfo3 = (TournamentPrizeInfo) next;
                        Integer startRank = tournamentPrizeInfo3.getStartRank();
                        if (i6 >= (startRank != null ? startRank.intValue() : 0)) {
                            Integer endRank2 = tournamentPrizeInfo3.getEndRank();
                            if (i6 <= (endRank2 != null ? endRank2.intValue() : Reader.READ_DONE)) {
                                break;
                            }
                        }
                    }
                    tournamentPrizeInfo = (TournamentPrizeInfo) next;
                } else {
                    tournamentPrizeInfo = null;
                }
                StringBuilder sbA = y4s.a(str);
                b5Var2 = b5Var;
                sbA.append(r(b5Var2, tournamentPrizeInfo != null ? tournamentPrizeInfo.getPrize() : null));
                lkf0.b(sbA.toString(), h.j(aVar2, 0.0f, 3.0f, 0.0f, 0.0f, 13), f, pi60.b(R.dimen._13ssp, 6, bVar2), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 197040, 0, 131024);
                bVar2 = bVar2;
                bVar2.X(false);
                Unit unit3 = Unit.a;
                z2 = true;
            }
            bVar2.X(z2);
            bVar2.X(z2);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bag0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kag0.f(b5Var2, rx1Var, tournamentBannerConfig, tournamentUserPlayInfo, str, bVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final int i2, final Long l, final long j2, final Function2<? super Integer, ? super Integer, Unit> function2, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.b bVar;
        ytw ytwVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1839441616);
        int i4 = i3 | (bVarI.d(i2) ? 4 : 2) | (bVarI.M(l) ? 32 : 16) | (bVarI.e(j2) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = k.a(i2);
                bVarI.r(objY);
            }
            osw oswVar = (osw) objY;
            boolean z2 = i5 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = k.a(i2);
                bVarI.r(objY2);
            }
            osw oswVar2 = (osw) objY2;
            boolean z3 = i5 == 32;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            boolean z4 = i5 == 32;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                objY4 = m.b(Float.valueOf(1.0f));
                bVarI.r(objY4);
            }
            ytw ytwVar3 = (ytw) objY4;
            boolean z5 = i5 == 32;
            Object objY5 = bVarI.y();
            if (z5 || objY5 == c0042a) {
                objY5 = ee0.a(0.0f);
                bVarI.r(objY5);
            }
            wd0 wd0Var = (wd0) objY5;
            long jB = pi60.b(R.dimen._16ssp, 6, bVarI);
            osw oswVar3 = oswVar;
            imf0 imf0Var = new imf0(j2, jB, t9i.E, null, null, 0L, null, null, 0, jB, new uk10(), null, 16121848);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            final float fD0 = mmdVar.D0(jB);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zM = bVarI.M(ytwVar2) | bVarI.M(oswVar3) | ((i4 & 14) == 4) | bVarI.M(oswVar2) | bVarI.M(ytwVar3) | bVarI.A(wd0Var);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                ytwVar = ytwVar3;
                c cVar = new c(i2, function2, wd0Var, ytwVar2, oswVar3, oswVar2, ytwVar, null);
                oswVar3 = oswVar3;
                bVarI.r(cVar);
                objY6 = cVar;
            } else {
                ytwVar = ytwVar3;
            }
            xvf.g(numValueOf, l, (Function2) objY6, bVarI);
            final int iB = ycv.b(((Number) ytwVar.getValue()).floatValue() * ((Number) wd0Var.d()).floatValue() * fD0);
            float fV1 = mmdVar.v1(fD0);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = ls7.a(j.i(aVar2, fV1), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strValueOf = String.valueOf(oswVar3.D());
            boolean zD = bVarI.d(iB);
            Object objY7 = bVarI.y();
            if (zD || objY7 == c0042a) {
                objY7 = new Function1() { // from class: gag0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        return new iwo(((long) iB) & 4294967295L);
                    }
                };
                bVarI.r(objY7);
            }
            final ytw ytwVar4 = ytwVar;
            lkf0.b(strValueOf, g.b(aVar2, (Function1) objY7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 65532);
            String strValueOf2 = String.valueOf(oswVar2.D());
            boolean zD2 = bVarI.d(iB) | bVarI.M(ytwVar4) | bVarI.c(fD0);
            Object objY8 = bVarI.y();
            if (zD2 || objY8 == c0042a) {
                objY8 = new Function1() { // from class: hag0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        return new iwo(((long) ycv.b(iB - (((Number) ytwVar4.getValue()).floatValue() * fD0))) & 4294967295L);
                    }
                };
                bVarI.r(objY8);
            }
            lkf0.b(strValueOf2, g.b(aVar2, (Function1) objY8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 65532);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, l, j2, function2, i3) { // from class: iag0
                public final /* synthetic */ int a;
                public final /* synthetic */ Long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function2 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    kag0.g(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0213  */
    /* JADX WARN: Code duplicated, block: B:76:0x0217  */
    /* JADX WARN: Code duplicated, block: B:81:0x0232  */
    /* JADX WARN: Code duplicated, block: B:84:0x0283  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ea  */
    public static final void h(final b5 b5Var, final TournamentBannerConfig tournamentBannerConfig, final TournamentHistoryResponse tournamentHistoryResponse, final String str, final com.sportygames.newcms.b bVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar2;
        String name;
        String str2;
        String str3;
        long j2;
        t9i t9iVar;
        int iHashCode;
        Double winAmount;
        androidx.compose.runtime.b bVarI = aVar.i(481143208);
        int i3 = (bVarI.A(b5Var) ? 4 : 2) | i2 | (bVarI.A(tournamentBannerConfig) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(tournamentHistoryResponse) ? 256 : 128;
        }
        int i4 = i3 | (bVarI.M(str) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            StringBuilder sb = new StringBuilder();
            if (tournamentHistoryResponse == null || (name = tournamentHistoryResponse.getName()) == null) {
                name = tournamentBannerConfig.getName();
            }
            if (name == null) {
                name = "";
            }
            String strA = uf80.a(sb, name, "! ");
            double dDoubleValue = (tournamentHistoryResponse == null || (winAmount = tournamentHistoryResponse.getWinAmount()) == null) ? 0.0d : winAmount.doubleValue();
            boolean z = dDoubleValue > 0.0d;
            String strB = z ? bVar.b(v5g0.Z.U, "You won") : bVar.b(v5g0.Z.V, "Good effort! Better luck next time!");
            if (z) {
                str2 = str + ' ' + r(b5Var, Double.valueOf(dDoubleValue)) + '!';
            } else {
                str2 = null;
            }
            String str4 = str2;
            long jB = pi60.b(R.dimen._10ssp, 6, bVarI);
            long jB2 = pi60.b(R.dimen._11ssp, 6, bVarI);
            long jB3 = pi60.b(R.dimen._13ssp, 6, bVarI);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(j.g(aVar2, 1.0f), 2.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                str3 = strA;
            } else {
                str3 = strA;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                j2 = j58.f;
                t9iVar = t9i.E;
                lkf0.b(str3, null, j2, jB, new n9i(1), t9iVar, null, 0L, null, jB, 2, false, 1, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVarI, 196992, 3120, 54210);
                androidx.compose.ui.d dVarJ = h.j(aVar2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar3);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                lkf0.b(strB, null, j2, jB2, null, null, null, 0L, null, jB2, 2, false, 2, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVarI, 384, 3120, 54258);
                bVar2 = bVarI;
                if (str4 != null) {
                    bVar2.N(-116762998);
                    lkf0.b(str4, h.j(aVar2, 5.0f, 0.0f, 0.0f, 0.0f, 14), j2, jB3, null, t9iVar, null, 0L, null, jB3, 2, false, 1, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVar2, 197040, 3120, 54224);
                    bVar2 = bVar2;
                } else {
                    bVar2.N(-142832448);
                }
                bVar2.X(false);
                bVar2.X(true);
                bVar2.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            j2 = j58.f;
            t9iVar = t9i.E;
            lkf0.b(str3, null, j2, jB, new n9i(1), t9iVar, null, 0L, null, jB, 2, false, 1, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVarI, 196992, 3120, 54210);
            androidx.compose.ui.d dVarJ2 = h.j(aVar2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            lkf0.b(strB, null, j2, jB2, null, null, null, 0L, null, jB2, 2, false, 2, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVarI, 384, 3120, 54258);
            bVar2 = bVarI;
            if (str4 != null) {
                bVar2.N(-116762998);
                lkf0.b(str4, h.j(aVar2, 5.0f, 0.0f, 0.0f, 0.0f, 14), j2, jB3, null, t9iVar, null, 0L, null, jB3, 2, false, 1, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, new uk10(), null, 16252927), bVar2, 197040, 3120, 54224);
                bVar2 = bVar2;
            } else {
                bVar2.N(-142832448);
            }
            bVar2.X(false);
            bVar2.X(true);
            bVar2.X(true);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dag0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kag0.h(b5Var, tournamentBannerConfig, tournamentHistoryResponse, str, bVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final TournamentBannerConfig tournamentBannerConfig, final com.sportygames.newcms.b bVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVar2;
        boolean z;
        com.sportygames.newcms.b bVar3;
        v5g0 v5g0Var;
        String strB;
        androidx.compose.runtime.b bVarI = aVar.i(-188353718);
        if ((i2 & 6) == 0) {
            i3 = i2 | (bVarI.A(tournamentBannerConfig) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            boolean zM = bVarI.M(tournamentBannerConfig.getStartTime());
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = t(tournamentBannerConfig.getStartTime());
                bVarI.r(objY);
            }
            Long l = (Long) objY;
            boolean zM2 = bVarI.M(tournamentBannerConfig.getStartTime());
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = m.b(0L);
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            String startTime = tournamentBannerConfig.getStartTime();
            boolean zM3 = bVarI.M(ytwVar);
            Object objY3 = bVarI.y();
            if (zM3 || objY3 == c0042a) {
                objY3 = new d(ytwVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, startTime, (Function2) objY3);
            boolean zE = bVarI.e(((Number) ytwVar.getValue()).longValue()) | bVarI.M(l);
            Object objY4 = bVarI.y();
            if (zE || objY4 == c0042a) {
                objY4 = Long.valueOf(l != null ? Math.max(0L, l.longValue() - System.currentTimeMillis()) : 0L);
                bVarI.r(objY4);
            }
            long jLongValue = ((Number) objY4).longValue();
            long j2 = jLongValue / 86400000;
            long j3 = (jLongValue / 3600000) % 24;
            long j4 = (jLongValue / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
            long j5 = (jLongValue / 1000) % 60;
            v5g0 v5g0Var2 = v5g0.Z;
            String strB2 = bVar.b(v5g0Var2.M, "Starts in");
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = strB2.toUpperCase(locale);
            upperCase.getClass();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, pi60.a(R.dimen._10sdp, 6, bVarI), 0.0f, 11);
            kw0.j jVar = kw0.a;
            n54.b bVar4 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar4, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar5 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar5);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            String name = tournamentBannerConfig.getName();
            if (name == null) {
                name = "";
            }
            String strConcat = name.concat("!");
            androidx.compose.ui.d dVarJ2 = h.j(new LayoutWeightElement(1.0f, true), pi60.a(R.dimen._6sdp, 6, bVarI), 0.0f, 0.0f, 0.0f, 14);
            long j6 = j58.f;
            t9i t9iVar = t9i.E;
            lkf0.b(strConcat, dVarJ2, j6, pi60.b(R.dimen._14ssp, 6, bVarI), new n9i(1), t9iVar, null, 0L, null, 0L, 2, false, 1, 0, null, null, bVarI, 196992, 3120, 120768);
            bVar2 = bVarI;
            if (j2 >= 1) {
                bVar2.N(298497839);
                kw0.i iVar = new kw0.i(2.0f, true, new hw0());
                androidx.compose.ui.d dVarH = h.h(aVar2, pi60.a(R.dimen._7sdp, 6, bVar2), 0.0f, 2);
                d160 d160VarA2 = b160.a(iVar, bVar4, bVar2, 54);
                int iHashCode2 = Long.hashCode(bVar2.T);
                ne00 ne00VarS2 = bVar2.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar2, dVarH);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA2, bVar5);
                hlh0.a(bVar2, ne00VarS2, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
                }
                hlh0.a(bVar2, dVarC2, cVar);
                float fA = pi60.a(R.dimen._20sdp, 6, bVar2);
                String str = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
                if (j2 > 1) {
                    v5g0Var = v5g0Var2;
                    bVar3 = bVar;
                    strB = bVar3.b(v5g0Var.A, "Days");
                } else {
                    bVar3 = bVar;
                    v5g0Var = v5g0Var2;
                    strB = bVar3.b(v5g0Var.z, "Day");
                }
                String upperCase2 = strB.toUpperCase(locale);
                upperCase2.getClass();
                n(fA, 0, bVar2, str, upperCase2);
                String str2 = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1));
                String upperCase3 = (j3 > 1 ? bVar3.b(v5g0Var.C, "Hrs") : bVar3.b(v5g0Var.B, "Hr")).toUpperCase(locale);
                upperCase3.getClass();
                n(fA, 0, bVar2, str2, upperCase3);
                String str3 = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
                String upperCase4 = (j4 > 1 ? bVar3.b(v5g0Var.E, "Mins") : bVar3.b(v5g0Var.D, "Min")).toUpperCase(locale);
                upperCase4.getClass();
                n(fA, 0, bVar2, str3, upperCase4);
                bVar2.X(true);
                bVar2.X(false);
                z = true;
            } else {
                bVar2.N(299518390);
                androidx.compose.ui.d dVarJ3 = h.j(aVar2, 0.0f, 0.0f, 0.0f, pi60.a(R.dimen._2sdp, 6, bVar2), 7);
                i78 i78VarA = g78.a(kw0.c, ht.a.o, bVar2, 48);
                int iHashCode3 = Long.hashCode(bVar2.T);
                ne00 ne00VarS3 = bVar2.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar2, dVarJ3);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, i78VarA, bVar5);
                hlh0.a(bVar2, ne00VarS3, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a);
                }
                hlh0.a(bVar2, dVarC3, cVar);
                long jB = pi60.b(R.dimen._8ssp, 6, bVar2);
                lkf0.b(upperCase, h.j(aVar2, 0.0f, 0.0f, 0.0f, pi60.a(R.dimen._2sdp, 6, bVar2), 7), j6, jB, null, t9iVar, null, 0L, null, jB, 0, false, 0, 0, null, null, bVar2, 196992, 0, 130000);
                bVar2 = bVar2;
                d160 d160VarA3 = b160.a(jVar, bVar4, bVar2, 48);
                int iHashCode4 = Long.hashCode(bVar2.T);
                ne00 ne00VarS4 = bVar2.S();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVar2, aVar2);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA3, bVar5);
                hlh0.a(bVar2, ne00VarS4, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a);
                }
                hlh0.a(bVar2, dVarC4, cVar);
                z = true;
                p(String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)), bVar2, 0);
                o(0, bVar2);
                p(String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1)), bVar2, 0);
                o(0, bVar2);
                p(String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1)), bVar2, 0);
                bVar2.X(true);
                bVar2.X(true);
                bVar2.X(false);
            }
            bVar2.X(z);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eag0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    kag0.i(tournamentBannerConfig, bVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v53 */
    public static final void j(i96 i96Var, aig0 aig0Var, final b5 b5Var, final String str, androidx.compose.ui.d dVar, final Function1 function1, final List list, final Double d2, final long j2, final Function0 function0, final Function0 function2, final Function1 function3, final String str2, final gaj gajVar, final Function1 function4, final Function1 function5, final Function1 function6, final Function2 function7, final Function1 function8, final Function2 function9, final Function1 function10, final Function2 function11, final Function0 function12, final Function1 function13, final Function1 function14, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        final i96 i96Var2;
        final aig0 aig0Var2;
        final androidx.compose.ui.d dVar2;
        aig0 aig0Var3;
        i96 i96Var3;
        int i3;
        androidx.compose.ui.d dVar3;
        Context context;
        ytw ytwVar;
        i96 i96Var4;
        Object oag0Var;
        ytw ytwVar2;
        ytw ytwVar3;
        int i4;
        ArrayList arrayList;
        i96 i96Var5;
        o4 o4Var;
        final ArrayList arrayList2;
        androidx.compose.ui.d dVar4;
        boolean z2;
        final ytw ytwVar4;
        final SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        final ytw ytwVar5;
        aig0 aig0Var4;
        Object obj;
        final Function2 function15;
        final ytw ytwVar6;
        b5Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1107039055);
        int i5 = i2 | 18 | (bVarI.A(b5Var) ? 256 : 128) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 196608 | (bVarI.A(list) ? 8388608 : 4194304) | (bVarI.M(d2) ? 67108864 : 33554432) | (bVarI.e(j2) ? 536870912 : 268435456);
        int i6 = 100860288 | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function8) ? 536870912 : 268435456);
        int i7 = (bVarI.A(function9) ? 4 : 2) | (bVarI.A(function10) ? 32 : 16) | (bVarI.A(function11) ? 256 : 128) | (bVarI.A(function12) ? 2048 : 1024) | (bVarI.A(function13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function14) ? 131072 : 65536) | (bVarI.b(z) ? 1048576 : 524288);
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 306782355) == 306782354 && (599187 & i7) == 599186) ? false : true)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                bVarI.N(-1614864554);
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                j8i0 j8i0VarA = sgk.a(jq40.a(i96.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
                bVarI.X(false);
                i96 i96Var6 = (i96) j8i0VarA;
                bVarI.N(-1614864554);
                w8i0 w8i0VarA2 = zdt.a(bVarI);
                if (w8i0VarA2 == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                j8i0 j8i0VarA2 = sgk.a(jq40.a(aig0.class), w8i0VarA2.getViewModelStore(), dyb.a(w8i0VarA2), null, orp.b(bVarI), null);
                bVarI.X(false);
                int i8 = i5 & (-127);
                aig0Var3 = (aig0) j8i0VarA2;
                i96Var3 = i96Var6;
                i3 = i8;
                dVar3 = androidx.compose.ui.d.a.b;
            } else {
                bVarI.G();
                aig0Var3 = aig0Var;
                dVar3 = dVar;
                i3 = i5 & (-127);
                i96Var3 = i96Var;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar7 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar8 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.TRUE);
                bVarI.r(objY3);
            }
            ytw ytwVar9 = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(n4g0.a.a);
                bVarI.r(objY4);
            }
            ytw ytwVar10 = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new SnapshotStateList();
                bVarI.r(objY5);
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.b(null);
                bVarI.r(objY6);
            }
            ytw ytwVar11 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(null);
                bVarI.r(objY7);
            }
            ytw ytwVar12 = (ytw) objY7;
            final i96 i96Var7 = i96Var3;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = m.b(null);
                bVarI.r(objY8);
            }
            ytw ytwVar13 = (ytw) objY8;
            ytw ytwVarB = n95.b(aig0Var3.i, bVarI);
            int i9 = i3;
            final aig0 aig0Var5 = aig0Var3;
            ytw ytwVarA = n95.a(aig0Var3.w, new com.sportygames.newcms.b(0), null, bVarI, 0, 2);
            Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY9 = bVarI.y();
            if (objY9 == c0042a) {
                objY9 = m.b(null);
                bVarI.r(objY9);
            }
            final ytw ytwVar14 = (ytw) objY9;
            TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) ytwVar13.getValue();
            TournamentBannerConfig tournamentBannerConfig2 = (TournamentBannerConfig) ytwVar12.getValue();
            boolean z3 = (i7 & 458752) == 131072;
            Object objY10 = bVarI.y();
            if (z3 || objY10 == c0042a) {
                context = context2;
                ytwVar = ytwVar12;
                objY10 = new nag0(function14, ytwVar13, ytwVar, null);
                bVarI.r(objY10);
            } else {
                context = context2;
                ytwVar = ytwVar12;
            }
            xvf.g(tournamentBannerConfig, tournamentBannerConfig2, (Function2) objY10, bVarI);
            HeaderPayload headerPayload = (HeaderPayload) ytwVar8.getValue();
            Long l = (Long) ytwVar14.getValue();
            Object objY11 = bVarI.y();
            if (objY11 == c0042a) {
                objY11 = new Function0() { // from class: r8g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytwVar14.setValue(null);
                        return Unit.a;
                    }
                };
                bVarI.r(objY11);
            }
            Context context3 = context;
            final ytw ytwVar15 = ytwVar13;
            ytw ytwVar16 = ytwVar;
            b(i96Var7, aig0Var5, b5Var, headerPayload, l, (Function0) objY11, function8, function9, bVarI, 196608 | (i9 & 896) | ((i6 >> 9) & 3670016) | ((i7 << 21) & 29360128));
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            final ytw ytwVarC = m.c((HeaderPayload) ytwVar8.getValue(), bVarI);
            final ytw ytwVarC2 = m.c((List) ytwVar11.getValue(), bVarI);
            final ytw ytwVarC3 = m.c((Set) ytwVarB.getValue(), bVarI);
            Object[] objArr = {ibsVar, i96Var7, b5Var, str};
            int i10 = i9 & 57344;
            boolean zA = bVarI.A(i96Var7) | bVarI.A(b5Var) | (i10 == 16384) | bVarI.M(ytwVarC) | bVarI.M(ytwVarC2) | bVarI.M(ytwVarC3) | bVarI.A(ibsVar);
            Object objY12 = bVarI.y();
            if (zA || objY12 == c0042a) {
                Function1 function16 = new Function1() { // from class: s8g0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [hbs, s9g0] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((use) obj2).getClass();
                        final i96 i96Var8 = i96Var7;
                        final b5 b5Var2 = b5Var;
                        final String str3 = str;
                        final ytw ytwVar17 = ytwVarC;
                        final ytw ytwVar18 = ytwVarC2;
                        final ytw ytwVar19 = ytwVarC3;
                        ?? r0 = new cbs() { // from class: s9g0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                int i11 = kag0.e.b[aVar2.ordinal()];
                                i96 i96Var9 = i96Var8;
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        return;
                                    }
                                    i96Var9.x1();
                                    i96Var9.b.e();
                                    return;
                                }
                                System.out.println((Object) "ON_START");
                                i96Var9.getClass();
                                wzm wzmVar = i96Var9.b;
                                b5 b5Var3 = b5Var2;
                                b5Var3.getClass();
                                String str4 = b5Var3.getBaseUrlSocket() + "games/games-campaign/v1/campaign";
                                if (!wzmVar.c()) {
                                    i96Var9.x1();
                                    i96Var9.y = ej5.c(o8i0.d(i96Var9), null, null, new h96(i96Var9, null), 3);
                                    i96Var9.f = ej5.c(o8i0.d(i96Var9), null, null, new g96(i96Var9, null), 3);
                                    i96Var9.w = ej5.c(o8i0.d(i96Var9), null, null, new f96(i96Var9, null), 3);
                                    xzm xzmVar = i96Var9.a;
                                    xzmVar.getClass();
                                    wzmVar.b(str4, xzmVar.a(i96Var9.e));
                                }
                                HeaderPayload headerPayload2 = (HeaderPayload) ytwVar17.getValue();
                                List list2 = (List) ytwVar18.getValue();
                                Set set = (Set) ytwVar19.getValue();
                                if (headerPayload2 == null) {
                                    return;
                                }
                                Integer id = headerPayload2.getId();
                                String strValueOf = id != null ? String.valueOf(id.intValue()) : null;
                                String str5 = strValueOf == null ? "" : strValueOf;
                                if (StringsKt.U(str5)) {
                                    return;
                                }
                                String nullableCountry = b5Var3.getNullableCountry();
                                String lowerCase = (nullableCountry != null ? nullableCountry : "").toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (Intrinsics.g(lowerCase, "int")) {
                                    lowerCase = "br";
                                }
                                String str6 = lowerCase;
                                String strB = qhg0.a.b(str3);
                                jgg0 jgg0Var = jgg0.d;
                                wzm.g(wzmVar, jgg0Var, i96Var9.c.a(jgg0Var, str6, 0L, str5, strB));
                                Iterable iterableS = kag0.s(list2, set);
                                if (iterableS == null) {
                                    iterableS = m2g.a;
                                }
                                Iterator it = iterableS.iterator();
                                while (it.hasNext()) {
                                    Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
                                    if (tournamentId != null) {
                                        kag0.u(i96Var9, tournamentId.longValue(), str6, str5);
                                    }
                                }
                                jgg0 jgg0Var2 = jgg0.c;
                                wzm.g(wzmVar, jgg0Var2, i96Var9.c.a(jgg0Var2, str6, 0L, "", ""));
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r0);
                        ibsVar2.getLifecycle().b().compareTo(s9s.b.d);
                        return new vag0(ibsVar2, r0);
                    }
                };
                i96Var4 = i96Var7;
                bVarI.r(function16);
                objY12 = function16;
            } else {
                i96Var4 = i96Var7;
            }
            xvf.d(objArr, (Function1) objY12, bVarI);
            Object objY13 = bVarI.y();
            if (objY13 == c0042a) {
                objY13 = new m6a0();
                bVarI.r(objY13);
            }
            m6a0 m6a0Var = (m6a0) objY13;
            boolean zA2 = bVarI.A(i96Var4) | bVarI.M(ytwVar9) | bVarI.A(b5Var) | (i10 == 16384);
            Object objY14 = bVarI.y();
            if (zA2 || objY14 == c0042a) {
                ytwVar2 = ytwVar8;
                ytwVar3 = ytwVar7;
                oag0Var = new oag0(i96Var4, ytwVar2, ytwVar3, ytwVar9, b5Var, str, null);
                bVarI.r(oag0Var);
            } else {
                oag0Var = objY14;
                ytwVar2 = ytwVar8;
                ytwVar3 = ytwVar7;
            }
            xvf.e(bVarI, i96Var4, (Function2) oag0Var);
            n4g0 n4g0Var = (n4g0) ytwVar10.getValue();
            Object objY15 = bVarI.y();
            if (objY15 == c0042a) {
                objY15 = new pag0(snapshotStateList3, ytwVar10, ytwVar11, ytwVar3, null);
                bVarI.r(objY15);
            }
            xvf.e(bVarI, n4g0Var, (Function2) objY15);
            boolean zBooleanValue = ((Boolean) ytwVar3.getValue()).booleanValue();
            HeaderPayload headerPayload2 = (HeaderPayload) ytwVar2.getValue();
            Object objY16 = bVarI.y();
            if (objY16 == c0042a) {
                objY16 = new l9v(ytwVar10, 1);
                bVarI.r(objY16);
            }
            Function1 function17 = (Function1) objY16;
            boolean zA3 = bVarI.A(i96Var4);
            Object objY17 = bVarI.y();
            if (zA3 || objY17 == c0042a) {
                i4 = 1;
                objY17 = new zw30(i96Var4, i4);
                bVarI.r(objY17);
            } else {
                i4 = 1;
            }
            gaj gajVar2 = (gaj) objY17;
            int i11 = i7 << 15;
            int i12 = ((i9 << 3) & 7168) | 1572864 | ((i6 >> 12) & 458752) | (i11 & 234881024) | (i11 & 1879048192);
            i96 i96Var8 = i96Var4;
            int i13 = i4;
            c(i96Var8, zBooleanValue, headerPayload2, b5Var, null, function8, function17, gajVar2, function12, function13, bVarI, i12);
            bVarI = bVarI;
            boolean zA4 = bVarI.A(i96Var8);
            Object objY18 = bVarI.y();
            if (zA4 || objY18 == c0042a) {
                objY18 = new qag0(i96Var8, m6a0Var, null);
                bVarI.r(objY18);
            }
            xvf.e(bVarI, i96Var8, (Function2) objY18);
            int i14 = (bVarI.A(i96Var8) ? 1 : 0) | ((i6 & 1879048192) == 536870912 ? i13 : 0) | (bVarI.A(context3) ? 1 : 0) | ((i7 & 14) == 4 ? i13 : 0) | ((i7 & 112) == 32 ? i13 : 0);
            Object objY19 = bVarI.y();
            if (i14 != 0 || objY19 == c0042a) {
                objY19 = new rag0(i96Var8, snapshotStateList3, function8, context3, function9, function10, null);
                bVarI.r(objY19);
            }
            xvf.e(bVarI, i96Var8, (Function2) objY19);
            boolean zM = bVarI.M((List) ytwVar11.getValue()) | bVarI.M((Set) ytwVarB.getValue());
            Object objY20 = bVarI.y();
            if (zM || objY20 == c0042a) {
                objY20 = s((List) ytwVar11.getValue(), (Set) ytwVarB.getValue());
                bVarI.r(objY20);
            }
            List<TournamentUserPlayInfo> list2 = (List) objY20;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(l48.r(list2, 10));
                for (TournamentUserPlayInfo tournamentUserPlayInfoCopy$default : list2) {
                    Long tournamentId = tournamentUserPlayInfoCopy$default.getTournamentId();
                    Integer num = tournamentId != null ? (Integer) m6a0Var.get(tournamentId) : null;
                    if (num != null && num.intValue() > 0) {
                        tournamentUserPlayInfoCopy$default = TournamentUserPlayInfo.copy$default(tournamentUserPlayInfoCopy$default, null, num, null, 5, null);
                    }
                    arrayList3.add(tournamentUserPlayInfoCopy$default);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            snapshotStateList3.getClass();
            o4 o4Var2 = l6a0.b(snapshotStateList3).c;
            int i15 = (bVarI.A(o4Var2) ? 1 : 0) | ((i7 & 896) == 256 ? i13 : 0) | (bVarI.A(arrayList) ? 1 : 0);
            Object objY21 = bVarI.y();
            if (i15 != 0 || objY21 == c0042a) {
                objY21 = new sag0(function11, o4Var2, arrayList, null);
                bVarI.r(objY21);
            }
            xvf.g(o4Var2, arrayList, (Function2) objY21, bVarI);
            ytw<wag0.a> ytwVar17 = wag0.m;
            final ytw ytwVarA2 = ts9.a(wag0.d, bVarI);
            Object[] objArr2 = {((wag0.a) ((x5a0) ytwVar17).getValue()).b, ((wag0.a) ((x5a0) ytwVar17).getValue()).a, o4Var2, arrayList};
            boolean zM2 = bVarI.M(ytwVar17) | bVarI.A(i96Var8) | bVarI.A(o4Var2) | bVarI.A(arrayList);
            Object objY22 = bVarI.y();
            if (zM2 || objY22 == c0042a) {
                i96Var5 = i96Var8;
                ArrayList arrayList4 = arrayList;
                o4Var = o4Var2;
                objY22 = new tag0(i96Var5, o4Var, arrayList4, ytwVar17, null);
                arrayList2 = arrayList4;
                bVarI.r(objY22);
            } else {
                i96Var5 = i96Var8;
                arrayList2 = arrayList;
                o4Var = o4Var2;
            }
            xvf.h(objArr2, (Function2) objY22, bVarI);
            if (o4Var.isEmpty()) {
                dVar4 = dVar3;
                z2 = false;
                bVarI.N(1196003185);
            } else {
                bVarI.N(1264964049);
                TournamentHistoryResponse tournamentHistoryResponse = (TournamentHistoryResponse) ytwVarA2.getValue();
                com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) ytwVarA.getValue();
                boolean zM3 = bVarI.M(ytwVarA2);
                Object objY23 = bVarI.y();
                if (zM3 || objY23 == c0042a) {
                    obj = new Function1() { // from class: t8g0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object next;
                            String lowerCase;
                            Long tournamentId2;
                            TournamentHistoryResponse tournamentHistoryResponse2;
                            Long tournamentId3;
                            Long l2 = (Long) obj2;
                            final long jLongValue = l2.longValue();
                            SnapshotStateList snapshotStateList4 = snapshotStateList3;
                            ListIterator listIterator = snapshotStateList4.listIterator();
                            while (true) {
                                dxd0 dxd0Var = (dxd0) listIterator;
                                if (!dxd0Var.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = dxd0Var.next();
                                Long id = ((TournamentBannerConfig) next).getId();
                                if (id != null && id.longValue() == jLongValue) {
                                    break;
                                }
                            }
                            TournamentBannerConfig tournamentBannerConfig3 = (TournamentBannerConfig) next;
                            if (tournamentBannerConfig3 == null) {
                                return Unit.a;
                            }
                            String status = tournamentBannerConfig3.getStatus();
                            if (status != null) {
                                lowerCase = status.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = null;
                            }
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                            boolean zEquals = lowerCase.equals("stopped");
                            ytw ytwVar18 = ytwVarA2;
                            if (zEquals || lowerCase.equals("paused") || lowerCase.equals("ended") || !((tournamentHistoryResponse2 = (TournamentHistoryResponse) ytwVar18.getValue()) == null || (tournamentId3 = tournamentHistoryResponse2.getTournamentId()) == null || tournamentId3.longValue() != jLongValue)) {
                                p48.A(snapshotStateList4, new Function1() { // from class: t9g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        TournamentBannerConfig tournamentBannerConfig4 = (TournamentBannerConfig) obj3;
                                        tournamentBannerConfig4.getClass();
                                        Long id2 = tournamentBannerConfig4.getId();
                                        return Boolean.valueOf(id2 != null && id2.longValue() == jLongValue);
                                    }
                                });
                                TournamentHistoryResponse tournamentHistoryResponse3 = (TournamentHistoryResponse) ytwVar18.getValue();
                                if (tournamentHistoryResponse3 != null && (tournamentId2 = tournamentHistoryResponse3.getTournamentId()) != null && tournamentId2.longValue() == jLongValue) {
                                    wag0.d.m(null);
                                }
                            } else {
                                Long id2 = tournamentBannerConfig3.getId();
                                Long lValueOf = Long.valueOf(id2 != null ? id2.longValue() : 0L);
                                String startTime = tournamentBannerConfig3.getStartTime();
                                function7.invoke(lValueOf, startTime != null ? startTime : "");
                                ytwVar15.setValue(tournamentBannerConfig3);
                            }
                            function3.invoke(l2);
                            return Unit.a;
                        }
                    };
                    function15 = function7;
                    ytwVar15 = ytwVar15;
                    bVarI.r(obj);
                } else {
                    obj = objY23;
                    function15 = function7;
                }
                Function1 function18 = (Function1) obj;
                int i16 = (bVarI.A(arrayList2) ? 1 : 0) | ((i6 & 57344) == 16384 ? i13 : 0);
                Object objY24 = bVarI.y();
                if (i16 != 0 || objY24 == c0042a) {
                    objY24 = new Function1() { // from class: u8g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object obj3;
                            Object next;
                            Long l2 = (Long) obj2;
                            long jLongValue = l2.longValue();
                            ListIterator listIterator = snapshotStateList3.listIterator();
                            while (true) {
                                dxd0 dxd0Var = (dxd0) listIterator;
                                obj3 = null;
                                if (!dxd0Var.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = dxd0Var.next();
                                Long id = ((TournamentBannerConfig) next).getId();
                                if (id != null && id.longValue() == jLongValue) {
                                    break;
                                }
                            }
                            TournamentBannerConfig tournamentBannerConfig3 = (TournamentBannerConfig) next;
                            List list3 = arrayList2;
                            if (list3 != null) {
                                for (Object obj4 : list3) {
                                    Long tournamentId2 = ((TournamentUserPlayInfo) obj4).getTournamentId();
                                    if (tournamentId2 != null && tournamentId2.longValue() == jLongValue) {
                                        obj3 = obj4;
                                        break;
                                    }
                                }
                                obj3 = (TournamentUserPlayInfo) obj3;
                            }
                            if (tournamentBannerConfig3 == null) {
                                return Unit.a;
                            }
                            gajVar.invoke(l2, tournamentBannerConfig3, obj3);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY24);
                }
                Function1 function19 = (Function1) objY24;
                Object objY25 = bVarI.y();
                if (objY25 == c0042a) {
                    ytwVar6 = ytwVar16;
                    objY25 = new Function1() { // from class: v8g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object next;
                            long jLongValue = ((Long) obj2).longValue();
                            ListIterator listIterator = snapshotStateList3.listIterator();
                            while (true) {
                                dxd0 dxd0Var = (dxd0) listIterator;
                                if (!dxd0Var.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = dxd0Var.next();
                                Long id = ((TournamentBannerConfig) next).getId();
                                if (id != null && id.longValue() == jLongValue) {
                                    break;
                                }
                            }
                            TournamentBannerConfig tournamentBannerConfig3 = (TournamentBannerConfig) next;
                            if (tournamentBannerConfig3 != null) {
                                Long id2 = tournamentBannerConfig3.getId();
                                Long lValueOf = Long.valueOf(id2 != null ? id2.longValue() : 0L);
                                String startTime = tournamentBannerConfig3.getStartTime();
                                if (startTime == null) {
                                    startTime = "";
                                }
                                function15.invoke(lValueOf, startTime);
                                ytwVar6.setValue(tournamentBannerConfig3);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY25);
                } else {
                    ytwVar6 = ytwVar16;
                }
                Function1 function20 = (Function1) objY25;
                Object objY26 = bVarI.y();
                if (objY26 == c0042a) {
                    objY26 = new Function1() { // from class: x8g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object next;
                            long jLongValue = ((Long) obj2).longValue();
                            ListIterator listIterator = snapshotStateList3.listIterator();
                            while (true) {
                                dxd0 dxd0Var = (dxd0) listIterator;
                                if (!dxd0Var.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = dxd0Var.next();
                                Long id = ((TournamentBannerConfig) next).getId();
                                if (id != null && id.longValue() == jLongValue) {
                                    break;
                                }
                            }
                            TournamentBannerConfig tournamentBannerConfig3 = (TournamentBannerConfig) next;
                            if (tournamentBannerConfig3 != null) {
                                Long id2 = tournamentBannerConfig3.getId();
                                Long lValueOf = Long.valueOf(id2 != null ? id2.longValue() : 0L);
                                String startTime = tournamentBannerConfig3.getStartTime();
                                if (startTime == null) {
                                    startTime = "";
                                }
                                function15.invoke(lValueOf, startTime);
                                ytwVar6.setValue(tournamentBannerConfig3);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY26);
                }
                ytwVar16 = ytwVar6;
                androidx.compose.ui.d dVar5 = dVar3;
                l(b5Var, o4Var, arrayList2, dVar5, function1, tournamentHistoryResponse, function18, function19, function20, (Function1) objY26, bVar, z, bVarI, (i9 >> 6) & 64526, (i7 >> 15) & 112);
                dVar4 = dVar5;
                bVarI = bVarI;
                z2 = false;
            }
            bVarI.X(z2);
            TournamentBannerConfig tournamentBannerConfig3 = (TournamentBannerConfig) ytwVar15.getValue();
            if (tournamentBannerConfig3 == null) {
                bVarI.N(1267239758);
                bVarI.X(z2);
                snapshotStateList2 = snapshotStateList3;
            } else {
                bVarI.N(1267239759);
                Object objY27 = bVarI.y();
                if (objY27 == c0042a) {
                    ytwVar4 = ytwVar15;
                    objY27 = new Function0() { // from class: y8g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar4.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY27);
                } else {
                    ytwVar4 = ytwVar15;
                }
                Function0 function21 = (Function0) objY27;
                ?? r6 = (i6 & 29360128) == 8388608 ? i13 : z2;
                Object objY28 = bVarI.y();
                if (r6 != 0 || objY28 == c0042a) {
                    snapshotStateList = snapshotStateList3;
                    objY28 = new Function1() { // from class: z8g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Long l2 = (Long) obj2;
                            final long jLongValue = l2.longValue();
                            p48.A(snapshotStateList, new Function1() { // from class: o9g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    TournamentBannerConfig tournamentBannerConfig4 = (TournamentBannerConfig) obj3;
                                    tournamentBannerConfig4.getClass();
                                    Long id = tournamentBannerConfig4.getId();
                                    return Boolean.valueOf(id != null && id.longValue() == jLongValue);
                                }
                            });
                            function6.invoke(l2);
                            ytwVar4.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY28);
                } else {
                    snapshotStateList = snapshotStateList3;
                }
                Function1 function22 = (Function1) objY28;
                ?? r2 = (i6 & 3670016) == 1048576 ? i13 : z2;
                Object objY29 = bVarI.y();
                if (r2 != 0 || objY29 == c0042a) {
                    objY29 = new Function1() { // from class: a9g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Long l2 = (Long) obj2;
                            final long jLongValue = l2.longValue();
                            p48.A(snapshotStateList, new Function1() { // from class: n9g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    TournamentBannerConfig tournamentBannerConfig4 = (TournamentBannerConfig) obj3;
                                    tournamentBannerConfig4.getClass();
                                    Long id = tournamentBannerConfig4.getId();
                                    return Boolean.valueOf(id != null && id.longValue() == jLongValue);
                                }
                            });
                            function5.invoke(l2);
                            ytwVar4.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY29);
                }
                Function1 function23 = (Function1) objY29;
                int i17 = i9 >> 12;
                int i18 = ((i9 >> 3) & 112) | 100663680 | (i17 & 7168) | (i17 & 57344) | (i17 & 458752);
                int i19 = i6 << 18;
                snapshotStateList2 = snapshotStateList;
                androidx.compose.runtime.b bVar2 = bVarI;
                q(tournamentBannerConfig3, b5Var, function1, list, d2, j2, function0, function2, function21, function22, function23, z, bVar2, i18 | (i19 & 3670016) | (i19 & 29360128), (r12 >> 15) & 112);
                bVarI = bVar2;
                Unit unit = Unit.a;
                z2 = false;
                bVarI.X(false);
            }
            TournamentBannerConfig tournamentBannerConfig4 = (TournamentBannerConfig) ytwVar16.getValue();
            if (tournamentBannerConfig4 == null) {
                bVarI.N(1268123878);
                bVarI.X(z2);
                aig0Var4 = aig0Var5;
            } else {
                bVarI.N(1268123879);
                Object objY30 = bVarI.y();
                if (objY30 == c0042a) {
                    ytwVar5 = ytwVar16;
                    objY30 = new pi8(ytwVar5, 2);
                    bVarI.r(objY30);
                } else {
                    ytwVar5 = ytwVar16;
                }
                Function0 function24 = (Function0) objY30;
                boolean zA5 = bVarI.A(aig0Var5);
                Object objY31 = bVarI.y();
                if (zA5 || objY31 == c0042a) {
                    objY31 = new Function1() { // from class: b9g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Long l2 = (Long) obj2;
                            long jLongValue = l2.longValue();
                            ytwVar14.setValue(l2);
                            aig0 aig0Var6 = aig0Var5;
                            ej5.c(o8i0.d(aig0Var6), null, null, new yhg0(aig0Var6, jLongValue, null), 3);
                            function4.invoke(l2);
                            ytwVar5.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY31);
                }
                Function1 function25 = (Function1) objY31;
                ?? r7 = (i6 & 3670016) == 1048576 ? i13 : z2;
                Object objY32 = bVarI.y();
                if (r7 != 0 || objY32 == c0042a) {
                    final SnapshotStateList snapshotStateList4 = snapshotStateList2;
                    objY32 = new Function1() { // from class: c9g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Long l2 = (Long) obj2;
                            final long jLongValue = l2.longValue();
                            p48.A(snapshotStateList4, new Function1() { // from class: r9g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    TournamentBannerConfig tournamentBannerConfig5 = (TournamentBannerConfig) obj3;
                                    tournamentBannerConfig5.getClass();
                                    Long id = tournamentBannerConfig5.getId();
                                    return Boolean.valueOf(id != null && id.longValue() == jLongValue);
                                }
                            });
                            function5.invoke(l2);
                            ytwVar5.setValue(null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY32);
                }
                Function1 function26 = (Function1) objY32;
                int i20 = i9 >> 9;
                int i21 = ((i9 >> 3) & 112) | 805306752 | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016);
                int i22 = i6 << 21;
                androidx.compose.runtime.b bVar3 = bVarI;
                m(tournamentBannerConfig4, b5Var, function1, aig0Var5, list, d2, j2, function0, function2, function24, function25, function26, z, bVar3, i21 | (i22 & 29360128) | (i22 & 234881024), (i7 >> 12) & 896);
                aig0Var4 = aig0Var5;
                bVarI = bVar3;
                Unit unit2 = Unit.a;
                bVarI.X(false);
            }
            aig0Var2 = aig0Var4;
            dVar2 = dVar4;
            i96Var2 = i96Var5;
        } else {
            bVarI.G();
            i96Var2 = i96Var;
            aig0Var2 = aig0Var;
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(aig0Var2, b5Var, str, dVar2, function1, list, d2, j2, function0, function2, function3, str2, gajVar, function4, function5, function6, function7, function8, function9, function10, function11, function12, function13, function14, z, i2) { // from class: d9g0
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ String B;
                public final /* synthetic */ gaj C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ Function2 G;
                public final /* synthetic */ Function1 H;
                public final /* synthetic */ Function2 I;
                public final /* synthetic */ Function1 J;
                public final /* synthetic */ Function2 K;
                public final /* synthetic */ Function0 L;
                public final /* synthetic */ Function1 M;
                public final /* synthetic */ Function1 N;
                public final /* synthetic */ boolean O;
                public final /* synthetic */ aig0 b;
                public final /* synthetic */ b5 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ d e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ List i;
                public final /* synthetic */ Double v;
                public final /* synthetic */ long w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1575937);
                    kag0.j(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    /* JADX WARN: Code duplicated, block: B:99:0x014c  */
    public static final void k(final b5 b5Var, final TournamentBannerConfig tournamentBannerConfig, final TournamentUserPlayInfo tournamentUserPlayInfo, final TournamentHistoryResponse tournamentHistoryResponse, final Function1 function1, final com.sportygames.newcms.b bVar, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        String lowerCase;
        rx1 rx1Var;
        boolean z2;
        hfs hfsVar;
        float fA;
        float fA2;
        int i3;
        boolean z3;
        Double winAmount;
        Integer rank;
        TournamentPrizeInfo tournamentPrizeInfo;
        androidx.compose.runtime.b bVarI = aVar.i(-1011836958);
        int i4 = i2 | (bVarI.A(b5Var) ? 4 : 2) | (bVarI.A(tournamentBannerConfig) ? 32 : 16) | (bVarI.M(tournamentUserPlayInfo) ? 256 : 128) | (bVarI.M(tournamentHistoryResponse) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(bVar) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function2) ? 8388608 : 4194304) | (bVarI.A(function3) ? 67108864 : 33554432) | (bVarI.A(function4) ? 536870912 : 268435456);
        char c2 = bVarI.b(z) ? (char) 4 : (char) 2;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            String status = tournamentBannerConfig.getStatus();
            if (status != null) {
                lowerCase = status.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            if (lowerCase.equals("stopped") || lowerCase.equals("paused") || lowerCase.equals("ended") || tournamentHistoryResponse != null) {
                rx1Var = rx1.f;
            } else if (tournamentUserPlayInfo == null) {
                rx1Var = rx1.a;
            } else {
                Long lT = t(tournamentBannerConfig.getStartTime());
                if (lT != null) {
                    if (System.currentTimeMillis() < lT.longValue()) {
                        rx1Var = rx1.b;
                    } else if (tournamentUserPlayInfo.getRank() != null || ((rank = tournamentUserPlayInfo.getRank()) != null && rank.intValue() == 0)) {
                        rx1Var = rx1.c;
                    } else {
                        int iIntValue = tournamentUserPlayInfo.getRank().intValue();
                        List<TournamentPrizeInfo> prizeInfo = tournamentBannerConfig.getPrizeInfo();
                        if (prizeInfo == null || (tournamentPrizeInfo = (TournamentPrizeInfo) CollectionsKt.d0(prizeInfo)) == null) {
                            rx1Var = rx1.e;
                        } else {
                            Integer endRank = tournamentPrizeInfo.getEndRank();
                            if (iIntValue <= (endRank != null ? endRank.intValue() : 0)) {
                                rx1Var = rx1.d;
                            } else {
                                rx1Var = rx1.e;
                            }
                        }
                    }
                } else if (tournamentUserPlayInfo.getRank() != null) {
                    rx1Var = rx1.c;
                } else {
                    rx1Var = rx1.c;
                }
            }
            rx1 rx1Var2 = rx1Var;
            String str = (String) function1.invoke(tournamentBannerConfig.getCurrency());
            if (rx1Var2 != rx1.d) {
                if (rx1Var2 == rx1.f) {
                    z2 = ((tournamentHistoryResponse == null || (winAmount = tournamentHistoryResponse.getWinAmount()) == null) ? 0.0d : winAmount.doubleValue()) > 0.0d;
                }
            }
            if (z) {
                hfsVar = e;
            } else {
                hfsVar = z2 ? d : c;
            }
            char c3 = c2;
            float fA3 = dp9.a(R.dimen._8sdp, 54, bVarI);
            float fA4 = dp9.a(R.dimen._12sdp, 54, bVarI);
            int iOrdinal = rx1Var2.ordinal();
            if (iOrdinal == 3 || iOrdinal == 4) {
                bVarI.N(-1712650470);
                fA = dp9.a(R.dimen._32sdp, 54, bVarI);
                bVarI.X(false);
            } else if (iOrdinal != 5) {
                bVarI.N(-1712646886);
                float fA5 = dp9.a(R.dimen._35sdp, 54, bVarI);
                bVarI.X(false);
                fA = fA5;
            } else {
                bVarI.N(-1712648390);
                fA = dp9.a(R.dimen._35sdp, 54, bVarI);
                bVarI.X(false);
            }
            int iOrdinal2 = rx1Var2.ordinal();
            if (iOrdinal2 == 3 || iOrdinal2 == 4) {
                bVarI.N(-1712642246);
                fA2 = dp9.a(R.dimen._30sdp, 54, bVarI);
                bVarI.X(false);
            } else if (iOrdinal2 != 5) {
                bVarI.N(-1712638662);
                float fA6 = dp9.a(R.dimen._33sdp, 54, bVarI);
                bVarI.X(false);
                fA2 = fA6;
            } else {
                bVarI.N(-1712640166);
                fA2 = dp9.a(R.dimen._33sdp, 54, bVarI);
                bVarI.X(false);
            }
            v5g0 v5g0Var = v5g0.Z;
            String strB = bVar.b(v5g0Var.f, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png");
            String str2 = StringsKt.U(strB) ? "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png" : strB;
            String strB2 = bVar.b(v5g0Var.g, "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp");
            String str3 = StringsKt.U(strB2) ? "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp" : strB2;
            String strB3 = bVar.b(v5g0Var.O, "Join");
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            String str4 = str3;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(ls7.a(j.g(aVar2, 1.0f), j060.c(z ? fA4 : fA3)), z ? b : a, null, 0.0f, 6);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarG = h.g(j.g(aVar2, 1.0f), z ? 0.6f : 0.0f, z ? 0.6f : 1.0f);
            if (z) {
                fA3 = fA4;
            }
            androidx.compose.ui.d dVarA2 = ls7.a(dVarG, j060.c(fA3));
            zk40.a aVar4 = zk40.a;
            androidx.compose.ui.d dVarA3 = androidx.compose.foundation.a.a(dVarA2.n(z ? androidx.compose.foundation.a.b(aVar2, r58.b(344557961), aVar4) : aVar2), hfsVar, null, 0.0f, 6);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            crz crzVarA = erz.a(z ? R.drawable.dlg_tournament_bg_trophy_vip : R.drawable.dlg_tournament_bg_trophy, 0, bVarI);
            n54 n54Var2 = ht.a.i;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            androidx.compose.ui.d dVarI = j.i(j.w(dVar2.b(aVar2, n54Var2), dp9.a(R.dimen._95sdp, 54, bVarI)), dp9.a(R.dimen._36sdp, 54, bVarI));
            boolean z4 = (c3 & 14) == 4;
            Object objY = bVarI.y();
            boolean z5 = z4;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z5 || objY == c0042a) {
                objY = new Function1() { // from class: w9g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        boolean z6 = z;
                        a7lVar.v(z6 ? 1.0f : 1.17f);
                        a7lVar.k(z6 ? 1.2f : 1.0f);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarD = g.d(androidx.compose.ui.graphics.a.a(dVarI, (Function1) objY), -1.0f, 0.0f, 2);
            d0b.a.b bVar3 = d0b.a.g;
            h9n.a(crzVarA, null, dVarD, null, bVar3, 0.0f, null, bVarI, 24624, 104);
            androidx.compose.ui.d dVarH = h.h(dVar2.b(j.g(aVar2, 1.0f), ht.a.e), 0.0f, 2.0f, 1);
            kw0.j jVar = kw0.a;
            n54.b bVar4 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar4, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            gcg0.a(z ? str4 : str2, null, bz60.a(j.t(g.d(h.j(aVar2, 3.0f, 0.0f, 0.0f, 0.0f, 14).n(new VerticalAlignElement(bVar4)), 0.0f, 1.0f, 1), fA, fA2), z ? 1.1f : 1.0f, z ? 1.12f : 1.0f), bVar3, null, 0.0f, null, null, bVarI, 3120, 496);
            bVarI = bVarI;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            int iOrdinal3 = rx1Var2.ordinal();
            if (iOrdinal3 == 0) {
                i3 = 48;
                bVarI.N(-660690469);
                a(tournamentBannerConfig, b5Var, str, bVar, function4, bVarI, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | ((i4 >> 6) & 7168) | (57344 & (i4 >> 15)));
                bVarI.X(false);
                Unit unit = Unit.a;
            } else if (iOrdinal3 == 1) {
                i3 = 48;
                bVarI.N(-660679247);
                i(tournamentBannerConfig, bVar, bVarI, ((i4 >> 3) & 14) | ((i4 >> 12) & 112));
                bVarI.X(false);
                Unit unit2 = Unit.a;
            } else if (iOrdinal3 == 2) {
                i3 = 48;
                bVarI.N(-660673068);
                d(b5Var, tournamentBannerConfig, str, bVar, bVarI, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | ((i4 >> 6) & 7168));
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit3 = Unit.a;
            } else if (iOrdinal3 == 3 || iOrdinal3 == 4) {
                i3 = 48;
                bVarI.N(-660666570);
                int i5 = i4 << 3;
                f(b5Var, rx1Var2, tournamentBannerConfig, tournamentUserPlayInfo, str, bVar, bVarI, (i4 & 14) | (i5 & 896) | (i5 & 7168) | (i4 & 458752));
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit4 = Unit.a;
            } else {
                if (iOrdinal3 != 5) {
                    throw igf0.a(bVarI, -660691206, false);
                }
                bVarI.N(-660654276);
                int i6 = i4 & WebSocketProtocol.PAYLOAD_SHORT;
                int i7 = i4 >> 3;
                i3 = 48;
                h(b5Var, tournamentBannerConfig, tournamentHistoryResponse, str, bVar, bVarI, i6 | (i7 & 896) | (57344 & i7));
                bVarI.X(false);
                Unit unit5 = Unit.a;
            }
            bVarI.X(true);
            int iOrdinal4 = rx1Var2.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 != 5) {
                    bVarI.N(-679239662);
                    crz crzVarA2 = erz.a(R.drawable.dlg_ic_expand_tournament, 0, bVarI);
                    androidx.compose.ui.d dVarR = j.r(h.j(aVar2, 0.0f, 0.0f, dp9.a(R.dimen._10sdp, 54, bVarI), 0.0f, 11), dp9.a(R.dimen._16sdp, 54, bVarI));
                    Object objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = rzk.a(bVarI);
                    }
                    h9n.a(crzVarA2, null, androidx.compose.foundation.d.b(dVarR, (psw) objY2, null, false, null, function2, 28), null, null, 0.0f, null, bVarI, 48, 120);
                    bVarI.X(false);
                } else {
                    bVarI.N(-679928296);
                    crz crzVarA3 = erz.a(R.drawable.dlg_ic_close_tournament, 0, bVarI);
                    androidx.compose.ui.d dVarR2 = j.r(h.j(aVar2, 0.0f, 0.0f, 12.0f, 0.0f, 11), 20.0f);
                    Object objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = rzk.a(bVarI);
                    }
                    h9n.a(crzVarA3, null, androidx.compose.foundation.d.b(dVarR2, (psw) objY3, null, false, null, function0, 28), null, null, 0.0f, null, bVarI, 48, 120);
                    bVarI.X(false);
                }
                z3 = true;
            } else {
                bVarI.N(-682518129);
                androidx.compose.ui.d dVarJ = h.j(aVar2, 12.0f, 0.0f, 12.0f, 0.0f, 10);
                d160 d160VarA2 = b160.a(jVar, bVar4, bVarI, i3);
                int iHashCode5 = Long.hashCode(bVarI.m());
                ne00 ne00VarS5 = bVarI.S();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                androidx.compose.ui.d dVarG2 = h.g(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(ls7.a(aVar2, j060.c(100.0f)), f, aVar4), false, null, null, function3, 15), dp9.a(R.dimen._5sdp, 54, bVarI), dp9.a(R.dimen._3sdp, 54, bVarI));
                d160 d160VarA3 = b160.a(jVar, bVar4, bVarI, 48);
                int iHashCode6 = Long.hashCode(bVarI.m());
                ne00 ne00VarS6 = bVarI.S();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, bVar2);
                hlh0.a(bVarI, ne00VarS6, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                long jB = dp9.b(R.dimen._9ssp, 54, bVarI);
                lkf0.b(strB3, new VerticalAlignElement(bVar4), j58.b, jB, null, t9i.E, null, 0L, null, jB, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130000);
                h9n.a(erz.a(R.drawable.dlg_keyboard_arrow_up, 0, bVarI), null, j.r(h.j(aVar2, 3.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), null, null, 0.0f, null, bVarI, 432, 120);
                bVarI.X(true);
                ty0.a(bVarI, j.w(aVar2, dp9.a(R.dimen._7sdp, 54, bVarI)));
                crz crzVarA4 = erz.a(R.drawable.dlg_ic_close_tournament, 0, bVarI);
                androidx.compose.ui.d dVarR3 = j.r(aVar2, 20.0f);
                Object objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = rzk.a(bVarI);
                }
                h9n.a(crzVarA4, null, androidx.compose.foundation.d.b(dVarR3, (psw) objY4, null, false, null, function0, 28), null, null, 0.0f, null, bVarI, 48, 120);
                z3 = true;
                bVarI.X(true);
                bVarI.X(false);
                Unit unit6 = Unit.a;
            }
            f30.a(bVarI, z3, z3, z3);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tournamentBannerConfig, tournamentUserPlayInfo, tournamentHistoryResponse, function1, bVar, function0, function2, function3, function4, z, i2) { // from class: x9g0
                public final /* synthetic */ TournamentBannerConfig b;
                public final /* synthetic */ TournamentUserPlayInfo c;
                public final /* synthetic */ TournamentHistoryResponse d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ b f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kag0.k(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final b5 b5Var, final List list, final List list2, final androidx.compose.ui.d dVar, final Function1 function1, final TournamentHistoryResponse tournamentHistoryResponse, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final com.sportygames.newcms.b bVar, final boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        List list3;
        Function1 function6;
        TournamentHistoryResponse tournamentHistoryResponse2;
        Function1 function7;
        Function1 function8;
        int i5;
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function9;
        b5Var.getClass();
        list.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1412474662);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(b5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            list3 = list2;
            i4 |= bVarI.A(list3) ? 256 : 128;
        } else {
            list3 = list2;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function6 = function1;
            i4 |= bVarI.A(function6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function6 = function1;
        }
        if ((196608 & i2) == 0) {
            tournamentHistoryResponse2 = tournamentHistoryResponse;
            i4 |= bVarI.M(tournamentHistoryResponse2) ? 131072 : 65536;
        } else {
            tournamentHistoryResponse2 = tournamentHistoryResponse;
        }
        if ((1572864 & i2) == 0) {
            function7 = function2;
            i4 |= bVarI.A(function7) ? 1048576 : 524288;
        } else {
            function7 = function2;
        }
        if ((12582912 & i2) == 0) {
            function8 = function3;
            i4 |= bVarI.A(function8) ? 8388608 : 4194304;
        } else {
            function8 = function3;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(function5) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.b(z) ? 32 : 16;
        }
        int i6 = 1;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            if (list.isEmpty()) {
                androidx.compose.runtime.e eVarZ2 = bVarI.Z();
                if (eVarZ2 == null) {
                    return;
                }
                final Function1 function10 = function8;
                eVarZ = eVarZ2;
                final List list4 = list3;
                final Function1 function11 = function6;
                final Function1 function12 = function7;
                final TournamentHistoryResponse tournamentHistoryResponse3 = tournamentHistoryResponse2;
                function9 = new Function2() { // from class: k9g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        int iA2 = qj40.a(i3);
                        kag0.l(b5Var, list, list4, dVar, function11, tournamentHistoryResponse3, function12, function10, function4, function5, bVar, z, (a) obj, iA, iA2);
                        return Unit.a;
                    }
                };
            } else {
                boolean zA = bVarI.A(list);
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (zA || objY == c0042a) {
                    objY = new f1c0(list, i6);
                    bVarI.r(objY);
                }
                ved vedVarB = eqz.b(0, (Function0) objY, bVarI, 6, 2);
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TournamentBannerConfig) it.next()).getId());
                }
                boolean zA2 = bVarI.A(list) | bVarI.M(vedVarB);
                Object objY2 = bVarI.y();
                if (zA2 || objY2 == c0042a) {
                    objY2 = new uag0(null, vedVarB, list);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, arrayList, (Function2) objY2);
                androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar2);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar2);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                dpz.a(0.0f, 0, 48, 16380, null, pp8.b(-1861960035, new iaj() { // from class: l9g0
                    @Override // defpackage.iaj
                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                        TournamentUserPlayInfo tournamentUserPlayInfo;
                        Object next;
                        int iIntValue = ((Integer) obj2).intValue();
                        a aVar4 = (a) obj3;
                        ((Integer) obj4).getClass();
                        ((opz) obj).getClass();
                        final TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) list.get(iIntValue);
                        List list5 = list2;
                        if (list5 != null) {
                            Iterator it2 = list5.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!Intrinsics.g(((TournamentUserPlayInfo) next).getTournamentId(), tournamentBannerConfig.getId()));
                            tournamentUserPlayInfo = (TournamentUserPlayInfo) next;
                        } else {
                            tournamentUserPlayInfo = null;
                        }
                        TournamentHistoryResponse tournamentHistoryResponse4 = tournamentHistoryResponse;
                        TournamentHistoryResponse tournamentHistoryResponse5 = (tournamentHistoryResponse4 == null || !Intrinsics.g(tournamentHistoryResponse4.getTournamentId(), tournamentBannerConfig.getId())) ? null : tournamentHistoryResponse4;
                        boolean zA3 = aVar4.A(tournamentBannerConfig);
                        final Function1 function13 = function2;
                        boolean zM = zA3 | aVar4.M(function13);
                        Object objY3 = aVar4.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM || objY3 == c0042a2) {
                            objY3 = new Function0() { // from class: u9g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Long id = tournamentBannerConfig.getId();
                                    if (id != null) {
                                        function13.invoke(id);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar4.A(tournamentBannerConfig);
                        Function1 function14 = function3;
                        boolean zM2 = zA4 | aVar4.M(function14);
                        Object objY4 = aVar4.y();
                        if (zM2 || objY4 == c0042a2) {
                            objY4 = new n8c(tournamentBannerConfig, function14);
                            aVar4.r(objY4);
                        }
                        Function0 function15 = (Function0) objY4;
                        boolean zA5 = aVar4.A(tournamentBannerConfig);
                        final Function1 function16 = function4;
                        boolean zM3 = zA5 | aVar4.M(function16);
                        Object objY5 = aVar4.y();
                        if (zM3 || objY5 == c0042a2) {
                            objY5 = new Function0() { // from class: v9g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Long id = tournamentBannerConfig.getId();
                                    if (id != null) {
                                        function16.invoke(id);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY5);
                        }
                        Function0 function17 = (Function0) objY5;
                        boolean zA6 = aVar4.A(tournamentBannerConfig);
                        Function1 function18 = function5;
                        boolean zM4 = zA6 | aVar4.M(function18);
                        Object objY6 = aVar4.y();
                        if (zM4 || objY6 == c0042a2) {
                            objY6 = new q8c(tournamentBannerConfig, function18);
                            aVar4.r(objY6);
                        }
                        kag0.k(b5Var, tournamentBannerConfig, tournamentUserPlayInfo, tournamentHistoryResponse5, function1, bVar, function0, function15, function17, (Function0) objY6, z, aVar4, 0);
                        return Unit.a;
                    }
                }, bVarI), null, null, null, null, vedVarB, null, null, bVarI, j.g(aVar3, 1.0f), null, false);
                if (list.size() > 1) {
                    bVarI.N(1583898484);
                    androidx.compose.ui.d dVarI = j.i(h.j(j.g(aVar3, 1.0f), 0.0f, 3.0f, 0.0f, 0.0f, 13), 4.0f);
                    d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
                    int iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar2);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    bVarI.N(-1267982169);
                    int size = list.size();
                    int i7 = 0;
                    while (i7 < size) {
                        g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(h.h(aVar3, 3.0f, 0.0f, 2), 4.0f), j060.a), vedVarB.k() == i7 ? j58.f : r58.b(872415231), zk40.a), bVarI, 0);
                        i7++;
                    }
                    f30.a(bVarI, false, true, false);
                } else {
                    bVarI.N(1571901670);
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            eVarZ.d = function9;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function9 = new Function2() { // from class: m9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    kag0.l(b5Var, list, list2, dVar, function1, tournamentHistoryResponse, function2, function3, function4, function5, bVar, z, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
            eVarZ.d = function9;
        }
    }

    public static final void m(final TournamentBannerConfig tournamentBannerConfig, final b5 b5Var, final Function1 function1, final aig0 aig0Var, final List list, final Double d2, final long j2, final Function0 function0, final Function0 function2, final Function0 function3, final Function1 function4, final Function1 function5, final boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        b5 b5Var2;
        aig0 aig0Var2;
        List list2;
        Function0 function6;
        boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(-1226214967);
        int i4 = (i2 & 6) == 0 ? (bVarI.A(tournamentBannerConfig) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            b5Var2 = b5Var;
            i4 |= bVarI.A(b5Var2) ? 32 : 16;
        } else {
            b5Var2 = b5Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            aig0Var2 = aig0Var;
            i4 |= bVarI.A(aig0Var2) ? 2048 : 1024;
        } else {
            aig0Var2 = aig0Var;
        }
        if ((i2 & 24576) == 0) {
            list2 = list;
            i4 |= bVarI.A(list2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            list2 = list;
        }
        if ((12582912 & i2) == 0) {
            function6 = function0;
            i4 |= bVarI.A(function6) ? 8388608 : 4194304;
        } else {
            function6 = function0;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(function3) ? 536870912 : 268435456;
        }
        int i5 = (i3 & 6) == 0 ? i3 | (bVarI.A(function4) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i5 |= bVarI.A(function5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z2 = z;
            i5 |= bVarI.b(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306193555) == 306193554 && (i5 & 147) == 146) ? false : true)) {
            Double totalPrize = tournamentBannerConfig.getTotalPrize();
            final double dDoubleValue = totalPrize != null ? totalPrize.doubleValue() : 0.0d;
            final String str = (String) function1.invoke(tournamentBannerConfig.getCurrency());
            List<TournamentEligibilityCriteria> eligibilityCriteria = tournamentBannerConfig.getEligibilityCriteria();
            final TournamentEligibilityCriteria tournamentEligibilityCriteria = eligibilityCriteria != null ? (TournamentEligibilityCriteria) CollectionsKt.firstOrNull(eligibilityCriteria) : null;
            List<TournamentPrizeInfo> prizeInfo = tournamentBannerConfig.getPrizeInfo();
            if (prizeInfo == null) {
                prizeInfo = m2g.a;
            }
            final ArrayList arrayList = new ArrayList(l48.r(prizeInfo, 10));
            for (Iterator it = prizeInfo.iterator(); it.hasNext(); it = it) {
                TournamentPrizeInfo tournamentPrizeInfo = (TournamentPrizeInfo) it.next();
                arrayList.add(new PrizeInfo(tournamentPrizeInfo.getStartRank(), tournamentPrizeInfo.getEndRank(), tournamentPrizeInfo.getPrize(), null));
            }
            Long id = tournamentBannerConfig.getId();
            final long jLongValue = id != null ? id.longValue() : 0L;
            final b5 b5Var3 = b5Var2;
            final aig0 aig0Var3 = aig0Var2;
            final boolean z3 = z2;
            final List list3 = list2;
            final Function0 function7 = function6;
            u60.a(function3, new yle(39, false, false, false, false), pp8.b(-778874336, new Function2() { // from class: g9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Double minimumThreshold;
                    TournamentPrizeInfo tournamentPrizeInfo2;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        TournamentBannerConfig tournamentBannerConfig2 = tournamentBannerConfig;
                        String name = tournamentBannerConfig2.getName();
                        if (name == null) {
                            name = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        String str2 = str;
                        sb.append(str2);
                        sb.append(' ');
                        double d3 = dDoubleValue;
                        String strD = rw.d(d3);
                        b5 b5Var4 = b5Var3;
                        sb.append(rw.b(b5Var4, strD));
                        String string = sb.toString();
                        Integer maxParticipants = tournamentBannerConfig2.getMaxParticipants();
                        String strA = null;
                        String strValueOf = maxParticipants != null ? String.valueOf(maxParticipants.intValue()) : null;
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        TournamentEligibilityCriteria tournamentEligibilityCriteria2 = tournamentEligibilityCriteria;
                        String strB = rw.b(b5Var4, qhg0.a.a(b5Var4, tournamentEligibilityCriteria2 != null ? tournamentEligibilityCriteria2.getMinimumStakeCriteria() : null, 12));
                        String startTime = tournamentBannerConfig2.getStartTime();
                        if (startTime == null) {
                            startTime = "";
                        }
                        String strB2 = rw.b(b5Var4, rw.d(d3));
                        String startTime2 = tournamentBannerConfig2.getStartTime();
                        if (startTime2 == null) {
                            startTime2 = "";
                        }
                        String endTime = tournamentBannerConfig2.getEndTime();
                        if (endTime == null) {
                            endTime = "";
                        }
                        List<TournamentPrizeInfo> prizeInfo2 = tournamentBannerConfig2.getPrizeInfo();
                        String strB3 = rw.b(b5Var4, qhg0.a.a(b5Var4, (prizeInfo2 == null || (tournamentPrizeInfo2 = (TournamentPrizeInfo) CollectionsKt.firstOrNull(prizeInfo2)) == null) ? null : tournamentPrizeInfo2.getPrize(), 12));
                        if (tournamentEligibilityCriteria2 != null && (minimumThreshold = tournamentEligibilityCriteria2.getMinimumThreshold()) != null) {
                            strA = qhg0.a.a(b5Var4, Double.valueOf(minimumThreshold.doubleValue()), 12);
                        }
                        d7g0.a(name, string, jLongValue, true, strValueOf, strB, startTime, str2, arrayList, list3, function3, function4, function5, strB2, startTime2, endTime, strB3, strA == null ? "" : strA, null, null, 0L, null, null, function7, function2, aig0Var3, z3, aVar2, 3072, 0, 0, 8126464);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i4 >> 27) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    kag0.m(tournamentBannerConfig, b5Var, function1, aig0Var, list, d2, j2, function0, function2, function3, function4, function5, z, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final float f2, final int i2, androidx.compose.runtime.a aVar, String str, String str2) {
        final String str3;
        final String str4;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(783905745);
        int i3 = (bVarI.M(str) ? 4 : 2) | i2 | (bVarI.M(str2) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = h.g(androidx.compose.foundation.a.b(j.w(aVar2, f2), h, j060.c(2.0f)), 2.0f, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            long jB = pi60.b(R.dimen._10ssp, 6, bVarI);
            t9i t9iVar = t9i.E;
            lkf0.b(str, aVar2, f, jB, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i3 & 14) | 197040, 0, 131024);
            str3 = str;
            str4 = str2;
            lkf0.b(str4, aVar2, j58.f, pi60.b(R.dimen._6ssp, 6, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 197040, 0, 131024);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str;
            str4 = str2;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, i2, str3, str4) { // from class: fag0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;

                {
                    this.a = str3;
                    this.b = str4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kag0.n(this.c, iA, (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1842688136);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            long jB = pi60.b(R.dimen._10ssp, 6, bVarI);
            bVar = bVarI;
            lkf0.b(":", h.h(androidx.compose.ui.d.a.b, pi60.a(R.dimen._4sdp, 6, bVarI), 0.0f, 2), f, jB, null, t9i.E, null, 0L, null, jB, 0, false, 0, 0, null, null, bVar, 196998, 0, 130000);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new p8g0();
        }
    }

    public static final void p(String str, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-896098888);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            long jB = pi60.b(R.dimen._10ssp, 6, bVarI);
            bVar = bVarI;
            lkf0.b(str, h.f(androidx.compose.foundation.a.b(androidx.compose.ui.d.a.b, i, j060.c(2.0f)), pi60.a(R.dimen._2sdp, 6, bVarI)), j, jB, null, t9i.E, null, 0L, null, jB, 0, false, 0, 0, null, null, bVar, (i3 & 14) | 196992, 0, 130000);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new tw30(i2, 1, str);
        }
    }

    public static final void q(final TournamentBannerConfig tournamentBannerConfig, final b5 b5Var, final Function1 function1, final List list, final Double d2, final long j2, final Function0 function0, final Function0 function2, final Function0 function3, final Function1 function4, final Function1 function5, final boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        b5 b5Var2;
        List list2;
        Double d3;
        long j3;
        Function0 function6;
        int i5;
        androidx.compose.runtime.b bVarI = aVar.i(1021234840);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(tournamentBannerConfig) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            b5Var2 = b5Var;
            i4 |= bVarI.A(b5Var2) ? 32 : 16;
        } else {
            b5Var2 = b5Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            list2 = list;
            i4 |= bVarI.A(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i2 & 24576) == 0) {
            d3 = d2;
            i4 |= bVarI.M(d3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            d3 = d2;
        }
        if ((196608 & i2) == 0) {
            j3 = j2;
            i4 |= bVarI.e(j3) ? 131072 : 65536;
        } else {
            j3 = j2;
        }
        if ((1572864 & i2) == 0) {
            function6 = function0;
            i4 |= bVarI.A(function6) ? 1048576 : 524288;
        } else {
            function6 = function0;
        }
        if ((12582912 & i2) == 0) {
            i4 |= bVarI.A(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(function4) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (bVarI.A(function5) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            Double totalPrize = tournamentBannerConfig.getTotalPrize();
            final double dDoubleValue = totalPrize != null ? totalPrize.doubleValue() : 0.0d;
            final String str = (String) function1.invoke(tournamentBannerConfig.getCurrency());
            Long id = tournamentBannerConfig.getId();
            final long jLongValue = id != null ? id.longValue() : 0L;
            final b5 b5Var3 = b5Var2;
            final List list3 = list2;
            final Double d4 = d3;
            final long j4 = j3;
            final Function0 function7 = function6;
            u60.a(function3, new yle(39, false, false, false, false), pp8.b(826802991, new Function2() { // from class: i9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String name = tournamentBannerConfig.getName();
                        if (name == null) {
                            name = "";
                        }
                        vgg0.a(name, str + ' ' + rw.b(b5Var3, rw.d(dDoubleValue)), jLongValue, list3, d4, j4, function7, function2, function3, function4, function5, z, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i4 >> 24) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j9g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    kag0.q(tournamentBannerConfig, b5Var, function1, list, d2, j2, function0, function2, function3, function4, function5, z, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final String r(b5 b5Var, Double d2) {
        b5Var.getClass();
        int i2 = rw.a;
        return rw.b(b5Var, rw.d(d2 != null ? d2.doubleValue() : 0.0d));
    }

    public static final List<TournamentUserPlayInfo> s(List<TournamentUserPlayInfo> list, Set<Long> set) {
        if (set.isEmpty()) {
            return list;
        }
        if (list == null) {
            list = m2g.a;
        }
        HashSet hashSet = new HashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
            if (tournamentId != null) {
                hashSet.add(tournamentId);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!hashSet.contains(Long.valueOf(((Number) obj).longValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(new TournamentUserPlayInfo(Long.valueOf(((Number) obj2).longValue()), 0, Double.valueOf(0.0d)));
        }
        return arrayList2.isEmpty() ? list : CollectionsKt.i0(arrayList2, list);
    }

    public static final void u(i96 i96Var, long j2, String str, String str2) {
        if (j2 == 0 || StringsKt.U(str2)) {
            return;
        }
        i96Var.getClass();
        wzm wzmVar = i96Var.b;
        str.getClass();
        vzm vzmVar = i96Var.c;
        jgg0 jgg0Var = jgg0.b;
        String strA = vzmVar.a(jgg0Var, str, j2, "", "");
        i96Var.O.put(strA, Long.valueOf(j2));
        wzm.g(wzmVar, jgg0Var, strA);
        vzm vzmVar2 = i96Var.c;
        jgg0 jgg0Var2 = jgg0.a;
        String strA2 = vzmVar2.a(jgg0Var2, str, j2, str2, "");
        i96Var.N.put(strA2, Long.valueOf(j2));
        wzm.g(wzmVar, jgg0Var2, strA2);
        i96Var.v = str2;
        i96Var.i = str;
    }

    public static final Long t(String str) {
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        for (String str2 : kotlin.collections.b.k("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", gvQvkPPtA.AIUpoiXruEDh, "yyyy-MM-dd'T'HH:mm:ssXXX", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss")) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
                simpleDateFormat.setLenient(false);
                if (kotlin.text.c.k(str2, "'Z'", false) || StringsKt.M(str2, "XXX", false)) {
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                }
                Date date = simpleDateFormat.parse(str);
                if (date != null) {
                    return Long.valueOf(date.getTime());
                }
                continue;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
