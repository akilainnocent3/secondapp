package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w7n extends d {
    public final Integer a;
    public final UiText b;
    public final UiText c;

    public w7n(Integer num, UiText uiText, UiText uiText2) {
        this.a = num;
        this.b = uiText;
        this.c = uiText2;
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.alert_dialog_common_image, (ViewGroup) null);
        builder.setView(viewInflate);
        UiText uiText = this.c;
        if (uiText != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            builder.setPositiveButton(uiText.g(contextRequireContext), new v7n());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.image);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.content);
        Integer num = this.a;
        if (num != null) {
            appCompatImageView.setImageResource(num.intValue());
        }
        UiText uiText2 = this.b;
        if (uiText2 != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            appCompatTextView.setText(uiText2.g(contextRequireContext2));
        }
        AlertDialog alertDialogCreate = builder.create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.background_general_primary);
        }
        return alertDialogCreate;
    }
}
