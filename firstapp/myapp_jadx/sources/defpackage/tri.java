package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.data.dto.Ticket;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class tri {

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedScreenKt$ForYouFeedScreen$2$1$1", f = "ForYouFeedScreen.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<qqi, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> A;
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function1<String, Unit> c;
        public final /* synthetic */ v3a0 d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Function2<String, z7a0.d, Unit> f;
        public final /* synthetic */ Function1<z7a0.b, Unit> i;
        public final /* synthetic */ Function1<z7a0.a, Unit> v;
        public final /* synthetic */ Function1<z7a0.c, Unit> w;
        public final /* synthetic */ Function1<bba0, Unit> y;
        public final /* synthetic */ Function1<bba0.a, Unit> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super String, Unit> function1, v3a0 v3a0Var, Context context, Function2<? super String, ? super z7a0.d, Unit> function2, Function1<? super z7a0.b, Unit> function3, Function1<? super z7a0.a, Unit> function4, Function1<? super z7a0.c, Unit> function5, Function1<? super bba0, Unit> function6, Function1<? super bba0.a, Unit> function7, Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = function1;
            this.d = v3a0Var;
            this.e = context;
            this.f = function2;
            this.i = function3;
            this.v = function4;
            this.w = function5;
            this.y = function6;
            this.z = function7;
            this.A = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qqi qqiVar, v1b<? super Unit> v1bVar) {
            return ((a) create(qqiVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qqi qqiVar = (qqi) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (qqiVar instanceof qqi.g) {
                    String str = ((qqi.g) qqiVar).a;
                    this.c.invoke(str);
                    String strB = sn5.b(this.e, R.string.personal_page__follow_success_vmessage, str);
                    k3a0 k3a0Var = k3a0.a;
                    this.b = null;
                    this.a = 1;
                    if (v3a0.b(this.d, strB, null, false, k3a0Var, this, 6) == y5bVar) {
                        return y5bVar;
                    }
                } else if (qqiVar instanceof qqi.h) {
                    qqi.h hVar = (qqi.h) qqiVar;
                    this.f.invoke(hVar.a, hVar.b);
                    Unit unit = Unit.a;
                } else if (qqiVar instanceof qqi.d) {
                    this.i.invoke(((qqi.d) qqiVar).a);
                    Unit unit2 = Unit.a;
                } else if (qqiVar instanceof qqi.a) {
                    this.v.invoke(((qqi.a) qqiVar).a);
                    Unit unit3 = Unit.a;
                } else if (qqiVar instanceof qqi.f) {
                    this.w.invoke(((qqi.f) qqiVar).a);
                    Unit unit4 = Unit.a;
                } else if (qqiVar instanceof qqi.c) {
                    this.y.invoke(((qqi.c) qqiVar).a);
                    Unit unit5 = Unit.a;
                } else if (qqiVar instanceof qqi.b) {
                    this.z.invoke(((qqi.b) qqiVar).a);
                    Unit unit6 = Unit.a;
                } else {
                    if (!Intrinsics.g(qqiVar, qqi.e.a)) {
                        uhc.a();
                        return null;
                    }
                    this.A.invoke();
                    Unit unit7 = Unit.a;
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

    public static final /* synthetic */ class b extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            bsi bsiVar = (bsi) this.receiver;
            wuw<qqi> wuwVar = bsiVar.B;
            uqm uqmVar = bsiVar.v;
            if (!uqmVar.isLogin()) {
                qqi.c cVar = new qqi.c(new bba0.d(str2, false));
                wuwVar.getClass();
                wuwVar.a.c(cVar);
            } else if (uqmVar.hasPersonalPage()) {
                kzh.d(new g1i(bsiVar.f.a(str2), new csi(bsiVar, str2, null)), o8i0.d(bsiVar));
            } else {
                qqi.b bVar = new qqi.b(new bba0.a(uqmVar.getLastNickName(), str2));
                wuwVar.getClass();
                wuwVar.a.c(bVar);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<kl00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kl00 kl00Var) {
            kl00 kl00Var2 = kl00Var;
            kl00Var2.getClass();
            bsi bsiVar = (bsi) this.receiver;
            bsiVar.getClass();
            kzh.d(new wzh(new xzh(bsiVar.i.c(kl00Var2.a, bsiVar.w.getCountryCode(), kl00Var2.k, new fsi(bsiVar, kl00Var2, null), new gsi(bsiVar, kl00Var2, null)), new isi(bsiVar, kl00Var2, null)), new ksi(bsiVar, kl00Var2, null)), o8i0.d(bsiVar));
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<kl00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kl00 kl00Var) {
            final kl00 kl00Var2 = kl00Var;
            kl00Var2.getClass();
            final bsi bsiVar = (bsi) this.receiver;
            bsiVar.getClass();
            bsiVar.A1(kl00Var2, new nt9(1), new vri(kl00Var2, 0), new Function1() { // from class: wri
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    a8a0 a8a0Var = (a8a0) obj;
                    a8a0Var.getClass();
                    boolean z = a8a0Var.b;
                    BookingData bookingData = a8a0Var.a;
                    if (z) {
                        bsiVar.getClass();
                        return bsi.z1(kl00Var2, a8a0Var);
                    }
                    String str = bookingData.shareCode;
                    str.getClass();
                    List<Event> list = bookingData.outcomes;
                    g08 g08Var = g08.UNKNOWN;
                    return new qqi.d(new z7a0.b(str, list, 10000, null, null, 98));
                }
            });
            return Unit.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function1<kl00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kl00 kl00Var) {
            final kl00 kl00Var2 = kl00Var;
            kl00Var2.getClass();
            final bsi bsiVar = (bsi) this.receiver;
            bsiVar.getClass();
            bsiVar.y.a(obd0.a, k00.d);
            bsiVar.A1(kl00Var2, new rt9(1), new Function1() { // from class: xri
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    th.getClass();
                    SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
                    String str = kl00Var2.a;
                    g08 g08Var = g08.UNKNOWN;
                    return new qqi.a(new z7a0.a(str, null, sprThrowable != null ? Integer.valueOf(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, null, 138));
                }
            }, new Function1() { // from class: yri
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    a8a0 a8a0Var = (a8a0) obj;
                    a8a0Var.getClass();
                    boolean z = a8a0Var.b;
                    BookingData bookingData = a8a0Var.a;
                    if (z) {
                        bsiVar.getClass();
                        return bsi.z1(kl00Var2, a8a0Var);
                    }
                    String str = bookingData.shareCode;
                    str.getClass();
                    List<Event> list = bookingData.outcomes;
                    g08 g08Var = g08.UNKNOWN;
                    Ticket ticket = bookingData.ticket;
                    return new qqi.a(new z7a0.a(str, list, 10000, null, null, ticket != null ? Integer.valueOf(ticket.getOrderType()) : null, 98));
                }
            });
            return Unit.a;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bsi bsiVar = (bsi) this.receiver;
            uri uriVarX1 = bsiVar.x1();
            if (uriVarX1 != null) {
                String str = uriVarX1.e;
                if (!(str == null || str.length() == 0) && !uriVarX1.f && !uriVarX1.g) {
                    bsiVar.y1(str);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedScreenKt$LoadMoreEffect$1$1", f = "ForYouFeedScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ twd0<Integer> b;
        public final /* synthetic */ ytw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, twd0 twd0Var, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = function0;
            this.b = twd0Var;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.b.getValue() != null && ((Boolean) this.c.getValue()).booleanValue()) {
                this.a.invoke();
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class h {
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

    public static final class i implements Function1<Integer, Object> {
        public final /* synthetic */ pri a;
        public final /* synthetic */ List b;

        public i(pri priVar, List list) {
            this.a = priVar;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class j implements Function1<Integer, Object> {
        public final /* synthetic */ qri a;
        public final /* synthetic */ List b;

        public j(qri qriVar, List list) {
            this.a = qriVar;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class k implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ eqi b;

        public k(List list, eqi eqiVar) {
            this.a = list;
            this.b = eqiVar;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                nqi nqiVar = (nqi) this.a.get(iIntValue);
                aVar2.N(-292176540);
                eqi eqiVar = this.b;
                mqi.a(nqiVar, eqiVar.a, eqiVar.b, eqiVar.c, eqiVar.d, eqiVar.e, eqiVar.f, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0192  */
    /* JADX WARN: Code duplicated, block: B:119:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final uri uriVar, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super jl00, Unit> function3, final Function1<? super kl00, Unit> function4, final Function1<? super kl00, Unit> function5, final Function1<? super kl00, Unit> function6, Function0<Unit> function0, Function0<Unit> function7, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function8, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        Function0<Unit> function9;
        int i5;
        Function0<Unit> function10;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        final Function0<Unit> function11;
        final Function0<Unit> function12;
        final Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function13;
        androidx.compose.runtime.e eVarZ;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final Function0<Unit> function14;
        final Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function15;
        Object objY;
        final ytw ytwVar;
        Object objY2;
        Object objY3;
        Object objY4;
        androidx.compose.runtime.b bVarI = aVar.i(1566631778);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? bVarI.M(uriVar) : bVarI.A(uriVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function5) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.A(function6) ? 1048576 : 524288;
        }
        int i11 = i3 & 128;
        if (i11 == 0) {
            if ((12582912 & i2) == 0) {
                function9 = function0;
                i4 |= bVarI.A(function9) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                if ((100663296 & i2) == 0) {
                    function10 = function7;
                    if (bVarI.A(function10)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i9 = i4 | 805306368;
                } else {
                    if ((i2 & 805306368) == 0) {
                        int i12 = i4;
                        if (bVarI.A(function8)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i8 = i12 | i10;
                    } else {
                        i8 = i4;
                    }
                    i9 = i8;
                }
                if ((i9 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i9 & 1, z)) {
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i11 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new cri(0);
                            bVarI.r(objY4);
                        }
                        function14 = (Function0) objY4;
                    } else {
                        function14 = function9;
                    }
                    if (i5 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new eri();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function10;
                    }
                    if (i7 != 0) {
                        function15 = x29.b;
                    } else {
                        function15 = function8;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = m.b(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    final zzr zzrVarA = e0s.a(0, 3, bVarI);
                    final eqi eqiVar = new eqi(function1, function2, function3, function4, function5, function6);
                    e(uriVar.g, function12, pp8.b(1776784975, new Function2() { // from class: fri
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final uri uriVar2 = uriVar;
                                boolean zIsEmpty = uriVar2.b.isEmpty();
                                d.a aVar3 = d.a.b;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zIsEmpty && uriVar2.c.isEmpty() && uriVar2.d.isEmpty()) {
                                    aVar2.N(1024287364);
                                    d dVarH = g3w.h(j.e(aVar3, 1.0f), "for_you_feed_empty_list");
                                    Function2 function16 = function15;
                                    boolean zM = aVar2.M(function16);
                                    Object objY5 = aVar2.y();
                                    if (zM || objY5 == c0042a2) {
                                        objY5 = new iri(function16, 0);
                                        aVar2.r(objY5);
                                    }
                                    aur.a(dVarH, null, null, false, null, null, null, false, null, (Function1) objY5, aVar2, 6, 510);
                                    aVar2.H();
                                } else {
                                    aVar2.N(1024677964);
                                    d dVarH2 = g3w.h(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), c68.a(R.color.bg_secondary_d_lightest, aVar2), zk40.a), "for_you_feed_list");
                                    kw0.i iVar = new kw0.i(12.0f, false, new jw0(ht.a.j));
                                    boolean zA = aVar2.A(uriVar2);
                                    final eqi eqiVar2 = eqiVar;
                                    boolean zM2 = zA | aVar2.M(eqiVar2);
                                    Object objY6 = aVar2.y();
                                    if (zM2 || objY6 == c0042a2) {
                                        final ytw ytwVar2 = ytwVar;
                                        objY6 = new Function1() { // from class: jri
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                szr szrVar = (szr) obj3;
                                                szrVar.getClass();
                                                szr.h(szrVar, null, x29.c, 3);
                                                final uri uriVar3 = uriVar2;
                                                int i13 = uriVar3.a;
                                                List<nqi> list = uriVar3.d;
                                                List<nqi> list2 = uriVar3.b;
                                                List<nqi> list3 = uriVar3.c;
                                                if (i13 == 0 && list2.isEmpty() && (!list3.isEmpty() || !list.isEmpty())) {
                                                    final ytw ytwVar3 = ytwVar2;
                                                    szr.h(szrVar, null, new op8(2086624035, new gaj() { // from class: lri
                                                        @Override // defpackage.gaj
                                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                            a aVar4 = (a) obj5;
                                                            int iIntValue2 = ((Integer) obj6).intValue();
                                                            ((gwr) obj4).getClass();
                                                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                d dVarH3 = h.h(d.a.b, 16.0f, 0.0f, 2);
                                                                int i14 = !uriVar3.d.isEmpty() ? R.string.personal_page__for_you_popular_codes_guidance : R.string.personal_page__for_you_suggested_guidance;
                                                                Object objY7 = aVar4.y();
                                                                if (objY7 == a.C0041a.a) {
                                                                    final ytw ytwVar4 = ytwVar3;
                                                                    objY7 = new Function0() { // from class: ori
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            ytwVar4.setValue(Boolean.TRUE);
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    aVar4.r(objY7);
                                                                }
                                                                nlm.a(i14, 390, aVar4, dVarH3, (Function0) objY7);
                                                            } else {
                                                                aVar4.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, true), 3);
                                                }
                                                eqi eqiVar3 = eqiVar2;
                                                tri.i(szrVar, list2, "followed", "for_you_followed_account", eqiVar3);
                                                if (!list3.isEmpty()) {
                                                    if (!list2.isEmpty() && !list3.isEmpty()) {
                                                        szr.h(szrVar, "suggested_section_label", x29.d, 2);
                                                    }
                                                    tri.i(szrVar, list3, "suggested", "for_you_suggested_account", eqiVar3);
                                                }
                                                if (!list.isEmpty()) {
                                                    tri.i(szrVar, list, "popular", "for_you_popular_account", eqiVar3);
                                                }
                                                if (uriVar3.f) {
                                                    szr.h(szrVar, "for_you_load_more", x29.e, 2);
                                                }
                                                szr.h(szrVar, null, x29.f, 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY6);
                                    }
                                    zzr zzrVar = zzrVarA;
                                    aur.a(dVarH2, zzrVar, null, false, iVar, null, null, false, null, (Function1) objY6, aVar2, 24576, 492);
                                    String str = uriVar2.e;
                                    tri.h(zzrVar, ((str == null || str.length() == 0) || uriVar2.f || uriVar2.g) ? false : true, function14, aVar2, 0);
                                    aVar2.H();
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, ((i9 >> 21) & 112) | 384);
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVarI.N(-1878013701);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new r10(ytwVar, 2);
                            bVarI.r(objY2);
                        }
                        slm.c((Function0) objY2, bVarI, 6);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1877916640);
                        bVarI.X(false);
                    }
                    function13 = function15;
                    function11 = function14;
                } else {
                    bVarI.G();
                    function11 = function9;
                    function12 = function10;
                    function13 = function8;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: gri
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            tri.a(uriVar, function1, function2, function3, function4, function5, function6, function11, function12, function13, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            function10 = function7;
            i7 = i3 & 512;
            if (i7 != 0) {
                i9 = i4 | 805306368;
            } else {
                if ((i2 & 805306368) == 0) {
                    int i13 = i4;
                    if (bVarI.A(function8)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i8 = i13 | i10;
                } else {
                    i8 = i4;
                }
                i9 = i8;
            }
            if ((i9 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i9 & 1, z)) {
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i11 != 0) {
                    objY4 = bVarI.y();
                    if (objY4 == c0042a) {
                        objY4 = new cri(0);
                        bVarI.r(objY4);
                    }
                    function14 = (Function0) objY4;
                } else {
                    function14 = function9;
                }
                if (i5 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new eri();
                        bVarI.r(objY3);
                    }
                    function12 = (Function0) objY3;
                } else {
                    function12 = function10;
                }
                if (i7 != 0) {
                    function15 = x29.b;
                } else {
                    function15 = function8;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                final zzr zzrVarA2 = e0s.a(0, 3, bVarI);
                final eqi eqiVar2 = new eqi(function1, function2, function3, function4, function5, function6);
                e(uriVar.g, function12, pp8.b(1776784975, new Function2() { // from class: fri
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final uri uriVar2 = uriVar;
                            boolean zIsEmpty = uriVar2.b.isEmpty();
                            d.a aVar3 = d.a.b;
                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                            if (zIsEmpty && uriVar2.c.isEmpty() && uriVar2.d.isEmpty()) {
                                aVar2.N(1024287364);
                                d dVarH = g3w.h(j.e(aVar3, 1.0f), "for_you_feed_empty_list");
                                Function2 function16 = function15;
                                boolean zM = aVar2.M(function16);
                                Object objY5 = aVar2.y();
                                if (zM || objY5 == c0042a2) {
                                    objY5 = new iri(function16, 0);
                                    aVar2.r(objY5);
                                }
                                aur.a(dVarH, null, null, false, null, null, null, false, null, (Function1) objY5, aVar2, 6, 510);
                                aVar2.H();
                            } else {
                                aVar2.N(1024677964);
                                d dVarH2 = g3w.h(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), c68.a(R.color.bg_secondary_d_lightest, aVar2), zk40.a), "for_you_feed_list");
                                kw0.i iVar = new kw0.i(12.0f, false, new jw0(ht.a.j));
                                boolean zA = aVar2.A(uriVar2);
                                final eqi eqiVar3 = eqiVar2;
                                boolean zM2 = zA | aVar2.M(eqiVar3);
                                Object objY6 = aVar2.y();
                                if (zM2 || objY6 == c0042a2) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY6 = new Function1() { // from class: jri
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            szr szrVar = (szr) obj3;
                                            szrVar.getClass();
                                            szr.h(szrVar, null, x29.c, 3);
                                            final uri uriVar3 = uriVar2;
                                            int i14 = uriVar3.a;
                                            List<nqi> list = uriVar3.d;
                                            List<nqi> list2 = uriVar3.b;
                                            List<nqi> list3 = uriVar3.c;
                                            if (i14 == 0 && list2.isEmpty() && (!list3.isEmpty() || !list.isEmpty())) {
                                                final ytw ytwVar3 = ytwVar2;
                                                szr.h(szrVar, null, new op8(2086624035, new gaj() { // from class: lri
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                        a aVar4 = (a) obj5;
                                                        int iIntValue2 = ((Integer) obj6).intValue();
                                                        ((gwr) obj4).getClass();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            d dVarH3 = h.h(d.a.b, 16.0f, 0.0f, 2);
                                                            int i15 = !uriVar3.d.isEmpty() ? R.string.personal_page__for_you_popular_codes_guidance : R.string.personal_page__for_you_suggested_guidance;
                                                            Object objY7 = aVar4.y();
                                                            if (objY7 == a.C0041a.a) {
                                                                final ytw ytwVar4 = ytwVar3;
                                                                objY7 = new Function0() { // from class: ori
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        ytwVar4.setValue(Boolean.TRUE);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY7);
                                                            }
                                                            nlm.a(i15, 390, aVar4, dVarH3, (Function0) objY7);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true), 3);
                                            }
                                            eqi eqiVar4 = eqiVar3;
                                            tri.i(szrVar, list2, "followed", "for_you_followed_account", eqiVar4);
                                            if (!list3.isEmpty()) {
                                                if (!list2.isEmpty() && !list3.isEmpty()) {
                                                    szr.h(szrVar, "suggested_section_label", x29.d, 2);
                                                }
                                                tri.i(szrVar, list3, "suggested", "for_you_suggested_account", eqiVar4);
                                            }
                                            if (!list.isEmpty()) {
                                                tri.i(szrVar, list, "popular", "for_you_popular_account", eqiVar4);
                                            }
                                            if (uriVar3.f) {
                                                szr.h(szrVar, "for_you_load_more", x29.e, 2);
                                            }
                                            szr.h(szrVar, null, x29.f, 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY6);
                                }
                                zzr zzrVar = zzrVarA2;
                                aur.a(dVarH2, zzrVar, null, false, iVar, null, null, false, null, (Function1) objY6, aVar2, 24576, 492);
                                String str = uriVar2.e;
                                tri.h(zzrVar, ((str == null || str.length() == 0) || uriVar2.f || uriVar2.g) ? false : true, function14, aVar2, 0);
                                aVar2.H();
                            }
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i9 >> 21) & 112) | 384);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-1878013701);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new r10(ytwVar, 2);
                        bVarI.r(objY2);
                    }
                    slm.c((Function0) objY2, bVarI, 6);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1877916640);
                    bVarI.X(false);
                }
                function13 = function15;
                function11 = function14;
            } else {
                bVarI.G();
                function11 = function9;
                function12 = function10;
                function13 = function8;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gri
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        tri.a(uriVar, function1, function2, function3, function4, function5, function6, function11, function12, function13, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        function9 = function0;
        i5 = i3 & 256;
        if (i5 != 0) {
            if ((100663296 & i2) == 0) {
                function10 = function7;
                if (bVarI.A(function10)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                i9 = i4 | 805306368;
            } else {
                if ((i2 & 805306368) == 0) {
                    int i14 = i4;
                    if (bVarI.A(function8)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i8 = i14 | i10;
                } else {
                    i8 = i4;
                }
                i9 = i8;
            }
            if ((i9 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i9 & 1, z)) {
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i11 != 0) {
                    objY4 = bVarI.y();
                    if (objY4 == c0042a) {
                        objY4 = new cri(0);
                        bVarI.r(objY4);
                    }
                    function14 = (Function0) objY4;
                } else {
                    function14 = function9;
                }
                if (i5 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new eri();
                        bVarI.r(objY3);
                    }
                    function12 = (Function0) objY3;
                } else {
                    function12 = function10;
                }
                if (i7 != 0) {
                    function15 = x29.b;
                } else {
                    function15 = function8;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                final zzr zzrVarA3 = e0s.a(0, 3, bVarI);
                final eqi eqiVar3 = new eqi(function1, function2, function3, function4, function5, function6);
                e(uriVar.g, function12, pp8.b(1776784975, new Function2() { // from class: fri
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final uri uriVar2 = uriVar;
                            boolean zIsEmpty = uriVar2.b.isEmpty();
                            d.a aVar3 = d.a.b;
                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                            if (zIsEmpty && uriVar2.c.isEmpty() && uriVar2.d.isEmpty()) {
                                aVar2.N(1024287364);
                                d dVarH = g3w.h(j.e(aVar3, 1.0f), "for_you_feed_empty_list");
                                Function2 function16 = function15;
                                boolean zM = aVar2.M(function16);
                                Object objY5 = aVar2.y();
                                if (zM || objY5 == c0042a2) {
                                    objY5 = new iri(function16, 0);
                                    aVar2.r(objY5);
                                }
                                aur.a(dVarH, null, null, false, null, null, null, false, null, (Function1) objY5, aVar2, 6, 510);
                                aVar2.H();
                            } else {
                                aVar2.N(1024677964);
                                d dVarH2 = g3w.h(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), c68.a(R.color.bg_secondary_d_lightest, aVar2), zk40.a), "for_you_feed_list");
                                kw0.i iVar = new kw0.i(12.0f, false, new jw0(ht.a.j));
                                boolean zA = aVar2.A(uriVar2);
                                final eqi eqiVar4 = eqiVar3;
                                boolean zM2 = zA | aVar2.M(eqiVar4);
                                Object objY6 = aVar2.y();
                                if (zM2 || objY6 == c0042a2) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY6 = new Function1() { // from class: jri
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            szr szrVar = (szr) obj3;
                                            szrVar.getClass();
                                            szr.h(szrVar, null, x29.c, 3);
                                            final uri uriVar3 = uriVar2;
                                            int i15 = uriVar3.a;
                                            List<nqi> list = uriVar3.d;
                                            List<nqi> list2 = uriVar3.b;
                                            List<nqi> list3 = uriVar3.c;
                                            if (i15 == 0 && list2.isEmpty() && (!list3.isEmpty() || !list.isEmpty())) {
                                                final ytw ytwVar3 = ytwVar2;
                                                szr.h(szrVar, null, new op8(2086624035, new gaj() { // from class: lri
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                        a aVar4 = (a) obj5;
                                                        int iIntValue2 = ((Integer) obj6).intValue();
                                                        ((gwr) obj4).getClass();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            d dVarH3 = h.h(d.a.b, 16.0f, 0.0f, 2);
                                                            int i16 = !uriVar3.d.isEmpty() ? R.string.personal_page__for_you_popular_codes_guidance : R.string.personal_page__for_you_suggested_guidance;
                                                            Object objY7 = aVar4.y();
                                                            if (objY7 == a.C0041a.a) {
                                                                final ytw ytwVar4 = ytwVar3;
                                                                objY7 = new Function0() { // from class: ori
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        ytwVar4.setValue(Boolean.TRUE);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar4.r(objY7);
                                                            }
                                                            nlm.a(i16, 390, aVar4, dVarH3, (Function0) objY7);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true), 3);
                                            }
                                            eqi eqiVar5 = eqiVar4;
                                            tri.i(szrVar, list2, "followed", "for_you_followed_account", eqiVar5);
                                            if (!list3.isEmpty()) {
                                                if (!list2.isEmpty() && !list3.isEmpty()) {
                                                    szr.h(szrVar, "suggested_section_label", x29.d, 2);
                                                }
                                                tri.i(szrVar, list3, "suggested", "for_you_suggested_account", eqiVar5);
                                            }
                                            if (!list.isEmpty()) {
                                                tri.i(szrVar, list, "popular", "for_you_popular_account", eqiVar5);
                                            }
                                            if (uriVar3.f) {
                                                szr.h(szrVar, "for_you_load_more", x29.e, 2);
                                            }
                                            szr.h(szrVar, null, x29.f, 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY6);
                                }
                                zzr zzrVar = zzrVarA3;
                                aur.a(dVarH2, zzrVar, null, false, iVar, null, null, false, null, (Function1) objY6, aVar2, 24576, 492);
                                String str = uriVar2.e;
                                tri.h(zzrVar, ((str == null || str.length() == 0) || uriVar2.f || uriVar2.g) ? false : true, function14, aVar2, 0);
                                aVar2.H();
                            }
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i9 >> 21) & 112) | 384);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-1878013701);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new r10(ytwVar, 2);
                        bVarI.r(objY2);
                    }
                    slm.c((Function0) objY2, bVarI, 6);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1877916640);
                    bVarI.X(false);
                }
                function13 = function15;
                function11 = function14;
            } else {
                bVarI.G();
                function11 = function9;
                function12 = function10;
                function13 = function8;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gri
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        tri.a(uriVar, function1, function2, function3, function4, function5, function6, function11, function12, function13, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        function10 = function7;
        i7 = i3 & 512;
        if (i7 != 0) {
            i9 = i4 | 805306368;
        } else {
            if ((i2 & 805306368) == 0) {
                int i15 = i4;
                if (bVarI.A(function8)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i8 = i15 | i10;
            } else {
                i8 = i4;
            }
            i9 = i8;
        }
        if ((i9 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i9 & 1, z)) {
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i11 != 0) {
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = new cri(0);
                    bVarI.r(objY4);
                }
                function14 = (Function0) objY4;
            } else {
                function14 = function9;
            }
            if (i5 != 0) {
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new eri();
                    bVarI.r(objY3);
                }
                function12 = (Function0) objY3;
            } else {
                function12 = function10;
            }
            if (i7 != 0) {
                function15 = x29.b;
            } else {
                function15 = function8;
            }
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            final zzr zzrVarA4 = e0s.a(0, 3, bVarI);
            final eqi eqiVar4 = new eqi(function1, function2, function3, function4, function5, function6);
            e(uriVar.g, function12, pp8.b(1776784975, new Function2() { // from class: fri
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final uri uriVar2 = uriVar;
                        boolean zIsEmpty = uriVar2.b.isEmpty();
                        d.a aVar3 = d.a.b;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zIsEmpty && uriVar2.c.isEmpty() && uriVar2.d.isEmpty()) {
                            aVar2.N(1024287364);
                            d dVarH = g3w.h(j.e(aVar3, 1.0f), "for_you_feed_empty_list");
                            Function2 function16 = function15;
                            boolean zM = aVar2.M(function16);
                            Object objY5 = aVar2.y();
                            if (zM || objY5 == c0042a2) {
                                objY5 = new iri(function16, 0);
                                aVar2.r(objY5);
                            }
                            aur.a(dVarH, null, null, false, null, null, null, false, null, (Function1) objY5, aVar2, 6, 510);
                            aVar2.H();
                        } else {
                            aVar2.N(1024677964);
                            d dVarH2 = g3w.h(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), c68.a(R.color.bg_secondary_d_lightest, aVar2), zk40.a), "for_you_feed_list");
                            kw0.i iVar = new kw0.i(12.0f, false, new jw0(ht.a.j));
                            boolean zA = aVar2.A(uriVar2);
                            final eqi eqiVar5 = eqiVar4;
                            boolean zM2 = zA | aVar2.M(eqiVar5);
                            Object objY6 = aVar2.y();
                            if (zM2 || objY6 == c0042a2) {
                                final ytw ytwVar2 = ytwVar;
                                objY6 = new Function1() { // from class: jri
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        szr szrVar = (szr) obj3;
                                        szrVar.getClass();
                                        szr.h(szrVar, null, x29.c, 3);
                                        final uri uriVar3 = uriVar2;
                                        int i16 = uriVar3.a;
                                        List<nqi> list = uriVar3.d;
                                        List<nqi> list2 = uriVar3.b;
                                        List<nqi> list3 = uriVar3.c;
                                        if (i16 == 0 && list2.isEmpty() && (!list3.isEmpty() || !list.isEmpty())) {
                                            final ytw ytwVar3 = ytwVar2;
                                            szr.h(szrVar, null, new op8(2086624035, new gaj() { // from class: lri
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                    a aVar4 = (a) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((gwr) obj4).getClass();
                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        d dVarH3 = h.h(d.a.b, 16.0f, 0.0f, 2);
                                                        int i17 = !uriVar3.d.isEmpty() ? R.string.personal_page__for_you_popular_codes_guidance : R.string.personal_page__for_you_suggested_guidance;
                                                        Object objY7 = aVar4.y();
                                                        if (objY7 == a.C0041a.a) {
                                                            final ytw ytwVar4 = ytwVar3;
                                                            objY7 = new Function0() { // from class: ori
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    ytwVar4.setValue(Boolean.TRUE);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar4.r(objY7);
                                                        }
                                                        nlm.a(i17, 390, aVar4, dVarH3, (Function0) objY7);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 3);
                                        }
                                        eqi eqiVar6 = eqiVar5;
                                        tri.i(szrVar, list2, "followed", "for_you_followed_account", eqiVar6);
                                        if (!list3.isEmpty()) {
                                            if (!list2.isEmpty() && !list3.isEmpty()) {
                                                szr.h(szrVar, "suggested_section_label", x29.d, 2);
                                            }
                                            tri.i(szrVar, list3, "suggested", "for_you_suggested_account", eqiVar6);
                                        }
                                        if (!list.isEmpty()) {
                                            tri.i(szrVar, list, "popular", "for_you_popular_account", eqiVar6);
                                        }
                                        if (uriVar3.f) {
                                            szr.h(szrVar, "for_you_load_more", x29.e, 2);
                                        }
                                        szr.h(szrVar, null, x29.f, 3);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY6);
                            }
                            zzr zzrVar = zzrVarA4;
                            aur.a(dVarH2, zzrVar, null, false, iVar, null, null, false, null, (Function1) objY6, aVar2, 24576, 492);
                            String str = uriVar2.e;
                            tri.h(zzrVar, ((str == null || str.length() == 0) || uriVar2.f || uriVar2.g) ? false : true, function14, aVar2, 0);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i9 >> 21) & 112) | 384);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-1878013701);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new r10(ytwVar, 2);
                    bVarI.r(objY2);
                }
                slm.c((Function0) objY2, bVarI, 6);
                bVarI.X(false);
            } else {
                bVarI.N(-1877916640);
                bVarI.X(false);
            }
            function13 = function15;
            function11 = function14;
        } else {
            bVarI.G();
            function11 = function9;
            function12 = function10;
            function13 = function8;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gri
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tri.a(uriVar, function1, function2, function3, function4, function5, function6, function11, function12, function13, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i2, int i3, androidx.compose.runtime.a aVar, final Function0 function0) {
        int i4;
        androidx.compose.runtime.b bVarI = aVar.i(2040575856);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (bVarI.A(function0) ? 4 : 2) | i2;
        }
        int i6 = 1;
        if (bVarI.q(i4 & 1, (i4 & 3) != 2)) {
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 != 0) {
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new zqi();
                    bVarI.r(objY);
                }
                function0 = (Function0) objY;
            }
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            e(false, function0, pp8.b(1558400099, new Function2() { // from class: ari
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(op70.c(j.e(aVar3, 1.0f), op70.a(aVar2), 14), c68.a(R.color.bg_secondary_d_lightest, aVar2), zk40.a);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        ty0.a(aVar2, j.i(aVar3, 12.0f));
                        d dVarH = h.h(aVar3, 16.0f, 0.0f, 2);
                        Object objY3 = aVar2.y();
                        if (objY3 == a.C0041a.a) {
                            objY3 = new u10(ytwVar, i7);
                            aVar2.r(objY3);
                        }
                        nlm.a(R.string.personal_page__for_you_suggested_guidance, 390, aVar2, dVarH, (Function0) objY3);
                        d dVarG = h.g(j.g(aVar3, 1.0f), 32.0f, 120.0f);
                        i78 i78VarA2 = g78.a(kw0.e, ht.a.n, aVar2, 54);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(cb40.a(R.string.personal_page__for_you_suggestions_load_failed, new Object[0], aVar2), g3w.h(aVar3, "for_you_error_message"), c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 130040);
                        ty0.a(aVar2, j.i(aVar3, 16.0f));
                        xya.b(g3w.h(aVar3, "for_you_error_retry"), false, sya.a(0L, 0L, 0L, 0L, aVar2, 24576, 15), sya.d, null, 0.0f, null, function0, x29.g, aVar2, 100663302, 114);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i4 << 3) & 112) | 390);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-169568179);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new ord(ytwVar, i6);
                    bVarI.r(objY3);
                }
                slm.c((Function0) objY3, bVarI, 6);
                bVarI.X(false);
            } else {
                bVarI.N(-169471118);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new bri(i2, i3, function0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0199  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:157:0x020c  */
    /* JADX WARN: Code duplicated, block: B:158:0x020e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0217  */
    /* JADX WARN: Code duplicated, block: B:162:0x0219  */
    /* JADX WARN: Code duplicated, block: B:165:0x0222  */
    /* JADX WARN: Code duplicated, block: B:166:0x0224  */
    /* JADX WARN: Code duplicated, block: B:169:0x022d  */
    /* JADX WARN: Code duplicated, block: B:170:0x022f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0239  */
    /* JADX WARN: Code duplicated, block: B:174:0x023b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0242  */
    /* JADX WARN: Code duplicated, block: B:178:0x0244  */
    /* JADX WARN: Code duplicated, block: B:181:0x024c  */
    /* JADX WARN: Code duplicated, block: B:182:0x024e  */
    /* JADX WARN: Code duplicated, block: B:186:0x025d  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:200:0x02af  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:211:0x02db  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:220:0x0302  */
    /* JADX WARN: Code duplicated, block: B:228:0x031b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0324  */
    /* JADX WARN: Code duplicated, block: B:241:0x0348  */
    /* JADX WARN: Code duplicated, block: B:245:0x0351  */
    /* JADX WARN: Code duplicated, block: B:254:0x0375  */
    /* JADX WARN: Code duplicated, block: B:258:0x037e  */
    /* JADX WARN: Code duplicated, block: B:267:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:280:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:286:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:296:0x040c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0410  */
    /* JADX WARN: Code duplicated, block: B:299:0x0412  */
    /* JADX WARN: Code duplicated, block: B:303:0x041c  */
    /* JADX WARN: Code duplicated, block: B:306:0x044f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0454  */
    /* JADX WARN: Code duplicated, block: B:317:0x046b  */
    /* JADX WARN: Code duplicated, block: B:319:0x046f  */
    /* JADX WARN: Code duplicated, block: B:320:0x0471  */
    /* JADX WARN: Code duplicated, block: B:324:0x047b  */
    /* JADX WARN: Code duplicated, block: B:326:0x048d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0496  */
    /* JADX WARN: Code duplicated, block: B:330:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:331:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:336:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:339:0x051d  */
    /* JADX WARN: Code duplicated, block: B:341:0x0525  */
    /* JADX WARN: Code duplicated, block: B:344:0x0538  */
    /* JADX WARN: Code duplicated, block: B:346:? A[RETURN, SYNTHETIC] */
    public static final void c(final bsi bsiVar, final int i2, final v3a0 v3a0Var, final Function1<? super String, Unit> function1, final Function1<? super jl00, Unit> function2, final Function2<? super String, ? super z7a0.d, Unit> function3, final Function1<? super z7a0.b, Unit> function4, final Function1<? super z7a0.a, Unit> function5, final Function1<? super z7a0.c, Unit> function6, final Function1<? super bba0, Unit> function7, final Function1<? super bba0.a, Unit> function8, final Function0<Unit> function0, Function1<? super String, Unit> function9, boolean z, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function10, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        final bsi bsiVar2;
        final Function1<? super String, Unit> function11;
        final Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function12;
        androidx.compose.runtime.b bVar;
        final boolean z3;
        androidx.compose.runtime.e eVarZ;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final Function1<? super String, Unit> function13;
        boolean z4;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function14;
        final Context context;
        Object objY2;
        final v5b v5bVar;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zA;
        Object objY3;
        int i11;
        androidx.compose.runtime.b bVar2;
        Function1<? super String, Unit> function15;
        boolean z15;
        int i12;
        boolean z16;
        boolean z17;
        Object objY4;
        final int i13;
        boolean z18;
        Object objY5;
        final boolean z19;
        msi msiVar;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z20;
        boolean z21;
        boolean z22;
        Object objY6;
        boolean z23;
        Object objY7;
        boolean z24;
        Object objY8;
        boolean z25;
        Object objY9;
        boolean z26;
        Object objY10;
        boolean z27;
        Object fVar;
        boolean z28;
        boolean z29;
        boolean z30;
        Object objY11;
        v3a0Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1700799099);
        if ((i3 & 6) == 0) {
            i6 = ((i3 & 8) == 0 ? bVarI.M(bsiVar) : bVarI.A(bsiVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bVarI.M(v3a0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= bVarI.A(function2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= bVarI.A(function5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= bVarI.A(function6) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= bVarI.A(function7) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (bVarI.A(function8) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= bVarI.A(function0) ? 32 : 16;
        }
        int i14 = i7;
        int i15 = i14 | 384;
        int i16 = i5 & 8192;
        if (i16 != 0) {
            i8 = i14 | 3456;
        } else if ((i4 & 3072) == 0) {
            i8 = i15 | (bVarI.b(z) ? 2048 : 1024);
        } else {
            i8 = i15;
        }
        int i17 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i17 == 0) {
            if ((i4 & 24576) == 0) {
                i8 |= bVarI.A(function10) ? 16384 : 8192;
            }
            if ((i6 & 306783379) == 306783378 || (i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i6 & 1, z2)) {
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = new rri();
                    bVarI.r(objY);
                }
                function13 = (Function1) objY;
                if (i16 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i17 != 0) {
                    function14 = x29.a;
                } else {
                    function14 = function10;
                }
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                ytw ytwVarC = wyh.c(bsiVar.A, bVarI, 0, 7);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                    bVarI.r(objY2);
                }
                v5bVar = (v5b) objY2;
                i9 = i6 & 14;
                if (i9 != 4 || ((i6 & 8) != 0 && bVarI.A(bsiVar))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i10 = i8;
                if ((i8 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z31 = z6 | z5;
                if ((i6 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zA2 = z31 | z7 | bVarI.A(context);
                if ((458752 & i6) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z32 = zA2 | z8;
                if ((3670016 & i6) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z33 = z32 | z9;
                if ((29360128 & i6) == 8388608) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z34 = z33 | z10;
                if ((234881024 & i6) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z35 = z34 | z11;
                if ((i6 & 1879048192) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z36 = z35 | z12;
                if ((i10 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z37 = z36 | z13;
                if ((i10 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zA = z37 | z14 | bVarI.A(v5bVar);
                objY3 = bVarI.y();
                if (!zA || objY3 == c0042a) {
                    i11 = 4;
                    bVar2 = bVarI;
                    Function0 function16 = new Function0() { // from class: sri
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            kzh.d(new g1i(bsiVar.B.b, new tri.a(function13, v3a0Var, context, function3, function4, function5, function6, function7, function8, function0, null)), v5bVar);
                            return Unit.a;
                        }
                    };
                    bsiVar2 = bsiVar;
                    function15 = function13;
                    bVar2.r(function16);
                    objY3 = function16;
                } else {
                    bsiVar2 = bsiVar;
                    function15 = function13;
                    bVar2 = bVarI;
                    i11 = 4;
                }
                xfa.b((Function0) objY3, bVar2, 0);
                if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i12 = i6 & 112;
                if (i12 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objY4 = bVar2.y();
                if (!z17 || objY4 == c0042a) {
                    i13 = i2;
                    objY4 = new Function0() { // from class: uqi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bsi bsiVar3 = bsiVar2;
                            v340 v340Var = bsiVar3.A;
                            boolean z38 = ((msi) v340Var.a.getValue()) instanceof msi.a;
                            int i18 = i13;
                            if (z38) {
                                bsiVar3.B1(i18);
                            } else if (!(v340Var.a.getValue() instanceof msi.a)) {
                                bsiVar3.C = i18;
                                bsiVar3.y1(null);
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY4);
                } else {
                    i13 = i2;
                }
                xfa.e((Function0) objY4, bVar2, 0);
                if ((i10 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objY5 = bVar2.y();
                if (!z18 || objY5 == c0042a) {
                    z19 = z4;
                    objY5 = new Function2() { // from class: vqi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            s9s.a aVar3 = (s9s.a) obj2;
                            ((ibs) obj).getClass();
                            aVar3.getClass();
                            if (z19) {
                                int i18 = tri.h.a[aVar3.ordinal()];
                                if (i18 == 1) {
                                    ftg.a(new t8a0(true));
                                } else if (i18 != 2) {
                                    Unit unit = Unit.a;
                                } else {
                                    ftg.a(new t8a0(false));
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                } else {
                    z19 = z4;
                }
                xfa.c(0, bVar2, (Function2) objY5);
                msiVar = (msi) ytwVarC.getValue();
                if (msiVar instanceof msi.a) {
                    bVar2.N(-774123808);
                    uri uriVar = ((msi.a) msiVar).a;
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    objY7 = bVar2.y();
                    if (z23 || objY7 == c0042a) {
                        b bVar3 = new b(1, bsiVar2, bsi.class, "follow", "follow(Ljava/lang/String;)V", 0);
                        bVar2.r(bVar3);
                        objY7 = bVar3;
                    }
                    chp chpVar = (chp) objY7;
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objY8 = bVar2.y();
                    if (z24 || objY8 == c0042a) {
                        c cVar = new c(1, bsiVar2, bsi.class, "onShareCode", "onShareCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                        bVar2.r(cVar);
                        objY8 = cVar;
                    }
                    chp chpVar2 = (chp) objY8;
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objY9 = bVar2.y();
                    if (z25 || objY9 == c0042a) {
                        d dVar = new d(1, bsiVar2, bsi.class, "onEditCode", "onEditCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                        bVar2.r(dVar);
                        objY9 = dVar;
                    }
                    chp chpVar3 = (chp) objY9;
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objY10 = bVar2.y();
                    if (z26 || objY10 == c0042a) {
                        e eVar = new e(1, bsiVar2, bsi.class, "onAddCode", "onAddCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                        bVar2.r(eVar);
                        objY10 = eVar;
                    }
                    chp chpVar4 = (chp) objY10;
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    Object objY12 = bVar2.y();
                    if (!z27 || objY12 == c0042a) {
                        fVar = new f(0, bsiVar2, bsi.class, "loadMore", "loadMore()V", 0);
                        bVar2.r(fVar);
                    } else {
                        fVar = objY12;
                    }
                    Function1 function17 = (Function1) chpVar;
                    Function1 function18 = (Function1) chpVar2;
                    Function1 function19 = (Function1) chpVar3;
                    Function1 function20 = (Function1) chpVar4;
                    Function0 function21 = (Function0) ((chp) fVar);
                    if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (i12 == 32) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = z28 | z29;
                    objY11 = bVar2.y();
                    if (z30 || objY11 == c0042a) {
                        objY11 = new Function0() { // from class: wqi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                bsiVar2.B1(i13);
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY11);
                    }
                    a(uriVar, function1, function17, function2, function18, function19, function20, function21, (Function0) objY11, function14, bVar2, ((i6 >> 6) & 112) | ((i6 >> 3) & 7168) | ((i10 << 15) & 1879048192), 0);
                    bVar2.X(false);
                } else {
                    bsiVar2 = bsiVar2;
                    if (msiVar instanceof msi.b) {
                        bVar2.N(-773579169);
                        if (i9 != i11 || ((i6 & 8) != 0 && bVar2.A(bsiVar2))) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (i12 == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z20 | z21;
                        objY6 = bVar2.y();
                        if (z22 || objY6 == c0042a) {
                            objY6 = new Function0() { // from class: xqi
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    bsiVar2.B1(i13);
                                    return Unit.a;
                                }
                            };
                            bVar2.r(objY6);
                        }
                        b(0, 0, bVar2, (Function0) objY6);
                        bVar2.X(false);
                    } else {
                        if (Intrinsics.g(msiVar, msi.c.a)) {
                            throw igf0.a(bVar2, 1914688802, false);
                        }
                        bVar2.N(-773406251);
                        androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                        androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar3, 1.0f);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        iHashCode = Long.hashCode(bVar2.T);
                        ne00 ne00VarS = bVar2.S();
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVar2, dVarE);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVar2.D();
                        if (bVar2.S) {
                            bVar2.F(aVar2);
                        } else {
                            bVar2.p();
                        }
                        hlh0.a(bVar2, aivVarC, yka.a.f);
                        hlh0.a(bVar2, ne00VarS, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                            n30.a(iHashCode, bVar2, iHashCode, c1350a);
                        }
                        hlh0.a(bVar2, dVarC, yka.a.d);
                        q330.a(dw.a(aVar3, 0.5f), c68.a(R.color.text_type1_secondary, bVar2), 0.0f, 0L, 0, 0.0f, bVar2, 6, 60);
                        bVar2.X(true);
                        bVar2.X(false);
                    }
                    bVar = bVar2;
                    function12 = function14;
                    function11 = function15;
                    z3 = z19;
                }
                bVar = bVar2;
                function12 = function14;
                function11 = function15;
                z3 = z19;
            } else {
                bsiVar2 = bsiVar;
                bVarI.G();
                function11 = function9;
                function12 = function10;
                bVar = bVarI;
                z3 = z;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: yqi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        tri.c(bsiVar2, i2, v3a0Var, function1, function2, function3, function4, function5, function6, function7, function8, function0, function11, z3, function12, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i8 |= 24576;
        if ((i6 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (bVarI.q(i6 & 1, z2)) {
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new rri();
                bVarI.r(objY);
            }
            function13 = (Function1) objY;
            if (i16 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i17 != 0) {
                function14 = x29.a;
            } else {
                function14 = function10;
            }
            context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            ytw ytwVarC2 = wyh.c(bsiVar.A, bVarI, 0, 7);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            v5bVar = (v5b) objY2;
            i9 = i6 & 14;
            if (i9 != 4) {
                z5 = true;
            } else {
                z5 = true;
            }
            i10 = i8;
            if ((i8 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z38 = z6 | z5;
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zA3 = z38 | z7 | bVarI.A(context);
            if ((458752 & i6) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z39 = zA3 | z8;
            if ((3670016 & i6) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z310 = z39 | z9;
            if ((29360128 & i6) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z311 = z310 | z10;
            if ((234881024 & i6) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z312 = z311 | z11;
            if ((i6 & 1879048192) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z313 = z312 | z12;
            if ((i10 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z314 = z313 | z13;
            if ((i10 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zA = z314 | z14 | bVarI.A(v5bVar);
            objY3 = bVarI.y();
            if (zA) {
                i11 = 4;
                bVar2 = bVarI;
                Function0 function110 = new Function0() { // from class: sri
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzh.d(new g1i(bsiVar.B.b, new tri.a(function13, v3a0Var, context, function3, function4, function5, function6, function7, function8, function0, null)), v5bVar);
                        return Unit.a;
                    }
                };
                bsiVar2 = bsiVar;
                function15 = function13;
                bVar2.r(function110);
                objY3 = function110;
            } else {
                i11 = 4;
                bVar2 = bVarI;
                Function0 function111 = new Function0() { // from class: sri
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzh.d(new g1i(bsiVar.B.b, new tri.a(function13, v3a0Var, context, function3, function4, function5, function6, function7, function8, function0, null)), v5bVar);
                        return Unit.a;
                    }
                };
                bsiVar2 = bsiVar;
                function15 = function13;
                bVar2.r(function111);
                objY3 = function111;
            }
            xfa.b((Function0) objY3, bVar2, 0);
            if (i9 != i11) {
                z15 = true;
            } else {
                z15 = true;
            }
            i12 = i6 & 112;
            if (i12 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objY4 = bVar2.y();
            if (z17) {
                i13 = i2;
                objY4 = new Function0() { // from class: uqi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        bsi bsiVar3 = bsiVar2;
                        v340 v340Var = bsiVar3.A;
                        boolean z315 = ((msi) v340Var.a.getValue()) instanceof msi.a;
                        int i18 = i13;
                        if (z315) {
                            bsiVar3.B1(i18);
                        } else if (!(v340Var.a.getValue() instanceof msi.a)) {
                            bsiVar3.C = i18;
                            bsiVar3.y1(null);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY4);
            } else {
                i13 = i2;
                objY4 = new Function0() { // from class: uqi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        bsi bsiVar3 = bsiVar2;
                        v340 v340Var = bsiVar3.A;
                        boolean z315 = ((msi) v340Var.a.getValue()) instanceof msi.a;
                        int i18 = i13;
                        if (z315) {
                            bsiVar3.B1(i18);
                        } else if (!(v340Var.a.getValue() instanceof msi.a)) {
                            bsiVar3.C = i18;
                            bsiVar3.y1(null);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY4);
            }
            xfa.e((Function0) objY4, bVar2, 0);
            if ((i10 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            objY5 = bVar2.y();
            if (z18) {
                z19 = z4;
                objY5 = new Function2() { // from class: vqi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s9s.a aVar4 = (s9s.a) obj2;
                        ((ibs) obj).getClass();
                        aVar4.getClass();
                        if (z19) {
                            int i18 = tri.h.a[aVar4.ordinal()];
                            if (i18 == 1) {
                                ftg.a(new t8a0(true));
                            } else if (i18 != 2) {
                                Unit unit = Unit.a;
                            } else {
                                ftg.a(new t8a0(false));
                            }
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY5);
            } else {
                z19 = z4;
                objY5 = new Function2() { // from class: vqi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s9s.a aVar4 = (s9s.a) obj2;
                        ((ibs) obj).getClass();
                        aVar4.getClass();
                        if (z19) {
                            int i18 = tri.h.a[aVar4.ordinal()];
                            if (i18 == 1) {
                                ftg.a(new t8a0(true));
                            } else if (i18 != 2) {
                                Unit unit = Unit.a;
                            } else {
                                ftg.a(new t8a0(false));
                            }
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY5);
            }
            xfa.c(0, bVar2, (Function2) objY5);
            msiVar = (msi) ytwVarC2.getValue();
            if (msiVar instanceof msi.a) {
                bVar2.N(-774123808);
                uri uriVar2 = ((msi.a) msiVar).a;
                if (i9 != i11) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                objY7 = bVar2.y();
                if (z23) {
                    b bVar4 = new b(1, bsiVar2, bsi.class, "follow", "follow(Ljava/lang/String;)V", 0);
                    bVar2.r(bVar4);
                    objY7 = bVar4;
                } else {
                    b bVar5 = new b(1, bsiVar2, bsi.class, "follow", "follow(Ljava/lang/String;)V", 0);
                    bVar2.r(bVar5);
                    objY7 = bVar5;
                }
                chp chpVar5 = (chp) objY7;
                if (i9 != i11) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                objY8 = bVar2.y();
                if (z24) {
                    c cVar2 = new c(1, bsiVar2, bsi.class, "onShareCode", "onShareCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(cVar2);
                    objY8 = cVar2;
                } else {
                    c cVar3 = new c(1, bsiVar2, bsi.class, "onShareCode", "onShareCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(cVar3);
                    objY8 = cVar3;
                }
                chp chpVar6 = (chp) objY8;
                if (i9 != i11) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                objY9 = bVar2.y();
                if (z25) {
                    d dVar2 = new d(1, bsiVar2, bsi.class, "onEditCode", "onEditCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(dVar2);
                    objY9 = dVar2;
                } else {
                    d dVar3 = new d(1, bsiVar2, bsi.class, "onEditCode", "onEditCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(dVar3);
                    objY9 = dVar3;
                }
                chp chpVar7 = (chp) objY9;
                if (i9 != i11) {
                    z26 = true;
                } else {
                    z26 = true;
                }
                objY10 = bVar2.y();
                if (z26) {
                    e eVar2 = new e(1, bsiVar2, bsi.class, "onAddCode", "onAddCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(eVar2);
                    objY10 = eVar2;
                } else {
                    e eVar3 = new e(1, bsiVar2, bsi.class, "onAddCode", "onAddCode(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeState;)V", 0);
                    bVar2.r(eVar3);
                    objY10 = eVar3;
                }
                chp chpVar8 = (chp) objY10;
                if (i9 != i11) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                Object objY13 = bVar2.y();
                if (z27) {
                    fVar = new f(0, bsiVar2, bsi.class, "loadMore", "loadMore()V", 0);
                    bVar2.r(fVar);
                } else {
                    fVar = new f(0, bsiVar2, bsi.class, "loadMore", "loadMore()V", 0);
                    bVar2.r(fVar);
                }
                Function1 function112 = (Function1) chpVar5;
                Function1 function113 = (Function1) chpVar6;
                Function1 function114 = (Function1) chpVar7;
                Function1 function22 = (Function1) chpVar8;
                Function0 function23 = (Function0) ((chp) fVar);
                if (i9 != i11) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                if (i12 == 32) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z30 = z28 | z29;
                objY11 = bVar2.y();
                if (z30) {
                    objY11 = new Function0() { // from class: wqi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bsiVar2.B1(i13);
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY11);
                } else {
                    objY11 = new Function0() { // from class: wqi
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bsiVar2.B1(i13);
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY11);
                }
                a(uriVar2, function1, function112, function2, function113, function114, function22, function23, (Function0) objY11, function14, bVar2, ((i6 >> 6) & 112) | ((i6 >> 3) & 7168) | ((i10 << 15) & 1879048192), 0);
                bVar2.X(false);
            } else {
                bsiVar2 = bsiVar2;
                if (msiVar instanceof msi.b) {
                    bVar2.N(-773579169);
                    if (i9 != i11) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    if (i12 == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z20 | z21;
                    objY6 = bVar2.y();
                    if (z22) {
                        objY6 = new Function0() { // from class: xqi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                bsiVar2.B1(i13);
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY6);
                    } else {
                        objY6 = new Function0() { // from class: xqi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                bsiVar2.B1(i13);
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY6);
                    }
                    b(0, 0, bVar2, (Function0) objY6);
                    bVar2.X(false);
                } else {
                    if (Intrinsics.g(msiVar, msi.c.a)) {
                        throw igf0.a(bVar2, 1914688802, false);
                    }
                    bVar2.N(-773406251);
                    androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
                    androidx.compose.ui.d dVarE2 = androidx.compose.foundation.layout.j.e(aVar4, 1.0f);
                    aiv aivVarC2 = g75.c(ht.a.e, false);
                    iHashCode = Long.hashCode(bVar2.T);
                    ne00 ne00VarS2 = bVar2.S();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar2, dVarE2);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVar2.D();
                    if (bVar2.S) {
                        bVar2.F(aVar2);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, aivVarC2, yka.a.f);
                    hlh0.a(bVar2, ne00VarS2, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVar2.S) {
                        n30.a(iHashCode, bVar2, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVar2, iHashCode, c1350a);
                    }
                    hlh0.a(bVar2, dVarC2, yka.a.d);
                    q330.a(dw.a(aVar4, 0.5f), c68.a(R.color.text_type1_secondary, bVar2), 0.0f, 0L, 0, 0.0f, bVar2, 6, 60);
                    bVar2.X(true);
                    bVar2.X(false);
                }
                bVar = bVar2;
                function12 = function14;
                function11 = function15;
                z3 = z19;
            }
            bVar = bVar2;
            function12 = function14;
            function11 = function15;
            z3 = z19;
        } else {
            bsiVar2 = bsiVar;
            bVarI.G();
            function11 = function9;
            function12 = function10;
            bVar = bVarI;
            z3 = z;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yqi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    tri.c(bsiVar2, i2, v3a0Var, function1, function2, function3, function4, function5, function6, function7, function8, function0, function11, z3, function12, (a) obj, iA, iA2, i5);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(676026619);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.layout.h.h(androidx.compose.foundation.layout.j.g(aVar2, 1.0f), 0.0f, 12.0f, 1), "for_you_load_more_progress");
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            q330.a(dw.a(androidx.compose.foundation.layout.j.r(aVar2, 24.0f), 0.5f), c68.a(R.color.text_type1_secondary, bVarI), 2.0f, 0L, 0, 0.0f, bVarI, 390, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vs9(i2);
        }
    }

    public static final void e(final boolean z, final Function0 function0, final op8 op8Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-699317738);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            d930 d930VarB = zcg.b(i3 & WebSocketProtocol.PAYLOAD_SHORT, bVarI, function0, z);
            androidx.compose.ui.d dVarA = a930.a(androidx.compose.foundation.layout.j.e(androidx.compose.ui.d.a.b, 1.0f), d930VarB);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            op8Var.invoke(bVarI, Integer.valueOf((i3 >> 6) & 14));
            f(z, d930VarB, bVarI, i4 | 64);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kri
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    tri.e(z, function0, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(boolean z, d930 d930Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final boolean z2;
        final d930 d930Var2;
        androidx.compose.runtime.b bVarI = aVar.i(-42766679);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bVarI.M(d930Var) : bVarI.A(d930Var) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            z2 = z;
            d930Var2 = d930Var;
            w830.b(z2, d930Var2, null, c68.a(R.color.background_type1_primary, bVarI), c68.a(R.color.text_type1_primary, bVarI), bVarI, (i3 & 14) | 64 | (i3 & 112), 36);
        } else {
            z2 = z;
            d930Var2 = d930Var;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mri
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    tri.f(z2, d930Var2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-195415495);
        int i3 = i2 | (bVarI.d(R.string.personal_page__suggested_follow_accounts) ? 4 : 2);
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.personal_page__suggested_follow_accounts, new Object[0], bVarI), g3w.h(androidx.compose.foundation.layout.h.h(androidx.compose.foundation.layout.j.g(androidx.compose.ui.d.a.b, 1.0f), 16.0f, 0.0f, 2), "for_you_suggested_section_label"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVar, 48, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new hri();
        }
    }

    public static final void h(final zzr zzrVar, final boolean z, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-907803238);
        int i3 = (bVarI.M(zzrVar) ? 4 : 2) | i2 | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = a6a0.b(new Function0() { // from class: tqi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzr kzrVarJ = zzrVar.j();
                        zyr zyrVar = (zyr) CollectionsKt.d0(kzrVarJ.k());
                        if (zyrVar == null || zyrVar.getIndex() < kzrVarJ.i() - 3) {
                            return null;
                        }
                        return Integer.valueOf(kzrVarJ.i());
                    }
                });
                bVarI.r(objY);
            }
            twd0 twd0Var = (twd0) objY;
            ytw ytwVarC = m.c(Boolean.valueOf(z), bVarI);
            Integer num = (Integer) twd0Var.getValue();
            boolean zM = bVarI.M(twd0Var) | bVarI.M(ytwVarC) | ((i3 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new g(function0, twd0Var, ytwVarC, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, num, (Function2) objY2);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, i2) { // from class: dri
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tri.h(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(szr szrVar, List<nqi> list, String str, String str2, eqi eqiVar) {
        szrVar.d(list.size(), new i(new pri(str), list), new j(new qri(str2), list), new op8(802480018, new k(list, eqiVar), true));
    }
}
