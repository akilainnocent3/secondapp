package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class js {
    public static b a(Context context, String str, String str2, boolean z, String str3, String str4, final Function0 function0, final Function0 function1) {
        context.getClass();
        str2.getClass();
        str3.getClass();
        b.a title = new b.a(context).setTitle(str);
        title.a.f = nae0.a(str2);
        title.c(str3, new DialogInterface.OnClickListener() { // from class: hs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Function0 function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
                dialogInterface.dismiss();
            }
        });
        title.b(str4, new DialogInterface.OnClickListener() { // from class: is
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Function0 function2 = function1;
                if (function2 != null) {
                    function2.invoke();
                }
                dialogInterface.dismiss();
            }
        });
        title.a.k = z;
        b bVarCreate = title.create();
        bVarCreate.getClass();
        bVarCreate.show();
        Button buttonF = bVarCreate.f(-1);
        Button buttonF2 = bVarCreate.f(-2);
        buttonF.setTransformationMethod(null);
        buttonF2.setTransformationMethod(null);
        buttonF.setTextColor(context.getColor(R.color.brand_secondary));
        buttonF2.setTextColor(context.getColor(R.color.text_type1_secondary));
        return bVarCreate;
    }

    public static /* synthetic */ b b(Context context, String str, String str2, String str3, String str4, Function0 function0, m6h m6hVar, int i) {
        if ((i & 64) != 0) {
            function0 = null;
        }
        Function0 function1 = function0;
        Function0 esVar = m6hVar;
        if ((i & 128) != 0) {
            esVar = new es();
        }
        return a(context, str, str2, true, str3, str4, function1, esVar);
    }

    public static void c(Context context, int i, String str, final Function0 function0, final Function0 function1) {
        context.getClass();
        str.getClass();
        b.a title = new b.a(context).setTitle(sn5.b(context, i, new Object[0]));
        title.a.f = str;
        title.c(sn5.b(context, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: fs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Function0 function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
                dialogInterface.dismiss();
            }
        });
        title.a.m = new DialogInterface.OnDismissListener() { // from class: gs
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Function0 function2 = function1;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        };
        b bVarCreate = title.create();
        bVarCreate.getClass();
        bVarCreate.show();
        Button buttonF = bVarCreate.f(-1);
        buttonF.setTransformationMethod(null);
        buttonF.setTextColor(context.getColor(R.color.brand_secondary));
    }

    public static /* synthetic */ void d(Context context, int i, String str, Function0 function0, Function0 function1, int i2) {
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        c(context, i, str, function0, function1);
    }
}
