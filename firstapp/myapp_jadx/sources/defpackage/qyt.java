package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class qyt implements lyh<hfv> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ syt b;
    public final /* synthetic */ oum c;
    public final /* synthetic */ UiText d;
    public final /* synthetic */ UiText e;
    public final /* synthetic */ UiText f;
    public final /* synthetic */ int i;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$lambda$0$$inlined$map$1", f = "LoyaltyStateMapper.kt", l = {109}, m = "collect", v = 2)
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
            return qyt.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ syt b;
        public final /* synthetic */ oum c;
        public final /* synthetic */ UiText d;
        public final /* synthetic */ UiText e;
        public final /* synthetic */ UiText f;
        public final /* synthetic */ int i;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$lambda$0$$inlined$map$1$2", f = "LoyaltyStateMapper.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, syt sytVar, oum oumVar, UiText uiText, UiText uiText2, UiText uiText3, int i) {
            this.a = myhVar;
            this.b = sytVar;
            this.c = oumVar;
            this.d = uiText;
            this.e = uiText2;
            this.f = uiText3;
            this.i = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            String str;
            krf0 krf0Var = this.c.c;
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
                n0u n0uVar = (n0u) obj;
                nt5 nt5Var = this.b.d;
                nt5.a aVarA = nt5.a(n0uVar);
                boolean z = aVarA.b;
                if (krf0Var == null || (str = krf0Var.d) == null) {
                    str = "https://s.sporty.net/cms/Tier_Iron_Status_Actived_Size_Big_381ddeece1.png";
                }
                String str2 = str;
                ConcatUiText concatUiTextC = syt.c(n0uVar.b.getNextUpgradeTime(), !z);
                boolean z2 = false;
                if (krf0Var != null && (krf0Var == krf0.TIER_6 || krf0Var == krf0.TIER_98)) {
                    z2 = true;
                }
                boolean z3 = !z2;
                float f = aVarA.a;
                hfv hfvVar = new hfv(true, syt.d(krf0Var), new lst.b(str2, this.d, this.e, this.f, z3, f, syt.b(f, z), concatUiTextC), krf0Var != null ? new Integer(krf0Var.a) : null, new Integer(this.i));
                aVar.b = 1;
                if (this.a.emit(hfvVar, aVar) == y5bVar) {
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

    public qyt(vl50 vl50Var, syt sytVar, oum oumVar, ConcatUiText concatUiText, ConcatUiText concatUiText2, ConcatUiText concatUiText3, int i) {
        this.a = vl50Var;
        this.b = sytVar;
        this.c = oumVar;
        this.d = concatUiText;
        this.e = concatUiText2;
        this.f = concatUiText3;
        this.i = i;
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
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e, this.f, this.i);
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
