package defpackage;

import android.accounts.Account;
import android.util.Range;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld740;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d740 extends j8i0 {
    public final ich A;
    public final ku90<com.sporty.android.common.uievent.a> B;
    public final ku90<b740> C;
    public final wwd0 D;
    public final c740 E;
    public final wwd0 F;
    public final v340 G;
    public final v340 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final v340 R;
    public final v340 S;
    public final v340 T;
    public final v340 U;
    public final wwd0 V;
    public final t340 W;
    public final emf a;
    public final at2 b;
    public final k650 c;
    public final m2l d;
    public final psm e;
    public final uqm f;
    public final jrm i;
    public final h450 v;
    public final lq1 w;
    public final xrc y;
    public final sfy z;

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$1", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements jaj<z2z, bbj0, Range<Date>, Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ z2z a;
        public /* synthetic */ bbj0 b;
        public /* synthetic */ Range c;
        public /* synthetic */ boolean d;
        public final /* synthetic */ d740 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, d740 d740Var) {
            super(5, v1bVar);
            this.e = d740Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            z2z z2zVar;
            int iOrdinal;
            Set setV;
            Date date;
            Date date2;
            z2z z2zVar2 = this.a;
            bbj0 bbj0Var = this.b;
            Range range = this.c;
            boolean z = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Integer num = bbj0Var == bbj0.a ? new Integer(z2zVar2.a) : null;
            d740 d740Var = this.e;
            wwd0 wwd0Var = d740Var.L;
            do {
                value = wwd0Var.getValue();
                ((Boolean) value).getClass();
                z2zVar = z2z.UNSETTLED;
            } while (!wwd0Var.g(value, Boolean.valueOf((z2zVar2 == z2zVar || z) ? false : true)));
            if (z2zVar2 == z2zVar || (iOrdinal = bbj0Var.ordinal()) == 0) {
                setV = null;
            } else if (iOrdinal == 1) {
                setV = ay0.V(new Integer[]{new Integer(10), new Integer(20)});
            } else if (iOrdinal == 2) {
                setV = wi80.b(new Integer(30));
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                setV = wi80.b(new Integer(40));
            }
            wwd0 wwd0Var2 = d740Var.V;
            q640 q640Var = (q640) wwd0Var2.getValue();
            String strValueOf = (range == null || (date2 = (Date) range.getLower()) == null) ? null : String.valueOf(date2.getTime());
            String strValueOf2 = (range == null || (date = (Date) range.getUpper()) == null) ? null : String.valueOf(date.getTime());
            q640Var.getClass();
            q640 q640Var2 = new q640(strValueOf, strValueOf2, setV, num);
            wwd0Var2.getClass();
            wwd0Var2.k(null, q640Var2);
            return Unit.a;
        }

        @Override // defpackage.jaj
        public final Object l(z2z z2zVar, bbj0 bbj0Var, Range<Date> range, Boolean bool, v1b<? super Unit> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(v1bVar, this.e);
            aVar.a = z2zVar;
            aVar.b = bbj0Var;
            aVar.c = range;
            aVar.d = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$2", f = "RealBetHistoryViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ d740 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, d740 d740Var) {
            super(2, v1bVar);
            this.c = d740Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.c);
            bVar.b = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                at2 at2Var = this.c.b;
                this.b = z;
                this.a = 1;
                if (at2Var.a(z, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$3", f = "RealBetHistoryViewModel.kt", l = {292}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ d740 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, d740 d740Var) {
            super(2, v1bVar);
            this.c = d740Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(v1bVar, this.c);
            cVar.b = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((c) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                at2 at2Var = this.c.b;
                this.b = z;
                this.a = 1;
                if (at2Var.e(z, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$4", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ d740 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, d740 d740Var) {
            super(2, v1bVar);
            this.b = d740Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(v1bVar, this.b);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
            return ((d) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.J;
            if (wwd0Var.getValue() instanceof c330.a) {
                c330 c330Var = (c330) wwd0Var.getValue();
                c330 aVar = c330.b.a;
                if (!Intrinsics.g(c330Var, aVar)) {
                    if (!(c330Var instanceof c330.a)) {
                        uhc.a();
                        return null;
                    }
                    boolean z = !list.isEmpty();
                    StringUiText stringUiText = vch0.a;
                    aVar = new c330.a(new ResourceUiText(R.string.wap_home__delete).h(!list.isEmpty() ? new StringUiText(pe4.b(list.size(), " (", ")")) : vch0.a), z);
                }
                wwd0Var.setValue(aVar);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$5", f = "RealBetHistoryViewModel.kt", l = {313}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d740 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, d740 d740Var) {
            super(2, v1bVar);
            this.b = d740Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            d740 d740Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = d740Var.d;
                this.a = 1;
                obj = m2lVar.a.getBoolean("key_new_feature_popup_filter", false, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            osa0.a(!((Boolean) obj).booleanValue(), d740Var.N, null);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$betHistoryUiStateFlow$1", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements kaj<rm80, fgj0, bbj0, ResourceUiText, Boolean, v1b<? super fr2>, Object> {
        public /* synthetic */ rm80 a;
        public /* synthetic */ fgj0 b;
        public /* synthetic */ bbj0 c;
        public /* synthetic */ ResourceUiText d;
        public /* synthetic */ boolean e;

        public f(v1b<? super f> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(rm80 rm80Var, fgj0 fgj0Var, bbj0 bbj0Var, ResourceUiText resourceUiText, Boolean bool, v1b<? super fr2> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            f fVar = new f(v1bVar);
            fVar.a = rm80Var;
            fVar.b = fgj0Var;
            fVar.c = bbj0Var;
            fVar.d = resourceUiText;
            fVar.e = zBooleanValue;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rm80 rm80Var = this.a;
            fgj0 fgj0Var = this.b;
            bbj0 bbj0Var = this.c;
            ResourceUiText resourceUiText = this.d;
            boolean z = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new fr2(resourceUiText, rm80Var.a, fgj0Var.a, bbj0Var, z, rm80Var.b, fgj0Var.b, rm80Var.d, !rm80Var.c, 512);
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$betHistoryUiStateFlow$2", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements gaj<fr2, Boolean, v1b<? super fr2>, Object> {
        public /* synthetic */ fr2 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(fr2 fr2Var, Boolean bool, v1b<? super fr2> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = new g(3, v1bVar);
            gVar.a = fr2Var;
            gVar.b = zBooleanValue;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fr2 fr2Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z2 = fr2Var.h;
            boolean z3 = z2 && z;
            UiText uiText = fr2Var.a;
            UiText uiText2 = fr2Var.b;
            UiText uiText3 = fr2Var.c;
            bbj0 bbj0Var = fr2Var.d;
            boolean z4 = fr2Var.e;
            boolean z5 = fr2Var.f;
            boolean z6 = fr2Var.g;
            boolean z7 = fr2Var.i;
            uiText2.getClass();
            uiText3.getClass();
            bbj0Var.getClass();
            return new fr2(uiText, uiText2, uiText3, bbj0Var, z4, z5, z6, z2, z7, z3);
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$orderUiStatesPagingData$1", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements iaj<q640, String, Long, v1b<? super q640>, Object> {
        public /* synthetic */ q640 a;

        @Override // defpackage.iaj
        public final Object d(q640 q640Var, String str, Long l, v1b<? super q640> v1bVar) {
            h hVar = new h(4, v1bVar);
            hVar.a = q640Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            q640 q640Var = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return q640Var;
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$orderUiStatesPagingData$2$1$1", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<a740, v1b<? super t640>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ d740 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(v1b v1bVar, d740 d740Var) {
            super(2, v1bVar);
            this.b = d740Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = new i(v1bVar, this.b);
            iVar.a = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a740 a740Var, v1b<? super t640> v1bVar) {
            return ((i) create(a740Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:163:0x0254 A[PHI: r24
          0x0254: PHI (r24v7 int) = (r24v0 int), (r24v8 int) binds: [B:155:0x0241, B:159:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:166:0x0272  */
        /* JADX WARN: Code duplicated, block: B:168:0x028a  */
        /* JADX WARN: Code duplicated, block: B:169:0x028d  */
        /* JADX WARN: Code duplicated, block: B:173:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:174:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:176:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:179:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:182:0x02c5  */
        /* JADX WARN: Code duplicated, block: B:185:0x02d0 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:186:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:191:0x02e9  */
        /* JADX WARN: Code duplicated, block: B:194:0x02f9  */
        /* JADX WARN: Code duplicated, block: B:197:0x0307  */
        /* JADX WARN: Code duplicated, block: B:200:0x0313  */
        /* JADX WARN: Code duplicated, block: B:202:0x0317  */
        /* JADX WARN: Code duplicated, block: B:204:0x032e  */
        /* JADX WARN: Code duplicated, block: B:208:0x0348  */
        /* JADX WARN: Code duplicated, block: B:209:0x034b  */
        /* JADX WARN: Code duplicated, block: B:213:0x035c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:215:0x0390  */
        /* JADX WARN: Code duplicated, block: B:218:0x0396  */
        /* JADX WARN: Code duplicated, block: B:220:0x039b  */
        /* JADX WARN: Code duplicated, block: B:221:0x039e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:222:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:223:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:227:0x03aa  */
        /* JADX WARN: Code duplicated, block: B:230:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:231:0x03bc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:232:0x03be  */
        /* JADX WARN: Code duplicated, block: B:233:0x03c6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:234:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:235:0x03ca A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:236:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:237:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:238:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:240:0x03df  */
        /* JADX WARN: Code duplicated, block: B:245:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:251:0x0403  */
        /* JADX WARN: Code duplicated, block: B:254:0x040c  */
        /* JADX WARN: Code duplicated, block: B:255:0x0416  */
        /* JADX WARN: Code duplicated, block: B:258:0x041d  */
        /* JADX WARN: Code duplicated, block: B:261:0x042d  */
        /* JADX WARN: Code duplicated, block: B:263:0x0430  */
        /* JADX WARN: Code duplicated, block: B:266:0x0442  */
        /* JADX WARN: Code duplicated, block: B:268:0x0445  */
        /* JADX WARN: Code duplicated, block: B:271:0x044f  */
        /* JADX WARN: Code duplicated, block: B:273:0x0459 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:274:0x045b  */
        /* JADX WARN: Code duplicated, block: B:275:0x0464 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:276:0x0466  */
        /* JADX WARN: Code duplicated, block: B:277:0x046f  */
        /* JADX WARN: Code duplicated, block: B:278:0x0478  */
        /* JADX WARN: Code duplicated, block: B:280:0x047b  */
        /* JADX WARN: Code duplicated, block: B:283:0x048c  */
        /* JADX WARN: Code duplicated, block: B:285:0x048f  */
        /* JADX WARN: Code duplicated, block: B:288:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:290:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:293:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:296:0x04cd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:297:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:323:0x054d  */
        /* JADX WARN: Code duplicated, block: B:325:0x0554 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:343:0x0597  */
        /* JADX WARN: Code duplicated, block: B:345:0x059e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:358:0x05cc  */
        /* JADX WARN: Code duplicated, block: B:359:0x05d1  */
        /* JADX WARN: Code duplicated, block: B:362:0x05d9  */
        /* JADX WARN: Code duplicated, block: B:363:0x05de  */
        /* JADX WARN: Code duplicated, block: B:366:0x0606  */
        /* JADX WARN: Code duplicated, block: B:368:0x060c  */
        /* JADX WARN: Code duplicated, block: B:371:0x0618  */
        /* JADX WARN: Code duplicated, block: B:373:0x061f  */
        /* JADX WARN: Code duplicated, block: B:374:0x0632  */
        /* JADX WARN: Code duplicated, block: B:378:0x0655  */
        /* JADX WARN: Code duplicated, block: B:381:0x0664  */
        /* JADX WARN: Code duplicated, block: B:384:0x0676  */
        /* JADX WARN: Code duplicated, block: B:390:0x068c  */
        /* JADX WARN: Code duplicated, block: B:392:0x0696  */
        /* JADX WARN: Code duplicated, block: B:395:0x069f  */
        /* JADX WARN: Code duplicated, block: B:398:0x06a7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:402:0x06b2  */
        /* JADX WARN: Code duplicated, block: B:405:0x06ba  */
        /* JADX WARN: Code duplicated, block: B:406:0x06bf  */
        /* JADX WARN: Code duplicated, block: B:408:0x06c2  */
        /* JADX WARN: Code duplicated, block: B:429:0x070d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v103 */
        /* JADX WARN: Type inference failed for: r0v104 */
        /* JADX WARN: Type inference failed for: r0v105 */
        /* JADX WARN: Type inference failed for: r0v108 */
        /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v111 */
        /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v114 */
        /* JADX WARN: Type inference failed for: r0v122 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r8v3 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            boolean z4;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            Object bVar;
            int i7;
            int i8;
            int i9;
            Integer num;
            boolean z5;
            ?? r8;
            boolean z6;
            boolean z7;
            int i10;
            char c;
            Integer orderType;
            ResourceUiText resourceUiText;
            Integer combinationSize;
            RealBetHistoryOrderEntity realBetHistoryOrderEntity;
            StringUiText stringUiText;
            boolean z8;
            Integer orderType2;
            Integer minToWin;
            t640.d bVar2;
            Integer numValueOf;
            Integer numValueOf2;
            Integer winningStatus;
            UiText resourceUiText2;
            ResourceUiText resourceUiText3;
            UiText resourceUiText4;
            StringUiText stringUiText2;
            Boolean oddsBoosted;
            boolean zBooleanValue;
            Boolean lfbOddsBoosted;
            boolean zBooleanValue2;
            UiText uiTextA;
            List<RSelection> selections;
            UiText uiText;
            UiText uiText2;
            ResourceUiText resourceUiText5;
            Integer winningStatus2;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            Boolean hasPendingEvent;
            boolean zBooleanValue3;
            ResourceUiText resourceUiText6;
            String str;
            String str2;
            List<String> betIds;
            Integer numValueOf3;
            Integer num2;
            Integer winningStatus3;
            Boolean boolValueOf;
            ?? r0;
            ?? r1;
            boolean zBooleanValue4;
            List<Integer> featureTags;
            boolean z13;
            a740 a740Var = (a740) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            RealBetHistoryOrderEntity realBetHistoryOrderEntity2 = a740Var.a;
            Long l = a740Var.b;
            StringUiText stringUiTextD = vch0.d(this.b.e.f());
            List<Integer> featureTags2 = realBetHistoryOrderEntity2.getFeatureTags();
            int i11 = 5;
            if (featureTags2 != null) {
                if (!featureTags2.isEmpty()) {
                    Iterator it = featureTags2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = false;
                            break;
                        }
                        if (((Number) it.next()).intValue() == 5) {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    z13 = false;
                    break;
                }
                z = z13;
            } else {
                z = false;
            }
            Integer orderType3 = realBetHistoryOrderEntity2.getOrderType();
            if (orderType3 != null && orderType3.intValue() == 2 && (featureTags = realBetHistoryOrderEntity2.getFeatureTags()) != null && !featureTags.isEmpty()) {
                Iterator it2 = featureTags.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((Number) it2.next()).intValue() == 6) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            List<RSelection> selections2 = realBetHistoryOrderEntity2.getSelections();
            if (selections2 != null && selections2.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it3 = selections2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((RSelection) it3.next()).settleType == 1) {
                    z3 = true;
                    break;
                }
            }
            List<RSelection> selections3 = realBetHistoryOrderEntity2.getSelections();
            if (selections3 == null || !selections3.isEmpty()) {
                Iterator it4 = selections3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i = 0;
                        z4 = true;
                        break;
                    }
                    i = 0;
                    if (((RSelection) it4.next()).settleType != 1) {
                        z4 = false;
                        break;
                    }
                }
            } else {
                z4 = true;
                i = 0;
            }
            List<RSelection> selections4 = realBetHistoryOrderEntity2.getSelections();
            if (selections4 != null && selections4.isEmpty()) {
                i2 = i;
                break;
            }
            Iterator it5 = selections4.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    i2 = i;
                    break;
                }
                if (((RSelection) it5.next()).settleType == 2) {
                    i2 = 1;
                    break;
                }
            }
            List<RSelection> selections5 = realBetHistoryOrderEntity2.getSelections();
            if (selections5 != null && selections5.isEmpty()) {
                i3 = i11;
                i4 = 1;
                break;
            }
            Iterator it6 = selections5.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    i3 = i11;
                    i4 = 1;
                    break;
                }
                i3 = i11;
                if (((RSelection) it6.next()).settleType != 2) {
                    i4 = i;
                    break;
                }
                i11 = i3;
            }
            List<RSelection> selections6 = realBetHistoryOrderEntity2.getSelections();
            if (selections6 != null && selections6.isEmpty()) {
                i5 = i;
                i6 = 1;
                break;
            }
            Iterator it7 = selections6.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    i5 = i;
                    i6 = 1;
                    break;
                }
                if (((RSelection) it7.next()).joker != null) {
                    i5 = 1;
                    i6 = 1;
                    break;
                }
            }
            try {
                zi50.a aVar = zi50.b;
                Integer orderType4 = realBetHistoryOrderEntity2.getOrderType();
                if (orderType4 != null && orderType4.intValue() == 4 && (winningStatus3 = realBetHistoryOrderEntity2.getWinningStatus()) != null && winningStatus3.intValue() == 20) {
                    String totalWinnings = realBetHistoryOrderEntity2.getTotalWinnings();
                    String totalStake = realBetHistoryOrderEntity2.getTotalStake();
                    if (totalWinnings == null || totalStake == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf((boolean) (Double.parseDouble(totalWinnings) < Double.parseDouble(totalStake) ? i6 : i));
                    }
                    if (boolValueOf != null) {
                        zBooleanValue4 = boolValueOf.booleanValue();
                    } else {
                        r0 = i;
                    }
                    if (r0 != 0) {
                        r0 = zBooleanValue4;
                        r1 = i6;
                    } else {
                        r0 = zBooleanValue4;
                        r1 = i;
                    }
                } else {
                    r0 = zBooleanValue4;
                    r1 = i;
                }
                bVar = Boolean.valueOf((boolean) r1);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bVar = Boolean.FALSE;
            }
            boolean zBooleanValue5 = ((Boolean) bVar).booleanValue();
            List<RSelection> selections7 = realBetHistoryOrderEntity2.getSelections();
            if (selections7 != null && selections7.isEmpty()) {
                i7 = i6;
                break;
            }
            Iterator it8 = selections7.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    i7 = i6;
                    break;
                }
                if (((RSelection) it8.next()).status == 0) {
                    i7 = i;
                    break;
                }
            }
            int i12 = (!realBetHistoryOrderEntity2.getRemixBetEnabled() || Intrinsics.g(realBetHistoryOrderEntity2.isEditable(), Boolean.TRUE) || i7 == 0 || !CollectionsKt.M(ay0.V(new Integer[]{20, 30, 40}), realBetHistoryOrderEntity2.getWinningStatus())) ? i : i6;
            Integer numValueOf4 = realBetHistoryOrderEntity2.isPaymentInProgress() ? Integer.valueOf(i) : realBetHistoryOrderEntity2.getWinningStatus();
            if (numValueOf4 != null) {
                i8 = i2;
                if (numValueOf4.intValue() == 20) {
                    i9 = R.color.text_type2_primary;
                }
                int i13 = i12;
                String orderId = realBetHistoryOrderEntity2.getOrderId();
                List<String> betIds2 = realBetHistoryOrderEntity2.getBetIds();
                num = numValueOf4;
                Long createTime = realBetHistoryOrderEntity2.getCreateTime();
                String userNote = realBetHistoryOrderEntity2.getUserNote();
                if (realBetHistoryOrderEntity2.getWinningStatus() != null) {
                    z5 = zBooleanValue5;
                    if (ay0.V(new Integer[]{Integer.valueOf(i3), 20, 30, 40}).contains(realBetHistoryOrderEntity2.getWinningStatus())) {
                        r8 = i6;
                    }
                    boolean z14 = !realBetHistoryOrderEntity2.isBulkDeletePerforming();
                    z6 = z4;
                    boolean zIsBulkDeletePerforming = realBetHistoryOrderEntity2.isBulkDeletePerforming();
                    z7 = z;
                    boolean zIsSelectedForBulkDelete = realBetHistoryOrderEntity2.isSelectedForBulkDelete();
                    if (num == null) {
                        i10 = i9;
                        if (num.intValue() == 20) {
                            c = 210;
                        }
                        orderType = realBetHistoryOrderEntity2.getOrderType();
                        char c2 = c;
                        if (orderType != null && orderType.intValue() == i6) {
                            resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                        } else if (orderType == 0 && orderType.intValue() == 3) {
                            resourceUiText = new ResourceUiText(R.string.common_functions__system);
                        } else {
                            resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                        }
                        combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                        if (combinationSize != null) {
                            num2 = combinationSize;
                            realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                            if (num2.intValue() <= 1) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                            }
                            z8 = z3;
                            ColoredUiText coloredUiText = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                            orderType2 = realBetHistoryOrderEntity.getOrderType();
                            if (orderType2 == null && orderType2.intValue() == 4) {
                                minToWin = realBetHistoryOrderEntity.getMinToWin();
                                Integer selectionSize = realBetHistoryOrderEntity.getSelectionSize();
                                if (minToWin != null || selectionSize == null) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = new t640.d.b(new ColoredUiText(new ResourceUiText(R.string.cashout__flexi_label_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(minToWin.intValue()), String.valueOf(selectionSize.intValue())})), Integer.valueOf(i10), null));
                                }
                                if (bVar2 == null) {
                                    bVar2 = t640.d.c.a;
                                }
                            } else {
                                z8 = z8;
                                if (z2) {
                                    bVar2 = t640.d.a.a;
                                } else if (z7) {
                                    bVar2 = t640.d.C1115d.a;
                                } else {
                                    bVar2 = t640.d.c.a;
                                }
                            }
                            if (num == null && num.intValue() == 20) {
                                if (z8) {
                                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                                } else if (i8 != 0) {
                                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                                } else if (z5) {
                                    numValueOf = null;
                                } else if (i5 != 0) {
                                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                                }
                            } else if (num == null && num.intValue() == 90) {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            } else {
                                numValueOf = null;
                            }
                            if (num == null && num.intValue() == 20 && !z8 && i8 == 0) {
                                numValueOf2 = Integer.valueOf(i10);
                            } else {
                                numValueOf2 = null;
                            }
                            if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                            } else {
                                winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus != null && winningStatus.intValue() == 0) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                                } else if (winningStatus != null && winningStatus.intValue() == i3) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                                } else if (winningStatus != null && winningStatus.intValue() == 20) {
                                    if (z6) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                    } else if (i4 != 0) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                    } else if (z5) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                    }
                                    resourceUiText2 = resourceUiText3;
                                } else if (winningStatus != null && winningStatus.intValue() == 30) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                                } else if (winningStatus != null && winningStatus.intValue() == 40) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                                } else if (winningStatus == null && winningStatus.intValue() == 90) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                                } else {
                                    resourceUiText2 = vch0.a;
                                }
                            }
                            ColoredUiText coloredUiTextF = vch0.f(resourceUiText2, Integer.valueOf(i10));
                            String totalStake2 = realBetHistoryOrderEntity.getTotalStake();
                            Locale locale = Locale.US;
                            StringUiText stringUiText3 = new StringUiText(bjb0.P(totalStake2, locale));
                            if (z7 || num == null || num.intValue() != 20) {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            } else {
                                List<RSelection> selections8 = realBetHistoryOrderEntity.getSelections();
                                Integer numValueOf5 = selections8 != null ? Integer.valueOf(selections8.size()) : null;
                                if (numValueOf5 != null) {
                                    numValueOf3 = Integer.valueOf(Intrinsics.g(realBetHistoryOrderEntity.isOneCutWin(), Boolean.TRUE) ? numValueOf5.intValue() - 1 : numValueOf5.intValue());
                                } else {
                                    numValueOf3 = null;
                                }
                                Integer num3 = numValueOf3;
                                ResourceUiText resourceUiText7 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                                UiText resourceUiText8 = (numValueOf5 == null || num3 == null) ? null : new ResourceUiText(R.string.component_betslip__vselection_of_vthreshold, ay0.S(new Object[]{String.valueOf(numValueOf5), String.valueOf(num3)}));
                                if (resourceUiText8 == null) {
                                    resourceUiText8 = vch0.a;
                                }
                                resourceUiText4 = resourceUiText7.h(resourceUiText8);
                            }
                            if ((num != null || num.intValue() != 5) && ((num == null || num.intValue() != 20) && (num == null || num.intValue() != 40))) {
                                stringUiText2 = (num != null && num.intValue() == 30) ? new StringUiText("0.0") : new StringUiText("--");
                            }
                            ColoredUiText coloredUiText2 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                            oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                            if (oddsBoosted != null) {
                                zBooleanValue = oddsBoosted.booleanValue();
                            } else {
                                zBooleanValue = i;
                            }
                            lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                            if (lfbOddsBoosted != null) {
                                zBooleanValue2 = lfbOddsBoosted.booleanValue();
                            } else {
                                zBooleanValue2 = i;
                            }
                            boolean z15 = zBooleanValue;
                            UiText uiTextA2 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                            UiText uiTextA3 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                            uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                            selections = realBetHistoryOrderEntity.getSelections();
                            if (selections == null) {
                                uiText = resourceUiText4;
                                uiText2 = uiTextA;
                                if (selections.size() <= 3) {
                                    if (selections.size() == 4) {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                    } else {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                    }
                                }
                                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus2 == null && winningStatus2.intValue() == 90) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE) || (betIds = realBetHistoryOrderEntity.getBetIds()) == null || betIds.isEmpty()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (r27 != 0 || realBetHistoryOrderEntity.isBulkDeletePerforming()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (realBetHistoryOrderEntity.getShowRemixBetRedDot() || i13 == 0 || realBetHistoryOrderEntity.isBulkDeletePerforming()) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                                if (hasPendingEvent != null) {
                                    zBooleanValue3 = hasPendingEvent.booleanValue();
                                } else {
                                    zBooleanValue3 = false;
                                }
                                if (r27 == 0 && !realBetHistoryOrderEntity.isBulkDeletePerforming()) {
                                    Integer winningStatus4 = realBetHistoryOrderEntity.getWinningStatus();
                                    if (winningStatus4 != null) {
                                        resourceUiText6 = resourceUiText5;
                                        if (winningStatus4.intValue() == 20) {
                                            str2 = AnalyticsParam.BET_HISTORY__WON_REMIX_BET_BTN;
                                        }
                                        str = str2;
                                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText, bVar2, numValueOf, numValueOf2, coloredUiTextF, stringUiTextD, stringUiText3, uiText, coloredUiText2, z15, zBooleanValue2, uiTextA2, uiTextA3, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                                    }
                                    resourceUiText6 = resourceUiText5;
                                    if (winningStatus4 == null || winningStatus4.intValue() != 40) {
                                        if (winningStatus4 != null && winningStatus4.intValue() == 30) {
                                            str2 = AnalyticsParam.BET_HISTORY__LOST_REMIX_BET_BTN;
                                        }
                                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText, bVar2, numValueOf, numValueOf2, coloredUiTextF, stringUiTextD, stringUiText3, uiText, coloredUiText2, z15, zBooleanValue2, uiTextA2, uiTextA3, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                                    }
                                    str2 = AnalyticsParam.BET_HISTORY__VOID_REMIX_BET_BTN;
                                    str = str2;
                                    return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText, bVar2, numValueOf, numValueOf2, coloredUiTextF, stringUiTextD, stringUiText3, uiText, coloredUiText2, z15, zBooleanValue2, uiTextA2, uiTextA3, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                                }
                                resourceUiText6 = resourceUiText5;
                                str = null;
                                return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText, bVar2, numValueOf, numValueOf2, coloredUiTextF, stringUiTextD, stringUiText3, uiText, coloredUiText2, z15, zBooleanValue2, uiTextA2, uiTextA3, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                            }
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            resourceUiText5 = null;
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText, bVar2, numValueOf, numValueOf2, coloredUiTextF, stringUiTextD, stringUiText3, uiText, coloredUiText2, z15, zBooleanValue2, uiTextA2, uiTextA3, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        stringUiText = vch0.a;
                        z8 = z3;
                        ColoredUiText coloredUiText3 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize2 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF2 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake3 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale2 = Locale.US;
                        StringUiText stringUiText4 = new StringUiText(bjb0.P(totalStake3, locale2));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        stringUiText2 = num != null ? new StringUiText(bjb0.P(realBetHistoryOrderEntity.getTotalWinnings(), locale2)) : new StringUiText(bjb0.P(realBetHistoryOrderEntity.getTotalWinnings(), locale2));
                        ColoredUiText coloredUiText4 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z16 = zBooleanValue;
                        UiText uiTextA4 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA5 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText3, bVar2, numValueOf, numValueOf2, coloredUiTextF2, stringUiTextD, stringUiText4, uiText, coloredUiText4, z16, zBooleanValue2, uiTextA4, uiTextA5, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c2, i10, coloredUiText3, bVar2, numValueOf, numValueOf2, coloredUiTextF2, stringUiTextD, stringUiText4, uiText, coloredUiText4, z16, zBooleanValue2, uiTextA4, uiTextA5, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    i10 = i9;
                    if (num == null && num.intValue() == 30) {
                        c = 2144;
                    } else {
                        c = 2145;
                    }
                    orderType = realBetHistoryOrderEntity2.getOrderType();
                    char c3 = c;
                    if (orderType != null) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                        combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                        if (combinationSize != null) {
                            num2 = combinationSize;
                            realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                            if (num2.intValue() <= 1) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                            }
                            z8 = z3;
                            ColoredUiText coloredUiText5 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                            orderType2 = realBetHistoryOrderEntity.getOrderType();
                            if (orderType2 == null) {
                                z8 = z8;
                                if (z2) {
                                    bVar2 = t640.d.a.a;
                                } else if (z7) {
                                    bVar2 = t640.d.C1115d.a;
                                } else {
                                    bVar2 = t640.d.c.a;
                                }
                            } else {
                                minToWin = realBetHistoryOrderEntity.getMinToWin();
                                Integer selectionSize3 = realBetHistoryOrderEntity.getSelectionSize();
                                if (minToWin != null) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = null;
                                }
                                if (bVar2 == null) {
                                    bVar2 = t640.d.c.a;
                                }
                            }
                            if (num == null) {
                                if (num == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                                }
                            } else if (z8) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                            } else if (i8 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                            } else if (z5) {
                                numValueOf = null;
                            } else if (i5 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                            }
                            if (num == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(i10);
                            }
                            if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                            } else {
                                winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                                } else if (winningStatus != null) {
                                    if (z6) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                    } else if (i4 != 0) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                    } else if (z5) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                    }
                                    resourceUiText2 = resourceUiText3;
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                                } else if (winningStatus == null) {
                                    resourceUiText2 = vch0.a;
                                } else {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                                }
                            }
                            ColoredUiText coloredUiTextF3 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                            String totalStake4 = realBetHistoryOrderEntity.getTotalStake();
                            Locale locale3 = Locale.US;
                            StringUiText stringUiText5 = new StringUiText(bjb0.P(totalStake4, locale3));
                            if (z7) {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            } else {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            }
                            if (num != null) {
                            }
                            ColoredUiText coloredUiText6 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                            oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                            if (oddsBoosted != null) {
                                zBooleanValue = oddsBoosted.booleanValue();
                            } else {
                                zBooleanValue = i;
                            }
                            lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                            if (lfbOddsBoosted != null) {
                                zBooleanValue2 = lfbOddsBoosted.booleanValue();
                            } else {
                                zBooleanValue2 = i;
                            }
                            boolean z17 = zBooleanValue;
                            UiText uiTextA6 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                            UiText uiTextA7 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                            uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                            selections = realBetHistoryOrderEntity.getSelections();
                            if (selections == null) {
                                uiText = resourceUiText4;
                                uiText2 = uiTextA;
                                if (selections.size() <= 3) {
                                    if (selections.size() == 4) {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                    } else {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                    }
                                }
                                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus2 == null) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (r27 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                                if (hasPendingEvent != null) {
                                    zBooleanValue3 = hasPendingEvent.booleanValue();
                                } else {
                                    zBooleanValue3 = false;
                                }
                                if (r27 == 0) {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                } else {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                }
                                return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText5, bVar2, numValueOf, numValueOf2, coloredUiTextF3, stringUiTextD, stringUiText5, uiText, coloredUiText6, z17, zBooleanValue2, uiTextA6, uiTextA7, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                            }
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            resourceUiText5 = null;
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText5, bVar2, numValueOf, numValueOf2, coloredUiTextF3, stringUiTextD, stringUiText5, uiText, coloredUiText6, z17, zBooleanValue2, uiTextA6, uiTextA7, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        stringUiText = vch0.a;
                        z8 = z3;
                        ColoredUiText coloredUiText7 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize4 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF4 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake5 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale4 = Locale.US;
                        StringUiText stringUiText6 = new StringUiText(bjb0.P(totalStake5, locale4));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText8 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z18 = zBooleanValue;
                        UiText uiTextA8 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA9 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText7, bVar2, numValueOf, numValueOf2, coloredUiTextF4, stringUiTextD, stringUiText6, uiText, coloredUiText8, z18, zBooleanValue2, uiTextA8, uiTextA9, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText7, bVar2, numValueOf, numValueOf2, coloredUiTextF4, stringUiTextD, stringUiText6, uiText, coloredUiText8, z18, zBooleanValue2, uiTextA8, uiTextA9, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    if (orderType == 0) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                    } else {
                        resourceUiText = new ResourceUiText(R.string.common_functions__system);
                    }
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText9 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize5 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF5 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake6 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale5 = Locale.US;
                        StringUiText stringUiText7 = new StringUiText(bjb0.P(totalStake6, locale5));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText10 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z19 = zBooleanValue;
                        UiText uiTextA10 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA11 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText9, bVar2, numValueOf, numValueOf2, coloredUiTextF5, stringUiTextD, stringUiText7, uiText, coloredUiText10, z19, zBooleanValue2, uiTextA10, uiTextA11, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText9, bVar2, numValueOf, numValueOf2, coloredUiTextF5, stringUiTextD, stringUiText7, uiText, coloredUiText10, z19, zBooleanValue2, uiTextA10, uiTextA11, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText11 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize6 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF6 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake7 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale6 = Locale.US;
                    StringUiText stringUiText8 = new StringUiText(bjb0.P(totalStake7, locale6));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText12 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z110 = zBooleanValue;
                    UiText uiTextA12 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA13 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText11, bVar2, numValueOf, numValueOf2, coloredUiTextF6, stringUiTextD, stringUiText8, uiText, coloredUiText12, z110, zBooleanValue2, uiTextA12, uiTextA13, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId, betIds2, createTime, l, r8, z14, userNote, zIsBulkDeletePerforming, zIsSelectedForBulkDelete, c3, i10, coloredUiText11, bVar2, numValueOf, numValueOf2, coloredUiTextF6, stringUiTextD, stringUiText8, uiText, coloredUiText12, z110, zBooleanValue2, uiTextA12, uiTextA13, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                z5 = zBooleanValue5;
                r8 = i;
                boolean z111 = !realBetHistoryOrderEntity2.isBulkDeletePerforming();
                z6 = z4;
                boolean zIsBulkDeletePerforming2 = realBetHistoryOrderEntity2.isBulkDeletePerforming();
                z7 = z;
                boolean zIsSelectedForBulkDelete2 = realBetHistoryOrderEntity2.isSelectedForBulkDelete();
                if (num == null) {
                    i10 = i9;
                    if (num.intValue() == 20) {
                        c = 210;
                    }
                    orderType = realBetHistoryOrderEntity2.getOrderType();
                    char c4 = c;
                    if (orderType != null) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                        combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                        if (combinationSize != null) {
                            num2 = combinationSize;
                            realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                            if (num2.intValue() <= 1) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                            }
                            z8 = z3;
                            ColoredUiText coloredUiText13 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                            orderType2 = realBetHistoryOrderEntity.getOrderType();
                            if (orderType2 == null) {
                                z8 = z8;
                                if (z2) {
                                    bVar2 = t640.d.a.a;
                                } else if (z7) {
                                    bVar2 = t640.d.C1115d.a;
                                } else {
                                    bVar2 = t640.d.c.a;
                                }
                            } else {
                                minToWin = realBetHistoryOrderEntity.getMinToWin();
                                Integer selectionSize7 = realBetHistoryOrderEntity.getSelectionSize();
                                if (minToWin != null) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = null;
                                }
                                if (bVar2 == null) {
                                    bVar2 = t640.d.c.a;
                                }
                            }
                            if (num == null) {
                                if (num == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                                }
                            } else if (z8) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                            } else if (i8 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                            } else if (z5) {
                                numValueOf = null;
                            } else if (i5 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                            }
                            if (num == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(i10);
                            }
                            if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                            } else {
                                winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                                } else if (winningStatus != null) {
                                    if (z6) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                    } else if (i4 != 0) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                    } else if (z5) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                    }
                                    resourceUiText2 = resourceUiText3;
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                                } else if (winningStatus == null) {
                                    resourceUiText2 = vch0.a;
                                } else {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                                }
                            }
                            ColoredUiText coloredUiTextF7 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                            String totalStake8 = realBetHistoryOrderEntity.getTotalStake();
                            Locale locale7 = Locale.US;
                            StringUiText stringUiText9 = new StringUiText(bjb0.P(totalStake8, locale7));
                            if (z7) {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            } else {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            }
                            if (num != null) {
                            }
                            ColoredUiText coloredUiText14 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                            oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                            if (oddsBoosted != null) {
                                zBooleanValue = oddsBoosted.booleanValue();
                            } else {
                                zBooleanValue = i;
                            }
                            lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                            if (lfbOddsBoosted != null) {
                                zBooleanValue2 = lfbOddsBoosted.booleanValue();
                            } else {
                                zBooleanValue2 = i;
                            }
                            boolean z112 = zBooleanValue;
                            UiText uiTextA14 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                            UiText uiTextA15 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                            uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                            selections = realBetHistoryOrderEntity.getSelections();
                            if (selections == null) {
                                uiText = resourceUiText4;
                                uiText2 = uiTextA;
                                if (selections.size() <= 3) {
                                    if (selections.size() == 4) {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                    } else {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                    }
                                }
                                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus2 == null) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (r27 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                                if (hasPendingEvent != null) {
                                    zBooleanValue3 = hasPendingEvent.booleanValue();
                                } else {
                                    zBooleanValue3 = false;
                                }
                                if (r27 == 0) {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                } else {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                }
                                return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText13, bVar2, numValueOf, numValueOf2, coloredUiTextF7, stringUiTextD, stringUiText9, uiText, coloredUiText14, z112, zBooleanValue2, uiTextA14, uiTextA15, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                            }
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            resourceUiText5 = null;
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText13, bVar2, numValueOf, numValueOf2, coloredUiTextF7, stringUiTextD, stringUiText9, uiText, coloredUiText14, z112, zBooleanValue2, uiTextA14, uiTextA15, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        stringUiText = vch0.a;
                        z8 = z3;
                        ColoredUiText coloredUiText15 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize8 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF8 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake9 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale8 = Locale.US;
                        StringUiText stringUiText10 = new StringUiText(bjb0.P(totalStake9, locale8));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText16 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z113 = zBooleanValue;
                        UiText uiTextA16 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA17 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText15, bVar2, numValueOf, numValueOf2, coloredUiTextF8, stringUiTextD, stringUiText10, uiText, coloredUiText16, z113, zBooleanValue2, uiTextA16, uiTextA17, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText15, bVar2, numValueOf, numValueOf2, coloredUiTextF8, stringUiTextD, stringUiText10, uiText, coloredUiText16, z113, zBooleanValue2, uiTextA16, uiTextA17, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    if (orderType == 0) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                    } else {
                        resourceUiText = new ResourceUiText(R.string.common_functions__system);
                    }
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText17 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize9 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF9 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake10 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale9 = Locale.US;
                        StringUiText stringUiText11 = new StringUiText(bjb0.P(totalStake10, locale9));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText18 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z114 = zBooleanValue;
                        UiText uiTextA18 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA19 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText17, bVar2, numValueOf, numValueOf2, coloredUiTextF9, stringUiTextD, stringUiText11, uiText, coloredUiText18, z114, zBooleanValue2, uiTextA18, uiTextA19, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText17, bVar2, numValueOf, numValueOf2, coloredUiTextF9, stringUiTextD, stringUiText11, uiText, coloredUiText18, z114, zBooleanValue2, uiTextA18, uiTextA19, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText19 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize10 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF10 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake11 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale10 = Locale.US;
                    StringUiText stringUiText12 = new StringUiText(bjb0.P(totalStake11, locale10));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText110 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z115 = zBooleanValue;
                    UiText uiTextA110 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA111 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText19, bVar2, numValueOf, numValueOf2, coloredUiTextF10, stringUiTextD, stringUiText12, uiText, coloredUiText110, z115, zBooleanValue2, uiTextA110, uiTextA111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c4, i10, coloredUiText19, bVar2, numValueOf, numValueOf2, coloredUiTextF10, stringUiTextD, stringUiText12, uiText, coloredUiText110, z115, zBooleanValue2, uiTextA110, uiTextA111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                i10 = i9;
                if (num == null) {
                    c = 2145;
                } else {
                    c = 2144;
                }
                orderType = realBetHistoryOrderEntity2.getOrderType();
                char c5 = c;
                if (orderType != null) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText111 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize11 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF11 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake12 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale11 = Locale.US;
                        StringUiText stringUiText13 = new StringUiText(bjb0.P(totalStake12, locale11));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText112 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z116 = zBooleanValue;
                        UiText uiTextA112 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA113 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText111, bVar2, numValueOf, numValueOf2, coloredUiTextF11, stringUiTextD, stringUiText13, uiText, coloredUiText112, z116, zBooleanValue2, uiTextA112, uiTextA113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText111, bVar2, numValueOf, numValueOf2, coloredUiTextF11, stringUiTextD, stringUiText13, uiText, coloredUiText112, z116, zBooleanValue2, uiTextA112, uiTextA113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText113 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize12 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF12 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake13 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale12 = Locale.US;
                    StringUiText stringUiText14 = new StringUiText(bjb0.P(totalStake13, locale12));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText114 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z117 = zBooleanValue;
                    UiText uiTextA114 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA115 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText113, bVar2, numValueOf, numValueOf2, coloredUiTextF12, stringUiTextD, stringUiText14, uiText, coloredUiText114, z117, zBooleanValue2, uiTextA114, uiTextA115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText113, bVar2, numValueOf, numValueOf2, coloredUiTextF12, stringUiTextD, stringUiText14, uiText, coloredUiText114, z117, zBooleanValue2, uiTextA114, uiTextA115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                if (orderType == 0) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                } else {
                    resourceUiText = new ResourceUiText(R.string.common_functions__system);
                }
                combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                if (combinationSize != null) {
                    num2 = combinationSize;
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    if (num2.intValue() <= 1) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                    }
                    z8 = z3;
                    ColoredUiText coloredUiText115 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize13 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF13 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake14 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale13 = Locale.US;
                    StringUiText stringUiText15 = new StringUiText(bjb0.P(totalStake14, locale13));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText116 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z118 = zBooleanValue;
                    UiText uiTextA116 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA117 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText115, bVar2, numValueOf, numValueOf2, coloredUiTextF13, stringUiTextD, stringUiText15, uiText, coloredUiText116, z118, zBooleanValue2, uiTextA116, uiTextA117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText115, bVar2, numValueOf, numValueOf2, coloredUiTextF13, stringUiTextD, stringUiText15, uiText, coloredUiText116, z118, zBooleanValue2, uiTextA116, uiTextA117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                stringUiText = vch0.a;
                z8 = z3;
                ColoredUiText coloredUiText117 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                orderType2 = realBetHistoryOrderEntity.getOrderType();
                if (orderType2 == null) {
                    z8 = z8;
                    if (z2) {
                        bVar2 = t640.d.a.a;
                    } else if (z7) {
                        bVar2 = t640.d.C1115d.a;
                    } else {
                        bVar2 = t640.d.c.a;
                    }
                } else {
                    minToWin = realBetHistoryOrderEntity.getMinToWin();
                    Integer selectionSize14 = realBetHistoryOrderEntity.getSelectionSize();
                    if (minToWin != null) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = t640.d.c.a;
                    }
                }
                if (num == null) {
                    if (num == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                    }
                } else if (z8) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                } else if (i8 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                } else if (z5) {
                    numValueOf = null;
                } else if (i5 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                }
                if (num == null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(i10);
                }
                if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                } else {
                    winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                    } else if (winningStatus != null) {
                        if (z6) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                        } else if (i4 != 0) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                        } else if (z5) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                        }
                        resourceUiText2 = resourceUiText3;
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                    } else if (winningStatus == null) {
                        resourceUiText2 = vch0.a;
                    } else {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                    }
                }
                ColoredUiText coloredUiTextF14 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                String totalStake15 = realBetHistoryOrderEntity.getTotalStake();
                Locale locale14 = Locale.US;
                StringUiText stringUiText16 = new StringUiText(bjb0.P(totalStake15, locale14));
                if (z7) {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                } else {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                }
                if (num != null) {
                }
                ColoredUiText coloredUiText118 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                if (oddsBoosted != null) {
                    zBooleanValue = oddsBoosted.booleanValue();
                } else {
                    zBooleanValue = i;
                }
                lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                if (lfbOddsBoosted != null) {
                    zBooleanValue2 = lfbOddsBoosted.booleanValue();
                } else {
                    zBooleanValue2 = i;
                }
                boolean z119 = zBooleanValue;
                UiText uiTextA118 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                UiText uiTextA119 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                selections = realBetHistoryOrderEntity.getSelections();
                if (selections == null) {
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    if (selections.size() <= 3) {
                        if (selections.size() == 4) {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                        } else {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                        }
                    }
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText117, bVar2, numValueOf, numValueOf2, coloredUiTextF14, stringUiTextD, stringUiText16, uiText, coloredUiText118, z119, zBooleanValue2, uiTextA118, uiTextA119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                resourceUiText5 = null;
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId, betIds2, createTime, l, r8, z111, userNote, zIsBulkDeletePerforming2, zIsSelectedForBulkDelete2, c5, i10, coloredUiText117, bVar2, numValueOf, numValueOf2, coloredUiTextF14, stringUiTextD, stringUiText16, uiText, coloredUiText118, z119, zBooleanValue2, uiTextA118, uiTextA119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            i8 = i2;
            if (numValueOf4 != null && numValueOf4.intValue() == 30) {
                i9 = R.color.text_type2_primary;
            } else {
                i9 = R.color.history_item_title_text;
            }
            int i14 = i12;
            String orderId2 = realBetHistoryOrderEntity2.getOrderId();
            List<String> betIds3 = realBetHistoryOrderEntity2.getBetIds();
            num = numValueOf4;
            Long createTime2 = realBetHistoryOrderEntity2.getCreateTime();
            String userNote2 = realBetHistoryOrderEntity2.getUserNote();
            if (realBetHistoryOrderEntity2.getWinningStatus() != null) {
                z5 = zBooleanValue5;
                if (ay0.V(new Integer[]{Integer.valueOf(i3), 20, 30, 40}).contains(realBetHistoryOrderEntity2.getWinningStatus())) {
                    r8 = i6;
                }
                boolean z1110 = !realBetHistoryOrderEntity2.isBulkDeletePerforming();
                z6 = z4;
                boolean zIsBulkDeletePerforming3 = realBetHistoryOrderEntity2.isBulkDeletePerforming();
                z7 = z;
                boolean zIsSelectedForBulkDelete3 = realBetHistoryOrderEntity2.isSelectedForBulkDelete();
                if (num == null) {
                    i10 = i9;
                    if (num.intValue() == 20) {
                        c = 210;
                    }
                    orderType = realBetHistoryOrderEntity2.getOrderType();
                    char c6 = c;
                    if (orderType != null) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                        combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                        if (combinationSize != null) {
                            num2 = combinationSize;
                            realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                            if (num2.intValue() <= 1) {
                                num2 = null;
                            }
                            if (num2 != null) {
                                stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                            }
                            z8 = z3;
                            ColoredUiText coloredUiText119 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                            orderType2 = realBetHistoryOrderEntity.getOrderType();
                            if (orderType2 == null) {
                                z8 = z8;
                                if (z2) {
                                    bVar2 = t640.d.a.a;
                                } else if (z7) {
                                    bVar2 = t640.d.C1115d.a;
                                } else {
                                    bVar2 = t640.d.c.a;
                                }
                            } else {
                                minToWin = realBetHistoryOrderEntity.getMinToWin();
                                Integer selectionSize15 = realBetHistoryOrderEntity.getSelectionSize();
                                if (minToWin != null) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = null;
                                }
                                if (bVar2 == null) {
                                    bVar2 = t640.d.c.a;
                                }
                            }
                            if (num == null) {
                                if (num == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                                }
                            } else if (z8) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                            } else if (i8 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                            } else if (z5) {
                                numValueOf = null;
                            } else if (i5 != 0) {
                                numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                            }
                            if (num == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(i10);
                            }
                            if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                            } else {
                                winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                                } else if (winningStatus != null) {
                                    if (z6) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                    } else if (i4 != 0) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                    } else if (z5) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                    }
                                    resourceUiText2 = resourceUiText3;
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                                } else if (winningStatus != null) {
                                    resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                                } else if (winningStatus == null) {
                                    resourceUiText2 = vch0.a;
                                } else {
                                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                                }
                            }
                            ColoredUiText coloredUiTextF15 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                            String totalStake16 = realBetHistoryOrderEntity.getTotalStake();
                            Locale locale15 = Locale.US;
                            StringUiText stringUiText17 = new StringUiText(bjb0.P(totalStake16, locale15));
                            if (z7) {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            } else {
                                numValueOf = numValueOf;
                                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                            }
                            if (num != null) {
                            }
                            ColoredUiText coloredUiText1110 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                            oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                            if (oddsBoosted != null) {
                                zBooleanValue = oddsBoosted.booleanValue();
                            } else {
                                zBooleanValue = i;
                            }
                            lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                            if (lfbOddsBoosted != null) {
                                zBooleanValue2 = lfbOddsBoosted.booleanValue();
                            } else {
                                zBooleanValue2 = i;
                            }
                            boolean z1111 = zBooleanValue;
                            UiText uiTextA1110 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                            UiText uiTextA1111 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                            uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                            selections = realBetHistoryOrderEntity.getSelections();
                            if (selections == null) {
                                uiText = resourceUiText4;
                                uiText2 = uiTextA;
                                if (selections.size() <= 3) {
                                    if (selections.size() == 4) {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                    } else {
                                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                    }
                                }
                                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                                if (winningStatus2 == null) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (r27 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                                if (hasPendingEvent != null) {
                                    zBooleanValue3 = hasPendingEvent.booleanValue();
                                } else {
                                    zBooleanValue3 = false;
                                }
                                if (r27 == 0) {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                } else {
                                    resourceUiText6 = resourceUiText5;
                                    str = null;
                                }
                                return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText119, bVar2, numValueOf, numValueOf2, coloredUiTextF15, stringUiTextD, stringUiText17, uiText, coloredUiText1110, z1111, zBooleanValue2, uiTextA1110, uiTextA1111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                            }
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            resourceUiText5 = null;
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText119, bVar2, numValueOf, numValueOf2, coloredUiTextF15, stringUiTextD, stringUiText17, uiText, coloredUiText1110, z1111, zBooleanValue2, uiTextA1110, uiTextA1111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        stringUiText = vch0.a;
                        z8 = z3;
                        ColoredUiText coloredUiText1111 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize16 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF16 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake17 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale16 = Locale.US;
                        StringUiText stringUiText18 = new StringUiText(bjb0.P(totalStake17, locale16));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText1112 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z1112 = zBooleanValue;
                        UiText uiTextA1112 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA1113 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1111, bVar2, numValueOf, numValueOf2, coloredUiTextF16, stringUiTextD, stringUiText18, uiText, coloredUiText1112, z1112, zBooleanValue2, uiTextA1112, uiTextA1113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1111, bVar2, numValueOf, numValueOf2, coloredUiTextF16, stringUiTextD, stringUiText18, uiText, coloredUiText1112, z1112, zBooleanValue2, uiTextA1112, uiTextA1113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    if (orderType == 0) {
                        resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                    } else {
                        resourceUiText = new ResourceUiText(R.string.common_functions__system);
                    }
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText1113 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize17 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF17 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake18 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale17 = Locale.US;
                        StringUiText stringUiText19 = new StringUiText(bjb0.P(totalStake18, locale17));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText1114 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z1113 = zBooleanValue;
                        UiText uiTextA1114 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA1115 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1113, bVar2, numValueOf, numValueOf2, coloredUiTextF17, stringUiTextD, stringUiText19, uiText, coloredUiText1114, z1113, zBooleanValue2, uiTextA1114, uiTextA1115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1113, bVar2, numValueOf, numValueOf2, coloredUiTextF17, stringUiTextD, stringUiText19, uiText, coloredUiText1114, z1113, zBooleanValue2, uiTextA1114, uiTextA1115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText1115 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize18 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF18 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake19 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale18 = Locale.US;
                    StringUiText stringUiText110 = new StringUiText(bjb0.P(totalStake19, locale18));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText1116 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z1114 = zBooleanValue;
                    UiText uiTextA1116 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA1117 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1115, bVar2, numValueOf, numValueOf2, coloredUiTextF18, stringUiTextD, stringUiText110, uiText, coloredUiText1116, z1114, zBooleanValue2, uiTextA1116, uiTextA1117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c6, i10, coloredUiText1115, bVar2, numValueOf, numValueOf2, coloredUiTextF18, stringUiTextD, stringUiText110, uiText, coloredUiText1116, z1114, zBooleanValue2, uiTextA1116, uiTextA1117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                i10 = i9;
                if (num == null) {
                    c = 2145;
                } else {
                    c = 2144;
                }
                orderType = realBetHistoryOrderEntity2.getOrderType();
                char c7 = c;
                if (orderType != null) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText1117 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize19 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF19 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake110 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale19 = Locale.US;
                        StringUiText stringUiText111 = new StringUiText(bjb0.P(totalStake110, locale19));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText1118 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z1115 = zBooleanValue;
                        UiText uiTextA1118 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA1119 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText1117, bVar2, numValueOf, numValueOf2, coloredUiTextF19, stringUiTextD, stringUiText111, uiText, coloredUiText1118, z1115, zBooleanValue2, uiTextA1118, uiTextA1119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText1117, bVar2, numValueOf, numValueOf2, coloredUiTextF19, stringUiTextD, stringUiText111, uiText, coloredUiText1118, z1115, zBooleanValue2, uiTextA1118, uiTextA1119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText1119 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize110 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF110 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake111 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale110 = Locale.US;
                    StringUiText stringUiText112 = new StringUiText(bjb0.P(totalStake111, locale110));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText11110 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z1116 = zBooleanValue;
                    UiText uiTextA11110 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA11111 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText1119, bVar2, numValueOf, numValueOf2, coloredUiTextF110, stringUiTextD, stringUiText112, uiText, coloredUiText11110, z1116, zBooleanValue2, uiTextA11110, uiTextA11111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText1119, bVar2, numValueOf, numValueOf2, coloredUiTextF110, stringUiTextD, stringUiText112, uiText, coloredUiText11110, z1116, zBooleanValue2, uiTextA11110, uiTextA11111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                if (orderType == 0) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                } else {
                    resourceUiText = new ResourceUiText(R.string.common_functions__system);
                }
                combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                if (combinationSize != null) {
                    num2 = combinationSize;
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    if (num2.intValue() <= 1) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                    }
                    z8 = z3;
                    ColoredUiText coloredUiText11111 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize111 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF111 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake112 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale111 = Locale.US;
                    StringUiText stringUiText113 = new StringUiText(bjb0.P(totalStake112, locale111));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText11112 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z1117 = zBooleanValue;
                    UiText uiTextA11112 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA11113 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText11111, bVar2, numValueOf, numValueOf2, coloredUiTextF111, stringUiTextD, stringUiText113, uiText, coloredUiText11112, z1117, zBooleanValue2, uiTextA11112, uiTextA11113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText11111, bVar2, numValueOf, numValueOf2, coloredUiTextF111, stringUiTextD, stringUiText113, uiText, coloredUiText11112, z1117, zBooleanValue2, uiTextA11112, uiTextA11113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                stringUiText = vch0.a;
                z8 = z3;
                ColoredUiText coloredUiText11113 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                orderType2 = realBetHistoryOrderEntity.getOrderType();
                if (orderType2 == null) {
                    z8 = z8;
                    if (z2) {
                        bVar2 = t640.d.a.a;
                    } else if (z7) {
                        bVar2 = t640.d.C1115d.a;
                    } else {
                        bVar2 = t640.d.c.a;
                    }
                } else {
                    minToWin = realBetHistoryOrderEntity.getMinToWin();
                    Integer selectionSize112 = realBetHistoryOrderEntity.getSelectionSize();
                    if (minToWin != null) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = t640.d.c.a;
                    }
                }
                if (num == null) {
                    if (num == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                    }
                } else if (z8) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                } else if (i8 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                } else if (z5) {
                    numValueOf = null;
                } else if (i5 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                }
                if (num == null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(i10);
                }
                if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                } else {
                    winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                    } else if (winningStatus != null) {
                        if (z6) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                        } else if (i4 != 0) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                        } else if (z5) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                        }
                        resourceUiText2 = resourceUiText3;
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                    } else if (winningStatus == null) {
                        resourceUiText2 = vch0.a;
                    } else {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                    }
                }
                ColoredUiText coloredUiTextF112 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                String totalStake113 = realBetHistoryOrderEntity.getTotalStake();
                Locale locale112 = Locale.US;
                StringUiText stringUiText114 = new StringUiText(bjb0.P(totalStake113, locale112));
                if (z7) {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                } else {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                }
                if (num != null) {
                }
                ColoredUiText coloredUiText11114 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                if (oddsBoosted != null) {
                    zBooleanValue = oddsBoosted.booleanValue();
                } else {
                    zBooleanValue = i;
                }
                lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                if (lfbOddsBoosted != null) {
                    zBooleanValue2 = lfbOddsBoosted.booleanValue();
                } else {
                    zBooleanValue2 = i;
                }
                boolean z1118 = zBooleanValue;
                UiText uiTextA11114 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                UiText uiTextA11115 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                selections = realBetHistoryOrderEntity.getSelections();
                if (selections == null) {
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    if (selections.size() <= 3) {
                        if (selections.size() == 4) {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                        } else {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                        }
                    }
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText11113, bVar2, numValueOf, numValueOf2, coloredUiTextF112, stringUiTextD, stringUiText114, uiText, coloredUiText11114, z1118, zBooleanValue2, uiTextA11114, uiTextA11115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                resourceUiText5 = null;
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId2, betIds3, createTime2, l, r8, z1110, userNote2, zIsBulkDeletePerforming3, zIsSelectedForBulkDelete3, c7, i10, coloredUiText11113, bVar2, numValueOf, numValueOf2, coloredUiTextF112, stringUiTextD, stringUiText114, uiText, coloredUiText11114, z1118, zBooleanValue2, uiTextA11114, uiTextA11115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            z5 = zBooleanValue5;
            r8 = i;
            boolean z1119 = !realBetHistoryOrderEntity2.isBulkDeletePerforming();
            z6 = z4;
            boolean zIsBulkDeletePerforming4 = realBetHistoryOrderEntity2.isBulkDeletePerforming();
            z7 = z;
            boolean zIsSelectedForBulkDelete4 = realBetHistoryOrderEntity2.isSelectedForBulkDelete();
            if (num == null) {
                i10 = i9;
                if (num.intValue() == 20) {
                    c = 210;
                }
                orderType = realBetHistoryOrderEntity2.getOrderType();
                char c8 = c;
                if (orderType != null) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                    combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                    if (combinationSize != null) {
                        num2 = combinationSize;
                        realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                        if (num2.intValue() <= 1) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                        }
                        z8 = z3;
                        ColoredUiText coloredUiText11115 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                        orderType2 = realBetHistoryOrderEntity.getOrderType();
                        if (orderType2 == null) {
                            z8 = z8;
                            if (z2) {
                                bVar2 = t640.d.a.a;
                            } else if (z7) {
                                bVar2 = t640.d.C1115d.a;
                            } else {
                                bVar2 = t640.d.c.a;
                            }
                        } else {
                            minToWin = realBetHistoryOrderEntity.getMinToWin();
                            Integer selectionSize113 = realBetHistoryOrderEntity.getSelectionSize();
                            if (minToWin != null) {
                                bVar2 = null;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 == null) {
                                bVar2 = t640.d.c.a;
                            }
                        }
                        if (num == null) {
                            if (num == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                            }
                        } else if (z8) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                        } else if (i8 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                        } else if (z5) {
                            numValueOf = null;
                        } else if (i5 != 0) {
                            numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                        }
                        if (num == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(i10);
                        }
                        if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                        } else {
                            winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                            } else if (winningStatus != null) {
                                if (z6) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                                } else if (i4 != 0) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                                } else if (z5) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                }
                                resourceUiText2 = resourceUiText3;
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                            } else if (winningStatus != null) {
                                resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                            } else if (winningStatus == null) {
                                resourceUiText2 = vch0.a;
                            } else {
                                resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                            }
                        }
                        ColoredUiText coloredUiTextF113 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                        String totalStake114 = realBetHistoryOrderEntity.getTotalStake();
                        Locale locale113 = Locale.US;
                        StringUiText stringUiText115 = new StringUiText(bjb0.P(totalStake114, locale113));
                        if (z7) {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        } else {
                            numValueOf = numValueOf;
                            resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                        }
                        if (num != null) {
                        }
                        ColoredUiText coloredUiText11116 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                        oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                        if (oddsBoosted != null) {
                            zBooleanValue = oddsBoosted.booleanValue();
                        } else {
                            zBooleanValue = i;
                        }
                        lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                        if (lfbOddsBoosted != null) {
                            zBooleanValue2 = lfbOddsBoosted.booleanValue();
                        } else {
                            zBooleanValue2 = i;
                        }
                        boolean z11110 = zBooleanValue;
                        UiText uiTextA11116 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                        UiText uiTextA11117 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                        uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                        selections = realBetHistoryOrderEntity.getSelections();
                        if (selections == null) {
                            uiText = resourceUiText4;
                            uiText2 = uiTextA;
                            if (selections.size() <= 3) {
                                if (selections.size() == 4) {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                                } else {
                                    resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                                }
                            }
                            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                            if (winningStatus2 == null) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (r27 != 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                            if (hasPendingEvent != null) {
                                zBooleanValue3 = hasPendingEvent.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                            if (r27 == 0) {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            } else {
                                resourceUiText6 = resourceUiText5;
                                str = null;
                            }
                            return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11115, bVar2, numValueOf, numValueOf2, coloredUiTextF113, stringUiTextD, stringUiText115, uiText, coloredUiText11116, z11110, zBooleanValue2, uiTextA11116, uiTextA11117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                        }
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        resourceUiText5 = null;
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11115, bVar2, numValueOf, numValueOf2, coloredUiTextF113, stringUiTextD, stringUiText115, uiText, coloredUiText11116, z11110, zBooleanValue2, uiTextA11116, uiTextA11117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    stringUiText = vch0.a;
                    z8 = z3;
                    ColoredUiText coloredUiText11117 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize114 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF114 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake115 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale114 = Locale.US;
                    StringUiText stringUiText116 = new StringUiText(bjb0.P(totalStake115, locale114));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText11118 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z11111 = zBooleanValue;
                    UiText uiTextA11118 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA11119 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11117, bVar2, numValueOf, numValueOf2, coloredUiTextF114, stringUiTextD, stringUiText116, uiText, coloredUiText11118, z11111, zBooleanValue2, uiTextA11118, uiTextA11119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11117, bVar2, numValueOf, numValueOf2, coloredUiTextF114, stringUiTextD, stringUiText116, uiText, coloredUiText11118, z11111, zBooleanValue2, uiTextA11118, uiTextA11119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                if (orderType == 0) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
                } else {
                    resourceUiText = new ResourceUiText(R.string.common_functions__system);
                }
                combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                if (combinationSize != null) {
                    num2 = combinationSize;
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    if (num2.intValue() <= 1) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                    }
                    z8 = z3;
                    ColoredUiText coloredUiText11119 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize115 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF115 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake116 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale115 = Locale.US;
                    StringUiText stringUiText117 = new StringUiText(bjb0.P(totalStake116, locale115));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText111110 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z11112 = zBooleanValue;
                    UiText uiTextA111110 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA111111 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11119, bVar2, numValueOf, numValueOf2, coloredUiTextF115, stringUiTextD, stringUiText117, uiText, coloredUiText111110, z11112, zBooleanValue2, uiTextA111110, uiTextA111111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText11119, bVar2, numValueOf, numValueOf2, coloredUiTextF115, stringUiTextD, stringUiText117, uiText, coloredUiText111110, z11112, zBooleanValue2, uiTextA111110, uiTextA111111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                stringUiText = vch0.a;
                z8 = z3;
                ColoredUiText coloredUiText111111 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                orderType2 = realBetHistoryOrderEntity.getOrderType();
                if (orderType2 == null) {
                    z8 = z8;
                    if (z2) {
                        bVar2 = t640.d.a.a;
                    } else if (z7) {
                        bVar2 = t640.d.C1115d.a;
                    } else {
                        bVar2 = t640.d.c.a;
                    }
                } else {
                    minToWin = realBetHistoryOrderEntity.getMinToWin();
                    Integer selectionSize116 = realBetHistoryOrderEntity.getSelectionSize();
                    if (minToWin != null) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = t640.d.c.a;
                    }
                }
                if (num == null) {
                    if (num == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                    }
                } else if (z8) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                } else if (i8 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                } else if (z5) {
                    numValueOf = null;
                } else if (i5 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                }
                if (num == null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(i10);
                }
                if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                } else {
                    winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                    } else if (winningStatus != null) {
                        if (z6) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                        } else if (i4 != 0) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                        } else if (z5) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                        }
                        resourceUiText2 = resourceUiText3;
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                    } else if (winningStatus == null) {
                        resourceUiText2 = vch0.a;
                    } else {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                    }
                }
                ColoredUiText coloredUiTextF116 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                String totalStake117 = realBetHistoryOrderEntity.getTotalStake();
                Locale locale116 = Locale.US;
                StringUiText stringUiText118 = new StringUiText(bjb0.P(totalStake117, locale116));
                if (z7) {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                } else {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                }
                if (num != null) {
                }
                ColoredUiText coloredUiText111112 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                if (oddsBoosted != null) {
                    zBooleanValue = oddsBoosted.booleanValue();
                } else {
                    zBooleanValue = i;
                }
                lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                if (lfbOddsBoosted != null) {
                    zBooleanValue2 = lfbOddsBoosted.booleanValue();
                } else {
                    zBooleanValue2 = i;
                }
                boolean z11113 = zBooleanValue;
                UiText uiTextA111112 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                UiText uiTextA111113 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                selections = realBetHistoryOrderEntity.getSelections();
                if (selections == null) {
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    if (selections.size() <= 3) {
                        if (selections.size() == 4) {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                        } else {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                        }
                    }
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText111111, bVar2, numValueOf, numValueOf2, coloredUiTextF116, stringUiTextD, stringUiText118, uiText, coloredUiText111112, z11113, zBooleanValue2, uiTextA111112, uiTextA111113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                resourceUiText5 = null;
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c8, i10, coloredUiText111111, bVar2, numValueOf, numValueOf2, coloredUiTextF116, stringUiTextD, stringUiText118, uiText, coloredUiText111112, z11113, zBooleanValue2, uiTextA111112, uiTextA111113, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            i10 = i9;
            if (num == null) {
                c = 2145;
            } else {
                c = 2144;
            }
            orderType = realBetHistoryOrderEntity2.getOrderType();
            char c9 = c;
            if (orderType != null) {
                resourceUiText = new ResourceUiText(R.string.component_betslip__singles);
                combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
                if (combinationSize != null) {
                    num2 = combinationSize;
                    realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                    if (num2.intValue() <= 1) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                    }
                    z8 = z3;
                    ColoredUiText coloredUiText111113 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                    orderType2 = realBetHistoryOrderEntity.getOrderType();
                    if (orderType2 == null) {
                        z8 = z8;
                        if (z2) {
                            bVar2 = t640.d.a.a;
                        } else if (z7) {
                            bVar2 = t640.d.C1115d.a;
                        } else {
                            bVar2 = t640.d.c.a;
                        }
                    } else {
                        minToWin = realBetHistoryOrderEntity.getMinToWin();
                        Integer selectionSize117 = realBetHistoryOrderEntity.getSelectionSize();
                        if (minToWin != null) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            bVar2 = t640.d.c.a;
                        }
                    }
                    if (num == null) {
                        if (num == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                        }
                    } else if (z8) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                    } else if (i8 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                    } else if (z5) {
                        numValueOf = null;
                    } else if (i5 != 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                    }
                    if (num == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(i10);
                    }
                    if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                    } else {
                        winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                        } else if (winningStatus != null) {
                            if (z6) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                            } else if (i4 != 0) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                            } else if (z5) {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                            }
                            resourceUiText2 = resourceUiText3;
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                        } else if (winningStatus != null) {
                            resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                        } else if (winningStatus == null) {
                            resourceUiText2 = vch0.a;
                        } else {
                            resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                        }
                    }
                    ColoredUiText coloredUiTextF117 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                    String totalStake118 = realBetHistoryOrderEntity.getTotalStake();
                    Locale locale117 = Locale.US;
                    StringUiText stringUiText119 = new StringUiText(bjb0.P(totalStake118, locale117));
                    if (z7) {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    } else {
                        numValueOf = numValueOf;
                        resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                    }
                    if (num != null) {
                    }
                    ColoredUiText coloredUiText111114 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                    oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                    if (oddsBoosted != null) {
                        zBooleanValue = oddsBoosted.booleanValue();
                    } else {
                        zBooleanValue = i;
                    }
                    lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                    if (lfbOddsBoosted != null) {
                        zBooleanValue2 = lfbOddsBoosted.booleanValue();
                    } else {
                        zBooleanValue2 = i;
                    }
                    boolean z11114 = zBooleanValue;
                    UiText uiTextA111114 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                    UiText uiTextA111115 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                    uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                    selections = realBetHistoryOrderEntity.getSelections();
                    if (selections == null) {
                        uiText = resourceUiText4;
                        uiText2 = uiTextA;
                        if (selections.size() <= 3) {
                            if (selections.size() == 4) {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                            } else {
                                resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                            }
                        }
                        winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                        if (winningStatus2 == null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (r27 != 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                        if (hasPendingEvent != null) {
                            zBooleanValue3 = hasPendingEvent.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        if (r27 == 0) {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        } else {
                            resourceUiText6 = resourceUiText5;
                            str = null;
                        }
                        return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111113, bVar2, numValueOf, numValueOf2, coloredUiTextF117, stringUiTextD, stringUiText119, uiText, coloredUiText111114, z11114, zBooleanValue2, uiTextA111114, uiTextA111115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                    }
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    resourceUiText5 = null;
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111113, bVar2, numValueOf, numValueOf2, coloredUiTextF117, stringUiTextD, stringUiText119, uiText, coloredUiText111114, z11114, zBooleanValue2, uiTextA111114, uiTextA111115, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                stringUiText = vch0.a;
                z8 = z3;
                ColoredUiText coloredUiText111115 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                orderType2 = realBetHistoryOrderEntity.getOrderType();
                if (orderType2 == null) {
                    z8 = z8;
                    if (z2) {
                        bVar2 = t640.d.a.a;
                    } else if (z7) {
                        bVar2 = t640.d.C1115d.a;
                    } else {
                        bVar2 = t640.d.c.a;
                    }
                } else {
                    minToWin = realBetHistoryOrderEntity.getMinToWin();
                    Integer selectionSize118 = realBetHistoryOrderEntity.getSelectionSize();
                    if (minToWin != null) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = t640.d.c.a;
                    }
                }
                if (num == null) {
                    if (num == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                    }
                } else if (z8) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                } else if (i8 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                } else if (z5) {
                    numValueOf = null;
                } else if (i5 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                }
                if (num == null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(i10);
                }
                if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                } else {
                    winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                    } else if (winningStatus != null) {
                        if (z6) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                        } else if (i4 != 0) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                        } else if (z5) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                        }
                        resourceUiText2 = resourceUiText3;
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                    } else if (winningStatus == null) {
                        resourceUiText2 = vch0.a;
                    } else {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                    }
                }
                ColoredUiText coloredUiTextF118 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                String totalStake119 = realBetHistoryOrderEntity.getTotalStake();
                Locale locale118 = Locale.US;
                StringUiText stringUiText1110 = new StringUiText(bjb0.P(totalStake119, locale118));
                if (z7) {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                } else {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                }
                if (num != null) {
                }
                ColoredUiText coloredUiText111116 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                if (oddsBoosted != null) {
                    zBooleanValue = oddsBoosted.booleanValue();
                } else {
                    zBooleanValue = i;
                }
                lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                if (lfbOddsBoosted != null) {
                    zBooleanValue2 = lfbOddsBoosted.booleanValue();
                } else {
                    zBooleanValue2 = i;
                }
                boolean z11115 = zBooleanValue;
                UiText uiTextA111116 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                UiText uiTextA111117 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                selections = realBetHistoryOrderEntity.getSelections();
                if (selections == null) {
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    if (selections.size() <= 3) {
                        if (selections.size() == 4) {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                        } else {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                        }
                    }
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111115, bVar2, numValueOf, numValueOf2, coloredUiTextF118, stringUiTextD, stringUiText1110, uiText, coloredUiText111116, z11115, zBooleanValue2, uiTextA111116, uiTextA111117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                resourceUiText5 = null;
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111115, bVar2, numValueOf, numValueOf2, coloredUiTextF118, stringUiTextD, stringUiText1110, uiText, coloredUiText111116, z11115, zBooleanValue2, uiTextA111116, uiTextA111117, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            if (orderType == 0) {
                resourceUiText = new ResourceUiText(R.string.component_betslip__multiple);
            } else {
                resourceUiText = new ResourceUiText(R.string.common_functions__system);
            }
            combinationSize = realBetHistoryOrderEntity2.getCombinationSize();
            if (combinationSize != null) {
                num2 = combinationSize;
                realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
                if (num2.intValue() <= 1) {
                    num2 = null;
                }
                if (num2 != null) {
                    stringUiText = new StringUiText(pe4.b(num2.intValue(), "(x", ")"));
                }
                z8 = z3;
                ColoredUiText coloredUiText111117 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
                orderType2 = realBetHistoryOrderEntity.getOrderType();
                if (orderType2 == null) {
                    z8 = z8;
                    if (z2) {
                        bVar2 = t640.d.a.a;
                    } else if (z7) {
                        bVar2 = t640.d.C1115d.a;
                    } else {
                        bVar2 = t640.d.c.a;
                    }
                } else {
                    minToWin = realBetHistoryOrderEntity.getMinToWin();
                    Integer selectionSize119 = realBetHistoryOrderEntity.getSelectionSize();
                    if (minToWin != null) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = t640.d.c.a;
                    }
                }
                if (num == null) {
                    if (num == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                    }
                } else if (z8) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
                } else if (i8 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
                } else if (z5) {
                    numValueOf = null;
                } else if (i5 != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
                }
                if (num == null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(i10);
                }
                if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
                } else {
                    winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                    } else if (winningStatus != null) {
                        if (z6) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                        } else if (i4 != 0) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                        } else if (z5) {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                        }
                        resourceUiText2 = resourceUiText3;
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                    } else if (winningStatus != null) {
                        resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                    } else if (winningStatus == null) {
                        resourceUiText2 = vch0.a;
                    } else {
                        resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                    }
                }
                ColoredUiText coloredUiTextF119 = vch0.f(resourceUiText2, Integer.valueOf(i10));
                String totalStake1110 = realBetHistoryOrderEntity.getTotalStake();
                Locale locale119 = Locale.US;
                StringUiText stringUiText1111 = new StringUiText(bjb0.P(totalStake1110, locale119));
                if (z7) {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                } else {
                    numValueOf = numValueOf;
                    resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
                }
                if (num != null) {
                }
                ColoredUiText coloredUiText111118 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
                oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
                if (oddsBoosted != null) {
                    zBooleanValue = oddsBoosted.booleanValue();
                } else {
                    zBooleanValue = i;
                }
                lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
                if (lfbOddsBoosted != null) {
                    zBooleanValue2 = lfbOddsBoosted.booleanValue();
                } else {
                    zBooleanValue2 = i;
                }
                boolean z11116 = zBooleanValue;
                UiText uiTextA111118 = s640.a(i, realBetHistoryOrderEntity.getSelections());
                UiText uiTextA111119 = s640.a(1, realBetHistoryOrderEntity.getSelections());
                uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
                selections = realBetHistoryOrderEntity.getSelections();
                if (selections == null) {
                    uiText = resourceUiText4;
                    uiText2 = uiTextA;
                    if (selections.size() <= 3) {
                        if (selections.size() == 4) {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                        } else {
                            resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                        }
                    }
                    winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                    if (winningStatus2 == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (r27 != 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                    if (hasPendingEvent != null) {
                        zBooleanValue3 = hasPendingEvent.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    if (r27 == 0) {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    } else {
                        resourceUiText6 = resourceUiText5;
                        str = null;
                    }
                    return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111117, bVar2, numValueOf, numValueOf2, coloredUiTextF119, stringUiTextD, stringUiText1111, uiText, coloredUiText111118, z11116, zBooleanValue2, uiTextA111118, uiTextA111119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
                }
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                resourceUiText5 = null;
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111117, bVar2, numValueOf, numValueOf2, coloredUiTextF119, stringUiTextD, stringUiText1111, uiText, coloredUiText111118, z11116, zBooleanValue2, uiTextA111118, uiTextA111119, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            realBetHistoryOrderEntity = realBetHistoryOrderEntity2;
            stringUiText = vch0.a;
            z8 = z3;
            ColoredUiText coloredUiText111119 = new ColoredUiText(resourceUiText.h(stringUiText), Integer.valueOf(i10), null);
            orderType2 = realBetHistoryOrderEntity.getOrderType();
            if (orderType2 == null) {
                z8 = z8;
                if (z2) {
                    bVar2 = t640.d.a.a;
                } else if (z7) {
                    bVar2 = t640.d.C1115d.a;
                } else {
                    bVar2 = t640.d.c.a;
                }
            } else {
                minToWin = realBetHistoryOrderEntity.getMinToWin();
                Integer selectionSize1110 = realBetHistoryOrderEntity.getSelectionSize();
                if (minToWin != null) {
                    bVar2 = null;
                } else {
                    bVar2 = null;
                }
                if (bVar2 == null) {
                    bVar2 = t640.d.c.a;
                }
            }
            if (num == null) {
                if (num == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.drawable.spr_pending_icon_10dp);
                }
            } else if (z8) {
                numValueOf = Integer.valueOf(R.drawable.ic_flashwin);
            } else if (i8 != 0) {
                numValueOf = Integer.valueOf(R.drawable.ic_flashsave);
            } else if (z5) {
                numValueOf = null;
            } else if (i5 != 0) {
                numValueOf = Integer.valueOf(R.drawable.ic_joker_18dp);
            } else {
                numValueOf = Integer.valueOf(R.drawable.ic_spr_bet_history_win);
            }
            if (num == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(i10);
            }
            if (realBetHistoryOrderEntity.isPaymentInProgress()) {
                resourceUiText2 = new ResourceUiText(R.string.bet_history__paying);
            } else {
                winningStatus = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus != null) {
                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__running);
                } else if (winningStatus != null) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__partial_win);
                } else if (winningStatus != null) {
                    if (z6) {
                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_win);
                    } else if (i4 != 0) {
                        resourceUiText3 = new ResourceUiText(R.string.bet_history__flash_save);
                    } else if (z5) {
                        resourceUiText3 = new ResourceUiText(R.string.bet_history__partial_payout);
                    } else {
                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                    }
                    resourceUiText2 = resourceUiText3;
                } else if (winningStatus != null) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__lost);
                } else if (winningStatus != null) {
                    resourceUiText2 = new ResourceUiText(R.string.bet_history__void);
                } else if (winningStatus == null) {
                    resourceUiText2 = vch0.a;
                } else {
                    resourceUiText2 = new ResourceUiText(R.string.component_wap_share_bet__pending);
                }
            }
            ColoredUiText coloredUiTextF1110 = vch0.f(resourceUiText2, Integer.valueOf(i10));
            String totalStake1111 = realBetHistoryOrderEntity.getTotalStake();
            Locale locale1110 = Locale.US;
            StringUiText stringUiText1112 = new StringUiText(bjb0.P(totalStake1111, locale1110));
            if (z7) {
                numValueOf = numValueOf;
                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
            } else {
                numValueOf = numValueOf;
                resourceUiText4 = new ResourceUiText(R.string.component_wap_share_bet__total_return);
            }
            if (num != null) {
            }
            ColoredUiText coloredUiText1111110 = new ColoredUiText(stringUiText2, Integer.valueOf(((num == null && num.intValue() == 5) || (num != null && num.intValue() == 20) || (num != null && num.intValue() == 40)) ? R.color.brand_quaternary : R.color.text_type1_primary), null);
            oddsBoosted = realBetHistoryOrderEntity.getOddsBoosted();
            if (oddsBoosted != null) {
                zBooleanValue = oddsBoosted.booleanValue();
            } else {
                zBooleanValue = i;
            }
            lfbOddsBoosted = realBetHistoryOrderEntity.getLfbOddsBoosted();
            if (lfbOddsBoosted != null) {
                zBooleanValue2 = lfbOddsBoosted.booleanValue();
            } else {
                zBooleanValue2 = i;
            }
            boolean z11117 = zBooleanValue;
            UiText uiTextA1111110 = s640.a(i, realBetHistoryOrderEntity.getSelections());
            UiText uiTextA1111111 = s640.a(1, realBetHistoryOrderEntity.getSelections());
            uiTextA = s640.a(2, realBetHistoryOrderEntity.getSelections());
            selections = realBetHistoryOrderEntity.getSelections();
            if (selections == null) {
                uiText = resourceUiText4;
                uiText2 = uiTextA;
                if (selections.size() <= 3) {
                    if (selections.size() == 4) {
                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_match, ay0.S(new Object[]{"1"}));
                    } else {
                        resourceUiText5 = new ResourceUiText(R.string.app_common__and_other_matches, ay0.S(new Object[]{String.valueOf(selections.size() - 3)}));
                    }
                }
                winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
                if (winningStatus2 == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (r27 != 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
                if (hasPendingEvent != null) {
                    zBooleanValue3 = hasPendingEvent.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (r27 == 0) {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                } else {
                    resourceUiText6 = resourceUiText5;
                    str = null;
                }
                return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111119, bVar2, numValueOf, numValueOf2, coloredUiTextF1110, stringUiTextD, stringUiText1112, uiText, coloredUiText1111110, z11117, zBooleanValue2, uiTextA1111110, uiTextA1111111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
            }
            uiText = resourceUiText4;
            uiText2 = uiTextA;
            resourceUiText5 = null;
            winningStatus2 = realBetHistoryOrderEntity.getWinningStatus();
            if (winningStatus2 == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (Intrinsics.g(realBetHistoryOrderEntity.isEditable(), Boolean.TRUE)) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (r27 != 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (realBetHistoryOrderEntity.getShowRemixBetRedDot()) {
                z12 = false;
            } else {
                z12 = false;
            }
            hasPendingEvent = realBetHistoryOrderEntity.getHasPendingEvent();
            if (hasPendingEvent != null) {
                zBooleanValue3 = hasPendingEvent.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            if (r27 == 0) {
                resourceUiText6 = resourceUiText5;
                str = null;
            } else {
                resourceUiText6 = resourceUiText5;
                str = null;
            }
            return new t640(orderId2, betIds3, createTime2, l, r8, z1119, userNote2, zIsBulkDeletePerforming4, zIsSelectedForBulkDelete4, c9, i10, coloredUiText111119, bVar2, numValueOf, numValueOf2, coloredUiTextF1110, stringUiTextD, stringUiText1112, uiText, coloredUiText1111110, z11117, zBooleanValue2, uiTextA1111110, uiTextA1111111, uiText2, resourceUiText6, z9, z10, z11, z12, str, zBooleanValue3);
        }
    }

    public static final class j implements lyh<kqz<t640>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ d740 b;

        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$orderUiStatesPagingData$lambda$0$$inlined$map$1", f = "RealBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ d740 b;

            @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$orderUiStatesPagingData$lambda$0$$inlined$map$1$2", f = "RealBetHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, d740 d740Var) {
                this.a = myhVar;
                this.b = d740Var;
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
                    kqz kqzVarB = vqz.b((kqz) obj, new i(null, this.b));
                    aVar.b = 1;
                    if (this.a.emit(kqzVarB, aVar) == y5bVar) {
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

        public j(lyh lyhVar, d740 d740Var) {
            this.a = lyhVar;
            this.b = d740Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<t640>> myhVar, v1b v1bVar) {
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
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class k implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$remixBetEnabledFlow$lambda$0$$inlined$map$1", f = "RealBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return k.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$remixBetEnabledFlow$lambda$0$$inlined$map$1$2", f = "RealBetHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
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

            /* JADX WARN: Code duplicated, block: B:25:0x005d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                Boolean boolR0;
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
                Boolean bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                Object obj3 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.RemixBetEnabled);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(Boolean.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            bool = (Boolean) configValue;
                        } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                            bool = boolR0;
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (configValue instanceof Boolean) {
                            obj3 = configValue;
                        }
                        bool = (Boolean) obj3;
                    }
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
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

        public k(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$shouldShowNewFeaturePopupFlow$1", f = "RealBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            l lVar = new l(3, v1bVar);
            lVar.a = zBooleanValue;
            lVar.b = zBooleanValue2;
            return lVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!z && z2);
        }
    }

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$flatMapLatest$1", f = "RealBetHistoryViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements gaj<myh<? super Boolean>, String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ d740 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(v1b v1bVar, d740 d740Var) {
            super(3, v1bVar);
            this.d = d740Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Boolean> myhVar, String str, v1b<? super Unit> v1bVar) {
            m mVar = new m(v1bVar, this.d);
            mVar.b = myhVar;
            mVar.c = str;
            return mVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                String str = (String) this.c;
                lyh gzhVar = (str == null || StringsKt.U(str)) ? new gzh(Boolean.FALSE) : new k(bm50.f(this.d.w.a(pu0.b.a)));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$flatMapLatest$2", f = "RealBetHistoryViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements gaj<myh<? super kqz<t640>>, q640, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ d740 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(v1b v1bVar, d740 d740Var) {
            super(3, v1bVar);
            this.d = d740Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super kqz<t640>> myhVar, q640 q640Var, v1b<? super Unit> v1bVar) {
            n nVar = new n(v1bVar, this.d);
            nVar.b = myhVar;
            nVar.c = q640Var;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                q640 q640Var = (q640) this.c;
                d740 d740Var = this.d;
                j jVar = new j(d740Var.b.k(q640Var), d740Var);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, jVar, this) == y5bVar) {
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

    public static final class o implements lyh<rm80> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$1", f = "RealBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return o.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$1$2", f = "RealBetHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
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
                ResourceUiText resourceUiText;
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
                BetDialogResult betDialogResult = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    z2z z2zVar = (z2z) obj;
                    z2zVar.getClass();
                    int iOrdinal = z2zVar.ordinal();
                    if (iOrdinal == 0) {
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__unsettled);
                    } else if (iOrdinal == 1) {
                        StringUiText stringUiText2 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__settled);
                    } else {
                        if (iOrdinal != 2) {
                            uhc.a();
                            return null;
                        }
                        StringUiText stringUiText3 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__all);
                    }
                    ResourceUiText resourceUiText2 = resourceUiText;
                    boolean z = false;
                    if (z2zVar == z2z.ALL) {
                        z = true;
                    }
                    boolean z2 = z2zVar == z2z.UNSETTLED ? true : z;
                    boolean z3 = z2zVar == z2z.SETTLED;
                    int iOrdinal2 = z2zVar.ordinal();
                    if (iOrdinal2 == 0) {
                        betDialogResult = BetDialogResult.Unsettled.a;
                    } else if (iOrdinal2 == 1) {
                        betDialogResult = BetDialogResult.Settled.a;
                    } else if (iOrdinal2 != 2) {
                        uhc.a();
                        return null;
                    }
                    rm80 rm80Var = new rm80(resourceUiText2, z, z2, z3, betDialogResult);
                    aVar.b = 1;
                    if (this.a.emit(rm80Var, aVar) == y5bVar) {
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

        public o(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super rm80> myhVar, v1b v1bVar) throws Throwable {
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

    public static final class p implements lyh<fgj0> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$2", f = "RealBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return p.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$2$2", f = "RealBetHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
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
                ResourceUiText resourceUiText;
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
                BetDialogResult betDialogResult = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    bbj0 bbj0Var = (bbj0) obj;
                    bbj0Var.getClass();
                    int iOrdinal = bbj0Var.ordinal();
                    if (iOrdinal == 0) {
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__bet_result);
                    } else if (iOrdinal == 1) {
                        StringUiText stringUiText2 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__won);
                    } else if (iOrdinal == 2) {
                        StringUiText stringUiText3 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__lost);
                    } else {
                        if (iOrdinal != 3) {
                            uhc.a();
                            return null;
                        }
                        StringUiText stringUiText4 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.bet_history__void);
                    }
                    boolean z = bbj0Var == bbj0.a;
                    int iOrdinal2 = bbj0Var.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            betDialogResult = BetDialogResult.Won.a;
                        } else if (iOrdinal2 == 2) {
                            betDialogResult = BetDialogResult.Lost.a;
                        } else {
                            if (iOrdinal2 != 3) {
                                uhc.a();
                                return null;
                            }
                            betDialogResult = BetDialogResult.Void.a;
                        }
                    }
                    fgj0 fgj0Var = new fgj0(resourceUiText, z, betDialogResult);
                    aVar.b = 1;
                    if (this.a.emit(fgj0Var, aVar) == y5bVar) {
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

        public p(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super fgj0> myhVar, v1b v1bVar) throws Throwable {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [c740, i8] */
    public d740(emf emfVar, at2 at2Var, k650 k650Var, m2l m2lVar, psm psmVar, uqm uqmVar, jrm jrmVar, h450 h450Var, lq1 lq1Var, xrc xrcVar, sfy sfyVar, ich ichVar) {
        at2Var.getClass();
        k650Var.getClass();
        m2lVar.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        jrmVar.getClass();
        lq1Var.getClass();
        xrcVar.getClass();
        sfyVar.getClass();
        ichVar.getClass();
        this.a = emfVar;
        this.b = at2Var;
        this.c = k650Var;
        this.d = m2lVar;
        this.e = psmVar;
        this.f = uqmVar;
        this.i = jrmVar;
        this.v = h450Var;
        this.w = lq1Var;
        this.y = xrcVar;
        this.z = sfyVar;
        this.A = ichVar;
        this.B = new ku90<>();
        this.C = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(uqmVar.getUserId());
        this.D = wwd0VarA;
        ?? r5 = new i8() { // from class: c740
            @Override // defpackage.i8
            public final void onAccountChange(Account account) {
                d740 d740Var = this.a;
                d740Var.D.setValue(d740Var.f.getUserId());
            }
        };
        this.E = r5;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.F = wwd0VarA2;
        lyh<Boolean> lyhVarB = at2Var.b();
        et7 et7VarD = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarB, et7VarD, kwd0Var, bool);
        this.G = v340VarE;
        v340 v340VarE2 = e1i.e(at2Var.d(), o8i0.d(this), kwd0Var, m2g.a);
        this.H = v340VarE2;
        this.I = xwd0.a(tzs.a.a);
        StringUiText stringUiText = vch0.a;
        this.J = xwd0.a(new c330.a(new ResourceUiText(R.string.wap_home__delete), false));
        wwd0 wwd0VarA3 = xwd0.a(z2z.SETTLED);
        this.K = wwd0VarA3;
        this.L = xwd0.a(Boolean.TRUE);
        wwd0 wwd0VarA4 = xwd0.a(bbj0.a);
        this.M = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(bool);
        this.N = wwd0VarA5;
        v340 v340VarB = e1i.b(wwd0VarA5);
        wwd0 wwd0VarA6 = xwd0.a(bool);
        this.O = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(Boolean.valueOf(!ichVar.a("key_delete_history_tutorial_seen")));
        this.P = wwd0VarA7;
        v340 v340VarE3 = e1i.e(r0i.f(wwd0VarA, new m(null, this)), o8i0.d(this), kwd0Var, bool);
        wwd0 wwd0VarA8 = xwd0.a(null);
        this.Q = wwd0VarA8;
        this.R = e1i.e(new n1i(v340VarE, v340VarB, new l(3, null)), o8i0.d(this), q490.a.b, bool);
        v340 v340VarE4 = e1i.e(new o(wwd0VarA3), o8i0.d(this), kwd0Var, new rm80(0));
        this.S = v340VarE4;
        v340 v340VarE5 = e1i.e(new p(wwd0VarA4), o8i0.d(this), kwd0Var, new fgj0(0));
        this.T = v340VarE5;
        this.U = e1i.e(new n1i(r1i.c(v340VarE4, v340VarE5, e1i.b(wwd0VarA4), new r740(wwd0VarA8), v340VarE, new f(null)), wwd0VarA7, new g(3, null)), o8i0.d(this), kwd0Var, new fr2((ResourceUiText) null, (UiText) null, (UiText) null, (bbj0) null, false, false, false, false, false, 1023));
        wwd0 wwd0VarA9 = xwd0.a(new q640(null, null, null, null));
        this.V = wwd0VarA9;
        this.W = rs5.a(r0i.f(r1i.a(wwd0VarA9, wwd0VarA, wwd0VarA2, new h(4, null)), new n(null, this)), o8i0.d(this));
        uqmVar.addAccountChangeListener(r5);
        kzh.d(r1i.b(wwd0VarA3, wwd0VarA4, wwd0VarA8, v340VarE, new a(null, this)), o8i0.d(this));
        kzh.d(new g1i(v340VarE3, new b(null, this)), o8i0.d(this));
        kzh.d(new g1i(wwd0VarA6, new c(null, this)), o8i0.d(this));
        kzh.d(new g1i(v340VarE2, new d(null, this)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new e(null, this), 3);
    }

    public final jvd0 A1(Function1 function1) {
        return ej5.c(o8i0.d(this), null, null, new j740(this, function1, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(Iterable iterable, x1b x1bVar) {
        o740 o740Var;
        if (x1bVar instanceof o740) {
            o740Var = (o740) x1bVar;
            int i2 = o740Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o740Var.c = i2 - Integer.MIN_VALUE;
            } else {
                o740Var = new o740(this, x1bVar);
            }
        } else {
            o740Var = new o740(this, x1bVar);
        }
        Object bVar = o740Var.a;
        y5b y5bVar = y5b.a;
        int i3 = o740Var.c;
        try {
            if (i3 == 0) {
                uj50.b(bVar);
                zi50.a aVar = zi50.b;
                at2 at2Var = this.b;
                o740Var.c = 1;
                bVar = at2Var.l(iterable, true, o740Var);
                if (bVar == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(bVar);
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            StringUiText stringUiText = vch0.a;
            com.sporty.android.common.uievent.b.i(this.B, new ResourceUiText(R.string.bet_history__tickets_successfully_deleted), new ResourceUiText(R.string.common_functions__undo), new sq3(this, 2), null, 120);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            com.sporty.android.common.uievent.b.i(this.B, thA instanceof SprThrowable ? vch0.d(((SprThrowable) thA).getE()) : vch0.b, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return Unit.a;
    }

    public final boolean C1() {
        ich ichVar = this.A;
        if (ichVar.a("key_delete_history_tutorial_seen") || this.K.getValue() != z2z.SETTLED || !this.c.b("enable_bulk_swipe_bet_delete")) {
            return false;
        }
        ichVar.b("key_delete_history_tutorial_seen");
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.P;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        return true;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.f.removeAccountChangeListener(this.E);
    }

    public final void x1(z2z z2zVar) {
        if (z2zVar == z2z.UNSETTLED) {
            bbj0 bbj0Var = bbj0.a;
            wwd0 wwd0Var = this.M;
            wwd0Var.getClass();
            wwd0Var.k(null, bbj0Var);
        }
        wwd0 wwd0Var2 = this.K;
        wwd0Var2.getClass();
        wwd0Var2.k(null, z2zVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r13.a.putBoolean("key_bulk_delete_discard", r3, r10) == r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.x1b r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d740.y1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object z1(x1b x1bVar) {
        f740 f740Var;
        boolean z;
        boolean z2;
        if (x1bVar instanceof f740) {
            f740Var = (f740) x1bVar;
            int i2 = f740Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f740Var.d = i2 - Integer.MIN_VALUE;
            } else {
                f740Var = new f740(this, x1bVar);
            }
        } else {
            f740Var = new f740(this, x1bVar);
        }
        f740 f740Var2 = f740Var;
        Object objF = f740Var2.b;
        y5b y5bVar = y5b.a;
        int i3 = f740Var2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                uj50.b(objF);
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = f740Var2.a;
                uj50.b(objF);
            }
            z = z2;
            return Boolean.valueOf(z);
        }
        uj50.b(objF);
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.bet_history__discard_selections_before_leave_hint);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__leave);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__stay);
        f740Var2.d = 1;
        objF = com.sporty.android.common.uievent.b.f(this.B, null, null, resourceUiText, resourceUiText2, resourceUiText3, null, null, f740Var2, 227);
        if (objF != y5bVar) {
        }
        return y5bVar;
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) objF;
        alertDialogCallbackType.getClass();
        z = alertDialogCallbackType instanceof AlertDialogCallbackType.Positive;
        if (z) {
            f740Var2.a = z;
            f740Var2.d = 2;
            if (this.b.h(f740Var2) != y5bVar) {
                z2 = z;
                z = z2;
            }
            return y5bVar;
        }
        return Boolean.valueOf(z);
    }
}
