package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class uio implements lyh<InstantWinPromotionDialogInput> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ pio b;
    public final /* synthetic */ InstantWinPromotionData c;

    @c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promotionDialogFlow$lambda$1$$inlined$map$1", f = "InstantWinPromotionManagerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return uio.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ InstantWinPromotionData b;

        @c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promotionDialogFlow$lambda$1$$inlined$map$1$2", f = "InstantWinPromotionManagerImpl.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, pio pioVar, InstantWinPromotionData instantWinPromotionData) {
            this.a = myhVar;
            this.b = instantWinPromotionData;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
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
            InstantWinPromotionDialogInput instantWinPromotionDialogInput = null;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    List list = (List) ((lk50.c) lk50Var).a;
                    int i3 = pio.w;
                    InstantWinPromotionData instantWinPromotionData = this.b;
                    String strE = pio.e(instantWinPromotionData.getTitleKey(), list);
                    String strE2 = pio.e(instantWinPromotionData.getBodyKey(), list);
                    String strE3 = pio.e(instantWinPromotionData.getImageKey(), list);
                    if (strE != null && !StringsKt.U(strE) && strE2 != null && !StringsKt.U(strE2) && strE3 != null && !StringsKt.U(strE3)) {
                        String redirectUrl = instantWinPromotionData.getRedirectUrl();
                        if (redirectUrl == null) {
                            redirectUrl = "";
                        }
                        instantWinPromotionDialogInput = new InstantWinPromotionDialogInput(strE, strE2, strE3, redirectUrl);
                    }
                }
                aVar.b = 1;
                if (this.a.emit(instantWinPromotionDialogInput, aVar) == y5bVar) {
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

    public uio(lyh lyhVar, pio pioVar, InstantWinPromotionData instantWinPromotionData) {
        this.a = lyhVar;
        this.b = pioVar;
        this.c = instantWinPromotionData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super InstantWinPromotionDialogInput> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c);
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
