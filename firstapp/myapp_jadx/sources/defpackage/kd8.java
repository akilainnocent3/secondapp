package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kd8 extends Dialog {
    public final uy1 a;
    public g9h b;
    public String c;
    public String d;
    public a e;

    public static final class a {
        public final String a;
        public final String b;
        public final Function0<Unit> c;
        public final Function0<Unit> d;
        public int e;
        public final Function0<Unit> f;

        public a(int i, String str, String str2, Function0 function0, Function0 function1, Function0 function2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = function0;
            this.d = function1;
            this.e = i;
            this.f = function2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + mtg0.a(mtg0.a(gpp.a(this.e, x7g.a(x7g.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, false), 31, true);
        }

        public final String toString() {
            int i = this.e;
            StringBuilder sbA = ux5.a("ErrorInfo(message=", this.a, ", btnText=", this.b, ", onConfirm=");
            sbA.append(this.c);
            sbA.append(", onClose=");
            sbA.append(this.d);
            sbA.append(", btnBgColor=");
            sbA.append(i);
            sbA.append(", showClose=false, showTwoButtons=true, onExitCall=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public kd8(uy1 uy1Var) {
        super(uy1Var);
        this.a = uy1Var;
        setCancelable(false);
    }

    public static void b(kd8 kd8Var, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i, Function0 function2) {
        wd7.a(str, str2, str3, str4);
        kd8Var.c = str;
        kd8Var.e = new a(i, str2, str3, function0, function1, function2);
        kd8Var.d = str4;
    }

    public final void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.flags &= -5;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.trans_black_color);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        uy1 uy1Var = this.a;
        View viewInflate = LayoutInflater.from(uy1Var).inflate(R.layout.sg_common_error_dialog_container, (ViewGroup) null, false);
        int i = R.id.error_action_button;
        AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.error_action_button, viewInflate);
        if (appCompatButton != null) {
            i = R.id.error_cross_button;
            AppCompatButton appCompatButton2 = (AppCompatButton) h5e.a(R.id.error_cross_button, viewInflate);
            if (appCompatButton2 != null) {
                i = R.id.error_dialog_close;
                FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.error_dialog_close, viewInflate);
                if (floatingActionButton != null) {
                    i = R.id.error_dialog_content;
                    if (((ConstraintLayout) h5e.a(R.id.error_dialog_content, viewInflate)) != null) {
                        i = R.id.error_message;
                        TextView textView = (TextView) h5e.a(R.id.error_message, viewInflate);
                        if (textView != null) {
                            i = R.id.error_title;
                            TextView textView2 = (TextView) h5e.a(R.id.error_title, viewInflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.b = new g9h(constraintLayout, appCompatButton, appCompatButton2, floatingActionButton, textView, textView2);
                                setContentView(constraintLayout);
                                g9h g9hVar = this.b;
                                if (g9hVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((AppCompatButton) g9hVar.d).setOnClickListener(new View.OnClickListener() { // from class: hd8
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        kd8 kd8Var = this.a;
                                        try {
                                            kd8.a aVar = kd8Var.e;
                                            if (aVar == null) {
                                                Intrinsics.n("errorInfo");
                                                throw null;
                                            }
                                            aVar.c.invoke();
                                            kd8Var.dismiss();
                                        } catch (Exception unused) {
                                        }
                                    }
                                });
                                g9h g9hVar2 = this.b;
                                if (g9hVar2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((FloatingActionButton) g9hVar2.f).setOnClickListener(new View.OnClickListener() { // from class: id8
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        kd8 kd8Var = this.a;
                                        kd8.a aVar = kd8Var.e;
                                        if (aVar == null) {
                                            Intrinsics.n("errorInfo");
                                            throw null;
                                        }
                                        aVar.d.invoke();
                                        kd8Var.dismiss();
                                    }
                                });
                                g9h g9hVar3 = this.b;
                                if (g9hVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((AppCompatButton) g9hVar3.e).setOnClickListener(new View.OnClickListener() { // from class: jd8
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        kd8 kd8Var = this.a;
                                        kd8.a aVar = kd8Var.e;
                                        if (aVar == null) {
                                            Intrinsics.n("errorInfo");
                                            throw null;
                                        }
                                        aVar.f.invoke();
                                        kd8Var.dismiss();
                                    }
                                });
                                g9h g9hVar4 = this.b;
                                if (g9hVar4 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                TextView textView3 = (TextView) g9hVar4.i;
                                String str = this.c;
                                if (str == null) {
                                    Intrinsics.n("title");
                                    throw null;
                                }
                                textView3.setText(str);
                                g9h g9hVar5 = this.b;
                                if (g9hVar5 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                TextView textView4 = g9hVar5.c;
                                a aVar = this.e;
                                if (aVar == null) {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                                textView4.setText(aVar.a);
                                g9h g9hVar6 = this.b;
                                if (g9hVar6 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                AppCompatButton appCompatButton3 = (AppCompatButton) g9hVar6.d;
                                a aVar2 = this.e;
                                if (aVar2 == null) {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                                appCompatButton3.setText(aVar2.b);
                                g9h g9hVar7 = this.b;
                                if (g9hVar7 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                AppCompatButton appCompatButton4 = (AppCompatButton) g9hVar7.e;
                                String str2 = this.d;
                                if (str2 == null) {
                                    Intrinsics.n("cancelText");
                                    throw null;
                                }
                                appCompatButton4.setText(str2);
                                a aVar3 = this.e;
                                if (aVar3 == null) {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                                if (aVar3 == null) {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                                g9h g9hVar8 = this.b;
                                if (g9hVar8 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((AppCompatButton) g9hVar8.e).setVisibility(0);
                                a aVar4 = this.e;
                                if (aVar4 == null) {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                                if (aVar4.e == 0) {
                                    aVar4.e = uy1Var.getColor(R.color.button_green);
                                }
                                g9h g9hVar9 = this.b;
                                if (g9hVar9 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                AppCompatButton appCompatButton5 = (AppCompatButton) g9hVar9.d;
                                a aVar5 = this.e;
                                if (aVar5 != null) {
                                    appCompatButton5.setBackgroundColor(aVar5.e);
                                    return;
                                } else {
                                    Intrinsics.n("errorInfo");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
