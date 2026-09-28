package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf6c;", "Lr02;", "<init>", "()V", "a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f6c extends r02 {
    public kke a;

    public static final class a {
        public static final void a(oi8 oi8Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            Object obj;
            bundle.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) bundle.getParcelable("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.class);
            } else {
                Parcelable parcelable = bundle.getParcelable("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG");
                if (!(parcelable instanceof CustomAlertDialogCallbackType)) {
                    parcelable = null;
                }
                obj = (CustomAlertDialogCallbackType) parcelable;
            }
            Object obj2 = (CustomAlertDialogCallbackType) obj;
            if (obj2 == null) {
                obj2 = CustomAlertDialogCallbackType.Cancel.a;
            }
            oi8Var.invoke(obj2);
            fragmentManager.g("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG");
            fragmentManager.f("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0204  */
    /* JADX WARN: Code duplicated, block: B:114:0x020c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:119:0x0220  */
    /* JADX WARN: Code duplicated, block: B:123:0x0228  */
    /* JADX WARN: Code duplicated, block: B:124:0x022a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0230  */
    /* JADX WARN: Code duplicated, block: B:128:0x0233  */
    /* JADX WARN: Code duplicated, block: B:131:0x023a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0240  */
    /* JADX WARN: Code duplicated, block: B:136:0x0251  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatCheckBox] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) throws Throwable {
        Throwable th;
        Object objE;
        Bundle arguments;
        ?? string;
        Bundle arguments2;
        Object string2;
        Bundle arguments3;
        Dialog dialog;
        ?? string3;
        Bundle arguments4;
        Object obj;
        ?? string4;
        Bundle arguments5;
        Object obj2;
        CharSequence charSequenceD;
        ?? r18;
        Bundle arguments6;
        String str;
        ?? E;
        int i;
        ?? r13;
        Object parcelable;
        Parcelable parcelable2;
        UiText uiText;
        Object obj3;
        Object parcelable3;
        Parcelable parcelable4;
        UiText uiText2;
        Object parcelable5;
        Parcelable parcelable6;
        UiText uiText3;
        Object parcelable7;
        Parcelable parcelable8;
        UiText uiText4;
        Object parcelable9;
        Parcelable parcelable10;
        UiText uiText5;
        Object parcelable11;
        Parcelable parcelable12;
        UiText uiText6;
        Parcelable parcelable13;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_custom_alert, (ViewGroup) null, false);
        int i2 = R.id.check_box;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) h5e.a(R.id.check_box, viewInflate);
        if (appCompatCheckBox != null) {
            i2 = R.id.message_text_view;
            TextView textView = (TextView) h5e.a(R.id.message_text_view, viewInflate);
            if (textView != null) {
                i2 = R.id.negative_btn;
                TextView textView2 = (TextView) h5e.a(R.id.negative_btn, viewInflate);
                if (textView2 != null) {
                    i2 = R.id.positive_btn;
                    TextView textView3 = (TextView) h5e.a(R.id.positive_btn, viewInflate);
                    if (textView3 != null) {
                        i2 = R.id.title_text_view;
                        TextView textView4 = (TextView) h5e.a(R.id.title_text_view, viewInflate);
                        if (textView4 != null) {
                            this.a = new kke((ConstraintLayout) viewInflate, appCompatCheckBox, textView, textView2, textView3, textView4);
                            Dialog dialog2 = new Dialog(requireContext());
                            kke kkeVar = this.a;
                            if (kkeVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            dialog2.setContentView(kkeVar.a);
                            Window window = dialog2.getWindow();
                            if (window != null) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.width = -1;
                                attributes.height = -2;
                                window.setAttributes(attributes);
                            }
                            Bundle arguments7 = getArguments();
                            dialog2.setCancelable(arguments7 != null ? arguments7.getBoolean("ARG_CANCELABLE") : true);
                            final kke kkeVar2 = this.a;
                            if (kkeVar2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            TextView textView5 = kkeVar2.e;
                            ?? r8 = kkeVar2.b;
                            ?? r9 = kkeVar2.f;
                            ?? r10 = kkeVar2.d;
                            ?? r11 = kkeVar2.c;
                            Bundle arguments8 = getArguments();
                            if (arguments8 != null) {
                                th = null;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable13 = (Parcelable) arguments8.getParcelable("ARG_TITLE", UiText.class);
                                } else {
                                    Parcelable parcelable14 = arguments8.getParcelable("ARG_TITLE");
                                    if (!(parcelable14 instanceof UiText)) {
                                        parcelable14 = null;
                                    }
                                    parcelable13 = (UiText) parcelable14;
                                }
                                UiText uiText7 = (UiText) parcelable13;
                                if (uiText7 != null) {
                                    Context contextRequireContext = requireContext();
                                    contextRequireContext.getClass();
                                    objE = uiText7.e(contextRequireContext);
                                }
                                arguments = getArguments();
                                if (arguments == null) {
                                    string = th;
                                } else {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable12 = (Parcelable) arguments.getParcelable("ARG_MESSAGE", UiText.class);
                                    } else {
                                        parcelable11 = arguments.getParcelable("ARG_MESSAGE");
                                        if (!(parcelable11 instanceof UiText)) {
                                            parcelable11 = th;
                                        }
                                        parcelable12 = (UiText) parcelable11;
                                    }
                                    uiText6 = (UiText) parcelable12;
                                    if (uiText6 != null) {
                                        Context contextRequireContext2 = requireContext();
                                        contextRequireContext2.getClass();
                                        string = uiText6.e(contextRequireContext2).toString();
                                    } else {
                                        string = th;
                                    }
                                }
                                arguments2 = getArguments();
                                if (arguments2 == null) {
                                    string2 = th;
                                } else {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable10 = (Parcelable) arguments2.getParcelable("ARG_HTML_MESSAGE", UiText.class);
                                    } else {
                                        parcelable9 = arguments2.getParcelable("ARG_HTML_MESSAGE");
                                        if (!(parcelable9 instanceof UiText)) {
                                            parcelable9 = th;
                                        }
                                        parcelable10 = (UiText) parcelable9;
                                    }
                                    uiText5 = (UiText) parcelable10;
                                    if (uiText5 != null) {
                                        Context contextRequireContext3 = requireContext();
                                        contextRequireContext3.getClass();
                                        string2 = uiText5.e(contextRequireContext3).toString();
                                    } else {
                                        string2 = th;
                                    }
                                }
                                arguments3 = getArguments();
                                if (arguments3 != null) {
                                    dialog = dialog2;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable8 = (Parcelable) arguments3.getParcelable("ARG_HYPERLINK_IN_MESSAGE", UiText.class);
                                    } else {
                                        parcelable7 = arguments3.getParcelable("ARG_HYPERLINK_IN_MESSAGE");
                                        if (!(parcelable7 instanceof UiText)) {
                                            parcelable7 = th;
                                        }
                                        parcelable8 = (UiText) parcelable7;
                                    }
                                    uiText4 = (UiText) parcelable8;
                                    if (uiText4 != null) {
                                        Context contextRequireContext4 = requireContext();
                                        contextRequireContext4.getClass();
                                        string3 = uiText4.e(contextRequireContext4).toString();
                                    }
                                    arguments4 = getArguments();
                                    if (arguments4 != null) {
                                        obj = objE;
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable6 = (Parcelable) arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT", UiText.class);
                                        } else {
                                            parcelable5 = arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT");
                                            if (!(parcelable5 instanceof UiText)) {
                                                parcelable5 = th;
                                            }
                                            parcelable6 = (UiText) parcelable5;
                                        }
                                        uiText3 = (UiText) parcelable6;
                                        if (uiText3 != null) {
                                            Context contextRequireContext5 = requireContext();
                                            contextRequireContext5.getClass();
                                            string4 = uiText3.e(contextRequireContext5).toString();
                                        }
                                        arguments5 = getArguments();
                                        if (arguments5 != null) {
                                            obj3 = string2;
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                            } else {
                                                parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                                if (!(parcelable3 instanceof UiText)) {
                                                    parcelable3 = th;
                                                }
                                                parcelable4 = (UiText) parcelable3;
                                            }
                                            uiText2 = (UiText) parcelable4;
                                            obj2 = obj3;
                                            if (uiText2 != null) {
                                                Context contextRequireContext6 = requireContext();
                                                contextRequireContext6.getClass();
                                                charSequenceD = uiText2.e(contextRequireContext6);
                                                if (charSequenceD == null) {
                                                }
                                            }
                                            r18 = obj3;
                                            obj2 = obj3;
                                            arguments6 = getArguments();
                                            if (arguments6 != null) {
                                                str = "binding";
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                                } else {
                                                    parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                                    if (!(parcelable instanceof UiText)) {
                                                        parcelable = th;
                                                    }
                                                    parcelable2 = (UiText) parcelable;
                                                }
                                                uiText = (UiText) parcelable2;
                                                if (uiText != null) {
                                                    Context contextRequireContext7 = requireContext();
                                                    contextRequireContext7.getClass();
                                                    E = uiText.e(contextRequireContext7);
                                                }
                                                if (obj != null) {
                                                    i = 0;
                                                } else {
                                                    i = 8;
                                                }
                                                r9.setVisibility(i);
                                                if (obj == null) {
                                                    r13 = "";
                                                } else {
                                                    r13 = obj;
                                                }
                                                r9.setText(r13);
                                                if (r18 == 0 && !StringsKt.U(r18)) {
                                                    r11.setVisibility(0);
                                                    r11.setText(Html.fromHtml(r18));
                                                } else if (string != 0 || StringsKt.U(string)) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(0);
                                                    if (string3 == 0 || StringsKt.U(string3)) {
                                                        r11.setText(string);
                                                    } else {
                                                        SpannableString spannableString = new SpannableString(string);
                                                        int iT = StringsKt.T(string, string3, 0, false, 4);
                                                        int length = string3.length() + iT;
                                                        if (iT != -1) {
                                                            spannableString.setSpan(new g6c(this), iT, length, 34);
                                                            kke kkeVar3 = this.a;
                                                            if (kkeVar3 == null) {
                                                                Intrinsics.n(str);
                                                                throw th;
                                                            }
                                                            kkeVar3.c.setMovementMethod(LinkMovementMethod.getInstance());
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                kke kkeVar4 = this.a;
                                                                if (kkeVar4 == null) {
                                                                    Intrinsics.n(str);
                                                                    throw th;
                                                                }
                                                                kkeVar4.c.setFocusable(0);
                                                            }
                                                            kke kkeVar5 = this.a;
                                                            if (kkeVar5 == null) {
                                                                Intrinsics.n(str);
                                                                throw th;
                                                            }
                                                            kkeVar5.c.setText(spannableString, TextView.BufferType.SPANNABLE);
                                                        } else {
                                                            kke kkeVar6 = this.a;
                                                            if (kkeVar6 == null) {
                                                                Intrinsics.n(str);
                                                                throw th;
                                                            }
                                                            kkeVar6.c.setText(string);
                                                        }
                                                    }
                                                }
                                                if (string4 != 0 && !StringsKt.U(string4)) {
                                                    r8.setVisibility(0);
                                                    r8.setText(string4);
                                                }
                                                textView5.setText(charSequenceD);
                                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                        f6c f6cVar = this.a;
                                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                        f6cVar.dismissAllowingStateLoss();
                                                    }
                                                });
                                                if (E != 0 || StringsKt.U(E)) {
                                                    r10.setVisibility(8);
                                                } else {
                                                    r10.setVisibility(0);
                                                    r10.setText(E);
                                                }
                                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                        f6c f6cVar = this.a;
                                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                        f6cVar.dismissAllowingStateLoss();
                                                    }
                                                });
                                                return dialog;
                                            }
                                            str = "binding";
                                            E = th;
                                            if (obj != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            r9.setVisibility(i);
                                            if (obj == null) {
                                                r13 = "";
                                            } else {
                                                r13 = obj;
                                            }
                                            r9.setText(r13);
                                            if (r18 == 0) {
                                                if (string != 0) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(8);
                                                }
                                            } else if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                            if (string4 != 0) {
                                                r8.setVisibility(0);
                                                r8.setText(string4);
                                            }
                                            textView5.setText(charSequenceD);
                                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            if (E != 0) {
                                                r10.setVisibility(8);
                                            } else {
                                                r10.setVisibility(8);
                                            }
                                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            return dialog;
                                        }
                                        obj2 = string2;
                                        r18 = obj3;
                                        obj2 = obj3;
                                        charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                        r18 = obj2;
                                        r18 = obj3;
                                        obj2 = obj3;
                                        arguments6 = getArguments();
                                        if (arguments6 != null) {
                                            str = "binding";
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                            } else {
                                                parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                                if (!(parcelable instanceof UiText)) {
                                                    parcelable = th;
                                                }
                                                parcelable2 = (UiText) parcelable;
                                            }
                                            uiText = (UiText) parcelable2;
                                            if (uiText != null) {
                                                Context contextRequireContext8 = requireContext();
                                                contextRequireContext8.getClass();
                                                E = uiText.e(contextRequireContext8);
                                            }
                                            if (obj != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            r9.setVisibility(i);
                                            if (obj == null) {
                                                r13 = "";
                                            } else {
                                                r13 = obj;
                                            }
                                            r9.setText(r13);
                                            if (r18 == 0) {
                                                if (string != 0) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(8);
                                                }
                                            } else if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                            if (string4 != 0) {
                                                r8.setVisibility(0);
                                                r8.setText(string4);
                                            }
                                            textView5.setText(charSequenceD);
                                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            if (E != 0) {
                                                r10.setVisibility(8);
                                            } else {
                                                r10.setVisibility(8);
                                            }
                                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            return dialog;
                                        }
                                        str = "binding";
                                        E = th;
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    obj = objE;
                                    string4 = th;
                                    arguments5 = getArguments();
                                    if (arguments5 != null) {
                                        obj3 = string2;
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                            if (!(parcelable3 instanceof UiText)) {
                                                parcelable3 = th;
                                            }
                                            parcelable4 = (UiText) parcelable3;
                                        }
                                        uiText2 = (UiText) parcelable4;
                                        obj2 = obj3;
                                        if (uiText2 != null) {
                                            Context contextRequireContext9 = requireContext();
                                            contextRequireContext9.getClass();
                                            charSequenceD = uiText2.e(contextRequireContext9);
                                            if (charSequenceD == null) {
                                            }
                                        }
                                        r18 = obj3;
                                        obj2 = obj3;
                                        arguments6 = getArguments();
                                        if (arguments6 != null) {
                                            str = "binding";
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                            } else {
                                                parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                                if (!(parcelable instanceof UiText)) {
                                                    parcelable = th;
                                                }
                                                parcelable2 = (UiText) parcelable;
                                            }
                                            uiText = (UiText) parcelable2;
                                            if (uiText != null) {
                                                Context contextRequireContext10 = requireContext();
                                                contextRequireContext10.getClass();
                                                E = uiText.e(contextRequireContext10);
                                            }
                                            if (obj != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            r9.setVisibility(i);
                                            if (obj == null) {
                                                r13 = "";
                                            } else {
                                                r13 = obj;
                                            }
                                            r9.setText(r13);
                                            if (r18 == 0) {
                                                if (string != 0) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(8);
                                                }
                                            } else if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                            if (string4 != 0) {
                                                r8.setVisibility(0);
                                                r8.setText(string4);
                                            }
                                            textView5.setText(charSequenceD);
                                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            if (E != 0) {
                                                r10.setVisibility(8);
                                            } else {
                                                r10.setVisibility(8);
                                            }
                                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            return dialog;
                                        }
                                        str = "binding";
                                        E = th;
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    obj2 = string2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                    r18 = obj2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext11 = requireContext();
                                            contextRequireContext11.getClass();
                                            E = uiText.e(contextRequireContext11);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                dialog = dialog2;
                                string3 = th;
                                arguments4 = getArguments();
                                if (arguments4 != null) {
                                    obj = objE;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable6 = (Parcelable) arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT", UiText.class);
                                    } else {
                                        parcelable5 = arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT");
                                        if (!(parcelable5 instanceof UiText)) {
                                            parcelable5 = th;
                                        }
                                        parcelable6 = (UiText) parcelable5;
                                    }
                                    uiText3 = (UiText) parcelable6;
                                    if (uiText3 != null) {
                                        Context contextRequireContext12 = requireContext();
                                        contextRequireContext12.getClass();
                                        string4 = uiText3.e(contextRequireContext12).toString();
                                    }
                                    arguments5 = getArguments();
                                    if (arguments5 != null) {
                                        obj3 = string2;
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                            if (!(parcelable3 instanceof UiText)) {
                                                parcelable3 = th;
                                            }
                                            parcelable4 = (UiText) parcelable3;
                                        }
                                        uiText2 = (UiText) parcelable4;
                                        obj2 = obj3;
                                        if (uiText2 != null) {
                                            Context contextRequireContext13 = requireContext();
                                            contextRequireContext13.getClass();
                                            charSequenceD = uiText2.e(contextRequireContext13);
                                            if (charSequenceD == null) {
                                            }
                                        }
                                        r18 = obj3;
                                        obj2 = obj3;
                                        arguments6 = getArguments();
                                        if (arguments6 != null) {
                                            str = "binding";
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                            } else {
                                                parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                                if (!(parcelable instanceof UiText)) {
                                                    parcelable = th;
                                                }
                                                parcelable2 = (UiText) parcelable;
                                            }
                                            uiText = (UiText) parcelable2;
                                            if (uiText != null) {
                                                Context contextRequireContext14 = requireContext();
                                                contextRequireContext14.getClass();
                                                E = uiText.e(contextRequireContext14);
                                            }
                                            if (obj != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            r9.setVisibility(i);
                                            if (obj == null) {
                                                r13 = "";
                                            } else {
                                                r13 = obj;
                                            }
                                            r9.setText(r13);
                                            if (r18 == 0) {
                                                if (string != 0) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(8);
                                                }
                                            } else if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                            if (string4 != 0) {
                                                r8.setVisibility(0);
                                                r8.setText(string4);
                                            }
                                            textView5.setText(charSequenceD);
                                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            if (E != 0) {
                                                r10.setVisibility(8);
                                            } else {
                                                r10.setVisibility(8);
                                            }
                                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            return dialog;
                                        }
                                        str = "binding";
                                        E = th;
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    obj2 = string2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                    r18 = obj2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext15 = requireContext();
                                            contextRequireContext15.getClass();
                                            E = uiText.e(contextRequireContext15);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                obj = objE;
                                string4 = th;
                                arguments5 = getArguments();
                                if (arguments5 != null) {
                                    obj3 = string2;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                        if (!(parcelable3 instanceof UiText)) {
                                            parcelable3 = th;
                                        }
                                        parcelable4 = (UiText) parcelable3;
                                    }
                                    uiText2 = (UiText) parcelable4;
                                    obj2 = obj3;
                                    if (uiText2 != null) {
                                        Context contextRequireContext16 = requireContext();
                                        contextRequireContext16.getClass();
                                        charSequenceD = uiText2.e(contextRequireContext16);
                                        if (charSequenceD == null) {
                                        }
                                    }
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext17 = requireContext();
                                            contextRequireContext17.getClass();
                                            E = uiText.e(contextRequireContext17);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                obj2 = string2;
                                r18 = obj3;
                                obj2 = obj3;
                                charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                r18 = obj2;
                                r18 = obj3;
                                obj2 = obj3;
                                arguments6 = getArguments();
                                if (arguments6 != null) {
                                    str = "binding";
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                        if (!(parcelable instanceof UiText)) {
                                            parcelable = th;
                                        }
                                        parcelable2 = (UiText) parcelable;
                                    }
                                    uiText = (UiText) parcelable2;
                                    if (uiText != null) {
                                        Context contextRequireContext18 = requireContext();
                                        contextRequireContext18.getClass();
                                        E = uiText.e(contextRequireContext18);
                                    }
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                str = "binding";
                                E = th;
                                if (obj != null) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                r9.setVisibility(i);
                                if (obj == null) {
                                    r13 = "";
                                } else {
                                    r13 = obj;
                                }
                                r9.setText(r13);
                                if (r18 == 0) {
                                    if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                } else if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                                if (string4 != 0) {
                                    r8.setVisibility(0);
                                    r8.setText(string4);
                                }
                                textView5.setText(charSequenceD);
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                if (E != 0) {
                                    r10.setVisibility(8);
                                } else {
                                    r10.setVisibility(8);
                                }
                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                return dialog;
                            }
                            th = null;
                            objE = th;
                            arguments = getArguments();
                            if (arguments == null) {
                                string = th;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable12 = (Parcelable) arguments.getParcelable("ARG_MESSAGE", UiText.class);
                                } else {
                                    parcelable11 = arguments.getParcelable("ARG_MESSAGE");
                                    if (!(parcelable11 instanceof UiText)) {
                                        parcelable11 = th;
                                    }
                                    parcelable12 = (UiText) parcelable11;
                                }
                                uiText6 = (UiText) parcelable12;
                                if (uiText6 != null) {
                                    Context contextRequireContext19 = requireContext();
                                    contextRequireContext19.getClass();
                                    string = uiText6.e(contextRequireContext19).toString();
                                } else {
                                    string = th;
                                }
                            }
                            arguments2 = getArguments();
                            if (arguments2 == null) {
                                string2 = th;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable10 = (Parcelable) arguments2.getParcelable("ARG_HTML_MESSAGE", UiText.class);
                                } else {
                                    parcelable9 = arguments2.getParcelable("ARG_HTML_MESSAGE");
                                    if (!(parcelable9 instanceof UiText)) {
                                        parcelable9 = th;
                                    }
                                    parcelable10 = (UiText) parcelable9;
                                }
                                uiText5 = (UiText) parcelable10;
                                if (uiText5 != null) {
                                    Context contextRequireContext20 = requireContext();
                                    contextRequireContext20.getClass();
                                    string2 = uiText5.e(contextRequireContext20).toString();
                                } else {
                                    string2 = th;
                                }
                            }
                            arguments3 = getArguments();
                            if (arguments3 != null) {
                                dialog = dialog2;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable8 = (Parcelable) arguments3.getParcelable("ARG_HYPERLINK_IN_MESSAGE", UiText.class);
                                } else {
                                    parcelable7 = arguments3.getParcelable("ARG_HYPERLINK_IN_MESSAGE");
                                    if (!(parcelable7 instanceof UiText)) {
                                        parcelable7 = th;
                                    }
                                    parcelable8 = (UiText) parcelable7;
                                }
                                uiText4 = (UiText) parcelable8;
                                if (uiText4 != null) {
                                    Context contextRequireContext21 = requireContext();
                                    contextRequireContext21.getClass();
                                    string3 = uiText4.e(contextRequireContext21).toString();
                                }
                                arguments4 = getArguments();
                                if (arguments4 != null) {
                                    obj = objE;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable6 = (Parcelable) arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT", UiText.class);
                                    } else {
                                        parcelable5 = arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT");
                                        if (!(parcelable5 instanceof UiText)) {
                                            parcelable5 = th;
                                        }
                                        parcelable6 = (UiText) parcelable5;
                                    }
                                    uiText3 = (UiText) parcelable6;
                                    if (uiText3 != null) {
                                        Context contextRequireContext110 = requireContext();
                                        contextRequireContext110.getClass();
                                        string4 = uiText3.e(contextRequireContext110).toString();
                                    }
                                    arguments5 = getArguments();
                                    if (arguments5 != null) {
                                        obj3 = string2;
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                            if (!(parcelable3 instanceof UiText)) {
                                                parcelable3 = th;
                                            }
                                            parcelable4 = (UiText) parcelable3;
                                        }
                                        uiText2 = (UiText) parcelable4;
                                        obj2 = obj3;
                                        if (uiText2 != null) {
                                            Context contextRequireContext111 = requireContext();
                                            contextRequireContext111.getClass();
                                            charSequenceD = uiText2.e(contextRequireContext111);
                                            if (charSequenceD == null) {
                                            }
                                        }
                                        r18 = obj3;
                                        obj2 = obj3;
                                        arguments6 = getArguments();
                                        if (arguments6 != null) {
                                            str = "binding";
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                            } else {
                                                parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                                if (!(parcelable instanceof UiText)) {
                                                    parcelable = th;
                                                }
                                                parcelable2 = (UiText) parcelable;
                                            }
                                            uiText = (UiText) parcelable2;
                                            if (uiText != null) {
                                                Context contextRequireContext112 = requireContext();
                                                contextRequireContext112.getClass();
                                                E = uiText.e(contextRequireContext112);
                                            }
                                            if (obj != null) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            r9.setVisibility(i);
                                            if (obj == null) {
                                                r13 = "";
                                            } else {
                                                r13 = obj;
                                            }
                                            r9.setText(r13);
                                            if (r18 == 0) {
                                                if (string != 0) {
                                                    r11.setVisibility(8);
                                                } else {
                                                    r11.setVisibility(8);
                                                }
                                            } else if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                            if (string4 != 0) {
                                                r8.setVisibility(0);
                                                r8.setText(string4);
                                            }
                                            textView5.setText(charSequenceD);
                                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            if (E != 0) {
                                                r10.setVisibility(8);
                                            } else {
                                                r10.setVisibility(8);
                                            }
                                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                    f6c f6cVar = this.a;
                                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                    f6cVar.dismissAllowingStateLoss();
                                                }
                                            });
                                            return dialog;
                                        }
                                        str = "binding";
                                        E = th;
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    obj2 = string2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                    r18 = obj2;
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext113 = requireContext();
                                            contextRequireContext113.getClass();
                                            E = uiText.e(contextRequireContext113);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                obj = objE;
                                string4 = th;
                                arguments5 = getArguments();
                                if (arguments5 != null) {
                                    obj3 = string2;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                        if (!(parcelable3 instanceof UiText)) {
                                            parcelable3 = th;
                                        }
                                        parcelable4 = (UiText) parcelable3;
                                    }
                                    uiText2 = (UiText) parcelable4;
                                    obj2 = obj3;
                                    if (uiText2 != null) {
                                        Context contextRequireContext114 = requireContext();
                                        contextRequireContext114.getClass();
                                        charSequenceD = uiText2.e(contextRequireContext114);
                                        if (charSequenceD == null) {
                                        }
                                    }
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext115 = requireContext();
                                            contextRequireContext115.getClass();
                                            E = uiText.e(contextRequireContext115);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                obj2 = string2;
                                r18 = obj3;
                                obj2 = obj3;
                                charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                r18 = obj2;
                                r18 = obj3;
                                obj2 = obj3;
                                arguments6 = getArguments();
                                if (arguments6 != null) {
                                    str = "binding";
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                        if (!(parcelable instanceof UiText)) {
                                            parcelable = th;
                                        }
                                        parcelable2 = (UiText) parcelable;
                                    }
                                    uiText = (UiText) parcelable2;
                                    if (uiText != null) {
                                        Context contextRequireContext116 = requireContext();
                                        contextRequireContext116.getClass();
                                        E = uiText.e(contextRequireContext116);
                                    }
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                str = "binding";
                                E = th;
                                if (obj != null) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                r9.setVisibility(i);
                                if (obj == null) {
                                    r13 = "";
                                } else {
                                    r13 = obj;
                                }
                                r9.setText(r13);
                                if (r18 == 0) {
                                    if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                } else if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                                if (string4 != 0) {
                                    r8.setVisibility(0);
                                    r8.setText(string4);
                                }
                                textView5.setText(charSequenceD);
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                if (E != 0) {
                                    r10.setVisibility(8);
                                } else {
                                    r10.setVisibility(8);
                                }
                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                return dialog;
                            }
                            dialog = dialog2;
                            string3 = th;
                            arguments4 = getArguments();
                            if (arguments4 != null) {
                                obj = objE;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable6 = (Parcelable) arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT", UiText.class);
                                } else {
                                    parcelable5 = arguments4.getParcelable("ARG_CHECK_BOX_UI_TEXT");
                                    if (!(parcelable5 instanceof UiText)) {
                                        parcelable5 = th;
                                    }
                                    parcelable6 = (UiText) parcelable5;
                                }
                                uiText3 = (UiText) parcelable6;
                                if (uiText3 != null) {
                                    Context contextRequireContext117 = requireContext();
                                    contextRequireContext117.getClass();
                                    string4 = uiText3.e(contextRequireContext117).toString();
                                }
                                arguments5 = getArguments();
                                if (arguments5 != null) {
                                    obj3 = string2;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                        if (!(parcelable3 instanceof UiText)) {
                                            parcelable3 = th;
                                        }
                                        parcelable4 = (UiText) parcelable3;
                                    }
                                    uiText2 = (UiText) parcelable4;
                                    obj2 = obj3;
                                    if (uiText2 != null) {
                                        Context contextRequireContext118 = requireContext();
                                        contextRequireContext118.getClass();
                                        charSequenceD = uiText2.e(contextRequireContext118);
                                        if (charSequenceD == null) {
                                        }
                                    }
                                    r18 = obj3;
                                    obj2 = obj3;
                                    arguments6 = getArguments();
                                    if (arguments6 != null) {
                                        str = "binding";
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                        } else {
                                            parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                            if (!(parcelable instanceof UiText)) {
                                                parcelable = th;
                                            }
                                            parcelable2 = (UiText) parcelable;
                                        }
                                        uiText = (UiText) parcelable2;
                                        if (uiText != null) {
                                            Context contextRequireContext119 = requireContext();
                                            contextRequireContext119.getClass();
                                            E = uiText.e(contextRequireContext119);
                                        }
                                        if (obj != null) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        r9.setVisibility(i);
                                        if (obj == null) {
                                            r13 = "";
                                        } else {
                                            r13 = obj;
                                        }
                                        r9.setText(r13);
                                        if (r18 == 0) {
                                            if (string != 0) {
                                                r11.setVisibility(8);
                                            } else {
                                                r11.setVisibility(8);
                                            }
                                        } else if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                        if (string4 != 0) {
                                            r8.setVisibility(0);
                                            r8.setText(string4);
                                        }
                                        textView5.setText(charSequenceD);
                                        textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        if (E != 0) {
                                            r10.setVisibility(8);
                                        } else {
                                            r10.setVisibility(8);
                                        }
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                                f6c f6cVar = this.a;
                                                f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                                f6cVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        return dialog;
                                    }
                                    str = "binding";
                                    E = th;
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                obj2 = string2;
                                r18 = obj3;
                                obj2 = obj3;
                                charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                                r18 = obj2;
                                r18 = obj3;
                                obj2 = obj3;
                                arguments6 = getArguments();
                                if (arguments6 != null) {
                                    str = "binding";
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                        if (!(parcelable instanceof UiText)) {
                                            parcelable = th;
                                        }
                                        parcelable2 = (UiText) parcelable;
                                    }
                                    uiText = (UiText) parcelable2;
                                    if (uiText != null) {
                                        Context contextRequireContext1110 = requireContext();
                                        contextRequireContext1110.getClass();
                                        E = uiText.e(contextRequireContext1110);
                                    }
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                str = "binding";
                                E = th;
                                if (obj != null) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                r9.setVisibility(i);
                                if (obj == null) {
                                    r13 = "";
                                } else {
                                    r13 = obj;
                                }
                                r9.setText(r13);
                                if (r18 == 0) {
                                    if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                } else if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                                if (string4 != 0) {
                                    r8.setVisibility(0);
                                    r8.setText(string4);
                                }
                                textView5.setText(charSequenceD);
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                if (E != 0) {
                                    r10.setVisibility(8);
                                } else {
                                    r10.setVisibility(8);
                                }
                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                return dialog;
                            }
                            obj = objE;
                            string4 = th;
                            arguments5 = getArguments();
                            if (arguments5 != null) {
                                obj3 = string2;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable4 = (Parcelable) arguments5.getParcelable("ARG_POSITIVE_TEXT", UiText.class);
                                } else {
                                    parcelable3 = arguments5.getParcelable("ARG_POSITIVE_TEXT");
                                    if (!(parcelable3 instanceof UiText)) {
                                        parcelable3 = th;
                                    }
                                    parcelable4 = (UiText) parcelable3;
                                }
                                uiText2 = (UiText) parcelable4;
                                obj2 = obj3;
                                if (uiText2 != null) {
                                    Context contextRequireContext1111 = requireContext();
                                    contextRequireContext1111.getClass();
                                    charSequenceD = uiText2.e(contextRequireContext1111);
                                    if (charSequenceD == null) {
                                    }
                                }
                                r18 = obj3;
                                obj2 = obj3;
                                arguments6 = getArguments();
                                if (arguments6 != null) {
                                    str = "binding";
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                    } else {
                                        parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                        if (!(parcelable instanceof UiText)) {
                                            parcelable = th;
                                        }
                                        parcelable2 = (UiText) parcelable;
                                    }
                                    uiText = (UiText) parcelable2;
                                    if (uiText != null) {
                                        Context contextRequireContext1112 = requireContext();
                                        contextRequireContext1112.getClass();
                                        E = uiText.e(contextRequireContext1112);
                                    }
                                    if (obj != null) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    r9.setVisibility(i);
                                    if (obj == null) {
                                        r13 = "";
                                    } else {
                                        r13 = obj;
                                    }
                                    r9.setText(r13);
                                    if (r18 == 0) {
                                        if (string != 0) {
                                            r11.setVisibility(8);
                                        } else {
                                            r11.setVisibility(8);
                                        }
                                    } else if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                    if (string4 != 0) {
                                        r8.setVisibility(0);
                                        r8.setText(string4);
                                    }
                                    textView5.setText(charSequenceD);
                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    if (E != 0) {
                                        r10.setVisibility(8);
                                    } else {
                                        r10.setVisibility(8);
                                    }
                                    r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                            f6c f6cVar = this.a;
                                            f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                            f6cVar.dismissAllowingStateLoss();
                                        }
                                    });
                                    return dialog;
                                }
                                str = "binding";
                                E = th;
                                if (obj != null) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                r9.setVisibility(i);
                                if (obj == null) {
                                    r13 = "";
                                } else {
                                    r13 = obj;
                                }
                                r9.setText(r13);
                                if (r18 == 0) {
                                    if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                } else if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                                if (string4 != 0) {
                                    r8.setVisibility(0);
                                    r8.setText(string4);
                                }
                                textView5.setText(charSequenceD);
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                if (E != 0) {
                                    r10.setVisibility(8);
                                } else {
                                    r10.setVisibility(8);
                                }
                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                return dialog;
                            }
                            obj2 = string2;
                            r18 = obj3;
                            obj2 = obj3;
                            charSequenceD = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                            r18 = obj2;
                            r18 = obj3;
                            obj2 = obj3;
                            arguments6 = getArguments();
                            if (arguments6 != null) {
                                str = "binding";
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) arguments6.getParcelable("ARG_NEGATIVE_TEXT", UiText.class);
                                } else {
                                    parcelable = arguments6.getParcelable("ARG_NEGATIVE_TEXT");
                                    if (!(parcelable instanceof UiText)) {
                                        parcelable = th;
                                    }
                                    parcelable2 = (UiText) parcelable;
                                }
                                uiText = (UiText) parcelable2;
                                if (uiText != null) {
                                    Context contextRequireContext1113 = requireContext();
                                    contextRequireContext1113.getClass();
                                    E = uiText.e(contextRequireContext1113);
                                }
                                if (obj != null) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                r9.setVisibility(i);
                                if (obj == null) {
                                    r13 = "";
                                } else {
                                    r13 = obj;
                                }
                                r9.setText(r13);
                                if (r18 == 0) {
                                    if (string != 0) {
                                        r11.setVisibility(8);
                                    } else {
                                        r11.setVisibility(8);
                                    }
                                } else if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                                if (string4 != 0) {
                                    r8.setVisibility(0);
                                    r8.setText(string4);
                                }
                                textView5.setText(charSequenceD);
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                if (E != 0) {
                                    r10.setVisibility(8);
                                } else {
                                    r10.setVisibility(8);
                                }
                                r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                        f6c f6cVar = this.a;
                                        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                        f6cVar.dismissAllowingStateLoss();
                                    }
                                });
                                return dialog;
                            }
                            str = "binding";
                            E = th;
                            if (obj != null) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            r9.setVisibility(i);
                            if (obj == null) {
                                r13 = "";
                            } else {
                                r13 = obj;
                            }
                            r9.setText(r13);
                            if (r18 == 0) {
                                if (string != 0) {
                                    r11.setVisibility(8);
                                } else {
                                    r11.setVisibility(8);
                                }
                            } else if (string != 0) {
                                r11.setVisibility(8);
                            } else {
                                r11.setVisibility(8);
                            }
                            if (string4 != 0) {
                                r8.setVisibility(0);
                                r8.setText(string4);
                            }
                            textView5.setText(charSequenceD);
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: c6c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", new CustomAlertDialogCallbackType.Positive(kkeVar2.b.isChecked())));
                                    f6c f6cVar = this.a;
                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                    f6cVar.dismissAllowingStateLoss();
                                }
                            });
                            if (E != 0) {
                                r10.setVisibility(8);
                            } else {
                                r10.setVisibility(8);
                            }
                            r10.setOnClickListener(new View.OnClickListener() { // from class: d6c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.Negative.a));
                                    f6c f6cVar = this.a;
                                    f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
                                    f6cVar.dismissAllowingStateLoss();
                                }
                            });
                            return dialog;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
