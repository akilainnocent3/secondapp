package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ugb implements x82<mth, String> {
    public final /* synthetic */ String a;
    public final /* synthetic */ fgb b;

    public ugb(fgb fgbVar, String str) {
        this.a = str;
        this.b = fgbVar;
    }

    @Override // defpackage.x82
    public final void a(mth mthVar) {
        boolean z = mthVar == mth.NO_DEPOSIT;
        String str = this.a;
        fgb fgbVar = this.b;
        if (!z || str.length() <= 0) {
            gvi gviVar = fgbVar.z;
            if (gviVar != null) {
                gviVar.u0.setVisibility(4);
            }
        } else {
            gvi gviVar2 = fgbVar.z;
            if (gviVar2 != null) {
                gviVar2.u0.setVisibility(0);
            }
        }
        ((x5a0) fgbVar.c1().r0).setValue(Boolean.valueOf(z));
        ((x5a0) fgbVar.c1().s0).setValue(str);
        if (fgbVar.l0) {
            return;
        }
        fgbVar.M1(true);
    }

    @Override // defpackage.x82
    public final void onError(String str) {
        str.getClass();
        fgb fgbVar = this.b;
        gvi gviVar = fgbVar.z;
        if (gviVar != null) {
            gviVar.u0.setVisibility(4);
        }
        ((x5a0) fgbVar.c1().r0).setValue(Boolean.FALSE);
        ((x5a0) fgbVar.c1().s0).setValue("");
        if (fgbVar.l0) {
            return;
        }
        fgbVar.M1(true);
    }
}
