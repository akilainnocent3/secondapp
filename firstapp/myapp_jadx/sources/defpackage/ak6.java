package defpackage;

import com.sportybet.android.cashoutphase3.b;

/* JADX INFO: loaded from: classes5.dex */
public final class ak6 implements fz4 {
    public final /* synthetic */ b a;

    public ak6(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.fz4
    public final void a(ez4 ez4Var) {
        boolean z = ez4Var instanceof ez4.d;
        b bVar = this.a;
        if (!z) {
            bVar.y0().B1(ez4Var);
            return;
        }
        ez4.d dVar = (ez4.d) ez4Var;
        String str = dVar.a;
        String str2 = dVar.b;
        if (str == null || str2 == null) {
            return;
        }
        xyd0.a.a(str2, str, false, null).show(bVar.requireActivity().getSupportFragmentManager(), "statisticsDialogFragment");
    }
}
