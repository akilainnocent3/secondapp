package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sportybet.android.router.Sender;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class hq40 extends wgm {
    public final m730<fbh0> d;
    public final ys60 e;
    public final v5b f;

    @c0d(c = "com.sportybet.android.uibus.ReferralLinkRouter$openUri$1", f = "ReferralLinkRouter.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hq40.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            String str = null;
            if (i == 0) {
                uj50.b(obj);
                ys60 ys60Var = hq40.this.e;
                this.a = 1;
                String str2 = this.c;
                if (str2 != null && !StringsKt.U(str2)) {
                    str = str2;
                }
                yb00 yb00Var = (yb00) ys60Var.a;
                if ((str != null ? yb00Var.a.putString("pending_referral_code", str, this) : yb00Var.a.b("pending_referral_code", this)) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq40(v7b v7bVar, skd skdVar, bnh0 bnh0Var, ys60 ys60Var, @ApplicationScope v5b v5bVar) {
        super(v7bVar, skdVar, bnh0Var);
        skdVar.getClass();
        bnh0Var.getClass();
        v5bVar.getClass();
        this.d = skdVar;
        this.e = ys60Var;
        this.f = v5bVar;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return false;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        ej5.c(this.f, null, null, new a(uri.getQueryParameter("referralCode"), null), 3);
        this.d.get().e(o7d.a(wae.REGISTER));
        return true;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 55;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (!super.verifyUri(uri, str, str2)) {
            return false;
        }
        try {
            if (Intrinsics.g(uri.getQueryParameter("register"), "true")) {
                return true;
            }
            String queryParameter = uri.getQueryParameter("referralCode");
            return (queryParameter == null || StringsKt.U(queryParameter)) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
