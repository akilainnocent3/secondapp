package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ryt implements lyh<hfv> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ syt b;
    public final /* synthetic */ oum c;
    public final /* synthetic */ LoyaltyAggregateHintData d;
    public final /* synthetic */ UiText e;
    public final /* synthetic */ UiText f;
    public final /* synthetic */ UiText i;
    public final /* synthetic */ int v;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$lambda$0$$inlined$map$2", f = "LoyaltyStateMapper.kt", l = {109}, m = "collect", v = 2)
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
            return ryt.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ syt b;
        public final /* synthetic */ oum c;
        public final /* synthetic */ LoyaltyAggregateHintData d;
        public final /* synthetic */ UiText e;
        public final /* synthetic */ UiText f;
        public final /* synthetic */ UiText i;
        public final /* synthetic */ int v;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$lambda$0$$inlined$map$2$2", f = "LoyaltyStateMapper.kt", l = {63, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public nt5.a e;
            public ConcatUiText f;
            public String i;

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

        public b(myh myhVar, syt sytVar, oum oumVar, LoyaltyAggregateHintData loyaltyAggregateHintData, UiText uiText, UiText uiText2, UiText uiText3, int i) {
            this.a = myhVar;
            this.b = sytVar;
            this.c = oumVar;
            this.d = loyaltyAggregateHintData;
            this.e = uiText;
            this.f = uiText2;
            this.i = uiText3;
            this.v = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
        
            if (r10.emit(r21, r3) == r4) goto L45;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r28, defpackage.v1b r29) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ryt.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public ryt(vl50 vl50Var, syt sytVar, oum oumVar, LoyaltyAggregateHintData loyaltyAggregateHintData, ConcatUiText concatUiText, ConcatUiText concatUiText2, ConcatUiText concatUiText3, int i) {
        this.a = vl50Var;
        this.b = sytVar;
        this.c = oumVar;
        this.d = loyaltyAggregateHintData;
        this.e = concatUiText;
        this.f = concatUiText2;
        this.i = concatUiText3;
        this.v = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super hfv> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e, this.f, this.i, this.v);
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
