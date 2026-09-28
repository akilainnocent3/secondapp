package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkqg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public final class kqg0 extends d {
    public hc3 a;
    public wzz b;
    public kc3 c;
    public dme d;

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        String strD;
        String strD2;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_transaction_failed, (ViewGroup) null, false);
        int i = R.id.description;
        TextView textView = (TextView) h5e.a(R.id.description, viewInflate);
        if (textView != null) {
            i = R.id.linkButton;
            Button button = (Button) h5e.a(R.id.linkButton, viewInflate);
            if (button != null) {
                i = R.id.primaryButton;
                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.primaryButton, viewInflate);
                if (progressButton != null) {
                    i = R.id.secondaryButton;
                    Button button2 = (Button) h5e.a(R.id.secondaryButton, viewInflate);
                    if (button2 != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) h5e.a(R.id.title, viewInflate);
                        if (textView2 != null) {
                            this.d = new dme((ConstraintLayout) viewInflate, textView, button, progressButton, button2, textView2);
                            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                            dme dmeVar = this.d;
                            if (dmeVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            AlertDialog alertDialogCreate = builder.setView(dmeVar.a).setCancelable(false).create();
                            dme dmeVar2 = this.d;
                            if (dmeVar2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            Button button3 = dmeVar2.e;
                            ProgressButton progressButton2 = dmeVar2.d;
                            Button button4 = dmeVar2.c;
                            Bundle arguments = getArguments();
                            if (arguments != null) {
                                String string = requireArguments().getString("ARGS_DIALOG_TYPE");
                                if (string != null) {
                                    r700 r700VarValueOf = r700.valueOf(string);
                                    TextView textView3 = dmeVar2.f;
                                    int iOrdinal = r700VarValueOf.ordinal();
                                    if (iOrdinal == 0) {
                                        strD = sn5.d(this, R.string.page_payment__deposit_failed, new Object[0]);
                                    } else {
                                        if (iOrdinal != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        strD = sn5.d(this, R.string.page_withdraw__withdrawal_failed, new Object[0]);
                                    }
                                    textView3.setText(strD);
                                    int iOrdinal2 = r700VarValueOf.ordinal();
                                    if (iOrdinal2 == 0) {
                                        strD2 = sn5.d(this, R.string.page_payment__use_another_deposit_method, new Object[0]);
                                    } else {
                                        if (iOrdinal2 != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        strD2 = sn5.d(this, R.string.page_payment__use_another_withdrawal_method, new Object[0]);
                                    }
                                    button4.setText(strD2);
                                }
                                String string2 = arguments.getString("ARGS_PRIMARY_TEXT");
                                if (string2 != null) {
                                    progressButton2.setButtonText(string2);
                                    progressButton2.setOnClickListener(new View.OnClickListener() { // from class: iqg0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            kqg0 kqg0Var = this.a;
                                            kqg0Var.dismiss();
                                            hc3 hc3Var = kqg0Var.a;
                                            if (hc3Var != null) {
                                                hc3Var.invoke();
                                            }
                                        }
                                    });
                                }
                                String string3 = arguments.getString("ARGS_SECONDARY_TEXT");
                                if (string3 != null) {
                                    button3.setText(string3);
                                    button3.setOnClickListener(new View.OnClickListener() { // from class: jqg0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            kqg0 kqg0Var = this.a;
                                            kqg0Var.dismiss();
                                            wzz wzzVar = kqg0Var.b;
                                            if (wzzVar != null) {
                                                wzzVar.invoke();
                                            }
                                        }
                                    });
                                }
                                String string4 = arguments.getString("ARGS_DESCRIPTION");
                                if (string4 != null) {
                                    dmeVar2.b.setText(string4);
                                }
                                dme dmeVar3 = this.d;
                                if (dmeVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                dmeVar3.d.setTextGravity(1);
                                button4.setOnClickListener(new wu80(this, 1));
                            }
                            alertDialogCreate.getClass();
                            return alertDialogCreate;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
