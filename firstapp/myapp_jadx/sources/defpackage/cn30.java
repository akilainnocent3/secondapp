package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCBetHistoryDTO;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class cn30 implements lyh<rl30.a> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ en30 b;
    public final /* synthetic */ int c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ en30 b;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: cn30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewModel$getBetHistory$$inlined$map$1$2", f = "RCBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
        public static final class C0179a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0179a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, en30 en30Var, int i) {
            this.a = myhVar;
            this.b = en30Var;
            this.c = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws ParseException {
            C0179a c0179a;
            qcn<vl30> qcnVar;
            rl30.a aVar;
            vl30 vl30Var;
            BigDecimal bigDecimal;
            qcn<vl30> qcnVar2;
            Object next;
            Object next2;
            if (v1bVar instanceof C0179a) {
                c0179a = (C0179a) v1bVar;
                int i = c0179a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0179a.b = i - Integer.MIN_VALUE;
                } else {
                    c0179a = new C0179a(v1bVar);
                }
            } else {
                c0179a = new C0179a(v1bVar);
            }
            Object obj2 = c0179a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0179a.b;
            qcn<vl30> qcnVar3 = null;
            if (i2 == 0) {
                uj50.b(obj2);
                List<RCBetHistoryDTO> list = (List) em50.b((HTTPResponse) obj);
                rl30 rl30Var = (rl30) this.b.d.a.getValue();
                rl30Var.getClass();
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (RCBetHistoryDTO rCBetHistoryDTO : list) {
                    int id = rCBetHistoryDTO.getId();
                    int userId = rCBetHistoryDTO.getUserId();
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rCBetHistoryDTO.getStakeAmount());
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimal2 = skd0.b;
                    Double giftAmount = rCBetHistoryDTO.getGiftAmount();
                    if (giftAmount != null) {
                        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(giftAmount.doubleValue());
                        bigDecimalValueOf2.getClass();
                        bigDecimal = bigDecimalValueOf2;
                    } else {
                        bigDecimal = qcnVar3;
                    }
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(rCBetHistoryDTO.getPayoutAmount());
                    bigDecimalValueOf3.getClass();
                    BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(rCBetHistoryDTO.getActualDebitedAmount());
                    bigDecimalValueOf4.getClass();
                    BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(rCBetHistoryDTO.getActualCreditedAmount());
                    bigDecimalValueOf5.getClass();
                    Iterator<T> it = tq30.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qcnVar2 = qcnVar3;
                            next = qcnVar2;
                            break;
                        }
                        next = it.next();
                        qcnVar2 = qcnVar3;
                        if (((tq30) next).a.equals(rCBetHistoryDTO.getUserPick())) {
                            break;
                        }
                        qcnVar3 = qcnVar2;
                    }
                    next.getClass();
                    tq30 tq30Var = (tq30) next;
                    Iterator<T> it2 = tq30.i.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = qcnVar2;
                            break;
                        }
                        next2 = it2.next();
                    } while (!((tq30) next2).a.equals(rCBetHistoryDTO.getHouseDraw()));
                    next2.getClass();
                    tq30 tq30Var2 = (tq30) next2;
                    String ticketId = rCBetHistoryDTO.getTicketId();
                    String currency = rCBetHistoryDTO.getCurrency();
                    String createdAt = rCBetHistoryDTO.getCreatedAt();
                    createdAt.getClass();
                    Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).parse(c.k(createdAt, "Z", false) ? c.p(createdAt, "Z", "+0000", false) : fu5.a("([+-]\\d{2}):(\\d{2})$", createdAt, "$1$2"));
                    arrayList.add(new vl30(id, userId, bigDecimalValueOf, bigDecimal, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf5, tq30Var, tq30Var2, ticketId, currency, date != null ? date.getTime() : 0L));
                    qcnVar3 = qcnVar2;
                }
                qcn<vl30> qcnVar4 = qcnVar3;
                uf00 uf00VarF = a4h.f(arrayList);
                if (rl30Var.equals(rl30.b.a)) {
                    qcnVar = qcnVar4;
                } else {
                    if (!(rl30Var instanceof rl30.a)) {
                        uhc.a();
                        return qcnVar4;
                    }
                    qcnVar = ((rl30.a) rl30Var).b;
                }
                int i3 = this.c;
                if (qcnVar == null || (vl30Var = (vl30) CollectionsKt.d0(qcnVar)) == null) {
                    aVar = new rl30.a(i3, uf00VarF, 15 > uf00VarF.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : uf00VarF) {
                        vl30 vl30Var2 = (vl30) obj3;
                        int i4 = i3;
                        if (vl30Var2.l <= vl30Var.l && vl30Var.a != vl30Var2.a) {
                            arrayList2.add(obj3);
                        }
                        i3 = i4;
                    }
                    aVar = new rl30.a(i3, a4h.f(CollectionsKt.i0(arrayList2, qcnVar)), 15 > uf00VarF.size());
                }
                c0179a.b = 1;
                if (this.a.emit(aVar, c0179a) == y5bVar) {
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

    public cn30(lyh lyhVar, en30 en30Var, int i) {
        this.a = lyhVar;
        this.b = en30Var;
        this.c = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super rl30.a> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
