package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class b12 implements y02 {
    public b a;

    public final b a(Context context, String str, String str2, final Function0<Unit> function0) {
        context.getClass();
        str.getClass();
        str2.getClass();
        function0.getClass();
        b bVar = this.a;
        if (bVar != null) {
            AlertController alertController = bVar.f;
            bVar.dismiss();
            alertController.e = str2;
            TextView textView = alertController.w;
            if (textView != null) {
                textView.setText(str2);
            }
            alertController.c(-1, sn5.b(context, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: z02
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    function0.invoke();
                }
            });
            bVar.show();
        } else {
            b.a aVar = new b.a(context);
            if (str.length() > 0) {
                aVar.setTitle(str);
            }
            aVar.a.f = str2;
            b.a positiveButton = aVar.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: a12
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    function0.invoke();
                }
            });
            positiveButton.a.k = false;
            this.a = positiveButton.f();
        }
        b bVar2 = this.a;
        bVar2.getClass();
        return bVar2;
    }

    @Override // defpackage.y02
    public final b showDialog(Context context, String str, Function0<Unit> function0) {
        context.getClass();
        str.getClass();
        function0.getClass();
        return a(context, sn5.b(context, R.string.common_functions__error, new Object[0]), str, function0);
    }
}
