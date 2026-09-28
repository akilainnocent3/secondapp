package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.remote.model.LoadingState;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BindNewPhoneResult bindNewPhoneResult = (BindNewPhoneResult) obj;
                bc6 bc6Var = ((spg0.k) ((spg0) obj2)).b;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(bindNewPhoneResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return Unit.a;
            case 1:
                final ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ((View) obj).getClass();
                if (!chatActivity.i) {
                    final Dialog dialog = new Dialog(chatActivity, R.style.AlertDialogTheme);
                    dialog.requestWindowFeature(1);
                    dialog.setContentView(R.layout.dialog_nickname);
                    dialog.setCancelable(false);
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawableResource(R.drawable.card_nickname);
                    }
                    Window window2 = dialog.getWindow();
                    if (window2 != null) {
                        window2.setSoftInputMode(5);
                    }
                    int i3 = (int) (((double) Resources.getSystem().getDisplayMetrics().widthPixels) * 0.9d);
                    Window window3 = dialog.getWindow();
                    if (window3 != null) {
                        window3.setLayout(i3, -2);
                    }
                    TextView textView = (TextView) dialog.findViewById(R.id.cancel_button);
                    TextView textView2 = (TextView) dialog.findViewById(R.id.save_nickname);
                    TextView textView3 = (TextView) dialog.findViewById(R.id.set_nickname);
                    TextView textView4 = (TextView) dialog.findViewById(R.id.note);
                    TextView textView5 = (TextView) dialog.findViewById(R.id.nickname_count);
                    final TextInputEditText textInputEditText = (TextInputEditText) dialog.findViewById(R.id.nick_name);
                    final TextView textView6 = (TextView) dialog.findViewById(R.id.error_txt);
                    op5.r(op5.a, b.f(textView, textView2, textInputEditText, textView6, textView3, textView4), null, 4);
                    chatActivity.F1().c.f(chatActivity, new v97(new Function1() { // from class: h97
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ChatActivity.O1(chatActivity, dialog, (LoadingState) obj3);
                        }
                    }));
                    textInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b97
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            int i4 = ChatActivity.B0;
                            TextInputEditText textInputEditText2 = textInputEditText;
                            ChatActivity chatActivity2 = chatActivity;
                            if (z) {
                                textInputEditText2.setBackground(chatActivity2.getDrawable(R.drawable.rounded_edittext));
                            } else {
                                textInputEditText2.setBackground(chatActivity2.getDrawable(R.drawable.rounded_edittext_grey));
                            }
                        }
                    });
                    textInputEditText.addTextChangedListener(new u97(textInputEditText, textView5, chatActivity));
                    textView.getClass();
                    gr60.a(textView, new Function1() { // from class: c97
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i4 = ChatActivity.B0;
                            ((View) obj3).getClass();
                            ha7 ha7Var = (ha7) chatActivity.a;
                            if (ha7Var != null) {
                                ha7Var.K.setFocusable(false);
                            }
                            dialog.dismiss();
                            return Unit.a;
                        }
                    });
                    textView2.getClass();
                    gr60.a(textView2, new Function1() { // from class: d97
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i4 = ChatActivity.B0;
                            ((View) obj3).getClass();
                            TextInputEditText textInputEditText2 = textInputEditText;
                            Editable text = textInputEditText2.getText();
                            ChatActivity chatActivity2 = chatActivity;
                            if (text == null || text.length() != 0) {
                                oxy oxyVarF1 = chatActivity2.F1();
                                ej5.c(o8i0.d(oxyVarF1), null, null, new mxy(oxyVarF1, String.valueOf(textInputEditText2.getText()), null), 3);
                                Editable text2 = textInputEditText2.getText();
                                if (text2 != null) {
                                    text2.clear();
                                }
                                dialog.dismiss();
                            } else {
                                textInputEditText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, chatActivity2.getDrawable(R.drawable.ic_text_error), (Drawable) null);
                                textView6.setVisibility(0);
                            }
                            return Unit.a;
                        }
                    });
                    dialog.setCanceledOnTouchOutside(false);
                    dialog.show();
                }
                return Unit.a;
            default:
                return new iwo(((long) ((mmd) obj).y0(((g7f) ((twd0) obj2).getValue()).a)) << 32);
        }
    }
}
