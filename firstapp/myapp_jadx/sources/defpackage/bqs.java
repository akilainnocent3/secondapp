package defpackage;

import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$collectSocketMessage$3", f = "LivePageActivity.kt", l = {1488}, m = "invokeSuspend", v = 2)
public final class bqs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LivePageActivity b;

    public static final class a<T> implements myh {
        public final /* synthetic */ LivePageActivity a;

        public a(LivePageActivity livePageActivity) {
            this.a = livePageActivity;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            djh0 djh0Var;
            SocketEventMessage socketEventMessage = (SocketEventMessage) obj;
            LivePageActivity livePageActivity = this.a;
            xss xssVar = livePageActivity.Q;
            if (xssVar != null) {
                LinkedHashMap linkedHashMap = xss.L;
                xssVar.s(socketEventMessage, true);
            }
            if (socketEventMessage.canLiveBet && (djh0Var = livePageActivity.R) != null) {
                String str = socketEventMessage.eventId;
                str.getClass();
                ArrayList arrayList = djh0Var.m;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (obj2 instanceof ing) {
                        arrayList2.add(obj2);
                    }
                }
                int size2 = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        i2 = -1;
                        break;
                    }
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    if (Intrinsics.g(((ing) obj3).a.eventId, str)) {
                        break;
                    }
                    i2++;
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    arrayList.remove(iIntValue);
                    djh0Var.e(iIntValue);
                    if (iIntValue == 0 && !arrayList.isEmpty() && (arrayList.get(0) instanceof ing)) {
                        Object obj4 = arrayList.get(0);
                        obj4.getClass();
                        ((ing) obj4).c = true;
                        djh0Var.d(0);
                    }
                    if (arrayList.isEmpty()) {
                        int i4 = LivePageActivity.b0;
                        uqs uqsVarG1 = livePageActivity.G1();
                        uqsVarG1.K1();
                        uqsVarG1.G1();
                        Unit unit = Unit.a;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqs(LivePageActivity livePageActivity, v1b<? super bqs> v1bVar) {
        super(2, v1bVar);
        this.b = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bqs(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((bqs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        int i2 = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.b;
        b390 b390Var = livePageActivity.G1().y;
        a aVar = new a(livePageActivity);
        this.a = 1;
        b390Var.getClass();
        b390.m(b390Var, aVar, this);
        return y5bVar;
    }
}
