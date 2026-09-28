package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mxg implements bjs.a, wie.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ mxg(Object obj) {
        this.a = obj;
    }

    @Override // wie.b
    public void b() {
        SelfExclusionConfirmFragment selfExclusionConfirmFragment = (SelfExclusionConfirmFragment) this.a;
        selfExclusionConfirmFragment.i.logout();
        Intent intent = new Intent(hp0.A, (Class<?>) MainActivity.class);
        intent.setData(Uri.parse(o7d.a(wae.HOME)));
        intent.setFlags(67108864);
        selfExclusionConfirmFragment.startActivity(intent);
    }

    @Override // bjs.a
    public void invoke(Object obj) {
        co10 co10Var = (co10) this.a;
        ((so10.c) obj).Q(co10Var.m, co10Var.l);
    }
}
