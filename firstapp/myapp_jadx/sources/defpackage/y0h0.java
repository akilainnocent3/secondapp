package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class y0h0 implements lyh<gqx> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ LastDayRangeOption b;

    @c0d(c = "com.sportybet.android.transaction.domain.usecase.TxDateRangeNewFeatureAlertUseCase$getNewFeatureHintUiState$$inlined$map$1", f = "TxDateRangeNewFeatureAlertUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return y0h0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ LastDayRangeOption b;

        @c0d(c = "com.sportybet.android.transaction.domain.usecase.TxDateRangeNewFeatureAlertUseCase$getNewFeatureHintUiState$$inlined$map$1$2", f = "TxDateRangeNewFeatureAlertUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, LastDayRangeOption lastDayRangeOption) {
            this.a = myhVar;
            this.b = lastDayRangeOption;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            ResourceUiText resourceUiText;
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
            gqx gqxVar = null;
            if (i2 == 0) {
                uj50.b(obj2);
                if (((Boolean) obj).booleanValue()) {
                    int i3 = this.b.a;
                    if (i3 == 1) {
                        resourceUiText = new ResourceUiText(R.string.page_transaction__select_your_date_range_with_the_default_setting_today);
                    } else {
                        Object[] objArr = {new Integer(i3)};
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.page_transaction__select_your_date_range_with_the_default_setting_as_vnumber, ay0.S(objArr));
                    }
                    gqxVar = new gqx(resourceUiText);
                }
                aVar.b = 1;
                if (this.a.emit(gqxVar, aVar) == y5bVar) {
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

    public y0h0(yzh yzhVar, LastDayRangeOption lastDayRangeOption) {
        this.a = yzhVar;
        this.b = lastDayRangeOption;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super gqx> myhVar, v1b v1bVar) {
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
