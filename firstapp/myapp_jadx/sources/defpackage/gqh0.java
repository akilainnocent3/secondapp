package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.SelectionResult;
import gqh0.b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gqh0 implements eqh0 {
    public final ISocketPushManager a;
    public final JsonSerializeService b;
    public final j1b c;
    public MultiTopic d;
    public final ku90<SelectionResult.SelectionResultData> e = new ku90<>();
    public final fqh0 f = new Subscriber() { // from class: fqh0
        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.a(yv0.a(aVar, MyLog.TAG_CASHOUT, "UserSelectionStatusManager.subscriber.onReceive: ", str), new Object[0]);
            gqh0 gqh0Var = this.a;
            ej5.c(gqh0Var.c, null, null, gqh0Var.new b(str, null), 3);
        }
    };

    public static final class a extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.e(th);
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.UserSelectionStatusManagerImpl$subscriber$1$1", f = "UserSelectionStatusManagerImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = gqh0.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0068  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object obj2;
            Throwable thA;
            gqh0 gqh0Var = gqh0.this;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                String str = this.e;
                try {
                    zi50.a aVar = zi50.b;
                    bVar = (SelectionResult) gqh0Var.b.fromJson(str, SelectionResult.class);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (!(bVar instanceof zi50.b)) {
                    SelectionResult selectionResult = (SelectionResult) bVar;
                    if (Intrinsics.g(selectionResult.getType(), "selection_status")) {
                        ku90<SelectionResult.SelectionResultData> ku90Var = gqh0Var.e;
                        SelectionResult.SelectionResultData data = selectionResult.getData();
                        this.c = null;
                        this.a = bVar;
                        this.b = 1;
                        if (ku90Var.a.emit(data, this) == y5bVar) {
                            return y5bVar;
                        }
                        obj2 = bVar;
                    }
                }
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_CASHOUT);
                    aVar3.o(thA);
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.a;
            uj50.b(obj);
            bVar = obj2;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_CASHOUT);
                aVar4.o(thA);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [fqh0] */
    public gqh0(ISocketPushManager iSocketPushManager, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = iSocketPushManager;
        this.b = jsonSerializeService;
        this.c = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar).plus(new a(l5b.a.a)));
    }

    @Override // defpackage.eqh0
    public final t340 a() {
        return e1i.a(this.e);
    }

    @Override // defpackage.eqh0
    public final void setUserId(String str) {
        MultiTopic multiTopic = this.d;
        fqh0 fqh0Var = this.f;
        ISocketPushManager iSocketPushManager = this.a;
        if (multiTopic != null) {
            iSocketPushManager.unsubscribeTopic(multiTopic, fqh0Var);
        }
        if (str == null || StringsKt.U(str)) {
            this.d = null;
            return;
        }
        MultiTopic multiTopic2 = new MultiTopic("selection_status_topic", str);
        this.d = multiTopic2;
        iSocketPushManager.subscribeTopic(multiTopic2, fqh0Var);
    }
}
