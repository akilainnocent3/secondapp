package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyScreenKt$rememberBackToTopState$1$1", f = "LNLobbyScreen.kt", l = {480}, m = "invokeSuspend", v = 2)
public final class apq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ytw<Boolean> c;

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyScreenKt$rememberBackToTopState$1$1$2", f = "LNLobbyScreen.kt", l = {485}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Pair<? extends Boolean, ? extends Boolean>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ zzr c;
        public final /* synthetic */ ytw<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zzr zzrVar, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = zzrVar;
            this.d = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends Boolean, ? extends Boolean> pair, v1b<? super Unit> v1bVar) {
            return ((a) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.d;
            if (i == 0) {
                uj50.b(obj);
                boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
                if (((Boolean) pair.b).booleanValue()) {
                    ytwVar.setValue(Boolean.FALSE);
                } else if (zBooleanValue) {
                    ytwVar.setValue(Boolean.TRUE);
                } else if (ytwVar.getValue().booleanValue()) {
                    this.b = null;
                    this.a = 1;
                    if (hkd.b(3000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            if (!this.c.i.c()) {
                ytwVar.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apq(zzr zzrVar, ytw<Boolean> ytwVar, v1b<? super apq> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new apq(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((apq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zzr zzrVar = this.b;
            or60 or60VarC = n95.c(new yb3(zzrVar, 1));
            a aVar = new a(zzrVar, this.c, null);
            this.a = 1;
            if (kzh.b(or60VarC, aVar, this) == y5bVar) {
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
