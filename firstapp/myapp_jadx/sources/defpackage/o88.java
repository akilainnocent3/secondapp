package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo88;", "Landroidx/fragment/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o88 extends d implements View.OnClickListener {
    public View a;
    public boolean b;
    public a c;

    /* JADX INFO: loaded from: classes7.dex */
    public interface a {
        void a(n88 n88Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        if (id == R.id.reply) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(n88.a);
            }
        } else if (id == R.id.copy) {
            a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(n88.b);
            }
        } else if (id == R.id.delete) {
            a aVar3 = this.c;
            if (aVar3 != null) {
                aVar3.a(n88.c);
            }
        } else {
            n88 n88Var = n88.a;
        }
        dismiss();
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireActivity(), R.style.BottomDialog);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_comment_reply_selection);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setWindowAnimations(R.style.AnimBottom);
            window.setBackgroundDrawable(new ColorDrawable(0));
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ((TextView) dialog.findViewById(R.id.reply)).setOnClickListener(this);
        ((TextView) dialog.findViewById(R.id.copy)).setOnClickListener(this);
        ((TextView) dialog.findViewById(R.id.delete)).setOnClickListener(this);
        if (this.b) {
            ((TextView) dialog.findViewById(R.id.delete)).setVisibility(0);
            dialog.findViewById(R.id.line2).setVisibility(0);
            return dialog;
        }
        ((TextView) dialog.findViewById(R.id.delete)).setVisibility(8);
        dialog.findViewById(R.id.line2).setVisibility(8);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View view = this.a;
        if (view != null) {
            return view;
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.a = viewOnCreateView;
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b = arguments.getBoolean(LxHElgWAiSeM.ORFKjQYkigDJ);
        }
    }
}
