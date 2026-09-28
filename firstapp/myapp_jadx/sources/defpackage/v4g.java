package defpackage;

import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class v4g implements t4g {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            EncryptedRequest encryptedRequest = (EncryptedRequest) obj;
            hq60Var.getClass();
            encryptedRequest.getClass();
            hq60Var.q(1, encryptedRequest.getId());
            hq60Var.q(2, encryptedRequest.getStartTime());
            hq60Var.L(3, encryptedRequest.getUrl());
            hq60Var.L(4, encryptedRequest.getMethod());
            hq60Var.L(5, encryptedRequest.getOriginalBody());
            hq60Var.L(6, encryptedRequest.getEncryptedBody());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR ABORT INTO `debug_screen_encrypted_requests` (`id`,`start_time`,`url`,`method`,`original_body`,`encrypted_body`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public v4g(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.t4g
    public final Object a(final EncryptedRequest encryptedRequest, q0d.a aVar) {
        Object objC = qlc.c(aVar, this.a, new Function1() { // from class: u4g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.m(vp60Var, encryptedRequest);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.t4g
    public final Object b(m5g m5gVar) {
        Object objC = qlc.c(m5gVar, this.a, new si7(1), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.t4g
    public final w4g getAll() {
        return new w4g(new bw50("SELECT * FROM debug_screen_encrypted_requests", new aw50()), this, this.a, new String[]{"debug_screen_encrypted_requests"});
    }
}
