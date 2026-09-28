package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import com.sportygames.piggybash.data.model.http.PBBetHistoryModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class pkz extends j8i0 {
    public final k5b a;
    public final lym b;
    public final yzm c;
    public final SimpleDateFormat d;
    public final SimpleDateFormat e;
    public final SimpleDateFormat f;
    public final wwd0 i;
    public final v340 v;

    public static final class a implements lyh<okz.e> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ pkz b;

        /* JADX INFO: renamed from: pkz$a$a, reason: collision with other inner class name */
        public static final class C0975a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ pkz b;

            /* JADX INFO: renamed from: pkz$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PBBetHistoryViewModel$fetch$$inlined$map$1$2", f = "PBBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0976a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0976a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0975a.this.emit(null, this);
                }
            }

            public C0975a(myh myhVar, pkz pkzVar) {
                this.a = myhVar;
                this.b = pkzVar;
            }

            /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0976a c0976a;
                Object bVar;
                vkz vkzVar;
                if (v1bVar instanceof C0976a) {
                    c0976a = (C0976a) v1bVar;
                    int i = c0976a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0976a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0976a = new C0976a(v1bVar);
                    }
                } else {
                    c0976a = new C0976a(v1bVar);
                }
                Object obj2 = c0976a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0976a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    pkz pkzVar = this.b;
                    PBBetHistoryModel pBBetHistoryModel = (PBBetHistoryModel) em50.b((HTTPResponse) obj);
                    List<PBBetHistoryItemDTO> list = pBBetHistoryModel.getList();
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (PBBetHistoryItemDTO pBBetHistoryItemDTO : list) {
                        try {
                            zi50.a aVar = zi50.b;
                            String createdAt = pBBetHistoryItemDTO.getCreatedAt();
                            Regex regex = new Regex("([+-])(\\d{2}):(\\d{2})$");
                            createdAt.getClass();
                            String strReplaceFirst = regex.a.matcher(createdAt).replaceFirst("$1$2$3");
                            strReplaceFirst.getClass();
                            Date date = pkzVar.f.parse(strReplaceFirst);
                            bVar = Long.valueOf(date != null ? date.getTime() : 0L);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (bVar instanceof zi50.b) {
                            bVar = 0L;
                        }
                        Date date2 = new Date(((Number) bVar).longValue());
                        String betStatus = pBBetHistoryItemDTO.getBetStatus();
                        int iHashCode = betStatus.hashCode();
                        if (iHashCode != -1031784143) {
                            if (iHashCode != 86134) {
                                if (iHashCode == 2342692 && betStatus.equals(PBBetHistoryItemDTO.STATUS_LOST)) {
                                    vkzVar = vkz.b;
                                } else {
                                    vkzVar = vkz.d;
                                }
                            } else if (betStatus.equals(PBBetHistoryItemDTO.STATUS_WON)) {
                                vkzVar = vkz.a;
                            } else {
                                vkzVar = vkz.d;
                            }
                        } else if (betStatus.equals(PBBetHistoryItemDTO.STATUS_CANCELLED)) {
                            vkzVar = vkz.c;
                        } else {
                            vkzVar = vkz.d;
                        }
                        vkz vkzVar2 = vkzVar;
                        int id = pBBetHistoryItemDTO.getId();
                        String str = pkzVar.d.format(date2);
                        str.getClass();
                        String str2 = pkzVar.e.format(date2);
                        str2.getClass();
                        arrayList.add(new dlz(id, str, str2, pBBetHistoryItemDTO.getStakeAmount(), vkzVar2, pBBetHistoryItemDTO.getPayoutAmount(), pBBetHistoryItemDTO.getTicketId(), String.valueOf(pBBetHistoryItemDTO.getRoundId()), false, pBBetHistoryItemDTO.getMajorPrizeAmount(), pBBetHistoryItemDTO.getBonusPrizeAmount(), pBBetHistoryItemDTO.getGoldRainAmount()));
                    }
                    okz.e eVar = new okz.e(a4h.f(arrayList), pBBetHistoryModel.getHasMore() ? elz.a.a : elz.c.a);
                    c0976a.b = 1;
                    if (this.a.emit(eVar, c0976a) == y5bVar) {
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

        public a(lyh lyhVar, pkz pkzVar) {
            this.a = lyhVar;
            this.b = pkzVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super okz.e> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0975a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PBBetHistoryViewModel$fetch$2", f = "PBBetHistoryViewModel.kt", l = {63, 69, 76, 84, 86}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<mk50<? extends okz.e>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = pkz.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends okz.e> mk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        
            if (kotlin.Unit.a == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        
            if (r0.y1(r1, r12, r11) == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        
            if (kotlin.Unit.a == r3) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        
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
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pkz.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public pkz(k5b k5bVar, lym lymVar, yzm yzmVar) {
        k5bVar.getClass();
        lymVar.getClass();
        yzmVar.getClass();
        this.a = k5bVar;
        this.b = lymVar;
        this.c = yzmVar;
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        this.d = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        simpleDateFormat2.setTimeZone(timeZone);
        this.e = simpleDateFormat2;
        this.f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
        wwd0 wwd0VarA = xwd0.a(okz.c.a);
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        x1(0);
    }

    public final void x1(int i) {
        kzh.d(ozh.c(new g1i(em50.a(new a(this.b.c(Integer.valueOf(i)), this)), new b(null)), this.a), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(wwd0 wwd0Var, Function1 function1, x1b x1bVar) {
        ukz ukzVar;
        if (x1bVar instanceof ukz) {
            ukzVar = (ukz) x1bVar;
            int i = ukzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukzVar.c = i - Integer.MIN_VALUE;
            } else {
                ukzVar = new ukz(this, x1bVar);
            }
        } else {
            ukzVar = new ukz(this, x1bVar);
        }
        Object obj = ukzVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ukzVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            Object value = wwd0Var.getValue();
            okz.d dVar = value instanceof okz.d ? (okz.d) value : null;
            if (dVar == null) {
                return Boolean.FALSE;
            }
            Object objInvoke = function1.invoke(dVar);
            ukzVar.c = 1;
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
