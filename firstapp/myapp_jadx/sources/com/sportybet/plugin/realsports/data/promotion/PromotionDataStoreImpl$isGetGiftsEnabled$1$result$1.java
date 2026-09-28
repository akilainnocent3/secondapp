package com.sportybet.plugin.realsports.data.promotion;

import com.sporty.android.core.model.MyLog;
import defpackage.c0d;
import defpackage.gaj;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import defpackage.zn20;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmyh;", "Lzn20;", "", "it", "", "<anonymous>", "(Lmyh;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@c0d(c = "com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1", f = "PromotionDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1(v1b<? super PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1> v1bVar) {
        super(3, v1bVar);
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1 promotionDataStoreImpl$isGetGiftsEnabled$1$result$1 = new PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1(v1bVar);
        promotionDataStoreImpl$isGetGiftsEnabled$1$result$1.L$0 = th;
        return promotionDataStoreImpl$isGetGiftsEnabled$1$result$1.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        y5b y5bVar = y5b.a;
        if (this.label != 0) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.b(th);
        return Unit.a;
    }
}
