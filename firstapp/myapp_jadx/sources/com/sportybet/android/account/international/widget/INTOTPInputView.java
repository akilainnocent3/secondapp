package com.sportybet.android.account.international.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.account.international.widget.INTOTPInputView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jwm;
import defpackage.kwo;
import defpackage.p48;
import defpackage.sn5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/account/international/widget/INTOTPInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "errorMsg", "", "setErrorState", "(Ljava/lang/Integer;)V", "", "(Ljava/lang/String;)V", "", "Landroid/widget/EditText;", "getInputList", "()Ljava/util/List;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class INTOTPInputView extends ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public final kwo F;
    public final ArrayList G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public INTOTPInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.int_otp_input, this);
        int i2 = R.id.error;
        TextView textView = (TextView) h5e.a(R.id.error, this);
        if (textView != null) {
            i2 = R.id.input_1;
            INTOTPEditText iNTOTPEditText = (INTOTPEditText) h5e.a(R.id.input_1, this);
            if (iNTOTPEditText != null) {
                i2 = R.id.input_2;
                INTOTPEditText iNTOTPEditText2 = (INTOTPEditText) h5e.a(R.id.input_2, this);
                if (iNTOTPEditText2 != null) {
                    i2 = R.id.input_3;
                    INTOTPEditText iNTOTPEditText3 = (INTOTPEditText) h5e.a(R.id.input_3, this);
                    if (iNTOTPEditText3 != null) {
                        i2 = R.id.input_4;
                        INTOTPEditText iNTOTPEditText4 = (INTOTPEditText) h5e.a(R.id.input_4, this);
                        if (iNTOTPEditText4 != null) {
                            i2 = R.id.input_5;
                            INTOTPEditText iNTOTPEditText5 = (INTOTPEditText) h5e.a(R.id.input_5, this);
                            if (iNTOTPEditText5 != null) {
                                i2 = R.id.input_6;
                                INTOTPEditText iNTOTPEditText6 = (INTOTPEditText) h5e.a(R.id.input_6, this);
                                if (iNTOTPEditText6 != null) {
                                    kwo kwoVar = new kwo(this, textView, iNTOTPEditText, iNTOTPEditText2, iNTOTPEditText3, iNTOTPEditText4, iNTOTPEditText5, iNTOTPEditText6);
                                    this.F = kwoVar;
                                    ArrayList arrayList = new ArrayList();
                                    this.G = arrayList;
                                    final INTOTPEditText[] iNTOTPEditTextArr = {iNTOTPEditText, iNTOTPEditText2, iNTOTPEditText3, iNTOTPEditText4, iNTOTPEditText5, iNTOTPEditText6};
                                    p48.x(arrayList, iNTOTPEditTextArr);
                                    final int i3 = 0;
                                    int i4 = 0;
                                    while (i4 < 6) {
                                        final INTOTPEditText iNTOTPEditText7 = iNTOTPEditTextArr[i4];
                                        iNTOTPEditText7.setCursorVisible(false);
                                        iNTOTPEditText7.setSelectAllOnFocus(true);
                                        iNTOTPEditText7.addTextChangedListener(new jwm(iNTOTPEditText7, this, iNTOTPEditText7, i3, iNTOTPEditTextArr));
                                        iNTOTPEditText7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gwm
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i5 = INTOTPInputView.H;
                                                if (z) {
                                                    iNTOTPEditText7.selectAll();
                                                }
                                            }
                                        });
                                        iNTOTPEditText7.setOnKeyListener(new View.OnKeyListener() { // from class: hwm
                                            @Override // android.view.View.OnKeyListener
                                            public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
                                                int i6;
                                                int i7 = INTOTPInputView.H;
                                                if (i5 != 67 || (i6 = i3) == 0 || keyEvent.getAction() != 0) {
                                                    return false;
                                                }
                                                iNTOTPEditText7.clearFocus();
                                                iNTOTPEditTextArr[i6 - 1].requestFocus();
                                                return false;
                                            }
                                        });
                                        iNTOTPEditText7.setSelectionChangedListener(new Function0() { // from class: iwm
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i5 = INTOTPInputView.H;
                                                iNTOTPEditText7.setSelection(0, auf.a(iNTOTPEditText7).length());
                                                return Unit.a;
                                            }
                                        });
                                        i4++;
                                        i3++;
                                    }
                                    kwoVar.c.requestFocus();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final List<EditText> getInputList() {
        return this.G;
    }

    public final void setErrorState(String errorMsg) {
        TextView textView = this.F.b;
        if (errorMsg != null) {
            textView.setText(errorMsg);
        }
        textView.setVisibility(errorMsg != null ? 0 : 8);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((EditText) obj).setActivated(errorMsg != null);
        }
    }

    public final void setErrorState(Integer errorMsg) {
        setErrorState(errorMsg != null ? sn5.c(this.F.b, errorMsg.intValue(), new Object[0]) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public INTOTPInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public INTOTPInputView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ INTOTPInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
