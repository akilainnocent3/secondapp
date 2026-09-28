package defpackage;

import android.accounts.Account;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaConfigInfo;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fe6 {
    public final jd6[] a;
    public final t8w b;
    public final uqm c;
    public final m2l d;
    public final psm e;
    public int f;

    public interface a {

        /* JADX INFO: renamed from: fe6$a$a, reason: collision with other inner class name */
        public static final class C0561a implements a {
            public final jd6 a;
            public final String b;
            public final String c;

            public C0561a(jd6 jd6Var, String str, String str2) {
                str2.getClass();
                this.a = jd6Var;
                this.b = str;
                this.c = str2;
            }

            @Override // fe6.a
            public final String a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0561a)) {
                    return false;
                }
                C0561a c0561a = (C0561a) obj;
                return this.a.equals(c0561a.a) && this.b.equals(c0561a.b) && Intrinsics.g(this.c, c0561a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HasCaptcha(captchaRepo=");
                sb.append(this.a);
                sb.append(", siteKey=");
                sb.append(this.b);
                sb.append(", uuid=");
                return uf80.a(sb, this.c, ")");
            }
        }

        public static final class b implements a {
            public final String a;

            public b(String str) {
                str.getClass();
                this.a = str;
            }

            @Override // fe6.a
            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NoCaptcha(uuid=", this.a, ")");
            }
        }

        String a();
    }

    public fe6(jd6[] jd6VarArr, t8w t8wVar, uqm uqmVar, m2l m2lVar, psm psmVar) {
        jd6VarArr.getClass();
        t8wVar.getClass();
        uqmVar.getClass();
        m2lVar.getClass();
        psmVar.getClass();
        this.a = jd6VarArr;
        this.b = t8wVar;
        this.c = uqmVar;
        this.d = m2lVar;
        this.e = psmVar;
    }

    public final jv5 a(j6c j6cVar, CaptchaData.Email email, final v5b v5bVar, final Function1 function1) {
        v5bVar.getClass();
        final dq40 dq40Var = new dq40();
        return hzh.a(new he6(new ema(), c(j6cVar, email, new Function1() { // from class: xd6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                final dq40 dq40Var2 = dq40Var;
                final v5b v5bVar2 = v5bVar;
                final Function1 function2 = function1;
                return new au90(new bv90() { // from class: de6
                    /* JADX WARN: Type inference failed for: r5v2, types: [T, jvd0] */
                    @Override // defpackage.bv90
                    public final void a(au90.a aVar) {
                        dq40Var2.a = ej5.c(v5bVar2, null, null, new ie6(function2, captchaHeader, aVar, null), 3);
                    }
                });
            }
        }), dq40Var, null));
    }

    public final cu90 b(j6c j6cVar, CaptchaData captchaData, String str, boolean z, Function1 function1) {
        CaptchaData.Phone phone;
        CaptchaData.Email email;
        if (captchaData != null) {
            phone = (CaptchaData.Phone) (!(captchaData instanceof CaptchaData.Phone) ? null : captchaData);
        } else {
            phone = null;
        }
        if (captchaData != null) {
            email = (CaptchaData.Email) (!(captchaData instanceof CaptchaData.Email) ? null : captchaData);
        } else {
            email = null;
        }
        ct90<bi50<BaseResponse<CaptchaConfigInfo>>> ct90VarB = this.b.b(j6cVar.a, phone != null ? phone.getPhoneCountryCode() : null, phone != null ? phone.getPhone() : null, email != null ? email.getEmail() : null, str).d(wm70.c).b(va0.a());
        final md6 md6Var = new md6(this, 0);
        xu90 xu90Var = new xu90(ct90VarB, new faj() { // from class: nd6
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (fe6.a) md6Var.invoke(obj);
            }
        });
        final yd6 yd6Var = new yd6(this, j6cVar, function1, z, captchaData);
        return new cu90(new lu90(xu90Var, new faj() { // from class: zd6
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (dw90) yd6Var.invoke(obj);
            }
        }), new ib() { // from class: ae6
            @Override // defpackage.ib
            public final void run() {
                this.a.f = 0;
            }
        });
    }

    public final cu90 c(j6c j6cVar, CaptchaData captchaData, Function1 function1) {
        String str;
        j6cVar.getClass();
        if (captchaData == null) {
            Account account = this.c.getAccount();
            if (account == null || (str = account.name) == null) {
                captchaData = null;
            } else {
                psm psmVar = this.e;
                captchaData = psmVar.r() ? new CaptchaData.Email(str) : new CaptchaData.Phone(str, psmVar.P());
            }
        }
        return b(j6cVar, captchaData, null, true, function1);
    }

    public final jv5 d(j6c j6cVar, CaptchaData captchaData, Function1 function1) {
        j6cVar.getClass();
        return hzh.a(new me6(new ema(), this, j6cVar, captchaData, new dq40(), function1, null));
    }
}
