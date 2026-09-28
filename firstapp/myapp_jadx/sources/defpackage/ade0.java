package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes7.dex */
public class ade0 extends u4m {
    public y8j f;
    public boolean i = false;

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.i = getArguments().getBoolean("sim_mode");
        }
        setCancelable(false);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity(), R.style.BottomDialog);
        dialog.requestWindowFeature(1);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setContentView(R.layout.spr_betslip_submitting_dialog);
        Window window = dialog.getWindow();
        window.setWindowAnimations(R.style.spr_TranslucentFullScreenTheme);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        this.f.d(ime.a(dialog), "fs-unmask");
        ProgressButton progressButton = (ProgressButton) dialog.findViewById(R.id.submitting);
        boolean z = this.i;
        int i = z ? R.color.sim_theme_primary : R.color.brand_secondary_variable_type3;
        int i2 = z ? R.color.black : R.color.brand_tertiary;
        progressButton.setProgressBarColor(requireContext().getColor(i2));
        progressButton.setBackgroundColor(requireContext().getColor(i));
        progressButton.setTextColor(requireContext().getColor(i2));
        progressButton.setLoading(true);
        return dialog;
    }
}
