package defpackage;

import android.util.Range;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class r740 implements lyh<ResourceUiText> {
    public final /* synthetic */ wwd0 a;

    @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$3", f = "RealBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return r740.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$special$$inlined$map$3$2", f = "RealBetHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar) {
            this.a = myhVar;
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
            ResourceUiText resourceUiText = null;
            if (i2 == 0) {
                uj50.b(obj2);
                Range range = (Range) obj;
                if (range != null) {
                    Comparable lower = range.getLower();
                    lower.getClass();
                    bwf0 bwf0Var = bwf0.a;
                    String strI = bwf0Var.i((Date) lower, false);
                    Comparable upper = range.getUpper();
                    upper.getClass();
                    Object[] objArr = {strI, bwf0Var.i((Date) upper, false)};
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.app_common__date_range, ay0.S(objArr));
                }
                aVar.b = 1;
                if (this.a.emit(resourceUiText, aVar) == y5bVar) {
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

    public r740(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super ResourceUiText> myhVar, v1b v1bVar) throws Throwable {
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
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        b bVar = new b(myhVar);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
