package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.bethistory.TGBetHistoryModel;
import com.sportygames.goldmine.bethistory.TGBetResponseModel;
import com.sportygames.newcms.CMSRes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class iue0 extends j8i0 {
    public final k5b a;
    public final t4l b;
    public final SimpleDateFormat c;
    public final SimpleDateFormat d;
    public final wwd0 e;
    public final v340 f;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements lyh<gue0.e> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ iue0 b;

        /* JADX INFO: renamed from: iue0$a$a, reason: collision with other inner class name */
        public static final class C0700a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ iue0 b;

            /* JADX INFO: renamed from: iue0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.bethistory.TGBetHistoryViewModel$fetch$$inlined$map$1$2", f = "TGBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0701a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0701a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0700a.this.emit(null, this);
                }
            }

            public C0700a(myh myhVar, iue0 iue0Var) {
                this.a = myhVar;
                this.b = iue0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0701a c0701a;
                if (v1bVar instanceof C0701a) {
                    c0701a = (C0701a) v1bVar;
                    int i = c0701a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0701a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0701a = new C0701a(v1bVar);
                    }
                } else {
                    c0701a = new C0701a(v1bVar);
                }
                Object obj2 = c0701a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0701a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    TGBetHistoryModel tGBetHistoryModel = (TGBetHistoryModel) em50.b((HTTPResponse) obj);
                    List<TGBetResponseModel> list = tGBetHistoryModel.getList();
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (TGBetResponseModel tGBetResponseModel : list) {
                        Date date = new Date(tGBetResponseModel.getCreateTime());
                        int id = tGBetResponseModel.getId();
                        iue0 iue0Var = this.b;
                        String str = iue0Var.c.format(date);
                        str.getClass();
                        String str2 = iue0Var.d.format(date);
                        str2.getClass();
                        double stakeAmount = tGBetResponseModel.getStakeAmount();
                        boolean z = Math.abs(tGBetResponseModel.getPayoutAmount()) > 1.0E-7d;
                        double payoutAmount = tGBetResponseModel.getPayoutAmount();
                        String ticketId = tGBetResponseModel.getTicketId();
                        String str3 = String.format(Locale.getDefault(), "%.2fx", Arrays.copyOf(new Object[]{Double.valueOf(tGBetResponseModel.getResult().getMultiplier())}, 1));
                        double giftAmount = tGBetResponseModel.getGiftAmount();
                        yue0 yue0Var = (yue0) CollectionsKt.V(tGBetResponseModel.getUserSelection().getCave(), yue0.c);
                        CMSRes cMSRes = yue0Var != null ? yue0Var.a : null;
                        List list2 = (List) CollectionsKt.V(tGBetResponseModel.getUserSelection().getCave(), v48.d);
                        arrayList.add(new lwe0(id, str, str2, stakeAmount, z, payoutAmount, ticketId, false, str3, giftAmount, cMSRes, list2 != null ? (CMSRes) CollectionsKt.V(tGBetResponseModel.getResult().getIndex(), list2) : null, (CMSRes) CollectionsKt.V(tGBetResponseModel.getResult().getIndex(), v48.c)));
                    }
                    gue0.e eVar = new gue0.e(a4h.f(arrayList), tGBetHistoryModel.getHasMore() ? fxe0.a.a : fxe0.c.a);
                    c0701a.b = 1;
                    if (this.a.emit(eVar, c0701a) == y5bVar) {
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

        public a(lyh lyhVar, iue0 iue0Var) {
            this.a = lyhVar;
            this.b = iue0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super gue0.e> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0700a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.goldmine.bethistory.TGBetHistoryViewModel$fetch$2", f = "TGBetHistoryViewModel.kt", l = {51, 57, 65, 74, 76}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<mk50<? extends gue0.e>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = iue0.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends gue0.e> mk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        
            if (kotlin.Unit.a == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        
            if (r0.y1(r1, r12, r11) == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
        
            if (kotlin.Unit.a == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        
            if (kotlin.Unit.a == r3) goto L49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iue0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void x1(Integer num) {
        kzh.d(ozh.c(new g1i(em50.a(new a(this.b.c(num), this)), new b(null)), this.a), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(wwd0 wwd0Var, Function1 function1, x1b x1bVar) {
        lue0 lue0Var;
        if (x1bVar instanceof lue0) {
            lue0Var = (lue0) x1bVar;
            int i = lue0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lue0Var.c = i - Integer.MIN_VALUE;
            } else {
                lue0Var = new lue0(this, x1bVar);
            }
        } else {
            lue0Var = new lue0(this, x1bVar);
        }
        Object obj = lue0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = lue0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            Object value = wwd0Var.getValue();
            gue0.d dVar = value instanceof gue0.d ? (gue0.d) value : null;
            if (dVar == null) {
                return Boolean.FALSE;
            }
            Object objInvoke = function1.invoke(dVar);
            lue0Var.c = 1;
            wwd0Var.setValue(objInvoke);
            if (Unit.a == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Boolean.TRUE;
    }

    public iue0(k5b k5bVar, t4l t4lVar) {
        k5bVar.getClass();
        t4lVar.getClass();
        this.a = k5bVar;
        this.b = t4lVar;
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        this.c = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(iKBWavCysVP.aCWlm, Locale.getDefault());
        simpleDateFormat2.setTimeZone(timeZone);
        this.d = simpleDateFormat2;
        wwd0 wwd0VarA = xwd0.a(gue0.c.a);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        x1(null);
    }
}
