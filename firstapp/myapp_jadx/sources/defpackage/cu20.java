package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.platform.features.newotp.model.OTPVerifyState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu20;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cu20 extends j8i0 {
    public final v340 A;
    public final wwd0 B;
    public final v340 C;
    public final uqm a;
    public final psm b;
    public final lyz c;
    public final com.sporty.android.platform.features.newotp.util.a d;
    public final ytw e;
    public final ytw f;
    public final wwd0 i;
    public final v340 v;
    public final b390 w;
    public final t340 y;
    public final v340 z;

    @c0d(c = "com.sportybet.feature.primaryphone.updatephonenumber.PrimaryPhoneUpdatePhoneNumberViewModel$confirmButtonStatus$1", f = "PrimaryPhoneUpdatePhoneNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<tkh0, ijf0, ijf0, v1b<? super uxs>, Object> {
        public /* synthetic */ tkh0 a;
        public /* synthetic */ ijf0 b;
        public /* synthetic */ ijf0 c;

        @Override // defpackage.iaj
        public final Object d(tkh0 tkh0Var, ijf0 ijf0Var, ijf0 ijf0Var2, v1b<? super uxs> v1bVar) {
            a aVar = new a(4, v1bVar);
            aVar.a = tkh0Var;
            aVar.b = ijf0Var;
            aVar.c = ijf0Var2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tkh0 tkh0Var = this.a;
            ijf0 ijf0Var = this.b;
            ijf0 ijf0Var2 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = Intrinsics.g(ijf0Var, ijf0Var2) && ijf0Var.a.b.length() > 0 && ijf0Var2.a.b.length() > 0;
            if (tkh0Var.g) {
                return uxs.LOADING;
            }
            return z ? uxs.ENABLE : uxs.DISABLE;
        }
    }

    @c0d(c = "com.sportybet.feature.primaryphone.updatephonenumber.PrimaryPhoneUpdatePhoneNumberViewModel$isPhoneNumberMatch$1", f = "PrimaryPhoneUpdatePhoneNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<ijf0, ijf0, v1b<? super Boolean>, Object> {
        public /* synthetic */ ijf0 a;
        public /* synthetic */ ijf0 b;

        @Override // defpackage.gaj
        public final Object invoke(ijf0 ijf0Var, ijf0 ijf0Var2, v1b<? super Boolean> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = ijf0Var;
            bVar.b = ijf0Var2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ijf0 ijf0Var = this.a;
            ijf0 ijf0Var2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nk0 nk0Var = ijf0Var.a;
            String str = nk0Var.b;
            nk0 nk0Var2 = ijf0Var2.a;
            boolean z = true;
            if (!Intrinsics.g(str, nk0Var2.b) && !Intrinsics.g(nk0Var.b, nk0Var2.b) && nk0Var.b.length() > 0 && nk0Var2.b.length() > 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public cu20(uqm uqmVar, psm psmVar, lyz lyzVar, com.sporty.android.platform.features.newotp.util.a aVar) {
        uqmVar.getClass();
        psmVar.getClass();
        lyzVar.getClass();
        this.a = uqmVar;
        this.b = psmVar;
        this.c = lyzVar;
        this.d = aVar;
        this.e = m.b(new ws00());
        ytw ytwVarB = m.b(new ws00());
        this.f = ytwVarB;
        String phoneNumber = uqmVar.getPhoneNumber();
        phoneNumber.getClass();
        wwd0 wwd0VarA = xwd0.a(new tkh0(phoneNumber, WebSocketProtocol.PAYLOAD_SHORT));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.w = b390VarB;
        this.y = e1i.a(b390VarB);
        this.z = e1i.e(r1i.a(wwd0VarA, y1().g, ((ws00) ((x5a0) ytwVarB).getValue()).g, new a(4, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), uxs.DISABLE);
        this.A = e1i.e(new n1i(y1().g, ((ws00) ((x5a0) ytwVarB).getValue()).g, new b(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.TRUE);
        wwd0 wwd0VarA2 = xwd0.a(new OTPVerifyState(0, null, 3, null));
        this.B = wwd0VarA2;
        this.C = e1i.b(wwd0VarA2);
    }

    public final void x1(mt20 mt20Var) {
        mt20Var.getClass();
        ej5.c(o8i0.d(this), null, null, new du20(this, mt20Var, null), 3);
    }

    public final ws00 y1() {
        return (ws00) ((x5a0) this.e).getValue();
    }
}
