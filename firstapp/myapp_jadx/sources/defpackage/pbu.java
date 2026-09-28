package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.luckywheel.LuckyWheelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pbu implements lyh<t8u> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ wbu b;

    @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getLuckyWheelInfo$$inlined$map$1", f = "LuckyWheelUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return pbu.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ wbu b;

        @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getLuckyWheelInfo$$inlined$map$1$2", f = "LuckyWheelUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, wbu wbuVar) {
            this.a = myhVar;
            this.b = wbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            float f;
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
            Object next = null;
            if (i2 == 0) {
                uj50.b(obj2);
                BaseResponse baseResponse = (BaseResponse) obj;
                LuckyWheelResponse luckyWheelResponse = (LuckyWheelResponse) n52.b(baseResponse);
                this.b.getClass();
                Iterator<T> it = luckyWheelResponse.getLuckyWheelInfoVO().getLuckyWheelPrizeVOS().iterator();
                int areaAmount = 0;
                while (it.hasNext()) {
                    areaAmount += ((LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS) it.next()).getAreaAmount();
                }
                float f2 = areaAmount;
                float f3 = 360.0f;
                float f4 = 360.0f / f2;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = luckyWheelResponse.getLuckyWheelInfoVO().getLuckyWheelPrizeVOS().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int areaAmount2 = ((LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS) next).getAreaAmount();
                        do {
                            Object next2 = it2.next();
                            int areaAmount3 = ((LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS) next2).getAreaAmount();
                            if (areaAmount2 < areaAmount3) {
                                next = next2;
                                areaAmount2 = areaAmount3;
                            }
                        } while (it2.hasNext());
                    }
                }
                LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS luckyWheelPrizeVOS = (LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS) next;
                int areaAmount4 = luckyWheelPrizeVOS != null ? luckyWheelPrizeVOS.getAreaAmount() : 0;
                float f5 = 0.0f;
                for (int i3 = 0; i3 < areaAmount4; i3++) {
                    for (LuckyWheelResponse.LuckyWheelInfoVO.LuckyWheelPrizeVOS luckyWheelPrizeVOS2 : luckyWheelResponse.getLuckyWheelInfoVO().getLuckyWheelPrizeVOS()) {
                        if (luckyWheelPrizeVOS2.getAreaAmount() > i3) {
                            f = f3;
                            arrayList.add(new p9u(luckyWheelPrizeVOS2.getColorName(), luckyWheelPrizeVOS2.getPrizeAmount(), f - f5));
                            f5 += f4;
                        } else {
                            f = f3;
                        }
                        f3 = f;
                    }
                }
                t8u t8uVar = new t8u(((LuckyWheelResponse) baseResponse.data).getLuckyWheelInfoVO().getId(), ((LuckyWheelResponse) baseResponse.data).getTicketInfo().getType(), ((LuckyWheelResponse) baseResponse.data).getTicketInfo().getTicketNum(), new q9u(arrayList, f4), ((LuckyWheelResponse) baseResponse.data).getTicketInfo().getTicketNum() > 0);
                aVar.b = 1;
                if (this.a.emit(t8uVar, aVar) == y5bVar) {
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

    public pbu(lyh lyhVar, wbu wbuVar) {
        this.a = lyhVar;
        this.b = wbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super t8u> myhVar, v1b v1bVar) {
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
