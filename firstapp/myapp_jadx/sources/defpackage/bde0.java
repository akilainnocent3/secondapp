package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes4.dex */
public class bde0 extends r02 {
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity(), R.style.BottomDialog);
        dialog.requestWindowFeature(1);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setContentView(R.layout.iwqk_frag_sumitting_dialog);
        Window window = dialog.getWindow();
        window.setWindowAnimations(R.style.spr_TranslucentFullScreenTheme);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        ProgressButton progressButton = (ProgressButton) dialog.findViewById(R.id.submitting);
        progressButton.setButtonText(R.string.common_functions__submitting);
        progressButton.setLoadingText(R.string.common_functions__submitting);
        progressButton.setLoading(true);
        return dialog;
    }
}
