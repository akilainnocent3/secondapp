package com.sportybet.plugin.event;

import android.os.SystemClock;
import com.google.protobuf.Reader;
import com.sporty.android.book.domain.entity.FeaturedBetBuilderMarket;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters;
import com.sporty.android.core.model.betbuilder.Filter;
import com.sporty.android.core.model.betbuilder.FilterType;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import defpackage.apg;
import defpackage.aqg;
import defpackage.ay0;
import defpackage.azy;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.csg;
import defpackage.de8;
import defpackage.drg;
import defpackage.e1i;
import defpackage.e8h;
import defpackage.ej5;
import defpackage.eo20;
import defpackage.epa0;
import defpackage.esg;
import defpackage.f00;
import defpackage.f1i;
import defpackage.fks;
import defpackage.fsg;
import defpackage.fzf0;
import defpackage.g1i;
import defpackage.g880;
import defpackage.gaj;
import defpackage.gg50;
import defpackage.gih;
import defpackage.gky;
import defpackage.gsg;
import defpackage.gzh;
import defpackage.hsg;
import defpackage.i2g;
import defpackage.i2i;
import defpackage.ib5;
import defpackage.ihb0;
import defpackage.isg;
import defpackage.jlv;
import defpackage.jrm;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.k650;
import defpackage.k980;
import defpackage.kbp;
import defpackage.ko70;
import defpackage.kpu;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l1g0;
import defpackage.lgb0;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.lyh;
import defpackage.m1g0;
import defpackage.m2g;
import defpackage.m2l;
import defpackage.mgb0;
import defpackage.myh;
import defpackage.n1i;
import defpackage.n35;
import defpackage.njs;
import defpackage.nkb0;
import defpackage.o2g;
import defpackage.o8i0;
import defpackage.or60;
import defpackage.ozh;
import defpackage.pdd0;
import defpackage.qus;
import defpackage.r0i;
import defpackage.r5b;
import defpackage.rdd0;
import defpackage.sg2;
import defpackage.srg;
import defpackage.ssg;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.trg;
import defpackage.tsg0;
import defpackage.u5y;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.urg;
import defpackage.usg;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.vgb0;
import defpackage.vrg;
import defpackage.vsg;
import defpackage.vu90;
import defpackage.wrg;
import defpackage.wsg;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.x920;
import defpackage.xrg;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yi5;
import defpackage.yrg;
import defpackage.ysm;
import defpackage.yzh;
import defpackage.zsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/event/e;", "Lihb0;", "Ln35;", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e extends ihb0 implements n35 {
    public final jrm A;
    public final wwd0 A0;
    public final k650 B;
    public final jlv B0;
    public final kbp C;
    public final ssw<Boolean> C0;
    public final fzf0 D;
    public final ssw D0;
    public final gih E;
    public final wwd0 E0;
    public final rdd0 F;
    public final jlv F0;
    public final azy G;
    public final ssw<x920.a> G0;
    public final yi5 H;
    public final jlv H0;
    public final gg50 I;
    public final wwd0 I0;
    public final ssw<com.sportybet.plugin.event.c> J;
    public final lyh<Boolean> J0;
    public final ssw K;
    public boolean K0;
    public final ku90<com.sporty.android.common.uievent.a> L;
    public boolean L0;
    public final r5b M;
    public final ssw<Boolean> N;
    public final ssw O;
    public int P;
    public String Q;
    public Event R;
    public int S;
    public ServerProductStatus.Product T;
    public boolean U;
    public final wwd0 V;
    public final ssw<List<Selection>> W;
    public final ssw X;
    public final wwd0 Y;
    public final wwd0 Z;
    public final ssw<Boolean> a0;
    public final ssw b0;
    public final ssw<BetBuilderExclusionFilters> c0;
    public final /* synthetic */ n35 d;
    public final ku90<com.sportybet.plugin.event.d> d0;
    public final csg e;
    public final r5b e0;
    public final e8h f;
    public Pair<? extends Market, Boolean> f0;
    public final vu90<qus> g0;
    public final vu90 h0;
    public final m2l i;
    public jvd0 i0;
    public final vu90<com.sportybet.plugin.event.g> j0;
    public final vu90 k0;
    public final vu90<UIState<String>> l0;
    public final vu90 m0;
    public final wwd0 n0;
    public final r5b o0;
    public final jlv p0;
    public final ssw<Integer> q0;
    public final ssw r0;
    public final ssw<Boolean> s0;
    public final ssw t0;
    public final ssw<Boolean> u0;
    public final lq1 v;
    public final ssw v0;
    public final mgb0 w;
    public final wwd0 w0;
    public final wwd0 x0;
    public final ysm y;
    public final wwd0 y0;
    public final nkb0 z;
    public final v340 z0;

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$1", f = "EventViewModel.kt", l = {925, 961, 284, 286, 1006, 298, 1042, 301}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Object a;
        public BOConfigParam b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, e eVar) {
            super(2, v1bVar);
            this.f = eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:107:0x0206  */
        /* JADX WARN: Code duplicated, block: B:109:0x0210  */
        /* JADX WARN: Code duplicated, block: B:111:0x0214  */
        /* JADX WARN: Code duplicated, block: B:114:0x0219  */
        /* JADX WARN: Code duplicated, block: B:116:0x021d  */
        /* JADX WARN: Code duplicated, block: B:117:0x0223  */
        /* JADX WARN: Code duplicated, block: B:119:0x022d  */
        /* JADX WARN: Code duplicated, block: B:121:0x0231  */
        /* JADX WARN: Code duplicated, block: B:124:0x0236  */
        /* JADX WARN: Code duplicated, block: B:126:0x023a  */
        /* JADX WARN: Code duplicated, block: B:127:0x0240  */
        /* JADX WARN: Code duplicated, block: B:129:0x024a  */
        /* JADX WARN: Code duplicated, block: B:131:0x024e  */
        /* JADX WARN: Code duplicated, block: B:134:0x0253  */
        /* JADX WARN: Code duplicated, block: B:136:0x0257  */
        /* JADX WARN: Code duplicated, block: B:137:0x025d  */
        /* JADX WARN: Code duplicated, block: B:139:0x0267  */
        /* JADX WARN: Code duplicated, block: B:141:0x026b  */
        /* JADX WARN: Code duplicated, block: B:144:0x0270  */
        /* JADX WARN: Code duplicated, block: B:146:0x0274  */
        /* JADX WARN: Code duplicated, block: B:147:0x027a  */
        /* JADX WARN: Code duplicated, block: B:149:0x0284 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:150:0x0286  */
        /* JADX WARN: Code duplicated, block: B:151:0x028c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:152:0x028e  */
        /* JADX WARN: Code duplicated, block: B:157:0x0297  */
        /* JADX WARN: Code duplicated, block: B:161:0x02bd A[PHI: r5 r6
          0x02bd: PHI (r5v11 njs) = (r5v8 njs), (r5v14 njs) binds: [B:159:0x02b9, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
          0x02bd: PHI (r6v17 java.lang.Object) = (r6v13 java.lang.Object), (r6v22 java.lang.Object) binds: [B:159:0x02b9, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:164:0x02d7 A[PHI: r5 r6
          0x02d7: PHI (r5v15 ztw) = (r5v12 ztw), (r5v18 ztw) binds: [B:162:0x02d3, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x02d7: PHI (r6v23 java.lang.Object) = (r6v21 java.lang.Object), (r6v49 java.lang.Object) binds: [B:162:0x02d3, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:167:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:172:0x0313  */
        /* JADX WARN: Code duplicated, block: B:175:0x0320  */
        /* JADX WARN: Code duplicated, block: B:177:0x0367  */
        /* JADX WARN: Code duplicated, block: B:179:0x0377 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:181:0x037c  */
        /* JADX WARN: Code duplicated, block: B:186:0x038a  */
        /* JADX WARN: Code duplicated, block: B:191:0x03c1 A[PHI: r5 r6 r7 r14 r16 r18
          0x03c1: PHI (r5v19 ztw) = (r5v16 ztw), (r5v22 ztw) binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x03c1: PHI (r6v50 com.sporty.android.core.model.config.bo.enums.BOConfigParam) = 
          (r6v33 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
          (r6v69 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
         binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x03c1: PHI (r7v54 java.lang.Object) = (r7v49 java.lang.Object), (r7v76 java.lang.Object) binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x03c1: PHI (r14v60 java.lang.Integer) = (r14v58 java.lang.Integer), (r14v65 java.lang.Integer) binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x03c1: PHI (r16v4 java.lang.Class<java.lang.String>) = (r16v0 java.lang.Class<java.lang.String>), (r16v5 java.lang.Class<java.lang.String>) binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x03c1: PHI (r18v2 java.lang.Class) = (r18v0 java.lang.Class), (r18v3 java.lang.Class) binds: [B:189:0x03bd, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:193:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:195:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:196:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:199:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:19:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:201:0x03e5  */
        /* JADX WARN: Code duplicated, block: B:202:0x03e9  */
        /* JADX WARN: Code duplicated, block: B:204:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:207:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:208:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:210:0x0404  */
        /* JADX WARN: Code duplicated, block: B:212:0x0408  */
        /* JADX WARN: Code duplicated, block: B:214:0x040c  */
        /* JADX WARN: Code duplicated, block: B:216:0x0411  */
        /* JADX WARN: Code duplicated, block: B:218:0x0415  */
        /* JADX WARN: Code duplicated, block: B:219:0x041b  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:221:0x0425  */
        /* JADX WARN: Code duplicated, block: B:223:0x0429  */
        /* JADX WARN: Code duplicated, block: B:226:0x042e  */
        /* JADX WARN: Code duplicated, block: B:228:0x0432  */
        /* JADX WARN: Code duplicated, block: B:229:0x0438  */
        /* JADX WARN: Code duplicated, block: B:22:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:231:0x0442  */
        /* JADX WARN: Code duplicated, block: B:233:0x0446  */
        /* JADX WARN: Code duplicated, block: B:236:0x044b  */
        /* JADX WARN: Code duplicated, block: B:238:0x044f  */
        /* JADX WARN: Code duplicated, block: B:239:0x0455  */
        /* JADX WARN: Code duplicated, block: B:241:0x045f  */
        /* JADX WARN: Code duplicated, block: B:243:0x0463  */
        /* JADX WARN: Code duplicated, block: B:246:0x0468  */
        /* JADX WARN: Code duplicated, block: B:248:0x046c  */
        /* JADX WARN: Code duplicated, block: B:249:0x0472  */
        /* JADX WARN: Code duplicated, block: B:251:0x047c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:252:0x047e  */
        /* JADX WARN: Code duplicated, block: B:253:0x0484 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:254:0x0486  */
        /* JADX WARN: Code duplicated, block: B:259:0x048e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0100  */
        /* JADX WARN: Code duplicated, block: B:263:0x04ad A[PHI: r2 r5 r16 r18
          0x04ad: PHI (r2v3 java.lang.Object) = (r2v2 java.lang.Object), (r2v7 java.lang.Object) binds: [B:261:0x04a9, B:8:0x0048] A[DONT_GENERATE, DONT_INLINE]
          0x04ad: PHI (r5v23 ssw) = (r5v20 ssw), (r5v25 ssw) binds: [B:261:0x04a9, B:8:0x0048] A[DONT_GENERATE, DONT_INLINE]
          0x04ad: PHI (r16v6 java.lang.Class<java.lang.String>) = (r16v4 java.lang.Class<java.lang.String>), (r16v7 java.lang.Class<java.lang.String>) binds: [B:261:0x04a9, B:8:0x0048] A[DONT_GENERATE, DONT_INLINE]
          0x04ad: PHI (r18v4 java.lang.Class) = (r18v2 java.lang.Class), (r18v5 java.lang.Class) binds: [B:261:0x04a9, B:8:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:266:0x04db A[PHI: r2 r3 r5 r6 r16 r18
          0x04db: PHI (r2v8 ssw<java.lang.Boolean>) = (r2v4 ssw<java.lang.Boolean>), (r2v11 ssw<java.lang.Boolean>) binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x04db: PHI (r3v2 java.lang.Object) = (r3v1 java.lang.Object), (r3v30 java.lang.Object) binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x04db: PHI (r5v26 com.sporty.android.core.model.config.bo.enums.BOConfigParam) = 
          (r5v24 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
          (r5v38 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
         binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x04db: PHI (r6v71 com.sporty.android.core.model.eventdetails.NewBadgeEventDetailsValue) = 
          (r6v70 com.sporty.android.core.model.eventdetails.NewBadgeEventDetailsValue)
          (r6v76 com.sporty.android.core.model.eventdetails.NewBadgeEventDetailsValue)
         binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x04db: PHI (r16v8 java.lang.Class<java.lang.String>) = (r16v6 java.lang.Class<java.lang.String>), (r16v9 java.lang.Class<java.lang.String>) binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x04db: PHI (r18v6 java.lang.Class) = (r18v4 java.lang.Class), (r18v7 java.lang.Class) binds: [B:264:0x04d7, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:268:0x04df  */
        /* JADX WARN: Code duplicated, block: B:270:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:271:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:274:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:276:0x04ff  */
        /* JADX WARN: Code duplicated, block: B:278:0x0503  */
        /* JADX WARN: Code duplicated, block: B:27:0x0104  */
        /* JADX WARN: Code duplicated, block: B:280:0x0508  */
        /* JADX WARN: Code duplicated, block: B:282:0x050c  */
        /* JADX WARN: Code duplicated, block: B:284:0x0514  */
        /* JADX WARN: Code duplicated, block: B:286:0x051e  */
        /* JADX WARN: Code duplicated, block: B:288:0x0522  */
        /* JADX WARN: Code duplicated, block: B:291:0x0527  */
        /* JADX WARN: Code duplicated, block: B:293:0x052b  */
        /* JADX WARN: Code duplicated, block: B:294:0x0531  */
        /* JADX WARN: Code duplicated, block: B:296:0x053b  */
        /* JADX WARN: Code duplicated, block: B:298:0x053f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0108  */
        /* JADX WARN: Code duplicated, block: B:301:0x0544  */
        /* JADX WARN: Code duplicated, block: B:303:0x0548  */
        /* JADX WARN: Code duplicated, block: B:304:0x054e  */
        /* JADX WARN: Code duplicated, block: B:306:0x0558  */
        /* JADX WARN: Code duplicated, block: B:308:0x055c  */
        /* JADX WARN: Code duplicated, block: B:311:0x0561  */
        /* JADX WARN: Code duplicated, block: B:313:0x0565  */
        /* JADX WARN: Code duplicated, block: B:314:0x056b  */
        /* JADX WARN: Code duplicated, block: B:316:0x0575  */
        /* JADX WARN: Code duplicated, block: B:318:0x0579  */
        /* JADX WARN: Code duplicated, block: B:31:0x010d  */
        /* JADX WARN: Code duplicated, block: B:321:0x057e  */
        /* JADX WARN: Code duplicated, block: B:323:0x0582  */
        /* JADX WARN: Code duplicated, block: B:324:0x0588  */
        /* JADX WARN: Code duplicated, block: B:326:0x0592 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:327:0x0594  */
        /* JADX WARN: Code duplicated, block: B:328:0x059a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:329:0x059c  */
        /* JADX WARN: Code duplicated, block: B:334:0x05a5  */
        /* JADX WARN: Code duplicated, block: B:33:0x0111  */
        /* JADX WARN: Code duplicated, block: B:341:0x0301 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:343:0x02ee A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:347:0x038c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:348:0x0385 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:349:0x0379 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:351:0x0380 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0119  */
        /* JADX WARN: Code duplicated, block: B:37:0x0123  */
        /* JADX WARN: Code duplicated, block: B:39:0x0127  */
        /* JADX WARN: Code duplicated, block: B:42:0x012c  */
        /* JADX WARN: Code duplicated, block: B:44:0x0130  */
        /* JADX WARN: Code duplicated, block: B:45:0x0136  */
        /* JADX WARN: Code duplicated, block: B:47:0x0140  */
        /* JADX WARN: Code duplicated, block: B:49:0x0144  */
        /* JADX WARN: Code duplicated, block: B:52:0x0149  */
        /* JADX WARN: Code duplicated, block: B:54:0x014d  */
        /* JADX WARN: Code duplicated, block: B:55:0x0153  */
        /* JADX WARN: Code duplicated, block: B:57:0x015d  */
        /* JADX WARN: Code duplicated, block: B:59:0x0161  */
        /* JADX WARN: Code duplicated, block: B:62:0x0166  */
        /* JADX WARN: Code duplicated, block: B:64:0x016a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0170  */
        /* JADX WARN: Code duplicated, block: B:67:0x017a  */
        /* JADX WARN: Code duplicated, block: B:69:0x017e  */
        /* JADX WARN: Code duplicated, block: B:70:0x0181  */
        /* JADX WARN: Code duplicated, block: B:75:0x018e  */
        /* JADX WARN: Code duplicated, block: B:77:0x0198 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x019a  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:89:0x01cd A[PHI: r5 r6 r7 r14
          0x01cd: PHI (r5v7 ssw<com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters>) = 
          (r5v4 ssw<com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters>)
          (r5v10 ssw<com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters>)
         binds: [B:87:0x01c9, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x01cd: PHI (r6v10 com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters) = 
          (r6v6 com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters)
          (r6v16 com.sporty.android.core.model.betbuilder.BetBuilderExclusionFilters)
         binds: [B:87:0x01c9, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x01cd: PHI (r7v22 com.sporty.android.core.model.config.bo.enums.BOConfigParam) = 
          (r7v3 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
          (r7v41 com.sporty.android.core.model.config.bo.enums.BOConfigParam)
         binds: [B:87:0x01c9, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x01cd: PHI (r14v28 java.lang.Object) = (r14v6 java.lang.Object), (r14v52 java.lang.Object) binds: [B:87:0x01c9, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:94:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
        /* JADX WARN: Code restructure failed: missing block: B:336:0x05c4, code lost:
        
            if (r0 == r4) goto L337;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 1508
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.event.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public static final a a = new a();
        }

        /* JADX INFO: renamed from: com.sportybet.plugin.event.e$b$b, reason: collision with other inner class name */
        public static final class C0418b extends b {
            public static final C0418b a = new C0418b();
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchEventMetaData$1", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<lk50<? extends aqg>, Map<String, ? extends Pair<? extends Outcome, ? extends String>>, v1b<? super Pair<? extends lk50<? extends aqg>, ? extends Map<String, ? extends Pair<? extends Outcome, ? extends String>>>>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ Map b;

        @Override // defpackage.gaj
        public final Object invoke(lk50<? extends aqg> lk50Var, Map<String, ? extends Pair<? extends Outcome, ? extends String>> map, v1b<? super Pair<? extends lk50<? extends aqg>, ? extends Map<String, ? extends Pair<? extends Outcome, ? extends String>>>> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.a = lk50Var;
            cVar.b = map;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = this.a;
            Map map = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(lk50Var, map);
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchEventMetaData$2", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Pair<? extends lk50<? extends aqg>, ? extends Map<String, ? extends Pair<? extends Outcome, ? extends String>>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, boolean z2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = e.this.new d(this.c, this.d, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends lk50<? extends aqg>, ? extends Map<String, ? extends Pair<? extends Outcome, ? extends String>>> pair, v1b<? super Unit> v1bVar) {
            return ((d) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.plugin.event.c cVarA;
            aqg aqgVar;
            Object value;
            l1g0 l1g0Var;
            epa0 epa0Var;
            String str;
            String str2;
            String str3;
            String str4;
            Category category;
            Tournament tournament;
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50 lk50Var = (lk50) pair.a;
            Map<String, Pair<Outcome, String>> map = (Map) pair.b;
            e eVar = e.this;
            ssw<com.sportybet.plugin.event.c> sswVar = eVar.J;
            com.sportybet.plugin.event.c cVarD = sswVar.d();
            if (cVarD == null) {
                return Unit.a;
            }
            if (lk50Var instanceof lk50.c) {
                aqg aqgVar2 = (aqg) ((lk50.c) lk50Var).a;
                Event event = aqgVar2.a;
                if (event != null) {
                    if (event.markets == null) {
                        event.markets = new ArrayList();
                    }
                    if (event.status > 2) {
                        event.setNoLiveStream();
                    }
                    if (this.d) {
                        event.forceUpdateTime = true;
                        event.elapsedStartTimeBeforeBind = SystemClock.elapsedRealtime();
                    }
                    if (map.isEmpty()) {
                        map = null;
                    }
                    if (map != null) {
                        event.addJokerOutcomes(map);
                    }
                    if (!eVar.J1() && eVar.P == 3) {
                        Sport sport = event.sport;
                        if (Intrinsics.g(sport != null ? sport.id : null, "sr:sport:1")) {
                            String str5 = event.sport.id;
                            str5.getClass();
                            ej5.c(o8i0.d(eVar), null, null, new isg(eVar, str5, null), 3);
                        }
                    }
                    eVar.R = event;
                    ssw<Boolean> sswVar2 = eVar.N;
                    List<String> listA = eVar.G.a();
                    Sport sport2 = event.sport;
                    sswVar2.m(Boolean.valueOf(CollectionsKt.M(listA, (sport2 == null || (category = sport2.category) == null || (tournament = category.tournament) == null) ? null : tournament.id)));
                    if (event.status == 1 && eVar.U) {
                        eVar.d0.a(com.sportybet.plugin.event.d.b.a);
                    }
                    List list = event.markets;
                    if (list == null) {
                        list = m2g.a;
                    }
                    list.getClass();
                    ArrayList arrayListB = u5y.b(list);
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListB.size();
                    int i = 0;
                    while (true) {
                        double d = 0.0d;
                        if (i >= size) {
                            break;
                        }
                        Object obj2 = arrayListB.get(i);
                        i++;
                        List<Outcome> list2 = ((Market) obj2).outcomes;
                        list2.getClass();
                        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list2);
                        if (outcome != null && (str4 = outcome.odds) != null) {
                            d = Double.parseDouble(str4);
                        }
                        if (d < 2.5d) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayListB.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayListB.get(i2);
                        i2++;
                        List<Outcome> list3 = ((Market) obj3).outcomes;
                        list3.getClass();
                        Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list3);
                        double d2 = (outcome2 == null || (str3 = outcome2.odds) == null) ? 0.0d : Double.parseDouble(str3);
                        if (2.5d <= d2 && d2 <= 5.0d) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayListB.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj4 = arrayListB.get(i3);
                        i3++;
                        List<Outcome> list4 = ((Market) obj4).outcomes;
                        list4.getClass();
                        Outcome outcome3 = (Outcome) CollectionsKt.firstOrNull(list4);
                        double d3 = (outcome3 == null || (str2 = outcome3.odds) == null) ? 0.0d : Double.parseDouble(str2);
                        if (5.0d <= d3 && d3 <= 10.0d) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size4 = arrayListB.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj5 = arrayListB.get(i4);
                        i4++;
                        List<Outcome> list5 = ((Market) obj5).outcomes;
                        list5.getClass();
                        Outcome outcome4 = (Outcome) CollectionsKt.firstOrNull(list5);
                        if (((outcome4 == null || (str = outcome4.odds) == null) ? 0.0d : Double.parseDouble(str)) > 10.0d) {
                            arrayList4.add(obj5);
                        }
                    }
                    l1g0 l1g0Var2 = new l1g0(null, null, arrayListB.size(), arrayListB);
                    l1g0 l1g0Var3 = new l1g0(null, gky.a.b(2.5d, true), arrayList.size(), arrayList);
                    List list6 = list;
                    aqgVar = aqgVar2;
                    eVar = eVar;
                    List listK = kotlin.collections.b.k(l1g0Var2, l1g0Var3, new l1g0(gky.a.b(2.5d, true), gky.a.b(5.0d, true), arrayList2.size(), arrayList2), new l1g0(gky.a.b(5.0d, true), gky.a.b(10.0d, true), arrayList3.size(), arrayList3), new l1g0(gky.a.b(10.0d, true), null, arrayList4.size(), arrayList4));
                    wwd0 wwd0Var = eVar.n0;
                    do {
                        value = wwd0Var.getValue();
                        l1g0Var = (l1g0) CollectionsKt.T(listK);
                        epa0Var = epa0.a;
                        ((m1g0) value).getClass();
                    } while (!wwd0Var.g(value, new m1g0(l1g0Var, listK, epa0Var)));
                    if (eVar.P == 3) {
                        wwd0 wwd0Var2 = eVar.E0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : list6) {
                            Market market = (Market) obj6;
                            if (u5y.c(market) && u5y.d(market)) {
                                arrayList5.add(obj6);
                            }
                        }
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, arrayList5);
                    }
                } else {
                    aqgVar = aqgVar2;
                }
                cVarA = com.sportybet.plugin.event.c.a(cVarD, false, false, null, null, aqg.a(aqgVar, null, null, Intrinsics.g(eVar.a0.d(), Boolean.TRUE) ? aqgVar.d : null, 7), this.c, this.d, 12);
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                cVarA = th instanceof SprThrowable ? com.sportybet.plugin.event.c.a(cVarD, false, true, com.sportybet.plugin.event.c.a.a, ((SprThrowable) th).getE(), null, false, false, 112) : th instanceof drg ? com.sportybet.plugin.event.c.a(cVarD, false, true, com.sportybet.plugin.event.c.a.b, ((drg) th).a, null, false, false, 112) : com.sportybet.plugin.event.c.a(cVarD, false, true, com.sportybet.plugin.event.c.a.c, "", null, false, false, 112);
            } else {
                if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                    uhc.a();
                    return null;
                }
                cVarA = com.sportybet.plugin.event.c.a(cVarD, true, false, null, null, null, false, false, 124);
            }
            sswVar.m(cVarA);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.event.e$e, reason: collision with other inner class name */
    @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchFavoriteMarketIds$2", f = "EventViewModel.kt", l = {504, 512}, m = "invokeSuspend", v = 2)
    public static final class C0419e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Function0<Unit> d;

        /* JADX INFO: renamed from: com.sportybet.plugin.event.e$e$a */
        @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchFavoriteMarketIds$2$1", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements gaj<myh<? super List<? extends Integer>>, Throwable, v1b<? super Unit>, Object> {
            public final /* synthetic */ Function0<Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0<Unit> function0, v1b<? super a> v1bVar) {
                super(3, v1bVar);
                this.a = function0;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super List<? extends Integer>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                return new a(this.a, v1bVar).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.invoke();
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: com.sportybet.plugin.event.e$e$b */
        public static final class b<T> implements myh {
            public final /* synthetic */ e a;

            public b(e eVar) {
                this.a = eVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                List list = (List) obj;
                ssw<com.sportybet.plugin.event.c> sswVar = this.a.J;
                com.sportybet.plugin.event.c cVarD = sswVar.d();
                if (cVarD == null) {
                    return Unit.a;
                }
                sswVar.m(com.sportybet.plugin.event.c.a(cVarD, false, false, null, null, aqg.a(cVarD.e, null, list, null, 11), false, false, 79));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0419e(boolean z, Function0<Unit> function0, v1b<? super C0419e> v1bVar) {
            super(2, v1bVar);
            this.c = z;
            this.d = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return e.this.new C0419e(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C0419e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        
            if (r3.collect(r14, r13) == r0) goto L23;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r13.a
                r2 = 2
                r3 = 1
                r4 = 0
                com.sportybet.plugin.event.e r5 = com.sportybet.plugin.event.e.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L13
                defpackage.uj50.b(r14)
                goto L70
            L13:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r4
            L19:
                defpackage.uj50.b(r14)
                goto L2b
            L1d:
                defpackage.uj50.b(r14)
                mgb0 r14 = r5.w
                r13.a = r3
                java.lang.Object r14 = r14.getUserId(r13)
                if (r14 != r0) goto L2b
                goto L6f
            L2b:
                r1 = r14
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L35
                goto L36
            L35:
                r14 = r4
            L36:
                r11 = r14
                java.lang.String r11 = (java.lang.String) r11
                if (r11 != 0) goto L3e
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            L3e:
                gih r7 = r5.E
                java.lang.String r9 = r5.H1()
                int r10 = r5.P
                r7.getClass()
                fih r6 = new fih
                r12 = 0
                boolean r8 = r13.c
                r6.<init>(r7, r8, r9, r10, r11, r12)
                or60 r14 = new or60
                r14.<init>(r6)
                com.sportybet.plugin.event.e$e$a r1 = new com.sportybet.plugin.event.e$e$a
                kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r13.d
                r1.<init>(r3, r4)
                wzh r3 = new wzh
                r3.<init>(r14, r1)
                com.sportybet.plugin.event.e$e$b r14 = new com.sportybet.plugin.event.e$e$b
                r14.<init>(r5)
                r13.a = r2
                java.lang.Object r13 = r3.collect(r14, r13)
                if (r13 != r0) goto L70
            L6f:
                return r0
            L70:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.event.e.C0419e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchFeaturedBB$$inlined$flatMapLatest$1", f = "EventViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super List<? extends FeaturedBetBuilderMarket>>, Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, e eVar) {
            super(3, v1bVar);
            this.d = eVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super List<? extends FeaturedBetBuilderMarket>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
            f fVar = new f(v1bVar, this.d);
            fVar.b = myhVar;
            fVar.c = bool;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lyh yzhVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                if (((Boolean) this.c).booleanValue()) {
                    e eVar = this.d;
                    yzhVar = new yzh(eVar.z.b(eVar.Q), new hsg(3, null));
                } else {
                    yzhVar = i2g.a;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, yzhVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchFeaturedBB$2", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<List<? extends FeaturedBetBuilderMarket>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v1b v1bVar, e eVar) {
            super(2, v1bVar);
            this.b = eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = new g(v1bVar, this.b);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends FeaturedBetBuilderMarket> list, v1b<? super Unit> v1bVar) {
            return ((g) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.A0.setValue(list);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$onToggleFavoriteMarket$1", f = "EventViewModel.kt", l = {527, 535}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Market d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Market market, boolean z, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.d = market;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = e.this.new h(this.d, this.e, v1bVar);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r0.a(r1, r12, r13, r4, r14) == r8) goto L23;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                com.sportybet.plugin.event.e r6 = com.sportybet.plugin.event.e.this
                ku90<com.sportybet.plugin.event.d> r7 = r6.d0
                java.lang.Object r0 = r14.b
                v5b r0 = (defpackage.v5b) r0
                y5b r8 = defpackage.y5b.a
                int r1 = r14.a
                boolean r9 = r14.e
                r2 = 2
                r3 = 0
                com.sportybet.plugin.realsports.data.Market r10 = r14.d
                r11 = 1
                if (r1 == 0) goto L2a
                if (r1 == r11) goto L25
                if (r1 != r2) goto L1f
                defpackage.uj50.b(r15)     // Catch: java.lang.Throwable -> L1d
                goto L74
            L1d:
                r0 = move-exception
                goto L79
            L1f:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r3
            L25:
                defpackage.uj50.b(r15)
                r0 = r15
                goto L3a
            L2a:
                defpackage.uj50.b(r15)
                mgb0 r1 = r6.w
                r14.b = r0
                r14.a = r11
                java.lang.Object r0 = r1.getUserId(r14)
                if (r0 != r8) goto L3a
                goto L73
            L3a:
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = kotlin.text.StringsKt.U(r0)
                if (r0 == 0) goto L55
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r10, r0)
                r6.f0 = r1
                com.sportybet.plugin.event.d$c r0 = com.sportybet.plugin.event.d.c.a
                r7.a(r0)
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            L55:
                boolean r4 = r14.e
                zi50$a r0 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L1d
                fzf0 r0 = r6.D     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = r6.H1()     // Catch: java.lang.Throwable -> L1d
                int r12 = r6.P     // Catch: java.lang.Throwable -> L1d
                java.lang.String r13 = r10.id     // Catch: java.lang.Throwable -> L1d
                r13.getClass()     // Catch: java.lang.Throwable -> L1d
                r14.b = r3     // Catch: java.lang.Throwable -> L1d
                r14.a = r2     // Catch: java.lang.Throwable -> L1d
                r5 = r14
                r2 = r12
                r3 = r13
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
                if (r0 != r8) goto L74
            L73:
                return r8
            L74:
                kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1d
                zi50$a r1 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L1d
                goto L81
            L79:
                zi50$a r1 = defpackage.zi50.b
                zi50$b r1 = new zi50$b
                r1.<init>(r0)
                r0 = r1
            L81:
                boolean r1 = r0 instanceof zi50.b
                if (r1 != 0) goto La2
                kotlin.Unit r0 = (kotlin.Unit) r0
                com.sportybet.plugin.event.d$a r0 = new com.sportybet.plugin.event.d$a
                if (r9 == 0) goto L90
                r1 = 2132018106(0x7f1403ba, float:1.967451E38)
                goto L93
            L90:
                r1 = 2132023573(0x7f141915, float:1.9685598E38)
            L93:
                r0.<init>(r10, r1)
                r7.a(r0)
                dsg r0 = new dsg
                r1 = 0
                r0.<init>(r1)
                r6.B1(r11, r0)
            La2:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.event.e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$resolveLiveStreamPlaybackState$1", f = "EventViewModel.kt", l = {597}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public vu90 a;
        public int b;
        public final /* synthetic */ e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(v1b v1bVar, e eVar) {
            super(2, v1bVar);
            this.c = eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new i(v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vu90 vu90Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                e eVar = this.c;
                vu90<com.sportybet.plugin.event.g> vu90Var2 = eVar.j0;
                gg50 gg50Var = eVar.I;
                this.a = vu90Var2;
                this.b = 1;
                obj = gg50Var.a(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                vu90Var = vu90Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vu90Var = this.a;
                uj50.b(obj);
            }
            vu90Var.m(obj);
            return Unit.a;
        }
    }

    public static final class j implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.plugin.event.EventViewModel$special$$inlined$map$1", f = "EventViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.plugin.event.EventViewModel$special$$inlined$map$1$2", f = "EventViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Map map = (Map) obj;
                    Boolean boolValueOf = Boolean.valueOf(map != null ? !map.isEmpty() : false);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public j(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.plugin.event.EventViewModel$toggleScoreLayoutMode$1", f = "EventViewModel.kt", l = {578}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(v1b v1bVar, e eVar) {
            super(2, v1bVar);
            this.b = eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new k(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                e eVar = this.b;
                String strA0 = CollectionsKt.a0(((Map) eVar.V.getValue()).entrySet(), iKBWavCysVP.ppBdaZvemSCHe, null, null, new ssg(0), 30);
                m2l m2lVar = eVar.i;
                eo20[] eo20VarArr = eo20.a;
                this.a = 1;
                if (m2lVar.a.putString("correct_score_layout_mode", strA0, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(csg csgVar, e8h e8hVar, m2l m2lVar, n35 n35Var, lq1 lq1Var, mgb0 mgb0Var, ysm ysmVar, nkb0 nkb0Var, jrm jrmVar, k650 k650Var, kbp kbpVar, fzf0 fzf0Var, gih gihVar, rdd0 rdd0Var, azy azyVar, yi5 yi5Var, gg50 gg50Var) {
        super(0);
        e8hVar.getClass();
        m2lVar.getClass();
        n35Var.getClass();
        lq1Var.getClass();
        mgb0Var.getClass();
        ysmVar.getClass();
        nkb0Var.getClass();
        jrmVar.getClass();
        k650Var.getClass();
        rdd0Var.getClass();
        yi5Var.getClass();
        int i2 = 0;
        this.d = n35Var;
        this.e = csgVar;
        this.f = e8hVar;
        this.i = m2lVar;
        this.v = lq1Var;
        this.w = mgb0Var;
        this.y = ysmVar;
        this.z = nkb0Var;
        this.A = jrmVar;
        this.B = k650Var;
        this.C = kbpVar;
        this.D = fzf0Var;
        this.E = gihVar;
        this.F = rdd0Var;
        this.G = azyVar;
        this.H = yi5Var;
        this.I = gg50Var;
        ssw<com.sportybet.plugin.event.c> sswVar = new ssw<>(new com.sportybet.plugin.event.c(i2));
        this.J = sswVar;
        this.K = sswVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.L = ku90Var;
        this.M = i2i.c(ku90Var, null, 3);
        Boolean bool = Boolean.FALSE;
        ssw<Boolean> sswVar2 = new ssw<>(bool);
        this.N = sswVar2;
        this.O = sswVar2;
        this.P = 1;
        this.Q = "";
        lgb0[] lgb0VarArr = lgb0.a;
        this.S = 0;
        this.T = ServerProductStatus.Product.LIVE_EVENTS;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.V = xwd0.a(o2gVar);
        m2g m2gVar = m2g.a;
        ssw<List<Selection>> sswVar3 = new ssw<>(m2gVar);
        this.W = sswVar3;
        this.X = sswVar3;
        this.Y = xwd0.a(Integer.valueOf(Reader.READ_DONE));
        this.Z = xwd0.a(bool);
        ssw<Boolean> sswVar4 = new ssw<>(bool);
        this.a0 = sswVar4;
        this.b0 = sswVar4;
        this.c0 = new ssw<>(new BetBuilderExclusionFilters(null, 1, null));
        ku90<com.sportybet.plugin.event.d> ku90Var2 = new ku90<>();
        this.d0 = ku90Var2;
        this.e0 = i2i.c(ku90Var2, null, 3);
        vu90<qus> vu90Var = new vu90<>();
        this.g0 = vu90Var;
        this.h0 = vu90Var;
        vu90<com.sportybet.plugin.event.g> vu90Var2 = new vu90<>();
        this.j0 = vu90Var2;
        this.k0 = vu90Var2;
        vu90<UIState<String>> vu90Var3 = new vu90<>();
        this.l0 = vu90Var3;
        this.m0 = vu90Var3;
        wwd0 wwd0VarA = xwd0.a(new m1g0(0));
        this.n0 = wwd0VarA;
        r5b r5bVarC = i2i.c(wwd0VarA, null, 3);
        this.o0 = r5bVarC;
        this.p0 = fks.b(sswVar, r5bVarC, new wsg());
        ssw<Integer> sswVar5 = new ssw<>(0);
        this.q0 = sswVar5;
        this.r0 = sswVar5;
        ssw<Boolean> sswVar6 = new ssw<>(bool);
        this.s0 = sswVar6;
        this.t0 = sswVar6;
        ssw<Boolean> sswVar7 = new ssw<>(bool);
        this.u0 = sswVar7;
        this.v0 = sswVar7;
        wwd0 wwd0VarA2 = xwd0.a(com.sportybet.plugin.event.h.b.a);
        this.w0 = wwd0VarA2;
        this.x0 = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.y0 = wwd0VarA3;
        this.z0 = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(m2gVar);
        this.A0 = wwd0VarA4;
        this.B0 = fks.b(sswVar, i2i.c(wwd0VarA4, null, 3), new esg());
        ssw<Boolean> sswVar8 = new ssw<>(bool);
        this.C0 = sswVar8;
        this.D0 = sswVar8;
        wwd0 wwd0VarA5 = xwd0.a(m2gVar);
        this.E0 = wwd0VarA5;
        r5b r5bVarC2 = i2i.c(wwd0VarA5, null, 3);
        fsg fsgVar = new fsg(this, i2);
        jlv jlvVar = new jlv();
        jlvVar.n(fks.b(sswVar, r5bVarC2, new usg()), new zsg(new vsg(jlvVar, fsgVar)));
        this.F0 = jlvVar;
        ssw<x920.a> sswVar9 = new ssw<>(x920.a.a);
        this.G0 = sswVar9;
        this.H0 = tsg0.c(sswVar9, new de8(this, 2));
        wwd0 wwd0VarA6 = xwd0.a(null);
        this.I0 = wwd0VarA6;
        this.J0 = uzh.b(new j(wwd0VarA6));
        ej5.c(o8i0.d(this), null, null, new a(null, this), 3);
    }

    public final void A1(boolean z, boolean z2) {
        String strH1 = H1();
        String str = this.Q;
        int i2 = this.P;
        int i3 = this.S;
        ServerProductStatus.Product product = this.T;
        csg csgVar = this.e;
        csgVar.getClass();
        str.getClass();
        product.getClass();
        kzh.d(new g1i(new n1i(ozh.c(bm50.a(new g1i(r0i.e(new or60(new srg(csgVar, strH1, str, i2, null)), r0i.b(new g1i(new urg(new n1i(csgVar.a.f(i2, i3, str), i2 == 3 ? new or60(new vrg(csgVar, null)) : new gzh(Boolean.FALSE), new wrg(3, null)), product), new xrg(csgVar, i2, null)), new yrg(csgVar, z, str, i2, null))), new trg(csgVar, null))), csgVar.h), new f1i(this.I0), new c(3, null)), new d(z, z2, null)), o8i0.d(this));
    }

    public final void B1(boolean z, Function0<Unit> function0) {
        ej5.c(o8i0.d(this), null, null, new C0419e(z, function0, null), 3);
    }

    public final void C1() {
        kzh.d(new g1i(r0i.f(new or60(new gsg(null, this)), new f(null, this)), new g(null, this)), o8i0.d(this));
    }

    public final String D1() {
        return J1() ? apg.c(F1()) : "";
    }

    public final String E1() {
        return J1() ? apg.d(F1()) : "";
    }

    public final Event F1() {
        Event event = this.R;
        if (event != null) {
            return event;
        }
        Intrinsics.n(AnalyticsEvent.BI_TRACKING_KIND_EVENT);
        throw null;
    }

    public final boolean G1() {
        return J1() && F1().hasGift();
    }

    public final String H1() {
        Sport sport;
        String str;
        return (!J1() || (sport = F1().sport) == null || (str = sport.id) == null) ? "unknown" : str;
    }

    public final boolean I1() {
        List<Filter> filters;
        Sport sport;
        Category category;
        Tournament tournament;
        String str;
        BetBuilderExclusionFilters betBuilderExclusionFiltersD = this.c0.d();
        Object obj = null;
        if (betBuilderExclusionFiltersD != null && (filters = betBuilderExclusionFiltersD.getFilters()) != null) {
            for (Object obj2 : filters) {
                Filter filter = (Filter) obj2;
                if (Intrinsics.g(filter.getSportId(), H1()) && filter.getType() == FilterType.TOURNAMENT) {
                    List<String> ids = filter.getIds();
                    String str2 = "unknown";
                    if (J1() && (sport = F1().sport) != null && (category = sport.category) != null && (tournament = category.tournament) != null && (str = tournament.id) != null) {
                        str2 = str;
                    }
                    if (ids.contains(str2)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (Filter) obj;
        }
        return obj != null;
    }

    public final boolean J1() {
        return this.R != null;
    }

    public final void K1(Market market, boolean z) {
        market.getClass();
        f00 f00Var = vgb0.a;
        vgb0.a(market.isLive() ? "LiveMarket_FavoriteClick" : "PreMarket_FavoriteClick");
        ej5.c(o8i0.d(this), null, null, new h(market, z, null), 3);
    }

    public final void L1(Event event, Market market, Outcome outcome, boolean z, boolean z2, sg2 sg2Var, sg2 sg2Var2, sg2 sg2Var3, Function0 function0) {
        e eVar;
        Selection selection = new Selection(event, market, outcome, null);
        jrm jrmVar = this.A;
        Selection selectionP = g880.p(selection, jrmVar.U());
        if (selectionP == null) {
            if (jrmVar.e0(selection) || jrmVar.y1(event)) {
                function0.invoke();
                if (sg2Var3 != null) {
                    O1(sg2Var3);
                    return;
                }
                return;
            }
            if (this.A.N0(event, market, outcome, true, (14336 & 16) != 0 ? false : true, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : z2, (14336 & 4096) != 0 ? false : z, false)) {
                O1(sg2Var);
                return;
            } else {
                if (sg2Var3 != null) {
                    O1(sg2Var3);
                    return;
                }
                return;
            }
        }
        if (!selectionP.z && !selectionP.y && !selectionP.A) {
            StringUiText stringUiText = vch0.a;
            com.sporty.android.common.uievent.b.i(this.L, new ResourceUiText(R.string.component_betslip__selection_already_in_betslip), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (sg2Var3 != null) {
                O1(sg2Var3);
                return;
            }
            return;
        }
        this.A.N0(event, market, outcome, false, (14336 & 16) != 0 ? false : true, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
        if (selectionP.z) {
            StringUiText stringUiText2 = vch0.a;
            eVar = this;
            com.sporty.android.common.uievent.b.i(eVar.L, new ResourceUiText(R.string.common_functions__removed_from_betslip), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            eVar = this;
        }
        eVar.O1(sg2Var2);
    }

    public final boolean M1(Selection selection) {
        Selection selectionP = g880.p(selection, this.A.U());
        if (selectionP != null) {
            return selectionP.z || selectionP.y || selectionP.A;
        }
        return false;
    }

    public final void N1() {
        this.j0.m(com.sportybet.plugin.event.g.c.a);
        ej5.c(o8i0.d(this), null, null, new i(null, this), 3);
    }

    public final void O1(pdd0 pdd0Var) {
        this.F.a(pdd0Var, k00.d, k00.c);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final void P1(int i2, String str, Event event, int i3, ServerProductStatus.Product product, boolean z) {
        Category category;
        Tournament tournament;
        Sport sport;
        product.getClass();
        this.P = i2;
        String str2 = null;
        if (i2 != 3) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            wwd0 wwd0Var = this.I0;
            wwd0Var.getClass();
            wwd0Var.k(null, o2gVar);
        } else {
            if (Intrinsics.g((event == null || (sport = event.sport) == null) ? null : sport.id, "sr:sport:1")) {
                String str3 = event.sport.id;
                str3.getClass();
                ej5.c(o8i0.d(this), null, null, new isg(this, str3, null), 3);
            } else {
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                wwd0 wwd0Var2 = this.I0;
                wwd0Var2.getClass();
                wwd0Var2.k(null, o2gVar2);
            }
        }
        this.Q = str;
        if (event != null) {
            this.R = event;
            List<String> listA = this.G.a();
            Sport sport2 = event.sport;
            if (sport2 != null && (category = sport2.category) != null && (tournament = category.tournament) != null) {
                str2 = tournament.id;
            }
            this.N.m(Boolean.valueOf(CollectionsKt.M(listA, str2)));
        }
        this.S = i3;
        this.T = product;
        this.U = z;
        A1(true, false);
        if (i2 == 3) {
            C1();
        }
    }

    @Override // defpackage.n35
    public final void Q0() {
        this.d.Q0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0154, code lost:
    
        if (r1 == r3) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q1(defpackage.x1b r19) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.event.e.Q1(x1b):java.lang.Object");
    }

    public final void R1(Market market) {
        market.getClass();
        wwd0 wwd0Var = this.V;
        Object obj = ((Map) wwd0Var.getValue()).get(market.id);
        ko70 ko70Var = ko70.MODE_COUNTERS;
        if (obj == ko70Var) {
            ko70Var = ko70.MODE_BUTTONS;
        }
        wwd0Var.setValue(kpu.i((Map) wwd0Var.getValue(), new Pair(market.id, ko70Var)));
        ej5.c(o8i0.d(this), null, null, new k(null, this), 3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void S1(Selection selection, boolean z) {
        selection.getClass();
        ssw<List<Selection>> sswVar = this.W;
        List<Selection> listD = sswVar.d();
        List<Selection> list = null;
        if (listD != null) {
            if (z && !z1(selection)) {
                int size = listD.size() + 1;
                wwd0 wwd0Var = this.Y;
                if (size > ((Number) wwd0Var.getValue()).intValue()) {
                    wwd0 wwd0Var2 = this.Z;
                    boolean zBooleanValue = ((Boolean) wwd0Var2.getValue()).booleanValue();
                    ku90<com.sporty.android.common.uievent.a> ku90Var = this.L;
                    if (zBooleanValue) {
                        StringUiText stringUiText = vch0.a;
                        com.sporty.android.common.uievent.b.i(ku90Var, new ResourceUiText(R.string.bet_builder__you_reached_selections_limit), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        StringUiText stringUiText2 = vch0.a;
                        com.sporty.android.common.uievent.b.e(ku90Var, new ResourceUiText(R.string.page_instant_virtual__warning), null, new ResourceUiText(R.string.bet_builder__selections_limit_exceeded_error, ay0.S(new Object[]{wwd0Var.getValue()})), new ResourceUiText(R.string.common_functions__ok), null, null, null, 498);
                        Boolean bool = Boolean.TRUE;
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, bool);
                    }
                } else {
                    listD = CollectionsKt.j0(listD, selection);
                }
            } else if (!z && z1(selection)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (!((Selection) obj).j().equals(selection.j())) {
                        arrayList.add(obj);
                    }
                }
                listD = arrayList;
            }
            list = listD;
        }
        sswVar.m(list);
    }

    @Override // defpackage.n35
    public final njs<BoreDrawConfig> X0() {
        return this.d.X0();
    }

    public final boolean z1(Selection selection) {
        selection.getClass();
        List<Selection> listD = this.W.d();
        if (listD == null || listD.isEmpty()) {
            return false;
        }
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            if (((Selection) it.next()).j().equals(selection.j())) {
                return true;
            }
        }
        return false;
    }
}
