package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.CustomCodes;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class rbc {

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeScreenKt$CustomCodeContent$1$1", f = "CustomCodeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ int a;
        public final /* synthetic */ mmd b;
        public final /* synthetic */ osw c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ osw e;
        public final /* synthetic */ ytw<g7f> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, mmd mmdVar, osw oswVar, osw oswVar2, osw oswVar3, ytw<g7f> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = i;
            this.b = mmdVar;
            this.c = oswVar;
            this.d = oswVar2;
            this.e = oswVar3;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.f.setValue(new g7f(this.b.u1(Math.max(((this.a - this.c.D()) - this.d.D()) - this.e.D(), 0) / 2) - 86.0f));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeScreenKt$CustomCodeScreen$1$1$1", f = "CustomCodeScreen.kt", l = {130, 139, 156}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<h8c, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ v3a0 c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ gaj<String, String, BookingData, Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v3a0 v3a0Var, Context context, gaj<? super String, ? super String, ? super BookingData, Unit> gajVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = v3a0Var;
            this.d = context;
            this.e = gajVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h8c h8cVar, v1b<? super Unit> v1bVar) {
            return ((b) create(h8cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (defpackage.v3a0.b(r10.c, r1, null, false, r0, r10, 6) == r7) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (defpackage.v3a0.b(r10.c, r1, null, false, r4, r10, 6) == r7) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        
            if (defpackage.v3a0.b(r10.c, r1, null, false, r4, r10, 6) == r7) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        
            return r7;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.b
                h8c r0 = (defpackage.h8c) r0
                y5b r7 = defpackage.y5b.a
                int r1 = r10.a
                r2 = 3
                r3 = 2
                r4 = 1
                r6 = 0
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L15
                goto L1b
            L15:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r6
            L1b:
                defpackage.uj50.b(r11)
                goto L9b
            L20:
                defpackage.uj50.b(r11)
                boolean r1 = r0 instanceof h8c.d
                r8 = 0
                android.content.Context r9 = r10.d
                if (r1 == 0) goto L47
                r0 = 2132021590(0x7f141156, float:1.9681576E38)
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r1 = defpackage.sn5.b(r9, r0, r1)
                k3a0 r0 = defpackage.k3a0.a
                r10.b = r6
                r10.a = r4
                r4 = r0
                v3a0 r0 = r10.c
                r2 = 0
                r3 = 0
                r6 = 6
                r5 = r10
                java.lang.Object r0 = defpackage.v3a0.b(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L9b
                goto L9a
            L47:
                boolean r1 = r0 instanceof h8c.b
                if (r1 == 0) goto L67
                r0 = 2132021603(0x7f141163, float:1.9681602E38)
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r1 = defpackage.sn5.b(r9, r0, r1)
                k3a0 r4 = defpackage.k3a0.a
                r10.b = r6
                r10.a = r3
                v3a0 r0 = r10.c
                r2 = 0
                r3 = 0
                r6 = 6
                r5 = r10
                java.lang.Object r0 = defpackage.v3a0.b(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L9b
                goto L9a
            L67:
                boolean r1 = r0 instanceof h8c.a
                if (r1 == 0) goto L7b
                h8c$a r0 = (h8c.a) r0
                java.lang.String r1 = r0.a
                java.lang.String r2 = r0.b
                com.sportybet.android.bookingcode.data.dto.BookingData r0 = r0.c
                gaj<java.lang.String, java.lang.String, com.sportybet.android.bookingcode.data.dto.BookingData, kotlin.Unit> r3 = r10.e
                r3.invoke(r1, r2, r0)
                kotlin.Unit r0 = kotlin.Unit.a
                goto L9b
            L7b:
                boolean r0 = r0 instanceof h8c.c
                if (r0 == 0) goto L9e
                r0 = 2132018154(0x7f1403ea, float:1.9674607E38)
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r1 = defpackage.sn5.b(r9, r0, r1)
                k3a0 r4 = defpackage.k3a0.a
                r10.b = r6
                r10.a = r2
                v3a0 r0 = r10.c
                r2 = 0
                r3 = 0
                r6 = 6
                r5 = r10
                java.lang.Object r0 = defpackage.v3a0.b(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L9b
            L9a:
                return r7
            L9b:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            L9e:
                defpackage.uhc.a()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rbc.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bdc bdcVar = (bdc) this.receiver;
            sbc sbcVar = bdcVar.i;
            sbcVar.getClass();
            kzh.d(new g1i(ozh.c(new or60(new acc(sbcVar, null)), sbcVar.h), new wcc(bdcVar, null)), o8i0.d(bdcVar));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bdc bdcVar = (bdc) this.receiver;
            kzh.d(new g1i(new qcc(r0i.a(r0i.a(new s78(bdcVar.i.b.e(), new gzh(((CustomCodes) bdcVar.w.a.getValue()).a), new rcc(3, null)), new scc(bdcVar, null)), new tcc(bdcVar, null)), bdcVar), new ucc(bdcVar, null)), o8i0.d(bdcVar));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class e extends saj implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            bdc bdcVar = (bdc) this.receiver;
            l7c l7cVar = (l7c) bdcVar.C.getValue();
            if (l7cVar instanceof l7c.b) {
                kzh.d(new g1i(new icc(r0i.a(bm50.a(new bcc(bdcVar.i.b.c(iIntValue))), new jcc(bdcVar, null)), bdcVar, (l7c.b) l7cVar), new kcc(bdcVar, null)), o8i0.d(bdcVar));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class f extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bdc bdcVar = (bdc) this.a;
            bdcVar.getClass();
            kzh.d(new g1i(new gzh(l7c.a.a), new fcc(bdcVar, null)), o8i0.d(bdcVar));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class g extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bdc bdcVar = (bdc) this.a;
            bdcVar.getClass();
            kzh.d(new g1i(new gzh(f8c.a.a), new gcc(bdcVar, null)), o8i0.d(bdcVar));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class h extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bdc bdcVar = (bdc) this.a;
            bdcVar.getClass();
            kzh.d(new g1i(new gzh(fac.a.a), new hcc(bdcVar, null)), o8i0.d(bdcVar));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class i {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void a(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(1098830005);
        int i3 = (bVarI.A(function0) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.layout.h.h(j.g(aVar2, 1.0f), 20.0f, 0.0f, 2), "creator_credits_tips_section");
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.ic_tip_outlined_black_20dp, 0, bVarI), "right", j.r(aVar2, 18.0f), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 432, 0);
            bVarI.N(837328642);
            nk0.b bVar = new nk0.b((Object) null);
            bVarI.N(837329200);
            long jA = c68.a(R.color.text_type1_secondary, bVarI);
            long jF = d2l.f(12);
            v1k v1kVar = f8i.b;
            t9i t9iVar = t9i.B;
            int iL = bVar.l(new ora0(jA, jF, t9iVar, (n9i) null, (o9i) null, v1kVar, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65496));
            try {
                bVar.g(cb40.a(R.string.page_creator_credits__page_about_title, new Object[0], bVarI));
                bVar.g(" ");
                Unit unit = Unit.a;
                bVar.i(iL);
                bVarI.X(false);
                bVar.k("ViewAbout", "AboutCreatorCredits");
                bVarI.N(837346687);
                int iL2 = bVar.l(new ora0(c68.a(R.color.brand_secondary, bVarI), d2l.f(12), t9iVar, (n9i) null, (o9i) null, v1kVar, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65496));
                try {
                    bVar.g(cb40.a(R.string.common_functions__view, new Object[0], bVarI));
                    bVar.i(iL2);
                    bVarI.X(false);
                    bVar.h();
                    final nk0 nk0VarM = bVar.m();
                    bVarI.X(false);
                    boolean zM = bVarI.M(nk0VarM) | ((i3 & 14) == 4);
                    Object objY = bVarI.y();
                    if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new Function1() { // from class: lbc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int iIntValue = ((Integer) obj).intValue();
                                if (((nk0.d) CollectionsKt.firstOrNull(nk0VarM.b(iIntValue, iIntValue, "ViewAbout"))) != null) {
                                    function0.invoke();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    vr7.a(nk0VarM, null, null, false, 0, 0, null, (Function1) objY, bVarI, 0, WebSocketProtocol.PAYLOAD_SHORT);
                    bVarI = bVarI;
                    bVarI.X(true);
                } catch (Throwable th) {
                    bVar.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar.i(iL);
                throw th2;
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function0) { // from class: mbc
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rbc.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(771965213);
        int i4 = i2 | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i4 & 1, (i4 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = g3w.h(j.g(aVar2, 1.0f), "creator_credits_title_section");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.personal_page__branded_booking_codes_title, new Object[0], bVarI), androidx.compose.foundation.layout.h.h(aVar2, 20.0f, 0.0f, 2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            bVarI.N(-1372573665);
            nk0.b bVar = new nk0.b((Object) null);
            bVarI.N(-1372573030);
            int iL = bVar.l(imf0.b(mla.l(R.style.B1_R_21, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
            i3 = 0;
            try {
                bVar.g(cb40.a(R.string.personal_page__custom_codes_description, new Object[0], bVarI));
                bVar.g(" ");
                Unit unit = Unit.a;
                bVar.i(iL);
                bVarI.X(false);
                bVar.k("ViewAbout", "AboutCreatorCredits");
                bVarI.N(-1372558348);
                int iL2 = bVar.l(imf0.b(mla.l(R.style.B1_R_21, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
                try {
                    bVar.g(cb40.a(R.string.page_creator_credits__learn_more, new Object[0], bVarI));
                    bVar.i(iL2);
                    bVarI.X(false);
                    bVar.h();
                    final nk0 nk0VarM = bVar.m();
                    bVarI.X(false);
                    androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.h.h(aVar2, 20.0f, 0.0f, 2);
                    boolean zM = bVarI.M(nk0VarM) | ((i4 & 14) == 4);
                    Object objY = bVarI.y();
                    if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new Function1() { // from class: hac
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int iIntValue = ((Integer) obj).intValue();
                                if (((nk0.d) CollectionsKt.firstOrNull(nk0VarM.b(iIntValue, iIntValue, "ViewAbout"))) != null) {
                                    function0.invoke();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    vr7.a(nk0VarM, dVarH2, null, false, 0, 0, null, (Function1) objY, bVarI, 48, 124);
                    bVarI.X(true);
                } catch (Throwable th) {
                    bVar.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar.i(iL);
                throw th2;
            }
        } else {
            i3 = 0;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rac(i2, i3, function0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0340  */
    /* JADX WARN: Code duplicated, block: B:193:0x0342  */
    /* JADX WARN: Code duplicated, block: B:196:0x034b  */
    /* JADX WARN: Code duplicated, block: B:197:0x034d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0362  */
    /* JADX WARN: Code duplicated, block: B:209:0x036b  */
    /* JADX WARN: Code duplicated, block: B:210:0x036d  */
    /* JADX WARN: Code duplicated, block: B:213:0x037f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0381  */
    /* JADX WARN: Code duplicated, block: B:217:0x0389  */
    /* JADX WARN: Code duplicated, block: B:218:0x038b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0393  */
    /* JADX WARN: Code duplicated, block: B:222:0x0395  */
    /* JADX WARN: Code duplicated, block: B:225:0x039e  */
    /* JADX WARN: Code duplicated, block: B:226:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:233:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:237:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:242:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:246:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x0448  */
    /* JADX WARN: Code duplicated, block: B:253:0x0456  */
    /* JADX WARN: Code duplicated, block: B:256:0x048a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0493  */
    /* JADX WARN: Code duplicated, block: B:260:0x049f  */
    /* JADX WARN: Code duplicated, block: B:262:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:264:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:266:0x04db  */
    /* JADX WARN: Code duplicated, block: B:268:0x0508  */
    /* JADX WARN: Code duplicated, block: B:271:0x0532  */
    /* JADX WARN: Code duplicated, block: B:273:0x053a  */
    /* JADX WARN: Code duplicated, block: B:278:0x0558  */
    public static final void c(final boolean z, final zzr zzrVar, final jdc jdcVar, final k7c k7cVar, final SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, final Function1<? super String, Unit> function5, final Function1<? super String, Unit> function6, final Function2<? super Integer, ? super String, Unit> function7, final Function2<? super Integer, ? super String, Unit> function8, final Function2<? super Integer, ? super String, Unit> function9, final Function1<? super gdc, Unit> function10, final Function2<? super String, ? super String, Unit> function11, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        Function1<? super String, Unit> function12;
        androidx.compose.runtime.b bVar;
        int i6;
        boolean z2;
        tsr.a aVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objY;
        androidx.compose.ui.d.a aVar3;
        androidx.compose.runtime.b bVar2;
        androidx.compose.runtime.b bVar3;
        boolean z16;
        Object objY2;
        Object objY3;
        int iHashCode;
        Object objY4;
        androidx.compose.runtime.b bVarI = aVar.i(332089455);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(zzrVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? bVarI.M(jdcVar) : bVarI.A(jdcVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.d(k7cVar.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(simpleDateFormat) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(simpleDateFormat2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(function3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (bVarI.A(function4) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.A(function5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            function12 = function6;
            i5 |= bVarI.A(function12) ? 256 : 128;
        } else {
            function12 = function6;
        }
        if ((i3 & 3072) == 0) {
            i5 |= bVarI.A(function7) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= bVarI.A(function8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= bVarI.A(function9) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= bVarI.A(function10) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= bVarI.A(function11) ? 8388608 : 4194304;
        }
        int i7 = i5;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            Object objY5 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY5 == c0042a) {
                objY5 = Integer.valueOf(mmdVar.y0(configuration.screenHeightDp));
                bVarI.r(objY5);
            }
            int iIntValue = ((Number) objY5).intValue();
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = k.a(0);
                bVarI.r(objY6);
            }
            osw oswVar = (osw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = k.a(0);
                bVarI.r(objY7);
            }
            final osw oswVar2 = (osw) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = m.b(new g7f(0.0f));
                bVarI.r(objY8);
            }
            final ytw ytwVar = (ytw) objY8;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a) {
                objY9 = k.a(0);
                bVarI.r(objY9);
            }
            final osw oswVar3 = (osw) objY9;
            boolean z17 = jdcVar instanceof jdc.e;
            boolean z18 = (i4 & 3670016) == 1048576;
            Object objY10 = bVarI.y();
            if (z18 || objY10 == c0042a) {
                i6 = 0;
                objY10 = new tac(function0, 0);
                bVarI.r(objY10);
            } else {
                i6 = 0;
            }
            d930 d930VarB = zcg.b(i6, bVarI, (Function0) objY10, z17);
            Integer numValueOf = Integer.valueOf(oswVar.D());
            Integer numValueOf2 = Integer.valueOf(oswVar2.D());
            boolean zM = bVarI.M(mmdVar);
            Object objY11 = bVarI.y();
            if (zM || objY11 == c0042a) {
                objY11 = new a(iIntValue, mmdVar, oswVar, oswVar2, oswVar3, ytwVar, null);
                bVarI.r(objY11);
            }
            xvf.g(numValueOf, numValueOf2, (Function2) objY11, bVarI);
            Object objY12 = bVarI.y();
            if (objY12 == c0042a) {
                objY12 = new uac();
                bVarI.r(objY12);
            }
            xfa.c(6, bVarI, (Function2) objY12);
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar4, 1.0f);
            Object objY13 = bVarI.y();
            if (objY13 == c0042a) {
                z2 = false;
                objY13 = new vac(0);
                bVarI.r(objY13);
            } else {
                z2 = false;
            }
            androidx.compose.ui.d dVarA = a930.a(g3w.h(xa80.b(dVarE, z2, (Function1) objY13), "custom_code_screen"), d930VarB);
            aiv aivVarC = g75.c(ht.a.a, z2);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                aVar2 = aVar5;
            } else {
                aVar2 = aVar5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.layout.h.j(androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.b), 0.0f, 0.0f, 0.0f, mmdVar.u1(oswVar3.D()), 7), "custom_code_list");
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i4 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z19 = z3 | z4;
                if ((i4 & 896) != 256 || ((i4 & 512) != 0 && bVarI.A(jdcVar))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z20 = z19 | z5;
                if ((234881024 & i4) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zA = z20 | z6 | bVarI.A(simpleDateFormat) | bVarI.A(simpleDateFormat2);
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z21 = zA | z7;
                if ((i7 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z22 = z21 | z8;
                if ((i7 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z23 = z22 | z9;
                if ((1879048192 & i4) == 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z24 = z23 | z10;
                if ((57344 & i7) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z25 = z24 | z11;
                if ((458752 & i7) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z26 = z25 | z12;
                if ((i7 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z27 = z26 | z13;
                if ((29360128 & i7) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z27 | z14;
                objY = bVarI.y();
                if (!z15 || objY == c0042a) {
                    final Function1<? super String, Unit> function13 = function12;
                    aVar3 = aVar4;
                    Function1 function14 = new Function1() { // from class: wac
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            final k7c k7cVar2 = k7cVar;
                            final Function0 function15 = function1;
                            szr.h(szrVar, null, new op8(831413748, new gaj() { // from class: bbc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar6 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    int i8 = 0;
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        d.a aVar7 = d.a.b;
                                        d dVarG = j.g(aVar7, 1.0f);
                                        n54 n54Var = ht.a.a;
                                        aiv aivVarC2 = g75.c(n54Var, false);
                                        int iHashCode3 = Long.hashCode(aVar6.m());
                                        ne00 ne00VarO = aVar6.o();
                                        d dVarC2 = c.c(aVar6, dVarG);
                                        yka.k.getClass();
                                        tsr.a aVar8 = yka.a.b;
                                        if (aVar6.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar6.D();
                                        if (aVar6.g()) {
                                            aVar6.F(aVar8);
                                        } else {
                                            aVar6.p();
                                        }
                                        yka.a.b bVar5 = yka.a.f;
                                        hlh0.a(aVar6, aivVarC2, bVar5);
                                        yka.a.d dVar2 = yka.a.e;
                                        hlh0.a(aVar6, ne00VarO, dVar2);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                            j3c.a(iHashCode3, aVar6, iHashCode3, c1350a2);
                                        }
                                        yka.a.c cVar2 = yka.a.d;
                                        hlh0.a(aVar6, dVarC2, cVar2);
                                        if (k7cVar2 == k7c.a) {
                                            aVar6.N(-61791808);
                                            d dVarB = androidx.compose.foundation.layout.d.a.b(h.g(aVar7, 12.0f, 6.0f), ht.a.i);
                                            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, aVar6, 6);
                                            int iHashCode4 = Long.hashCode(aVar6.m());
                                            ne00 ne00VarO2 = aVar6.o();
                                            d dVarC3 = c.c(aVar6, dVarB);
                                            if (aVar6.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar6.D();
                                            if (aVar6.g()) {
                                                aVar6.F(aVar8);
                                            } else {
                                                aVar6.p();
                                            }
                                            hlh0.a(aVar6, i78VarA, bVar5);
                                            hlh0.a(aVar6, ne00VarO2, dVar2);
                                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                                            }
                                            hlh0.a(aVar6, dVarC3, cVar2);
                                            d dVarH2 = g3w.h(androidx.compose.foundation.a.b(aVar7, r58.d(4278251433L), j060.c(2.0f)), "custom_code_creator_tag");
                                            Function0 function16 = function15;
                                            boolean zM2 = aVar6.M(function16);
                                            Object objY14 = aVar6.y();
                                            if (zM2 || objY14 == a.C0041a.a) {
                                                objY14 = new jbc(function16, i8);
                                                aVar6.r(objY14);
                                            }
                                            d dVarD = androidx.compose.foundation.d.d(dVarH2, false, null, null, (Function0) objY14, 15);
                                            aiv aivVarC3 = g75.c(n54Var, false);
                                            int iHashCode5 = Long.hashCode(aVar6.m());
                                            ne00 ne00VarO3 = aVar6.o();
                                            d dVarC4 = c.c(aVar6, dVarD);
                                            if (aVar6.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar6.D();
                                            if (aVar6.g()) {
                                                aVar6.F(aVar8);
                                            } else {
                                                aVar6.p();
                                            }
                                            hlh0.a(aVar6, aivVarC3, bVar5);
                                            hlh0.a(aVar6, ne00VarO3, dVar2);
                                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar6, iHashCode5, c1350a2);
                                            }
                                            hlh0.a(aVar6, dVarC4, cVar2);
                                            d dVarG2 = h.g(aVar7, 12.0f, 8.0f);
                                            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new iw0(ht.a.n)), ht.a.k, aVar6, 54);
                                            int iHashCode6 = Long.hashCode(aVar6.m());
                                            ne00 ne00VarO4 = aVar6.o();
                                            d dVarC5 = c.c(aVar6, dVarG2);
                                            if (aVar6.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar6.D();
                                            if (aVar6.g()) {
                                                aVar6.F(aVar8);
                                            } else {
                                                aVar6.p();
                                            }
                                            hlh0.a(aVar6, d160VarA, bVar5);
                                            hlh0.a(aVar6, ne00VarO4, dVar2);
                                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode6))) {
                                                j3c.a(iHashCode6, aVar6, iHashCode6, c1350a2);
                                            }
                                            hlh0.a(aVar6, dVarC5, cVar2);
                                            lkf0.d(cb40.a(R.string.page_creator_credits__view_creator_credits, new Object[0], aVar6), g3w.h(aVar7, "view_creator_credits_text"), r58.d(4281678405L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar6), aVar6, 432, 0, 131064);
                                            aVar6 = aVar6;
                                            h6n.b(erz.a(R.drawable.ic_chevron_right, 0, aVar6), "right", g3w.h(j.r(aVar7, 12.0f), "view_creator_credits_chevron_icon"), r58.d(4281678405L), aVar6, 3504, 0);
                                            aVar6.s();
                                            aVar6.s();
                                            aVar6.s();
                                            aVar6.H();
                                        } else {
                                            aVar6.N(-59189420);
                                            aVar6.H();
                                        }
                                        aVar6.s();
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                            final jdc jdcVar2 = jdcVar;
                            final Function0 function16 = function2;
                            final SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
                            final SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
                            final Function1 function17 = function5;
                            final Function1 function18 = function13;
                            final Function2 function19 = function7;
                            final Function0 function20 = function3;
                            final Function2 function21 = function8;
                            final Function2 function22 = function9;
                            final Function1 function23 = function10;
                            final Function2 function24 = function11;
                            final ytw ytwVar2 = ytwVar;
                            final osw oswVar4 = oswVar2;
                            szr.h(szrVar, null, new op8(616194077, new gaj() { // from class: dbc
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar6 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        jdc jdcVar3 = jdcVar2;
                                        boolean z28 = jdcVar3 instanceof jdc.b;
                                        d.a aVar7 = d.a.b;
                                        if (z28) {
                                            aVar6.N(347623168);
                                            rbc.j(0, aVar6);
                                            ty0.a(aVar6, j.i(aVar7, ((g7f) ytwVar2.getValue()).a));
                                            Object objY14 = aVar6.y();
                                            if (objY14 == a.C0041a.a) {
                                                objY14 = new ibc(oswVar4, 0);
                                                aVar6.r(objY14);
                                            }
                                            rbc.g((Function1) objY14, aVar6, 6);
                                            aVar6.H();
                                        } else {
                                            boolean z29 = jdcVar3 instanceof jdc.d;
                                            k7c k7cVar3 = k7cVar2;
                                            Function0 function25 = function16;
                                            SimpleDateFormat simpleDateFormat5 = simpleDateFormat3;
                                            SimpleDateFormat simpleDateFormat6 = simpleDateFormat4;
                                            Function1 function26 = function17;
                                            Function1 function27 = function18;
                                            Function2 function28 = function19;
                                            Function0 function29 = function20;
                                            Function2 function30 = function21;
                                            Function2 function31 = function22;
                                            Function1 function32 = function23;
                                            Function2 function33 = function24;
                                            if (z29) {
                                                aVar6.N(348007754);
                                                if (k7cVar3 == k7c.a) {
                                                    aVar6.N(348051092);
                                                    rbc.b(function25, aVar6, 0);
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(348229621);
                                                    rbc.j(0, aVar6);
                                                    aVar6.H();
                                                }
                                                ty0.a(aVar6, j.i(aVar7, 24.0f));
                                                rbc.e(((jdc.d) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar6, 0);
                                                ty0.a(aVar6, j.i(aVar7, 24.0f));
                                                rbc.f(0, aVar6);
                                                ty0.a(aVar6, j.i(aVar7, 24.0f));
                                                aVar6.H();
                                            } else if (jdcVar3 instanceof jdc.a) {
                                                aVar6.N(349328881);
                                                ty0.a(aVar6, j.i(aVar7, 16.0f));
                                                if (k7cVar3 == k7c.a) {
                                                    aVar6.N(349444015);
                                                    rbc.a(function25, aVar6, 0);
                                                    ty0.a(aVar6, j.i(aVar7, 12.0f));
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(349680421);
                                                    aVar6.H();
                                                }
                                                rbc.e(((jdc.a) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar6, 0);
                                                ty0.a(aVar6, j.i(aVar7, 16.0f));
                                                aVar6.H();
                                            } else if (jdcVar3 instanceof jdc.c) {
                                                aVar6.N(350483290);
                                                rbc.h(0, aVar6);
                                                aVar6.H();
                                            } else {
                                                aVar6.N(350585187);
                                                aVar6.H();
                                            }
                                        }
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                            return Unit.a;
                        }
                    };
                    bVar2 = bVarI;
                    bVar2.r(function14);
                    objY = function14;
                } else {
                    aVar3 = aVar4;
                    bVar2 = bVarI;
                }
                bVar3 = bVar2;
                aur.a(dVarH, zzrVar, null, false, null, null, null, false, null, (Function1) objY, bVar3, i4 & 112, 508);
                if (jdcVar instanceof jdc.b) {
                    bVar3.N(34043096);
                    objY4 = bVar3.y();
                    if (objY4 == c0042a) {
                        objY4 = new Function1() { // from class: xac
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                oswVar3.k(((Integer) obj).intValue());
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY4);
                    }
                    Function1 function15 = (Function1) objY4;
                    hdc hdcVar = ((jdc.b) jdcVar).a;
                    d(z, function15, hdcVar.b, hdcVar.c, hdcVar.e, function4, bVar3, ((i4 << 3) & 112) | 390 | ((i7 << 18) & 3670016));
                    z16 = false;
                    bVar3.X(false);
                } else {
                    z16 = false;
                    if (jdcVar instanceof jdc.d) {
                        bVar3.N(34512312);
                        objY3 = bVar3.y();
                        if (objY3 == c0042a) {
                            objY3 = new yac(oswVar3, 0);
                            bVar3.r(objY3);
                        }
                        hdc hdcVar2 = ((jdc.d) jdcVar).a;
                        d(z, (Function1) objY3, hdcVar2.b, hdcVar2.c, hdcVar2.e, function4, bVar3, 390 | ((i4 << 3) & 112) | ((i7 << 18) & 3670016));
                        bVar3.X(false);
                    } else if (jdcVar instanceof jdc.a) {
                        bVar3.N(34978552);
                        objY2 = bVar3.y();
                        if (objY2 == c0042a) {
                            objY2 = new zac(oswVar3, 0);
                            bVar3.r(objY2);
                        }
                        hdc hdcVar3 = ((jdc.a) jdcVar).a;
                        d(z, (Function1) objY2, hdcVar3.b, hdcVar3.c, hdcVar3.e, function4, bVar3, 390 | ((i4 << 3) & 112) | ((i7 << 18) & 3670016));
                        bVar3.X(false);
                    } else {
                        bVar3.N(35401175);
                        bVar3.X(false);
                    }
                }
                androidx.compose.ui.d.a aVar6 = aVar3;
                androidx.compose.ui.d dVarG = j.g(aVar6, 1.0f);
                aiv aivVarC2 = g75.c(ht.a.e, z16);
                iHashCode = Long.hashCode(bVar3.T);
                ne00 ne00VarS2 = bVar3.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar3, dVarG);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar2);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC2, bVar4);
                hlh0.a(bVar3, ne00VarS2, dVar);
                if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar3, iHashCode, c1350a);
                }
                hlh0.a(bVar3, dVarC2, cVar);
                w830.b(z17, d930VarB, androidx.compose.foundation.layout.h.j(aVar6, 0.0f, 44.0f, 0.0f, 0.0f, 13), c68.a(R.color.background_type1_primary, bVar3), c68.a(R.color.text_type1_primary, bVar3), bVar3, 448, 32);
                bVar = bVar3;
                bVar.X(true);
                bVar.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            androidx.compose.ui.d dVarH2 = g3w.h(androidx.compose.foundation.layout.h.j(androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.b), 0.0f, 0.0f, 0.0f, mmdVar.u1(oswVar3.D()), 7), "custom_code_list");
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i4 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z110 = z3 | z4;
            if ((i4 & 896) != 256) {
                z5 = true;
            } else {
                z5 = true;
            }
            boolean z28 = z110 | z5;
            if ((234881024 & i4) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zA2 = z28 | z6 | bVarI.A(simpleDateFormat) | bVarI.A(simpleDateFormat2);
            if ((i7 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z29 = zA2 | z7;
            if ((i7 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z210 = z29 | z8;
            if ((i7 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z211 = z210 | z9;
            if ((1879048192 & i4) == 536870912) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z212 = z211 | z10;
            if ((57344 & i7) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z213 = z212 | z11;
            if ((458752 & i7) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z214 = z213 | z12;
            if ((i7 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z215 = z214 | z13;
            if ((29360128 & i7) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z215 | z14;
            objY = bVarI.y();
            if (z15) {
                final Function1 function16 = function12;
                aVar3 = aVar4;
                Function1 function17 = new Function1() { // from class: wac
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final k7c k7cVar2 = k7cVar;
                        final Function0 function18 = function1;
                        szr.h(szrVar, null, new op8(831413748, new gaj() { // from class: bbc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar7 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                int i8 = 0;
                                if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar8 = d.a.b;
                                    d dVarG2 = j.g(aVar8, 1.0f);
                                    n54 n54Var = ht.a.a;
                                    aiv aivVarC3 = g75.c(n54Var, false);
                                    int iHashCode3 = Long.hashCode(aVar7.m());
                                    ne00 ne00VarO = aVar7.o();
                                    d dVarC3 = c.c(aVar7, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar9 = yka.a.b;
                                    if (aVar7.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar7.D();
                                    if (aVar7.g()) {
                                        aVar7.F(aVar9);
                                    } else {
                                        aVar7.p();
                                    }
                                    yka.a.b bVar5 = yka.a.f;
                                    hlh0.a(aVar7, aivVarC3, bVar5);
                                    yka.a.d dVar2 = yka.a.e;
                                    hlh0.a(aVar7, ne00VarO, dVar2);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar7, iHashCode3, c1350a2);
                                    }
                                    yka.a.c cVar3 = yka.a.d;
                                    hlh0.a(aVar7, dVarC3, cVar3);
                                    if (k7cVar2 == k7c.a) {
                                        aVar7.N(-61791808);
                                        d dVarB = androidx.compose.foundation.layout.d.a.b(h.g(aVar8, 12.0f, 6.0f), ht.a.i);
                                        i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, aVar7, 6);
                                        int iHashCode4 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO2 = aVar7.o();
                                        d dVarC4 = c.c(aVar7, dVarB);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, i78VarA, bVar5);
                                        hlh0.a(aVar7, ne00VarO2, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar7, iHashCode4, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC4, cVar3);
                                        d dVarH3 = g3w.h(androidx.compose.foundation.a.b(aVar8, r58.d(4278251433L), j060.c(2.0f)), "custom_code_creator_tag");
                                        Function0 function19 = function18;
                                        boolean zM2 = aVar7.M(function19);
                                        Object objY14 = aVar7.y();
                                        if (zM2 || objY14 == a.C0041a.a) {
                                            objY14 = new jbc(function19, i8);
                                            aVar7.r(objY14);
                                        }
                                        d dVarD = androidx.compose.foundation.d.d(dVarH3, false, null, null, (Function0) objY14, 15);
                                        aiv aivVarC4 = g75.c(n54Var, false);
                                        int iHashCode5 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO3 = aVar7.o();
                                        d dVarC5 = c.c(aVar7, dVarD);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, aivVarC4, bVar5);
                                        hlh0.a(aVar7, ne00VarO3, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar7, iHashCode5, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC5, cVar3);
                                        d dVarG3 = h.g(aVar8, 12.0f, 8.0f);
                                        d160 d160VarA = b160.a(new kw0.i(8.0f, true, new iw0(ht.a.n)), ht.a.k, aVar7, 54);
                                        int iHashCode6 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO4 = aVar7.o();
                                        d dVarC6 = c.c(aVar7, dVarG3);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, d160VarA, bVar5);
                                        hlh0.a(aVar7, ne00VarO4, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode6))) {
                                            j3c.a(iHashCode6, aVar7, iHashCode6, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC6, cVar3);
                                        lkf0.d(cb40.a(R.string.page_creator_credits__view_creator_credits, new Object[0], aVar7), g3w.h(aVar8, "view_creator_credits_text"), r58.d(4281678405L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar7), aVar7, 432, 0, 131064);
                                        aVar7 = aVar7;
                                        h6n.b(erz.a(R.drawable.ic_chevron_right, 0, aVar7), "right", g3w.h(j.r(aVar8, 12.0f), "view_creator_credits_chevron_icon"), r58.d(4281678405L), aVar7, 3504, 0);
                                        aVar7.s();
                                        aVar7.s();
                                        aVar7.s();
                                        aVar7.H();
                                    } else {
                                        aVar7.N(-59189420);
                                        aVar7.H();
                                    }
                                    aVar7.s();
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        final jdc jdcVar2 = jdcVar;
                        final Function0 function19 = function2;
                        final SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
                        final SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
                        final Function1 function110 = function5;
                        final Function1 function111 = function16;
                        final Function2 function112 = function7;
                        final Function0 function20 = function3;
                        final Function2 function21 = function8;
                        final Function2 function22 = function9;
                        final Function1 function23 = function10;
                        final Function2 function24 = function11;
                        final ytw ytwVar2 = ytwVar;
                        final osw oswVar4 = oswVar2;
                        szr.h(szrVar, null, new op8(616194077, new gaj() { // from class: dbc
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar7 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    jdc jdcVar3 = jdcVar2;
                                    boolean z216 = jdcVar3 instanceof jdc.b;
                                    d.a aVar8 = d.a.b;
                                    if (z216) {
                                        aVar7.N(347623168);
                                        rbc.j(0, aVar7);
                                        ty0.a(aVar7, j.i(aVar8, ((g7f) ytwVar2.getValue()).a));
                                        Object objY14 = aVar7.y();
                                        if (objY14 == a.C0041a.a) {
                                            objY14 = new ibc(oswVar4, 0);
                                            aVar7.r(objY14);
                                        }
                                        rbc.g((Function1) objY14, aVar7, 6);
                                        aVar7.H();
                                    } else {
                                        boolean z217 = jdcVar3 instanceof jdc.d;
                                        k7c k7cVar3 = k7cVar2;
                                        Function0 function25 = function19;
                                        SimpleDateFormat simpleDateFormat5 = simpleDateFormat3;
                                        SimpleDateFormat simpleDateFormat6 = simpleDateFormat4;
                                        Function1 function26 = function110;
                                        Function1 function27 = function111;
                                        Function2 function28 = function112;
                                        Function0 function29 = function20;
                                        Function2 function30 = function21;
                                        Function2 function31 = function22;
                                        Function1 function32 = function23;
                                        Function2 function33 = function24;
                                        if (z217) {
                                            aVar7.N(348007754);
                                            if (k7cVar3 == k7c.a) {
                                                aVar7.N(348051092);
                                                rbc.b(function25, aVar7, 0);
                                                aVar7.H();
                                            } else {
                                                aVar7.N(348229621);
                                                rbc.j(0, aVar7);
                                                aVar7.H();
                                            }
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            rbc.e(((jdc.d) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar7, 0);
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            rbc.f(0, aVar7);
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            aVar7.H();
                                        } else if (jdcVar3 instanceof jdc.a) {
                                            aVar7.N(349328881);
                                            ty0.a(aVar7, j.i(aVar8, 16.0f));
                                            if (k7cVar3 == k7c.a) {
                                                aVar7.N(349444015);
                                                rbc.a(function25, aVar7, 0);
                                                ty0.a(aVar7, j.i(aVar8, 12.0f));
                                                aVar7.H();
                                            } else {
                                                aVar7.N(349680421);
                                                aVar7.H();
                                            }
                                            rbc.e(((jdc.a) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar7, 0);
                                            ty0.a(aVar7, j.i(aVar8, 16.0f));
                                            aVar7.H();
                                        } else if (jdcVar3 instanceof jdc.c) {
                                            aVar7.N(350483290);
                                            rbc.h(0, aVar7);
                                            aVar7.H();
                                        } else {
                                            aVar7.N(350585187);
                                            aVar7.H();
                                        }
                                    }
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVar2 = bVarI;
                bVar2.r(function17);
                objY = function17;
            } else {
                final Function1 function18 = function12;
                aVar3 = aVar4;
                Function1 function19 = new Function1() { // from class: wac
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final k7c k7cVar2 = k7cVar;
                        final Function0 function110 = function1;
                        szr.h(szrVar, null, new op8(831413748, new gaj() { // from class: bbc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar7 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                int i8 = 0;
                                if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar8 = d.a.b;
                                    d dVarG2 = j.g(aVar8, 1.0f);
                                    n54 n54Var = ht.a.a;
                                    aiv aivVarC3 = g75.c(n54Var, false);
                                    int iHashCode3 = Long.hashCode(aVar7.m());
                                    ne00 ne00VarO = aVar7.o();
                                    d dVarC3 = c.c(aVar7, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar9 = yka.a.b;
                                    if (aVar7.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar7.D();
                                    if (aVar7.g()) {
                                        aVar7.F(aVar9);
                                    } else {
                                        aVar7.p();
                                    }
                                    yka.a.b bVar5 = yka.a.f;
                                    hlh0.a(aVar7, aivVarC3, bVar5);
                                    yka.a.d dVar2 = yka.a.e;
                                    hlh0.a(aVar7, ne00VarO, dVar2);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar7, iHashCode3, c1350a2);
                                    }
                                    yka.a.c cVar3 = yka.a.d;
                                    hlh0.a(aVar7, dVarC3, cVar3);
                                    if (k7cVar2 == k7c.a) {
                                        aVar7.N(-61791808);
                                        d dVarB = androidx.compose.foundation.layout.d.a.b(h.g(aVar8, 12.0f, 6.0f), ht.a.i);
                                        i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, aVar7, 6);
                                        int iHashCode4 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO2 = aVar7.o();
                                        d dVarC4 = c.c(aVar7, dVarB);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, i78VarA, bVar5);
                                        hlh0.a(aVar7, ne00VarO2, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar7, iHashCode4, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC4, cVar3);
                                        d dVarH3 = g3w.h(androidx.compose.foundation.a.b(aVar8, r58.d(4278251433L), j060.c(2.0f)), "custom_code_creator_tag");
                                        Function0 function111 = function110;
                                        boolean zM2 = aVar7.M(function111);
                                        Object objY14 = aVar7.y();
                                        if (zM2 || objY14 == a.C0041a.a) {
                                            objY14 = new jbc(function111, i8);
                                            aVar7.r(objY14);
                                        }
                                        d dVarD = androidx.compose.foundation.d.d(dVarH3, false, null, null, (Function0) objY14, 15);
                                        aiv aivVarC4 = g75.c(n54Var, false);
                                        int iHashCode5 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO3 = aVar7.o();
                                        d dVarC5 = c.c(aVar7, dVarD);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, aivVarC4, bVar5);
                                        hlh0.a(aVar7, ne00VarO3, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar7, iHashCode5, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC5, cVar3);
                                        d dVarG3 = h.g(aVar8, 12.0f, 8.0f);
                                        d160 d160VarA = b160.a(new kw0.i(8.0f, true, new iw0(ht.a.n)), ht.a.k, aVar7, 54);
                                        int iHashCode6 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO4 = aVar7.o();
                                        d dVarC6 = c.c(aVar7, dVarG3);
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        hlh0.a(aVar7, d160VarA, bVar5);
                                        hlh0.a(aVar7, ne00VarO4, dVar2);
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode6))) {
                                            j3c.a(iHashCode6, aVar7, iHashCode6, c1350a2);
                                        }
                                        hlh0.a(aVar7, dVarC6, cVar3);
                                        lkf0.d(cb40.a(R.string.page_creator_credits__view_creator_credits, new Object[0], aVar7), g3w.h(aVar8, "view_creator_credits_text"), r58.d(4281678405L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar7), aVar7, 432, 0, 131064);
                                        aVar7 = aVar7;
                                        h6n.b(erz.a(R.drawable.ic_chevron_right, 0, aVar7), "right", g3w.h(j.r(aVar8, 12.0f), "view_creator_credits_chevron_icon"), r58.d(4281678405L), aVar7, 3504, 0);
                                        aVar7.s();
                                        aVar7.s();
                                        aVar7.s();
                                        aVar7.H();
                                    } else {
                                        aVar7.N(-59189420);
                                        aVar7.H();
                                    }
                                    aVar7.s();
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        final jdc jdcVar2 = jdcVar;
                        final Function0 function111 = function2;
                        final SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
                        final SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
                        final Function1 function112 = function5;
                        final Function1 function113 = function18;
                        final Function2 function114 = function7;
                        final Function0 function20 = function3;
                        final Function2 function21 = function8;
                        final Function2 function22 = function9;
                        final Function1 function23 = function10;
                        final Function2 function24 = function11;
                        final ytw ytwVar2 = ytwVar;
                        final osw oswVar4 = oswVar2;
                        szr.h(szrVar, null, new op8(616194077, new gaj() { // from class: dbc
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar7 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    jdc jdcVar3 = jdcVar2;
                                    boolean z216 = jdcVar3 instanceof jdc.b;
                                    d.a aVar8 = d.a.b;
                                    if (z216) {
                                        aVar7.N(347623168);
                                        rbc.j(0, aVar7);
                                        ty0.a(aVar7, j.i(aVar8, ((g7f) ytwVar2.getValue()).a));
                                        Object objY14 = aVar7.y();
                                        if (objY14 == a.C0041a.a) {
                                            objY14 = new ibc(oswVar4, 0);
                                            aVar7.r(objY14);
                                        }
                                        rbc.g((Function1) objY14, aVar7, 6);
                                        aVar7.H();
                                    } else {
                                        boolean z217 = jdcVar3 instanceof jdc.d;
                                        k7c k7cVar3 = k7cVar2;
                                        Function0 function25 = function111;
                                        SimpleDateFormat simpleDateFormat5 = simpleDateFormat3;
                                        SimpleDateFormat simpleDateFormat6 = simpleDateFormat4;
                                        Function1 function26 = function112;
                                        Function1 function27 = function113;
                                        Function2 function28 = function114;
                                        Function0 function29 = function20;
                                        Function2 function30 = function21;
                                        Function2 function31 = function22;
                                        Function1 function32 = function23;
                                        Function2 function33 = function24;
                                        if (z217) {
                                            aVar7.N(348007754);
                                            if (k7cVar3 == k7c.a) {
                                                aVar7.N(348051092);
                                                rbc.b(function25, aVar7, 0);
                                                aVar7.H();
                                            } else {
                                                aVar7.N(348229621);
                                                rbc.j(0, aVar7);
                                                aVar7.H();
                                            }
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            rbc.e(((jdc.d) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar7, 0);
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            rbc.f(0, aVar7);
                                            ty0.a(aVar7, j.i(aVar8, 24.0f));
                                            aVar7.H();
                                        } else if (jdcVar3 instanceof jdc.a) {
                                            aVar7.N(349328881);
                                            ty0.a(aVar7, j.i(aVar8, 16.0f));
                                            if (k7cVar3 == k7c.a) {
                                                aVar7.N(349444015);
                                                rbc.a(function25, aVar7, 0);
                                                ty0.a(aVar7, j.i(aVar8, 12.0f));
                                                aVar7.H();
                                            } else {
                                                aVar7.N(349680421);
                                                aVar7.H();
                                            }
                                            rbc.e(((jdc.a) jdcVar3).a, simpleDateFormat5, simpleDateFormat6, function26, function27, function28, function29, function30, function31, function32, function33, aVar7, 0);
                                            ty0.a(aVar7, j.i(aVar8, 16.0f));
                                            aVar7.H();
                                        } else if (jdcVar3 instanceof jdc.c) {
                                            aVar7.N(350483290);
                                            rbc.h(0, aVar7);
                                            aVar7.H();
                                        } else {
                                            aVar7.N(350585187);
                                            aVar7.H();
                                        }
                                    }
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVar2 = bVarI;
                bVar2.r(function19);
                objY = function19;
            }
            bVar3 = bVar2;
            aur.a(dVarH2, zzrVar, null, false, null, null, null, false, null, (Function1) objY, bVar3, i4 & 112, 508);
            if (jdcVar instanceof jdc.b) {
                bVar3.N(34043096);
                objY4 = bVar3.y();
                if (objY4 == c0042a) {
                    objY4 = new Function1() { // from class: xac
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            oswVar3.k(((Integer) obj).intValue());
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY4);
                }
                Function1 function110 = (Function1) objY4;
                hdc hdcVar4 = ((jdc.b) jdcVar).a;
                d(z, function110, hdcVar4.b, hdcVar4.c, hdcVar4.e, function4, bVar3, ((i4 << 3) & 112) | 390 | ((i7 << 18) & 3670016));
                z16 = false;
                bVar3.X(false);
            } else {
                z16 = false;
                if (jdcVar instanceof jdc.d) {
                    bVar3.N(34512312);
                    objY3 = bVar3.y();
                    if (objY3 == c0042a) {
                        objY3 = new yac(oswVar3, 0);
                        bVar3.r(objY3);
                    }
                    hdc hdcVar5 = ((jdc.d) jdcVar).a;
                    d(z, (Function1) objY3, hdcVar5.b, hdcVar5.c, hdcVar5.e, function4, bVar3, 390 | ((i4 << 3) & 112) | ((i7 << 18) & 3670016));
                    bVar3.X(false);
                } else if (jdcVar instanceof jdc.a) {
                    bVar3.N(34978552);
                    objY2 = bVar3.y();
                    if (objY2 == c0042a) {
                        objY2 = new zac(oswVar3, 0);
                        bVar3.r(objY2);
                    }
                    hdc hdcVar6 = ((jdc.a) jdcVar).a;
                    d(z, (Function1) objY2, hdcVar6.b, hdcVar6.c, hdcVar6.e, function4, bVar3, 390 | ((i4 << 3) & 112) | ((i7 << 18) & 3670016));
                    bVar3.X(false);
                } else {
                    bVar3.N(35401175);
                    bVar3.X(false);
                }
            }
            androidx.compose.ui.d.a aVar7 = aVar3;
            androidx.compose.ui.d dVarG2 = j.g(aVar7, 1.0f);
            aiv aivVarC3 = g75.c(ht.a.e, z16);
            iHashCode = Long.hashCode(bVar3.T);
            ne00 ne00VarS3 = bVar3.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar3, dVarG2);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar2);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, aivVarC3, bVar4);
            hlh0.a(bVar3, ne00VarS3, dVar);
            if (bVar3.S) {
                n30.a(iHashCode, bVar3, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVar3, iHashCode, c1350a);
            }
            hlh0.a(bVar3, dVarC3, cVar2);
            w830.b(z17, d930VarB, androidx.compose.foundation.layout.h.j(aVar7, 0.0f, 44.0f, 0.0f, 0.0f, 13), c68.a(R.color.background_type1_primary, bVar3), c68.a(R.color.text_type1_primary, bVar3), bVar3, 448, 32);
            bVar = bVar3;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: abc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    rbc.c(z, zzrVar, jdcVar, k7cVar, simpleDateFormat, simpleDateFormat2, function0, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final Function1 function1, final boolean z2, final int i2, boolean z3, final Function0 function0, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        int i5;
        int i6;
        final boolean z4 = z3;
        androidx.compose.runtime.b bVarI = aVar.i(613136593);
        int i7 = i3 & 6;
        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
        if (i7 == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.b(z4) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if (bVarI.q(i4 & 1, (599187 & i4) != 599186)) {
            n54 n54Var = ht.a.h;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(dVar.b(aVar2, n54Var), 1.0f);
            boolean z5 = (i4 & 896) == 256;
            Object objY = bVarI.y();
            boolean z6 = z5;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z6 || objY == c0042a) {
                objY = new ebc(function1, 0);
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarA = v.a(dVarG, (Function1) objY);
            if (z) {
                i5 = -543174613;
                i6 = R.color.background_general_primary;
            } else {
                i5 = -543067446;
                i6 = R.color.background_type1_quaternary;
            }
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.a.b(dVarA, rzg.a(bVarI, i5, i6, bVarI, false), zk40.a), "custom_code_creation_section");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            int i8 = i4;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            androidx.compose.ui.d dVarG2 = androidx.compose.foundation.layout.h.g(j.g(aVar2, 1.0f), 20.0f, 16.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (z2) {
                bVarI.N(1695997824);
                lkf0.d(cb40.a(R.string.page_custom_codes__vreach_maximum_custom_code, new Object[]{String.valueOf(i2)}, bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 130042);
                bVarI = bVarI;
                bVarI.X(false);
                z4 = z3;
            } else {
                bVarI.N(1696503961);
                androidx.compose.ui.d dVarH2 = g3w.h(j.g(aVar2, 1.0f), "create_custom_code_button");
                alb0 alb0Var = g9z.a;
                boolean z7 = ((i8 & 458752) == 131072) | ((i8 & 3670016) == 1048576);
                Object objY2 = bVarI.y();
                if (z7 || objY2 == c0042a) {
                    z4 = z3;
                    objY2 = new Function0() { // from class: fbc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (!z4) {
                                function0.invoke();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    z4 = z3;
                }
                vuc0.a(dVarH2, false, null, null, (Function0) objY2, null, alb0Var, null, null, pp8.b(-1296798840, new gaj() { // from class: gbc
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d.a aVar5 = d.a.b;
                            if (z4) {
                                aVar4.N(296654336);
                                q330.a(j.r(aVar5, 20.0f), c68.a(R.color.brand_quaternary, aVar4), 2.0f, 0L, 0, 0.0f, aVar4, 390, 56);
                                aVar4.H();
                            } else {
                                aVar4.N(296946573);
                                h6n.b(erz.a(R.drawable.ic_plus_circle, 0, aVar4), yFmFZvuWxAYfEj.mHeGlv, j.r(aVar5, 20.0f), c68.a(R.color.brand_quaternary, aVar4), aVar4, 432, 0);
                                ty0.a(aVar4, j.w(aVar5, 12.0f));
                                lkf0.d(cb40.a(R.string.page_custom_codes__create_a_custom_code, new Object[0], aVar4), null, c68.a(R.color.brand_quaternary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 0, 0, 131066);
                                aVar4.H();
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 805306374, 430);
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hbc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rbc.d(z, function1, z2, i2, z4, function0, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final hdc hdcVar, final SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, final Function1 function1, final Function1 function2, final Function2 function3, final Function0 function0, final Function2 function4, final Function2 function5, final Function1 function6, final Function2 function7, androidx.compose.runtime.a aVar, final int i2) {
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(-1474960815);
        Function1 function8 = function1;
        Function1 function9 = function2;
        Function0 function10 = function0;
        Function2 function11 = function4;
        Function2 function12 = function5;
        Function1 function13 = function6;
        int i3 = i2 | (bVarI.M(hdcVar) ? 4 : 2) | (bVarI.A(simpleDateFormat) ? 32 : 16) | (bVarI.A(simpleDateFormat2) ? 256 : 128) | (bVarI.A(function8) ? 2048 : 1024) | (bVarI.A(function9) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function10) ? 1048576 : 524288) | (bVarI.A(function11) ? 8388608 : 4194304) | (bVarI.A(function12) ? 67108864 : 33554432) | (bVarI.A(function13) ? 536870912 : 268435456);
        Function2 function14 = function7;
        if (bVarI.q(i3 & 1, ((306783379 & i3) == 306783378 && ((bVarI.A(function14) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.layout.h.h(j.g(androidx.compose.ui.d.a.b, 1.0f), 20.0f, 0.0f, 2), "custom_code_list_container");
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            bVarI.N(76256614);
            List<gdc> list = hdcVar.a;
            boolean z2 = hdcVar.d;
            for (gdc gdcVar : list) {
                Boolean bool = gdcVar.d;
                boolean z3 = gdcVar.l;
                if (Intrinsics.g(bool, Boolean.TRUE)) {
                    bVarI.N(225129498);
                    boolean z4 = z3 && !z2;
                    int i4 = i3 << 3;
                    Function2 function15 = function14;
                    androidx.compose.runtime.b bVar = bVarI;
                    z = z2;
                    p8c.b(gdcVar, simpleDateFormat, simpleDateFormat2, function8, function9, function3, z4, function10, function11, function13, function15, bVar, (i3 & 524272) | (i4 & 29360128) | (i4 & 234881024) | (i3 & 1879048192));
                    bVarI = bVar;
                    bVarI.X(false);
                } else {
                    z = z2;
                    bVarI.N(225729534);
                    int i5 = i3 >> 9;
                    j9c.c(gdcVar, function1, function2, function3, function4, function12, z3 && !z, false, function0, bVarI, ((i3 >> 6) & 8176) | (57344 & i5) | (i5 & 458752) | ((i3 << 6) & 234881024), 128);
                    bVarI.X(false);
                }
                function8 = function1;
                function9 = function2;
                function10 = function0;
                function11 = function4;
                function12 = function5;
                function13 = function6;
                function14 = function7;
                z2 = z;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(simpleDateFormat, simpleDateFormat2, function1, function2, function3, function0, function4, function5, function6, function7, i2) { // from class: pbc
                public final /* synthetic */ SimpleDateFormat b;
                public final /* synthetic */ SimpleDateFormat c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function2 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function2 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Function2 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rbc.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-513751184);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.layout.h.h(androidx.compose.ui.d.a.b, 20.0f, 0.0f, 2), "custom_code_load_desc_text");
            String strA = cb40.a(R.string.page_custom_codes__empty_list_text, new Object[0], bVarI);
            long jA = c68.a(R.color.text_type1_secondary, bVarI);
            imf0 imf0VarL = mla.l(R.style.B1_R, bVarI);
            bVar = bVarI;
            i3 = 0;
            lkf0.d(strA, dVarH, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarL, bVar, 48, 0, 130040);
        } else {
            bVar = bVarI;
            i3 = 0;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new qbc(i2, i3);
        }
    }

    public static final void g(final Function1 function1, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(1245713531);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cbc(function1, 0);
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarH = g3w.h(v.a(dVarG, (Function1) objY), "custom_code_load_empty_section");
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.ic_load_code_custom, 0, bVarI), "load_custom_code", j.r(aVar2, 48.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, bVarI), 5), bVarI, 432, 56);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.page_custom_codes__empty_list_text, new Object[0], bVarI), androidx.compose.foundation.layout.h.h(aVar2, 30.0f, 0.0f, 2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function1) { // from class: kbc
                public final /* synthetic */ Function1 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    rbc.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(2427669);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = g3w.h(j.e(aVar2, 1.0f), "custom_code_load_failure_page");
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.i(aVar2, 155.0f));
            h9n.a(erz.a(R.drawable.ic_nodata, 0, bVarI), "no_data", j.r(aVar2, 48.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, bVarI), 5), bVarI, 432, 56);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVarI), androidx.compose.foundation.layout.h.h(aVar2, 30.0f, 0.0f, 2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new nbc();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r17v3, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    public static final void i(final bdc bdcVar, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final gaj<? super String, ? super String, ? super BookingData, Unit> gajVar, final Function2<? super String, ? super String, Unit> function3, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        ?? r14;
        ?? r9;
        v3a0 v3a0Var;
        int i4;
        int i5;
        boolean z;
        final bdc bdcVar2;
        Object obj;
        boolean z2;
        boolean z3;
        Object obj2;
        ?? r15;
        ?? r8;
        boolean z4;
        final bdc bdcVar3 = bdcVar;
        bdcVar3.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        gajVar.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-689727331);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bVarI.M(bdcVar3) : bVarI.A(bdcVar3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(function3) ? 131072 : 65536;
        }
        int i6 = i3;
        if (bVarI.q(i6 & 1, (74899 & i6) != 74898)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zD = r0b.d(context);
            ytw ytwVarC = wyh.c(bdcVar3.w, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(bdcVar3.z, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(bdcVar3.B, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(bdcVar3.D, bVarI, 0, 7);
            ytw ytwVarC5 = wyh.c(bdcVar3.F, bVarI, 0, 7);
            ytw ytwVarC6 = wyh.c(bdcVar3.H, bVarI, 0, 7);
            Object objY = bVarI.y();
            Object obj3 = androidx.compose.runtime.a.C0041a.a;
            if (objY == obj3) {
                objY = b40.a(bVarI);
            }
            final v3a0 v3a0Var2 = (v3a0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == obj3) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == obj3) {
                objY3 = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.ENGLISH);
                bVarI.r(objY3);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == obj3) {
                objY4 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                bVarI.r(objY4);
            }
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) objY4;
            int i7 = i6 & 14;
            boolean zA = ((57344 & i6) == 16384) | (i7 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3))) | bVarI.A(context) | bVarI.A(v5bVar);
            Object objY5 = bVarI.y();
            if (zA || objY5 == obj3) {
                r9 = 0;
                Function0 function4 = new Function0() { // from class: iac
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzh.d(new g1i(bdcVar3.I.b, new rbc.b(v3a0Var2, context, gajVar, null)), v5bVar);
                        return Unit.a;
                    }
                };
                bdcVar3 = bdcVar3;
                v3a0Var = v3a0Var2;
                bVarI.r(function4);
                objY5 = function4;
            } else {
                v3a0Var = v3a0Var2;
                r9 = 0;
            }
            xfa.b((Function0) objY5, bVarI, r9);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, r9);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
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
            jdc jdcVar = (jdc) ytwVarC2.getValue();
            k7c k7cVar = (k7c) ytwVarC3.getValue();
            boolean z5 = i7 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3));
            Object objY6 = bVarI.y();
            if (z5 || objY6 == obj3) {
                objY6 = new Function0() { // from class: kac
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        bdcVar3.y1(true);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            Function0 function5 = (Function0) objY6;
            boolean zM = bVarI.M(ytwVarC) | ((i6 & 896) == 256);
            Object objY7 = bVarI.y();
            if (zM || objY7 == obj3) {
                objY7 = new lac(0, ytwVarC, function1);
                bVarI.r(objY7);
            }
            Function0 function6 = (Function0) objY7;
            boolean z6 = i7 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3));
            Object objY8 = bVarI.y();
            if (z6 || objY8 == obj3) {
                i4 = i7;
                objY8 = new c(0, bdcVar3, bdc.class, "dismissEditHint", "dismissEditHint()V", 0);
                bVarI.r(objY8);
            } else {
                i4 = i7;
            }
            Function0 function7 = (Function0) ((chp) objY8);
            boolean z7 = i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3));
            Object objY9 = bVarI.y();
            if (z7 || objY9 == obj3) {
                objY9 = new d(0, bdcVar3, bdc.class, "createCustomCode", "createCustomCode()V", 0);
                bVarI.r(objY9);
            }
            Function0 function8 = (Function0) ((chp) objY9);
            boolean z8 = i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3));
            Object objY10 = bVarI.y();
            if (z8 || objY10 == obj3) {
                i5 = 1;
                objY10 = new ci3(bdcVar3, i5);
                bVarI.r(objY10);
            } else {
                i5 = 1;
            }
            Function1 function9 = (Function1) objY10;
            int i8 = (i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3))) ? i5 : 0;
            Object objY11 = bVarI.y();
            if (i8 != 0 || objY11 == obj3) {
                objY11 = new Function2() { // from class: mac
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj4).intValue();
                        String str = (String) obj5;
                        str.getClass();
                        bdc bdcVar4 = bdcVar3;
                        bdcVar4.getClass();
                        kzh.d(new g1i(r0i.a(bdcVar4.i.b.e(), new ycc(bdcVar4, str, iIntValue, null)), new zcc(bdcVar4, null)), o8i0.d(bdcVar4));
                        return Unit.a;
                    }
                };
                bVarI.r(objY11);
            }
            Function2 function10 = (Function2) objY11;
            int i9 = (i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3))) ? i5 : 0;
            Object objY12 = bVarI.y();
            if (i9 != 0 || objY12 == obj3) {
                objY12 = new Function2() { // from class: nac
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj4).intValue();
                        String str = (String) obj5;
                        str.getClass();
                        bdc bdcVar4 = bdcVar3;
                        bdcVar4.getClass();
                        kzh.d(new g1i(new gzh(new l7c.b(iIntValue, str, false)), new xcc(bdcVar4, null)), o8i0.d(bdcVar4));
                        return Unit.a;
                    }
                };
                bVarI.r(objY12);
            }
            Function2 function11 = (Function2) objY12;
            int i10 = (i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3))) ? i5 : 0;
            Object objY13 = bVarI.y();
            if (i10 != 0 || objY13 == obj3) {
                objY13 = new Function2() { // from class: oac
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj4).intValue();
                        String str = (String) obj5;
                        str.getClass();
                        bdc bdcVar4 = bdcVar3;
                        bdcVar4.getClass();
                        sbc sbcVar = bdcVar4.i;
                        sbcVar.getClass();
                        kzh.d(new g1i(new or60(new dcc(sbcVar, str, iIntValue, null)), new cdc(bdcVar4, iIntValue, null)), o8i0.d(bdcVar4));
                        return Unit.a;
                    }
                };
                bVarI.r(objY13);
            }
            Function2 function12 = (Function2) objY13;
            boolean z9 = i4 == 4 || ((i6 & 8) != 0 && bVarI.A(bdcVar3));
            Object objY14 = bVarI.y();
            if (z9 || objY14 == obj3) {
                z = false;
                objY14 = new pac(bdcVar3, 0);
                bVarI.r(objY14);
            } else {
                z = false;
            }
            c(zD, zzrVarA, jdcVar, k7cVar, simpleDateFormat, simpleDateFormat2, function5, function0, function6, function7, function8, function2, function9, function10, function11, function12, (Function1) objY14, function3, bVarI, (i6 << 18) & 29360128, ((i6 >> 6) & 112) | ((i6 << 6) & 29360128));
            boolean z10 = z;
            bdc bdcVar4 = bdcVar3;
            s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), kw8.a, bVarI, 390, 0);
            androidx.compose.runtime.b bVar = bVarI;
            bVar.X(true);
            l7c l7cVar = (l7c) ytwVarC4.getValue();
            if (l7cVar instanceof l7c.b) {
                bVar.N(-538802030);
                l7c.b bVar2 = (l7c.b) l7cVar;
                int i11 = bVar2.a;
                String str = bVar2.b;
                boolean z11 = bVar2.c;
                boolean z12 = (i4 == 4 || ((i6 & 8) != 0 && bVar.A(bdcVar4))) ? true : z10;
                Object objY15 = bVar.y();
                if (z12 || objY15 == obj3) {
                    z3 = true;
                    bdcVar2 = bdcVar4;
                    e eVar = new e(1, bdcVar2, bdc.class, "confirmDeleteCode", "confirmDeleteCode(I)V", 0);
                    bVar.r(eVar);
                    objY15 = eVar;
                } else {
                    bdcVar2 = bdcVar4;
                    z3 = true;
                }
                Function1 function13 = (Function1) ((chp) objY15);
                boolean z13 = (i4 == 4 || ((i6 & 8) != 0 && bVar.A(bdcVar2))) ? z3 : z10;
                Object objY16 = bVar.y();
                if (z13 || objY16 == obj3) {
                    f fVar = new f(0, bdcVar2, bdc.class, "concealDeleteCode", "concealDeleteCode()Lkotlinx/coroutines/Job;", 8);
                    bVar.r(fVar);
                    objY16 = fVar;
                }
                obj = obj3;
                z2 = z10;
                e8c.a(i11, str, z11, function13, (Function0) objY16, bVar, 0);
                bVar.X(z2);
            } else {
                bdcVar2 = bdcVar4;
                obj = obj3;
                z2 = z10;
                z3 = true;
                if (!(l7cVar instanceof l7c.a)) {
                    throw igf0.a(bVar, -1402856763, z2);
                }
                bVar.N(-538457341);
                bVar.X(z2);
            }
            f8c f8cVar = (f8c) ytwVarC5.getValue();
            if (f8cVar instanceof f8c.b) {
                bVar.N(-538342238);
                f8c.b bVar3 = (f8c.b) f8cVar;
                int i12 = bVar3.a;
                String str2 = bVar3.b;
                String str3 = bVar3.c;
                boolean z14 = bVar3.d;
                boolean z15 = bVar3.e;
                boolean z16 = (i4 == r9 || ((i6 & 8) != 0 && bVar.A(bdcVar2))) ? z3 : z2;
                Object objY17 = bVar.y();
                if (z16 || objY17 == obj) {
                    objY17 = new Function2() { // from class: qac
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj4).intValue();
                            String str4 = (String) obj5;
                            str4.getClass();
                            bdc bdcVar5 = bdcVar2;
                            bdcVar5.getClass();
                            f8c f8cVar2 = (f8c) bdcVar5.E.getValue();
                            if (f8cVar2 instanceof f8c.b) {
                                sbc sbcVar = bdcVar5.i;
                                sbcVar.getClass();
                                f8c.b bVar4 = (f8c.b) f8cVar2;
                                kzh.d(new g1i(new xzh(new lcc(bm50.a(new ccc(sbcVar.b.h(iIntValue, str4))), bdcVar5, bVar4), new mcc(bdcVar5, bVar4, null)), new ncc(bdcVar5, null)), o8i0.d(bdcVar5));
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(objY17);
                }
                Function2 function14 = (Function2) objY17;
                boolean z17 = (i4 == r9 || ((i6 & 8) != 0 && bVar.A(bdcVar2))) ? z3 : z2;
                Object objY18 = bVar.y();
                if (z17 || objY18 == obj) {
                    obj2 = obj;
                    z4 = z2;
                    g gVar = new g(0, bdcVar2, bdc.class, "concealEditCode", "concealEditCode()Lkotlinx/coroutines/Job;", 8);
                    bVar.r(gVar);
                    objY18 = gVar;
                } else {
                    z4 = z2;
                    obj2 = obj;
                }
                e8c.b(i12, str2, str3, z14, z15, null, function14, (Function0) objY18, bVar, 0);
                androidx.compose.runtime.b bVar4 = bVar;
                bVar4.X(z4);
                r8 = z4;
                r15 = bVar4;
            } else {
                boolean z18 = z2;
                obj2 = obj;
                if (!(f8cVar instanceof f8c.a)) {
                    throw igf0.a(bVar, -1402841809, z18);
                }
                bVar.N(-537830397);
                bVar.X(z18);
                r8 = z18;
                r15 = bVar;
            }
            fac facVar = (fac) ytwVarC6.getValue();
            if (facVar instanceof fac.b) {
                r15.N(-537714271);
                fac.b bVar5 = (fac.b) facVar;
                gdc gdcVar = bVar5.a;
                boolean z19 = bVar5.b;
                ?? r16 = (i4 == 4 || ((i6 & 8) != 0 && r15.A(bdcVar2))) ? 1 : r8;
                Object objY19 = r15.y();
                Object obj4 = obj2;
                if (r16 != 0 || objY19 == obj4) {
                    objY19 = new sac(bdcVar2, r8);
                    r15.r(objY19);
                }
                Function1 function15 = (Function1) objY19;
                ?? r0 = (i4 == 4 || ((i6 & 8) != 0 && r15.A(bdcVar2))) ? 1 : r8;
                Object objY20 = r15.y();
                if (r0 != 0 || objY20 == obj4) {
                    h hVar = new h(0, bdcVar2, bdc.class, "concealResetCode", "concealResetCode()Lkotlinx/coroutines/Job;", 8);
                    r15.r(hVar);
                    objY20 = hVar;
                }
                ?? r17 = r15;
                e8c.d(gdcVar, simpleDateFormat, simpleDateFormat2, z19, null, function3, function15, (Function0) objY20, r17, i6 & 458752);
                ?? r18 = r17;
                r18.X(r8);
                r14 = r18;
            } else {
                if (!(facVar instanceof fac.a)) {
                    throw igf0.a(r15, -1402821613, r8);
                }
                r15.N(-537231229);
                r15.X(r8);
                r14 = r15;
            }
        } else {
            bVarI.G();
            r14 = bVarI;
        }
        androidx.compose.runtime.e eVarZ = r14.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jac
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    rbc.i(bdcVar, function0, function1, function2, gajVar, function3, (a) obj5, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(int i2, androidx.compose.runtime.a aVar) {
        boolean z;
        androidx.compose.runtime.b bVar;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(487616807);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i2 & 1, z)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = g3w.h(j.g(aVar2, 1.0f), "custom_code_title_section");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.page_custom_codes__customized_your_book_code_now, new Object[0], bVarI), g3w.h(androidx.compose.foundation.layout.h.h(aVar2, 20.0f, 0.0f, 2), "custom_code_title_main_text"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            i3 = 0;
            lkf0.d(cb40.a(R.string.page_custom_codes__customize_book_code_with_social_name, new Object[0], bVarI), g3w.h(androidx.compose.foundation.layout.h.h(aVar2, 20.0f, 0.0f, 2), jbkEboCkTqmGf.HzyTIfneo), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            i3 = 0;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new obc(i2, i3);
        }
    }
}
