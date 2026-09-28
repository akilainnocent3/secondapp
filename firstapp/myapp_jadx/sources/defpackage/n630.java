package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class n630 implements be80 {
    public final String a;
    public final sl5 b;
    public final ql5 c;
    public final bmp.b d;
    public final uaz e;
    public final Integer f;

    public n630(String str, ql5 ql5Var, bmp.b bVar, uaz uazVar, Integer num) {
        this.a = str;
        this.b = hrh0.b(str);
        this.c = ql5Var;
        this.d = bVar;
        this.e = uazVar;
        this.f = num;
    }

    public static n630 a(String str, ql5 ql5Var, bmp.b bVar, uaz uazVar, Integer num) throws GeneralSecurityException {
        if (uazVar == uaz.RAW) {
            if (num != null) {
                opp.a("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            opp.a("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new n630(str, ql5Var, bVar, uazVar, num);
    }
}
