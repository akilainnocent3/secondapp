package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sporty.android.platform.features.luckywheel.error.LuckyWheelInfoFailed;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qbu implements lyh<Integer> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ dq40 b;

    @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getSpinResult$$inlined$map$1", f = "LuckyWheelUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return qbu.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dq40 b;

        @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getSpinResult$$inlined$map$1$2", f = "LuckyWheelUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, dq40 dq40Var) {
            this.a = myhVar;
            this.b = dq40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, com.sporty.android.core.model.luckywheel.TicketInfo] */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws LuckyWheelInfoFailed {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                ?? r6 = (T) ((TicketInfo) n52.b((BaseResponse) obj));
                this.b.a = r6;
                if (Intrinsics.g(r6.getHasAvailableActivity(), Boolean.FALSE)) {
                    StringUiText stringUiText = vch0.a;
                    throw new LuckyWheelInfoFailed(new ResourceUiText(R.string.lucky_wheel__lucky_wheel_activity_expire));
                }
                List<Integer> idList = r6.getIdList();
                List<Integer> list = idList.isEmpty() ? null : idList;
                if (list == null) {
                    StringUiText stringUiText2 = vch0.a;
                    throw new LuckyWheelInfoFailed(new ResourceUiText(R.string.lucky_wheel__no_ticket_available));
                }
                Integer num = new Integer(list.get(0).intValue());
                aVar.b = 1;
                if (this.a.emit(num, aVar) == y5bVar) {
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

    public qbu(lyh lyhVar, dq40 dq40Var) {
        this.a = lyhVar;
        this.b = dq40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
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
