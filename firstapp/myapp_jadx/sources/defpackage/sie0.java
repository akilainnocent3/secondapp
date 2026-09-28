package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class sie0 implements rie0, fjt {
    public final lie0 a;
    public final z2b b;
    public final m2l c;
    public final JsonSerializeService d;
    public final k5b e;
    public final uqm f;
    public final str<String> i;
    public final ku90<wie0> v;
    public final t340 w;

    @c0d(c = "com.sporty.android.core.data.repository.survey.SurveyRepositoryImpl$completeSurvey$1", f = "SurveyRepositoryImpl.kt", l = {109, 109}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = sie0.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L4b
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                sie0 r7 = defpackage.sie0.this
                lie0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L37
                goto L4a
            L37:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                defpackage.n52.c(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sie0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.survey.SurveyRepositoryImpl$onLogout$1", f = "SurveyRepositoryImpl.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sie0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (sie0.this.c.a.putString("survey_ids", "", this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public sie0(lie0 lie0Var, z2b z2bVar, m2l m2lVar, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, uqm uqmVar, str<String> strVar) {
        lie0Var.getClass();
        z2bVar.getClass();
        m2lVar.getClass();
        jsonSerializeService.getClass();
        uqmVar.getClass();
        strVar.getClass();
        this.a = lie0Var;
        this.b = z2bVar;
        this.c = m2lVar;
        this.d = jsonSerializeService;
        this.e = k5bVar;
        this.f = uqmVar;
        this.i = strVar;
        ku90<wie0> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
        uqmVar.addLogoutEventListener(this);
    }

    @Override // defpackage.rie0
    public final lyh<Unit> a(String str) {
        str.getClass();
        return ozh.c(new or60(new a(str, null)), this.e);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.rie0
    public final Object b(mie0 mie0Var, x1b x1bVar) {
        tie0 tie0Var;
        Object bVar;
        Throwable thA;
        mie0 mie0Var2;
        String str;
        String str2;
        if (x1bVar instanceof tie0) {
            tie0Var = (tie0) x1bVar;
            int i = tie0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tie0Var.f = i - Integer.MIN_VALUE;
            } else {
                tie0Var = new tie0(this, x1bVar);
            }
        } else {
            tie0Var = new tie0(this, x1bVar);
        }
        Object objD = tie0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = tie0Var.f;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                tie0Var.a = mie0Var;
                tie0Var.f = 1;
                objD = ej5.d(this.e, new vie0(this, mie0Var, null), tie0Var);
                if (objD != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 == 1) {
                mie0Var = tie0Var.a;
                uj50.b(objD);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = tie0Var.c;
                str = tie0Var.b;
                mie0Var2 = tie0Var.a;
                uj50.b(objD);
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SURVEY);
            aVar.a("emitSurveyId: " + mie0Var2 + ", id: " + str, new Object[0]);
            bVar = Boolean.valueOf(this.v.a.a(new wie0(str2, str)));
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.f(thA, e40.a(aVar3, MyLog.TAG_SURVEY, "emitSurveyId error: ", thA), new Object[0]);
            }
            return Unit.a;
            String str3 = (String) objD;
            uqm uqmVar = this.f;
            if (!uqmVar.isLogin() || str3 == null || str3.length() == 0) {
                return Unit.a;
            }
            zi50.a aVar4 = zi50.b;
            String str4 = this.i.get();
            str4.getClass();
            String string = Uri.parse(str4).buildUpon().appendQueryParameter(AnalyticsParam.EVENT_PARAM_ID, str3).build().toString();
            string.getClass();
            String strFetchRefreshToken = uqmVar.fetchRefreshToken();
            z2b z2bVar = this.b;
            tie0Var.a = mie0Var;
            tie0Var.b = str3;
            tie0Var.c = string;
            tie0Var.f = 2;
            if (z2bVar.a(string, strFetchRefreshToken, tie0Var) != y5bVar) {
                mie0Var2 = mie0Var;
                str = str3;
                str2 = string;
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_SURVEY);
                aVar5.a("emitSurveyId: " + mie0Var2 + ", id: " + str, new Object[0]);
                bVar = Boolean.valueOf(this.v.a.a(new wie0(str2, str)));
                zi50.a aVar6 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar7 = itf0.a;
                    aVar7.f(thA, e40.a(aVar7, MyLog.TAG_SURVEY, "emitSurveyId error: ", thA), new Object[0]);
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar8 = zi50.b;
            bVar = new zi50.b(th);
        }
    }

    @Override // defpackage.rie0
    public final Object c(vku vkuVar) {
        Object objD = ej5.d(this.e, new uie0(this, null), vkuVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.rie0
    public final t340 d() {
        return this.w;
    }

    @Override // defpackage.fjt
    public final void p() {
        ej5.c(w5b.a(this.e), null, null, new b(null), 3);
    }
}
