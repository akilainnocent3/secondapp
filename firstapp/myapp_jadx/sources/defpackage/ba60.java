package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBBetHistoryDTO;
import com.sportygames.speedybingo.data.dto.SBBetHistoryItemDTO;
import com.sportygames.speedybingo.data.dto.SBExtraDTO;
import com.sportygames.speedybingo.data.dto.SBGameResultDTO;
import com.sportygames.speedybingo.data.dto.SBTicketDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ba60 implements lyh<f860.a> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ da60 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ da60 b;

        /* JADX INFO: renamed from: ba60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewModel$getBetHistory$$inlined$map$1$2", f = "SBBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
        public static final class C0116a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0116a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, da60 da60Var) {
            this.a = myhVar;
            this.b = da60Var;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x0344  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.math.BigDecimal] */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r32v0 */
        /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r32v2 */
        /* JADX WARN: Type inference failed for: r33v0 */
        /* JADX WARN: Type inference failed for: r33v1, types: [java.math.BigDecimal] */
        /* JADX WARN: Type inference failed for: r33v2 */
        /* JADX WARN: Type inference failed for: r34v0 */
        /* JADX WARN: Type inference failed for: r34v1, types: [java.math.BigDecimal] */
        /* JADX WARN: Type inference failed for: r34v2 */
        /* JADX WARN: Type inference failed for: r6v23 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v4 */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws Throwable {
            C0116a c0116a;
            qcn<r860> qcnVar;
            ?? r6;
            f860.a aVar;
            ?? r14;
            BigDecimal bigDecimalValueOf;
            uf00 uf00VarF;
            ?? r33;
            ?? r34;
            Object obj2;
            SBGameResultDTO result;
            List<Integer> numbers;
            ?? r11;
            if (v1bVar instanceof C0116a) {
                c0116a = (C0116a) v1bVar;
                int i = c0116a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0116a.b = i - Integer.MIN_VALUE;
                } else {
                    c0116a = new C0116a(v1bVar);
                }
            } else {
                c0116a = new C0116a(v1bVar);
            }
            Object obj3 = c0116a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0116a.b;
            int i3 = 1;
            Throwable th = null;
            if (i2 == 0) {
                uj50.b(obj3);
                SBBetHistoryDTO sBBetHistoryDTO = (SBBetHistoryDTO) em50.b((HTTPResponse) obj);
                f860 f860Var = (f860) this.b.d.a.getValue();
                f860Var.getClass();
                List<SBBetHistoryItemDTO> list = sBBetHistoryDTO.getList();
                int i4 = 10;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    SBBetHistoryItemDTO sBBetHistoryItemDTO = (SBBetHistoryItemDTO) it.next();
                    int id = sBBetHistoryItemDTO.getId();
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(sBBetHistoryItemDTO.getStakeAmount());
                    bigDecimalValueOf2.getClass();
                    BigDecimal bigDecimal = skd0.b;
                    Double giftAmount = sBBetHistoryItemDTO.getGiftAmount();
                    if (giftAmount == null) {
                        r14 = th;
                    } else {
                        if (Math.abs(giftAmount.doubleValue()) <= 1.0E-6d) {
                            r11 = giftAmount;
                            r11 = th;
                        }
                        if (r11 != 0) {
                            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(r11.doubleValue());
                            bigDecimalValueOf3.getClass();
                            r14 = bigDecimalValueOf3;
                        } else {
                            r14 = th;
                        }
                    }
                    BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(sBBetHistoryItemDTO.getPayoutAmount());
                    bigDecimalValueOf4.getClass();
                    String ticketId = sBBetHistoryItemDTO.getTicketId();
                    String currency = sBBetHistoryItemDTO.getCurrency();
                    long createTime = sBBetHistoryItemDTO.getCreateTime();
                    lx30.Companion companion = lx30.INSTANCE;
                    BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(sBBetHistoryItemDTO.getStakeAmount());
                    bigDecimalValueOf5.getClass();
                    List<Double> multipliers = sBBetHistoryItemDTO.getResult().getMultipliers();
                    Throwable th2 = th;
                    int i5 = i3;
                    ArrayList arrayList2 = new ArrayList(l48.r(multipliers, i4));
                    Iterator<T> it2 = multipliers.iterator();
                    while (it2.hasNext()) {
                        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(((Number) it2.next()).doubleValue());
                        bigDecimalValueOf6.getClass();
                        arrayList2.add(new skd0(bigDecimalValueOf6));
                    }
                    uf00 uf00VarF2 = a4h.f(arrayList2);
                    Double extraBallPrice = sBBetHistoryItemDTO.getResult().getExtraBallPrice();
                    if (extraBallPrice != null) {
                        bigDecimalValueOf = BigDecimal.valueOf(extraBallPrice.doubleValue());
                        bigDecimalValueOf.getClass();
                    } else {
                        bigDecimalValueOf = skd0.b;
                    }
                    SBExtraDTO extra = sBBetHistoryItemDTO.getExtra();
                    if (extra == null || (result = extra.getResult()) == null || (numbers = result.getNumbers()) == null || (uf00VarF = a4h.f(numbers)) == null) {
                        uf00VarF = n1a0.c;
                    }
                    ub60 ub60Var = new ub60(bigDecimalValueOf5, uf00VarF2, sBBetHistoryItemDTO.getUserSelection().getTickets().size(), new xc60(bigDecimalValueOf, uf00VarF, 8), 393);
                    List<Integer> numbers2 = sBBetHistoryItemDTO.getResult().getNumbers();
                    List<Integer> numbers3 = sBBetHistoryItemDTO.getResult().getNumbers();
                    xc60 xc60Var = ub60Var.f;
                    SBBetHistoryDTO sBBetHistoryDTO2 = sBBetHistoryDTO;
                    uf00 uf00VarF3 = a4h.f(CollectionsKt.i0(xc60Var.c, numbers3));
                    List<SBTicketDTO> tickets = sBBetHistoryItemDTO.getUserSelection().getTickets();
                    Iterator<T> it3 = it;
                    int i6 = 10;
                    ArrayList arrayList3 = new ArrayList(l48.r(tickets, 10));
                    Iterator<T> it4 = tickets.iterator();
                    while (it4.hasNext()) {
                        List<List<Integer>> numbers4 = ((SBTicketDTO) it4.next()).getNumbers();
                        Iterator<T> it5 = it4;
                        int i7 = id;
                        ArrayList arrayList4 = new ArrayList(l48.r(numbers4, i6));
                        Iterator<T> it6 = numbers4.iterator();
                        while (it6.hasNext()) {
                            arrayList4.add(a4h.f((List) it6.next()));
                        }
                        arrayList3.add(fb60.v(new na60.a(a4h.f(arrayList4)), uf00VarF3, ub60Var));
                        it4 = it5;
                        id = i7;
                        i6 = 10;
                    }
                    int i8 = id;
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList3.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayList3.get(i10);
                        i10++;
                        Object obj5 = (wb60) obj4;
                        if (obj5 instanceof wb60.a) {
                            obj2 = (wb60.a) obj5;
                        } else {
                            if (!(obj5 instanceof wb60.b)) {
                                uhc.a();
                                return th2;
                            }
                            obj2 = th2;
                        }
                        if (obj2 != null) {
                            arrayList5.add(obj2);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(l48.r(arrayList5, 10));
                    int size2 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj6 = arrayList5.get(i11);
                        int i12 = i11 + 1;
                        int i13 = i9 + 1;
                        if (i9 < 0) {
                            b.q();
                            throw th2;
                        }
                        wb60.a aVar2 = (wb60.a) obj6;
                        qcn<vb60> qcnVar2 = aVar2.a;
                        ArrayList arrayList7 = arrayList5;
                        int i14 = size2;
                        ArrayList arrayList8 = new ArrayList(l48.r(qcnVar2, 10));
                        Iterator<vb60> it7 = qcnVar2.iterator();
                        while (it7.hasNext()) {
                            arrayList8.add(it7.next().a);
                        }
                        arrayList6.add(new g860(a4h.f(l48.s(arrayList8)), aVar2.e, aVar2.g));
                        i11 = i12;
                        i9 = i13;
                        arrayList5 = arrayList7;
                        size2 = i14;
                    }
                    uf00 uf00VarF4 = a4h.f(arrayList6);
                    uf00 uf00VarF5 = a4h.f(numbers2);
                    qcn<Integer> qcnVar3 = xc60Var.c;
                    SBExtraDTO extra2 = sBBetHistoryItemDTO.getExtra();
                    ?? ticketId2 = extra2 != null ? extra2.getTicketId() : th2;
                    SBExtraDTO extra3 = sBBetHistoryItemDTO.getExtra();
                    if (extra3 != null) {
                        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(extra3.getStakeAmount());
                        bigDecimalValueOf7.getClass();
                        r33 = bigDecimalValueOf7;
                    } else {
                        r33 = th2;
                    }
                    SBExtraDTO extra4 = sBBetHistoryItemDTO.getExtra();
                    if (extra4 != null) {
                        BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(extra4.getPayoutAmount());
                        bigDecimalValueOf8.getClass();
                        r34 = bigDecimalValueOf8;
                    } else {
                        r34 = th2;
                    }
                    arrayList.add(new r860(i8, bigDecimalValueOf2, r14, bigDecimalValueOf4, ticketId, currency, createTime, new n860(uf00VarF4, uf00VarF5, qcnVar3, ticketId2, r33, r34)));
                    i4 = 10;
                    i3 = i5;
                    sBBetHistoryDTO = sBBetHistoryDTO2;
                    it = it3;
                    th = th2;
                }
                SBBetHistoryDTO sBBetHistoryDTO3 = sBBetHistoryDTO;
                int i15 = i3;
                Throwable th3 = th;
                uf00 uf00VarF6 = a4h.f(arrayList);
                if (f860Var.equals(f860.b.a)) {
                    r6 = th3;
                } else {
                    if (!(f860Var instanceof f860.a)) {
                        uhc.a();
                        return th3;
                    }
                    qcnVar = ((f860.a) f860Var).a;
                }
                if (r6 != 0) {
                    r6 = qcnVar;
                    r860 r860Var = (r860) CollectionsKt.d0(r6);
                    if (r860Var == null) {
                        r6 = qcnVar;
                        aVar = new f860.a(uf00VarF6, !sBBetHistoryDTO3.getHasMore());
                    } else {
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : uf00VarF6) {
                            r860 r860Var2 = (r860) obj7;
                            if (r860Var2.g <= r860Var.g && r860Var.a != r860Var2.a) {
                                arrayList9.add(obj7);
                            }
                        }
                        aVar = new f860.a(a4h.f(CollectionsKt.i0(arrayList9, r6)), !sBBetHistoryDTO3.getHasMore());
                    }
                } else {
                    r6 = qcnVar;
                    aVar = new f860.a(uf00VarF6, !sBBetHistoryDTO3.getHasMore());
                }
                c0116a.b = i15;
                if (this.a.emit(aVar, c0116a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj3);
            }
            return Unit.a;
        }
    }

    public ba60(lyh lyhVar, da60 da60Var) {
        this.a = lyhVar;
        this.b = da60Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super f860.a> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
