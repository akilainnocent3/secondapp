package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.media3.exoplayer.d;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lxg implements vs1.a, wie.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ lxg(Object obj) {
        this.a = obj;
    }

    @Override // vs1.a
    public void a(Object obj, Object obj2) {
        d dVar = (d) this.a;
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        final int iIntValue = num.intValue();
        dVar.S0();
        dVar.G0(1, 10, num);
        dVar.G0(2, 10, num);
        dVar.m.f(21, new bjs.a() { // from class: sxg
            @Override // bjs.a
            public final void invoke(Object obj3) {
                ((so10.c) obj3).p(iIntValue);
            }
        });
    }

    @Override // wie.b
    public void b() {
        SelfExclusionConfirmFragment selfExclusionConfirmFragment = (SelfExclusionConfirmFragment) this.a;
        selfExclusionConfirmFragment.E.show();
        selfExclusionConfirmFragment.getActivity().finish();
        selfExclusionConfirmFragment.i.logout();
        Intent intent = new Intent(hp0.A, (Class<?>) MainActivity.class);
        intent.setData(Uri.parse(o7d.a(wae.HOME)));
        intent.setFlags(67108864);
        selfExclusionConfirmFragment.startActivity(intent);
    }
}
