package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$3", f = "LNLobbyViewModel.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class mpq extends tje0 implements Function2<fpq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ spq c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fpq.values().length];
            try {
                iArr[fpq.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fpq.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpq(v1b v1bVar, spq spqVar) {
        super(2, v1bVar);
        this.c = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mpq mpqVar = new mpq(v1bVar, this.c);
        mpqVar.b = obj;
        return mpqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fpq fpqVar, v1b<? super Unit> v1bVar) {
        return ((mpq) create(fpqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fpq fpqVar = (fpq) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            int i2 = fpqVar == null ? -1 : a.a[fpqVar.ordinal()];
            if (i2 != -1 && i2 != 1) {
                if (i2 != 2) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var = this.c.Q;
                Long l = new Long(System.currentTimeMillis());
                this.b = null;
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, l);
                obj = Unit.a;
                if (obj == y5bVar) {
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
        return Unit.a;
    }
}
