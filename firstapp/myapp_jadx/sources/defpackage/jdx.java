package defpackage;

import androidx.compose.runtime.m;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljdx;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jdx extends j8i0 {
    public final lyz a;
    public final mgb0 b;
    public final ytw c;
    public final wwd0 d;
    public final v340 e;
    public final v340 f;

    @c0d(c = "com.sportybet.feature.kyc.nameupdateforfirstdeposit.NameUpdateByNINViewModel$confirmButtonStatus$2", f = "NameUpdateByNINViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<ijf0, hdx, v1b<? super uxs>, Object> {
        public /* synthetic */ ijf0 a;
        public /* synthetic */ hdx b;

        @Override // defpackage.gaj
        public final Object invoke(ijf0 ijf0Var, hdx hdxVar, v1b<? super uxs> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = ijf0Var;
            aVar.b = hdxVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ijf0 ijf0Var = this.a;
            hdx hdxVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = ijf0Var.a.b;
            if (hdxVar.b) {
                return uxs.LOADING;
            }
            return (str.length() != 11 || str.equals(hdxVar.a)) ? uxs.DISABLE : uxs.ENABLE;
        }
    }

    public jdx(lyz lyzVar, mgb0 mgb0Var) {
        lyzVar.getClass();
        mgb0Var.getClass();
        this.a = lyzVar;
        this.b = mgb0Var;
        this.c = m.b(new w4x());
        wwd0 wwd0VarA = xwd0.a(new hdx(0));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        this.f = e1i.e(new n1i(n95.c(new idx(this, 0)), wwd0VarA, new a(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), uxs.DISABLE);
    }
}
