package defpackage;

import com.sporty.android.book.domain.entity.ProductType;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashoutFallbackSettingsDto;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class nq6 implements kq6 {
    public final yo6 a;
    public final gq6 b;
    public final fr6 c;
    public final wsm d;
    public final b1z e;
    public final j1b f;
    public String h;
    public Long l;
    public jvd0 m;
    public e1z g = e1z.a;
    public final wwd0 i = xwd0.a(1);
    public final LinkedHashMap j = new LinkedHashMap();
    public final wwd0 k = xwd0.a(lk50.b.a);

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsManagerImpl$refreshCurrentPage$1", f = "CashoutOpenBetsManagerImpl.kt", l = {135, 136}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public nq6 a;
        public String b;
        public e1z c;
        public pjd d;
        public CashOutData e;
        public int f;
        public int i;
        public /* synthetic */ Object v;

        /* JADX INFO: renamed from: nq6$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsManagerImpl$refreshCurrentPage$1$1$cashoutDataDeferred$1", f = "CashoutOpenBetsManagerImpl.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 2)
        public static final class C0904a extends tje0 implements Function2<v5b, v1b<? super CashOutData>, Object> {
            public int a;
            public final /* synthetic */ nq6 b;
            public final /* synthetic */ String c;
            public final /* synthetic */ e1z d;
            public final /* synthetic */ int e;
            public final /* synthetic */ String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0904a(nq6 nq6Var, String str, e1z e1zVar, int i, String str2, v1b<? super C0904a> v1bVar) {
                super(2, v1bVar);
                this.b = nq6Var;
                this.c = str;
                this.d = e1zVar;
                this.e = i;
                this.f = str2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0904a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super CashOutData> v1bVar) {
                return ((C0904a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object objI;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                fr6 fr6Var = this.b.c;
                Integer num = new Integer(this.e);
                this.a = 1;
                itf0.a aVar = itf0.a;
                String str = this.c;
                StringBuilder sbA = ce7.a(aVar, MyLog.TAG_CASHOUT, "CashoutRepository.fetchOpenBets(eventId=", str, ", openBetsFilterType=");
                e1z e1zVar = this.d;
                sbA.append(e1zVar);
                sbA.append(", pageNum=");
                sbA.append(num);
                sbA.append(", lastId=");
                String str2 = this.f;
                aVar.g(uf80.a(sbA, str2, ")"), new Object[0]);
                if (str != null) {
                    objI = fr6Var.j(str, str2, "v2", this);
                } else {
                    objI = e1zVar != e1z.a ? fr6Var.i(e1zVar, str2, "v2", this) : fr6Var.g(num, "v2", this);
                }
                return objI == y5bVar ? y5bVar : objI;
            }
        }

        @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsManagerImpl$refreshCurrentPage$1$1$cashoutFallbackSettingsDeferred$1", f = "CashoutOpenBetsManagerImpl.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super CashoutFallbackSettingsDto>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ nq6 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(nq6 nq6Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.c = nq6Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(this.c, v1bVar);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super CashoutFallbackSettingsDto> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object bVar;
                y5b y5bVar = y5b.a;
                int i = this.a;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        nq6 nq6Var = this.c;
                        zi50.a aVar = zi50.b;
                        yo6 yo6Var = nq6Var.a;
                        this.b = null;
                        this.a = 1;
                        obj = yo6Var.e(null, this);
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
                    bVar = (CashoutFallbackSettingsDto) obj;
                    zi50.a aVar2 = zi50.b;
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Throwable thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_CASHOUT_FALLBACK);
                    aVar4.o(thA);
                }
                return zi50.a(bVar) == null ? bVar : new CashoutFallbackSettingsDto(null, null, null, null, null, null, null, null, 255, null);
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = nq6.this.new a(v1bVar);
            aVar.v = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:105:0x010f A[EDGE_INSN: B:105:0x010f->B:40:0x010f BREAK  A[LOOP:0: B:30:0x00f4->B:37:0x010a], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x00fc A[Catch: all -> 0x010d, TRY_ENTER, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0108  */
        /* JADX WARN: Code duplicated, block: B:36:0x0109  */
        /* JADX WARN: Code duplicated, block: B:41:0x0111 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0132  */
        /* JADX WARN: Code duplicated, block: B:44:0x0136 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0142 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0145  */
        /* JADX WARN: Code duplicated, block: B:50:0x014b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0158 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x015c A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:29:0x00c5, B:30:0x00f4, B:33:0x00fc, B:37:0x010a, B:41:0x0111, B:44:0x0136, B:46:0x0142, B:51:0x014d, B:55:0x016c, B:52:0x0158, B:54:0x015c, B:25:0x00a8, B:21:0x0089), top: B:100:0x0089 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x017f  */
        /* JADX WARN: Code duplicated, block: B:65:0x0194  */
        /* JADX WARN: Code duplicated, block: B:86:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:90:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:93:0x01de  */
        /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v3, types: [b1z$a, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v0, types: [b1z] */
        /* JADX WARN: Type inference failed for: r9v0, types: [wwd0] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            pjd pjdVar;
            Object bVar;
            ?? r14;
            Throwable thA;
            boolean z;
            b1z.a aVar;
            String message;
            e1z e1zVar;
            int iIntValue;
            String str;
            pjd pjdVar2;
            Object objQ;
            nq6 nq6Var;
            pjd pjdVar3;
            pjd pjdVar4;
            Object objAwait;
            CashOutData cashOutData;
            int i;
            String str2;
            nq6 nq6Var2;
            CashOutData cashOutDataJ;
            LinkedHashMap linkedHashMap;
            Iterator it;
            ?? r10;
            CashOutData cashOutData2;
            Bet bet;
            Object obj2;
            String str3;
            CashOutData cashOutDataCopy$default;
            String str4;
            nq6 nq6Var3 = nq6.this;
            ?? r8 = nq6Var3.e;
            ?? r9 = nq6Var3.k;
            v5b v5bVar = (v5b) this.v;
            y5b y5bVar = y5b.a;
            int i2 = this.i;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        int i3 = this.f;
                        pjdVar3 = this.d;
                        e1zVar = this.c;
                        String str5 = this.b;
                        nq6 nq6Var4 = this.a;
                        uj50.b(obj);
                        pjdVar4 = null;
                        str = str5;
                        iIntValue = i3;
                        objQ = obj;
                        nq6Var = nq6Var4;
                    } else {
                        if (i2 != 2) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.f;
                        cashOutData = this.e;
                        e1zVar = this.c;
                        str2 = this.b;
                        nq6 nq6Var5 = this.a;
                        uj50.b(obj);
                        nq6Var2 = nq6Var5;
                        pjdVar2 = null;
                        objAwait = obj;
                    }
                    CashoutFallbackSettingsDto cashoutFallbackSettingsDto = (CashoutFallbackSettingsDto) objAwait;
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT_FALLBACK);
                    aVar2.g("fetchCashoutFallbackSettings(): cashoutFallbackSettings=" + cashoutFallbackSettingsDto, new Object[0]);
                    cashOutDataJ = nq6Var2.j(cashOutData, cashoutFallbackSettingsDto);
                    linkedHashMap = nq6Var2.j;
                    nq6Var2.h(cashOutDataJ);
                    nq6Var2.i(cashOutDataJ);
                    it = cashOutDataJ.getCashAbleBets().iterator();
                    while (true) {
                        r10 = "";
                        if (it.hasNext()) {
                            break;
                        }
                        Bet bet2 = (Bet) it.next();
                        str4 = bet2.cashOut.maxCashOutAmount;
                        if (str4 == null) {
                            r10 = str4;
                        }
                        bet2.maxCashOutAmount = r10;
                    }
                    if (str2 != null) {
                        cashOutDataCopy$default = CashOutData.copy$default(cashOutDataJ, nq6Var2.b.a(str2).b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                    }
                    if (str2 != null) {
                        cashOutData2 = cashOutDataJ;
                        bet = (Bet) CollectionsKt.d0(cashOutData2.getCashAbleBets());
                        if (bet != null) {
                            str3 = bet.id;
                        } else {
                            obj2 = pjdVar2;
                        }
                        if (obj2 != null) {
                            cashOutData2 = cashOutDataCopy$default;
                            cashOutData2 = cashOutDataCopy$default;
                            obj2 = str3;
                            r10 = obj2;
                        }
                        cashOutData2 = cashOutDataCopy$default;
                        cashOutData2 = cashOutDataCopy$default;
                        obj2 = str3;
                        linkedHashMap.put(new Integer(i + 1), r10);
                    } else {
                        cashOutData2 = cashOutDataJ;
                        if (e1zVar != e1z.a) {
                            cashOutData2 = cashOutDataCopy$default;
                            linkedHashMap.put(new Integer(i + 1), cashOutData2.getLastBetId());
                        }
                    }
                    cashOutData2 = cashOutDataCopy$default;
                    zi50.a aVar3 = zi50.b;
                    bVar = cashOutData2;
                    r14 = pjdVar2;
                    if (!(bVar instanceof zi50.b)) {
                        r8.l(true, r14, r14);
                        r9.k(r14, new lk50.c((CashOutData) bVar));
                    }
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        z = thA instanceof tom;
                        if (!z || (thA instanceof SocketTimeoutException) || (thA instanceof InterruptedIOException) || (thA instanceof SocketException) || (thA instanceof UnknownHostException) || (thA instanceof SSLHandshakeException) || (thA instanceof ProtocolException) || (thA instanceof SSLPeerUnverifiedException)) {
                            aVar = b1z.a.NetworkError;
                        } else {
                            aVar = thA instanceof SprThrowable ? b1z.a.BizCodeError : b1z.a.ClientError;
                        }
                        if (z) {
                            message = String.valueOf(((tom) thA).a);
                        } else if (thA instanceof SprThrowable) {
                            message = String.valueOf(((SprThrowable) thA).getD());
                        } else if (thA instanceof fk50) {
                            message = thA.getClass().getName();
                        } else {
                            message = thA.getMessage();
                        }
                        r8.l(false, aVar, message);
                        r9.k(r14, new lk50.a(thA));
                    }
                    return Unit.a;
                }
                uj50.b(obj);
                r9.setValue(lk50.b.a);
                zi50.a aVar4 = zi50.b;
                String str6 = nq6Var3.h;
                e1zVar = nq6Var3.g;
                iIntValue = ((Number) nq6Var3.i.getValue()).intValue();
                String str7 = (String) nq6Var3.j.get(new Integer(iIntValue));
                pjd pjdVarA = ej5.a(v5bVar, null, new b(nq6Var3, null), 3);
                str = str6;
                try {
                    pjdVar2 = null;
                    try {
                        pjd pjdVarA2 = ej5.a(v5bVar, null, new C0904a(nq6Var3, str, e1zVar, iIntValue, str7, null), 3);
                        this.v = null;
                        this.a = nq6Var3;
                        this.b = str;
                        this.c = e1zVar;
                        this.d = pjdVarA;
                        this.f = iIntValue;
                        this.i = 1;
                        objQ = pjdVarA2.q(this);
                        if (objQ != y5bVar) {
                            nq6Var = nq6Var3;
                            pjdVar3 = pjdVarA;
                            pjdVar4 = pjdVar2;
                        }
                        return y5bVar;
                    } catch (Throwable th) {
                        th = th;
                        pjdVar = pjdVar2;
                        zi50.a aVar5 = zi50.b;
                        bVar = new zi50.b(th);
                        r14 = pjdVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pjdVar = null;
                    zi50.a aVar6 = zi50.b;
                    bVar = new zi50.b(th);
                    r14 = pjdVar;
                }
                CashOutData cashOutData3 = (CashOutData) objQ;
                this.v = pjdVar4;
                this.a = nq6Var;
                this.b = str;
                this.c = e1zVar;
                this.d = pjdVar4;
                this.e = cashOutData3;
                this.f = iIntValue;
                this.i = 2;
                objAwait = pjdVar3.await(this);
                if (objAwait != y5bVar) {
                    cashOutData = cashOutData3;
                    i = iIntValue;
                    str2 = str;
                    nq6Var2 = nq6Var;
                    pjdVar2 = pjdVar4;
                    CashoutFallbackSettingsDto cashoutFallbackSettingsDto2 = (CashoutFallbackSettingsDto) objAwait;
                    itf0.a aVar7 = itf0.a;
                    aVar7.q(MyLog.TAG_CASHOUT_FALLBACK);
                    aVar7.g("fetchCashoutFallbackSettings(): cashoutFallbackSettings=" + cashoutFallbackSettingsDto2, new Object[0]);
                    cashOutDataJ = nq6Var2.j(cashOutData, cashoutFallbackSettingsDto2);
                    linkedHashMap = nq6Var2.j;
                    nq6Var2.h(cashOutDataJ);
                    nq6Var2.i(cashOutDataJ);
                    it = cashOutDataJ.getCashAbleBets().iterator();
                    while (true) {
                        r10 = "";
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        Bet bet3 = (Bet) it.next();
                        str4 = bet3.cashOut.maxCashOutAmount;
                        if (str4 == null) {
                            r10 = str4;
                        }
                        bet3.maxCashOutAmount = r10;
                    }
                    if (str2 != null) {
                        cashOutDataCopy$default = CashOutData.copy$default(cashOutDataJ, nq6Var2.b.a(str2).b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                    }
                    if (str2 != null) {
                        cashOutData2 = cashOutDataJ;
                        bet = (Bet) CollectionsKt.d0(cashOutData2.getCashAbleBets());
                        if (bet != null) {
                            str3 = bet.id;
                        } else {
                            obj2 = pjdVar2;
                        }
                        if (obj2 != null) {
                            cashOutData2 = cashOutDataCopy$default;
                            cashOutData2 = cashOutDataCopy$default;
                            obj2 = str3;
                            r10 = obj2;
                        }
                        cashOutData2 = cashOutDataCopy$default;
                        cashOutData2 = cashOutDataCopy$default;
                        obj2 = str3;
                        linkedHashMap.put(new Integer(i + 1), r10);
                    } else {
                        cashOutData2 = cashOutDataJ;
                        if (e1zVar != e1z.a) {
                            cashOutData2 = cashOutDataCopy$default;
                            linkedHashMap.put(new Integer(i + 1), cashOutData2.getLastBetId());
                        }
                    }
                    cashOutData2 = cashOutDataCopy$default;
                    zi50.a aVar8 = zi50.b;
                    bVar = cashOutData2;
                    r14 = pjdVar2;
                    if (!(bVar instanceof zi50.b)) {
                        r8.l(true, r14, r14);
                        r9.k(r14, new lk50.c((CashOutData) bVar));
                    }
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        z = thA instanceof tom;
                        if (z) {
                            aVar = b1z.a.NetworkError;
                        } else {
                            aVar = b1z.a.NetworkError;
                        }
                        if (z) {
                            message = String.valueOf(((tom) thA).a);
                        } else if (thA instanceof SprThrowable) {
                            message = String.valueOf(((SprThrowable) thA).getD());
                        } else if (thA instanceof fk50) {
                            message = thA.getClass().getName();
                        } else {
                            message = thA.getMessage();
                        }
                        r8.l(false, aVar, message);
                        r9.k(r14, new lk50.a(thA));
                    }
                    return Unit.a;
                }
                return y5bVar;
            } catch (Throwable th3) {
                th = th3;
                pjdVar = null;
            }
        }
    }

    public nq6(yo6 yo6Var, gq6 gq6Var, fr6 fr6Var, wsm wsmVar, b1z b1zVar, qqe0 qqe0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = yo6Var;
        this.b = gq6Var;
        this.c = fr6Var;
        this.d = wsmVar;
        this.e = b1zVar;
        this.f = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar).plus(new oq6(l5b.a.a)));
    }

    @Override // defpackage.kq6
    public final void a(e1z e1zVar, String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        StringBuilder sb = new StringBuilder("CashoutOpenBetsManager.setup(openBetsFilterType=");
        sb.append(e1zVar);
        sb.append(", eventId=");
        aVar.g(uf80.a(sb, str, ")"), new Object[0]);
        e1z e1zVar2 = this.g;
        wwd0 wwd0Var = this.i;
        if (e1zVar == e1zVar2 && Intrinsics.g(str, this.h) && ((Number) wwd0Var.getValue()).intValue() == 1) {
            return;
        }
        this.g = e1z.a;
        this.h = null;
        wwd0Var.k(null, 1);
        this.j.clear();
        this.k.setValue(lk50.b.a);
        this.l = null;
        this.m = null;
        this.g = e1zVar;
        this.h = str;
    }

    @Override // defpackage.kq6
    public final v340 b() {
        return e1i.b(this.k);
    }

    @Override // defpackage.kq6
    public final void c() {
        wwd0 wwd0Var = this.i;
        wwd0Var.k(null, Integer.valueOf(((Number) wwd0Var.getValue()).intValue() + 1));
        this.l = null;
        this.m = null;
        d();
    }

    @Override // defpackage.kq6
    public final void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.l;
        long jLongValue = jCurrentTimeMillis - (l != null ? l.longValue() : 0L);
        long j = this.a.d().v;
        jvd0 jvd0Var = this.m;
        boolean z = false;
        if (jvd0Var != null && jvd0Var.isActive() && !jvd0Var.isCompleted()) {
            z = true;
        }
        if (jLongValue < j || z) {
            return;
        }
        this.l = Long.valueOf(jCurrentTimeMillis);
        this.m = ej5.c(this.f, null, null, new a(null), 3);
    }

    @Override // defpackage.kq6
    public final void e(CashoutFallbackSettingsDto cashoutFallbackSettingsDto) {
        wwd0 wwd0Var = this.k;
        wwd0Var.setValue(bm50.l((lk50) wwd0Var.getValue(), new mq6(0, this, cashoutFallbackSettingsDto)));
    }

    @Override // defpackage.kq6
    public final void f() {
        wwd0 wwd0Var = this.i;
        if (((Number) wwd0Var.getValue()).intValue() < 2) {
            return;
        }
        wwd0Var.k(null, Integer.valueOf(((Number) wwd0Var.getValue()).intValue() - 1));
        this.l = null;
        this.m = null;
        d();
    }

    @Override // defpackage.kq6
    public final v340 g() {
        return e1i.b(this.i);
    }

    public final void h(CashOutData cashOutData) {
        Map<String, List<? extends String>> map = this.a.d().i.getMap();
        List<Bet> cashAbleBets = cashOutData.getCashAbleBets();
        int size = cashAbleBets.size();
        for (int i = 0; i < size; i++) {
            List<BetSelection> list = cashAbleBets.get(i).selections;
            list.getClass();
            for (BetSelection betSelection : list) {
                List<String> list2 = (List) map.get(betSelection.sportId + "^" + betSelection.marketId);
                if (list2 == null) {
                    list2 = m2g.a;
                }
                betSelection.additionMarketIdList = list2;
            }
        }
    }

    public final CashOutData j(CashOutData cashOutData, CashoutFallbackSettingsDto cashoutFallbackSettingsDto) {
        CashOutFallbackData cashOutFallbackData = cashOutData.getCashOutFallbackData();
        Double cfr = cashoutFallbackSettingsDto.getCfr();
        Double dValueOf = Double.valueOf(cfr != null ? cfr.doubleValue() : 0.0d);
        Boolean ccfBlocked = cashoutFallbackSettingsDto.getCcfBlocked();
        Boolean boolValueOf = Boolean.valueOf(ccfBlocked != null ? ccfBlocked.booleanValue() : false);
        Map<String, Double> betaSettings = cashoutFallbackSettingsDto.getBetaSettings();
        if (betaSettings == null) {
            betaSettings = o2g.a;
            betaSettings.getClass();
        }
        return CashOutData.copy$default(cashOutData, 0, null, null, null, false, false, CashOutFallbackData.copy$default(cashOutFallbackData, dValueOf, boolValueOf, betaSettings, null, null, null, null, cashoutFallbackSettingsDto.getTrfIntervalSeconds(), Boolean.valueOf(this.a.d().o), cashoutFallbackSettingsDto.getTrfGracePeriodSeconds(), 120, null), 63, null);
    }

    @Override // defpackage.kq6
    public final void remove(String str) {
        wwd0 wwd0Var;
        Object value;
        str.getClass();
        do {
            wwd0Var = this.k;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bm50.l((lk50) value, new lq6(str, 0))));
    }

    public final void i(CashOutData cashOutData) {
        if (this.a.d().k) {
            try {
                for (Bet bet : cashOutData.getCashAbleBets()) {
                    List<BetSelection> list = bet.selections;
                    list.getClass();
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            b.q();
                            throw null;
                        }
                        BetSelection betSelection = (BetSelection) obj;
                        betSelection.getClass();
                        betSelection.prematchAdditionMarket = dz2.c(betSelection, ProductType.PRE_MATCH.getValue());
                        betSelection.liveAdditionMarket = dz2.c(betSelection, ProductType.LIVE.getValue());
                        List<BetSelection> list2 = bet.selections;
                        dz2.i(betSelection);
                        list2.set(i, betSelection);
                        i = i2;
                    }
                }
            } catch (Throwable th) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_CALC);
                aVar.p(th, YAzniTbXHYQ.PPqUVoG, new Object[0]);
            }
        }
    }
}
