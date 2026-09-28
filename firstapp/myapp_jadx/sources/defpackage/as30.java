package defpackage;

import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.SimpleCommentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$getTicketDetail$ticketDetailFlow$1", f = "RSportTicketDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class as30 extends tje0 implements Function2<RTicket, v1b<? super lyh<? extends RTicket>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ds30 b;

    public static final class a implements lyh<RTicket> {
        public final /* synthetic */ o830 a;
        public final /* synthetic */ RTicket b;

        /* JADX INFO: renamed from: as30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$getTicketDetail$ticketDetailFlow$1$invokeSuspend$$inlined$map$1", f = "RSportTicketDetailsViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0097a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0097a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ RTicket b;

            /* JADX INFO: renamed from: as30$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$getTicketDetail$ticketDetailFlow$1$invokeSuspend$$inlined$map$1$2", f = "RSportTicketDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0098a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0098a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, RTicket rTicket) {
                this.a = myhVar;
                this.b = rTicket;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0098a c0098a;
                List list;
                List<RSelection> list2;
                T next;
                if (v1bVar instanceof C0098a) {
                    c0098a = (C0098a) v1bVar;
                    int i = c0098a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0098a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0098a = new C0098a(v1bVar);
                    }
                } else {
                    c0098a = new C0098a(v1bVar);
                }
                Object obj2 = c0098a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0098a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    bi50 bi50Var = (bi50) obj;
                    boolean isSuccessful = bi50Var.a.getIsSuccessful();
                    RTicket rTicket = this.b;
                    if (isSuccessful && (list = (List) bi50Var.b) != null && (list2 = rTicket.selections) != null) {
                        for (RSelection rSelection : list2) {
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.g(((SimpleCommentInfo) next).getEventId(), rSelection.eventId));
                            SimpleCommentInfo simpleCommentInfo = next;
                            if (simpleCommentInfo != null) {
                                Integer commentCount = simpleCommentInfo.getCommentCount();
                                rSelection.commentsNum = commentCount != null ? commentCount.intValue() : 0;
                            }
                        }
                    }
                    c0098a.b = 1;
                    if (this.a.emit(rTicket, c0098a) == y5bVar) {
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

        public a(o830 o830Var, RTicket rTicket) {
            this.a = o830Var;
            this.b = rTicket;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super RTicket> myhVar, v1b v1bVar) {
            C0097a c0097a;
            if (v1bVar instanceof C0097a) {
                c0097a = (C0097a) v1bVar;
                int i = c0097a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0097a.b = i - Integer.MIN_VALUE;
                } else {
                    c0097a = new C0097a(v1bVar);
                }
            } else {
                c0097a = new C0097a(v1bVar);
            }
            Object obj = c0097a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0097a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0097a.b = 1;
                if (this.a.collect(bVar, c0097a) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as30(ds30 ds30Var, v1b<? super as30> v1bVar) {
        super(2, v1bVar);
        this.b = ds30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        as30 as30Var = new as30(this.b, v1bVar);
        as30Var.a = obj;
        return as30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RTicket rTicket, v1b<? super lyh<? extends RTicket>> v1bVar) {
        return ((as30) create(rTicket, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RTicket rTicket = (RTicket) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<RSelection> list = rTicket.selections;
        if (list == null) {
            return new gzh(rTicket);
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RSelection) it.next()).eventId);
        }
        ct90<bi50<List<SimpleCommentInfo>>> ct90VarD = this.b.d.g(arrayList).d(wm70.c);
        r2i r2iVarA = ct90VarD instanceof yaj ? ((yaj) ct90VarD).a() : new fw90(ct90VarD);
        r2iVarA.getClass();
        t0b[] t0bVarArr = i340.a;
        return new a(new o830(r2iVarA, e.a, -2, pb5.a), rTicket);
    }
}
