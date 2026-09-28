package defpackage;

import com.appsflyer.internal.y;
import com.google.gson.stream.MalformedJsonException;
import com.google.protobuf.Reader;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.JsonErrorThrowable;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.RecommendBookingCodeRequestSource;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Share;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class u05 implements s05 {
    public static final List<Integer> k = b.k(0, Integer.valueOf(Reader.READ_DONE));
    public final h3z a;
    public final g3z b;
    public final lq1 c;
    public final m2l d;
    public final x7a0 e;
    public final lrm f;
    public final jrm g;
    public final yqm h;
    public final wwd0 i;
    public ie00 j;

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.bookingcode.data.repository.BookingCodeRepositoryImpl$getFeaturedCodesFlow$1", f = "BookingCodeRepositoryImpl.kt", l = {238, 83, 88}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super List<? extends BookingCodeInfoDto>>, Object> {
        public u05 a;
        public BOConfigParam b;
        public Boolean c;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return u05.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends BookingCodeInfoDto>> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0077  */
        /* JADX WARN: Code duplicated, block: B:92:0x014b  */
        /* JADX WARN: Code duplicated, block: B:95:0x0155  */
        /* JADX WARN: Code duplicated, block: B:96:0x0158  */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0164, code lost:
        
            if (r9 == r0) goto L99;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 435
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u05.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public u05(h3z h3zVar, g3z g3zVar, lq1 lq1Var, m2l m2lVar, x7a0 x7a0Var, lrm lrmVar, jrm jrmVar, yqm yqmVar) {
        g3zVar.getClass();
        lq1Var.getClass();
        m2lVar.getClass();
        x7a0Var.getClass();
        lrmVar.getClass();
        jrmVar.getClass();
        yqmVar.getClass();
        this.a = h3zVar;
        this.b = g3zVar;
        this.c = lq1Var;
        this.d = m2lVar;
        this.e = x7a0Var;
        this.f = lrmVar;
        this.g = jrmVar;
        this.h = yqmVar;
        this.i = xwd0.a(lk50.b.a);
        this.j = ie00.CONTROL;
    }

    public static ArrayList n(List list) {
        ArrayList arrayList = null;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) it.next()).longValue() / 1000));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.s05
    public final lyh<lk50<List<BookingCodeInfoDto>>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return su0.a(this.i, pu0Var, new a(null));
    }

    @Override // defpackage.s05
    public final yzh b(BookingCodeFilterDto bookingCodeFilterDto, List list, List list2, String str, int i) {
        bookingCodeFilterDto.getClass();
        list.getClass();
        list2.getClass();
        return bm50.a(new or60(new y05(this, bookingCodeFilterDto, list, list2, str, i, null)));
    }

    @Override // defpackage.s05
    public final Object c(uch uchVar) {
        if (this.j != ie00.VARIANT_1) {
            return Unit.a;
        }
        x66<ie00> x66Var = z76.j;
        return this.h.c(x66Var.a, (String) CollectionsKt.T(x66Var.b), null, uchVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object d(String str, x1b x1bVar) throws Exception {
        z05 z05Var;
        if (x1bVar instanceof z05) {
            z05Var = (z05) x1bVar;
            int i = z05Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z05Var.c = i - Integer.MIN_VALUE;
            } else {
                z05Var = new z05(this, x1bVar);
            }
        } else {
            z05Var = new z05(this, x1bVar);
        }
        Object objL = z05Var.a;
        y5b y5bVar = y5b.a;
        int i2 = z05Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objL);
                if (str == null || StringsKt.U(str)) {
                    y.a("Booking code is null or blank.");
                    return null;
                }
                h3z h3zVar = this.a;
                z05Var.c = 1;
                objL = h3zVar.l(str, z05Var);
                if (objL == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objL);
            }
            BookingData bookingData = (BookingData) n52.b((BaseResponse) objL);
            String str2 = bookingData.shareCode;
            if (str2 == null || StringsKt.U(str2)) {
                y.a("shareCode in dto is null or blank.");
                return null;
            }
            List<Event> list = bookingData.outcomes;
            if (list != null && !list.isEmpty()) {
                return bookingData;
            }
            y.a("outcomes in dto is null or empty.");
            return null;
        } catch (MalformedJsonException unused) {
            throw new JsonErrorThrowable(0);
        } catch (qep unused2) {
            throw new JsonErrorThrowable(0);
        }
    }

    @Override // defpackage.s05
    public final yzh e(BookingCodeFilterDto bookingCodeFilterDto) {
        bookingCodeFilterDto.getClass();
        return bm50.a(new or60(new v05(bookingCodeFilterDto, this, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object f(boolean z, int i, zz80 zz80Var, x1b x1bVar) throws Exception {
        x05 x05Var;
        if (x1bVar instanceof x05) {
            x05Var = (x05) x1bVar;
            int i2 = x05Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x05Var.c = i2 - Integer.MIN_VALUE;
            } else {
                x05Var = new x05(this, x1bVar);
            }
        } else {
            x05Var = new x05(this, x1bVar);
        }
        Object objG = x05Var.a;
        y5b y5bVar = y5b.a;
        int i3 = x05Var.c;
        lrm lrmVar = this.f;
        if (i3 == 0) {
            uj50.b(objG);
            String strO = g880.o(this.g.U(), new Integer(i), lrmVar.B(), zz80Var);
            x05Var.c = 1;
            objG = this.e.g(strO, z, x05Var);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objG);
        }
        BookingData bookingData = (BookingData) n52.b((BaseResponse) objG);
        String str = bookingData.shareCode;
        if (str == null || StringsKt.U(str)) {
            y.a("shareCode in bookingData is null or blank.");
            return null;
        }
        Share share = new Share(bookingData.shareCode, bookingData.shareURL);
        share.outcomes = bookingData.outcomes;
        share.unavailableOutcomes = bookingData.unavailableOutcomes;
        lrmVar.w(share);
        return bookingData;
    }

    @Override // defpackage.s05
    public final zed.h g() {
        m2l m2lVar = this.d;
        m2lVar.getClass();
        return (zed.h) m2lVar.a.getBooleanByFlow("RECOMMENDED_CODE_ARROW_STATE", true);
    }

    @Override // defpackage.s05
    public final zed.h h() {
        m2l m2lVar = this.d;
        m2lVar.getClass();
        return (zed.h) m2lVar.a.getBooleanByFlow("POST_BET_UPSELL_BANNER_ARROW_STATE", true);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object i(x1b x1bVar) {
        b15 b15Var;
        int i;
        if (x1bVar instanceof b15) {
            b15Var = (b15) x1bVar;
            int i2 = b15Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b15Var.d = i2 - Integer.MIN_VALUE;
            } else {
                b15Var = new b15(this, x1bVar);
            }
        } else {
            b15Var = new b15(this, x1bVar);
        }
        Object obj = b15Var.b;
        y5b y5bVar = y5b.a;
        int i3 = b15Var.d;
        m2l m2lVar = this.d;
        if (i3 == 0) {
            uj50.b(obj);
            b15Var.d = 1;
            obj = m2lVar.a.getBoolean("RECOMMENDED_CODE_ARROW_STATE", true, b15Var);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 == 1) {
            uj50.b(obj);
        } else {
            if (i3 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = b15Var.a;
            uj50.b(obj);
        }
        return Boolean.valueOf(i != 0);
        boolean z = !((Boolean) obj).booleanValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        b15Var.a = z ? 1 : 0;
        b15Var.d = 2;
        if (m2lVar.a.putBoolean("RECOMMENDED_CODE_ARROW_STATE", boolValueOf, b15Var) != y5bVar) {
            i = z ? 1 : 0;
            return Boolean.valueOf(i != 0);
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object j(x1b x1bVar) {
        a15 a15Var;
        int i;
        if (x1bVar instanceof a15) {
            a15Var = (a15) x1bVar;
            int i2 = a15Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a15Var.d = i2 - Integer.MIN_VALUE;
            } else {
                a15Var = new a15(this, x1bVar);
            }
        } else {
            a15Var = new a15(this, x1bVar);
        }
        Object obj = a15Var.b;
        y5b y5bVar = y5b.a;
        int i3 = a15Var.d;
        m2l m2lVar = this.d;
        if (i3 == 0) {
            uj50.b(obj);
            a15Var.d = 1;
            obj = m2lVar.a.getBoolean("POST_BET_UPSELL_BANNER_ARROW_STATE", true, a15Var);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 == 1) {
            uj50.b(obj);
        } else {
            if (i3 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = a15Var.a;
            uj50.b(obj);
        }
        return Boolean.valueOf(i != 0);
        boolean z = !((Boolean) obj).booleanValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        a15Var.a = z ? 1 : 0;
        a15Var.d = 2;
        if (m2lVar.a.putBoolean("POST_BET_UPSELL_BANNER_ARROW_STATE", boolValueOf, a15Var) != y5bVar) {
            i = z ? 1 : 0;
            return Boolean.valueOf(i != 0);
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object l(String str, RecommendBookingCodeRequestSource recommendBookingCodeRequestSource, int i, x1b x1bVar) {
        w05 w05Var;
        if (x1bVar instanceof w05) {
            w05Var = (w05) x1bVar;
            int i2 = w05Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w05Var.c = i2 - Integer.MIN_VALUE;
            } else {
                w05Var = new w05(this, x1bVar);
            }
        } else {
            w05Var = new w05(this, x1bVar);
        }
        Object objR = w05Var.a;
        y5b y5bVar = y5b.a;
        int i3 = w05Var.c;
        if (i3 == 0) {
            uj50.b(objR);
            int source = recommendBookingCodeRequestSource.getSource();
            w05Var.c = 1;
            objR = this.b.r(str, source, i, w05Var);
            if (objR == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objR);
        }
        return n52.b((BaseResponse) objR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s05
    public final Object m(String str, x1b x1bVar) {
        t05 t05Var;
        Object bVar;
        if (x1bVar instanceof t05) {
            t05Var = (t05) x1bVar;
            int i = t05Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t05Var.c = i - Integer.MIN_VALUE;
            } else {
                t05Var = new t05(this, x1bVar);
            }
        } else {
            t05Var = new t05(this, x1bVar);
        }
        Object objL = t05Var.a;
        y5b y5bVar = y5b.a;
        int i2 = t05Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objL);
                zi50.a aVar = zi50.b;
                g3z g3zVar = this.b;
                t05Var.c = 1;
                objL = g3zVar.l(str, t05Var);
                if (objL == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objL);
            }
            bVar = (Boolean) n52.b((BaseResponse) objL);
            bVar.getClass();
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Boolean bool = (Boolean) (bVar instanceof zi50.b ? null : bVar);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @Override // defpackage.s05
    public final Object k(zch zchVar) {
        return this.d.a.putBoolean(qUnCRF.Nzky, Boolean.TRUE, zchVar);
    }
}
