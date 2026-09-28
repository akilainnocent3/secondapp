package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$onRecommendTabViewed$1", f = "EventViewModel.kt", l = {HttpStatusCodesKt.HTTP_PERM_REDIRECT, 309, 310}, m = "invokeSuspend", v = 2)
public final class osg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public ssw b;
    public long c;
    public int d;
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osg(v1b v1bVar, e eVar) {
        super(2, v1bVar);
        this.e = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new osg(v1bVar, this.e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((osg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        long jLongValue;
        long j;
        ssw<Boolean> sswVar;
        Object objQ1;
        ssw sswVar2;
        y5b y5bVar = y5b.a;
        int i = this.d;
        e eVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = eVar.i;
            str = "recommend_tab_new_badge_first_viewed_at";
            this.a = "recommend_tab_new_badge_first_viewed_at";
            this.d = 1;
            obj = m2lVar.a.getLong("recommend_tab_new_badge_first_viewed_at", 0L, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            str = this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                j = this.c;
                uj50.b(obj);
                jLongValue = j;
                sswVar = eVar.u0;
                this.a = null;
                this.b = sswVar;
                this.c = jLongValue;
                this.d = 3;
                objQ1 = eVar.Q1(this);
                if (objQ1 != y5bVar) {
                    obj = objQ1;
                    sswVar2 = sswVar;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sswVar2 = this.b;
            uj50.b(obj);
        }
        sswVar2.m(obj);
        return Unit.a;
        jLongValue = ((Number) obj).longValue();
        if (jLongValue <= 0) {
            m2l m2lVar2 = eVar.i;
            Long l = new Long(System.currentTimeMillis());
            this.a = null;
            this.c = jLongValue;
            this.d = 2;
            if (m2lVar2.a.putLong(str, l, this) != y5bVar) {
                j = jLongValue;
                jLongValue = j;
                sswVar = eVar.u0;
                this.a = null;
                this.b = sswVar;
                this.c = jLongValue;
                this.d = 3;
                objQ1 = eVar.Q1(this);
                if (objQ1 != y5bVar) {
                    obj = objQ1;
                    sswVar2 = sswVar;
                    sswVar2.m(obj);
                    return Unit.a;
                }
            }
        } else {
            sswVar = eVar.u0;
            this.a = null;
            this.b = sswVar;
            this.c = jLongValue;
            this.d = 3;
            objQ1 = eVar.Q1(this);
            if (objQ1 != y5bVar) {
                obj = objQ1;
                sswVar2 = sswVar;
                sswVar2.m(obj);
                return Unit.a;
            }
        }
        return y5bVar;
    }
}
