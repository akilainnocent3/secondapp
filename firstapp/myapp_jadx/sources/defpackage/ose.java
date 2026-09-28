package defpackage;

import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class ose implements x82 {
    public final Object a;

    public ose() {
        this.a = (SmallDisplaySizeQuirk) zhe.a.b(SmallDisplaySizeQuirk.class);
    }

    @Override // defpackage.x82
    public void a(mth mthVar) {
        jo80 binding;
        jo80 binding2;
        jo80 binding3;
        jo80 binding4;
        jo80 binding5;
        zy10 zy10Var = (zy10) this.a;
        zy10Var.g1 = mthVar == mth.NO_DEPOSIT;
        String strC = op5.c(op5.a, "first_time_user_deposit_text:sg_common", "");
        boolean z = zy10Var.g1;
        zt50 zt50Var = zy10Var.b;
        if (z) {
            if (zt50Var != null && (binding5 = zt50Var.K.getBinding()) != null) {
                binding5.A.setVisibility(4);
            }
            zt50 zt50Var2 = zy10Var.b;
            if (zt50Var2 != null && (binding4 = zt50Var2.K.getBinding()) != null) {
                binding4.z.setVisibility(0);
            }
            zt50 zt50Var3 = zy10Var.b;
            if (zt50Var3 != null && (binding3 = zt50Var3.K.getBinding()) != null) {
                gr60.a(binding3.z, new hz10());
            }
            int length = strC.length();
            zt50 zt50Var4 = zy10Var.b;
            if (length > 0) {
                if (zt50Var4 != null) {
                    zt50Var4.W.setVisibility(0);
                }
                zt50 zt50Var5 = zy10Var.b;
                if (zt50Var5 != null) {
                    zt50Var5.W.setText(strC);
                }
            } else if (zt50Var4 != null) {
                zt50Var4.W.setVisibility(4);
            }
        } else {
            if (zt50Var != null && (binding2 = zt50Var.K.getBinding()) != null) {
                binding2.A.setVisibility(0);
            }
            zt50 zt50Var6 = zy10Var.b;
            if (zt50Var6 != null && (binding = zt50Var6.K.getBinding()) != null) {
                binding.z.setVisibility(4);
            }
            zt50 zt50Var7 = zy10Var.b;
            if (zt50Var7 != null) {
                zt50Var7.W.setVisibility(4);
            }
        }
        if (zy10Var.d || zy10Var.isRemoving()) {
            return;
        }
        zy10Var.k1();
    }

    @Override // defpackage.x82
    public void onError(String str) {
        jo80 binding;
        jo80 binding2;
        str.getClass();
        zy10 zy10Var = (zy10) this.a;
        zt50 zt50Var = zy10Var.b;
        if (zt50Var != null && (binding2 = zt50Var.K.getBinding()) != null) {
            binding2.A.setVisibility(0);
        }
        zt50 zt50Var2 = zy10Var.b;
        if (zt50Var2 != null && (binding = zt50Var2.K.getBinding()) != null) {
            binding.z.setVisibility(4);
        }
        zt50 zt50Var3 = zy10Var.b;
        if (zt50Var3 != null) {
            zt50Var3.W.setVisibility(4);
        }
        if (zy10Var.d || zy10Var.isRemoving()) {
            return;
        }
        zy10Var.k1();
    }

    public ose(zy10 zy10Var) {
        this.a = zy10Var;
    }
}
