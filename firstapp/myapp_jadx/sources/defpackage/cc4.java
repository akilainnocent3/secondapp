package defpackage;

import androidx.compose.runtime.m;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc4;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cc4 extends j8i0 {
    public final w74 a;
    public final uqm b;
    public final psm c;
    public final com.sporty.android.platform.features.newotp.util.a d;
    public final ytw e;
    public final wwd0 f;
    public final v340 i;
    public final v340 v;

    @c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verifyidentity.BioAuthVerifyIdentityViewModel$confirmButtonStatus$1", f = "BioAuthVerifyIdentityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<Boolean, bc4, v1b<? super uxs>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ bc4 b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, bc4 bc4Var, v1b<? super uxs> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = bc4Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            bc4 bc4Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (bc4Var.a) {
                return uxs.LOADING;
            }
            return z ? uxs.ENABLE : uxs.DISABLE;
        }
    }

    public cc4(w74 w74Var, uqm uqmVar, psm psmVar, com.sporty.android.platform.features.newotp.util.a aVar) {
        w74Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        this.a = w74Var;
        this.b = uqmVar;
        this.c = psmVar;
        this.d = aVar;
        ytw ytwVarB = m.b(new zvz());
        this.e = ytwVarB;
        wwd0 wwd0VarA = xwd0.a(new bc4(0));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        this.v = e1i.e(new n1i(((zvz) ((x5a0) ytwVarB).getValue()).h, wwd0VarA, new a(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), uxs.DISABLE);
    }
}
