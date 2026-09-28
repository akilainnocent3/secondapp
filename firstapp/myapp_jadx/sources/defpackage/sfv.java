package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class sfv implements lyh<aev> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ qfv b;
    public final /* synthetic */ dq40 c;

    @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$fetchDailyStreakInfo$$inlined$map$1", f = "MeScreenRowsProvider.kt", l = {109}, m = "collect", v = 2)
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
            return sfv.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ qfv b;
        public final /* synthetic */ dq40 c;

        @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$fetchDailyStreakInfo$$inlined$map$1$2", f = "MeScreenRowsProvider.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, qfv qfvVar, dq40 dq40Var) {
            this.a = myhVar;
            this.b = qfvVar;
            this.c = dq40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
            aev aevVar = null;
            if (i2 == 0) {
                uj50.b(obj2);
                h44 h44Var = (h44) obj;
                boolean z = h44Var.b;
                int i3 = h44Var.c;
                if (z && this.b.a.isLogin()) {
                    String strA = h44Var.d ? m58.a(i3, "+") : String.valueOf(i3);
                    this.c.a = (T) new Integer(i3);
                    aevVar = new aev(aev.b.DAILY_STREAK, new Integer(R.drawable.ic__daily_streak), new ResourceUiText(R.string.page_loyalty__daily_streak), h44Var.a, new aev.a.c(vch0.d(strA), new Integer(R.style.B2_B), kotlin.collections.b.k(new j58(r58.d(4290756543L)), new j58(r58.d(4294638330L)), new j58(r58.d(4288411901L)), new j58(r58.d(4294967295L)), new j58(r58.d(4289849342L))), kotlin.collections.b.k(new Float(0.0f), new Float(0.184f), new Float(0.4965f), new Float(0.7847f), new Float(1.0f)), new Integer(1000), new gly(0L), new Integer(R.color.text_inverse_tertiary), "daily_streak_count", new umz(8.0f, 2.0f, 8.0f, 2.0f), new g7f(100.0f), 12), false, false, null, 992);
                }
                aVar.b = 1;
                if (this.a.emit(aevVar, aVar) == y5bVar) {
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

    public sfv(vl50 vl50Var, qfv qfvVar, dq40 dq40Var) {
        this.a = vl50Var;
        this.b = qfvVar;
        this.c = dq40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super aev> myhVar, v1b v1bVar) {
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
