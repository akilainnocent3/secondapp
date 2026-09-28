package defpackage;

import android.graphics.Color;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.wheelanddeal.model.WDBetHistoryModel;
import com.sportygames.wheelanddeal.model.WDBetResponseModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class iqi0 extends j8i0 {
    public final kti0 a;
    public final odd b;
    public final SimpleDateFormat c;
    public final SimpleDateFormat d;
    public final wwd0 e;
    public final v340 f;

    public static final class a implements lyh<hqi0.d> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ iqi0 b;

        /* JADX INFO: renamed from: iqi0$a$a, reason: collision with other inner class name */
        public static final class C0691a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ iqi0 b;

            /* JADX INFO: renamed from: iqi0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.bethistory.WDBetHistoryViewModel$fetch$$inlined$map$1$2", f = "WDBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0692a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0692a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0691a.this.emit(null, this);
                }
            }

            public C0691a(myh myhVar, iqi0 iqi0Var) {
                this.a = myhVar;
                this.b = iqi0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0692a c0692a;
                Object next;
                if (v1bVar instanceof C0692a) {
                    c0692a = (C0692a) v1bVar;
                    int i = c0692a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0692a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0692a = new C0692a(v1bVar);
                    }
                } else {
                    c0692a = new C0692a(v1bVar);
                }
                Object obj2 = c0692a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0692a.b;
                boolean z = true;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WDBetHistoryModel wDBetHistoryModel = (WDBetHistoryModel) em50.b((HTTPResponse) obj);
                    List<WDBetResponseModel> list = wDBetHistoryModel.getList();
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (WDBetResponseModel wDBetResponseModel : list) {
                        Date date = new Date(wDBetResponseModel.getCreateTime());
                        List<String> color = wDBetResponseModel.getResult().getColor();
                        ArrayList arrayList2 = new ArrayList(l48.r(color, i3));
                        Iterator<T> it = color.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new j58(r58.b(Color.parseColor((String) it.next()))));
                        }
                        float size = 360.0f / wDBetResponseModel.getResult().getArrangement().size();
                        float f = size / 2.0f;
                        int id = wDBetResponseModel.getId();
                        iqi0 iqi0Var = this.b;
                        String str = iqi0Var.c.format(date);
                        str.getClass();
                        String str2 = iqi0Var.d.format(date);
                        str2.getClass();
                        double stakeAmount = wDBetResponseModel.getStakeAmount();
                        boolean z2 = Math.abs(wDBetResponseModel.getPayoutAmount()) > 1.0E-7d ? z : false;
                        double payoutAmount = wDBetResponseModel.getPayoutAmount();
                        Iterator<T> it2 = oti0.f.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!((oti0) next).a.equals(wDBetResponseModel.getUserSelection().getRisk()));
                        next.getClass();
                        oti0 oti0Var = (oti0) next;
                        String ticketId = wDBetResponseModel.getTicketId();
                        List<Integer> arrangement = wDBetResponseModel.getResult().getArrangement();
                        ArrayList arrayList3 = new ArrayList(l48.r(arrangement, i3));
                        Iterator<T> it3 = arrangement.iterator();
                        while (it3.hasNext()) {
                            j58 j58Var = (j58) arrayList2.get(((Number) it3.next()).intValue());
                            long j = j58Var.a;
                            arrayList3.add(j58Var);
                            wDBetResponseModel = wDBetResponseModel;
                        }
                        WDBetResponseModel wDBetResponseModel2 = wDBetResponseModel;
                        arrayList.add(new ori0(id, str, str2, stakeAmount, z2, payoutAmount, oti0Var, ticketId, a4h.f(arrayList3), (size * (wDBetResponseModel2.getResult().getArrangement().size() - wDBetResponseModel2.getResult().getIndex())) - f, false, String.format(Locale.getDefault(), "%.2fx", Arrays.copyOf(new Object[]{Double.valueOf(wDBetResponseModel2.getResult().getMultiplier())}, 1)), wDBetResponseModel2.getGiftAmount()));
                        z = true;
                        i3 = 10;
                    }
                    hqi0.d dVar = new hqi0.d(a4h.f(arrayList), wDBetHistoryModel.getHasMore() ? wri0.a.a : wri0.c.a);
                    c0692a.b = 1;
                    if (this.a.emit(dVar, c0692a) == y5bVar) {
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

        public a(lyh lyhVar, iqi0 iqi0Var) {
            this.a = lyhVar;
            this.b = iqi0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super hqi0.d> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0691a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.bethistory.WDBetHistoryViewModel$fetch$2", f = "WDBetHistoryViewModel.kt", l = {55, 57, 63, 71, 73}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<mk50<? extends hqi0.d>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = iqi0.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends hqi0.d> mk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0083  */
        /* JADX WARN: Code duplicated, block: B:36:0x0091  */
        /* JADX WARN: Code duplicated, block: B:39:0x009f  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if (kotlin.Unit.a == r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        
            if (r0.y1(r1, r12, r11) == r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        
            if (kotlin.Unit.a == r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
        
            if (kotlin.Unit.a == r3) goto L41;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                iqi0 r0 = defpackage.iqi0.this
                wwd0 r1 = r0.e
                java.lang.Object r2 = r11.b
                mk50 r2 = (defpackage.mk50) r2
                y5b r3 = defpackage.y5b.a
                int r4 = r11.a
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                r10 = 0
                if (r4 == 0) goto L37
                if (r4 == r9) goto L33
                if (r4 == r8) goto L2e
                if (r4 == r7) goto L2a
                if (r4 == r6) goto L25
                if (r4 != r5) goto L1f
                goto L25
            L1f:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                return r10
            L25:
                defpackage.uj50.b(r12)
                goto Lad
            L2a:
                defpackage.uj50.b(r12)
                goto L7b
            L2e:
                defpackage.uj50.b(r12)
                goto Laf
            L33:
                defpackage.uj50.b(r12)
                goto L4c
            L37:
                defpackage.uj50.b(r12)
                boolean r12 = r2 instanceof mk50.a
                if (r12 == 0) goto L4f
                hqi0$b r12 = hqi0.b.a
                r11.b = r10
                r11.a = r9
                r1.setValue(r12)
                kotlin.Unit r11 = kotlin.Unit.a
                if (r11 != r3) goto L4c
                goto Lac
            L4c:
                kotlin.Unit r11 = kotlin.Unit.a
                goto Laf
            L4f:
                mk50$b r12 = mk50.b.a
                boolean r12 = kotlin.jvm.internal.Intrinsics.g(r2, r12)
                if (r12 == 0) goto L67
                jqi0 r12 = new jqi0
                r12.<init>()
                r11.b = r10
                r11.a = r8
                java.lang.Object r11 = r0.y1(r1, r12, r11)
                if (r11 != r3) goto Laf
                goto Lac
            L67:
                boolean r12 = r2 instanceof mk50.c
                if (r12 == 0) goto Lb2
                kqi0 r12 = new kqi0
                r12.<init>()
                r11.b = r2
                r11.a = r7
                java.lang.Object r12 = r0.y1(r1, r12, r11)
                if (r12 != r3) goto L7b
                goto Lac
            L7b:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lad
                mk50$c r2 = (mk50.c) r2
                T r12 = r2.a
                hqi0$d r12 = (hqi0.d) r12
                uf00<ori0> r12 = r12.a
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L9f
                hqi0$a r12 = hqi0.a.a
                r11.b = r10
                r11.a = r6
                r1.setValue(r12)
                kotlin.Unit r11 = kotlin.Unit.a
                if (r11 != r3) goto Lad
                goto Lac
            L9f:
                T r12 = r2.a
                r11.b = r10
                r11.a = r5
                r1.setValue(r12)
                kotlin.Unit r11 = kotlin.Unit.a
                if (r11 != r3) goto Lad
            Lac:
                return r3
            Lad:
                kotlin.Unit r11 = kotlin.Unit.a
            Laf:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            Lb2:
                defpackage.uhc.a()
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: iqi0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public iqi0(kti0 kti0Var) {
        kti0Var.getClass();
        this.a = kti0Var;
        pfd pfdVar = fse.a;
        this.b = odd.b;
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        this.c = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        simpleDateFormat2.setTimeZone(timeZone);
        this.d = simpleDateFormat2;
        wwd0 wwd0VarA = xwd0.a(hqi0.c.a);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        x1(null);
    }

    public final void x1(Integer num) {
        kzh.d(ozh.c(new g1i(em50.a(new a(this.a.c(num), this)), new b(null)), this.b), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(wwd0 wwd0Var, Function1 function1, x1b x1bVar) {
        lqi0 lqi0Var;
        if (x1bVar instanceof lqi0) {
            lqi0Var = (lqi0) x1bVar;
            int i = lqi0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lqi0Var.c = i - Integer.MIN_VALUE;
            } else {
                lqi0Var = new lqi0(this, x1bVar);
            }
        } else {
            lqi0Var = new lqi0(this, x1bVar);
        }
        Object obj = lqi0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = lqi0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            Object value = wwd0Var.getValue();
            hqi0.d dVar = value instanceof hqi0.d ? (hqi0.d) value : null;
            if (dVar == null) {
                return Boolean.FALSE;
            }
            Object objInvoke = function1.invoke(dVar);
            lqi0Var.c = 1;
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
}
