package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lha8;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ha8 extends d {
    public Function0<Unit> a;
    public Function0<Unit> b = new ea8();

    public static final class a {
        public static ha8 a(ResourceUiText resourceUiText, UiText uiText, Integer num, Integer num2, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, Function0 function0, Function0 function1) {
            ha8 ha8Var = new ha8();
            ha8Var.a = function0;
            ha8Var.b = function1;
            ha8Var.setArguments(vj5.a(new Pair("ARG_TITLE", resourceUiText), new Pair("ARG_MESSAGE", uiText), new Pair("ARG_IMAGE", num), new Pair("ARG_IMAGE_TINT", num2), new Pair("ARG_POSITIVE_TEXT", resourceUiText2), new Pair("ARG_NEGATIVE_TEXT", resourceUiText3), new Pair("ARG_CANCELABLE", Boolean.FALSE)));
            return ha8Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    public static final Unit j0(ha8 ha8Var, ComposeView composeView, androidx.compose.runtime.a aVar, int i) {
        CharSequence charSequenceE;
        String string;
        Integer numValueOf;
        Integer numValueOf2;
        CharSequence charSequenceC;
        CharSequence charSequenceE2;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        int i2 = 0;
        if (aVar.q(i & 1, (i & 3) != 2)) {
            Bundle arguments = ha8Var.getArguments();
            if (arguments == null) {
                charSequenceE = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = (Parcelable) arguments.getParcelable("ARG_TITLE", UiText.class);
                } else {
                    Parcelable parcelable5 = arguments.getParcelable("ARG_TITLE");
                    if (!(parcelable5 instanceof UiText)) {
                        parcelable5 = null;
                    }
                    parcelable4 = (UiText) parcelable5;
                }
                UiText uiText = (UiText) parcelable4;
                if (uiText != null) {
                    Context contextRequireContext = ha8Var.requireContext();
                    contextRequireContext.getClass();
                    charSequenceE = uiText.e(contextRequireContext);
                } else {
                    charSequenceE = null;
                }
            }
            Bundle arguments2 = ha8Var.getArguments();
            if (arguments2 == null) {
                string = "";
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable3 = (Parcelable) arguments2.getParcelable("ARG_MESSAGE", UiText.class);
                } else {
                    Parcelable parcelable6 = arguments2.getParcelable("ARG_MESSAGE");
                    if (!(parcelable6 instanceof UiText)) {
                        parcelable6 = null;
                    }
                    parcelable3 = (UiText) parcelable6;
                }
                UiText uiText2 = (UiText) parcelable3;
                if (uiText2 != null) {
                    Context contextRequireContext2 = ha8Var.requireContext();
                    contextRequireContext2.getClass();
                    string = uiText2.e(contextRequireContext2).toString();
                    if (string == null) {
                        string = "";
                    }
                } else {
                    string = "";
                }
            }
            Bundle arguments3 = ha8Var.getArguments();
            if (arguments3 != null) {
                int i3 = arguments3.getInt("ARG_IMAGE");
                numValueOf = Integer.valueOf(i3);
                if (i3 == 0) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            Bundle arguments4 = ha8Var.getArguments();
            if (arguments4 != null) {
                int i4 = arguments4.getInt("ARG_IMAGE_TINT");
                numValueOf2 = Integer.valueOf(i4);
                if (i4 == 0) {
                    numValueOf2 = null;
                }
            } else {
                numValueOf2 = null;
            }
            Bundle arguments5 = ha8Var.getArguments();
            if (arguments5 == null) {
                charSequenceC = sn5.c(composeView, R.string.common_functions__ok, new Object[0]);
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                } else {
                    Parcelable parcelable7 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                    if (!(parcelable7 instanceof UiText)) {
                        parcelable7 = null;
                    }
                    parcelable2 = (UiText) parcelable7;
                }
                UiText uiText3 = (UiText) parcelable2;
                if (uiText3 != null) {
                    Context contextRequireContext3 = ha8Var.requireContext();
                    contextRequireContext3.getClass();
                    charSequenceC = uiText3.e(contextRequireContext3);
                    if (charSequenceC == null) {
                        charSequenceC = sn5.c(composeView, R.string.common_functions__ok, new Object[0]);
                    }
                } else {
                    charSequenceC = sn5.c(composeView, R.string.common_functions__ok, new Object[0]);
                }
            }
            Bundle arguments6 = ha8Var.getArguments();
            if (arguments6 == null) {
                charSequenceE2 = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                } else {
                    Parcelable parcelable8 = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                    if (!(parcelable8 instanceof UiText)) {
                        parcelable8 = null;
                    }
                    parcelable = (UiText) parcelable8;
                }
                UiText uiText4 = (UiText) parcelable;
                if (uiText4 != null) {
                    Context contextRequireContext4 = ha8Var.requireContext();
                    contextRequireContext4.getClass();
                    charSequenceE2 = uiText4.e(contextRequireContext4);
                } else {
                    charSequenceE2 = null;
                }
            }
            Bundle arguments7 = ha8Var.getArguments();
            boolean z = arguments7 != null ? arguments7.getBoolean("ARG_CANCELABLE") : true;
            String strValueOf = String.valueOf(charSequenceE);
            imf0 imf0VarL = mla.l(R.style.B1_R_21, aVar);
            String string2 = charSequenceC.toString();
            String string3 = charSequenceE2 != null ? charSequenceE2.toString() : null;
            String str = string;
            yle yleVar = new yle(z, z, 4);
            boolean zA = aVar.A(ha8Var);
            Object objY = aVar.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new fa8(ha8Var, 0);
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            boolean zA2 = aVar.A(ha8Var);
            Object objY2 = aVar.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new ga8(ha8Var, i2);
                aVar.r(objY2);
            }
            ra8.b(strValueOf, str, imf0VarL, numValueOf, numValueOf2, string2, string3, yleVar, null, function0, (Function0) objY2, aVar, 0, 0, 544);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(176978974, new da8(0, this, composeView), true));
        return composeView;
    }
}
