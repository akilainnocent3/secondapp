package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.nightnday.data.dto.NNDBetHistoryDTO;
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

/* JADX INFO: loaded from: classes7.dex */
public final class o8x implements lyh<b7x.a> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ q8x b;
    public final /* synthetic */ int c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ q8x b;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: o8x$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.nightnday.conponent.bethsitory.NNDBetHistoryViewModel$getBetHistory$$inlined$map$1$2", f = "NNDBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
        public static final class C0918a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0918a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, q8x q8xVar, int i) {
            this.a = myhVar;
            this.b = q8xVar;
            this.c = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws ParseException {
            C0918a c0918a;
            qcn<f7x> qcnVar;
            b7x.a aVar;
            f7x f7xVar;
            qcn<f7x> qcnVar2;
            Object next;
            Object next2;
            if (v1bVar instanceof C0918a) {
                c0918a = (C0918a) v1bVar;
                int i = c0918a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0918a.b = i - Integer.MIN_VALUE;
                } else {
                    c0918a = new C0918a(v1bVar);
                }
            } else {
                c0918a = new C0918a(v1bVar);
            }
            Object obj2 = c0918a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0918a.b;
            qcn<f7x> qcnVar3 = null;
            if (i2 == 0) {
                uj50.b(obj2);
                List<NNDBetHistoryDTO> list = (List) em50.b((HTTPResponse) obj);
                b7x b7xVar = (b7x) this.b.d.a.getValue();
                b7xVar.getClass();
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (NNDBetHistoryDTO nNDBetHistoryDTO : list) {
                    int id = nNDBetHistoryDTO.getId();
                    int userId = nNDBetHistoryDTO.getUserId();
                    double stakeAmount = nNDBetHistoryDTO.getStakeAmount();
                    Double giftAmount = nNDBetHistoryDTO.getGiftAmount();
                    double payoutAmount = nNDBetHistoryDTO.getPayoutAmount();
                    double actualDebitedAmount = nNDBetHistoryDTO.getActualDebitedAmount();
                    double actualCreditedAmount = nNDBetHistoryDTO.getActualCreditedAmount();
                    Iterator<T> it = fbx.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qcnVar2 = qcnVar3;
                            next = qcnVar2;
                            break;
                        }
                        next = it.next();
                        qcnVar2 = qcnVar3;
                        if (((fbx) next).a.equals(nNDBetHistoryDTO.getUserPick())) {
                            break;
                        }
                        qcnVar3 = qcnVar2;
                    }
                    next.getClass();
                    fbx fbxVar = (fbx) next;
                    Iterator<T> it2 = fbx.i.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = qcnVar2;
                            break;
                        }
                        next2 = it2.next();
                    } while (!((fbx) next2).a.equals(nNDBetHistoryDTO.getHouseDraw()));
                    next2.getClass();
                    fbx fbxVar2 = (fbx) next2;
                    String ticketId = nNDBetHistoryDTO.getTicketId();
                    String currency = nNDBetHistoryDTO.getCurrency();
                    String createdAt = nNDBetHistoryDTO.getCreatedAt();
                    createdAt.getClass();
                    Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).parse(c.k(createdAt, "Z", false) ? c.p(createdAt, "Z", "+0000", false) : fu5.a("([+-]\\d{2}):(\\d{2})$", createdAt, "$1$2"));
                    arrayList.add(new f7x(id, userId, stakeAmount, giftAmount, payoutAmount, actualDebitedAmount, actualCreditedAmount, fbxVar, fbxVar2, ticketId, currency, date != null ? date.getTime() : 0L));
                    qcnVar3 = qcnVar2;
                }
                qcn<f7x> qcnVar4 = qcnVar3;
                uf00 uf00VarF = a4h.f(arrayList);
                if (b7xVar.equals(b7x.b.a)) {
                    qcnVar = qcnVar4;
                } else {
                    if (!(b7xVar instanceof b7x.a)) {
                        uhc.a();
                        return qcnVar4;
                    }
                    qcnVar = ((b7x.a) b7xVar).b;
                }
                int i3 = this.c;
                if (qcnVar == null || (f7xVar = (f7x) CollectionsKt.d0(qcnVar)) == null) {
                    aVar = new b7x.a(i3, uf00VarF, 15 > uf00VarF.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : uf00VarF) {
                        f7x f7xVar2 = (f7x) obj3;
                        int i4 = i3;
                        if (f7xVar2.l <= f7xVar.l && f7xVar.a != f7xVar2.a) {
                            arrayList2.add(obj3);
                        }
                        i3 = i4;
                    }
                    aVar = new b7x.a(i3, a4h.f(CollectionsKt.i0(arrayList2, qcnVar)), 15 > uf00VarF.size());
                }
                c0918a.b = 1;
                if (this.a.emit(aVar, c0918a) == y5bVar) {
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

    public o8x(lyh lyhVar, q8x q8xVar, int i) {
        this.a = lyhVar;
        this.b = q8xVar;
        this.c = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super b7x.a> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
