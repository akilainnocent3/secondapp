package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class d510 implements x82<mth, String> {
    public final /* synthetic */ m410 a;

    public d510(m410 m410Var) {
        this.a = m410Var;
    }

    @Override // defpackage.x82
    public final void a(mth mthVar) {
        io80 binding;
        io80 binding2;
        io80 binding3;
        io80 binding4;
        io80 binding5;
        boolean z = mthVar == mth.NO_DEPOSIT;
        m410 m410Var = this.a;
        m410Var.q1 = z;
        String strC = op5.c(op5.a, "first_time_user_deposit_text:sg_common", "");
        boolean z2 = m410Var.q1;
        B b = m410Var.b;
        if (z2) {
            ixi ixiVar = (ixi) b;
            if (ixiVar != null && (binding5 = ixiVar.L.getBinding()) != null) {
                binding5.z.setVisibility(4);
            }
            ixi ixiVar2 = (ixi) m410Var.b;
            if (ixiVar2 != null && (binding4 = ixiVar2.L.getBinding()) != null) {
                binding4.y.setVisibility(0);
            }
            ixi ixiVar3 = (ixi) m410Var.b;
            if (ixiVar3 != null && (binding3 = ixiVar3.L.getBinding()) != null) {
                gr60.a(binding3.y, new jt4(2));
            }
            int length = strC.length();
            B b2 = m410Var.b;
            if (length > 0) {
                ixi ixiVar4 = (ixi) b2;
                if (ixiVar4 != null) {
                    ixiVar4.Y.setVisibility(0);
                }
                ixi ixiVar5 = (ixi) m410Var.b;
                if (ixiVar5 != null) {
                    ixiVar5.Y.setText(strC);
                }
            } else {
                ixi ixiVar6 = (ixi) b2;
                if (ixiVar6 != null) {
                    ixiVar6.Y.setVisibility(4);
                }
            }
        } else {
            ixi ixiVar7 = (ixi) b;
            if (ixiVar7 != null && (binding2 = ixiVar7.L.getBinding()) != null) {
                binding2.z.setVisibility(0);
            }
            ixi ixiVar8 = (ixi) m410Var.b;
            if (ixiVar8 != null && (binding = ixiVar8.L.getBinding()) != null) {
                binding.y.setVisibility(4);
            }
            ixi ixiVar9 = (ixi) m410Var.b;
            if (ixiVar9 != null) {
                ixiVar9.Y.setVisibility(4);
            }
        }
        if (m410Var.K0) {
            return;
        }
        m410Var.f1();
    }

    @Override // defpackage.x82
    public final void onError(String str) {
        io80 binding;
        io80 binding2;
        str.getClass();
        m410 m410Var = this.a;
        ixi ixiVar = (ixi) m410Var.b;
        if (ixiVar != null && (binding2 = ixiVar.L.getBinding()) != null) {
            binding2.z.setVisibility(0);
        }
        ixi ixiVar2 = (ixi) m410Var.b;
        if (ixiVar2 != null && (binding = ixiVar2.L.getBinding()) != null) {
            binding.y.setVisibility(4);
        }
        ixi ixiVar3 = (ixi) m410Var.b;
        if (ixiVar3 != null) {
            ixiVar3.Y.setVisibility(4);
        }
        if (m410Var.K0) {
            return;
        }
        m410Var.f1();
    }
}
