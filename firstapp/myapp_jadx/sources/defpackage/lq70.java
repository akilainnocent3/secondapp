package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llq70;", "Lr02;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lq70 extends r02 {

    public static final class a {
        public static void a(final FragmentManager fragmentManager, ibs ibsVar, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, int i, int i2, boolean z, final Function1 function1) {
            fragmentManager.getClass();
            fragmentManager.n0("REQUEST_KEY_SHOW_SCROLLABLE_ALERT_DIALOG", ibsVar, new qxi() { // from class: kq70
                @Override // defpackage.qxi
                public final void a(String str, Bundle bundle) {
                    lq70.a.c(function1, fragmentManager, str, bundle);
                }
            });
            lq70 lq70Var = new lq70();
            lq70Var.setArguments(vj5.a(new Pair("ARG_TITLE", uiText), new Pair("ARG_MESSAGE", uiText2), new Pair("ARG_POSITIVE_TEXT", uiText3), new Pair("ARG_NEGATIVE_TEXT", uiText4), new Pair("ARG_POSITIVE_TEXT_COLOR", Integer.valueOf(i)), new Pair("ARG_NEGATIVE_TEXT_COLOR", Integer.valueOf(i2)), new Pair("ARG_CANCELABLE", Boolean.valueOf(z))));
            lq70Var.show(fragmentManager, lq70.class.getName());
        }

        public static void b(FragmentManager fragmentManager, ibs ibsVar, UiText uiText, UiText uiText2, Function1 function1, int i) {
            StringUiText stringUiText = vch0.a;
            a(fragmentManager, ibsVar, uiText, uiText2, new ResourceUiText(R.string.common_functions__ok), null, R.color.brand_quaternary, R.color.text_type1_secondary, (i & 256) != 0, function1);
        }

        public static final void c(Function1 function1, FragmentManager fragmentManager, String str, Bundle bundle) {
            Parcelable parcelable;
            bundle.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("RESULT_KEY_SHOW_SCROLLABLE_ALERT_DIALOG", AlertDialogCallbackType.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("RESULT_KEY_SHOW_SCROLLABLE_ALERT_DIALOG");
                if (!(parcelable2 instanceof AlertDialogCallbackType)) {
                    parcelable2 = null;
                }
                parcelable = (AlertDialogCallbackType) parcelable2;
            }
            Parcelable parcelable3 = (AlertDialogCallbackType) parcelable;
            if (parcelable3 == null) {
                parcelable3 = AlertDialogCallbackType.Cancel.a;
            }
            function1.invoke(parcelable3);
            fragmentManager.g("REQUEST_KEY_SHOW_SCROLLABLE_ALERT_DIALOG");
            fragmentManager.f("RESULT_KEY_SHOW_SCROLLABLE_ALERT_DIALOG");
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
        Bundle arguments = getArguments();
        setCancelable(arguments != null ? arguments.getBoolean("ARG_CANCELABLE") : true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final UiText uiText;
        final UiText uiText2;
        final UiText stringUiText;
        final UiText uiText3;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = (Parcelable) arguments.getParcelable("ARG_TITLE", UiText.class);
            } else {
                Parcelable parcelable5 = arguments.getParcelable("ARG_TITLE");
                if (!(parcelable5 instanceof UiText)) {
                    parcelable5 = null;
                }
                parcelable4 = (UiText) parcelable5;
            }
            uiText = (UiText) parcelable4;
        } else {
            uiText = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) arguments2.getParcelable("ARG_MESSAGE", UiText.class);
            } else {
                Parcelable parcelable6 = arguments2.getParcelable("ARG_MESSAGE");
                if (!(parcelable6 instanceof UiText)) {
                    parcelable6 = null;
                }
                parcelable3 = (UiText) parcelable6;
            }
            uiText2 = (UiText) parcelable3;
        } else {
            uiText2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            String strD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
            StringUiText stringUiText2 = vch0.a;
            stringUiText = new StringUiText(strD);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) arguments3.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
            } else {
                Parcelable parcelable7 = arguments3.getParcelable("ARG_POSITIVE_TEXT");
                if (!(parcelable7 instanceof UiText)) {
                    parcelable7 = null;
                }
                parcelable2 = (UiText) parcelable7;
            }
            UiText uiText4 = (UiText) parcelable2;
            if (uiText4 == null) {
                String strD2 = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                StringUiText stringUiText3 = vch0.a;
                stringUiText = new StringUiText(strD2);
            } else {
                stringUiText = uiText4;
            }
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments4.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
            } else {
                Parcelable parcelable8 = arguments4.getParcelable("ARG_NEGATIVE_TEXT");
                if (!(parcelable8 instanceof UiText)) {
                    parcelable8 = null;
                }
                parcelable = (UiText) parcelable8;
            }
            uiText3 = (UiText) parcelable;
        } else {
            uiText3 = null;
        }
        Bundle arguments5 = getArguments();
        final int i = arguments5 != null ? arguments5.getInt("ARG_POSITIVE_TEXT_COLOR") : R.color.brand_quaternary;
        Bundle arguments6 = getArguments();
        final int i2 = arguments6 != null ? arguments6.getInt("ARG_NEGATIVE_TEXT_COLOR") : R.color.text_type1_secondary;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1828722648, new Function2() { // from class: hq70
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final UiText uiText5 = uiText;
                    final UiText uiText6 = uiText2;
                    final UiText uiText7 = stringUiText;
                    final UiText uiText8 = uiText3;
                    final int i3 = i;
                    final int i4 = i2;
                    final lq70 lq70Var = this;
                    or0.a(null, false, false, null, pp8.b(1037109601, new Function2() { // from class: iq70
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final UiText uiText9 = uiText5;
                                final UiText uiText10 = uiText6;
                                final UiText uiText11 = uiText7;
                                final UiText uiText12 = uiText8;
                                final int i5 = i3;
                                final int i6 = i4;
                                final lq70 lq70Var2 = lq70Var;
                                ihe0.a(null, null, 0L, 0L, 0.0f, 0.0f, null, pp8.b(-282273626, new Function2() { // from class: jq70
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i7 = 1;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            long jA = c68.a(i5, aVar3);
                                            long jA2 = c68.a(i6, aVar3);
                                            lq70 lq70Var3 = lq70Var2;
                                            boolean zA = aVar3.A(lq70Var3);
                                            Object objY = aVar3.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY == c0042a) {
                                                objY = new mqu(lq70Var3, i7);
                                                aVar3.r(objY);
                                            }
                                            Function0 function0 = (Function0) objY;
                                            boolean zA2 = aVar3.A(lq70Var3);
                                            Object objY2 = aVar3.y();
                                            if (zA2 || objY2 == c0042a) {
                                                objY2 = new cgz(lq70Var3, i7);
                                                aVar3.r(objY2);
                                            }
                                            pq70.c(uiText9, uiText10, uiText11, uiText12, jA, jA2, function0, (Function0) objY2, aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 12582912, 127);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
