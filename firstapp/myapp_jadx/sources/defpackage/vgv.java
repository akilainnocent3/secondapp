package defpackage;

import com.sporty.android.core.model.config.VersionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initAppDownloadObserver$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vgv extends tje0 implements Function2<tr0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rhv b;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initAppDownloadObserver$1$1", f = "MeViewModel.kt", l = {277}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ rhv b;
        public final /* synthetic */ tr0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhv rhvVar, tr0 tr0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = rhvVar;
            this.c = tr0Var;
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
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                cu0 cu0Var = this.b.e;
                VersionData versionData = ((tr0.c) this.c).a;
                this.a = 1;
                fhb0 fhb0Var = cu0Var.a;
                Object objD = ej5.d(fhb0Var.g, new ygb0(fhb0Var, versionData, null), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
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
    public vgv(rhv rhvVar, v1b<? super vgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vgv vgvVar = new vgv(this.b, v1bVar);
        vgvVar.a = obj;
        return vgvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tr0 tr0Var, v1b<? super Unit> v1bVar) {
        return ((vgv) create(tr0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tr0 tr0Var = (tr0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = tr0Var instanceof tr0.a;
        rhv rhvVar = this.b;
        if (z) {
            ku90<iev> ku90Var = rhvVar.M;
            ku90Var.a.a(((tr0.a) tr0Var).a);
        } else if (tr0Var instanceof tr0.c) {
            ej5.c(o8i0.d(rhvVar), null, null, new a(rhvVar, tr0Var, null), 3);
        } else {
            if (!Intrinsics.g(tr0Var, tr0.b.a)) {
                uhc.a();
                return null;
            }
            Unit unit = Unit.a;
        }
        return Unit.a;
    }
}
