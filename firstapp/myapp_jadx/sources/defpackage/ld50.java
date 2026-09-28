package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel$resetPassword$1", f = "ResetPasswordViewModel.kt", l = {161}, m = "invokeSuspend", v = 2)
public final class ld50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kd50 c;
    public final /* synthetic */ String d;

    public static final class a<T> implements myh {
        public final /* synthetic */ kd50 a;

        public a(kd50 kd50Var) {
            this.a = kd50Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            lk50 lk50Var = (lk50) obj;
            kd50 kd50Var = this.a;
            String str = kd50Var.B;
            wwd0 wwd0Var = kd50Var.C;
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, dd50.a((dd50) value3, null, false, uxs.LOADING, null, null, 27)));
            } else if (lk50Var instanceof lk50.a) {
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                UiText uiTextB = ((lk50.a) lk50Var).b;
                if (Intrinsics.g(uiTextB, vch0.a)) {
                    uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
                }
                UiText uiText = uiTextB;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, dd50.a((dd50) value2, null, false, uxs.ENABLE, null, new sb50.a(uiText, rb50.d.a), 11)));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                if (!StringsKt.U(str)) {
                    kd50Var.f.a(new gd50(str), k00.a, k00.c, k00.b);
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, dd50.a((dd50) value, null, false, uxs.ENABLE, null, null, 27)));
                wvz wvzVar = (wvz) ((lk50.c) lk50Var).a;
                boolean z = (StringsKt.U(wvzVar.c) || StringsKt.U(wvzVar.d) || StringsKt.U(wvzVar.b)) ? false : true;
                kd50Var.D.a.a(new ub50.a(kd50Var.z, z, wvzVar));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld50(v1b v1bVar, kd50 kd50Var, String str, String str2) {
        super(2, v1bVar);
        this.b = str;
        this.c = kd50Var;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ld50(v1bVar, this.c, this.b, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ld50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        Object value;
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            String str = this.b;
            twz.a aVarA = twz.a(str);
            boolean z = aVarA instanceof twz.a.C1152a;
            kd50 kd50Var = this.c;
            if (z) {
                wwd0 wwd0Var = kd50Var.C;
                do {
                    value = wwd0Var.getValue();
                    i = ((twz.a.C1152a) aVarA).a;
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value, dd50.a((dd50) value, null, false, null, new ResourceUiText(i), null, 23)));
                return Unit.a;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
                for (byte b : bArrDigest) {
                    char[] cArr = tel.a;
                    sb.append(cArr[(b & 240) >>> 4]);
                    sb.append(cArr[b & 15]);
                }
                string = sb.toString();
            } catch (Exception unused) {
                string = "";
            }
            hd50 hd50Var = kd50Var.d;
            String str2 = kd50Var.z;
            hd50Var.getClass();
            str2.getClass();
            String str3 = this.d;
            str3.getClass();
            yzh yzhVarD = hd50Var.a.d(str3, string, str2);
            a aVar = new a(kd50Var);
            this.a = 1;
            if (yzhVarD.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
