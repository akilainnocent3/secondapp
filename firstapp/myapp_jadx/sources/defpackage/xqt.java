package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyAppBarKt$LoyaltyAppBar$1$1", f = "LoyaltyAppBar.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class xqt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ isw c;
    public final /* synthetic */ isw d;

    public static final class a<T> implements myh {
        public final /* synthetic */ isw a;
        public final /* synthetic */ isw b;

        public a(isw iswVar, isw iswVar2) {
            this.a = iswVar;
            this.b = iswVar2;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            dq0 dq0Var = (dq0) obj;
            boolean z = dq0Var instanceof dq0.a;
            isw iswVar = this.b;
            isw iswVar2 = this.a;
            float f = 1.0f;
            if (z) {
                dq0.a aVar = (dq0.a) dq0Var;
                int i = aVar.a;
                float f2 = aVar.b;
                float f3 = 0.4f * f2;
                float f4 = i;
                float f5 = f4 / f3;
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                iswVar2.A(f5);
                float f6 = (f4 - (f2 * 0.6f)) / f3;
                if (f6 < 0.0f) {
                    f = 0.0f;
                } else if (f6 <= 1.0f) {
                    f = f6;
                }
                iswVar.A(f);
            } else {
                if (!Intrinsics.g(dq0Var, dq0.b.a)) {
                    uhc.a();
                    return null;
                }
                iswVar2.A(1.0f);
                iswVar.A(1.0f);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqt(zzr zzrVar, isw iswVar, isw iswVar2, v1b<? super xqt> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = iswVar;
        this.d = iswVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xqt(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xqt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final zzr zzrVar = this.b;
            or60 or60VarC = n95.c(new Function0() { // from class: wqt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    zzr zzrVar2 = zzrVar;
                    if (zzrVar2.j().k().isEmpty()) {
                        return new dq0.a(0, 0);
                    }
                    zyr zyrVar = (zyr) CollectionsKt.firstOrNull(zzrVar2.j().k());
                    if (zyrVar != null) {
                        if (zyrVar.getIndex() != 0) {
                            zyrVar = null;
                        }
                        if (zyrVar != null) {
                            return new dq0.a(zzrVar2.i(), zyrVar.a());
                        }
                    }
                    return dq0.b.a;
                }
            });
            a aVar = new a(this.c, this.d);
            this.a = 1;
            if (or60VarC.collect(aVar, this) == y5bVar) {
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
