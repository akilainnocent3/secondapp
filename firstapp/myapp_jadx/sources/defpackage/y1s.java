package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardScreenKt$LeaderboardRoute$1$1", f = "LeaderboardScreen.kt", l = {112}, m = "invokeSuspend", v = 2)
public final class y1s extends tje0 implements gaj<v5b, e1s, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ e1s b;
    public final /* synthetic */ v5b c;
    public final /* synthetic */ v3a0 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ zzr f;

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardScreenKt$LeaderboardRoute$1$1$1", f = "LeaderboardScreen.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ e1s b;
        public final /* synthetic */ zzr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1s e1sVar, zzr zzrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = e1sVar;
            this.c = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                int i2 = ((e1s.a) this.b).a + 2;
                zzr zzrVar = this.c;
                int size = zzrVar.j().k().size();
                if (size > 4 && (i2 = (i2 - size) + 4) < 0) {
                    i2 = 0;
                }
                this.a = 1;
                if (zzrVar.f(i2, 0, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1s(v5b v5bVar, v3a0 v3a0Var, Context context, zzr zzrVar, v1b<? super y1s> v1bVar) {
        super(3, v1bVar);
        this.c = v5bVar;
        this.d = v3a0Var;
        this.e = context;
        this.f = zzrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, e1s e1sVar, v1b<? super Unit> v1bVar) {
        Context context = this.e;
        zzr zzrVar = this.f;
        y1s y1sVar = new y1s(this.c, this.d, context, zzrVar, v1bVar);
        y1sVar.b = e1sVar;
        return y1sVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e1s e1sVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (e1sVar instanceof e1s.a) {
                ej5.c(this.c, null, null, new a(e1sVar, this.f, null), 3);
            } else {
                if (!(e1sVar instanceof e1s.b)) {
                    uhc.a();
                    return null;
                }
                String strB = sn5.b(this.e, R.string.page_loyalty__challenge_toast_rank_not_in_top, String.valueOf(((e1s.b) e1sVar).a));
                this.b = null;
                this.a = 1;
                if (v3a0.b(this.d, strB, null, true, null, this, 10) == y5bVar) {
                    return y5bVar;
                }
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
